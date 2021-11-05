package flock.ast;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

import flock.common.Program;

public class replace_node_0_1 extends Strategy {
	
	public static replace_node_0_1 instance = new replace_node_0_1();
	
	@Override 
	public IStrategoTerm invoke(Context context, IStrategoTerm newNode, IStrategoTerm oldNode) {
        ITermFactory factory = context.getFactory();
        Program.log("api", "[replace-node] " + oldNode.toString() + " with " + newNode.toString());
		Program.instance.replaceNode(context, oldNode, newNode);
		return newNode;
    }
}