import{z as t,ar as e,a as i,L as a,y as o,ah as s,aN as r,ai as n,ak as l,h as c,i as d,a8 as h,ac as p,ad as m,ab as b,a9 as g,aa as u,cO as v,b1 as y,an as f,F as _,ag as x,G as k,el as $,em as L,f as S,cG as w,g as T,ap as E,b$ as C,bx as P,c0 as I,H as M,aX as D,u as z,cI as O,cJ as N,aD as B,J as A,cS as V,b0 as R,cH as F,bU as q,b6 as j,aI as H,aJ as X,dK as U,aL as Y,cU as G,dj as W,bF as J,aV as K,av as Z,ch as Q,b3 as tt,di as et}from"./952f98a9.js";import{B as it,a as at}from"./1201cfdf.js";import"./51384888.js";import{G as ot,x as st,H as rt,a2 as nt,D as lt}from"./216055dc.js";import"./7f3d7ca9.js";import{B as ct}from"./5e7550b1.js";import{b as dt,B as ht}from"./30ef6f1f.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";var pt=t`:host {
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
${(new e).mediaRules()}`;class mt extends(i(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":o}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:s(),warning:s(),error:r(),success:n()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const o=i;this._stack.push({type:o,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[pt,l("bbva-notification-container-shared-styles")]}render(){return c`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${d(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${d(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}const bt=new e;var gt=t`:host {
  --_bg-color: var(--bbva-progress-content-dark-mode-bg-color, var(--bbva-progress-content-bg-color, var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)})));
  --_spinner-size: var(--bbva-progress-content-spinner-size, 3rem);
  --_spinner-message-color: var(--bbva-progress-content-dark-mode-spinner-message-color, var(--bbva-progress-content-spinner-message-color, var(--colorsSecondary600, ${h(g.secondary600)})));
  --_spinner-message-size: var(--bbva-progress-content-spinner-message-size, 0.9375rem);
  --_small-spinner-size: var(--bbva-progress-content-small-spinner-size, 2rem);
  --_login-bg-color: var(--bbva-progress-content-dark-mode-login-bg-color, var(--bbva-progress-content-login-bg-color, var(--colorsPrimaryCore, ${h(g.primaryCore)})));
  --_login-content-bg-color: var(--bbva-progress-content-dark-mode-login-content-bg-color, var(--bbva-progress-content-login-content-bg-color, var(--colorsPrimaryCoreDarkened, ${h(g.primaryCoreDarkened)})));
  --_login-content-text-color: var(--bbva-progress-content-dark-mode-login-text-color, var(--bbva-progress-content-login-text-color, var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)})));
  --_login-success-animation-duration: var(--bbva-progress-content-login-success-animation-duration, 1000ms);
  --_login-success-animation-delay: var(--bbva-progress-content-login-success-animation-delay, 0ms);
  --_content-height: calc(calc(((13 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem) + 3rem);
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
  font-size: var(--typographyTypeSmall, ${h(p.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${h(m.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(b.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(b.medium.fontStyle)});
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
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1em);
}
.overlay p {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
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
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem) 0;
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
  padding: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  color: var(--_login-content-text-color);
}

.icon {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
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
${bt.mediaRules()}`;const ut=new e;var vt=t`[ambient^=dark] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreLight, ${h(g.primaryCoreLight)});
  --bbva-progress-content-mask-display: none;
  --bbva-progress-content-no-mask-display: block;
}

[ambient^=dark200] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCore, ${h(g.primaryCore)});
}

[ambient^=dark300] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDark, ${h(g.primaryCoreDark)});
}

