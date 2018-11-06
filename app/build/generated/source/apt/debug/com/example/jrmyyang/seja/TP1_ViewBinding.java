// Generated code from Butter Knife. Do not modify!
package com.example.jrmyyang.seja;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TP1_ViewBinding implements Unbinder {
  private TP1 target;

  private View view7f080048;

  private View view7f080081;

  private View view7f08006f;

  private View view7f080070;

  private View view7f080046;

  private View view7f080033;

  @UiThread
  public TP1_ViewBinding(TP1 target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TP1_ViewBinding(final TP1 target, View source) {
    this.target = target;

    View view;
    target.phone_number = Utils.findRequiredViewAsType(source, R.id.phone_number, "field 'phone_number'", EditText.class);
    target.result = Utils.findRequiredViewAsType(source, R.id.result, "field 'result'", TextView.class);
    target.input = Utils.findRequiredViewAsType(source, R.id.input, "field 'input'", EditText.class);
    view = Utils.findRequiredView(source, R.id.empiler, "field 'empiler' and method 'empile'");
    target.empiler = Utils.castView(view, R.id.empiler, "field 'empiler'", Button.class);
    view7f080048 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.empile();
      }
    });
    view = Utils.findRequiredView(source, R.id.plus, "field 'plus' and method 'add'");
    target.plus = Utils.castView(view, R.id.plus, "field 'plus'", Button.class);
    view7f080081 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.add();
      }
    });
    view = Utils.findRequiredView(source, R.id.moins, "field 'moins' and method 'sub'");
    target.moins = Utils.castView(view, R.id.moins, "field 'moins'", Button.class);
    view7f08006f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sub();
      }
    });
    view = Utils.findRequiredView(source, R.id.mult, "field 'mult' and method 'multiplier'");
    target.mult = Utils.castView(view, R.id.mult, "field 'mult'", Button.class);
    view7f080070 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.multiplier();
      }
    });
    view = Utils.findRequiredView(source, R.id.div, "field 'div' and method 'diviser'");
    target.div = Utils.castView(view, R.id.div, "field 'div'", Button.class);
    view7f080046 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.diviser();
      }
    });
    view = Utils.findRequiredView(source, R.id.clear, "field 'clear' and method 'clear'");
    target.clear = Utils.castView(view, R.id.clear, "field 'clear'", Button.class);
    view7f080033 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clear();
      }
    });
    target.progress = Utils.findRequiredViewAsType(source, R.id.progress, "field 'progress'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TP1 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.phone_number = null;
    target.result = null;
    target.input = null;
    target.empiler = null;
    target.plus = null;
    target.moins = null;
    target.mult = null;
    target.div = null;
    target.clear = null;
    target.progress = null;

    view7f080048.setOnClickListener(null);
    view7f080048 = null;
    view7f080081.setOnClickListener(null);
    view7f080081 = null;
    view7f08006f.setOnClickListener(null);
    view7f08006f = null;
    view7f080070.setOnClickListener(null);
    view7f080070 = null;
    view7f080046.setOnClickListener(null);
    view7f080046 = null;
    view7f080033.setOnClickListener(null);
    view7f080033 = null;
  }
}
