import{z as t,ar as e,a as i,L as r,y as a,ah as o,aN as n,ai as s,ak as c,h as d,i as l,a8 as h,ac as m,a9 as p,ap as b,an as u,ag as g,F as v,b$ as f,bx as x,b1 as y,c0 as _,f as E,g as $,H as w,aX as C,v as S,u as k,cI as T,cJ as O,aD as L,b3 as I,bU as R,aL as N,bF as M,cH as B,di as q}from"./952f98a9.js";import{B as P}from"./cd8b2d96.js";import{g as z,ba as V}from"./7f3d7ca9.js";import"./bfb6d64c.js";import"./216055dc.js";import"./1201cfdf.js";import"./c0a2f832.js";import"./cae0f1de.js";var H=t`:host {
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
${(new e).mediaRules()}`;class j extends(i(r)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":a}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:o(),warning:o(),error:n(),success:s()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:r=this.duration}={}){const a=i;this._stack.push({type:a,description:t,simpleLinkText:e,duration:r}),this._showNextInStack()}static get styles(){return[H,c("bbva-notification-container-shared-styles")]}render(){return d`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${l(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${l(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var D=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${h(p.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(p.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${h(p.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${h(p.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${h(p.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(p.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${h(p.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${h(m.typeMedium)}));
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
`;class F extends(i(b(u(r)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":g,"bbva-icon":v,"bbva-badge-notification":f}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,r=Math.max(e,i);return r in t?t[r]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[D,c("bbva-header-main-shared-styles"),x("button:focus"),y.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return d`<bbva-icon icon="${l(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return d`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,r){const a=F.toCamelCase(t),o=`icon${a}`,n=`accessibilityTextIcon${a}`;return d`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${l(this.t(this[n]))}"
      aria-expanded=${l(r)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return d` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${l(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return d`
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:r,_hasMicroillustration:a}=this;return d`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(a||r)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${l(r)}" alt="" ?hidden="${!r}" id="image" aria-hidden="true" />

          <span
            class="${a}"
            ?hidden="${!a}"
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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}$("colors.primaryCoreLightened"),$("colors.cool80"),$("colors.cool70"),$("colors.primaryCoreLightened"),$("colors.cool100"),$("colors.tertiaryType6Darkened"),$("colors.tertiaryType4Darkened"),$("colors.secondary300");const A=w((t=>class extends(C(t)){static configurationScopedElements(){return[j,S,F,k]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),d`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||T();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&O()||this.config.faqs&&L())}_dispatchCustomEvent(t,e=!0,i=!0,r=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:r,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const r={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",r)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,r){const a={description:t,simpleLinkText:e,type:i,duration:r};this._dispatchCustomEvent("show-notification",a)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return d`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,r;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(r=this.config)||void 0===r?void 0:r.header}}}render(){const t=this._getElements();return d`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));customElements.define(F.is,F);var U=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.microillustration {
  display: flex;
  justify-content: center;
  padding: 1rem 0;
}

#bbvaTextShort {
  display: flex;
  justify-content: center;
  padding-bottom: 0.5rem;
}

#bbvaTextLarge {
  display: flex;
  justify-content: center;
  text-align: center;
  padding-bottom: 1.5rem;
  margin-left: 1rem;
  margin-right: 1rem;
}

bbva-button-default {
  width: 11.625rem;
  height: 3rem;
}

