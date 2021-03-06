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
package com.bugvm.apple.corevideo;

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
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.opengles.*;
import com.bugvm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CVBufferAttribute/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVBufferAttribute/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CVBufferAttribute/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVBufferAttribute toObject(Class<CVBufferAttribute> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CVBufferAttribute.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CVBufferAttribute o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVBufferAttribute> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVBufferAttribute> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CVBufferAttribute.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVBufferAttribute> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVBufferAttribute o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CVBufferAttribute PropagatedAttachments = new CVBufferAttribute("PropagatedAttachments");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CVBufferAttribute NonPropagatedAttachments = new CVBufferAttribute("NonPropagatedAttachments");
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CVBufferAttribute MovieTime = new CVBufferAttribute("MovieTime");
    /*</constants>*/
    
    private static /*<name>*/CVBufferAttribute/*</name>*/[] values = new /*<name>*/CVBufferAttribute/*</name>*/[] {/*<value_list>*/PropagatedAttachments, NonPropagatedAttachments, MovieTime/*</value_list>*/};
    
    /*<name>*/CVBufferAttribute/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    CVBufferAttribute (Class<?> clazz, String getterName) {
        super(clazz, getterName);
    }
    
    public static /*<name>*/CVBufferAttribute/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CVBufferAttribute/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CVBufferAttribute/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreVideo") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCVBufferPropagatedAttachmentsKey", optional=true)
        public static native CFString PropagatedAttachments();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCVBufferNonPropagatedAttachmentsKey", optional=true)
        public static native CFString NonPropagatedAttachments();
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCVBufferMovieTimeKey", optional=true)
        public static native CFString MovieTime();
        /*</values>*/
    }
}
