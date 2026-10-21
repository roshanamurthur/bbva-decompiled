import{z as t,ar as e,a as i,L as a,y as r,ah as o,aN as n,ai as s,ak as l,h as c,i as d,a8 as h,ac as p,a9 as m,ap as v,an as y,ag as u,F as g,b$ as f,bx as b,b1 as _,c0 as x,f as C,g as w,H as k,aX as T,v as S,u as $,cI as N,cJ as L,aD as P,b3 as E,aL as V,b5 as I,b2 as A,a$ as D,cH as B,aa as M,b4 as R,b7 as z,bF as F,a_ as O}from"./952f98a9.js";import"./45933d48.js";import{B as j}from"./b3b59ab1.js";import{C as q,a as H}from"./23d80423.js";import{bH as U}from"./7f3d7ca9.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";var Y=t`:host {
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
${(new e).mediaRules()}`;class K extends(i(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:o(),warning:o(),error:n(),success:s()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[Y,l("bbva-notification-container-shared-styles")]}render(){return c`
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
    `}}var X=t`
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
`;class J extends(i(v(y(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":u,"bbva-icon":g,"bbva-badge-notification":f}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[X,l("bbva-header-main-shared-styles"),b("button:focus"),_.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return c`<bbva-icon icon="${d(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return c`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const r=J.toCamelCase(t),o=`icon${r}`,n=`accessibilityTextIcon${r}`;return c`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${d(this.t(this[n]))}"
      aria-expanded=${d(a)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(o):this._icon(o)}
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:r}=this;return c`
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
          <img src="${d(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}w("colors.primaryCoreLightened"),w("colors.cool80"),w("colors.cool70"),w("colors.primaryCoreLightened"),w("colors.cool100"),w("colors.tertiaryType6Darkened"),w("colors.tertiaryType4Darkened"),w("colors.secondary300");const W=k((t=>class extends(T(t)){static configurationScopedElements(){return[K,S,J,$]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),c`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||N();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&L()||this.config.faqs&&P())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const r={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return c`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return c`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));var G=t`:host {
  display: block;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.container {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 0 1rem 1rem 1rem;
}
`;class Q extends(W(E(y(a)))){static get is(){return"payments-panel-info"}static get scopedElements(){const t=[V,I,u,...Q.configurationScopedElements()];return Q.scopedElementsFromClasses(t)}static get properties(){return{microillustration:{type:String},text:{type:String},heading:{type:String}}}constructor(){super(),this.text="payments-third-party-wallet-verification-panel-info-default-text",this.microillustration="cactus",this.heading=""}static get styles(){return[G,_.light,A.light,D.light,l("payments-panel-info-shared-styles")]}render(){return c`
      <div class="container">
        <bbva-header-category .text=${this.heading}></bbva-header-category>
        <bbva-clip-microillustration microillustration=${this.microillustration} size="XL">
        </bbva-clip-microillustration>
        <bbva-text .text="${this.text}" alignment="center" size="S"> </bbva-text>
      </div>
    `}}class Z{static get defaultProperties(){return{bodyText:"",buttonText:"",fullHeight:!1,headerText:"",headerType:"",hideContentPaddingTop:!1,linkText:"",modalType:"info",titleIcon:"",titleText:""}}constructor(t,e={}){this.controller=t,this._properties=e}get modalName(){var t;return null===(t=this.controller)||void 0===t?void 0:t.mode}get properties(){return{...Z.defaultProperties,...this._properties}}set properties(t){return this._properties={...t},this._properties}t(...t){var e;return null===(e=this.controller)||void 0===e?void 0:e.t(...t)}closeModal(){var t;null===(t=this.controller)||void 0===t||t.closeModal()}dispatchCustomEvent(t,e=!0){var i;null===(i=this.controller)||void 0===i||i.dispatchCustomEvent(t,e)}}class tt extends Z{constructor(t,e={},i=!1){const{buttonText:a="payments-third-party-wallet-verification-modal-phone-call",linkText:r="payments-third-party-wallet-verification-modal-exit",...o}=e;super(t,{modalType:"warning",titleIcon:n(),fullHeight:!0,headerType:"modal-three-level",headerText:`payments-third-party-wallet-verification-last-modal-header-${null==t?void 0:t.wallet}`,...!i&&t.phoneNumber?{buttonText:a,linkText:r}:{buttonText:r},...o}),this.disableCallToBank=i}footerButtonClick(){var t,e;null!==(t=this.controller)&&void 0!==t&&t.phoneNumber?this.dispatchCustomEvent("payments-third-party-wallet-verification-phone-call",{value:null===(e=this.controller)||void 0===e?void 0:e.phoneNumber}):this.footerLinkClick()}footerLinkClick(){this.dispatchCustomEvent("payments-third-party-wallet-verification-modal-call-exit")}closeButtonClick(){this.footerLinkClick()}}class et extends tt{constructor(t){super(t,{titleText:"payments-third-party-wallet-verification-modal-card-not-available-title",bodyText:`payments-third-party-wallet-verification-modal-card-not-available-body-${null==t?void 0:t.wallet}`,headerText:`payments-third-party-wallet-verification-last-modal-header-${null==t?void 0:t.wallet}`},null==t?void 0:t.disableCardNotAvailablePhoneNumber)}}class it extends Z{constructor(t){super(t,{modalType:"info",titleIcon:o(),titleText:"payments-third-party-wallet-verification-modal-exit-operative-title",bodyText:"payments-third-party-wallet-verification-modal-exit-operative-body",buttonText:"payments-third-party-wallet-verification-modal-continue",linkText:"payments-third-party-wallet-verification-modal-exit"})}footerButtonClick(){this.dispatchCustomEvent("payments-third-party-wallet-verification-modal-cancel")}footerLinkClick(){this.dispatchCustomEvent("payments-third-party-wallet-verification-modal-call-exit")}}class at extends Z{constructor(t,e={}){super(t,{modalType:"warning",titleIcon:n(),titleText:`payments-third-party-wallet-verification-modal-${null==t?void 0:t.mode}-title`,bodyText:`payments-third-party-wallet-verification-modal-${null==t?void 0:t.mode}-body`,buttonText:"payments-third-party-wallet-verification-modal-retry",linkText:"payments-third-party-wallet-verification-modal-exit",...e})}footerButtonClick(){this.dispatchCustomEvent(`payments-third-party-wallet-verification-modal-${this.modalName}-retry`)}footerLinkClick(){this.dispatchCustomEvent("payments-third-party-wallet-verification-modal-call-exit")}closeButtonClick(){this.footerLinkClick()}}class rt extends at{constructor(t){super(t,{titleText:"payments-third-party-wallet-verification-modal-service-fail-title",bodyText:"payments-third-party-wallet-verification-modal-service-fail-body"})}}class ot extends at{constructor(t){super(t,{titleText:"payments-third-party-wallet-verification-modal-service-fail-title",bodyText:"payments-third-party-wallet-verification-modal-service-fail-body"})}}class nt extends tt{constructor(t){super(t,{titleText:"payments-third-party-wallet-verification-modal-service-fail-title",bodyText:"payments-third-party-wallet-verification-modal-service-fail-last-body"})}}class st extends at{constructor(t){super(t,{titleText:"payments-third-party-wallet-verification-modal-verification-fail-title",bodyText:"payments-third-party-wallet-verification-modal-verification-fail-body",linkText:"payments-third-party-wallet-verification-modal-close"})}}class lt extends tt{constructor(t){super(t,{titleText:"payments-third-party-wallet-verification-modal-verification-fail-title",bodyText:"payments-third-party-wallet-verification-modal-verification-fail-last-body",linkText:"payments-third-party-wallet-verification-modal-back"})}}var ct=t`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class dt extends(W(E(y(a)))){static get scopedElements(){const t=[B,Q,u,et,it,rt,ot,nt,st,lt];return dt.scopedElementsFromClasses(t)}static get MODES(){return{cardNotAvailable:"card-not-available",exit:"exit",pluginFail:"plugin-fail",serviceFail:"service-fail",serviceFailLast:"service-fail-last",verificationFail:"verification-fail",verificationFailLast:"verification-fail-last"}}static get is(){return"payments-third-party-wallet-verification-modal"}static get properties(){return{visible:{type:Boolean,reflect:!0},mode:{type:String,reflect:!0},wallet:{type:String,reflect:!0},phoneNumber:{type:String,attribute:"phone-number"},disableCardNotAvailablePhoneNumber:{type:Boolean,attribute:"disable-card-not-available-phone-number"}}}static get styles(){return[ct,_.light,l("payments-third-party-wallet-verification-modal-shared-styles")]}constructor(){super(),this.visible=!1,this.mode="",this.phoneNumber="",this.disableCardNotAvailablePhoneNumber=!1,this.wallet="google",this._generateParts(),this._resetConfig(),this._listeners()}update(t){t.has("visible")||this._generateParts(),t.has("mode")&&(this._resetConfig(),this._configs()),super.update(t)}get _part(){return this.mode in this._computedParts?this._computedParts[this.mode]:null}_generateParts(){const t=dt.MODES;this._computedParts={[t.cardNotAvailable]:new et(this),[t.exit]:new it(this),[t.pluginFail]:new rt(this),[t.serviceFail]:new ot(this),[t.serviceFailLast]:new nt(this),[t.verificationFail]:new st(this),[t.verificationFailLast]:new lt(this)}}_configs(){this._part&&Object.assign(this,this._part.properties)}_listeners(){this.addEventListener("header-main-icon-left-primary-click",(t=>{t.stopPropagation()}))}_resetConfig(){Object.assign(this,Z.defaultProperties)}_changeVisible(t){const e=null==t?void 0:t.detail;this.visible=e,this.dispatchCustomEvent("payments-third-party-wallet-verification-modal-status-change",{visible:e,mode:this.mode}),this._dispatchCustomEvent(`payments-third-party-wallet-verification-modal-${this.mode}-${e?"open":"close"}`)}_footerButtonClick(t){var e,i;null===(e=this._part)||void 0===e||null===(i=e.footerButtonClick)||void 0===i||i.call(e,t)}_footerLinkClick(t){var e,i;(t.stopPropagation(),null!==(e=this._part)&&void 0!==e&&e.footerLinkClick)?null===(i=this._part)||void 0===i||i.footerLinkClick(t):this.cancelModal()}_closeButtonClick(t){var e,i,a;(null==t||null===(e=t.stopPropagation)||void 0===e||e.call(t),null!==(i=this._part)&&void 0!==i&&i.closeButtonClick)?null===(a=this._part)||void 0===a||a.closeButtonClick(t):this.cancelModal()}cancelModal(){this.dispatchCustomEvent("payments-third-party-wallet-verification-modal-cancel",{mode:this.mode}),this.closeModal()}nativeButtonClick(){this._closeButtonClick()}closeModal(){this.visible=!1}dispatchCustomEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_renderModal(){return c`
      <bbva-help-modal
        header-type="${this.headerType}"
        title-icon="${this.titleIcon}"
        modal-type="${this.modalType}"
        title-text="${this.t(this.titleText)}"
        header-text="${this.t(this.headerText)}"
        body-text="${this.t(this.bodyText)}"
        button-text="${this.t(this.buttonText)}"
        link-text="${this.t(this.linkText)}"
        ?full-height=${this.fullHeight}
        ?hide-content-padding-top=${this.hideContentPaddingTop}
        ?visible=${this.visible}
        @visible-changed=${this._changeVisible}
        fixed-footer
        accessibility-text-icon-left-primary=${this.t("payments-third-party-wallet-verification-accessibility-text-icon-close")}
        accessibility-text-icon-right-primary=${this.t("payments-third-party-wallet-verification-accessibility-text-icon-close")}
        @help-modal-footer-button-click=${this._footerButtonClick}
        @help-modal-footer-link-click=${this._footerLinkClick}
        @help-modal-header-right-primary-click=${this._closeButtonClick}
        @help-modal-veil-click=${this.cancelModal}
      >
      </bbva-help-modal>
    `}render(){return this._renderModal()}}const ht=new e;var pt=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--payments-third-party-wallet-verification-dark-mode-bg-color, var(--colorsPrimaryCoreLightened, ${h(m.primaryCoreLightened)}));
  min-height: 100vh;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=cards-list-cards] {
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(M.spacer)}))) / 16) * 1em);
}

*, *:before, *:after {
  box-sizing: inherit;
}
${ht.mediaRules()}`;class mt extends(W(E(y(a)))){static get is(){return"payments-third-party-wallet-verification"}static get scopedElements(){const t=[R,u,I,z,j,q,Q,dt,...mt.configurationScopedElements()];return mt.scopedElementsFromClasses(t)}static get properties(){return{cardsApiVersion:{type:String,attribute:"cards-api-version"},hubPaymentsApiVersion:{type:String,attribute:"hub-payments-api-version"},maxTries:{type:Number,attribute:"max-tries"},pendingVerification:{type:Array,attribute:"pending-verification"},wallet:{type:String},phoneNumber:{type:String,attribute:"phone-number"},disableCardNotAvailablePhoneNumber:{type:Boolean,attribute:"disable-card-not-available-phone-number"},cards:{type:Array},country:{type:String},_modalVisible:{type:Boolean},_modalMode:{type:String},_modalStack:{type:Array},_retries:{type:Number},_lastServiceCalled:{type:Object,noAccessor:!0}}}constructor(){super(),this.cardsApiVersion="0",this.hubPaymentsApiVersion="1",this.maxTries=3,this.pendingVerification=[],this.phoneNumber="",this.disableCardNotAvailablePhoneNumber=!1,this.cards=[],this._cardsCache=[],this._modalVisible=!1,this._modalStack=[],this._lastServiceCalled={},this._retries=0,this._pluginRetries=0,this.requiredToken="none",this._contentUpdated=!1,this.config={loader:!0,back:!1,header:{text:this.t("payments-third-party-wallet-verification-feature-header-main-title"),accessibilityTextIconRightPrimary:this.t("payments-third-party-wallet-verification-accessibility-text-icon-close"),iconRightPrimary:F(),"@header-main-icon-right-primary-click":()=>{this._checkNavigateBack()}},notifyFeature:!0},this.wallet="google"}static get styles(){return[pt,H.light,D.light,O.light,_.light,l("payments-third-party-wallet-verification-shared-styles")]}static getCardPan4(t){return(null==t?void 0:t.slice(-4))||""}get isLastTry(){return this._retries>=this.maxTries}get isPluginLastTry(){return this._pluginRetries>=this.maxTries}get dmCards(){return this._dmCards||(this._dmCards=this.shadowRoot.querySelector("#dmCards")),this._dmCards}get dmVerify(){return this._dmVerify||(this._dmVerify=this.shadowRoot.querySelector("#dmVerify")),this._dmVerify}get devicePendingCards(){var t;const e=null===(t=this.pendingVerification)||void 0===t?void 0:t.reduce(((t,e)=>t.set(e.deviceName,[...t.get(e.deviceName)||[],e])),new Map);return new Map([...e.entries()].sort())}navigateBack(){this.reset(),this._dispatchCustomEvent("payments-third-party-wallet-verification-back-step-navigate")}firstUpdated(){this.showLoader()}updated(t){const e=t.has("pendingVerification"),i=t.get("pendingVerification");var a;!e||null!=i&&i.length||(null!==(a=this.cards)&&void 0!==a&&a.length?this._finishCardRequest():this._contentUpdated&&this._getCardsData());this._contentUpdated=!0,super.updated(t)}reset(){this.clearLoader(),this.cards=[],this._modalVisible=!1,this._modalStack=[],this.pendingVerification=[],this._lastServiceCalled={},this._retries=0,this._pluginRetries=0}dispatchPhoneCall(){this._dispatchCustomEvent("payments-third-party-wallet-verification-phone-call",{value:this.phoneNumber})}_addLastServiceCalling(t,...e){this._lastServiceCalled={method:t,param:e}}_retryLastServiceCall(){var t,e;null===(t=this._lastServiceCalled)||void 0===t||t.method.call(this,...(null===(e=this._lastServiceCalled)||void 0===e?void 0:e.param)||[])}_retryPluginCall(){this._pluginRetries+=1,this._dispatchCustomEvent("payments-third-party-wallet-verification-retry")}_checkSomeCardAreAvailableToVerify(){const t=this.pendingVerification.map((t=>t.primaryAccountNumberSuffix)),e=this.cards.map((t=>mt.getCardPan4(t.number)));return t.some((t=>e.includes(t)))}_getCardsData(t=[]){var e,i,a;this.showLoader(),this._cardsCache=[...this._cardsCache,...t],this._retries+=1,this._addLastServiceCalling(this._getCardsData),null===(e=this.dmCards)||void 0===e||e.getCards(null!==(i=this.dmCards)&&void 0!==i&&i.morePages?{paginationKey:null===(a=this.dmCards)||void 0===a?void 0:a.nextKey,...this.dmCards.pageSize?{pageSize:this.dmCards.pageSize}:{}}:{})}_getCardsFilterByDevice(t){var e;this._validateDeviceName();const i=null===(e=this.devicePendingCards.get(t))||void 0===e?void 0:e.map((t=>t.primaryAccountNumberSuffix));return this.cards.filter((t=>{var e;return"PAN"===(null===(e=t.numberType)||void 0===e?void 0:e.id)&&(null==i?void 0:i.includes(mt.getCardPan4(t.number)))}))}_removePendingVerificationCard(t,e){const i=this.cards.find((e=>e.id===t));i&&(this.pendingVerification=this.pendingVerification.filter((t=>!(t.primaryAccountNumberSuffix===mt.getCardPan4(i.number)&&t.deviceName===e))))}_verifyCard(t,e){var i;this.showLoader();const a=this.cards.find((e=>e.id===t)),{number:r,numberType:o,expirationDate:n}=a;this._retries+=1,this._addLastServiceCalling(this._verifyCard,t,e),null===(i=this.dmVerify)||void 0===i||i.postTokensThirdPartyWalletsVerify({number:r,numberType:{id:o.id},expirationDate:moment(n).format("YYYY-MM")})}_openModal(t){this._modalMode=t,this._modalVisible=!0}_handleSuccessCardsApi({detail:t}){var e;this.clearLoader();const i=t||[];null!==(e=this.dmCards)&&void 0!==e&&e.morePages?this._getCardsData(i):(this.cards=[...this._cardsCache,...i],this._cardsCache=[],this._retries=0,this.clearLoader(),this._finishCardRequest())}_finishCardRequest(){var t;this.clearLoader(),!this._checkSomeCardAreAvailableToVerify()&&null!==(t=this.pendingVerification)&&void 0!==t&&t.length?this._openModal(dt.MODES.cardNotAvailable):this._dispatchCustomEvent("payments-third-party-wallet-verification-cards-request-success")}handleErrorPlugin(){let t=dt.MODES.pluginFail;this.isPluginLastTry&&(t=dt.MODES.serviceFailLast),this.clearLoader(),this._openModal(t)}_handleErrorCardsApi(){let t=dt.MODES.serviceFail;this.isLastTry&&(t=dt.MODES.serviceFailLast),this.clearLoader(),this._openModal(t)}retryAfterError(){this._retryLastServiceCall()}_dispatchCardEvent(t,e){var i,a;const r=this.cards.find((t=>t.id===e));this._dispatchCustomEvent(t,{cardId:e,cardTypeId:null==r||null===(i=r.cardType)||void 0===i?void 0:i.id,productName:null==r||null===(a=r.product)||void 0===a?void 0:a.name})}_requestVerifyCard(t,e){this._dispatchCardEvent("payments-third-party-wallet-verification-request-verify",t),this._retries=0,this._verifyCard(t,e)}_handleSuccessVerifyApi(){this._retries=0;const[t,e]=this._lastServiceCalled.param;this.clearLoader(),t&&e&&(this.showNotify(this.t("payments-third-party-wallet-verification-card-verified-successfully"),null,"success",3e3),this._dispatchCardEvent("payments-third-party-wallet-verification-success-verify",t),this._removePendingVerificationCard(t,e))}_handleErrorVerifyApi({detail:t}={}){let e=dt.MODES.verificationFail;this.isLastTry&&(e=dt.MODES.verificationFailLast),this.clearLoader(),this._openModal(e),this._dispatchCustomEvent("payments-third-party-wallet-verification-error-verify",t)}_renderDMs(){return c`
      <bbva-global-cards-api-dm
        id="dmCards"
        .host="${this.host}"
        .version="${this.cardsApiVersion}"
        ?native="${this.native}"
        .country="${this.country}"
        .requiredToken="${this.requiredToken}"
        @cards-api-dm-fetch="${this._handleSuccessCardsApi}"
        @cards-api-dm-fetch-error=${this._handleErrorCardsApi}
      ></bbva-global-cards-api-dm>
      <bbva-global-tokens-third-party-wallets-verify-api-dm
        id="dmVerify"
        .host="${this.host}"
        .version="${this.hubPaymentsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredotp
        @tokens-third-party-wallets-verify-api-dm-fetch="${this._handleSuccessVerifyApi}"
        @tokens-third-party-wallets-verify-api-dm-fetch-error="${this._handleErrorVerifyApi}"
      ></bbva-global-tokens-third-party-wallets-verify-api-dm>
    `}_computeTitleByDevice(t){return"NoDevice"===t?"":this.t(`payments-third-party-wallet-verification-device-${t.toLowerCase()}-name`).toUpperCase()}_renderList(t){const e=this._getCardsFilterByDevice(t);return e.length?c`
        <cards-list-cards
          header-variant="product"
          variant="compact"
          pay-compatibility=${this.wallet}
          divider-size="fit"
          title-level="3"
          visible-chars="4"
          list-title=${this._computeTitleByDevice(t)}
          link-text=${this.t("payments-third-party-wallet-verification-verify-device")}
          .cards=${e}
          @cards-list-cards-select-card=${({detail:e})=>this._requestVerifyCard(e,t)}
        ></cards-list-cards>
      `:""}_validateDeviceName(){this.pendingVerification=this.pendingVerification.map((t=>t.deviceName&&"NoDevice"!==t.deviceName?t:{deviceName:"NoDevice",...t}))}get _headerCategoryText(){return this.pendingVerification.length&&this.pendingVerification[0].deviceName&&"NoDevice"!==this.pendingVerification[0].deviceName?this.t("payments-third-party-wallet-verification-add-card-panel-info-heading-devices"):this.t("payments-third-party-wallet-verification-add-card-panel-info-heading-pending-verify")}get _lastKey(){return[...this.pendingVerification][[...this.pendingVerification].length-1].deviceName}manageBackButton(){const t=this._modalStack.length;var e;t?null===(e=this._modalStack[t-1])||void 0===e||e.nativeButtonClick():this._checkNavigateBack()}_modalStackControl(t){const[e]=t.composedPath(),{visible:i}=t.detail;this._modalVisible=i,i?this._modalStack.push(e):this._modalStack.pop()}_checkNavigateBack(){var t;this._checkSomeCardAreAvailableToVerify()&&null!==(t=this.pendingVerification)&&void 0!==t&&t.length?this._openModal(dt.MODES.exit):this.navigateBack()}_renderContent(){var t,e;return c`
      <div class="main-container">
        <payments-panel-info
          microillustration=""
          text=${this.t("payments-third-party-wallet-verification-add-card-panel-info-text")}
        ></payments-panel-info>
        <bbva-header-category
          title-level="2"
          text=${this._headerCategoryText}
        ></bbva-header-category>
        ${Array.from(this.devicePendingCards.keys()).map((t=>this._renderList(t||"NoDevice")))}
        ${this._checkSomeCardAreAvailableToVerify()&&1===(null===(t=this.pendingVerification)||void 0===t?void 0:t.length)?c`
              <bbva-divider size="fit"></bbva-divider>
            `:""}
        ${this._checkSomeCardAreAvailableToVerify()&&null!==(e=this.pendingVerification)&&void 0!==e&&e.length?"":c`
              <payments-panel-info
                microillustration="emptystateday"
                text=${this.t("payments-third-party-wallet-verification-void-cards-list")}
              ></payments-panel-info>
            `}
      </div>
    `}render(){return c`
      <div ambient="light">
        ${super.render()} ${this._renderDMs()} ${this._renderContent()}
        <payments-third-party-wallet-verification-modal
          ?visible=${this._modalVisible}
          wallet=${this.wallet}
          mode=${this._modalMode}
          phone-number=${this.phoneNumber}
          ?disable-card-not-available-phone-number=${this.disableCardNotAvailablePhoneNumber}
          @payments-third-party-wallet-verification-modal-cancel=${()=>{this._modalVisible=!1}}
          @payments-third-party-wallet-verification-modal-call-exit=${this.navigateBack}
          @payments-third-party-wallet-verification-modal-service-fail-retry=${this._retryLastServiceCall}
          @payments-third-party-wallet-verification-modal-plugin-fail-retry=${this._retryPluginCall}
          @payments-third-party-wallet-verification-modal-status-change=${this._modalStackControl}
        ></payments-third-party-wallet-verification-modal>
      </div>
    `}}customElements.define(mt.is,mt);class vt extends(U(a)){static get is(){return"bbva-analyticmanager-tpw-verification"}static get properties(){return{cardType:{type:String},pendingVerification:{type:Array,attribute:"pending-verification"},wallet:{type:String}}}constructor(){super(),this.pendingVerification=[],this.wallet="google",this.cardType=""}updated(t){var e;t.has("pendingVerification")&&null!==(e=this.pendingVerification)&&void 0!==e&&e.length&&this.setProductData(),super.updated(t)}setProductData(t=""){var e;this.persistData({process:(null===(e=this.pendingVerification)||void 0===e?void 0:e.length)??0,typology:"google"===this.wallet?"google pay":"apple pay",productName:t})}firePageVisitIsLoadedAndShowing(){this._dispatch("bbva-analyticmanager-payments-tpw-verification-pending-list-loaded",this.data)}fireAppStartedClickVerify(t){this._setCardData(t),this._dispatch(`bbva-analyticmanager-payments-tpw-verification-click-verify-${this.cardType}-card`,this.data)}fireStep2Otp(){this._dispatch(`bbva-analyticmanager-payments-tpw-verification-show-otp-${this.cardType}-card`,this.data)}fireAppCompletedVerifiedCard(t){this._setCardData(t),this._dispatch(`bbva-analyticmanager-payments-tpw-verification-verified-${this.cardType}-card`,this.data)}firePageViewNotAvailableCard(){this._dispatch("bbva-analyticmanager-payments-tpw-verification-verified-card-not-available",this.data)}firePageViewActivityNotPerformed(){this._dispatch("bbva-analyticmanager-payments-tpw-verification-verified-activity-not-performed",this.data)}firePageViewBrokenConnection(){this._dispatch("bbva-analyticmanager-payments-tpw-verification-verified-broken-connection",this.data)}reset(){this.pendingVerification=[],this.wallet="google",this.cardType=""}_setCardData(t){const{cardTypeId:e,productName:i}=t;this.setProductData(i),this.cardType="CREDIT_CARD"===e?"credit":"debit"}}customElements.define(vt.is,vt);
