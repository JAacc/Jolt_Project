package com.jolt.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CatalogCardModel {
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String subtitle;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String linkUrl;

    @ValueMapValue
    private String linkText;

//    @Inject
//    private long index;
//
//    private Boolean showBeginRowDiv;
//    private Boolean showEndRowDiv;

    public String getTitle() { return title; }

    public String getSubtitle() { return subtitle; }

    public String getDescription() { return description; }

    public String getLinkUrl() { return linkUrl; }

    public String getLinkText() { return linkText; }

//    public long getIndex() { return index; }
//
//    public Boolean getShowBeginRowDiv() { return index % 2 == 0; }
//
//    public Boolean getShowEndRowDiv() { return index % 2 == 1; }
}
