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
package com.bugvm.apple.security;

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
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Security")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecImportExport/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(SecImportExport.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @throws OSStatusException 
     * @since Available in iOS 2.0 and later.
     */
    public static List<SecImportItem> importPKCS12(NSData pkcs12_data, SecImportExportOptions options) throws OSStatusException {
        CFArray.CFArrayPtr ptr = new CFArray.CFArrayPtr();
        OSStatus status = importPKCS120(pkcs12_data, options, ptr);
        OSStatusException.throwIfNecessary(status);
        CFArray arr = ptr.get();
        
        if (arr == null) {
            return null;
        }
        List<SecImportItem> list = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            list.add(new SecImportItem(arr.get(i, CFDictionary.class)));
        }
        return list;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="SecPKCS12Import", optional=true)
    protected static native OSStatus importPKCS120(NSData pkcs12_data, SecImportExportOptions options, CFArray.CFArrayPtr items);
    /*</methods>*/
}
