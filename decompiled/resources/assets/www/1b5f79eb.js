import{aP as t,fD as e,z as i,ar as a,a as r,L as o,y as n,ah as s,aN as l,ai as c,ak as d,h as b,i as h,a8 as m,ac as p,ad as v,ab as g,a9 as u,aa as f,cO as y,b1 as $,an as x,F as k,ag as _,G as S,el as L,em as T,f as w,cG as C,g as I,ap as E,b$ as M,bx as P,c0 as V,H as z,aX as B,u as A,cI as D,cJ as F,aD as R,J as N,eL as H,eJ as O,eK as q,M as j,fE as X,aI as U,aJ as W,dK as Y,cH as Z,aV as G,b0 as J,b_ as K,au as Q,bd as tt,aS as et,bj as it,aw as at,b6 as rt,S as ot,av as nt,ch as st,bH as lt,cS as ct,m as dt,o as bt,e as ht,ct as mt,bI as pt,bU as vt,bF as gt,du as ut,cs as ft,aH as yt,af as $t,cu as xt,p as kt,bo as _t,bp as St,bq as Lt,as as Tt,at as wt,aG as Ct,bg as It,dI as Et,aT as Mt,bb as Pt,dZ as Vt,ex as zt,aM as Bt,ey as At,ep as Dt,be as Ft,dw as Rt,cU as Nt,dj as Ht,b3 as Ot,di as qt}from"./952f98a9.js";import"./51384888.js";import{cN as jt,cO as Xt,cP as Ut,bm as Wt}from"./7f3d7ca9.js";import{B as Yt}from"./4acd66de.js";import{x as Zt,G as Gt,H as Jt,a2 as Kt,eH as Qt,ex as te}from"./216055dc.js";import{B as ee}from"./5e7550b1.js";import{B as ie}from"./85e2fa69.js";import{B as ae}from"./00e9cb1f.js";import"./c0a2f832.js";import"./cae0f1de.js";const re=new a;var oe=i`:host {
  display: block;
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: auto;
  z-index: var(--bbva-notification-container-z-index, 8);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
${re.mediaRules()}`;class ne extends(r(o)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":n}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:s(),warning:s(),error:l(),success:c()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[oe,d("bbva-notification-container-shared-styles")]}render(){return b`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${h(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${h(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}const se=new a;var le=i`:host {
  --_bg-color: var(--bbva-progress-content-dark-mode-bg-color, var(--bbva-progress-content-bg-color, var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)})));
  --_spinner-size: var(--bbva-progress-content-spinner-size, 3rem);
  --_spinner-message-color: var(--bbva-progress-content-dark-mode-spinner-message-color, var(--bbva-progress-content-spinner-message-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_spinner-message-size: var(--bbva-progress-content-spinner-message-size, 0.9375rem);
  --_small-spinner-size: var(--bbva-progress-content-small-spinner-size, 2rem);
  --_login-bg-color: var(--bbva-progress-content-dark-mode-login-bg-color, var(--bbva-progress-content-login-bg-color, var(--colorsPrimaryCore, ${m(u.primaryCore)})));
  --_login-content-bg-color: var(--bbva-progress-content-dark-mode-login-content-bg-color, var(--bbva-progress-content-login-content-bg-color, var(--colorsPrimaryCoreDarkened, ${m(u.primaryCoreDarkened)})));
  --_login-content-text-color: var(--bbva-progress-content-dark-mode-login-text-color, var(--bbva-progress-content-login-text-color, var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)})));
  --_login-success-animation-duration: var(--bbva-progress-content-login-success-animation-duration, 1000ms);
  --_login-success-animation-delay: var(--bbva-progress-content-login-success-animation-delay, 0ms);
  --_content-height: calc(calc(((13 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem) + 3rem);
  --_progress-content-mask-display: var(--bbva-progress-content-dark-mode-mask-display, var(--bbva-progress-content-mask-display, initial));
  --_progress-content-no-mask-display: var(--bbva-progress-content-dark-mode-no-mask-display, var(--bbva-progress-content-no-mask-display, none));
  z-index: var(--bbva-progress-content-z-index, 10);
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  display: none;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100%;
  min-height: 3rem;
  overflow: hidden;
  font-size: var(--typographyTypeSmall, ${m(p.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${m(v.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${m(g.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${m(g.medium.fontStyle)});
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.overlay {
  visibility: hidden;
  flex: auto;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  background-color: var(--_bg-color);
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}
.overlay p {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_spinner-message-color);
  font-size: var(--_spinner-message-size);
}

:host([variant=bottom]) {
  top: auto;
  bottom: 0;
  height: auto;
  --bbva-spinner-size: var(--_small-spinner-size);
}
:host([variant=bottom]) .overlay {
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem) 0;
}

.spinner.no-mask {
  display: var(--_progress-content-no-mask-display);
}

.spinner.mask {
  display: var(--_progress-content-mask-display);
}

:host([variant=login]) .overlay {
  padding-bottom: var(--_content-height);
  background-color: var(--_login-bg-color);
  --bbva-core-spinner-bg-color: var(--_login-bg-color);
  --bbva-foundations-spinner-bg-color: var(--bbva-progress-content-dark-mode-login-bg-color);
}

:host([variant=transparent]) .spinner {
  transition: opacity 80ms linear 160ms;
  opacity: 0;
}
:host([variant=transparent]) .overlay {
  transition: visibility 0s linear 240ms, opacity 240ms linear;
  opacity: 0;
}

.content {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 100%;
  left: 0;
  transform: translateY(calc(var(--_content-height) * -1));
  background-color: var(--_login-content-bg-color);
}

.layer {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  height: 100%;
  padding: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  color: var(--_login-content-text-color);
}

.icon {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

:host([visible]) {
  display: flex;
}
:host([visible]) .overlay {
  visibility: visible;
}

:host([login-animation]) .content {
  animation-name: message;
  animation-duration: var(--bbva-progress-content-login-animation-message-duration, 1500ms);
  animation-delay: var(--bbva-progress-content-login-animation-message-delay, 0ms);
  animation-fill-mode: forwards;
}

:host([visible][variant=transparent]) .overlay {
  transition-delay: 0s;
  opacity: 0.9;
}
:host([visible][variant=transparent]) .spinner {
  opacity: 1;
}

:host([login-animation][login-successful]) .content {
  animation-duration: var(--_login-success-animation-duration);
  animation-delay: var(--_login-success-animation-delay);
  animation-fill-mode: forwards;
  animation-name: content;
}
:host([login-animation][login-successful]) .layer {
  animation-duration: var(--_login-success-animation-duration);
  animation-delay: var(--_login-success-animation-delay);
  animation-fill-mode: forwards;
  animation-name: layer;
}

@keyframes message {
  from {
    transform: translateY(0);
  }
  to {
    transform: translateY(calc(var(--_content-height) * -1));
  }
}
@keyframes content {
  to {
    transform: translateY(-100%);
  }
}
@keyframes layer {
  to {
    transform: translateY(calc(50% - var(--_content-height) / 2));
  }
}
${se.mediaRules()}`;const ce=new a;var de=i`[ambient^=dark] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreLight, ${m(u.primaryCoreLight)});
  --bbva-progress-content-mask-display: none;
  --bbva-progress-content-no-mask-display: block;
}

[ambient^=dark200] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCore, ${m(u.primaryCore)});
}

[ambient^=dark300] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)});
}

