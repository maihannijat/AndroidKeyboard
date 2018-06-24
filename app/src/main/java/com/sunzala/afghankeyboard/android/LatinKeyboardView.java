package com.sunzala.afghankeyboard.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.inputmethod.InputMethodSubtype;

import com.sunzala.afghankeyboard.R;

import java.util.List;
import java.util.Objects;


public class LatinKeyboardView extends KeyboardView {

    static final int KEYCODE_OPTIONS = -100;
    // TODO: Move this into android.inputmethodservice.Keyboard
    static final int KEYCODE_LANGUAGE_SWITCH = -101;

    public LatinKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LatinKeyboardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * The long press insert key for popup single key instead of displaying popup window.
     *
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
        } else if (key.codes[0] == 'q' || key.codes[0] == 'Q' || key.codes[0] == '۱') {
            getOnKeyboardActionListener().onKey('1', null);
            return true;
        } else if (((key.codes[0] == 'w' || key.codes[0] == 'W') && SoftKeyboard.mActiveKeyboard == "en_US") || key.codes[0] == '۲') {
            getOnKeyboardActionListener().onKey('2', null);
            return true;
        } else if (key.codes[0] == 'e' || key.codes[0] == 'E' || key.codes[0] == '۳') {
            getOnKeyboardActionListener().onKey('3', null);
            return true;
        } else if (((key.codes[0] == 'r' || key.codes[0] == 'R') && SoftKeyboard.mActiveKeyboard == "en_US") || key.codes[0] == '۴') {
            getOnKeyboardActionListener().onKey('4', null);
            return true;
        } else if (((key.codes[0] == 't' || key.codes[0] == 'T') && SoftKeyboard.mActiveKeyboard == "en_US") || key.codes[0] == '۵') {
            getOnKeyboardActionListener().onKey('5', null);
            return true;
        } else if (key.codes[0] == 'y' || key.codes[0] == 'Y' || key.codes[0] == '۶') {
            getOnKeyboardActionListener().onKey('6', null);
            return true;
        } else if (key.codes[0] == 'u' || key.codes[0] == 'U' || key.codes[0] == '۷') {
            getOnKeyboardActionListener().onKey('7', null);
            return true;
        } else if (key.codes[0] == 'i' || key.codes[0] == 'I' || key.codes[0] == '۸') {
            getOnKeyboardActionListener().onKey('8', null);
            return true;
        } else if (key.codes[0] == 'o' || key.codes[0] == 'O' || key.codes[0] == '۹') {
            getOnKeyboardActionListener().onKey('9', null);
            return true;
        } else if (key.codes[0] == 'p' || key.codes[0] == 'P' || key.codes[0] == '۰') {
            getOnKeyboardActionListener().onKey('0', null);
            return true;
        } else if ((key.codes[0] == 'S' || key.codes[0] == 's') && SoftKeyboard.mActiveKeyboard == "en_US") {
            getOnKeyboardActionListener().onKey('ϐ', null);
            return true;

            // For Farsi Keyboard
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ض') {
            getOnKeyboardActionListener().onKey('۱', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ص') {
            getOnKeyboardActionListener().onKey('۲', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ث') {
            getOnKeyboardActionListener().onKey('۳', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ق') {
            getOnKeyboardActionListener().onKey('۴', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ف') {
            getOnKeyboardActionListener().onKey('۵', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'غ') {
            getOnKeyboardActionListener().onKey('۶', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ع') {
            getOnKeyboardActionListener().onKey('۷', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ه') {
            getOnKeyboardActionListener().onKey('۸', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'خ') {
            getOnKeyboardActionListener().onKey('۹', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ح') {
            getOnKeyboardActionListener().onKey('۰', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "fa_AF" && key.codes[0] == 'ش') {
            getOnKeyboardActionListener().onKey('ٴ', null);
            return true;

            // For Pashto Keyboard
        } else if (Objects.equals(SoftKeyboard.mActiveKeyboard, "ps_AF") && key.codes[0] == 'ث') {
            getOnKeyboardActionListener().onKey('۲', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'ق') {
            getOnKeyboardActionListener().onKey('۳', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'ف') {
            getOnKeyboardActionListener().onKey('۴', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'ځ') {
            getOnKeyboardActionListener().onKey('۵', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'څ') {
            getOnKeyboardActionListener().onKey('۶', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'خ') {
            getOnKeyboardActionListener().onKey('۷', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'ح') {
            getOnKeyboardActionListener().onKey('۸', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'چ') {
            getOnKeyboardActionListener().onKey('۹', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'ج') {
            getOnKeyboardActionListener().onKey('۰', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'ن') {
            getOnKeyboardActionListener().onKey('ڼ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'و') {
            getOnKeyboardActionListener().onKey('ؤ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'ط') {
            getOnKeyboardActionListener().onKey('ظ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard == "ps_AF" && key.codes[0] == 'ټ') {
            getOnKeyboardActionListener().onKey('ة', null);
            return true;

            // For Latin Keys
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && (key.codes[0] == 'w' || key.codes[0] == 'W')) {
            getOnKeyboardActionListener().onKey('1', null);
            return true;
        } else if (key.codes[0] == 'ə' || key.codes[0] == 'Ə') {
            getOnKeyboardActionListener().onKey('2', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 's') {
            getOnKeyboardActionListener().onKey('š', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'd') {
            getOnKeyboardActionListener().onKey('ḍ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'z') {
            getOnKeyboardActionListener().onKey('ž', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'c') {
            getOnKeyboardActionListener().onKey('č', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'n') {
            getOnKeyboardActionListener().onKey('ṇ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'g') {
            getOnKeyboardActionListener().onKey('ǧ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'l') {
            getOnKeyboardActionListener().onKey('ɣ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'j') {
            getOnKeyboardActionListener().onKey('ǰ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'S') {
            getOnKeyboardActionListener().onKey('Š', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'D') {
            getOnKeyboardActionListener().onKey('Ḍ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'Z') {
            getOnKeyboardActionListener().onKey('Ž', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'C') {
            getOnKeyboardActionListener().onKey('Č', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'N') {
            getOnKeyboardActionListener().onKey('Ṇ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'G') {
            getOnKeyboardActionListener().onKey('Ǧ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'L') {
            getOnKeyboardActionListener().onKey('Ɣ', null);
            return true;
        } else if (SoftKeyboard.mActiveKeyboard != "en_US" && key.codes[0] == 'J') {
            getOnKeyboardActionListener().onKey('ǰ', null);
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
     *
     * @param canvas
     */
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(getResources().getDimension(R.dimen.canvasTextSize));
        int keyYLocation = getResources().getDimensionPixelSize(R.dimen.canvasKeyY);
        paint.setColor(getResources().getColor(R.color.white));
        //get all your keys and draw whatever you want
        List<Key> keys = getKeyboard().getKeys();
        for (Key key : keys) {
            if (key.label != null) {

                if (key.label.toString().equals("q") || key.label.toString().equals("Q") || key.label.toString().equals("۱"))
                    canvas.drawText(String.valueOf(1), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (((key.codes[0] == 'w' || key.codes[0] == 'W') && SoftKeyboard.mActiveKeyboard == "en_US") || key.label.toString().equals("۲"))
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
                    canvas.drawText(String.valueOf("آ ء"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                else if (key.label.toString().equals("."))
                    canvas.drawText(String.valueOf("..."), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    // for Farsi keyboards.
                else if (SoftKeyboard.mActiveKeyboard == "fa_AF") {
                    if (key.label.toString().equals("ض"))
                        canvas.drawText(String.valueOf("۱"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ص"))
                        canvas.drawText(String.valueOf("۲"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ث"))
                        canvas.drawText(String.valueOf("۳"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ق"))
                        canvas.drawText(String.valueOf("۴"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ف"))
                        canvas.drawText(String.valueOf("۵"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("غ"))
                        canvas.drawText(String.valueOf("۶"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ع"))
                        canvas.drawText(String.valueOf("۷"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ه"))
                        canvas.drawText(String.valueOf("۸"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("خ"))
                        canvas.drawText(String.valueOf("۹"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ح"))
                        canvas.drawText(String.valueOf("۰"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("س"))
                        canvas.drawText(String.valueOf("ٴ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    // For Pashto Language
                } else if (SoftKeyboard.mActiveKeyboard == "ps_AF") {
                    if (key.label.toString().equals("ص"))
                        canvas.drawText(String.valueOf("ض"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ن"))
                        canvas.drawText(String.valueOf("ڼ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ي"))
                        canvas.drawText(String.valueOf("ئ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ط"))
                        canvas.drawText(String.valueOf("ظ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("و"))
                        canvas.drawText(String.valueOf("ؤ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ج"))
                        canvas.drawText(String.valueOf("۰"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);

                    else if (key.label.toString().equals("ټ"))
                        canvas.drawText(String.valueOf("ة"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    // For Latin Pashto
                } else if (SoftKeyboard.mActiveKeyboard == "ps_latin_AF" || SoftKeyboard.mActiveKeyboard == "ps_latin_AF_Shift") {
                    if (key.label.toString().equals("w"))
                        canvas.drawText(String.valueOf("1"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    else if (key.label.toString().equals("ə")) {
                        canvas.drawText(String.valueOf("2"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (key.label.toString().equals("e")) {
                        canvas.drawText(String.valueOf("3"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (key.label.toString().equals("r")) {
                        canvas.drawText(String.valueOf("4"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (key.label.toString().equals("t")) {
                        canvas.drawText(String.valueOf("5"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (key.label.toString().equals("y")) {
                        canvas.drawText(String.valueOf("6"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (key.label.toString().equals("u")) {
                        canvas.drawText(String.valueOf("7"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (key.label.toString().equals("i")) {
                        canvas.drawText(String.valueOf("8"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (key.label.toString().equals("o")) {
                        canvas.drawText(String.valueOf("9"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (key.label.toString().equals("p")) {
                        canvas.drawText(String.valueOf("0"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                    } else if (SoftKeyboard.mActiveKeyboard == "ps_latin_AF") {
                        if (key.label.toString().equals("w") || key.label.toString().equals("W")) {
                            canvas.drawText(String.valueOf("1"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("a")) {
                            canvas.drawText(String.valueOf("á"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("s")) {
                            canvas.drawText(String.valueOf("š"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("d")) {
                            canvas.drawText(String.valueOf("ḍ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("z")) {
                            canvas.drawText(String.valueOf("ž"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("c")) {
                            canvas.drawText(String.valueOf("č"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("n")) {
                            canvas.drawText(String.valueOf("ṇ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("g")) {
                            canvas.drawText(String.valueOf("ǧ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("l")) {
                            canvas.drawText(String.valueOf("ɣ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("j")) {
                            canvas.drawText(String.valueOf("ǰ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        }
                    } else if (SoftKeyboard.mActiveKeyboard == "ps_latin_AF_Shift") {
                        if (key.label.toString().equals("A")) {
                            canvas.drawText(String.valueOf("Á"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("S")) {
                            canvas.drawText(String.valueOf("Š"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("D")) {
                            canvas.drawText(String.valueOf("Ḍ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("Z")) {
                            canvas.drawText(String.valueOf("Ž"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("C")) {
                            canvas.drawText(String.valueOf("Č"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("N")) {
                            canvas.drawText(String.valueOf("Ṇ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("G")) {
                            canvas.drawText(String.valueOf("Ǧ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("L")) {
                            canvas.drawText(String.valueOf("Ɣ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        } else if (key.label.toString().equals("J")) {
                            canvas.drawText(String.valueOf("ǰ"), key.x + (key.width / 2) + 10, key.y + keyYLocation, paint);
                        }
                    }
                }
            }

        }
    }
}