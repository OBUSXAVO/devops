package org.product;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeProductApiIT extends ProductApiTest {

    // Execute the same tests but in native mode.
}