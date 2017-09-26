package com.sunzala.afghankeyboard.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodSubtype;

import com.sunzala.afghankeyboard.R;

import java.util.List;


public class LatinKeyboardView extends KeyboardView {

    static final int KEYCODE_OPTIONS = -100;
    // TODO: Move this into android.inputmethodservice.Keyboard
    static final int KEYCODE_LANGUAGE_SWITCH = -101;

    SoftKeyboard softKeyboard = new SoftKeyboard();

    public LatinKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LatinKeyboardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * The long press insert key for popup single key instead of displaying popup window.
     * @param key
     * @return boolean
     */
    @Override
    protected boolean onLongPress(Key key) {

        // For English keyboard.
        if (key.codes[0] == Keyboard.KEYCODE_CANCEL) {
            getOnKeyboardActionListener().onKey(KEYCODE_OPTIONS, null);
            return true;
        } else if (key.codes[0] == '0') {
            getOnKeyboardActionListener().onKey('+', null);
            return true;
        } else if (key.codes[0] == 'q' || key.codes[0] == 'Q') {
            getOnKeyboardActionListener().onKey('1', null);
            return true;
        } else if (key.codes[0] == 'w' || key.codes[0] == 'W') {
            getOnKeyboardActionListener().onKey('2', null);
            return true;
        } else if (key.codes[0] == 'e' || key.codes[0] == 'E') {
            getOnKeyboardActionListener().onKey('3', null);
            return true;
        } else if (key.codes[0] == 'r' || key.codes[0] == 'R') {
            getOnKeyboardActionListener().onKey('4', null);
            return true;
        } else if (key.codes[0] == 't' || key.codes[0] == 'T') {
            getOnKeyboardActionListener().onKey('5', null);
            return true;
        } else if (key.codes[0] == 'y' || key.codes[0] == 'Y') {
            getOnKeyboardActionListener().onKey('6', null);
            return true;
        } else if (key.codes[0] == 'u' || key.codes[0] == 'U') {
            getOnKeyboardActionListener().onKey('7', null);
            return true;
        } else if (key.codes[0] == 'i' || key.codes[0] == 'I') {
            getOnKeyboardActionListener().onKey('8', null);
            return true;
        } else if (key.codes[0] == 'o' || key.codes[0] == 'O') {
            getOnKeyboardActionListener().onKey('9', null);
            return true;
        } else if (key.codes[0] == 'p' || key.codes[0] == 'P') {
            getOnKeyboardActionListener().onKey('0', null);
            return true;

            // For Farsi Keyboard
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ض') {
            getOnKeyboardActionListener().onKey('۱', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ص') {
            getOnKeyboardActionListener().onKey('۲', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ث') {
            getOnKeyboardActionListener().onKey('۳', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ق') {
            getOnKeyboardActionListener().onKey('۴', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ف') {
            getOnKeyboardActionListener().onKey('۵', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'غ') {
            getOnKeyboardActionListener().onKey('۶', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ع') {
            getOnKeyboardActionListener().onKey('۷', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ه') {
            getOnKeyboardActionListener().onKey('۸', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'خ') {
            getOnKeyboardActionListener().onKey('۹', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ح') {
            getOnKeyboardActionListener().onKey('۰', null);
            return true;
        } else if (getKeyboard() != softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ش') {
            getOnKeyboardActionListener().onKey('ٴ', null);
            return true;

            // For Pashto Keyboard
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ث') {
            getOnKeyboardActionListener().onKey('۲', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ق') {
            getOnKeyboardActionListener().onKey('۳', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ف') {
            getOnKeyboardActionListener().onKey('۴', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ځ') {
            getOnKeyboardActionListener().onKey('۵', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'څ') {
            getOnKeyboardActionListener().onKey('۶', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'خ') {
            getOnKeyboardActionListener().onKey('۷', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ح') {
            getOnKeyboardActionListener().onKey('۸', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'چ') {
            getOnKeyboardActionListener().onKey('۹', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ج') {
            getOnKeyboardActionListener().onKey('۰', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ن') {
            getOnKeyboardActionListener().onKey('ڼ', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'و') {
            getOnKeyboardActionListener().onKey('ؤ', null);
            return true;
        } else if (getKeyboard() == softKeyboard.getPashtoKeyboard() && key.codes[0] == 'ط') {
            getOnKeyboardActionListener().onKey('ظ', null);
            return true;
        } else {
            return super.onLongPress(key);
        }
    }

    void setSubtypeOnSpaceKey(final InputMethodSubtype subtype) {
        final LatinKeyboard keyboard = (LatinKeyboard) getKeyboard();
        // keyboard.setSpaceIcon(getResources().getDrawable(subtype.getIconResId()));
        invalidateAllKeys();
    }

    Paint paint = new Paint();
    /**
     * Add 123 numbers to labels of top row.
     * @param canvas
     */
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(getResources().getDimension(R.dimen.canvasTextSize));
        int keyYLocation = (int) getResources().getDimension(R.dimen.canvasKeyY);
        paint.setColor(getResources().getColor(R.color.white));
        //get all your keys and draw whatever you want
        List<Key> keys = getKeyboard().getKeys();
        for (Key key : keys) {
            if (key.label != null) {

                if (key.label.toString().equals("q") || key.label.toString().equals("Q") || key.label.toString().equals("۱"))
                    canvas.drawText(String.valueOf(1), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("w") || key.label.toString().equals("W") || key.label.toString().equals("۲"))
                    canvas.drawText(String.valueOf(2), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("e") || key.label.toString().equals("E") || key.label.toString().equals("۳"))
                    canvas.drawText(String.valueOf(3), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("r") || key.label.toString().equals("R") || key.label.toString().equals("۴"))
                    canvas.drawText(String.valueOf(4), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("t") || key.label.toString().equals("T") || key.label.toString().equals("۵"))
                    canvas.drawText(String.valueOf(5), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("y") || key.label.toString().equals("Y") || key.label.toString().equals("۶"))
                    canvas.drawText(String.valueOf(6), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("u") || key.label.toString().equals("U") || key.label.toString().equals("۷"))
                    canvas.drawText(String.valueOf(7), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("i") || key.label.toString().equals("I") || key.label.toString().equals("۸"))
                    canvas.drawText(String.valueOf(8), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("o") || key.label.toString().equals("o") || key.label.toString().equals("۹"))
                    canvas.drawText(String.valueOf(9), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("p") || key.label.toString().equals("P") || key.label.toString().equals("۰"))
                    canvas.drawText(String.valueOf(0), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    // for Pashto and Farsi keyboards.
                else if (key.label.toString().equals("ا"))
                    canvas.drawText(String.valueOf("آ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    // for Farsi keyboards.
                else if (key.label.toString().equals("ض") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۱"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ص") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۲"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ث") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۳"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ق") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۴"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ف") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۵"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("غ") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۶"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ع") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۷"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ه") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۸"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("خ") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۹"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ح") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۰"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("س") && getKeyboard() != softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("ٴ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    // For Pashto Keyboard.
                else if (key.label.toString().equals("ص") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۱"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ث") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۲"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ق") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۳"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ف") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۴"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ځ") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۵"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("څ") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۶"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("خ") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۷"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ح") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۸"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("چ") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۹"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ج") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۰"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ن") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("ڼ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ي") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("ئ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ط") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("ظ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("و") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("ؤ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ج") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("۰"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("ټ") && getKeyboard() == softKeyboard.getPashtoKeyboard())
                    canvas.drawText(String.valueOf("ة"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
            }
        }
    }
}
