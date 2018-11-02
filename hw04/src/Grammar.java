import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Grammar {
	private HashMap<String, ArrayList<String>> table = new HashMap<String,ArrayList<String>>();
	private HashMap<String, ArrayList<String>> first = new HashMap<>();
	private HashMap<String, ArrayList<String>> follow = new HashMap<>();
	private ArrayList<String> nonTerminal = new ArrayList<>();
	private ArrayList<String> terminal = new ArrayList<>();

	public HashMap<String, ArrayList<String>> getTable(){ return table; }

	public void AddRule(String nonterminal, String rule){
		if(table.get(nonterminal) == null){
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

	}

	public void findFollow() {

	}

	public void viewGrammar(){
		int index = 1;
		for(String lhs : table.keySet()){
			for(String rhs : table.get(lhs)){
				System.out.println((index++) + "." + lhs + " ->  "+ rhs);
			}
		}
	}
}
