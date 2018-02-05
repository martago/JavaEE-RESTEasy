package de.janosch.resteasy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VersionRESTTest {

    @Test
    public void versionGetSetTest() {
        VersionREST versionREST = new VersionREST();

        assertThat(versionREST.getVersion(), is("1.0.0"));
        versionREST.setVersion("2.0.0");
        assertThat(versionREST.getVersion(), is("2.0.0"));
    }

}
