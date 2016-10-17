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
package com.bugvm.apple.foundation;

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
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.security.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSValueTransformer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSValueTransformerPtr extends Ptr<NSValueTransformer, NSValueTransformerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSValueTransformer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSValueTransformer() {}
    protected NSValueTransformer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public static NSValueTransformer getValueTransformer(NSValueTransformerName name) {
        return getValueTransformer(name.value().toString());
    }
    /*<methods>*/
    @Method(selector = "transformedValue:")
    public native NSObject getTransformedValue(NSObject value);
    @Method(selector = "reverseTransformedValue:")
    public native NSObject reverseTransformedValue(NSObject value);
    @Method(selector = "setValueTransformer:forName:")
    public static native void setValueTransformer(NSValueTransformer transformer, String name);
    @Method(selector = "valueTransformerForName:")
    public static native NSValueTransformer getValueTransformer(String name);
    @Method(selector = "valueTransformerNames")
    public static native NSArray<NSValueTransformer> getValueTransformers();
    @Method(selector = "transformedValueClass")
    public static native Class<? extends NSObject> getTransformedValueClass();
    @Method(selector = "allowsReverseTransformation")
    public static native boolean isAllowsReverseTransformation();
    /*</methods>*/
}