/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/NSLayoutAttribute/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Left(1L),
    Right(2L),
    Top(3L),
    Bottom(4L),
    Leading(5L),
    Trailing(6L),
    Width(7L),
    Height(8L),
    CenterX(9L),
    CenterY(10L),
    Baseline(11L),
    LastBaseline(11L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    FirstBaseline(12L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    LeftMargin(13L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    RightMargin(14L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    TopMargin(15L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    BottomMargin(16L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    LeadingMargin(17L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    TrailingMargin(18L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    CenterXWithinMargins(19L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    CenterYWithinMargins(20L),
    NotAnAttribute(0L);
    /*</values>*/

    private final long n;

    private /*<name>*/NSLayoutAttribute/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NSLayoutAttribute/*</name>*/ valueOf(long n) {
        for (/*<name>*/NSLayoutAttribute/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NSLayoutAttribute/*</name>*/.class.getName());
    }
}
