package com.appsmith.server.repositories;

import com.appsmith.server.domains.Setting;
import com.appsmith.server.helpers.PolicyUtils;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

@Component
public class CustomSettingRepositoryImpl extends BaseAppsmithRepositoryImpl<Setting> implements CustomSettingRepository {

    private final PolicyUtils policyUtils;

    public CustomSettingRepositoryImpl(ReactiveMongoOperations mongoOperations, MongoConverter mongoConverter, PolicyUtils policyUtils) {
        super(mongoOperations, mongoConverter, policyUtils);
        this.policyUtils = policyUtils;
    }
}
