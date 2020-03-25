package com.daisule2.MockitSampleTest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.daisuke2.MockitSample.Main.Sample2;
import com.daisuke2.MockitSample.Sub.Sample2Sub;

public class SampleTest2 {
  @InjectMocks
  private Sample2 simple;

  @Mock
  private Sample2Sub sample2Sub;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void getHelloTest() {
    System.out.println(sample2Sub.getContents());
    when(sample2Sub.getContents()).thenReturn("ファンタズミックは3月25日をもって終了しました");

    System.out.println(sample2Sub.getContents());
    assertThat(simple.getHello(), is("ファンタズミックは3月25日をもって終了しました"));
  }

}
