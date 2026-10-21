import{z as e,ar as t,a as i,L as a,y as r,ah as s,aN as n,ai as o,ak as l,h as d,i as c,a8 as h,ac as u,a9 as p,ap as m,an as b,ag as v,F as g,b$ as _,bx as y,b1 as f,c0 as S,f as $,g as R,H as x,aX as T,v as k,u as C,cI as E,cJ as A,aD as D,ad as I,aa as L,aJ as w,b0 as N,aM as P,b6 as O,aO as M,o as V,j as q,k as F,l as B,n as j,eW as H,au as G,bd as U,ab as z,as as W,at as K,V as X,av as J,aw as Q,S as Y,af as Z,r as ee,bj as te,dt as ie,J as ae,aZ as re,a7 as se,aR as ne,dC as oe,dD as le,dE as de,b as ce,aI as he,b3 as ue,bU as pe,bT as me,b5 as be,Y as ve,cD as ge,cH as _e,bG as ye,b4 as fe,_ as Se,b7 as $e,bF as Re,bV as xe,cS as Te,eX as ke,a$ as Ce,eY as Ee,eZ as Ae,eq as De,ef as Ie,cU as Le,e_ as we,ay as Ne,aV as Pe}from"./952f98a9.js";import{S as Oe}from"./e284eba4.js";import{B as Me,b as Ve}from"./e32b4658.js";import{aM as qe,t as Fe,aN as Be,f as je,bM as He}from"./7f3d7ca9.js";import{B as Ge,b as Ue}from"./0efe7f4c.js";import"./c9f15469.js";import"./4dec7a01.js";import{b as ze,B as We,a as Ke}from"./c0bd2b53.js";import{B as Xe,c as Je}from"./29a2800d.js";import"./84af4f94.js";import{B as Qe,a as Ye}from"./4eb8d874.js";import{B as Ze}from"./40b41b3c.js";import{B as et,a as tt}from"./a4e2d801.js";import{B as it,a as at,b as rt,c as st,d as nt,e as ot}from"./315263f5.js";import{B as lt}from"./0b83b988.js";import{d as dt}from"./216055dc.js";import"./757bb58a.js";import"./8e6fdf7b.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./afb1d3bc.js";var ct=e`:host {
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
${(new t).mediaRules()}`;class ht extends(i(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:s(),warning:s(),error:n(),success:o()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:e,simpleLinkText:t,duration:a}),this._showNextInStack()}static get styles(){return[ct,l("bbva-notification-container-shared-styles")]}render(){return d`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${c(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${c(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var ut=e`
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${h(u.typeMedium)}));
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
`;class pt extends(i(m(b(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":g,"bbva-badge-notification":_}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[ut,l("bbva-header-main-shared-styles"),y("button:focus"),f.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return d`<bbva-icon icon="${c(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return d`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const r=pt.toCamelCase(e),s=`icon${r}`,n=`accessibilityTextIcon${r}`;return d`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${c(this.t(this[n]))}"
      aria-expanded=${c(a)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return d` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${c(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return d`
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
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r}=this;return d`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${c(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

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
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}R("colors.primaryCoreLightened"),R("colors.cool80"),R("colors.cool70"),R("colors.primaryCoreLightened"),R("colors.cool100"),R("colors.tertiaryType6Darkened"),R("colors.tertiaryType4Darkened"),R("colors.secondary300");const mt=x((e=>class extends(T(e)){static configurationScopedElements(){return[ht,k,pt,C]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),d`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||E();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&A()||this.config.faqs&&D())}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const a={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,a){const r={description:e,simpleLinkText:t,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return d`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const e=this._getElements();return d`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}})),bt=new t;var vt=e`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${h(p.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${h(p.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${h(p.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${h(p.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${h(p.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${h(p.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${h(p.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${h(u.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${h(I.type3XSmall)}));
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
${bt.mediaRules()}`;var gt=e`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new t).mediaRules()}`;const _t=new t;const yt={dark:e`
    ${e`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${h(p.primaryCoreLight)});
}
${_t.mediaRules()}`}
  `,light:e`
    ${gt}
  `};class ft extends(i(b(w(a)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":g,"bbva-text":v}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,vt,yt.dark,yt.light,l("bbva-notification-help-shared-styles")]}render(){return d`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}R("colors.primarySubduedLight"),R("colors.cool20"),R("colors.tertiaryType1Light"),R("colors.primaryCoreLightened"),R("colors.tertiaryType6Light"),R("colors.cool20"),R("colors.cool50");const St=new t;var $t=e`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${h(p.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${h(p.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${h(p.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${h(u.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${St.mediaRules()}`;const Rt=new t;var xt=e`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${h(p.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${h(p.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${h(p.primaryMediumLight)});
}
${Rt.mediaRules()}`;var Tt=e`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new t).mediaRules()}`;const kt={dark:e`
    ${xt}
    ${qe.dark}
    ${N.dark}
    ${yt.dark}
    ${f.dark}
  `,light:e`
    ${Tt}
    ${qe.light}
    ${N.light}
    ${yt.light}
    ${f.light}
  `};class Ct extends(i(b(P(a)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":Fe,"bbva-notification-help":ft,"bbva-text":v,"bbva-link":O}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=n(),this.errorIconSize=16,this.infoIcon=s(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?d`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${c(this.linkHref)}"
          icon="${D()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return d`
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
      `}return""}static get styles(){return[$t,l("bbva-form-radio-group-shared-styles"),kt.dark,kt.light]}render(){return d`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>d`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${c(e.divider)}"
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
              accessibility-icon-info-notification="${c(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${c(e.accessibilityIconAlert)}"
              variant="${c(e.variant)}"
            >
              ${e.text?M(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?d`
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
    `}}R("colors.primarySubdued"),R("colors.primaryMediumLight"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCore"),R("colors.primaryCoreLightened"),R("colors.cool60");var Et=e`[ambient^=light] {
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
${(new t).mediaRules()}`;const At=new t;var Dt=e`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${h(p.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${h(p.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${h(p.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
}
${At.mediaRules()}`;const It={dark:e`
    ${N.dark}
    ${G.dark}
    ${U.dark}
    ${Dt}
  `,light:e`
    ${N.light}
    ${G.light}
    ${U.light}
    ${Et}
  `},Lt=new t;var wt=e`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${h(p.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${h(p.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${h(p.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${h(p.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${h(p.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${h(p.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${h(p.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${h(p.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${h(p.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${h(p.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${h(p.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(z.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(z.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${h(z.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${h(z.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${h(z.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${h(z.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}
${Lt.mediaRules()}`;class Nt extends(m(W(K(w(i(b(a))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[Q,O,Y,v,Z];return Nt.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,wt,It.light,It.dark,y("button:focus"),l("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return d`
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
    `}get _icon(){return d`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return d`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return d`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const e="nochange"===this.status?"no-change":this.status;return d`
      <bbva-badge-variability
        disabled-tabindex
        .status=${e}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const e=X(this.mask,this.maskChars,!0,this.visibleChars);return d`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${e.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let e=null;return this.actionIcon||this.actionSecondaryIcon?e=this._actionIcons:this.actionLink&&(e=this._tplLink("actionLink")),e}get _definitionDescriptionTpl(){let e=null,t="";return this.description?(e=this._tplText("description"),t="description"):this.mask?(e=this._mask,t="mask"):this._isValidAmount&&(e=this._amount,t="amount"),d`
      <dd class=${J({[`wrapper-${t}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){const t="actionLink"===e?`${e}AccessibilityText`:`${e}LinkAccessibilityText`;return d`
      <bbva-link
        class=${J({ellipsis:this[`${e}Ellipsis`]})}
        aria-label="${c(this.t(this[t]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(e)}"
      >
        <span role=${c(this.roleLink)} aria-live=${c(this.arialiveLink)}>
          ${this[e]}
        </span>
      </bbva-link>
    `}_tplNoLink(e){const t=`${e}AccessibilityText`,i=`${e}TagText`,a=`${e}RoleText`,r=`${e}AriaLiveText`;return d`
      <bbva-text
        aria-label="${this.t(this[t])}"
        role="${c(this[a])}"
        aria-live="${c(this[r])}"
        class="${e}"
        unset
        size="S"
        text="${this[e]}"
        tag="${c(this[i])}"
      >
      </bbva-text>
    `}_tplText(e){return d` ${this[`${e}Link`]?this._tplLink(e):this._tplNoLink(e)} `}_iconClick(e){this.dispatchEvent(new CustomEvent(`list-simple-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(e){const t=e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return d`
      <dl>
        <dt class=${J({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return d`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?d`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let e=null;const t=["stacked","stacked-center"].includes(this.variant);return e=this.label?this.description||this._isValidAmount||this.mask||t?t?this.renderStacked():this.renderDefault():this._tplText("label"):d` <div class="wrapper-description">${this._tplText("description")}</div> `,d`
      ${e}
      <div class="skeleton"></div>
    `}}R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.cool60"),R("colors.primaryCoreLightened"),R("colors.primarySubdued"),R("colors.primaryMediumLight"),R("colors.primarySubdued"),R("colors.primaryMediumLight"),R("colors.cool50");var Pt=e`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${h(p.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${h(p.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${h(p.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${h(p.secondary200)})));
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

.image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${h(I.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(z.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${h(I.typeLarge)});
}
.title.not-text {
  margin-bottom: 0;
}

.description {
  margin: 0 auto;
  color: var(--_panel-info-text-color);
}

[data-tag-name=bbva-link] {
  display: inline-block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

:host([loading]):before {
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 144px 144px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 8px, 283% 168px, -20% 200px, 92% 232px;
}

:host([loading][image]):before {
  margin-top: 0;
  min-height: 17.5rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 100% 152px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 0px, 283% 172px, -20% 204px, 92% 236px;
}

:host([loading]):before {
  content: "";
  position: absolute;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  min-height: 18.5rem;
  display: inline-block;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
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
`,Ot=e`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,Mt=e`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${h(p.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${h(p.primaryMedium)});
}
`;const Vt={light:e`
    ${N.light}
    ${Ot}
  `,dark:e`
    ${N.dark}
    ${Mt}
  `};class qt extends(w(i(m(b(a))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":te,"bbva-link":O,"bbva-text":v}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=ie,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[Pt,super.styles,l("bbva-panel-info-shared-styles"),Vt.light,Vt.dark]}get _contentImage(){return this.image?d` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:d`
      <span
        class="${J({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===ie}render(){return d`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&d`
          <bbva-text
            tabindex="0"
            class="title ${J({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${c(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&d`
          <bbva-text
            tabindex="0"
            class="description"
            text=${this.t(this.text)}
            size="S"
            alignment="center"
            ?ellipsis="${!!this.textLines}"
            .lines="${this.textLines}"
            inherit
          ></bbva-text>
        `}
        ${d` <slot></slot> `}
        ${this.linkText&&d`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.primaryCoreLightened"),R("colors.cool50");class Ft extends(ae(a)){_mappingIndicators(e){e.map((e=>{this._removeFields(["name"],e),this._renameProperty(e,"indicatorId","id")}));for(let t=0;t<e.length;t++)"DESTINATION_IMMEDIATE_DEBIT"==e[t].id&&e.splice(t,1);return e}}class Bt{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let r=0|t,s=Math.max(r>=0?r:a-Math.abs(r),0);for(;s<a;){if((n=i[s])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;s++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var i=[],a=0,r="",s=0,n=arguments.length;s!==n;++s){var o=+arguments[s];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?a=i.push(o):(o-=65536,a=i.push(55296+(o>>10),o%1024+56320)),a>=16383&&(r+=e.apply(null,i),i.length=0)}return r+e.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",i=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${i&&i.message}`)}}class jt extends Bt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Ht=0,Gt=1,Ut="jwt",zt="tsec",Wt="none";class Kt extends Bt{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Ht,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new jt,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=zt:this.requiredToken=Wt,this.requiresJWT=!1):this.requiredToken===zt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ut?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Wt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(zt)}_setJwtHandler(){this._setTokenHandler(Ut)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((i,a)=>{t=Object.assign(t,{resolve:i,reject:a}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let i=this._getRequestHeaders();Object.keys(i).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,i[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=re),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let i=e.replace(/[\{\}]+/g,""),a=t[i];return a?delete t[i]:this._error(9,`Missing ${i} param value`),a})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(t);i.length&&(e=[e,i.map((e=>{let i=t[e];return Array.isArray(i)&&this.paramArrayMode===Gt?this._arrayToQueryParam(e,i):`${e}=${i}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(zt,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ut,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=t.getItem(i);a&&"null"!==a&&(e[i]=a)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const i=window.sessionStorage;t=Object.keys(i).filter((t=>t.startsWith(e))).reduce(((t,a)=>(t[a.replace(e,"")]=i.getItem(a),t)),{})}return t}_getTokenForRequestHeaders(e,t){const i=`${e}Handler`,a=e===Ut?"JWT ":"",r=e===Ut?"Authorization":zt;if(void 0===this[i]||null===this[i])this._error(11,`${e} handler is undefined`);else{const s=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[i].getItem(s);n?t[r]=t[r]||a+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((i=>{t.push(`${i}=${e[i]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(i){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let i;const a=new Promise(((e,t)=>{i=(i,a)=>{i?t(i):e(a)}}));return t.addEventListener("loadend",(function e(a){t.removeEventListener("loadend",e),a.error?i(a.error):i(null,t.result)})),t.readAsText(e),a}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let i=0;for(;i<e.length;){let a=e[i],r=0,s=0;if(a<=127?(r=0,s=255&a):a<=223?(r=1,s=31&a):a<=239?(r=2,s=15&a):a<=244&&(r=3,s=7&a),e.length-i-r>0){let t=0;for(;t<r;)a=e[i+t+1],s=s<<6|63&a,t+=1}else s=65533,r=e.length-i;t+=String.fromCodePoint(s),i+=r+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},i=e.trim().split(/[\r\n]+/);for(const e in i)if(i.hasOwnProperty(e)&&""!==i[e]){let a=": ",r=i[e].split(a);t[r.shift().toLowerCase()]=r.join(a)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,i,a){let r=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(a)>=0&&(r=t.getResponseHeader(a));break;case this._NATIVE_XHR:t&&t.headers&&(r=JSON.parse(t.headers)[a])}if(r){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;e.getItem(t)!==r&&(e.setItem(t,r),this._emitTokenUpdate(i,r))}}_emitTokenUpdate(e,t){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,i,a,r,s;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),i=e.getResponseHeader("AuthenticationData"),a=e.getResponseHeader("AuthenticationState"),r=e.getResponseHeader("AuthenticationChallenge"),s=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,i=n.authenticationdata||null,a=n.authenticationstate,r=n.authenticationchallenge,s=n.authenticationresponse}return{type:t,data:i,state:a,challenge:r,response:s}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",i=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const a=this._getSignatureData(e,t,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",i="",a=""){let r;if("object"==typeof e&&e){const s=this._getSignatureData(e.signatureType,t,i);r=this._makeKeyValuePairFromObject(s,e.signatureValue),e.challenge&&(r+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(r,e.signatureType,a)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(r=`password=${e}`,this._buildSignatureHeaders(r,"2",a)):(r=`${i}=${e}`,this._buildSignatureHeaders(r,t,a)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let i,a=e.split(",");if(a.length>1){i=a.map((e=>`${e}=${t[e]}`)).join(",")}else i=`${e}=${t}`;return i}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),a=this._extractResponseErrorCode(t),r=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:s,data:n,state:o,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(r)this._notifySignatureInvalid(c),i=!0;else if(s)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,c,s,n,o,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,s,n,o,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),a=this._extractResponseErrorCode(t),r=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(a),s=this._getRequestMetadata(e);r&&(this._notifyWaitingForProcessResponse(s),i=!0)}return i}_notifySignatureRequiredFirstStep(e,t,i,a){this._defineSignatureType(t,i),this._defineSignatureValue(t,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:i,metadata:e}}))}_notifySignatureRequired(e,t,i,a,r,s){this._defineSignatureValue(t,i,a);const n={type:t,data:i,challenge:r,metadata:e};s&&(n.response=s),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:i}=e;return{path:this._path,method:this.method,url:t,status:i}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",i=""){const a=t.split(";").findIndex((t=>t===e));return i?i.split(";")[a]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,i,a,r,s){a?this._notifySignatureRequired(e,t,i,a,r,s):this._notifySignatureRequiredFirstStep(e,t,i,a)}_notifySignatureTypeUsingErrorCode(e,t,i,a,r,s,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,i,a,r):this._notifySignatureRequired(t,i,a,r,s,n)}}class Xt extends Kt{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class Jt extends Kt{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class Qt extends Kt{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class Yt extends Xt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class Zt extends Qt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class ei extends Xt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}`)}toString(){return super.toString("BGADPAccountsAccountGetV0")}}class ti extends Jt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}`)}toString(){return super.toString("BGADPAccountsAccountPatchV0")}}class ii extends Xt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class ai extends Xt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class ri extends Ft{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(e){this._paramsMapping(e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}postAccounts(e){this._requestMapping(e),this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}Accounts`,this._getBgadp(a))}_getBgadp(e){return{getAccountsV1:()=>new Ze(e),getAccountsV0:()=>new Yt(e),postAccountsV0:()=>new Zt(e),postAccountsV1:()=>new Qe(e),default:()=>"BGADP does not exist."}}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){return"0"==this.version?(this._renameProperty(e,"currency","currencies.currency"),this._renameQueryParam(e,"indicators.id","indicators.indicatorId"),e):e}_responseMapping(e){if(Array.isArray(e)){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++)this._renameProperty(e[t],"accountId","id"),this._renameProperty(e[t],"title","product"),e[t].bank&&(e[t].bank.id=e[t].bank.bankId,this._removeFields(["branch","bankId"],e[t].bank)),this._removeFields(["commercialPackage","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement"],e[t]),this._removeFields(["previousMonthAverageBalance"],e[t].availableBalance),this._removeFields(["subType"],e[t].accountType),this._removeFields(["reason","reasonDescription"],e[t].status),e[t].indicators&&e[t].indicators.length&&(e[t].indicators=this._mappingIndicators(e[t].indicators));return e}return this._postResponseMapping(e)}_postResponseMapping(e){return"0"==this.version&&Object.keys(e).length&&(this._renameProperty(e,"accountId","id"),e.customizedFormats&&e.customizedFormats.forEach((e=>{this._renameProperty(e,"customizedFormatId","id")})),this._renameProperty(e,"joint","jointSignatureType"),this._renameProperty(e,"title","product"),e.bank&&(this._renameProperty(e.bank,"bankId","id"),this._renameProperty(e.bank.branch,"branchId","id")),e.participants.forEach((e=>{var t;this._renameProperty(e,"participantId","id"),"NATURAL_PERSON"===e.personType?(e.customDetails={personType:"NATURAL_UNKNOWN"},e.firstName&&(e.customDetails={...e.customDetails,firstName:e.firstName}),e.middleName&&(e.customDetails={...e.customDetails,middleName:e.middleName}),e.lastName&&(e.customDetails={...e.customDetails,lastName:e.lastName}),e.secondLastName&&(e.customDetails={...e.customDetails,secondLastName:e.secondLastName}),e.identityDocument&&(e.customDetails.identityDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}]),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],e)):"LEGAL_PERSON"===e.personType&&(e.customDetails={personType:"LEGAL_UNKNOWN"},e.legalName&&(e.customDetails={...e.customDetails,legalName:e.legalName}),e.identityDocument&&(e.customDetails.businessDocuments=[{documentNumber:e.identityDocument.documentNumber,documentType:{id:e.identityDocument.documentType}}]),this._removeFields(["personType","legalName","identityDocument"],e)),null!==(t=e.participantType)&&void 0!==t&&t.order&&(e.order=e.participantType.order,this._removeFields(["order"],e.participantType)),this._removeFields(["suffix","documents"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"conditionId","id"),this._removeFields(["period","facts","outcomes"],e)})),e.delivery&&(e.deliveries=e.delivery,this._removeFields(["delivery"],e),e.deliveries.forEach((e=>{"VIRTUAL"===e.deliveryType?e.method="DIGITAL":"PHYSICAL"===e.deliveryType&&(e.method="STANDARD"),e.address&&this._renameProperty(e.address,"addressType","deliveryAddressType"),e.destination.branch&&(e.destination.bank={branch:e.destination.branch},this._removeFields(["branch"],e.destination)),e.contactDetails[0].contactDetail&&e.contactDetails[0].contactDetail.contactDetailId&&(e.contactDetails={id:e.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),e.documentType&&(e.serviceType={id:e.documentType},this._removeFields(["documentType"],e)),this._removeFields(["deliveryType"],e)}))),e.fees&&e.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"name","description"),e.itemizeFeeUnits=[{unitType:"AMOUNT",amount:e.feeAmount.amount,currency:e.feeAmount.currency}],e.feeAmount.percentage&&e.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:e.feeAmount.percentage}),this._removeFields(["feeAmount"],e)})),e.rates&&e.rates.forEach((e=>{e.itemizeRates=[{rateType:e.rateType.id,itemizeRateUnits:[e.unit]}],this._renameProperty(e.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),e.rateType.name&&(e.itemizeRates=[{...e.itemizeRates[0],description:e.rateType.name}]),this._removeFields(["rateType","unit"],e)})),e.operationNumber&&(e.operationTracking={operationNumber:e.operationNumber}),e.relatedContracts&&e.relatedContracts.forEach((e=>{this._renameProperty(e.relationType,"name","description"),e.contractDetails={number:e.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],e)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation","offerId"],e)),e}_requestMapping(e){return"0"==this.version&&(e.bank&&(this._renameProperty(e.bank,"id","bankId"),this._renameProperty(e.bank.branch,"id","branchId")),this._renameProperty(e,"jointSignatureType","joint"),this._renameProperty(e,"product","title"),this._removeFields(["subproduct"],e.title),e.limits&&e.limits.forEach((e=>{this._renameProperty(e,"id","limitId")})),e.indicators&&e.indicators.forEach((e=>{this._renameProperty(e,"id","indicatorId")})),e.participants.forEach((e=>{var t,i,a,r,s,n;null!==(t=e.customDetails)&&void 0!==t&&t.firstName&&(e.firstName=e.customDetails.firstName),null!==(i=e.customDetails)&&void 0!==i&&i.middleName&&(e.middleName=e.customDetails.middleName),null!==(a=e.customDetails)&&void 0!==a&&a.lastName&&(e.lastName=e.customDetails.lastName),null!==(r=e.customDetails)&&void 0!==r&&r.secondLastName&&(e.secondLastName=e.customDetails.secondLastName),null!==(s=e.customDetails)&&void 0!==s&&s.identityDocuments?e.identityDocument={documentNumber:e.customDetails.identityDocuments[0].documentNumber,documentType:e.customDetails.identityDocuments[0].documentType.id}:null!==(n=e.customDetails)&&void 0!==n&&n.businessDocuments&&(e.identityDocument={documentNumber:e.customDetails.businessDocuments[0].documentNumber,documentType:e.customDetails.businessDocuments[0].documentType.id}),this._removeFields(["customDetails"],e)})),e.conditions&&e.conditions.forEach((e=>{this._renameProperty(e,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],e)})),e.relatedContracts&&e.relatedContracts.forEach((e=>{"INTERNAL_CONTRACT"===e.contractDetails.contractType&&(e.contractId=e.contractDetails.contractId),this._removeFields(["contractDetails"],e)})),e.deliveries&&(e.delivery=e.deliveries,this._removeFields(["deliveries"],e),e.delivery.forEach((e=>{if(this._renameProperty(e,"method","deliveryType"),"DIGITAL"===e.deliveryType?e.deliveryType="VIRTUAL":"STANDARD"===e.deliveryType?e.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],e),e.destination.bank&&(e.destination={...e.destination,branch:e.destination.bank.branch},this._removeFields(["bank"],e.destination)),e.contactDetails&&"STORED"===e.contactDetails.deliveryContactType){let t=[{contactDetail:{contactDetailId:e.contactDetails.id}}];e.contactDetails=t}else this._removeFields(["contactDetails"],e);e.address&&"STORED"===e.address.deliveryAddressType?this._renameProperty(e.address,"deliveryAddressType","addressType"):this._removeFields(["address"],e),this._removeFields(["deliverySchedules","serviceType","packagingtype"],e)})))),e}_paginationMapping(e){return e}}se(ri,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),se(ri,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(ri.is,ri);class si extends Ft{static get is(){return"bbva-global-account-api-dm"}static get properties(){return{account:{type:Object,attribute:!1}}}constructor(){super(),this.account={}}resetAccount(){this.account={}}getAccount(e,t={}){if(Object.keys(this.account).length)return;t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"account-api-dm-fetch",errorFireEventHandler:"account-api-dm-fetch-error"},this._responseMapping,t.fields)}patchAccount(e,t){const i={"account-id":e};this._generateGetService(this._getService("patch",t,i),{customEvent:"account-api-dm-update",errorFireEventHandler:"account-api-dm-update-error"},this._responseMapping),this.resetAccount()}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}Account`,this._getBgadp(a))}_getBgadp(e){return{getAccountV2:()=>new ne(e),getAccountV0:()=>new ei(e),patchAccountV0:()=>new ti(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return"0"==this.version&&Object.keys(e).length&&(this._renameProperty(e,"accountId","id"),this._renameProperty(e,"title","product")),e}}class ni extends Ft{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(e,t){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountTransactions`,this._getBgadp(a))}_getBgadp(e){return{getAccountTransactionsV2:()=>new oe(e),getAccountTransactionsV0:()=>new ai(e),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(e){if("0"==this.version){this._removeFields(["customerId"],e),e["transactionType.id"]&&(e["transactionType.id"]=e["transactionType.id"].toString()),e["status.id"]&&(e["status.id"]=e["status.id"].toString());let t=Object.keys(e);for(let i=0;i<t.length;i++){let a=t[i];if("operationAmount.id"===a&&"LOCAL_AMOUNT"===e[a])for(let i=0;i<t.length;i++)"operationAmount.fromAmount"===t[i]?this._renameQueryParam(e,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===t[i]?this._renameQueryParam(e,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===t[i]&&this._renameQueryParam(e,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],e)}}return e}_renameQueryParam(e,t,i){t in e&&(e[i]=e[t],delete e[t])}_paramsMapping(e){return this._paramsMappingCanonical(e),e}responseMappingCanonical(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++){this._renameProperty(e[t],"valuationDate","valueDate"),this._renameProperty(e[t].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],e[t]),this._removeFields(["product","bank"],e[t].contract),this._removeFields(["description"],e[t].transactionType),this._removeFields(["updateDate"],e[t].status);const i=e[t].classification;i&&(this._removeFields(["pfmId","customName"],i),this._removeFields(["customName"],i.category),this._removeFields(["customName"],i.category.subcategory));const a=e[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],a),a&&a.branch&&(e[t].branch={id:a.branch.id,name:a.branch.name},this._removeFields(["branch"],a)),a&&a.updatedBalance&&(a.balances=[{id:"UPDATED_BALANCE",amount:a.updatedBalance.amount,currency:a.updatedBalance.currency}],this._removeFields(["updatedBalance"],a)),e[t].localAmount&&(e[t].operationAmounts=[{id:"LOCAL_AMOUNT",amount:e[t].localAmount.amount,currency:e[t].localAmount.currency}],this._removeFields(["localAmount"],e[t]));const r=e[t].operationAmounts[0];e[t].originAmount&&(e[t].operationAmounts=[r,{id:"ORIGIN_AMOUNT",amount:e[t].originAmount.amount,currency:e[t].originAmount.currency}],this._removeFields(["originAmount"],e[t]))}return e}_responseMapping(e){return this.responseMappingCanonical(e),e}}se(ni,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(ni.is,ni);class oi extends Ft{static get is(){return"bbva-global-account-participants-base-api-dm"}resetAccountParticipants(){this.accountParticipants=[]}getAccountParticipants(e,t={}){this._paramsMapping(t),t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postAccountParticipants(e,t){const i={"account-id":e};this._generateGetService(this._getService("post",t,i),this.constructor.POST_EVENTS),this.resetAccountParticipants()}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountParticipants`,this._getBgadp(a))}_getBgadp(e){return{getAccountParticipantsV2:()=>new et(e),getAccountParticipantsV1:()=>new le(e),postAccountParticipantsV1:()=>new de(e),default:()=>"BGADP does not exist."}}_paramsMapping(e){return"1"==this.version&&(e={}),e}_responseMapping(e){return"1"==this.version&&e.length>0&&e.forEach((e=>{"NATURAL_KNOWN"==e.customDetails.personType?this._removeFields(["nonCustomerId","suffix","birthDate","identityDocuments","relationType","participationPercentage"],e.customDetails):"LEGAL_KNOWN"==e.customDetails.personType||this._removeFields(["customDetails"],e),this._removeFields(["description"],e.participantType)})),e}}se(oi,"GET_EVENTS",{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"}),se(oi,"POST_EVENTS",{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"}),customElements.define(oi.is,oi);const li={0:"notCategorizable",1:"cash",2:"saving",3:"taxes",4:"associations",6:"health",7:"shopping",8:"education",9:"bank",10:"home",11:"leisure",15:"transportation",16:"travel",17:"paycheck",18:"check",19:"otherIncome",20:"investment",21:"financing",999:"notCategorizable",9999:"toCategorize"},di={notCategorizable:["0","998","999"],cash:["42","44","46","51"],bizum:["78"],toCategorize:["9998","9999"],paycheck:["41","96","97"],check:["98","99"],otherIncome:["43","50","100","101","102"],saving:["4","10","103","104"],investment:["6","11","105","106","107","110"],financing:["7"],taxes:["1","2","3"],associations:["12","13","81"],health:["23","64","65","7","69"],shopping:["24","25","27","28","30","63","87","88","109"],education:["31","32","33","34","82"],bank:["14","16","18","19","21","35","59","61","62","70","77","108"],home:["36","37","38","39","40","68","76","83","84","85"],leisure:["52","53","54","55","56","86"],transportation:["67","72","73","74","75","92","93","94","95"],travel:["57","58","71","89","90","91"]};class ci extends(i(ni)){static get is(){return"bbva-account-transactions-es-api-dm"}static get properties(){return{_financingTypeId:{type:String}}}static get scopedElements(){const e=[ce];return ci.scopedElementsFromClasses(e)}render(){return d` ${this.accountTransactionsDM} `}constructor(){super(),this._financingTypeId=""}get accountTransactionsDM(){return d`
      <bbva-core-generic-dp
        id="accountTransactions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${c(((e,t)=>{let i={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;i=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((i,a)=>(i[a.replace(e,"")]=t.getItem(a),i)),{})}return JSON.stringify({...t,...i})})(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const t=this._formatData(e.detail);this.dispatchEvent(new CustomEvent("account-transactions-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-transactions-api-dm-fetch-error",this.shadowRoot.getElementById("accountTransactions"))(e.detail)}_requestAccountTransactions(e,t){const i=this.shadowRoot.getElementById("accountTransactions"),a=t.moneyFlow?{INCOME:"IN",EXPENSE:"OUT"}[t.moneyFlow.id]:"BOTH";this._financingTypeId=null==t?void 0:t["financingType.id"],this._setGenericRequest({dm:i,path:"accountTransactions/V02/accountTransactionsAdvancedSearch",method:"post",params:t.pagination?`?paginationKey=${t.pagination}`:`?paginationKey=0&pageSize=${t.pageSize?t.pageSize:40}`,body:{accountContracts:[{contract:{id:e}}],customer:{id:this.localCustomProperties.customerId},filter:{dates:{from:t.filterDateFrom,to:t.filterDateTo},operationType:[a]},searchType:"SEARCH"}})}_filterFinancingData(e){const t={FINANCING_AVAILABLE:"SF"};return t[this._financingTypeId]?e.filter((e=>{var i;return(null==e||null===(i=e.financingData)||void 0===i?void 0:i.customizableIndicator)===t[this._financingTypeId]})):e}_formatingOperationAmounts(e){const t="ORIGIN_AMOUNT",i=null==e?void 0:e.amount;let a={};var r,s;i&&(a={id:"EUR"===(null===(r=i.currency)||void 0===r?void 0:r.code)?"CONTRACT_AMOUNT":t,amount:null==i?void 0:i.amount,currency:null==i||null===(s=i.currency)||void 0===s?void 0:s.id});let n={};if(null!=e&&e.wireTransactionDetail){const{wireTransactionDetail:i}=e;n={id:t,amount:i.payment.amount,currency:i.payment.currency.id}}const o=0===Object.keys(a).length,l=0===Object.keys(n).length;return o&&l?null:o?[n]:l?[a]:[a,n]}_formatData(e){const t=this._filterFinancingData(e.accountTransactions).map((e=>{var t,i;return{id:e.id,operationAmounts:this._formatingOperationAmounts(e),contract:{id:e.contract.id},moneyFlow:{id:(null==e||null===(t=e.amount)||void 0===t?void 0:t.amount)<0?"EXPENSE":"INCOME",name:(null==e||null===(i=e.amount)||void 0===i?void 0:i.amount)<0?"expense":"income"},classification:this._formatClassification(e),operationDate:e.transactionDate,valueDate:e.valueDate,concept:this._formatConcept(e.humanConceptName)}}));return e.pagination&&(e.pagination={links:{first:e.pagination.firstPage,...void 0!==e.pagination.lastPage&&{last:e.pagination.lastPage},...void 0!==e.pagination.previousPage&&{previous:e.pagination.previousPage},...void 0!==e.pagination.nextPage&&{next:e.pagination.nextPage}},page:e.pagination.page,totalPages:e.pagination.total,totalElements:e.totalResults,pageSize:e.pagination.pageSize}),this.dispatchEvent(new CustomEvent("account-transactions-api-dm-pagination",{bubbles:!0,composed:!0,detail:e.pagination})),t}_formatConcept(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_formatClassification(e){var t,i;const a=null==e||null===(t=e.humanCategory)||void 0===t?void 0:t.id,r=null==e||null===(i=e.humanSubcategory)||void 0===i?void 0:i.id,s=li[a];var n;return{id:a,name:s,category:{id:a,name:s,subcategory:{id:r,name:(n=r,Object.keys(di).find((e=>di[e].includes(n))))}}}}async getAccountTransactions(e,t){this._requestAccountTransactions(e,t)}_setGenericRequest({dm:e,path:t,method:i,params:a,body:r}){return e.native=!1,e.requiresToken=!0,e.path=`${t}${a}`,e.method=i,e.body=r,e.generateRequest()}}customElements.define(ci.is,ci);class hi extends Ft{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(e,t){t=Object.assign({"account-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountLimits`,this._getBgadp(a))}_getBgadp(e){return{getAccountLimitsV0:()=>new ii(e),getAccountLimitsV2:()=>new Ye(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return this._responseMappingCanonical(e),e}_responseMappingCanonical(e){"0"==this.version&&Object.keys(e).length&&e.map((e=>{this._renameProperty(e,"limitId","id"),this._removeFields(["name"],e)}))}}se(hi,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(hi.is,hi);class ui extends Ft{static get is(){return"bbva-global-accounts-opening-child-account-base-api-dm"}postAccountsOpeningChildAccount(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}AccountsOpeningChildAccount`,this._getBgadp(a))}_getBgadp(e){return{postAccountsOpeningChildAccountV3:()=>new tt(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}se(ui,"POST_EVENTS",{customEvent:"accounts-opening-child-account-api-dm-create",errorFireEventHandler:"accounts-opening-child-account-api-dm-create-error"}),customElements.define(ui.is,ui);var pi=e`
:host {
  display: block;
  box-sizing: border-box;
  padding-top: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1em);
}
:host [role=listitem] {
  position: relative;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

fieldset {
  border: none;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) 0;
  padding: 0;
  position: relative;
}

[data-tag-name=bbva-notification-message] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-expandable-accordion] {
  margin: 0;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet] {
  text-align: left;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet]:first-of-type, [data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet]:last-of-type {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-text] {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-text]:not(.nested):not([inherit]) {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text][inherit] {
  margin: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) 0;
}

[data-tag-name=bbva-header-category] {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-header-category].round-up-want, [data-tag-name=bbva-header-category].round-up-also {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-list-toggle] {
  --bbva-list-toggle-main-icon-color: token("foundations.colors.secondary500");
}

[data-tag-name=bbva-tab-default] {
  margin-bottom: 0;
}

[data-tag-name=bbva-form-checkbox],
[data-tag-name=bbva-form-radio-button] {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 15) * 1em);
}

[data-tag-name=bbva-button-default] {
  display: block;
  width: max-content;
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  display: block;
  width: max-content;
  margin: 0 auto calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-clip-entities] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-form-range],
[data-tag-name=bbva-list-simple] {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-form-radio-group] {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem) 0 0;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}
[data-tag-name=bbva-help-modal][full-height] [data-tag-name=bbva-text][alignment=center] {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-help-modal] [data-tag-name=bbva-panel-info] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

.form-range-wrapper {
  display: flex;
  flex-direction: column;
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}
.form-range-wrapper [data-tag-name=bbva-text],
.form-range-wrapper [data-tag-name=bbva-amount] {
  align-self: center;
}
.form-range-wrapper [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(z.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(z.medium.fontStyle)});
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(L.spacer)}))) / 16) * 1rem);
}

[ambient=light] {
  background-color: var(--ambientsLight, ${h(he.light)});
  overflow: hidden;
}
`;class mi extends(mt(ue(b(a)))){static get is(){return"self-driven-round-up"}static get scopedElements(){const e=[Oe,pe,Q,Me,Fe,Ct,Ge,me,be,O,We,Nt,ve,ge,je,v,_e,ye,qt,Xe,fe,Se,si,it,$e,at,rt,st,nt,lt,dt,ot,...mi.configurationScopedElements()];return mi.scopedElementsFromClasses(e)}static get properties(){return{selectedProduct:{type:Object,attribute:"selected-product"},savingGoalsApiVersion:{type:String,attribute:"saving-goals-api-version"},cardsApiVersion:{type:String,attribute:"cards-api-version"},accountsApiVersion:{type:Number,attribute:"accounts-api-version"},selfDrivenRulesApiVersion:{type:String,attribute:"self-driven-rules-api-version"},calculatorApiVersion:{type:String,attribute:"calculator-api-version"},financialOverviewApiVersion:{type:String,attribute:"financial-overview-api-version"},ruleId:{type:String,attribute:"rule-id"},clientContracts:{type:Array,attribute:"client-contracts"},originApplication:{type:String,attribute:"origin-application"},periodDate:{type:String,attribute:"period-date"},maxLengthLimit:{type:Number,attribute:"max-length-limit"},defaultItemRanges:{type:Array},deniedCardStatus:{type:Array},selfDrivenLoading:{type:Boolean},isGoalAccountVisible:{type:Boolean,attribute:"is-goal-account-visible"},country:{type:String},_allLoading:{type:Array},_goal:{type:Object},_savingGoalAccountNumber:{type:String},_cards:{type:Array},_rules:{type:Array},_rule:{type:Object},_availableRules:{type:Object},_simulateSavedRounding:{type:Array},_calculatedValue:{type:Number},_selectedCardsIds:{type:Array},_disabledCardsIds:{type:Array},_idTabSelected:{type:Number},_typeRoundupSelected:{type:String},_multiplierSelected:{type:Number},_amountRoundupSelected:{type:Number},_percentageRoundupSelected:{type:Number},_cantCreateRuleModal:{type:Boolean},_initialRuleModal:{type:Boolean},_finishRuleModal:{type:Boolean},_maxLimitAmount:{type:Number},decimalDigits:{type:String,attribute:"decimal-digits"},_allowsNotifications:{type:Boolean},_errorModalVisible:{type:Boolean},_errorSaveDataModalVisible:{type:Boolean},_adviceEditModalVisible:{type:Boolean},_successModalVisible:{type:Boolean},_adviceExitModalVisible:{type:Boolean},_maskType:{type:String},_maskAccountChars:{type:Number},_typeRoundup:{type:Object},_ruleCreated:{type:Boolean},_editMode:{type:Boolean},_financialOverview:{type:Object},_isWarningMessage:{type:Boolean},_pendingResetData:{type:Boolean},_pendingResetModals:{type:Boolean},_pendingResetFinish:{type:Boolean},_simulateSavedFirstTime:{type:Boolean,attribute:"simulate-saved-first-time"},_cardsModuleNotLoaded:{type:Boolean}}}constructor(){super(),this._allLoading=[],this._cards=[],this._rules=[],this._selectedCardsIds=[],this._disabledCardsIds=[],this._goal={},this._rule={},this.ruleId="",this._cardsModuleNotLoaded=!1,this._simulateSavedRounding=[],this._maskType="•",this._maskAccountChars=4,this._typeRoundup={AMOUNT:"AMOUNT",PERCENTAGE:"PERCENTAGE"},this._availableRules={},this._financialOverview={},this._savingGoalAccountNumber="",this._calculatedValue=0,this._idTabSelected=0,this._typeRoundupSelected=this._typeRoundup.AMOUNT,this._amountRoundupSelected=0,this._percentageRoundupSelected=0,this._multiplierSelected=1,this._errorModalVisible=!1,this._errorSaveDataModalVisible=!1,this._adviceEditModalVisible=!1,this._successModalVisible=!1,this._adviceExitModalVisible=!1,this._cantCreateRuleModal=!1,this._initialRuleModal=!1,this._finishRuleModal=!1,this._allowsNotifications=!1,this.selfDrivenLoading=!1,this._pendingResetData=!1,this._pendingResetModals=!1,this._pendingResetFinish=!1,this._ruleCreated=!1,this._editMode=!1,this._isWarningMessage=!1,this.maxLengthLimit=7,this.clientContracts=[],this.originApplication="",this.periodDate="",this.savingGoalsApiVersion="0",this.accountsApiVersion="1",this.selfDrivenRulesApiVersion="2",this.cardsApiVersion="1",this.country="",this.calculatorApiVersion="0",this.financialOverviewApiVersion="1",this.isGoalAccountVisible=!1,this._simulateSavedFirstTime=!0,this.decimalDigits="0",this.config={back:!1,header:{position:"fixed",variant:"modal-three-level",accessibilityTextIconRightPrimary:this.t("self-driven-round-up-accessibility-icon-right-primary"),accessibilityTextIconLeftPrimary:this.t("self-driven-round-up-accessibility-icon-left-primary"),iconRightPrimary:Re(),text:this.t("self-driven-round-up-title")},loader:!0,notify:!1},this.defaultItemRanges=["x1","x2","x3","x4","x5"],this.deniedCardStatus=["BLOCKED","CANCELED"],this.addEventListener("header-main-icon-right-primary-click",(e=>this._callbackModal(e)))}firstUpdated(){var e;(super.firstUpdated(),this._addLoading("firstUpdated"),this._cardsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-cards-api-dm"]'),this._savingGoalDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-saving-goal-api-dm"]'),this._savingGoalRuleDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-saving-goal-rule-api-dm"]'),this._accountDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-account-api-dm"]'),this._ruleDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-rule-api-dm"]'),this._rulesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-rules-api-dm"]'),this._availableRulesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-available-rules-api-dm"]'),this._rulesSimulateSavedRoundingDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-rules-simulate-saved-rounding-api-dm"]'),this._calculatorDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-calculate-api-dm"]'),this._financialOverviewDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financial-overview-api-dm"]'),this.clientContracts.length)?this._cantCreateRuleModal=this.clientContracts.length<=1&&"ACCOUNT"===(null===(e=this.clientContracts[0])||void 0===e?void 0:e.productType):this._getFinancialOverview();this._clearLoader("firstUpdated")}updated(e){super.update(e),e.has("country")&&this.country&&(this._cardsModuleNotLoaded=!0),e.has("ruleId")&&this.ruleId&&this._getRule(),e.has("selfDrivenLoading")&&!this.selfDrivenLoading&&(this._pendingResetData&&(this._pendingResetData=!1,this._resetData()),this._pendingResetModals&&(this._pendingResetModals=!1,this._resetModals()),this._pendingResetFinish&&(this._pendingResetFinish=!1,this._resetFinish())),e.has("_allLoading")&&0===this._allLoading.length&&this.dispatchEvent(new CustomEvent("self-driven-round-up-ready",{detail:!1,bubbles:!0,composed:!0})),this._checkFinancialOverview(e),this._checkSelectedProduct(e),this._checkCardsStates(e)}static get styles(){return[pi,xe,Je.light,Te.light,G.light,Ve.light,qe.light,kt.light,Ue.light,ke.light,Ce.light,Ee.light,He.light,N.light,Ae.light,Vt.light,Ke.light,It.light,l("self-driven-round-up-shared-styles")]}_closeLoader(){this._allLoading=[],this.clearLoader()}_checkFinancialOverview(e){var t,i,a,r;(e.has("_availableRules")||e.has("_financialOverview"))&&Object.keys(this._availableRules).length&&Object.keys(this._financialOverview).length&&((null===(t=this._financialOverview)||void 0===t||null===(i=t.contracts)||void 0===i?void 0:i.length)<=1&&(null===(a=this._financialOverview)||void 0===a||null===(r=a.contracts[0])||void 0===r?void 0:r.productType)===this._availableRules.allowedReceiverTypes[0].id&&(this._cantCreateRuleModal=!0))}_checkSelectedProduct(e){(e.has("selectedProduct")||e.has("_cardsModuleNotLoaded"))&&this.selectedProduct&&Object.keys(this.selectedProduct).length&&!this._cardsModuleNotLoaded&&(this._getCards(),this._getAvailableRules(),this._getSavingGoal(),this._getSavingGoalAccount(),this._getRules())}_checkCardsStates(e){var t,i,a,r;(e.has("_cards")||e.has("_rule")||e.has("_rules"))&&this._cards.length&&(this._disabledCardsIds=this._getDisabledCards(),Object.keys(this._rule).length&&(this._selectedCardsIds=null===(i=this._rule)||void 0===i||null===(a=i.senders)||void 0===a?void 0:a.map((e=>{var t;return null===(t=e.senderDetail)||void 0===t?void 0:t.id})).filter((e=>!this._disabledCardsIds.find((t=>t===e))))));e.has("_disabledCardsIds")&&(null===(t=this._cards)||void 0===t?void 0:t.length)>0&&""!==this.ruleId&&(this._cantCreateRuleModal=this._disabledCardsIds.length===(null===(r=this._cardsNoBlocked)||void 0===r?void 0:r.length)&&!this.ruleId,this._checkTypeMessage())}_checkTypeMessage(){if(this._disabledCardsIds.length>0&&this.ruleId){var e,t;if(this._disabledCardsIds.length===(null===(e=this._cardsNoBlocked)||void 0===e?void 0:e.length))return void(this._isWarningMessage=!1);if(this._disabledCardsIds.length!==(null===(t=this._cardsNoBlocked)||void 0===t?void 0:t.length)&&this._selectedCardsIds.find((e=>this._cardBlocked.includes(e))))return void(this._isWarningMessage=!0)}this._isWarningMessage=!1}_handleError(){this._closeLoader(),this._errorModalVisible=!0}_getSavingGoal(){var e,t,i,a;null!==(e=this.selectedProduct)&&void 0!==e&&null!==(t=e.savingGoal)&&void 0!==t&&t.id&&this._savingGoalDm.getSavingGoal(null===(i=this.selectedProduct)||void 0===i||null===(a=i.savingGoal)||void 0===a?void 0:a.id)}_getRules(){this._rulesDm.getRules({"ruleType.id":"ROUND_UP"})}_getRule(){this.ruleId&&(this._addLoading("getRule"),this._ruleDm.getRule(this.ruleId))}_getAvailableRules(){this._addLoading("getAvailableRules"),this._availableRulesDm.getAvailableRules()}_getFinancialOverview(){Object.keys(this._financialOverviewDm.financialOverview).length?this._handleFinancialOverviewFetch(this._financialOverviewDm.financialOverview):(this._addLoading("getFinancialOverview"),this._financialOverviewDm.getFinancialOverview())}_getInfoToCreateOrEditRule(){var e,t,i,a,r,s,n,o;return{allowsNotifications:this._allowsNotifications,status:{id:(null===(e=this._rule.status)||void 0===e?void 0:e.id)||"VALID"},goalAmount:this._maxLimitAmount&&0!==this._maxLimitAmount?{amount:this._maxLimitAmount,currency:null===(t=this._availableRules)||void 0===t||null===(i=t.defaultRuleCurrency)||void 0===i?void 0:i.id}:void 0,senders:this._selectedCardsIds.map((e=>({senderDetail:{id:e,product:{productType:{id:"CARD"}},supportType:"CONTRACT"}}))),receivers:[{receiverDetail:{id:null===(a=this._goal)||void 0===a||null===(r=a.savingContract)||void 0===r?void 0:r.id,product:{productType:{id:"ACCOUNT",relatedEntity:{id:"GOAL",detail:{id:null===(s=this._goal)||void 0===s?void 0:s.id}}}},supportType:"CONTRACT"}}],roundRule:this._amountRoundupSelected?{roundType:"AMOUNT",amount:this._amountRoundupSelected,currency:null===(n=this._availableRules)||void 0===n||null===(o=n.defaultRuleCurrency)||void 0===o?void 0:o.id}:{roundType:"PERCENTAGE",percentage:this._percentageRoundupSelected.toString()},multiplierRule:this._percentageRoundupSelected?void 0:this._multiplierSelected}}_postRule(){this._adviceEditModalVisible=!1,this._addLoading("postRules"),this._rulesDm.postRules({family:{id:"EFFORTLESS_SAVINGS"},ruleType:{id:"ROUND_UP"},originApplication:{id:this.originApplication||"SELF_DRIVEN"},isActive:!0,validityPeriod:{startDate:(new Date).toISOString().split("T")[0],endDate:this.periodDate},...this._getInfoToCreateOrEditRule()})}_patchRule(){this._addLoading("patchRule"),this._ruleDm.patchRule(this.ruleId,this._getInfoToCreateOrEditRule())}_getSavingGoalAccount(){var e,t,i,a;null!==(e=this.selectedProduct)&&void 0!==e&&e.number?this._savingGoalAccountNumber=null===(t=this.selectedProduct)||void 0===t?void 0:t.number:(this._addLoading("getAccount"),this._accountDm.getAccount(null===(i=this.selectedProduct)||void 0===i||null===(a=i.contract)||void 0===a?void 0:a.id))}_getCards(){this._addLoading("getCards"),this._cardsDm.getCards({expand:"related-contracts","participant.participantType.id":"HOLDER"})}_postSimulateSavedRounding(){if(this._simulateSavedFirstTime){const e=this._cards.filter((e=>{var t;return"PREPAID_CARD"!==(null===(t=e.cardType)||void 0===t?void 0:t.id)&&!this._hasDeniedCards(e.status.id)})).map((e=>({id:e.id})));this._simulateSavedFirstTime=!1,this._addLoading("postRulesSimulateSavedRounding"),this._rulesSimulateSavedRoundingDm.postRulesSimulateSavedRounding({contracts:e})}else if(0!==Object.keys(this._rule).length){var e,t,i,a,r,s,n,o;this._postCalculate("AMOUNT"===(null===(e=this._rule)||void 0===e||null===(t=e.roundRule)||void 0===t?void 0:t.roundType)?this._typeRoundup.AMOUNT:this._typeRoundup.PERCENTAGE,"AMOUNT"===(null===(i=this._rule)||void 0===i||null===(a=i.roundRule)||void 0===a?void 0:a.roundType)?Number(null===(r=this._rule)||void 0===r||null===(s=r.roundRule)||void 0===s?void 0:s.amount):Number(null===(n=this._rule)||void 0===n||null===(o=n.roundRule)||void 0===o?void 0:o.percentage))}}_postCalculate(e,t){if(0!==this._simulateSavedRounding.length){var i;const a=null===(i=this._simulateSavedRounding[0])||void 0===i?void 0:i.contracts.filter((e=>-1!==this._selectedCardsIds.indexOf(e.id))),r=a.map((i=>{var a,r,s,n;const o=null===(a=i.results)||void 0===a?void 0:a.find((i=>e===this._typeRoundup.PERCENTAGE&&i.resultType===this._typeRoundup.PERCENTAGE&&i.percentage===t||e===this._typeRoundup.AMOUNT&&i.resultType===this._typeRoundup.AMOUNT&&i.value===t));return{value:e===this._typeRoundup.PERCENTAGE?null==o||null===(r=o.savingAmount)||void 0===r?void 0:r.amount:null==o||null===(s=o.savingAmounts)||void 0===s||null===(n=s.find((e=>e.multiplier===this._multiplierSelected)))||void 0===n?void 0:n.amount}}));1===a.length&&r.length>0?this._calculatedValue=r[0].value:r.length>0?(this._addLoading("postCalculate"),this._calculatorDm.postCalculate({operation:{operationType:"SUM_OR_SUBTRACTION",quantities:r}})):this._calculatedValue=0}}_addLoading(e){this._startShowLoader(),this._allLoading=[...this._allLoading,{type:e}]}_clearLoader(e){if("deleteSavingGoalRule"!==e)this._allLoading=this._allLoading.filter((t=>t.type!==e));else{const t=this._allLoading.filter((t=>t.type===e)),i=this._allLoading.filter((t=>t.type!==e));t.shift(),this._allLoading=[...i,...t]}0===this._allLoading.length&&this._closeLoader()}_startShowLoader(){0===this._allLoading.length&&this.showLoader("full",!1,!1)}_viewFormRadioGroupList(e,t,i,a){var r,s,n,o;return d`
      <bbva-form-radio-button
        name="choice"
        ?divider="${!i}"
        ?checked="${a}"
        value="${e}"
      >
        ${this.t(`self-driven-round-up-multiply-value-${t?"amount-":""}${e}`)}
        <span slot="clip">
          ${t?d`
                <bbva-amount
                  variant="M"
                  decimals-hidden
                  amount=${e}
                  currency-code="${null===(r=this._availableRules)||void 0===r||null===(s=r.defaultRuleCurrency)||void 0===s?void 0:s.id}"
                  local-currency="${null===(n=this._availableRules)||void 0===n||null===(o=n.defaultRuleCurrency)||void 0===o?void 0:o.id}"
                >
                </bbva-amount>
              `:d`
                <bbva-text unset class="nested" size="M" text="${e}%"></bbva-text>
              `}
        </span>
      </bbva-form-radio-button>
    `}_checkTypeRoundUpSelected(){return this._typeRoundupSelected===this._typeRoundup.AMOUNT&&0!==this._amountRoundupSelected||this._typeRoundupSelected===this._typeRoundup.PERCENTAGE&&0!==this._percentageRoundupSelected}_selectCard(e){this._selectedCardsIds=e.detail,this._selectedCardsIds.length&&this._checkTypeRoundUpSelected()?this._postCalculate(this._typeRoundupSelected,this._typeRoundupSelected===this._typeRoundup.AMOUNT?this._amountRoundupSelected:this._percentageRoundupSelected):this._calculatedValue=0}_selectPercentageRoundUp(e){var t;this._amountRoundupSelected=0,this._typeRoundupSelected=this._typeRoundup.PERCENTAGE,this._percentageRoundupSelected=Number(null===(t=e.detail)||void 0===t?void 0:t.value),this._postCalculate(this._typeRoundup.PERCENTAGE,this._percentageRoundupSelected)}_selectAmountRoundUp(e){var t;this._percentageRoundupSelected=0,this._typeRoundupSelected=this._typeRoundup.AMOUNT,this._amountRoundupSelected=Number(null===(t=e.detail)||void 0===t?void 0:t.value),this._postCalculate(this._typeRoundup.AMOUNT,this._amountRoundupSelected)}_formRangeChange(e){var t;this._multiplierSelected=Number(null===(t=e.target)||void 0===t?void 0:t.value),this._checkTypeRoundUpSelected()&&this._postCalculate(this._typeRoundup.AMOUNT,this._amountRoundupSelected)}_checkCantCreateRule(){var e,t,i;return!(null!==(e=this._rules)&&void 0!==e&&e.find((e=>{var t;return"VALID"===(null===(t=e.status)||void 0===t?void 0:t.id)}))||!this._cards.length)&&(null===(t=this._cards)||void 0===t?void 0:t.filter((e=>{var t,i;return"CREDIT_CARD"===(null===(t=e.cardType)||void 0===t?void 0:t.id)||"DEBIT_CARD"===(null===(i=e.cardType)||void 0===i?void 0:i.id)})).length)!==(null===(i=this._cards)||void 0===i?void 0:i.length)}_handleSavingGoalFetch({detail:e}){this._goal=e,this._clearLoader("getSavingGoal")}_handleCardsFetch({detail:e}){this._cards=e.filter((e=>{var t,i;return Array.isArray(e.relatedContracts)&&(null===(t=e.relatedContracts)||void 0===t?void 0:t.length)&&(null===(i=e.relatedContracts[0])||void 0===i?void 0:i.contractId)&&("CREDIT_CARD"===e.cardType.id||"DEBIT_CARD"===e.cardType.id)&&!e.isBusiness&&("OPERATIVE"===e.status.id||"BLOCKED"===e.status.id)})),!e||this._checkCantCreateRule()?this._cantCreateRuleModal=!0:this._postSimulateSavedRounding(),this._clearLoader("getCards")}_handleFetchAccount(e){var t,i;this._savingGoalAccountNumber=(null==e||null===(t=e.detail)||void 0===t?void 0:t.number)||(null==e||null===(i=e.detail)||void 0===i?void 0:i.accountId),this._clearLoader("getAccount")}_handleRulesFetch({detail:e}){this._rules=e,this._checkCantCreateRule()?this._cantCreateRuleModal=!0:this._cantCreateRuleModal||""!==this.ruleId||e||(this._initialRuleModal=!0),this._clearLoader("getRules")}_handleRulesCreate({detail:e}){this.ruleId=null==e?void 0:e.id,this._finishRuleModal=!0,this._ruleCreated=!0,this._clearLoader("postRules"),this._successRuleInfo()}_handleRulesSimulateSavedRounding({detail:e}){var t,i,a,r,s,n,o,l;(this._simulateSavedRounding=e,0!==Object.keys(this._rule).length)&&this._postCalculate("AMOUNT"===(null===(t=this._rule)||void 0===t||null===(i=t.roundRule)||void 0===i?void 0:i.roundType)?this._typeRoundup.AMOUNT:this._typeRoundup.PERCENTAGE,"AMOUNT"===(null===(a=this._rule)||void 0===a||null===(r=a.roundRule)||void 0===r?void 0:r.roundType)?Number(null===(s=this._rule)||void 0===s||null===(n=s.roundRule)||void 0===n?void 0:n.amount):Number(null===(o=this._rule)||void 0===o||null===(l=o.roundRule)||void 0===l?void 0:l.percentage));this._clearLoader("postRulesSimulateSavedRounding")}_resetCalculatedValue(){this._calculatedValue=0,this._handleError()}_handleAvailableRulesFetch({detail:e}){var t,i;[this._availableRules]=e,"ROUND_UP"!==(null===(t=this._availableRules)||void 0===t||null===(i=t.ruleType)||void 0===i?void 0:i.id)&&(this._cantCreateRuleModal=!0),this._clearLoader("getAvailableRules")}_handleRuleFetch({detail:e}){var t,i,a,r,s,n,o,l,d,c,h;(this._rule=e,this._maxLimitAmount=null===(t=this._rule)||void 0===t||null===(i=t.goalAmount)||void 0===i?void 0:i.amount,this._allowsNotifications=null===(a=this._rule)||void 0===a?void 0:a.allowsNotifications,this._typeRoundupSelected=this._rule.roundRule.roundType,null!==(r=this._rule)&&void 0!==r&&r.multiplierRule)&&(this._multiplierSelected=null===(d=this._rule)||void 0===d?void 0:d.multiplierRule);if((null===(s=this._rule)||void 0===s||null===(n=s.roundRule)||void 0===n?void 0:n.roundType)===this._typeRoundup.AMOUNT)this._amountRoundupSelected=Number(null===(c=this._rule)||void 0===c||null===(h=c.roundRule)||void 0===h?void 0:h.amount);else if((null===(o=this._rule)||void 0===o||null===(l=o.roundRule)||void 0===l?void 0:l.roundType)===this._typeRoundup.PERCENTAGE){var u;this._percentageRoundupSelected=Number(null===(u=this._rule)||void 0===u?void 0:u.roundRule.percentage)}this._clearLoader("getRule")}_handleRuleUpdate(){this._clearLoader("patchRule"),this._finishRuleModal=!0,this._successRuleInfo()}_handleRuleDelete(){var e,t;this._addLoading("deleteSavingGoalRule"),this._savingGoalRuleDm.deleteSavingGoalRule(null===(e=this.selectedProduct)||void 0===e||null===(t=e.savingGoal)||void 0===t?void 0:t.id,this.ruleId),this._clearLoader("deleteRule")}_handleSavingGoalRuleDelete(){const e=this.ruleId;this._clearLoader("deleteSavingGoalRule"),this._resetData(),this.dispatchEvent(new CustomEvent("self-driven-round-up-success-rule-delete",{detail:{deletedRuleId:e},bubbles:!0,composed:!0}))}_handleCalculate({detail:e}){var t;this._calculatedValue=null==e||null===(t=e.calculateValue)||void 0===t?void 0:t.value,this._clearLoader("postCalculate")}_handleFinancialOverviewFetch({detail:e={}}){this._financialOverview=e,this._clearLoader("getFinancialOverview")}_changeTab(e){var t;this._idTabSelected=null===(t=e.detail)||void 0===t?void 0:t.selectedIndex,this._maxLimitAmount=null}_closeFinishRuleModal(){this.selfDrivenLoading=!0,this._pendingResetFinish=!0,this._pendingResetModals=!0,this._pendingResetData=!0,this.dispatchEvent(new CustomEvent("self-driven-round-up-finish-rule-modal-close",{detail:{},bubbles:!0,composed:!0})),this._editMode=!1}_resetFinish(){this._ruleCreated=!1,this._editMode=!1}_exitWithoutSaving(){this.selfDrivenLoading=!0,this.dispatchEvent(new CustomEvent("self-driven-round-up-rule-without-saving-exit",{detail:{},bubbles:!0,composed:!0}))}_contractCard(){this.dispatchEvent(new CustomEvent("self-driven-round-up-card-contract",{detail:{},bubbles:!0,composed:!0}))}_callbackModal(){this._cantCreateRuleModal?this._leaveProccess():this._finishRuleModal||this._initialRuleModal?this.dispatchEvent(new CustomEvent("help-modal-close",{detail:{},bubbles:!0,composed:!0})):this._adviceExitModalVisible=!0}_resetData(){this._selectedCardsIds=[],this._disabledCardsIds=[],this._goal={},this._rule={},this._availableRules={},this.ruleId="",this._savingGoalAccountNumber="",this._calculatedValue=0,this._idTabSelected=0,this._typeRoundupSelected=this._typeRoundup.AMOUNT,this._amountRoundupSelected=0,this._percentageRoundupSelected=0,this._multiplierSelected=1,this._maxLimitAmount=null}get _typeTabs(){var e,t,i,a;return[{title:De(null===(e=this._availableRules)||void 0===e||null===(t=e.defaultRuleCurrency)||void 0===t?void 0:t.id,null===(i=this._availableRules)||void 0===i||null===(a=i.defaultRuleCurrency)||void 0===a?void 0:a.id)||"$"},{title:"%"}]}_getDisabledCardsByCards(){return this.clientContracts.length>0?this._getDisabledCardsByClientContracts():this._getRemainingDisabledCards()}_getDisabledCardsByClientContracts(){const e=[];return this.clientContracts.forEach((t=>{var i;"CARD"!==t.productType||t.relatedContracts&&null!==(i=t.relatedContracts[0])&&void 0!==i&&i.id||e.push(t.id)})),e}_getRemainingDisabledCards(){var e;const t=[];return null===(e=this._cards)||void 0===e||e.forEach((e=>{var i,a,r;e.relatedContracts&&null!==(i=e.relatedContracts[0])&&void 0!==i&&i.contractId||null!=e&&null!==(a=e.nextFinancialStatement)&&void 0!==a&&null!==(r=a.chargeAccounts[0])&&void 0!==r&&r.id||t.push(e.id)})),t}_getDisabledCardsByRule(){var e;const t=[];return null===(e=this._rules)||void 0===e||e.forEach((e=>{var i;null===(i=e.senders)||void 0===i||i.forEach((i=>{const a=this._cards.find((e=>{var t;return e.id===(null===(t=i.senderDetail)||void 0===t?void 0:t.id)}));var r;this.ruleId&&this.ruleId===e.id||this._hasDeniedCards(a.status.id)||t.push(null===(r=i.senderDetail)||void 0===r?void 0:r.id)}))})),t}_getDisabledCardsByCardsAndRule(){const e=[];var t;this.ruleId&&0!==Object.keys(this._rule).length&&(null===(t=this._cards)||void 0===t||t.forEach((t=>{var i,a,r,s,n,o,l,d,c,h,u,p;(t.relatedContracts&&null!==(i=t.relatedContracts[0])&&void 0!==i&&i.contractId&&(null===(a=t.relatedContracts[0])||void 0===a?void 0:a.contractId)===(null===(r=this._rule)||void 0===r||null===(s=r.receivers[0])||void 0===s||null===(n=s.receiverDetail)||void 0===n?void 0:n.id)||null!=t&&null!==(o=t.nextFinancialStatement)&&void 0!==o&&null!==(l=o.chargeAccounts[0])&&void 0!==l&&l.id&&(null==t||null===(d=t.nextFinancialStatement)||void 0===d||null===(c=d.chargeAccounts[0])||void 0===c?void 0:c.id)===(null===(h=this._rule)||void 0===h||null===(u=h.receivers[0])||void 0===u||null===(p=u.receiverDetail)||void 0===p?void 0:p.id))&&e.push(t.id)})));return e}_getDisabledCards(){const e=[...this._getDisabledCardsByCards(),...this._getDisabledCardsByRule(),...this._getDisabledCardsByCardsAndRule()];return[...new Set(e)]}_leaveProccess(){this.selfDrivenLoading=!0,this._pendingResetModals=!0,this._pendingResetData=!0,this.dispatchEvent(new CustomEvent("self-driven-round-up-rule-leave",{detail:{},bubbles:!0,composed:!0}))}_resetModals(){this._errorModalVisible=!1,this._adviceExitModalVisible=!1,this._cantCreateRuleModal=!1,this._finishRuleModal=!1}_confirmNotSavedData(){this._errorSaveDataModalVisible=!1,this.dispatchEvent(new CustomEvent("self-driven-round-up-rule-save-error",{detail:{},bubbles:!0,composed:!0}))}_notSavedDataError(){this._closeLoader(),this._errorSaveDataModalVisible=!0}_finishRuleModalTitle(){return this.t(`self-driven-round-up-modal-finish-${this._editMode||!this._ruleCreated?"modified-":""}title`)}_finishRuleModalTypeRoundUp(){return this._typeRoundupSelected===this._typeRoundup.AMOUNT?this.t("self-driven-round-up-modal-finish-roundup-amount"):this.t("self-driven-round-up-modal-finish-roundup-percentage")}_hasDeniedCards(e){return this.deniedCardStatus.includes(e)}get _cardsNoBlocked(){return this._cards.filter((e=>!this._hasDeniedCards(e.status.id))).map((e=>e.id))}get _cardBlocked(){return this._cards.filter((e=>this._hasDeniedCards(e.status.id))).map((e=>e.id))}get _checkDisabled(){var e;return!(this._disabledCardsIds.length!==(null===(e=this._cardsNoBlocked)||void 0===e?void 0:e.length)&&this._selectedCardsIds.length>0&&(this._typeRoundupSelected===this._typeRoundup.AMOUNT&&0===this._idTabSelected&&this._amountRoundupSelected||this._typeRoundupSelected===this._typeRoundup.PERCENTAGE&&1===this._idTabSelected&&this._percentageRoundupSelected))}get _amountTabRoundUpTemplate(){var e,t,i,a,r,s,n,o;return d`
      <bbva-form-radio-group
        name="choice"
        @form-radio-group-item-change="${this._selectAmountRoundUp}"
      >
        ${null===(e=this._availableRules)||void 0===e||null===(t=e.saving)||void 0===t||null===(i=t.savingValues)||void 0===i?void 0:i.map(((e,t)=>{var i,a,r,s,n,o,l;return this._viewFormRadioGroupList(null==e?void 0:e.id,!0,t===((null===(i=this._availableRules)||void 0===i||null===(a=i.saving)||void 0===a||null===(r=a.savingValues)||void 0===r?void 0:r.length)||0)-1,"AMOUNT"===(null===(s=this._rule)||void 0===s||null===(n=s.roundRule)||void 0===n?void 0:n.roundType)&&Number(null==e?void 0:e.id)===(null===(o=this._rule)||void 0===o||null===(l=o.roundRule)||void 0===l?void 0:l.amount))}))}
      </bbva-form-radio-group>
      ${this._typeRoundupSelected===this._typeRoundup.AMOUNT?d`
            <bbva-text
              size="S"
              alignment="center"
              inherit
              text="${this.t("self-driven-round-up-multiply-round-in")}"
            >
            </bbva-text>
            <div class="form-range-wrapper">
              <bbva-text
                unset
                size="S"
                alignment="center"
                text="${this.t("self-driven-round-up-multiply-round-in-description")}"
              ></bbva-text>
              <bbva-amount
                variant="l"
                .amount="${this._calculatedValue}"
                .currencyCode="${null===(a=this._availableRules)||void 0===a||null===(r=a.defaultRuleCurrency)||void 0===r?void 0:r.id}"
                .localCurrency="${null===(s=this._availableRules)||void 0===s||null===(n=s.defaultRuleCurrency)||void 0===n?void 0:n.id}"
                .language="${this.language}"
              >
              </bbva-amount>
              <bbva-form-range
                disabled-tabindex
                value="${this._multiplierSelected}"
                min="1"
                max="${null===(o=this._formRangeItems)||void 0===o?void 0:o.length}"
                .itemLabels="${this._formRangeItems}"
                show-labels
                @change="${this._formRangeChange}"
                variant="informational-section"
              >
              </bbva-form-range>
            </div>
          `:""}
    `}get _percentagesTabRoundUpTemplate(){var e,t,i,a,r,n,o;return d`
      <bbva-form-radio-group
        name="choice"
        variant="amount"
        selected="0"
        @form-radio-group-item-change="${this._selectPercentageRoundUp}"
      >
        ${null===(e=this._availableRules)||void 0===e||null===(t=e.saving)||void 0===t||null===(i=t.percentages)||void 0===i?void 0:i.map(((e,t)=>{var i,a,r,s,n,o,l;return this._viewFormRadioGroupList(null==e?void 0:e.id,!1,t===((null===(i=this._availableRules)||void 0===i||null===(a=i.saving)||void 0===a||null===(r=a.percentages)||void 0===r?void 0:r.length)||0)-1,"PERCENTAGE"===(null===(s=this._rule)||void 0===s||null===(n=s.roundRule)||void 0===n?void 0:n.roundType)&&(null==e?void 0:e.id)===(null===(o=this._rule)||void 0===o||null===(l=o.roundRule)||void 0===l?void 0:l.percentage))}))}
      </bbva-form-radio-group>
      ${this._typeRoundupSelected===this._typeRoundup.PERCENTAGE?d`
            <bbva-notification-message
              disabled-tabindex
              icon="${s()}"
              message-title="${this.t("self-driven-round-up-multiply-percentage-notification-title")}"
            >
              ${this.t("self-driven-round-up-multiply-percentage-notification",{calculatedValue:this._calculatedValueWithCurrency(this._calculatedValue)})}
            </bbva-notification-message>
            <fieldset>
              <bbva-form-amount
                .decimalDigits="${this.decimalDigits}"
                .amount="${this._maxLimitAmount}"
                .maxlength=${this.maxLengthLimit}
                info-message="${this.t("self-driven-round-up-multiply-percentage-amount-notification-message")}"
                label="${this.t("self-driven-round-up-multiply-percentage-amount-label")}"
                label-out="${this.t("self-driven-round-up-multiply-percentage-amount-label-out")}"
                optional-label="${this.t("self-driven-round-up-multiply-percentage-optional")}"
                currency-code="${null===(a=this._availableRules)||void 0===a||null===(r=a.defaultRuleCurrency)||void 0===r?void 0:r.id}"
                local-currency="${null===(n=this._availableRules)||void 0===n||null===(o=n.defaultRuleCurrency)||void 0===o?void 0:o.id}"
                @form-amount-input-change="${e=>{this._maxLimitAmount=e.detail.amount||void 0}}"
              ></bbva-form-amount>
            </fieldset>
          `:""}
    `}get _formRangeItems(){var e,t,i;return(null===(e=this._availableRules)||void 0===e||null===(t=e.saving)||void 0===t||null===(i=t.savingMultiplierRules)||void 0===i?void 0:i.map((e=>`x${e.id}`)))||this.defaultItemRanges}_calculatedValueWithCurrency(e){var t,i;const a=null===(t=this._availableRules)||void 0===t||null===(i=t.defaultRuleCurrency)||void 0===i?void 0:i.id,r=De(a,a);return Ie(a)?`${e.toLocaleString(this.language)} ${r}`:`${r}${e.toLocaleString(this.language)}`}_calculatedValueWithCurrencyWithDecimal(e){var t,i;const a=null===(t=this._availableRules)||void 0===t||null===(i=t.defaultRuleCurrency)||void 0===i?void 0:i.id,r=De(a,a);return Ie(a)?`${e.toLocaleString(this.language,{minimumFractionDigits:2})} ${r}`:`${r}${e.toLocaleString(this.language,{minimumFractionDigits:2})}`}_createEditRuleSendInfo(){this.dispatchEvent(new CustomEvent("self-driven-round-up-rule-info-create",{detail:{id:this._typeRoundupSelected,status:this.ruleId?"EDIT":"NEW"},bubbles:!0,composed:!0}))}_successRuleInfo(){this.dispatchEvent(new CustomEvent("self-driven-round-up-rule-info-success",{detail:{id:this._typeRoundupSelected,status:this._ruleCreated,roundingTotal:this._calculatedValue},bubbles:!0,composed:!0}))}get _selectedCardsPan(){return this._selectedCardsIds.map((e=>{var t;return X((null===(t=this._cards.find((t=>{var i;return t.id===e&&"PAN"===(null===(i=t.numberType)||void 0===i?void 0:i.id)})))||void 0===t?void 0:t.number)||"",this._maskType,!0,this._maskAccountChars)})).join(" | ")}get _errorModal(){return d`
      <bbva-help-modal
        data-id="errorModal"
        id="errorModal"
        title-icon="${n()}"
        title-text="${this.t("self-driven-round-up-modal-error-title")}"
        body-text="${this.t("self-driven-round-up-modal-error-text")}"
        button-text="${this.t("self-driven-round-up-modal-error-button-text")}"
        link-text="${this.t("self-driven-round-up-modal-error-exit")}"
        modal-type="warning"
        ?visible=${this._errorModalVisible}
        @help-modal-close="${this._leaveProccess}"
      ></bbva-help-modal>
    `}get _errorSaveDataModal(){return d`
      <bbva-help-modal
        id="errorPostModal"
        header-text="${this.t("self-driven-round-up-modal-save-data-head")}"
        header-type="modal"
        icon-right-primary=${Re()}
        title-icon="${n()}"
        title-text="${this.t("self-driven-round-up-modal-save-data-title")}"
        body-text="${this.t("self-driven-round-up-modal-save-data-text")}"
        button-text="${this.t("self-driven-round-up-modal-save-data-button")}"
        modal-type="warning"
        full-height
        fixed-footer
        ?visible=${this._errorSaveDataModalVisible}
        @help-modal-footer-button-click="${this._confirmNotSavedData}"
        @help-modal-close="${this._confirmNotSavedData}"
      ></bbva-help-modal>
    `}get _adviceEditModal(){return d`
      <bbva-help-modal
        data-id="adviceEditModal"
        id="adviceEditModal"
        hide-content-padding-top
        title-icon="${Le()}"
        body-text="${this.t("self-driven-round-up-advice-modal-description")}"
        button-text="${this.t("self-driven-round-up-advice-modal-button")}"
        link-text="${this.t("self-driven-round-up-advice-modal-cancel-link")}"
        modal-type="info"
        ?visible=${this._adviceEditModalVisible}
        @help-modal-footer-button-click="${this._postRule}"
        @help-modal-footer-link-click="${()=>{this._adviceEditModalVisible=!1}}"
      ></bbva-help-modal>
    `}get _listSimpleSuccess(){var e,t,i,a;const r="self-driven-round-up-success-modal";return[{label:this.t(`${r}-mode`),description:this._amountRoundupSelected?this.t("self-driven-round-up-modal-finish-roundup-amount"):this.t("self-driven-round-up-modal-finish-roundup-percentage")},{label:this.t(`${r}-cards`),description:this._cards.filter((e=>this._selectedCardsIds.includes(e.id))).map((e=>X(e.number,this._maskType,!0,this._maskAccountChars))).join(" | ")},{label:this.t(`${r}-meta-name`),description:this._goal.description},{label:this.t(`${r}-limit-per-purchase`),amount:this._maxLimitAmount,localCurrency:null===(e=this._availableRules)||void 0===e||null===(t=e.defaultRuleCurrency)||void 0===t?void 0:t.id,currencyCode:null===(i=this._availableRules)||void 0===i||null===(a=i.defaultRuleCurrency)||void 0===a?void 0:a.id,descriptionMedium:!0}]}get _adviceExitModal(){return d`
      <bbva-help-modal
        id="adviceExitModal"
        hide-content-padding-top
        title-icon="${Le()}"
        body-text="${this.t("self-driven-round-up-modal-exit-description")}"
        button-text="${this.t("self-driven-round-up-modal-exit-confirm")}"
        link-text="${this.t("self-driven-round-up-modal-exit-back-config")}"
        modal-type="info"
        ?visible=${this._adviceExitModalVisible}
        @help-modal-footer-button-click="${this._leaveProccess}"
        @help-modal-footer-link-click="${()=>{this._adviceExitModalVisible=!1}}"
      ></bbva-help-modal>
    `}_savingGoalDM(){return d`
      <bbva-global-saving-goal-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.savingGoalsApiVersion}"
        .requiredToken="${this.requiredToken}"
        .savingGoal=${{}}
        @saving-goal-api-dm-fetch="${this._handleSavingGoalFetch}"
        @saving-goal-api-dm-fetch-error="${this._handleError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-saving-goal-api-dm>
    `}_savingGoalRuleDM(){return d`
      <bbva-global-saving-goal-rule-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.savingGoalsApiVersion}"
        .requiredToken="${this.requiredToken}"
        .savingGoal=${{}}
        @saving-goal-rule-api-dm-update="${this._handleSavingGoalRuleUpdate}"
        @saving-goal-rule-api-dm-update-error="${this._notSavedDataError}"
        @saving-goal-rule-api-dm-delete="${this._handleSavingGoalRuleDelete}"
        @saving-goal-rule-api-dm-delete-error="${this._notSavedDataError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-saving-goal-rule-api-dm>
    `}_selfDrivenRulesSimulateSavedRoundingTemplateDM(){return d`
      <bbva-global-rules-simulate-saved-rounding-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.selfDrivenRulesApiVersion}"
        .requiredToken="${this.requiredToken}"
        @rules-simulate-saved-rounding-api-dm-fetch="${this._handleRulesSimulateSavedRounding}"
        @rules-simulate-saved-rounding-api-dm-fetch-error="${this._notSavedDataError}"
        @api-dm-error="${this._notSavedDataError}"
      >
      </bbva-global-rules-simulate-saved-rounding-api-dm>
    `}_selfDrivenRulesTemplateDM(){return d`
      <bbva-global-rules-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.selfDrivenRulesApiVersion}"
        .requiredToken="${this.requiredToken}"
        @rules-api-dm-fetch="${this._handleRulesFetch}"
        @rules-api-dm-fetch-error="${this._handleError}"
        @rules-api-dm-create="${this._handleRulesCreate}"
        @rules-api-dm-create-error="${this._notSavedDataError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-rules-api-dm>
    `}_selfDrivenRuleTemplateDM(){return d`
      <bbva-global-rule-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.selfDrivenRulesApiVersion}"
        .requiredToken="${this.requiredToken}"
        @rule-api-dm-fetch="${this._handleRuleFetch}"
        @rule-api-dm-fetch-error="${this._handleError}"
        @rule-api-dm-delete="${this._handleRuleDelete}"
        @rule-api-dm-delete-error=${this._notSavedDataError}
        @rule-api-dm-update="${this._handleRuleUpdate}"
        @rule-api-dm-update-error="${this._notSavedDataError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-rule-api-dm>
    `}_availableRulesTemplateDM(){return d`
      <bbva-global-available-rules-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.selfDrivenRulesApiVersion}"
        .requiredToken="${this.requiredToken}"
        @available-rules-api-dm-fetch="${this._handleAvailableRulesFetch}"
        @available-rules-api-dm-fetch-error="${this._handleError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-available-rules-api-dm>
    `}_accountTemplateDM(){return d`
      <bbva-global-account-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.accountsApiVersion}"
        .requiredToken="${this.requiredToken}"
        @account-api-dm-fetch="${this._handleFetchAccount}"
        @account-api-dm-fetch-error="${this._handleError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-account-api-dm>
    `}_cardsTemplateDM(){return d`
      <bbva-global-cards-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.cardsApiVersion}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @bbva-global-cards-api-dm-module-load="${()=>{this._cardsModuleNotLoaded=!1}}"
        @cards-api-dm-fetch="${this._handleCardsFetch}"
        @cards-api-dm-fetch-error="${this._handleError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-cards-api-dm>
    `}_calculatorTemplateDM(){return d`
      <bbva-global-calculate-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.calculatorApiVersion}"
        .requiredToken="${this.requiredToken}"
        @calculate-api-dm-fetch="${this._handleCalculate}"
        @calculate-api-dm-fetch-error="${this._notSavedDataError}"
        @api-dm-error="${this._resetCalculatedValue}"
      >
      </bbva-global-calculate-api-dm>
    `}_financialOverviewTemplateDM(){return d`
      <bbva-global-financial-overview-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.financialOverviewApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @financial-overview-api-dm-fetch="${this._handleFinancialOverviewFetch}"
        @financial-overview-api-dm-fetch-error="${this._handleError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-financial-overview-api-dm>
    `}get _cantCreateRuleTemplate(){return d`
      <bbva-help-modal
        id="cantCreateRuleModal"
        full-height
        header-type="modal-three-level"
        header-text="${this.t("self-driven-round-up-modal-no-can-create-header-title")}"
        ?visible="${this._cantCreateRuleModal}"
        hide-content-padding-top
        icon-right-primary=${Re()}
      >
        <div class="content" slot="slot-content">
          <div class="container">
            <bbva-panel-info
              ambient="light"
              disabled-tabindex
              heading="${this.t("self-driven-round-up-modal-no-can-create-header")}"
              text="${this.t("self-driven-round-up-modal-no-can-create-text")}"
              link-text="${this.t("self-driven-round-up-modal-no-can-create-return")}"
              @panel-info-link-click="${this._leaveProccess}"
            >
            </bbva-panel-info>
          </div>
        </div>
      </bbva-help-modal>
    `}get _initialRuleModalTemplate(){return d`
      <bbva-help-modal
        id="initialRuleModal"
        ambient="light"
        full-height
        header-type="modal-three-level"
        header-text="${this.t("self-driven-round-up-title")}"
        ?visible="${this._initialRuleModal}"
        hide-content-padding-top
        icon-right-primary=${Re()}
        accessibility-text-icon-right-primary="${this.t("self-driven-round-up-modal-close")}"
        @help-modal-close=${()=>{this._initialRuleModal=!1}}
      >
        <div slot="slot-content">
          <bbva-panel-info
            disabled-tabindex
            ambient="light"
            .microillustration=${we}
            heading-level="2"
            alignment="center"
            heading="${this.t("self-driven-round-up-more-info-contribution-header-title")}"
          >
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              alignment="center"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-text-1")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              alignment="center"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-text-2")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              alignment="center"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-text-3")}"
            >
            </bbva-text>
          </bbva-panel-info>
          <bbva-expandable-accordion
            divider="full"
            clip-box
            row-title="${this.t("self-driven-round-up-detail-modal-info-contribution-rule")}"
          >
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-rule-description-1")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-rule-description-2")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-rule-description-3")}"
            >
            </bbva-text>
            <bbva-list-bullet>
              ${this.t("self-driven-round-up-detail-modal-info-contribution-rule-description-3-1")}
            </bbva-list-bullet>

            <bbva-list-bullet>
              ${this.t("self-driven-round-up-detail-modal-info-contribution-rule-description-3-2")}
            </bbva-list-bullet>
          </bbva-expandable-accordion>
          <bbva-expandable-accordion
            divider="full"
            clip-box
            row-title="${this.t("self-driven-round-up-detail-modal-info-contribution-scheduled")}"
          >
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-scheduled-description-1")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-scheduled-description-2")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-scheduled-description-3")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-scheduled-description-4")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-scheduled-description-5")}"
            >
            </bbva-text>
            <bbva-text
              class="nested"
              size="S"
              tag="span"
              text="${this.t("self-driven-round-up-detail-modal-info-contribution-scheduled-description-6")}"
            >
            </bbva-text>
            <bbva-list-bullet>
              ${this.t("self-driven-round-up-detail-modal-info-contribution-scheduled-description-6-1")}
            </bbva-list-bullet>
          </bbva-expandable-accordion>
        </div>
      </bbva-help-modal>
    `}get _finishRuleModalTemplate(){var e;const t=this._editMode?"edit":"create";return d`
      <bbva-help-modal
        id="finishRuleModal"
        full-height
        header-text="${this.t(`self-driven-round-up-success-modal-description-${t}`)}"
        ?visible="${this._finishRuleModal}"
        hide-content-padding-top
        icon-right-primary=${Re()}
        accessibility-text-icon-right-primary="${this.t("self-driven-round-up-modal-close")}"
        button-text="${this.t("self-driven-round-up-modal-finish-button")}"
        link-text="${this.t("self-driven-round-up-modal-edit-button")}"
        @help-modal-close="${()=>{this._finishRuleModal=!1}}"
        @help-modal-footer-button-click="${this._closeFinishRuleModal}"
        @help-modal-header-right-primary-click="${this._closeFinishRuleModal}}"
        @help-modal-footer-link-click=${()=>{this._editMode=!0,this._finishRuleModal=!1}}
      >
        <div class="content" slot="slot-content" ambient="light">
          <bbva-panel-info
            disabled-tabindex
            ambient="light"
            .microillustration=${Ne}
            heading-level="2"
            heading="${this._finishRuleModalTitle()}"
          >
          </bbva-panel-info>
          <div role="list">
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("self-driven-round-up-modal-finish-roundup-type")}"
                description-medium
                description="${this._finishRuleModalTypeRoundUp()}"
              >
              </bbva-list-simple>
            </div>
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("self-driven-round-up-modal-finish-cards-selected")}"
                description-medium
                description="${this._selectedCardsPan}"
              >
              </bbva-list-simple>
            </div>
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("self-driven-round-up-modal-finish-destiny-goal")}"
                description-medium
                description="${null===(e=this._goal)||void 0===e?void 0:e.description}"
              >
              </bbva-list-simple>
            </div>
            ${this._typeRoundupSelected===this._typeRoundup.PERCENTAGE&&this._maxLimitAmount>0?d`
                  <div role="listitem">
                    <bbva-list-simple
                      disabled-tabindex
                      label="${this.t("self-driven-round-up-modal-finish-cards-savings-limit")}"
                      description-medium
                      description="${this._calculatedValueWithCurrencyWithDecimal(this._maxLimitAmount)}"
                    >
                    </bbva-list-simple>
                  </div>
                `:""}
          </div>
          <bbva-notification-message disabled-tabindex icon="${s()}">
            ${this.t("self-driven-round-up-modal-finish-description-banner")}
          </bbva-notification-message>
        </div>
      </bbva-help-modal>
    `}_notificationMessage(){let e=d`
      <bbva-notification-message
        disabled-tabindex
        icon="${s()}"
        message-title="${this.t("self-driven-round-up-example")}"
        message=${this.t("self-driven-round-up-notification-message",{currentAmountExample:this._calculatedValueWithCurrencyWithDecimal(8.8),roundUpExample:this._calculatedValueWithCurrency(10),differenceExample:this._calculatedValueWithCurrencyWithDecimal(1.2),currentAmountExamplePercentage:this._calculatedValueWithCurrency(100),roundUpExamplePercentage:"15%",differenceExamplePercentage:this._calculatedValueWithCurrency(15)})}
      >
      </bbva-notification-message>
    `;return this._isWarningMessage&&(e=d`
        <bbva-notification-message
          disabled-tabindex
          variant="information"
          message-title="${this.t("self-driven-round-up-rule-not-executed-title")}"
          >${this.t("self-driven-round-up-rule-not-executed-description")}
        </bbva-notification-message>
      `),e}get _cardsSection(){return d`
      <selector-card
        selector-type="multiple"
        show-related-account
        title="${this.t("self-driven-round-up-card-list-title")}"
        description="${this.t("self-driven-round-up-card-list-description")}"
        .disabledCards=${this._disabledCardsIds}
        .host="${this.host}"
        ?native="${this.native}"
        .internalCards=${this._cards}
        .selectedCards=${this._selectedCardsIds}
        .notShownCards=${e=>"PREPAID_CARD"===e.cardType.id||!0===e.isBusiness}
        @selector-card-contract="${this._contractCard}"
        @selector-card-select="${this._selectCard}"
      ></selector-card>
    `}get _goalsSection(){var e,t,i,a,r,s,n,o;return this.isGoalAccountVisible?d`
          <bbva-header-category
            class="round-up-want"
            text="${this.t("self-driven-round-up-want")}"
          ></bbva-header-category>
          <bbva-text
            unset
            size="S"
            text="${this.t("self-driven-round-up-save-rounding-in")}"
          ></bbva-text>
          <bbva-header-category
            text="${this.t("self-driven-round-up-goals")}"
          ></bbva-header-category>
          <div role="list">
            <div role="listitem">
              <bbva-list-option
                disabled-tabindex
                name="listOptionGoals"
                type-radio-button
                hide-help-icon
                title=${null===(e=this._goal)||void 0===e?void 0:e.description}
                title-level="4"
                layout="movement_minimum"
                badge-text=""
                language="en-EN"
                title-amount="${null===(t=this._goal)||void 0===t||null===(i=t.goalAmount)||void 0===i?void 0:i.amount}"
                currency-code="${null===(a=this._goal)||void 0===a||null===(r=a.goalAmount)||void 0===r?void 0:r.currency}"
                local-currency="${null===(s=this._goal)||void 0===s||null===(n=s.goalAmount)||void 0===n?void 0:n.currency}"
                account="${this._savingGoalAccountNumber?X(this._savingGoalAccountNumber,this._maskType,!0,this._maskAccountChars):""}"
                value=${null===(o=this._goal)||void 0===o?void 0:o.id}
                checked
              >
              </bbva-list-option>
            </div>
          </div>
          <bbva-divider size="full"></bbva-divider>
        `:Pe}get _finishButton(){return this.ruleId?d`
          <bbva-button-default
            id="saveButton"
            ?disabled="${this._checkDisabled}"
            variant="primary"
            @click="${()=>{this._createEditRuleSendInfo(),this._patchRule()}}"
          >
            ${this.t("self-driven-round-up-save-changes")}
          </bbva-button-default>
        `:d`
          <bbva-button-default
            id="createButton"
            ?disabled="${this._checkDisabled}"
            variant="primary"
            @click="${()=>{this._createEditRuleSendInfo(),this._adviceEditModalVisible=!0}}"
          >
            ${this.t("self-driven-round-up-activate-rule")}
          </bbva-button-default>
        `}get _auxiliarFinishLink(){var e,t;return this.ruleId?"SIMULATED"===(null===(e=this._rule)||void 0===e||null===(t=e.status)||void 0===t?void 0:t.id)?d`
            <bbva-link @click="${this._exitWithoutSaving}">
              ${this.t("self-driven-round-up-exit-without-saving")}
            </bbva-link>
          `:d`
            <bbva-link
              id="deleteLink"
              @click="${()=>{this._adviceExitModalVisible=!0}}"
            >
              ${this.t("self-driven-round-up-exit-rule")}
            </bbva-link>
          `:""}get _selfDrivenBaseTemplate(){return this._cantCreateRuleModal&&""!==this.ruleId?"":d`
        <bbva-card-banner
          ambient="light"
          disabled-tabindex
          title="${this.t("self-driven-round-up-title-round-up")}"
          description="${this.t("self-driven-round-up-description-round-up")}"
          link-text="${this.t("self-driven-round-up-link-text-round-up")}"
          microillustration="rounduprule"
          @card-banner-link-click="${()=>{this._initialRuleModal=!0}}"
        >
        </bbva-card-banner>

        ${this._notificationMessage()}
        </bbva-text>
        ${this._cardsSection} ${this._goalsSection}
        <bbva-header-category
          class="round-up-also"
          text="${this.t("self-driven-round-up-round-up-type-section-title")}"
        ></bbva-header-category>
        <bbva-text unset size="S" text="${this.t("self-driven-round-up-round-up-type-section-description")}"> </bbva-text>
        <bbva-tab-default
          disabled-tabindex
          id="tab-default"
          .options=${this._typeTabs}
          selected="${this._typeRoundupSelected===this._typeRoundup.AMOUNT?0:1}"
          accessibility-text="Available sections"
          @tab-default-tab-change="${this._changeTab}"
        >
          <div class="panel" tabindex="0" role="tabpanel" id="content-0" aria-labelledby="tab-0">
            ${this._amountTabRoundUpTemplate}
          </div>
          <div class="panel" tabindex="0" role="tabpanel" id="content-1" aria-labelledby="tab-1">
            ${this._percentagesTabRoundUpTemplate}
          </div>
        </bbva-tab-default>
        ${this._finishButton} ${this._auxiliarFinishLink}
      `}render(){return d`
      <div ambient="light">
        ${super.render()} ${this._cardsTemplateDM()} ${this._savingGoalDM()}
        ${this._savingGoalRuleDM()} ${this._accountTemplateDM()}
        ${this._selfDrivenRulesTemplateDM()} ${this._selfDrivenRuleTemplateDM()}
        ${this._availableRulesTemplateDM()}
        ${this._selfDrivenRulesSimulateSavedRoundingTemplateDM()} ${this._calculatorTemplateDM()}
        ${this._financialOverviewTemplateDM()} ${this._selfDrivenBaseTemplate}
        ${this._initialRuleModalTemplate} ${this._cantCreateRuleTemplate}
        ${this._finishRuleModalTemplate} ${this._errorModal} ${this._adviceEditModal}
        ${this._adviceExitModal}${this._errorSaveDataModal}
      </div>
    `}}customElements.define(mi.is,mi);
