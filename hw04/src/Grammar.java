import java.lang.reflect.Array;
import java.util.*;

/*
E  -> TE'
E' -> +TE' | e
T  -> FT'
T' -> *FT' | e
F  -> (E) | id

E -> a | L
L -> (Q)
Q -> LQ'
Q' -> ,Q | e
*/

public class Grammar {
	private HashMap<String, ArrayList<String>> table = new LinkedHashMap<String, ArrayList<String>>();
	private HashMap<String, ArrayList<String>> first = new HashMap<>();
	private HashMap<String, ArrayList<String>> follow = new HashMap<>();
	private HashMap<String, HashSet<String>> beforeFirst = new LinkedHashMap<String, HashSet<String>>(),
			currentFirst = new LinkedHashMap<String, HashSet<String>>(),
			beforeFollow = new LinkedHashMap<String, HashSet<String>>(),
			currentFollow = new LinkedHashMap<String, HashSet<String>>();
	private ArrayList<String> nonTerminal = new ArrayList<>();
	private ArrayList<String> terminal = new ArrayList<>();
	private Iterator<String> ruleIter;

	public HashMap<String, ArrayList<String>> getTable() {
		return table;
	}

	public void listup(String rule) {
		if (isTerminal(rule))
			terminal.add(rule);
		else
			nonTerminal.add(rule);

	}

	public boolean isTerminal(String rule) {
		for (int i = 0; i < rule.length(); ++i) {
			if (rule.charAt(i) >= 65 && rule.charAt(i) < 91) {
				return false;
			}
		}
		return true;
	}

