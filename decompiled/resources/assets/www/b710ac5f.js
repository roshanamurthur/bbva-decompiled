import{z as e,ar as t,a as i,L as a,y as r,ah as s,aN as o,ai as n,ak as l,h as d,i as c,a8 as h,ac as p,a9 as u,ap as m,an as v,ag as b,F as g,b$ as f,bx as y,b1 as w,c0 as k,f as x,g as _,H as S,aX as C,v as $,u as T,cI as A,cJ as E,aD as P,ab as M,aI as L,aa as D,b3 as I,b0 as z,a_ as B,a$ as N,bZ as O,eZ as R,cD as V,bX as F,b4 as q,b6 as H,b5 as Y,bG as G,b8 as j,b9 as W,e$ as X,o as U,f0 as Z,f1 as Q,bf as J,be as K,cx as ee,aO as te,bU as ie,dy as ae,av as re,ad as se,cO as oe,cG as ne,aJ as le,aV as de,aM as ce,bj as he,dt as pe,au as ue,bd as me,as as ve,at as be,V as ge,aw as fe,S as ye,af as we,j as ke,r as xe,cL as _e,cN as Se,cH as Ce,bI as $e,bV as Te,cS as Ae,bH as Ee,bF as Pe,dR as Me,W as Le,ck as De}from"./952f98a9.js";import{B as Ie,a as ze}from"./f052f222.js";import{e as Be}from"./41622877.js";import{b as Ne}from"./e145ee92.js";import{M as Oe,j as Re,e as Ve,$ as Fe,eI as qe,eJ as He,eK as Ye,eL as Ge,eM as je,eN as We,eO as Xe,eP as Ue,eQ as Ze,eR as Qe,eS as Je,eT as Ke,eU as et,eV as tt,eW as it,eX as at,eY as rt,eZ as st,e_ as ot,e$ as nt,f0 as lt,f1 as dt,f2 as ct,f3 as ht,f4 as pt,f5 as ut,f6 as mt,f7 as vt,f8 as bt,f9 as gt,fa as ft,fb as yt,fc as wt,fd as kt,fe as xt,ff as _t,n as St,o as Ct,fg as $t,fh as Tt,fi as At,d as Et}from"./216055dc.js";import{c5 as Pt,cg as Mt,aC as Lt,u as Dt,aX as It,ch as zt,ci as Bt,cj as Nt,cZ as Ot,c_ as Rt}from"./7f3d7ca9.js";import{B as Vt}from"./d98ebd88.js";import{d as Ft,e as qt}from"./4d2e5f99.js";import{a as Ht,l as Yt,b as Gt,e as jt,f as Wt,g as Xt,h as Ut,i as Zt,d as Qt,q as Jt,c as Kt,j as ei,k as ti,m as ii,n as ai,t as ri}from"./cf174536.js";import{d as si,a as oi,b as ni}from"./c5fdbfff.js";import{B as li,b as di}from"./ca32b966.js";import"./0ef545a5.js";import"./cada5a1c.js";import"./ff2cdeea.js";import"./a6a31124.js";import"./53aa438e.js";import"./c0a2f832.js";import"./cae0f1de.js";var ci=e`:host {
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
${(new t).mediaRules()}`;class hi extends(i(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:s(),warning:s(),error:o(),success:n()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:e,simpleLinkText:t,duration:a}),this._showNextInStack()}static get styles(){return[ci,l("bbva-notification-container-shared-styles")]}render(){return d`
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
    `}}var pi=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${h(u.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(u.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${h(u.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${h(u.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${h(u.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(u.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${h(u.primarySubduedLight)}));
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
`;class ui extends(i(m(v(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":b,"bbva-icon":g,"bbva-badge-notification":f}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[pi,l("bbva-header-main-shared-styles"),y("button:focus"),w.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return d`<bbva-icon icon="${c(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return d`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const r=ui.toCamelCase(e),s=`icon${r}`,o=`accessibilityTextIcon${r}`;return d`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${c(this.t(this[o]))}"
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
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}_("colors.primaryCoreLightened"),_("colors.cool80"),_("colors.cool70"),_("colors.primaryCoreLightened"),_("colors.cool100"),_("colors.tertiaryType6Darkened"),_("colors.tertiaryType4Darkened"),_("colors.secondary300");const mi=S((e=>class extends(C(e)){static configurationScopedElements(){return[hi,$,ui,T]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),d`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||A();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&E()||this.config.faqs&&P())}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const a={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,a){const r={description:e,simpleLinkText:t,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return d`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const e=this._getElements();return d`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}})),vi=new t;var bi=e`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-help-faqs-aem-dark-mode-bg, var(--bbva-help-faqs-aem-bg, var(--ambientsLight, ${h(L.light)})));
  height: 100%;
  --bbva-help-modal-padding: var(--bbva-help-faqs-aem-help-modal-padding, 0);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-divider] {
  display: block;
}

section [data-tag-name=bbva-divider] {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-notification-message],
.description-box {
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text].title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(M.medium.fontWeight)});
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}

.description-box {
  text-align: left;
}
${vi.mediaRules()}`;class gi extends(Oe(I(v(C(a))))){static get is(){return"help-faqs-aem"}static get scopedElements(){const e=[V,Lt,Re,F,q,H,Dt,It,Y,Ve,b,G];return gi.scopedElementsFromClasses(e)}static get properties(){return{_item:{type:Object},showModal:{type:Boolean,attribute:"show-modal"},_showRatingText:{type:Boolean},_showError:{type:Boolean},_counterAemError:{type:Number},contentFragmentPath:{type:String,attribute:"content-fragment-path"},aemData:{type:Object},headerText:{type:String},faqsMessageText:{type:String,attribute:"faqs-message-text"},showDivider:{type:Boolean,attribute:"show-divider"},hideFooter:{type:Boolean,attribute:"hide-footer"},headingLevel:{type:Number},answerTitleTag:{type:String},disableEllipsis:{type:Boolean,attribute:"disable-ellipsis",reflect:!0},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},hideIconText:{type:Boolean,attribute:"hide-icon-text"}}}static get styles(){return[bi,z.light,B.light,Pt.light,N.light,O.light,Mt.light,R.light,w.light,l("help-faqs-aem-shared-styles")]}constructor(){super(),this.showModal=!1,this._showError=!1,this._showRatingText=!1,this.showDivider=!1,this.hideFooter=!1,this.headerText="help-faqs-aem-header-text",this.faqsMessageText="help-faqs-aem-message-faqs",this.headingLevel=1,this.answerTitleTag="h2",this.disableEllipsis=!1,this._counterAemError=0,this.maxRequestAttempts=3,this._item={},this.config={...this.config,loader:!0},this.hideIconText=!1}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._dataManager=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]'),this._getAEMData()}update(e){super.update(e),e.has("contentFragmentPath")&&this.aemData&&(this._dataManager.resetCache(),this._dataManager.getAemData())}_getAEMData(){this.aemData||this._dataManager.getAemData()}_setAEMData(e){this._showError=!1,this.aemData=e.detail||[],this.clearLoader()}get _list(){var e,t,i;return(null===(e=this.aemData)||void 0===e||null===(t=e.items)||void 0===t||null===(i=t.contentfragmentlist)||void 0===i?void 0:i.items)||[]}get _shouldRetryAemRequest(){return this._counterAemError<=this.maxRequestAttempts}_handleClick(e){this._item=e,this.showModal=!0,this._handleNewEvent("help-faqs-aem-detail-show",e)}_closeModal(e){null==e||e.stopPropagation(),this.showModal=!1,this._showRatingText=!1,this._handleNewEvent("help-faqs-aem-modal-close")}_handleNewEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_handleRatingClick({detail:e}){this._showRatingText=!0,this._handleNewEvent("help-faqs-aem-feedback-click",e)}_handleRetryError(){this._shouldRetryAemRequest&&(this.showLoader("full"),this._getAEMData(),this._handleNewEvent("help-faqs-aem-notification-retry-click"))}_handleAemContentDmError(){this._showError=!0,this._counterAemError+=1,this.clearLoader(),this._handleNewEvent("help-faqs-aem-content-service-error")}get _renderContent(){var e,t,i,a,r,s,o,n,l,c;const h=null===(e=this._item)||void 0===e?void 0:e.elements;return d`
      <bbva-help-modal
        full-height
        header-type="modal-initial"
        header-text=${null!=h&&null!==(t=h.entity)&&void 0!==t&&t.value?h.entity.value:this.headerText}
        ?visible="${this.showModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        hide-content-padding-top
        header-close-icon-label="${this.hideIconText?"":this.t("help-faqs-aem-modal-close")}"
        header-close-icon-aria-label="${this.t("help-faqs-aem-modal-close-accessibility-text")}"
        @help-modal-close=${this._closeModal}
      >
        ${h&&this.showModal?d`
              <section slot="slot-content">
                <article>
                  ${this._sourceMediaFile(h)}
                  <div class="description-box" role="presentation">
                    <bbva-text
                      tag="${this.answerTitleTag}"
                      class="title"
                      size="M"
                      unset
                      text=${null!==(i=h.alternativeTitle)&&void 0!==i&&i.value?h.alternativeTitle.value:h.title.value}
                    ></bbva-text>
                    ${null!==(a=h.alternativeAnswer)&&void 0!==a&&a.value?gi._getAlternativeAnswer(null===(r=h.alternativeAnswer)||void 0===r?void 0:r.value,null===(s=h.bullets)||void 0===s?void 0:s.value,null===(o=h.itemsposition)||void 0===o?void 0:o.value):d`
                          <bbva-text text=${h.answer.value} size="S"></bbva-text>
                        `}
                    <bbva-link
                      ?hidden=${!(null!==(n=h.linkUrl)&&void 0!==n&&n.value&&""!==(null===(l=h.linkUrl)||void 0===l?void 0:l.value))}
                      @click=${()=>{var e;return this._handleNewEvent("help-faqs-aem-detail-link-click",null===(e=h.linkUrl)||void 0===e?void 0:e.value)}}
                      >${null===(c=h.linkText)||void 0===c?void 0:c.value}</bbva-link
                    >
                  </div>
                </article>
                ${this._renderFooter}
              </section>
            `:""}
      </bbva-help-modal>
    `}static _getAlternativeAnswer(e=[],t=[],i=[]){const a=(null==e?void 0:e.length)+(null==t?void 0:t.length);let r=0,s=0;const o=[];for(let n=0;n<a;n+=1)if(i.includes(n.toString())){const e=t[s];s+=1,e&&o.push(d`
              <bbva-list-bullet disabled-tabindex> ${e} </bbva-list-bullet>
            `)}else{const t=e[r];r+=1,t&&o.push(d`
              <bbva-text tag="p" text=${t} size="S"> </bbva-text>
            `)}return d`
      ${o}
    `}get _renderDivider(){return this.showDivider?d`
          <bbva-divider></bbva-divider>
        `:""}get _renderFooter(){return this.hideFooter?"":d`
          <footer>
            ${this._renderDivider}
            <bbva-form-rating
              thumbs
              ?hide-text=${!this._showRatingText}
              title=${this.t("help-faqs-aem-thumbs")}
              text=${this.t("help-faqs-aem-feedback-text")}
              @form-rating-value-change=${this._handleRatingClick}
              disabled-tabindex
            ></bbva-form-rating>
          </footer>
        `}_sourceMediaFile(e){var t;return null!==(t=e.header)&&void 0!==t&&t.value?"video"===e.headerType.value?d`
          <bbva-banner-video
            @banner-video-button-click=${()=>this._handleNewEvent("help-faqs-aem-video-show")}
            url-image=${e.header.value}
          ></bbva-banner-video>
        `:d`
        <bbva-banner-image
          fullwidth
          image-src=${`${this.host}${e.header.value}`}
        ></bbva-banner-image>
      `:""}get _renderList(){return this._list&&this._list.length>0?this._list.map(((e,t)=>{const i=e.elements.title.value;return d`
          <bbva-list-link
            disabled-tabindex
            header-text=${this.t(i)}
            .multiline=${!this.disableEllipsis}
            @list-link-click=${()=>this._handleClick({...e,key:t})}
          ></bbva-list-link>
          ${t<this._list.length-1?d`
                <bbva-divider size="fit"></bbva-divider>
              `:""}
        `})):""}get _renderError(){return d`
      <bbva-notification-message
        variant="error"
        message=${this.t("help-faqs-aem-error-load-list"+(this._shouldRetryAemRequest?"":"-call-bank"))}
        link-title=${this.t(""+(this._shouldRetryAemRequest?"help-faqs-aem-error-retry":""))}
        @notification-message-link-click=${this._handleRetryError}
      ></bbva-notification-message>
    `}get _dmTemplate(){return d`
      <bbva-global-aem-content-fragment-dm
        .host=${this.host}
        .path=${this.contentFragmentPath}
        ?native=${this.native}
        @aem-content-fragment-dm-fetch-error=${this._handleAemContentDmError}
        @aem-content-fragment-dm-fetch=${this._setAEMData}
      >
      </bbva-global-aem-content-fragment-dm>
    `}render(){return d`
      ${super.render()} ${this._dmTemplate}
      <div ambient="light" role="presentation">
        <bbva-header-category
          heading-level="${this.headingLevel}"
          text=${this.t(this.faqsMessageText)}
        ></bbva-header-category>
        ${this._showError?this._renderError:this._renderList} ${this._renderContent}
      </div>
    `}}_("colors.cool80");var fi,yi,wi,ki={addClass:qe,removeClass:He,hasClass:Ye,toggleClass:Ge,attr:je,removeAttr:We,transform:Xe,transition:Ue,on:Ze,off:Qe,trigger:Je,transitionEnd:Ke,outerWidth:et,outerHeight:tt,styles:it,offset:at,css:rt,each:st,html:ot,text:nt,is:lt,index:dt,eq:ct,append:ht,prepend:pt,next:ut,nextAll:mt,prev:vt,prevAll:bt,parent:gt,parents:ft,closest:yt,find:wt,children:kt,filter:xt,remove:_t};function xi(e,t){return void 0===t&&(t=0),setTimeout(e,t)}function _i(){return Date.now()}function Si(e,t){void 0===t&&(t="x");var i,a,r,s=St(),o=function(e){var t,i=St();return i.getComputedStyle&&(t=i.getComputedStyle(e,null)),!t&&e.currentStyle&&(t=e.currentStyle),t||(t=e.style),t}(e);return s.WebKitCSSMatrix?((a=o.transform||o.webkitTransform).split(",").length>6&&(a=a.split(", ").map((function(e){return e.replace(",",".")})).join(", ")),r=new s.WebKitCSSMatrix("none"===a?"":a)):i=(r=o.MozTransform||o.OTransform||o.MsTransform||o.msTransform||o.transform||o.getPropertyValue("transform").replace("translate(","matrix(1, 0, 0, 1,")).toString().split(","),"x"===t&&(a=s.WebKitCSSMatrix?r.m41:16===i.length?parseFloat(i[12]):parseFloat(i[4])),"y"===t&&(a=s.WebKitCSSMatrix?r.m42:16===i.length?parseFloat(i[13]):parseFloat(i[5])),a||0}function Ci(e){return"object"==typeof e&&null!==e&&e.constructor&&"Object"===Object.prototype.toString.call(e).slice(8,-1)}function $i(){for(var e,t=Object(arguments.length<=0?void 0:arguments[0]),i=["__proto__","constructor","prototype"],a=1;a<arguments.length;a+=1){var r=a<0||arguments.length<=a?void 0:arguments[a];if(null!=r&&(e=r,!("undefined"!=typeof window&&void 0!==window.HTMLElement?e instanceof HTMLElement:e&&(1===e.nodeType||11===e.nodeType))))for(var s=Object.keys(Object(r)).filter((function(e){return i.indexOf(e)<0})),o=0,n=s.length;o<n;o+=1){var l=s[o],d=Object.getOwnPropertyDescriptor(r,l);void 0!==d&&d.enumerable&&(Ci(t[l])&&Ci(r[l])?r[l].__swiper__?t[l]=r[l]:$i(t[l],r[l]):!Ci(t[l])&&Ci(r[l])?(t[l]={},r[l].__swiper__?t[l]=r[l]:$i(t[l],r[l])):t[l]=r[l])}}return t}function Ti(){return fi||(fi=function(){var e=St(),t=Ct();return{touch:!!("ontouchstart"in e||e.DocumentTouch&&t instanceof e.DocumentTouch),pointerEvents:!!e.PointerEvent&&"maxTouchPoints"in e.navigator&&e.navigator.maxTouchPoints>=0,observer:"MutationObserver"in e||"WebkitMutationObserver"in e,passiveListener:function(){var t=!1;try{var i=Object.defineProperty({},"passive",{get:function(){t=!0}});e.addEventListener("testPassiveListener",null,i)}catch(e){}return t}(),gestures:"ongesturestart"in e}}()),fi}function Ai(e){return void 0===e&&(e={}),yi||(yi=function(e){var t=(void 0===e?{}:e).userAgent,i=Ti(),a=St(),r=a.navigator.platform,s=t||a.navigator.userAgent,o={ios:!1,android:!1},n=a.screen.width,l=a.screen.height,d=s.match(/(Android);?[\s\/]+([\d.]+)?/),c=s.match(/(iPad).*OS\s([\d_]+)/),h=s.match(/(iPod)(.*OS\s([\d_]+))?/),p=!c&&s.match(/(iPhone\sOS|iOS)\s([\d_]+)/),u="Win32"===r,m="MacIntel"===r;return!c&&m&&i.touch&&["1024x1366","1366x1024","834x1194","1194x834","834x1112","1112x834","768x1024","1024x768","820x1180","1180x820","810x1080","1080x810"].indexOf(n+"x"+l)>=0&&((c=s.match(/(Version)\/([\d.]+)/))||(c=[0,1,"13_0_0"]),m=!1),d&&!u&&(o.os="android",o.android=!0),(c||p||h)&&(o.os="ios",o.ios=!0),o}(e)),yi}function Ei(){return wi||(wi=function(){var e,t=St();return{isEdge:!!t.navigator.userAgent.match(/Edge/g),isSafari:(e=t.navigator.userAgent.toLowerCase(),e.indexOf("safari")>=0&&e.indexOf("chrome")<0&&e.indexOf("android")<0),isWebView:/(iPhone|iPod|iPad).*AppleWebKit(?!.*Safari)/i.test(t.navigator.userAgent)}}()),wi}Object.keys(ki).forEach((function(e){Object.defineProperty(Fe.fn,e,{value:ki[e],writable:!0})}));var Pi={name:"resize",create:function(){var e=this;$i(e,{resize:{observer:null,createObserver:function(){e&&!e.destroyed&&e.initialized&&(e.resize.observer=new ResizeObserver((function(t){var i=e.width,a=e.height,r=i,s=a;t.forEach((function(t){var i=t.contentBoxSize,a=t.contentRect,o=t.target;o&&o!==e.el||(r=a?a.width:(i[0]||i).inlineSize,s=a?a.height:(i[0]||i).blockSize)})),r===i&&s===a||e.resize.resizeHandler()})),e.resize.observer.observe(e.el))},removeObserver:function(){e.resize.observer&&e.resize.observer.unobserve&&e.el&&(e.resize.observer.unobserve(e.el),e.resize.observer=null)},resizeHandler:function(){e&&!e.destroyed&&e.initialized&&(e.emit("beforeResize"),e.emit("resize"))},orientationChangeHandler:function(){e&&!e.destroyed&&e.initialized&&e.emit("orientationchange")}}})},on:{init:function(e){var t=St();e.params.resizeObserver&&void 0!==St().ResizeObserver?e.resize.createObserver():(t.addEventListener("resize",e.resize.resizeHandler),t.addEventListener("orientationchange",e.resize.orientationChangeHandler))},destroy:function(e){var t=St();e.resize.removeObserver(),t.removeEventListener("resize",e.resize.resizeHandler),t.removeEventListener("orientationchange",e.resize.orientationChangeHandler)}}};function Mi(){return Mi=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var i=arguments[t];for(var a in i)Object.prototype.hasOwnProperty.call(i,a)&&(e[a]=i[a])}return e},Mi.apply(this,arguments)}var Li={attach:function(e,t){void 0===t&&(t={});var i=St(),a=this,r=new(i.MutationObserver||i.WebkitMutationObserver)((function(e){if(1!==e.length){var t=function(){a.emit("observerUpdate",e[0])};i.requestAnimationFrame?i.requestAnimationFrame(t):i.setTimeout(t,0)}else a.emit("observerUpdate",e[0])}));r.observe(e,{attributes:void 0===t.attributes||t.attributes,childList:void 0===t.childList||t.childList,characterData:void 0===t.characterData||t.characterData}),a.observer.observers.push(r)},init:function(){var e=this;if(e.support.observer&&e.params.observer){if(e.params.observeParents)for(var t=e.$el.parents(),i=0;i<t.length;i+=1)e.observer.attach(t[i]);e.observer.attach(e.$el[0],{childList:e.params.observeSlideChildren}),e.observer.attach(e.$wrapperEl[0],{attributes:!1})}},destroy:function(){this.observer.observers.forEach((function(e){e.disconnect()})),this.observer.observers=[]}},Di={name:"observer",params:{observer:!1,observeParents:!1,observeSlideChildren:!1},create:function(){var e,t;e=this,t={observer:Mi({},Li,{observers:[]})},Object.keys(t).forEach((function(i){Ci(t[i])&&Object.keys(t[i]).forEach((function(a){"function"==typeof t[i][a]&&(t[i][a]=t[i][a].bind(e))})),e[i]=t[i]}))},on:{init:function(e){e.observer.init()},destroy:function(e){e.observer.destroy()}}},Ii={on:function(e,t,i){var a=this;if("function"!=typeof t)return a;var r=i?"unshift":"push";return e.split(" ").forEach((function(e){a.eventsListeners[e]||(a.eventsListeners[e]=[]),a.eventsListeners[e][r](t)})),a},once:function(e,t,i){var a=this;if("function"!=typeof t)return a;function r(){a.off(e,r),r.__emitterProxy&&delete r.__emitterProxy;for(var i=arguments.length,s=new Array(i),o=0;o<i;o++)s[o]=arguments[o];t.apply(a,s)}return r.__emitterProxy=t,a.on(e,r,i)},onAny:function(e,t){var i=this;if("function"!=typeof e)return i;var a=t?"unshift":"push";return i.eventsAnyListeners.indexOf(e)<0&&i.eventsAnyListeners[a](e),i},offAny:function(e){var t=this;if(!t.eventsAnyListeners)return t;var i=t.eventsAnyListeners.indexOf(e);return i>=0&&t.eventsAnyListeners.splice(i,1),t},off:function(e,t){var i=this;return i.eventsListeners?(e.split(" ").forEach((function(e){void 0===t?i.eventsListeners[e]=[]:i.eventsListeners[e]&&i.eventsListeners[e].forEach((function(a,r){(a===t||a.__emitterProxy&&a.__emitterProxy===t)&&i.eventsListeners[e].splice(r,1)}))})),i):i},emit:function(){var e,t,i,a=this;if(!a.eventsListeners)return a;for(var r=arguments.length,s=new Array(r),o=0;o<r;o++)s[o]=arguments[o];return"string"==typeof s[0]||Array.isArray(s[0])?(e=s[0],t=s.slice(1,s.length),i=a):(e=s[0].events,t=s[0].data,i=s[0].context||a),t.unshift(i),(Array.isArray(e)?e:e.split(" ")).forEach((function(e){a.eventsAnyListeners&&a.eventsAnyListeners.length&&a.eventsAnyListeners.forEach((function(a){a.apply(i,[e].concat(t))})),a.eventsListeners&&a.eventsListeners[e]&&a.eventsListeners[e].forEach((function(e){e.apply(i,t)}))})),a}};var zi={updateSize:function(){var e,t,i=this,a=i.$el;e=void 0!==i.params.width&&null!==i.params.width?i.params.width:a[0].clientWidth,t=void 0!==i.params.height&&null!==i.params.height?i.params.height:a[0].clientHeight,0===e&&i.isHorizontal()||0===t&&i.isVertical()||(e=e-parseInt(a.css("padding-left")||0,10)-parseInt(a.css("padding-right")||0,10),t=t-parseInt(a.css("padding-top")||0,10)-parseInt(a.css("padding-bottom")||0,10),Number.isNaN(e)&&(e=0),Number.isNaN(t)&&(t=0),$i(i,{width:e,height:t,size:i.isHorizontal()?e:t}))},updateSlides:function(){var e=this;function t(t){return e.isHorizontal()?t:{width:"height","margin-top":"margin-left","margin-bottom ":"margin-right","margin-left":"margin-top","margin-right":"margin-bottom","padding-left":"padding-top","padding-right":"padding-bottom",marginRight:"marginBottom"}[t]}function i(e,i){return parseFloat(e.getPropertyValue(t(i))||0)}var a=e.params,r=e.$wrapperEl,s=e.size,o=e.rtlTranslate,n=e.wrongRTL,l=e.virtual&&a.virtual.enabled,d=l?e.virtual.slides.length:e.slides.length,c=r.children("."+e.params.slideClass),h=l?e.virtual.slides.length:c.length,p=[],u=[],m=[],v=a.slidesOffsetBefore;"function"==typeof v&&(v=a.slidesOffsetBefore.call(e));var b=a.slidesOffsetAfter;"function"==typeof b&&(b=a.slidesOffsetAfter.call(e));var g=e.snapGrid.length,f=e.slidesGrid.length,y=a.spaceBetween,w=-v,k=0,x=0;if(void 0!==s){var _,S;"string"==typeof y&&y.indexOf("%")>=0&&(y=parseFloat(y.replace("%",""))/100*s),e.virtualSize=-y,o?c.css({marginLeft:"",marginBottom:"",marginTop:""}):c.css({marginRight:"",marginBottom:"",marginTop:""}),a.slidesPerColumn>1&&(_=Math.floor(h/a.slidesPerColumn)===h/e.params.slidesPerColumn?h:Math.ceil(h/a.slidesPerColumn)*a.slidesPerColumn,"auto"!==a.slidesPerView&&"row"===a.slidesPerColumnFill&&(_=Math.max(_,a.slidesPerView*a.slidesPerColumn)));for(var C,$,T,A=a.slidesPerColumn,E=_/A,P=Math.floor(h/a.slidesPerColumn),M=0;M<h;M+=1){S=0;var L=c.eq(M);if(a.slidesPerColumn>1){var D=void 0,I=void 0,z=void 0;if("row"===a.slidesPerColumnFill&&a.slidesPerGroup>1){var B=Math.floor(M/(a.slidesPerGroup*a.slidesPerColumn)),N=M-a.slidesPerColumn*a.slidesPerGroup*B,O=0===B?a.slidesPerGroup:Math.min(Math.ceil((h-B*A*a.slidesPerGroup)/A),a.slidesPerGroup);D=(I=N-(z=Math.floor(N/O))*O+B*a.slidesPerGroup)+z*_/A,L.css({"-webkit-box-ordinal-group":D,"-moz-box-ordinal-group":D,"-ms-flex-order":D,"-webkit-order":D,order:D})}else"column"===a.slidesPerColumnFill?(z=M-(I=Math.floor(M/A))*A,(I>P||I===P&&z===A-1)&&(z+=1)>=A&&(z=0,I+=1)):I=M-(z=Math.floor(M/E))*E;L.css(t("margin-top"),0!==z?a.spaceBetween&&a.spaceBetween+"px":"")}if("none"!==L.css("display")){if("auto"===a.slidesPerView){var R=getComputedStyle(L[0]),V=L[0].style.transform,F=L[0].style.webkitTransform;if(V&&(L[0].style.transform="none"),F&&(L[0].style.webkitTransform="none"),a.roundLengths)S=e.isHorizontal()?L.outerWidth(!0):L.outerHeight(!0);else{var q=i(R,"width"),H=i(R,"padding-left"),Y=i(R,"padding-right"),G=i(R,"margin-left"),j=i(R,"margin-right"),W=R.getPropertyValue("box-sizing");if(W&&"border-box"===W)S=q+G+j;else{var X=L[0],U=X.clientWidth;S=q+H+Y+G+j+(X.offsetWidth-U)}}V&&(L[0].style.transform=V),F&&(L[0].style.webkitTransform=F),a.roundLengths&&(S=Math.floor(S))}else S=(s-(a.slidesPerView-1)*y)/a.slidesPerView,a.roundLengths&&(S=Math.floor(S)),c[M]&&(c[M].style[t("width")]=S+"px");c[M]&&(c[M].swiperSlideSize=S),m.push(S),a.centeredSlides?(w=w+S/2+k/2+y,0===k&&0!==M&&(w=w-s/2-y),0===M&&(w=w-s/2-y),Math.abs(w)<.001&&(w=0),a.roundLengths&&(w=Math.floor(w)),x%a.slidesPerGroup==0&&p.push(w),u.push(w)):(a.roundLengths&&(w=Math.floor(w)),(x-Math.min(e.params.slidesPerGroupSkip,x))%e.params.slidesPerGroup==0&&p.push(w),u.push(w),w=w+S+y),e.virtualSize+=S+y,k=S,x+=1}}if(e.virtualSize=Math.max(e.virtualSize,s)+b,o&&n&&("slide"===a.effect||"coverflow"===a.effect)&&r.css({width:e.virtualSize+a.spaceBetween+"px"}),a.setWrapperSize)r.css((($={})[t("width")]=e.virtualSize+a.spaceBetween+"px",$));if(a.slidesPerColumn>1)if(e.virtualSize=(S+a.spaceBetween)*_,e.virtualSize=Math.ceil(e.virtualSize/a.slidesPerColumn)-a.spaceBetween,r.css(((T={})[t("width")]=e.virtualSize+a.spaceBetween+"px",T)),a.centeredSlides){C=[];for(var Z=0;Z<p.length;Z+=1){var Q=p[Z];a.roundLengths&&(Q=Math.floor(Q)),p[Z]<e.virtualSize+p[0]&&C.push(Q)}p=C}if(!a.centeredSlides){C=[];for(var J=0;J<p.length;J+=1){var K=p[J];a.roundLengths&&(K=Math.floor(K)),p[J]<=e.virtualSize-s&&C.push(K)}p=C,Math.floor(e.virtualSize-s)-Math.floor(p[p.length-1])>1&&p.push(e.virtualSize-s)}if(0===p.length&&(p=[0]),0!==a.spaceBetween){var ee,te=e.isHorizontal()&&o?"marginLeft":t("marginRight");c.filter((function(e,t){return!a.cssMode||t!==c.length-1})).css(((ee={})[te]=y+"px",ee))}if(a.centeredSlides&&a.centeredSlidesBounds){var ie=0;m.forEach((function(e){ie+=e+(a.spaceBetween?a.spaceBetween:0)}));var ae=(ie-=a.spaceBetween)-s;p=p.map((function(e){return e<0?-v:e>ae?ae+b:e}))}if(a.centerInsufficientSlides){var re=0;if(m.forEach((function(e){re+=e+(a.spaceBetween?a.spaceBetween:0)})),(re-=a.spaceBetween)<s){var se=(s-re)/2;p.forEach((function(e,t){p[t]=e-se})),u.forEach((function(e,t){u[t]=e+se}))}}$i(e,{slides:c,snapGrid:p,slidesGrid:u,slidesSizesGrid:m}),h!==d&&e.emit("slidesLengthChange"),p.length!==g&&(e.params.watchOverflow&&e.checkOverflow(),e.emit("snapGridLengthChange")),u.length!==f&&e.emit("slidesGridLengthChange"),(a.watchSlidesProgress||a.watchSlidesVisibility)&&e.updateSlidesOffset()}},updateAutoHeight:function(e){var t,i=this,a=[],r=i.virtual&&i.params.virtual.enabled,s=0;"number"==typeof e?i.setTransition(e):!0===e&&i.setTransition(i.params.speed);var o=function(e){return r?i.slides.filter((function(t){return parseInt(t.getAttribute("data-swiper-slide-index"),10)===e}))[0]:i.slides.eq(e)[0]};if("auto"!==i.params.slidesPerView&&i.params.slidesPerView>1)if(i.params.centeredSlides)i.visibleSlides.each((function(e){a.push(e)}));else for(t=0;t<Math.ceil(i.params.slidesPerView);t+=1){var n=i.activeIndex+t;if(n>i.slides.length&&!r)break;a.push(o(n))}else a.push(o(i.activeIndex));for(t=0;t<a.length;t+=1)if(void 0!==a[t]){var l=a[t].offsetHeight;s=l>s?l:s}s&&i.$wrapperEl.css("height",s+"px")},updateSlidesOffset:function(){for(var e=this.slides,t=0;t<e.length;t+=1)e[t].swiperSlideOffset=this.isHorizontal()?e[t].offsetLeft:e[t].offsetTop},updateSlidesProgress:function(e){void 0===e&&(e=this&&this.translate||0);var t=this,i=t.params,a=t.slides,r=t.rtlTranslate;if(0!==a.length){void 0===a[0].swiperSlideOffset&&t.updateSlidesOffset();var s=-e;r&&(s=e),a.removeClass(i.slideVisibleClass),t.visibleSlidesIndexes=[],t.visibleSlides=[];for(var o=0;o<a.length;o+=1){var n=a[o],l=(s+(i.centeredSlides?t.minTranslate():0)-n.swiperSlideOffset)/(n.swiperSlideSize+i.spaceBetween);if(i.watchSlidesVisibility||i.centeredSlides&&i.autoHeight){var d=-(s-n.swiperSlideOffset),c=d+t.slidesSizesGrid[o];(d>=0&&d<t.size-1||c>1&&c<=t.size||d<=0&&c>=t.size)&&(t.visibleSlides.push(n),t.visibleSlidesIndexes.push(o),a.eq(o).addClass(i.slideVisibleClass))}n.progress=r?-l:l}t.visibleSlides=Fe(t.visibleSlides)}},updateProgress:function(e){var t=this;if(void 0===e){var i=t.rtlTranslate?-1:1;e=t&&t.translate&&t.translate*i||0}var a=t.params,r=t.maxTranslate()-t.minTranslate(),s=t.progress,o=t.isBeginning,n=t.isEnd,l=o,d=n;0===r?(s=0,o=!0,n=!0):(o=(s=(e-t.minTranslate())/r)<=0,n=s>=1),$i(t,{progress:s,isBeginning:o,isEnd:n}),(a.watchSlidesProgress||a.watchSlidesVisibility||a.centeredSlides&&a.autoHeight)&&t.updateSlidesProgress(e),o&&!l&&t.emit("reachBeginning toEdge"),n&&!d&&t.emit("reachEnd toEdge"),(l&&!o||d&&!n)&&t.emit("fromEdge"),t.emit("progress",s)},updateSlidesClasses:function(){var e,t=this,i=t.slides,a=t.params,r=t.$wrapperEl,s=t.activeIndex,o=t.realIndex,n=t.virtual&&a.virtual.enabled;i.removeClass(a.slideActiveClass+" "+a.slideNextClass+" "+a.slidePrevClass+" "+a.slideDuplicateActiveClass+" "+a.slideDuplicateNextClass+" "+a.slideDuplicatePrevClass),(e=n?t.$wrapperEl.find("."+a.slideClass+'[data-swiper-slide-index="'+s+'"]'):i.eq(s)).addClass(a.slideActiveClass),a.loop&&(e.hasClass(a.slideDuplicateClass)?r.children("."+a.slideClass+":not(."+a.slideDuplicateClass+')[data-swiper-slide-index="'+o+'"]').addClass(a.slideDuplicateActiveClass):r.children("."+a.slideClass+"."+a.slideDuplicateClass+'[data-swiper-slide-index="'+o+'"]').addClass(a.slideDuplicateActiveClass));var l=e.nextAll("."+a.slideClass).eq(0).addClass(a.slideNextClass);a.loop&&0===l.length&&(l=i.eq(0)).addClass(a.slideNextClass);var d=e.prevAll("."+a.slideClass).eq(0).addClass(a.slidePrevClass);a.loop&&0===d.length&&(d=i.eq(-1)).addClass(a.slidePrevClass),a.loop&&(l.hasClass(a.slideDuplicateClass)?r.children("."+a.slideClass+":not(."+a.slideDuplicateClass+')[data-swiper-slide-index="'+l.attr("data-swiper-slide-index")+'"]').addClass(a.slideDuplicateNextClass):r.children("."+a.slideClass+"."+a.slideDuplicateClass+'[data-swiper-slide-index="'+l.attr("data-swiper-slide-index")+'"]').addClass(a.slideDuplicateNextClass),d.hasClass(a.slideDuplicateClass)?r.children("."+a.slideClass+":not(."+a.slideDuplicateClass+')[data-swiper-slide-index="'+d.attr("data-swiper-slide-index")+'"]').addClass(a.slideDuplicatePrevClass):r.children("."+a.slideClass+"."+a.slideDuplicateClass+'[data-swiper-slide-index="'+d.attr("data-swiper-slide-index")+'"]').addClass(a.slideDuplicatePrevClass)),t.emitSlidesClasses()},updateActiveIndex:function(e){var t,i=this,a=i.rtlTranslate?i.translate:-i.translate,r=i.slidesGrid,s=i.snapGrid,o=i.params,n=i.activeIndex,l=i.realIndex,d=i.snapIndex,c=e;if(void 0===c){for(var h=0;h<r.length;h+=1)void 0!==r[h+1]?a>=r[h]&&a<r[h+1]-(r[h+1]-r[h])/2?c=h:a>=r[h]&&a<r[h+1]&&(c=h+1):a>=r[h]&&(c=h);o.normalizeSlideIndex&&(c<0||void 0===c)&&(c=0)}if(s.indexOf(a)>=0)t=s.indexOf(a);else{var p=Math.min(o.slidesPerGroupSkip,c);t=p+Math.floor((c-p)/o.slidesPerGroup)}if(t>=s.length&&(t=s.length-1),c!==n){var u=parseInt(i.slides.eq(c).attr("data-swiper-slide-index")||c,10);$i(i,{snapIndex:t,realIndex:u,previousIndex:n,activeIndex:c}),i.emit("activeIndexChange"),i.emit("snapIndexChange"),l!==u&&i.emit("realIndexChange"),(i.initialized||i.params.runCallbacksOnInit)&&i.emit("slideChange")}else t!==d&&(i.snapIndex=t,i.emit("snapIndexChange"))},updateClickedSlide:function(e){var t,i=this,a=i.params,r=Fe(e.target).closest("."+a.slideClass)[0],s=!1;if(r)for(var o=0;o<i.slides.length;o+=1)if(i.slides[o]===r){s=!0,t=o;break}if(!r||!s)return i.clickedSlide=void 0,void(i.clickedIndex=void 0);i.clickedSlide=r,i.virtual&&i.params.virtual.enabled?i.clickedIndex=parseInt(Fe(r).attr("data-swiper-slide-index"),10):i.clickedIndex=t,a.slideToClickedSlide&&void 0!==i.clickedIndex&&i.clickedIndex!==i.activeIndex&&i.slideToClickedSlide()}};var Bi={getTranslate:function(e){void 0===e&&(e=this.isHorizontal()?"x":"y");var t=this,i=t.params,a=t.rtlTranslate,r=t.translate,s=t.$wrapperEl;if(i.virtualTranslate)return a?-r:r;if(i.cssMode)return r;var o=Si(s[0],e);return a&&(o=-o),o||0},setTranslate:function(e,t){var i=this,a=i.rtlTranslate,r=i.params,s=i.$wrapperEl,o=i.wrapperEl,n=i.progress,l=0,d=0;i.isHorizontal()?l=a?-e:e:d=e,r.roundLengths&&(l=Math.floor(l),d=Math.floor(d)),r.cssMode?o[i.isHorizontal()?"scrollLeft":"scrollTop"]=i.isHorizontal()?-l:-d:r.virtualTranslate||s.transform("translate3d("+l+"px, "+d+"px, 0px)"),i.previousTranslate=i.translate,i.translate=i.isHorizontal()?l:d;var c=i.maxTranslate()-i.minTranslate();(0===c?0:(e-i.minTranslate())/c)!==n&&i.updateProgress(e),i.emit("setTranslate",i.translate,t)},minTranslate:function(){return-this.snapGrid[0]},maxTranslate:function(){return-this.snapGrid[this.snapGrid.length-1]},translateTo:function(e,t,i,a,r){void 0===e&&(e=0),void 0===t&&(t=this.params.speed),void 0===i&&(i=!0),void 0===a&&(a=!0);var s=this,o=s.params,n=s.wrapperEl;if(s.animating&&o.preventInteractionOnTransition)return!1;var l,d=s.minTranslate(),c=s.maxTranslate();if(l=a&&e>d?d:a&&e<c?c:e,s.updateProgress(l),o.cssMode){var h,p=s.isHorizontal();if(0===t)n[p?"scrollLeft":"scrollTop"]=-l;else if(n.scrollTo)n.scrollTo(((h={})[p?"left":"top"]=-l,h.behavior="smooth",h));else n[p?"scrollLeft":"scrollTop"]=-l;return!0}return 0===t?(s.setTransition(0),s.setTranslate(l),i&&(s.emit("beforeTransitionStart",t,r),s.emit("transitionEnd"))):(s.setTransition(t),s.setTranslate(l),i&&(s.emit("beforeTransitionStart",t,r),s.emit("transitionStart")),s.animating||(s.animating=!0,s.onTranslateToWrapperTransitionEnd||(s.onTranslateToWrapperTransitionEnd=function(e){s&&!s.destroyed&&e.target===this&&(s.$wrapperEl[0].removeEventListener("transitionend",s.onTranslateToWrapperTransitionEnd),s.$wrapperEl[0].removeEventListener("webkitTransitionEnd",s.onTranslateToWrapperTransitionEnd),s.onTranslateToWrapperTransitionEnd=null,delete s.onTranslateToWrapperTransitionEnd,i&&s.emit("transitionEnd"))}),s.$wrapperEl[0].addEventListener("transitionend",s.onTranslateToWrapperTransitionEnd),s.$wrapperEl[0].addEventListener("webkitTransitionEnd",s.onTranslateToWrapperTransitionEnd))),!0}};var Ni={slideTo:function(e,t,i,a,r){if(void 0===e&&(e=0),void 0===t&&(t=this.params.speed),void 0===i&&(i=!0),"number"!=typeof e&&"string"!=typeof e)throw new Error("The 'index' argument cannot have type other than 'number' or 'string'. ["+typeof e+"] given.");if("string"==typeof e){var s=parseInt(e,10);if(!isFinite(s))throw new Error("The passed-in 'index' (string) couldn't be converted to 'number'. ["+e+"] given.");e=s}var o=this,n=e;n<0&&(n=0);var l=o.params,d=o.snapGrid,c=o.slidesGrid,h=o.previousIndex,p=o.activeIndex,u=o.rtlTranslate,m=o.wrapperEl,v=o.enabled;if(o.animating&&l.preventInteractionOnTransition||!v&&!a&&!r)return!1;var b=Math.min(o.params.slidesPerGroupSkip,n),g=b+Math.floor((n-b)/o.params.slidesPerGroup);g>=d.length&&(g=d.length-1),(p||l.initialSlide||0)===(h||0)&&i&&o.emit("beforeSlideChangeStart");var f,y=-d[g];if(o.updateProgress(y),l.normalizeSlideIndex)for(var w=0;w<c.length;w+=1){var k=-Math.floor(100*y),x=Math.floor(100*c[w]),_=Math.floor(100*c[w+1]);void 0!==c[w+1]?k>=x&&k<_-(_-x)/2?n=w:k>=x&&k<_&&(n=w+1):k>=x&&(n=w)}if(o.initialized&&n!==p){if(!o.allowSlideNext&&y<o.translate&&y<o.minTranslate())return!1;if(!o.allowSlidePrev&&y>o.translate&&y>o.maxTranslate()&&(p||0)!==n)return!1}if(f=n>p?"next":n<p?"prev":"reset",u&&-y===o.translate||!u&&y===o.translate)return o.updateActiveIndex(n),l.autoHeight&&o.updateAutoHeight(),o.updateSlidesClasses(),"slide"!==l.effect&&o.setTranslate(y),"reset"!==f&&(o.transitionStart(i,f),o.transitionEnd(i,f)),!1;if(l.cssMode){var S,C=o.isHorizontal(),$=-y;if(u&&($=m.scrollWidth-m.offsetWidth-$),0===t)m[C?"scrollLeft":"scrollTop"]=$;else if(m.scrollTo)m.scrollTo(((S={})[C?"left":"top"]=$,S.behavior="smooth",S));else m[C?"scrollLeft":"scrollTop"]=$;return!0}return 0===t?(o.setTransition(0),o.setTranslate(y),o.updateActiveIndex(n),o.updateSlidesClasses(),o.emit("beforeTransitionStart",t,a),o.transitionStart(i,f),o.transitionEnd(i,f)):(o.setTransition(t),o.setTranslate(y),o.updateActiveIndex(n),o.updateSlidesClasses(),o.emit("beforeTransitionStart",t,a),o.transitionStart(i,f),o.animating||(o.animating=!0,o.onSlideToWrapperTransitionEnd||(o.onSlideToWrapperTransitionEnd=function(e){o&&!o.destroyed&&e.target===this&&(o.$wrapperEl[0].removeEventListener("transitionend",o.onSlideToWrapperTransitionEnd),o.$wrapperEl[0].removeEventListener("webkitTransitionEnd",o.onSlideToWrapperTransitionEnd),o.onSlideToWrapperTransitionEnd=null,delete o.onSlideToWrapperTransitionEnd,o.transitionEnd(i,f))}),o.$wrapperEl[0].addEventListener("transitionend",o.onSlideToWrapperTransitionEnd),o.$wrapperEl[0].addEventListener("webkitTransitionEnd",o.onSlideToWrapperTransitionEnd))),!0},slideToLoop:function(e,t,i,a){void 0===e&&(e=0),void 0===t&&(t=this.params.speed),void 0===i&&(i=!0);var r=this,s=e;return r.params.loop&&(s+=r.loopedSlides),r.slideTo(s,t,i,a)},slideNext:function(e,t,i){void 0===e&&(e=this.params.speed),void 0===t&&(t=!0);var a=this,r=a.params,s=a.animating;if(!a.enabled)return a;var o=a.activeIndex<r.slidesPerGroupSkip?1:r.slidesPerGroup;if(r.loop){if(s&&r.loopPreventsSlide)return!1;a.loopFix(),a._clientLeft=a.$wrapperEl[0].clientLeft}return a.slideTo(a.activeIndex+o,e,t,i)},slidePrev:function(e,t,i){void 0===e&&(e=this.params.speed),void 0===t&&(t=!0);var a=this,r=a.params,s=a.animating,o=a.snapGrid,n=a.slidesGrid,l=a.rtlTranslate;if(!a.enabled)return a;if(r.loop){if(s&&r.loopPreventsSlide)return!1;a.loopFix(),a._clientLeft=a.$wrapperEl[0].clientLeft}function d(e){return e<0?-Math.floor(Math.abs(e)):Math.floor(e)}var c,h=d(l?a.translate:-a.translate),p=o.map((function(e){return d(e)})),u=o[p.indexOf(h)-1];return void 0===u&&r.cssMode&&o.forEach((function(e){!u&&h>=e&&(u=e)})),void 0!==u&&(c=n.indexOf(u))<0&&(c=a.activeIndex-1),a.slideTo(c,e,t,i)},slideReset:function(e,t,i){return void 0===e&&(e=this.params.speed),void 0===t&&(t=!0),this.slideTo(this.activeIndex,e,t,i)},slideToClosest:function(e,t,i,a){void 0===e&&(e=this.params.speed),void 0===t&&(t=!0),void 0===a&&(a=.5);var r=this,s=r.activeIndex,o=Math.min(r.params.slidesPerGroupSkip,s),n=o+Math.floor((s-o)/r.params.slidesPerGroup),l=r.rtlTranslate?r.translate:-r.translate;if(l>=r.snapGrid[n]){var d=r.snapGrid[n];l-d>(r.snapGrid[n+1]-d)*a&&(s+=r.params.slidesPerGroup)}else{var c=r.snapGrid[n-1];l-c<=(r.snapGrid[n]-c)*a&&(s-=r.params.slidesPerGroup)}return s=Math.max(s,0),s=Math.min(s,r.slidesGrid.length-1),r.slideTo(s,e,t,i)},slideToClickedSlide:function(){var e,t=this,i=t.params,a=t.$wrapperEl,r="auto"===i.slidesPerView?t.slidesPerViewDynamic():i.slidesPerView,s=t.clickedIndex;if(i.loop){if(t.animating)return;e=parseInt(Fe(t.clickedSlide).attr("data-swiper-slide-index"),10),i.centeredSlides?s<t.loopedSlides-r/2||s>t.slides.length-t.loopedSlides+r/2?(t.loopFix(),s=a.children("."+i.slideClass+'[data-swiper-slide-index="'+e+'"]:not(.'+i.slideDuplicateClass+")").eq(0).index(),xi((function(){t.slideTo(s)}))):t.slideTo(s):s>t.slides.length-r?(t.loopFix(),s=a.children("."+i.slideClass+'[data-swiper-slide-index="'+e+'"]:not(.'+i.slideDuplicateClass+")").eq(0).index(),xi((function(){t.slideTo(s)}))):t.slideTo(s)}else t.slideTo(s)}};var Oi={loopCreate:function(){var e=this,t=Ct(),i=e.params,a=e.$wrapperEl;a.children("."+i.slideClass+"."+i.slideDuplicateClass).remove();var r=a.children("."+i.slideClass);if(i.loopFillGroupWithBlank){var s=i.slidesPerGroup-r.length%i.slidesPerGroup;if(s!==i.slidesPerGroup){for(var o=0;o<s;o+=1){var n=Fe(t.createElement("div")).addClass(i.slideClass+" "+i.slideBlankClass);a.append(n)}r=a.children("."+i.slideClass)}}"auto"!==i.slidesPerView||i.loopedSlides||(i.loopedSlides=r.length),e.loopedSlides=Math.ceil(parseFloat(i.loopedSlides||i.slidesPerView,10)),e.loopedSlides+=i.loopAdditionalSlides,e.loopedSlides>r.length&&(e.loopedSlides=r.length);var l=[],d=[];r.each((function(t,i){var a=Fe(t);i<e.loopedSlides&&d.push(t),i<r.length&&i>=r.length-e.loopedSlides&&l.push(t),a.attr("data-swiper-slide-index",i)}));for(var c=0;c<d.length;c+=1)a.append(Fe(d[c].cloneNode(!0)).addClass(i.slideDuplicateClass));for(var h=l.length-1;h>=0;h-=1)a.prepend(Fe(l[h].cloneNode(!0)).addClass(i.slideDuplicateClass))},loopFix:function(){var e=this;e.emit("beforeLoopFix");var t,i=e.activeIndex,a=e.slides,r=e.loopedSlides,s=e.allowSlidePrev,o=e.allowSlideNext,n=e.snapGrid,l=e.rtlTranslate;e.allowSlidePrev=!0,e.allowSlideNext=!0;var d=-n[i]-e.getTranslate();if(i<r)t=a.length-3*r+i,t+=r,e.slideTo(t,0,!1,!0)&&0!==d&&e.setTranslate((l?-e.translate:e.translate)-d);else if(i>=a.length-r){t=-a.length+i+r,t+=r,e.slideTo(t,0,!1,!0)&&0!==d&&e.setTranslate((l?-e.translate:e.translate)-d)}e.allowSlidePrev=s,e.allowSlideNext=o,e.emit("loopFix")},loopDestroy:function(){var e=this,t=e.$wrapperEl,i=e.params,a=e.slides;t.children("."+i.slideClass+"."+i.slideDuplicateClass+",."+i.slideClass+"."+i.slideBlankClass).remove(),a.removeAttr("data-swiper-slide-index")}};var Ri={appendSlide:function(e){var t=this,i=t.$wrapperEl,a=t.params;if(a.loop&&t.loopDestroy(),"object"==typeof e&&"length"in e)for(var r=0;r<e.length;r+=1)e[r]&&i.append(e[r]);else i.append(e);a.loop&&t.loopCreate(),a.observer&&t.support.observer||t.update()},prependSlide:function(e){var t=this,i=t.params,a=t.$wrapperEl,r=t.activeIndex;i.loop&&t.loopDestroy();var s=r+1;if("object"==typeof e&&"length"in e){for(var o=0;o<e.length;o+=1)e[o]&&a.prepend(e[o]);s=r+e.length}else a.prepend(e);i.loop&&t.loopCreate(),i.observer&&t.support.observer||t.update(),t.slideTo(s,0,!1)},addSlide:function(e,t){var i=this,a=i.$wrapperEl,r=i.params,s=i.activeIndex;r.loop&&(s-=i.loopedSlides,i.loopDestroy(),i.slides=a.children("."+r.slideClass));var o=i.slides.length;if(e<=0)i.prependSlide(t);else if(e>=o)i.appendSlide(t);else{for(var n=s>e?s+1:s,l=[],d=o-1;d>=e;d-=1){var c=i.slides.eq(d);c.remove(),l.unshift(c)}if("object"==typeof t&&"length"in t){for(var h=0;h<t.length;h+=1)t[h]&&a.append(t[h]);n=s>e?s+t.length:s}else a.append(t);for(var p=0;p<l.length;p+=1)a.append(l[p]);r.loop&&i.loopCreate(),r.observer&&i.support.observer||i.update(),r.loop?i.slideTo(n+i.loopedSlides,0,!1):i.slideTo(n,0,!1)}},removeSlide:function(e){var t=this,i=t.params,a=t.$wrapperEl,r=t.activeIndex;i.loop&&(r-=t.loopedSlides,t.loopDestroy(),t.slides=a.children("."+i.slideClass));var s,o=r;if("object"==typeof e&&"length"in e){for(var n=0;n<e.length;n+=1)s=e[n],t.slides[s]&&t.slides.eq(s).remove(),s<o&&(o-=1);o=Math.max(o,0)}else s=e,t.slides[s]&&t.slides.eq(s).remove(),s<o&&(o-=1),o=Math.max(o,0);i.loop&&t.loopCreate(),i.observer&&t.support.observer||t.update(),i.loop?t.slideTo(o+t.loopedSlides,0,!1):t.slideTo(o,0,!1)},removeAllSlides:function(){for(var e=[],t=0;t<this.slides.length;t+=1)e.push(t);this.removeSlide(e)}};function Vi(e){var t=this,i=Ct(),a=St(),r=t.touchEventsData,s=t.params,o=t.touches;if(t.enabled&&(!t.animating||!s.preventInteractionOnTransition)){var n=e;n.originalEvent&&(n=n.originalEvent);var l=Fe(n.target);if(("wrapper"!==s.touchEventsTarget||l.closest(t.wrapperEl).length)&&(r.isTouchEvent="touchstart"===n.type,(r.isTouchEvent||!("which"in n)||3!==n.which)&&!(!r.isTouchEvent&&"button"in n&&n.button>0||r.isTouched&&r.isMoved))){!!s.noSwipingClass&&""!==s.noSwipingClass&&n.target&&n.target.shadowRoot&&e.path&&e.path[0]&&(l=Fe(e.path[0]));var d=s.noSwipingSelector?s.noSwipingSelector:"."+s.noSwipingClass,c=!(!n.target||!n.target.shadowRoot);if(s.noSwiping&&(c?function(e,t){return void 0===t&&(t=this),function t(i){return i&&i!==Ct()&&i!==St()?(i.assignedSlot&&(i=i.assignedSlot),i.closest(e)||t(i.getRootNode().host)):null}(t)}(d,n.target):l.closest(d)[0]))t.allowClick=!0;else if(!s.swipeHandler||l.closest(s.swipeHandler)[0]){o.currentX="touchstart"===n.type?n.targetTouches[0].pageX:n.pageX,o.currentY="touchstart"===n.type?n.targetTouches[0].pageY:n.pageY;var h=o.currentX,p=o.currentY,u=s.edgeSwipeDetection||s.iOSEdgeSwipeDetection,m=s.edgeSwipeThreshold||s.iOSEdgeSwipeThreshold;if(u&&(h<=m||h>=a.innerWidth-m)){if("prevent"!==u)return;e.preventDefault()}if($i(r,{isTouched:!0,isMoved:!1,allowTouchCallbacks:!0,isScrolling:void 0,startMoving:void 0}),o.startX=h,o.startY=p,r.touchStartTime=_i(),t.allowClick=!0,t.updateSize(),t.swipeDirection=void 0,s.threshold>0&&(r.allowThresholdMove=!1),"touchstart"!==n.type){var v=!0;l.is(r.focusableElements)&&(v=!1),i.activeElement&&Fe(i.activeElement).is(r.focusableElements)&&i.activeElement!==l[0]&&i.activeElement.blur();var b=v&&t.allowTouchMove&&s.touchStartPreventDefault;!s.touchStartForcePreventDefault&&!b||l[0].isContentEditable||n.preventDefault()}t.emit("touchStart",n)}}}}function Fi(e){var t=Ct(),i=this,a=i.touchEventsData,r=i.params,s=i.touches,o=i.rtlTranslate;if(i.enabled){var n=e;if(n.originalEvent&&(n=n.originalEvent),a.isTouched){if(!a.isTouchEvent||"touchmove"===n.type){var l="touchmove"===n.type&&n.targetTouches&&(n.targetTouches[0]||n.changedTouches[0]),d="touchmove"===n.type?l.pageX:n.pageX,c="touchmove"===n.type?l.pageY:n.pageY;if(n.preventedByNestedSwiper)return s.startX=d,void(s.startY=c);if(!i.allowTouchMove)return i.allowClick=!1,void(a.isTouched&&($i(s,{startX:d,startY:c,currentX:d,currentY:c}),a.touchStartTime=_i()));if(a.isTouchEvent&&r.touchReleaseOnEdges&&!r.loop)if(i.isVertical()){if(c<s.startY&&i.translate<=i.maxTranslate()||c>s.startY&&i.translate>=i.minTranslate())return a.isTouched=!1,void(a.isMoved=!1)}else if(d<s.startX&&i.translate<=i.maxTranslate()||d>s.startX&&i.translate>=i.minTranslate())return;if(a.isTouchEvent&&t.activeElement&&n.target===t.activeElement&&Fe(n.target).is(a.focusableElements))return a.isMoved=!0,void(i.allowClick=!1);if(a.allowTouchCallbacks&&i.emit("touchMove",n),!(n.targetTouches&&n.targetTouches.length>1)){s.currentX=d,s.currentY=c;var h=s.currentX-s.startX,p=s.currentY-s.startY;if(!(i.params.threshold&&Math.sqrt(Math.pow(h,2)+Math.pow(p,2))<i.params.threshold)){var u;if(void 0===a.isScrolling)i.isHorizontal()&&s.currentY===s.startY||i.isVertical()&&s.currentX===s.startX?a.isScrolling=!1:h*h+p*p>=25&&(u=180*Math.atan2(Math.abs(p),Math.abs(h))/Math.PI,a.isScrolling=i.isHorizontal()?u>r.touchAngle:90-u>r.touchAngle);if(a.isScrolling&&i.emit("touchMoveOpposite",n),void 0===a.startMoving&&(s.currentX===s.startX&&s.currentY===s.startY||(a.startMoving=!0)),a.isScrolling)a.isTouched=!1;else if(a.startMoving){i.allowClick=!1,!r.cssMode&&n.cancelable&&n.preventDefault(),r.touchMoveStopPropagation&&!r.nested&&n.stopPropagation(),a.isMoved||(r.loop&&i.loopFix(),a.startTranslate=i.getTranslate(),i.setTransition(0),i.animating&&i.$wrapperEl.trigger("webkitTransitionEnd transitionend"),a.allowMomentumBounce=!1,!r.grabCursor||!0!==i.allowSlideNext&&!0!==i.allowSlidePrev||i.setGrabCursor(!0),i.emit("sliderFirstMove",n)),i.emit("sliderMove",n),a.isMoved=!0;var m=i.isHorizontal()?h:p;s.diff=m,m*=r.touchRatio,o&&(m=-m),i.swipeDirection=m>0?"prev":"next",a.currentTranslate=m+a.startTranslate;var v=!0,b=r.resistanceRatio;if(r.touchReleaseOnEdges&&(b=0),m>0&&a.currentTranslate>i.minTranslate()?(v=!1,r.resistance&&(a.currentTranslate=i.minTranslate()-1+Math.pow(-i.minTranslate()+a.startTranslate+m,b))):m<0&&a.currentTranslate<i.maxTranslate()&&(v=!1,r.resistance&&(a.currentTranslate=i.maxTranslate()+1-Math.pow(i.maxTranslate()-a.startTranslate-m,b))),v&&(n.preventedByNestedSwiper=!0),!i.allowSlideNext&&"next"===i.swipeDirection&&a.currentTranslate<a.startTranslate&&(a.currentTranslate=a.startTranslate),!i.allowSlidePrev&&"prev"===i.swipeDirection&&a.currentTranslate>a.startTranslate&&(a.currentTranslate=a.startTranslate),i.allowSlidePrev||i.allowSlideNext||(a.currentTranslate=a.startTranslate),r.threshold>0){if(!(Math.abs(m)>r.threshold||a.allowThresholdMove))return void(a.currentTranslate=a.startTranslate);if(!a.allowThresholdMove)return a.allowThresholdMove=!0,s.startX=s.currentX,s.startY=s.currentY,a.currentTranslate=a.startTranslate,void(s.diff=i.isHorizontal()?s.currentX-s.startX:s.currentY-s.startY)}r.followFinger&&!r.cssMode&&((r.freeMode||r.watchSlidesProgress||r.watchSlidesVisibility)&&(i.updateActiveIndex(),i.updateSlidesClasses()),r.freeMode&&(0===a.velocities.length&&a.velocities.push({position:s[i.isHorizontal()?"startX":"startY"],time:a.touchStartTime}),a.velocities.push({position:s[i.isHorizontal()?"currentX":"currentY"],time:_i()})),i.updateProgress(a.currentTranslate),i.setTranslate(a.currentTranslate))}}}}}else a.startMoving&&a.isScrolling&&i.emit("touchMoveOpposite",n)}}function qi(e){var t=this,i=t.touchEventsData,a=t.params,r=t.touches,s=t.rtlTranslate,o=t.$wrapperEl,n=t.slidesGrid,l=t.snapGrid;if(t.enabled){var d=e;if(d.originalEvent&&(d=d.originalEvent),i.allowTouchCallbacks&&t.emit("touchEnd",d),i.allowTouchCallbacks=!1,!i.isTouched)return i.isMoved&&a.grabCursor&&t.setGrabCursor(!1),i.isMoved=!1,void(i.startMoving=!1);a.grabCursor&&i.isMoved&&i.isTouched&&(!0===t.allowSlideNext||!0===t.allowSlidePrev)&&t.setGrabCursor(!1);var c,h=_i(),p=h-i.touchStartTime;if(t.allowClick&&(t.updateClickedSlide(d),t.emit("tap click",d),p<300&&h-i.lastClickTime<300&&t.emit("doubleTap doubleClick",d)),i.lastClickTime=_i(),xi((function(){t.destroyed||(t.allowClick=!0)})),!i.isTouched||!i.isMoved||!t.swipeDirection||0===r.diff||i.currentTranslate===i.startTranslate)return i.isTouched=!1,i.isMoved=!1,void(i.startMoving=!1);if(i.isTouched=!1,i.isMoved=!1,i.startMoving=!1,c=a.followFinger?s?t.translate:-t.translate:-i.currentTranslate,!a.cssMode)if(a.freeMode){if(c<-t.minTranslate())return void t.slideTo(t.activeIndex);if(c>-t.maxTranslate())return void(t.slides.length<l.length?t.slideTo(l.length-1):t.slideTo(t.slides.length-1));if(a.freeModeMomentum){if(i.velocities.length>1){var u=i.velocities.pop(),m=i.velocities.pop(),v=u.position-m.position,b=u.time-m.time;t.velocity=v/b,t.velocity/=2,Math.abs(t.velocity)<a.freeModeMinimumVelocity&&(t.velocity=0),(b>150||_i()-u.time>300)&&(t.velocity=0)}else t.velocity=0;t.velocity*=a.freeModeMomentumVelocityRatio,i.velocities.length=0;var g=1e3*a.freeModeMomentumRatio,f=t.velocity*g,y=t.translate+f;s&&(y=-y);var w,k,x=!1,_=20*Math.abs(t.velocity)*a.freeModeMomentumBounceRatio;if(y<t.maxTranslate())a.freeModeMomentumBounce?(y+t.maxTranslate()<-_&&(y=t.maxTranslate()-_),w=t.maxTranslate(),x=!0,i.allowMomentumBounce=!0):y=t.maxTranslate(),a.loop&&a.centeredSlides&&(k=!0);else if(y>t.minTranslate())a.freeModeMomentumBounce?(y-t.minTranslate()>_&&(y=t.minTranslate()+_),w=t.minTranslate(),x=!0,i.allowMomentumBounce=!0):y=t.minTranslate(),a.loop&&a.centeredSlides&&(k=!0);else if(a.freeModeSticky){for(var S,C=0;C<l.length;C+=1)if(l[C]>-y){S=C;break}y=-(y=Math.abs(l[S]-y)<Math.abs(l[S-1]-y)||"next"===t.swipeDirection?l[S]:l[S-1])}if(k&&t.once("transitionEnd",(function(){t.loopFix()})),0!==t.velocity){if(g=s?Math.abs((-y-t.translate)/t.velocity):Math.abs((y-t.translate)/t.velocity),a.freeModeSticky){var $=Math.abs((s?-y:y)-t.translate),T=t.slidesSizesGrid[t.activeIndex];g=$<T?a.speed:$<2*T?1.5*a.speed:2.5*a.speed}}else if(a.freeModeSticky)return void t.slideToClosest();a.freeModeMomentumBounce&&x?(t.updateProgress(w),t.setTransition(g),t.setTranslate(y),t.transitionStart(!0,t.swipeDirection),t.animating=!0,o.transitionEnd((function(){t&&!t.destroyed&&i.allowMomentumBounce&&(t.emit("momentumBounce"),t.setTransition(a.speed),setTimeout((function(){t.setTranslate(w),o.transitionEnd((function(){t&&!t.destroyed&&t.transitionEnd()}))}),0))}))):t.velocity?(t.updateProgress(y),t.setTransition(g),t.setTranslate(y),t.transitionStart(!0,t.swipeDirection),t.animating||(t.animating=!0,o.transitionEnd((function(){t&&!t.destroyed&&t.transitionEnd()})))):(t.emit("_freeModeNoMomentumRelease"),t.updateProgress(y)),t.updateActiveIndex(),t.updateSlidesClasses()}else{if(a.freeModeSticky)return void t.slideToClosest();a.freeMode&&t.emit("_freeModeNoMomentumRelease")}(!a.freeModeMomentum||p>=a.longSwipesMs)&&(t.updateProgress(),t.updateActiveIndex(),t.updateSlidesClasses())}else{for(var A=0,E=t.slidesSizesGrid[0],P=0;P<n.length;P+=P<a.slidesPerGroupSkip?1:a.slidesPerGroup){var M=P<a.slidesPerGroupSkip-1?1:a.slidesPerGroup;void 0!==n[P+M]?c>=n[P]&&c<n[P+M]&&(A=P,E=n[P+M]-n[P]):c>=n[P]&&(A=P,E=n[n.length-1]-n[n.length-2])}var L=(c-n[A])/E,D=A<a.slidesPerGroupSkip-1?1:a.slidesPerGroup;if(p>a.longSwipesMs){if(!a.longSwipes)return void t.slideTo(t.activeIndex);"next"===t.swipeDirection&&(L>=a.longSwipesRatio?t.slideTo(A+D):t.slideTo(A)),"prev"===t.swipeDirection&&(L>1-a.longSwipesRatio?t.slideTo(A+D):t.slideTo(A))}else{if(!a.shortSwipes)return void t.slideTo(t.activeIndex);t.navigation&&(d.target===t.navigation.nextEl||d.target===t.navigation.prevEl)?d.target===t.navigation.nextEl?t.slideTo(A+D):t.slideTo(A):("next"===t.swipeDirection&&t.slideTo(A+D),"prev"===t.swipeDirection&&t.slideTo(A))}}}}function Hi(){var e=this,t=e.params,i=e.el;if(!i||0!==i.offsetWidth){t.breakpoints&&e.setBreakpoint();var a=e.allowSlideNext,r=e.allowSlidePrev,s=e.snapGrid;e.allowSlideNext=!0,e.allowSlidePrev=!0,e.updateSize(),e.updateSlides(),e.updateSlidesClasses(),("auto"===t.slidesPerView||t.slidesPerView>1)&&e.isEnd&&!e.isBeginning&&!e.params.centeredSlides?e.slideTo(e.slides.length-1,0,!1,!0):e.slideTo(e.activeIndex,0,!1,!0),e.autoplay&&e.autoplay.running&&e.autoplay.paused&&e.autoplay.run(),e.allowSlidePrev=r,e.allowSlideNext=a,e.params.watchOverflow&&s!==e.snapGrid&&e.checkOverflow()}}function Yi(e){var t=this;t.enabled&&(t.allowClick||(t.params.preventClicks&&e.preventDefault(),t.params.preventClicksPropagation&&t.animating&&(e.stopPropagation(),e.stopImmediatePropagation())))}function Gi(){var e=this,t=e.wrapperEl,i=e.rtlTranslate;if(e.enabled){e.previousTranslate=e.translate,e.isHorizontal()?e.translate=i?t.scrollWidth-t.offsetWidth-t.scrollLeft:-t.scrollLeft:e.translate=-t.scrollTop,-0===e.translate&&(e.translate=0),e.updateActiveIndex(),e.updateSlidesClasses();var a=e.maxTranslate()-e.minTranslate();(0===a?0:(e.translate-e.minTranslate())/a)!==e.progress&&e.updateProgress(i?-e.translate:e.translate),e.emit("setTranslate",e.translate,!1)}}var ji=!1;function Wi(){}var Xi={attachEvents:function(){var e=this,t=Ct(),i=e.params,a=e.touchEvents,r=e.el,s=e.wrapperEl,o=e.device,n=e.support;e.onTouchStart=Vi.bind(e),e.onTouchMove=Fi.bind(e),e.onTouchEnd=qi.bind(e),i.cssMode&&(e.onScroll=Gi.bind(e)),e.onClick=Yi.bind(e);var l=!!i.nested;if(!n.touch&&n.pointerEvents)r.addEventListener(a.start,e.onTouchStart,!1),t.addEventListener(a.move,e.onTouchMove,l),t.addEventListener(a.end,e.onTouchEnd,!1);else{if(n.touch){var d=!("touchstart"!==a.start||!n.passiveListener||!i.passiveListeners)&&{passive:!0,capture:!1};r.addEventListener(a.start,e.onTouchStart,d),r.addEventListener(a.move,e.onTouchMove,n.passiveListener?{passive:!1,capture:l}:l),r.addEventListener(a.end,e.onTouchEnd,d),a.cancel&&r.addEventListener(a.cancel,e.onTouchEnd,d),ji||(t.addEventListener("touchstart",Wi),ji=!0)}(i.simulateTouch&&!o.ios&&!o.android||i.simulateTouch&&!n.touch&&o.ios)&&(r.addEventListener("mousedown",e.onTouchStart,!1),t.addEventListener("mousemove",e.onTouchMove,l),t.addEventListener("mouseup",e.onTouchEnd,!1))}(i.preventClicks||i.preventClicksPropagation)&&r.addEventListener("click",e.onClick,!0),i.cssMode&&s.addEventListener("scroll",e.onScroll),i.updateOnWindowResize?e.on(o.ios||o.android?"resize orientationchange observerUpdate":"resize observerUpdate",Hi,!0):e.on("observerUpdate",Hi,!0)},detachEvents:function(){var e=this,t=Ct(),i=e.params,a=e.touchEvents,r=e.el,s=e.wrapperEl,o=e.device,n=e.support,l=!!i.nested;if(!n.touch&&n.pointerEvents)r.removeEventListener(a.start,e.onTouchStart,!1),t.removeEventListener(a.move,e.onTouchMove,l),t.removeEventListener(a.end,e.onTouchEnd,!1);else{if(n.touch){var d=!("onTouchStart"!==a.start||!n.passiveListener||!i.passiveListeners)&&{passive:!0,capture:!1};r.removeEventListener(a.start,e.onTouchStart,d),r.removeEventListener(a.move,e.onTouchMove,l),r.removeEventListener(a.end,e.onTouchEnd,d),a.cancel&&r.removeEventListener(a.cancel,e.onTouchEnd,d)}(i.simulateTouch&&!o.ios&&!o.android||i.simulateTouch&&!n.touch&&o.ios)&&(r.removeEventListener("mousedown",e.onTouchStart,!1),t.removeEventListener("mousemove",e.onTouchMove,l),t.removeEventListener("mouseup",e.onTouchEnd,!1))}(i.preventClicks||i.preventClicksPropagation)&&r.removeEventListener("click",e.onClick,!0),i.cssMode&&s.removeEventListener("scroll",e.onScroll),e.off(o.ios||o.android?"resize orientationchange observerUpdate":"resize observerUpdate",Hi)}};var Ui={addClasses:function(){var e,t,i,a=this,r=a.classNames,s=a.params,o=a.rtl,n=a.$el,l=a.device,d=a.support,c=(e=["initialized",s.direction,{"pointer-events":d.pointerEvents&&!d.touch},{"free-mode":s.freeMode},{autoheight:s.autoHeight},{rtl:o},{multirow:s.slidesPerColumn>1},{"multirow-column":s.slidesPerColumn>1&&"column"===s.slidesPerColumnFill},{android:l.android},{ios:l.ios},{"css-mode":s.cssMode}],t=s.containerModifierClass,i=[],e.forEach((function(e){"object"==typeof e?Object.keys(e).forEach((function(a){e[a]&&i.push(t+a)})):"string"==typeof e&&i.push(t+e)})),i);r.push.apply(r,c),n.addClass([].concat(r).join(" ")),a.emitContainerClasses()},removeClasses:function(){var e=this,t=e.$el,i=e.classNames;t.removeClass(i.join(" ")),e.emitContainerClasses()}};var Zi={init:!0,direction:"horizontal",touchEventsTarget:"container",initialSlide:0,speed:300,cssMode:!1,updateOnWindowResize:!0,resizeObserver:!1,nested:!1,createElements:!1,enabled:!0,focusableElements:"input, select, option, textarea, button, video, label",width:null,height:null,preventInteractionOnTransition:!1,userAgent:null,url:null,edgeSwipeDetection:!1,edgeSwipeThreshold:20,freeMode:!1,freeModeMomentum:!0,freeModeMomentumRatio:1,freeModeMomentumBounce:!0,freeModeMomentumBounceRatio:1,freeModeMomentumVelocityRatio:1,freeModeSticky:!1,freeModeMinimumVelocity:.02,autoHeight:!1,setWrapperSize:!1,virtualTranslate:!1,effect:"slide",breakpoints:void 0,breakpointsBase:"window",spaceBetween:0,slidesPerView:1,slidesPerColumn:1,slidesPerColumnFill:"column",slidesPerGroup:1,slidesPerGroupSkip:0,centeredSlides:!1,centeredSlidesBounds:!1,slidesOffsetBefore:0,slidesOffsetAfter:0,normalizeSlideIndex:!0,centerInsufficientSlides:!1,watchOverflow:!1,roundLengths:!1,touchRatio:1,touchAngle:45,simulateTouch:!0,shortSwipes:!0,longSwipes:!0,longSwipesRatio:.5,longSwipesMs:300,followFinger:!0,allowTouchMove:!0,threshold:0,touchMoveStopPropagation:!1,touchStartPreventDefault:!0,touchStartForcePreventDefault:!1,touchReleaseOnEdges:!1,uniqueNavElements:!0,resistance:!0,resistanceRatio:.85,watchSlidesProgress:!1,watchSlidesVisibility:!1,grabCursor:!1,preventClicks:!0,preventClicksPropagation:!0,slideToClickedSlide:!1,preloadImages:!0,updateOnImagesReady:!0,loop:!1,loopAdditionalSlides:0,loopedSlides:null,loopFillGroupWithBlank:!1,loopPreventsSlide:!0,allowSlidePrev:!0,allowSlideNext:!0,swipeHandler:null,noSwiping:!0,noSwipingClass:"swiper-no-swiping",noSwipingSelector:null,passiveListeners:!0,containerModifierClass:"swiper-container-",slideClass:"swiper-slide",slideBlankClass:"swiper-slide-invisible-blank",slideActiveClass:"swiper-slide-active",slideDuplicateActiveClass:"swiper-slide-duplicate-active",slideVisibleClass:"swiper-slide-visible",slideDuplicateClass:"swiper-slide-duplicate",slideNextClass:"swiper-slide-next",slideDuplicateNextClass:"swiper-slide-duplicate-next",slidePrevClass:"swiper-slide-prev",slideDuplicatePrevClass:"swiper-slide-duplicate-prev",wrapperClass:"swiper-wrapper",runCallbacksOnInit:!0,_emitClasses:!1};function Qi(e,t){for(var i=0;i<t.length;i++){var a=t[i];a.enumerable=a.enumerable||!1,a.configurable=!0,"value"in a&&(a.writable=!0),Object.defineProperty(e,a.key,a)}}var Ji={modular:{useParams:function(e){var t=this;t.modules&&Object.keys(t.modules).forEach((function(i){var a=t.modules[i];a.params&&$i(e,a.params)}))},useModules:function(e){void 0===e&&(e={});var t=this;t.modules&&Object.keys(t.modules).forEach((function(i){var a=t.modules[i],r=e[i]||{};a.on&&t.on&&Object.keys(a.on).forEach((function(e){t.on(e,a.on[e])})),a.create&&a.create.bind(t)(r)}))}},eventsEmitter:Ii,update:zi,translate:Bi,transition:{setTransition:function(e,t){var i=this;i.params.cssMode||i.$wrapperEl.transition(e),i.emit("setTransition",e,t)},transitionStart:function(e,t){void 0===e&&(e=!0);var i=this,a=i.activeIndex,r=i.params,s=i.previousIndex;if(!r.cssMode){r.autoHeight&&i.updateAutoHeight();var o=t;if(o||(o=a>s?"next":a<s?"prev":"reset"),i.emit("transitionStart"),e&&a!==s){if("reset"===o)return void i.emit("slideResetTransitionStart");i.emit("slideChangeTransitionStart"),"next"===o?i.emit("slideNextTransitionStart"):i.emit("slidePrevTransitionStart")}}},transitionEnd:function(e,t){void 0===e&&(e=!0);var i=this,a=i.activeIndex,r=i.previousIndex,s=i.params;if(i.animating=!1,!s.cssMode){i.setTransition(0);var o=t;if(o||(o=a>r?"next":a<r?"prev":"reset"),i.emit("transitionEnd"),e&&a!==r){if("reset"===o)return void i.emit("slideResetTransitionEnd");i.emit("slideChangeTransitionEnd"),"next"===o?i.emit("slideNextTransitionEnd"):i.emit("slidePrevTransitionEnd")}}}},slide:Ni,loop:Oi,grabCursor:{setGrabCursor:function(e){var t=this;if(!(t.support.touch||!t.params.simulateTouch||t.params.watchOverflow&&t.isLocked||t.params.cssMode)){var i=t.el;i.style.cursor="move",i.style.cursor=e?"-webkit-grabbing":"-webkit-grab",i.style.cursor=e?"-moz-grabbin":"-moz-grab",i.style.cursor=e?"grabbing":"grab"}},unsetGrabCursor:function(){var e=this;e.support.touch||e.params.watchOverflow&&e.isLocked||e.params.cssMode||(e.el.style.cursor="")}},manipulation:Ri,events:Xi,breakpoints:{setBreakpoint:function(){var e=this,t=e.activeIndex,i=e.initialized,a=e.loopedSlides,r=void 0===a?0:a,s=e.params,o=e.$el,n=s.breakpoints;if(n&&(!n||0!==Object.keys(n).length)){var l=e.getBreakpoint(n,e.params.breakpointsBase,e.el);if(l&&e.currentBreakpoint!==l){var d=l in n?n[l]:void 0;d&&["slidesPerView","spaceBetween","slidesPerGroup","slidesPerGroupSkip","slidesPerColumn"].forEach((function(e){var t=d[e];void 0!==t&&(d[e]="slidesPerView"!==e||"AUTO"!==t&&"auto"!==t?"slidesPerView"===e?parseFloat(t):parseInt(t,10):"auto")}));var c=d||e.originalParams,h=s.slidesPerColumn>1,p=c.slidesPerColumn>1,u=s.enabled;h&&!p?(o.removeClass(s.containerModifierClass+"multirow "+s.containerModifierClass+"multirow-column"),e.emitContainerClasses()):!h&&p&&(o.addClass(s.containerModifierClass+"multirow"),(c.slidesPerColumnFill&&"column"===c.slidesPerColumnFill||!c.slidesPerColumnFill&&"column"===s.slidesPerColumnFill)&&o.addClass(s.containerModifierClass+"multirow-column"),e.emitContainerClasses());var m=c.direction&&c.direction!==s.direction,v=s.loop&&(c.slidesPerView!==s.slidesPerView||m);m&&i&&e.changeDirection(),$i(e.params,c);var b=e.params.enabled;$i(e,{allowTouchMove:e.params.allowTouchMove,allowSlideNext:e.params.allowSlideNext,allowSlidePrev:e.params.allowSlidePrev}),u&&!b?e.disable():!u&&b&&e.enable(),e.currentBreakpoint=l,e.emit("_beforeBreakpoint",c),v&&i&&(e.loopDestroy(),e.loopCreate(),e.updateSlides(),e.slideTo(t-r+e.loopedSlides,0,!1)),e.emit("breakpoint",c)}}},getBreakpoint:function(e,t,i){if(void 0===t&&(t="window"),e&&("container"!==t||i)){var a=!1,r=St(),s="window"===t?r.innerHeight:i.clientHeight,o=Object.keys(e).map((function(e){if("string"==typeof e&&0===e.indexOf("@")){var t=parseFloat(e.substr(1));return{value:s*t,point:e}}return{value:e,point:e}}));o.sort((function(e,t){return parseInt(e.value,10)-parseInt(t.value,10)}));for(var n=0;n<o.length;n+=1){var l=o[n],d=l.point,c=l.value;"window"===t?r.matchMedia("(min-width: "+c+"px)").matches&&(a=d):c<=i.clientWidth&&(a=d)}return a||"max"}}},checkOverflow:{checkOverflow:function(){var e=this,t=e.params,i=e.isLocked,a=e.slides.length>0&&t.slidesOffsetBefore+t.spaceBetween*(e.slides.length-1)+e.slides[0].offsetWidth*e.slides.length;t.slidesOffsetBefore&&t.slidesOffsetAfter&&a?e.isLocked=a<=e.size:e.isLocked=1===e.snapGrid.length,e.allowSlideNext=!e.isLocked,e.allowSlidePrev=!e.isLocked,i!==e.isLocked&&e.emit(e.isLocked?"lock":"unlock"),i&&i!==e.isLocked&&(e.isEnd=!1,e.navigation&&e.navigation.update())}},classes:Ui,images:{loadImage:function(e,t,i,a,r,s){var o,n=St();function l(){s&&s()}Fe(e).parent("picture")[0]||e.complete&&r?l():t?((o=new n.Image).onload=l,o.onerror=l,a&&(o.sizes=a),i&&(o.srcset=i),t&&(o.src=t)):l()},preloadImages:function(){var e=this;function t(){null!=e&&e&&!e.destroyed&&(void 0!==e.imagesLoaded&&(e.imagesLoaded+=1),e.imagesLoaded===e.imagesToLoad.length&&(e.params.updateOnImagesReady&&e.update(),e.emit("imagesReady")))}e.imagesToLoad=e.$el.find("img");for(var i=0;i<e.imagesToLoad.length;i+=1){var a=e.imagesToLoad[i];e.loadImage(a,a.currentSrc||a.getAttribute("src"),a.srcset||a.getAttribute("srcset"),a.sizes||a.getAttribute("sizes"),!0,t)}}}},Ki={},ea=function(){function e(){for(var t,i,a=arguments.length,r=new Array(a),s=0;s<a;s++)r[s]=arguments[s];if(1===r.length&&r[0].constructor&&"Object"===Object.prototype.toString.call(r[0]).slice(8,-1)?i=r[0]:(t=r[0],i=r[1]),i||(i={}),i=$i({},i),t&&!i.el&&(i.el=t),i.el&&Fe(i.el).length>1){var o=[];return Fe(i.el).each((function(t){var a=$i({},i,{el:t});o.push(new e(a))})),o}var n=this;n.__swiper__=!0,n.support=Ti(),n.device=Ai({userAgent:i.userAgent}),n.browser=Ei(),n.eventsListeners={},n.eventsAnyListeners=[],void 0===n.modules&&(n.modules={}),Object.keys(n.modules).forEach((function(e){var t=n.modules[e];if(t.params){var a=Object.keys(t.params)[0],r=t.params[a];if("object"!=typeof r||null===r)return;if(["navigation","pagination","scrollbar"].indexOf(a)>=0&&!0===i[a]&&(i[a]={auto:!0}),!(a in i)||!("enabled"in r))return;!0===i[a]&&(i[a]={enabled:!0}),"object"!=typeof i[a]||"enabled"in i[a]||(i[a].enabled=!0),i[a]||(i[a]={enabled:!1})}}));var l,d,c=$i({},Zi);return n.useParams(c),n.params=$i({},c,Ki,i),n.originalParams=$i({},n.params),n.passedParams=$i({},i),n.params&&n.params.on&&Object.keys(n.params.on).forEach((function(e){n.on(e,n.params.on[e])})),n.params&&n.params.onAny&&n.onAny(n.params.onAny),n.$=Fe,$i(n,{enabled:n.params.enabled,el:t,classNames:[],slides:Fe(),slidesGrid:[],snapGrid:[],slidesSizesGrid:[],isHorizontal:function(){return"horizontal"===n.params.direction},isVertical:function(){return"vertical"===n.params.direction},activeIndex:0,realIndex:0,isBeginning:!0,isEnd:!1,translate:0,previousTranslate:0,progress:0,velocity:0,animating:!1,allowSlideNext:n.params.allowSlideNext,allowSlidePrev:n.params.allowSlidePrev,touchEvents:(l=["touchstart","touchmove","touchend","touchcancel"],d=["mousedown","mousemove","mouseup"],n.support.pointerEvents&&(d=["pointerdown","pointermove","pointerup"]),n.touchEventsTouch={start:l[0],move:l[1],end:l[2],cancel:l[3]},n.touchEventsDesktop={start:d[0],move:d[1],end:d[2]},n.support.touch||!n.params.simulateTouch?n.touchEventsTouch:n.touchEventsDesktop),touchEventsData:{isTouched:void 0,isMoved:void 0,allowTouchCallbacks:void 0,touchStartTime:void 0,isScrolling:void 0,currentTranslate:void 0,startTranslate:void 0,allowThresholdMove:void 0,focusableElements:n.params.focusableElements,lastClickTime:_i(),clickTimeout:void 0,velocities:[],allowMomentumBounce:void 0,isTouchEvent:void 0,startMoving:void 0},allowClick:!0,allowTouchMove:n.params.allowTouchMove,touches:{startX:0,startY:0,currentX:0,currentY:0,diff:0},imagesToLoad:[],imagesLoaded:0}),n.useModules(),n.emit("_swiper"),n.params.init&&n.init(),n}var t,i,a,r=e.prototype;return r.enable=function(){var e=this;e.enabled||(e.enabled=!0,e.params.grabCursor&&e.setGrabCursor(),e.emit("enable"))},r.disable=function(){var e=this;e.enabled&&(e.enabled=!1,e.params.grabCursor&&e.unsetGrabCursor(),e.emit("disable"))},r.setProgress=function(e,t){var i=this;e=Math.min(Math.max(e,0),1);var a=i.minTranslate(),r=(i.maxTranslate()-a)*e+a;i.translateTo(r,void 0===t?0:t),i.updateActiveIndex(),i.updateSlidesClasses()},r.emitContainerClasses=function(){var e=this;if(e.params._emitClasses&&e.el){var t=e.el.className.split(" ").filter((function(t){return 0===t.indexOf("swiper-container")||0===t.indexOf(e.params.containerModifierClass)}));e.emit("_containerClasses",t.join(" "))}},r.getSlideClasses=function(e){var t=this;return e.className.split(" ").filter((function(e){return 0===e.indexOf("swiper-slide")||0===e.indexOf(t.params.slideClass)})).join(" ")},r.emitSlidesClasses=function(){var e=this;if(e.params._emitClasses&&e.el){var t=[];e.slides.each((function(i){var a=e.getSlideClasses(i);t.push({slideEl:i,classNames:a}),e.emit("_slideClass",i,a)})),e.emit("_slideClasses",t)}},r.slidesPerViewDynamic=function(){var e=this,t=e.params,i=e.slides,a=e.slidesGrid,r=e.size,s=e.activeIndex,o=1;if(t.centeredSlides){for(var n,l=i[s].swiperSlideSize,d=s+1;d<i.length;d+=1)i[d]&&!n&&(o+=1,(l+=i[d].swiperSlideSize)>r&&(n=!0));for(var c=s-1;c>=0;c-=1)i[c]&&!n&&(o+=1,(l+=i[c].swiperSlideSize)>r&&(n=!0))}else for(var h=s+1;h<i.length;h+=1)a[h]-a[s]<r&&(o+=1);return o},r.update=function(){var e=this;if(e&&!e.destroyed){var t=e.snapGrid,i=e.params;i.breakpoints&&e.setBreakpoint(),e.updateSize(),e.updateSlides(),e.updateProgress(),e.updateSlidesClasses(),e.params.freeMode?(a(),e.params.autoHeight&&e.updateAutoHeight()):(("auto"===e.params.slidesPerView||e.params.slidesPerView>1)&&e.isEnd&&!e.params.centeredSlides?e.slideTo(e.slides.length-1,0,!1,!0):e.slideTo(e.activeIndex,0,!1,!0))||a(),i.watchOverflow&&t!==e.snapGrid&&e.checkOverflow(),e.emit("update")}function a(){var t=e.rtlTranslate?-1*e.translate:e.translate,i=Math.min(Math.max(t,e.maxTranslate()),e.minTranslate());e.setTranslate(i),e.updateActiveIndex(),e.updateSlidesClasses()}},r.changeDirection=function(e,t){void 0===t&&(t=!0);var i=this,a=i.params.direction;return e||(e="horizontal"===a?"vertical":"horizontal"),e===a||"horizontal"!==e&&"vertical"!==e||(i.$el.removeClass(""+i.params.containerModifierClass+a).addClass(""+i.params.containerModifierClass+e),i.emitContainerClasses(),i.params.direction=e,i.slides.each((function(t){"vertical"===e?t.style.width="":t.style.height=""})),i.emit("changeDirection"),t&&i.update()),i},r.mount=function(e){var t=this;if(t.mounted)return!0;var i=Fe(e||t.params.el);if(!(e=i[0]))return!1;e.swiper=t;var a=function(){return"."+(t.params.wrapperClass||"").trim().split(" ").join(".")},r=function(){if(e&&e.shadowRoot&&e.shadowRoot.querySelector){var t=Fe(e.shadowRoot.querySelector(a()));return t.children=function(e){return i.children(e)},t}return i.children(a())}();if(0===r.length&&t.params.createElements){var s=Ct().createElement("div");r=Fe(s),s.className=t.params.wrapperClass,i.append(s),i.children("."+t.params.slideClass).each((function(e){r.append(e)}))}return $i(t,{$el:i,el:e,$wrapperEl:r,wrapperEl:r[0],mounted:!0,rtl:"rtl"===e.dir.toLowerCase()||"rtl"===i.css("direction"),rtlTranslate:"horizontal"===t.params.direction&&("rtl"===e.dir.toLowerCase()||"rtl"===i.css("direction")),wrongRTL:"-webkit-box"===r.css("display")}),!0},r.init=function(e){var t=this;return t.initialized||!1===t.mount(e)||(t.emit("beforeInit"),t.params.breakpoints&&t.setBreakpoint(),t.addClasses(),t.params.loop&&t.loopCreate(),t.updateSize(),t.updateSlides(),t.params.watchOverflow&&t.checkOverflow(),t.params.grabCursor&&t.enabled&&t.setGrabCursor(),t.params.preloadImages&&t.preloadImages(),t.params.loop?t.slideTo(t.params.initialSlide+t.loopedSlides,0,t.params.runCallbacksOnInit,!1,!0):t.slideTo(t.params.initialSlide,0,t.params.runCallbacksOnInit,!1,!0),t.attachEvents(),t.initialized=!0,t.emit("init"),t.emit("afterInit")),t},r.destroy=function(e,t){void 0===e&&(e=!0),void 0===t&&(t=!0);var i,a=this,r=a.params,s=a.$el,o=a.$wrapperEl,n=a.slides;return void 0===a.params||a.destroyed||(a.emit("beforeDestroy"),a.initialized=!1,a.detachEvents(),r.loop&&a.loopDestroy(),t&&(a.removeClasses(),s.removeAttr("style"),o.removeAttr("style"),n&&n.length&&n.removeClass([r.slideVisibleClass,r.slideActiveClass,r.slideNextClass,r.slidePrevClass].join(" ")).removeAttr("style").removeAttr("data-swiper-slide-index")),a.emit("destroy"),Object.keys(a.eventsListeners).forEach((function(e){a.off(e)})),!1!==e&&(a.$el[0].swiper=null,i=a,Object.keys(i).forEach((function(e){try{i[e]=null}catch(e){}try{delete i[e]}catch(e){}}))),a.destroyed=!0),null},e.extendDefaults=function(e){$i(Ki,e)},e.installModule=function(t){e.prototype.modules||(e.prototype.modules={});var i=t.name||Object.keys(e.prototype.modules).length+"_"+_i();e.prototype.modules[i]=t},e.use=function(t){return Array.isArray(t)?(t.forEach((function(t){return e.installModule(t)})),e):(e.installModule(t),e)},t=e,a=[{key:"extendedDefaults",get:function(){return Ki}},{key:"defaults",get:function(){return Zi}}],(i=null)&&Qi(t.prototype,i),a&&Qi(t,a),e}();Object.keys(Ji).forEach((function(e){Object.keys(Ji[e]).forEach((function(t){ea.prototype[t]=Ji[e][t]}))})),ea.use([Pi,Di]);var ta=ea,ia=e`[ambient^=light] {
  --bbva-carousel-swipe-bg: initial;
  --bbva-carousel-swipe-slide-bg: initial;
  --bbva-carousel-swipe-gradient-color: initial;
}
`,aa=e`[ambient^=dark] {
  --bbva-carousel-swipe-bg: var(--ambientsDark100, ${h(L.dark100)});
  --bbva-carousel-swipe-slide-bg: var(--colorsPrimaryCore, ${h(u.primaryCore)});
  --bbva-carousel-swipe-gradient-color: var(--colorsPrimaryMedium, ${h(u.primaryMedium)});
}

[ambient^=dark300] {
  --bbva-carousel-swipe-bg: var(--colorsPrimaryCoreDark, ${h(u.primaryCoreDark)});
  --bbva-carousel-swipe-slide-bg: var(--colorsPrimaryCoreDarkened, ${h(u.primaryCoreDarkened)});
  --bbva-carousel-swipe-gradient-color: var(--colorsPrimaryCoreDark, ${h(u.primaryCoreDark)});
}
`;const ra={dark:e`
    ${$t.dark}
    ${aa}
  `,light:e`
    ${$t.light}
    ${ia}
  `};var sa=e`@font-face {
  font-family: "swiper-icons";
  src: url("data:application/font-woff;charset=utf-8;base64, d09GRgABAAAAAAZgABAAAAAADAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABGRlRNAAAGRAAAABoAAAAci6qHkUdERUYAAAWgAAAAIwAAACQAYABXR1BPUwAABhQAAAAuAAAANuAY7+xHU1VCAAAFxAAAAFAAAABm2fPczU9TLzIAAAHcAAAASgAAAGBP9V5RY21hcAAAAkQAAACIAAABYt6F0cBjdnQgAAACzAAAAAQAAAAEABEBRGdhc3AAAAWYAAAACAAAAAj//wADZ2x5ZgAAAywAAADMAAAD2MHtryVoZWFkAAABbAAAADAAAAA2E2+eoWhoZWEAAAGcAAAAHwAAACQC9gDzaG10eAAAAigAAAAZAAAArgJkABFsb2NhAAAC0AAAAFoAAABaFQAUGG1heHAAAAG8AAAAHwAAACAAcABAbmFtZQAAA/gAAAE5AAACXvFdBwlwb3N0AAAFNAAAAGIAAACE5s74hXjaY2BkYGAAYpf5Hu/j+W2+MnAzMYDAzaX6QjD6/4//Bxj5GA8AuRwMYGkAPywL13jaY2BkYGA88P8Agx4j+/8fQDYfA1AEBWgDAIB2BOoAeNpjYGRgYNBh4GdgYgABEMnIABJzYNADCQAACWgAsQB42mNgYfzCOIGBlYGB0YcxjYGBwR1Kf2WQZGhhYGBiYGVmgAFGBiQQkOaawtDAoMBQxXjg/wEGPcYDDA4wNUA2CCgwsAAAO4EL6gAAeNpj2M0gyAACqxgGNWBkZ2D4/wMA+xkDdgAAAHjaY2BgYGaAYBkGRgYQiAHyGMF8FgYHIM3DwMHABGQrMOgyWDLEM1T9/w8UBfEMgLzE////P/5//f/V/xv+r4eaAAeMbAxwIUYmIMHEgKYAYjUcsDAwsLKxc3BycfPw8jEQA/gZBASFhEVExcQlJKWkZWTl5BUUlZRVVNXUNTQZBgMAAMR+E+gAEQFEAAAAKgAqACoANAA+AEgAUgBcAGYAcAB6AIQAjgCYAKIArAC2AMAAygDUAN4A6ADyAPwBBgEQARoBJAEuATgBQgFMAVYBYAFqAXQBfgGIAZIBnAGmAbIBzgHsAAB42u2NMQ6CUAyGW568x9AneYYgm4MJbhKFaExIOAVX8ApewSt4Bic4AfeAid3VOBixDxfPYEza5O+Xfi04YADggiUIULCuEJK8VhO4bSvpdnktHI5QCYtdi2sl8ZnXaHlqUrNKzdKcT8cjlq+rwZSvIVczNiezsfnP/uznmfPFBNODM2K7MTQ45YEAZqGP81AmGGcF3iPqOop0r1SPTaTbVkfUe4HXj97wYE+yNwWYxwWu4v1ugWHgo3S1XdZEVqWM7ET0cfnLGxWfkgR42o2PvWrDMBSFj/IHLaF0zKjRgdiVMwScNRAoWUoH78Y2icB/yIY09An6AH2Bdu/UB+yxopYshQiEvnvu0dURgDt8QeC8PDw7Fpji3fEA4z/PEJ6YOB5hKh4dj3EvXhxPqH/SKUY3rJ7srZ4FZnh1PMAtPhwP6fl2PMJMPDgeQ4rY8YT6Gzao0eAEA409DuggmTnFnOcSCiEiLMgxCiTI6Cq5DZUd3Qmp10vO0LaLTd2cjN4fOumlc7lUYbSQcZFkutRG7g6JKZKy0RmdLY680CDnEJ+UMkpFFe1RN7nxdVpXrC4aTtnaurOnYercZg2YVmLN/d/gczfEimrE/fs/bOuq29Zmn8tloORaXgZgGa78yO9/cnXm2BpaGvq25Dv9S4E9+5SIc9PqupJKhYFSSl47+Qcr1mYNAAAAeNptw0cKwkAAAMDZJA8Q7OUJvkLsPfZ6zFVERPy8qHh2YER+3i/BP83vIBLLySsoKimrqKqpa2hp6+jq6RsYGhmbmJqZSy0sraxtbO3sHRydnEMU4uR6yx7JJXveP7WrDycAAAAAAAH//wACeNpjYGRgYOABYhkgZgJCZgZNBkYGLQZtIJsFLMYAAAw3ALgAeNolizEKgDAQBCchRbC2sFER0YD6qVQiBCv/H9ezGI6Z5XBAw8CBK/m5iQQVauVbXLnOrMZv2oLdKFa8Pjuru2hJzGabmOSLzNMzvutpB3N42mNgZGBg4GKQYzBhYMxJLMlj4GBgAYow/P/PAJJhLM6sSoWKfWCAAwDAjgbRAAB42mNgYGBkAIIbCZo5IPrmUn0hGA0AO8EFTQAA") format("woff");
  font-weight: 400;
  font-style: normal;
}
:root {
  --swiper-theme-color: #007aff;
}

.swiper-container {
  margin-left: auto;
  margin-right: auto;
  position: relative;
  overflow: hidden;
  list-style: none;
  padding: 0;
  /* Fix of Webkit flickering */
  z-index: 1;
}

.swiper-container-vertical > .swiper-wrapper {
  flex-direction: column;
}

.swiper-wrapper {
  position: relative;
  width: 100%;
  height: 100%;
  z-index: 1;
  display: flex;
  transition-property: transform;
  box-sizing: content-box;
}

.swiper-container-android .swiper-slide,
.swiper-wrapper {
  transform: translate3d(0px, 0, 0);
}

.swiper-container-multirow > .swiper-wrapper {
  flex-wrap: wrap;
}

.swiper-container-multirow-column > .swiper-wrapper {
  flex-wrap: wrap;
  flex-direction: column;
}

.swiper-container-free-mode > .swiper-wrapper {
  transition-timing-function: ease-out;
  margin: 0 auto;
}

.swiper-container-pointer-events {
  touch-action: pan-y;
}
.swiper-container-pointer-events.swiper-container-vertical {
  touch-action: pan-x;
}

.swiper-slide {
  flex-shrink: 0;
  width: 100%;
  height: 100%;
  position: relative;
  transition-property: transform;
}

.swiper-slide-invisible-blank {
  visibility: hidden;
}

/* Auto Height */
.swiper-container-autoheight,
.swiper-container-autoheight .swiper-slide {
  height: auto;
}
.swiper-container-autoheight .swiper-wrapper {
  align-items: flex-start;
  transition-property: transform, height;
}

/* 3D Effects */
.swiper-container-3d {
  perspective: 1200px;
}
.swiper-container-3d .swiper-wrapper,
.swiper-container-3d .swiper-slide,
.swiper-container-3d .swiper-slide-shadow-left,
.swiper-container-3d .swiper-slide-shadow-right,
.swiper-container-3d .swiper-slide-shadow-top,
.swiper-container-3d .swiper-slide-shadow-bottom,
.swiper-container-3d .swiper-cube-shadow {
  transform-style: preserve-3d;
}
.swiper-container-3d .swiper-slide-shadow-left,
.swiper-container-3d .swiper-slide-shadow-right,
.swiper-container-3d .swiper-slide-shadow-top,
.swiper-container-3d .swiper-slide-shadow-bottom {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  z-index: 10;
}
.swiper-container-3d .swiper-slide-shadow-left {
  background-image: linear-gradient(to left, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-right {
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-top {
  background-image: linear-gradient(to top, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}
.swiper-container-3d .swiper-slide-shadow-bottom {
  background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}

/* CSS Mode */
.swiper-container-css-mode > .swiper-wrapper {
  overflow: auto;
  scrollbar-width: none;
  /* For Firefox */
  -ms-overflow-style: none;
  /* For Internet Explorer and Edge */
}
.swiper-container-css-mode > .swiper-wrapper::-webkit-scrollbar {
  display: none;
}
.swiper-container-css-mode > .swiper-wrapper > .swiper-slide {
  scroll-snap-align: start start;
}

.swiper-container-horizontal.swiper-container-css-mode > .swiper-wrapper {
  scroll-snap-type: x mandatory;
}

.swiper-container-vertical.swiper-container-css-mode > .swiper-wrapper {
  scroll-snap-type: y mandatory;
}

:host {
  display: block;
  position: relative;
  background: var(--bbva-carousel-swipe-bg-dark-mode-color, var(--bbva-carousel-swipe-bg, var(--ambientsLight, ${h(L.light)})));
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) 0;
  max-height: 100%;
  box-sizing: border-box;
  --_carousel-swipe-slide-bg-color: var(--bbva-carousel-swipe-slide-bg-dark-mode-color, var(--bbva-carousel-swipe-slide-bg, var(--ambientsLight, ${h(L.light)})));
  --_carousel-swipe-full-width-bg-color: var(--bbva-carousel-swipe-variant-full-width-slide-bg-dark-mode-color, var(--bbva-carousel-swipe-variant-full-width-slide-bg, transparent));
  --_carousel-swipe-full-width-slide-bg-color: var(--bbva-carousel-swipe-variant-full-screen-slide-bg-dark-mode-color, var(--bbva-carousel-swipe-variant-full-screen-slide-bg, transparent));
  --_carousel-swipe-gradient-color: var(--bbva-carousel-swipe-gradient-dark-mode-color, var(--bbva-carousel-swipe-gradient-color, var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)})));
}

:host([hidden]), [hidden] {
  display: none !important;
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

*, *:before, *:after {
  box-sizing: inherit;
}

.swiper-wrapper,
.swiper-slide {
  height: auto;
}

.swiper-wrapper {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) 0;
}

.swiper-slide {
  min-height: var(--bbva-carousel-swipe-slide-min-height, 12rem);
  background: var(--_carousel-swipe-slide-bg-color);
  box-shadow: var(--boxShadowType2, ${h(J.type2)});
  border-radius: var(--borderRadiusSmall, ${h(K.small)});
}

:host([variant=full-width]),
:host([variant=full-screen]) {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
}
:host([variant=full-width]) .swiper-wrapper,
:host([variant=full-screen]) .swiper-wrapper {
  margin: 0;
}
:host([variant=full-width]) .swiper-slide,
:host([variant=full-screen]) .swiper-slide {
  box-shadow: none;
  border-radius: none;
}

:host([variant=full-width]) .swiper-slide {
  background: var(--_carousel-swipe-full-width-bg-color);
}

:host([variant=full-screen]) {
  display: flex;
  flex-direction: column;
  height: 100%;
}
:host([variant=full-screen]) .swiper-container {
  flex: 1;
  width: 100%;
  overflow-y: auto;
}
:host([variant=full-screen]) .swiper-slide {
  background: var(--_carousel-swipe-full-width-slide-bg-color);
}
:host([variant=full-screen]) .gradient {
  display: block;
  position: absolute;
  bottom: 2rem;
  left: 0;
  height: 1.5rem;
  width: 100%;
  background-image: linear-gradient(180deg, transparent 0%, var(--_carousel-swipe-gradient-color) 100%);
  z-index: 1;
}
`;class oa extends(i(v(a))){static get scopedElements(){return{"bbva-card-control":Tt}}static get is(){return"bbva-carousel-swipe"}static get properties(){return{allowAdd:{type:Boolean,attribute:"allow-add"},items:{type:Array},loop:{type:Boolean,reflect:!0},selected:{type:Number},swiperConfig:{type:Object},variant:{type:String},scopedComponents:{type:Array,attribute:"scoped-components"},_sliderContainer:{type:Object},_isBottom:{type:Boolean},_ariaLive:{type:Boolean,state:!0},keepSlideOnInit:{type:Boolean,attribute:"keep-slide-on-init"}}}constructor(){super(),this.allowAdd=!1,this.items=[],this.loop=!1,this.selected=0,this.swiperConfig={},this.variant="",this._isBottom=!1,this._ariaLive=!1,this.keepSlideOnInit=!1}static get styles(){return[sa,ra.light,ra.dark,l("bbva-carousel-swipe-shared-styles")]}firstUpdated(e){super.firstUpdated(e),this.setAttribute("role","region"),this.setAttribute("aria-roledescription","carousel"),this._sliderContainer=this.shadowRoot.querySelector(".swiper-container"),this._sliderContainer.addEventListener("scroll",(e=>{const t=e.target,i=t.scrollHeight-t.scrollTop===t.clientHeight;this._isBottom=i}))}update(e){super.update(e),e.has("scopedComponents")&&this.scopedComponents&&this.scopedComponents.forEach((e=>{this.defineScopedElement(e.tagName,e.class)}))}initializeSwiper(){this._swiper&&this._swiper.destroy(),this._swiper=new ta(this._sliderContainer,this.configSwiper()),this._swiper.on("slideChange",(()=>{this._swiper.slides[this._swiper.previousIndex].setAttribute("aria-hidden",!0),this._select(this._swiper.realIndex)})),this.selected=this._setIndex()}_setIndex(){return this.keepSlideOnInit?this.selected:0}configSwiper(){let e={loop:this.loop,initialSlide:this._setIndex()};return["full-width","full-screen"].includes(this.variant)||(e={...e,slidesPerView:1.1,centeredSlides:!0,spaceBetween:8}),{...e,...this.swiperConfig}}updated(e){super.updated(e),(e.has("loop")||e.has("items")||e.has("swiperConfig"))&&this.initializeSwiper(),e.has("_intlResources")&&this.setAttribute("aria-label",this.t("bbva-carousel-swipe-carousel-aria-label"))}changeSlide(e){this._swiper.slides[this._swiper.realIndex].setAttribute("aria-hidden",!0);const t=e.detail;this._ariaLive=!0,this.loop?this._swiper.slideToLoop(t):this._swiper.slideTo(t)}_select(e){this.selected=e,this._ariaLive=!0,this.dispatchEvent(new CustomEvent("carousel-swipe-item-select",{detail:this.selected,bubbles:!0,composed:!0}))}_tap(){this.dispatchEvent(new CustomEvent("carousel-swipe-item-tap",{detail:this.selected,bubbles:!0,composed:!0}))}render(){return d`
      <div
        class="swiper-container"
        @keypress="$${e=>13===e.keyCode&&this._tap()}"
        @click=${()=>this._tap()}
      >
        <p class="sr-only">${this.t("bbva-carousel-swipe-carousel-sr-description")}</p>
        <div class="swiper-wrapper" aria-live="${this._ariaLive?"polite":"off"}">
          ${this.items.map(((e,t)=>d`
                <div
                  class="swiper-slide"
                  role="group"
                  aria-roledescription="slide"
                  aria-hidden="${c(t!==this.selected?"true":void 0)}"
                  aria-label="${this.t("bbva-carousel-swipe-slide-aria-label",{slide:t+1,totalSlides:this.items&&this.items.length})}"
                >
                  ${e.content instanceof ee?e.content:te(e.content)}
                </div>
              `))}
        </div>
      </div>
      <div class="gradient" .hidden="${this._isBottom}"></div>
      ${this.items&&this.items.length>1?d`
            <bbva-card-control
              .allowAdd="${this.allowAdd}"
              .items="${this.items.length}"
              .selected="${this.selected}"
              @card-control-item-select="${e=>this.changeSlide(e)}"
            >
            </bbva-card-control>
          `:d``}
    `}}_("colors.cool100"),_("colors.cool70"),_("colors.cool100"),_("colors.cool100"),_("colors.cool100");const na=new t;var la=e`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.carousel-wrapper {
  flex: 1;
}

[data-tag-name=bbva-progress-content] {
  position: absolute;
}

[data-tag-name=bbva-carousel-swipe] {
  padding: var(--onboarding-full-screen-carousel-content-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) 0 0);
  --bbva-carousel-swipe-gradient-color: rgba(255,255,255,0);
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}
.footer.hidden {
  visibility: hidden;
}
${na.mediaRules()}`,da=e`[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.carousel-wrapper {
  flex: 1;
}

[data-tag-name=bbva-progress-content] {
  position: absolute;
}

[data-tag-name=bbva-carousel-swipe] {
  padding: var(--onboarding-full-screen-carousel-content-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) 0 0);
  --bbva-carousel-swipe-gradient-color: rgba(255,255,255,0);
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}
.footer.hidden {
  visibility: hidden;
}
`;class ca extends(C(I(Oe(v(a))))){static get is(){return"onboarding-full-screen-carousel"}static get scopedElements(){const e=[ie,oa,Ve,ae,Re,...ca.configurationScopedElements()];return ca.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean,reflect:!0},modalTitle:{type:String,attribute:"modal-title"},contentFragmentHost:{type:String,attribute:"content-fragment-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},serviceCacheEnabled:{type:Boolean,attribute:"service-cache-enabled"},headers:{type:Object},items:Array,buttonText:{type:String,attribute:"button-text"},headerIconRightPrimary:{type:String,attribute:"header-icon-right-primary"},headerIconRightSecondary:{type:String,attribute:"header-icon-right-secondary"},maxErrorRetries:{type:Number,attribute:"max-error-retries"},attachModalsToBody:{type:Boolean,attribute:"attach-modals-to-body"},modalHeaderButtons:{type:Array},modalCloseIndex:{type:Array},_data:Array,_selectedPage:Number,_scopedItems:Array}}get _headers(){return this.headers||{Accept:"application/json, text/plain, */*; q=0.01","Content-Type":"text/plain"}}static get styles(){return[la,l("onboarding-full-screen-carousel-shared-styles")]}constructor(){super(),this.config={header:!1,loader:!0,notify:!1},this.attachModalsToBody=!1,this.visible=!1,this.modalTitle="",this.items=[],this.buttonText="",this.maxErrorRetries=2,this.serviceCacheEnabled=!1,this._selectedPage=0,this._errorRetries=0,this._scopedItems=[{tagName:"bbva-panel-offer",class:ae}],this.modalHeaderButtons=[],this.modalCloseIndex=[]}render(){var e,t;const i=`onboardingAemData-${(null===(e=this.contentFragmentPath)||void 0===e||null===(t=e.match(/\/([^/.]+)\./))||void 0===t?void 0:t[1])||""}-${this.language||""}`;return d`
      <bbva-global-aem-content-fragment-dm
        ?native="${this.native}"
        host="${this.contentFragmentHost}"
        path="${this.contentFragmentPath}"
        cachetype="${this.serviceCacheEnabled?"SESSION":"NONE"}"
        cachekey="${i}"
        @aem-content-fragment-dm-fetch="${e=>{this._generateCarouselContent(e),this.clearLoader()}}"
        @aem-content-fragment-dm-fetch-error="${this._manageFetchError}"
        cross-domain
        .headers="${this._headers}"
      ></bbva-global-aem-content-fragment-dm>
      <bbva-help-modal
        data-id="modalOnboardingFullScreenCarousel"
        .contentStyles="${this.attachModalsToBody?da:""}"
        full-height
        fixed-footer
        ?attach-to-body="${this.attachModalsToBody}"
        header-type="modal-initial"
        header-text="${this.modalTitle}"
        aria-label="${this.modalTitle}"
        ?visible=${this.visible}
        @modal-state-change=${e=>{this.visible=e.detail.visible}}
        hide-content-padding-top
        .closeModalIndex="${this.modalCloseIndex}"
        .headerButtons="${this.modalHeaderButtons}"
      >
        <div class="carousel-wrapper" slot="slot-content">
          ${super.render()}
          <bbva-carousel-swipe
            .items=${this.items}
            .scopedComponents=${this._scopedItems}
            variant="full-screen"
            @carousel-swipe-item-select=${this._changedPage}
          ></bbva-carousel-swipe>
        </div>
        <div class="footer ${re({hidden:!this.buttonText})}" slot="slot-footer">
          <bbva-button-default
            @click=${this._buttonClick}
            text="${this.buttonText}"
          ></bbva-button-default>
        </div>
      </bbva-help-modal>
    `}firstUpdated(){this._dm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]'),this.modalHeaderButtons=[{id:"btn-help",name:"Help",icon:this.headerIconRightSecondary,accessibilityText:this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-secondary"),label:this.t("onboarding-full-screen-carousel-icon-right-secondary")},{id:"btn-close",name:"Close",icon:this.headerIconRightPrimary,accessibilityText:this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-primary"),label:this.t("onboarding-full-screen-carousel-icon-right-primary")}],this.modalCloseIndex=[1]}updated(e){(e.has("contentFragmentHost")||e.has("contentFragmentPath"))&&(this._errorRetries=0,this.showLoader(),this._dm.getAemData())}_manageFetchError(){this._errorRetries<this.maxErrorRetries?(this._errorRetries+=1,this._dm.getAemData()):(this.clearLoader(),this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-loading-error",{detail:!0,bubbles:!0,composed:!0})))}_generateCarouselContent(e){var t,i,a;this._data=((null==e||null===(t=e.detail)||void 0===t||null===(i=t.items)||void 0===i||null===(a=i.contentfragmentlist)||void 0===a?void 0:a.items)||[]).map((({elements:e})=>e)).sort(((e,t)=>{var i,a;return((null==e||null===(i=e.index)||void 0===i?void 0:i.value)||0)-((null==t||null===(a=t.index)||void 0===a?void 0:a.value)||0)})),this.items=(this._data||[]).map((({image:e,title:t,description:i})=>({content:d`
        <bbva-panel-offer content-title="${t.value}">
          <img
            slot="microillustration"
            src="${`${this.contentFragmentHost}${e.value}`}"
            alt="${e.title}"
          />
          <p>${i.value}</p>
        </bbva-panel-offer>
      `}))),this._changedPage()}_changedPage({detail:e}={}){var t,i;this._selectedPage=e||0,this.buttonText=this._data?((null===(t=this._data[this._selectedPage])||void 0===t||null===(i=t.buttonText)||void 0===i?void 0:i.value)||"").trim():this.buttonText,this._selectedPage===this.items.length-1&&this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-last-item",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){const e=this._data?this._data[this._selectedPage].buttonAction.value:"onboarding-full-screen-carousel-item-select";this.dispatchEvent(new CustomEvent(e,{detail:this._selectedPage,bubbles:!0,composed:!0})),this.visible=!1}}const ha=new t;var pa=e`:host {
  --_color: var(--bbva-button-group-item-dark-mode-color, var(--bbva-button-group-item-color, var(--colorsPrimaryMedium, ${h(u.primaryMedium)})));
  --_bg-color: var(--bbva-button-group-item-dark-mode-bg-color, var(--bbva-button-group-item-bg-color, var(--colorsSecondary100, ${h(u.secondary100)})));
  --_color-checked: var(--bbva-button-group-item-dark-mode-color-checked, var(--bbva-button-group-item-color-checked, var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)})));
  --_bg-color-checked: var(--bbva-button-group-item-dark-mode-bg-color-checked, var(--bbva-button-group-item-bg-color-checked, var(--colorsPrimaryCore, ${h(u.primaryCore)})));
  --_bg-color-pressed: var(--bbva-button-group-item-dark-mode-bg-color-pressed, var(--bbva-button-group-item-bg-color-pressed, var(--colorsSecondary200, ${h(u.secondary200)})));
  --_color-pressed: var(--bbva-button-group-item-dark-mode-color-pressed, var(--bbva-button-group-item-color-pressed, var(--colorsPrimaryCore, ${h(u.primaryCore)})));
  flex-grow: 1;
  flex-basis: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  position: relative;
  width: auto;
  max-width: 100%;
  min-width: var(--bbva-button-group-item-min-width, 33%);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
  margin: 0 0.5px;
  font: inherit;
  font-size: var(--bbva-button-group-item-font-size, var(--typographyTypeSmall, ${h(p.typeSmall)}));
  line-height: var(--bbva-button-group-item-line-height, var(--lineHeightTypeSmall, ${h(se.typeSmall)}));
  font-weight: var(--bbva-button-group-item-font-weight, var(--fontFacePrimaryMediumFontWeight, ${h(M.medium.fontWeight)}));
  text-align: center;
  overflow: hidden;
  vertical-align: middle;
  border-radius: var(--bbva-button-group-item-border-radius, var(--borderRadiusSmall, ${h(K.small)}));
  background-color: var(--_bg-color);
  color: var(--_color);
  opacity: 1;
  cursor: pointer;
  user-select: none;
  box-sizing: border-box;
}
:host [data-tag-name=bbva-icon] {
  fill: var(--_color);
}

[data-tag-name=bbva-text] {
  color: var(--_color);
  --bbva-text-white-space: nowrap;
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

:host(:focus) {
  outline: none;
}

:host([aria-checked=true]) {
  color: var(--_color-checked);
  background-color: var(--_bg-color-checked);
}
:host([aria-checked=true]) [data-tag-name=bbva-icon] {
  fill: var(--_color-checked);
}
:host([aria-checked=true]) [data-tag-name=bbva-text] {
  color: var(--_color-checked);
}

:host([icon]) {
  flex-grow: 0;
  flex-basis: auto;
  height: var(--bbva-button-group-item-icon-host-size, calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem));
  width: var(--bbva-button-group-item-icon-host-size, calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem));
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) 0;
  min-width: var(--bbva-button-group-item-min-width, 0);
}