.examples {
  padding-top: 17.8125rem;
  display: flex;
  flex-direction: column;
  align-items: center;
}
`;class X extends(i(A(I(u(r))))){static get is(){return"bbva-widget-user-transaction-amount-confirmation-max-limit"}static get scopedElements(){const t=[R,N,g,F,...X.configurationScopedElements()];return X.scopedElementsFromClasses(t)}static get styles(){return[U,c("bbva-widget-user-transaction-amount-shared-styles")]}_backPage(){this._resetFlow(),this._dispatchCustomEvent("bbva-widget-user-transaction-amount-confirmation-max-limit-continue-button-resend-transaction")}_resetFlow(){this._dispatchCustomEvent("bbva-widget-user-transaction-amount-confirmation-max-limit-reset-flow",!0,!1,!1)}get _tplHeader(){return d`
    <bbva-header-main
      variant="modal-three-level"
      accessibility-text-icon-right-primary="${this.t("bbva-widget-transaction-amount-icon-right-close")}"
      icon-right-primary="${M()}"
      @header-main-icon-right-primary-click="${this._backPage}"
      text="${this.t("bbva-widget-transaction-amount-text-confirmation")}"
    ></bbva-header-main>
    `}get _renderConfirmationInfo(){return d`
      <div class="microillustration"><bbva-clip-microillustration  microillustration="success" size="L"></bbva-clip-microillustration></div>
      <bbva-text id="bbvaTextShort" font-weight="500" inherit size="L" text="${this.t("bbva-widget-transaction-amount-text-authorized-import")}"></bbva-text>
      <bbva-text id="bbvaTextLarge" inherit text="${this.t("bbva-widget-transaction-amount-text-authorized-highest-import")}"></bbva-text>
      <div class="examples"><bbva-button-default variant="primary" @click="${this._backPage}" text="${this.t("bbva-widget-transaction-amount-text-continue")}"></bbva-button-default></div>
    `}render(){return d`
      ${super.render()}
      ${this._tplHeader}
      ${this._renderConfirmationInfo}
    `}}var Q=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content-container {
  text-align: center;
  margin: 1rem 1rem 3rem 1rem;
}

.buttons-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.buttons-container [data-tag-name=bbva-button-default] {
  width: 11.25rem;
  display: block;
  margin-bottom: 0.9375rem;
}
`;const W={title:"bbva-widget-transaction-amount-title-error-retry",descriptionText:"bbva-widget-transaction-amount-description-error-retry",buttonText:"bbva-widget-transaction-amount-button-error-retry"},Y={title:"bbva-widget-transaction-amount-title-error-otp-invalid",descriptionText:"bbva-widget-transaction-amount-description-error-otp-invalid",buttonText:"bbva-widget-transaction-amount-button-error-otp-invalid"},J={makePayment:!1,cancelPayment:!0},G={createOtp:"createOtp",confirmOtp:"confirmOtp"},K="limitExceeded",Z={limitExceeded:"createOtp",confirmException:["createOtp","confirmOtp"],action:{button:"button",veil:"veil"}},tt=[{createOtp:{otpDetail:{expirationTime:"TS02",length:"8"}}},{confirmOtp:{otpDetail:{id:null},indicator:"CONFIRM"}}],et=["QYENUMB","QYENB11"];class it extends(i(A(I(u(r))))){static get is(){return"bbva-widget-user-transaction-amount-limit-exceeded"}static get scopedElements(){const t=[F,N,g,R,...it.configurationScopedElements()];return it.scopedElementsFromClasses(t)}static get properties(){return{isButtonDisabled:{type:Boolean}}}constructor(){super(),this.isButtonDisabled=!1}static get styles(){return[Q,c("bbva-widget-user-transaction-amount-limit-exceeded-shared-styles")]}_continueButtonClick(){this._dispatchCustomEvent(`${it.is}-continue-button-click`,"limitExceeded",!1,!1)}_goBack(){this._dispatchCustomEvent(`${it.is}-go-back`,J,!1,!1)}get _tplHeader(){return d`
    <bbva-header-main
      variant="modal-three-level"
      accessibility-text-icon-right-primary="${this.t("bbva-widget-transaction-amount-icon-right-close")}"
      icon-right-primary="${M()}"
      @header-main-icon-right-primary-click="${this._goBack}"
      text="${this.t("bbva-widget-transaction-amount-text-limit-exceeded")}"
    ></bbva-header-main>
    `}get _tplButtons(){return d`
      <div class="buttons-container">
        <bbva-button-default variant="primary" @click="${this._continueButtonClick}" ?disabled="${this.isButtonDisabled}">${this.t("bbva-widget-transaction-amount-text-continue")}</bbva-button-default>
        <bbva-button-default variant="link" text="${this.t("bbva-widget-transaction-amount-text-change-amount")}" @click="${this._goBack}" ?disabled="${this.isButtonDisabled}"></bbva-button-default>
      </div>
    `}get _tplContent(){return d`
      <div class="content-container">
        <bbva-clip-microillustration
          microillustration="speedometerhigh"
          size="M"
        ></bbva-clip-microillustration>
        <bbva-text font-weight="500" size="L" text="${this.t("bbva-widget-transaction-amount-text-amount-greater-limit")}" alignment="center"></bbva-text>
        <bbva-text id="firstParagraph" font-weight="350" size="S"
          text="${this.t("bbva-widget-transaction-amount-first-paragraph-limit-exceeded",{highlight:'<span class="highlight">',endHighlight:"</span>"})}"
          alignment="center"
        ></bbva-text>
        <bbva-text id="secondParagraph" font-weight="350" size="S" text="${this.t("bbva-widget-transaction-amount-second-paragraph-limit-exceeded")}" alignment="center"></bbva-text>
      </div>
    `}render(){return d`
      ${super.render()}
      ${this._tplHeader}
      ${this._tplContent}
      ${this._tplButtons}
    `}}var rt=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content-container {
  text-align: center;
  margin: 1rem 1rem 3rem 1rem;
}
.content-container-request-button {
  margin-bottom: 1rem;
}
.content-container [data-tag-name=bbva-progress-timer] {
  --bbva-progress-timer-padding: 1rem 0;
}

