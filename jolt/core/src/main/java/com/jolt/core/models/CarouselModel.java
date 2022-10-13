package com.jolt.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CarouselModel {
    @ValueMapValue
    private String id;

    @ValueMapValue
    private String title;

    @Inject
    private List<CarouselCardModel> cards;

    public String getId() {
        return id;
    }

    public String getTitle() { return title; }

    public List<CarouselCardModel> getCards() {
        return new ArrayList<>(cards);
    }
}
