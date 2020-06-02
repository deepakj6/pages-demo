package org.dell.kube.pages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PageControllerTest {

    @Test
    public void itSaysYellowPagesHello() throws Exception {
        PageController controller = new PageController("YellowPages");

        assertThat(controller.getPage()).contains("YellowPages");
    }


}
