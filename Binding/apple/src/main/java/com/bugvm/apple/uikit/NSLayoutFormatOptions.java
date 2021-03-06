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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSLayoutFormatOptions/*</name>*/ extends Bits</*<name>*/NSLayoutFormatOptions/*</name>*/> {
    /*<values>*/
    public static final NSLayoutFormatOptions None = new NSLayoutFormatOptions(0L);
    public static final NSLayoutFormatOptions AlignAllLeft = new NSLayoutFormatOptions(2L);
    public static final NSLayoutFormatOptions AlignAllRight = new NSLayoutFormatOptions(4L);
    public static final NSLayoutFormatOptions AlignAllTop = new NSLayoutFormatOptions(8L);
    public static final NSLayoutFormatOptions AlignAllBottom = new NSLayoutFormatOptions(16L);
    public static final NSLayoutFormatOptions AlignAllLeading = new NSLayoutFormatOptions(32L);
    public static final NSLayoutFormatOptions AlignAllTrailing = new NSLayoutFormatOptions(64L);
    public static final NSLayoutFormatOptions AlignAllCenterX = new NSLayoutFormatOptions(512L);
    public static final NSLayoutFormatOptions AlignAllCenterY = new NSLayoutFormatOptions(1024L);
    public static final NSLayoutFormatOptions AlignAllBaseline = new NSLayoutFormatOptions(2048L);
    public static final NSLayoutFormatOptions AlignAllLastBaseline = new NSLayoutFormatOptions(2048L);
    /**
     * @since Available in iOS 8.0 and later.
     */
    public static final NSLayoutFormatOptions AlignAllFirstBaseline = new NSLayoutFormatOptions(4096L);
    public static final NSLayoutFormatOptions AlignmentMask = new NSLayoutFormatOptions(65535L);
    public static final NSLayoutFormatOptions DirectionLeadingToTrailing = new NSLayoutFormatOptions(0L);
    public static final NSLayoutFormatOptions DirectionLeftToRight = new NSLayoutFormatOptions(65536L);
    public static final NSLayoutFormatOptions DirectionRightToLeft = new NSLayoutFormatOptions(131072L);
    public static final NSLayoutFormatOptions DirectionMask = new NSLayoutFormatOptions(196608L);
    /*</values>*/

    private static final /*<name>*/NSLayoutFormatOptions/*</name>*/[] values = _values(/*<name>*/NSLayoutFormatOptions/*</name>*/.class);

    public /*<name>*/NSLayoutFormatOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSLayoutFormatOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSLayoutFormatOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSLayoutFormatOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSLayoutFormatOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSLayoutFormatOptions/*</name>*/[] values() {
        return values.clone();
    }
}
