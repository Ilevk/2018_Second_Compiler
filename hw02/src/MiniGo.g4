grammar MiniGo;
program		: decl+	{System.out.println("201504278 Rule 0");};
decl		: var_decl {System.out.println("201504278 Rule 1-0");}
			| fun_decl {System.out.println("201504278 Rule 1-1");};
var_decl	: dec_spec IDENT type_spec  {System.out.println("201504278 Rule 2-0");}
			| dec_spec IDENT type_spec '=' LITERAL  {System.out.println("201504278 Rule 2-1");}
			| dec_spec IDENT '[' LITERAL ']' type_spec {System.out.println("201504278 Rule 2-2");};
dec_spec	: VAR {System.out.println("201504278 Rule 3");};
type_spec	: INT {System.out.println("201504278 Rule 4-0");}
			| {System.out.println("201504278 Rule 4-1");};
fun_decl	: FUNC IDENT '(' params ')' type_spec compound_stmt {System.out.println("201504278 Rule 5-0");}
			| FUNC IDENT '(' params ')' '(' type_spec ',' type_spec ')' compound_stmt {System.out.println("201504278 Rule 5-1");};
params		: param(',' param)* {System.out.println("201504278 Rule 6-0");}
			| {System.out.println("201504278 Rule 6-1");};
param		: IDENT {System.out.println("201504278 Rule 7-0");}
			| IDENT type_spec	{System.out.println("201504278 Rule 7-1");};
stmt		: expr_stmt {System.out.println("201504278 Rule 8-0");}
			| compound_stmt {System.out.println("201504278 Rule 8-1");}
			| if_stmt {System.out.println("201504278 Rule 8-2");}
			| for_stmt {System.out.println("201504278 Rule 8-3");}
			| return_stmt {System.out.println("201504278 Rule 8-4");};
expr_stmt	: expr	{System.out.println("201504278 Rule 9");};
for_stmt	: FOR loop_expr stmt	{System.out.println("201504278 Rule 10-0");}
			| FOR expr stmt	{System.out.println("201504278 Rule 10-1");};
compound_stmt: '{' local_decl* stmt* '}' {System.out.println("201504278 Rule 11");};
local_decl	: dec_spec IDENT type_spec  {System.out.println("201504278 Rule 12-0");}
			| dec_spec IDENT type_spec '=' LITERAL  {System.out.println("201504278 Rule 12-1");}
			| dec_spec IDENT '[' LITERAL ']' type_spec {System.out.println("201504278 Rule 12-2");};
if_stmt		: IF expr stmt {System.out.println("201504278 Rule 13-0");}
			| IF expr stmt ELSE stmt {System.out.println("201504278 Rule 13-1");};
return_stmt	: RETURN {System.out.println("201504278 Rule 14-0");}
			| RETURN expr {System.out.println("201504278 Rule 14-1");}
			| RETURN expr ',' expr	{System.out.println("201504278 Rule 14-2");};
loop_expr   : expr ';' expr ';' expr ('++'|'--') {System.out.println("201504278 Rule 15");};
expr		: (LITERAL|IDENT) {System.out.println("201504278 Rule 16-0");}
			| '(' expr ')' {System.out.println("201504278 Rule 16-1");}
			| IDENT '[' expr ']' {System.out.println("201504278 Rule 16-2");}
			| IDENT '(' args ')' {System.out.println("201504278 Rule 16-3");}
			| FMT '.' IDENT '(' args ')' {System.out.println("201504278 Rule 16-4");}
			| op=('-'|'+'|'--'|'++'|'!') expr {System.out.println("201504278 Rule 16-5");}
			| left=expr op=('*'|'/') right=expr {System.out.println("201504278 Rule 16-6");}
			| left=expr op=('%'|'+'|'-') right=expr {System.out.println("201504278 Rule 16-7");}
			| left=expr op=(EQ|NE|LE|'<'|GE|'>'|AND|OR) right=expr {System.out.println("201504278 Rule 16-8");}
			| IDENT '=' expr {System.out.println("201504278 Rule 16-9");}
			| IDENT '[' expr ']' '=' expr {System.out.println("201504278 Rule 16-9");};
args		: expr (',' expr) * {System.out.println("201504278 Rule 17-0");}
			| {System.out.println("201504278 Rule 17-1");};
VAR			: 'var'   {System.out.println("201504278 Rule 18");};
FUNC		: 'func'  {System.out.println("201504278 Rule 19");};
FMT			: 'fmt'	  {System.out.println("201504278 Rule 20");};
INT			: 'int'   {System.out.println("201504278 Rule 21");};
FOR			: 'for'   {System.out.println("201504278 Rule 22");};
IF			: 'if'    {System.out.println("201504278 Rule 23");};
ELSE		: 'else'  {System.out.println("201504278 Rule 24");};
RETURN		: 'return'{System.out.println("201504278 Rule 25");};
OR			: 'or'    {System.out.println("201504278 Rule 26");};
AND			: 'and'   {System.out.println("201504278 Rule 27");};
LE			: '<='    {System.out.println("201504278 Rule 28");};
GE			: '>='    {System.out.println("201504278 Rule 29");};
EQ			: '=='    {System.out.println("201504278 Rule 30");};
NE			: '!='    {System.out.println("201504278 Rule 31");};

IDENT		: [a-zA-Z_] {System.out.println("201504278 Rule 32-0");}
			( [a-zA-Z_] {System.out.println("201504278 Rule 32-1");}
			| [0-9] {System.out.println("201504278 Rule 32-2");}
			)* {System.out.println("201504278 Rule 32-3");};
			
LITERAL		: DecimalConstant | OctalConstant | HexadecimalConstant {System.out.println("201504278 Rule 33");};

DecimalConstant	: '0' | [1-9] [0-9]* {System.out.println("201504278 Rule 34");};
OctalConstant	: '0' [0-7]* {System.out.println("201504278 Rule 35");};
HexadecimalConstant	: '0' [xX] [0-9a-fA-F]+ {System.out.println("201504278 Rule 36");};
WS			: (' ' {System.out.println("201504278 Rule 37-0");}
			| '\t' {System.out.println("201504278 Rule 37-1");}
			| '\r' {System.out.println("201504278 Rule 37-2");}
			| '\n' {System.out.println("201504278 Rule 37-3");}
			)+ {System.out.println("201504278 Rule 37-4");}
	-> channel(HIDDEN)
    ;
