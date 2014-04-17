package com.amirkaljikovicphotography.myheadshots.tutorial.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.Block;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;

/**
 * Layout component for pages of application tutorial1.
 */
@Import(stylesheet={
        "context:layout/css/bootstrap.css",
        "context:layout/css/bootstrap-responsive.css"
        },
library={
		"context:layout/js/main.js",
        "context:layout/js/bootstrap.js",
        "context:layout/js/html5shiv.js", 
		"context:layout/js/respond.min.js",
		"context:layout/js/lib/pace.min.js",
		"context:layout/js/lib/jquery.min.js",
		"context:layout/js/bootstrap.min.js",
		"context:layout/js/lib/smoothscroll.js",
		"context:layout/js/lib/smoothscroll.js",
		"context:layout/js/lib/jquery.sudoslider.min.js",
		"context:layout/js/lib/jquery.parallax.js",
		"context:layout/js/lib/jquery.magnific-popup.min.js",
		"context:layout/js/lib/gmap3.min.js",
		"context:layout/js/lib/jquery.inview.min.js",
		"context:layout/js/lib/jquery.simple-text-rotator.min.js",
		"context:layout/js/lib/jquery.mixitup.min.js",
        }
)
public class Layout
{
    /**
     * The page title, for the <title> element and the <h1> element.
     */
    @Property
    @Parameter(required = true, defaultPrefix = BindingConstants.LITERAL)
    private String title;

    @Property
    private String pageName;

    @Property
    @Parameter(defaultPrefix = BindingConstants.LITERAL)
    private String sidebarTitle;

    @Property
    @Parameter(defaultPrefix = BindingConstants.LITERAL)
    private Block sidebar;

    @Inject
    private ComponentResources resources;

    @Property
    @Inject
    @Symbol(SymbolConstants.APPLICATION_VERSION)
    private String appVersion;


    public String getClassForPageName()
    {
        return resources.getPageName().equalsIgnoreCase(pageName)
                ? "current_page_item"
                : null;
    }

    public String[] getPageNames()
    {
        return new String[]{"Index", "About", "Contact"};
    }
}
