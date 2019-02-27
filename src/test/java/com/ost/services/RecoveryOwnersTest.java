package com.ost.services;

import com.google.gson.JsonObject;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class RecoveryOwnersTest extends ServiceTestBase {
    @Override
    public RecoveryOwners getService() {
        return (RecoveryOwners) super.getService();
    }

    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
        setService(getServiceManifest().recoveryOwners);
    }

    @Override
    public Manifest getServiceManifest() {
        return (Manifest) super.getServiceManifest();
    }

    @Test
    public void get() throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>();

        // Test-Case: Get recovery owner.
        JsonObject response;
        response = getService().get(params);
        validateResponseWithSuccess(response);

    }

}
