package com.daisuke2.MockitSample.Main;

import com.daisuke2.MockitSample.Sub.Sample2Sub;

public class Sample2 {

  private Sample2Sub sub;

  public String getHello() {
    return sub.getContents();
  }


}
