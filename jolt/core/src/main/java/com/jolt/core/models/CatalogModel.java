package com.jolt.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CatalogModel {
    @ValueMapValue
    private String id;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String ctaUrl;

    @ValueMapValue
    private String ctaText;

    @Inject
    private List<CardModel> cards;

    public String getId() {
        return id;
    }

    public String getTitle() { return title; }

    public String getCtaUrl() {
        return ctaUrl;
    }

    public String getCtaText() { return ctaText; }

    public List<CardModel> getCards() {
        return new ArrayList<>(cards);
    }
}
