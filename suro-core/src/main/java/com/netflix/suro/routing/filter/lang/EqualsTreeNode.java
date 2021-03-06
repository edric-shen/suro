package com.netflix.suro.routing.filter.lang;

import com.netflix.suro.routing.filter.MessageFilter;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class EqualsTreeNode extends EqualityComparisonBaseTreeNode implements MessageFilterTranslatable {

	@Override
	public MessageFilter translate() {
		return getEqualFilter();
	}

	public EqualsTreeNode(Token t) {
		super(t);
	} 

	public EqualsTreeNode(EqualsTreeNode node) {
		super(node);
	} 

	public Tree dupNode() {
		return new EqualsTreeNode(this);
	} 
}
