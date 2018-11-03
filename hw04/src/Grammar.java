import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*

E -> a | L
L -> (Q)
Q -> LQ'
Q' -> ,Q | e


*/

public class Grammar {
	private HashMap<String, ArrayList<String>> table = new HashMap<String, ArrayList<String>>();
	private HashMap<String, ArrayList<String>> first = new HashMap<>();
	private HashMap<String, ArrayList<String>> follow = new HashMap<>();
	private ArrayList<String> nonTerminal = new ArrayList<>();
	private ArrayList<String> terminal = new ArrayList<>();

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
		HashMap<String, HashSet<String>> beforeFirst = new HashMap<String, HashSet<String>>(),
				currentFirst = new HashMap<String, HashSet<String>>();

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
				tempSet.addAll(currentFirst.get(sym));

				while (ruleIter.hasNext()) {
					String rule = ruleIter.next();
					if (!isTerminal(rule)) {
						substRule = rule.substring(0, 1);
						if (rule.length() > 1 && rule.charAt(1) == '\'')
							substRule = rule.substring(0, 2);
						if (!isTerminal(substRule)) {
							tempSet.addAll(currentFirst.get(substRule));
							tempSet.addAll(ringSum(currentFirst, rule.substring(substRule.length())));
						}
					}
				}
				currentFirst.put(sym,tempSet);
			}
		}
		while (!isStable(currentFirst, beforeFirst));
		int a = 0;
	}


	public HashSet<String> ringSum(HashMap<String, HashSet<String>> currentFirst, String subRule) {
		HashSet<String> result = new HashSet<String>();
		String substRule;
		if (subRule.length() > 0) {
			substRule = subRule.substring(0, 1);
			if (subRule.length() > 1 && subRule.charAt(0) == '\'')
				substRule = subRule.substring(0, 2);
			if (currentFirst.get(substRule) != null && currentFirst.get(substRule).contains("e")) {
				result.addAll(currentFirst.get(substRule));
				result.addAll(ringSum(currentFirst, subRule.substring(substRule.length())));
			}
		}
		return result;
	}


	public boolean isStable(HashMap<String, HashSet<String>> currentFirst, HashMap<String, HashSet<String>> beforeFirst) {
		String key;
		Iterator<String> keys = currentFirst.keySet().iterator();

		while (keys.hasNext()) {
			key = keys.next();
			if (currentFirst.get(key).size() != beforeFirst.get(key).size()) {
				return false;
			}
		}
		return true;
	}

	public void findFollow() {

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
