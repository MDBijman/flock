package flock.common;

import flock.common.Graph.Node;

public abstract class TransferFunction {
	public abstract FlockLattice eval(Node node);
}