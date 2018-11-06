// Generated code from Butter Knife. Do not modify!
package com.example.jrmyyang.seja;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f080006;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.TP1, "field 'buttonTP1' and method 'submit'");
    target.buttonTP1 = Utils.castView(view, R.id.TP1, "field 'buttonTP1'", Button.class);
    view7f080006 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttonTP1 = null;

    view7f080006.setOnClickListener(null);
    view7f080006 = null;
  }
}
