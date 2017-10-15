/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superbrain.webservices.managers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import superbrain.webservices.models.Test;

/**
 *
 * @author haing
 */
@RequestScoped
public class TestManager {
    
    @Inject
    private CrudService<Test> testCrudService;
    
    public Test createTest(Test test){
        testCrudService.create(test);
        return test;
    }
    
    public Test getTest(long id) {
        return testCrudService.find(Test.class, id);
    }
}
