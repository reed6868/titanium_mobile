/**
 * TiDev Titanium Mobile
 * Copyright TiDev, Inc. 04/07/2022-Present. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package ti.modules.titanium.xml;

import org.appcelerator.kroll.annotations.Kroll;
import org.w3c.dom.Comment;

@Kroll.proxy(parentModule = XMLModule.class)
public class CommentProxy extends CharacterDataProxy
{

	public CommentProxy(Comment comment)
	{
		super(comment);
	}

	@Override
	public String getApiName()
	{
		return "Ti.XML.Comment";
	}
}
