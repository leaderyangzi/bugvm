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
package com.bugvm.apple.avfoundation;

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
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioNodePtr extends Ptr<AVAudioNode, AVAudioNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioNode() {}
    protected AVAudioNode(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "engine")
    public native AVAudioEngine getEngine();
    @Property(selector = "numberOfInputs")
    public native @MachineSizedUInt long getNumberOfInputs();
    @Property(selector = "numberOfOutputs")
    public native @MachineSizedUInt long getNumberOfOutputs();
    @Property(selector = "lastRenderTime")
    public native AVAudioTime getLastRenderTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "inputFormatForBus:")
    public native AVAudioFormat getInputFormatForBus(@MachineSizedUInt long bus);
    @Method(selector = "outputFormatForBus:")
    public native AVAudioFormat getOutputFormatForBus(@MachineSizedUInt long bus);
    @Method(selector = "nameForInputBus:")
    public native String getNameForInputBus(@MachineSizedUInt long bus);
    @Method(selector = "nameForOutputBus:")
    public native String getNameForOutputBus(@MachineSizedUInt long bus);
    @Method(selector = "installTapOnBus:bufferSize:format:block:")
    public native void installTapOnBus(@MachineSizedUInt long bus, int bufferSize, AVAudioFormat format, @Block VoidBlock2<AVAudioPCMBuffer, AVAudioTime> tapBlock);
    @Method(selector = "removeTapOnBus:")
    public native void removeTapOnBus(@MachineSizedUInt long bus);
    /*</methods>*/
}