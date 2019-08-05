
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Aug 05 12:35:27 CST 2019
//----------------------------------------------------

package Analizador.E2;

import java_cup.runtime.*;
import Analizador.util.*;
import intefaz.Principal;
import java.util.Stack;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Aug 05 12:35:27 CST 2019
  */
public class ParserE2 extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserE2() {super();}

  /** Constructor which sets the default scanner. */
  public ParserE2(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserE2(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\004\000\002\002\003\000\002\002\004\000\002\004" +
    "\004\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\006\000\004\021\004\001\002\000\006\002\ufffe\021" +
    "\ufffe\001\002\000\006\002\001\021\010\001\002\000\004" +
    "\002\007\001\002\000\004\002\000\001\002\000\006\002" +
    "\uffff\021\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\006\000\006\002\005\004\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserE2$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserE2$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserE2$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**Metodo al que se llama automáticamente ante algún error sintactico.*/
    public void syntax_error(Symbol s){
        System.err.println("Error en la Línea " + (s.right+1) +" Columna "+(s.left+1)+ ". Identificador "
        +s.value + " no reconocido." );
        Analizador.AnalizadorLenguaje.getErrores().add(new MiError("identificador \""+s.value+"\" no identificado", TipoError.SINTACTICO, 
        "",(s.right+1), (s.left+1)));
        
    }

    /**Metodo al que se llama en el momento en que ya no es posible una recuperación de
    getErrores().*/
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.err.println("Error en la Línea " + (s.right+1)+ "Columna "+(s.left+1)+". Identificador " +
        s.value + " no reconocido.");  
        Analizador.AnalizadorLenguaje.getErrores().add(new MiError("identificador \""+s.value+"\" no identificado", TipoError.SINTACTICO, 
        "",(s.right+1), (s.left+1)));
  
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserE2$actions {



void Ej2(Stack pila){
if(pila.size()>6){
Principal.escribirErrorEnConsola("Error: No pueden haber más de 6 digitos");
}else{
//sacar y contar para asignar
int contador=1;
while(!pila.isEmpty()){
switch(contador){
    case 1:
        Principal.escribirMensajeEnConsola("Unidad: "+pila.pop().toString());
        break;
        case 2:
        Principal.escribirMensajeEnConsola("Decena: "+pila.pop().toString());
        break;
        case 3:
        Principal.escribirMensajeEnConsola("Centena: "+pila.pop().toString());
        break;             
        case 4:
        Principal.escribirMensajeEnConsola("Unidad de mil: "+pila.pop().toString());
        break;
        case 5:
        Principal.escribirMensajeEnConsola("Decena de mil: "+pila.pop().toString());
        break;
        case 6:
        Principal.escribirMensajeEnConsola("Centena de mil: "+pila.pop().toString());
        break;
}
contador++;
}
}
}

  private final ParserE2 parser;

  /** Constructor */
  CUP$ParserE2$actions(ParserE2 parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserE2$do_action(
    int                        CUP$ParserE2$act_num,
    java_cup.runtime.lr_parser CUP$ParserE2$parser,
    java.util.Stack            CUP$ParserE2$stack,
    int                        CUP$ParserE2$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserE2$result;

      /* select the action based on the action number */
      switch (CUP$ParserE2$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INI2 ::= entero 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$ParserE2$stack.peek()).value;
		
Stack pila = new Stack();
pila.push(val);
RESULT=pila;

              CUP$ParserE2$result = parser.getSymbolFactory().newSymbol("INI2",2, ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()), RESULT);
            }
          return CUP$ParserE2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INI2 ::= INI2 entero 
            {
              Object RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.elementAt(CUP$ParserE2$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.elementAt(CUP$ParserE2$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$ParserE2$stack.elementAt(CUP$ParserE2$top-1)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$ParserE2$stack.peek()).value;
		
Stack pila = (Stack)p;
pila.push(val);
RESULT=pila;

              CUP$ParserE2$result = parser.getSymbolFactory().newSymbol("INI2",2, ((java_cup.runtime.Symbol)CUP$ParserE2$stack.elementAt(CUP$ParserE2$top-1)), ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()), RESULT);
            }
          return CUP$ParserE2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.elementAt(CUP$ParserE2$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.elementAt(CUP$ParserE2$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserE2$stack.elementAt(CUP$ParserE2$top-1)).value;
		RESULT = start_val;
              CUP$ParserE2$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserE2$stack.elementAt(CUP$ParserE2$top-1)), ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserE2$parser.done_parsing();
          return CUP$ParserE2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // INICIO ::= INI2 
            {
              Object RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$ParserE2$stack.peek()).value;
		Ej2((Stack)p);
              CUP$ParserE2$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserE2$stack.peek()), RESULT);
            }
          return CUP$ParserE2$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