[ambient^=dark400] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDarkened, ${h(g.primaryCoreDarkened)});
}
${ut.mediaRules()}`;var yt=t`[ambient^=light] {
  --bbva-progress-content-bg-color: initial;
  --bbva-progress-content-mask-display: initial;
  --bbva-progress-content-no-mask-display: initial;
}
${(new e).mediaRules()}`;const ft={dark:t`
    ${v.dark}
    ${y.dark}
    ${vt}
  `,light:t`
    ${v.light}
    ${y.light}
    ${yt}
  `};class _t extends(i(f(a))){static get is(){return"bbva-progress-content"}static get scopedElements(){return{"bbva-icon":_,"bbva-text":x,"bbva-spinner":k}}static get properties(){return{variant:{type:String,reflect:!0},loginIcon:{type:String,attribute:"login-icon"},loginIconSize:{type:String,attribute:"login-icon-size"},loginSuccessIcon:{type:String,attribute:"login-success-icon"},loginMessageLabels:{type:Array,attribute:"login-message-labels"},loginSuccessMessageLabel:{type:String,attribute:"login-success-message-label"},loginMessageTimer:{type:Number,attribute:"login-message-timer"},loginAnimation:{type:Boolean,attribute:"login-animation",reflect:!0},loginSuccessful:{type:Boolean,attribute:"login-successful",reflect:!0},_loginMessageLabel:{type:String},spinnerMessageLabel:{type:String,attribute:"spinner-message-label"},showSpinnerMessageLabel:{type:Boolean,attribute:"show-spinner-message-label"},visible:{type:Boolean,reflect:!0}}}constructor(){super(),this.variant="full",this.loginIcon=$(),this.loginSuccessIcon=L(),this.loginIconSize="M",this.loginSuccessful=!1,this._loginMessageLabel="",this.loginMessageLabels=["bbva-progress-content-login-verifying-credentials","bbva-progress-content-login-connecting-bbva"],this.loginSuccessMessageLabel="bbva-progress-content-login-loading-products",this.loginMessageTimer=3e3,this.loginAnimation=!1,this.spinnerMessageLabel="bbva-progress-content-login-loading-message",this.showSpinnerMessageLabel=!1,this.visible=!1}get _getLoginIcon(){return this.loginSuccessful?this.loginSuccessIcon:this.loginIcon}get _loginIconSize(){const t={S:16,M:24,L:32},e=parseInt(this.loginIconSize,10);return Object.values(t).includes(e)?e:t[this.loginIconSize]||24}updated(t){super.updated&&super.updated(t),(t.has("loginSuccessful")||t.has("variant"))&&"login"===this.variant&&(this.loginSuccessful?this._setLoginSuccess():this._setLoginInProcess()),t.has("visible")&&void 0!==t.get("visible")&&this._notifyVisibleChanged()}static get styles(){return[gt,ft.dark,ft.light,l("bbva-progress-content-shared-styles")]}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowProgressContent=this._showLoader.bind(this),this._boundHideProgressContent=this._hideLoader.bind(this),this._parentElement.addEventListener("show-loader",this._boundShowProgressContent),this._parentElement.addEventListener("hide-loader",this._boundHideProgressContent)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._parentElement.removeEventListener("show-loader",this._boundShowProgressContent),this._parentElement.removeEventListener("hide-loader",this._boundHideProgressContent)}render(){return c`
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

      ${"login"===this.variant?c`
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
    `}_onAnimationEnd(t){"content"===t.animationName&&this._fireEvent("progress-content-success-login-click")}_fireEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}_setLoginInProcess(){const[t]=this.loginMessageLabels;this._loginMessageLabel=t,this._loadingMessageInterval=setInterval((()=>{const t=this.loginMessageLabels.indexOf(this._loginMessageLabel),e=this.loginMessageLabels[t+1]||this.loginMessageLabels[0];this._loginMessageLabel=e}),this.loginMessageTimer),this._fireEvent("progress-content-start-login-click")}_setLoginSuccess(){clearInterval(this._loadingMessageInterval),this._loginMessageLabel=this.loginSuccessMessageLabel,this.loginAnimation||this._fireEvent("progress-content-success-login-click")}_notifyVisibleChanged(){this._fireEvent("progress-content-visible-changed",this.visible)}loginSuccess(){this.loginSuccessful=!0}loginReset(){this.loginSuccessful=!1}show(){this.visible=!0}showCustom({variant:t="full",showSpinnerMessageLabel:e=!1,loginAnimation:i=!1}){this.variant=t,this.showSpinnerMessageLabel=e,this.loginAnimation=i,this.show()}_showLoader(t){this.showCustom(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}hide(){this.visible=!1}_hideLoader(t){this.hide(),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}}T("colors.cool90"),T("colors.primaryCoreLightened"),T("colors.cool90"),T("colors.cool70"),T("colors.primaryCoreLightened");var xt=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${h(g.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(g.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${h(g.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${h(g.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${h(g.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(g.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${h(g.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${h(p.typeMedium)}));
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
`;class kt extends(i(E(f(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":x,"bbva-icon":_,"bbva-badge-notification":C}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[xt,l("bbva-header-main-shared-styles"),P("button:focus"),y.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return c`<bbva-icon icon="${d(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return c`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const o=kt.toCamelCase(t),s=`icon${o}`,r=`accessibilityTextIcon${o}`;return c`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${d(this.t(this[r]))}"
      aria-expanded=${d(a)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return c` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${d(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return c`
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:o}=this;return c`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(o||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${d(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${o}"
            ?hidden="${!o}"
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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}T("colors.primaryCoreLightened"),T("colors.cool80"),T("colors.cool70"),T("colors.primaryCoreLightened"),T("colors.cool100"),T("colors.tertiaryType6Darkened"),T("colors.tertiaryType4Darkened"),T("colors.secondary300");const $t=M((t=>class extends(D(t)){static configurationScopedElements(){return[mt,_t,kt,z]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),c`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||O();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&N()||this.config.faqs&&B())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const o={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",o)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return c`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return c`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));customElements.define(_t.is,_t);class Lt extends(A(a)){static get is(){return"bbva-local-limits-api-dm"}static get properties(){return{operativeLimitPeriods:{type:Array,attribute:!1}}}constructor(){super(),this.operativeLimitPeriods=[]}resetOperativeLimitPeriods(){this.operativeLimitPeriods=[]}getOperativeLimitPeriodsAccounts(t,e){if(Object.keys(this.operativeLimitPeriods).length)return;const i={"operative-limit-id":t,"account-id":e};this._generateGetService(this._getServiceAccounts("get",{},i),{customEvent:"operative-limit-periods-accounts-api-dm-fetch",errorFireEventHandler:"operative-limit-periods-accounts-api-dm-fetch-error"},this._responseMapping,i.fields)}patchOperativeLimitPeriods(t,e,i){const a={"operative-limit-id":t,"account-id":e};this._generateGetService(this._getServiceAccounts("patch",i,a),{customEvent:"operative-limit-periods-api-dm-update",errorFireEventHandler:"operative-limit-periods-api-dm-update-error"},this._responseMapping),this.resetOperativeLimitPeriods()}_getServiceAccounts(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}OperativeLimitPeriodsAccounts`,this._getBgadp(a))}_getBgadp(t){return{getOperativeLimitPeriodsAccountsV1:()=>new it(t),patchOperativeLimitPeriodsAccountsV1:()=>new at(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}var St=t`/* eslint-disable no-unused-vars */
:host {
  display: block;
  box-sizing: border-box;
}
:host[hidden], :host [hidden] {
  display: none !important;
}
`;class wt extends(i(f(a))){static get is(){return"operational-limits-toast-success"}static get scopedElements(){const t=[o,ot];return wt.scopedElementsFromClasses(t)}static get properties(){return{amount:{type:String,attribute:"amount"},amountSave:{type:Number,attribute:"amount-number"},toastOpened:{type:Boolean,attribute:"toast-opened"}}}constructor(){super(),this.amount="",this.amountSave=0,this.toastOpened=!1}static get styles(){return[St,l("operational-limits-modal-success-shared-styles")]}updated(t){if(t.has("toastOpened")&&this.toastOpened&&(this.toastOpened=!0),t.has("toastOpened")&&!this.toastOpened&&(this.toastOpened=!1),t.has("amountSave")&&this.amountSave>0){const t=parseInt(this.amountSave,10);this.amount=this._formatNumber(t)}}_formatNumber(t){return new Intl.NumberFormat("es-MX",{style:"currency",currency:"MXN"}).format(t)}render(){return c`
        <bbva-notification-toast pusher ?show="${this.toastOpened}" type="success" icon-explainer="${n()}">
          <bbva-type-text
          text-color="#FFFFFF"
          alignment="center"
          text="${this.t("operational-limits-edit-success")}"
          tag="span"
          ></bbva-type-text>
        </bbva-notification-toast>
    `}}var Tt=t`/* eslint-disable no-unused-vars */
:host {
  display: block;
  box-sizing: border-box;
}
:host[hidden], :host [hidden] {
  display: none !important;
}

[slot=slot-footer] {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 16px;
  transform: translateZ(0.01px);
}
`;class Et extends(i(f($t(a)))){static get is(){return"operational-limits-modal-error"}static get scopedElements(){const t=[F,st,ot,q,j];return Et.scopedElementsFromClasses(t)}static get properties(){return{typeError:{type:String}}}constructor(){super(),this.typeError=""}static get styles(){return[Tt,l("operational-limits-modal-error-shared-styles"),V.light,R.light]}openModalError(){this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]').open()}closeModalError(){this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]').close()}updated(){const t=this.shadowRoot.querySelector('bbva-help-modal[data-tag-name="bbva-help-modal"]');if("patch"===this.typeError){const e=t.querySelector('bbva-button-default[data-tag-name="bbva-button-default"]');null==e||e.remove()}}_retryButton(){this.typeError="",this._dispatchCustomEvent("close-button-click-modal-error")}_closeButton(){this._dispatchCustomEvent("reset-event"),"patch"===this.typeError&&this._dispatchCustomEvent("parental-control-account-limits-go-back"),this.typeError=""}render(){return c`
      <bbva-help-modal
          fixed-footer
          full-height
          header-type="modal"
          header-text="${this.t("operational-limits-header")}"
      >
      <div slot="slot-title">
          <bbva-type-icon icon=${r()} size="32" icon-color="#B92A45"></bbva-type-icon>
      </div>
      <div slot="slot-content">
          <bbva-type-text 
          font-weight="500" 
          alignment="center" 
          text="${this.t("operational-limits-modal-error-title")}"
          ></bbva-type-text>
          <bbva-type-text 
          text-color="#666666" 
          alignment="center" 
          text="${this.t("operational-limits-modal-error-detail")}"
          ></bbva-type-text>
      </div>
      <div slot="slot-footer">
        <bbva-button-default
        ambient="light"
        data-tag-name="bbva-button-default"
        text="${"get"===this.typeError?this.t("operational-limits-modal-button-error"):this.t("operational-limits-modal-link-error")}"
        @click="${"get"===this.typeError?this._retryButton:this._closeButton}">
          ${this.buttonText}
        </bbva-button-default>
        ${"get"===this.typeError?c`<bbva-link
            ambient="light"
            class="footer-button"
            data-tag-name="bbva-link"
            ?disabled="${this.disabledLink}"
            @click="${this._closeButton}"
            >${this.t("operational-limits-modal-link-error")}</bbva-link
          >`:null}
      </div>
      </bbva-help-modal>
        `}}const Ct=new e;var Pt=t`:host {
  display: flex;
  box-sizing: border-box;
  position: relative;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1em);
  color: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary600, ${h(g.secondary600)})));
  font-size: var(--typographyTypeSmall, ${h(p.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${h(m.typeSmall)});
  --_list-bullet-icon-color: var(--bbva-list-bullet-icon-dark-mode-color, var(--bbva-list-bullet-icon-color, var(--colorsPrimaryMedium, ${h(g.primaryMedium)})));
  --_list-bullet-skeleton-quote-color: var(--bbva-list-bullet-quote-dark-mode-color, var(--bbva-list-bullet-quote-color, var(--colorsSecondary200, ${h(g.secondary200)})));
  --_list-bullet-skeleton-quote-bg: var(--bbva-list-bullet-quote-bg-dark-mode-color, var(--bbva-list-bullet-quote-bg, transparent));
  --_list-bullet-skeleton-animated-layer-bg: var(--bbva-list-bullet-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-list-bullet-skeleton-animated-layer-bg, var(--ambientsLight, ${h(H.light)})));
  --_bbva-list-bullet-dark-mode-color: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary600, ${h(g.secondary600)})));
  --_bbva-list-bullet-dark-mode-color-soft-highlight: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary500, ${h(g.secondary500)})));
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
  margin-top: calc(((0.375 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
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
${Ct.mediaRules()}`;var It=t`[ambient^=light] {
  --bbva-list-bullet-color: initial;
  --bbva-list-bullet-icon-color: initial;
  --bbva-list-bullet-quote-color: initial;
  --bbva-list-bullet-quote-bg: initial;
  --bbva-list-bullet-skeleton-animated-layer-bg: initial;
}
${(new e).mediaRules()}`;const Mt=new e;const Dt={light:t`
    ${It}
  `,dark:t`
    ${t`[ambient^=dark] {
  --bbva-list-bullet-color: var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)});
  --bbva-list-bullet-icon-color: var(--colorsPrimaryVariant, ${h(g.primaryVariant)});
  --bbva-list-bullet-quote-color: var(--colorsPrimaryMedium, ${h(g.primaryMedium)});
  --bbva-list-bullet-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${h(g.primaryCore)});
}
${Mt.mediaRules()}`}
  `};class zt extends(i(X(a))){static get is(){return"bbva-list-bullet"}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},softHighlight:{type:Boolean,reflect:!0,attribute:"soft-highlight"}}}static get scopedElements(){return{"bbva-icon":_,"bbva-text":x}}constructor(){super(),this.icon=U(),this.iconSize=16,this.text="",this.loading=!1}static get styles(){return[super.styles,Pt,Dt.light,Dt.dark,l("bbva-list-bullet-shared-styles")]}render(){return c`${this.loading?c` <div class="skeleton"></div> `:c`
          <bbva-icon .icon=${this.icon} .size=${this.iconSize}></bbva-icon>
          <slot>
            <bbva-text .text=${this.text} unset size="S"></bbva-text>
          </slot>
        `}`}}customElements.define(zt.is,zt);var Ot=t`/* eslint-disable no-unused-vars */
:host {
  display: block;
  box-sizing: border-box;
}
:host[hidden], :host [hidden] {
  display: none !important;
}
`;class Nt extends(i(f($t(a)))){static get is(){return"operational-limits-detail-page"}static get scopedElements(){const t=[F,Y,x,zt];return Nt.scopedElementsFromClasses(t)}static get properties(){return{flagParentsView:{type:Boolean},openModal:{type:Boolean,attribute:"open-modal"},_infoListParentsView:{type:Array},_infoListYoungstersView:{type:Array}}}constructor(){super(),this.flagParentsView=!1,this.openModal=!1,this._infoListParentsView=["operational-limits-detail-modal-info-list-parents-view-1","operational-limits-detail-modal-info-list-parents-view-2"],this._infoListYoungstersView=["operational-limits-detail-modal-info-list-youngster-view-1","operational-limits-detail-modal-info-list-youngster-view-2"]}static get styles(){return[Ot,l("bbva-feature-operational-limits-youngsters-shared-styles")]}_changedLocalesView(t,e,i){const a=this.flagParentsView?e:i;return"text"===t?c`<bbva-text .text="${a}" alignment="center"></bbva-text>`:c`${a.map((t=>c`<bbva-list-bullet text="${t}" id="index"></bbva-list-bullet>`))}`}_closeModalDetail({detail:t}){this._dispatchCustomEvent("link-clicked-continue"),this.openModal=!t}render(){return c`
      <bbva-help-modal
        full-height
        fixed-footer
        header-type="modal"
        hidde-content-padding-top
        ?visible="${this.openModal}"
        accessibility-text-icon-right-primary="Continuar"
        header-text="${this.t("operational-limits-header")}"
        button-text="${this.t("operational-limits-modal-button")}"
        @help-modal-footer-button-click= "${this._closeModalDetail}"
        @header-main-icon-right-primary-click="${this._closeModalDetail}"
        >
        <div slot="slot-title">
          <bbva-clip-microillustration microillustration="speedometer" size="XL"></bbva-clip-microillustration>
          ${this._changedLocalesView("text",this.t("operational-limits-detail-modal-panel-info-text-parents-view"),this.t("operational-limits-detail-modal-panel-info-text-youngsters-view"))}
        </div>
        <div slot="slot-content">
          ${this._changedLocalesView("list",this._infoListParentsView,this._infoListYoungstersView)}
        </div>
      </bbva-help-modal>
    `}}customElements.define(Nt.is,Nt),customElements.define(kt.is,kt);const Bt=new e;var At=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1em);
  position: relative;
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${h(g.primarySubduedLight)})));
  --_notification-message-icon-color: var(--bbva-notification-message-dark-mode-icon-color, var(--bbva-notification-message-icon-color, var(--colorsPrimaryCoreDark, ${h(g.primaryCoreDark)})));
  --_notification-message-information-icon-color: var(--bbva-notification-message-dark-mode-information-icon-color, var(--bbva-notification-message-information-icon-color, var(--colorsTertiaryType3Dark, ${h(g.tertiaryType3Dark)})));
  --_notification-message-success-icon-color: var(--bbva-notification-message-dark-mode-success-icon-color, var(--bbva-notification-message-success-icon-color, var(--colorsTertiaryType6Dark, ${h(g.tertiaryType6Dark)})));
  --_notification-message-error-icon-color: var(--bbva-notification-message-dark-mode-error-icon-color, var(--bbva-notification-message-error-icon-color, var(--colorsTertiaryType1Dark, ${h(g.tertiaryType1Dark)})));
  --_notification-message-sustainability-icon-color: var(--bbva-notification-message-dark-mode-sustainability-icon-color, var(--bbva-notification-message-sustainability-icon-color, var(--colorsPrimaryVariantDark, ${h(g.primaryVariantDark)})));
  --_notification-message-information-background-color: var(--bbva-notification-message-dark-mode-information-background-color, var(--bbva-notification-message-information-background-color, var(--colorsTertiaryType3Lightened, ${h(g.tertiaryType3Lightened)})));
  --_notification-message-success-background-color: var(--bbva-notification-message-dark-mode-success-background-color, var(--bbva-notification-message-success-background-color, var(--colorsTertiaryType6Lightened, ${h(g.tertiaryType6Lightened)})));
  --_notification-message-error-background-color: var(--bbva-notification-message-dark-mode-error-background-color, var(--bbva-notification-message-error-background-color, var(--colorsTertiaryType5Lightened, ${h(g.tertiaryType5Lightened)})));
  --_notification-message-sustainability-background-color: var(--bbva-notification-message-dark-mode-sustainability-background-color, var(--bbva-notification-message-sustainability-background-color, var(--colorsPrimaryVariantLightened, ${h(g.primaryVariantLightened)})));
  --_notification-message-title-color: var(--bbva-notification-message-dark-mode-title-color, var(--bbva-notification-message-title-color, var(--colorsSecondary600, ${h(g.secondary600)})));
  --_notification-message-paragraph-color: var(--bbva-notification-message-dark-mode-paragraph-color, var(--bbva-notification-message-paragraph-color, var(--colorsSecondary600, ${h(g.secondary600)})));
  --_text-weight: var(--bbva-notification-message-dark-mode-text-weight, var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${h(b.book.fontWeight)})));
  --skeleton-quote-color: var(--bbva-notification-message-dark-mode-skeleton-color, var(--bbva-notification-message-skeleton-color, var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)})));
  --skeleton-quote-bg: var(--bbva-notification-message-dark-mode-skeleton-bg-color, var(--bbva-notification-message-skeleton-bg-color, var(--colorsPrimarySubduedLight, ${h(g.primarySubduedLight)})));
  --_notification-message-skeleton-animated-layer-bg: var(--bbva-notification-message-dark-mode-skeleton-animated-layer-bg-color, var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)}));
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
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${h(p.typeLarge)}));
}

.paragraph {
  color: var(--_notification-message-paragraph-color);
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${h(p.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${h(m.typeSmall)}));
}
.paragraph:not(.no-space) {
  padding: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-paragraph]) > .paragraph {
  padding: 0;
}

.description {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(b.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(b.medium.fontWeight)});
}

:host([description][description-text-italic]) > .description {
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${h(b.mediumItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${h(b.mediumItalic.fontWeight)});
}

[data-tag-name=bbva-icon] {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
  --bbva-icon-color: var(--_notification-message-icon-color);
}

[data-tag-name=bbva-link]:not(.no-space) {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(u.spacer)}))) / 16) * 1rem);
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
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${h(g.primarySubduedLight)})));
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
${Bt.mediaRules()}`;class Vt extends(i(f(X(a)))){static get is(){return"bbva-notification-message"}static get scopedElements(){return{"bbva-button-default":q,"bbva-link":j,"bbva-icon":_,"bbva-text":x}}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},description:{type:String},tagTitle:{type:String,attribute:"tag-title"},linkTitle:{type:String,attribute:"link-title"},linkIcon:{type:String,attribute:"link-icon"},buttonText:{type:String,attribute:"button-text"},href:{type:String},loading:{type:Boolean,reflect:!1},variant:{type:String,reflect:!0},iconClose:{type:Boolean,attribute:"icon-close"},hideBottomPaddingParagraph:{type:Boolean,attribute:"hide-bottom-padding-paragraph"},hideBottomPaddingLink:{type:Boolean,attribute:"hide-bottom-padding-link"},descriptionTextItalic:{type:Boolean,attribute:"description-text-italic"},accessibilityLinkLabel:{type:String,attribute:"accessibility-link-label"}}}constructor(){super(),this.iconClose=!1,this.iconSize=24,this.variant="default",this._types={default:s(),information:G(),success:n(),error:r(),sustainability:W()},this.hideBottomPaddingParagraph=!1,this.hideBottomPaddingLink=!1,this.descriptionTextItalic=!1,this.loading=!1,this.accessibilityLinkLabel="bbva-notification-message-accessibility-link-label",this._accessibilityTextIcon="bbva-notification-message-accessibility-icon-text-",this.tagTitle="p"}static get styles(){return[super.styles,At,l("bbva-notification-message-shared-styles"),V.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.isRoleAlert?this.setAttribute("role","alert"):this.setAttribute("role","status"),this.disabledTabindex=!0}get isRoleAlert(){return"error"===this.variant}get _icon(){return this.icon?this.icon:this._types[this.variant]||s()}get _closeIcon(){return this.iconClose&&"default"===this.variant?c`
          <bbva-button-default
            variant="icon no-background"
            .icon="${J()}"
            @click="${this._iconClick}"
            aria-label="${this.t("bbva-notification-message-close")}"
          >
          </bbva-button-default>
        `:K}get _title(){return this.messageTitle?c`
          <bbva-text
            .tag="${this.tagTitle}"
            alignment="center"
            .text="${this.messageTitle}"
            class="title"
            unset
            size="M"
          ></bbva-text>
        `:K}get _paragraph(){return c`<div
      class="paragraph
            ${Z({"no-space":!this.buttonText&&!this.linkTitle})}"
    >
      ${this.message?c`<bbva-text alignment="center" text=${this.message} unset size="S"></bbva-text> `:c`<slot></slot>`}
    </div>`}get _description(){return this.description?c` <bbva-text
          class="description"
          alignment="center"
          .text=${this.description}
          unset
          size="S"
        ></bbva-text>`:K}get _link(){return this.linkTitle?c`
          <bbva-link
            aria-label="${this.t(this.accessibilityLinkLabel)}"
            class="${Z({"no-space":!this.buttonText})}"
            variant="message"
            .href="${this.href}"
            @click="${this._linkClick}"
            .icon="${this.linkIcon}"
          >
            <span>${this.linkTitle}</span>
          </bbva-link>
        `:K}get _button(){return this.buttonText?c`
          <bbva-button-default
            ambient="light"
            data-tag-name="bbva-button-default"
            text="${this.buttonText}"
            @click="${this._buttonClick}"
          ></bbva-button-default>
        `:K}get _accessibilityIconDescription(){return`${this._accessibilityTextIcon}${this.variant}`}_iconClick(){this.dispatchEvent(new CustomEvent("notification-message-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return c`${this.loading?c`<div class="skeleton"></div> `:c` ${this._closeIcon}
          <bbva-icon
            data-tag-name="bbva-icon"
            role="img"
            aria-label=${this.t(this._accessibilityIconDescription)}
            .icon="${this._icon}"
            .size="${this.iconSize}"
          ></bbva-icon>
          ${this._title} ${this._paragraph} ${this._description} ${this._link} ${this._button}`}`}}customElements.define(Vt.is,Vt);var Rt=t`/* eslint-disable no-unused-vars */
:host {
  display: block;
  box-sizing: border-box;
}
:host[hidden], :host [hidden] {
  display: none !important;
}

[data-tag-name=bbva-type-amount] {
  margin-left: 1rem;
}

.grid {
  display: grid;
  grid-template-columns: 80% 20%;
  margin-left: 1rem;
}
.grid .col {
  align-items: start;
  text-align: left;
}
`;class Ft extends(i(f($t(a)))){static get is(){return"operational-limits-list-action"}static get scopedElements(){const t=[ct,x,rt,ot,nt];return Ft.scopedElementsFromClasses(t)}static get properties(){return{amount:{type:String},currencyCode:{type:String,attribute:"currency-code"},icon:{type:String},idLimit:{type:String},text:{type:String}}}constructor(){super(),this.amount="",this.currencyCode="",this.icon="",this.idLimit="",this.text=""}static get styles(){return[Rt,l("bbva-feature-operational-limits-youngsters-shared-styles")]}_handleClick(){this._dispatchCustomEvent("operational-limits-list-action-click")}get _icon(){return c`
      ${this.icon&&c`
          <bbva-type-link 
          data-tag-name="bbva-type-link"
           class="icon"
           id="icon_${this.idLimit}"
           aria-label="icon_${this.idLimit}"
           icon="${this.icon}"
           @click="${this._handleClick}"></bbva-type-link>
        `||""}
    `}get _text(){return this.text?c`<bbva-type-text text-color="#666666" text="${this.text}"></bbva-type-text>`:c``}get _amount(){return c`
      ${this.amount&&c`
          <bbva-type-amount
            variant="m"
            amount="${this.amount}"
            currency-code="${this.currencyCode}">
          </bbva-type-amount>
        `||""}
    `}render(){return c`
      <div class="grid">
        <div class="col">
          ${this._text}
          <div class="col">
            ${this._amount}
          </div>
        </div>
        <div class="col">
          ${this._icon}
        </div>
      </div>
    `}}customElements.define(Ft.is,Ft);var qt=t`/* eslint-disable no-unused-vars */
:host {
  display: block;
  box-sizing: border-box;
}
:host[hidden], :host [hidden] {
  display: none !important;
}
`;class jt extends(i(f($t(a)))){static get is(){return"operational-limits-list-page"}static get scopedElements(){const t=[kt,x,Vt,Ft];return jt.scopedElementsFromClasses(t)}static get properties(){return{dataLimits:{type:Array,state:!0},flagParentsView:{type:Boolean,state:!0},limits:{type:Array,attribute:"limits",state:!0}}}constructor(){super(),this.flagParentsView=!1,this.limits=[],this.dataLimits=[]}static get styles(){return[qt,l("bbva-feature-operational-limits-youngsters-shared-styles")]}changedLocalesView(t,e,i){const a=(t,e,i,a)=>c`
      <operational-limits-list-action
        id="operational_${a}"
        @operational-limits-list-action-click="${this._editOperationalLimitsHandler}" 
        text="${t}" 
        icon="${i?Q():""}" 
        amount="${e}"
        idLimit="${a}"
        currency-code='USD'></operational-limits-list-action>
    `,o={text:t=>c`<bbva-text .text="${t}" text-color="#666666" style="margin:10px;"></bbva-text>`,list:t=>c`<bbva-list-bullet text="${t}" id="index"></bbva-list-bullet>`,notification:t=>c`<bbva-notification-message style="margin:10px;">${t}</bbva-notification-message>`,listAction:t=>a(t.text,t.amount,t.icon,t.idlimit)};return((t,e)=>{const i=o[t];return i?"list"===t||"listAction"===t?c`${e.map((t=>i(t)))}`:i(e):null})(t,this.flagParentsView?e:i)}_editOperationalLimitsHandler({target:{idLimit:t,amount:e,text:i}}){this._dispatchCustomEvent("link-clicked-edit",[{idlimit:t,amount:e,text:i},this.dataLimits])}_returnPage(){this._dispatchCustomEvent("reset-event"),this._dispatchCustomEvent("parental-control-account-limits-go-back")}_openModalDetail(){this._dispatchCustomEvent("open-modal-detail",!1)}render(){return c`
       <bbva-header-main
        icon-left-primary="${O()}"
        icon-right-primary="${B()}"
        text="${this.t("operational-limits-header")}"
        accessibility-text-icon-left-primary="return"
        accessibility-text-icon-right-primary="continue"
        @header-main-icon-left-primary-click="${this._returnPage}"
        @header-main-icon-right-primary-click="${this._openModalDetail}"
      >
      </bbva-header-main>
      <div>
        ${this.changedLocalesView("text",this.t("operational-limits-list-text-parents"),this.t("operational-limits-list-text-youngsters"))}
      </div>
      <div>
        ${this.changedLocalesView("listAction",this.limits,this.limits)}
      </div>
      <div>
        ${this.changedLocalesView("notification",this.t("operational-limits-notification-message-operations-parents"),this.t("operational-limits-notification-message-operations-youngsters"))}
      </div>
    `}}customElements.define(jt.is,jt);const Ht=t=>null==t||""===t?"0.00":new Intl.NumberFormat("en-US",{minimumFractionDigits:2,maximumFractionDigits:2}).format(t);var Xt=t`/* eslint-disable no-unused-vars */
:host {
  display: block;
  box-sizing: border-box;
}
:host[hidden], :host [hidden] {
  display: none !important;
}

.content-amount {
  display: flex;
  justify-content: center;
}
`;class Ut extends(i(f($t(a)))){static get is(){return"operational-limits-edit-page"}static get scopedElements(){const t=[F,ot,nt,ht,Vt,q];return Ut.scopedElementsFromClasses(t)}static get properties(){return{amountList:{type:Array},openModal:{type:Boolean,attribute:"open-modal"},_amountDetail:{type:String,state:!0},_buttonEditDisable:{type:Boolean,attribute:"button-disable",state:!0},_flagReviewInput:{type:Boolean,state:!0},_inputText:{type:String,state:!0},_inputTextError:{type:String,state:!0},_resetValue:{type:Boolean,state:!0},isFirstTime:{type:Boolean}}}constructor(){super(),this.amountList=[],this.openModal=!1,this._amountDetail="",this._flagReviewInput=!1,this._inputText="",this._inputTextError="",this._buttonEditDisable=!1,this._resetValue=!1,this.isFirstTime=!1}static get styles(){return[Xt,lt.primary,dt.primaryAlt,l("bbva-feature-operational-limits-youngsters-shared-styles")]}closeEditModal(){this._reset(),this._dispatchCustomEvent("close-modal-clicked")}updated(t){if(t.has("amountList")&&this.amountList.length>0){var e;this._amountDetail=(null===(e=this.amountList.find((t=>Object.hasOwn(t,"amount"))))||void 0===e?void 0:e.amount)||"";const t=Ht(this._amountDetail);this._inputText=`${this.t("operational-limits-edit-page-text-input")} $${t}`}this._resetValue=!1}_reset(){this._resetValue=!0,this.isFirstTime=!0,this._flagReviewInput=!1,this.amountList=[],this._amountDetail="",this._inputTextError=""}_continueButton(){const[t,e]=this.amountList;let i=this.shadowRoot.querySelector("#amountFormInput").value.replace(/[^0-9.-]+/g,"");i=parseFloat(i),this._dispatchCustomEvent("edit-amount",[{idlimit:t.idlimit,amount:i,text:t.text},e]),this.closeEditModal()}_getInputText(t,e){const i=`${this.t("operational-limits-edit-page-text-input")} $${Ht(e)}`;this._inputText=t?"":i,this._inputTextError=t?i:""}reviewInput({detail:t}){const{value:e}=t,i=parseFloat(null==e?void 0:e.replace(/[^0-9.-]+/g,""))||0,a=parseInt(this._amountDetail,10),o=!(i>=1&&i<a);this._buttonEditDisable=o||this.isFirstTime,this._flagReviewInput=o&&!this.isFirstTime,this._getInputText(o,a),this.isFirstTime&&(this.isFirstTime=!1)}render(){return c`
      <bbva-help-modal
        full-height
        fixed-footer
        header-type="modal"
        hidde-content-padding-top
        header-text="${this.t("operational-limits-header-edit")}"
        ?visible="${this.openModal}"
        @header-main-icon-right-primary-click="${this.closeEditModal}"
        link-text="${this.t("operational-limits-modal-edit-link")}"
        button-text="${this.t("operational-limits-modal-edit-button")}"
        ?disabled-button="${this._buttonEditDisable}"
        @help-modal-footer-link-click="${this.closeEditModal}"
        @help-modal-footer-button-click="${this._continueButton}"
      >
        <div slot="slot-title">
          <div class="content-amount">
            <bbva-type-text
            text="${this.t("operational-limits-modal-edit-money-simbol")}"
            tag="span"
            ></bbva-type-text>
              <bbva-type-amount
                variant="3xl"
                currency-code=""
                amount="${this._amountDetail}"
              ></bbva-type-amount>
          </div>
          <bbva-type-text
            text="${this.t("operational-limits-edit-page-text")}"
            tag="span"
            text-color="#666666"
          ></bbva-type-text>
        </div>
        <div slot="slot-content">
          <bbva-form-input
            id="amountFormInput"
            type="amount"
            currency-code="MXN"
            local-currency="MXN"
            label="${this.t("operational-limits-edit-page-text-label")}"
            label-out="${this.t("operational-limits-edit-page-text-label-out")}"
            info-message="${this._inputText}"
            error-message="${this._inputTextError}"
            ?invalid="${this._flagReviewInput}"
            ?reset-value="${this._resetValue}"
            @form-input-value-change="${t=>{this.reviewInput(t)}}"
          ></bbva-form-input>
          <div>
            <bbva-notification-message style="margin:10px;">
              ${this.t("operational-limits-notification-message-operations-parents")}
            </bbva-notification-message>
          </div>
        </div>
      </bbva-help-modal>
    `}}customElements.define(Ut.is,Ut);var Yt=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding:0px ;
}
`;class Gt extends(D(f(tt($t(a))))){static get is(){return"bbva-feature-operational-limits-youngsters"}static get scopedElements(){const t=[et,Nt,jt,Ut,Lt,_t,wt,Et];return Gt.scopedElementsFromClasses(t)}static get properties(){return{financialData:{type:Object,attribute:"financial-data"},productId:{type:String,attribute:"product-id"},versionCard:{type:String,attribute:"version-card"},_amountSave:{type:String,state:!0},_amountList:{type:Object,state:!0},_buttonEditDisable:{type:Object,state:!0},_dataLimits:{type:Array,state:!0},_isLimits:{type:Boolean,state:!0},_isParentAccount:{type:Boolean,state:!0},_limits:{type:Array,state:!0},_loader:{type:Boolean,state:!0},_openOperationalLimitsList:{type:Boolean,state:!0},_showSuccessToast:{type:Boolean,state:!0},_simpleCode:{type:String,state:!0},_typeError:{type:String,state:!0},_openOperationalLimitsDetail:{type:Boolean,state:!0},_openModalEdit:{type:Boolean,state:!0}}}constructor(){super(),this.financialData={},this.host="",this._loader=!1,this.native=!1,this.requiredToken="",this.versionCard="",this._isParentAccount=!1,this._openOperationalLimitsList=!1,this._showSuccessToast=!1,this._buttonEditDisable=!1,this._openModalEdit=!1,this._openOperationalLimitsDetail=!1,this.reset()}static get styles(){return[Yt,l("bbva-feature-operational-limits-youngsters-shared-styles")]}get limitsDMLocal(){return this.renderRoot.querySelector('[data-tag-name="bbva-local-limits-api-dm"]')}get limitsDetail(){return this.renderRoot.querySelector('[data-tag-name="operational-limits-detail-page"]')}get limitsEdit(){return this.renderRoot.querySelector('[data-tag-name="operational-limits-edit-page"]')}get limitsError(){return this.renderRoot.querySelector('[data-tag-name="operational-limits-modal-error"]')}init(){this._isLimits=!0,this._loader=!0}reset(){this._limits=[],this._dataLimits=[],this._amountList={},this._isLimits=!1,this.productId="",this._simpleCode="",this._amountSave="",this._typeError=""}updated(t){t.has("_isLimits")&&this._isLimits&&this._updateLimits(),t.has("_showSuccessToast")&&this._showSuccessToast&&this._handleSuccessToast()}_updateLimits(){var t,e;const i=(null===(t=this.financialData)||void 0===t||null===(e=t.data)||void 0===e?void 0:e.contracts)||[],a=i.find((t=>t.id===this.productId));a&&(this._simpleCode=a.simpleCode),this._isParentAccount=i.filter((t=>"ACCOUNT"===t.productType)).length>1,this._isLimits=!1,this._getBbvaLocalLimitsApiAccountsDM()}_handleSuccessToast(){setTimeout((()=>{this._showSuccessToast=!1}),5e3)}getLocalStorageData(t){let e=!1;(null!=t&&t.code||!t)&&(e=!0),e?(this._dispatchCustomEvent("account-transaction-operational-limits-set-local-storage",{key:"operationalLimitOnboarding",value:"true"}),this._showModalDetail()):this._openOperationalLimitsList=!0}_showModalDetail(){this._openOperationalLimitsDetail=!0,this._openOperationalLimitsList=!1}_closeModalDetail(t){this._openOperationalLimitsDetail=!(null!=t&&t.detail),this._openOperationalLimitsList=null==t?void 0:t.detail}_resetLimits(){this._dataLimits=[],this._limits=[]}_closeModalEdit({detail:t}){this._openOperationalLimitsList=t,this._openModalEdit=!t,this._isLimits=t}_linkClickedEdit(t){var e;const i=(null==t||null===(e=t.detail[0])||void 0===e?void 0:e.idlimit)||"";this._amountList=t.detail;const a=t.detail.length>0;this._openOperationalLimitsList=!a&&this._openOperationalLimitsList;const o={PER_EXECUTION:"operation",DAILY:"daily",MONTHLY:"month"};o[i]&&this._dispatchCustomEvent(`edit-limits-form-input-focus-${o[i]}`),this._buttonEditDisable=!0,this._openModalEdit=!0}_getBbvaLocalLimitsApiAccountsDM(){this.limitsDMLocal.getOperativeLimitPeriodsAccounts("LIMITESGLOBALGLOMO",this._simpleCode)}_patchBbvaLocalLimitsApiDM(t){const[e,i]=t.detail;this._amountSave=e.amount;const a={period:{id:e.idlimit},amounts:{maximum:{amount:e.amount,currency:"MXN"}}},o=i.findIndex((t=>t.period.id===e.idlimit));-1!==o&&i.splice(o,1,a);const s={operativeLimits:i};this.limitsDMLocal.patchOperativeLimitPeriods("GLOBAL",this._simpleCode,s)}_manageOperativeLimitPeriodsAccountsResponseLocal(t){this._loader=!1,this._dispatchCustomEvent("account-transaction-operational-limits-get-local-storage",{key:"operationalLimitOnboarding"});const e={PER_EXECUTION:this.t("operational-limits-edit-page-text-label"),DAILY:this.t("operational-limits-list-action-daily"),MONTHLY:this.t("operational-limits-list-action-monthly")};this._dataLimits=t.detail.slice(0,3),this._limits=this._dataLimits.map((t=>({text:e[t.period.id]||"",idlimit:t.period.id,amount:t.amounts.maximum.amount,icon:this._isParentAccount,currency:t.amounts.maximum.currency}))).sort(((t,e)=>"Límite por operación"===t.text?-1:"Límite por operación"===e.text?1:t.text.localeCompare(e.text)))}_openModalError(t){this._typeError=t,this._loader=!1,this.limitsError.openModalError()}_manageOperativeLimitPeriodsAccountsResponsePatch(){this._resetLimits(),this._closeModalEdit({detail:!0}),this._loader=!0,this._showSuccessToast=!0}_retry(t){this.limitsError.closeModalError(),this._isLimits=t.detail}_BbvaLocalLimitsApiDm(){return c`
      <bbva-local-limits-api-dm
        id="BbvaLocalLimitsApiDm"
        .host="${this.host}"
        .version="${this.versionCard}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @operative-limit-periods-accounts-api-dm-fetch="${this._manageOperativeLimitPeriodsAccountsResponseLocal}"
        @operative-limit-periods-accounts-api-dm-fetch-error="${()=>this._openModalError("get")}"
        @operative-limit-periods-api-dm-update="${this._manageOperativeLimitPeriodsAccountsResponsePatch}"
        @operative-limit-periods-api-dm-update-error="${()=>this._openModalError("patch")}"
        >
      </bbva-local-limits-api-dm>
    `}showLoader(){return c` ${this._loader?c`<bbva-progress-content
          visible
          ></bbva-progress-content
        >`:""}`}render(){return c`
      ${this._BbvaLocalLimitsApiDm()}
      <operational-limits-detail-page
        ?flagParentsView="${this._isParentAccount}"
        ?open-modal="${this._openOperationalLimitsDetail}"
        @link-clicked-continue="${this._closeModalDetail}">
      </operational-limits-detail-page>
      <bbva-transition-container id="operationalLimitsList" ?visible="${this._openOperationalLimitsList}">
        <div slot="slot-content" class="container">
          ${this.showLoader()}
          <operational-limits-list-page
          id="operational-limits-list-page"
          ?flagParentsView=${this._isParentAccount}
          .limits="${this._limits}"
          .dataLimits="${this._dataLimits}"
          @link-clicked-edit="${t=>{this._linkClickedEdit(t)}}"
          @open-modal-detail=${this._showModalDetail}
          @reset-event=${this.reset}
          >
          </operational-limits-list-page>
          <operational-limits-toast-success
          .toastOpened="${this._showSuccessToast}"
          .amountSave="${this._amountSave}"
          ></operational-limits-toast-success>
        </div>
      </bbva-transition-container>
      <operational-limits-edit-page
        .amountList=${this._amountList}
        isFirstTime="true"
        ?open-modal="${this._openModalEdit}"
        ?button-disable="${this._buttonEditDisable}"
        @close-modal-clicked="${this._closeModalEdit}"
        @edit-amount=${this._patchBbvaLocalLimitsApiDM}
      ></operational-limits-edit-page>
      <operational-limits-modal-error
        .typeError="${this._typeError}"
        @close-button-click-modal-error="${this._retry}"
        @reset-event=${this.reset}          
      ></operational-limits-modal-error>
    `}}customElements.define(Gt.is,Gt);class Wt extends Gt{static get is(){return"bbva-feature-operational-limits-youngsters-mx"}static get properties(){return{}}}customElements.define(Wt.is,Wt);