.buttons-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.buttons-container [data-tag-name=bbva-button-default] {
  display: block;
  margin-bottom: 0.9375rem;
}

.header-container {
  background-color: #8E7022;
  background-size: cover;
  max-height: var(--cells-sign-heading-max-height, 13.375rem);
  padding-top: var(--cells-sign-heading-padding-top, 0);
  padding-left: 0;
  margin-left: 0;
}
.header-container-items {
  --bbva-header-main-dark-mode-bg-color-modal-three-level: #8E7022;
  --_color-modal-three-level: #ffffff;
}

.subheader {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 12rem;
  background-color: #8E7022;
}

.timer-text {
  font-size: 0.9375rem;
}
`;class at extends(i(A(I(u(r))))){static get is(){return"bbva-widget-user-transaction-amount-confirm-exception"}static get scopedElements(){const t=[F,N,g,R,z,V,...at.configurationScopedElements()];return at.scopedElementsFromClasses(t)}static get properties(){return{isVisibleConfirmException:{type:Boolean},_isAvailableRequestCode:{type:Boolean,state:!0},codeToConfirm:{type:String},isButtonEnabled:{type:Boolean},_timerComponent:{type:Object,state:!0},_rgxCode:{type:String,state:!0},_maxLengthCode:{type:Number,state:!0},_invalidCode:{type:Boolean,state:!0},_textTimerComponent:{type:String,state:!0},otpTimer:{type:Number,attribute:"otp-timer"},resetValue:{type:Boolean}}}constructor(){super(),this.isVisibleConfirmException=!1,this._isAvailableRequestCode=!1,this.codeToConfirm="",this.isButtonEnabled=!1,this._timerComponent={},this._maxLengthCode=8,this._rgxCode=new RegExp(`^[0-9]{${this._maxLengthCode}}$`),this._textTimerComponent="bbva-widget-transaction-amount-validate-code-minutes",this.otpTimer=12e4,this.resetValue=!1,this._invalidCode=!1}static get styles(){return[rt,c("bbva-widget-user-transaction-amount-confirm-exception-shared-styles")]}updated(t){if(t.has("isVisibleConfirmException")&&this.isVisibleConfirmException&&this._timerComponent.start(),t.has("resetValue")&&!this.resetValue&&(this.isButtonEnabled=!1,this.codeToConfirm=""),t.has("codeToConfirm")){const t=this.codeToConfirm.length===this._maxLengthCode,e=0!==this.codeToConfirm.length;this._invalidCode=t?!this._rgxCode.test(this.codeToConfirm):e,this.isButtonEnabled=t&&this._rgxCode.test(this.codeToConfirm)}}firstUpdated(){this._timerComponent=this.shadowRoot.querySelector('[data-tag-name="bbva-progress-timer"]'),this._timerComponent.off=!0}_onTimerCounterFinish({detail:t}){t&&(this._isAvailableRequestCode=t,this._timerComponentFinished())}_timerComponentFinished(){this._timerComponent.variant="alert",this._timerComponent.timeout=0,this._timerComponent.reset(),this._textTimerComponent="bbva-widget-transaction-amount-expired-code",this._timerComponent.off=!0}_timerComponentNewCode(){this._timerComponent.variant="",this._timerComponent.timeout=this.otpTimer,this._textTimerComponent="bbva-widget-transaction-amount-validate-code-minutes",this._timerComponent.off=!1}_generateCode(){this._dispatchCustomEvent("bbva-widget-user-transaction-amount-confirm-exception-generate-new-otp","confirmException",!1,!1)}_generateNewCode(){this.reset(),this._timerComponentNewCode(),this._generateCode()}_goBack(){this._dispatchCustomEvent("bbva-widget-user-transaction-amount-confirm-exception-close-go-back",J,!1,!1),this.reset()}_continueButtonClick(){this.isButtonEnabled=!1,this._dispatchCustomEvent("bbva-widget-user-transaction-amount-confirm-exception-continue-button-click",this.codeToConfirm,!1,!1)}reset(){this._isAvailableRequestCode=!1,this.codeToConfirm="",this.isButtonEnabled=!1,this._invalidCode=!1,this._timerComponent.variant="",this._timerComponent.timeout=this.otpTimer,this._timerComponent.reset(),this._timerComponent.off=!0,this._dispatchCustomEvent("code-otp-confirm-reset",this.codeToConfirm,!0,!0)}get _tplHeader(){return d`
      <header id="heading">
          <bbva-header-main
            variant="sign"
            accessibility-text-icon-right-primary="Close"
            icon-right-primary="${M()}"
            text="${this.t("bbva-widget-transaction-amount-security-code")}"
            @header-main-icon-right-primary-click="${this._goBack}"
            ></bbva-header-main>
            <div class="subheader">
          <bbva-clip-microillustration
              class="subheader-img"
              microillustration="passwordsms"
              size="XL"
            ></bbva-clip-microillustration>
          </div>
      </header>
    `}get _tplContent(){return d`
      <div class="content-container">
        <bbva-text
          font-weight="500"
          size="S"
          text="${this.t("bbva-widget-transaction-amount-confirmation-code")}"
          alignment="center"></bbva-text>
        <bbva-text
          font-weight="350"
          size="S"
          text="${this.t("bbva-widget-transaction-amount-text-enter-code")}"
          alignment="center"
        ></bbva-text>
        <bbva-progress-timer
          timeout="${this.otpTimer}"
          size="48"
          @progress-timer-counter-finish="${this._onTimerCounterFinish}"
        >
          <span class="timer-text">${this.t(this._textTimerComponent)}</span>
        </bbva-progress-timer>
        <bbva-button-default
          variant="link"
          text="${this.t("bbva-widget-transaction-amount-text-request-new-code")}"
          class="content-container-request-button"
          ?disabled="${!this._isAvailableRequestCode}"
          @click="${this._generateNewCode}"
          ></bbva-button-default>
        <bbva-form-input
          type="text"
          label="${this.t("bbva-widget-transaction-amount-security-code")}"
          info-message="${this.t("bbva-widget-transaction-amount-long-code")}"
          maxlength="${this._maxLengthCode}"
          ?invalid="${this._invalidCode}"
          allowed-pattern="[0-9]"
          value="${l(this.codeToConfirm)}"
          @form-input-value-change="${t=>{this.codeToConfirm=t.detail&&t.detail.value||""}}"
          @form-field-input-clear="${()=>{this.isButtonEnabled=!1}}"
          ></bbva-form-input>
      </div>
    `}get _tplButtons(){return d`
      <div class="buttons-container">
        <bbva-button-default
          variant="primary"
          @click="${this._continueButtonClick}"
          ?disabled="${!this.isButtonEnabled}"
          >${this.t("bbva-widget-transaction-amount-text-confirm")}</bbva-button-default>
      </div>
    `}render(){return d`
      ${super.render()}
      ${this._tplHeader}
      ${this._tplContent}
      ${this._tplButtons}
    `}}var ot=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.error-margin {
  margin-bottom: 1.5rem;
}
`;class nt extends(i(A(I(u(r))))){static get is(){return"bbva-operative-error"}static get scopedElements(){const t=[B,N,g,...nt.configurationScopedElements()];return nt.scopedElementsFromClasses(t)}static get properties(){return{visibleOperativeError:{type:Boolean,attribute:"visible-operative-error",reflect:!0},errorMicroillustration:{type:String}}}constructor(){super(),this.visibleOperativeError=!1,this.errorMicroillustration="error"}static get styles(){return[ot,c("bbva-operative-error-shared-styles")]}_cancelPayment(){this.visibleOperativeError=!1,this._dispatchCustomEvent("bbva-operative-error-cancel-payment",J,!0,!0)}get _modalOperativeError(){return d`
      <bbva-help-modal
        id="operativeErrorModal"
        icon-right-primary="${M()}"
        header-type="modal-three-level"
        header-text="${this.t("bbva-widget-transaction-amount-header-error-operative")}"
        full-height
        button-text="${this.t("bbva-widget-transaction-amount-button-error-operative")}"
        fixed-footer
        hide-content-padding-top
        modal-type="warning"
        ?visible="${this.visibleOperativeError}"
        @help-modal-footer-button-click="${()=>this._cancelPayment()}"
        @help-modal-header-right-primary-click="${()=>this._cancelPayment()}"
        >
          <div slot="slot-content">
            <bbva-clip-microillustration
                microillustration="${this.errorMicroillustration}"
                size="M"
            ></bbva-clip-microillustration>
            <bbva-text
              class="error-margin"
              font-weight="500" size="S"
              text="${this.t("bbva-widget-transaction-amount-subtitle-error-operative")}"
              alignment="center"
            ></bbva-text>
            <bbva-text
              font-weight="300" size="XS"
              text="${this.t("bbva-widget-transaction-amount-description-error-operative")}"
              alignment="center">
            </bbva-text>
          </div>
        </bbva-help-modal>
    `}render(){return d`
      ${super.render()}
      ${this._modalOperativeError}
    `}}var st=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class ct extends(i(A(I(u(r))))){static get is(){return"bbva-half-modal-error"}static get scopedElements(){const t=[B,...ct.configurationScopedElements()];return ct.scopedElementsFromClasses(t)}static get properties(){return{visibleServiceError:{type:Boolean,attribute:"visible-service-error",reflect:!0},visibleOtpError:{type:Boolean,attribute:"visible-otp-error",reflect:!0},_iconTitleHalfModal:{type:String}}}constructor(){super(),this._iconTitleHalfModal=n(),this._resetPropertiesModal()}static get styles(){return[st,c("half-modal-errors")]}_resetPropertiesModal(){this.visibleOtpError=!1,this.visibleServiceError=!1}_retryErrorHandler(t){this._resetPropertiesModal(),this._dispatchCustomEvent({errorButton:"retry-error-manager-button-click",errorVeil:"retry-error-manager-veil-click",otpInvalid:"reset-otp-error"}[t],{},!0,!0)}get _renderRetryError(){return d`
      <bbva-help-modal
        icon-right-primary="${M()}"
        header-type="modal-three-level"
        title-icon="${this._iconTitleHalfModal}"
        title-text="${this.t(W.title)}"
        description-text="${this.t(W.descriptionText)}"
        button-text="${this.t(W.buttonText)}"
        fixed-footer
        hide-content-padding-top
        modal-type="warning"
        id="retryError"
        ?visible="${this.visibleServiceError}"
        .closeModalElements="${["veil","footer-button"]}"
        @help-modal-footer-button-click="${()=>this._retryErrorHandler("errorButton")}"
        @help-modal-veil-click= "${()=>this._retryErrorHandler("errorVeil")}"
      >
      </bbva-help-modal>
    `}get _renderOtpInvalid(){return d`
      <bbva-help-modal
        icon-right-primary="${M()}"
        header-type="modal-three-level"
        title-icon="${this._iconTitleHalfModal}"
        title-text="${this.t(Y.title)}"
        description-text="${this.t(Y.descriptionText)}"
        button-text="${this.t(Y.buttonText)}"
        fixed-footer
        hide-content-padding-top
        modal-type="warning"
        id="otpError"
        ?visible="${this.visibleOtpError}"
        .closeModalElements="${["veil","footer-button"]}"
        @help-modal-footer-button-click="${()=>this._retryErrorHandler("otpInvalid")}"
        @help-modal-veil-click="${()=>this._retryErrorHandler("otpInvalid")}"
      >
      </bbva-help-modal>
    `}render(){return d`
      ${super.render()}
      ${this._renderRetryError}
      ${this._renderOtpInvalid}
    `}}var dt=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.modal-container {
  --bbva-transition-container-padding: rem(0px);
}
`;class lt extends(i(A(I(u(r))))){static get is(){return"bbva-widget-user-transaction-amount"}static get scopedElements(){const t=[X,it,at,ct,nt,q,P,...lt.configurationScopedElements()];return lt.scopedElementsFromClasses(t)}static get properties(){return{isVisibleLimitExceeded:{attribute:!1,type:Boolean},_isVisibleConfirmException:{attribute:!1,type:Boolean,state:!0},_isVisibleConfirmExceptionSuccess:{attribute:!1,type:Boolean,state:!0},apiVersion:{attribute:"api-version",type:String},requiredOTP:{attribute:"required-otp",type:Boolean},_requestService:{type:String,state:!0},maxErrorRetries:{type:Object,attribute:"max-error-retries"},_showOperativeError:{type:Boolean,state:!0},_showRetryErrorModal:{type:Boolean,state:!0},_showOtpInvalidModal:{type:Boolean,state:!0},_otpException:{type:String,state:!0},_enableRequestService:{type:Boolean,state:!0}}}static get styles(){return[dt,c("bbva-widget-user-transaction-amount-shared-styles")]}constructor(){super(),this.isVisibleLimitExceeded=!1,this._isVisibleConfirmException=!1,this._isVisibleConfirmExceptionSuccess=!1,this.apiVersion="",this.requiredOTP=!1,this._requestService="",this._showOperativeError=!1,this.maxErrorRetries={createOtp:3,confirmOtp:3,otpInvalid:3},this._showRetryErrorModal=!1,this._showOtpInvalidModal=!1,this._otpException="",this._enableRequestService=!1}firstUpdated(){this.showLoader(),this._limitsApi=this.shadowRoot.querySelector('[data-tag-name="bbva-local-limits-api-dm"]'),this._limitExceeded=this.shadowRoot.querySelector("#limitExceeded"),this._confirmException=this.shadowRoot.querySelector("#confirmException")}_handleFirstNavigation(t=!1){this.isVisibleLimitExceeded=t,this._isVisibleConfirmException=!t}_handleSecondNavigation(){this._isVisibleConfirmException=!1,this._isVisibleConfirmExceptionSuccess=!0,this._confirmException.reset()}reset(){this.isVisibleLimitExceeded=!1,this._isVisibleConfirmException=!1,this._isVisibleConfirmExceptionSuccess=!1,this._showOperativeError=!1,this.maxErrorRetries={confirmOtp:3,createOtp:3,otpInvalid:3},this._otpException="",this._confirmException.reset(),this._enableRequestService=!1,this.requiredOTP=!1,this._requestService="",this._showRetryErrorModal=!1,this._showOtpInvalidModal=!1}_onContinueSuccesCodeReceived({detail:t}){this._otpException=t,t&&this.postOperativeLimitsConfirmOtp(t)}_exitMtuException(t){this._dispatchCustomEvent("bbva-widget-user-transaction-amount-back-navigation",t,!0,!0),this.reset()}_requestCreateOtp(t){this._enableRequestService=!0,this._requestService=t;const[{createOtp:e}]=tt;this._limitsApi.postOperativeLimitsCreateOtp(e)}_handlerOtpSuccess(){this._requestService===K&&this._handleFirstNavigation(),this._requestService="",this._enableRequestService=!1,this.maxErrorRetries.createOtp=3,this.maxErrorRetries.otpInvalid=3}setOtpMtuException(t){this._otpException=t.otp||""}_resetOtpException(t){this._otpException=t.detail||""}get _renderLimitExceededView(){return d`
      <bbva-transition-container id="bbvaWidgetUserTransactionAmountLimitExceeded" ?visible="${this.isVisibleLimitExceeded}" reverse-animation>
        <div slot="slot-content">
          ${this.isVisibleLimitExceeded?super.render():""}
          <bbva-widget-user-transaction-amount-limit-exceeded
            id="limitExceeded"
            .isButtonDisabled="${this._enableRequestService}"
            @bbva-widget-user-transaction-amount-limit-exceeded-continue-button-click="${t=>this._requestCreateOtp(t.detail)}"
            @bbva-widget-user-transaction-amount-limit-exceeded-go-back="${t=>this._exitMtuException(t.detail)}"
          >
          </bbva-widget-user-transaction-amount-limit-exceeded>
        </div>
      </bbva-transition-container>
    `}get _renderConfirmExceptionView(){return d`
      <bbva-transition-container id="bbvaWidgetUserTransactionAmountConfirmException"
        ?visible="${this._isVisibleConfirmException}"
        class="modal-container">
        <div slot="slot-content">
          ${this._isVisibleConfirmException?super.render():""}
          <bbva-widget-user-transaction-amount-confirm-exception
            id="confirmException"
            .codeToConfirm="${this._otpException}"
            .resetValue="${this._showOtpInvalidModal}"
            .isButtonEnabled="${this._enableRequestService}"
            @code-otp-confirm-reset="${this._resetOtpException}"
            @bbva-widget-user-transaction-amount-confirm-exception-continue-button-click="${this._onContinueSuccesCodeReceived}"
            @bbva-widget-user-transaction-amount-confirm-exception-close-go-back="${t=>this._exitMtuException(t.detail)}"
            @bbva-widget-user-transaction-amount-confirm-exception-generate-new-otp="${t=>this._requestCreateOtp(t.detail)}"
            ?isVisibleConfirmException="${this._isVisibleConfirmException}">
          </bbva-widget-user-transaction-amount-confirm-exception>
        </div>
      </bbva-transition-container>
    `}get _renderConfirmationMaxLimit(){return d`
      <bbva-transition-container id="bbvaWidgetUserTransactionAmountConfirmMaxLimit"
        ?visible="${this._isVisibleConfirmExceptionSuccess}"
        class="modal-container">
        <div slot="slot-content">
          ${this._isVisibleConfirmExceptionSuccess?super.render():""}
          <bbva-widget-user-transaction-amount-confirmation-max-limit
            id="confirmationMaxLimit"
            @bbva-widget-user-transaction-amount-confirmation-max-limit-continue-button-go-back-page="${this.reset}"
            @bbva-widget-user-transaction-amount-confirmation-max-limit-reset-flow="${this.reset}">
          </bbva-widget-user-transaction-amount-confirmation-max-limit>
        </div>
      </bbva-transition-container>
    `}get _renderBLADMLimits(){return d`
      <bbva-local-limits-api-dm
        id="localLimitsApi"
        host="${this.host}"
        version="${this.apiVersion}"
        requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @post-operative-limits-create-otp-api-dm-fetch="${this._handlerOtpSuccess}"
        @post-operative-limits-create-otp-api-dm-fetch-error="${t=>this.showErrorModal(t,G.createOtp)}"
        @post-operative-limits-confirm-otp-api-dm-fetch="${this._handleSecondNavigation}"
        @post-operative-limits-confirm-otp-api-dm-fetch-error="${t=>this.showErrorModal(t,G.confirmOtp)}"
        @api-dm-error="${t=>this._errorServiceController(t)}"
        >
      </bbva-local-limits-api-dm>
    `}_errorServiceController(t){this._enableRequestService=!0;const e=Object.keys(t&&t.detail&&t.detail.body||{}),i=tt.map((t=>{const e=Object.keys(t),i=Object.keys(t[e]);return{[e]:i}})),r=this._serviceRetry(i,e);this.showErrorModal(t,G[r])}_serviceRetry(t,e){for(const i of t){const[[t,r]]=Object.entries(i);if(r.length===e.length&&r.every((t=>e.includes(t))))return t}return""}showErrorModal(t,e){this._enableRequestService=!0,this._managerErrorRetries(e);const i=this._extractHandlerError(t.detail||{});this._shouldHandleMaxErrorRetries(e,i)?this._handleMaxErrorRetries():this._handleModalVisibility(i)}_shouldHandleMaxErrorRetries(t,e){const i=this.maxErrorRetries[t]<0,r=et.includes(e),a=0===this.maxErrorRetries.otpInvalid;return i||r||a}_extractHandlerError(t){const e=t&&t.messages&&Array.isArray(t.messages)?t.messages.find((t=>t&&t.message)):"";if(!e)return"";return e.message.split("#").find((t=>""!==t))??""}_handleMaxErrorRetries(){this.isVisibleLimitExceeded=!1,this._isVisibleConfirmException=!1,this._showOperativeError=!0}_handleModalVisibility(t){this._isVisibleConfirmException&&"QYEVINV"===t?(this._showOtpInvalidModal=!0,this.maxErrorRetries.confirmOtp+=1):this._showRetryErrorModal=!0}_retryRequestService(t=""){const e=Object.keys(Z).includes(this._requestService),i=e?this._requestCreateOtp:this.postOperativeLimitsConfirmOtp;this._showRetryErrorModal=!1,"veil"!==t?i.call(this,e?this._requestService:this._otpException):this._requestService===K&&(this._enableRequestService=!1)}_managerErrorRetries(t){this.maxErrorRetries[t]-=1}handlerInvalidOtpModal(){this._managerErrorRetries("otpInvalid"),this._showOtpInvalidModal=!1,this.maxErrorRetries.otpInvalid<=0&&this.showErrorModal({},"otpInvalid")}get _halfErrorModals(){return d`
      <bbva-half-modal-error
        id="halfModalError"
        .visibleServiceError="${this._showRetryErrorModal}"
        .visibleOtpError="${this._showOtpInvalidModal}"
        @reset-otp-error="${()=>this.handlerInvalidOtpModal()}"
        @retry-error-manager-button-click="${()=>this._retryRequestService(Z.action.button)}"
        @retry-error-manager-veil-click="${()=>this._retryRequestService(Z.action.veil)}"
      ></bbva-half-modal-error>
    `}get _renderExitModalError(){return d`
    <bbva-operative-error
      .visibleOperativeError="${this._showOperativeError}"
      @bbva-operative-error-cancel-payment="${t=>this._exitMtuException((t||{}).detail||{})}"
    ></bbva-operative-error>
  `}postOperativeLimitsConfirmOtp(t){this._requestService=G.confirmOtp,this._enableRequestService=!1,this._limitsApi.postOperativeLimitsConfirmOtp({otpDetail:{id:t},indicator:"CONFIRM"})}render(){return d`
      ${this._renderLimitExceededView}
      ${this._renderConfirmExceptionView}
      ${this._renderConfirmationMaxLimit}
      ${this._renderBLADMLimits}
      ${this._halfErrorModals}
      ${this._renderExitModalError}
    `}}customElements.define("bbva-widget-user-transaction-amount",lt);