	public void AddRule(String nonterminal, String rule) {
		this.listup(rule);
		if (table.get(nonterminal) == null) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(rule);
			table.put(nonterminal, list);
		} else {
			table.get(nonterminal).add(rule);
		}
	}

	public String getRule(String nonTerminal, int index) {
		return table.get(nonTerminal).get(index);
	}

	public ArrayList<String> getRules(String nonTerminal) {
		return table.get(nonTerminal);
	}

	public void findFirst() {
		String tempNonter, tempRule, substRule;
		Iterator<String> symbols = table.keySet().iterator(), symbol, ruleIter;
		HashSet<String> tempSet;

		// Initialize First List
		while (symbols.hasNext()) {
			tempNonter = symbols.next();
			symbol = table.get(tempNonter).iterator();
			while (symbol.hasNext()) {
				tempRule = symbol.next();
				substRule = tempRule.substring(0, 1);
				if (tempRule.length() > 1 && tempRule.charAt(1) == '\'')
					substRule = tempRule.substring(0, 2);
				if (!this.nonTerminal.contains(tempRule) || isTerminal(substRule)) {
					if (currentFirst.get(tempNonter) == null) {
						HashSet<String> list = new HashSet<String>();
						if (terminal.contains(tempRule))
							list.add(tempRule);
						else
							list.add(substRule);
						currentFirst.put(tempNonter, list);
					} else {
						if (terminal.contains(tempRule))
							currentFirst.get(tempNonter).add(tempRule);
						else
							currentFirst.get(tempNonter).add(substRule);
					}
				} else {
					if (currentFirst.get(tempNonter) == null)
						currentFirst.put(tempNonter, new HashSet<String>());
				}
			}
		}

		do {
			for (String key : currentFirst.keySet()) {
				beforeFirst.put(key, currentFirst.get(key));
			}

			for (String sym : table.keySet()) {
				ruleIter = table.get(sym).iterator();
				tempSet = new HashSet<String>();
				tempSet.addAll(beforeFirst.get(sym));

				while (ruleIter.hasNext()) {
					String rule = ruleIter.next();
					if (!isTerminal(rule)) {
						substRule = rule.substring(0, 1);
						if (rule.length() > 1 && rule.charAt(1) == '\'')
							substRule = rule.substring(0, 2);
						if (!isTerminal(substRule)) {
							tempSet.addAll(beforeFirst.get(substRule));
							tempSet.addAll(ringSum(rule.substring(substRule.length())));
						}
					}
				}
				currentFirst.put(sym, tempSet);
			}
		}
		while (!isStable(currentFirst, beforeFirst));
		for (String sym : currentFirst.keySet()) {
			System.out.print("first(" + sym + ") : {");
			ruleIter = currentFirst.get(sym).iterator();
			while (ruleIter.hasNext()) {
				System.out.print(ruleIter.next());
				if (ruleIter.hasNext()) {
					System.out.print(", ");
				}
			}
			System.out.println("}");
		}
	}


	public HashSet<String> ringSum(String subRule) {
		HashSet<String> result = new HashSet<String>();
		String substRule;
		if (subRule.length() > 0) {
			substRule = subRule.substring(0, 1);
			if (subRule.length() > 1 && subRule.charAt(0) == '\'')
				substRule = subRule.substring(0, 2);
			if (currentFirst.get(substRule) != null && currentFirst.get(substRule).contains("e")) {
				result.addAll(currentFirst.get(substRule));
				result.addAll(ringSum(subRule.substring(substRule.length())));
			}
		}
		return result;
	}


	public boolean isStable(HashMap<String, HashSet<String>> current,
							HashMap<String, HashSet<String>> before) {
		String key;
		Iterator<String> keys = current.keySet().iterator();

		while (keys.hasNext()) {
			key = keys.next();
			if (current.get(key).size() != before.get(key).size()) {
				return false;
			}
		}
		return true;
	}

	public void findFollow() {
		//Assume First Already found
		boolean isFirst = true;
		String firstSym = new String();
		String[] tempStrArr;
		HashSet<String> tempSet;
		Iterator<String> symbols = table.keySet().iterator();

		//Init follow by first
		while (symbols.hasNext()) {
			String tempSym = symbols.next();
			if (isFirst) {
				firstSym = tempSym;
				isFirst = false;
			}
			tempSet = new HashSet<String>();
			for (String s : table.keySet()) {
				for (String r : table.get(s)) {
					if (r.contains(tempSym)) {
						tempStrArr = r.split(tempSym);
						if (tempStrArr.length > 1 && tempStrArr[1].charAt(0) != '\'') {
							String ttSym = tempStrArr[1].substring(0, 1);
							if (isTerminal(ttSym) && !ttSym.equals("e")) {
								tempSet.add(ttSym);
							} else {
								if (tempStrArr[1].length() > 1 && tempStrArr[1].charAt(1) == '\'') {
									ttSym = tempStrArr[1].substring(0, 2);
									HashSet<String> ttSet = currentFirst.get(ttSym);
									if (ttSet.contains("e"))
										ttSet.remove("e");
									tempSet.addAll(ttSet);
								}
							}
						}
					}
				}
			}
			currentFollow.put(tempSym, tempSet);
		}
		if (currentFollow.get(firstSym) == null) {
			currentFollow.put(firstSym, new HashSet<String>());
		}
		tempSet = currentFollow.get(firstSym);
		tempSet.add("$");
		currentFollow.replace(firstSym, tempSet);

		HashSet<String> emptyList = new HashSet<String>();
		for(String s : table.keySet()){
			if(table.get(s).contains("e"))
				emptyList.add(s);
		}

		do {
			symbols = table.keySet().iterator();
			for (String key : currentFollow.keySet()) {
				beforeFollow.put(key, currentFollow.get(key));
			}


			while (symbols.hasNext()) {
				String tempSym = symbols.next();
				tempSet = new HashSet<String>();
				for (String s : table.keySet()) {
					for (String r : table.get(s)) {
						if (r.contains(tempSym)) {
							if (tempSym.equals(r.substring(r.length() - tempSym.length(), r.length())))
								tempSet.addAll(beforeFollow.get(s));
						}
						for (String e : emptyList) {
							String nullableR = r.replace(e, "");
							if (nullableR.contains(tempSym)) {
								if (tempSym.equals(nullableR.substring(nullableR.length() - tempSym.length(), nullableR.length())))
									tempSet.addAll(beforeFollow.get(s));
							}
						}
					}
				}
				tempSet.addAll(currentFollow.get(tempSym));
				currentFollow.put(tempSym, tempSet);
			}

		} while (!isStable(currentFollow, beforeFollow));

		for (String sym : currentFollow.keySet()) {
			System.out.print("follow(" + sym + ") : {");
			ruleIter = currentFollow.get(sym).iterator();
			while (ruleIter.hasNext()) {
				System.out.print(ruleIter.next());
				if (ruleIter.hasNext()) {
					System.out.print(", ");
				}
			}
			System.out.println("}");
		}
	}


	public void viewGrammar() {
		int index = 1;
		for (String lhs : table.keySet()) {
			for (String rhs : table.get(lhs)) {
				System.out.println((index++) + "." + lhs + " ->  " + rhs);
			}
		}
	}
}
