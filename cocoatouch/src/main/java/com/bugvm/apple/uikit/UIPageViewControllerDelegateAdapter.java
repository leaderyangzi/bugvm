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

import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.annotation.NotImplemented;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPageViewControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*/implements UIPageViewControllerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("pageViewController:willTransitionToViewControllers:")
    public void willTransition(UIPageViewController pageViewController, NSArray<UIViewController> pendingViewControllers) {}
    @NotImplemented("pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:")
    public void didFinishAnimating(UIPageViewController pageViewController, boolean finished, NSArray<UIViewController> previousViewControllers, boolean completed) {}
    @NotImplemented("pageViewController:spineLocationForInterfaceOrientation:")
    public UIPageViewControllerSpineLocation getSpineLocation(UIPageViewController pageViewController, UIInterfaceOrientation orientation) { return null; }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("pageViewControllerSupportedInterfaceOrientations:")
    public UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIPageViewController pageViewController) { return null; }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("pageViewControllerPreferredInterfaceOrientationForPresentation:")
    public UIInterfaceOrientation getPreferredInterfaceOrientation(UIPageViewController pageViewController) { return null; }
    /*</methods>*/
}