[ambient^=dark400] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDarkened, ${m(u.primaryCoreDarkened)});
}
${ce.mediaRules()}`;const be=new a;var he=i`[ambient^=light] {
  --bbva-progress-content-bg-color: initial;
  --bbva-progress-content-mask-display: initial;
  --bbva-progress-content-no-mask-display: initial;
}
${be.mediaRules()}`;const me={dark:i`
    ${y.dark}
    ${$.dark}
    ${de}
  `,light:i`
    ${y.light}
    ${$.light}
    ${he}
  `};class pe extends(r(x(o))){static get is(){return"bbva-progress-content"}static get scopedElements(){return{"bbva-icon":k,"bbva-text":_,"bbva-spinner":S}}static get properties(){return{variant:{type:String,reflect:!0},loginIcon:{type:String,attribute:"login-icon"},loginIconSize:{type:String,attribute:"login-icon-size"},loginSuccessIcon:{type:String,attribute:"login-success-icon"},loginMessageLabels:{type:Array,attribute:"login-message-labels"},loginSuccessMessageLabel:{type:String,attribute:"login-success-message-label"},loginMessageTimer:{type:Number,attribute:"login-message-timer"},loginAnimation:{type:Boolean,attribute:"login-animation",reflect:!0},loginSuccessful:{type:Boolean,attribute:"login-successful",reflect:!0},_loginMessageLabel:{type:String},spinnerMessageLabel:{type:String,attribute:"spinner-message-label"},showSpinnerMessageLabel:{type:Boolean,attribute:"show-spinner-message-label"},visible:{type:Boolean,reflect:!0}}}constructor(){super(),this.variant="full",this.loginIcon=L(),this.loginSuccessIcon=T(),this.loginIconSize="M",this.loginSuccessful=!1,this._loginMessageLabel="",this.loginMessageLabels=["bbva-progress-content-login-verifying-credentials","bbva-progress-content-login-connecting-bbva"],this.loginSuccessMessageLabel="bbva-progress-content-login-loading-products",this.loginMessageTimer=3e3,this.loginAnimation=!1,this.spinnerMessageLabel="bbva-progress-content-login-loading-message",this.showSpinnerMessageLabel=!1,this.visible=!1}get _getLoginIcon(){return this.loginSuccessful?this.loginSuccessIcon:this.loginIcon}get _loginIconSize(){const t={S:16,M:24,L:32},e=parseInt(this.loginIconSize,10);return Object.values(t).includes(e)?e:t[this.loginIconSize]||24}updated(t){super.updated&&super.updated(t),(t.has("loginSuccessful")||t.has("variant"))&&"login"===this.variant&&(this.loginSuccessful?this._setLoginSuccess():this._setLoginInProcess()),t.has("visible")&&void 0!==t.get("visible")&&this._notifyVisibleChanged()}static get styles(){return[le,me.dark,me.light,d("bbva-progress-content-shared-styles")]}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowProgressContent=this._showLoader.bind(this),this._boundHideProgressContent=this._hideLoader.bind(this),this._parentElement.addEventListener("show-loader",this._boundShowProgressContent),this._parentElement.addEventListener("hide-loader",this._boundHideProgressContent)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._parentElement.removeEventListener("show-loader",this._boundShowProgressContent),this._parentElement.removeEventListener("hide-loader",this._boundHideProgressContent)}render(){return b`
      <div class="overlay">
        <span class="sr-only" role="alert" aria-busy="true">
          <slot></slot>
        </span>
        <bbva-spinner
          id="spinner"
          class="spinner no-mask"
          ?paused="${!this.visible}"
        ></bbva-spinner>
        <bbva-spinner
          id="spinnerMask"
          class="spinner mask"
          ?paused="${!this.visible}"
          ?with-mask="${"login"!==this.variant}"
        ></bbva-spinner>
        <bbva-text
          size="S"
          ?hidden=${!this.showSpinnerMessageLabel}
          .text=${this.t(this.spinnerMessageLabel,"bbva-progress-content-login-loading-message")}
        >
        </bbva-text>
      </div>

      ${"login"===this.variant?b`
            <div class="content" @animationend="${this._onAnimationEnd}">
              <div class="layer">
                <bbva-icon
                  class="icon"
                  .icon="${this._getLoginIcon}"
                  .size="${this._loginIconSize}"
                ></bbva-icon>
                <div class="message">${this.t(this._loginMessageLabel)}</div>
              </div>
            </div>
          `:""}
    `}_onAnimationEnd(t){"content"===t.animationName&&this._fireEvent("progress-content-success-login-click")}_fireEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}_setLoginInProcess(){const[t]=this.loginMessageLabels;this._loginMessageLabel=t,this._loadingMessageInterval=setInterval((()=>{const t=this.loginMessageLabels.indexOf(this._loginMessageLabel),e=this.loginMessageLabels[t+1]||this.loginMessageLabels[0];this._loginMessageLabel=e}),this.loginMessageTimer),this._fireEvent("progress-content-start-login-click")}_setLoginSuccess(){clearInterval(this._loadingMessageInterval),this._loginMessageLabel=this.loginSuccessMessageLabel,this.loginAnimation||this._fireEvent("progress-content-success-login-click")}_notifyVisibleChanged(){this._fireEvent("progress-content-visible-changed",this.visible)}loginSuccess(){this.loginSuccessful=!0}loginReset(){this.loginSuccessful=!1}show(){this.visible=!0}showCustom({variant:t="full",showSpinnerMessageLabel:e=!1,loginAnimation:i=!1}){this.variant=t,this.showSpinnerMessageLabel=e,this.loginAnimation=i,this.show()}_showLoader(t){this.showCustom(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}hide(){this.visible=!1}_hideLoader(t){this.hide(),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}}I("colors.cool90"),I("colors.primaryCoreLightened"),I("colors.cool90"),I("colors.cool70"),I("colors.primaryCoreLightened");var ve=i`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${m(u.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${m(u.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${m(u.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${m(u.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${m(u.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${m(u.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${m(u.primarySubduedLight)}));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
  cursor: pointer;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${m(p.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;class ge extends(r(E(x(o)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":_,"bbva-icon":k,"bbva-badge-notification":M}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[ve,d("bbva-header-main-shared-styles"),P("button:focus"),$.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return b`<bbva-icon icon="${h(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return b`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const r=ge.toCamelCase(t),o=`icon${r}`,n=`accessibilityTextIcon${r}`;return b`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${h(this.t(this[n]))}"
      aria-expanded=${h(a)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return b` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${h(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return b`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(t)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:r}=this;return b`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${h(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${r}"
            ?hidden="${!r}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${t} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}I("colors.primaryCoreLightened"),I("colors.cool80"),I("colors.cool70"),I("colors.primaryCoreLightened"),I("colors.cool100"),I("colors.tertiaryType6Darkened"),I("colors.tertiaryType4Darkened"),I("colors.secondary300");const ue=z((t=>class extends(B(t)){static configurationScopedElements(){return[ne,pe,ge,A]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),b`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||D();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&F()||this.config.faqs&&R())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const r={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return b`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return b`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));customElements.define(pe.is,pe);class fe extends(N(o)){static get is(){return"bbva-local-cards-api-limits-dm"}static get properties(){return{cardLimit:{type:Array,attribute:!1}}}constructor(){super(),this.cardLimit=[]}getCardLimits(t){if(Object.keys(this.cardLimit).length)return;const e={"card-id":t};this._generateGetService(this._getService("get",{},e),{customEvent:"card-limits-api-dm-fetch",errorFireEventHandler:"card-limits-api-dm-fetch-error"},this._responseMapping,e.fields)}putCardLimits(t={},e={}){this._generateGetService(this._getService("put",t,e),{customEvent:"card-limits-api-dm-update",errorFireEventHandler:"card-limits-api-dm-update-error"}),this.resetCardLimit()}resetCardLimit(){this.cardLimit=[]}_getService(t,e={},i={}){const a="get"===t?"CardLimits":"CardLimitsLimit",r=this._getServiceParams(i,e);return this._getServicePath(`${t}${a}`,this._getBgadp(r))}_getBgadp(t){return{getCardLimitsV0:()=>new jt(t),putCardLimitsLimitV0:()=>new Xt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}N(o);var ye=i`@charset "UTF-8";
/**
 * Importa los estilos base de BBVA Foundations.
 */
/**
 * Establece el estilo base para el componente personalizado.
 * El componente se muestra como un bloque y utiliza el modelo de caja de borde.
 */
:host {
  display: block;
  box-sizing: border-box;
}

/**
 * Oculta el componente personalizado o cualquier elemento cuando tienen el atributo 'hidden'.
 */
:host([hidden]), [hidden] {
  display: none !important;
}

/**
 * Aplica el modelo de caja de borde a todos los elementos y pseudo-elementos.
 */
*, *:before, *:after {
  box-sizing: inherit;
}

/**
 * Establece el padding del contenedor de transición a 0px.
 * --bbva-transition-container-padding es una variable CSS personalizada.
 */
[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding:0px ;
}
`;const $e=new a;var xe=i`:host {
  display: flex;
  box-sizing: border-box;
  position: relative;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
  color: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  font-size: var(--typographyTypeSmall, ${m(p.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${m(v.typeSmall)});
  --_list-bullet-icon-color: var(--bbva-list-bullet-icon-dark-mode-color, var(--bbva-list-bullet-icon-color, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_list-bullet-skeleton-quote-color: var(--bbva-list-bullet-quote-dark-mode-color, var(--bbva-list-bullet-quote-color, var(--colorsSecondary200, ${m(u.secondary200)})));
  --_list-bullet-skeleton-quote-bg: var(--bbva-list-bullet-quote-bg-dark-mode-color, var(--bbva-list-bullet-quote-bg, transparent));
  --_list-bullet-skeleton-animated-layer-bg: var(--bbva-list-bullet-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-list-bullet-skeleton-animated-layer-bg, var(--ambientsLight, ${m(U.light)})));
  --_bbva-list-bullet-dark-mode-color: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_bbva-list-bullet-dark-mode-color-soft-highlight: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary500, ${m(u.secondary500)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-text] {
  color: var(--_bbva-list-bullet-dark-mode-color);
  --bbva-text-highlight-color: var(--bbva-list-bullet-color, token("foundations.colors.secondary600"));
}

:host([soft-highlight]) [data-tag-name=bbva-text] {
  color: var(--_bbva-list-bullet-dark-mode-color-soft-highlight);
  --bbva-text-highlight-color: var(--bbva-list-bullet-color, token("foundations.colors.secondary500"));
}

[data-tag-name=bbva-icon] {
  color: var(--_list-bullet-icon-color);
  margin-top: calc(((0.375 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  flex-shrink: 0;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 2rem;
  background-image: linear-gradient(var(--_list-bullet-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-bullet-skeleton-quote-color) 50%);
  background-color: var(--_list-bullet-skeleton-quote-bg);
  background-size: 16px 16px, calc((50% * 2) + (16px/ 2)) 16px;
  background-position: 16px 8px, 40px 8px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  inset: 0.5rem 0.9375rem;
  height: 1rem;
  background: var(--_list-bullet-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${$e.mediaRules()}`;const ke=new a;var _e=i`[ambient^=light] {
  --bbva-list-bullet-color: initial;
  --bbva-list-bullet-icon-color: initial;
  --bbva-list-bullet-quote-color: initial;
  --bbva-list-bullet-quote-bg: initial;
  --bbva-list-bullet-skeleton-animated-layer-bg: initial;
}
${ke.mediaRules()}`;const Se=new a;var Le=i`[ambient^=dark] {
  --bbva-list-bullet-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-list-bullet-icon-color: var(--colorsPrimaryVariant, ${m(u.primaryVariant)});
  --bbva-list-bullet-quote-color: var(--colorsPrimaryMedium, ${m(u.primaryMedium)});
  --bbva-list-bullet-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${m(u.primaryCore)});
}
${Se.mediaRules()}`;const Te={light:i`
    ${_e}
  `,dark:i`
    ${Le}
  `};class we extends(r(W(o))){static get is(){return"bbva-list-bullet"}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},softHighlight:{type:Boolean,reflect:!0,attribute:"soft-highlight"}}}static get scopedElements(){return{"bbva-icon":k,"bbva-text":_}}constructor(){super(),this.icon=Y(),this.iconSize=16,this.text="",this.loading=!1}static get styles(){return[super.styles,xe,Te.light,Te.dark,d("bbva-list-bullet-shared-styles")]}render(){return b`${this.loading?b` <div class="skeleton"></div> `:b`
          <bbva-icon .icon=${this.icon} .size=${this.iconSize}></bbva-icon>
          <slot>
            <bbva-text .text=${this.text} unset size="S"></bbva-text>
          </slot>
        `}`}}customElements.define(we.is,we);var Ce=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Ie extends(r(x(o))){static get is(){return"card-operative-limits-modal-info"}static get scopedElements(){const t=[Z,Zt,we];return Ie.scopedElementsFromClasses(t)}static get properties(){return{limitsModalInfo:{type:Boolean},arrayInfoBullets:{type:Array},_arrayInfoYoungstersView:{type:Array},flagParentsView:{type:Boolean,state:!0}}}constructor(){super(),this.limitsModalInfo=!1,this.flagParentsView=!1,this.arrayInfoBullets=["card-operative-limits-text-modal-info-bullet-1","card-operative-limits-text-modal-info-bullet-2","card-operative-limits-text-modal-info-bullet-3"],this._arrayInfoYoungstersView=["card-operative-limits-text-modal-info-bullet-youngsters-1","card-operative-limits-text-modal-info-bullet-youngsters-2","card-operative-limits-text-modal-info-bullet-3"]}static get styles(){return[Ce,d("card-operative-limits-modal-info-shared-styles")]}updated(t){if(t.has("limitsModalInfo")&&!0===this.limitsModalInfo){this.shadowRoot.querySelector("#card-operative-limits-modal-info").open()}}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_closeButton(){this.limitsModalInfo=!1,this._fireEvent("close-button-click-modal-info")}_changedLocalesView(){const t=this.flagParentsView?this.arrayInfoBullets:this._arrayInfoYoungstersView;return b`${t.map((t=>b`<bbva-list-bullet text="${t}" id="index"></bbva-list-bullet>`))}`}render(){return b`
            <bbva-help-modal
                id="card-operative-limits-modal-info"
                full-height
                fixed-footer
                header-type="modal"
                hidde-content-padding-top
                header-text="${this.t("card-operative-limits-header-modal-info")}"
                button-text="${this.t("card-operative-limits-header-modal-info-button")}"
                @help-modal-footer-button-click="${this._closeButton}"
                @header-main-icon-right-primary-click="${this._closeButton}"
            >
            <div slot="slot-title">
                <bbva-type-icon icon="${R()}" size="24" icon-color="#043263"></bbva-type-icon>
            </div>
            <div slot="slot-content">
                ${this._changedLocalesView()}
            </div>
            </bbva-help-modal>
        `}}var Ee=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Me extends(r(x(o))){static get is(){return"card-operative-limits-modal-limit-purchases"}static get scopedElements(){const t=[Z,Zt,we];return Me.scopedElementsFromClasses(t)}static get properties(){return{limitsModalPurchases:{type:Boolean},arrayInfoBullets:{type:Array},textLimits:{type:String}}}constructor(){super(),this.limitsModalPurchases=!1,this.textLimits="",this.arrayInfoBullets=[]}static get styles(){return[Ee,d("card-operative-limits-modal-info-shared-styles")]}updated(t){t.has("limitsModalPurchases")&&this.handleLimitsModalPurchases(),t.has("textLimits")&&this.updateTextLimits()}handleLimitsModalPurchases(){if(!0===this.limitsModalPurchases){this.shadowRoot.querySelector("#card-operative-limits-modal-limits-purchases").open()}}updateTextLimits(){this.textLimits===this.t("card-operative-limits-header-optionCa-edit")&&(this.textLimits=this.t("card-operative-limits-headerCa-edit"),this.arrayInfoBullets=["card-operative-limits-modal-info-limit-purchases-1","card-operative-limits-modal-info-limit-purchases-2","card-operative-limits-modal-info-limit-purchases-3","card-operative-limits-modal-info-limit-purchases-4","card-operative-limits-modal-info-limit-purchases-5","card-operative-limits-modal-info-limit-purchases-6"]),this.textLimits===this.t("card-operative-limits-header-edit")&&(this.arrayInfoBullets=["card-operative-limits-modal-info-limit-purchases-shopping-1","card-operative-limits-modal-info-limit-purchases-shopping-2","card-operative-limits-modal-info-limit-purchases-shopping-3","card-operative-limits-modal-info-limit-purchases-shopping-4"])}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_closeButton(){this._fireEvent("close-button-click-modal-info-purchases")}render(){return b`
            <bbva-help-modal
                id="card-operative-limits-modal-limits-purchases"
                full-height
                fixed-footer
                header-type="modal"
                hidde-content-padding-top
                header-text="${this.textLimits}"
                button-text="${this.t("card-operative-limits-header-modal-info-button")}"
                @help-modal-footer-button-click="${this._closeButton}"
                @header-main-icon-right-primary-click="${this._closeButton}"
            >
            <div slot="slot-title">
                <bbva-type-icon icon="${R()}" size="24" icon-color="#043263"></bbva-type-icon>
            </div>
            <div slot="slot-content">
                ${this.arrayInfoBullets.map((t=>b`<bbva-list-bullet text="${t}"></bbva-list-bullet>`))}
            </div>
            </bbva-help-modal>
        `}}var Pe=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Ve extends(r(x(o))){static get is(){return"card-operative-limits-modal-info-header"}static get scopedElements(){const t=[Z,Zt,Gt,we];return Ve.scopedElementsFromClasses(t)}static get properties(){return{limitsModalInfoHeader:{type:Boolean},flagParentsView:{type:Boolean,state:!0}}}constructor(){super(),this.limitsModalInfoHeader=!1,this.flagParentsView=!1}static get styles(){return[Pe,d("card-operative-limits-modal-info-header-shared-styles")]}updated(t){if(t.has("limitsModalInfoHeader")&&!0===this.limitsModalInfoHeader){this.shadowRoot.querySelector("#card-operative-limits-modal-info-header").open()}}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_closeButton(){this.limitsModalInfoHeader=!1,this._fireEvent("close-button-click-modal-info-header")}_renderByUserType(){const t=this.flagParentsView?["card-operative-limits-header-modal-info-1","card-operative-limits-header-modal-info-2","card-operative-limits-header-modal-info-3","card-operative-limits-header-modal-info-4","card-operative-limits-header-modal-info-5","card-operative-limits-header-modal-info-6","card-operative-limits-header-modal-info-7","card-operative-limits-header-modal-info-8"]:["card-operative-limits-header-modal-info-youngsters-1","card-operative-limits-header-modal-info-youngsters-2","card-operative-limits-header-modal-info-3","card-operative-limits-header-modal-info-youngsters-4","card-operative-limits-header-modal-info-youngsters-5","card-operative-limits-header-modal-info-youngsters-6","card-operative-limits-header-modal-info-7","card-operative-limits-header-modal-info-8"];return this._generateTextElements(t)}_generateTextElements(t){return t.map(((t,e)=>b`
      <bbva-type-text
        font-weight="${e%2==0?"500":"normal"}"
        alignment="center"
        text="${this.t(t)}"
      ></bbva-type-text>
    `))}render(){return b`
            <bbva-help-modal
                id="card-operative-limits-modal-info-header"
                full-height
                fixed-footer
                header-type="modal"
                hidde-content-padding-top
                header-text="${this.t("card-operative-limits-header")}"
                button-text="${this.t("card-operative-limits-header-modal-info-button")}"
                @help-modal-footer-button-click="${this._closeButton}"
                @header-main-icon-right-primary-click="${this._closeButton}"
            >
            <div slot="slot-title">
                <bbva-type-icon icon="${R()}" size="24" icon-color="#043263"></bbva-type-icon>
            </div>
            <div slot="slot-content">
                ${this._renderByUserType()}
            </div>
            </bbva-help-modal>
        `}}var ze=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Be extends(r(x(o))){static get is(){return"card-operative-limits-modal-error"}static get scopedElements(){const t=[Z,Zt,Gt];return Be.scopedElementsFromClasses(t)}static get properties(){return{limitsModalError:{type:Boolean}}}constructor(){super(),this.limitsModalError=!1}static get styles(){return[ze,d("card-operative-limits-modal-error-shared-styles")]}updated(t){if(t.has("limitsModalError")&&!0===this.limitsModalError){this.shadowRoot.querySelector("#card-operative-limits-modal-error").open()}}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_retryButton(){this.limitsModalError=!1,this._fireEvent("close-button-click-modal-error")}_closeButton(){this.limitsModalError=!1,this._fireEvent("reset-event"),this._fireEvent("parental-control-card-limits-go-back")}render(){return b`
            <bbva-help-modal
                id="card-operative-limits-modal-error"
                fixed-footer
                full-height
                header-type="modal"
                header-text="${this.t("card-operative-limits-header")}"
                button-text="${this.t("card-operative-limits-modal-button-error")}"
                link-text="${this.t("card-operative-limits-modal-link-error")}"
                @help-modal-footer-button-click="${this._retryButton}"
                @help-modal-footer-link-click="${this._closeButton}"
            >
            <div slot="slot-title">
                <bbva-type-icon icon="${l()}" size="32" icon-color="#B92A45"></bbva-type-icon>
            </div>
            <div slot="slot-content">
                <bbva-type-text font-weight="500" alignment="center" text="${this.t("card-operative-limits-modal-error-title")}"></bbva-type-text>
                <bbva-type-text text-color="#666666" alignment="center" text="${this.t("card-operative-limits-modal-error-detail")}"></bbva-type-text>
            </div>
            </bbva-help-modal>
        `}}var Ae=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}
.grid{
  display:grid;
  grid-template-columns: 80% 20%;
  padding:16px; 
}
.grid .col{
  align-items: start;
  text-align: left;
}
*, *:before, *:after {
}
`;class De extends(r(x(o))){static get is(){return"card-operative-limits-toast-success"}static get scopedElements(){const t=[n];return De.scopedElementsFromClasses(t)}static get properties(){return{openModalSuccess:{type:Boolean},amountSave:{type:Number},amount:{type:String},currency:{type:String}}}constructor(){super(),this.openModalSuccess=!1,this.amountSave=0,this.amount="",this.currency="MXN"}static get styles(){return[Ae,d("card-operative-limits-modal-success-shared-styles")]}updated(t){const e=this.shadowRoot.getElementById("toast-modal");if(t.has("openModalSuccess")&&this.openModalSuccess&&e.setAttribute("show",!0),t.has("openModalSuccess")&&!this.openModalSuccess&&e.removeAttribute("show"),t.has("amountSave")&&this.amountSave>0){const t=parseInt(this.amountSave,10);this.amount=this._formatNumber(t)}}_formatNumber(t){return new Intl.NumberFormat(this.currency,{style:"currency",currency:this.currency}).format(t)}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}render(){return b`
            <bbva-notification-toast id="toast-modal" pusher type="success">
                <p>${this.t("card-operative-limits-modal-success-info")} ${this.amount}</p>
            </bbva-notification-toast>
        `}}customElements.define(ge.is,ge);const Fe=new a;var Re=i`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${Fe.mediaRules()}`;const Ne=new a;var He=i`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)});
}
${Ne.mediaRules()}`;const Oe={dark:i`
    ${$.dark}
    ${He}
  `,light:i`
    ${$.light}
    ${Re}
  `},qe=new a;var je=i`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${m(u.secondary200)})));
  --skeleton-quote-bg: var(--bbva-date-dark-mode-skeleton-bg, var(--bbva-date-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((50px * 2) + (15px/ 2)) 15px;
  background-position: 0 0;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  white-space: nowrap;
}
${qe.mediaRules()}`;class Xe extends(r(x(W(o)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":_}}static get properties(){return{date:{type:Date,converter:t=>new Date(t)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,je,d("bbva-date-shared-styles"),Oe.light,Oe.dark]}updated(t){var e,i;super.updated&&super.updated(t),0===(null===(e=this.dateRange)||void 0===e?void 0:e.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(i=this.dateRange)||void 0===i?void 0:i.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var t;return(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(t){const e=this.utc?{...this.options,timeZone:"UTC"}:this.options,i=e.day||e.month||e.year;return e.hour&&e.minute&&!i?t.toLocaleTimeString(this.locale,e).concat(` ${this.clockSuffix}`):t.toLocaleDateString(this.locale,e)}_fromToDateFormat(t){return[new Date(t[0]),new Date(t[1])].map(((t,e)=>t.toLocaleDateString(this.locale,this.options).concat(0===e?" - ":"")))}_fromToDateFormatA11y(t){const e=new Date(t[0]),i=new Date(t[1]),a={...this.options};return a.month="long",[e,i].map(((t,e)=>t.toLocaleDateString(this.locale,a).concat(0===e?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&b` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||G}get _tplDateRange(){var t;return this.isValidRange&&(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&b`
          <bbva-text
            unset
            text="${this._fromToDateFormat(this.dateRange)}"
            font-weight="500"
            font-style="italic"
            size="S"
            aria-hidden="true"
          >
          </bbva-text>
          <span data-id="sr-only" class="sr-only"
            >${this._fromToDateFormatA11y(this.dateRange)}</span
          >
        `||G}render(){return b` ${this._tplDate} ${this._tplDateRange} `}}I("colors.primaryCoreLightened"),I("colors.cool50");const Ue=new a;var We=i`[ambient^=light] {
  --bbva-header-category-color: initial;
  --bbva-header-category-help-color: initial;
  --bbva-header-category-skeleton-color: initial;
  --bbva-header-category-heading-color: initial;
  --bbva-header-category-amount-date-color: initial;
  --bbva-header-category-amount-color: initial;
  --bbva-header-category-skeleton-animated-layer-bg: initial;
  --bbva-header-category-card-title-color: initial;
  --bbva-header-category-action-icon-color: initial;
}
${Ue.mediaRules()}`;const Ye=new a;var Ze=i`[ambient^=dark] {
  --bbva-header-category-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-header-category-skeleton-color: var(--colorsPrimaryMedium, ${m(u.primaryMedium)});
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-header-category-amount-date-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-header-category-amount-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-header-category-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${m(u.primaryCoreDarkened)});
  --bbva-header-category-card-title-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-header-category-help-color: var(--colorsPrimarySubdued, ${m(u.primarySubdued)});
  --bbva-header-category-action-icon-color: var(--colorsPrimarySubdued, ${m(u.primarySubdued)});
}
${Ye.mediaRules()}`;const Ge={dark:i`
    ${J.dark}
    ${K.dark}
    ${Q.dark}
    ${tt.dark}
    ${$.dark}
    ${Ze}
  `,light:i`
    ${J.light}
    ${K.light}
    ${Q.light}
    ${tt.light}
    ${$.light}
    ${We}
  `},Je=new a;var Ke=i`:host {
  display: flex;
  box-sizing: border-box;
  background-color: var(--bbva-header-category-bg-color, none);
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
  position: relative;
  flex-wrap: wrap;
  color: var(--bbva-header-category-dark-mode-color, var(--bbva-header-category-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  font-weight: var(--bbva-header-category-font-weight, var(--fontFacePrimaryMediumFontWeight, ${m(g.medium.fontWeight)}));
  font-style: var(--bbva-header-category-font-style, var(--fontFacePrimaryMediumFontStyle, ${m(g.medium.fontStyle)}));
  font-size: var(--bbva-header-category-font-size, var(--typographyTypeSmall, ${m(p.typeSmall)}));
  line-height: var(--bbva-header-category-line-height, var(--lineHeightTypeSmall, ${m(v.typeSmall)}));
  --_header-category-heading-color: var(--bbva-header-category-heading-dark-mode-color, var(--bbva-header-category-heading-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_header-category-amount-color: var(--bbva-header-category-amount-dark-mode-color, var(--bbva-header-category-amount-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --_header-category-amount-date-color: var(--bbva-header-category-amount-date-dark-mode-color, var(--bbva-header-category-amount-date-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_header-category-help-color: var(--bbva-header-category-help-dark-mode-color, var(--bbva-header-category-help-color, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_header-category-card-title-color: var(--bbva-header-category-card-title-color, var(--colorsSecondary500, ${m(u.secondary500)}));
  --_header-category-action-bg-color: var(--bbva-header-category-action-bg-color, var(--colorsSecondary100, ${m(u.secondary100)}));
  --_header-category-action-heading-color: var(--bbva-header-category-action-heading-color, var(--colorsSecondary600, ${m(u.secondary600)}));
  --_header-category-action-amount-color: var(--bbva-header-category-action-amount-color, var(--colorsSecondary500, ${m(u.secondary500)}));
  --_header-category-action-icon-color: var(--bbva-header-category-action-icon-dark-mode-color, var(--bbva-header-category-action-icon-color, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_header-category-action-help-color: var(--bbva-header-category-action-help-dark-mode-color, var(--bbva-header-category-action-help-color, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_header-category-link-max-width: var(--bbva-header-category-link-max-width, 50%);
  /* Skeleton */
  --_skeleton-color: var(--bbva-header-category-skeleton-dark-mode-color, var(--bbva-header-category-skeleton-color, var(--colorsSecondary200, ${m(u.secondary200)})));
  --skeleton-quote-color: var(--bbva-header-category-skeleton-dark-mode-color, var(--bbva-header-category-skeleton-color, var(--colorsSecondary200, ${m(u.secondary200)})));
  --skeleton-quote-bg: var(--bbva-header-category-skeleton-dark-mode-bg-color, var(--bbva-header-category-skeleton-bg, transparent));
  --_bbva-header-category-skeleton-animated-layer-bg: var(--bbva-header-category-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-header-category-skeleton-animated-layer-bg, var(--ambientsLight, ${m(U.light)})));
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-core-heading] {
  color: var(--_header-category-heading-color);
}

[data-tag-name=bbva-amount] {
  font-weight: var(--bbva-header-category-amount-font-weight, var(--fontFacePrimaryMediumFontWeight, ${m(g.medium.fontWeight)}));
  color: var(--_header-category-amount-color);
}
:host([variant=date]) [data-tag-name=bbva-amount] {
  font-weight: var(--bbva-header-category-amount-font-weight, var(--fontFacePrimaryBookFontWeight, ${m(g.book.fontWeight)}));
  color: var(--_header-category-amount-date-color);
}

.header-category {
  display: flex;
  position: relative;
  width: 100%;
  justify-content: space-between;
}

.title-container {
  display: flex;
  flex: 1 1 auto;
  overflow: hidden;
  opacity: 1;
}
.title-container [data-tag-name=bbva-core-heading],
.title-container [data-tag-name=bbva-date] {
  overflow: hidden;
  flex: 0 1 auto;
}
.title-container [data-tag-name=bbva-core-heading] {
  text-transform: uppercase;
}
.title-container .link {
  fill: var(--_header-category-help-color);
  color: var(--_header-category-help-color);
  flex: 0 0 auto;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

.options-right {
  align-items: baseline;
  opacity: 1;
  max-height: var(--bbva-header-category-line-height, var(--lineHeightTypeSmall, ${m(v.typeSmall)}));
  flex-wrap: nowrap;
  flex: 0 1 auto;
  justify-content: flex-end;
  display: flex;
  max-width: var(--_header-category-link-max-width);
}
.options-right .link {
  display: flex;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
.options-right .icon {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_header-category-action-icon-color);
  fill: var(--_header-category-action-icon-color);
}
.options-right [data-tag-name=bbva-badge-notification] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(.fixed) {
  height: var(--bbva-header-category-height, 3.5rem);
  align-items: center;
}

:host([variant=product]) {
  max-height: 2rem;
  font-size: var(--bbva-header-category-card-font-size, var(--typographyTypeXSmall, ${m(p.typeXSmall)}));
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 14) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 14) * 1em) 0;
}
:host([variant=product]) .link {
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
:host([variant=product]) [data-tag-name=bbva-text] {
  color: var(--_header-category-amount-color);
}
:host([variant=product]) [data-tag-name=bbva-core-heading] {
  color: var(--_header-category-amount-color);
}

:host([variant=date]) {
  min-height: 1.5rem;
  line-height: normal;
  overflow: hidden;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
}
:host([variant=date]) [data-tag-name=bbva-core-heading] {
  text-transform: initial;
  font-style: var(--bbva-header-category-date-font-style, var(--fontFacePrimaryMediumItalicFontStyle, ${m(g.mediumItalic.fontStyle)}));
  font-weight: var(--bbva-header-category-date-font-weight, var(--fontFacePrimaryMediumItalicFontWeight, ${m(g.mediumItalic.fontWeight)}));
}

:host([variant=action]) {
  background-color: var(--_header-category-action-bg-color);
}
:host([variant=action]) [data-tag-name=bbva-core-heading] {
  color: var(--_header-category-action-heading-color);
}
:host([variant=action]) [data-tag-name=bbva-amount] {
  color: var(--_header-category-action-amount-color);
}
:host([variant=action]) .header .link {
  color: var(--_header-category-action-help-color);
}
:host([variant=action])::after {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  display: flex;
  flex-flow: column wrap;
  background-repeat: no-repeat;
  opacity: 1;
  height: 2.5rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((160px * 2) + (18px/ 2)) 18px, calc((80px * 2) + (18px/ 2)) 18px;
  background-position: 16px 12px, calc(100% - 16px) 12px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 2.5rem;
  background: var(--_bbva-header-category-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

:host([loading][variant=product]) {
  height: 2rem;
}

:host([loading][variant=longamount]) {
  height: 4.375rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((160px * 2) + (18px/ 2)) 18px, calc((80px * 2) + (18px/ 2)) 18px, calc((128px * 2) + (18px/ 2)) 18px;
  background-position: 16px 12px, calc(100% - 16px) 12px, 16px 40px;
}
:host([loading][variant=longamount]) .skeleton {
  height: 4.375rem;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.badge-variability {
  display: flex;
}
.badge-variability [data-tag-name=bbva-badge-variability] {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
}

:host([variant=card]),
:host([variant=longamount]) {
  align-items: flex-end;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 14) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 14) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 14) * 1em);
  font-size: var(--bbva-header-category-card-font-size, var(--typographyTypeXSmall, ${m(p.typeXSmall)}));
  line-height: var(--bbva-header-category-card-line-height, var(--lineHeightTypeSmall, ${m(v.typeSmall)}));
  font-weight: var(--bbva-header-category-card-font-weight, var(--fontFacePrimaryMediumFontWeight, ${m(g.medium.fontWeight)}));
  font-style: var(--bbva-header-category-card-font-style, var(--fontFacePrimaryMediumFontStyle, ${m(g.medium.fontStyle)}));
}
:host([variant=card]) [data-tag-name=bbva-core-heading],
:host([variant=longamount]) [data-tag-name=bbva-core-heading] {
  overflow: hidden;
  color: var(--_header-category-card-title-color);
}
:host([variant=card]) .secondary-header,
:host([variant=longamount]) .secondary-header {
  width: 100%;
}

:host([amount][variant=product]) [data-tag-name=bbva-core-heading] {
  color: var(--_header-category-amount-color);
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${Je.mediaRules()}`;class Qe extends(r(et(x(W(o))))){static get is(){return"bbva-header-category"}static get scopedElements(){return{"bbva-core-heading":it,"bbva-amount":at,"bbva-badge-notification":M,"bbva-link":rt,"bbva-badge-variability":ot,"bbva-icon":k,"bbva-date":Xe,"bbva-text":_}}static get properties(){return{accessibilityTextHelp:{type:String,attribute:"accessibility-text-help"},headingLevel:{type:Number,attribute:"heading-level"},text:{type:String},accessibleText:{type:String,attribute:"accessible-text"},optionText:{type:String,attribute:"option-text"},optionLink:{type:String,attribute:"option-link"},linkHref:{type:String,attribute:"link-href"},optionIcon:{type:String,attribute:"option-icon"},hrefIcon:{type:String,attribute:"href-icon"},optionIconAccesibilityText:{type:String,attribute:"option-icon-accesibility-text"},optionIconAccessibilityText:{type:String,attribute:"option-icon-accessibility-text"},iconHelp:{type:String,attribute:"icon-help"},iconHelpSize:{type:String,attribute:"icon-help-size"},hasHelp:{type:Boolean,attribute:"has-help"},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},notificationType:{type:String,attribute:"notification-type"},notificationAccessibilityText:{type:String,attribute:"notification-accessibility-text"},iconAccessibilityText:{type:String,attribute:"icon-accessibility-text"},notifications:{type:Number},loading:{type:Boolean,reflect:!0},variant:{type:String,reflect:!0},notificationsVariant:{type:String,reflect:!0,attribute:"notifications-variant"},linkAccesibilityText:{type:String,attribute:"link-accesibility-text"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"},status:{type:String},color:{type:String},showValueZero:{type:Boolean,attribute:"show-value-zero"},date:{type:String},dateRange:{type:Array,attribute:"date-range"},options:{type:Object},locale:{type:String},enableInteractivity:{type:Boolean,attribute:"enable-interactivity"},hasLinkEllipsis:{type:Boolean,attribute:"has-link-ellipsis"},discreetMode:{type:Boolean,attribute:"discreet-mode"}}}constructor(){super(),this.loading=!1,this.accessibilityTextHelp="bbva-header-category-accessibility-text-help",this.iconAccessibilityText="bbva-header-category-icon-accessibility-text",this.headingLevel=3,this.iconHelp=R(),this.iconHelpSize=24,this.hasHelp=!1,this.color="",this.showValueZero=!1,this.date="",this.options={day:"2-digit",month:"long",year:"numeric"},this.enableInteractivity=!1,this.hasLinkEllipsis=!1,this.discreetMode=!1}_amountText(){return b`
      ${this.status&&"date"===this.variant?b`
            <bbva-badge-variability
              disabled-tabindex
              .status=${this.status}
              .color=${this.color}
            ></bbva-badge-variability>
          `:""}
      <bbva-amount
        ?mask="${this.discreetMode}"
        ?hidden="${!this.amount&&!this.showValueZero}"
        .amount="${this.amount}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
        variant="${"date"===this.variant?"xl":"s"}"
      ></bbva-amount>
    `}get _showLink(){return!(this.notifications||this.optionLink||this.optionIcon)}static get styles(){return[super.styles,d("bbva-global-dividers-shared-styles"),Ke,d("bbva-header-category-shared-styles"),Ge.dark,Ge.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback()}updated(t){super.updated(t),t.has("loading")&&(this.loading?this.setAttribute("tabindex","-1"):this.removeAttribute("tabindex")),t.has("disabled")&&this.disabled&&this.setAttribute("tabindex","-1"),t.has("optionIconAccesibilityText")&&(this.optionIconAccessibilityText=this.optionIconAccesibilityText),t.has("linkAccesibilityText")&&(this.linkAccessibilityText=this.linkAccesibilityText)}get _ambient(){return"action"===this.variant?"light":void 0}get _renderTitle(){return this.date||this.dateRange?b`
        <bbva-core-heading level="${this.headingLevel}">
          <bbva-date
            date="${this.date}"
            .dateRange="${this.dateRange}"
            .locale="${this.locale}"
            .options="${this.options}"
          ></bbva-date>
        </bbva-core-heading>
      `:b`
      <bbva-core-heading level="${this.headingLevel}">
        ${this.accessibleText?this._renderCoreHeadingAccessibleText:this._renderCoreHeadingText}
      </bbva-core-heading>
      <bbva-icon
        @click="${this._helpClickHandler}"
        class="link"
        ?hidden="${!this.hasHelp}"
        role="button"
        aria-label="${this.t(this.accessibilityTextHelp)}"
        icon=${this.iconHelp}
        size=${this.iconHelpSize}
      ></bbva-icon>
    `}get _renderCoreHeadingText(){return b`
      <bbva-text
        ellipsis
        lines="${"card"===this.variant||"longamount"===this.variant||"product"===this.variant?"1":"2"}"
        ?enable-interactivity="${this.enableInteractivity}"
        tag="span"
        size="${"product"===this.variant?"XS":"S"}"
        font-weight="500"
        font-style="${h("date"===this.variant?"italic":"")}"
        text="${this.text}"
      ></bbva-text>
    `}get _renderCoreHeadingAccessibleText(){return b` <span aria-hidden="true">${this.t(this.text)}</span>
      <span class="sr-only">${this.accessibleText}</span>`}get _renderBadgeNotifications(){return this.notifications?b` <bbva-badge-notification
          class="${h(this.notificationType)}"
          ?hidden="${!this.notifications}"
          .accessibilityText="${this.notificationAccessibilityText}"
          .text="${this.notifications}"
          variant="alert"
        ></bbva-badge-notification>`:""}get _renderRightOptions(){const t="default"===this.variant||"product"===this.variant;return!this.amount||!this.optionLink||t||"card"!==this.variant&&"longamount"!==this.variant?!this.amount&&!this.showValueZero||t||this.optionLink&&("card"===this.variant||"longamount"===this.variant)?this.amount||t||!this.notifications?this.amount||this.notifications||t||!this.optionLink&&!this.optionIcon?"default"===this.variant?b`
        ${this.optionLink?b`
              <bbva-link
                class="link"
                @click="${this._linkClickHandler}"
                href="${h(this.linkHref)}"
                ?hidden="${this._showLink}"
                aria-label="${h(this.linkAccessibilityText)}"
                role="link"
                ?ellipsis="${this.hasLinkEllipsis}"
              >
                <span>${this.t(this.optionLink)}</span>
              </bbva-link>
            `:""}
        ${this.optionText?b`
              <bbva-text
                ?enable-interactivity="${this.enableInteractivity}"
                tag="span"
                size="S"
                text="${this.optionText}"
              ></bbva-text>
            `:""}
        ${this.amount?b`
              <bbva-amount
                ?mask="${this.discreetMode}"
                ?hidden="${!this.amount&&!this.showValueZero}"
                .amount="${this.amount}"
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
                .language="${this.language}"
                variant="${"date"===this.variant?"xl":"s"}"
              ></bbva-amount>
            `:""}
        ${this.notifications?b`
              <bbva-badge-notification
                class="${h(this.notificationType)}"
                ?hidden="${!this.notifications}"
                .accessibilityText="${this.notificationAccessibilityText}"
                .text="${this.notifications}"
                variant="alert"
              ></bbva-badge-notification>
            `:""}
        ${this.optionIcon?b`
              <bbva-link
                icon=${this.optionIcon}
                icon-size=${this.iconHelpSize}
                class="icon"
                href=${h(this.hrefIcon)}
                ?hidden="${!this.optionIcon}"
                aria-label="${this.t(this.iconAccessibilityText)}"
              >
              </bbva-link>
            `:""}
      `:"product"===this.variant?b`
        ${this.amount?b`
              <bbva-amount
                ?mask="${this.discreetMode}"
                ?hidden="${!this.amount&&!this.showValueZero}"
                .amount="${this.amount}"
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
                .language="${this.language}"
                variant="${"date"===this.variant?"xl":"s"}"
              ></bbva-amount>
            `:""}
        ${this.optionLink?b`
              <bbva-link
                class="link"
                @click="${this._linkClickHandler}"
                href="${h(this.linkHref)}"
                ?hidden="${this._showLink}"
                aria-label="${h(this.linkAccessibilityText)}"
                role="link"
                ?ellipsis="${this.hasLinkEllipsis}"
              >
                <span>${this.t(this.optionLink)}</span>
              </bbva-link>
            `:""}
        ${this.optionText?b` <bbva-text size="XS" tag="span" text="${this.optionText}"></bbva-text> `:""}
      `:G:b`
        <bbva-link
          class="link"
          @click="${this._linkClickHandler}"
          href="${h(this.linkHref)}"
          ?hidden="${this._showLink}"
          aria-label="${h(this.linkAccessibilityText)}"
          role="link"
          ?ellipsis="${this.hasLinkEllipsis}"
        >
          ${this.optionLink?b` <span>${this.t(this.optionLink)}</span> `:b` <span class="sr-only">${this.optionIconAccessibilityText}</span>
                <bbva-link
                  icon=${this.optionIcon}
                  icon-size=${this.iconHelpSize}
                  class="icon"
                  href=${h(this.hrefIcon)}
                  ?hidden="${!this.optionIcon}"
                  aria-label="${this.t(this.iconAccessibilityText)}"
                >
                </bbva-link>`}
        </bbva-link>
      `:b`
        <bbva-badge-notification
          class="${h(this.notificationType)}"
          ?hidden="${!this.notifications}"
          .accessibilityText="${this.notificationAccessibilityText}"
          .text="${this.notifications}"
          variant="alert"
        ></bbva-badge-notification>
      `:b` ${this._amountText()} `:b`
        <bbva-link
          class="link"
          @click="${this._linkClickHandler}"
          href="${h(this.linkHref)}"
          ?hidden="${this._showLink}"
          role="link"
          aria-label="${h(this.linkAccessibilityText)}"
          ?ellipsis="${this.hasLinkEllipsis}"
        >
          <span>${this.t(this.optionLink)}</span>
          ${this._renderBadgeNotifications}
          <bbva-link
            icon=${this.optionIcon}
            icon-size=${this.iconHelpSize}
            class="icon"
            href=${h(this.hrefIcon)}
            ?hidden="${!this.optionIcon}"
            aria-label="${this.t(this.iconAccessibilityText)}"
          >
          </bbva-link>
        </bbva-link>
      `}render(){return b`
      ${this.loading?b`<div class="skeleton"></div>`:b` <div class="header-category" ambient="${h(this._ambient)}">
              <div class="title-container">${this._renderTitle}</div>
              <div
                class="options-right ${nt({"badge-variability":"date"===this.variant})}"
              >
                ${this._renderRightOptions}
              </div>
            </div>
            ${!this.amount&&!this.showValueZero||!this.optionLink||"card"!==this.variant&&"longamount"!==this.variant?"":b` <div class="secondary-right">${this._amountText()}</div>`}`}
    `}_helpClickHandler(t){t.preventDefault(),this.dispatchEvent(new CustomEvent("header-category-help-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClickHandler(t){t.preventDefault(),this.dispatchEvent(new CustomEvent("header-category-link-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(Qe.is,Qe);var ti=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}
.grid{
  display:grid;
  grid-template-columns: 80% 20%;
  padding:16px; 
}
.grid .col{
  align-items: start;
  text-align: left;
}
.limitAmouunt{
  color: #666666;
}
.limitAmountTitle{
  color: #000000;
}
*, *:before, *:after {
}
`;class ei extends(r(x(o))){static get is(){return"card-operative-limits-list-action"}static get scopedElements(){const t=[ee,_,Jt,Gt,Kt];return ei.scopedElementsFromClasses(t)}static get properties(){return{icon:{type:String,atrtibute:"icon"},text:{type:String,attribute:"text"},amount:{type:String,attribute:"amount"},currencycode:{type:String,attribute:"currency-code"},usetoday:{type:String,atrtibute:"use-today"},availabletoday:{type:String,atrtibute:"available-today"},idlimit:{type:String,atrtibute:"id-limit"},idDailyLimit:{type:String,state:!0}}}constructor(){super(),this.icon="",this.text="",this.amount="",this.currencycode="USD",this.usetoday="",this.availabletoday="",this.idlimit="",this.idDailyLimit="POS_DAILY"}static get styles(){return[ti,d("card-operative-limits-list-action-shared-styles")]}updated(t){super.updated&&super.updated(t)}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_handleClick(){this._fireEvent("operational-limits-list-action-click")}get _icon(){return b`
        ${this.icon&&b`
            <bbva-type-link aria-label="Boton Editar" class="icono" icon="${this.icon}" @click="${this._handleClick}"></bbva-type-link>
        `||""}
    `}get _text(){return b`
        ${this.text&&b`
            <bbva-type-text text-color="#666666" text="${this.text}"></bbva-type-text>
        `||""}
    `}get _amount(){return b`
        ${this.amount&&b`
            <bbva-type-amount
            type="grey"
            variant="m"
            color="#666666"
            amount="${this.amount}"
            currency-code="${this.currencycode}">
            </bbva-type-amount>
        `||""}
    `}_formatNumber(t){return new Intl.NumberFormat("es-MX",{style:"currency",currency:"MXN"}).format(t)}render(){return b`
            <div class="grid">
                <div class="col">
                    ${this.text}
                    <div class="col limitAmountTitle">
                       ${this.t("card-operative-limits-modal-text-daily-limit")}: ${this._amount}
                    </div>
                    <div class="col">
                        <div class="col">
                            <bbva-type-text text-color="#666666" font-style="italic"  text="${this.idlimit===this.idDailyLimit?`${this.t("card-operative-limits-modal-edit-legend-bought-today")}: ${this._formatNumber(this.usetoday)}`:`${this.t("card-operative-limits-modal-edit-legend-withdrawn-today")}: ${this._formatNumber(this.usetoday)}`}">
                            ></bbva-type-text>
                        </div>
                        <div class="col">
                            <bbva-type-text text-color="#666666" font-style="italic" text=" ${this.t("card-operative-limits-modal-text-today-limit")}: ${this._formatNumber(this.availabletoday)}"></bbva-type-text>
                        </div>
                    </div>
                </div>
                <div class="col">
                    ${this._icon}
                </div>
            </div>`}}var ii=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ai extends(r(x(o))){static get is(){return"card-operative-limits-list"}static get scopedElements(){const t=[ge,ei,_,Qe];return ai.scopedElementsFromClasses(t)}static get properties(){return{flagParentsView:{type:Boolean},listPeriodsParents:{type:Array},listPeriodsYoungsters:{type:Array},listLimits:{type:Array},_typology:{type:String}}}constructor(){super(),this.flagParentsView=!0,this.listLimits=[],this._typology=""}static get styles(){return[ii,d("card-operative-limits-list-shared-styles")]}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_changedLocalesView(t,e,i){const a=(t,e,i,a,r,o)=>b`
          <card-operative-limits-list-action 
          @operational-limits-list-action-click="${this._edit}" 
          text="${t}" 
          icon="${i?st():""}" 
          amount="${e}"
          usetoday="${a}"
          availabletoday="${r}"
          idlimit="${o}"
          ></card-operative-limits-list-action>
        `;let r;const o=t=>(t=>b`<bbva-text .text="${t}" style="margin:10px;"></bbva-text>`)(t),n=t=>t.map((t=>b`<bbva-list-bullet text="${t}" id="index"></bbva-list-bullet>`)),s=t=>(t=>b`<bbva-notification-message style="margin:10px;">${t}</bbva-notification-message>`)(t),l=t=>t.map((t=>a(t.text,t.amountLimits,t.icon,t.disposedLimits,t.available,t.limitId)));return"text"===t?r=b`
            ${this.flagParentsView?o(e):o(i)}
          `:"list"===t?r=b`
            ${this.flagParentsView?n(e):n(i)}
          `:"notification"===t?r=b`
            ${this.flagParentsView?s(e):s(i)}
          `:"listAction"===t&&(r=b`
            ${this.flagParentsView?l(e):l(i)}
          `),r}_edit({target:t}){this._fireEvent("card-operative-limits-list-action-click",t.idlimit),"ATM_DAILY"===t.idlimit?this._typology=this.t("card-operative-limits-modal-edit-typology"):"POS_DAILY"===t.idlimit?this._typology=this.t("card-operative-limits-modal-edit-typology-shopping"):this._typology="",this._fireAppOnClickStart(),this._fireAppPageVisit()}_helpicon(){this._fireEvent("card-operative-limits-open-modal-info",{typology:this._typology})}_helpiconheader(){this._fireEvent("card-operative-limits-open-modal-control-parental")}_returnPage(){this._fireEvent("reset-event"),this._fireEvent("parental-control-card-limits-go-back")}_fireAppOnClickStart(){this._fireEvent("analytics-app-on-click-start",{typology:this._typology})}_fireAppPageVisit(){this._fireEvent("analytics-app-page-visit",{typology:this._typology})}render(){return b`
            <bbva-header-main
            accessibility-text-icon-left-primary="Regresar"
            accessibility-text-icon-right-primary="Ayuda"
            icon-left-primary="${D()}"
            icon-right-primary="${R()}"
            text="${this.t("card-operative-limits-header")}"
            @header-main-icon-right-primary-click="${this._helpiconheader}"
            @header-main-icon-left-primary-click="${this._returnPage}"
            >
            </bbva-header-main>
            <div>
                <bbva-header-category
                    has-help
                    link-accessibility-text="Help"
                    text="${this.t("card-operative-limits-header-modal-info")}"
                    @header-category-help-click="${this._helpicon}"
                ></bbva-header-category>
            </div>
            <div>
                ${this._changedLocalesView("listAction",this.listLimits,this.listLimits,this._typology)}
            </div>
        `}}const ri=new a;var oi=i`[ambient^=light] {
  --bbva-form-field-bg-color: initial;
  --bbva-form-field-input-color: initial;
  --bbva-form-field-readonly-input-color: initial;
  --bbva-form-field-placeholder-color: initial;
  --bbva-form-field-label-color: initial;
  --bbva-form-field-focused-label-color: initial;
  --bbva-form-field-readonly-label-color: initial;
  --bbva-form-field-border-color: initial;
  --bbva-form-field-focused-border-color: initial;
  --bbva-form-field-readonly-clear-color: initial;
  --bbva-form-field-message-color: initial;
  --bbva-form-field-message-icon-color: initial;
  --bbva-form-field-info-message-color: initial;
  --bbva-form-field-info-message-icon-color: initial;
  --bbva-form-field-invalid-field-bg-color: initial;
  --bbva-form-field-invalid-input-color: initial;
  --bbva-form-field-invalid-field-border-color: initial;
  --bbva-form-field-invalid-label-color: initial;
  --bbva-form-field-invalid-clear-color: initial;
  --bbva-form-field-label-out-color: initial;
  --bbva-form-field-help-icon-color: initial;
  --bbva-form-field-action-icon-color: initial;
  --bbva-form-field-readonly-icon-color: initial;
  --bbva-form-field-icon-color-variant: initial;
  --bbva-form-field-icon-color-focus-variant: initial;
  --bbva-form-field-icon-color-disabled-variant: initial;
}

[ambient^=light100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}
${ri.mediaRules()}`;const ni=new a;var si=i`[ambient^=dark] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)});
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${m(u.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${m(u.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${m(u.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${m(u.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${m(u.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${m(u.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${m(u.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}
${ni.mediaRules()}`;const li={dark:i`
    ${si}
    ${J.dark}
    ${$.dark}
    ${lt.dark}
    ${y.dark}
    ${ct.dark}
  `,light:i`
    ${oi}
    ${J.light}
    ${$.light}
    ${lt.light}
    ${y.light}
    ${ct.light}
  `};var ci=i`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${m(u.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${m(u.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${m(u.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${m(u.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${m(u.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${m(u.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${m(u.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --bbva-button-default-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --bbva-button-default-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${m(u.primaryCore)})));
  --bbva-button-default-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --bbva-button-default-icon-color-variant: var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${m(u.primaryMedium)}));
  display: block;
  box-sizing: border-box;
  position: relative;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.field {
  position: relative;
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  flex: auto;
  border-bottom: 1px solid var(--_field-border-color);
  background-color: var(--_field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_field-focused-border-color);
}
:host([invalid]:not([action-into-form])) .field {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}

.slot-input ::slotted(input) {
  width: 100%;
  height: 100%;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${m(p.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus):placeholder-shown) {
  opacity: 0;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${m(p.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${m(v.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${m(g.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}
:host([readonly]) .clear {
  color: var(--_field-readonly-clear-color);
}
.clear :host([invalid]) [data-tag-name=bbva-button-default] {
  fill: var(--_button-default-color-icon-focus-variant);
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_invalid-field-input-color);
}
:host([invalid]) .label {
  color: var(--_invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  --bbva-button-default-icon-color-variant: var(--_invalid-field-label-color);
  --_button-default-color-icon-variant: var(--_invalid-action-icon-color);
}
:host([invalid]) .clear:active, :host([invalid]):host([action-into-form][action-variant]) .action {
  --_button-default-color-icon-focus-variant: var(--_invalid-action-icon-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  background-color: var(--_field-bg-color);
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  background-color: transparent;
  border-bottom: none;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-icon] {
  color: var(--_action-icon-color);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-icon][disabled] {
  color: unset;
}
:host([action-into-form]):host([readonly]) .wrapper-action [data-tag-name=bbva-icon] {
  fill: var(--_field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-icon] {
  fill: var(--_invalid-action-icon-color);
  --bbva-button-default-color: var(--_invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 1px solid var(--_field-border-color);
}

:host([action-into-form][icon-variant][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form][icon-variant][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: none;
}

.message {
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${m(p.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${m(v.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}

.message-error[data-tag-name=bbva-notification-help] {
  --_notification-help-icon-color: var(--_message-icon-color);
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`;I("colors.cool70"),I("colors.primaryCoreLightened"),I("colors.cool20"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.cool20"),I("colors.cool20"),I("colors.cool20"),I("colors.cool20"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.tertiaryType1Light"),I("colors.cool20"),I("colors.cool20"),I("colors.cool70"),I("colors.primaryCoreLightened"),I("colors.tertiaryType1Light"),I("colors.tertiaryType1Light"),I("colors.tertiaryType1Light"),I("colors.primarySubdued"),I("colors.primaryCoreLightened"),I("colors.tertiaryType1Light"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened");let di=class extends(r(x(mt))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-text":_,"bbva-link":rt,"bbva-notification-help":pt,"bbva-icon":k,"bbva-button-default":vt}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},iconVariant:{type:String,attribute:"icon-variant"},hideBottomPaddingInfoMessage:{type:Boolean,attribute:"hide-bottom-padding-info-message"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-input-field-submit",this.actionIntoForm=!1,this.clearIcon=gt(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-field-clear",this.optionalLabel="bbva-form-input-field-optional-label",this.errorIcon=l(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=s(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1,this.hideBottomPaddingInfoMessage=!1}firstUpdated(t){super.firstUpdated(t),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const e=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",e.style.display="none",e.innerHTML=this.inputInnerStyles,this.appendChild(e)}updated(t){super.updated(t),t.has("value")&&(this.autoValidate||void 0===t.get("value")||(this.invalid=this.required?this._isEmpty:this.invalid),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const t=this.invalid?this.errorMessage:"";return t&&this.infoMessage?`${t}. ${this.infoMessage}`:t||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?b`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${h(this.linkHref)}"
            aria-label="${this.t("bbva-form-input-field-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?b`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            tag="legend"
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,ci,li.light,li.dark,d("bbva-form-input-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return b`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return b`
      <div
        class="wrapper"
        @keydown="${t=>13===t.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field}
        ${this.iconVariant||this.readonly||!this.actionType?this.rightIcon:this.actionButton}
      </div>
    `}get clearButton(){return b`
      <bbva-button-default
        tabindex="0"
        class="clear"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearInput}"
        variant="icon no-background"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-default>
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return b` <bbva-button-default
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      variant="icon ${this.actionVariant}"
    >
    </bbva-button-default>`}get rightIcon(){return this.actionIcon?b`
          <div class="wrapper-action">
            <bbva-icon .icon="${this.actionIcon}" .size="${this.actionIconSize}"></bbva-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?b`
          <div class="message error" role="alert">
            <bbva-notification-help
              class="message-error"
              accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-alert-icon")}"
              icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              text=${this.t(this.errorMessage)}
              disabled-tabindex
            ></bbva-notification-help>
          </div>
        `:""}get messageInfo(){return this.infoMessage?b`
          <bbva-notification-help
            ?hide-bottom-padding=${this.hideBottomPaddingInfoMessage}
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
            disabled-tabindex
          ></bbva-notification-help>
        `:""}get labelBlock(){return b`
      <bbva-text
        unset
        size="2XS"
        tag="label"
        for="${this._formElementId}"
        text="${this.inputLabel}"
        class="label"
        aria-hidden="true"
        @click="${this.focus}"
      ></bbva-text>
    `}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const t=this._rootNode.activeElement,e=this.shadowRoot.activeElement||t;this._field.contains(e)||t===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearInput(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return b`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}};const bi=new a;var hi=i`@charset "UTF-8";
:host {
  display: block;
  box-sizing: border-box;
  --_form-amount-currency-color: var(--bbva-form-amount-currency-dark-mode-color, var(--bbva-form-amount-currency-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_form-amount-readonly-currency-color: var(--bbva-form-amount-readonly-currency-dark-mode-color, var(--bbva-form-amount-readonly-currency-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --_form-amount-currency-invalid-color: var(--bbva-form-amount-currency-dark-mode-invalid-color, var(--bbva-form-amount-currency-invalid-color, var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_form-amount-currency-invalid-auto-validate-color: var(--bbva-form-amount-currency-dark-mode-invalid-auto-validate-color, var(--bbva-form-amount-currency-invalid-auto-validate-color, var(--colorsSecondary600, ${m(u.secondary600)})));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.slot-input ::slotted(input) {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
}

.back {
  position: absolute;
  display: flex;
  align-items: center;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${m(p.typeSmall)}));
}
:host([focused]) .back, :host([filled]) .back {
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
}
.back-amount {
  flex: auto;
  opacity: 0;
}
:host([focused]) .back-amount, :host([filled]) .back-amount {
  flex: none;
  max-width: calc(100% - rem(48px));
}
.back-currency {
  order: 1;
  color: var(--_form-amount-currency-color);
}
:host([readonly]) .back-currency {
  color: var(--_form-amount-readonly-currency-color);
}
.back-currency::before {
  content: " ";
}
:host([focused]) .back-currency, :host([filled]) .back-currency {
  order: -1;
}
:host([focused]) .back-currency::before, :host([filled]) .back-currency::before {
  content: "";
}
:host([focused]) .back-currency.right, :host([filled]) .back-currency.right {
  order: 1;
}
:host([focused]) .back-currency.hide-currency, :host([filled]) .back-currency.hide-currency {
  opacity: 0;
}
:host([focused]) .back-currency:not(.right)::after, :host([focused]) .back-currency.right::before, :host([filled]) .back-currency:not(.right)::after, :host([filled]) .back-currency.right::before {
  content: " ";
}

:host([flag]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}

:host([show-card]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}

:host([focused][flag]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}

:host([focused][show-card]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}

:host([invalid]) .back-currency,
:host([focused][invalid]) .back-currency {
  color: var(--_form-amount-currency-invalid-color);
}

:host([invalid][auto-validate]) .back-currency {
  color: var(--_form-amount-currency-invalid-auto-validate-color);
}

.with-clip .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}
.with-clip .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}

.clip {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
${bi.mediaRules()}`,mi=i`[ambient^=dark] {
  --bbva-form-amount-currency-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-amount-readonly-currency-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-amount-currency-invalid-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-amount-currency-invalid-auto-validate-color: initial;
}
`,pi=i`[ambient^=light] {
  --bbva-form-amount-currency-color: initial;
  --bbva-form-amount-readonly-currency-color: initial;
  --bbva-form-amount-currency-invalid-color: initial;
  --bbva-form-amount-currency-invalid-auto-validate-color: initial;
}
`;const vi={dark:i`
    ${mi}
    ${ut.dark}
    ${li.dark}
  `,light:i`
    ${pi}
    ${ut.light}
    ${li.light}
  `},gi=new a;var ui=i`[ambient^=light] {
  --bbva-form-field-bg-color: initial;
  --bbva-form-field-input-color: initial;
  --bbva-form-field-readonly-input-color: initial;
  --bbva-form-field-placeholder-color: initial;
  --bbva-form-field-label-color: initial;
  --bbva-form-field-focused-label-color: initial;
  --bbva-form-field-readonly-label-color: initial;
  --bbva-form-field-border-color: initial;
  --bbva-form-field-focused-border-color: initial;
  --bbva-form-field-readonly-clear-color: initial;
  --bbva-form-field-message-color: initial;
  --bbva-form-field-message-icon-color: initial;
  --bbva-form-field-info-message-color: initial;
  --bbva-form-field-info-message-icon-color: initial;
  --bbva-form-field-invalid-field-bg-color: initial;
  --bbva-form-field-invalid-input-color: initial;
  --bbva-form-field-invalid-field-border-color: initial;
  --bbva-form-field-invalid-label-color: initial;
  --bbva-form-field-invalid-clear-color: initial;
  --bbva-form-field-label-out-color: initial;
  --bbva-form-field-help-icon-color: initial;
  --bbva-form-field-action-icon-color: initial;
  --bbva-form-field-readonly-icon-color: initial;
  --bbva-form-field-icon-color-variant: initial;
  --bbva-form-field-icon-color-focus-variant: initial;
  --bbva-form-field-icon-color-disabled-variant: initial;
}

[ambient^=light100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}
${gi.mediaRules()}`;const fi=new a;var yi=i`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${m(u.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${m(u.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${m(u.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${m(u.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${m(u.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${m(u.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${m(u.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${m(u.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}
${fi.mediaRules()}`;i`
    ${yi}
    ${ft.dark}
    ${J.dark}
  `,i`
    ${ui}
    ${ft.light}
    ${J.light}
  `;i`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${m(u.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${m(u.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${m(u.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${m(u.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${m(u.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${m(u.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${m(u.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${m(u.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${m(u.primaryCore)})));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  display: block;
  box-sizing: border-box;
  position: relative;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.field {
  position: relative;
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  flex: auto;
  border-bottom: 1px solid var(--_field-border-color);
  background-color: var(--_field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_field-focused-border-color);
}
:host([invalid]:not([action-into-form])) .field {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}

.slot-input ::slotted(input) {
  width: 100%;
  height: 100%;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${m(p.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus):placeholder-shown) {
  opacity: 0;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${m(p.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${m(v.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${m(g.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${m(p.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${m(v.typeSmall)}));
  color: var(--_field-label-out-color);
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}
:host([readonly]) .clear {
  color: var(--_field-readonly-clear-color);
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_invalid-field-input-color);
}
:host([invalid]) .label {
  color: var(--_invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  color: var(--_invalid-field-clear-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  background-color: var(--_field-bg-color);
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  background-color: transparent;
  border-bottom: none;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_action-icon-color);
}
:host([action-into-form]):host([readonly]).wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_invalid-action-icon-color);
  --bbva-button-icon-color: var(--_invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 1px solid var(--_field-border-color);
}

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${m(p.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${m(v.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_message-icon-color);
  min-width: 1rem;
  min-height: 1rem;
}
.info .message-icon {
  color: var(--_info-message-icon-color);
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-core-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`;r(x(mt));I("colors.cool70"),I("colors.primaryCoreLightened"),I("colors.cool20"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.cool20"),I("colors.cool20"),I("colors.cool20"),I("colors.cool20"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.tertiaryType1Light"),I("colors.cool20"),I("colors.cool20"),I("colors.cool70"),I("colors.primaryCoreLightened"),I("colors.tertiaryType1Light"),I("colors.tertiaryType1Light"),I("colors.tertiaryType1Light"),I("colors.primarySubdued"),I("colors.primaryCoreLightened"),I("colors.tertiaryType1Light"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened");I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.tertiaryType1Light"),I("colors.primaryCoreLightened"),_t(),St(),Lt();const $i={apple:{logo:"applepay",text:"bbva-clip-card-pay-compatibility-apple"},google:{logo:"googlepay",text:"bbva-clip-card-pay-compatibility-google"}};class xi extends(Tt(wt(r(x(di))))){static get is(){return"bbva-form-amount"}static get scopedElements(){return{"bbva-text":_,"bbva-link":rt,"bbva-notification-help":pt,"bbva-icon":k,"bbva-button-default":vt,"bbva-clip-flag":Ct,"bbva-clip-card":It}}static get properties(){return{flag:{type:String,reflect:!0},showCard:{type:Boolean,attribute:"show-card"},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},cardVariant:{type:String,attribute:"card-variant"},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},accessibilityText:{type:String,attribute:"accessibility-text"},partnerLogo:{type:String,attribute:"partner-logo"},partnerLogoVariant:{type:String,attribute:"partner-logo-variant"},partner:{type:Boolean}}}constructor(){super(),this.cardType="",this.cardVariant="",this.showCard=!1,this.cardStatus="",this.partner=!1,this.cardImage="",this.payCompatibility="",this.payCompatibilityInfo=$i,this.accessibilityText="bbva-form-input-amount-clip-card-image"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._checkTrailingDecimal=this._checkTrailingDecimal.bind(this),this.addEventListener("focusout",this._checkTrailingDecimal)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("focusout",this._checkTrailingDecimal)}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._currencyBlock=this.shadowRoot.querySelector(".back-currency")}updated(t){super.updated&&super.updated(t),t.has("language")&&(this.allowedPattern=`[0-9${this._separator}${this._groupChar}]`),t.has("value")&&this.formatValue(this.value),t.has("amount")&&Number.isFinite(this.amount)&&(this.value=String(this.amount).replace(/\./g,this._separator)),(t.has("localCurrency")||t.has("currencyCode"))&&this._setCurrencyWidth()}static get styles(){return[super.styles,hi,vi.dark,vi.light,d("bbva-form-amount-shared-styles")]}get flagBlock(){return b`
      ${this.flag?b`
            <span class="clip">
              <bbva-clip-flag
                icon="${h(this._getFlag())}"
                size="small"
                iconset="${h(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get cardBlock(){return b`
      ${this.showCard?b`
            <span class="clip">
              <bbva-clip-card
                size="small"
                status="${this.cardStatus}"
                card-type="${this.cardType}"
                variant="${this.cardVariant}"
                pay-compatibility="${this.payCompatibility}"
                card-image="${this.cardImage}"
                accessibilityText="${this.t(this.accessibilityText)}"
                ?partner="${this.partner}"
                partner-logo="${h(this.partnerLogo)}"
                partner-logo-variant="${h(this.partnerLogoVariant)}"
                disabled-tabindex
              ></bbva-clip-card>
            </span>
          `:""}
    `}get _isRightAligned(){return this._alignRight}get labelBlock(){return b` <bbva-text
      unset
      size="2XS"
      tag="label"
      for="${this._formElementId}"
      text="${this.label}"
      class="label"
      @click="${this.focus}"
    ></bbva-text>`}get inputLabel(){return`${this.label} (${this._currency})`}get field(){return b`
      <div
        class="field ${this.flag||this.showCard?"with-clip":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.cardBlock}${this.backAmount} ${this.labelledInput}
        ${this.clearButton}
      </div>
    `}get backAmount(){return b`
      <span class="back" aria-hidden="true">
        <span
          class="back-currency ${this._isRightAligned?"right":""} ${this.placeholder&&!this.value?"hide-currency":""}"
          >${this._currency}</span
        >
        <span class="back-amount">${this.value}</span>
      </span>
    `}_setCurrencyWidth(){const t=this._isRightAligned?0:this._currencyBlock.offsetWidth,e=i`
      ${t/16}rem
    `;this._formElement.style.setProperty("margin-left",e)}_getFlag(){var t;let e=this.flag.toLowerCase();return e=e[0].toUpperCase()+e.slice(1),null===(t=Qt[`flags${e}`])||void 0===t?void 0:t.call(Qt)}_formatNumber(t,e){return e?t.replace(/\D/g,"").replace(/\B(?=(\d{3})+(?!\d))/g,this._groupChar):t.replace(/\D/g,"")}_formatCurrency(t,e){let i;if(t.indexOf(e)>=0){const a=t.indexOf(e);let r=t.substring(0,a),o=t.substring(a);r=this._formatNumber(r,!0),o=this._formatNumber(o,!1),o=o.substring(0,this.decimalDigits),i=this.decimalDigits?r+e+o:r}else i=this._formatNumber(t,!0);return i}formatValue(t){if(""===t||null==t)return void this._fireChange(t,this.amount);this.amount=t?Number(t.replace(new RegExp(`\\${this._groupChar}`,"g"),"").replace(new RegExp(`\\${this._separator}`),".")):0;const e=String(t),i=this._formElement,a=e.length;let r=i.selectionStart;const o=this._formatCurrency(e,this._separator);i.value=o,e===o&&this._fireChange(o,this.amount),this.value=i.value;r=o.length-a+r,i.setSelectionRange(r,r)}_checkTrailingDecimal(){this.value&&this.value.endsWith(this._separator)&&(this.value=this.value.replace(this._separator,""))}_fireChange(t,e){this.dispatchEvent(new CustomEvent("form-amount-input-change",{detail:{value:t,amount:e},bubbles:!0,composed:!0}))}}var ki=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
`;const _i={light:i`
    ${li.light}
  `,dark:i`
    ${li.dark}
  `};class Si extends(r(di)){static get is(){return"bbva-form-attach"}static get properties(){return{inputType:{type:String,attribute:"input-type"}}}constructor(){super(),this.actionIcon="",this.actionIntoForm=!0,this.actionType="submit",this.actionVariant="no-background",this.inputType=""}static get styles(){return[super.styles,ki,d("bbva-form-attach-shared-styles"),_i.light,_i.dark]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}get _icons(){const t={camera:Et(),contact:Mt()};return this.inputType in t&&t[this.inputType]}}const Li=new a;var Ti=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.with-flag .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
${Li.mediaRules()}`;const wi={dark:i`
    ${li.dark}
  `,light:i`
    ${li.light}
  `};class Ci extends(r(di)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":Ct,"bbva-icon":k,"bbva-text":_,"bbva-link":rt,"bbva-notification-help":pt,"bbva-button-default":vt}}static get properties(){return{flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text"}_getFlag(){var t;let e=this.flag.toLowerCase();return e=e[0].toUpperCase()+e.slice(1),null===(t=Qt[`flags${e}`])||void 0===t?void 0:t.call(Qt)}static get styles(){return[super.styles,Ti,wi.light,wi.dark,d("bbva-form-text-shared-styles")]}get field(){return b`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return b`
      ${this.flag?b`
            <span class="flag">
              <bbva-clip-flag
                icon="${h(this._getFlag())}"
                size="small"
                iconset="${h(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}const Ii=new a;var Ei=i`:host {
  display: block;
  box-sizing: border-box;
  --_form-date-clear-icon-color: var(--bbva-form-date-dark-mode-clear-icon-color, var(--bbva-form-date-clear-icon-color, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
  --_form-date-invalid-clear-icon-color: var(--bbva-form-date-dark-mode-invalid-clear-icon-color, var(--bbva-form-date-invalid-clear-icon-color, var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_form-date-readonly-clear-color: var(--bbva-form-date-dark-mode-readonly-clear-icon-color, var(--bbva-form-date-readonly-clear-icon-color, var(--colorsSecondary500, ${m(u.secondary500)})));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.slot-input ::slotted(input) {
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}

.clear {
  display: flex;
  justify-content: center;
  align-items: center;
  width: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
.clear [data-tag-name=bbva-icon] {
  color: var(--_form-date-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-icon] {
  fill: var(--_form-date-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-icon] {
  color: var(--_form-date-readonly-clear-color);
}
${Ii.mediaRules()}`;const Mi=new a;var Pi=i`[ambient^=light] {
  --bbva-form-date-clear-icon-color: initial;
  --bbva-form-date-invalid-clear-icon-color: initial;
  --bbva-form-date-readonly-clear-icon-color: initial;
}
${Mi.mediaRules()}`;const Vi=new a;var zi=i`[ambient^=dark] {
  --bbva-form-date-clear-icon-color: var(--colorsPrimaryVariantLightened, ${m(u.primaryVariantLightened)});
  --bbva-form-date-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-date-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}
${Vi.mediaRules()}`;const Bi={dark:i`
    ${zi}
    ${y.dark}
    ${li.dark}
  `,light:i`
    ${Pi}
    ${y.light}
    ${li.light}
  `};I("colors.primaryCoreLightened"),I("colors.tertiaryType1Light"),I("colors.secondary500");class Ai extends(r(di)){static get is(){return"bbva-form-date"}static get scopedElements(){return{"bbva-icon":k,"bbva-text":_,"bbva-link":rt,"bbva-notification-help":pt,"bbva-button-default":vt}}constructor(){super(),this.type="date",this.clearIcon=Pt()}static get styles(){return[super.styles,Ei,Bi.light,Bi.dark,d("bbva-form-date-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return b`
      <div
        class="field"
        @keydown="${this._onFocusin}"
        @click="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}get clearIconBlock(){return b`
      <span class="clear">
        <bbva-icon
          .icon="${this.clearIcon}"
          .size="${this.clearIconSize}"
        ></bbva-icon>
      </span>
    `}}const Di=new a;var Fi=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.with-flag .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
${Di.mediaRules()}`;const Ri=i`
    ${li.dark}
  `,Ni=i`
    ${li.light}
  `;class Hi extends(r(di)){static get is(){return"bbva-form-number"}static get scopedElements(){return{"bbva-clip-flag":Ct,"bbva-text":_,"bbva-icon":k,"bbva-link":rt,"bbva-notification-help":pt,"bbva-button-default":vt}}static get properties(){return{flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="number"}_getFlag(){var t;let e=this.flag.toLowerCase();return e=e[0].toUpperCase()+e.slice(1),null===(t=Qt[`flags${e}`])||void 0===t?void 0:t.call(Qt)}static get styles(){return[super.styles,Fi,d("bbva-form-number-shared-styles")]}get field(){return b`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return b`
      ${this.flag?b`
            <span class="flag">
              <bbva-clip-flag
                icon="${h(this._getFlag())}"
                size="small"
                iconset="${h(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}const Oi=new a;var qi=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.wrapper {
  display: flex;
}

.field {
  flex: auto;
}

.action {
  flex: none;
}
${Oi.mediaRules()}`;const ji={light:i`
    ${li.light}
  `,dark:i`
    ${li.dark}
  `};class Xi extends(r(x(di))){static get is(){return"bbva-form-search"}static get scopedElements(){return{"bbva-icon":k,"bbva-text":_,"bbva-link":rt,"bbva-notification-help":pt,"bbva-button-default":vt}}static get properties(){return{disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},iconVariant:{type:String,attribute:"icon-variant"}}}constructor(){super(),this.type="search",this.actionType="submit",this.actionIcon=Vt(),this.actionAccessibleText="bbva-form-input-search-submit",this.actionIntoForm=!0}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}firstUpdated(t){super.firstUpdated(t),this._field=this.shadowRoot.querySelector(".field"),this._action=this.shadowRoot.querySelector(".action")}updated(t){super.updated&&super.updated(t),t.has("variant")&&"trigger"===this.variant&&this._field.addEventListener("click",this.handleInputClick)}static get styles(){return[super.styles,qi,d("bbva-form-search-shared-styles"),ji.light,ji.dark]}handleInputClick(){this.dispatchEvent(new CustomEvent("form-search-input-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.value&&this.dispatchEvent(new CustomEvent("form-search-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}get _icons(){const t={access:zt(),search:Vt()};return this.iconVariant in t?t[this.iconVariant]:t.search}}const Ui=new a;var Wi=i`:host {
  display: block;
  box-sizing: border-box;
  --_form-time-clear-icon-color: var(--bbva-form-time-clear-icon-color, var(--colorsPrimaryMedium, ${m(u.primaryMedium)}));
  --_form-time-invalid-clear-icon-color: var(--bbva-form-time-invalid-clear-icon-color, var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)}));
  --_form-time-readonly-clear-color: var(--bbva-form-time-readonly-clear-icon-color, var(--colorsSecondary500, ${m(u.secondary500)}));
}

.clear {
  display: flex;
  justify-content: center;
  align-items: center;
  width: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
.clear [data-tag-name=bbva-icon] {
  color: var(--_form-time-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-icon] {
  fill: var(--_form-time-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-icon] {
  color: var(--_form-time-readonly-clear-color);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.slot-input ::slotted(input) {
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}
${Ui.mediaRules()}`;const Yi=new a;var Zi=i`[ambient^=dark100] {
  --bbva-form-time-clear-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-time-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-time-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}

[ambient^=dark300] {
  --bbva-form-time-clear-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-time-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-time-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}
${Yi.mediaRules()}`;const Gi=new a;var Ji=i`[ambient^=light] {
  --bbva-form-time-clear-icon-color: initial;
  --bbva-form-time-invalid-clear-icon-color: initial;
  --bbva-form-time-readonly-clear-icon-color: initial;
}
${Gi.mediaRules()}`;const Ki={dark:i`
    ${Zi}
    ${li.dark}
  `,light:i`
    ${Ji}
    ${li.light}
  `};class Qi extends(r(di)){static get is(){return"bbva-form-time"}static get scopedElements(){return{"bbva-icon":k,"bbva-text":_,"bbva-link":rt,"bbva-notification-help":pt,"bbva-button-default":vt}}constructor(){super(),this.type="time",this.clearIcon=Lt()}static get styles(){return[super.styles,Ki.light,Ki.dark,Wi,d("bbva-form-time-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return b`
      <div
        class="field"
        @click="${this._onFocusin}"
        @keydown="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get clearIconBlock(){return b`
      <span class="clear">
        <bbva-icon
          .icon="${this.clearIcon}"
          .size="${this.clearIconSize}"
        ></bbva-icon>
      </span>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}}var ta=i`:host {
  --_icon-color: var(--bbva-form-password-hint-dark-mode-icon-color, var(--bbva-form-password-hint-icon-color, var(--colorsTertiaryType6Dark, ${m(u.tertiaryType6Dark)})));
  --_text-color: var(--bbva-form-password-hint-dark-mode-text-color, var(--bbva-form-password-hint-text-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  display: flex;
  align-items: flex-start;
  box-sizing: border-box;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem) 1rem 0;
  font-size: var(--typographyType3XSmall, ${m(p.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${m(v.type3XSmall)});
  color: var(--_text-color);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
  font-size: 1px;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.mark {
  width: 1rem;
  height: 1rem;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

.icon {
  fill: var(--_icon-color);
}

.unmarked {
  display: block;
  border: 1px solid var(--_icon-color);
  border-radius: 50%;
}
`,ea=i`[ambient^=light] {
  --bbva-form-password-hint-text-color: initial;
  --bbva-form-password-hint-icon-color: initial;
}
`,ia=i`[ambient^=dark] {
  --bbva-form-password-hint-text-color: var(--colorsPrimaryVariantLightened, ${m(u.primaryVariantLightened)});
  --bbva-form-password-hint-icon-color: var(--colorsPrimaryVariantLightened, ${m(u.primaryVariantLightened)});
}
`;const aa={dark:i`
    ${ia}
    ${li.dark}
    ${y.dark}
  `,light:i`
    ${ea}
    ${li.light}
    ${y.light}
  `};I("colors.primaryCoreLightened"),I("colors.tertiaryType6");const ra=c(),oa="bbva-form-input-form-password-hint-checked",na="bbva-form-input-form-password-hint-unchecked";class sa extends(x(r(o))){static get is(){return"bbva-form-password-hint"}static get scopedElements(){return{"bbva-icon":k}}static get properties(){return{checked:{type:Boolean,reflect:!0}}}constructor(){super(),this.checked=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","listitem")}static get styles(){return[ta,aa.dark,aa.light,d("bbva-form-password-hint-shared-styles")]}render(){return b`
      ${this.checked?this._markedTpl:this._unmarkedTpl}
      <div class="text">
        <slot></slot>
        <span class="sr-only">${this._srCheckedMessage}</span>
      </div>
    `}get _markedTpl(){return b` <bbva-icon class="mark icon" icon="${ra}"></bbva-icon> `}get _unmarkedTpl(){return b` <span class="mark unmarked" aria-hidden="true"></span> `}get _srCheckedMessage(){return this.checked?this.t(oa):this.t(na)}}const la=new a;var ca=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
${la.mediaRules()}`;const da={dark:i`
    ${li.dark}
    ${aa.dark}
  `,light:i`
    ${li.light}
    ${aa.light}
  `};class ba extends(r(Bt(x(di)))){static get is(){return"bbva-form-password"}static get scopedElements(){return{"bbva-text":_,"bbva-icon":k,"bbva-link":rt,"bbva-notification-help":pt,"bbva-button-default":vt,"bbva-form-password-hint":sa}}static get properties(){return{toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},hintsListLabel:{type:String,reflect:!0,attribute:"hints-list-label"}}}constructor(){super(),this.actionType="button",this.actionVariant="no-background",this.actionIntoForm=!0,this.type="password",this.toggleVisibleIcon=At(),this.toggleIconSize=24,this.toggleAccessibleText="bbva-form-input-password-toggle",this.toggleVisibleAccessibleText="bbva-form-input-password-toggle-visible",this.visible=!1,this.toggleIcon=Dt(),this.actionIcon=this.toggleIcon,this.actionIconSecondary=this.toggleVisibleIcon,this.actionAccessibleText=this.toggleAccessibleText,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.hintsListLabel="",this._onSlotsChange=this._onSlotsChange.bind(this),this.addEventListener("slotschanges",this._onSlotsChange)}updated(t){super.updated(t),t.has("visible")&&(this.type=this.visible?"text":"password")}static get styles(){return[super.styles,ca,da.dark,da.light,d("bbva-form-password-shared-styles")]}switchIcon(){this._secondary=!this._secondary,this.visible=!this.visible,this.focus(),this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this.visible,bubbles:!0,composed:!0}))}get _hintsTpl(){return b`
      <div
        class="hints"
        role="list"
        aria-label="${this.t(this._hintsListLabel)}"
        ?hidden="${this.readonly||!this._hasHints}"
      >
        <slot name="hints"></slot>
      </div>
    `}get _hintsListLabel(){return this.hintsListLabel}_onSlotsChange(t){const{slotName:e,contentSlots:i}=t.detail;"hints"===e&&(this._hasHints=Boolean(i.length))}render(){return b`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo} ${this._hintsTpl}
    `}}const ha=new a;var ma=i`:host {
  display: block;
  box-sizing: border-box;
  --_form-textarea-field-bg-color: var(--bbva-form-textarea-dark-mode-field-bg-color, var(--bbva-form-textarea-field-bg-color, var(--ambientsLight100, ${m(U.light100)})));
  --_form-textarea-field-border-color: var(--bbva-form-textarea-dark-mode-field-border-color, var(--bbva-form-textarea-field-border-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --_form-textarea-focused-field-border-color: var(--bbva-form-textarea-dark-mode-focused-field-border-color, var(--bbva-form-textarea-focused-field-border-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_form-textarea-invalid-field-bg-color: var(--bbva-form-textarea-dark-mode-invalid-field-bg-color, var(--bbva-form-textarea-invalid-field-bg-color, var(--colorsTertiaryType5Lightened, ${m(u.tertiaryType5Lightened)})));
  --_form-textarea-invalid-field-border-color: var(--bbva-form-textarea-dark-mode-invalid-field-border-color, var(--bbva-form-textarea-invalid-field-border-color, var(--colorsTertiaryType5Medium, ${m(u.tertiaryType5Medium)})));
  --_form-textarea-textarea-color: var(--bbva-form-textarea-dark-mode-textarea-color, var(--bbva-form-textarea-textarea-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_form-textarea-readonly-textarea-color: var(--bbva-form-textarea-dark-mode-readonly-textarea-color, var(--bbva-form-textarea-readonly-textarea-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --_form-textarea-invalid-textarea-color: var(--bbva-form-textarea-dark-mode-invalid-textarea-color, var(--bbva-form-textarea-invalid-textarea-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_form-textarea-label-color: var(--bbva-form-textarea-dark-mode-label-color, var(--bbva-form-textarea-label-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --_form-textarea-label-out-color: var(--bbva-form-textarea-dark-mode-label-out-color, var(--bbva-form-textarea-label-out-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_form-textarea-focused-label-color: var(--bbva-form-textarea-dark-mode-focused-label-color, var(--bbva-form-textarea-focused-label-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --_form-textarea-readonly-label-color: var(--bbva-form-textarea-dark-mode-readonly-label-color, var(--bbva-form-textarea-readonly-label-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --_form-textarea-invalid-label-color: var(--bbva-form-textarea-dark-mode-invalid-label-color, var(--bbva-form-textarea-invalid-label-color, var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_form-textarea-message-color: var(--bbva-form-textarea-dark-mode-message-color, var(--bbva-form-textarea-message-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --_form-textarea-message-info-icon-color: var(--bbva-form-textarea-dark-mode-message-info-icon-color, var(--bbva-form-textarea-message-info-icon-color, var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)})));
  --_form-textarea-message-error-icon-color: var(--bbva-form-textarea-dark-mode-message-error-icon-color, var(--bbva-form-textarea-message-error-icon-color, var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_form-textarea-message-info-counter-color: var(--bbva-form-textarea-dark-mode-message-info-counter-color, var(--bbva-form-textarea-message-info-counter-color, var(--colorsSecondary500, ${m(u.secondary500)})));
  --bbva-button-default-icon-color-variant: var(--bbva-form-textarea-dark-mode-icon-color-variant, var(--bbva-form-textarea-icon-color-variant, var(--colorsPrimaryMedium, ${m(u.primaryMedium)})));
}

:host([disabled]) {
  opacity: 0.4;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.field {
  position: relative;
  max-height: calc(((17.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
  background-color: var(--_form-textarea-field-bg-color);
  border-bottom: 1px solid var(--_form-textarea-field-border-color);
  border-radius: var(--bbva-form-textarea-field-border-radius, var(--borderRadiusSmall, ${m(Ft.small)}));
}
:host([focused]) .field {
  border-bottom-color: var(--_form-textarea-focused-field-border-color);
}
:host([invalid]) .field {
  background-color: var(--_form-textarea-invalid-field-bg-color);
  border-bottom-color: var(--_form-textarea-invalid-field-border-color);
}

.label,
.message,
.slot-textarea ::slotted(textarea) {
  font-style: var(--fontFacePrimaryBookFontStyle, ${m(g.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${m(g.book.fontWeight)});
}

.label,
.slot-textarea ::slotted(textarea) {
  font-size: var(--typographyTypeSmall, ${m(p.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${m(v.typeSmall)});
}

.slot-textarea ::slotted(textarea) {
  will-change: transform;
  width: 100%;
  height: var(--area-height, calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem));
  min-height: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  max-height: calc(((12.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  font-family: inherit;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
  outline: none;
  resize: none;
  overflow-x: hidden;
  border: none;
  background: transparent;
  color: var(--_form-textarea-textarea-color);
}
:host([readonly]) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-readonly-textarea-color);
}
:host([invalid]) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-invalid-textarea-color);
}
:host([focused]) .slot-textarea ::slotted(textarea) {
  width: calc(100% - calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem));
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em);
  color: var(--_form-textarea-label-color);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-textarea-focused-label-color);
  transform: translateY(calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 15) * 1em)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_form-textarea-readonly-label-color);
}
:host([invalid]) .label {
  color: var(--_form-textarea-invalid-label-color);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host(:not([invalid])[focused]) .clear {
  display: flex;
}
:host([invalid][focused]) .clear {
  display: flex;
  --_button-default-color-icon-variant: var(--_form-textarea-invalid-label-color);
}

:host([invalid][focused]) .clear:active {
  --_button-default-color-icon-focus-variant: var(--_form-textarea-invalid-label-color);
}

.message {
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  color: var(--_form-textarea-message-color);
}
.message.counter {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 12) * 1em);
  display: flex;
  align-items: center;
  justify-content: flex-end;
}
.message.counter [data-tag-name=bbva-text] {
  color: var(--_form-textarea-message-info-counter-color);
}

:host([maxlength][info-message]) .message {
  margin-top: 0;
}

.message-error[data-tag-name=bbva-notification-help] {
  --_notification-help-icon-color: var(--_form-textarea-message-error-icon-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
${ha.mediaRules()}`;const pa=new a;var va=i`[ambient^=light] {
  --bbva-form-textarea-field-bg-color: initial;
  --bbva-form-textarea-field-border-color: initial;
  --bbva-form-textarea-field-border-radius: initial;
  --bbva-form-textarea-invalid-field-bg-color: initial;
  --bbva-form-textarea-invalid-field-border-color: initial;
  --bbva-form-textarea-label-color: initial;
  --bbva-form-textarea-focused-label-color: initial;
  --bbva-form-textarea-readonly-label-color: initial;
  --bbva-form-textarea-invalid-label-color: initial;
  --bbva-form-textarea-label-out-color: initial;
  --bbva-form-textarea-textarea-color: initial;
  --bbva-form-textarea-invalid-textarea-color: initial;
  --bbva-form-textarea-readonly-textarea-color: initial;
  --bbva-form-textarea-message-info-color: initial;
  --bbva-form-textarea-message-error-color: initial;
  --bbva-form-textarea-message-info-icon-color: initial;
  --bbva-form-textarea-message-error-icon-color: initial;
  --bbva-form-textarea-icon-color-variant: initial;
}

[ambient=light100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}
${pa.mediaRules()}`;const ga=new a;var ua=i`[ambient^=dark] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCore, ${m(u.primaryCore)});
  --bbva-form-textarea-field-border-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-textarea-focused-field-border-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-textarea-field-border-radius: var(--borderRadiusSmall, ${m(Ft.small)});
  --bbva-form-textarea-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${m(u.tertiaryType5Lightened)});
  --bbva-form-textarea-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${m(u.tertiaryType5Medium)});
  --bbva-form-textarea-label-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-textarea-focused-label-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-textarea-readonly-label-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-textarea-invalid-label-color: var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)});
  --bbva-form-textarea-label-out-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-textarea-textarea-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-textarea-invalid-textarea-color: var(--colorsSecondary600, ${m(u.secondary600)});
  --bbva-form-textarea-readonly-textarea-color: var(--colorsSecondary100, ${m(u.secondary100)});
  --bbva-form-textarea-message-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-textarea-message-error-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-textarea-message-info-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-textarea-message-error-icon-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
  --bbva-form-textarea-message-info-counter-color: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}

[ambient=dark100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLight, ${m(u.primaryCoreLight)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)});
}
${ga.mediaRules()}`;const fa={dark:i`
    ${ua}
    ${$.dark}
  `,light:i`
    ${va}
    ${$.light}
  `};I("colors.cool70"),I("colors.cool20"),I("colors.primaryCoreLightened"),I("colors.cool60"),I("colors.tertiaryType1Light"),I("colors.primaryCoreLightened"),I("colors.cool20"),I("colors.primaryCoreLightened"),I("colors.cool20"),I("colors.cool20"),I("colors.cool20"),I("colors.tertiaryType1Light"),I("colors.primaryCoreLightened"),I("colors.primarySubduedLight"),I("colors.tertiaryType1Light"),I("colors.cool20"),I("colors.primaryCoreLightened");class ya extends(r(x(te))){static get is(){return"bbva-form-textarea"}static get scopedElements(){return{"bbva-icon":k,"bbva-text":_,"bbva-link":rt,"bbva-button-default":vt,"bbva-notification-help":pt}}static get properties(){return{validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},characterCounterLabel:{type:String,attribute:"character-counter-label"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoMessage:{type:String,attribute:"info-message"},label:{type:String},labelOut:{type:String,attribute:"label-out"}}}constructor(){super(),this.label="",this.labelOut="",this.optionalLabel="bbva-form-input-textarea-optional-label",this.characterCounterLabel="bbva-form-input-textarea-counter-label",this.clearIcon=gt(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-textarea-clear",this.errorIcon=Rt(),this.errorMessage="",this.infoIcon=s(),this.infoMessage="",this._onInputRaf=this._onInput}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field"),this._formElement=this.querySelector("textarea")}updated(t){super.updated(t),t.has("value")&&(this.autoValidate||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}static get styles(){return[ma,fa.dark,fa.light,d("bbva-form-textarea-shared-styles")]}render(){return b`${this._labelOut} ${this.field} ${this.messageError} ${this._characterCounter}
    ${this.messageInfo}`}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),`${this.label} ${this.labelOut||this.required?this.t(this.optionalLabel):""}`}get _helpIcon(){return this.helpIcon?b`
          <bbva-link
            @click="${this._helpClicked}"
            icon="${R}"
            iconSize="24"
            href="${h(this.linkHref)}"
            aria-label="${this.t("bbva-form-input-textarea-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?b`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}_onInput(){this.value=this._formElement.value,this.style.removeProperty("--area-height"),this.style.setProperty("--area-height",this._formElement.scrollHeight/16+"rem"),this._calculateCharacters()}get field(){return b`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this._labelledTextarea} ${this.clearButton}
      </div>
    `}get clearButton(){return b`
      <bbva-button-default
        class="clear"
        variant="icon no-background"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearTextarea}"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-default>
    `}get messageError(){return this._errorVisible?b`
          <div class="message error" role="alert">
            <bbva-notification-help
              class="message-error"
              accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-alert-icon")}"
              icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              text=${this.t(this.errorMessage)}
              disabled-tabindex
            ></bbva-notification-help>
          </div>
        `:""}get _errorVisible(){return this.errorMessage&&this.invalid}get _characters(){return"number"==typeof this._remainingCharacters?this._remainingCharacters:this.maxlength}get _characterCounter(){return this.maxlength?b`
          <div class="message info counter">
            <bbva-text
              unset
              text="${this._characters} ${this.t(this.characterCounterLabel)}"
              size="2XS"
            >
            </bbva-text>
          </div>
        `:""}get messageInfo(){return this.infoMessage?b`
          <bbva-notification-help
            disabled-tabindex
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
          ></bbva-notification-help>
        `:""}get _labelBlock(){return b`
      <bbva-text
        unset
        size="2XS"
        tag="label"
        for="${this._formElementId}"
        text="${this._textareaLabel}"
        class="label"
        aria-hidden="true"
        @click="${this.focus}"
      ></bbva-text>
    `}_calculateCharacters(){var t;this._remainingCharacters=this.maxlength-(null===(t=this._formElement)||void 0===t?void 0:t.value.length)}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const{activeElement:t}=this._rootNode,e=this.shadowRoot.activeElement||t;this._field.contains(e)||t===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-textarea-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-textarea-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearTextarea(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-textarea-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}}var $a=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;const xa={light:i`
    ${li.light}
    ${Bi.light}
    ${Ni}
    ${vi.light}
    ${da.light}
    ${ji.light}
    ${wi.light}
    ${Ki.light}
    ${fa.light}
    ${_i.light}
  `,dark:i`
    ${li.dark}
    ${Bi.dark}
    ${Ri}
    ${vi.dark}
    ${da.dark}
    ${ji.dark}
    ${wi.dark}
    ${Ki.dark}
    ${fa.dark}
    ${_i.dark}
  `};class ka extends(r(Bt(o))){static get is(){return"bbva-form-input"}static get scopedElements(){return{"bbva-form-attach":Si,"bbva-form-text":Ci,"bbva-form-amount":xi,"bbva-form-date":Ai,"bbva-form-number":Hi,"bbva-form-search":Xi,"bbva-form-password":ba,"bbva-form-time":Qi,"bbva-form-textarea":ya}}static get properties(){return{type:{type:String,reflect:!0},disabled:{type:Boolean,reflect:!0},value:{type:String},name:{type:String},required:{type:Boolean},readonly:{type:Boolean},autocomplete:{type:String},label:{type:String},pattern:{type:String},allowedPattern:{type:String,attribute:"allowed-pattern"},modeInput:{type:String,attribute:"mode-input"},max:{type:String},maxlength:{type:Number},min:{type:String},minlength:{type:Number},placeholder:{type:String},step:{type:Number},accessibleDescription:{type:String,attribute:"accessible-description"},autoValidate:{type:Boolean,attribute:"auto-validate"},form:{type:String},actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},symbol:{type:String},symbolLeft:{type:Boolean,attribute:"symbol-left"},symbolRight:{type:Boolean,attribute:"symbol-right"},amount:{type:Number},language:{type:String},abbr:{type:Number},abbreviations:{type:Object},decimalDigits:{type:Number,attribute:"decimal-digits"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},zeroDecimalsHidden:{type:Boolean,attribute:"zero-decimals-hidden"},trailingZeroDecimalsHidden:{type:Boolean,attribute:"trailing-zero-decimals-hidden"},separatorChar:{type:String,attribute:"separator-char"},groupChar:{type:String,attribute:"group-char"},_intlLanguage:{attribute:!1},_intlAmountLanguage:{attribute:!1},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"},items:{type:Array},minChars:{type:Number,attribute:"min-chars"},maxResults:{type:Number,attribute:"max-results"},filterValueKey:{type:String,attribute:"filter-value-key"},autoselect:{type:Boolean},selectOnBlur:{type:Boolean,attribute:"select-on-blur"},inlineAutocomplete:{type:Boolean,attribute:"inline-autocomplete"},keepOnBlur:{type:Boolean,attribute:"keep-on-blur"},keepOnSelect:{type:Boolean,attribute:"keep-on-select"},preventValueUpdateOnSelect:{type:Boolean,attribute:"prevent-value-update-on-select"},overlay:{type:Boolean,reflect:!0},search:{type:Boolean},toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},characterCounterLabel:{type:String,attribute:"character-counter-label"},iconVariant:{type:String,attribute:"icon-variant"},showCard:{type:Boolean,attribute:"show-card"},invalid:{type:Boolean},autoFocus:{type:Boolean,attribute:"autofocus"},logo:{type:String},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},partner:{type:Boolean},partnerLogo:{type:String,attribute:"partner-logo"},cardVariant:{type:String,attribute:"card-variant"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},hideBottomPaddingInfoMessage:{type:Boolean,attribute:"hide-bottom-padding-info-message"}}}constructor(){super(),this.logo="",this.cardStatus="",this.cardType="",this.cardImage="",this.partner=!1,this.cardVariant="",this.payCompatibility="",this.abbreviations={1:"da",2:"h",3:"k",6:"M",9:"B"},this.autoFocus=!1,this.actionAccessibleText="",this.actionIconSize=24,this.actionIconSecondary=this.toggleVisibleIcon,this.actionIconSecondarySize=24,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.allowedPattern="",this.autoselect=!1,this.autoValidate=!1,this.clearIcon="",this.clearIconSize=24,this.clearAccessibleText="",this.currencyCode="EUR",this.decimalDigits=2,this.decimalsHidden=!1,this.errorIcon="",this.errorMessage="",this.filterValueKey=null,this.hasError=!1,this.helpIconSize=24,this.invalid=!1,this.infoMessage="",this.inlineAutocomplete=!1,this.items=[],this.keepOnBlur=!1,this.keepOnSelect=!1,this.label="",this.labelOut="",this.localCurrency="EUR",this.maxResults=5,this.minChars=1,this.name="",this.modeInput="text",this.optionalLabel="",this.overlay=!1,this.preventValueUpdateOnSelect=!1,this.required=!1,this.search=!1,this.selectOnBlur=!1,this.toggleAccessibleText="",this.toggleIcon="",this.toggleIconSize=24,this.toggleVisibleIcon="",this.toggleVisibleAccessibleText="",this.trailingZeroDecimalsHidden=!1,this.type="",this.value="",this.visible=!1,this.zeroDecimalsHidden=!1,this.hideBottomPaddingInfoMessage=!1,this.addEventListener("slotschanges",this._onSlotsChange)}static get styles(){return[$a,d("bbva-form-input-shared-styles"),xa.light,xa.dark]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("input",this._updateValue)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("input",this._updateValue)}_updateValue(){const{firstElementChild:t}=this.shadowRoot,{firstElementChild:e}=t;this.value=e.value||t.value,this.dispatchEvent(new CustomEvent("form-input-value-change",{detail:{value:this.value},bubbles:!0,composed:!0}))}get _formAttachTpl(){return b` <bbva-form-attach
      ?autofocus=${this.autoFocus}
      input-type=${this.type}
      action-icon=${h(this.actionIcon)}
      action-icon-secondary=${h(this.actionIconSecondary)}
      label=${h(this.label)}
      label-out=${h(this.labelOut)}
      ?required=${this.required}
      help-icon=${h(this.helpIcon)}
      placeholder=${h(this.placeholder)}
      value=${h(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${h(this.infoMessage)}
      allowed-pattern=${h(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${h(this.pattern)}
      error-message=${h(this.errorMessage)}
      ?action-into-form=${this.actionIntoForm}
      action-variant=${h(this.actionVariant)}
      action-type=${h(this.actionType)}
      action-accessible-text=${h(this.actionAccessibleText)}
      action-secondary-accessible-text=${h(this.actionSecondaryAccessibleText)}
      ?validate-on-blur=${this.validateOnBlur}
      link-href=${h(this.linkHref)}
      optional-label=${h(this.optionalLabel)}
      icon-variant=${h(this.iconVariant)}
      ?invalid=${this.invalid}
    ></bbva-form-attach>`}get _formDateTpl(){return b` <bbva-form-date
      ?autofocus=${this.autoFocus}
      label=${h(this.label)}
      label-out=${h(this.labelOut)}
      ?required=${this.required}
      value=${h(this.value)}
      ?disabled=${this.disabled}
      help-icon=${h(this.helpIcon)}
      ?readonly=${this.readonly}
      info-message=${h(this.infoMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      allowed-pattern=${h(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${h(this.pattern)}
      error-message=${h(this.errorMessage)}
      .min=${this.min}
      .max=${this.max}
      action-type=${h(this.actionType)}
      action-icon=${h(this.actionIcon)}
      action-icon-secondary=${h(this.actionIconSecondary)}
      action-accessible-text=${h(this.actionAccessibleText)}
      action-secondary-accessible-text=${h(this.actionSecondaryAccessibleText)}
      action-variant=${h(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${h(this.linkHref)}
      optional-label=${h(this.optionalLabel)}
      icon-variant=${h(this.iconVariant)}
      ?invalid=${this.invalid}
    ></bbva-form-date>`}get _formTextTpl(){return b` <bbva-form-text
      ?autofocus=${this.autoFocus}
      label=${h(this.label)}
      label-out=${h(this.labelOut)}
      ?required=${this.required}
      help-icon=${h(this.helpIcon)}
      .flag-label=${this.flagLabel}
      .flag=${this.flag}
      flag-iconset=${h(this.flagIconset)}
      placeholder=${h(this.placeholder)}
      value=${h(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${h(this.infoMessage)}
      error-message=${h(this.errorMessage)}
      action-type=${h(this.actionType)}
      action-icon=${h(this.actionIcon)}
      action-icon-secondary=${h(this.actionIconSecondary)}
      action-accessible-text=${h(this.actionAccessibleText)}
      action-secondary-accessible-text=${h(this.actionSecondaryAccessibleText)}
      action-variant=${h(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${h(this.linkHref)}
      optional-label=${h(this.optionalLabel)}
      icon-variant=${h(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      ?invalid=${this.invalid}
      pattern=${h(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${h(this.allowedPattern)}
      inputmode=${h(this.modeInput)}
      maxlength=${h(this.maxlength)}
    ></bbva-form-text>`}get _formAmountTpl(){return b`<bbva-form-amount
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      placeholder=${h(this.placeholder)}
      help-icon=${h(this.helpIcon)}
      amount=${h(this.amount)}
      ?readonly=${this.readonly}
      info-message=${h(this.infoMessage)}
      ?disabled=${this.disabled}
      currency-code=${h(this.currencyCode)}
      local-currency=${h(this.localCurrency)}
      language=${h(this.language)}
      ?symbol-right=${this.symbolRight}
      error-message=${h(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      flag-iconset=${h(this.flagIconset)}
      ?show-card=${this.showCard}
      card-status=${this.cardStatus}
      card-variant=${this.cardVariant}
      card-type=${h(this.cardType)}
      pay-compatibility=${this.payCompatibility}
      ?partner=${this.partner}
      partner-logo=${h(this.partnerLogo)}
      card-image=${h(this.cardImage)}
      action-type=${h(this.actionType)}
      action-icon=${h(this.actionIcon)}
      action-icon-secondary=${h(this.actionIconSecondary)}
      action-accessible-text=${h(this.actionAccessibleText)}
      action-secondary-accessible-text=${h(this.actionSecondaryAccessibleText)}
      action-variant=${h(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${h(this.linkHref)}
      optional-label=${h(this.optionalLabel)}
      icon-variant=${h(this.iconVariant)}
      ?invalid=${this.invalid}
      pattern=${h(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${h(this.allowedPattern)}
      decimal-digits=${h(this.decimalDigits)}
      ?decimals-hidden=${this.decimalsHidden}
      ?trailing-zero-decimals-hidden=${this.trailingZeroDecimalsHidden}
      ?zero-decimals-hidden=${this.zeroDecimalsHidden}
      group-char=${h(this.groupChar)}
      separator-char=${h(this.separatorChar)}
      inputmode=${h(this.modeInput)}
      maxlength=${h(this.maxlength)}
    ></bbva-form-amount> `}get _formNumberTpl(){return b`<bbva-form-number
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${h(this.value)}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      flag-iconset=${h(this.flagIconset)}
      placeholder=${h(this.placeholder)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      help-icon=${h(this.helpIcon)}
      info-message=${h(this.infoMessage)}
      error-message=${h(this.errorMessage)}
      .min=${this.min}
      .max=${this.max}
      ?invalid=${this.invalid}
      action-type=${h(this.actionType)}
      action-icon=${h(this.actionIcon)}
      action-icon-secondary=${h(this.actionIconSecondary)}
      action-accessible-text=${h(this.actionAccessibleText)}
      action-secondary-accessible-text=${h(this.actionSecondaryAccessibleText)}
      action-variant=${h(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${h(this.linkHref)}
      optional-label=${h(this.optionalLabel)}
      icon-variant=${h(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      pattern=${h(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${h(this.allowedPattern)}
      inputmode=${h(this.modeInput)}
      maxlength=${h(this.maxlength)}
    ></bbva-form-number> `}get _formSearchTpl(){return b`<bbva-form-search
      ?autofocus=${this.autoFocus}
      label=${h(this.label)}
      label-out=${h(this.labelOut)}
      ?required=${this.required}
      value=${h(this.value)}
      .placeholder=${this.placeholder}
      ?readonly=${this.readonly}
      info-message=${h(this.infoMessage)}
      error-message=${h(this.errorMessage)}
      ?disabled-button=${this.disabledButton}
      help-icon=${h(this.helpIcon)}
      ?disabled=${this.disabled}
      allowed-pattern=${h(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${h(this.pattern)}
      variant=${h(this.variant)}
      icon-variant=${h(this.iconVariant)}
      ?invalid=${this.invalid}
      action-type=${h(this.actionType)}
      action-icon=${h(this.actionIcon)}
      action-icon-secondary=${h(this.actionIconSecondary)}
      action-accessible-text=${h(this.actionAccessibleText)}
      action-secondary-accessible-text=${h(this.actionSecondaryAccessibleText)}
      action-variant=${h(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${h(this.linkHref)}
      optional-label=${h(this.optionalLabel)}
      ?validate-on-blur=${this.validateOnBlur}
    ></bbva-form-search> `}get _formPasswordTpl(){return b`<bbva-form-password
      ?autofocus=${this.autoFocus}
      label=${h(this.label)}
      label-out=${h(this.labelOut)}
      ?required=${this.required}
      value=${h(this.value)}
      ?readonly=${this.readonly}
      info-message=${h(this.infoMessage)}
      pattern=${h(this.pattern)}
      help-icon=${h(this.helpIcon)}
      allowed-pattern=${h(this.allowedPattern)}
      error-message=${h(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      ?auto-validate=${this.autoValidate}
      name=${h(this.name)}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      .min=${this.min}
      .max=${this.max}
      action-variant=${h(this.actionVariant)}
      toggle-icon=${h(this.toggleIcon)}
      toggle-visible-icon=${h(this.toggleVisibleIcon)}
      toggle-icon-size=${h(this.toggleIconSize)}
      toggle-accessible-text=${h(this.toggleAccessibleText)}
      toggle-visible-accessible-text=${h(this.toggleVisibleAccessibleText)}
      ?visible=${this.visible}
      action-type=${h(this.actionType)}
      action-icon=${h(this.actionIcon)}
      action-icon-secondary=${h(this.actionIconSecondary)}
      action-accessible-text=${h(this.actionAccessibleText)}
      action-secondary-accessible-text=${h(this.actionSecondaryAccessibleText)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${h(this.linkHref)}
      optional-label=${h(this.optionalLabel)}
      icon-variant=${h(this.iconVariant)}
      ?hide-bottom-padding-info-message=${this.hideBottomPaddingInfoMessage}
      ><div slot="hints"><slot name="hint"></slot></div
    ></bbva-form-password> `}get _formTimeTpl(){return b` <bbva-form-time
      ?autofocus=${this.autoFocus}
      label=${h(this.label)}
      label-out=${h(this.labelOut)}
      ?required=${this.required}
      value=${h(this.value)}
      ?readonly=${this.readonly}
      info-message=${h(this.infoMessage)}
      error-message=${h(this.errorMessage)}
      help-icon=${h(this.helpIcon)}
      pattern=${h(this.pattern)}
      ?auto-validate=${this.autoValidate}
      ?validate-on-blur=${this.validateOnBlur}
      .min=${this.min}
      .max=${this.max}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      action-type=${h(this.actionType)}
      action-icon=${h(this.actionIcon)}
      action-icon-secondary=${h(this.actionIconSecondary)}
      action-accessible-text=${h(this.actionAccessibleText)}
      action-secondary-accessible-text=${h(this.actionSecondaryAccessibleText)}
      action-variant=${h(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${h(this.linkHref)}
      optional-label=${h(this.optionalLabel)}
      icon-variant=${h(this.iconVariant)}
    ></bbva-form-time>`}get _formTextareaTpl(){return b` <bbva-form-textarea
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${h(this.value)}
      ?readonly=${this.readonly}
      info-message=${h(this.infoMessage)}
      ?disabled=${this.disabled}
      maxlength=${h(this.maxlength)}
      minlength=${h(this.minlength)}
      ?auto-validate=${this.autoValidate}
      error-message=${h(this.errorMessage)}
      ?autofocus=${this.autoFocus}
      ?invalid=${this.invalid}
      help-icon=${h(this.helpIcon)}
      ?validate-on-blur=${this.validateOnBlur}
      character-counter-label=${h(this.characterCounterLabel)}
      pattern=${h(this.pattern)}
      allowed-pattern=${h(this.allowedPattern)}
    ></bbva-form-textarea>`}_inputTpl(t){return{text:this._formTextTpl,camera:this._formAttachTpl,contact:this._formAttachTpl,amount:this._formAmountTpl,date:this._formDateTpl,number:this._formNumberTpl,search:this._formSearchTpl,time:this._formTimeTpl,password:this._formPasswordTpl,textarea:this._formTextareaTpl}[t]}_onSlotsChange(t){const{slotName:e,contentSlots:i}=t.detail;"hint"===e&&(this._hasHints=Boolean(i.length),this.hideBottomPaddingInfoMessage=this._hasHints)}render(){return b` ${this._inputTpl(this.type)} `}}const _a=new a;var Sa=i`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1em);
  position: relative;
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${m(u.primarySubduedLight)})));
  --_notification-message-icon-color: var(--bbva-notification-message-dark-mode-icon-color, var(--bbva-notification-message-icon-color, var(--colorsPrimaryCoreDark, ${m(u.primaryCoreDark)})));
  --_notification-message-information-icon-color: var(--bbva-notification-message-dark-mode-information-icon-color, var(--bbva-notification-message-information-icon-color, var(--colorsTertiaryType3Dark, ${m(u.tertiaryType3Dark)})));
  --_notification-message-success-icon-color: var(--bbva-notification-message-dark-mode-success-icon-color, var(--bbva-notification-message-success-icon-color, var(--colorsTertiaryType6Dark, ${m(u.tertiaryType6Dark)})));
  --_notification-message-error-icon-color: var(--bbva-notification-message-dark-mode-error-icon-color, var(--bbva-notification-message-error-icon-color, var(--colorsTertiaryType1Dark, ${m(u.tertiaryType1Dark)})));
  --_notification-message-sustainability-icon-color: var(--bbva-notification-message-dark-mode-sustainability-icon-color, var(--bbva-notification-message-sustainability-icon-color, var(--colorsPrimaryVariantDark, ${m(u.primaryVariantDark)})));
  --_notification-message-information-background-color: var(--bbva-notification-message-dark-mode-information-background-color, var(--bbva-notification-message-information-background-color, var(--colorsTertiaryType3Lightened, ${m(u.tertiaryType3Lightened)})));
  --_notification-message-success-background-color: var(--bbva-notification-message-dark-mode-success-background-color, var(--bbva-notification-message-success-background-color, var(--colorsTertiaryType6Lightened, ${m(u.tertiaryType6Lightened)})));
  --_notification-message-error-background-color: var(--bbva-notification-message-dark-mode-error-background-color, var(--bbva-notification-message-error-background-color, var(--colorsTertiaryType5Lightened, ${m(u.tertiaryType5Lightened)})));
  --_notification-message-sustainability-background-color: var(--bbva-notification-message-dark-mode-sustainability-background-color, var(--bbva-notification-message-sustainability-background-color, var(--colorsPrimaryVariantLightened, ${m(u.primaryVariantLightened)})));
  --_notification-message-title-color: var(--bbva-notification-message-dark-mode-title-color, var(--bbva-notification-message-title-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_notification-message-paragraph-color: var(--bbva-notification-message-dark-mode-paragraph-color, var(--bbva-notification-message-paragraph-color, var(--colorsSecondary600, ${m(u.secondary600)})));
  --_text-weight: var(--bbva-notification-message-dark-mode-text-weight, var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${m(g.book.fontWeight)})));
  --skeleton-quote-color: var(--bbva-notification-message-dark-mode-skeleton-color, var(--bbva-notification-message-skeleton-color, var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)})));
  --skeleton-quote-bg: var(--bbva-notification-message-dark-mode-skeleton-bg-color, var(--bbva-notification-message-skeleton-bg-color, var(--colorsPrimarySubduedLight, ${m(u.primarySubduedLight)})));
  --_notification-message-skeleton-animated-layer-bg: var(--bbva-notification-message-dark-mode-skeleton-animated-layer-bg-color, var(--colorsPrimaryCoreLightened, ${m(u.primaryCoreLightened)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${m(p.typeLarge)}));
}

.paragraph {
  color: var(--_notification-message-paragraph-color);
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${m(p.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${m(v.typeSmall)}));
}
.paragraph:not(.no-space) {
  padding: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-paragraph]) > .paragraph {
  padding: 0;
}

.description {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${m(g.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${m(g.medium.fontWeight)});
}

:host([description][description-text-italic]) > .description {
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${m(g.mediumItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${m(g.mediumItalic.fontWeight)});
}

[data-tag-name=bbva-icon] {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  --bbva-icon-color: var(--_notification-message-icon-color);
}

[data-tag-name=bbva-link]:not(.no-space) {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-link]) [data-tag-name=bbva-link] {
  padding: 0;
}

[data-tag-name=bbva-button-default][variant="icon no-background"] {
  position: absolute;
  top: 0;
  right: 0;
}

:host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([variant=information]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-information-icon-color);
}

:host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([variant=success]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-success-icon-color);
}

:host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([variant=error]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-error-icon-color);
}

:host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([variant=sustainability]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-sustainability-icon-color);
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  overflow: hidden;
  opacity: 1;
  height: 10.125rem;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 24px 24px, calc((87% * 2) + (16px/ 2)) 16px, calc((87% * 2) + (16px/ 2)) 16px, calc((64.5% * 2) + (16px/ 2)) 16px;
  background-position: 50% 32px, -7% 72px, -7% 96px, -17.3% 120px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: inherit;
  top: 0;
  right: 0;
  left: 6.25rem;
}
:host([loading]):host([variant=default]) .skeleton {
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${m(u.primarySubduedLight)})));
}
:host([loading]):host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=information]) .skeleton {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=success]) .skeleton {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=error]) .skeleton {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([loading]):host([variant=sustainability]) .skeleton {
  background-color: var(--_notification-message-sustainability-background-color);
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${_a.mediaRules()}`;class La extends(r(x(W(o)))){static get is(){return"bbva-notification-message"}static get scopedElements(){return{"bbva-button-default":vt,"bbva-link":rt,"bbva-icon":k,"bbva-text":_}}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},description:{type:String},tagTitle:{type:String,attribute:"tag-title"},linkTitle:{type:String,attribute:"link-title"},linkIcon:{type:String,attribute:"link-icon"},buttonText:{type:String,attribute:"button-text"},href:{type:String},loading:{type:Boolean,reflect:!1},variant:{type:String,reflect:!0},iconClose:{type:Boolean,attribute:"icon-close"},hideBottomPaddingParagraph:{type:Boolean,attribute:"hide-bottom-padding-paragraph"},hideBottomPaddingLink:{type:Boolean,attribute:"hide-bottom-padding-link"},descriptionTextItalic:{type:Boolean,attribute:"description-text-italic"},accessibilityLinkLabel:{type:String,attribute:"accessibility-link-label"}}}constructor(){super(),this.iconClose=!1,this.iconSize=24,this.variant="default",this._types={default:s(),information:Nt(),success:c(),error:l(),sustainability:Ht()},this.hideBottomPaddingParagraph=!1,this.hideBottomPaddingLink=!1,this.descriptionTextItalic=!1,this.loading=!1,this.accessibilityLinkLabel="bbva-notification-message-accessibility-link-label",this._accessibilityTextIcon="bbva-notification-message-accessibility-icon-text-",this.tagTitle="p"}static get styles(){return[super.styles,Sa,d("bbva-notification-message-shared-styles"),ct.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.isRoleAlert?this.setAttribute("role","alert"):this.setAttribute("role","status"),this.disabledTabindex=!0}get isRoleAlert(){return"error"===this.variant}get _icon(){return this.icon?this.icon:this._types[this.variant]||s()}get _closeIcon(){return this.iconClose&&"default"===this.variant?b`
          <bbva-button-default
            variant="icon no-background"
            .icon="${gt()}"
            @click="${this._iconClick}"
            aria-label="${this.t("bbva-notification-message-close")}"
          >
          </bbva-button-default>
        `:G}get _title(){return this.messageTitle?b`
          <bbva-text
            .tag="${this.tagTitle}"
            alignment="center"
            .text="${this.messageTitle}"
            class="title"
            unset
            size="M"
          ></bbva-text>
        `:G}get _paragraph(){return b`<div
      class="paragraph
            ${nt({"no-space":!this.buttonText&&!this.linkTitle})}"
    >
      ${this.message?b`<bbva-text alignment="center" text=${this.message} unset size="S"></bbva-text> `:b`<slot></slot>`}
    </div>`}get _description(){return this.description?b` <bbva-text
          class="description"
          alignment="center"
          .text=${this.description}
          unset
          size="S"
        ></bbva-text>`:G}get _link(){return this.linkTitle?b`
          <bbva-link
            aria-label="${this.t(this.accessibilityLinkLabel)}"
            class="${nt({"no-space":!this.buttonText})}"
            variant="message"
            .href="${this.href}"
            @click="${this._linkClick}"
            .icon="${this.linkIcon}"
          >
            <span>${this.linkTitle}</span>
          </bbva-link>
        `:G}get _button(){return this.buttonText?b`
          <bbva-button-default
            ambient="light"
            data-tag-name="bbva-button-default"
            text="${this.buttonText}"
            @click="${this._buttonClick}"
          ></bbva-button-default>
        `:G}get _accessibilityIconDescription(){return`${this._accessibilityTextIcon}${this.variant}`}_iconClick(){this.dispatchEvent(new CustomEvent("notification-message-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return b`${this.loading?b`<div class="skeleton"></div> `:b` ${this._closeIcon}
          <bbva-icon
            data-tag-name="bbva-icon"
            role="img"
            aria-label=${this.t(this._accessibilityIconDescription)}
            .icon="${this._icon}"
            .size="${this.iconSize}"
          ></bbva-icon>
          ${this._title} ${this._paragraph} ${this._description} ${this._link} ${this._button}`}`}}customElements.define(La.is,La),customElements.define(ie.is,ie);const Ta=new a;var wa=i`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${m(u.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${m(f.spacer)}))) / 16) * 1rem);
}
${Ta.mediaRules()}`;const Ca=new a;var Ia=i`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${m(u.secondary300)});
}
${Ca.mediaRules()}`;const Ea=new a;var Ma=i`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${m(u.secondary300)});
}
${Ea.mediaRules()}`;const Pa={dark:i`
    ${Ma}
  `,light:i`
    ${Ia}
  `};class Va extends(r(o)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[wa,Pa.light,Pa.dark,d("bbva-divider-shared-styles")]}render(){return b` <hr divider="${this.size}" /> `}}customElements.define(Va.is,Va);var za=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Ba extends(r(x(o))){static get is(){return"card-operative-limits-edit"}static get scopedElements(){const t=[Z,Gt,Kt,ka,La,ie,Va,ae,Qe,vt];return Ba.scopedElementsFromClasses(t)}static get properties(){return{openModalEdit:{type:Boolean},listSimpleItems:{type:Array},listLegendItems:{type:Array},selectLimit:{type:Array},amountLimits:{type:String},textLimits:{type:String},disposedLimits:{type:String},available:{type:String},limitId:{type:String},inputAmount:{type:String},_typology:{type:String},flagReviewInput:{type:Boolean},inputText:{type:String},inputTextError:{type:String},buttonEdit:{type:Object},inputModal:{type:String},isFirstTime:{type:Boolean},idDailyLimit:{type:String,state:!0}}}constructor(){super(),this.openModalEdit=!1,this.listSimpleItems=[],this.amountLimits="",this.textLimits="",this.disposedLimits="0",this.available="0",this.listLegendItems=[],this.limitId="",this.selectLimit=[],this.inputAmount="",this._typology="",this.flagReviewInput=!1,this.inputText="",this.inputTextError="",this.buttonEdit={},this.inputModal="",this.isFistTime=!0,this.idDailyLimit="POS_DAILY"}static get styles(){return[za,d("card-operative-limits-edit-shared-styles")]}reset(){this.openModalEdit=!1,"object"==typeof this.inputAmount&&null!==this.inputAmount&&(this.inputAmount.value=""),this.listSimpleItems=[],this.amountLimits="",this.textLimits="",this.disposedLimits="0",this.available="0",this.listLegendItems=[],this.limitId="",this.selectLimit=[],this.flagReviewInput=!1,this.inputModal="",this.isFistTime=!0}updated(t){if(t.has("openModalEdit")&&!0===this.openModalEdit){const t=this.shadowRoot.querySelector("#card-operative-limits-edit-modal");this.buttonEdit=t.shadowRoot.querySelector('[data-tag-name="bbva-button-default"]'),this.inputModal=this.shadowRoot.querySelector("#amountFormInput"),this.inputAmount=this.inputModal.shadowRoot.querySelector("[data-tag-name='bbva-form-amount']"),this.buttonEdit.disabled=!0,t.open()}if(t.has("selectLimit")&&this.selectLimit.length>0){const t=this.selectLimit.shift();this.amountLimits=t.amountLimits||"",this.textLimits=t.text||"",this.disposedLimits=t.disposedLimits?t.disposedLimits.toString():"0",this.available=t.available||"0",this.limitId=t.limitId||"",this.listLegendItems=[{label:"card-operative-limits-modal-edit-legend-available",description:this._formatNumber(this.available)},{label:"card-operative-limits-modal-edit-legend-bought-today",description:this._formatNumber(this.disposedLimits)}]}this.inputText=`${this.t("card-operative-limits-modal-edit-preset")} ${this._formatNumber(this.available)}`}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_formatNumber(t){return new Intl.NumberFormat("es-MX",{style:"currency",currency:"MXN"}).format(t)}_continueButton(){const t=this.shadowRoot.querySelector("#card-operative-limits-edit-modal");if(null!==this.inputAmount){let e=this.inputAmount.value.replace(/[^0-9.-]+/g,"");e=parseFloat(e),this._fireEvent("edit-limit-clicked",{limitId:this.limitId,amount:e}),this.reset(),t.close()}}_closeButton(){this.reset(),this._fireEvent("close-modal-clicked",{typology:this._typology})}_clickOpenModal(t){const e="Compras"===t.target.text?"limite compras":"informacion limite retiros en cajeros";this._typology="Compras"===t.target.text?this.t("card-operative-limits-modal-edit-typology-shopping"):this.t("card-operative-limits-modal-edit-typology"),this._fireEvent("card-operative-limits-open-modal-purchase",{level4:e,text:t.target.text}),this._fireEvent("card-operative-limits-open-modal-purchase-started",{typology:this._typology})}_clickFormInput(){this._fireEvent("card-operative-limits-form-input-focus",{typology:this._typology})}_reviewInput(t){if("string"==typeof t.target.value){let e=t.target.value.replace(/[^0-9.-]+/g,"");e=parseFloat(e);0===e%50&&e<this.available&&e>0?(this.buttonEdit.disabled=!1,this.flagReviewInput=!1,this.inputText=`${this.t("card-operative-limits-modal-edit-text-input-alert")} ${this._formatNumber(this.available-50)}`,this.inputTextError="",this.shadowRoot.querySelector("#amountFormInput").setAttribute("info-message",this.inputText)):(this.buttonEdit.disabled=!0,this.flagReviewInput=!0,this.shadowRoot.querySelector("#amountFormInput").setAttribute("info-message",""),this.inputTextError=`${this.t("card-operative-limits-modal-edit-text-input-alert")} ${this._formatNumber(this.available-50)}`),""===this.inputModal&&!0===this.isFistTime&&(this.buttonEdit.disabled=!0,this.flagReviewInput=!0,this.inputText=`${this.t("card-operative-limits-modal-edit-preset")} ${this.amountDetail}`,this.inputTextError="",this.isFistTime=!1)}}render(){return b`
            <bbva-help-modal
                id="card-operative-limits-edit-modal"
                full-height
                fixed-footer
                header-type="modal"
                hidde-content-padding-top
                header-text="${this.limitId===this.idDailyLimit?`${this.t("card-operative-limits-header-edit")}`:`${this.t("card-operative-limits-header-edit-withdrawn")}`}"
                link-text="${this.t("card-operative-limits-modal-edit-link")}"
                button-text="${this.t("card-operative-limits-modal-edit-button")}"
                @help-modal-footer-button-click="${this._continueButton}"
                @help-modal-footer-link-click="${this._closeButton}"
                @header-main-icon-right-primary-click="${this._closeButton}"
            >
                <div slot="slot-title">
                    <bbva-type-amount variant="3xl" currency-code="USD" amount="${this.amountLimits}"></bbva-type-amount>
                    <bbva-type-text
                        alignment="center"
                        text="${this.t("card-operative-limits-modal-text-daily-limit")}"
                        tag="span"
                        text-color="#666666"
                        aria-label="${this.t("card-operative-limits-modal-text-daily-limit")}"
                    ></bbva-type-text>
                    <bbva-data-visualization-bar
                        accessibility-text="Minimum progress bar"
                        max-value="${this.available}"
                        current-value="${this.disposedLimits}"
                        >
                    </bbva-data-visualization-bar>
                    <bbva-data-visualization-tooltip
                        arrow-position-value="65"
                        .listLegendItems=${this.listLegendItems}
                        ></bbva-data-visualization-tooltip>
                </div>
                
                <div slot="slot-content">
                    <bbva-divider size="full"></bbva-divider>
                    <bbva-header-category
                        has-help
                        link-accessibility-text="Help"
                        text="${this.textLimits}"
                        @header-category-help-click="${this._clickOpenModal}"
                    ></bbva-header-category>
                    <bbva-form-input
                        id="amountFormInput"
                        type="amount"
                        currency-code="MXN"
                        local-currency="MXN"
                        label="${this.t("card-operative-limits-modal-input-text")}"
                        label-out="${this.t("card-operative-limits-modal-input-text-out")}"
                        info-message="${this.inputText}"
                        error-message="${this.inputTextError}"
                        ?invalid=${this.flagReviewInput}
                        @input="${this._reviewInput}"
                        @form-input-value-change="${this._reviewInput}"
                        @form-field-input-focus=${this._clickFormInput}
                    ></bbva-form-input>
                    <div>
                        <bbva-notification-message style="margin:10px;">
                        ${this.t("notification-message-limits-edit-parents")}
                        </bbva-notification-message>
                        
                    </div>
                </div>
            </bbva-help-modal>
        `}}class Aa extends(B(x(Ot(ue(o))))){static get is(){return"bbva-feature-card-operative-limits-update-youngsters"}static get scopedElements(){const t=[qt,ai,Ba,Ie,Me,Ve,Be,fe,pe,De,n];return Aa.scopedElementsFromClasses(t)}static get properties(){return{limitsListPage:{type:Boolean,attribute:"limits-list-page"},limitsEditPage:{type:Boolean,attribute:"limits-edit-page"},openModalEdit:{type:Boolean,attribute:"open-modal-edit"},limitsModalInfo:{type:Boolean,attribute:"limits-modal-info"},limitsModalInfoModal:{type:Boolean,attribute:"limits-modal-info-modal"},limitsModalInfoHeader:{type:Boolean,attribute:"limits-modal-info-header"},limitsModalError:{type:Boolean,attribute:"limits-modal-error"},limitsModalPurchases:{type:Boolean,attribute:"limits-modal-purchases"},openModalSuccess:{type:Boolean,attribute:"open-modal-success"},flagParentsView:{type:Boolean,attribute:"flag-parents-view"},host:{type:String,attribute:"host"},version:{type:String,attribute:"version"},native:{type:Boolean,attribute:"native"},requiredToken:{type:String,attribute:"required-token"},cardId:{type:String,attribute:"card-id"},isLimits:{type:Boolean,attribute:"is-limits"},arrayLimits:{type:Array,attribute:"array-limits"},listLimits:{type:Array,attribute:"list-limits"},amountSave:{type:Number,attribute:"amount-save"},selectLimit:{type:Array,attribute:"select-limit"},isLoading:{type:Boolean,attribute:"is-loading"},_typology:{type:String,attribute:"_typology"},textLimits:{type:String,attribute:"text-limits"},financialData:{type:Object,attribute:"financial-data"},currency:{type:String,attribute:"currency"}}}constructor(){super(),this.flagParentsView=!1,this.limitsListPage=!1,this.limitsEditPage=!1,this.openModalEdit=!1,this.limitsModalInfo=!1,this.limitsModalInfoModal=!1,this.limitsModalInfoHeader=!1,this.limitsModalError=!1,this.openModalSuccess=!1,this.limitsModalPurchases=!1,this.isLimits=!1,this.host="",this.version="",this.native=!1,this.requiredToken="",this.arrayLimits=[],this.listLimits=[],this.cardId="",this.amountSave=0,this.selectLimit=[],this.isLoading=!1,this._typology="",this.textLimits="",this.currency="",this.financialData={}}static get styles(){return[ye,d("bbva-feature-card-operative-limits-update-youngsters-shared-styles")]}init(){this.isLimits=!0,this.isLoading=!0}_reset(){this.limitsModalError=!1,this.openModalSuccess=!1,this.isLimits=!1,this.cardId="",this.amountSave=0,this.selectLimit={},this._typology="",this.textLimits="",this.resetlistLimits()}resetlistLimits(){this.arrayLimits=[],this.listLimits=[]}updated(t){if(t.has("isLimits")&&this.isLimits){this._setUpBbvaCardsLimitsDM(),this._getBbvaCardsLimitsApiDM();this.financialData.data.contracts.filter((t=>"ACCOUNT"===t.productType)).length>1?this.flagParentsView=!0:this.flagParentsView=!1,this.isLimits=!1}t.has("openModalSuccess")&&this.openModalSuccess&&setTimeout((()=>{this.openModalSuccess=!1}),2e3)}_openModalEditLimits(t){const e=t.detail;this.selectLimit=this.listLimits.filter((t=>t.limitId===e)),this.limitsListPage=!1,this.limitsEditPage=!0,this.openModalEdit=!0}_closeModalEdit(){this.limitsListPage=!0,this.limitsEditPage=!1,this.openModalEdit=!1,this.isLimits=!0}_closeModalInfo(){this.limitsModalInfo=!1,this.limitsListPage=!0}_closeModalInfoHeader(){this.limitsModalInfoHeader=!1,this.limitsListPage=!0}_retry(){this.limitsModalError=!1,this.isLimits=!0}_closeModalInfoPurchases(){this.limitsModalPurchases=!1,this.limitsListPage=!0}_openModalInfo(){this.limitsModalInfo=!0}_openModalControlParental(){this.limitsModalInfoHeader=!0}_openModalPurchases(t){this.limitsModalPurchases=!0,this.textLimits=t.detail.text}_setUpBbvaCardsLimitsDM(){this._limitsCardsDMLocal=this.shadowRoot.querySelector("#BbvaLocalCardsApiLimitsDm")}_getBbvaCardsLimitsApiDM(){this._limitsCardsDMLocal.getCardLimits(this.cardId)}_putBbvaCardsLimitsApiDM(t){const e=t.detail;this.amountSave=e.amount;const i={amountLimits:[{amount:e.amount,currency:this.currency}]};this._typology="ATM_DAILY"===e.limitId?this.t("card-operative-limits-modal-edit-typology"):this.t("card-operative-limits-modal-edit-typology-shopping"),this._limitsCardsDMLocal.putCardLimits(i,{"card-id":this.cardId,"limit-id":e.limitId})}_manageCardLimitsResponse({detail:t}){this.isLoading=!1,this.limitsListPage=!0,t.forEach((t=>{const e=t.amountLimits[0].amount-t.disposedLimits[0].amount,i={ATM_DAILY:"Retiro de efectivo en cajero automático",POS_DAILY:"Compras"}[t.id]||"";this.arrayLimits.push({limitId:t.id,text:i,amountLimits:t.amountLimits[0].amount,disposedLimits:t.disposedLimits[0].amount,available:e,icon:this.flagParentsView})})),this.listLimits=this.arrayLimits.slice(0,2),this.listLimits=this.listLimits.sort(((t,e)=>"POS_DAILY"===t.limitId?-1:"POS_DAILY"===e.limitId?1:t.limitId.localeCompare(e.text)))}_manageCardLimitsResponsePut(){this.resetlistLimits(),this._closeModalEdit(),this.isLoading=!0,this._appCompletedAnalytic(),this._modalSuccess()}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_appCompletedAnalytic(){this._fireEvent("app-completed-analytics-event",{amount:this.amountSave,currency:this.currency,typology:this._typology})}_modalSuccess(){this.openModalSuccess=!0}_BbvaLimitsCards(){return b`
    <bbva-local-cards-api-limits-dm
      id="BbvaLocalCardsApiLimitsDm"
      .host="${this.host}"
      .version="${this.version}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      @card-limits-api-dm-fetch="${this._manageCardLimitsResponse}"
      @card-limits-api-dm-fetch-error="${this._manageCardLimitsError}"
      @card-limits-api-dm-update="${this._manageCardLimitsResponsePut}">
    </bbva-local-cards-api-limits-dm>
    `}loader(){return b` ${this.isLoading?b`<bbva-progress-content
          visible
          ></bbva-progress-content
        >`:""}`}render(){return b`
      <bbva-transition-container id="cardOperativeLimitsList" ?visible="${this.limitsListPage}">
        <div slot="slot-content" class="container">
          ${this.loader()}
          ${this._BbvaLimitsCards()}
          <card-operative-limits-list
          .listLimits="${this.listLimits}"
          .flagParentsView="${this.flagParentsView}"
          @card-operative-limits-list-action-click=${this._openModalEditLimits}
          @card-operative-limits-open-modal-info=${this._openModalInfo}
          @card-operative-limits-open-modal-control-parental=${this._openModalControlParental}
          @reset-event=${this._reset}
          ></card-operative-limits-list>
          <card-operative-limits-toast-success
          .openModalSuccess="${this.openModalSuccess}"
          .amountSave="${this.amountSave}"
          ></card-operative-limits-toast-success>
        </div>
      </bbva-transition-container>
      <bbva-transition-container id="cardOperativeLimitsEdit" ?visible="${this.limitsEditPage}">
        <div slot="slot-content" class="container">
          <card-operative-limits-edit
          .openModalEdit="${this.openModalEdit}"
          .selectLimit="${this.selectLimit}"
          @close-modal-clicked="${this._closeModalEdit}"
          @edit-limit-clicked=${this._putBbvaCardsLimitsApiDM}
          @card-operative-limits-open-modal-purchase=${this._openModalPurchases}
          ></card-operative-limits-edit>
        </div>
      </bbva-transition-container>
      <bbva-transition-container id="cardOperativeLimitsModalInfo" ?visible="${this.limitsModalInfo}">
        <div slot="slot-content" class="container">
          <card-operative-limits-modal-info
          flagParentsView="${this.flagParentsView}"
          .limitsModalInfo="${this.limitsModalInfo}"
          @close-button-click-modal-info="${this._closeModalInfo}"
          ></card-operative-limits-modal-info>
        </div>
      </bbva-transition-container>
      <bbva-transition-container id="cardOperativeLimitsModalLimitsPurchases" ?visible="${this.limitsModalPurchases}">
        <div slot="slot-content" class="container">
          <card-operative-limits-modal-limit-purchases
          .limitsModalPurchases="${this.limitsModalPurchases}"
          .textLimits="${this.textLimits}"
          @close-button-click-modal-info-purchases="${this._closeModalInfoPurchases}"
          ></card-operative-limits-modal-limit-purchases>
        </div>
      </bbva-transition-container>
      <bbva-transition-container id="cardOperativeLimitsModalInfoHeader" ?visible="${this.limitsModalInfoHeader}">
        <div slot="slot-content" class="container">
          <card-operative-limits-modal-info-header
          flagParentsView="${this.flagParentsView}"
          .limitsModalInfoHeader="${this.limitsModalInfoHeader}"
          @close-button-click-modal-info-header="${this._closeModalInfoHeader}"
          ></card-operative-limits-modal-info-header>
        </div>
      </bbva-transition-container>
      <bbva-transition-container id="cardOperativeLimitsModalError" ?visible="${this.limitsModalError}">
        <div slot="slot-content" class="container">
          <card-operative-limits-modal-error
          .limitsModalError="${this.limitsModalError}"
          @close-button-click-modal-error="${this._retry}"
          @reset-event=${this._reset}
          ></card-operative-limits-modal-error>
        </div>
      </bbva-transition-container>
    `}}class Da extends Aa{static get is(){return"bbva-feature-card-operative-limits-update-youngsters-mx"}static get properties(){return{}}}customElements.define(Da.is,Da);
