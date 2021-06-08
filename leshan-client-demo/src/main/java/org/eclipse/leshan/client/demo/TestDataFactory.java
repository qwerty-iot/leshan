package org.eclipse.leshan.client.demo;

import org.eclipse.leshan.client.resource.LwM2mInstanceEnabler;
import org.eclipse.leshan.client.resource.LwM2mInstanceEnablerFactory;
import org.eclipse.leshan.core.model.ObjectModel;

import java.util.Collection;

public class TestDataFactory implements LwM2mInstanceEnablerFactory {
    public LwM2mInstanceEnabler create(ObjectModel model, Integer id, Collection<Integer> alreadyUsedIdentifier) {
        return new TestData();
    }
}
