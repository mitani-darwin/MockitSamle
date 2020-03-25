package com.daisule2.MockitSampleTest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.daisuke2.MockitSample.Main.Sample1;

public class SampleTest1 {
  @Mock
  private Sample1 simple;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void getHelloTest() {
    when(simple.getHello()).thenReturn("コロナウィルス");

    assertThat(simple.getHello(), is("コロナウィルス"));
  }

}
