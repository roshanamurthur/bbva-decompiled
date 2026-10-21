import{z as e,ar as t,a,L as i,y as r,ah as o,aN as s,ai as n,ak as l,h as c,i as d,a8 as h,ac as b,ad as p,ab as u,a9 as m,aa as v,cO as g,b1 as y,an as f,F as _,ag as $,G as k,el as S,em as x,f as C,cG as T,g as w,ap as I,b$ as E,bx as L,c0 as P,H as A,aX as N,u as R,cI as D,cJ as M,aD as O,aJ as q,aV as V,b0 as B,b_ as F,au as z,bd as H,aI as G,aS as j,bj as U,aw as X,b6 as W,S as Q,av as Y,j as K,o as J,r as Z,aM as ee,aO as te,b3 as ae,bU as ie,cF as re,bF as oe,cS as se,cs as ne,as as le,at as ce,aH as de,m as he,cu as be,ct as pe,du as ue,af as me,p as ve,bo as ge,bp as ye,bq as fe,aG as _e,bg as $e,dI as ke,aT as Se,bb as xe,dZ as Ce,ex as Te,ey as we,ep as Ie,be as Ee,dw as Le,V as Pe,aZ as Ae,J as Ne,cE as Re,bt as De,dK as Me,cH as Oe,dy as qe,az as Ve,dz as Be,dV as Fe,dB as ze,dA as He,di as Ge}from"./952f98a9.js";import{aM as je,t as Ue,dh as Xe,di as We,dj as Qe,dk as Ye,bC as Ke,dl as Je,a5 as Ze,a2 as et,B as tt}from"./7f3d7ca9.js";import{I as at,eH as it,ex as rt,i as ot}from"./216055dc.js";import"./caf32692.js";import{B as st}from"./0582b54b.js";import{B as nt}from"./7608daf5.js";import"./788d6e55.js";import"./ff2cdeea.js";import"./c0a2f832.js";import"./cae0f1de.js";const lt=new t;var ct=e`:host {
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
${lt.mediaRules()}`;class dt extends(a(i)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:o(),warning:o(),error:s(),success:n()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:a=this.defaultType,duration:i=this.duration}={}){const r=a;this._stack.push({type:r,description:e,simpleLinkText:t,duration:i}),this._showNextInStack()}static get styles(){return[ct,l("bbva-notification-container-shared-styles")]}render(){return c`
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
    `}}const ht=new t;var bt=e`:host {
  --_bg-color: var(--bbva-progress-content-dark-mode-bg-color, var(--bbva-progress-content-bg-color, var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)})));
  --_spinner-size: var(--bbva-progress-content-spinner-size, 3rem);
  --_spinner-message-color: var(--bbva-progress-content-dark-mode-spinner-message-color, var(--bbva-progress-content-spinner-message-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_spinner-message-size: var(--bbva-progress-content-spinner-message-size, 0.9375rem);
  --_small-spinner-size: var(--bbva-progress-content-small-spinner-size, 2rem);
  --_login-bg-color: var(--bbva-progress-content-dark-mode-login-bg-color, var(--bbva-progress-content-login-bg-color, var(--colorsPrimaryCore, ${h(m.primaryCore)})));
  --_login-content-bg-color: var(--bbva-progress-content-dark-mode-login-content-bg-color, var(--bbva-progress-content-login-content-bg-color, var(--colorsPrimaryCoreDarkened, ${h(m.primaryCoreDarkened)})));
  --_login-content-text-color: var(--bbva-progress-content-dark-mode-login-text-color, var(--bbva-progress-content-login-text-color, var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)})));
  --_login-success-animation-duration: var(--bbva-progress-content-login-success-animation-duration, 1000ms);
  --_login-success-animation-delay: var(--bbva-progress-content-login-success-animation-delay, 0ms);
  --_content-height: calc(calc(((13 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) + 3rem);
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
  font-size: var(--typographyTypeSmall, ${h(b.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${h(p.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(u.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(u.medium.fontStyle)});
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
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
}
.overlay p {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) 0;
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
  padding: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  color: var(--_login-content-text-color);
}

.icon {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
${ht.mediaRules()}`;const pt=new t;var ut=e`[ambient^=dark] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreLight, ${h(m.primaryCoreLight)});
  --bbva-progress-content-mask-display: none;
  --bbva-progress-content-no-mask-display: block;
}

[ambient^=dark200] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCore, ${h(m.primaryCore)});
}

[ambient^=dark300] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)});
}

[ambient^=dark400] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDarkened, ${h(m.primaryCoreDarkened)});
}
${pt.mediaRules()}`;const mt=new t;var vt=e`[ambient^=light] {
  --bbva-progress-content-bg-color: initial;
  --bbva-progress-content-mask-display: initial;
  --bbva-progress-content-no-mask-display: initial;
}
${mt.mediaRules()}`;const gt={dark:e`
    ${g.dark}
    ${y.dark}
    ${ut}
  `,light:e`
    ${g.light}
    ${y.light}
    ${vt}
  `};class yt extends(a(f(i))){static get is(){return"bbva-progress-content"}static get scopedElements(){return{"bbva-icon":_,"bbva-text":$,"bbva-spinner":k}}static get properties(){return{variant:{type:String,reflect:!0},loginIcon:{type:String,attribute:"login-icon"},loginIconSize:{type:String,attribute:"login-icon-size"},loginSuccessIcon:{type:String,attribute:"login-success-icon"},loginMessageLabels:{type:Array,attribute:"login-message-labels"},loginSuccessMessageLabel:{type:String,attribute:"login-success-message-label"},loginMessageTimer:{type:Number,attribute:"login-message-timer"},loginAnimation:{type:Boolean,attribute:"login-animation",reflect:!0},loginSuccessful:{type:Boolean,attribute:"login-successful",reflect:!0},_loginMessageLabel:{type:String},spinnerMessageLabel:{type:String,attribute:"spinner-message-label"},showSpinnerMessageLabel:{type:Boolean,attribute:"show-spinner-message-label"},visible:{type:Boolean,reflect:!0}}}constructor(){super(),this.variant="full",this.loginIcon=S(),this.loginSuccessIcon=x(),this.loginIconSize="M",this.loginSuccessful=!1,this._loginMessageLabel="",this.loginMessageLabels=["bbva-progress-content-login-verifying-credentials","bbva-progress-content-login-connecting-bbva"],this.loginSuccessMessageLabel="bbva-progress-content-login-loading-products",this.loginMessageTimer=3e3,this.loginAnimation=!1,this.spinnerMessageLabel="bbva-progress-content-login-loading-message",this.showSpinnerMessageLabel=!1,this.visible=!1}get _getLoginIcon(){return this.loginSuccessful?this.loginSuccessIcon:this.loginIcon}get _loginIconSize(){const e={S:16,M:24,L:32},t=parseInt(this.loginIconSize,10);return Object.values(e).includes(t)?t:e[this.loginIconSize]||24}updated(e){super.updated&&super.updated(e),(e.has("loginSuccessful")||e.has("variant"))&&"login"===this.variant&&(this.loginSuccessful?this._setLoginSuccess():this._setLoginInProcess()),e.has("visible")&&void 0!==e.get("visible")&&this._notifyVisibleChanged()}static get styles(){return[bt,gt.dark,gt.light,l("bbva-progress-content-shared-styles")]}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowProgressContent=this._showLoader.bind(this),this._boundHideProgressContent=this._hideLoader.bind(this),this._parentElement.addEventListener("show-loader",this._boundShowProgressContent),this._parentElement.addEventListener("hide-loader",this._boundHideProgressContent)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._parentElement.removeEventListener("show-loader",this._boundShowProgressContent),this._parentElement.removeEventListener("hide-loader",this._boundHideProgressContent)}render(){return c`
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
    `}_onAnimationEnd(e){"content"===e.animationName&&this._fireEvent("progress-content-success-login-click")}_fireEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}_setLoginInProcess(){const[e]=this.loginMessageLabels;this._loginMessageLabel=e,this._loadingMessageInterval=setInterval((()=>{const e=this.loginMessageLabels.indexOf(this._loginMessageLabel),t=this.loginMessageLabels[e+1]||this.loginMessageLabels[0];this._loginMessageLabel=t}),this.loginMessageTimer),this._fireEvent("progress-content-start-login-click")}_setLoginSuccess(){clearInterval(this._loadingMessageInterval),this._loginMessageLabel=this.loginSuccessMessageLabel,this.loginAnimation||this._fireEvent("progress-content-success-login-click")}_notifyVisibleChanged(){this._fireEvent("progress-content-visible-changed",this.visible)}loginSuccess(){this.loginSuccessful=!0}loginReset(){this.loginSuccessful=!1}show(){this.visible=!0}showCustom({variant:e="full",showSpinnerMessageLabel:t=!1,loginAnimation:a=!1}){this.variant=e,this.showSpinnerMessageLabel=t,this.loginAnimation=a,this.show()}_showLoader(e){this.showCustom(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}hide(){this.visible=!1}_hideLoader(e){this.hide(),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}}w("colors.cool90"),w("colors.primaryCoreLightened"),w("colors.cool90"),w("colors.cool70"),w("colors.primaryCoreLightened");var ft=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${h(m.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(m.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${h(m.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${h(m.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${h(m.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(m.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${h(m.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${h(b.typeMedium)}));
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
`;class _t extends(a(I(f(i)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":$,"bbva-icon":_,"bbva-badge-notification":E}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,a=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,i=Math.max(t,a);return i in e?e[i]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[ft,l("bbva-header-main-shared-styles"),L("button:focus"),y.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return c`<bbva-icon icon="${d(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return c`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,a,i){const r=_t.toCamelCase(e),o=`icon${r}`,s=`accessibilityTextIcon${r}`;return c`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${d(this.t(this[s]))}"
      aria-expanded=${d(i)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(e){return c` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${d(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return c`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:a,image:i,_hasMicroillustration:r}=this;return c`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(r||i)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(a)}
          tabindex="-1"
        >
          ${a&&" "!==a&&this._tplHeading(a)||""}
          <img src="${d(i)}" alt="" ?hidden="${!i}" id="image" aria-hidden="true" />

          <span
            class="${r}"
            ?hidden="${!r}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}w("colors.primaryCoreLightened"),w("colors.cool80"),w("colors.cool70"),w("colors.primaryCoreLightened"),w("colors.cool100"),w("colors.tertiaryType6Darkened"),w("colors.tertiaryType4Darkened"),w("colors.secondary300");const $t=A((e=>class extends(N(e)){static configurationScopedElements(){return[dt,yt,_t,R]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const a=`_${e}`;return this[a]||(this[a]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[a].addEventListener(e.substring(1),t[e]):this[a][e]=t[e]})),this._setPrimaryLeftIcon(e,a),this._setSecondaryRightIcon(e,a),c`${this[a]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||D();const e="@header-main-icon-left-primary-click",a=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",a),this[t].addEventListener("header-main-icon-left-primary-click",a)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&M()||this.config.faqs&&O())}_dispatchCustomEvent(e,t=!0,a=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:a,composed:i,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,a=!1){const i={variant:e,showSpinnerMessageLabel:t,loginAnimation:a};this._dispatchCustomEvent("show-loader",i)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,a,i){const r={description:e,simpleLinkText:t,type:a,duration:i};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,a;return c`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(a=this.config)||void 0===a?void 0:a.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,a,i;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(a=this.config)||void 0===a?void 0:a.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(i=this.config)||void 0===i?void 0:i.header}}}render(){const e=this._getElements();return c`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}})),kt=new t;var St=e`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${kt.mediaRules()}`;const xt=new t;var Ct=e`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)});
}
${xt.mediaRules()}`;const Tt={dark:e`
    ${y.dark}
    ${Ct}
  `,light:e`
    ${y.light}
    ${St}
  `},wt=new t;var It=e`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${h(m.secondary200)})));
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
${wt.mediaRules()}`;class Et extends(a(f(q(i)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":$}}static get properties(){return{date:{type:Date,converter:e=>new Date(e)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,It,l("bbva-date-shared-styles"),Tt.light,Tt.dark]}updated(e){var t,a;super.updated&&super.updated(e),0===(null===(t=this.dateRange)||void 0===t?void 0:t.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(a=this.dateRange)||void 0===a?void 0:a.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var e;return(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(e){const t=this.utc?{...this.options,timeZone:"UTC"}:this.options,a=t.day||t.month||t.year;return t.hour&&t.minute&&!a?e.toLocaleTimeString(this.locale,t).concat(` ${this.clockSuffix}`):e.toLocaleDateString(this.locale,t)}_fromToDateFormat(e){return[new Date(e[0]),new Date(e[1])].map(((e,t)=>e.toLocaleDateString(this.locale,this.options).concat(0===t?" - ":"")))}_fromToDateFormatA11y(e){const t=new Date(e[0]),a=new Date(e[1]),i={...this.options};return i.month="long",[t,a].map(((e,t)=>e.toLocaleDateString(this.locale,i).concat(0===t?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&c` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||V}get _tplDateRange(){var e;return this.isValidRange&&(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&c`
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
        `||V}render(){return c` ${this._tplDate} ${this._tplDateRange} `}}w("colors.primaryCoreLightened"),w("colors.cool50");const Lt=new t;var Pt=e`[ambient^=light] {
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
${Lt.mediaRules()}`;const At=new t;var Nt=e`[ambient^=dark] {
  --bbva-header-category-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-header-category-skeleton-color: var(--colorsPrimaryMedium, ${h(m.primaryMedium)});
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-header-category-amount-date-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-header-category-amount-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-header-category-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${h(m.primaryCoreDarkened)});
  --bbva-header-category-card-title-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-header-category-help-color: var(--colorsPrimarySubdued, ${h(m.primarySubdued)});
  --bbva-header-category-action-icon-color: var(--colorsPrimarySubdued, ${h(m.primarySubdued)});
}
${At.mediaRules()}`;const Rt={dark:e`
    ${B.dark}
    ${F.dark}
    ${z.dark}
    ${H.dark}
    ${y.dark}
    ${Nt}
  `,light:e`
    ${B.light}
    ${F.light}
    ${z.light}
    ${H.light}
    ${y.light}
    ${Pt}
  `},Dt=new t;var Mt=e`:host {
  display: flex;
  box-sizing: border-box;
  background-color: var(--bbva-header-category-bg-color, none);
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
  position: relative;
  flex-wrap: wrap;
  color: var(--bbva-header-category-dark-mode-color, var(--bbva-header-category-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  font-weight: var(--bbva-header-category-font-weight, var(--fontFacePrimaryMediumFontWeight, ${h(u.medium.fontWeight)}));
  font-style: var(--bbva-header-category-font-style, var(--fontFacePrimaryMediumFontStyle, ${h(u.medium.fontStyle)}));
  font-size: var(--bbva-header-category-font-size, var(--typographyTypeSmall, ${h(b.typeSmall)}));
  line-height: var(--bbva-header-category-line-height, var(--lineHeightTypeSmall, ${h(p.typeSmall)}));
  --_header-category-heading-color: var(--bbva-header-category-heading-dark-mode-color, var(--bbva-header-category-heading-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_header-category-amount-color: var(--bbva-header-category-amount-dark-mode-color, var(--bbva-header-category-amount-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_header-category-amount-date-color: var(--bbva-header-category-amount-date-dark-mode-color, var(--bbva-header-category-amount-date-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_header-category-help-color: var(--bbva-header-category-help-dark-mode-color, var(--bbva-header-category-help-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_header-category-card-title-color: var(--bbva-header-category-card-title-color, var(--colorsSecondary500, ${h(m.secondary500)}));
  --_header-category-action-bg-color: var(--bbva-header-category-action-bg-color, var(--colorsSecondary100, ${h(m.secondary100)}));
  --_header-category-action-heading-color: var(--bbva-header-category-action-heading-color, var(--colorsSecondary600, ${h(m.secondary600)}));
  --_header-category-action-amount-color: var(--bbva-header-category-action-amount-color, var(--colorsSecondary500, ${h(m.secondary500)}));
  --_header-category-action-icon-color: var(--bbva-header-category-action-icon-dark-mode-color, var(--bbva-header-category-action-icon-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_header-category-action-help-color: var(--bbva-header-category-action-help-dark-mode-color, var(--bbva-header-category-action-help-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_header-category-link-max-width: var(--bbva-header-category-link-max-width, 50%);
  /* Skeleton */
  --_skeleton-color: var(--bbva-header-category-skeleton-dark-mode-color, var(--bbva-header-category-skeleton-color, var(--colorsSecondary200, ${h(m.secondary200)})));
  --skeleton-quote-color: var(--bbva-header-category-skeleton-dark-mode-color, var(--bbva-header-category-skeleton-color, var(--colorsSecondary200, ${h(m.secondary200)})));
  --skeleton-quote-bg: var(--bbva-header-category-skeleton-dark-mode-bg-color, var(--bbva-header-category-skeleton-bg, transparent));
  --_bbva-header-category-skeleton-animated-layer-bg: var(--bbva-header-category-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-header-category-skeleton-animated-layer-bg, var(--ambientsLight, ${h(G.light)})));
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
  font-weight: var(--bbva-header-category-amount-font-weight, var(--fontFacePrimaryMediumFontWeight, ${h(u.medium.fontWeight)}));
  color: var(--_header-category-amount-color);
}
:host([variant=date]) [data-tag-name=bbva-amount] {
  font-weight: var(--bbva-header-category-amount-font-weight, var(--fontFacePrimaryBookFontWeight, ${h(u.book.fontWeight)}));
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

.options-right {
  align-items: baseline;
  opacity: 1;
  max-height: var(--bbva-header-category-line-height, var(--lineHeightTypeSmall, ${h(p.typeSmall)}));
  flex-wrap: nowrap;
  flex: 0 1 auto;
  justify-content: flex-end;
  display: flex;
  max-width: var(--_header-category-link-max-width);
}
.options-right .link {
  display: flex;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
.options-right .icon {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  color: var(--_header-category-action-icon-color);
  fill: var(--_header-category-action-icon-color);
}
.options-right [data-tag-name=bbva-badge-notification] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  font-size: var(--bbva-header-category-card-font-size, var(--typographyTypeXSmall, ${h(b.typeXSmall)}));
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 14) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 14) * 1em) 0;
}
:host([variant=product]) .link {
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
}
:host([variant=date]) [data-tag-name=bbva-core-heading] {
  text-transform: initial;
  font-style: var(--bbva-header-category-date-font-style, var(--fontFacePrimaryMediumItalicFontStyle, ${h(u.mediumItalic.fontStyle)}));
  font-weight: var(--bbva-header-category-date-font-weight, var(--fontFacePrimaryMediumItalicFontWeight, ${h(u.mediumItalic.fontWeight)}));
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
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
}

:host([variant=card]),
:host([variant=longamount]) {
  align-items: flex-end;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 14) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 14) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 14) * 1em);
  font-size: var(--bbva-header-category-card-font-size, var(--typographyTypeXSmall, ${h(b.typeXSmall)}));
  line-height: var(--bbva-header-category-card-line-height, var(--lineHeightTypeSmall, ${h(p.typeSmall)}));
  font-weight: var(--bbva-header-category-card-font-weight, var(--fontFacePrimaryMediumFontWeight, ${h(u.medium.fontWeight)}));
  font-style: var(--bbva-header-category-card-font-style, var(--fontFacePrimaryMediumFontStyle, ${h(u.medium.fontStyle)}));
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
${Dt.mediaRules()}`;class Ot extends(a(j(f(q(i))))){static get is(){return"bbva-header-category"}static get scopedElements(){return{"bbva-core-heading":U,"bbva-amount":X,"bbva-badge-notification":E,"bbva-link":W,"bbva-badge-variability":Q,"bbva-icon":_,"bbva-date":Et,"bbva-text":$}}static get properties(){return{accessibilityTextHelp:{type:String,attribute:"accessibility-text-help"},headingLevel:{type:Number,attribute:"heading-level"},text:{type:String},accessibleText:{type:String,attribute:"accessible-text"},optionText:{type:String,attribute:"option-text"},optionLink:{type:String,attribute:"option-link"},linkHref:{type:String,attribute:"link-href"},optionIcon:{type:String,attribute:"option-icon"},hrefIcon:{type:String,attribute:"href-icon"},optionIconAccesibilityText:{type:String,attribute:"option-icon-accesibility-text"},optionIconAccessibilityText:{type:String,attribute:"option-icon-accessibility-text"},iconHelp:{type:String,attribute:"icon-help"},iconHelpSize:{type:String,attribute:"icon-help-size"},hasHelp:{type:Boolean,attribute:"has-help"},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},notificationType:{type:String,attribute:"notification-type"},notificationAccessibilityText:{type:String,attribute:"notification-accessibility-text"},iconAccessibilityText:{type:String,attribute:"icon-accessibility-text"},notifications:{type:Number},loading:{type:Boolean,reflect:!0},variant:{type:String,reflect:!0},notificationsVariant:{type:String,reflect:!0,attribute:"notifications-variant"},linkAccesibilityText:{type:String,attribute:"link-accesibility-text"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"},status:{type:String},color:{type:String},showValueZero:{type:Boolean,attribute:"show-value-zero"},date:{type:String},dateRange:{type:Array,attribute:"date-range"},options:{type:Object},locale:{type:String},enableInteractivity:{type:Boolean,attribute:"enable-interactivity"},hasLinkEllipsis:{type:Boolean,attribute:"has-link-ellipsis"},discreetMode:{type:Boolean,attribute:"discreet-mode"}}}constructor(){super(),this.loading=!1,this.accessibilityTextHelp="bbva-header-category-accessibility-text-help",this.iconAccessibilityText="bbva-header-category-icon-accessibility-text",this.headingLevel=3,this.iconHelp=O(),this.iconHelpSize=24,this.hasHelp=!1,this.color="",this.showValueZero=!1,this.date="",this.options={day:"2-digit",month:"long",year:"numeric"},this.enableInteractivity=!1,this.hasLinkEllipsis=!1,this.discreetMode=!1}_amountText(){return c`
      ${this.status&&"date"===this.variant?c`
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
    `}get _showLink(){return!(this.notifications||this.optionLink||this.optionIcon)}static get styles(){return[super.styles,l("bbva-global-dividers-shared-styles"),Mt,l("bbva-header-category-shared-styles"),Rt.dark,Rt.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback()}updated(e){super.updated(e),e.has("loading")&&(this.loading?this.setAttribute("tabindex","-1"):this.removeAttribute("tabindex")),e.has("disabled")&&this.disabled&&this.setAttribute("tabindex","-1"),e.has("optionIconAccesibilityText")&&(this.optionIconAccessibilityText=this.optionIconAccesibilityText),e.has("linkAccesibilityText")&&(this.linkAccessibilityText=this.linkAccesibilityText)}get _ambient(){return"action"===this.variant?"light":void 0}get _renderTitle(){return this.date||this.dateRange?c`
        <bbva-core-heading level="${this.headingLevel}">
          <bbva-date
            date="${this.date}"
            .dateRange="${this.dateRange}"
            .locale="${this.locale}"
            .options="${this.options}"
          ></bbva-date>
        </bbva-core-heading>
      `:c`
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
    `}get _renderCoreHeadingText(){return c`
      <bbva-text
        ellipsis
        lines="${"card"===this.variant||"longamount"===this.variant||"product"===this.variant?"1":"2"}"
        ?enable-interactivity="${this.enableInteractivity}"
        tag="span"
        size="${"product"===this.variant?"XS":"S"}"
        font-weight="500"
        font-style="${d("date"===this.variant?"italic":"")}"
        text="${this.text}"
      ></bbva-text>
    `}get _renderCoreHeadingAccessibleText(){return c` <span aria-hidden="true">${this.t(this.text)}</span>
      <span class="sr-only">${this.accessibleText}</span>`}get _renderBadgeNotifications(){return this.notifications?c` <bbva-badge-notification
          class="${d(this.notificationType)}"
          ?hidden="${!this.notifications}"
          .accessibilityText="${this.notificationAccessibilityText}"
          .text="${this.notifications}"
          variant="alert"
        ></bbva-badge-notification>`:""}get _renderRightOptions(){const e="default"===this.variant||"product"===this.variant;return!this.amount||!this.optionLink||e||"card"!==this.variant&&"longamount"!==this.variant?!this.amount&&!this.showValueZero||e||this.optionLink&&("card"===this.variant||"longamount"===this.variant)?this.amount||e||!this.notifications?this.amount||this.notifications||e||!this.optionLink&&!this.optionIcon?"default"===this.variant?c`
        ${this.optionLink?c`
              <bbva-link
                class="link"
                @click="${this._linkClickHandler}"
                href="${d(this.linkHref)}"
                ?hidden="${this._showLink}"
                aria-label="${d(this.linkAccessibilityText)}"
                role="link"
                ?ellipsis="${this.hasLinkEllipsis}"
              >
                <span>${this.t(this.optionLink)}</span>
              </bbva-link>
            `:""}
        ${this.optionText?c`
              <bbva-text
                ?enable-interactivity="${this.enableInteractivity}"
                tag="span"
                size="S"
                text="${this.optionText}"
              ></bbva-text>
            `:""}
        ${this.amount?c`
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
        ${this.notifications?c`
              <bbva-badge-notification
                class="${d(this.notificationType)}"
                ?hidden="${!this.notifications}"
                .accessibilityText="${this.notificationAccessibilityText}"
                .text="${this.notifications}"
                variant="alert"
              ></bbva-badge-notification>
            `:""}
        ${this.optionIcon?c`
              <bbva-link
                icon=${this.optionIcon}
                icon-size=${this.iconHelpSize}
                class="icon"
                href=${d(this.hrefIcon)}
                ?hidden="${!this.optionIcon}"
                aria-label="${this.t(this.iconAccessibilityText)}"
              >
              </bbva-link>
            `:""}
      `:"product"===this.variant?c`
        ${this.amount?c`
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
        ${this.optionLink?c`
              <bbva-link
                class="link"
                @click="${this._linkClickHandler}"
                href="${d(this.linkHref)}"
                ?hidden="${this._showLink}"
                aria-label="${d(this.linkAccessibilityText)}"
                role="link"
                ?ellipsis="${this.hasLinkEllipsis}"
              >
                <span>${this.t(this.optionLink)}</span>
              </bbva-link>
            `:""}
        ${this.optionText?c` <bbva-text size="XS" tag="span" text="${this.optionText}"></bbva-text> `:""}
      `:V:c`
        <bbva-link
          class="link"
          @click="${this._linkClickHandler}"
          href="${d(this.linkHref)}"
          ?hidden="${this._showLink}"
          aria-label="${d(this.linkAccessibilityText)}"
          role="link"
          ?ellipsis="${this.hasLinkEllipsis}"
        >
          ${this.optionLink?c` <span>${this.t(this.optionLink)}</span> `:c` <span class="sr-only">${this.optionIconAccessibilityText}</span>
                <bbva-link
                  icon=${this.optionIcon}
                  icon-size=${this.iconHelpSize}
                  class="icon"
                  href=${d(this.hrefIcon)}
                  ?hidden="${!this.optionIcon}"
                  aria-label="${this.t(this.iconAccessibilityText)}"
                >
                </bbva-link>`}
        </bbva-link>
      `:c`
        <bbva-badge-notification
          class="${d(this.notificationType)}"
          ?hidden="${!this.notifications}"
          .accessibilityText="${this.notificationAccessibilityText}"
          .text="${this.notifications}"
          variant="alert"
        ></bbva-badge-notification>
      `:c` ${this._amountText()} `:c`
        <bbva-link
          class="link"
          @click="${this._linkClickHandler}"
          href="${d(this.linkHref)}"
          ?hidden="${this._showLink}"
          role="link"
          aria-label="${d(this.linkAccessibilityText)}"
          ?ellipsis="${this.hasLinkEllipsis}"
        >
          <span>${this.t(this.optionLink)}</span>
          ${this._renderBadgeNotifications}
          <bbva-link
            icon=${this.optionIcon}
            icon-size=${this.iconHelpSize}
            class="icon"
            href=${d(this.hrefIcon)}
            ?hidden="${!this.optionIcon}"
            aria-label="${this.t(this.iconAccessibilityText)}"
          >
          </bbva-link>
        </bbva-link>
      `}render(){return c`
      ${this.loading?c`<div class="skeleton"></div>`:c` <div class="header-category" ambient="${d(this._ambient)}">
              <div class="title-container">${this._renderTitle}</div>
              <div
                class="options-right ${Y({"badge-variability":"date"===this.variant})}"
              >
                ${this._renderRightOptions}
              </div>
            </div>
            ${!this.amount&&!this.showValueZero||!this.optionLink||"card"!==this.variant&&"longamount"!==this.variant?"":c` <div class="secondary-right">${this._amountText()}</div>`}`}
    `}_helpClickHandler(e){e.preventDefault(),this.dispatchEvent(new CustomEvent("header-category-help-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClickHandler(e){e.preventDefault(),this.dispatchEvent(new CustomEvent("header-category-link-click",{detail:!0,bubbles:!0,composed:!0}))}}w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primarySubdued"),w("colors.cool20"),w("colors.primaryCoreLightened"),w("colors.cool50"),w("colors.cool90"),w("colors.primarySubdued"),w("colors.primarySubdued");const qt=new t;var Vt=e`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${h(m.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${h(m.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${h(m.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${h(b.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${h(p.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
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
${qt.mediaRules()}`;const Bt=new t;var Ft=e`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${Bt.mediaRules()}`;const zt=new t;var Ht=e`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${h(m.primaryCoreLight)});
}
${zt.mediaRules()}`;const Gt={dark:e`
    ${Ht}
  `,light:e`
    ${Ft}
  `};class jt extends(a(f(q(i)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":_,"bbva-text":$}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,Vt,Gt.dark,Gt.light,l("bbva-notification-help-shared-styles")]}render(){return c`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}w("colors.primarySubduedLight"),w("colors.cool20"),w("colors.tertiaryType1Light"),w("colors.primaryCoreLightened"),w("colors.tertiaryType6Light"),w("colors.cool20"),w("colors.cool50");const Ut=new t;var Xt=e`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${h(m.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${h(b.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Ut.mediaRules()}`;const Wt=new t;var Qt=e`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${h(m.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${h(m.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${h(m.primaryMediumLight)});
}
${Wt.mediaRules()}`;const Yt=new t;var Kt=e`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${Yt.mediaRules()}`;const Jt={dark:e`
    ${Qt}
    ${je.dark}
    ${B.dark}
    ${Gt.dark}
    ${y.dark}
  `,light:e`
    ${Kt}
    ${je.light}
    ${B.light}
    ${Gt.light}
    ${y.light}
  `};class Zt extends(a(f(ee(i)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":Ue,"bbva-notification-help":jt,"bbva-text":$,"bbva-link":W}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=s(),this.errorIconSize=16,this.infoIcon=o(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?c`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${d(this.linkHref)}"
          icon="${O()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return c`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?e:`${e} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[Xt,l("bbva-form-radio-group-shared-styles"),Jt.dark,Jt.light]}render(){return c`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>c`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${d(e.divider)}"
              ?disabled="${e.disabled}"
              ?checked="${e.checked}"
              ?required="${e.required}"
              ?label-medium="${e.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${e.invalid?e.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${e.infoMessage}"
              accessibility-icon-info-notification="${d(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${d(e.accessibilityIconAlert)}"
              variant="${d(e.variant)}"
            >
              ${e.text?te(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?c`
            <bbva-notification-help
              class="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}}customElements.define(Zt.is,Zt);var ea=e`:host {
  display: block;
  box-sizing: border-box;
  margin: 0 0.9375rem;
  --bbva-access-key-recovery-radio-button-subtitle: var(--colorsSecondary500, ${h(m.secondary500)});
}

[data-tag-name=bbva-form-radio-button] [data-tag-name=bbva-text] {
  margin: 0.5rem 0;
  color: var(--bbva-access-key-recovery-radio-button-subtitle);
}
`;class ta extends(ae(f(i))){static get scopedElements(){const e=[$,Zt,Ue];return ta.scopedElementsFromClasses(e)}static get is(){return"access-key-recovery-radio-buttons"}static get styles(){return[ea,l("access-key-recovery-radio-buttons-shared-styles")]}static get properties(){return{items:{type:Array},name:{type:String},restItems:{type:Number,attribute:"reset-item"}}}constructor(){super(),this.items=[],this.name="",this.restItems=-1}render(){return c`
      <bbva-form-radio-group selected=${this.restItems}>
        ${this.items.map((e=>c`
          <bbva-form-radio-button
            name=${this.name}
            value=${e.value}
            label-medium>
            ${this.t(e.label)}
            <bbva-text
              aria-disabled="true"
              tabindex="-1"
              tag="span"
              text=${e.description}
              size="XS">
            </bbva-text>
          </bbva-form-radio-button>
        `))}
      </bbva-form-radio-group>
    `}}var aa=e`:host {
  height: auto;
  max-height: 100vh;
  overflow-y: auto;
  overscroll-behavior: none;
  display: block;
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  overflow: auto;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-header-main] {
  width: 100%;
}

.description-container [data-tag-name=bbva-header-category] {
  padding: 2rem 1rem 0 1rem;
}
.description-container [data-tag-name=bbva-text] {
  padding: 0 1rem;
}

.footer-container {
  display: flex;
  align-items: center;
  flex-direction: column;
  padding-bottom: 2rem;
}
.footer-container [data-tag-name=bbva-text] {
  padding: 0 1rem;
}

.container-panel {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 0 1rem;
  background: var(--colorsPrimaryCore, ${h(m.primaryCore)});
}

[data-tag-name=bbva-divider-default] {
  display: flex;
  align-items: center;
  flex-direction: column;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ia extends($t(ae(f(i)))){static get is(){return"recovery-method-type"}static get scopedElements(){const e=[$,_t,ie,Ot,ta,at,re,...ia.configurationScopedElements()];return ia.scopedElementsFromClasses(e)}static get properties(){return{resetRadioButtons:{type:Boolean,attribute:"reset-radio-buttons",reflect:!0},recoveryMethods:{type:Array},recoveryMethodsName:{type:String,attribute:"recovery-methods-name"},imageSecurity:{type:String,attribute:"image-security"},_enableButton:{type:Boolean},_recoveryType:{type:String},_restItems:{type:Number}}}static get styles(){return[aa,l("recovery-method-type-styles")]}constructor(){super(),this._radioButtons=null,this._enableButton=!1,this._recoveryType="",this.resetRadioButtons=!1,this.recoveryMethods=[],this.recoveryMethodsName="",this._restItems=-1,this.imageSecurity=""}updated(e){e.has("resetRadioButtons")&&this.resetRadioButtons&&this._resetAllRadioButtons()}_getRadioButtonSelected({detail:e}){const t=e.value||"";this._restItems=e.selected,0!==t.length&&(this._enableButton=!0,this._recoveryType=t)}_resetAllRadioButtons(){this._restItems=-1,this._enableButton=!1,this._recoveryType=""}_goBack(){this._fireEvent(`${ia.is}-header-back`)}_shareRecoveryType(){this._fireEvent("akr-radio-button-pressed",{status:this._recoveryType})}_fireEvent(e,t=""){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaPanelOffer(){return c`
    <bbva-header-main
      text= "${this.t("bbva-feature-access-key-recovery-header-reset-password-pannel-offer")}"
      accessibility-text-icon-right-primary="Return"
      variant="modal-initial"
      icon-right-primary=${oe()}
      @header-main-icon-right-primary-click=${this._goBack}>
    </bbva-header-main>
    <div class="container-panel">
      <bbva-core-image 
        img-accessibility-text="security" 
        height=110
        width=110
        sizing="cover"
        src="${this.imageSecurity}">
      </bbva-core-image>
      <bbva-text
        aria-disabled="true"
        tabindex="-1"
        text= "${this.t("bbva-feature-access-key-recovery-content-title")}"
        tag="p"
        size="L"
        text-color="#FFFFFF"
        alignment="center"
        font-weight="500">
      </bbva-text>
    </div>`}_bbvaDescription(){return c`
      <div class="description-container">
        <bbva-header-category
          accessibility-text-help="${this.t("bbva-feature-access-key-recovery-method-title")}"
          text="${this.t("bbva-feature-access-key-recovery-method-title")}">
        </bbva-header-category>
  
        <bbva-text
          aria-disabled="true"
          tabindex="-1"
          size="XS"
          text= ${this.t("bbva-feature-access-key-recovery-method-description")}
          alignment="left">
        </bbva-text>
      </div>
    `}_bbvaRadioButtonGroup(){return c`
      <access-key-recovery-radio-buttons
        name="recovery-option"
        .items=${this.recoveryMethods}
        reset-item=${this._restItems}
        @form-radio-group-item-change=${this._getRadioButtonSelected}>
      </access-key-recovery-radio-buttons>
      <bbva-divider-default size="small"></bbva-divider-default>
    `}get _bbvaFooterContent(){return c`
      <div class="footer-container">
        <bbva-text
          aria-disabled="true"
          tabindex="-1"
          text= "${this.t("bbva-feature-access-key-recovery-footer-text")}"
          size="XS"
          alignment="center"
          font-style="italic">
        </bbva-text>
        <bbva-button-default
          text="Continuar"
          @click=${this._shareRecoveryType}
          ?disabled=${!this._enableButton}>
        </bbva-button-default>
      </div>
    `}render(){return c`
      ${this._bbvaPanelOffer()}
      ${this._bbvaDescription()}
      ${this._bbvaRadioButtonGroup()}
      ${this._bbvaFooterContent}
    `}}const ra=new t;var oa=e`@keyframes sticky-in-animation {
  from {
    transform: translateY(100%);
  }
  to {
    transform: translateY(0);
  }
}
*,
*:before,
*:after {
  box-sizing: inherit;
}

:host {
  position: relative;
  display: block;
  opacity: 0;
  box-sizing: border-box;
  width: 100%;
  padding: 0;
  text-align: center;
  color: var(--_panel-button-color);
  max-height: 0;
  transition: all ease-in-out var(--bbva-panel-button-transition-time, 0.2s);
  --_panel-button-label: var(--bbva-panel-button-dark-mode-label, var(--bbva-panel-button-label, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_panel-button-icon-color: var(--bbva-panel-button-dark-mode-icon-color, var(--bbva-panel-button-icon-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_panel-button-icon-color-focus: var(--bbva-panel-button-dark-mode-icon-color-focus, var(--bbva-panel-button-icon-color-focus, var(--colorsPrimaryCoreLight, ${h(m.primaryCoreLight)})));
  --_panel-button-amount-color: var(--bbva-panel-button-dark-mode-amount-color, var(--bbva-panel-button-amount-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_panel-button-skeleton-color: var(--bbva-panel-button-dark-mode-skeleton-color, var(--bbva-panel-button-skeleton-color, var(--colorsSecondary200, ${h(m.secondary200)})));
  --_panel-button-skeleton-bg: var(--bbva-panel-button-dark-mode-skeleton-bg, var(--bbva-panel-button-skeleton-bg, transparent));
  --_panel-button-background: var(--bbva-panel-button-dark-mode-background, var(--bbva-panel-button-background, var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)})));
  --_panel-button-color: var(--bbva-panel-button-dark-mode-text-color, var(--bbva-panel-button-text-color, var(--colorsSecondary600, ${h(m.secondary600)})));
}

:host([show]) {
  opacity: 1;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
  max-height: 100vh;
}

:host([show][variant*=fixed]),
:host([show][variant*=sticky]) {
  visibility: visible;
}

:host([variant*=fixed]) {
  position: fixed;
  bottom: 0;
  left: 0;
  visibility: hidden;
  opacity: 1;
  z-index: var(--bbva-z-index-notifications, 1);
  background: var(--_panel-button-background);
  box-shadow: var(--bbva-panel-button-box-shadow, 0 -3px 2px 0 rgba(18, 18, 18, var(--bbva-panel-button-box-shadow-opacity, 0.08)));
}

:host([variant*=sticky]) {
  visibility: hidden;
  opacity: 1;
  z-index: var(--bbva-z-index-notifications, 1);
  background: var(--_panel-button-background);
  position: sticky;
  bottom: -1px;
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  transform: translateY(100%);
  animation: sticky-in-animation 500ms cubic-bezier(0, 0, 0.1, 1) 1s 1 normal forwards;
  animation-fill-mode: forwards;
}

:host([disabled]:not([show])) {
  opacity: 0;
}

:host([disabled][show]) {
  opacity: 0.4;
}

:host([variant*=loading][show]) {
  min-height: 7rem;
  display: flex;
  align-items: center;
}
:host([variant*=loading][show]) [data-tag-name=bbva-progress-content] {
  position: relative;
}

:host([variant*=sticky][shadowed]) {
  box-shadow: var(--bbva-panel-button-box-shadow, 0 -3px 2px 0 rgba(18, 18, 18, var(--bbva-panel-button-box-shadow-opacity, 0.08)));
}

:host([variant*=skeleton][show]) {
  opacity: 1;
  min-height: 7rem;
}

:host([variant*=skeleton]) .skeleton {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_panel-button-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_panel-button-skeleton-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_panel-button-skeleton-color) 50%);
  background-color: var(--_panel-button-skeleton-bg);
  background-size: calc((60% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((60% * 2) + (16px/ 2)) 16px;
  background-position: 55px 16px, 30px 48px, 55px 74px;
}

:host([variant*=skeleton][show]) .skeleton {
  opacity: 1;
}

:host([none]),
[none] {
  display: none !important;
}

[data-tag-name=bbva-button-default] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) 0;
}

[data-tag-name=bbva-text] {
  color: var(--_panel-button-color);
  font-weight: var(--fontFacePrimaryBookFontWeight, ${h(u.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${h(u.book.fontStyle)});
  display: block;
}

:host([variant*=italic]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${h(u.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${h(u.bookItalic.fontStyle)});
}

header > [data-tag-name=bbva-text] {
  color: var(--_panel-button-label);
}

[data-tag-name=bbva-amount] {
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) 0;
  color: var(--_panel-button-amount-color);
}

article {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
article span {
  display: flex;
  align-items: center;
  justify-content: center;
}
article [data-tag-name=bbva-button-icon] {
  height: auto;
  color: var(--_panel-button-icon-color);
  padding: 0;
}
article [data-tag-name=bbva-button-icon]:active {
  color: var(--_panel-button-icon-color-focus);
}
${ra.mediaRules()}`;const sa=new t;var na=e`[ambient^=light] {
  --bbva-panel-button-background: initial;
  --bbva-panel-button-text-color: initial;
  --bbva-panel-button-label: initial;
  --bbva-panel-button-description-color: initial;
  --bbva-panel-button-amount-color: initial;
  --bbva-panel-button-amount-extra-color: initial;
  --bbva-panel-button-footer-message-color: initial;
  --bbva-panel-button-icon-color: initial;
  --bbva-progress-content-bg-color: initial;
}

[ambient^=light] [variant*=fixed],
[ambient^=light] [variant*=sticky][shadowed] {
  --bbva-panel-button-box-shadow-opacity: 0.08;
}
${sa.mediaRules()}`;const la=new t;var ca=e`[ambient^=dark] {
  --bbva-panel-button-background: var(--colorsPrimaryCore, ${h(m.primaryCore)});
  --bbva-panel-button-text-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-panel-button-label: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-panel-button-description-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-panel-button-amount-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-panel-button-amount-extra-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-panel-button-footer-message-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-panel-button-icon-color: var(--colorsPrimaryMediumLight, ${h(m.primaryMediumLight)});
  --bbva-progress-content-bg-color: var(--colorsPrimaryCore, ${h(m.primaryCore)});
}

[ambient^=dark] [variant*=fixed] {
  --bbva-panel-button-background: initial;
  --bbva-panel-button-text-color: initial;
  --bbva-panel-button-label: initial;
  --bbva-panel-button-description-color: initial;
  --bbva-panel-button-amount-color: initial;
  --bbva-panel-button-amount-extra-color: initial;
  --bbva-panel-button-footer-message-color: initial;
  --bbva-panel-button-icon-color: initial;
  --bbva-progress-content-bg-color: initial;
}

[ambient^=dark] [variant*=fixed],
[ambient^=dark] [variant*=sticky][shadowed] {
  --bbva-panel-button-box-shadow-opacity: 0.32;
}
${la.mediaRules()}`;const da={dark:e`
    ${B.dark}
    ${z.dark}
    ${se.dark}
    ${ne.dark}
    ${ca}
  `,light:e`
    ${B.light}
    ${z.light}
    ${se.light}
    ${ne.light}
    ${na}
  `};function ha(e,t){return e?t:""}class ba extends(a(le(ce(q(i))))){static get is(){return"bbva-panel-button"}static get scopedElements(){return{"bbva-text":$,"bbva-button-default":ie,"bbva-button-icon":de,"bbva-amount":X,"bbva-link":W,"bbva-progress-content":yt}}static get properties(){return{show:{type:Boolean,reflect:!0},label:{type:String},buttonText:{type:String,attribute:"button-text"},buttonVariant:{type:String,attribute:"button-variant"},description:{type:String,reflect:!0},descriptionExtra:{type:String,attribute:"description-extra"},footerMessage:{type:String,attribute:"footer-message"},footerLink:{type:String,attribute:"footer-link"},amountExtra:{type:Number,attribute:"amount-extra"},currencyCodeExtra:{type:String,attribute:"currency-code-extra"},variant:{type:String}}}constructor(){super(),this.show=!1,this.buttonVariant="positive"}static get styles(){return[super.styles,oa,l("bbva-panel-button-shared-styles"),da.dark,da.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._isSticky()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._observer&&this._observer.unobserve(this)}_dispatchCustomEvent(e,t){e&&t&&this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}_isSticky(){var e;null!==(e=this.variant)&&void 0!==e&&e.includes("sticky")&&(this._observer=new IntersectionObserver((([e])=>{e.target.toggleAttribute("shadowed",e.intersectionRatio<1)}),{threshold:1}),this._observer.observe(this))}_renderAmounts(){return c` ${ha(this.amount,c`
        <bbva-amount
          variant="4xl"
          amount=${this.amount}
          currency-code=${d(this.currencyCode)}
          local-currency=${d(this.localCurrency)}
          language=${d(this.language)}
        >
        </bbva-amount>
      `)}
    ${ha(this.amountExtra,c`
        <bbva-amount
          variant="4xl"
          amount=${this.amountExtra}
          currency-code=${d(this.currencyCodeExtra)}
          local-currency=${d(this.localCurrency)}
          language=${d(this.language)}
        >
        </bbva-amount>
      `)}`}_renderDescriptions(){var e;return c`
      <article>
        ${ha(this.description,c`
            <bbva-text
              class="description"
              tag="span"
              size="S"
              text=${this.description}
              alignment="center"
            ></bbva-text>
          `)}
        ${ha(this.descriptionExtra,c`
            <span>
              <bbva-text
                tag="span"
                size="S"
                alignment="center"
                text=${this.descriptionExtra}
              ></bbva-text>
              ${ha(!(null!==(e=this.variant)&&void 0!==e&&e.includes("no-icon")),c`<bbva-button-icon
                  @click=${()=>this._dispatchCustomEvent("panel-button-header-icon-click",!0)}
                  variant="no-background"
                  icon=${O()}
                >
                </bbva-button-icon>`)}
            </span>
          `)}
      </article>
    `}_renderHeader(){return ha(this.label||this.amount||this.amountExtra||this.description||this.descriptionExtra,c`
        <header>
          ${ha(this.label,c`<bbva-text tag="span" size="S" alignment="center" text=${this.label}></bbva-text>`)}
          ${this._renderAmounts()} ${this._renderDescriptions()}
        </header>
      `)}_renderButtonLink(){return ha(this.footerLink,c`
        <bbva-link
          @click=${()=>this._dispatchCustomEvent("panel-button-footer-link-click",!0)}
        >
          ${this.footerLink}
        </bbva-link>
      `)}_renderFooter(){return ha(this.footerMessage||this.footerLink,c`
        <footer>
          ${ha(this.footerMessage,c`<bbva-text
              tag="span"
              size="S"
              alignment="center"
              text=${this.footerMessage}
            ></bbva-text>`)}
          ${this._renderButtonLink()}
        </footer>
      `)}render(){var e,t;const a=null===(e=this.variant)||void 0===e?void 0:e.includes("loading"),i=null===(t=this.variant)||void 0===t?void 0:t.includes("skeleton");return a||i?a?c` <bbva-progress-content .visible=${this.show}></bbva-progress-content> `:c`<span class="skeleton"></span>`:c` <section>
        ${this._renderHeader()}
        ${ha(this.buttonText,c`
            <bbva-button-default
              @click=${()=>this._dispatchCustomEvent("panel-button-item-click",!0)}
              text=${d(this.buttonText)}
              class=${d(this.buttonVariant)}
              variant="${this.buttonVariant}"
            >
            </bbva-button-default>
          `)}
        ${this._renderFooter()}
      </section>`}}w("colors.cool20"),w("colors.primarySubdued"),w("colors.primaryCoreLight"),w("colors.primaryCoreLightened"),w("colors.cool50"),w("colors.cool100"),w("colors.primaryCoreLightened");const pa=new t;var ua=e`[ambient^=light] {
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
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${pa.mediaRules()}`;const ma=new t;var va=e`[ambient^=dark] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)});
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${h(m.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${h(m.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${h(m.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${h(m.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${h(m.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${h(m.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${h(m.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${ma.mediaRules()}`;const ga={dark:e`
    ${va}
    ${B.dark}
    ${y.dark}
    ${Gt.dark}
    ${g.dark}
    ${se.dark}
  `,light:e`
    ${ua}
    ${B.light}
    ${y.light}
    ${Gt.light}
    ${g.light}
    ${se.light}
  `};var ya=e`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${h(m.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${h(m.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${h(m.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${h(m.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${h(m.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${h(m.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${h(m.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --bbva-button-default-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --bbva-button-default-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${h(m.primaryCore)})));
  --bbva-button-default-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --bbva-button-default-icon-color-variant: var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${h(m.primaryMedium)}));
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
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${h(b.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${h(b.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${h(p.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${h(u.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
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
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${h(b.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${h(p.type3XSmall)}));
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
`;w("colors.cool70"),w("colors.primaryCoreLightened"),w("colors.cool20"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.cool20"),w("colors.cool20"),w("colors.cool20"),w("colors.cool20"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.tertiaryType1Light"),w("colors.cool20"),w("colors.cool20"),w("colors.cool70"),w("colors.primaryCoreLightened"),w("colors.tertiaryType1Light"),w("colors.tertiaryType1Light"),w("colors.tertiaryType1Light"),w("colors.primarySubdued"),w("colors.primaryCoreLightened"),w("colors.tertiaryType1Light"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened");let fa=class extends(a(f(pe))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-text":$,"bbva-link":W,"bbva-notification-help":jt,"bbva-icon":_,"bbva-button-default":ie}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},iconVariant:{type:String,attribute:"icon-variant"},hideBottomPaddingInfoMessage:{type:Boolean,attribute:"hide-bottom-padding-info-message"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-input-field-submit",this.actionIntoForm=!1,this.clearIcon=oe(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-field-clear",this.optionalLabel="bbva-form-input-field-optional-label",this.errorIcon=s(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=o(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1,this.hideBottomPaddingInfoMessage=!1}firstUpdated(e){super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const t=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",t.style.display="none",t.innerHTML=this.inputInnerStyles,this.appendChild(t)}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||void 0===e.get("value")||(this.invalid=this.required?this._isEmpty:this.invalid),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?c`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${d(this.linkHref)}"
            aria-label="${this.t("bbva-form-input-field-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?c`
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
      `:""}static get styles(){return[super.styles,ya,ga.light,ga.dark,l("bbva-form-input-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return c`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return c`
      <div
        class="wrapper"
        @keydown="${e=>13===e.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field}
        ${this.iconVariant||this.readonly||!this.actionType?this.rightIcon:this.actionButton}
      </div>
    `}get clearButton(){return c`
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
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return c` <bbva-button-default
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      variant="icon ${this.actionVariant}"
    >
    </bbva-button-default>`}get rightIcon(){return this.actionIcon?c`
          <div class="wrapper-action">
            <bbva-icon .icon="${this.actionIcon}" .size="${this.actionIconSize}"></bbva-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?c`
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
        `:""}get messageInfo(){return this.infoMessage?c`
          <bbva-notification-help
            ?hide-bottom-padding=${this.hideBottomPaddingInfoMessage}
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
            disabled-tabindex
          ></bbva-notification-help>
        `:""}get labelBlock(){return c`
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
    `}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearInput(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return c`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}};const _a=new t;var $a=e`@charset "UTF-8";
:host {
  display: block;
  box-sizing: border-box;
  --_form-amount-currency-color: var(--bbva-form-amount-currency-dark-mode-color, var(--bbva-form-amount-currency-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_form-amount-readonly-currency-color: var(--bbva-form-amount-readonly-currency-dark-mode-color, var(--bbva-form-amount-readonly-currency-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_form-amount-currency-invalid-color: var(--bbva-form-amount-currency-dark-mode-invalid-color, var(--bbva-form-amount-currency-invalid-color, var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_form-amount-currency-invalid-auto-validate-color: var(--bbva-form-amount-currency-dark-mode-invalid-auto-validate-color, var(--bbva-form-amount-currency-invalid-auto-validate-color, var(--colorsSecondary600, ${h(m.secondary600)})));
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
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
}

.back {
  position: absolute;
  display: flex;
  align-items: center;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${h(b.typeSmall)}));
}
:host([focused]) .back, :host([filled]) .back {
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
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
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
}

:host([show-card]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
}

:host([focused][flag]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
}

:host([focused][show-card]) .back {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
}

:host([invalid]) .back-currency,
:host([focused][invalid]) .back-currency {
  color: var(--_form-amount-currency-invalid-color);
}

:host([invalid][auto-validate]) .back-currency {
  color: var(--_form-amount-currency-invalid-auto-validate-color);
}

.with-clip .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
}
.with-clip .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
}

.clip {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
${_a.mediaRules()}`,ka=e`[ambient^=dark] {
  --bbva-form-amount-currency-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-amount-readonly-currency-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-amount-currency-invalid-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-amount-currency-invalid-auto-validate-color: initial;
}
`,Sa=e`[ambient^=light] {
  --bbva-form-amount-currency-color: initial;
  --bbva-form-amount-readonly-currency-color: initial;
  --bbva-form-amount-currency-invalid-color: initial;
  --bbva-form-amount-currency-invalid-auto-validate-color: initial;
}
`;const xa={dark:e`
    ${ka}
    ${ue.dark}
    ${ga.dark}
  `,light:e`
    ${Sa}
    ${ue.light}
    ${ga.light}
  `},Ca=new t;var Ta=e`[ambient^=light] {
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
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${Ca.mediaRules()}`;const wa=new t;var Ia=e`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${h(m.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${h(m.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${h(m.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${h(m.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${h(m.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${h(m.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${h(m.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${h(m.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${wa.mediaRules()}`;const Ea={dark:e`
    ${Ia}
    ${ne.dark}
    ${B.dark}
  `,light:e`
    ${Ta}
    ${ne.light}
    ${B.light}
  `};var La=e`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${h(m.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${h(m.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${h(m.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${h(m.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${h(m.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${h(m.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${h(m.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${h(m.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${h(m.primaryCore)})));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
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
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${h(b.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${h(b.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${h(p.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${h(u.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${h(b.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${h(p.typeSmall)}));
  color: var(--_field-label-out-color);
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
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
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${h(b.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${h(p.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
`;class Pa extends(a(f(pe))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-button-icon":de,"bbva-text":$,"bbva-core-icon":me,"bbva-link":W}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-field-submit",this.actionIntoForm=!1,this.clearIcon=oe(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-field-clear",this.optionalLabel="bbva-form-field-optional-label",this.errorIcon=s(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=o(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1}firstUpdated(e){super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const t=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",t.style.display="none",t.innerHTML=this.inputInnerStyles,this.appendChild(t)}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||void 0===e.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?c`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${d(this.linkHref)}"
            aria-label="${this.t("bbva-form-field-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?c`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,La,Ea.light,Ea.dark,l("bbva-form-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return c`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return c`
      <div
        class="wrapper"
        @keydown="${e=>13===e.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field} ${!this.readonly&&this.actionType?this.actionButton:this.rightIcon}
      </div>
    `}get clearButton(){return c`
      <bbva-button-icon
        tabindex="-1"
        class="clear"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearInput}"
        variant="no-background"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-icon>
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return c` <bbva-button-icon
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      .variant="${this.actionVariant}"
    >
    </bbva-button-icon>`}get rightIcon(){return this.actionIcon?c`
          <div class="wrapper-action">
            <bbva-core-icon
              .icon="${this.actionIcon}"
              .size="${this.actionIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?c`
          <div class="message error" role="alert">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.errorMessage)}</span>
          </div>
        `:""}get messageInfo(){return this.infoMessage?c`
          <div class="message info">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.infoIcon}"
              .size="${this.infoIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.infoMessage)}</span>
          </div>
        `:""}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur"))}clearInput(){this._formElement&&(this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus())}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return c`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}w("colors.cool70"),w("colors.primaryCoreLightened"),w("colors.cool20"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.cool20"),w("colors.cool20"),w("colors.cool20"),w("colors.cool20"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.tertiaryType1Light"),w("colors.cool20"),w("colors.cool20"),w("colors.cool70"),w("colors.primaryCoreLightened"),w("colors.tertiaryType1Light"),w("colors.tertiaryType1Light"),w("colors.tertiaryType1Light"),w("colors.primarySubdued"),w("colors.primaryCoreLightened"),w("colors.tertiaryType1Light"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened");w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.tertiaryType1Light"),w("colors.primaryCoreLightened"),ge(),ye(),fe();const Aa={apple:{logo:"applepay",text:"bbva-clip-card-pay-compatibility-apple"},google:{logo:"googlepay",text:"bbva-clip-card-pay-compatibility-google"}};class Na extends(le(ce(a(f(fa))))){static get is(){return"bbva-form-amount"}static get scopedElements(){return{"bbva-text":$,"bbva-link":W,"bbva-notification-help":jt,"bbva-icon":_,"bbva-button-default":ie,"bbva-clip-flag":_e,"bbva-clip-card":$e}}static get properties(){return{flag:{type:String,reflect:!0},showCard:{type:Boolean,attribute:"show-card"},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},cardVariant:{type:String,attribute:"card-variant"},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},accessibilityText:{type:String,attribute:"accessibility-text"},partnerLogo:{type:String,attribute:"partner-logo"},partnerLogoVariant:{type:String,attribute:"partner-logo-variant"},partner:{type:Boolean}}}constructor(){super(),this.cardType="",this.cardVariant="",this.showCard=!1,this.cardStatus="",this.partner=!1,this.cardImage="",this.payCompatibility="",this.payCompatibilityInfo=Aa,this.accessibilityText="bbva-form-input-amount-clip-card-image"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._checkTrailingDecimal=this._checkTrailingDecimal.bind(this),this.addEventListener("focusout",this._checkTrailingDecimal)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("focusout",this._checkTrailingDecimal)}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._currencyBlock=this.shadowRoot.querySelector(".back-currency")}updated(e){super.updated&&super.updated(e),e.has("language")&&(this.allowedPattern=`[0-9${this._separator}${this._groupChar}]`),e.has("value")&&this.formatValue(this.value),e.has("amount")&&Number.isFinite(this.amount)&&(this.value=String(this.amount).replace(/\./g,this._separator)),(e.has("localCurrency")||e.has("currencyCode"))&&this._setCurrencyWidth()}static get styles(){return[super.styles,$a,xa.dark,xa.light,l("bbva-form-amount-shared-styles")]}get flagBlock(){return c`
      ${this.flag?c`
            <span class="clip">
              <bbva-clip-flag
                icon="${d(this._getFlag())}"
                size="small"
                iconset="${d(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get cardBlock(){return c`
      ${this.showCard?c`
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
                partner-logo="${d(this.partnerLogo)}"
                partner-logo-variant="${d(this.partnerLogoVariant)}"
                disabled-tabindex
              ></bbva-clip-card>
            </span>
          `:""}
    `}get _isRightAligned(){return this._alignRight}get labelBlock(){return c` <bbva-text
      unset
      size="2XS"
      tag="label"
      for="${this._formElementId}"
      text="${this.label}"
      class="label"
      @click="${this.focus}"
    ></bbva-text>`}get inputLabel(){return`${this.label} (${this._currency})`}get field(){return c`
      <div
        class="field ${this.flag||this.showCard?"with-clip":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.cardBlock}${this.backAmount} ${this.labelledInput}
        ${this.clearButton}
      </div>
    `}get backAmount(){return c`
      <span class="back" aria-hidden="true">
        <span
          class="back-currency ${this._isRightAligned?"right":""} ${this.placeholder&&!this.value?"hide-currency":""}"
          >${this._currency}</span
        >
        <span class="back-amount">${this.value}</span>
      </span>
    `}_setCurrencyWidth(){const t=this._isRightAligned?0:this._currencyBlock.offsetWidth,a=e`
      ${t/16}rem
    `;this._formElement.style.setProperty("margin-left",a)}_getFlag(){var e;let t=this.flag.toLowerCase();return t=t[0].toUpperCase()+t.slice(1),null===(e=it[`flags${t}`])||void 0===e?void 0:e.call(it)}_formatNumber(e,t){return t?e.replace(/\D/g,"").replace(/\B(?=(\d{3})+(?!\d))/g,this._groupChar):e.replace(/\D/g,"")}_formatCurrency(e,t){let a;if(e.indexOf(t)>=0){const i=e.indexOf(t);let r=e.substring(0,i),o=e.substring(i);r=this._formatNumber(r,!0),o=this._formatNumber(o,!1),o=o.substring(0,this.decimalDigits),a=this.decimalDigits?r+t+o:r}else a=this._formatNumber(e,!0);return a}formatValue(e){if(""===e||null==e)return void this._fireChange(e,this.amount);this.amount=e?Number(e.replace(new RegExp(`\\${this._groupChar}`,"g"),"").replace(new RegExp(`\\${this._separator}`),".")):0;const t=String(e),a=this._formElement,i=t.length;let r=a.selectionStart;const o=this._formatCurrency(t,this._separator);a.value=o,t===o&&this._fireChange(o,this.amount),this.value=a.value;r=o.length-i+r,a.setSelectionRange(r,r)}_checkTrailingDecimal(){this.value&&this.value.endsWith(this._separator)&&(this.value=this.value.replace(this._separator,""))}_fireChange(e,t){this.dispatchEvent(new CustomEvent("form-amount-input-change",{detail:{value:e,amount:t},bubbles:!0,composed:!0}))}}var Ra=e`:host {
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
`;const Da={light:e`
    ${ga.light}
  `,dark:e`
    ${ga.dark}
  `};class Ma extends(a(fa)){static get is(){return"bbva-form-attach"}static get properties(){return{inputType:{type:String,attribute:"input-type"}}}constructor(){super(),this.actionIcon="",this.actionIntoForm=!0,this.actionType="submit",this.actionVariant="no-background",this.inputType=""}static get styles(){return[super.styles,Ra,l("bbva-form-attach-shared-styles"),Da.light,Da.dark]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}get _icons(){const e={camera:ke(),contact:Se()};return this.inputType in e&&e[this.inputType]}}const Oa=new t;var qa=e`:host {
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
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
${Oa.mediaRules()}`;const Va={dark:e`
    ${ga.dark}
  `,light:e`
    ${ga.light}
  `};class Ba extends(a(fa)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":_e,"bbva-icon":_,"bbva-text":$,"bbva-link":W,"bbva-notification-help":jt,"bbva-button-default":ie}}static get properties(){return{flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text"}_getFlag(){var e;let t=this.flag.toLowerCase();return t=t[0].toUpperCase()+t.slice(1),null===(e=it[`flags${t}`])||void 0===e?void 0:e.call(it)}static get styles(){return[super.styles,qa,Va.light,Va.dark,l("bbva-form-text-shared-styles")]}get field(){return c`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return c`
      ${this.flag?c`
            <span class="flag">
              <bbva-clip-flag
                icon="${d(this._getFlag())}"
                size="small"
                iconset="${d(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}const Fa=new t;var za=e`:host {
  display: block;
  box-sizing: border-box;
  --_form-date-clear-icon-color: var(--bbva-form-date-dark-mode-clear-icon-color, var(--bbva-form-date-clear-icon-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_form-date-invalid-clear-icon-color: var(--bbva-form-date-dark-mode-invalid-clear-icon-color, var(--bbva-form-date-invalid-clear-icon-color, var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_form-date-readonly-clear-color: var(--bbva-form-date-dark-mode-readonly-clear-icon-color, var(--bbva-form-date-readonly-clear-icon-color, var(--colorsSecondary500, ${h(m.secondary500)})));
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
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
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
  width: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
${Fa.mediaRules()}`;const Ha=new t;var Ga=e`[ambient^=light] {
  --bbva-form-date-clear-icon-color: initial;
  --bbva-form-date-invalid-clear-icon-color: initial;
  --bbva-form-date-readonly-clear-icon-color: initial;
}
${Ha.mediaRules()}`;const ja=new t;var Ua=e`[ambient^=dark] {
  --bbva-form-date-clear-icon-color: var(--colorsPrimaryVariantLightened, ${h(m.primaryVariantLightened)});
  --bbva-form-date-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-date-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${ja.mediaRules()}`;const Xa={dark:e`
    ${Ua}
    ${g.dark}
    ${ga.dark}
  `,light:e`
    ${Ga}
    ${g.light}
    ${ga.light}
  `};w("colors.primaryCoreLightened"),w("colors.tertiaryType1Light"),w("colors.secondary500");class Wa extends(a(fa)){static get is(){return"bbva-form-date"}static get scopedElements(){return{"bbva-icon":_,"bbva-text":$,"bbva-link":W,"bbva-notification-help":jt,"bbva-button-default":ie}}constructor(){super(),this.type="date",this.clearIcon=xe()}static get styles(){return[super.styles,za,Xa.light,Xa.dark,l("bbva-form-date-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return c`
      <div
        class="field"
        @keydown="${this._onFocusin}"
        @click="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}get clearIconBlock(){return c`
      <span class="clear">
        <bbva-icon
          .icon="${this.clearIcon}"
          .size="${this.clearIconSize}"
        ></bbva-icon>
      </span>
    `}}const Qa=new t;var Ya=e`:host {
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
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
${Qa.mediaRules()}`;const Ka=e`
    ${ga.dark}
  `,Ja=e`
    ${ga.light}
  `;class Za extends(a(fa)){static get is(){return"bbva-form-number"}static get scopedElements(){return{"bbva-clip-flag":_e,"bbva-text":$,"bbva-icon":_,"bbva-link":W,"bbva-notification-help":jt,"bbva-button-default":ie}}static get properties(){return{flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="number"}_getFlag(){var e;let t=this.flag.toLowerCase();return t=t[0].toUpperCase()+t.slice(1),null===(e=it[`flags${t}`])||void 0===e?void 0:e.call(it)}static get styles(){return[super.styles,Ya,l("bbva-form-number-shared-styles")]}get field(){return c`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return c`
      ${this.flag?c`
            <span class="flag">
              <bbva-clip-flag
                icon="${d(this._getFlag())}"
                size="small"
                iconset="${d(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}const ei=new t;var ti=e`:host {
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
${ei.mediaRules()}`;const ai={light:e`
    ${ga.light}
  `,dark:e`
    ${ga.dark}
  `};class ii extends(a(f(fa))){static get is(){return"bbva-form-search"}static get scopedElements(){return{"bbva-icon":_,"bbva-text":$,"bbva-link":W,"bbva-notification-help":jt,"bbva-button-default":ie}}static get properties(){return{disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},iconVariant:{type:String,attribute:"icon-variant"}}}constructor(){super(),this.type="search",this.actionType="submit",this.actionIcon=Ce(),this.actionAccessibleText="bbva-form-input-search-submit",this.actionIntoForm=!0}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.actionIcon=this._icons}firstUpdated(e){super.firstUpdated(e),this._field=this.shadowRoot.querySelector(".field"),this._action=this.shadowRoot.querySelector(".action")}updated(e){super.updated&&super.updated(e),e.has("variant")&&"trigger"===this.variant&&this._field.addEventListener("click",this.handleInputClick)}static get styles(){return[super.styles,ti,l("bbva-form-search-shared-styles"),ai.light,ai.dark]}handleInputClick(){this.dispatchEvent(new CustomEvent("form-search-input-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.value&&this.dispatchEvent(new CustomEvent("form-search-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}get _icons(){const e={access:Te(),search:Ce()};return this.iconVariant in e?e[this.iconVariant]:e.search}}const ri=new t;var oi=e`:host {
  display: block;
  box-sizing: border-box;
  --_form-time-clear-icon-color: var(--bbva-form-time-clear-icon-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)}));
  --_form-time-invalid-clear-icon-color: var(--bbva-form-time-invalid-clear-icon-color, var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)}));
  --_form-time-readonly-clear-color: var(--bbva-form-time-readonly-clear-icon-color, var(--colorsSecondary500, ${h(m.secondary500)}));
}

.clear {
  display: flex;
  justify-content: center;
  align-items: center;
  width: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
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
${ri.mediaRules()}`;const si=new t;var ni=e`[ambient^=dark100] {
  --bbva-form-time-clear-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-time-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-time-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

[ambient^=dark300] {
  --bbva-form-time-clear-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-time-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-time-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${si.mediaRules()}`;const li=new t;var ci=e`[ambient^=light] {
  --bbva-form-time-clear-icon-color: initial;
  --bbva-form-time-invalid-clear-icon-color: initial;
  --bbva-form-time-readonly-clear-icon-color: initial;
}
${li.mediaRules()}`;const di={dark:e`
    ${ni}
    ${ga.dark}
  `,light:e`
    ${ci}
    ${ga.light}
  `};class hi extends(a(fa)){static get is(){return"bbva-form-time"}static get scopedElements(){return{"bbva-icon":_,"bbva-text":$,"bbva-link":W,"bbva-notification-help":jt,"bbva-button-default":ie}}constructor(){super(),this.type="time",this.clearIcon=fe()}static get styles(){return[super.styles,di.light,di.dark,oi,l("bbva-form-time-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return c`
      <div
        class="field"
        @click="${this._onFocusin}"
        @keydown="${this._onFocusin}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.clearIconBlock} ${this.labelledInput}
      </div>
    `}get clearIconBlock(){return c`
      <span class="clear">
        <bbva-icon
          .icon="${this.clearIcon}"
          .size="${this.clearIconSize}"
        ></bbva-icon>
      </span>
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}}var bi=e`:host {
  --_icon-color: var(--bbva-form-password-hint-dark-mode-icon-color, var(--bbva-form-password-hint-icon-color, var(--colorsTertiaryType6Dark, ${h(m.tertiaryType6Dark)})));
  --_text-color: var(--bbva-form-password-hint-dark-mode-text-color, var(--bbva-form-password-hint-text-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  display: flex;
  align-items: flex-start;
  box-sizing: border-box;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) 1rem 0;
  font-size: var(--typographyType3XSmall, ${h(b.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${h(p.type3XSmall)});
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

.icon {
  fill: var(--_icon-color);
}

.unmarked {
  display: block;
  border: 1px solid var(--_icon-color);
  border-radius: 50%;
}
`,pi=e`[ambient^=light] {
  --bbva-form-password-hint-text-color: initial;
  --bbva-form-password-hint-icon-color: initial;
}
`,ui=e`[ambient^=dark] {
  --bbva-form-password-hint-text-color: var(--colorsPrimaryVariantLightened, ${h(m.primaryVariantLightened)});
  --bbva-form-password-hint-icon-color: var(--colorsPrimaryVariantLightened, ${h(m.primaryVariantLightened)});
}
`;const mi={dark:e`
    ${ui}
    ${ga.dark}
    ${g.dark}
  `,light:e`
    ${pi}
    ${ga.light}
    ${g.light}
  `};w("colors.primaryCoreLightened"),w("colors.tertiaryType6");const vi=n(),gi="bbva-form-input-form-password-hint-checked",yi="bbva-form-input-form-password-hint-unchecked";class fi extends(f(a(i))){static get is(){return"bbva-form-password-hint"}static get scopedElements(){return{"bbva-icon":_}}static get properties(){return{checked:{type:Boolean,reflect:!0}}}constructor(){super(),this.checked=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","listitem")}static get styles(){return[bi,mi.dark,mi.light,l("bbva-form-password-hint-shared-styles")]}render(){return c`
      ${this.checked?this._markedTpl:this._unmarkedTpl}
      <div class="text">
        <slot></slot>
        <span class="sr-only">${this._srCheckedMessage}</span>
      </div>
    `}get _markedTpl(){return c` <bbva-icon class="mark icon" icon="${vi}"></bbva-icon> `}get _unmarkedTpl(){return c` <span class="mark unmarked" aria-hidden="true"></span> `}get _srCheckedMessage(){return this.checked?this.t(gi):this.t(yi)}}const _i=new t;var $i=e`:host {
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
${_i.mediaRules()}`;const ki={dark:e`
    ${ga.dark}
    ${mi.dark}
  `,light:e`
    ${ga.light}
    ${mi.light}
  `};class Si extends(a(ee(f(fa)))){static get is(){return"bbva-form-password"}static get scopedElements(){return{"bbva-text":$,"bbva-icon":_,"bbva-link":W,"bbva-notification-help":jt,"bbva-button-default":ie,"bbva-form-password-hint":fi}}static get properties(){return{toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},hintsListLabel:{type:String,reflect:!0,attribute:"hints-list-label"}}}constructor(){super(),this.actionType="button",this.actionVariant="no-background",this.actionIntoForm=!0,this.type="password",this.toggleVisibleIcon=we(),this.toggleIconSize=24,this.toggleAccessibleText="bbva-form-input-password-toggle",this.toggleVisibleAccessibleText="bbva-form-input-password-toggle-visible",this.visible=!1,this.toggleIcon=Ie(),this.actionIcon=this.toggleIcon,this.actionIconSecondary=this.toggleVisibleIcon,this.actionAccessibleText=this.toggleAccessibleText,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.hintsListLabel="",this._onSlotsChange=this._onSlotsChange.bind(this),this.addEventListener("slotschanges",this._onSlotsChange)}updated(e){super.updated(e),e.has("visible")&&(this.type=this.visible?"text":"password")}static get styles(){return[super.styles,$i,ki.dark,ki.light,l("bbva-form-password-shared-styles")]}switchIcon(){this._secondary=!this._secondary,this.visible=!this.visible,this.focus(),this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this.visible,bubbles:!0,composed:!0}))}get _hintsTpl(){return c`
      <div
        class="hints"
        role="list"
        aria-label="${this.t(this._hintsListLabel)}"
        ?hidden="${this.readonly||!this._hasHints}"
      >
        <slot name="hints"></slot>
      </div>
    `}get _hintsListLabel(){return this.hintsListLabel}_onSlotsChange(e){const{slotName:t,contentSlots:a}=e.detail;"hints"===t&&(this._hasHints=Boolean(a.length))}render(){return c`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo} ${this._hintsTpl}
    `}}const xi=new t;var Ci=e`:host {
  display: block;
  box-sizing: border-box;
  --_form-textarea-field-bg-color: var(--bbva-form-textarea-dark-mode-field-bg-color, var(--bbva-form-textarea-field-bg-color, var(--ambientsLight100, ${h(G.light100)})));
  --_form-textarea-field-border-color: var(--bbva-form-textarea-dark-mode-field-border-color, var(--bbva-form-textarea-field-border-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_form-textarea-focused-field-border-color: var(--bbva-form-textarea-dark-mode-focused-field-border-color, var(--bbva-form-textarea-focused-field-border-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_form-textarea-invalid-field-bg-color: var(--bbva-form-textarea-dark-mode-invalid-field-bg-color, var(--bbva-form-textarea-invalid-field-bg-color, var(--colorsTertiaryType5Lightened, ${h(m.tertiaryType5Lightened)})));
  --_form-textarea-invalid-field-border-color: var(--bbva-form-textarea-dark-mode-invalid-field-border-color, var(--bbva-form-textarea-invalid-field-border-color, var(--colorsTertiaryType5Medium, ${h(m.tertiaryType5Medium)})));
  --_form-textarea-textarea-color: var(--bbva-form-textarea-dark-mode-textarea-color, var(--bbva-form-textarea-textarea-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_form-textarea-readonly-textarea-color: var(--bbva-form-textarea-dark-mode-readonly-textarea-color, var(--bbva-form-textarea-readonly-textarea-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_form-textarea-invalid-textarea-color: var(--bbva-form-textarea-dark-mode-invalid-textarea-color, var(--bbva-form-textarea-invalid-textarea-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_form-textarea-label-color: var(--bbva-form-textarea-dark-mode-label-color, var(--bbva-form-textarea-label-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_form-textarea-label-out-color: var(--bbva-form-textarea-dark-mode-label-out-color, var(--bbva-form-textarea-label-out-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_form-textarea-focused-label-color: var(--bbva-form-textarea-dark-mode-focused-label-color, var(--bbva-form-textarea-focused-label-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_form-textarea-readonly-label-color: var(--bbva-form-textarea-dark-mode-readonly-label-color, var(--bbva-form-textarea-readonly-label-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_form-textarea-invalid-label-color: var(--bbva-form-textarea-dark-mode-invalid-label-color, var(--bbva-form-textarea-invalid-label-color, var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_form-textarea-message-color: var(--bbva-form-textarea-dark-mode-message-color, var(--bbva-form-textarea-message-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_form-textarea-message-info-icon-color: var(--bbva-form-textarea-dark-mode-message-info-icon-color, var(--bbva-form-textarea-message-info-icon-color, var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)})));
  --_form-textarea-message-error-icon-color: var(--bbva-form-textarea-dark-mode-message-error-icon-color, var(--bbva-form-textarea-message-error-icon-color, var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)})));
  --_form-textarea-message-info-counter-color: var(--bbva-form-textarea-dark-mode-message-info-counter-color, var(--bbva-form-textarea-message-info-counter-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --bbva-button-default-icon-color-variant: var(--bbva-form-textarea-dark-mode-icon-color-variant, var(--bbva-form-textarea-icon-color-variant, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
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
  max-height: calc(((17.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
  background-color: var(--_form-textarea-field-bg-color);
  border-bottom: 1px solid var(--_form-textarea-field-border-color);
  border-radius: var(--bbva-form-textarea-field-border-radius, var(--borderRadiusSmall, ${h(Ee.small)}));
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
  font-style: var(--fontFacePrimaryBookFontStyle, ${h(u.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${h(u.book.fontWeight)});
}

.label,
.slot-textarea ::slotted(textarea) {
  font-size: var(--typographyTypeSmall, ${h(b.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${h(p.typeSmall)});
}

.slot-textarea ::slotted(textarea) {
  will-change: transform;
  width: 100%;
  height: var(--area-height, calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem));
  min-height: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  max-height: calc(((12.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  font-family: inherit;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
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
  width: calc(100% - calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem));
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em);
  color: var(--_form-textarea-label-color);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-textarea-focused-label-color);
  transform: translateY(calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 15) * 1em)) scale(0.8);
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
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 12) * 1em);
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
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
${xi.mediaRules()}`;const Ti=new t;var wi=e`[ambient^=light] {
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
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${Ti.mediaRules()}`;const Ii=new t;var Ei=e`[ambient^=dark] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCore, ${h(m.primaryCore)});
  --bbva-form-textarea-field-border-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-textarea-focused-field-border-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-textarea-field-border-radius: var(--borderRadiusSmall, ${h(Ee.small)});
  --bbva-form-textarea-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${h(m.tertiaryType5Lightened)});
  --bbva-form-textarea-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${h(m.tertiaryType5Medium)});
  --bbva-form-textarea-label-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-textarea-focused-label-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-textarea-readonly-label-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-textarea-invalid-label-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
  --bbva-form-textarea-label-out-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-textarea-textarea-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-textarea-invalid-textarea-color: var(--colorsSecondary600, ${h(m.secondary600)});
  --bbva-form-textarea-readonly-textarea-color: var(--colorsSecondary100, ${h(m.secondary100)});
  --bbva-form-textarea-message-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-textarea-message-error-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-textarea-message-info-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-textarea-message-error-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-form-textarea-message-info-counter-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

[ambient=dark100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLight, ${h(m.primaryCoreLight)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)});
  --bbva-form-textarea-icon-color-variant: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${Ii.mediaRules()}`;const Li={dark:e`
    ${Ei}
    ${y.dark}
  `,light:e`
    ${wi}
    ${y.light}
  `};w("colors.cool70"),w("colors.cool20"),w("colors.primaryCoreLightened"),w("colors.cool60"),w("colors.tertiaryType1Light"),w("colors.primaryCoreLightened"),w("colors.cool20"),w("colors.primaryCoreLightened"),w("colors.cool20"),w("colors.cool20"),w("colors.cool20"),w("colors.tertiaryType1Light"),w("colors.primaryCoreLightened"),w("colors.primarySubduedLight"),w("colors.tertiaryType1Light"),w("colors.cool20"),w("colors.primaryCoreLightened");class Pi extends(a(f(rt))){static get is(){return"bbva-form-textarea"}static get scopedElements(){return{"bbva-icon":_,"bbva-text":$,"bbva-link":W,"bbva-button-default":ie,"bbva-notification-help":jt}}static get properties(){return{validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},characterCounterLabel:{type:String,attribute:"character-counter-label"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoMessage:{type:String,attribute:"info-message"},label:{type:String},labelOut:{type:String,attribute:"label-out"}}}constructor(){super(),this.label="",this.labelOut="",this.optionalLabel="bbva-form-input-textarea-optional-label",this.characterCounterLabel="bbva-form-input-textarea-counter-label",this.clearIcon=oe(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-input-textarea-clear",this.errorIcon=Le(),this.errorMessage="",this.infoIcon=o(),this.infoMessage="",this._onInputRaf=this._onInput}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field"),this._formElement=this.querySelector("textarea")}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}static get styles(){return[Ci,Li.dark,Li.light,l("bbva-form-textarea-shared-styles")]}render(){return c`${this._labelOut} ${this.field} ${this.messageError} ${this._characterCounter}
    ${this.messageInfo}`}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),`${this.label} ${this.labelOut||this.required?this.t(this.optionalLabel):""}`}get _helpIcon(){return this.helpIcon?c`
          <bbva-link
            @click="${this._helpClicked}"
            icon="${O}"
            iconSize="24"
            href="${d(this.linkHref)}"
            aria-label="${this.t("bbva-form-input-textarea-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?c`
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
      `:""}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}_onInput(){this.value=this._formElement.value,this.style.removeProperty("--area-height"),this.style.setProperty("--area-height",this._formElement.scrollHeight/16+"rem"),this._calculateCharacters()}get field(){return c`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this._labelledTextarea} ${this.clearButton}
      </div>
    `}get clearButton(){return c`
      <bbva-button-default
        class="clear"
        variant="icon no-background"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearTextarea}"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-default>
    `}get messageError(){return this._errorVisible?c`
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
        `:""}get _errorVisible(){return this.errorMessage&&this.invalid}get _characters(){return"number"==typeof this._remainingCharacters?this._remainingCharacters:this.maxlength}get _characterCounter(){return this.maxlength?c`
          <div class="message info counter">
            <bbva-text
              unset
              text="${this._characters} ${this.t(this.characterCounterLabel)}"
              size="2XS"
            >
            </bbva-text>
          </div>
        `:""}get messageInfo(){return this.infoMessage?c`
          <bbva-notification-help
            disabled-tabindex
            accessibility-label-icon="${this.t("bbva-form-input-field-accessibility-info-icon")}"
            .icon="${this.infoIcon}"
            text=${this.t(this.infoMessage)}
          ></bbva-notification-help>
        `:""}get _labelBlock(){return c`
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
    `}_calculateCharacters(){var e;this._remainingCharacters=this.maxlength-(null===(e=this._formElement)||void 0===e?void 0:e.value.length)}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const{activeElement:e}=this._rootNode,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-textarea-input-focus",{detail:!0,bubbles:!0,composed:!0}))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-textarea-input-blur",{detail:!0,bubbles:!0,composed:!0}))}clearTextarea(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-textarea-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}}var Ai=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;const Ni={light:e`
    ${ga.light}
    ${Xa.light}
    ${Ja}
    ${xa.light}
    ${ki.light}
    ${ai.light}
    ${Va.light}
    ${di.light}
    ${Li.light}
    ${Da.light}
  `,dark:e`
    ${ga.dark}
    ${Xa.dark}
    ${Ka}
    ${xa.dark}
    ${ki.dark}
    ${ai.dark}
    ${Va.dark}
    ${di.dark}
    ${Li.dark}
    ${Da.dark}
  `};class Ri extends(a(ee(i))){static get is(){return"bbva-form-input"}static get scopedElements(){return{"bbva-form-attach":Ma,"bbva-form-text":Ba,"bbva-form-amount":Na,"bbva-form-date":Wa,"bbva-form-number":Za,"bbva-form-search":ii,"bbva-form-password":Si,"bbva-form-time":hi,"bbva-form-textarea":Pi}}static get properties(){return{type:{type:String,reflect:!0},disabled:{type:Boolean,reflect:!0},value:{type:String},name:{type:String},required:{type:Boolean},readonly:{type:Boolean},autocomplete:{type:String},label:{type:String},pattern:{type:String},allowedPattern:{type:String,attribute:"allowed-pattern"},modeInput:{type:String,attribute:"mode-input"},max:{type:String},maxlength:{type:Number},min:{type:String},minlength:{type:Number},placeholder:{type:String},step:{type:Number},accessibleDescription:{type:String,attribute:"accessible-description"},autoValidate:{type:Boolean,attribute:"auto-validate"},form:{type:String},actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},symbol:{type:String},symbolLeft:{type:Boolean,attribute:"symbol-left"},symbolRight:{type:Boolean,attribute:"symbol-right"},amount:{type:Number},language:{type:String},abbr:{type:Number},abbreviations:{type:Object},decimalDigits:{type:Number,attribute:"decimal-digits"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},zeroDecimalsHidden:{type:Boolean,attribute:"zero-decimals-hidden"},trailingZeroDecimalsHidden:{type:Boolean,attribute:"trailing-zero-decimals-hidden"},separatorChar:{type:String,attribute:"separator-char"},groupChar:{type:String,attribute:"group-char"},_intlLanguage:{attribute:!1},_intlAmountLanguage:{attribute:!1},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"},items:{type:Array},minChars:{type:Number,attribute:"min-chars"},maxResults:{type:Number,attribute:"max-results"},filterValueKey:{type:String,attribute:"filter-value-key"},autoselect:{type:Boolean},selectOnBlur:{type:Boolean,attribute:"select-on-blur"},inlineAutocomplete:{type:Boolean,attribute:"inline-autocomplete"},keepOnBlur:{type:Boolean,attribute:"keep-on-blur"},keepOnSelect:{type:Boolean,attribute:"keep-on-select"},preventValueUpdateOnSelect:{type:Boolean,attribute:"prevent-value-update-on-select"},overlay:{type:Boolean,reflect:!0},search:{type:Boolean},toggleIcon:{type:String,attribute:"toggle-icon"},toggleVisibleIcon:{type:String,attribute:"toggle-visible-icon"},toggleIconSize:{type:Number,attribute:"toggle-icon-size"},toggleAccessibleText:{type:String,attribute:"toggle-accessible-text"},toggleVisibleAccessibleText:{type:String,attribute:"toggle-visible-accessible-text"},visible:{type:Boolean},disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String},characterCounterLabel:{type:String,attribute:"character-counter-label"},iconVariant:{type:String,attribute:"icon-variant"},showCard:{type:Boolean,attribute:"show-card"},invalid:{type:Boolean},autoFocus:{type:Boolean,attribute:"autofocus"},logo:{type:String},cardType:{type:String,attribute:"card-type"},cardImage:{type:String,attribute:"card-image"},partner:{type:Boolean},partnerLogo:{type:String,attribute:"partner-logo"},cardVariant:{type:String,attribute:"card-variant"},cardStatus:{type:String,attribute:"card-status",reflect:!0},payCompatibility:{type:String,attribute:"pay-compatibility"},hideBottomPaddingInfoMessage:{type:Boolean,attribute:"hide-bottom-padding-info-message"}}}constructor(){super(),this.logo="",this.cardStatus="",this.cardType="",this.cardImage="",this.partner=!1,this.cardVariant="",this.payCompatibility="",this.abbreviations={1:"da",2:"h",3:"k",6:"M",9:"B"},this.autoFocus=!1,this.actionAccessibleText="",this.actionIconSize=24,this.actionIconSecondary=this.toggleVisibleIcon,this.actionIconSecondarySize=24,this.actionSecondaryAccessibleText=this.toggleVisibleAccessibleText,this.allowedPattern="",this.autoselect=!1,this.autoValidate=!1,this.clearIcon="",this.clearIconSize=24,this.clearAccessibleText="",this.currencyCode="EUR",this.decimalDigits=2,this.decimalsHidden=!1,this.errorIcon="",this.errorMessage="",this.filterValueKey=null,this.hasError=!1,this.helpIconSize=24,this.invalid=!1,this.infoMessage="",this.inlineAutocomplete=!1,this.items=[],this.keepOnBlur=!1,this.keepOnSelect=!1,this.label="",this.labelOut="",this.localCurrency="EUR",this.maxResults=5,this.minChars=1,this.name="",this.modeInput="text",this.optionalLabel="",this.overlay=!1,this.preventValueUpdateOnSelect=!1,this.required=!1,this.search=!1,this.selectOnBlur=!1,this.toggleAccessibleText="",this.toggleIcon="",this.toggleIconSize=24,this.toggleVisibleIcon="",this.toggleVisibleAccessibleText="",this.trailingZeroDecimalsHidden=!1,this.type="",this.value="",this.visible=!1,this.zeroDecimalsHidden=!1,this.hideBottomPaddingInfoMessage=!1,this.addEventListener("slotschanges",this._onSlotsChange)}static get styles(){return[Ai,l("bbva-form-input-shared-styles"),Ni.light,Ni.dark]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("input",this._updateValue)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("input",this._updateValue)}_updateValue(){const{firstElementChild:e}=this.shadowRoot,{firstElementChild:t}=e;this.value=t.value||e.value,this.dispatchEvent(new CustomEvent("form-input-value-change",{detail:{value:this.value},bubbles:!0,composed:!0}))}get _formAttachTpl(){return c` <bbva-form-attach
      ?autofocus=${this.autoFocus}
      input-type=${this.type}
      action-icon=${d(this.actionIcon)}
      action-icon-secondary=${d(this.actionIconSecondary)}
      label=${d(this.label)}
      label-out=${d(this.labelOut)}
      ?required=${this.required}
      help-icon=${d(this.helpIcon)}
      placeholder=${d(this.placeholder)}
      value=${d(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${d(this.infoMessage)}
      allowed-pattern=${d(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${d(this.pattern)}
      error-message=${d(this.errorMessage)}
      ?action-into-form=${this.actionIntoForm}
      action-variant=${d(this.actionVariant)}
      action-type=${d(this.actionType)}
      action-accessible-text=${d(this.actionAccessibleText)}
      action-secondary-accessible-text=${d(this.actionSecondaryAccessibleText)}
      ?validate-on-blur=${this.validateOnBlur}
      link-href=${d(this.linkHref)}
      optional-label=${d(this.optionalLabel)}
      icon-variant=${d(this.iconVariant)}
      ?invalid=${this.invalid}
    ></bbva-form-attach>`}get _formDateTpl(){return c` <bbva-form-date
      ?autofocus=${this.autoFocus}
      label=${d(this.label)}
      label-out=${d(this.labelOut)}
      ?required=${this.required}
      value=${d(this.value)}
      ?disabled=${this.disabled}
      help-icon=${d(this.helpIcon)}
      ?readonly=${this.readonly}
      info-message=${d(this.infoMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      allowed-pattern=${d(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${d(this.pattern)}
      error-message=${d(this.errorMessage)}
      .min=${this.min}
      .max=${this.max}
      action-type=${d(this.actionType)}
      action-icon=${d(this.actionIcon)}
      action-icon-secondary=${d(this.actionIconSecondary)}
      action-accessible-text=${d(this.actionAccessibleText)}
      action-secondary-accessible-text=${d(this.actionSecondaryAccessibleText)}
      action-variant=${d(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${d(this.linkHref)}
      optional-label=${d(this.optionalLabel)}
      icon-variant=${d(this.iconVariant)}
      ?invalid=${this.invalid}
    ></bbva-form-date>`}get _formTextTpl(){return c` <bbva-form-text
      ?autofocus=${this.autoFocus}
      label=${d(this.label)}
      label-out=${d(this.labelOut)}
      ?required=${this.required}
      help-icon=${d(this.helpIcon)}
      .flag-label=${this.flagLabel}
      .flag=${this.flag}
      flag-iconset=${d(this.flagIconset)}
      placeholder=${d(this.placeholder)}
      value=${d(this.value)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      info-message=${d(this.infoMessage)}
      error-message=${d(this.errorMessage)}
      action-type=${d(this.actionType)}
      action-icon=${d(this.actionIcon)}
      action-icon-secondary=${d(this.actionIconSecondary)}
      action-accessible-text=${d(this.actionAccessibleText)}
      action-secondary-accessible-text=${d(this.actionSecondaryAccessibleText)}
      action-variant=${d(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${d(this.linkHref)}
      optional-label=${d(this.optionalLabel)}
      icon-variant=${d(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      ?invalid=${this.invalid}
      pattern=${d(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${d(this.allowedPattern)}
      inputmode=${d(this.modeInput)}
      maxlength=${d(this.maxlength)}
    ></bbva-form-text>`}get _formAmountTpl(){return c`<bbva-form-amount
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      placeholder=${d(this.placeholder)}
      help-icon=${d(this.helpIcon)}
      amount=${d(this.amount)}
      ?readonly=${this.readonly}
      info-message=${d(this.infoMessage)}
      ?disabled=${this.disabled}
      currency-code=${d(this.currencyCode)}
      local-currency=${d(this.localCurrency)}
      language=${d(this.language)}
      ?symbol-right=${this.symbolRight}
      error-message=${d(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      flag-iconset=${d(this.flagIconset)}
      ?show-card=${this.showCard}
      card-status=${this.cardStatus}
      card-variant=${this.cardVariant}
      card-type=${d(this.cardType)}
      pay-compatibility=${this.payCompatibility}
      ?partner=${this.partner}
      partner-logo=${d(this.partnerLogo)}
      card-image=${d(this.cardImage)}
      action-type=${d(this.actionType)}
      action-icon=${d(this.actionIcon)}
      action-icon-secondary=${d(this.actionIconSecondary)}
      action-accessible-text=${d(this.actionAccessibleText)}
      action-secondary-accessible-text=${d(this.actionSecondaryAccessibleText)}
      action-variant=${d(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${d(this.linkHref)}
      optional-label=${d(this.optionalLabel)}
      icon-variant=${d(this.iconVariant)}
      ?invalid=${this.invalid}
      pattern=${d(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${d(this.allowedPattern)}
      decimal-digits=${d(this.decimalDigits)}
      ?decimals-hidden=${this.decimalsHidden}
      ?trailing-zero-decimals-hidden=${this.trailingZeroDecimalsHidden}
      ?zero-decimals-hidden=${this.zeroDecimalsHidden}
      group-char=${d(this.groupChar)}
      separator-char=${d(this.separatorChar)}
      inputmode=${d(this.modeInput)}
      maxlength=${d(this.maxlength)}
    ></bbva-form-amount> `}get _formNumberTpl(){return c`<bbva-form-number
      ?autofocus=${this.autoFocus}
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${d(this.value)}
      .flag=${this.flag}
      .flag-label=${this.flagLabel}
      flag-iconset=${d(this.flagIconset)}
      placeholder=${d(this.placeholder)}
      ?disabled=${this.disabled}
      ?readonly=${this.readonly}
      help-icon=${d(this.helpIcon)}
      info-message=${d(this.infoMessage)}
      error-message=${d(this.errorMessage)}
      .min=${this.min}
      .max=${this.max}
      ?invalid=${this.invalid}
      action-type=${d(this.actionType)}
      action-icon=${d(this.actionIcon)}
      action-icon-secondary=${d(this.actionIconSecondary)}
      action-accessible-text=${d(this.actionAccessibleText)}
      action-secondary-accessible-text=${d(this.actionSecondaryAccessibleText)}
      action-variant=${d(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${d(this.linkHref)}
      optional-label=${d(this.optionalLabel)}
      icon-variant=${d(this.iconVariant)}
      ?validate-on-blur=${this.validateOnBlur}
      pattern=${d(this.pattern)}
      ?auto-validate=${this.autoValidate}
      allowed-pattern=${d(this.allowedPattern)}
      inputmode=${d(this.modeInput)}
      maxlength=${d(this.maxlength)}
    ></bbva-form-number> `}get _formSearchTpl(){return c`<bbva-form-search
      ?autofocus=${this.autoFocus}
      label=${d(this.label)}
      label-out=${d(this.labelOut)}
      ?required=${this.required}
      value=${d(this.value)}
      .placeholder=${this.placeholder}
      ?readonly=${this.readonly}
      info-message=${d(this.infoMessage)}
      error-message=${d(this.errorMessage)}
      ?disabled-button=${this.disabledButton}
      help-icon=${d(this.helpIcon)}
      ?disabled=${this.disabled}
      allowed-pattern=${d(this.allowedPattern)}
      ?auto-validate=${this.autoValidate}
      pattern=${d(this.pattern)}
      variant=${d(this.variant)}
      icon-variant=${d(this.iconVariant)}
      ?invalid=${this.invalid}
      action-type=${d(this.actionType)}
      action-icon=${d(this.actionIcon)}
      action-icon-secondary=${d(this.actionIconSecondary)}
      action-accessible-text=${d(this.actionAccessibleText)}
      action-secondary-accessible-text=${d(this.actionSecondaryAccessibleText)}
      action-variant=${d(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${d(this.linkHref)}
      optional-label=${d(this.optionalLabel)}
      ?validate-on-blur=${this.validateOnBlur}
    ></bbva-form-search> `}get _formPasswordTpl(){return c`<bbva-form-password
      ?autofocus=${this.autoFocus}
      label=${d(this.label)}
      label-out=${d(this.labelOut)}
      ?required=${this.required}
      value=${d(this.value)}
      ?readonly=${this.readonly}
      info-message=${d(this.infoMessage)}
      pattern=${d(this.pattern)}
      help-icon=${d(this.helpIcon)}
      allowed-pattern=${d(this.allowedPattern)}
      error-message=${d(this.errorMessage)}
      ?validate-on-blur=${this.validateOnBlur}
      ?auto-validate=${this.autoValidate}
      name=${d(this.name)}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      .min=${this.min}
      .max=${this.max}
      action-variant=${d(this.actionVariant)}
      toggle-icon=${d(this.toggleIcon)}
      toggle-visible-icon=${d(this.toggleVisibleIcon)}
      toggle-icon-size=${d(this.toggleIconSize)}
      toggle-accessible-text=${d(this.toggleAccessibleText)}
      toggle-visible-accessible-text=${d(this.toggleVisibleAccessibleText)}
      ?visible=${this.visible}
      action-type=${d(this.actionType)}
      action-icon=${d(this.actionIcon)}
      action-icon-secondary=${d(this.actionIconSecondary)}
      action-accessible-text=${d(this.actionAccessibleText)}
      action-secondary-accessible-text=${d(this.actionSecondaryAccessibleText)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${d(this.linkHref)}
      optional-label=${d(this.optionalLabel)}
      icon-variant=${d(this.iconVariant)}
      ?hide-bottom-padding-info-message=${this.hideBottomPaddingInfoMessage}
      ><div slot="hints"><slot name="hint"></slot></div
    ></bbva-form-password> `}get _formTimeTpl(){return c` <bbva-form-time
      ?autofocus=${this.autoFocus}
      label=${d(this.label)}
      label-out=${d(this.labelOut)}
      ?required=${this.required}
      value=${d(this.value)}
      ?readonly=${this.readonly}
      info-message=${d(this.infoMessage)}
      error-message=${d(this.errorMessage)}
      help-icon=${d(this.helpIcon)}
      pattern=${d(this.pattern)}
      ?auto-validate=${this.autoValidate}
      ?validate-on-blur=${this.validateOnBlur}
      .min=${this.min}
      .max=${this.max}
      ?disabled=${this.disabled}
      ?invalid=${this.invalid}
      action-type=${d(this.actionType)}
      action-icon=${d(this.actionIcon)}
      action-icon-secondary=${d(this.actionIconSecondary)}
      action-accessible-text=${d(this.actionAccessibleText)}
      action-secondary-accessible-text=${d(this.actionSecondaryAccessibleText)}
      action-variant=${d(this.actionVariant)}
      ?action-into-form=${this.actionIntoForm}
      link-href=${d(this.linkHref)}
      optional-label=${d(this.optionalLabel)}
      icon-variant=${d(this.iconVariant)}
    ></bbva-form-time>`}get _formTextareaTpl(){return c` <bbva-form-textarea
      label=${this.label}
      label-out=${this.labelOut}
      ?required=${this.required}
      value=${d(this.value)}
      ?readonly=${this.readonly}
      info-message=${d(this.infoMessage)}
      ?disabled=${this.disabled}
      maxlength=${d(this.maxlength)}
      minlength=${d(this.minlength)}
      ?auto-validate=${this.autoValidate}
      error-message=${d(this.errorMessage)}
      ?autofocus=${this.autoFocus}
      ?invalid=${this.invalid}
      help-icon=${d(this.helpIcon)}
      ?validate-on-blur=${this.validateOnBlur}
      character-counter-label=${d(this.characterCounterLabel)}
      pattern=${d(this.pattern)}
      allowed-pattern=${d(this.allowedPattern)}
    ></bbva-form-textarea>`}_inputTpl(e){return{text:this._formTextTpl,camera:this._formAttachTpl,contact:this._formAttachTpl,amount:this._formAmountTpl,date:this._formDateTpl,number:this._formNumberTpl,search:this._formSearchTpl,time:this._formTimeTpl,password:this._formPasswordTpl,textarea:this._formTextareaTpl}[e]}_onSlotsChange(e){const{slotName:t,contentSlots:a}=e.detail;"hint"===t&&(this._hasHints=Boolean(a.length),this.hideBottomPaddingInfoMessage=this._hasHints)}render(){return c` ${this._inputTpl(this.type)} `}}const Di=new t;var Mi=e`[ambient^=light] {
  --bbva-list-simple-label-color: initial;
  --bbva-list-simple-mask-color: initial;
  --bbva-list-simple-description-color: initial;
  --bbva-list-simple-icon-color: initial;
  --bbva-list-simple-active-bg-color: initial;
  --bbva-list-simple-active-link-color: initial;
  --bbva-list-simple-link-color: initial;
  --bbva-list-simple-link-active-color: initial;
  --bbva-list-simple-skeleton-color: initial;
  --bbva-list-simple-skeleton-bg: initial;
  --bbva-list-simple-stacked-label-color: initial;
}
${Di.mediaRules()}`;const Oi=new t;var qi=e`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${h(m.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${h(m.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${h(m.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
${Oi.mediaRules()}`;const Vi={dark:e`
    ${B.dark}
    ${z.dark}
    ${H.dark}
    ${qi}
  `,light:e`
    ${B.light}
    ${z.light}
    ${H.light}
    ${Mi}
  `},Bi=new t;var Fi=e`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${h(m.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${h(m.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${h(m.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem));
  color: var(--_list-simple-text-color);
  user-select: none;
}

*,
*:before,
*:after {
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

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper-description,
.wrapper-description [data-tag-name=bbva-text] {
  text-align: right;
}

dl,
dd {
  margin: 0;
}

dl {
  display: flex;
  justify-content: space-between;
}

dt,
dd {
  display: flex;
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  text-align: left;
  color: var(--_list-simple-link-color);
}
[data-tag-name=bbva-link]:active {
  --_list-simple-link-color: var(--_list-simple-link-active-color);
}

.action-icons {
  display: flex;
}

button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
}
:host(:not([variant=stacked])) .wrapper-mask {
  align-self: center;
}

.label {
  color: var(--_list-simple-label-color);
}

.description {
  color: var(--_list-simple-description-color);
}

.wrapper-amount {
  overflow: initial;
}

:host([label-medium]) [data-tag-name=bbva-text].label,
:host([description-medium]) [data-tag-name=bbva-text].description,
:host([description-medium]) [data-tag-name=bbva-amount],
:host([description-medium]) .wrapper-mask {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(u.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(u.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${h(u.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${h(u.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${h(u.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${h(u.mediumItalic.fontStyle)});
}

:host([disabled]) [data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 305% 12px;
}
:host([variant=stacked]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 24px 36px;
}
:host([variant=stacked-center]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 90% 12px, 160% 36px;
}

:host([variant=stacked]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
:host([variant=stacked]) dl {
  flex-direction: column;
}
:host([variant=stacked]) .wrapper-description,
:host([variant=stacked]) .wrapper-description [data-tag-name=bbva-text] {
  text-align: left;
}

[data-tag-name=bbva-link]:not([href])[active]:not([disabled]) {
  background-color: transparent;
}

:host([action-link]:active),
:host([description-link]:active),
:host([label-link]:active) {
  background-color: var(--_list-simple-active-bg-color);
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([variant=stacked-center]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
}
:host([variant=stacked-center]) .wrapper [data-tag-name=bbva-link], :host([variant=stacked-center]) [data-tag-name=bbva-text],
:host([variant=stacked-center]) .wrapper-description {
  text-align: center;
}
:host([variant=stacked-center]) dl {
  flex-direction: column;
  margin: auto;
}
:host([variant=stacked-center]) dt,
:host([variant=stacked-center]) dd {
  padding: 0;
  margin: auto;
}
:host([variant=stacked-center]) .action-icons {
  position: absolute;
  right: 1rem;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([variant^=stacked]) .label {
  color: var(--_list-simple-stacked-label-color);
}

:host([variant=stacked-center][action-icon]) dl,
:host([variant=stacked-center][action-secondary-icon]) dl {
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
}
${Bi.mediaRules()}`;class zi extends(I(le(ce(q(a(f(i))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[X,W,Q,$,me];return zi.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Fi,Vi.light,Vi.dark,L("button:focus"),l("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return c`
      <bbva-amount
        disabled-tabindex
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
        ?show-currency-code="${this.showCurrencyCode}"
      >
      </bbva-amount>
    `}get _icon(){return c`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return c`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return c`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const e="nochange"===this.status?"no-change":this.status;return c`
      <bbva-badge-variability
        disabled-tabindex
        .status=${e}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const e=Pe(this.mask,this.maskChars,!0,this.visibleChars);return c`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${e.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let e=null;return this.actionIcon||this.actionSecondaryIcon?e=this._actionIcons:this.actionLink&&(e=this._tplLink("actionLink")),e}get _definitionDescriptionTpl(){let e=null,t="";return this.description?(e=this._tplText("description"),t="description"):this.mask?(e=this._mask,t="mask"):this._isValidAmount&&(e=this._amount,t="amount"),c`
      <dd class=${Y({[`wrapper-${t}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){const t="actionLink"===e?`${e}AccessibilityText`:`${e}LinkAccessibilityText`;return c`
      <bbva-link
        class=${Y({ellipsis:this[`${e}Ellipsis`]})}
        aria-label="${d(this.t(this[t]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(e)}"
      >
        <span role=${d(this.roleLink)} aria-live=${d(this.arialiveLink)}>
          ${this[e]}
        </span>
      </bbva-link>
    `}_tplNoLink(e){const t=`${e}AccessibilityText`,a=`${e}TagText`,i=`${e}RoleText`,r=`${e}AriaLiveText`;return c`
      <bbva-text
        aria-label="${this.t(this[t])}"
        role="${d(this[i])}"
        aria-live="${d(this[r])}"
        class="${e}"
        unset
        size="S"
        text="${this[e]}"
        tag="${d(this[a])}"
      >
      </bbva-text>
    `}_tplText(e){return c` ${this[`${e}Link`]?this._tplLink(e):this._tplNoLink(e)} `}_iconClick(e){this.dispatchEvent(new CustomEvent(`list-simple-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(e){const t=e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return c`
      <dl>
        <dt class=${Y({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return c`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?c`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let e=null;const t=["stacked","stacked-center"].includes(this.variant);return e=this.label?this.description||this._isValidAmount||this.mask||t?t?this.renderStacked():this.renderDefault():this._tplText("label"):c` <div class="wrapper-description">${this._tplText("description")}</div> `,c`
      ${e}
      <div class="skeleton"></div>
    `}}w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.cool60"),w("colors.primaryCoreLightened"),w("colors.primarySubdued"),w("colors.primaryMediumLight"),w("colors.primarySubdued"),w("colors.primaryMediumLight"),w("colors.cool50");class Hi{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let r=0|t,o=Math.max(r>=0?r:i-Math.abs(r),0);for(;o<i;){if((s=a[o])===(n=e)||"number"==typeof s&&"number"==typeof n&&isNaN(s)&&isNaN(n))return!0;o++}var s,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],i=0,r="",o=0,s=arguments.length;o!==s;++o){var n=+arguments[o];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?i=a.push(n):(n-=65536,i=a.push(55296+(n>>10),n%1024+56320)),i>=16383&&(r+=e.apply(null,a),a.length=0)}return r+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}}class Gi extends Hi{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const ji=0,Ui=1,Xi="jwt",Wi="tsec",Qi="none";class Yi extends Hi{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=ji,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Gi,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Wi:this.requiredToken=Qi,this.requiresJWT=!1):this.requiredToken===Wi?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Xi?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Qi?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Wi)}_setJwtHandler(){this._setTokenHandler(Xi)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,i)=>{t=Object.assign(t,{resolve:a,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=Ae),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),i=t[a];return i?delete t[a]:this._error(9,`Missing ${a} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===Ui?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(Wi,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Xi,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=t.getItem(a);i&&"null"!==i&&(e[a]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=a.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,i=e===Xi?"JWT ":"",r=e===Xi?"Authorization":Wi;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let s=this[a].getItem(o);s?t[r]=t[r]||i+s:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const i=new Promise(((e,t)=>{a=(a,i)=>{a?t(a):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?a(i.error):a(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let i=e[a],r=0,o=0;if(i<=127?(r=0,o=255&i):i<=223?(r=1,o=31&i):i<=239?(r=2,o=15&i):i<=244&&(r=3,o=7&i),e.length-a-r>0){let t=0;for(;t<r;)i=e[a+t+1],o=o<<6|63&i,t+=1}else o=65533,r=e.length-a;t+=String.fromCodePoint(o),a+=r+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let i=": ",r=a[e].split(i);t[r.shift().toLowerCase()]=r.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,i){let r=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(r=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(r=JSON.parse(t.headers)[i])}if(r){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==r&&(e.setItem(t,r),this._emitTokenUpdate(a,r))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,i,r,o;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),r=e.getResponseHeader("AuthenticationChallenge"),o=e.getResponseHeader("AuthenticationResponse");else{let s=JSON.parse(e.headers);t=s.authenticationtype,a=s.authenticationdata||null,i=s.authenticationstate,r=s.authenticationchallenge,o=s.authenticationresponse}return{type:t,data:a,state:i,challenge:r,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",i=""){let r;if("object"==typeof e&&e){const o=this._getSignatureData(e.signatureType,t,a);r=this._makeKeyValuePairFromObject(o,e.signatureValue),e.challenge&&(r+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(r,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(r=`password=${e}`,this._buildSignatureHeaders(r,"2",i)):(r=`${a}=${e}`,this._buildSignatureHeaders(r,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,i=e.split(",");if(i.length>1){a=i.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),r=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:o,data:s,state:n,challenge:l,response:c}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(r)this._notifySignatureInvalid(d),a=!0;else if(o)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,o,s,n,l,c),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,o,s,n,l,c),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),r=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),o=this._getRequestMetadata(e);r&&(this._notifyWaitingForProcessResponse(o),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,i){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,i,r,o){this._defineSignatureValue(t,a,i);const s={type:t,data:a,challenge:r,metadata:e};o&&(s.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:s}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const i=t.split(";").findIndex((t=>t===e));return a?a.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,i,r,o){i?this._notifySignatureRequired(e,t,a,i,r,o):this._notifySignatureRequiredFirstStep(e,t,a,i)}_notifySignatureTypeUsingErrorCode(e,t,a,i,r,o,s){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,i,r):this._notifySignatureRequired(t,a,i,r,o,s)}}class Ki extends Yi{constructor(e=null){super(Object.assign(e||{},{method:"DELETE"}))}toString(e=""){return super.toString(e||"BGADPRequestDELETE")}}class Ji extends Yi{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class Zi extends Yi{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class er extends Yi{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class tr extends Ji{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesGetV0")}}class ar extends Ji{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV0")}}class ir extends Ji{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV0")}}class rr extends er{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class or extends er{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersPostV1")}}class sr extends Ji{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}`)}toString(){return super.toString("BGADPCustomersCustomerGetV1")}}class nr extends Ji{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesGetV1")}}class lr extends er{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesPostV1")}}class cr extends Zi{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses/{address-id}`)}toString(){return super.toString("BGADPCustomersCustomerAddressesAddressPatchV1")}}class dr extends Ki{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses/{address-id}`)}toString(){return super.toString("BGADPCustomersCustomerAddressesAddressDeleteV1")}}class hr extends Ji{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV1")}}class br extends er{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsPostV1")}}class pr extends Zi{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details/{contact-detail-id}`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsContactDetailPatchV1")}}class ur extends Ki{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details/{contact-detail-id}`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsContactDetailDeleteV1")}}class mr extends er{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class vr extends er{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/signatures`)}toString(){return super.toString("BGADPCustomersCustomerSignaturesPostV1")}}class gr extends er{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class yr extends Ji{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/channel-status`)}toString(){return super.toString("BGADPCustomersChannelStatusGetV1")}}class fr extends(Ne(i)){static get is(){return"bbva-dataprovider-customers"}static get properties(){return{customerId:{type:String},contactIdForHeader:{type:Object},_bgadpNotExistMessagge:{type:String},services:{type:Object},apiTaxFreeVersion:{type:String}}}constructor(){super(),this.customerId="",this.contactIdForHeader="",this.native=!1,this.requiredToken="tsec",this.apiTaxFreeVersion="0",this.services={BGADPCoCustomersCustomersValidateTaxFreeFinancialMovementPostV0:Xe,BGADPCustomersCustomerAddressesGetV0:tr,BGADPCustomersCustomerContactDetailsGetV0:ar,BGADPCustomersCustomerIndicatorsGetV0:ir,BGADPMxCustomersCustomersCustomerFiscalDataGetV1:We,BGADPMxCustomersCustomersCustomerFiscalDataPatchV1:Qe,BGADPMxCustomersCustomersCustomerOnboardingPostV1:Ye,BGADPMxCustomersNationalElectoralInstituteValidateCredentialsDataPostV1:Ke,BGADPMxCustomersCustomersDigitalValidationPostV1:Je,BGADPCustomersCustomerIdentificationProcessDocumentsPostV1:mr,BGADPCustomersCustomerGetV1:sr,BGADPCustomersCustomerAddressesGetV1:nr,BGADPCustomersCustomerContactDetailsGetV1:hr,BGADPCustomersCustomerAddressesAddressDeleteV1:dr,BGADPCustomersCustomerAddressesPostV1:lr,BGADPCustomersCustomerAddressesAddressPatchV1:cr,BGADPCustomersCustomerContactDetailsPostV1:br,BGADPCustomersCustomerContactDetailsContactDetailPatchV1:pr,BGADPCustomersCustomerContactDetailsContactDetailDeleteV1:ur,BGADPCustomersPostV1:or,BGADPCustomersCivilRegistriesSearchPostV1:rr,BGADPCustomersCustomerSignaturesPostV1:vr,BGADPCustomersCustomerTermsPostV1:gr,BGADPCustomersCustomerAddressesGetV2:Ze,BGADPCustomersCustomerContactDetailsGetV2:et,BGADPCustomersChannelStatusGetV1:yr}}getCustomerFiscalData(e={},t=!0){this.requiredOTP=t;const a=this._getServiceParams(e),i=this._getService("BGADPMxCustomersCustomersCustomerFiscalDataGet",a),r={customEvent:`get-mx-customer-fiscal-data-v${this.version}-success`,errorFireEventHandler:`get-mx-customer-fiscal-data-v${this.version}-error`};this._generateGetService(i,r,this._responseMapping)}patchCustomerFiscalData(e={}){const t=this._getServiceParams({"customer-id":this.customerId},e),a=this._getService("BGADPMxCustomersCustomersCustomerFiscalDataPatch",t),i={customEvent:`patch-mx-customer-fiscal-data-v${this.version}-success`,errorFireEventHandler:`patch-mx-customer-fiscal-data-v${this.version}-error`};this._generateGetService(a,i,this._responseMapping)}postNationalElectoralInstituteValidateCredentialsData(e={}){const t=this._getServiceParams({},e),a=this._getService("BGADPMxCustomersNationalElectoralInstituteValidateCredentialsDataPost",t);this._generateGetService(a,{customEvent:"post-national-electoral-institute-validate-credentials-data-success",errorFireEventHandler:"post-national-electoral-institute-validate-credentials-data-error"},this._responseMapping)}postCustomerIdentificationProcessDocuments(e={typeFile:""}){const t=this._getServiceParams({"customer-id":this.customerId,...e}),a=this._getService("BGADPCustomersCustomerIdentificationProcessDocumentsPost",t),i={customEvent:`post-customer-identification-process-documents-${e.typeFile}-success`,errorFireEventHandler:`post-customer-identification-process-documents-${e.typeFile}-error`};this._generateGetService(a,i,this._responseMapping)}getCustomersCustomer(){const e=this._getServiceParams({"customer-id":this.customerId}),t=this._getService("BGADPCustomersCustomerGet",e),a={customEvent:`get-customers-customer-get-v${this.version}-success`,errorFireEventHandler:`get-customers-customer-get-v${this.version}-error`};this._generateGetService(t,a,this._responseMapping)}getCustomerContacts(e={}){const t=this._getServiceParams({"customer-id":this.customerId,...e}),a=this._getService("BGADPCustomersCustomerContactDetailsGetV0",t),i={customEvent:"set-customer-contacts",errorFireEventHandler:"error-on-get-customer-contacts"};this._generateGetService(a,i,this._responseMapping)}getCustomerAllIndicators(){const e=this._getServiceParams({"customer-id":this.customerId}),t=this._getService("BGADPCustomersCustomerIndicatorsGetV0",e);this._generateGetService(t,{customEvent:"get-customer-all-indicators-success",errorFireEventHandler:"error-on-get-customer-all-indicators"},this._responseMapping)}postTaxFreeFinancialMovement(e={}){const t=this._getServiceParams({version:this.apiTaxFreeVersion,...e}),a=this._getService("CoCustomersCustomersValidateTaxFreeFinancialMovementPost",t);this._generateGetService(a,{customEvent:"post-tax-free-success",errorFireEventHandler:"post-tax-free-error"},this._responseMapping)}getCustomerAddresses(e={},t=!0){this.requiredOTP=t;const a=this._getServiceParams({"customer-id":this.customerId,...e}),i=this._getService("BGADPCustomersCustomerAddressesGet",a);this._generateGetService(i,{customEvent:"set-customer-addresses",errorFireEventHandler:"error-on-get-customer-addresses"},this._responseMapping)}postDigitalValidation(e){const t=this._getServiceParams(this.params,e),a=this._getService("BGADPMxCustomersCustomersDigitalValidationPost",t);this._generateGetService(a,{customEvent:"post-digital-validation-success",errorFireEventHandler:"post-digital-validation-error"},this._responseMapping)}getCustomerChannelStatus(e){const t=this._getServiceParams(e),a=this._getService("BGADPCustomersChannelStatusGet",t);this._generateGetService(a,{customEvent:"get-customer-channel-status-success",errorFireEventHandler:"get-customer-channel-status-error"},this._responseMapping)}postCustomersCustomerAddresses({body:e,requiredOTP:t=!1}={}){this.requiredOTP=t;const a=this._getServiceParams({"customer-id":this.customerId},e),i=this._getService("BGADPCustomersCustomerAddressesPost",a),r={customEvent:`post-customers-customer-addresses-get-v${this.version}-success`,errorFireEventHandler:`post-customers-customer-addresses-get-v${this.version}-error`};this._generateGetService(i,r,this._responseMapping)}deleteCustomersCustomerAddressesAddress({params:e={},requiredOTP:t=!0}={}){this.requiredOTP=t;const a=this._getServiceParams({"customer-id":this.customerId,...e}),i=this._getService("BGADPCustomersCustomerAddressesAddressDelete",a),r={customEvent:`delete-customers-customer-addresses-address-delete-v${this.version}-success`,errorFireEventHandler:`delete-customers-customer-addresses-address-delete-v${this.version}-error`};this._generateGetService(i,r,this._responseMapping)}patchCustomersCustomerAddressesAddress({params:e={},body:t,requiredOTP:a=!1}={}){this.requiredOTP=a;const i=this._getServiceParams({"customer-id":this.customerId,...e},t),r=this._getService("BGADPCustomersCustomerAddressesAddressPatch",i),o={customEvent:`patch-customers-customer-addresses-address-patch-v${this.version}-success`,errorFireEventHandler:`patch-customers-customer-addresses-address-patch-v${this.version}-error`};this._generateGetService(r,o,this._responseMapping)}getCustomersCustomerContactDetails({params:e={},requiredOTP:t=!1,contactType:a="general",includeHeaders:i=!1,headers:r}={}){const o=i?{contactId:this.contactIdForHeader}:null;this.headers={...r,...o},this.requiredOTP=t;const s=this._getServiceParams({"customer-id":this.customerId,...e}),n=this._getService("BGADPCustomersCustomerContactDetailsGet",s),l={customEvent:`get-customers-customer-contact-details-${a}-get-v${this.version}-success`,errorFireEventHandler:`get-customers-customer-contact-details-${a}-get-v${this.version}-error`};this._generateGetService(n,l,this._responseMapping)}patchCustomersCustomerContactDetailsContactDetail({params:e={},body:t,requiredOTP:a=!1}={}){this.requiredOTP=a;const i=this._getServiceParams({"customer-id":this.customerId,...e},t),r=this._getService("BGADPCustomersCustomerContactDetailsContactDetailPatch",i),o={customEvent:`patch-customers-customer-contact-details-contact-detail-patch-v${this.version}-success`,errorFireEventHandler:`patch-customers-customer-contact-details-contact-detail-patch-v${this.version}-error`};this._generateGetService(r,o,this._responseMapping)}postCustomersCustomerContactDetails({body:e,requiredOTP:t=!1}={}){this.requiredOTP=t;const a=this._getServiceParams({"customer-id":this.customerId},e),i=this._getService("BGADPCustomersCustomerContactDetailsPost",a),r={customEvent:`post-customers-customer-contact-details-post-v${this.version}-success`,errorFireEventHandler:`post-customers-customer-contact-details-post-v${this.version}-error`};this._generateGetService(i,r,this._responseMapping)}deleteCustomersCustomerContactDetailsContactDetail({params:e={},requiredOTP:t=!0}={}){this.requiredOTP=t;const a=this._getServiceParams({"customer-id":this.customerId,...e}),i=this._getService("BGADPCustomersCustomerContactDetailsContactDetailDelete",a),r={customEvent:`delete-customers-customer-contact-details-contact-detail-delete-v${this.version}-success`,errorFireEventHandler:`delete-customers-customer-contact-details-contact-detail-delete-v${this.version}-error`};this._generateGetService(i,r,this._responseMapping)}postCustomersCivilRegistries(e={}){const t=this._getServiceParams({},e),a=this._getService("BGADPCustomersCivilRegistriesSearchPost",t);this._generateGetService(a,{customEvent:"post-customer-civil-registries-success",errorFireEventHandler:"post-customer-civil-registries-error"},this._responseMapping)}postCustomer(e={}){const t=this._getServiceParams({},e),a=this._getService("BGADPCustomersPost",t),i={customEvent:`post-customers-v${this.version}-success`,errorFireEventHandler:`post-customers-v${this.version}-error`};this._generateGetService(a,i,this._responseMapping)}postCustomersCustomerSignature(e={metadata:{},byteFile:{}}){const t=new FormData;t.append("metadata",e.metadata),t.append("byteFile",e.byteFile);const a=this._getServiceParams({"customer-id":this.customerId},t),i=this._getService("BGADPCustomersCustomerSignaturesPost",a);this._generateGetService(i,{customEvent:"post-customers-customer-signature-success",errorFireEventHandler:"post-customers-customer-signature-error"},this._responseMapping)}postMxCustomerOnboarding(e={}){const t=this._getServiceParams({"customer-id":this.customerId},e),a=this._getService("BGADPMxCustomersCustomersCustomerOnboardingPost",t),i={customEvent:`post-mx-customer-onboarding-v${this.version}-success`,errorFireEventHandler:`post-mx-customer-onboarding-v${this.version}-error`};this._generateGetService(a,i,this._responseMapping)}postCustomersCustomerTerms(e={}){const t=this._getServiceParams({"customer-id":this.customerId},e),a=this._getService("BGADPCustomersCustomerTermsPost",t);this._generateGetService(a,{customEvent:"post-customers-customer-terms-success",errorFireEventHandler:"post-customers-customer-terms-error"},this._responseMapping)}_getService(e,t){return new this.services[`${e}V${this.version}`](t)}}const _r=new t;var $r=e`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${h(b.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${h(p.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(u.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(u.medium.fontStyle)});
  width: 100%;
  height: 100%;
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
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

.text {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  overflow-wrap: anywhere;
  hyphens: auto;
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  .text {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${_r.mediaRules()}`;const kr=new t;var Sr=e`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${kr.mediaRules()}`;const xr=new t;var Cr=e`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${h(m.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${xr.mediaRules()}`;const Tr={dark:e`
    ${Cr}
    ${F.dark}
  `,light:e`
    ${Sr}
    ${F.light}
  `};class wr extends(a(q(Re))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":_,"bbva-core-image":re,"bbva-badge-notification":E}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,$r,l("bbva-button-action-shared-styles"),L(),Tr.light,Tr.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?c`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?c`<div class="app-pay-icon">${De[this.appPayIcon]}</div>`:c`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return c`
      ${this.notifications?c`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:c` ${this.getIcon} `}
      <span class="text" onclick="void(0)"> ${this.label} </span>
      <slot></slot>
      ${this._action}
    `}}w("colors.primarySubdued"),w("colors.primaryCoreLight");var Ir=e`[ambient^=light] {
  --bbva-button-row-active-color: initial;
  --bbva-button-row-skeleton-color: initial;
  --bbva-button-row-skeleton-animated-layer-bg: initial;
  --bbva-button-row-skeleton-bg: initial;
}
`,Er=e`[ambient^=dark] {
  --bbva-button-row-active-color: var(--colorsPrimarySubduedLight, ${h(m.primarySubduedLight)});
  --bbva-button-row-skeleton-color: var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)});
  --bbva-button-row-skeleton-bg: transparent;
  --bbva-button-row-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${h(m.primaryCoreDarkened)});
}
`;const Lr={dark:e`
    ${Tr.dark}
    ${Er}
  `,light:e`
    ${Tr.light}
    ${Ir}
  `},Pr=new t;var Ar=e`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  position: relative;
  min-height: 5rem;
  --_button-row-skeleton-animated-layer-bg: var(--bbva-button-row-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-button-row-skeleton-animated-layer-bg, var(--ambientsLight, ${h(G.light)})));
  --_button-row-button-action-color: var(--bbva-button-row-dark-mode-button-action-color);
  --_button-row-photography-variant-color: var(--bbva-button-row-dark-mode-photography-variant-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_button-row-photography-variant-active-color: var(--bbva-button-row-dark-mode-photography-variant-active-color, var(--_button-row-active-color));
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
  --_button-row-active-color: var(--bbva-button-row-dark-mode-active-color, var(--bbva-button-row-active-color, var(--colorsPrimaryCore, ${h(m.primaryCore)})));
  --_button-row-skeleton-quote-color: var(--bbva-button-row-dark-mode-skeleton-color, var(--bbva-button-row-skeleton-color, var(--colorsSecondary200, ${h(m.secondary200)})));
  --_button-row-skeleton-quote-bg: var(--bbva-button-row-dark-mode-skeleton-bg, var(--bbva-button-row-skeleton-bg, transparent));
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

.button-row {
  display: flex;
  flex-wrap: wrap;
  justify-content: inherit;
  box-sizing: border-box;
  outline: var(--bbva-button-row-buttons-outline, none);
  width: 100%;
}
.button-row .listitem-button {
  flex-basis: 33%;
  text-align: center;
  display: flex;
}
.button-row .listitem-button [data-tag-name=bbva-button-action] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 12) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 12) * 1em);
  max-width: none;
  width: 100%;
  height: 100%;
  margin-bottom: auto;
}
.button-row .listitem-button [data-tag-name=bbva-button-action]:not([href])[active]:not([aria-disabled=true]) {
  background-color: transparent;
  color: var(--_button-row-active-color);
}
.button-row.three-buttons {
  justify-content: space-between;
}
.button-row.three-buttons::after {
  content: "";
  flex: auto;
}
.button-row.three-buttons .listitem-button {
  flex: none;
}

:host([variant=simple]) .button-row {
  padding: 0;
}
:host([variant=simple]) .listitem-button {
  flex: 1;
}

:host([class*=one-button]) > .button-row > .listitem-button {
  flex-basis: 100%;
}

:host([class*=two-buttons]) > .button-row > .listitem-button {
  flex-basis: 50%;
}

:host([class*=four-buttons]) > .button-row > .listitem-button {
  flex-basis: 25%;
}

:host([variant=photography]) .button-row .listitem-button [data-tag-name=bbva-button-action] {
  color: var(--_button-row-photography-variant-color);
  --bbva-button-action-dark-mode-color: var(--_button-row-photography-variant-color);
}
:host([variant=photography]) .button-row .listitem-button [data-tag-name=bbva-button-action][active] {
  color: var(--_button-row-photography-variant-active-color);
  --bbva-button-action-active-dark-mode-color: var(--_button-row-photography-variant-active-color);
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  min-height: 5rem;
  width: 100%;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: 5rem;
  top: 0;
  right: 0;
  left: 0;
  bottom: 0;
  background: var(--_button-row-skeleton-animated-layer-bg);
}

:host([loading].one-button) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 50% 20px, calc(50% + 28px) 48px;
}

:host([loading].two-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 25% 20px, calc(25% + 5px) 48px, 75% 20px, calc(75% + 50px) 48px;
}

:host([loading].three-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 16% 20px, calc(16% - 1px) 48px, 50% 20px, calc(50% + 28px) 48px, 83% 20px, calc(83% + 58px) 48px;
}

:host([loading].four-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: calc(12%) 20px, calc(0% + 20px) 48px, calc(30% + 18px) 20px, calc(30% + 28px) 48px, calc(60% + 5px) 20px, calc(60% + 40px) 48px, calc(88% - 5px) 20px, calc(100% + 30px) 48px;
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
${Pr.mediaRules()}`;class Nr extends(q(a(i))){static get is(){return"bbva-button-row"}static get scopedElements(){return{"bbva-button-action":wr}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},options:{type:Array},iconSize:{type:Number,attribute:"icon-size"},selected:{type:Number},variant:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.options=[],this.iconSize=24,this.selected=0,this.variant="",this.loading=!1}updated(){this.options&&this.options.length>0&&this._assignClass(this)}_assignClass(e){e.classList.remove("one-button","two-buttons","three-buttons","four-buttons"),1===this.options.length?e.classList.add("one-button"):2===this.options.length?e.classList.add("two-buttons"):3===this.options.length?e.classList.add("three-buttons"):4===this.options.length&&e.classList.add("four-buttons")}static get styles(){return[Ar,l("bbva-button-row-shared-styles"),Lr.light,Lr.dark]}render(){return c`${this.loading?c`<div class="skeleton"></div>`:c` <div
          id="buttons"
          class="button-row"
          role="list"
          aria-label="${d(this.accessibilityText)}"
        >
          ${this.options.map(((e,t)=>this._getButton(e,t)))}
        </div>`}`}_getButton(e,t){return c`
      <span role="listitem" class="listitem-button">
        <bbva-button-action
          ?disabled="${this.disabled}"
          role="button"
          notifications-variant="alert"
          image="${d(e.image)}"
          .iconSize=${this.iconSize}
          .appPayIcon=${e.appPayIcon}
          .imageAltText="${this.imageAltText}"
          .icon="${e.icon}"
          .label="${e.label}"
          .notifications="${e.notifications}"
          @click="${()=>{this._select(t)}}"
        >
        </bbva-button-action>
      </span>
    `}_select(e){this.selected=e,this.dispatchEvent(new CustomEvent("button-row-item-click",{detail:e,bubbles:!0,composed:!0}))}}w("colors.primaryMediumLight"),w("colors.cool50"),w("colors.cool90"),w("colors.primarySubdued"),w("colors.primaryCoreLightened"),w("colors.primarySubduedLight");const Rr=new t;var Dr=e`:host {
  display: flex;
  box-sizing: border-box;
  position: relative;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
  color: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  font-size: var(--typographyTypeSmall, ${h(b.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${h(p.typeSmall)});
  --_list-bullet-icon-color: var(--bbva-list-bullet-icon-dark-mode-color, var(--bbva-list-bullet-icon-color, var(--colorsPrimaryMedium, ${h(m.primaryMedium)})));
  --_list-bullet-skeleton-quote-color: var(--bbva-list-bullet-quote-dark-mode-color, var(--bbva-list-bullet-quote-color, var(--colorsSecondary200, ${h(m.secondary200)})));
  --_list-bullet-skeleton-quote-bg: var(--bbva-list-bullet-quote-bg-dark-mode-color, var(--bbva-list-bullet-quote-bg, transparent));
  --_list-bullet-skeleton-animated-layer-bg: var(--bbva-list-bullet-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-list-bullet-skeleton-animated-layer-bg, var(--ambientsLight, ${h(G.light)})));
  --_bbva-list-bullet-dark-mode-color: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_bbva-list-bullet-dark-mode-color-soft-highlight: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary500, ${h(m.secondary500)})));
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
  margin-top: calc(((0.375 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1rem);
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
${Rr.mediaRules()}`;const Mr=new t;var Or=e`[ambient^=light] {
  --bbva-list-bullet-color: initial;
  --bbva-list-bullet-icon-color: initial;
  --bbva-list-bullet-quote-color: initial;
  --bbva-list-bullet-quote-bg: initial;
  --bbva-list-bullet-skeleton-animated-layer-bg: initial;
}
${Mr.mediaRules()}`;const qr=new t;var Vr=e`[ambient^=dark] {
  --bbva-list-bullet-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-bullet-icon-color: var(--colorsPrimaryVariant, ${h(m.primaryVariant)});
  --bbva-list-bullet-quote-color: var(--colorsPrimaryMedium, ${h(m.primaryMedium)});
  --bbva-list-bullet-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${h(m.primaryCore)});
}
${qr.mediaRules()}`;const Br={light:e`
    ${Or}
  `,dark:e`
    ${Vr}
  `};class Fr extends(a(q(i))){static get is(){return"bbva-list-bullet"}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},softHighlight:{type:Boolean,reflect:!0,attribute:"soft-highlight"}}}static get scopedElements(){return{"bbva-icon":_,"bbva-text":$}}constructor(){super(),this.icon=Me(),this.iconSize=16,this.text="",this.loading=!1}static get styles(){return[super.styles,Dr,Br.light,Br.dark,l("bbva-list-bullet-shared-styles")]}render(){return c`${this.loading?c` <div class="skeleton"></div> `:c`
          <bbva-icon .icon=${this.icon} .size=${this.iconSize}></bbva-icon>
          <slot>
            <bbva-text .text=${this.text} unset size="S"></bbva-text>
          </slot>
        `}`}}w("colors.primaryCoreLightened"),w("colors.primaryVariantLight"),w("colors.cool50"),w("colors.cool90");const zr=new t;var Hr=e`:host {
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em);
  box-sizing: border-box;
  --_banner-image-text-color: var(--bbva-banner-image-text-dark-mode-color, var(--bbva-banner-image-text-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_banner-image-opacity: var(--bbva-banner-image-dark-mode-opacity, var(--bbva-banner-image-opacity, 0.4));
  --_banner-image-disabled-color: var(--bbva-banner-image-disabled-dark-mode-color, var(--bbva-banner-image-disabled-color, var(--colorsSecondary600, ${h(m.secondary600)})));
  --_skeleton-quote-color: var(--bbva-banner-image-skeleton-dark-mode-color, var(--bbva-banner-image-skeleton-quote-color, var(--colorsSecondary200, ${h(m.secondary200)})));
  --_skeleton-quote-bg: var(--bbva-banner-image-skeleton-bg-dark-mode-color, var(--bbva-banner-image-skeleton-bg, transparent));
  --_bbva-banner-image-skeleton-animated-layer-bg: var(--bbva-banner-image-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-banner-image-skeleton-animated-layer-bg, var(--ambientsLight, ${h(G.light)})));
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

img {
  width: 100%;
  display: block;
  height: auto;
  margin: auto;
}

figure {
  flex: auto;
  margin: auto;
}
figure img {
  width: 5rem;
}

:host([fullwidth]) {
  padding: 0;
  height: 8rem;
  overflow: hidden;
}
:host([fullwidth]) img {
  object-fit: var(--bbva-banner-image-object-fit, cover);
  object-position: var(--bbva-banner-image-object-position, center);
  height: 100%;
}

:host([variant=large]),
:host([layout=large]) {
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(v.spacer)}))) / 16) * 1em) 0;
}
:host([variant=large]) figure img,
:host([layout=large]) figure img {
  width: 9rem;
}

:host([fullwidth][variant=medium]),
:host([fullwidth][layout=medium]) {
  height: 12rem;
}

:host([fullwidth][variant=large]),
:host([fullwidth][layout=large]) {
  padding: 0;
  width: auto;
  height: auto;
  aspect-ratio: 1/1;
}

.info {
  display: none;
  width: calc(50% + var(--bbva-banner-image-info-width, 1rem));
}

.display-info {
  display: block;
}

.slot {
  text-align: var(--bbva-banner-image-text-align, right);
}

.slot ::slotted(*) {
  color: var(--_banner-image-text-color);
  margin: var(--bbva-banner-image-slots-margin, 0);
}

.slot ::slotted([slot=heading]) {
  font-size: var(--bbva-banner-image-heading-font-size, var(--typographyTypeMedium, ${h(b.typeMedium)}));
  font-weight: var(--bbva-banner-image-heading-font-weight, var(--fontFacePrimaryMediumFontWeight, ${h(u.medium.fontWeight)}));
  line-height: var(--lineHeightTypeMedium, ${h(p.typeMedium)});
}

.slot ::slotted([slot=description]) {
  font-size: var(--bbva-banner-image-description-font-size, var(--typographyTypeSmall, ${h(b.typeSmall)}));
  font-weight: var(--bbva-banner-image-description-font-weight, var(--fontFacePrimaryBookFontWeight, ${h(u.book.fontWeight)}));
  line-height: var(--lineHeightTypeSmall, ${h(p.typeSmall)});
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  opacity: 1;
  height: 11.75rem;
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--_skeleton-quote-bg, transparent);
  background-size: 80px 80px, calc((43.5% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 8px, 260% 104px, -20% 136px, 92% 168px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 11.75rem;
  background: var(--_bbva-banner-image-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

:host([loading][fullwidth]) {
  position: relative;
  overflow: hidden;
  height: 8rem;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_skeleton-quote-bg, transparent);
  background-size: 100% 128px;
  background-position: 0 0;
}
:host([loading][fullwidth]) img {
  height: 0;
}
:host([loading][fullwidth]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 8rem;
  background: var(--_bbva-banner-image-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

:host([loading][fullwidth][variant=medium]) {
  height: 12rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_skeleton-quote-bg, transparent);
  background-size: 100% 192px;
  background-position: 0 0;
}
:host([loading][fullwidth][variant=medium]) .skeleton {
  height: 12rem;
}

:host([loading][fullwidth][variant=large]) {
  height: 18rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_skeleton-quote-bg, transparent);
  background-size: 100% 288px;
  background-position: 0 0;
}
:host([loading][fullwidth][variant=large]) .skeleton {
  height: 18rem;
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
${zr.mediaRules()}`;const Gr=new t;var jr=e`[ambient^=light] {
  --bbva-banner-image-text-color: var(--colorsSecondary600, ${h(m.secondary600)});
  --bbva-banner-image-dark-mode-opacity: 0.4;
  --bbva-banner-image-disabled-color: initial;
  --skeleton-quote-color: initial;
  --skeleton-quote-bg: initial;
  --bbva-banner-image-skeleton-animated-layer-bg: initial;
}
${Gr.mediaRules()}`;const Ur=new t;var Xr=e`[ambient^=dark] {
  --bbva-banner-image-text-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-banner-image-dark-mode-opacity: 0.4;
  --banner-image-disabled-color: initial;
  --bbva-banner-image-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${h(m.primaryCoreDark)});
  --skeleton-quote-bg: initial;
  --bbva-banner-image-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${h(m.primaryCoreDarkened)});
}
${Ur.mediaRules()}`;const Wr={light:e`
  ${jr}
`,dark:e`
  ${Xr}
`};class Qr extends(ee(a(q(i)))){static get is(){return"bbva-banner-image"}static get properties(){return{imageSrc:{type:String,attribute:"image-src"},imgAccessibilityText:{type:String,attribute:"img-accessibility-text"},fullwidth:{type:Boolean},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.imgAccessibilityText="",this.loading=!1,this.disabledTabindex=!0}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this.addEventListener("slotschanges",(()=>{const e=this.shadowRoot.querySelector(".info"),t=[].slice.call(this.children,0),a=t.some((e=>"illustration"===e.getAttribute("slot")));0===t.length||1===t.length&&a?e.classList.remove("display-info"):e.classList.add("display-info")}))}static get styles(){return[super.styles,Hr,l("bbva-banner-image-shared-styles"),Wr.light,Wr.dark]}render(){return c`
      ${this.loading?c`<div class="skeleton"></div>`:c`
            ${this.fullwidth?c`
                  <img
                    class="full-img"
                    src="${d(this.imageSrc)}"
                    alt="${this.imgAccessibilityText}"
                  />
                `:c`
                  <figure>
                    <slot name="illustration">
                      <img src="${d(this.imageSrc)}" alt="${this.imgAccessibilityText}" />
                    </slot>
                  </figure>
                  <div class="info">
                    <span class="slot">
                      <slot name="heading"></slot>
                      <slot name="description"></slot>
                    </span>
                  </div>
            `}
          `}
    `}}w("colors.primaryCoreLightened"),w("colors.primaryCoreLightened"),w("colors.cool50"),w("colors.cool90");const Yr="card",Kr="qrCode",Jr={LEAVE_THE_PROCESS:"leaveTheProcess",CHANGE_RECOVERY_METHOD:"changeRecoveryMethod",QUESTION_MARK:"questionMark",INVALID_CREDENTIALS:"invalidCredentials",PASSWORD_RECOMMENDATIONS:"passwordRecommendations",PASSWORD_HAS_ALREADY_BEEN_USED:"passwordHasAlreadyBeenUsed",INCORRECT_INFORMATION:"incorrectInformation",THIRD_ATTEMPT_INFORMATION:"thirdAttemptInformation",INVALID_QR_CODE:"invalidQrCode",INVALID_CARD:"invalidCard",UNFINISHED_OPERATION:"unfinishedOperation",HAS_TO_REGISTER_AGAIN:"hasToRegisterAgain",USE_PHYSICAL_CARD:"usePhysicalCard",USE_ANY_CARD_HOLDER:"useAnyCardHolder",CARD_NOT_ASSOCIATED:"cardNotAssociated",TECHNICAL_ERROR:"technicalError",SUCCESS_RESET_PASSWORD:"successResetPassword",SECOND_ATTEMP_INFORMATION:"firstTwoAttemptsInformation"},Zr="physical",eo="virtual";var to=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-help-modal] div [data-tag-name=bbva-list-bullet] {
  margin: 1rem 0;
}
[data-tag-name=bbva-help-modal] div.content-successResetPassword .first-description,
[data-tag-name=bbva-help-modal] div.content-successResetPassword .second-description {
  color: var(--colorsSecondary600, ${h(m.secondary600)});
  font-size: 1rem;
  font-weight: var(--fontFacePrimaryBoldFontWeight);
}

.technicalError,
.leaveTheProcess,
.unfinishedOperation,
.incorrectInformation,
.changeRecoveryMethod,
.passwordHasAlreadyBeenUsed {
  --_help-modal-title-icon-color: var(--colorsTertiaryType1Dark, ${h(m.tertiaryType1Dark)});
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ao extends($t(ae(f(i)))){static get is(){return"akr-modal"}static get scopedElements(){const e=[Nr,Oe,qe,Fr,Qr,$,...ao.configurationScopedElements()];return ao.scopedElementsFromClasses(e)}static get properties(){return{_helpModals:{type:Array},_case:{type:String},_modal:{type:Object},_rowOptions:{type:Array},_slotCases:{type:Array},_slotDescription:{type:String},_visibleSlot:{type:Boolean},_modalType:{type:String},imageSuccess:{type:String,attribute:"image-success"},imageError:{type:String,attribute:"image-error"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"}}}static get styles(){return[to,l("akr-modal-styles")]}constructor(){super(),this._case="",this._rowOptions=[],this._slotCases=[Jr.INVALID_CARD,Jr.INVALID_QR_CODE,Jr.USE_PHYSICAL_CARD,Jr.USE_ANY_CARD_HOLDER,Jr.CARD_NOT_ASSOCIATED,Jr.HAS_TO_REGISTER_AGAIN,Jr.SUCCESS_RESET_PASSWORD,Jr.PASSWORD_RECOMMENDATIONS,Jr.THIRD_ATTEMPT_INFORMATION,Jr.INCORRECT_INFORMATION,Jr.INVALID_CREDENTIALS],this._linkText="",this._bodyText="",this._titleIcon="",this._titleText="",this._headerText="",this._buttonText="",this._fullHeight=!1,this._fixedFooter=!1,this._headerType="",this.imageSuccess="",this.imageError="",this._modalType="warning"}get _bbvaHelpModal(){return this._modal||(this._modal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]')),this._modal}open(e=""){this._case=e,this._setUpModalProperties(),this._bbvaHelpModal.open()}_setUpModalProperties(){this._bodyText=this._setUpBody(),this._linkText=this._setUpLink(),this._titleText=this._setUpTitle(),this._titleIcon=this._setUpTitleIcon(),this._headerText=this._setUpHeader(),this._buttonText=this._setUpButton(),this._fullHeight=this._setUpFullHeightAndFixedFooter(),this._fixedFooter=this._setUpFullHeightAndFixedFooter(),this._headerType=this._case===Jr.SUCCESS_RESET_PASSWORD?"modal":"modal-three-level"}_setUpTitleIcon(){const e=[Jr.TECHNICAL_ERROR,Jr.LEAVE_THE_PROCESS,Jr.UNFINISHED_OPERATION,Jr.CHANGE_RECOVERY_METHOD,Jr.PASSWORD_HAS_ALREADY_BEEN_USED,Jr.SECOND_ATTEMP_INFORMATION];return this._modalType="warning",this._case===Jr.QUESTION_MARK||this._case===Jr.PASSWORD_RECOMMENDATIONS?(this._modalType="",O()):e.includes(this._case)?s():""}_setUpHeader(){let e=[Jr.THIRD_ATTEMPT_INFORMATION,Jr.INVALID_CARD,Jr.INVALID_QR_CODE,Jr.HAS_TO_REGISTER_AGAIN,Jr.USE_PHYSICAL_CARD,Jr.USE_ANY_CARD_HOLDER,Jr.CARD_NOT_ASSOCIATED,Jr.INCORRECT_INFORMATION].includes(this._case)?"Error":"";return this._case===Jr.SUCCESS_RESET_PASSWORD&&(e=this.t("bbva-feature-access-key-recovery-header-reset-password-set-up-header")),e}_setUpTitle(){return{[Jr.PASSWORD_RECOMMENDATIONS]:this.t("bbva-feature-access-key-recovery-modal-password-recommendations",{newLine:"</br>"}),[Jr.UNFINISHED_OPERATION]:this.t("bbva-feature-access-key-recovery-modal-unfinished-operation")}[this._case]||""}_setUpBody(){return{[Jr.LEAVE_THE_PROCESS]:this.t("bbva-feature-access-key-recovery-modal-leave-the-process"),[Jr.CHANGE_RECOVERY_METHOD]:this.t("bbva-feature-access-key-recovery-modal-change-recovery-method"),[Jr.QUESTION_MARK]:this.t("bbva-feature-access-key-recovery-modal-question-mark"),[Jr.PASSWORD_HAS_ALREADY_BEEN_USED]:this.t("bbva-feature-access-key-recovery-modal-password-has-already-been-used"),[Jr.UNFINISHED_OPERATION]:this.t("bbva-feature-access-key-recovery-modal-unfinished-operation-set-up-body"),[Jr.TECHNICAL_ERROR]:this.t("bbva-feature-access-key-recovery-modal-technical-error"),[Jr.SECOND_ATTEMP_INFORMATION]:this.t("bbva-feature-access-key-recovery-modal-incorrect-information")}[this._case]||""}_setUpButton(){return{[Jr.LEAVE_THE_PROCESS]:this.t("bbva-feature-access-key-recovery-modal-leave-the-process-set-up-button"),[Jr.CHANGE_RECOVERY_METHOD]:this.t("bbva-feature-access-key-recovery-modal-change-recovery-method-set-up-button"),[Jr.QUESTION_MARK]:this.t("bbva-feature-access-key-recovery-modal-question-mark-set-up-button"),[Jr.PASSWORD_RECOMMENDATIONS]:this.t("bbva-feature-access-key-recovery-modal-password-recommendations-set-up-button"),[Jr.PASSWORD_HAS_ALREADY_BEEN_USED]:this.t("bbva-feature-access-key-recovery-modal-password-has-already-been-used-set-up-button"),[Jr.INCORRECT_INFORMATION]:this.t("bbva-feature-access-key-recovery-modal-technical-error-set-up-button"),[Jr.THIRD_ATTEMPT_INFORMATION]:this.t("bbva-feature-access-key-recovery-modal-third-attempt-information"),[Jr.INVALID_QR_CODE]:this.t("bbva-feature-access-key-recovery-modal-technical-error-set-up-button"),[Jr.INVALID_CARD]:this.t("bbva-feature-access-key-recovery-modal-invalid-card"),[Jr.UNFINISHED_OPERATION]:this.t("bbva-feature-access-key-recovery-modal-unfinished-operation-set-up-button"),[Jr.HAS_TO_REGISTER_AGAIN]:this.t("bbva-feature-access-key-recovery-modal-has-to-register-again"),[Jr.USE_PHYSICAL_CARD]:this.t("bbva-feature-access-key-recovery-modal-use-physical-card"),[Jr.USE_ANY_CARD_HOLDER]:this.t("bbva-feature-access-key-recovery-modal-use-any-card-holder"),[Jr.CARD_NOT_ASSOCIATED]:this.t("bbva-feature-access-key-recovery-modal-card-not-associated"),[Jr.TECHNICAL_ERROR]:this.t("bbva-feature-access-key-recovery-modal-invalid-qr-code"),[Jr.SUCCESS_RESET_PASSWORD]:this.t("bbva-feature-access-key-recovery-modal-success-reset-password"),[Jr.SECOND_ATTEMP_INFORMATION]:this.t("bbva-feature-access-key-recovery-modal-incorrect-information-set-up-button"),[Jr.INVALID_CREDENTIALS]:this.t("bbva-feature-access-key-recovery-modal-technical-error-set-up-button")}[this._case]||""}_setUpLink(){return{[Jr.INVALID_QR_CODE]:this.t("bbva-feature-access-key-recovery-modal-invalid-qr-code-set-up-link"),[Jr.HAS_TO_REGISTER_AGAIN]:this.t("bbva-feature-access-key-recovery-modal-has-to-register-again-set-up-link"),[Jr.TECHNICAL_ERROR]:this.t("bbva-feature-access-key-recovery-modal-technical-error-set-up-link"),[Jr.LEAVE_THE_PROCESS]:this.t("bbva-feature-access-key-recovery-modal-leave-the-process-set-up-link"),[Jr.CHANGE_RECOVERY_METHOD]:this.t("bbva-feature-access-key-recovery-modal-change-recovery-method-set-up-link"),[Jr.INVALID_CREDENTIALS]:this.t("bbva-feature-access-key-recovery-modal-technical-error-set-up-link")}[this._case]||""}_setUpFullHeightAndFixedFooter(){return[Jr.PASSWORD_RECOMMENDATIONS,Jr.THIRD_ATTEMPT_INFORMATION,Jr.INVALID_QR_CODE,Jr.INVALID_CARD,Jr.HAS_TO_REGISTER_AGAIN,Jr.USE_PHYSICAL_CARD,Jr.USE_ANY_CARD_HOLDER,Jr.CARD_NOT_ASSOCIATED,Jr.SUCCESS_RESET_PASSWORD,Jr.INCORRECT_INFORMATION,Jr.INVALID_CREDENTIALS].includes(this._case)}_handlehelpRightPrimaryClick({target:e}){const t=e.classList.value;this.createDynamicEvent(t,"rigthPrimaryButton")}_handleFooterLinkClick({target:e}){const t=e.classList.value;this.createDynamicEvent(t,"link")}_handleFooterButtonClick({target:e}){const t=e.classList.value;this.createDynamicEvent(t)}createDynamicEvent(e,t=""){var a;let i="";i="link"===t?"footer-link":"rigthPrimaryButton"===t?"right-primary-icon":"";const r=`akr-${e.replace(/([a-z])([A-Z])/g,"$1-$2").toLowerCase()}${(null===(a=i)||void 0===a?void 0:a.length)>0?`-${i}`:""}`;this._fireEvent(r)}_dispatchErrorActions({detail:e},t){"call-to-line-bbva"===t[e].id?this._fireEvent("access-key-recovery-incorrect-data-event-call",{value:this.phoneNumberBbvaLine}):this._fireEvent(t[e].id)}_getBbvaButtonRow(e=null){return this._rowOptions=[{id:"call-to-line-bbva",icon:Ve(),label:this.t("bbva-feature-access-key-recovery-line-bbva")},{id:"locate-atm-branches",icon:Be(),label:this.t("bbva-feature-access-key-recovery-sucursales")}],null!==e?this._rowOptions[e]:this._rowOptions}_fireEvent(e,t=""){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_isBtnRowVisible(){return[Jr.THIRD_ATTEMPT_INFORMATION,Jr.INVALID_CARD,Jr.CARD_NOT_ASSOCIATED,Jr.INVALID_CREDENTIALS].includes(this._case)}_bbvaButtonRow(){const e={[Jr.THIRD_ATTEMPT_INFORMATION]:this._getBbvaButtonRow(),[Jr.INVALID_CARD]:[this._getBbvaButtonRow(0)],[Jr.CARD_NOT_ASSOCIATED]:[this._getBbvaButtonRow(1)],[Jr.INVALID_CREDENTIALS]:[this._getBbvaButtonRow(0)]}[this._case];return c`
      <bbva-button-row
        .options=${e}
        accessibility-text="Available sections"
        @button-row-item-click="${t=>{this._dispatchErrorActions(t,e)}}">
      </bbva-button-row>
    `}_setUpDescription(){return{[Jr.THIRD_ATTEMPT_INFORMATION]:this.t("bbva-feature-access-key-recovery-modal-third-attempt-information-set-up-description"),[Jr.INVALID_QR_CODE]:this.t("bbva-feature-access-key-recovery-modal-invalid-qr-code-set-up-description"),[Jr.INVALID_CARD]:this.t("bbva-feature-access-key-recovery-modal-invalid-card-set-up-description"),[Jr.HAS_TO_REGISTER_AGAIN]:this.t("bbva-feature-access-key-recovery-modal-has-to-register-again-set-up-description"),[Jr.USE_PHYSICAL_CARD]:this.t("bbva-feature-access-key-recovery-modal-use-physical-card-set-up-description"),[Jr.USE_ANY_CARD_HOLDER]:this.t("bbva-feature-access-key-recovery-modal-use-any-card-holde-set-up-descriptionr"),[Jr.CARD_NOT_ASSOCIATED]:this.t("bbva-feature-access-key-recovery-modal-card-not-associated-set-up-description"),[Jr.PASSWORD_HAS_ALREADY_BEEN_USED]:this.t("bbva-feature-access-key-recovery-modal-password-has-already-been-used"),[Jr.SUCCESS_RESET_PASSWORD]:this.t("bbva-feature-access-key-recovery-modal-success-reset-password-set-up-description"),[Jr.INCORRECT_INFORMATION]:this.t("bbva-feature-access-key-recovery-modal-incorrect-information"),[Jr.INVALID_CREDENTIALS]:this.t("bbva-feature-access-key-recovery-modal-set-up-description-invalid-credentials")}[this._case]||""}_setUpSecondDescription(){return{[Jr.INVALID_CARD]:this.t("bbva-feature-access-key-recovery-modal-invalid-card-second-description"),[Jr.SUCCESS_RESET_PASSWORD]:moment().format("DD MMMM YYYY, HH:mm [h]")}[this._case]||""}_setUpContentTitle(){return{[Jr.INVALID_CARD]:this.t("bbva-feature-access-key-recovery-modal-invalid-card-content-title"),[Jr.USE_PHYSICAL_CARD]:this.t("bbva-feature-access-key-recovery-modal-use-physical-card-content-title"),[Jr.USE_ANY_CARD_HOLDER]:this.t("bbva-feature-access-key-recovery-modal-use-any-card-holder-content-title"),[Jr.HAS_TO_REGISTER_AGAIN]:this.t("bbva-feature-access-key-recovery-modal-has-to-register-again-content-title"),[Jr.CARD_NOT_ASSOCIATED]:this.t("bbva-feature-access-key-recovery-modal-card-not-associated-content-title"),[Jr.INCORRECT_INFORMATION]:this.t("bbva-feature-access-key-recovery-modal-set-up-content-title-incorrect-information"),[Jr.INVALID_QR_CODE]:this.t("bbva-feature-access-key-recovery-modal-set-up-content-title-invalid-qr-code"),[Jr.INVALID_CREDENTIALS]:this.t("bbva-feature-access-key-recovery-modal-set-up-content-title-invalid-credentials"),[Jr.THIRD_ATTEMPT_INFORMATION]:this.t("bbva-feature-access-key-recovery-modal-set-up-content-title-incorrect-information")}[this._case]||""}_slotContent(){const e=this._case===Jr.SUCCESS_RESET_PASSWORD?this.imageSuccess:this.imageError;return this._case===Jr.PASSWORD_RECOMMENDATIONS?c`
      <div slot="slot-content">
        <bbva-list-bullet text="${this.t("bbva-feature-access-key-recovery-list-bullet-one")}"></bbva-list-bullet>
        <bbva-list-bullet text="${this.t("bbva-feature-access-key-recovery-list-bullet-two")}"></bbva-list-bullet>
        <bbva-list-bullet text="${this.t("bbva-feature-access-key-recovery-list-bullet-three")}"></bbva-list-bullet>
      </div>`:c`
      <div slot="slot-content-header" class="content-header-${this._case}">
        <bbva-banner-image
          img-accessibility-text="error"
          variant="medium"
          image-src="${e}">
        </bbva-banner-image>
      </div>
      <div slot="slot-content" class="content-${this._case}">
        <bbva-text
          aria-disabled="true"
          tabindex="-1"
          size="L"
          font-weight="500"
          alignment="center"
          tag="span"
          text="${this._setUpContentTitle()}">
        </bbva-text>
        <bbva-text
          aria-disabled="true"
          tabindex="-1"
          class="first-description"
          size="XS"
          alignment="center"
          tag="p"
          text-color="#666666"
          text="${this._setUpDescription()}">
        </bbva-text>
        <bbva-text
          aria-disabled="true"
          tabindex="-1"
          class="second-description"
          size="XS"
          alignment="center"
          tag="p"
          text-color="#666666"
          text="${this._setUpSecondDescription()}">
        </bbva-text>
        ${this._isBtnRowVisible()?this._bbvaButtonRow():V}
      </div>`}render(){return c`
      <bbva-help-modal
        class=${this._case}
        link-text=${this._linkText}
        body-text=${this._bodyText}
        title-icon=${this._titleIcon}
        title-text=${this._titleText}
        header-type=${this._headerType}
        header-text=${this._headerText}
        button-text=${this._buttonText}
        ?full-height=${this._fullHeight}
        ?fixed-footer=${this._fixedFooter}
        modal-type=${this._modalType}
        @help-modal-footer-link-click=${this._handleFooterLinkClick}
        @help-modal-footer-button-click=${this._handleFooterButtonClick}
        accessibility-text-icon-right-primary="primaryClickModalButton"
        @help-modal-header-right-primary-click = ${this._handlehelpRightPrimaryClick}>
        ${this._slotCases.includes(this._case)?this._slotContent():V}
      </bbva-help-modal>
      `}}class io extends($t(ae(f(i)))){static get is(){return"data-manager"}static get scopedElements(){const e=[ao,fr,st,nt,ot,...io.configurationScopedElements()];return io.scopedElementsFromClasses(e)}static get properties(){return{host:{type:String},hostGrantingTicket:{type:String,attribute:"host-granting-ticket"},countryGt:{type:String,attribute:"country-gt"},native:{type:Boolean},requiredToken:{type:String},customersApiVersion:{type:String,attribute:"customers-api-version"},identitiesOperationApiVersion:{type:String,attribute:"identities-operation-api-version"},recoveryType:{type:String,attribute:"recovery-type"},mobilePhone:{type:String,attribute:"mobile-phone"},cardNumber:{type:String,attribute:"card-number"},encryptedCvv:{type:String,attribute:"encrypted-cvv"},encryptedNip:{type:String,attribute:"encrypted-nip"},qrToken:{type:String,attribute:"qr-token"},password:{type:String},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},imageSuccess:{type:String,attribute:"image-success"},imageError:{type:String,attribute:"image-error"},birthday:{type:String},_grantingTicketDp:{type:Object},_customerDp:{type:Object},_identitiesOperationsDp:{type:Object},_consumerId:{type:Object},_errorCode:{type:Object},_akrModal:{type:Object},_attempts:{type:Number,attribute:"attempts"},_isVirtualCardRequest:{type:Boolean},flagAkrQr:{type:Boolean,attribute:"flag-akr-qr"},_successValidation:{type:Boolean}}}constructor(){super(),this.host="",this.hostGrantingTicket="",this.native=!1,this._isVirtualCardRequest=!1,this.qrToken="",this.countryGt="",this.cardNumber="",this.mobilePhone="",this.birthday="",this._consumerId={qr:"10000173",card:"10000187",anonymous:"10000088",qrSecurityJourney:"10000187"},this.recoveryType="",this.encryptedCvv="",this.encryptedNip="",this.requiredToken="",this.customersApiVersion="1",this.identitiesOperationApiVersion="",this.password="",this._grantingTicketDp=null,this._customerDp=null,this._invalidChannelStatus={blocked:["B4","PB"],canceled:["C4","CN","EC","NE"]},this._identitiesOperationsDp=null,this._errorCode={NOT_MAIN_CARD:"notMainCard",INVALID_REQUEST:"invalidRequest",INVALID_PARAMETERS:"invalidParameters",OPERATION_REJECTED:"operationRejected",IDENTIFICATION_ERROR:"identificationError",INVALID_CATEGORIZATION:"invalidCategorization",INVALID_CREDENTIALS_INTERNAL:"invalidCredentialsInternal",CARD_NO_EXIST:"cardNotExist"},this._digitalValidationPayload={},this._attempts=0,this.imageSuccess="",this.imageError="",this.flagAkrQr=!1,this._successValidation=!1}firstUpdated(){this._akrModal=this.shadowRoot.querySelector("[data-tag-name=akr-modal]"),this._customerDp=this.shadowRoot.querySelector("[data-tag-name=bbva-dataprovider-customers]"),this._grantingTicketDp=this.shadowRoot.querySelector("[data-tag-name=bbva-dataprovider-granting-tickets]"),this._customGrantingTicketDp=this.shadowRoot.querySelector("[data-tag-name=bbva-global-generic-dm]"),this._identitiesOperationsDp=this.shadowRoot.querySelector("[data-tag-name=bbva-dataprovider-identities-operations]")}makePostGrantingTicketAnonymous(){this._grantingTicketDp.consumerId=this._consumerId.anonymous,this._fireEvent(`${io.is}-toggle-loanding`),this._grantingTicketDp.postGrantingTickets()}makePostGrantingTicketCard(){const e={userId:this.mobilePhone,pan:this.cardNumber,pin:this.encryptedNip,cvv:this.encryptedCvv};this._grantingTicketDp.consumerId=this._consumerId.card,this._fireEvent(`${io.is}-toggle-loanding`),this._isVirtualCardRequest=!1,this._grantingTicketDp.postGrantingTicketCard(e)}makePostGrantingTicketVirtualCard(){const e={authentication:{userID:this.mobilePhone,consumerID:this._consumerId.card,authenticationType:"83",authenticationData:[{idAuthenticationData:"pan",authenticationData:[this.cardNumber]},{idAuthenticationData:"birthday",authenticationData:[this.birthday]}]},backendUserRequest:{userID:"",accessCode:this.mobilePhone,dialogId:""}};this._isVirtualCardRequest=!0,this._fireEvent(`${io.is}-toggle-loanding`),this._customGrantingTicketDp.postData(e)}makePostGrantingTicketQrCode(){const e={pin:this.encryptedNip,qrToken:this.qrToken};this._fireEvent(`${io.is}-toggle-loanding`),this._grantingTicketDp.consumerId=this._consumerId.qr,this._isVirtualCardRequest=!1,this.flagAkrQr&&(this._successValidation?(this._grantingTicketDp.consumerId=this._consumerId.qrSecurityJourney,this._grantingTicketDp.authenticationType="154"):(this._grantingTicketDp.consumerId=this._consumerId.qr,this._grantingTicketDp.authenticationType="153"),Object.assign(e,{userId:this.mobilePhone,accessCode:this.mobilePhone})),this._grantingTicketDp.postGrantingTicketQrCode(e)}_makePostDigitalValidationRequest(){const e={contactDetail:{contactType:{id:"MOBILE_NUMBER"},contact:this.mobilePhone},contract:{numberType:{id:"PAN"},number:this.cardNumber}};this._customerDp.postDigitalValidation(e)}makeIdentitiesRequest(){const e={originUserId:this.mobilePhone,passwordValue:this.password};this._fireEvent(`${io.is}-show-transitional`,!1),this._identitiesOperationsDp.postResetPassword(e)}_successDigitalValidationRequest(){this._fireEvent(`${io.is}-toggle-loanding`),this._fireEvent("complete"),this._fireEvent("akr-close-guillotine"),this._fireEvent("akr-card-virtual")}_errorDigitalValidationRequest({detail:e}){const t=e["error-code"],a=[this._errorCode.NOT_MAIN_CARD,this._errorCode.INVALID_REQUEST,this._errorCode.INVALID_PARAMETERS,this._errorCode.CARD_NO_EXIST].includes(t);if(this._fireEvent(`${io.is}-toggle-loanding`),a)this._akrModal.open("invalidCard");else switch(t){case this._errorCode.IDENTIFICATION_ERROR:this._continueToNextStep();break;case this._errorCode.OPERATION_REJECTED:this._akrModal.open("usePhysicalCard");break;case this._errorCode.INVALID_CATEGORIZATION:this._akrModal.open("useAnyCardHolder");break;case this._errorCode.INVALID_CREDENTIALS_INTERNAL:this._akrModal.open("cardNotAssociated");break;default:this._akrModal.open("unfinishedOperation")}}_makePostChannelStatusRequest(){if(this.recoveryType!==Kr||this._successValidation){const e={"contactDetail.contact":this.mobilePhone};this._customerDp.getCustomerChannelStatus(e)}else this._makePostDigitalValidationRequest()}async _handleResponseVirtualCard(e){var t,a,i,r;this.headers={tsec:(null==e||null===(t=e.detail)||void 0===t||null===(a=t.responseHeaders)||void 0===a?void 0:a.tsec)||(null==e||null===(i=e.detail)||void 0===i||null===(r=i.headers)||void 0===r?void 0:r.tsec)},this.requestUpdate(),await this.updateComplete,this._makePostChannelStatusRequest()}_channelStatusSuccess({detail:e}){const t=e.status.id;this._invalidChannelStatus.canceled.includes(t)?this._fireEvent("open-alert-manager",this._deviceAccessRegistrationRequired()):this._invalidChannelStatus.blocked.includes(t)?this._fireEvent("open-alert-manager",this._deviceAccessChannelStatusBlocked()):(this._fireEvent(`${io.is}-toggle-loanding`),this._continueToNextStep())}_channelStatusError(){this._fireEvent(`${io.is}-toggle-loanding`),this._akrModal.open("unfinishedOperation")}_deviceAccessRegistrationRequired(){return{code:"DEVICE-ACTIVATION-REGISTRATION-REQUIRED",selectedConfig:{className:"info header--white close-button--right",openMaximized:!0,iconOnlyFullHeight:!0,title:"device-access-modal-error-title",heroImage:this.imageError,acceptBtLabel:"device-access-register-required-button-accept",cancelBtLabel:"device-access-register-required-button-cancel",onCancelEvent:()=>{this._fireEvent("access-key-recovery-invalid-user-link-click")},template:{type:"paragraphs",values:[{title:"device-access-register-required-value-title"},{text:"device-access-register-required-value-text",class:"spacing--xl"}]}}}}_deviceAccessChannelStatusBlocked(){return{code:"device-access—page-channel-status-error-login-back",selectedConfig:{className:"info header--white access-key-recovery-pass-modal close-button--right",openMaximized:!0,iconOnlyFullHeight:!0,title:"glomo-digital-activation-dm-error-modal-header-title",heroImage:this.imageError,acceptBtLabel:"glomo-digital-activation-dm-call-accept-label",cancelBtLabel:"glomo-digital-activation-dm-exit-cancel-label",onAcceptEvent:()=>{this._fireEvent("glomo-help-phone-button-clicked")},onCancelEvent:()=>{this._fireEvent("access-key-recovery-invalid-user-link-click")},template:{type:"paragraphs",values:[{title:"glomo-digital-activation-dm-paragraph-application-blocked-title"},{text:"glomo-digital-activation-dm-paragraph-application-blocked-first-text"},{text:"glomo-digital-activation-dm-paragraph-application-blocked-second-text"}]}}}}_postIdentitiesOperationResetSuccess(){this._akrModal.open("successResetPassword"),this._fireEvent(`${io.is}-toggle-loanding`),this._fireEvent(`${io.is}-show-transitional`,!0)}_postIdentitiesOperationResetError({detail:e}){var t,a;this._fireEvent(`${io.is}-toggle-loanding`);const i=null==e||null===(t=e.messages)||void 0===t||null===(a=t[0])||void 0===a?void 0:a.code;this._fireEvent(`${io.is}-show-transitional`,!0),"technicalError"===i&&this._akrModal.open("technicalError"),"invalidCredentials"===i&&this._akrModal.open("invalidCredentials"),"functionalError"===i&&this._akrModal.open("passwordHasAlreadyBeenUsed")}_continueToNextStep(){this.recoveryType!==Kr||this._successValidation?(this._fireEvent("akr-card-fisica"),this._fireEvent("complete"),this._fireEvent("akr-close-guillotine")):(this._successValidation=!0,this.makePostGrantingTicketQrCode())}_handleGrantTicketError(){this._fireEvent(`${io.is}-toggle-loanding`),this._fireEvent("data-manager-granting-ticket-error")}_fireEvent(e,t=""){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaAkrModal(){return c`
      <akr-modal
        phone-number-bbva-line=${this.phoneNumberBbvaLine}
        image-success=${this.imageSuccess}
        image-error=${this.imageError}>
      </akr-modal>`}_dispachError(e,{detail:t}={}){let a=e;if(t&&this.flagAkrQr){const{response:e}=t,i=JSON.parse(e),r=i["error-code"],o=i["http-status"];a="519"===r&&403===o?"cardNotAssociated":a}this._attempts<3?this._akrModal.open(a):(this._attempts=0,this._akrModal.open("thirdAttemptInformation")),this._attempts+=1,this._fireEvent(`${io.is}-toggle-loanding`)}render(){return c`
      <bbva-dataprovider-granting-tickets
        host=${this.hostGrantingTicket||this.host}
        ?native=${this.native}
        country=${this.countryGt}
        requiredToken=${this.requiredToken}
        @login-with-qr-request-error=${e=>{this._dispachError("incorrectInformation",e)}}
        @login-with-qr-request-success=${()=>{this._makePostChannelStatusRequest()}}
        @login-with-card-request-error=${this._handleGrantTicketError}
        @login-with-card-request-success=${()=>{this._makePostChannelStatusRequest()}}
        @login-anonymous-request-error="${()=>{this._dispachError("unfinishedOperation")}}"
        @login-anonymous-request-success=${this._makePostDigitalValidationRequest}>
      </bbva-dataprovider-granting-tickets>

      <bbva-dataprovider-customers
        host=${this.host}
        ?native=${this.native}
        .version=${this.customersApiVersion}
        .headers=${this._isVirtualCardRequest?this.headers:null}
        requiredToken=${this.requiredToken}
        @post-digital-validation-error=${this._errorDigitalValidationRequest}
        @post-digital-validation-success=${this._successDigitalValidationRequest}
        @get-customer-channel-status-error=${this._channelStatusError}
        @get-customer-channel-status-success=${this._channelStatusSuccess}>
      </bbva-dataprovider-customers>

      <bbva-dataprovider-identities-operations
        host=${this.host}
        ?native=${this.native}
        ?requiredOTP=${!0}
        apiVersion=${this.identitiesOperationApiVersion}
        requiredToken=${this.requiredToken}
        @post-identities-operations-reset-password-v0-error=${this._postIdentitiesOperationResetError}
        @post-identities-operations-reset-password-v0-success=${this._postIdentitiesOperationResetSuccess}>
      </bbva-dataprovider-identities-operations>

      <bbva-global-generic-dm
        host=${this.hostGrantingTicket||this.host}
        path="TechArchitecture/${this.countryGt}/grantingTicket/V02"
        ?native=${this.native}
        method="POST"
        cache-type="SESSION"
        cross-domain
        requiresToken
        verbose
        @generic-dm-create=${this._handleResponseVirtualCard}
        @generic-dm-create-error=${this._handleGrantTicketError}
      ></bbva-global-generic-dm>

      ${this._bbvaAkrModal()}
    `}}var ro=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: ${h(m.primaryCoreLightened)};
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-form-input] {
  text-align: left;
}

[data-tag-name=bbva-text] {
  margin-top: -1rem;
  padding-bottom: 0.5rem;
}

.qr-title-step {
  margin-top: 1rem;
}

.card-view-container {
  display: flex;
  align-items: center;
  padding-bottom: 1rem;
}

[data-tag-name=bbva-link] {
  display: flex;
  padding: 0 0 0.5625rem 0;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1rem;
}

[data-tag-name="bbva-form-password"].input-nip {
  text-align: left;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class oo extends(f(ae($t(i)))){static get is(){return"content-card-data"}static get styles(){return[ro,l("content-card-data-step-styles")]}static get scopedElements(){const e=[W,$,io,$e,Ri,Si,zi,ie,at,...oo.configurationScopedElements()];return oo.scopedElementsFromClasses(e)}static get properties(){return{host:{type:String},hostGrantingTicket:{type:String,attribute:"host-granting-ticket"},countryGt:{type:String,attribute:"country-gt"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},customersApiVersion:{type:String,attribute:"customers-api-version"},phoneNumber:{type:String,attribute:"phone-number"},cardNumber:{type:String,attribute:"card-number"},knownPhoneNumber:{type:Boolean,attribute:"known-phone-number"},isInputPhoneNumberFull:{type:Boolean,attribute:"input-phone-number-full"},recoveryType:{type:String,attribute:"recovery-type"},qrCardNumber:{type:String,attribute:"qr-card-number"},qrToken:{type:String,attribute:"qr-token"},resetContent:{type:Boolean,attribute:"reset-content"},encryptedCvv:{type:String,attribute:"encrypted-cvv"},encryptedNip:{type:String,attribute:"encrypted-nip"},isNativeIos:{type:Boolean},environment:{type:String},typeCard:{type:String},birthday:{type:String},attempts:{type:Number,attribute:"attempts"},imageSuccess:{type:String,attribute:"image-success"},imageError:{type:String,attribute:"image-error"},_dataManager:{type:Object},_qrCodeScanned:{type:Boolean,attribute:"qr-code-scanned"},_cvv:{type:String},_nip:{type:String},_showInfoCvvdMessage:{type:Boolean},_showInfoNipMessage:{type:Boolean},_enableBtnDefault:{type:Boolean},_isInputCvvNumberFull:{type:Boolean},_isInputNipNumberFull:{type:Boolean},_bbvaFormInputCvvElement:{type:Object},_bbvaFormInputNipElement:{type:Object},_bbvaFormInputBirthdayElement:{type:Object},_dataManagerElement:{type:Object},_enviromentDictionary:{type:Object},flagAkrQr:{type:Boolean,attribute:"flag-akr-qr"}}}constructor(){super(),this._cvv="",this._nip="",this._keyForm={CVV:"CVV",NIP:"NIP"},this._qrCodeScanned=!1,this._enableBtnDefault=!1,this._showInfoNipMessage=!1,this._showInfoCvvdMessage=!1,this._isInputCvvNumberFull=!1,this._isInputNipNumberFull=!1,this.isInputPhoneNumberFull=!1,this.qrToken="",this.cardNumber="",this.phoneNumber="",this.qrCardNumber="",this.recoveryType="",this.knownPhoneNumber=!1,this.attempts=0,this.imageSuccess="",this.imageError="",this.typeCard="",this._isInputDateFull=!1,this.birthday="",this.environment="",this.isNativeIos=!1,this._enviromentDictionary={de:{iOS:"Dev",android:"desa"},pro:{iOS:"Prod",android:"prod"}},this.flagAkrQr=!1}get _bbvaInputCvv(){return this._bbvaFormInputCvvElement||(this._bbvaFormInputCvvElement=this.shadowRoot.querySelector('[data-tag-name="bbva-form-password"].input-cvv')),this._bbvaFormInputCvvElement}get _bbvaInputNip(){return this._bbvaFormInputNipElement||(this._bbvaFormInputNipElement=this.shadowRoot.querySelector('[data-tag-name="bbva-form-password"].input-nip')),this._bbvaFormInputNipElement}get _bbvaInputBirthday(){return this._bbvaFormInputBirthdayElement||(this._bbvaFormInputBirthdayElement=this.shadowRoot.querySelector('[data-tag-name="bbva-form-input"].input-date')),this._bbvaFormInputBirthdayElement}get _dataManager(){return this._dataManagerElement||(this._dataManagerElement=this.shadowRoot.querySelector('[data-tag-name="data-manager"]')),this._dataManagerElement}updated(e){this._showInfoCvvdMessage=0===this._cvv.length||3===this._cvv.length,this._showInfoNipMessage=0===this._nip.length||4===this._nip.length,e.has("qrCardNumber")&&0!==this.qrCardNumber.length&&(this._qrCodeScanned=!0),this.recoveryType===Yr&&(this._enableBtnDefault=this._isInputCvvNumberFull&&this._isInputNipNumberFull||this._isInputDateFull),this.recoveryType===Kr&&(this._enableBtnDefault=(this.isInputPhoneNumberFull||this.knownPhoneNumber)&&this._isInputNipNumberFull),e.has("resetContent")&&this.resetContent&&(this._cvv="",this._nip="",this.qrCardNumber="",this._qrCodeScanned=!1,this._isInputNipNumberFull=!1,this._isInputCvvNumberFull=!1,this.resetContent=!1),e.has("typeCard")&&this.typeCard===eo&&(this._bbvaInputNip.hidden=!0,this._bbvaInputCvv.hidden=!0,this._bbvaInputBirthday.hidden=!1)}_handleFormInputCvv(){this._cvv=this._bbvaInputCvv.value,this._isInputCvvNumberFull=3===this._cvv.length,this._fireEvent("_bbva-input-cvv-completed",{status:this._isInputCvvNumberFull,key:"CVV"}),3===this._cvv.length&&this._fireEvent("bbva-encrypt-cvv-request",this._configInputData(this._keyForm.CVV,this._cvv))}_handleFormInputNip(){this._nip=this._bbvaInputNip.value,this._isInputNipNumberFull=4===this._nip.length,this._fireEvent("_bbva-input-nip-completed",{status:this._isInputNipNumberFull,key:"NIP"}),4===this._nip.length&&this._fireEvent("bbva-encrypt-pin-request",this._configInputData(this._keyForm.NIP,this._nip))}_handleFormInputBirthday({detail:e}){this.birthday=e.value,this._isInputDateFull=this.birthday.length>0}_configInputData(e="",t=""){let a="";return this._keyForm.CVV===e?a=t.padEnd(16,"F"):this._keyForm.NIP===e&&(a=`24${t}`.padEnd(16,"F")),{data:a,isHexEncoded:!0,key_tag:this._getKeyTag()}}_getKeyTag(){const e=this.isNativeIos?"iOS":"android";return this._enviromentDictionary[this.environment][e]}_handleScanQrCode(){this._fireEvent("akr-reset-qr-card-number"),this._fireEvent("bbva-access-key-recovery-scan-qr-code")}_resetFormInput(e){e?this._cvv="":this._nip=""}_handleContentCardDataStep(){this.recoveryType===Yr?this._dataManager.makePostGrantingTicketCard():this._dataManager.makePostGrantingTicketQrCode()}_fireEvent(e,t=""){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaDescription(){return c`
      <bbva-text
        aria-disabled="true"
        tabindex="-1"
        text="${this.t("bbva-feature-access-key-recovery-content-card-data-capture-the-security-data")}"
        size="X"
        ?hidden=${this.recoveryType===Kr}>
      </bbva-text>
    `}_bbvaFormInputCVV(){return c`
      <bbva-form-password
        type="number"
        inputmode="numeric"
        maxlength="3"
        class="bbva-form input-cvv"
        optional-label="${this.t("bbva-feature-access-key-recovery-content-card-data-label-cvv")}"
        value=${this._cvv}
        ?hidden=${this.recoveryType===Kr}
        info-message=${this._showInfoCvvdMessage?`${this.t("bbva-feature-access-key-recovery-content-card-data-info-message-cvv")}`:""}
        pattern="^[0-9]{3}"
        auto-validate
        error-message="${this.t("bbva-feature-access-key-recovery-content-card-data-error-message-cvv")}"
        allowed-pattern="[0-9]"
        @form-field-input-clear=${()=>{this._resetFormInput(!0)}}
        @input="${this._handleFormInputCvv}">
      </bbva-form-password>
    `}_bbvaFormInputNIP(){return c`
      <bbva-form-password
        type="number"
        inputmode="numeric"
        maxlength="4"
        class="bbva-form input-nip"
        optional-label="${this.t("bbva-feature-access-key-recovery-content-card-data-label-nip")}"
        value=${this._nip}
        info-message=${this._showInfoNipMessage?`${this.t("bbva-feature-access-key-recovery-content-card-data-info-message-nip")}`:""}
        pattern="^[0-9]{4}"
        auto-validate
        error-message="${this.t("bbva-feature-access-key-recovery-content-card-data-error-message-nip")}"
        allowed-pattern="[0-9]"
        @form-field-input-clear=${()=>{this._resetFormInput(!1)}}
        @input="${this._handleFormInputNip}"
        ?disabled=${this.recoveryType===Kr&&!this._qrCodeScanned}>
      </bbva-form-password>
    `}_bbvaCardView(){return c`
      <div class="card-view-container" ?hidden=${!this._qrCodeScanned}>
        <bbva-clip-card
          size="medium"
          class="card-img"
          variant="credit">
        </bbva-clip-card>
        <bbva-list-simple 
          action-accessibility-text="qrCardNumber"
          mask="${this.qrCardNumber}"
          label=" "
          mask-chars="•"    
          label-medium
          visible-chars="4">
        </bbva-list-simple>         
      </div>        
    `}_bbvaTitleStep(){return c`
      <bbva-text
        aria-disabled="true"
        tabindex="-1"
        text="${this.t("bbva-feature-access-key-recovery-header-card-data")}"
        size="X"
        class="qr-title-step"
        ?hidden=${this.recoveryType===Yr}
        font-weight="500">
      </bbva-text>
    `}_bbvaFormInputDate(){return c`
      <bbva-form-input
        class ="bbva-form input-date"
        type="date"
        label="${this.t("bbva-feature-access-key-recovery-content-card-data-input-date")}"
        ?hidden=${this.typeCard!==eo}
        value=${this.birthday}
        @form-input-value-change=${this._handleFormInputBirthday}>
      </bbva-form-input>
    `}_bbvaScanQrCodeLink(){const e=`${this.t("bbva-feature-access-key-recovery-content-card-data-sacan-qr-code-link-scan")} \n      ${this._qrCodeScanned?`${this.t("bbva-feature-access-key-recovery-content-card-data-sacan-qr-code-link-other")}`:`${this.t("bbva-feature-access-key-recovery-content-card-data-sacan-qr-code-link")}`} \n        ${this.t("bbva-feature-access-key-recovery-content-card-data-sacan-qr-code-link-qr")}`;return c`
    <bbva-link
      icon=${Fe()}
      @click="${this._handleScanQrCode}"
      ?hidden=${this.recoveryType===Yr}
      ?disabled=${!this.knownPhoneNumber&&!this.isInputPhoneNumberFull}>
      <span>${e}</span>
    </bbva-link>
    `}_bbvaFooterButton(){return c`
      <bbva-button-default
        text="${this.t("bbva-feature-access-key-recovery-button-continue")}"
        @click=${this._handleContentCardDataStep}
        ?disabled=${!this._enableBtnDefault}>
      </bbva-button-default>
    `}_bbvaDataManager(){return c`
      <data-manager
        host=${this.host}
        host-granting-ticket=${this.hostGrantingTicket}
        ?native=${this.native}
        ?flag-akr-qr=${this.flagAkrQr}
        country-gt=${this.countryGt}
        qr-token=${this.qrToken}
        attempts=${this.attempts}
        card-number=${this.cardNumber}
        mobile-phone=${this.phoneNumber}
        encrypted-cvv=${this.encryptedCvv}
        encrypted-nip=${this.encryptedNip}
        recovery-type=${this.recoveryType}
        requiredToken=${this.requiredToken}        
        customers-api-version=${this.customersApiVersion}
        image-success=${this.imageSuccess}
        image-error=${this.imageError}
        @akr-invalid-card=${()=>{this.resetContent=!0}}
        @akr-invalid-card-right-primary-icon=${()=>{this.resetContent=!0}}
        @akr-first-two-attempts-information=${()=>{this.resetContent=!0}}>
      </data-manager>    
    `}render(){return c`
      ${this._bbvaTitleStep()}
      ${this._bbvaCardView()}
      ${this._bbvaScanQrCodeLink()}
      ${this._bbvaDescription()}
      ${this._bbvaFormInputDate()}
      ${this._bbvaFormInputCVV()}
      ${this._bbvaFormInputNIP()}
      ${this._bbvaFooterButton()}
      ${this._bbvaDataManager()}
    `}}var so=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: ${h(m.primaryCoreLightened)};
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-button-default] {
  margin-top: 2rem;
}

[data-tag-name=bbva-text] {
  margin: -1rem 0px 1.5rem;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class no extends($t(ae(f(i)))){static get is(){return"content-customer-data"}static get styles(){return[so,l("content-customer-data-styles")]}static get scopedElements(){const e=[$,Ri,ie,io,...no.configurationScopedElements()];return no.scopedElementsFromClasses(e)}static get properties(){return{hostGrantingTicket:{type:String,attribute:"host-granting-ticket"},date:{type:String},countryGt:{type:String,attribute:"country-gt"},imageSuccess:{type:String,attribute:"image-success"},imageError:{type:String,attribute:"image-error"},phoneNumber:{type:String,attribute:"phone-number"},requiredToken:{type:String,attribute:"required-token"},customersApiVersion:{type:String,attribute:"customers-api-version"},recoveryType:{type:String,attribute:"recovery-type"},resetContent:{type:Boolean,attribute:"reset-content"},cardNumber:{type:String,attribute:"card-number"},_isInputDateFull:{type:Boolean},_dataManagerElement:{type:Object}}}constructor(){super(),this.date="",this._isInputDateFull=!1,this.host="",this.hostGrantingTicket="",this.customersApiVersion="1",this.countryGt="",this.recoveryType="",this.resetContent=!1,this.phoneNumber="",this.cardNumber="",this.requiredToken="tsec",this.native=""}updated(e){e.has("resetContent")&&(this.date="",this._isInputDateFull=!1),e.has("date")&&this._handleFormInputBirthday(this.date)}get _dataManager(){return this._dataManagerElement||(this._dataManagerElement=this.shadowRoot.querySelector('[data-tag-name="data-manager"]')),this._dataManagerElement}_handleCustomerDataConfirm(){this._dataManager.makePostGrantingTicketVirtualCard()}_fireEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_handleFormInputBirthday(e){this.date=e,this._isInputDateFull=this.date.length>0}_formatDate(e){return this._fireEvent("akr-date",e.replaceAll("-","/")),e.replaceAll("-","")}get _bbvaFormIputDate(){return c`
      <bbva-form-input
        class ="bbva-form input-date"
        type="date"
        label="${this.t("bbva-feature-access-key-recovery-content-card-data-input-date")}"
        value=${this.date}
        @form-field-input-focus=${()=>{this._fireEvent(`${no.is}-request-native-date`)}}
        @form-input-value-change=${e=>{var t;this._handleFormInputBirthday(null==e||null===(t=e.detail)||void 0===t?void 0:t.value)}}>
      </bbva-form-input>
    `}render(){return c`
      <bbva-text
        aria-disabled="true"
        tabindex="-1"
        size="XS"
        text="${this.t("bbva-feature-access-key-recovery-content-customer-data-title-date")}">
      </bbva-text>

      ${this._bbvaFormIputDate}

      <bbva-button-default
        text="${this.t("bbva-feature-access-key-recovery-button-continue")}"
        ?disabled=${!this._isInputDateFull}
        @click=${this._handleCustomerDataConfirm}>
      </bbva-button-default>  

      <data-manager
        host=${this.host}
        host-granting-ticket=${this.hostGrantingTicket}
        ?native=${this.native}
        country-gt=${this.countryGt}
        birthday=${this._formatDate(this.date)}
        card-number=${this.cardNumber}
        mobile-phone=${this.phoneNumber}
        recovery-type=${this.recoveryType}
        requiredToken=${this.requiredToken}        
        image-success=${this.imageSuccess}
        customers-api-version=${this.customersApiVersion}
        image-error=${this.imageError}>
      </data-manager>   
    `}}var lo=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}
:host bbva-button-default {
  margin-top: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-form-input] {
  margin: 1rem 0;
  text-align: left;
}

[data-tag-name=bbva-button-default] {
  margin-top: 1rem;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class co extends($t(ae(f(i)))){static get is(){return"content-reset-password"}static get styles(){return[lo,l("content-reset-password-styles")]}static get scopedElements(){const e=[ao,Ri,ie,...co.configurationScopedElements()];return co.scopedElementsFromClasses(e)}static get properties(){return{resetContent:{type:Boolean,attribute:"reset-content"},_regexPassword:{type:String},_enableBtnDefault:{type:Boolean},_akrModal:{type:Object},_password:{type:String},_confirmPassword:{type:String},_showErrorPassConfirmMessage:{type:Boolean},_passwordErrorMessage:{type:String}}}constructor(){super(),this._akrModal=null,this._password="",this._regexPassword="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,10}$",this._enableBtnDefault=!1,this._confirmPassword="",this._showErrorPassConfirmMessage=!1,this._passwordErrorMessage="bbva-feature-access-key-recovery-content-reset-password-info-message-error"}firstUpdated(){this._akrModal=this.shadowRoot.querySelector("[data-tag-name=akr-modal]");this.shadowRoot.querySelector("[data-tag-name=bbva-form-input].confirm-password").disabled=!0,this._setUpListeners()}updated(e){e.has("resetContent")&&this.resetContent&&(this._password="",this._confirmPassword="",this._enableBtnDefault=!1,this.resetContent=!1)}_setUpListeners(){this.addEventListener("akr-password-has-already-been-used",(()=>{this.resetContent=!0}))}_handleNewPassword({detail:e}){this._password=e.value,this._confirmPassword="",this._enableBtnDefault=!1}_validateConsecutiveCharactes(e){const t=e.split(/(\d+)/g).filter((e=>e.length>0)),a=[];return t.forEach((e=>{const t=e.split("").map((e=>e.charCodeAt()));let i=0;t.forEach(((e,a)=>{if(a<t.length){const r=t[a-1],o=t[a+1];e-r==1||o-e==1||e===o?i+=1:i<3&&(i=0)}})),a.push(i)})),a.some((e=>e>=3))}_invalidPassWord(e){const t=new RegExp(this._regexPassword),a=e.match(/[bB](?=[bB](?=[vV](?=[aA])))/g),i=this._validateConsecutiveCharactes(e),r=!t.test(e)&&e.length>0;return{invalid:!(null==a||!a.length)||i||r,hasConsecutiveChars:i,containBbbva:!(null==a||!a.length)}}_validateErrorMessage(e){const t=this._invalidPassWord(e);let a="bbva-feature-access-key-recovery-content-reset-password-info-message-error";return t.hasConsecutiveChars?a="bbva-feature-access-key-recovery-content-reset-password-info-message-consecutive-numbers":t.containBbbva&&(a="bbva-feature-access-key-recovery-content-reset-password-info-message-contain-bbva"),a}_validateInfoMessage(e){return this._invalidPassWord(e).invalid?"":"bbva-feature-access-key-recovery-content-reset-password-info-message"}_confirmPasswordStatus(e){return this._invalidPassWord(e).invalid||0===e.length}_handleConfirmPassword({detail:e}){this._confirmPassword=e.value,this._enableBtnDefault=this._confirmPassword===this._password,this._showErrorPassConfirmMessage=this._confirmPassword!==this._password,this._confirmPassword===this._password&&this._fireEvent("akr-share-pass-length",{id:"password",value:this._password})}_handleInfoPasswordModal(){this._akrModal.open("passwordRecommendations")}_resetFormInput({target:e}){const{classList:t}=e;t.forEach((e=>{"new-password"===e&&(this._confirmPassword="",this._password="")})),this._enableBtnDefault=!1}_handleResetPasswordConfirm(){this._fireEvent("complete"),this._fireEvent("akr-active-panel-button-fixed")}_fireEvent(e,t=""){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaFormNewPassword(){return c`
      <bbva-form-input
        type="password"
        class="bbva-form new-password"
        value=${this._password}
        label="${this.t("bbva-feature-access-key-recovery-content-reset-password-label")}"
        label-out="${this.t("bbva-feature-access-key-recovery-content-reset-password-label-out")}"
        pattern=${this._regexPassword}
        help-icon="bbva:help"
        info-message=${this._validateInfoMessage(this._password)}
        error-message=${this._validateErrorMessage(this._password)}
        allowed-pattern="^[a-zA-Z0-9]"
        ?invalid = ${this._invalidPassWord(this._password).invalid}
        @form-field-help-click="${this._handleInfoPasswordModal}"
        @form-field-input-clear=${this._resetFormInput}
        @form-input-value-change="${this._handleNewPassword}">
      </bbva-form-input>    
    `}_bbvaFormConfirmPassword(){return c`
      <bbva-form-input
        type="password"
        class="bbva-form confirm-password"
        value=${this._confirmPassword}
        label="${this.t("bbva-feature-access-key-recovery-content-reset-password-label")}"
        pattern="^${this._password}$"
        error-message="${this.t("bbva-feature-access-key-recovery-content-reset-password-confirm-info-message")}"
        auto-validate
        ?disabled = ${this._confirmPasswordStatus(this._password)}
        allowed-pattern="^[a-zA-Z0-9]"
        @form-field-input-clear=${this._resetFormInput}
        @form-input-value-change="${this._handleConfirmPassword}">
      </bbva-form-input>    
    `}_bbvaButtonDefault(){return c`
        <bbva-button-default
          text="${this.t("bbva-feature-access-key-recovery-button-continue")}"
          @click=${this._handleResetPasswordConfirm}
          ?disabled=${!this._enableBtnDefault}>
        </bbva-button-default>
      `}render(){return c`
      ${this._bbvaFormNewPassword()}
      ${this._bbvaFormConfirmPassword()}
      ${this._bbvaButtonDefault()}

      <akr-modal></akr-modal>
    `}}var ho=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: ${h(m.primaryCoreLightened)};
}

:host([hidden]), [hidden] {
  display: none !important;
}

.bbva-form {
  text-align: left;
  padding: 0.5rem 0;
}

[data-tag-name=bbva-list-simple] {
  padding: 0.5rem 0;
}

[data-tag-name=bbva-divider-default] {
  display: flex;
  justify-content: center;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class bo extends($t(ae(f(i)))){static get is(){return"content-identification"}static get styles(){return[ho,l("content-identification-styles")]}static get scopedElements(){const e=[ao,$,io,Ri,Pa,zi,oo,ie,Za,Ma,at,...bo.configurationScopedElements()];return bo.scopedElementsFromClasses(e)}static get properties(){return{host:{type:String},hostGrantingTicket:{type:String,attribute:"host-granting-ticket"},countryGt:{type:String,attribute:"country-gt"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},customersApiVersion:{type:String,attribute:"customers-api-version"},phoneNumber:{type:String,attribute:"phone-number"},cardNumber:{type:String,attribute:"card-number"},encryptedNip:{type:String,attribute:"encrypted-nip"},knownPhoneNumber:{type:Boolean,attribute:"known-phone-number"},qrToken:{type:String,attribute:"qr-token"},recoveryType:{type:String,attribute:"recovery-type"},resetContent:{type:Boolean,attribute:"reset-content"},qrCardNumber:{type:String,attribute:"qr-card-number"},imageSuccess:{type:String,attribute:"image-success"},imageError:{type:String,attribute:"image-error"},isNativeIos:{type:Boolean},environment:{type:String},_formPhoneNumber:{type:Object},_formCardNumber:{type:Object},_akrModal:{type:Object},_dataManager:{type:Object},_showInfoPhoneMessage:{type:Boolean},_showInfoCardMessage:{type:Boolean},_enableBtnDefault:{type:Boolean},_isInputPhoneNumberFull:{type:Boolean},_isInputCardNumberFull:{type:Boolean},flagAkrQr:{type:Boolean,attribute:"flag-akr-qr"}}}constructor(){super(),this.host="",this.hostGrantingTicket="",this.native=!1,this.qrToken="",this.countryGt="",this.requiredToken="",this.knownPhoneNumber=!1,this.customersApiVersion="1",this.cardNumber="",this.phoneNumber="",this.encryptedNip="",this.recoveryType="",this.resetContent=!1,this._akrModal=null,this._formCardNumber=null,this._formPhoneNumber=null,this._enableBtnDefault=!1,this._showInfoCardMessage=!1,this._hideErrorCardMessage=!1,this._showInfoPhoneMessage=!1,this._isInputCardNumberFull=!1,this._isInputPhoneNumberFull=!1,this.qrCardNumber="",this.imageSuccess="",this.imageError="",this.environment="",this.isNativeIos=!1,this.flagAkrQr=!1}firstUpdated(){this._setUpDomElements()}updated(e){this._enableBtnDefault=(this._isInputPhoneNumberFull||this.knownPhoneNumber)&&this._isInputCardNumberFull,this._showInfoPhoneMessage=0===this.phoneNumber.length||10===this.phoneNumber.length,this._formPhoneNumber.invalid=!this._showInfoPhoneMessage,this._showInfoCardMessage=0===this.cardNumber.length||16===this.cardNumber.length,e.has("resetContent")&&this.resetContent&&(this.cardNumber="",this.phoneNumber=this.knownPhoneNumber?this.phoneNumber:"",this._isInputPhoneNumberFull=!1,this._isInputCardNumberFull=!1,this.resetContent=!1)}_setUpDomElements(){this._akrModal=this.shadowRoot.querySelector("[data-tag-name=akr-modal]"),this._dataManager=this.shadowRoot.querySelector("[data-tag-name=data-manager]"),this._formCardNumber=this.shadowRoot.querySelector("[data-tag-name=bbva-form-attach]"),this._formPhoneNumber=this.shadowRoot.querySelector("[data-tag-name=bbva-form-number]")}_handleQuestionMark(){this._akrModal.open("questionMark")}_handlePhoneNumber(){var e;this.phoneNumber=null===(e=this._formPhoneNumber)||void 0===e?void 0:e.value,this._isInputPhoneNumberFull=10===this.phoneNumber.length,this._isInputPhoneNumberFull&&this._fireEvent("akr-share-phone-number",{id:"phoneNumber",value:this.phoneNumber})}_handleCardNumber(){var e;this.cardNumber=null===(e=this._formCardNumber)||void 0===e?void 0:e.value,this._isInputCardNumberFull=16===this.cardNumber.length,this._isInputCardNumberFull&&this._fireEvent("akr-share-card-number",{id:"cardNumber",value:this.cardNumber})}_handleCamera(){this._fireEvent("akr-open-camara-to-scan-physical-card")}_resetFormInput(){this._showInfoCardMessage=!1,this._isInputCardNumberFull=!1}_resetFormInputNumber(){this._showInfoPhoneMessage=!1,this._isInputPhoneNumberFull=!1}_handleContentIdentificationStep(){this._fireEvent("akr-close-guillotine"),this._dataManager.makePostGrantingTicketAnonymous()}_fireEvent(e,t=""){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaDescription(){return c`
      <bbva-text
        aria-disabled="true"
        tabindex="-1"
        size="XS"
        text="${this.t("bbva-feature-access-key-recovery-content-customer-data-title-date")}">
      </bbva-text>
    `}_bbvaListSimplePhoneNumber(){return c`
      <bbva-list-simple
        action-accessibility-text="phoneNumber"
        mask=${this.phoneNumber}
        label="${this.t("bbva-feature-access-key-recovery-content-identification-optional-label-phone-number")}"
        ?hidden=${!this.knownPhoneNumber}
        mask-chars="•"
        action-icon="bbva:help"
        visible-chars="5"
        @list-simple-icon-click=${this._handleQuestionMark}>
      </bbva-list-simple>
    `}_bbvaFormInputPhoneNumber(){return c`
      <bbva-form-number
        type = 'number'
        class="bbva-form phoneNumber"        
        optional-label="${this.t("bbva-feature-access-key-recovery-content-identification-optional-label-phone-number")}"
        value=${this.phoneNumber}
        pattern="^[0-9]{10}"
        ?hidden=${this.knownPhoneNumber}
        inputmode="numeric"
        auto-validate
        maxlength="10"
        info-message=${this._showInfoPhoneMessage?`${this.t("bbva-feature-access-key-recovery-content-identification-info-message-phone-number")}`:""}
        error-message="${this.t("bbva-feature-access-key-recovery-content-identification-error-message-phone-number")}"
        @form-field-input-clear=${this._resetFormInputNumber}
        @input=${this._handlePhoneNumber}
        allowed-pattern="[0-9]">
      </bbva-form-number>
    `}_bbvaFormInputCardNumber(){return c`
      <bbva-form-attach
        input-type='camera'      
        class="bbva-form camera"
        value=${this.cardNumber}
        label="${this.t("bbva-feature-access-key-recovery-content-identification-label-card-number")}"
        optional-label=""
        ?hidden=${this.recoveryType===Kr}
        pattern="^[0-9]{16}"
        inputmode="numeric"
        info-message=${this._showInfoCardMessage?`${this.t("bbva-feature-access-key-recovery-content-identification-info-message-card-number")}`:""}
        error-message="${this.t("bbva-feature-access-key-recovery-content-identification-error-message-card-number")}"
        auto-validate
        allowed-pattern="[0-9]"
        @form-field-input-clear=${this._resetFormInput}
        @input=${this._handleCardNumber}
        @form-field-button-submit=${this._handleCamera}>
      </bbva-form-attach>
    `}_bbvaContentQrCode(){return c`
      <content-card-data
        host=${this.host}
        host-granting-ticket=${this.hostGrantingTicket}
        ?native=${this.native}
        ?hidden=${this.recoveryType===Yr}
        ?isNativeIos=${this.isNativeIos}
        ?flag-akr-qr=${this.flagAkrQr}
        .environment=${this.environment}
        required-token=${this.requiredToken}
        qr-token=${this.qrToken}
        image-success=${this.imageSuccess}
        image-error=${this.imageError}
        country-gt=${this.countryGt}
        phone-number=${this.phoneNumber}
        encrypted-nip=${this.encryptedNip}
        recovery-type=${this.recoveryType}
        ?reset-content=${this.resetContent}
        ?known-phone-number=${this.knownPhoneNumber}
        customers-api-version=${this.customersApiVersion}
        ?input-phone-number-full=${this._isInputPhoneNumberFull}
        qr-card-number=${this.qrCardNumber}>
      </content-card-data>
    `}_bbvaFooterCotent(){return c`
      <div ?hidden=${this.recoveryType===Kr}>
        <bbva-divider-default
          size="small">
        </bbva-divider-default>
        <bbva-text
          aria-disabled="true"
          tabindex="-1"
          text="${this.t("bbva-feature-access-key-recovery-content-identification-footer-text")}"
          size="XS"
          alignment="center"
          font-style="italic">
        </bbva-text>
        <bbva-button-default
          text="${this.t("bbva-feature-access-key-recovery-button-continue")}"
          @click=${this._handleContentIdentificationStep}
          ?disabled=${!this._enableBtnDefault}>
        </bbva-button-default>
      </div>
    `}_bbvaDataManager(){return c`
      <data-manager
        host=${this.host}
        host-granting-ticket=${this.hostGrantingTicket}
        ?native=${this.native}
        country-gt=${this.countryGt}
        card-number=${this.cardNumber}
        mobile-phone=${this.phoneNumber}
        recovery-type=${this.recoveryType}
        requiredToken=${this.requiredToken}
        customers-api-version=${this.customersApiVersion}
        image-success=${this.imageSuccess}
        image-error=${this.imageError}
        @akr-invalid-card=${()=>{this.resetContent=!0}}
        @akr-invalid-card-right-primary-icon=${()=>{this.resetContent=!0}}
        @akr-card-not-associated=${()=>{this.resetContent=!0}}
        @akr-card-not-associated-right-primary-icon=${()=>{this.resetContent=!0}}
        @akr-use-physical-card-right-primary-icon=${()=>{this.resetContent=!0}}
        @akr-use-physical-card=${()=>{this.resetContent=!0}}>
      </data-manager>    
    `}render(){return c`
      ${this._bbvaListSimplePhoneNumber()}
      ${this._bbvaDescription()}
      ${this._bbvaFormInputPhoneNumber()}
      ${this._bbvaFormInputCardNumber()}
      ${this._bbvaContentQrCode()}
      ${this._bbvaFooterCotent()}
      ${this._bbvaDataManager()}
  
      <akr-modal></akr-modal>      
    `}}var po=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-list-simple] {
  padding: 0 0 1rem 0;
  --_list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class uo extends($t(ae(f(i)))){static get is(){return"summary-card-data"}static get scopedElements(){const e=[zi,...uo.configurationScopedElements()];return uo.scopedElementsFromClasses(e)}static get properties(){return{_maskChar:{type:String}}}static get styles(){return[po,l("summary-card-data-styles")]}constructor(){super(),this._maskChar="•"}_bbvaListSimpleCvvNumber(){return c`
      <bbva-list-simple
        action-accessibility-text="maskCvv"
        mask=${this._maskChar}
        label="${this.t("bbva-feature-access-key-recovery-content-card-data-label-cvv")}"
        mask-chars=${this._maskChar.repeat(3)}
        visible-chars="0"
        description-medium>
      </bbva-list-simple>
    `}_bbvaListSimpleNipNumber(){return c`
      <bbva-list-simple
        action-accessibility-text="maskNip"
        mask=${this._maskChar}
        label="${this.t("bbva-feature-access-key-recovery-content-card-data-label-nip")}"
        mask-chars=${this._maskChar.repeat(4)}
        visible-chars="0"
        description-medium>
      </bbva-list-simple>
    `}render(){return c`
      ${this._bbvaListSimpleCvvNumber()}
      ${this._bbvaListSimpleNipNumber()}
    `}}var mo=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-list-simple] {
  padding: 0 0 1rem 0;
  --_list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class vo extends($t(ae(f(i)))){static get is(){return"summary-customer-data"}static get scopedElements(){const e=[zi,...vo.configurationScopedElements()];return vo.scopedElementsFromClasses(e)}static get properties(){return{birthDate:{type:String,attribute:"birth-date"}}}static get styles(){return[mo,l("summary-customer-data-styles")]}constructor(){super(),this.birthDate=""}render(){return c`
      <bbva-list-simple
        action-accessibility-text="birthDate"
        class="inline"
        label="${this.t("bbva-feature-access-key-recovery-content-card-data-input-date")}"        
        description=${this.birthDate}
        description-medium>
      </bbva-list-simple>
    `}}var go=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

.summary-recovery [data-tag-name=bbva-list-simple] {
  padding: 0 0 1rem 0;
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class yo extends($t(ae(f(i)))){static get is(){return"summary-recovery-type"}static get scopedElements(){const e=[zi,...yo.configurationScopedElements()];return yo.scopedElementsFromClasses(e)}static get properties(){return{recoveryType:{type:String,attribute:"recovery-type"}}}static get styles(){return[go,l("summary-recovery-type-styles")]}constructor(){super(),this.recoveryType=""}_getDescription(e){return{card:this.t("bbva-feature-access-key-recovery-card-method"),qrCode:this.t("bbva-feature-access-key-recovery-qr-code-method")}[e]||""}render(){return c`
      <div class="summary-recovery">
        <bbva-list-simple
          action-accessibility-text="simplerecoveryType"
          class="inline"
          label="${this.t("bbva-feature-access-key-recovery-method")}"        
          description=${this._getDescription(this.recoveryType)}
          description-medium>
        </bbva-list-simple>
      </div>
    `}}var fo=e`
:host {
  display: block;
  box-sizing: border-box;
  grid-template-rows: auto 1fr auto;
  height: 50vh;
  --bbva-access-key-recovery-radio-button-subtitle: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-text] {
  color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  padding-left: 0;
  position: relative;
  top: 1rem;
  font-family: unset;
}

:host [slot=content] {
  grid-row: 1;
  overflow-y: auto;
  padding: 1rem;
  margin: 0;
}

:host [slot=confirmation] {
  grid-row: 2;
  width: 100%;
  padding: 1rem;
  margin: 0;
  background-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class _o extends($t(ae(f(i)))){static get is(){return"summary-reset-password"}static get scopedElements(){const e=[$,..._o.configurationScopedElements()];return _o.scopedElementsFromClasses(e)}static get properties(){return{size:{type:Number},_maskChar:{type:String}}}static get styles(){return[fo,l("summary-reset-password-styles")]}constructor(){super(),this.size=0,this._maskChar="•"}_bbvaMaskPassword(){return c`
      <bbva-text
        aria-disabled="true"
        tabindex="-1"
        size="M"
        text="${this._maskChar.repeat(this.size)}"
        class="list-simple-pass">
      </bbva-text>   
    `}render(){return c`
      ${this._bbvaMaskPassword()}
    `}}var $o=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-access-key-recovery-radio-button-subtitle: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-list-simple] {
  padding: 0 0 1rem 0;
  --_list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ko extends($t(ae(f(i)))){static get is(){return"summary-identification"}static get scopedElements(){const e=[zi,...ko.configurationScopedElements()];return ko.scopedElementsFromClasses(e)}static get properties(){return{phoneNumber:{type:String,attribute:"phone-number"},cardNumber:{type:String,attribute:"card-number"},recoveryType:{type:String,attribute:"recovery-type"},_maskChar:{type:String}}}static get styles(){return[$o,l("summary-identification-styles")]}constructor(){super(),this._maskChar="•",this.cardNumber="",this.phoneNumber="",this.recoveryType=""}_bbvaListSimplePhoneNumber(){return c`
      <bbva-list-simple
        action-accessibility-text="simplePhoneNumber"
        mask=${this.phoneNumber}
        label="${this.t("bbva-feature-access-key-recovery-content-identification-optional-label-phone-number")}"
        mask-chars=${this.recoveryType===Kr?this._maskChar:""}
        visible-chars=${this.recoveryType===Kr?5:10}
        description-medium>
      </bbva-list-simple>
    `}_bbvaListSimpleCardNumber(){return c`
      <bbva-list-simple
        action-accessibility-text="simpleCardNumber"
        mask=${this.cardNumber}
        label="${this.t("bbva-feature-access-key-recovery-content-identification-label-card-number")}"
        mask-chars=${this.recoveryType===Kr?this._maskChar:""}
        visible-chars=${this.recoveryType===Kr?4:16}
        description-medium>
      </bbva-list-simple>
    `}_bbvaListSimpleNipNumber(){return c`
      <bbva-list-simple
        action-accessibility-text="simpleNipNumber"
        mask=${this._maskChar}
        label="${this.t("bbva-feature-access-key-recovery-content-card-data-label-nip")}"
        ?hidden=${this.recoveryType===Yr}
        mask-chars=${this._maskChar.repeat(4)}
        visible-chars= "0"
        description-medium>
      </bbva-list-simple>
    `}render(){return c`
      ${this._bbvaListSimplePhoneNumber()}
      ${this._bbvaListSimpleCardNumber()}
      ${this._bbvaListSimpleNipNumber()}
    `}}var So=e`:host {
  height: auto;
  max-height: 100vh;
  overflow-y: auto;
  overscroll-behavior: none;
  display: block;
  box-sizing: border-box;
  --_subtitle-color: var(
    var(--bbva-access-key-recovery-radio-button-subtitle, var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)}))
  );
}
:host [data-tag-name=bbva-expandable-step] {
  --_expandable-step-prefilled-bg-color: var(--colorsPrimaryCore, ${h(m.primaryCore)});
  height: auto !important;
  min-height: auto !important;
}
:host [data-tag-name=bbva-panel-button] {
  width: 100%;
  padding: 0;
  background-color: var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

:host([clip-path-guillotine]) [data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step]:first-child {
  clip-path: polygon(0 0, 100% 0, 100% 90%, 0% 100%);
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class xo extends($t(ae(f(i)))){static get is(){return"expandable-multistep"}static get scopedElements(){const e=[ao,io,_t,ze,He,oo,ba,no,co,bo,uo,vo,yo,_o,ko,...xo.configurationScopedElements()];return xo.scopedElementsFromClasses(e)}static get properties(){return{host:{type:String},hostGrantingTicket:{type:String,attribute:"host-granting-ticket"},countryGt:{type:String,attribute:"country-gt"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},qrToken:{type:String,attribute:"qr-token"},customersApiVersion:{type:String,attribute:"customers-api-version"},identitiesApiVersion:{type:String,attribute:"identities-api-version"},cardNumber:{type:String,attribute:"card-number"},phoneNumber:{type:String,attribute:"phone-number"},knownPhoneNumber:{type:Boolean,attribute:"known-phone-number"},recoveryType:{type:String,attribute:"recovery-type"},encryptedCvv:{type:String,attribute:"encrypted-cvv"},encryptedNip:{type:String,attribute:"encrypted-nip"},clipPathGuillotine:{type:Boolean,attribute:"clip-path-guillotine",reflect:!0},resetContent:{type:Boolean,attribute:"reset-content"},dateInput:{type:String},isNativeIos:{type:Boolean},environment:{type:String},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},imageError:{type:String,attribute:"image-error"},isMultiestepFinished:{type:Boolean},isStepComplete:{type:Boolean},qrCardNumber:{type:String,attribute:"qr-card-number"},imageSuccess:{type:String,attribute:"image-success"},_passLength:{type:Number},_editTtitle:{type:String},_panelButton:{type:Object},_akrModal:{type:Object},_dataManager:{type:Object},_password:{type:String},_typeCard:{type:String},_date:{type:String},flagAkrQr:{type:Boolean,attribute:"flag-akr-qr"}}}static get styles(){return[So,l("expandable-multistep-shared-styles")]}constructor(){super(),this.host="",this.hostGrantingTicket="",this._typeCard="",this.isMultiestepFinished=!1,this.isStepComplete=!1,this.environment="",this.native=!1,this.qrToken="",this.countryGt="",this.cardNumber="",this.phoneNumber="",this.encryptedCvv="",this.encryptedNip="",this.recoveryType="",this.isNativeIos=!1,this.resetContent=!1,this.requiredToken="",this._date="",this.clipPathGuillotine=!1,this.customersApiVersion="1",this.identitiesApiVersion="",this._akrModal=null,this._password="",this._passLength=0,this._editTtitle=this.t("bbva-feature-access-key-recovery-change-step"),this._panelButton=null,this._dataManager=null,this.imageSuccess="",this.imageError="",this.dateInput="",this.flagAkrQr=!1}firstUpdated(){this._setUpDomElements()}get _expandableMultiStep(){return this._expandableMultiStepElement||(this._expandableMultiStepElement=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')),this._expandableMultiStepElement}updated(e){if(e.has("resetContent")&&this.resetContent){this._expandableMultiStep.querySelectorAll("[data-tag-name=bbva-expandable-step]").forEach((e=>{const t=e;t.classList.contains("recovery-method")||(t.disabled=!t.classList.contains("identification"),t.completed=!1)})),this._typeCard=Zr,this.clipPathGuillotine=!0,this._panelButton.show=!1,this._editTtitle=this.t("bbva-feature-access-key-recovery-change-step"),this._fireEvent("akr-disable-reset")}}_setUpDomElements(){this._akrModal=this.shadowRoot.querySelector('[data-tag-name="akr-modal"]'),this._panelButton=this.shadowRoot.querySelector('[data-tag-name="bbva-panel-button"]'),this._dataManager=this.shadowRoot.querySelector("[data-tag-name=data-manager]")}_goBackPasswordStep(){const e=Array.from(this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')),[t]=e.filter((e=>e.querySelector('[data-tag-name="content-reset-password"]'))),a=this.shadowRoot.querySelector('[data-tag-name="content-reset-password"]');t.completed=!1,a.resetContent=!0,this._panelButton.show=!1}_removeGuillotineShape(){this.clipPathGuillotine=!1}_getFormData({detail:e}){const{id:t}=e,{value:a}=e;"phoneNumber"===t&&(this.phoneNumber=a),"cardNumber"===t&&(this.cardNumber=a),"password"===t&&(this._password=a,this._passLength=this._password.length)}_handleFinishStep(){this._dataManager.makeIdentitiesRequest(),this._fireEvent(`${io.is}-toggle-loanding`)}_fireEvent(e,t=""){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaRecoveryTypeStep(){return c`
      <summary-recovery-type
        slot="summary"
        recovery-type=${this.recoveryType}>
      </summary-recovery-type>
    `}_bbvaIdentificationStep(){return c`
      <content-identification
        class="content"
        host=${this.host}
        host-granting-ticket=${this.hostGrantingTicket}
        ?native=${this.native}
        ?flag-akr-qr=${this.flagAkrQr}
        qr-token=${this.qrToken}
        image-success=${this.imageSuccess}
        ?isNativeIos=${this.isNativeIos}
        .environment=${this.environment}
        image-error=${this.imageError}
        country-gt=${this.countryGt}
        card-number=${this.cardNumber}
        phone-number=${this.phoneNumber}
        recovery-type=${this.recoveryType}
        encrypted-nip=${this.encryptedNip}
        required-token=${this.requiredToken}
        customers-api-version=${this.customersApiVersion}
        ?reset-content=${this.resetContent}
        ?known-phone-number=${this.knownPhoneNumber}
        @akr-close-guillotine=${this._removeGuillotineShape}
        @akr-share-card-number=${this._getFormData}
        @akr-share-phone-number=${this._getFormData}
        @akr-card-virtual =${()=>{this._typeCard=eo}}
        @akr-card-fisica=${()=>{this._typeCard=Zr}}
        qr-card-number=${this.qrCardNumber}>
      </content-identification>
      <summary-identification
        slot="summary"
        card-number=${this.recoveryType===Kr?this.qrCardNumber:this.cardNumber}
        phone-number=${this.phoneNumber}
        recovery-type=${this.recoveryType}>
      </summary-identification>
    `}_bbvaCardDataStep(){return c`
      <content-card-data
        class="content"
        host=${this.host}
        host-granting-ticket=${this.hostGrantingTicket}
        ?native=${this.native}
        image-success=${this.imageSuccess}
        ?isNativeIos=${this.isNativeIos}
        .environment=${this.environment}
        image-error=${this.imageError}
        country-gt=${this.countryGt}
        card-number=${this.cardNumber}
        phone-number=${this.phoneNumber}
        recovery-type=${this.recoveryType}
        encrypted-cvv=${this.encryptedCvv}
        encrypted-nip=${this.encryptedNip}
        ?reset-content=${this.resetContent}
        required-token=${this.requiredToken}
        customers-api-version=${this.customersApiVersion}
        ?known-phone-number=${this.knownPhoneNumber}>
      </content-card-data>
      <summary-card-data
        slot="summary">
      </summary-card-data>
    `}_bbvaCustomerDataStep(){return c`
      <content-customer-data
        host=${this.host}
        host-granting-ticket=${this.hostGrantingTicket}
        ?native=${this.native}
        .date=${this.dateInput}
        image-success=${this.imageSuccess}
        image-error=${this.imageError}
        country-gt=${this.countryGt}
        phone-number=${this.phoneNumber}
        card-number=${this.cardNumber}
        requiredToken=${this.requiredToken}
        ?reset-content=${this.resetContent}
        recovery-type=${this.recoveryType}
        customers-api-version=${this.customersApiVersion}
        @akr-date=${e=>{this._date=e.detail}}
        >
      </content-customer-data>
      <summary-customer-data
        slot="summary"
        birth-date=${this._date}>
      </summary-customer-data>
    `}get _bbvaResetPasswordStep(){return c`
      <content-reset-password
        class="content"
        recovery-type=${this.recoveryType}
        ?reset-content=${this.resetContent}
        ?known-phone-number=${this.knownPhoneNumber}
        @akr-share-pass-length=${this._getFormData}
        @akr-active-panel-button-fixed=${()=>{this._panelButton.show=!0}}>
      </content-reset-password>
      <summary-reset-password
        slot="summary"
        size=${this._passLength}>
      </summary-reset-password>
    `}_bbvaDataManager(){return c`
      <data-manager
        host=${this.host}
        host-granting-ticket=${this.hostGrantingTicket}
        ?native=${this.native}
        ?flag-akr-qr=${this.flagAkrQr}
        requiredToken=${this.requiredToken}
        mobile-phone=${this.phoneNumber}
        password=${this._password}
        phone-number-bbva-line=${this.phoneNumberBbvaLine}
        image-success=${this.imageSuccess}
        image-error=${this.imageError}
        customers-api-version=${this.customersApiVersion}
        @akr-password-has-already-been-used=${this._goBackPasswordStep}>
      </data-manager>
    `}_bbvaAkrModal(){return c`
      <akr-modal
        image-success=${this.imageSuccess}
        image-error=${this.imageError}
        @akr-password-has-already-been-used=${()=>{this.resetContent=!0}}>
      </akr-modal>`}_isMultistepComplete(e){this.isMultiestepFinished=e.detail,this._fireEvent("akr-multi-step-all-complete",this.isMultiestepFinished)}_isStepComplete(e){this.isStepComplete=e.detail,this._fireEvent("akr-step-complete",this.isStepComplete)}render(){return c`
      <bbva-header-main
        text= "${this.t("bbva-feature-access-key-recovery-header-reset-password")}"
        variant="modal"
        icon-right-primary="bbva:close"
        accessibility-text-icon-right-primary="Return"
        @header-main-icon-right-primary-click=${()=>{this._fireEvent("akr-leave-the-process")}}>
      </bbva-header-main>
      <bbva-expandable-multistep step-selector="[data-tag-name='bbva-expandable-step']" has-confirm-animation
      @expandable-multistep-all-complete=${this._isMultistepComplete}
      @expandable-step-complete-change=${this._isStepComplete}>
        <div slot="content">
          <bbva-expandable-step
            class="recovery-method"
            header= "${this.t("bbva-feature-access-key-recovery-header-recovery-method")}"
            completed
            prefilled
            view-label=${this._editTtitle}
            disabled-target=".action"
            @expandable-step-view-step=${()=>{this._fireEvent("akr-change-recovery-method")}}>
            ${this._bbvaRecoveryTypeStep()}
          </bbva-expandable-step>

          <bbva-expandable-step
            class="identification"
            header= "${this.t("bbva-feature-access-key-recovery-header-identify")}"
            edit-label=""
            hide-step-number
            @complete=${()=>{this._editTtitle=""}}
            disabled-target=".action">
            ${this._bbvaIdentificationStep()}
          </bbva-expandable-step>

          ${this.recoveryType!==Kr?c`<bbva-expandable-step
            class="card-data"
            header= "${this._typeCard===Zr?this.t("bbva-feature-access-key-recovery-header-card-data"):this.t("bbva-feature-access-key-recovery-header-customer-data")}"   
            edit-label=""
            hide-step-number
            disabled-target=".action">
            ${this._typeCard===eo?this._bbvaCustomerDataStep():this._bbvaCardDataStep()}
          </bbva-expandable-step>`:V}

          <bbva-expandable-step
            header="${this.t("bbva-feature-access-key-recovery-header-new-password")}"
            edit-label="${this.t("bbva-feature-access-key-recovery-change-step")}"
            hide-step-number
            disabled-target=".action"
            @expandable-step-edit-step=${()=>{this._panelButton.show=!1}}>
            ${this._bbvaResetPasswordStep}
          </bbva-expandable-step>
        </div>
        <bbva-panel-button
          slot="confirmation"
          show
          button-text="${this.t("bbva-feature-access-key-recovery-button-continue")}"
          button-variant="primary"
          @panel-button-item-click="${this._handleFinishStep}">
        </bbva-panel-button>
      </bbva-expandable-multistep>
      ${this._bbvaDataManager()}
      ${this._bbvaAkrModal()}
    `}}var Co=e`
:host {
  display: block;
  box-sizing: border-box;
  height: 1px;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}

*, *:before, *:after {
  box-sizing: inherit;
}

:host > [data-tag-name=bbva-transition-container] {
  z-index: 1;
}
`;class To extends(f(ae($t(i)))){static get is(){return"bbva-feature-access-key-recovery"}static get styles(){return[Co,l("bbva-feature-access-key-recovery-shared-styles")]}static get scopedElements(){const e=[ia,xo,_t,Ge,ao,...To.configurationScopedElements()];return To.scopedElementsFromClasses(e)}static get properties(){return{host:{type:String},hostGrantingTicket:{type:String},countryGt:{type:String},native:{type:Boolean},requiredToken:{type:String},customersApiVersion:{type:String,attribute:"customers-api-version"},identitiesOperationApiVersion:{type:String,attribute:"identities-operation-api-version"},phoneNumber:{type:String,attribute:"phone-number"},phoneNumberBbvaLine:{type:String,attribute:"phone-number-bbva-line"},resetAccessKeyRecovery:{type:Boolean},isNativeIos:{type:Boolean},environment:{type:String},localStorageKey:{type:String},recoveryMethodsName:{type:String,attribute:"recovery-methods-name"},isMultiestepFinished:{type:Boolean},isStepComplete:{type:Boolean},recoveryMethods:{type:Array},imageSuccess:{type:String,attribute:"image-success"},imageError:{type:String,attribute:"image-error"},imageSecurity:{type:String,attribute:"image-security"},_cardNumber:{type:String},_isPhoneNumberKnown:{type:Boolean},_recoveryType:{type:String},_qrToken:{type:String},_encryptedCvv:{type:String},_encryptedNip:{type:String},_resetRadioButtons:{type:Boolean},_openQrCodeTransition:{type:Boolean},_openCardTransition:{type:Boolean},_formInputNipStatus:{type:Boolean},_formInputCvvStatus:{type:Boolean},_qrCardNumber:{type:String,attribute:"qr-card-number"},_akrModalElement:{type:Object},_isLoanding:{type:Boolean},_date:{type:String},featureFlagCollection:{type:Object},flagAkrQr:{type:Boolean,attribute:"flag-akr-qr"}}}constructor(){super(),this.host="",this.hostGrantingTicket="",this.native=!1,this._isLoanding=!1,this.config={loader:!0},this.localStorageKey="",this.environment="",this.countryGt="mx",this.phoneNumber="",this.requiredToken="tsec",this.customersApiVersion="1",this.resetAccessKeyRecovery=!1,this.identitiesOperationApiVersion="0",this._qrToken="",this._cardNumber="",this._qrCardNumber="",this._encryptedCvv="",this._encryptedNip="",this._recoveryType="",this._resetRadioButtons=!1,this._isPhoneNumberKnown=!1,this._openCardTransition=!1,this._openQrCodeTransition=!1,this._formInputCvvStatus=!1,this._formInputNipStatus=!1,this.imageSuccess="",this.imageError="",this.imageSecurity="",this.recoveryMethodsName="recovery-option",this.recoveryMethods=[{value:Kr,label:"bbva-feature-access-key-recovery-qr-code-method",description:"bbva-feature-access-key-recovery-qr-code-description"},{value:Yr,label:"bbva-feature-access-key-recovery-card-method",description:"bbva-feature-access-key-recovery-card-description"}],this._attempts=0,this.isMultiestepFinished=!1,this.isStepComplete=!1,this.isNativeIos=!1,this._date="",this.featureFlagCollection={},this.flagAkrQr=!1}get _akrModal(){return this._akrModalElement||(this._akrModalElement=this.shadowRoot.querySelector('[data-tag-name="akr-modal"]')),this._akrModalElement}updated(e){var t;(e.has("_resetRadioButtons")&&(this._resetRadioButtons=!1),e.has("phoneNumber")&&this.phoneNumber&&(this._isPhoneNumberKnown=!0),e.has("_isLoanding")&&(this._isLoanding?this.showLoader():this.clearLoader()),e.has("featureFlagCollection")&&Object.keys(this.featureFlagCollection).length)&&(this.flagAkrQr=null===(t=this.featureFlagCollection["glomo.securityJourneys.akrQrAC154"])||void 0===t?void 0:t.value)}initFlow(){this._changeRecoveryMethod(),this._dispatchCustomEvent(`${To.is}-request-phone-number`,{key:this.localStorageKey,secure:!1})}getLocalStorageKeySucces(e){this.phoneNumber=e}_toggleLoanding(){this._isLoanding=!this._isLoanding}_setUpRecoveryTransition({detail:e}){this._recoveryType=e.status,this._openCardTransition=this._recoveryType===Yr||!1,this._openQrCodeTransition=this._recoveryType===Kr||!1}_backToLogin(){this._fireEvent("bbva-access-key-recovery-go-back")}leaveTheProcess(){this._openCardTransition&&this._openQrCodeTransition||(this._backToLogin(),this._changeRecoveryMethod())}sureLeaveTheProcess(){(this._openCardTransition||this._openQrCodeTransition)&&(this.isStepComplete||this.isMultiestepFinished?this._akrModal.open("leaveTheProcess"):this.leaveTheProcess())}onSignOtpCanceled(){this._isLoanding=!1,this._recoveryType===Yr&&(this._openCardTransition=!0),this._recoveryType===Kr&&(this._openQrCodeTransition=!0)}_changeRecoveryMethod(){this._recoveryType="",this._isLoanding=!1,this._openCardTransition=!1,this.isMultiestepFinished=!1,this.isStepComplete=!1,this._openQrCodeTransition=!1,this._resetRadioButtons=!0,this.resetAccessKeyRecovery=!0,this._qrCardNumber="",this._attempts=0,this.requestUpdate()}_resetQrCardNumber(){this._qrCardNumber=""}_scanQrCode(){this._fireEvent("bbva-access-key-recovery-scan-qr-code")}ocrCardParams(){const e={guideColor:this.guideColorOcr,suppressConfirmation:!0};this._fireEvent("bbva-build-params-ocr-card",e)}getOcrCardData(e){const t=(null==e?void 0:e.cardNumber)??"";this._cardNumber=t}setDate(e){this._date=null==e?void 0:e.selectedDate}qrCodeScannerSuccess(e={content:""}){const t=e.content,a=/^(https:\/\/bbva.mx\/qr-cards)/.test(t),[,i]=t.split(/data=|&/);a?(this._qrCardNumber=t.substr(-4),this._qrToken=i):this._akrModal.open("invalidQrCode")}_setFormInputStatus({detail:e}){"CVV"===e.key&&(this._formInputCvvStatus=e.status),"NIP"===e.key&&(this._formInputNipStatus=e.status),this.requestUpdate()}async getEncryptData(e){await this.updateComplete,this._formInputCvvStatus&&(this._encryptedCvv=e,this._formInputCvvStatus=!1),this._formInputNipStatus&&(this._encryptedNip=e,this._formInputNipStatus=!1)}_grantingTicketError(){this._isLoanding=!1,this._attempts<3?this._akrModal.open("firstTwoAttemptsInformation"):this._akrModal.open("thirdAttemptInformation"),this._attempts+=1}_fireEvent(e,t=""){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_hiddeTransitionals(e){const t=e.detail;this._recoveryType===Yr&&(this._openCardTransition=t),this._recoveryType===Kr&&(this._openQrCodeTransition=t)}_handleNativeKeyBoard(){const e=moment().local().format("YYYY-MM-DD");this._fireEvent("bbva-access-key-recovery-launch-date-picker",{dateFormat:"yyyy-MM-dd",defaultDate:e,maxDate:e})}_bbvaExpandableMultiStep(e){return c`
        <expandable-multistep
          slot="slot-content"
          host=${this.host}
          host-granting-ticket=${this.hostGrantingTicket}
          ?isNativeIos=${this.isNativeIos}
          ?flag-akr-qr=${this.flagAkrQr} 
          .dateInput=${this._date}
          .environment=${this.environment}
          ?native=${this.native}
          qr-token=${this._qrToken}
          country-gt=${this.countryGt}
          image-success=${this.imageSuccess}
          image-error=${this.imageError}
          card-number=${this._cardNumber}
          phone-number=${this.phoneNumber}
          encrypted-cvv=${this._encryptedCvv}
          encrypted-nip=${this._encryptedNip}
          recovery-type=${e}
          required-token=${this.requiredToken}
          customers-api-version=${this.customersApiVersion}
          identities-api-version=${this.identitiesOperationApiVersion}
          phone-number-bbva-line=${this.phoneNumberBbvaLine}
          ?reset-content=${this.resetAccessKeyRecovery}
          ?known-phone-number=${this._isPhoneNumberKnown}
          clip-path-guillotine
          @akr-disable-reset=${()=>{this.resetAccessKeyRecovery=!1}}
          @akr-invalid-qr-code=${this._scanQrCode}
          @akr-leave-the-process=${this.sureLeaveTheProcess}
          @open-modal-change-recovery-method=${()=>{this._akrModal.open("changeRecoveryMethod")}}
          @akr-multi-step-all-complete=${({detail:e})=>{this.isMultiestepFinished=e}}
          @akr-step-complete=${({detail:e})=>{this.isStepComplete=e}}
          @akr-reset-qr-card-number=${this._resetQrCardNumber}
          @akr-third-attempt-information=${this.leaveTheProcess}
          @akr-third-attempt-information-right-primary-icon=${this.leaveTheProcess}
          @data-manager-granting-ticket-error=${this._grantingTicketError}
          @data-manager-toggle-loanding=${this._toggleLoanding}
          @data-manager-show-transitional=${this._hiddeTransitionals}
          @content-customer-data-request-native-date=${this._handleNativeKeyBoard}
          @_bbva-input-cvv-completed=${e=>{this._setFormInputStatus(e)}}
          @_bbva-input-nip-completed=${e=>{this._setFormInputStatus(e)}}
          @akr-has-to-register-again-footer-link=${this.leaveTheProcess}
          @akr-has-to-register-again-right-primary-icon=${this.leaveTheProcess}
          @akr-change-recovery-method=${this._changeRecoveryMethod}
          @akr-success-reset-password=${this.leaveTheProcess}
          @akr-success-reset-password-right-primary-icon=${this.leaveTheProcess}
          qr-card-number=${this._qrCardNumber}>
        </expandable-multistep>
      `}render(){return c`
      ${super.render()}
      <recovery-method-type
        id="viewRecoveryMethodType"
        recovery-methods-name=${this.recoveryMethodsName}
        .recoveryMethods=${this.recoveryMethods}
        ?reset-radio-buttons=${this._resetRadioButtons}
        @akr-radio-button-pressed=${this._setUpRecoveryTransition}
        @recovery-method-type-header-back=${this.leaveTheProcess}
        image-security=${this.imageSecurity}>
      </recovery-method-type>

      <bbva-transition-container
        id="qrCardTransitional"
        ?visible=${this._openQrCodeTransition}
        hide-return-icon
        reverse-animation>
        ${this._bbvaExpandableMultiStep(Kr)}
      </bbva-transition-container>

      <bbva-transition-container
        id="cardTransitional"
        ?visible=${this._openCardTransition}
        hide-return-icon>
        ${this._bbvaExpandableMultiStep(Yr)}
      </bbva-transition-container>
      <akr-modal
        image-success=${this.imageSuccess}
        image-error=${this.imageError}
        phone-number-bbva-line=${this.phoneNumberBbvaLine}
        @akr-leave-the-process=${this.leaveTheProcess}
        @akr-third-attempt-information=${this.leaveTheProcess}
        @akr-third-attempt-information-right-primary-icon=${this.leaveTheProcess}>
      </akr-modal>
     <data-manager
      @data-manager-granting-ticket-error=${this._grantingTicketError}
      ?flag-akr-qr=${this.flagAkrQr}>
     </data-manager>
    `}}class wo extends To{static get is(){return"bbva-feature-access-key-recovery-mx"}static get properties(){return{}}}customElements.define(wo.is,wo);class Io extends(tt(i)){static get is(){return"bbva-nativeconnector-ocr-card"}static get properties(){return{pluginName:{type:String}}}constructor(){super(),this.pluginName="OcrCard"}canScan(){return this._genericCall(this.pluginName,"canscan","card-ocr-is-capable")}scan(e){return this._genericCall(this.pluginName,"scan","card-ocr-scanned",e)}}customElements.define(Io.is,Io);