span {
  display: block;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
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

:host(:active:not([disabled])),
:host([focus-visible]:not([disabled])) {
  background-color: var(--_bg-color-pressed);
  color: var(--_color-pressed);
}
:host(:active:not([disabled])) [data-tag-name=bbva-icon],
:host([focus-visible]:not([disabled])) [data-tag-name=bbva-icon] {
  fill: var(--_color-pressed);
}
:host(:active:not([disabled])) [data-tag-name=bbva-text],
:host([focus-visible]:not([disabled])) [data-tag-name=bbva-text] {
  color: var(--_color-pressed);
}

:host([small]) {
  height: auto;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}

:host([small-stacked]) {
  flex-grow: 0;
  flex-basis: auto;
  height: 2.5rem;
  width: 2.5rem;
  min-width: 0;
}

:host([small][hide-ellipsis]) {
  min-width: var(--bbva-button-group-item-min-width, auto);
  overflow: visible;
}
:host([small][hide-ellipsis]) span {
  display: block;
  overflow: visible;
  text-overflow: initial;
}
${ha.mediaRules()}`;const ua=new t;var ma=e`[ambient^=light] {
  --bbva-button-group-item-color: initial;
  --bbva-button-group-item-bg-color: initial;
  --bbva-button-group-item-color-checked: initial;
  --bbva-button-group-item-bg-color-checked: initial;
  --bbva-button-group-item-bg-color-pressed: initial;
  --bbva-button-group-item-color-pressed: initial;
}

[ambient=light100] {
  --bbva-button-group-item-color: initial;
  --bbva-button-group-item-bg-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-button-group-item-color-checked: initial;
  --bbva-button-group-item-bg-color-checked: initial;
  --bbva-button-group-item-bg-color-pressed: initial;
  --bbva-button-group-item-color-pressed: initial;
}
${ua.mediaRules()}`;const va=new t;var ba=e`[ambient=dark400] {
  --bbva-button-group-item-color: var(--colorsPrimarySubdued, ${h(u.primarySubdued)});
  --bbva-button-group-item-bg-color: var(--colorsPrimaryCoreDark, ${h(u.primaryCoreDark)});
  --bbva-button-group-item-color-checked: var(--colorsPrimaryCore, ${h(u.primaryCore)});
  --bbva-button-group-item-bg-color-checked: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-button-group-item-bg-color-pressed: var(--colorsPrimaryCore, ${h(u.primaryCore)});
  --bbva-button-group-item-color-pressed: var(--colorsPrimarySubduedLight, ${h(u.primarySubduedLight)});
}

[ambient=dark100] {
  --bbva-button-group-item-color: var(--colorsPrimarySubdued, ${h(u.primarySubdued)});
  --bbva-button-group-item-bg-color: var(--colorsPrimaryCoreDarkened, ${h(u.primaryCoreDarkened)});
  --bbva-button-group-item-color-checked: var(--colorsPrimaryCore, ${h(u.primaryCore)});
  --bbva-button-group-item-bg-color-checked: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-button-group-item-bg-color-pressed: var(--colorsPrimaryCore, ${h(u.primaryCore)});
  --bbva-button-group-item-color-pressed: var(--colorsPrimarySubduedLight, ${h(u.primarySubduedLight)});
}
${va.mediaRules()}`;const ga={light:e`
    ${oe.dark}
    ${w.dark}
    ${ma}
  `,dark:e`
    ${w.light}
    ${oe.light}
    ${ba}
  `};class fa extends(i(Vt)){static get is(){return"bbva-button-group-item"}static get scopedElements(){return{"bbva-icon":g,"bbva-text":b}}static get properties(){return{text:{type:String},icon:{type:String,reflect:!0},iconSize:{type:Number,attribute:"icon-size"},small:{type:Boolean,reflect:!0},hideEllipsis:{type:Boolean,reflect:!0,attribute:"hide-ellipsis"},smallStacked:{type:Boolean,reflect:!0,attribute:"small-stacked"},disabled:{type:Boolean}}}constructor(){super(),this.small=!1,this.hideEllipsis=!1,this.disabled=!1,this.iconSize=24}static get styles(){return[super.styles,pa,ga.dark,ga.light,l("bbva-button-group-item-shared-styles")]}get _buttonContent(){return d`
      ${this.icon?d` <bbva-icon .icon="${this.icon}" .size="${c(this.iconSize)}"></bbva-icon> `:""}
      <span class="${this.icon?"sr-only":""}">
        ${this.text?d`
              <bbva-text
                unset
                text="${this.text}"
                size="S"
                font-weight="500"
                ?ellipsis="${!this.small||!this.hideEllipsis||!this.hideEllipsis}"
              ></bbva-text>
            `:d` <slot></slot> `}
      </span>
    `}get _radio(){return d`
      <span class="slot-control"><slot name="_radio"></slot></span>

      <input
        aria-hidden="true"
        @change="${this._onChange}"
        ?checked="${this.checked}"
        ?disabled="${this.disabled}"
        form="${c(this.form)}"
        id="${this._formElementId}"
        @input="${this._onInput}"
        name="${c(this.name)}"
        ?required="${this.required}"
        slot="_radio"
        tabindex="-1"
        type="radio"
        .value="${this.value}"
        hidden
      />
    `}render(){return d` ${this._radio} ${this._buttonContent} `}}_("colors.primarySubdued"),_("colors.cool60"),_("colors.cool90"),_("colors.primaryMediumLight"),_("colors.cool50"),_("colors.primaryMediumLight");var ya=e`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new t).mediaRules()}`;const wa=new t;var ka=e`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${h(u.primaryCoreDark)});
}
${wa.mediaRules()}`;const xa={dark:e`
    ${w.dark}
    ${ka}
  `,light:e`
    ${w.light}
    ${ya}
  `},_a=new t;var Sa=e`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${h(u.secondary200)})));
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
${_a.mediaRules()}`;class Ca extends(i(v(le(a)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":b}}static get properties(){return{date:{type:Date,converter:e=>new Date(e)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,Sa,l("bbva-date-shared-styles"),xa.light,xa.dark]}updated(e){var t,i;super.updated&&super.updated(e),0===(null===(t=this.dateRange)||void 0===t?void 0:t.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(i=this.dateRange)||void 0===i?void 0:i.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var e;return(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(e){const t=this.utc?{...this.options,timeZone:"UTC"}:this.options,i=t.day||t.month||t.year;return t.hour&&t.minute&&!i?e.toLocaleTimeString(this.locale,t).concat(` ${this.clockSuffix}`):e.toLocaleDateString(this.locale,t)}_fromToDateFormat(e){return[new Date(e[0]),new Date(e[1])].map(((e,t)=>e.toLocaleDateString(this.locale,this.options).concat(0===t?" - ":"")))}_fromToDateFormatA11y(e){const t=new Date(e[0]),i=new Date(e[1]),a={...this.options};return a.month="long",[t,i].map(((e,t)=>e.toLocaleDateString(this.locale,a).concat(0===t?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&d` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||de}get _tplDateRange(){var e;return this.isValidRange&&(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&d`
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
        `||de}render(){return d` ${this._tplDate} ${this._tplDateRange} `}}_("colors.primaryCoreLightened"),_("colors.cool50");const $a=new t;var Ta=e`:host {
  display: block;
  position: relative;
  box-sizing: border-box;
  width: 100%;
  --bbva-text-color: var(--bbva-button-group-dark-mode-text-color, var(--bbva-button-group-text-color, var(--colorsSecondary600, ${h(u.secondary600)})));
  --_button-group-gradient-background: var(--bbva-button-group-dark-mode-gradient-background, var(--bbva-button-group-gradient-background, var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)})));
  --_button-group-gradient-color: var(--bbva-button-group-gradient-color, linear-gradient(to right, var(--_button-group-gradient-background) 0%, rgba(255, 255, 255, 0) 100%));
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

.buttons {
  display: flex;
  flex: 1;
  max-width: 100%;
  align-items: center;
}

.buttons-half {
  width: 50%;
}

.group {
  display: flex;
  box-sizing: border-box;
  margin: 0;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
  list-style: none;
  align-items: center;
}

.scroll {
  padding-right: 0;
  overflow-x: auto;
  -webkit-overflow-scrolling: touch;
  scrollbar-width: none;
}
.scroll::-webkit-scrollbar {
  display: none;
}

.right-padding-fix:after {
  display: block;
  content: "";
  width: 1rem;
  border: 1px solid transparent;
}

.gradient.left::before, .gradient.right::after {
  content: "";
  position: absolute;
  left: 0;
  top: 0;
  height: 100%;
  width: 1.875rem;
  pointer-events: none;
  background: var(--_button-group-gradient-color);
}
.gradient.right::after {
  left: auto;
  right: 0;
  transform: rotate(180deg);
}

[data-tag-name=bbva-date],
[data-tag-name=bbva-text] {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
  white-space: nowrap;
  min-width: 50%;
}

[data-tag-name=bbva-link] {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
  text-align: right;
  white-space: nowrap;
}

:host([stacked]) .buttons {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 1rem;
}

:host([small-stacked]) .buttons {
  display: inline-flex;
  flex-flow: row wrap;
  justify-content: center;
  gap: 0.5rem;
}
${$a.mediaRules()}`,Aa=e`[ambient=dark400] {
  --bbva-button-group-gradient-background: var(--ambientsDark400, ${h(L.dark400)});
  --bbva-button-group-gradient-color: linear-gradient(to right, var(--ambientsDark400, ${h(L.dark400)}) 0%, rgba(7, 33, 70, 0) 100%);
  --bbva-button-group-text-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
}

[ambient=dark100] {
  --bbva-button-group-gradient-background: var(--ambientsDark100, ${h(L.dark100)});
  --bbva-button-group-gradient-color: linear-gradient(to right, var(--ambientsDark100, ${h(L.dark100)}) 0%, rgba(7, 33, 70, 0) 100%);
  --bbva-button-group-text-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
}
`;const Ea={light:e`
    ${e`[ambient^=light] {
  --bbva-button-group-text-color: initial;
  --bbva-button-group-gradient-background: initial;
  --bbva-button-group-gradient-color: initial;
}

[ambient=light100] {
  --bbva-button-group-gradient-background: var(--ambientsLight100, ${h(L.light100)});
  --bbva-button-group-gradient-color: linear-gradient(to right, var(--ambientsLight100, ${h(L.light100)}) 0%, rgba(244, 244, 244, 0) 100%);
}
`}
    ${ga.light}
    ${xa.light}
    ${z.light}
  `,dark:e`
    ${Aa}
    ${ga.dark}
    ${xa.dark}
    ${z.dark}
  `};class Pa extends(ce(i(le(a)))){static get is(){return"bbva-button-group"}static get scopedElements(){return{"bbva-button-group-item":fa,"bbva-text":b,"bbva-link":H,"bbva-date":Ca}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},text:{type:String},date:{type:String},options:{type:Object},locale:{type:String},link:{type:String},_availableScroll:{type:String,state:!0},_scrollable:{type:Boolean,state:!0},stacked:{type:Boolean},smallStacked:{type:Boolean,attribute:"small-stacked"}}}constructor(){super(),this.stacked=!1,this.smallStacked=!1,this.disabled=!1,this.date="",this.text="",this.link="",this.items=[],this._scrollable=!1,this.selected=-1,this.name=`button-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.addEventListener("slotschanges",(e=>{e.detail.contentSlots.forEach((e=>{const t=e.assignedNodes,i=t.getAttribute("data-tag-name");"bbva-button-group-item"===(null==i?void 0:i.toLowerCase())&&(t.name=this.name)}))}))}static get styles(){return[super.styles,Ta,Ea.light,Ea.dark,l("bbva-button-group-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("change",(e=>this._updateItems(e)))}disconnectedCallback(){this.removeEventListener("change",(e=>this._updateItems(e)))}get radioItems(){var e;const t=(null===(e=this.items)||void 0===e?void 0:e.length)>0?this.shadowRoot:this;return Array.from(t.querySelectorAll('[data-tag-name="bbva-button-group-item"]'))}get _renderList(){return this.text?d` <bbva-text ellipsis text="${this.text}" size="S"></bbva-text> `:this.date?d`
        <bbva-date
          date="${this.date}"
          .options="${this.options}"
          .locale="${this.locale}"
        ></bbva-date>
      `:d``}get _renderArray(){return this.items.length?d`
        ${this.items.map((e=>d`
            <bbva-button-group-item
              name="${this.name}"
              icon="${c(e.icon)}"
              value="${c(e.value)}"
              ?small="${(this.date||this.text||this.link)&&!this.icon}"
              ?checked="${e.checked}"
              .text="${e.text}"
              ?small-stacked="${this.smallStacked}"
            ></bbva-button-group-item>
          `))}
      `:d``}get _renderGradient(){return this.date||this.text?de:d`
        <div
          class="${this._scrollable&&(this.radioItems.length>3||this.link)?"gradient":""} ${this._availableScroll}"
        ></div>
      `}get _renderPadding(){return!this._scrollable||this.date||this.text?de:d` <div class="right-padding-fix"></div> `}groupItemTemplate(e){return d` <bbva-button-group-item
      name="${this.name}"
      icon="${c(e.icon)}"
      value="${c(e.value)}"
      ?small="${(this.date||this.text||this.link)&&!this.icon}"
      ?checked="${e.checked}"
      .text="${e.text}"
      >${e.text}</bbva-button-group-item
    >`}get _renderButtons(){return d` ${this.items.length?this._renderArray:d` <slot></slot> `} `}get _renderLink(){return this.link?d`<bbva-link @click="${this._linkClick}"> ${this.link} </bbva-link>`:d``}_checkListLength(){return this.radioItems.length>=2&&this.radioItems.length<=3}updated(e){if(super.updated&&super.updated(e),this.radioItems.length){var t;e.has("selected")&&Number.isFinite(this.selected)&&this.selected>-1&&(this.radioItems[this.selected].checked=!0),(this.date||this.text||this.link)&&this.radioItems.forEach((e=>{e.getAttribute("small")||e.getAttribute("icon")||e.setAttribute("small","")}));const i=null===(t=this.shadowRoot)||void 0===t?void 0:t.querySelector(".buttons");this._scrollable=this.radioItems&&(i.scrollHeight>i.clientHeight||i.scrollWidth>i.clientWidth),e.has("items")&&this.items.length>0&&this.radioItems.length&&this.radioItems.forEach((e=>{e.addEventListener("change",(e=>this._updateItems(e)))})),this._onStepsScroll()}}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.dispatchEvent(new CustomEvent("button-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("button-group-link-click",{detail:!0,bubbles:!0,composed:!0}))}_onStepsScroll(){const{scrollLeft:e,scrollWidth:t,offsetWidth:i}=this.shadowRoot.querySelector(".group");this._availableScroll=0===e?"right":e+i>=t?"left":"left right"}render(){return d`
      <div
        class="group ${re({scroll:this.link||this.radioItems.length>3&&!this.stacked&&!this.smallStacked})}"
        @scroll="${this._onStepsScroll}"
      >
        ${this._checkListLength()?this._renderList:de} ${this._renderDate}
        ${this._renderText}
        <div class="buttons ${re({"buttons-half":this.date||this.text})}">
          ${this._renderButtons}${this._renderLink} ${this._renderPadding}
        </div>
      </div>
      ${this._renderGradient}
    `}}_("colors.primaryCoreLightened"),_("colors.cool100");var Ma=e`:host {
  display: block;
  box-sizing: border-box;
  font-size: var(--bbva-data-visualization-lines-font-size, var(--typographyType3XSmall, ${h(p.type3XSmall)}));
  line-height: var(--bbva-data-visualization-lines-line-height, var(--lineHeightType3XSmall, ${h(se.type3XSmall)}));
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 12) * 1em);
  --_data-visualization-lines-icon-color: var(--bbva-data-visualization-lines-icon-dark-mode-color, var(--bbva-data-visualization-lines-icon-color, var(--colorsPrimaryMedium, ${h(u.primaryMedium)})));
  --_bbva-data-visualization-lines-domain-stroke: var(--bbva-data-visualization-lines-domain-stroke-dark-mode-color, var(--bbva-data-visualization-lines-domain-stroke, var(--colorsSecondary300, ${h(u.secondary300)})));
  --_bbva-data-visualization-lines-axis-tick: var(--bbva-data-visualization-lines-axis-tick-dark-mode-color, var(--bbva-data-visualization-lines-axis-tick, var(--colorsSecondary300, ${h(u.secondary300)})));
  --_bbva-data-visualization-lines-text-fill: var(--bbva-data-visualization-lines-text-fill-dark-mode-color, var(--bbva-data-visualization-lines-text-fill, var(--colorsSecondary600, ${h(u.secondary600)})));
  --_bbva-data-visualization-lines-custom-area-fill: var(--bbva-data-visualization-lines-custom-area-fill-dark-mode-color, var(--bbva-data-visualization-lines-custom-area-fill, var(--colorsSecondary300, ${h(u.secondary300)})));
  --_bbva-data-visualization-lines-continuous-line-stroke: var(--bbva-data-visualization-lines-continuous-line-stroke-dark-mode-color, var(--bbva-data-visualization-lines-continuous-line-stroke, var(--colorsSecondary300, ${h(u.secondary300)})));
  --_bbva-data-visualization-lines-dashed-line-stroke: var(--bbva-data-visualization-lines-dashed-line-stroke-dark-mode-color, var(--bbva-data-visualization-lines-dashed-line-stroke, var(--colorsSecondary500, ${h(u.secondary500)})));
  --_bbva-data-visualization-lines-marker-line-stroke: var(--bbva-data-visualization-lines-marker-line-fill-dark-mode-color, var(--bbva-data-visualization-lines-marker-line-fill, var(--colorsPrimaryMedium, ${h(u.primaryMedium)})));
  --_bbva-data-visualization-lines-marker-circle-fill: var(--bbva-data-visualization-lines-marker-circle-fill-dark-mode-color, var(--bbva-data-visualization-lines-marker-circle-fill, var(--colorsPrimaryMedium, ${h(u.primaryMedium)})));
  --_bbva-data-visualization-lines-marker-circle-stroke: var(--bbva-data-visualization-lines-marker-circle-stroke-dark-mode-color, var(--bbva-data-visualization-lines-marker-circle-stroke, var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)})));
  --_bbva-data-visualization-lines-marker-circle-lines-fill: var(--bbva-data-visualization-lines-marker-circle-lines-fill-dark-mode-color, var(--bbva-data-visualization-lines-marker-circle-lines-fill, var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)})));
  --_bbva-data-visualization-lines-marker-circle-lines-opacity: var(--bbva-data-visualization-lines-marker-circle-lines-opacity, 0.4);
  --_bbva-data-visualization-lines-bar-marker-fill: var(--bbva-data-visualization-lines-bar-marker-fill-dark-mode-color, var(--bbva-data-visualization-lines-bar-marker-fill, var(--colorsSecondary500, ${h(u.secondary500)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  font: inherit;
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

.x-domain {
  fill: none;
  stroke: var(--_bbva-data-visualization-lines-domain-stroke);
  stroke-width: 0.0625rem;
}

.x-axis-tick,
.y-axis-tick {
  fill: none;
  stroke: var(--_bbva-data-visualization-lines-axis-tick);
}

.x-axis-tick {
  transform: translateY(0.5rem);
}

.text {
  fill: var(--_bbva-data-visualization-lines-text-fill);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}

.x-axis .tick:first-of-type .text {
  transform: translateX(0);
  text-anchor: start;
}

.x-axis .tick:last-child .text {
  transform: translateX(0);
  text-anchor: end;
}

.y-axis-region {
  max-width: 2.375rem;
}

.hide-text {
  display: none;
}

.customArea {
  fill: var(--_bbva-data-visualization-lines-custom-area-fill);
  opacity: 0.2;
}

.continuous-line,
.line-zero {
  stroke: var(--_bbva-data-visualization-lines-continuous-line-stroke);
}

.dashed-line {
  stroke: var(--_bbva-data-visualization-lines-dashed-line-stroke);
}

.wrap {
  display: flex;
}
.wrap > div {
  flex-grow: 1;
}

.marker {
  cursor: grab;
  touch-action: none;
}
.marker-line {
  fill: var(--_bbva-data-visualization-lines-marker-line-stroke);
}
.marker-circle {
  fill: var(--_bbva-data-visualization-lines-marker-circle-fill);
  stroke: var(--_bbva-data-visualization-lines-marker-circle-stroke);
}
.marker-circle-lines {
  fill: var(--_bbva-data-visualization-lines-marker-circle-lines-fill);
  opacity: var(--_bbva-data-visualization-lines-marker-circle-lines-opacity);
}

.bar-marker {
  fill: var(--_bbva-data-visualization-lines-bar-marker-fill);
}

bbva-core-icon {
  color: var(--_data-visualization-lines-icon-color);
}
`;const La={light:e`[ambient^=light] {
  --bbva-data-visualization-lines-domain-stroke: initial;
  --bbva-data-visualization-lines-axis-tick: initial;
  --bbva-data-visualization-lines-text-fill: initial;
  --bbva-data-visualization-lines-marker-line-fill: initial;
  --bbva-data-visualization-lines-marker-circle-fill: initial;
  --bbva-data-visualization-lines-marker-circle-lines-fill: initial;
  --bbva-data-visualization-lines-bar-marker-fill: initial;
  --bbva-data-visualization-lines-marker-circle-stroke: initial;
  --bbva-data-visualization-lines-custom-area-fill: initial;
  --bbva-data-visualization-lines-dashed-line-stroke: initial;
  --bbva-data-visualization-lines-continuous-line-stroke: initial;
}
`,dark:e`[ambient^=dark] {
  --bbva-data-visualization-lines-domain-stroke: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-data-visualization-lines-axis-tick: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-data-visualization-lines-text-fill: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-data-visualization-lines-marker-line-fill: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-data-visualization-lines-marker-circle-fill: var(--colorsPrimaryCoreDarkened, ${h(u.primaryCoreDarkened)});
  --bbva-data-visualization-lines-marker-circle-lines-fill: var(--colorsSecondary100, ${h(u.secondary100)});
  --bbva-data-visualization-lines-bar-marker-fill: var(--colorsSecondary100, ${h(u.secondary100)});
  --bbva-data-visualization-lines-marker-circle-stroke: var(--ambientsDark, ${h(L.dark)});
  --bbva-data-visualization-lines-dashed-line-stroke: var(--colorsSecondary300, ${h(u.secondary300)});
  --bbva-data-visualization-lines-custom-area-fill: initial;
  --bbva-data-visualization-lines-continuous-line-stroke: initial;
}

[ambient=dark100] {
  --bbva-data-visualization-lines-marker-circle-stroke: var(--ambientsDark100, ${h(L.dark100)});
}

[ambient=dark200] {
  --bbva-data-visualization-lines-marker-circle-stroke: var(--ambientsDark200, ${h(L.dark200)});
}

[ambient=dark300] {
  --bbva-data-visualization-lines-marker-circle-fill: var(--colorsPrimaryMedium, ${h(u.primaryMedium)});
  --bbva-data-visualization-lines-marker-circle-stroke: var(--ambientsDark300, ${h(L.dark300)});
}

[ambient=dark400] {
  --bbva-data-visualization-lines-marker-circle-fill: var(--colorsPrimaryMedium, ${h(u.primaryMedium)});
  --bbva-data-visualization-lines-marker-circle-stroke: var(--ambientsDark400, ${h(L.dark400)});
}
`},Da=e=>Array.isArray(e)&&Boolean(e.length),Ia={linear:Kt,basis:ei,bundle:ti,cardinal:ii,monotone:ai},za={decimal:".",thousands:",",grouping:[3],currency:["$",""],dateTime:"%a %b %e %X %Y",date:"%m/%d/%Y",time:"%H:%M:%S",periods:["AM","PM"],days:["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"],shortDays:["Sun","Mon","Tue","Wed","Thu","Fri","Sat"],months:["January","February","March","April","May","June","July","August","September","October","November","December"],shortMonths:["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]};class Ba extends(i(a)){static get is(){return"bbva-data-visualization-lines"}static get properties(){return{data:{type:Array,reflect:!0},width:{type:Number,reflect:!0},height:{type:Number,reflect:!0},language:{type:Object,reflect:!0},marginsChart:{type:Object,attribute:"margins-chart",reflect:!0},numPointsXaxis:{type:Number,attribute:"num-points-xaxis",reflect:!0},ticksSizeXAxis:{type:Number,attribute:"ticks-size-xaxis",reflect:!0},interpolateType:{type:String,attribute:"interpolate-type",reflect:!0},marginXAxisLegend:{type:Number,attribute:"margin-xais-legend",reflect:!0},formatLegend:{type:String,attribute:"format-legend",reflect:!0},selected:{type:Number,reflect:!0},markerRadius:{type:Number,attribute:"marker-radius",reflect:!0},hideXAxis:{type:Boolean,attribute:"hide-x-axis"},hideXAxisTick:{type:Boolean,attribute:"hide-x-axis-tick"},hideYAxis:{type:Boolean,attribute:"hide-y-axis"},hideYAxisTick:{type:Boolean,attribute:"hide-y-axis-tick"},yAxisLabel:{type:String,reflect:!0,attribute:"y-axis-label"},customDashedLineValue:{type:Number,attribute:"custom-dashed-line-value"},customContinuousLineValue:{type:Number,attribute:"custom-continuous-line-value"},accessibilityChartLabel:{type:String,attribute:"accessibility-chart-label"},showMarker:{type:Boolean,attribute:"show-marker"},showValueZero:{type:Boolean,attribute:"show-value-zero"}}}constructor(){super(),this.markerRadius=16,this._margin=16,this._marginMarker=56,this._lineAxisX={},this._pointsXaxis=[],this._pointsYaxis=[],this.yAxisLabel="~s",this._yAxisPadding=36,this.selected=0,this.data=[],this.marginsChart={top:16,right:0,bottom:16,left:16},this.width=288,this.height=356,this._points=[],this._maxPoints=0,this.numPointsXaxis=7,this.ticksSizeXAxis=7,this.interpolateType="linear",this.marginXAxisLegend=40,this.formatLegend="%b",this.language=za,this.domain=[],this.hideXAxis=!1,this.hideXAxisTick=!1,this.hideYAxis=!1,this.hideYAxisTick=!1,this.customDashedLineValue=0,this.customContinuousLineValue=0,this.accessibilityChartLabel="",this.showMarker=!1,this.showValueZero=!1,this.$chart=document.createElement("div"),this.$chart.setAttribute("class","chart"),this.$chart.setAttribute("id","chart"),this.$yAxis=document.createElement("div"),this.$yAxis.setAttribute("class","y-axis"),this.$accessibilityLabels=document.createElement("span"),this.$accessibilityLabels.setAttribute("class","accessibility-label")}static get styles(){return[Ma,La.light,La.dark,l("bbva-data-visualization-lines-shared-styles")]}get widthContentChart(){let e;return this.hideYAxis?(this.marginsChart.right=16,e=this.width-this.marginsChart.left-this.marginsChart.right):e=this.width-this._yAxisPadding-this.marginsChart.left-this.marginsChart.right,e}get heightContentChart(){return this.height-this.marginsChart.top-this.marginsChart.bottom}get _getValues(){var e;return null===(e=this.data)||void 0===e?void 0:e.map((e=>e.data)).flat()}get _isEmpty(){var e;return""===this.data||0===(null===(e=this.data)||void 0===e?void 0:e.length)||void 0===this.data||null===this.data}get _min(){return Ht(this._getValues,(({value:e})=>e))}get _max(){return si(this._getValues,(({value:e})=>e))}get _mean(){return oi(this._getValues,(({value:e})=>e))}get _hasMeanZero(){return 0===this._mean}get _yScaleInvert(){return Yt().domain([0,this._max]).range([this._hasMeanZero?0:this.heightContentChart,0]).clamp(!0)}get _yAxisWidth(){return Ft(this.$yAxis).selectAll(".y-axis-region").node().getBoundingClientRect()}get _newYAxisCanvas(){return Ft(this.$yAxis).append("svg").classed("y-axis-svg",!0).attr("aria-hidden","true")}connectedCallback(){this.width=this.width||this.$chart.clientWidth,this.height=this.height||this.$chart.clientHeight,super.connectedCallback&&super.connectedCallback()}render(){return d`
      <div class="wrap" aria-hidden="true">${this.$yAxis}${this.$chart}</div>
      ${this.$accessibilityLabels}
    `}firstUpdated(){super.firstUpdated(),this.chart=Ft(this.$chart).append("svg").attr("class","svg-chart").attr("role","img").attr("width",this.width).attr("height",this.showMarker?this.height+this._marginMarker:this.height+this._margin),this.dispatchEvent(new CustomEvent("data-visualization-lines-chart-create",{bubbles:!0,composed:!0,detail:!0})),this.yAxisCanvas=this._newYAxisCanvas,this.accessibilityRegion=Ft(this.$accessibilityLabels).attr("attributeName","accessibilityRegion").attr("class","sr-only"),window.ResizeObserver&&new ResizeObserver((()=>{this._getValues&&this.updateComplete.then((e=>this.drawChart(e,this.data)))})).observe(this)}update(e){var t,i,a,r;(super.update(e),e.has("language")&&Gt(this.language),(e.has("height")||e.has("width"))&&(this.width=this.width||this.$chart.clientWidth,this.height=this.height||this.$chart.clientHeight,Ft(this.$chart).select("svg")&&Ft(this.$chart).select("svg").attr("width",this.width).attr("height",this.height)),e.has("data")&&Da(this.data)&&(a=this.data,r=e.get("data"),!Array.isArray(a)||!Array.isArray(r)||a.length!==r.length||JSON.stringify(a)!==JSON.stringify(r)))&&(this.domain=jt(null===(t=this.data[0])||void 0===t?void 0:t.data,(({date:e})=>e)).map((e=>new Date(e))),Ft(this.$chart).selectAll("svg > g > *").remove(),null!==(i=this.domain)&&void 0!==i&&i.length&&(this.axisX=Wt().range([0,this.widthContentChart]).domain(this.domain),this.drawChart(this.chart,this.data)));e.has("data")&&!Da(this.data)&&Ft(this.$chart).select("svg").remove(),e.has("selected")&&this._observerSelected(this.selected)}_accessibleLabels(){this.accessibilityRegion.append("span").text(this.accessibilityChartLabel),this.accessibilityRegion.selectAll(".accessibility-label").data(this.data).enter().append("span").attr("tabindex","0").text((e=>`\n          ${e.data.map((e=>`${new Date(e.date).toLocaleDateString()} ${e.value}`))}`))}_getAxisPoints(e){const[t,i]=jt(e,(({date:e})=>e)),a=Math.floor((i-t)/(this.numPointsXaxis-1)),r=[new Date(t)];for(let e=1;e<=this.numPointsXaxis-1;e+=1)r.push(new Date(t+a*e));return r}_setXAxis(){var e;this.axisX=Wt().range([0,this.widthContentChart]).domain(this.domain),this._pointsXaxis=this._getAxisPoints(null===(e=this.data[0])||void 0===e?void 0:e.data),this._lineAxisX=Xt(this.axisX).tickValues(this._pointsXaxis).tickSize(this.ticksSizeXAxis).tickFormat((e=>{const t=ri(this.formatLegend)(e);return"%b"===this.formatLegend?t.charAt(0):t})).tickSize(2).tickSizeOuter(0).tickPadding(4);const t=this.heightContentChart+16;return this.chart.append("g").attr("class","x-axis axis bottom").attr("transform",`translate(16, ${t})`).call(this._lineAxisX),Ft(this.$chart).selectAll(".x-axis .tick text").attr("class",this.hideXAxis?"hide-text":"text").attr("y",14),Ft(this.$chart).selectAll(".x-axis .domain").classed("x-domain",!0),Ft(this.$chart).selectAll(".x-axis .tick line").classed("x-axis-tick",!0),(this.showMarker||this.hideXAxisTick)&&Ft(this.$chart).selectAll(".x-axis-tick").remove(),this._min<0&&Ft(this.$chart).selectAll(".x-axis .domain").remove(),this._lineAxisX}_setYAxis(){const e=Yt().range([this.heightContentChart,0]);this.showValueZero?this._min>0&&this._max>0?e.domain([0,this._max]):this._min<0&&this._max<0?e.domain([this._min,0]):e.domain(jt(this._getValues,(e=>+e.value))):e.domain(jt(this._getValues,(e=>+e.value))),this._lineAxisY=Ut(e).tickFormat(Zt(this.yAxisLabel)).tickSize(2).tickSizeOuter(0).tickPadding(4),Ft(this.$yAxis).selectAll(".y-axis-svg").append("g").attr("class","y-axis-region axis left").call(this._lineAxisY);const t=this._yAxisWidth;return Ft(this.$yAxis).selectAll(".y-axis-region .domain").remove(),Ft(this.$yAxis).selectAll(".y-axis-region .tick text").attr("class","text"),Ft(this.$yAxis).selectAll(".y-axis-region .tick line").classed("y-axis-tick",!0),Ft(this.$yAxis).selectAll(".y-axis-region").attr("transform",`translate(${this.hideYAxis&&!this.hideYAxisTick?8:Math.min(t.width)}, 16)`),Ft(this.$yAxis).selectAll(".y-axis-svg").attr("width",this.hideYAxis&&!this.hideYAxisTick?8:Math.min(t.width)).attr("height",this.height),this.$yAxis.setAttribute("style",`max-width: ${Math.min(t.width)}px`),this.hideYAxis&&Ft(this.$yAxis).selectAll(".y-axis-region .tick .text").remove(),this.hideYAxisTick&&Ft(this.$yAxis).selectAll(".y-axis-tick").remove(),this._lineAxisY}_deleteChart(){Ft(this.$yAxis).selectAll(".y-axis-svg").remove(),Ft(this.$chart).select(".graphContainer").remove(),Ft(this.$chart).select(".x-axis").remove(),Ft(this.$chart).select(".bar-marker-container").remove(),Ft(this.$chart).select(".marker-container").remove()}drawChart(){this._deleteChart(),this.hideYAxis&&this.hideYAxisTick||(this.yAxisCanvas=this._newYAxisCanvas,this._setYAxis()),Ft(this.$chart).select("svg")&&Ft(this.$chart).select("svg").attr("width",this.width-this.$yAxis.clientWidth+this._margin).attr("height",this.showMarker?this.height+this._marginMarker:this.height+this._margin),this._graphContainer=this.chart.append("g").data([{x:0,y:0}]).attr("class","graphContainer").attr("transform","translate(16,16)"),this._dotsContainer=this._graphContainer.append("g").data([{x:0,y:0}]).attr("class","dotsContainer"),this._isEmpty||this._setXAxis();const e=Wt().range([0,this.widthContentChart]),t=Yt().range([this.heightContentChart,0]);let i=0;const a=this._getValues;e.domain(jt(a,(e=>e.date))),this.showValueZero?this._min>0&&this._max>0?t.domain([0,this._max]):this._min<0&&this._max<0?t.domain([this._min,0]):t.domain(jt(a,(e=>e.value))):t.domain(jt(a,(e=>e.value)));const r=Qt().x((a=>{const r=e(a.date),s=t(a.value);return this._points[i].push({x:r,y:s}),r})).y((e=>t(e.value))).curve(Ia[this.interpolateType]);this._points=[],this.data.forEach((e=>{var t;const a=(null===(t=e.data)||void 0===t?void 0:t.length)||0;this._points.push([]),this._graphContainer.append("path").attr("d",r(e.data)).attr("class","line").attr("stroke",e.color).attr("stroke-width",4).attr("fill","none"),i+=1,this._maxPoints=this._maxPoints<a?a-1:this._maxPoints})),this.showMarker&&!this._isEmpty&&(this._appendBarSelector(),this.drawMarker(),this._setNewPosData(this.selected,!0)),this._min<0&&this._drawLine(e,t,a,0,!0),this.customDashedLineValue&&this.customDashedLineValue>this._min&&this.customDashedLineValue<this._max&&this._drawLine(e,t,a,this.customDashedLineValue,!1),this.customContinuousLineValue&&this.customContinuousLineValue>this._min&&this.customContinuousLineValue<this._max&&(this._drawLine(e,t,a,this.customContinuousLineValue,!0),this._customArea()),this._accessibleLabels()}_drawLine(e,t,i,a,r){const s=Qt().x((t=>e(t.date))).y((e=>t(e.value))).curve(Ia[this.interpolateType]),[o,n]=jt(i,(({date:e})=>e)),l=[{date:o,value:a},{date:n,value:a}];let d;d=0===a&&r?"line-zero":r?"continuous-line":"dashed-line",this._graphContainer.append("path").attr("d",s(l)).style("stroke-dasharray",r?"0":"3, 3").attr("class",d).attr("stroke-width",1).attr("fill","none")}_customArea(){this._graphContainer.append("rect").attr("x",0).attr("width",this.widthContentChart).attr("height",this.heightContentChart-this._yScaleInvert(this.customContinuousLineValue)).attr("y",this.customContinuousLineValue<0?0:this._yScaleInvert(this.customContinuousLineValue)).attr("class","customArea")}_createSelectedDots(e){this._dotsContainer.selectAll("circle").remove(),this._points.forEach(((t,i)=>{var a,r;this._dotsContainer.append("circle").attr("class",`dot L${i+1}`).attr("cx",t[e].x).attr("cy",t[e].y).attr("r",6).attr("fill",null===(a=this.data[i])||void 0===a?void 0:a.color),this._dotsContainer.append("circle").attr("class",`dot L${i+1}`).attr("cx",t[e].x).attr("cy",t[e].y).style("opacity",.15).attr("r",12).attr("fill",null===(r=this.data[i])||void 0===r?void 0:r.color)}))}_getNewSection(e){return this._points[0].findIndex(((t,i)=>t.x<=e&&e<=this._points[0][i+1].x))}_setNewPosData(e,t){const{x:i}=this._points[0][e];this._markerContainer.attr("transform",`translate(${i+16}, 16)`),t&&(this._markerContainer.currentX=i),this._createSelectedDots(e),this._dispatchEventOnDrag(e),this._positionSelected=e}_dispatchEventOnDrag(e){var t,i,a;const r=null===(t=this.data)||void 0===t?void 0:t.map((t=>{var i;return null===(i=t.data[e])||void 0===i?void 0:i.value})),s=new Date(parseFloat(null===(i=this.data[0])||void 0===i||null===(a=i.data[e])||void 0===a?void 0:a.date));e!==this._positionSelected&&this.dispatchEvent(new CustomEvent("data-visualization-lines-drag",{bubbles:!0,composed:!0,detail:{selected:e,date:s,value:r}}))}drawMarker(){var e;this._markerContainer=this.chart.append("g").data([{x:0,y:0}]).attr("class","marker-container").attr("transform","translate(16,16)"),this._markerContainer.currentX=0;const t=Jt().domain([0,this.widthContentChart]).range((null===(e=this._points[0])||void 0===e?void 0:e.map(((e,t)=>t)))||[]),i=ni().on("drag",(()=>{const e=this._markerContainer.currentX+qt.x;this._setNewPosData(t(e))})).on("end",(()=>{const e=this._markerContainer.currentX+qt.x;this._setNewPosData(t(e),!0)}));this._markerContainer.call(i);const a=this.heightContentChart,r=`-0.5 ${a}, 0 0, 0.5 ${a}`;this._markerContainer.append("polyline").attr("class","marker-line").attr("points",r),this._appendSelector(),this._createSelectedDots(t(0))}_appendSelector(){const e=this._markerContainer.append("svg").attr("class","marker").attr("width",2*this.markerRadius).attr("height",2*this.markerRadius).attr("viewBox",`0 0 ${2*this.markerRadius} ${2*this.markerRadius}`).attr("x",-this.markerRadius).attr("y",this.heightContentChart+this.marginXAxisLegend).append("g").attr("fill","none").attr("fill-rule","evenodd");return e.append("circle").attr("class","marker-circle").attr("cx",this.markerRadius).attr("cy",this.markerRadius).attr("r",this.markerRadius).attr("stroke-width",1),e.append("g").attr("class","marker-circle-lines").append("path").attr("d","M10.667 12.8H12.8v7.467h-2.133zM14.934 12.8h2.133v7.467h-2.133zM19.2 12.8h2.133v7.467H19.2z"),e}_appendBarSelector(){const e=Ft(this.$chart).select("svg"),t=this.heightContentChart+this.marginXAxisLegend+2*this.markerRadius,i=e.append("g").attr("class","bar-marker-container").attr("transform",`translate(16, ${t})`);return i.append("rect").attr("class","bar-marker").attr("width",this.widthContentChart).attr("height",4).attr("transform","skewX(-27)"),i}_observerSelected(e){var t;null!==(t=this._points[0])&&void 0!==t&&t[e]&&this._setNewPosData(e,!0)}}_("colors.primarySubduedLight"),_("colors.cool40"),_("colors.cool40"),_("colors.primaryCoreLightened"),_("colors.cool40"),_("colors.cool40"),_("colors.cool20"),_("colors.primaryMediumLight"),_("colors.primaryMedium"),_("colors.cool100"),_("colors.primaryCoreLightened"),_("colors.cool20");var Na=e`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${h(u.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${h(u.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${h(u.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${h(u.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${h(se.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(M.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${h(se.typeLarge)});
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
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
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
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
`,Oa=e`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,Ra=e`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${h(u.primaryMedium)});
}
`;const Va={light:e`
    ${z.light}
    ${Oa}
  `,dark:e`
    ${z.dark}
    ${Ra}
  `};class Fa extends(le(i(m(v(a))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":he,"bbva-link":H,"bbva-text":b}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=pe,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[Na,super.styles,l("bbva-panel-info-shared-styles"),Va.light,Va.dark]}get _contentImage(){return this.image?d` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:d`
      <span
        class="${re({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===pe}render(){return d`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&d`
          <bbva-text
            tabindex="0"
            class="title ${re({"not-text":!this.text})}"
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
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.cool50");var qa=e`:host {
  display: block;
  box-sizing: border-box;
  --_bbva-background-color-light: var(--follow-up-investments-dashboard-bbva-dark-mode-background-color-light, var(--ambientsLight, ${h(L.light)}));
  --_bbva-background-color-light100: var(--follow-up-investments-dashboard-bbva-dark-mode-background-color-light100, var(--ambientsLight100, ${h(L.light100)}));
  --_bbva-background-color-dark400: var(--follow-up-investments-dashboard-bbva-dark-mode-background-color-dark400, var(--ambientsDark400, ${h(L.dark400)}));
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  :host {
    --safe-area-inset-bottom: env(safe-area-inset-bottom);
    padding-bottom: var(--safe-area-inset-bottom, 0);
  }
}

:host([hidden]), [hidden] {
  display: none !important;
}

ul {
  list-style: none;
  margin: 0;
  padding: 0;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[ambient^=dark400] {
  background-color: var(--_bbva-background-color-dark400);
  padding-top: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
}

[ambient^=light] {
  background-color: var(--_bbva-background-color-light);
}

[ambient^=light100] {
  background-color: var(--_bbva-background-color-light100);
}
[ambient^=light100] [data-tag-name=bbva-text] {
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 15) * 1em);
}

[data-tag-name=bbva-link] {
  display: flex;
  justify-content: center;
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 15) * 1em);
  --bbva-link-with-icon-text-color: var(--colorsPrimarySubdued, ${h(u.primarySubdued)});
  --bbva-link-with-icon-icon-color: var(--colorsPrimarySubdued, ${h(u.primarySubdued)});
  --bbva-link-active-with-icon-text-color: var(--colorsPrimaryMediumLight, ${h(u.primaryMediumLight)});
  --bbva-link-active-with-icon-icon-color: var(--colorsPrimaryMediumLight, ${h(u.primaryMediumLight)});
}

[data-tag-name=bbva-carousel-swipe] {
  --bbva-panel-offer-content-text-padding: 0;
}

[data-tag-name=bbva-header-category] {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 15) * 1em);
}

[data-tag-name=bbva-button-group]:nth-child(1) {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-notification-help] {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-help-modal] [data-tag-name=bbva-panel-info] {
  --bbva-panel-info-title-color: var(--colorsSecondary600, ${h(u.secondary600)});
  --bbva-panel-info-text-color: var(--colorsSecondary600, ${h(u.secondary600)});
}

[data-tag-name=bbva-form-date-range][start-error] {
  padding-bottom: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 15) * 1em);
}
`;var Ha=e`[ambient^=light] {
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
${(new t).mediaRules()}`;const Ya=new t;var Ga=e`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${h(u.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${h(u.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${h(u.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${h(u.primaryCoreLightened)});
}
${Ya.mediaRules()}`;const ja={dark:e`
    ${z.dark}
    ${ue.dark}
    ${me.dark}
    ${Ga}
  `,light:e`
    ${z.light}
    ${ue.light}
    ${me.light}
    ${Ha}
  `},Wa=new t;var Xa=e`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${h(u.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${h(u.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${h(u.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${h(u.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${h(u.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${h(u.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${h(u.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${h(u.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${h(u.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${h(u.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${h(u.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(M.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(M.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${h(M.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${h(M.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${h(M.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${h(M.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem);
}
${Wa.mediaRules()}`;class Ua extends(m(ve(be(le(i(v(a))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[fe,H,ye,b,we];return Ua.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Xa,ja.light,ja.dark,y("button:focus"),l("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return d`
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
    `}get _mask(){const e=ge(this.mask,this.maskChars,!0,this.visibleChars);return d`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${e.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let e=null;return this.actionIcon||this.actionSecondaryIcon?e=this._actionIcons:this.actionLink&&(e=this._tplLink("actionLink")),e}get _definitionDescriptionTpl(){let e=null,t="";return this.description?(e=this._tplText("description"),t="description"):this.mask?(e=this._mask,t="mask"):this._isValidAmount&&(e=this._amount,t="amount"),d`
      <dd class=${re({[`wrapper-${t}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){const t="actionLink"===e?`${e}AccessibilityText`:`${e}LinkAccessibilityText`;return d`
      <bbva-link
        class=${re({ellipsis:this[`${e}Ellipsis`]})}
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
        <dt class=${re({ellipsis:this.labelEllipsis})}>
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
    `}}_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.cool60"),_("colors.primaryCoreLightened"),_("colors.primarySubdued"),_("colors.primaryMediumLight"),_("colors.primarySubdued"),_("colors.primaryMediumLight"),_("colors.cool50");var Za=e`:host {
  display: block;
  box-sizing: border-box;
  --_bbva-background-color-light: var(--follow-up-investments-dashboard-card-carousel-bbva-dark-mode-background-color-light, var(--ambientsLight, ${h(L.light)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

ul {
  list-style: none;
  margin: 0;
  padding: 0;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[ambient^=light] {
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
  background-color: var(--_bbva-background-color-light);
}

.padding-bottom-2 {
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-badge-category] {
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-button-default] {
  box-sizing: border-box;
  display: block;
  width: max-content;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(D.spacer)}))) / 16) * 1rem) auto;
}
`;class Qa extends(v(i(a))){static get is(){return"follow-up-investments-dashboard-card-carousel"}static get scopedElements(){const e=[Se,F,Ua];return Qa.scopedElementsFromClasses(e)}static get properties(){return{accumulatedProfitability:{type:Number,attribute:"accumulated-profitability"},amountContributed:{type:Number,attribute:"amount-contributed"},amountInvested:{type:Number,attribute:"amount-invested"},category:{type:String},currency:{type:String},earnings:{type:Number},productId:{type:String,attribute:"product-id"},name:{type:String},nameClickEvent:{type:String,attribute:"name-click-event"},productTypeName:{type:String,attribute:"product-type-name"},language:{type:String},loading:{type:Boolean}}}static get styles(){return[Za,O.light,_e.light,ja.light,l("follow-up-investments-dashboard-card-carousel-shared-styles")]}constructor(){super(),this.accumulatedProfitability=0,this.amountContributed=0,this.amountInvested=0,this.category="",this.currency="USD",this.earnings=0,this.language="en",this.loading=!1,this.name="",this.productId="",this.productTypeName=""}render(){return d`
      <div ambient="light">
        ${this.loading?d`
  <div class="padding-bottom-2"></div>
  ${Array(6).fill().map((()=>d`
        <bbva-list-simple label="label" loading></bbva-list-simple>
      `))}
`:d`
              <bbva-badge-category
                category="${this.category}"
                text="${this.productTypeName}"
              ></bbva-badge-category>
              <bbva-list-link
                header-text="${this.name}"
                @click="${this._productNameClick}"
              ></bbva-list-link>
              <ul>
                <li>
                  <bbva-list-simple
                    label-ellipsis
                    action-link-ellipsis
                    label="${this.t("follow-up-investments-dashboard-card-carousel-list-simple-label-1")}"
                    amount=${this.amountInvested}
                    currency-code="${this.currency}"
                    local-currency="${this.currency}"
                    language="${this.language}"
                  >
                  </bbva-list-simple>
                </li>
                <li>
                  <bbva-list-simple
                    label-ellipsis
                    action-link-ellipsis
                    label="${this.t("follow-up-investments-dashboard-card-carousel-list-simple-label-2")}"
                    amount=${this.earnings}
                    currency-code="${this.currency}"
                    local-currency="${this.currency}"
                    language="${this.language}"
                  >
                  </bbva-list-simple>
                </li>
                <li>
                  <bbva-list-simple
                    label-ellipsis
                    action-link-ellipsis
                    label="${this.t("follow-up-investments-dashboard-card-carousel-list-simple-label-3")}"
                    amount=${this.accumulatedProfitability}
                    currency-code="%"
                    language="${this.language}"
                  >
                  </bbva-list-simple>
                </li>
                <li>
                  <bbva-list-simple
                    label-ellipsis
                    action-link-ellipsis
                    label="${this.t("follow-up-investments-dashboard-card-carousel-list-simple-label-4")}"
                    amount=${this.amountContributed}
                    currency-code="${this.currency}"
                    local-currency="${this.currency}"
                    language="${this.language}"
                  >
                  </bbva-list-simple>
                </li>
              </ul>
            `}
      </div>
    `}_productNameClick(){this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-card-carousel-product-name-click",{bubbles:!0,composed:!0,detail:{productId:this.productId}})),this.nameClickEvent&&this.dispatchEvent(new CustomEvent(this.nameClickEvent,{bubbles:!0,composed:!0,detail:{productId:this.productId}}))}}const Ja="transparent",Ka=[{id:"byValue",label:"follow-up-investments-dashboard-radio-value"},{id:"byProfitability",label:"follow-up-investments-dashboard-radio-profitability"}],er="year-to-date",tr="BALANCE",ir={"one-month":{id:"one-month",label:"follow-up-investments-dashboard-select-one-month",labelShort:"follow-up-investments-dashboard-select-one-month-short",numberMonths:1,type:"months",valueForType:1},"three-months":{id:"three-months",label:"follow-up-investments-dashboard-select-three-months",labelShort:"follow-up-investments-dashboard-select-three-months-short",numberMonths:3,type:"months",valueForType:3},"year-to-date":{id:"year-to-date",label:"follow-up-investments-dashboard-select-year-to-date",labelShort:"follow-up-investments-dashboard-select-year-to-date",numberMonths:0,type:"year",valueForType:0},"one-year":{id:"one-year",label:"follow-up-investments-dashboard-select-one-year",labelShort:"follow-up-investments-dashboard-select-one-year",numberMonths:12,type:"year",valueForType:1},"two-years":{id:"two-years",label:"follow-up-investments-dashboard-select-two-years",labelShort:"follow-up-investments-dashboard-select-two-years",numberMonths:24,type:"year",valueForType:2},"start-investment":{id:"start-investment",label:"follow-up-investments-dashboard-select-start-investment",labelShort:"follow-up-investments-dashboard-select-start-investment",numberMonths:null,type:null,valueForType:0}},ar=[ir["one-month"],ir["three-months"],ir["year-to-date"],ir["one-year"],ir["two-years"],ir["start-investment"]],rr="custom-dates",sr={DEPOSIT:{id:"DEPOSIT",label:"follow-up-investments-dashboard-product-deposit",nameClickEvent:"follow-up-investments-dashboard-product-deposit-click"},INVESTMENT_FUND:{id:"INVESTMENT_FUND",label:"follow-up-investments-dashboard-product-fund",nameClickEvent:"follow-up-investments-dashboard-product-fund-click"},INVESTMENT_INTERNATIONAL_FUND:{id:"INVESTMENT_INTERNATIONAL_FUND",label:"follow-up-investments-dashboard-product-international-fund",nameClickEvent:"follow-up-investments-dashboard-product-international-fund-click"},SECURITIES_ACCOUNT:{id:"SECURITIES_ACCOUNT",label:"follow-up-investments-dashboard-product-account",nameClickEvent:"follow-up-investments-dashboard-product-stock-account-click"},SAVING_PLAN:{id:"SAVING_PLAN",label:"follow-up-investments-dashboard-product-saving-plan",nameClickEvent:"follow-up-investments-dashboard-product-saving-plan-click"},RETIREMENT_PLAN:{id:"RETIREMENT_PLAN",label:"follow-up-investments-dashboard-product-retirement-plan",nameClickEvent:"follow-up-investments-dashboard-product-retirement-plan-click"},PORTFOLIO:{id:"PORTFOLIO",label:"follow-up-investments-dashboard-product-retirement-portfolio",nameClickEvent:"follow-up-investments-dashboard-product-retirement-portfolio-click"},MANAGED_INVESTMENTFUNDS_PORTFOLIO:{id:"MANAGED_INVESTMENTFUNDS_PORTFOLIO",label:"follow-up-investments-dashboard-product-managed-portfolio",nameClickEvent:"follow-up-investments-dashboard-product-managed-portfolio-click"}},or=[sr.DEPOSIT,sr.INVESTMENT_FUND,sr.INVESTMENT_INTERNATIONAL_FUND,sr.SECURITIES_ACCOUNT,sr.SAVING_PLAN,sr.RETIREMENT_PLAN,sr.PORTFOLIO,sr.MANAGED_INVESTMENTFUNDS_PORTFOLIO],nr=[sr.DEPOSIT.id,sr.INVESTMENT_FUND.id,sr.SECURITIES_ACCOUNT.id,sr.SAVING_PLAN.id,sr.RETIREMENT_PLAN.id,sr.PORTFOLIO.id,sr.MANAGED_INVESTMENTFUNDS_PORTFOLIO.id],lr="EVOLUTION_SUMMARIES_BY_PERIOD",{moment:dr}=window,cr={startDate:`${dr().year()}-01-01 00:00:00`,endDate:`${dr().year()}-01-05 23:59:59`},hr={day:"numeric",month:"short",year:"numeric"},pr="MONTHLY",{moment:ur}=window;let mr;function vr(e,{byValue:t}){return[{label:"line-1",color:"#00c9ce",data:e.map((({profitabilityInvest:e,specificAmounts:i,valuationDate:a})=>{const r=t?mr(i).balance.amount.amount||0:e||0;return{date:ur.utc(a).valueOf(),value:r}}))}]}const br=({id:e,bank:t,productType:i,simpleCode:a,name:r,amounts:s=[],number:o,stockMarket:n,currencies:l=[],numberTypeIsin:d}={})=>{var c;return{id:e,bank:t,productType:i,simpleCode:a,name:r,amount:s[0]?s[0].amount:0,currency:s[0]?s[0].currency:null===(c=l[0])||void 0===c?void 0:c.currency,numberType:{id:d},number:o,status:{id:"VALID"},stockMarket:n}},gr=(e,t,i=[])=>{const{startDate:a,endDate:r}=e.period,s={period:{startDate:a,endDate:r,periodGroup:{id:e.frequency.id}},contracts:i.map((e=>{const{amount:t,bank:i,currency:s,id:o,number:n,numberType:l,productType:d,stockMarket:c}=e;return{investmentValueAmount:{amount:t,currency:s},bank:i,id:o,number:n,numberType:l,productType:d,stockMarket:c,startDate:a,endDate:r}}))};return t===lr?(s.isGroupedByDate=!0,s.isProfitability=!0):(s.isGroupedByWeight=!0,s.isGroupedByCancelled=!1),s},fr=(e,t)=>{var i;"main-header"===(null===(i=(e=>(e.composedPath&&e.composedPath()||e.path)[0])(e))||void 0===i?void 0:i.id)&&t&&t()},yr=(e,t)=>{var i,a;return e.id===t.id&&e.number===t.number&&(null===(i=e.stockMarket)||void 0===i?void 0:i.id)===(null===(a=t.stockMarket)||void 0===a?void 0:a.id)},wr=(e=[],t)=>e.map((e=>{const i={...e},a=t.find((t=>yr(t,e)))||{};return i.name=a.name,i})),kr=(e,t)=>{const i=ir[e],{id:a,type:r,valueForType:s}=i||{};return((e,t,i,a)=>{const r=ur();return e===ir["year-to-date"].id?r.startOf("year"):e===ir["start-investment"].id?ur(a):r.subtract(i,t).startOf("day")})(a,r,s,t).format("YYYY-MM-DD")},xr=({hasHistoricalDataForAllContracts:e=!0,maximumHistoricalDate:t}={})=>ar.reduce(((i,a)=>{const{id:r,label:s,labelShort:o,numberMonths:n}=a;if(!1===e&&r===ir["start-investment"].id)return i;let l=!0;return t&&(l=ur().subtract(n,"month").isBetween(t,void 0,void 0,"[]")),l&&i.push({id:r,label:s,labelShort:o,numberMonths:n,disabled:!1}),i}),[]),_r=(e,t,i={},a)=>{const r=e===rr?{startDate:i.startDate,endDate:i.endDate}:{startDate:kr(e,t),endDate:ur().format("YYYY-MM-DD")};return{period:r,frequency:{id:Math.abs(ur(r.startDate).diff(r.endDate,"years",!0))>2&&a?pr:"DAILY"}}};var Sr=e`
  [data-tag-name='bbva-help-modal'].faqs-modal {
    --bbva-help-modal-padding: 0;
    z-index: 99;
  }
`;const{moment:Cr}=window;class $r extends(C(mi(I(v(a))))){static get is(){return"follow-up-investments-dashboard"}static get scopedElements(){const e=[ie,Pa,fa,oa,Ba,Ot,Dt,Ne,Be,Ie,ze,Et,Y,Ce,H,li,F,$e,Fa,b,gi,ca,Qa,...$r.configurationScopedElements()];return $r.scopedElementsFromClasses(e)}static get properties(){return{aemData:{type:Object,attribute:"aem-data"},aemHost:{type:String,attribute:"aem-host"},compositeEncryptionIndicator:{type:Array,attribute:"composite-encryption-indicator"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},contractsConfigurationDefect:{type:String,attribute:"contracts-configuration-defect"},contractsConfigurationRelatedContractsApiVersion:{type:String,attribute:"contracts-configuration-related-contracts-api-version"},contractsConfigurationsApiVersion:{type:String,attribute:"contracts-configuration-api-version"},errorModalVisible:{type:Boolean,attribute:"error-modal"},faqsModalVisible:{type:Boolean,attribute:"faqs-modal"},financialOverview:{type:Object,attribute:"financial-overview"},financialOverviewApiVersion:{type:String,attribute:"financial-overview-api-version"},financialInvestmentsApiVersion:{type:String,attribute:"financial-investments-api-version"},hideMenuIcon:{type:Boolean,attribute:"hide-menu-icon"},investmentProductType:{type:Array,attribute:"investment-product-type"},maxNumErrors:{type:Number,attribute:"max-num-errors"},numberTypeIsin:{type:String,attribute:"number-type-isin"},numberIsin:{type:String,attribute:"number-isin"},onboardingModal:{type:Boolean,attribute:"onboarding-modal"},onboardingSlides:{type:Array,attribute:"onboarding-slides"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},showOnboarding:{type:Boolean,attribute:"show-onboarding"},specificAmountProduct:{type:String,attribute:"specific-amount-product"},numberStockMarket:{type:String,attribute:"number-stock-market"},onboardingInitTimeout:{type:Number,attribute:"onboarding-init-timeout"},showMonthlyQueries:{type:Boolean,attribute:"show-monthly-queries"},typeInternationalFunds:{type:String,attribute:"type-international-funds"},_customDatesModalVisible:{type:Boolean},_customStartDate:{type:String},_customStartDateTmp:{type:String},_customEndDate:{type:String},_customEndDateTmp:{type:String},_customMinStartDate:{type:String},_dataVisualizationLinesData:{type:Array},_dataVisualizationLinesSelected:{type:Number},_dataVisualizationLinesWidth:{type:Number},_evolutionModel:{type:Array},_moreInfoModel:{type:Object},_periodList:{type:Array},_productsCardModel:{type:Array},_selectedChartType:{type:String},_selectedDateIndex:{type:Number},_selectedPeriod:{type:String},_selectedPeriodPayload:{type:Object},_starsRating:{type:Number},_notFirstTimeChart:{type:Boolean},_notFirstTimePeriod:{type:Boolean}}}constructor(){super(),this.aemData={},this.aemHost="",this.compositeEncryptionIndicator=[],this.contentFragmentPath="",this.contractsConfigurationDefect="00000000",this.contractsConfigurationRelatedContractsApiVersion="0",this.contractsConfigurationsApiVersion="0",this.errorModalVisible=!1,this.faqsModalVisible=!1,this.financialInvestmentsApiVersion="",this.financialOverview=null,this.financialOverviewApiVersion="0",this.hideMenuIcon=!1,this.investmentProductType=nr,this.maxNumErrors=3,this.numberTypeIsin="ISIN",this.numberIsin="000000000000",this.onboardingModal=!1,this.showOnboarding=!1,this.specificAmountProduct="",this.numberStockMarket="0000",this.onboardingInitTimeout=0,this.onboardingSlides=[{microillustration:"moneygraphicdollar",title:"follow-up-investments-dashboard-onboarding-slide-1-title",description:"follow-up-investments-dashboard-onboarding-slide-1-description"}],this.showMonthlyQueries=!1,this.showHelpFaqs=!1,this.typeInternationalFunds="1",this._contractsConfiguration={hasHistoricalDataForAllContracts:!0,maximumHistoricalDate:null,startDate:null,endDate:null,number:null},this._customDatesModalVisible=!1,this._customStartDate=null,this._customStartDateTmp=null,this._customEndDate=null,this._customEndDateTmp=null,this._customMinStartDate=null,this._dataVisualizationLinesData=null,this._dataVisualizationLinesSelected=0,this._dataVisualizationLinesWidth=272,this._balanceByPeriod=null,this._evolutionSummaries=null,this._evolutionModel={summaries:[]},this._getSpecificAmount=()=>{},this._periodList=[],this._financialOverviewProducts=[],this._formDateRange=null,this._holidaysNotificationWasDisplayed=!1,this._investmentProducts={},this._numberAttemptsWithError=0,this._moreInfoModel={},this._productsCardModel=[],this._reloadServices=!1,this._selectedChartType=Ka[0].id,this._selectedDateIndex=0,this._selectedPeriod=null,this._selectedPeriodPayload=null,this._starsRating=0,this._notFirstTimeChart=!1,this._notFirstTimePeriod=!1,this._configPage()}firstUpdated(){var e;super.firstUpdated(),this._listenEvents(),this._externalCodesInit(),this._onboardingInit(),this._datamanagersInit(),this._formDateRange=this.shadowRoot.querySelector("[data-tag-name=bbva-form-date-range]"),this._periodList=xr(),this._setDefaultPeriod(),this._callFinancialOverview(null===(e=this.financialOverview)||void 0===e?void 0:e.data)}updated(e){super.updated(e);let t=!1;if((e.get("_selectedPeriod")||e.get("_customStartDate")||e.get("_customEndDate"))&&(t=!0),e.get("language")&&(Cr.locale(this._shortLocale),t=!0),t&&this._selectedPeriod&&this._callSummariesAndBalances(),e.get("_selectedChartType")||t){var i;const e=this._selectedChartType===Ka[0].id,t=(null===(i=this._evolutionSummaries)||void 0===i?void 0:i.summaries)||[];this._dataVisualizationLinesData=vr(t,{byValue:e})}e.has("showOnboarding")&&!/false/.test(this.showOnboarding)&&(this.onboardingModal=!0),(e.has("hideMenuIcon")&&this.hideMenuIcon||e.has("showHelpFaqs")&&this.showHelpFaqs)&&this._setupHelpAndMenuIcons()}static get styles(){return[qa,Te,Ae.light,Ea.dark,ga.dark,ra.light,La.dark,Rt.light,Pt.light,N.light,z.dark,O.light,di.dark,Ee.light,Va.dark,Va.light,l("follow-up-investments-dashboard-shared-styles")]}get _isInvalidStartDate(){const e=Cr(this._customStartDateTmp),t=Cr(this._customMinStartDate);return!!this._customStartDateTmp&&!!this._customMinStartDate&&e.isValid()&&t.isValid()&&e.isBefore(t)}get _disabledSaveCustomDates(){return this._isInvalidStartDate||this._customStartDate===this._customStartDateTmp&&this._customEndDate===this._customEndDateTmp}get _renderChartTypesSelector(){return d`
      <bbva-button-group name="chartType" @button-group-item-change=${this._typeChartChange}>
        ${Ka.map((e=>d`
            <bbva-button-group-item
              value="${e.id}"
              ?checked=${e.id===this._selectedChartType}
              >${this.t(e.label)}</bbva-button-group-item
            >
          `))}
      </bbva-button-group>
    `}get _renderCustomDatesContent(){return d`
      <bbva-help-modal
        ?visible=${this._customDatesModalVisible}
        class="custom-dates-modal"
        full-height
        fixed-footer
        header-type="modal"
        hide-content-padding-top
        icon-right-primary="${Pe()}"
        accessibility-text-icon-right-primary="${this.t("follow-up-investments-dashboard-header-close")}"
        header-text="${this.t("follow-up-investments-dashboard-modal-custom-title")}"
        @visible-changed="${this._handleCustomDatesModalState}"
      >
        <div class="content" slot="slot-content">
          <bbva-text
            inherit
            text="${this.t("follow-up-investments-dashboard-select-custom-date-message")}"
          ></bbva-text>
          <bbva-form-date-range
            utc
            locale=${this._shortLocale}
            deny-future-dates
            start-text="${this.t("follow-up-investments-dashboard-modal-custom-from")}"
            end-text="${this.t("follow-up-investments-dashboard-modal-custom-to")}"
            start-date=${this._customStartDate??""}
            end-date=${this._customEndDate??""}
            start-title-text=${Cr(this._customStartDate).format("DD MMM YYYY")}
            end-title-text=${Cr(this._customEndDate).format("DD MMM YYYY")}
            error-message="${this.t("follow-up-investments-dashboard-modal-custom-error",{date:Cr(this._customMinStartDate).format("LL")})}"
            ?start-error=${this._isInvalidStartDate}
            .dateOptions=${hr}
            @form-date-range-show-start-calendar="${()=>{this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-show-start-date-picker",{detail:{dateFormat:"yyyy-MM-dd",defaultDate:this._customStartDateTmp},bubbles:!0,composed:!0}))}}"
            @form-date-range-show-end-calendar="${()=>{this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-show-end-date-picker",{detail:{dateFormat:"yyyy-MM-dd",defaultDate:this._customEndDateTmp},bubbles:!0,composed:!0}))}}"
            @form-date-range-start-date-select=${e=>{this._customStartDateTmp=e.detail}}
            @form-date-range-end-date-select=${e=>{this._customEndDateTmp=e.detail}}
          ></bbva-form-date-range>
          <bbva-button-default
            text="${this.t("follow-up-investments-dashboard-modal-save-changes")}"
            ?disabled=${this._disabledSaveCustomDates}
            @click=${this._handleCustomDatesChangeDates}
          ></bbva-button-default>
        </div>
      </bbva-help-modal>
    `}get _renderDatamanagersContent(){return d`
      <bbva-global-financial-overview-api-dm
        id="dmFinancialOverview"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="${c(this.financialOverviewApiVersion)}"
        ?native="${this.native}"
        @financial-overview-api-dm-fetch=${e=>this._dm.callbackFinancialOverview(e,this._setFinancialOverviewData)}
        @financial-overview-api-dm-fetch-error=${e=>this._dm.callbackFinancialOverview(e,this._setFinancialOverviewData,{hasError:!0})}
        @api-dm-error=${e=>this._dm.callbackFinancialOverview(e,this._setFinancialOverviewData,{hasError:!0})}
      ></bbva-global-financial-overview-api-dm>
      <bbva-global-contracts-configuration-related-contracts-api-dm
        id="dmContractsConfigurationRelatedContracts"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="${c(this.contractsConfigurationRelatedContractsApiVersion)}"
        ?native="${this.native}"
        @contracts-configuration-related-contracts-api-dm-create=${e=>this._dm.callbackContractsConfigurationRelatedContracts(e,this._callContractsConfigurations)}
        @contracts-configuration-related-contracts-api-dm-create-error=${e=>this._dm.callbackContractsConfigurationRelatedContracts(e,this._callContractsConfigurations,{hasError:!0})}
        @api-dm-error=${e=>this._dm.callbackContractsConfigurationRelatedContracts(e,this._callContractsConfigurations,{hasError:!0})}
      ></bbva-global-contracts-configuration-related-contracts-api-dm>
      <bbva-global-contracts-configurations-api-dm
        id="dmContractsConfigurations"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="${c(this.contractsConfigurationsApiVersion)}"
        ?native="${this.native}"
        @contracts-configurations-api-dm-fetch=${e=>{this._dm.callbackContractsConfigurations(e,(e=>{this._setContractsConfigurations(e,this.compositeEncryptionIndicator),this._callSummariesAndBalances()}))}}
        @contracts-configurations-api-dm-fetch-error=${e=>{this._dm.callbackContractsConfigurations(e,this._callSummariesAndBalances,{hasError:!0})}}
        @api-dm-error=${e=>{this._dm.callbackContractsConfigurations(e,this._callSummariesAndBalances,{hasError:!0})}}
      ></bbva-global-contracts-configurations-api-dm>
      <bbva-global-financial-investments-calculate-balances-by-period-api-dm
        id="dmCalculateBalancesByPeriod"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="${c(this.financialInvestmentsApiVersion)}"
        ?native="${this.native}"
        @financial-investments-calculate-balances-by-period-api-dm-fetch=${e=>this._dm.callbackCalculateBalancesByPeriod(e,this._setCalculateBalanceByPeriodData)}
        @financial-investments-calculate-balances-by-period-api-dm-fetch-error=${e=>{this._dm.callbackCalculateBalancesByPeriod(e,this._setCalculateBalanceByPeriodData,{hasError:!0})}}
        @api-dm-error=${e=>{this._dm.callbackCalculateBalancesByPeriod(e,this._setCalculateBalanceByPeriodData,{hasError:!0})}}
      ></bbva-global-financial-investments-calculate-balances-by-period-api-dm>
      <bbva-global-financial-investments-calculate-evolution-summaries-by-period-api-dm
        id="dmCalculateEvolutionSummariesByPeriod"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="${c(this.financialInvestmentsApiVersion)}"
        ?native="${this.native}"
        @financial-investments-calculate-evolution-summaries-by-period-api-dm-fetch=${e=>this._dm.callbackCalculateEvolutionSummariesByPeriod(e,this._setCalculateEvolutionSummariesByPeriodData)}
        @financial-investments-calculate-evolution-summaries-by-period-api-dm-fetch-error=${e=>this._dm.callbackCalculateEvolutionSummariesByPeriod(e,this._setCalculateEvolutionSummariesByPeriodData,{hasError:!0})}
        @api-dm-error=${e=>this._dm.callbackCalculateEvolutionSummariesByPeriod(e,this._setCalculateEvolutionSummariesByPeriodData,{hasError:!0})}
      ></bbva-global-financial-investments-calculate-evolution-summaries-by-period-api-dm>
    `}get _renderEmptySummaries(){var e,t;return d`
      ${null!==(e=this._dm)&&void 0!==e&&e.calculateEvolutionSummariesByPeriodIsPending||0!==(null===(t=this._evolutionModel.summaries)||void 0===t?void 0:t.length)?"":d`
            <bbva-panel-info
              text="${this.t("follow-up-investments-dashboard-empty-description")}"
            ></bbva-panel-info>
          `}
    `}get _renderErrorModalContent(){return d`
      <bbva-help-modal
        ?visible=${this.errorModalVisible}
        class="error-modal"
        full-height
        fixed-footer
        header-type="modal"
        icon-right-primary="${Pe()}"
        accessibility-text-icon-right-primary="${this.t("follow-up-investments-dashboard-header-close")}"
        header-text="${this.t("follow-up-investments-dashboard-header-text")}"
        button-text="${this.t("follow-up-investments-dashboard-modal-error-retry")}"
        link-text="${this.t("follow-up-investments-dashboard-modal-error-exit")}"
        @header-main-icon-right-primary-click="${this.navigateBack}"
        @help-modal-footer-link-click="${this.navigateBack}"
        @help-modal-footer-button-click="${()=>{this.errorModalVisible=!1,this._callFinancialOverview()}}"
        @help-modal-open="${this._handleErrorModalState}"
        @help-modal-close="${this._handleErrorModalState}"
      >
        <div class="content" slot="slot-content">
          <bbva-panel-info
            .microillustration="${Me}"
            heading="${this.t("follow-up-investments-dashboard-error-title")}"
            text="${this.t("follow-up-investments-dashboard-error-description")}"
          ></bbva-panel-info>
        </div>
      </bbva-help-modal>
    `}get _renderEvolutionSummaryChart(){var e,t,i,a,r;const{title:s,value:o,date:n,profit:l}=this._totalInvestmentData(),h=this.shadowRoot.querySelector('[data-tag-name="bbva-data-visualization-lines"]');return this._dataVisualizationChartCreate({target:h}),d`
      ${null!==(e=this._dm)&&void 0!==e&&e.calculateEvolutionSummariesByPeriodHasError||null===(t=this._evolutionModel.summaries)||void 0===t||!t.length?"":d`
            <bbva-list-definition-amount
              title="${s}"
              date="${n}"
              amount="${null==o?void 0:o.amount}"
              unit=${"%"===(null==o?void 0:o.currency)?"%":""}
              currency-code="${null==o?void 0:o.currency}"
              local-currency="${null==o?void 0:o.currency}"
              language="${c(this.language)}"
              description="${this.t("follow-up-investments-dashboard-graph-header-subtitle",{amount:Le(null==l?void 0:l.amount,{currencyCode:null==l?void 0:l.currency,localCurrency:null==l?void 0:l.currency,language:this.language,decimalDigits:2})})}"
              center
              ?loading=${this._dm.calculateEvolutionSummariesByPeriodIsPending}
            ></bbva-list-definition-amount>
          `}
      ${null!==(i=this._dm)&&void 0!==i&&i.calculateEvolutionSummariesByPeriodIsPending||null!==(a=this._dm)&&void 0!==a&&a.calculateEvolutionSummariesByPeriodHasError||null===(r=this._evolutionModel.summaries)||void 0===r||!r.length?"":d`
            <bbva-data-visualization-lines
              variant-amount="3xl"
              show-marker
              hide-y-axis
              hide-y-axis-tick
              num-points-xaxis="2"
              format-legend="%d %b %Y"
              selected=${this._dataVisualizationLinesSelected}
              .height="${150}"
              .width="${this._dataVisualizationLinesWidth}"
              .language="${{decimal:".",thousands:",",grouping:[3],currency:["€",""],dateTime:"%a %b %e %X %Y",date:"%d/%m/%Y",time:"%H:%M:%S",periods:["AM","PM"],days:ur.weekdays(),shortDays:ur.weekdaysShort(),months:ur.months(),shortMonths:ur.monthsShort()}}"
              @data-visualization-lines-drag="${this._dataVisualizationDrag}"
              @data-visualization-lines-chart-create="${this._dataVisualizationChartCreate}"
            >
            </bbva-data-visualization-lines>
          `}
      ${this._renderEmptySummaries}
    `}get _renderFaqsContent(){return d`
      <bbva-help-modal
        ?visible=${this.faqsModalVisible}
        class="faqs-modal"
        attach-to-body
        .contentStyles="${Sr}"
        full-height
        fixed-footer
        header-type="modal"
        icon-right-primary="${Pe()}"
        accessibility-text-icon-right-primary="${this.t("follow-up-investments-dashboard-header-close")}"
        header-text="${this.t("follow-up-investments-dashboard-faqs-title")}"
        @visible-changed="${this._handleFaqsModalState}"
        @help-faqs-aem-detail-show="${this._openFaq}"
      >
        <div class="content" slot="slot-content">
          <help-faqs-aem
            hide-footer
            i-o-s-fixed-header
            .aemData=${this.aemData}
            host=${this.aemHost}
            content-fragment-path="${this.contentFragmentPath}"
          ></help-faqs-aem>
        </div>
      </bbva-help-modal>
    `}get _renderFeedback(){return d`
      <div class="bg-light" ambient="light">
        <bbva-form-rating
          title="${this.t("follow-up-investments-dashboard-feedback-form-header-question")}"
          accessibility-text="${this.t("follow-up-investments-dashboard-feedback-form-accesibility-text")}"
          @form-rating-value-change="${({detail:e})=>{this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-feedback-emit",{detail:{stars:e},bubbles:!0,composed:!0}))}}"
          value="${this._starsRating}"
        ></bbva-form-rating>
      </div>
    `}get _renderMainContent(){return d`
      <div ambient="dark400">
        ${this._renderChartTypesSelector} ${this._renderEvolutionSummaryChart}
        ${this._renderPeriodSelector}
        <bbva-link icon="${s()}" @click=${this._moreInfoClick}>
          <span>${this.t("follow-up-investments-dashboard-link-more-info")}</span>
        </bbva-link>
      </div>
      <div ambient="light100">
        <bbva-header-category
          heading-level="2"
          text="${this.t("follow-up-investments-dashboard-header-title")}"
        ></bbva-header-category>
        <bbva-text
          font-weight="500"
          font-style="italic"
          inherit
          text="${this._selectedPeriodTitle}"
          size="S"
        ></bbva-text>
        ${this._renderProductsCarousel}
        <bbva-notification-help
          accessibility-label-icon="Info"
          icon=${s()}
          text=${this.t("follow-up-investments-dashboard-legal-text")}
        ></bbva-notification-help>
      </div>

      ${this._renderFeedback}${this._renderOnboarding}
    `}get _renderOnboarding(){return d`
      <div ambient="light100">
        <onboarding-full-screen-carousel
          modal-title="${this.t("follow-up-investments-dashboard-onboarding-title")}"
          .items=${this._renderOnboardingItems}
          button-text="${this.t("follow-up-investments-dashboard-onboarding-button-text")}"
          header-icon-right-primary="${Pe()}"
          ?visible=${this.onboardingModal}
          @header-main-icon-click="${()=>this._handleOnboardingAccept()}}"
          @onboarding-full-screen-carousel-item-select="${()=>this._handleOnboardingAccept()}"
          @onboarding-full-screen-carousel-loading-error="${()=>this._handleOnboardingAccept()}"
        ></onboarding-full-screen-carousel>
      </div>
    `}get _renderOnboardingItems(){var e;return null===(e=this.onboardingSlides)||void 0===e?void 0:e.map((({microillustration:e,title:t,description:i})=>({content:d`
        <bbva-panel-offer
          class="horizontal illustration"
          content-title="${this.t(t)}"
          microillustration="${e}"
        >
          <p>${this.t(i)}</p>
        </bbva-panel-offer>
      `})))}get _renderPeriodSelector(){return d`
      <bbva-button-group
        name="periodSelector"
        selected=${c(null===this._selectedPeriodPosition?void 0:this._selectedPeriodPosition)}
        link="${this.t("follow-up-investments-dashboard-modal-custom-edit-link")}"
        @button-group-item-change=${this._periodChange}
        @button-group-link-click=${()=>{this._customDatesModalVisible=!0}}
      >
        ${this._periodList.map((({labelShort:e,id:t,disabled:i})=>d`
            <bbva-button-group-item
              value="${t}"
              ?checked=${t===this._selectedPeriod}
              ?disabled=${i}
              hide-ellipsis
              >${this.t(e)}</bbva-button-group-item
            >
          `))}
      </bbva-button-group>
    `}get _renderProductsCarousel(){var e,t;const i=(null===(e=this._dm)||void 0===e?void 0:e.financialOverviewIsPending)||(null===(t=this._dm)||void 0===t?void 0:t.calculateBalancesByPeriodIsPending);return i||0!==this._productsCardModel.length?d`
      <bbva-carousel-swipe
        ambient="light100"
        loop
        .scopedComponents=${[{tagName:"follow-up-investments-dashboard-card-carousel",class:Qa}]}
        .items="${i?Array(2).fill().map((()=>({content:d`
                  <div>
                    <follow-up-investments-dashboard-card-carousel
                      loading
                    ></follow-up-investments-dashboard-card-carousel>
                  </div>
                `}))):this._productsCardModel.map((e=>{const{amount:t}=e.balance,{amount:i}=e.profit,{amount:a}=e.contribution;return{content:d`
                  <follow-up-investments-dashboard-card-carousel
                    product-id="${e.id}"
                    name="${e.name}"
                    category="${e.category}"
                    product-type-name="${this.t(e.typeLabel)}"
                    name-click-event="${e.nameClickEvent}"
                    currency="${t.currency}"
                    amount-invested="${t.amount}"
                    earnings="${i.amount}"
                    accumulated-profitability="${e.profitability}"
                    amount-contributed="${a.amount}"
                    language="${c(this.language)}"
                  ></follow-up-investments-dashboard-card-carousel>
                `}}))}"
      >
      </bbva-carousel-swipe>
    `:d`
        <bbva-panel-info
          text="${this.t("follow-up-investments-dashboard-empty-description")}"
        ></bbva-panel-info>
      `}get _selectedPeriodPosition(){return this._selectedPeriod?this._periodList.findIndex((e=>e.id===this._selectedPeriod)):null}get _selectedPeriodTitle(){var e;return this._selectedPeriod?this.t("follow-up-investments-dashboard-selected-period-title",{period:this.t((null===(e=ir[this._selectedPeriod])||void 0===e?void 0:e.label)||"follow-up-investments-dashboard-select-custom-date")}):""}get _shortLocale(){return this.language.split("-")[0]}render(){return d`
      ${super.render()} ${this._renderDatamanagersContent} ${this._renderMainContent}
      ${this.showHelpFaqs?this._renderFaqsContent:""} ${this._renderCustomDatesContent}
      ${this._renderErrorModalContent}
    `}handleAllModalsState(){let e=!0;return this.errorModalVisible&&(this.errorModalVisible=!1),this.onboardingModal&&(this.onboardingModal=!1,e=!1),this.faqsModalVisible&&(this.faqsModalVisible=!1,e=!1),{continueNavigateBack:e}}init(){this._reloadServices&&this._callSummariesAndBalances()}navigateBack(e=!0){this._numberAttemptsWithError=0;const{continueNavigateBack:t}=this.handleAllModalsState();t&&(this.reset(),(e??1)&&this.dispatchEvent(new CustomEvent("navigation-go-back",{bubbles:!0,cancelable:!0,composed:!0})))}reset(){this.financialOverview=null,this._productsCardModel=[],this._selectedChartType=Ka[0].id,this._starsRating=0,this._setDefaultPeriod(),this._reloadServices=!0}startDatePickerSuccess(e){e.selectedDate&&this._formDateRange.setStartDate(e.selectedDate,this._customStartDateTmp)}endDatePickerSuccess(e){e.selectedDate&&this._formDateRange.setEndDate(e.selectedDate,this._customEndDateTmp)}_callFinancialOverview(e){this._financialOverviewProducts&&0!==this._financialOverviewProducts.length||e?this._setFinancialOverviewData(e):(this.showLoader(Ja),this._dm.getFinancialOverview())}_callContractsConfigurationRelatedContracts(e){this.showLoader(Ja),this._dm.postContractsConfigurationRelatedContracts(e,((e=[],t=[])=>({relatedContracts:e.map((({id:e,productType:i,simpleCode:a,number:r,numberType:s,stockMarket:o})=>({id:t.includes(i)?a:e,number:r,numberType:s,stockMarket:o})))}))(this._financialOverviewProducts,this.compositeEncryptionIndicator))}_callContractsConfigurations(){this.showLoader(Ja),this._dm.getContractsConfigurations({expand:"related-contracts"})}_setContractsConfigurations(e,t){const i=(null==e?void 0:e[0])||{},{maximumHistoricalDate:a,hasHistoricalDataForAllContracts:r,relatedContracts:s}=i;this._financialOverviewProducts=((e=[])=>s&&0!==s.length?e.filter((({id:e,simpleCode:i,productType:a})=>{let r=!1,o=e;return t.includes(a)&&(o=i),s.forEach((({id:e,isVisible:t,status:i})=>{o===e&&t&&"VALID"===(null==i?void 0:i.id)&&(r=!0)})),r})):e)(this._financialOverviewProducts);const{startDate:o,endDate:n,number:l}=i.period||{};this._contractsConfiguration.startDate=o,this._contractsConfiguration.endDate=n,this._contractsConfiguration.number=l,this._contractsConfiguration.maximumHistoricalDate=a,this._periodList=xr({hasHistoricalDataForAllContracts:r,maximumHistoricalDate:a}),this._setDefaultPeriod(),this._periodChange({detail:{value:this._selectedPeriod,selected:this._selectedPeriodPosition}},{dispatchPeriodEvent:!1})}_callSummariesAndBalances(){this.showLoader(Ja),this._selectedPeriodPayload.frequency.id===pr&&this._showMonthlyNotification(),this._dm.postFinancialInvestmentsCalculateBalancesByPeriod(gr(this._selectedPeriodPayload,"BALANCE_BY_PERIOD",this._financialOverviewProducts)),this._dm.postFinancialInvestmentsCalculateEvolutionSummariesByPeriod(gr(this._selectedPeriodPayload,lr,this._financialOverviewProducts))}_buildModelData(){if(!this._dm.calculateBalancesByPeriodIsPending&&!this._dm.calculateEvolutionSummariesByPeriodIsPending){this._moreInfoModel=(e=this._balanceByPeriod||{contracts:[]},t=this._financialOverviewProducts,{contracts:wr(null==e?void 0:e.contracts,t),families:(null==e?void 0:e.families)||[],specificAmountProduct:tr}),this._productsCardModel=this._createProductCardsModel(this._moreInfoModel.contracts||[],this._financialOverviewProducts),this._evolutionModel=this._evolutionSummaries||{summaries:[]};const{summaries:i=[]}=this._evolutionModel,a=i.length-1;i.length&&(this._setDataVisualizationLines(i,a),this._selectedDateIndex=a),this._dm.calculateBalancesByPeriodHasError||this._dm.calculateEvolutionSummariesByPeriodHasError?this._showErrorModal():this._numberAttemptsWithError=0,this.clearLoader(),this._showHolidaysNotification()}var e,t}_changeDefaultDate(){return this._periodList.find((e=>!1===e.disabled)).id}_checkInternationalFunds(e,t){return e===sr.SECURITIES_ACCOUNT.id&&t&&t.some((e=>e.productType.id===this.typeInternationalFunds))}_configPage(){this.config={header:{id:"main-header",text:this.t("follow-up-investments-dashboard-header-text"),accessibilityTextIconLeftPrimary:this.t("follow-up-investments-dashboard-header-back"),accessibilityTextIconRightPrimary:this.t("follow-up-investments-dashboard-header-menu"),iconLeftPrimary:A(),iconRightPrimary:De(),position:"fixed",variant:"notch-top"},loader:!0,notifyFeature:!0},this.language="en-EN"}_createProductCardsModel(e,t){const i=t.map((e=>e.id));return e.filter((e=>i.includes(e.id))).map((e=>{const{alias:i,id:a,number:r,stockMarket:s,name:o,profitabilityInvest:n,profitabilityProduct:l,specificAmounts:d}=e,c=(t.find((e=>yr(e,{id:a,number:r,stockMarket:s})))||{}).productType,h=i||o,{balance:p,profit:u,contribution:m}=this._getSpecificAmount(d)||{},v=this.investmentProductType.some((e=>e===c))?n:l,{label:b,nameClickEvent:g}=(e=>(null==or?void 0:or.find((t=>t.id===e)))||{})(c);return{id:a,typeLabel:b,name:h,category:"investment",balance:p,profit:u,profitability:v,contribution:m,nameClickEvent:g}}))}_datamanagersInit(){var e;this._dm||(this._dm=(e=this,{financialOverviewIsPending:!1,financialOverviewHasError:!1,getFinancialOverview(){this.financialOverviewIsPending=!0,this.financialOverviewHasError=!1,this.financialOverview.getFinancialOverview()},callbackFinancialOverview(t,i,{hasError:a=!1}={}){if(this.financialOverviewIsPending=!1,a&&(this.financialOverviewHasError=!0),i){const r=null==t?void 0:t.detail;i.bind(e)(r,{hasError:a})}},contractsConfigurationRelatedContractsIsPending:!1,contractsConfigurationRelatedContractsHasError:!1,postContractsConfigurationRelatedContracts(e,t){this.contractsConfigurationRelatedContractsIsPending=!0,this.contractsConfigurationRelatedContractsHasError=!1,this.contractsConfigurationRelatedContracts.postContractsConfigurationRelatedContracts(e,t)},callbackContractsConfigurationRelatedContracts(t,i,{hasError:a=!1}={}){this.contractsConfigurationRelatedContractsIsPending=!1,a&&(this.contractsConfigurationRelatedContractsHasError=!0),i&&i.bind(e)({hasError:a})},contractsConfigurationsIsPending:!1,contractsConfigurationsHasError:!1,getContractsConfigurations(e){this.contractsConfigurationsIsPending=!0,this.contractsConfigurationsHasError=!1,this.contractsConfigurations.getContractsConfigurations(e)},callbackContractsConfigurations(t,i,{hasError:a=!1}={}){if(this.contractsConfigurationsIsPending=!1,a&&(this.contractsConfigurationsHasError=!0),i){const r=null==t?void 0:t.detail;i.bind(e)(r,{hasError:a})}},calculateBalancesByPeriodIsPending:!1,calculateBalancesByPeriodHasError:!1,postFinancialInvestmentsCalculateBalancesByPeriod(e){this.calculateBalancesByPeriodIsPending=!0,this.calculateBalancesByPeriodHasError=!1,this.calculateBalancesByPeriod.postFinancialInvestmentsCalculateBalancesByPeriod(e)},callbackCalculateBalancesByPeriod(t,i,{hasError:a=!1}={}){if(this.calculateBalancesByPeriodIsPending=!1,a&&(this.calculateBalancesByPeriodHasError=!0),i){const r=null==t?void 0:t.detail;i.bind(e)(r,{hasError:a})}},calculateEvolutionSummariesByPeriodIsPending:!1,calculateEvolutionSummariesByPeriodHasError:!1,postFinancialInvestmentsCalculateEvolutionSummariesByPeriod(e){this.calculateEvolutionSummariesByPeriodIsPending=!0,this.calculateEvolutionSummariesByPeriodHasError=!1,this.calculateEvolutionSummariesByPeriod.postFinancialInvestmentsCalculateEvolutionSummariesByPeriod(e)},callbackCalculateEvolutionSummariesByPeriod(t,i,{hasError:a=!1}={}){if(this.calculateEvolutionSummariesByPeriodIsPending=!1,a?this.calculateEvolutionSummariesByPeriodHasError=!0:this._evolutionSummaries=t,i){const r=null==t?void 0:t.detail;i.bind(e)(r,{hasError:a})}},financialOverview:e.shadowRoot.querySelector("#dmFinancialOverview"),contractsConfigurationRelatedContracts:e.shadowRoot.querySelector("#dmContractsConfigurationRelatedContracts"),contractsConfigurations:e.shadowRoot.querySelector("#dmContractsConfigurations"),calculateBalancesByPeriod:e.shadowRoot.querySelector("#dmCalculateBalancesByPeriod"),calculateEvolutionSummariesByPeriod:e.shadowRoot.querySelector("#dmCalculateEvolutionSummariesByPeriod")}))}_dataVisualizationDrag({detail:{selected:e}}){clearTimeout(this._dragTimeout),this._dragTimeout=setTimeout((()=>{this._selectedDateIndex=e}),250)}_dataVisualizationChartCreate({target:e}={}){e&&Object.assign(e,{data:this._dataVisualizationLinesData})}_externalCodesInit(){this._getSpecificAmount=function(e){const{BALANCE_CODE_ALTERNATIVE:t}=e;return mr=(e,{isFinancialOverview:i}={})=>null==e?void 0:e.reduce(((e,a)=>{const r=null==a?void 0:a.id;return(i?r===t:r===tr)&&(e.balance=a),"PROFIT"===r&&(e.profit=a),"totalAmount"===r&&(e.totalAmount=a),"NET_CONTRIBUTION"===r&&(e.contribution=a),e}),{balance:{amount:{}},profit:{amount:{}},totalAmount:{amounts:{}},contribution:null}),mr}({BALANCE_CODE_ALTERNATIVE:this.specificAmountProduct})}_getSelectedPeriodDefault(e){const t=this._periodList.find((t=>t.numberMonths===e))||{};return t.disabled?this._changeDefaultDate():e&&t.id||er}_handleCustomDatesModalState(e){const{target:t}=e;"bbva-help-modal"===t.getAttribute("data-tag-name")&&(this._customDatesModalVisible=!!t.visible,this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-custom-dates-modal-changed",{bubbles:!0,composed:!0,detail:{visible:this._customDatesModalVisible,property:"custom-dates-modal"}})))}_handleCustomDatesChangeDates(){this._customStartDate=this._customStartDateTmp,this._customEndDate=this._customEndDateTmp,this._customDatesModalVisible=!1,this._periodChange({detail:{value:rr,selected:-1}})}_handleErrorModalState(e){const{target:t}=e;this.errorModalVisible=!!t.visible,this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-error-modal-changed",{bubbles:!0,composed:!0,detail:{visible:this.errorModalVisible,target:t,property:"error-modal"}}))}_handleFaqsModalState(e){const{target:t}=e;"bbva-help-modal"===t.getAttribute("data-tag-name")&&(this.faqsModalVisible=!!t.visible,this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-faqs-modal-changed",{bubbles:!0,composed:!0,detail:{visible:this.faqsModalVisible,property:"faqs-modal"}})))}_handleOnboardingAccept(){this.onboardingModal=!1,this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-onboarding-close",{bubbles:!0,composed:!0,detail:{key:"follow_up_show_onboarding",value:"false"}}))}_listenEvents(){this.addEventListener("header-main-icon-left-primary-click",(e=>{fr(e,(()=>this.navigateBack()))})),this.addEventListener("header-main-icon-right-primary-click",(e=>{fr(e,(()=>this.hideMenuIcon?this._openFaqs():this._openMenu()))})),this.addEventListener("header-main-icon-right-secondary-click",(e=>{fr(e,(()=>this._openFaqs()))}))}_moreInfoClick(){this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-more-info-click",{bubbles:!0,composed:!0,detail:this._moreInfoModel}))}_normalizeFinancialOverviewProducts(e){const t=[];return e.forEach((e=>{var i,a;const{id:r,productType:s,simpleCode:o,product:n,alias:l,detail:d,currencies:c,bank:h}=e,{internationalFunds:p,portfolio:u,specificAmounts:m,specificAmountsSecurities:v}=d,b=(null==u?void 0:u.id)||r;t.push(br({id:r,bank:h,productType:s,simpleCode:o,name:l||`${n.name} ${b?"*".concat(null==b?void 0:b.substr(-5)):""}`,amounts:null===(i=this._getSpecificAmount(m||v,{isFinancialOverview:!0}))||void 0===i||null===(a=i.balance)||void 0===a?void 0:a.amounts,number:this.numberIsin,stockMarket:{id:this.numberStockMarket},currencies:c,numberTypeIsin:this.numberTypeIsin})),this._checkInternationalFunds(s,p)&&this._normalizeInternationalFunds(p,b,h).forEach((e=>{t.push(e)}))})),t}_normalizeInternationalFunds(e=[],t,i){return e.filter((e=>e.productType.id===this.typeInternationalFunds)).map((e=>{var a,r,s;const o=null===(a=e.formats)||void 0===a?void 0:a.find((e=>e.numberType.id===this.numberTypeIsin)),n={id:null===(r=e.stockMarket.formats.find((e=>"INTERNAL"===e.numberType.id)))||void 0===r?void 0:r.numberType.name};return br({id:t,bank:i,productType:"INVESTMENT_INTERNATIONAL_FUND",name:e.name,amounts:null===(s=this._getSpecificAmount(e.specificAmounts))||void 0===s?void 0:s.totalAmount.amounts,number:null==o?void 0:o.number,stockMarket:n,numberTypeIsin:this.numberTypeIsin})}))}_onboardingInit(){setTimeout((()=>{this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-onboarding-init",{detail:{key:"follow_up_show_onboarding"},bubbles:!0,composed:!0}))}),this.onboardingInitTimeout)}_periodChange({detail:{value:e,selected:t}}={},{dispatchPeriodEvent:i=!0}={}){this._evolutionModel={summaries:[]},this._selectedPeriod=e,this._selectedPeriodPayload=_r(this._selectedPeriod,this._contractsConfiguration.maximumHistoricalDate,{startDate:this._customStartDate,endDate:this._customEndDate},this.showMonthlyQueries),this._customStartDate=this._selectedPeriodPayload.period.startDate,this._customEndDate=this._selectedPeriodPayload.period.endDate,this._customMinStartDate=this._contractsConfiguration.maximumHistoricalDate,this._notFirstTimePeriod&&i&&this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-type-period-change",{bubbles:!0,composed:!0,detail:{value:e,selected:t}})),this._notFirstTimePeriod=!0}_openFaqs(){this.faqsModalVisible=!0,this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-faqs-click",{bubbles:!0,composed:!1,detail:!0}))}_openFaq(e){var t,i,a,r,s;const o=e.detail,n=null==o||null===(t=o.elements)||void 0===t||null===(i=t.id)||void 0===i?void 0:i.value,l=(null===(a=e.detail)||void 0===a||null===(r=a.elements)||void 0===r||null===(s=r.analyticsTitle)||void 0===s?void 0:s.value)||"";this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-faq-detail-click",{bubbles:!0,composed:!0,detail:{selectedFaq:n,faqAnalyticsTitle:l}}))}_openMenu(){this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-menu-click",{bubbles:!0,composed:!1,detail:!0}))}_setCalculateBalanceByPeriodData(e,{hasError:t=!1}={}){t||(this._balanceByPeriod=e),this._buildModelData()}_setCalculateEvolutionSummariesByPeriodData(e,{hasError:t=!1}={}){t||(this._evolutionSummaries=e),this._buildModelData()}_setDataVisualizationLines(e=[],t){const i=this._selectedChartType===Ka[0].id;this._dataVisualizationLinesData=vr(e,{byValue:i}),this._dataVisualizationLinesSelected=t,this._dataVisualizationLinesWidth=this.clientWidth-32}_setDefaultPeriod(){this._selectedPeriod=this._getSelectedPeriodDefault(this._contractsConfiguration.number??ir["year-to-date"].numberMonths),this._selectedPeriodPayload=_r(this._selectedPeriod,this._contractsConfiguration.maximumHistoricalDate,null,this.showMonthlyQueries)}_setFinancialOverviewData(e,{hasError:t}={}){if(t)this._showErrorModal(),this.clearLoader();else try{const t=((null==e?void 0:e.contracts)||[]).filter((e=>this.investmentProductType.some((t=>t===(null==e?void 0:e.productType)))));this._financialOverviewProducts=this._normalizeFinancialOverviewProducts(t),this._callContractsConfigurationRelatedContracts(this.contractsConfigurationDefect)}catch{this._showErrorModal(),this.clearLoader()}}_setupHelpAndMenuIcons(){let e={};this.showHelpFaqs&&this.hideMenuIcon?e={accessibilityTextIconRightPrimary:this.t("follow-up-investments-dashboard-header-help"),accessibilityTextIconRightSecondary:null,iconRightPrimary:E(),iconRightSecondary:null}:this.showHelpFaqs&&!this.hideMenuIcon?e={accessibilityTextIconRightSecondary:this.t("follow-up-investments-dashboard-header-help"),iconRightSecondary:E()}:this.hideMenuIcon&&(e={accessibilityTextIconRightPrimary:null,iconRightPrimary:null}),this.config.header={...this.config.header,...e},this.config={...this.config}}_showErrorModal(){this._numberAttemptsWithError===this.maxNumErrors?this.navigateBack():(this._numberAttemptsWithError+=1,this.errorModalVisible=!0)}_showHolidaysNotification(){if(!this._holidaysNotificationWasDisplayed){const{startDate:e,endDate:t}=cr;Cr().isBetween(e,t)&&this.showNotify(this.t("follow-up-investments-dashboard-notification-holidays"),"","info",1e4),this._holidaysNotificationWasDisplayed=!0}}_showMonthlyNotification(){this.showNotify(this.t("follow-up-investments-dashboard-notification-monthly"),"","info",1e4)}_totalInvestmentData(){var e,t;const i=(this._evolutionModel.summaries||[])[this._selectedDateIndex]||{},{specificAmounts:a,profitabilityInvest:r,valuationDate:s}=i,o=this._totalInvestmentTitles(s);return{...this._selectedChartType===Ka[0].id?{title:o.value,value:null===(e=this._getSpecificAmount(a))||void 0===e?void 0:e.balance.amount}:{title:o.profitability,value:{amount:r||0,currency:"%"}},date:s,profit:null===(t=this._getSpecificAmount(a))||void 0===t?void 0:t.profit.amount}}_totalInvestmentTitles(e){const t=Cr().format("YYYY-MM-DD")===e,i=Cr(e).format("DD MMM YY");return{value:t?this.t("follow-up-investments-dashboard-graph-value-header-title-today"):this.t("follow-up-investments-dashboard-graph-value-header-title-date",{date:i}),profitability:t?this.t("follow-up-investments-dashboard-graph-profitability-header-title-today"):this.t("follow-up-investments-dashboard-graph-profitability-header-title-date",{date:i})}}_typeChartChange({detail:{value:e,selected:t}}){this._selectedChartType=e,this._notFirstTimeChart&&this.dispatchEvent(new CustomEvent("follow-up-investments-dashboard-type-chart-change",{bubbles:!0,composed:!0,detail:{value:e,selected:t}})),this._notFirstTimeChart=!0}}customElements.define($r.is,$r);
