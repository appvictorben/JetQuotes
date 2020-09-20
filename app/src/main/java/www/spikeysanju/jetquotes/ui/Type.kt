/*
 *
 *  *
 *  *  * MIT License
 *  *  *
 *  *  * Copyright (c) 2020 Spikey Sanju
 *  *  *
 *  *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  *  * of this software and associated documentation files (the "Software"), to deal
 *  *  * in the Software without restriction, including without limitation the rights
 *  *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  *  * copies of the Software, and to permit persons to whom the Software is
 *  *  * furnished to do so, subject to the following conditions:
 *  *  *
 *  *  * The above copyright notice and this permission notice shall be included in all
 *  *  * copies or substantial portions of the Software.
 *  *  *
 *  *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  *  * SOFTWARE.
 *  *
 *
 */

package www.spikeysanju.jetquotes.ui


import androidx.compose.material.Typography
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import www.spikeysanju.jetquotes.R


private val futura = fontFamily(
        font(R.font.futurabook),
        font(R.font.futuramedium, FontWeight.W500),
        font(R.font.futurabold, FontWeight.Bold))


val typography = Typography(defaultFontFamily = futura)


//private val appFontFamily = fontFamily(
//        fonts = listOf(
//                ResourceFont(
//                        resId = R.font.futurabook,
//                        weight = FontWeight.W900,
//                        style = FontStyle.Normal
//                ),
//                ResourceFont(
//                        resId = R.font.futuramedium,
//                        weight = FontWeight.W900,
//                        style = FontStyle.Normal
//                ),
//                ResourceFont(
//                        resId = R.font.futuraheavy,
//                        weight = FontWeight.W700,
//                        style = FontStyle.Normal
//                ),
//)
//)
//private val defaultTypography = Typography()
//val appTypography = Typography(
//        h1 = defaultTypography.h1.copy(fontFamily = appFontFamily),
//        h2 = defaultTypography.h2.copy(fontFamily = appFontFamily),
//        h3 = defaultTypography.h3.copy(fontFamily = appFontFamily),
//        h4 = defaultTypography.h4.copy(fontFamily = appFontFamily),
//        h5 = defaultTypography.h5.copy(fontFamily = appFontFamily),
//        h6 = defaultTypography.h6.copy(fontFamily = appFontFamily),
//        subtitle1 = defaultTypography.subtitle1.copy(fontFamily = appFontFamily),
//        subtitle2 = defaultTypography.subtitle2.copy(fontFamily = appFontFamily),
//        body1 = defaultTypography.body1.copy(fontFamily = appFontFamily),
//        body2 = defaultTypography.body2.copy(fontFamily = appFontFamily),
//        button = defaultTypography.button.copy(fontFamily = appFontFamily),
//        caption = defaultTypography.caption.copy(fontFamily = appFontFamily),
//        overline = defaultTypography.overline.copy(fontFamily = appFontFamily )
//)