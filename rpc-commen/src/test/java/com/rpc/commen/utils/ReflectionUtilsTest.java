package com.rpc.commen.utils;

import junit.framework.TestCase;

import java.lang.reflect.Method;

public class ReflectionUtilsTest extends TestCase {

    public void testNewInstance() {
        TestClass t = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(t);
    }

    public void testGetPublicMethods() {
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(1, methods.length);
        String mname = methods[0].getName();
        assertEquals("b", mname);
    }

    public void testInvoke() {
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method b = methods[0];
        assertEquals("b", b.getName());
        TestClass t = new TestClass();
        Object r = ReflectionUtils.invoke(t, b);
        assertEquals("b", r);
    }
}