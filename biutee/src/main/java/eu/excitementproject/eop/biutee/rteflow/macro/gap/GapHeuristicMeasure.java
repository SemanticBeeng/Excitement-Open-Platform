package eu.excitementproject.eop.biutee.rteflow.macro.gap;

import java.util.Map;

import eu.excitementproject.eop.common.representation.parse.tree.AbstractNode;
import eu.excitementproject.eop.common.representation.parse.tree.TreeAndParentMap;

/**
 * 
 * @author Asher Stern
 * @since Aug 1, 2013
 *
 */
public interface GapHeuristicMeasure<I, S extends AbstractNode<I, S>>
{
	public double measure(TreeAndParentMap<I, S> tree, Map<Integer, Double> featureVector) throws GapException;

}
