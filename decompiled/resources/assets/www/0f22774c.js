import{z as e,ar as t,a as i,L as a,y as o,ah as r,aN as s,ai as n,ak as l,h as d,i as c,a8 as p,ac as h,a9 as m,ap as v,an as u,ag as g,F as b,b$ as f,bx as y,b1 as _,c0 as x,f as k,g as S,H as w,aX as $,v as C,u as T,cI as A,cJ as L,aD as P,ad as E,ab as M,aa as B,b0 as I,aJ as D,bj as z,b6 as N,dt as O,av as R,o as V,b_ as F,cE as H,cF as q,bt as G,cG as j,aI as K,bf as W,be as Y,bh as U,cm as X,aK as Z,bU as Q,cp as J,cO as ee,bc as te,bY as ie,cS as ae,Z as oe,l as re,m as se,a2 as ne,cx as le,aO as de,aV as ce,fy as pe,au as he,bd as me,as as ve,at as ue,V as ge,aw as be,S as fe,af as ye,j as _e,r as xe,cP as ke,aS as Se,cQ as we,bF as $e,fG as Ce,dR as Te,b3 as Ae,a_ as Le,D as Pe,fH as Ee,cK as Me,a$ as Be,fI as Ie,cq as De,cH as ze,di as Ne,b5 as Oe,cD as Re,A as Ve,T as Fe,cM as He,b4 as qe,fJ as Ge,ew as je,fK as Ke,fc as We,fL as Ye,fM as Ue,fN as Xe,fO as Ze,az as Qe,cW as Je,fP as et,e6 as tt}from"./952f98a9.js";import{b as it,c$ as at,d0 as ot,d1 as rt,bp as st,d2 as nt,d3 as lt,p as dt,bo as ct,ba as pt,y as ht,d4 as mt,d5 as vt,x as ut}from"./7f3d7ca9.js";import{b as gt,B as bt}from"./8f7ccd2d.js";import{$ as ft,eI as yt,eJ as _t,eK as xt,eL as kt,eM as St,eN as wt,eO as $t,eP as Ct,eQ as Tt,eR as At,eS as Lt,eT as Pt,eU as Et,eV as Mt,eW as Bt,eX as It,eY as Dt,eZ as zt,e_ as Nt,e$ as Ot,f0 as Rt,f1 as Vt,f2 as Ft,f3 as Ht,f4 as qt,f5 as Gt,f6 as jt,f7 as Kt,f8 as Wt,f9 as Yt,fa as Ut,fb as Xt,fc as Zt,fd as Qt,fe as Jt,ff as ei,n as ti,o as ii,fg as ai,fh as oi,fi as ri}from"./216055dc.js";import{B as si}from"./c37db1d9.js";import"./0aba1083.js";import{b as ni,B as li}from"./8891faa0.js";import"./c0a2f832.js";import"./cae0f1de.js";class di extends it{static get is(){return"bbva-global-stores-api-dm"}static get properties(){return{stores:{type:Array,attribute:!1}}}constructor(){super(),this.stores=[]}resetStores(){this.stores=[]}getStores(e={}){if(Object.keys(this.stores).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"stores-api-dm-fetch",paginationEvent:"stores-api-dm-pagination",errorFireEventHandler:"stores-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}Stores`,this._getBgadp(a))}_getBgadp(e){return{getStoresV1:()=>new at(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}const ci=new t;var pi=e`:host {
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
${ci.mediaRules()}`;class hi extends(i(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":o}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:r(),warning:r(),error:s(),success:n()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:a=this.duration}={}){const o=i;this._stack.push({type:o,description:e,simpleLinkText:t,duration:a}),this._showNextInStack()}static get styles(){return[pi,l("bbva-notification-container-shared-styles")]}render(){return d`
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
    `}}var mi=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${p(m.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${p(m.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${p(m.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${p(m.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${p(m.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${p(m.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${p(m.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${p(h.typeMedium)}));
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
`;class vi extends(i(v(u(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":g,"bbva-icon":b,"bbva-badge-notification":f}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[mi,l("bbva-header-main-shared-styles"),y("button:focus"),_.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return d`<bbva-icon icon="${c(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return d`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const o=vi.toCamelCase(e),r=`icon${o}`,s=`accessibilityTextIcon${o}`;return d`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${c(this.t(this[s]))}"
      aria-expanded=${c(a)}
      ?hidden="${!this[r]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(r):this._icon(r)}
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
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:o}=this;return d`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(o||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${c(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${o}"
            ?hidden="${!o}"
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
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}S("colors.primaryCoreLightened"),S("colors.cool80"),S("colors.cool70"),S("colors.primaryCoreLightened"),S("colors.cool100"),S("colors.tertiaryType6Darkened"),S("colors.tertiaryType4Darkened"),S("colors.secondary300");const ui=w((e=>class extends($(e)){static configurationScopedElements(){return[hi,C,vi,T]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),d`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||A();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&L()||this.config.faqs&&P())}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const a={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,a){const o={description:e,simpleLinkText:t,type:i,duration:a};this._dispatchCustomEvent("show-notification",o)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return d`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const e=this._getElements();return d`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));var gi=e`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${p(m.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${p(E.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${p(M.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${p(E.typeLarge)});
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
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
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
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
`,bi=e`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,fi=e`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${p(m.primaryMedium)});
}
`;const yi={light:e`
    ${I.light}
    ${bi}
  `,dark:e`
    ${I.dark}
    ${fi}
  `};class _i extends(D(i(v(u(a))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":z,"bbva-link":N,"bbva-text":g}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=O,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[gi,super.styles,l("bbva-panel-info-shared-styles"),yi.light,yi.dark]}get _contentImage(){return this.image?d` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:d`
      <span
        class="${R({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===O}render(){return d`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&d`
          <bbva-text
            tabindex="0"
            class="title ${R({"not-text":!this.text})}"
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
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.cool50");const xi=new t;var ki=e`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${p(h.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${p(E.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${p(M.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${p(M.medium.fontStyle)});
  width: 100%;
  height: 100%;
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${p(m.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)})));
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
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
${xi.mediaRules()}`;const Si=new t;var wi=e`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${Si.mediaRules()}`;const $i=new t;var Ci=e`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${p(m.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${$i.mediaRules()}`;const Ti={dark:e`
    ${Ci}
    ${F.dark}
  `,light:e`
    ${wi}
    ${F.light}
  `};class Ai extends(i(D(H))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":b,"bbva-core-image":q,"bbva-badge-notification":f}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,ki,l("bbva-button-action-shared-styles"),y(),Ti.light,Ti.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?d`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?d`<div class="app-pay-icon">${G[this.appPayIcon]}</div>`:d`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return d`
      ${this.notifications?d`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:d` ${this.getIcon} `}
      <span class="text" onclick="void(0)"> ${this.label} </span>
      <slot></slot>
      ${this._action}
    `}}var Li={...x,...j,bbvaButtonAction:`\n        --bbva-button-action-dark-mode-color: ${S("colors.primarySubdued")};\n        --bbva-button-action-active-dark-mode-color: ${S("colors.primaryCoreLight")};\n        --bbva-button-action-card-logo-dark-mode-dark-display: inline;\n        --bbva-button-action-card-logo-dark-mode-light-display: none;\n    `},Pi=e`[ambient^=light] {
  --bbva-button-row-active-color: initial;
  --bbva-button-row-skeleton-color: initial;
  --bbva-button-row-skeleton-animated-layer-bg: initial;
  --bbva-button-row-skeleton-bg: initial;
}
`,Ei=e`[ambient^=dark] {
  --bbva-button-row-active-color: var(--colorsPrimarySubduedLight, ${p(m.primarySubduedLight)});
  --bbva-button-row-skeleton-color: var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)});
  --bbva-button-row-skeleton-bg: transparent;
  --bbva-button-row-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${p(m.primaryCoreDarkened)});
}
`;const Mi={dark:e`
    ${Ti.dark}
    ${Ei}
  `,light:e`
    ${Ti.light}
    ${Pi}
  `},Bi=new t;var Ii=e`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  position: relative;
  min-height: 5rem;
  --_button-row-skeleton-animated-layer-bg: var(--bbva-button-row-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-button-row-skeleton-animated-layer-bg, var(--ambientsLight, ${p(K.light)})));
  --_button-row-button-action-color: var(--bbva-button-row-dark-mode-button-action-color);
  --_button-row-photography-variant-color: var(--bbva-button-row-dark-mode-photography-variant-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${p(m.primaryMedium)})));
  --_button-row-photography-variant-active-color: var(--bbva-button-row-dark-mode-photography-variant-active-color, var(--_button-row-active-color));
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  --_button-row-active-color: var(--bbva-button-row-dark-mode-active-color, var(--bbva-button-row-active-color, var(--colorsPrimaryCore, ${p(m.primaryCore)})));
  --_button-row-skeleton-quote-color: var(--bbva-button-row-dark-mode-skeleton-color, var(--bbva-button-row-skeleton-color, var(--colorsSecondary200, ${p(m.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 12) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 12) * 1em);
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
${Bi.mediaRules()}`;class Di extends(D(i(a))){static get is(){return"bbva-button-row"}static get scopedElements(){return{"bbva-button-action":Ai}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},options:{type:Array},iconSize:{type:Number,attribute:"icon-size"},selected:{type:Number},variant:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.options=[],this.iconSize=24,this.selected=0,this.variant="",this.loading=!1}updated(){this.options&&this.options.length>0&&this._assignClass(this)}_assignClass(e){e.classList.remove("one-button","two-buttons","three-buttons","four-buttons"),1===this.options.length?e.classList.add("one-button"):2===this.options.length?e.classList.add("two-buttons"):3===this.options.length?e.classList.add("three-buttons"):4===this.options.length&&e.classList.add("four-buttons")}static get styles(){return[Ii,l("bbva-button-row-shared-styles"),Mi.light,Mi.dark]}render(){return d`${this.loading?d`<div class="skeleton"></div>`:d` <div
          id="buttons"
          class="button-row"
          role="list"
          aria-label="${c(this.accessibilityText)}"
        >
          ${this.options.map(((e,t)=>this._getButton(e,t)))}
        </div>`}`}_getButton(e,t){return d`
      <span role="listitem" class="listitem-button">
        <bbva-button-action
          ?disabled="${this.disabled}"
          role="button"
          notifications-variant="alert"
          image="${c(e.image)}"
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
    `}_select(e){this.selected=e,this.dispatchEvent(new CustomEvent("button-row-item-click",{detail:e,bubbles:!0,composed:!0}))}}S("colors.primaryMediumLight"),S("colors.cool50"),S("colors.cool90"),S("colors.primarySubdued"),S("colors.primaryCoreLightened"),S("colors.primarySubduedLight");const zi=new t;var Ni=e`:host {
  display: block;
  background-color: var(--bbva-map-tooltip-dark-mode-bg-color, var(--bbva-map-tooltip-bg-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)})));
  border-radius: var(--bbva-map-tooltip-border-radius, var(--borderRadiusSmall, ${p(Y.small)}));
  box-shadow: var(--bbva-map-tooltip-box-shadow, var(--boxShadowType1, ${p(W.type1)}));
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  --_map-tooltip-description-color: var(--bbva-map-tooltip-dark-mode-description-color, var(--bbva-map-tooltip-description-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_map-tooltip-bg-active-color: var(--bbva-map-tooltip-dark-mode-bg-active-color, var(--bbva-map-tooltip-bg-active-color, var(--colorsSecondary100, ${p(m.secondary100)})));
  --_map-tooltip-location-color: var(--bbva-map-tooltip-dark-mode-location-color, var(--bbva-map-tooltip-location-color, var(--colorsPrimaryMedium, ${p(m.primaryMedium)})));
  --_map-tooltip-location-active-color: var(--bbva-map-tooltip-location-active-dark-mode-color, var(--bbva-map-tooltip-location-active-color, var(--colorsPrimaryCore, ${p(m.primaryCore)})));
  --_map-tooltip-extra-description-color: var(--bbva-map-tooltip-dark-mode-extra-description-color, var(--bbva-map-tooltip-extra-description-color, var(--colorsSecondary500, ${p(m.secondary500)})));
  --_map-tooltip-badge-branch-color: var(--bbva-map-tooltip-dark-mode-badge-branch-color, var(--bbva-map-tooltip-badge-branch-color, var(--colorsSecondary500, ${p(m.secondary500)})));
  --_map-tooltip-badge-atm-color: var(--bbva-map-tooltip-dark-mode-badge-atm-color, var(--bbva-map-tooltip-badge-atm-color, var(--colorsSecondary500, ${p(m.secondary500)})));
  --_map-tooltip-skeleton-quote-color: var(--bbva-map-tooltip-dark-mode-skeleton-quote-color, var(--bbva-map-tooltip-skeleton-quote-color ,var(--colorsSecondary200, ${p(m.secondary200)})));
  --_map-tooltip-skeleton-quote-bg: var(--bbva-map-tooltip-dark-mode-skeleton-quote-bg, var(--bbva-map-tooltip-skeleton-quote-bg, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)})));
  --_map-tooltip-badge-icon-no-category-color: var(--bbva-map-tooltip-dark-mode-badge-icon-no-category-color, var(--bbva-map-tooltip-badge-icon-no-category-color, var(--colorsSecondary500, ${p(m.secondary500)})));
  --_map-tooltip-badge-icon-text-color: var(--bbva-map-tooltip-dark-mode-badge-icon-text-color, var(--bbva-map-tooltip-badge-icon-text-color, var(--colorsSecondary500, ${p(m.secondary500)})));
}

:host(:active) {
  background-color: var(--_map-tooltip-bg-active-color);
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

.bbva-map-tooltip-section {
  line-height: var(--lineHeightTypeSmall, ${p(E.typeSmall)});
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-text].bbva-map-tooltip-description {
  color: var(--_map-tooltip-description-color);
}

.bbva-map-tooltip-section:last-of-type {
  margin: 0;
}

.bbva-map-tooltip-icon {
  text-align: right;
}

.bbva-map-tooltip-location {
  text-align: center;
  font-size: var(--typographyTypeMedium, ${p(h.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${p(E.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${p(M.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${p(M.medium.fontStyle)});
  color: var(--_map-tooltip-location-color);
}

.bbva-map-tooltip-location:active {
  color: var(--_map-tooltip-location-active-color);
}

.bbva-map-tooltip-extra-description [data-tag-name=bbva-text] {
  color: var(--_map-tooltip-extra-description-color);
}

.bbva-map-tooltip-badge-branch {
  display: flex;
  justify-content: center;
  align-items: center;
}

[data-tag-name=bbva-badge-icon] {
  --bbva-badge-icon-no-category-icon-color: var(--_map-tooltip-badge-icon-no-category-color);
  --bbva-badge-icon-text-color: var(--_map-tooltip-badge-icon-text-color);
}

[data-tag-name=bbva-button-default] {
  padding: 0;
  height: 1.5rem;
  min-width: auto;
}

.bbva-map-tooltip-badge-atm [data-tag-name=bbva-text] {
  color: var(--_map-tooltip-badge-atm-color);
}

.bbva-map-tooltip-badge-branch [data-tag-name=bbva-text] {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  color: var(--_map-tooltip-badge-branch-color);
}

.bbva-map-tooltip-avatar {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-top: calc(((-4.25 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}

.bbva-map-tooltip-badge-store {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  display: flex;
  justify-content: center;
  align-items: center;
}

.bbva-map-tooltip-bagde-icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  min-width: 5.625rem;
}

.bbva-map-tooltip-bagde-icon:last-of-type {
  margin-right: 0;
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
  background-image: linear-gradient(-60deg, transparent 50%, var(--_map-tooltip-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_map-tooltip-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_map-tooltip-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_map-tooltip-skeleton-quote-color) 50%), linear-gradient(var(--_map-tooltip-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_map-tooltip-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_map-tooltip-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_map-tooltip-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_map-tooltip-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_map-tooltip-skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_map-tooltip-skeleton-quote-bg);
  background-size: calc((184px * 2) + (16px/ 2)) 16px, calc((224px * 2) + (16px/ 2)) 16px, calc((224px * 2) + (16px/ 2)) 16px, calc((184px * 2) + (16px/ 2)) 16px, 24px 24px, 24px 24px, 24px 24px, 72px 24px, 72px 24px, 72px 24px;
  background-position: 72px 32px, 48px 64px, 48px 88px, 72px 112px, 60px 152px, 152px 152px, 240px 152px, 36px 184px, 128px 184px, 216px 184px;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}
${zi.mediaRules()}`;class Oi extends(i(a)){static get is(){return"bbva-map-tooltip"}static get scopedElements(){return{"bbva-badge-default":U,"bbva-badge-icon":X,"bbva-icon":b,"bbva-button-row":Di,"bbva-clip-box":Z,"bbva-text":g,"bbva-button-default":Q}}static get properties(){return{info:{type:Object},variant:{type:String},loading:{type:Boolean,reflect:!0},userText:{type:String,attribute:"user-text"},userImage:{type:String,attribute:"user-image"},avatarClass:{type:String,attribute:"avatar-class"},avatarColors:{type:Object,attribute:"avatar-colors"}}}constructor(){super(),this.info={},this.variant="branch",this.loading=!1,this.userText="",this.userImage="",this.avatarClass="bitone",this.avatarColors={bgColor:"#49A5E6",bgColor2:"#1973B8"}}static get styles(){return[Ni,l("bbva-map-tooltip-shared-styles"),J.light,ee.light,te.light,Mi.light,ie.light,_.light,ae.light]}closeTooltip(e){e.stopPropagation(),this.dispatch("map-tooltip-close-click")}optionButtonClicked(e){const t={index:e.detail,...this.info.options[e.detail]};e.stopPropagation(),this.dispatch("map-tooltip-option-button-click",t)}dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t||!0,bubbles:!0,composed:!0}))}showAvatar(e,t){return e||t?d`<div class="bbva-map-tooltip-avatar">
          <bbva-clip-box
            bg-color="${this.avatarColors.bgColor}"
            bg-color2="${this.avatarColors.bgColor2}"
            aria-disabled="true"
            size="large"
            class="${this.avatarClass}"
            .text="${e}"
            .image="${t}"
          ></bbva-clip-box>
        </div>`:null}_showIconBadge(e){return e?d`
        <bbva-badge-icon has-ellipsis class="bbva-map-tooltip-bagde-icon" icon="${e.icon??""}" category="${e.categoryName??""}" description="${e.description}"></bbva-badge-icon>
      `:""}_showStoreBadges(e,t){return e||t?d`
      <div class="bbva-map-tooltip-badge-${this.variant}">
        ${this._showIconBadge(e)}
        ${this._showIconBadge(t)}
      </div>
    `:""}render(){return d`
      <div class="bbva-map-tooltip-icon">
        <bbva-button-default variant="icon no-background" icon="${this.info.icon}" aria-label="${this.info.accessibilityIconText}" @click="${this.closeTooltip}"></bbva-button-default>
      </div>
      <section class="bbva-map-tooltip-section">
        ${this.showAvatar(this.userText,this.userImage)}
        <div class="bbva-map-tooltip-location">
          <span>${this.info.location}</span>
        </div>
      </section>
      <section class="bbva-map-tooltip-section">
        <bbva-text
          class="bbva-map-tooltip-description"
          ellipsis
          unset=""
          size="S"
          alignment="center"
          text="${this.info.description}">
        </bbva-text>
          ${"branch"===this.variant?d`
                  <div class="bbva-map-tooltip-extra-description">
                    <bbva-text
                      unset=""
                      size="S"
                      alignment="center"
                      text="${this.info.extraDescription}">
                    </bbva-text>
                  </div>
                  <div class="bbva-map-tooltip-badge-${this.variant}">
                    <bbva-text
                      unset=""
                      size="S"
                      alignment="center"
                      text="${this.info.badge}">
                    </bbva-text>
                    <bbva-badge-default
                      ambient="light"
                      text="${this.info.badgeTime}"
                      type="success"
                    >
                    </bbva-badge-default>
                  </div>
                `:""}
          ${"atm"===this.variant?d`
                  <div class="bbva-map-tooltip-badge-${this.variant}">
                    <bbva-text
                      unset=""
                      size="S"
                      font-weight="500"
                      alignment="center"
                      text="${this.info.badge}">
                    </bbva-text>
                  </div>
                `:""}
          ${"store"===this.variant?d`
                  <div class="bbva-map-tooltip-extra-description">
                    <bbva-text
                      unset=""
                      size="S"
                      alignment="center"
                      text="${this.info.extraDescription}">
                    </bbva-text>
                  </div>
                  ${this._showStoreBadges(this.info.promotionBadge,this.info.categoryBadge)}
                `:""}
        </div>
      </section>
      <section class="bbva-map-tooltip-section">
        <bbva-button-row
          ambient='light'
          @button-row-item-click="${this.optionButtonClicked}"
          .options="${this.info.options}"
        ></bbva-button-row>
      </section>

      <div class="skeleton"></div>
    `}}S("colors.cool60"),S("colors.primarySubdued"),S("colors.cool20"),S("colors.cool20"),S("colors.cool20"),S("colors.cool50"),S("colors.cool90"),S("colors.cool90"),S("colors.primaryMediumLight"),S("colors.primarySubdued"),S("colors.primaryMediumLight"),S("colors.primaryCoreLightened");var Ri,Vi,Fi,Hi={addClass:yt,removeClass:_t,hasClass:xt,toggleClass:kt,attr:St,removeAttr:wt,transform:$t,transition:Ct,on:Tt,off:At,trigger:Lt,transitionEnd:Pt,outerWidth:Et,outerHeight:Mt,styles:Bt,offset:It,css:Dt,each:zt,html:Nt,text:Ot,is:Rt,index:Vt,eq:Ft,append:Ht,prepend:qt,next:Gt,nextAll:jt,prev:Kt,prevAll:Wt,parent:Yt,parents:Ut,closest:Xt,find:Zt,children:Qt,filter:Jt,remove:ei};function qi(e,t){return void 0===t&&(t=0),setTimeout(e,t)}function Gi(){return Date.now()}function ji(e,t){void 0===t&&(t="x");var i,a,o,r=ti(),s=function(e){var t,i=ti();return i.getComputedStyle&&(t=i.getComputedStyle(e,null)),!t&&e.currentStyle&&(t=e.currentStyle),t||(t=e.style),t}(e);return r.WebKitCSSMatrix?((a=s.transform||s.webkitTransform).split(",").length>6&&(a=a.split(", ").map((function(e){return e.replace(",",".")})).join(", ")),o=new r.WebKitCSSMatrix("none"===a?"":a)):i=(o=s.MozTransform||s.OTransform||s.MsTransform||s.msTransform||s.transform||s.getPropertyValue("transform").replace("translate(","matrix(1, 0, 0, 1,")).toString().split(","),"x"===t&&(a=r.WebKitCSSMatrix?o.m41:16===i.length?parseFloat(i[12]):parseFloat(i[4])),"y"===t&&(a=r.WebKitCSSMatrix?o.m42:16===i.length?parseFloat(i[13]):parseFloat(i[5])),a||0}function Ki(e){return"object"==typeof e&&null!==e&&e.constructor&&"Object"===Object.prototype.toString.call(e).slice(8,-1)}function Wi(){for(var e,t=Object(arguments.length<=0?void 0:arguments[0]),i=["__proto__","constructor","prototype"],a=1;a<arguments.length;a+=1){var o=a<0||arguments.length<=a?void 0:arguments[a];if(null!=o&&(e=o,!("undefined"!=typeof window&&void 0!==window.HTMLElement?e instanceof HTMLElement:e&&(1===e.nodeType||11===e.nodeType))))for(var r=Object.keys(Object(o)).filter((function(e){return i.indexOf(e)<0})),s=0,n=r.length;s<n;s+=1){var l=r[s],d=Object.getOwnPropertyDescriptor(o,l);void 0!==d&&d.enumerable&&(Ki(t[l])&&Ki(o[l])?o[l].__swiper__?t[l]=o[l]:Wi(t[l],o[l]):!Ki(t[l])&&Ki(o[l])?(t[l]={},o[l].__swiper__?t[l]=o[l]:Wi(t[l],o[l])):t[l]=o[l])}}return t}function Yi(){return Ri||(Ri=function(){var e=ti(),t=ii();return{touch:!!("ontouchstart"in e||e.DocumentTouch&&t instanceof e.DocumentTouch),pointerEvents:!!e.PointerEvent&&"maxTouchPoints"in e.navigator&&e.navigator.maxTouchPoints>=0,observer:"MutationObserver"in e||"WebkitMutationObserver"in e,passiveListener:function(){var t=!1;try{var i=Object.defineProperty({},"passive",{get:function(){t=!0}});e.addEventListener("testPassiveListener",null,i)}catch(e){}return t}(),gestures:"ongesturestart"in e}}()),Ri}function Ui(e){return void 0===e&&(e={}),Vi||(Vi=function(e){var t=(void 0===e?{}:e).userAgent,i=Yi(),a=ti(),o=a.navigator.platform,r=t||a.navigator.userAgent,s={ios:!1,android:!1},n=a.screen.width,l=a.screen.height,d=r.match(/(Android);?[\s\/]+([\d.]+)?/),c=r.match(/(iPad).*OS\s([\d_]+)/),p=r.match(/(iPod)(.*OS\s([\d_]+))?/),h=!c&&r.match(/(iPhone\sOS|iOS)\s([\d_]+)/),m="Win32"===o,v="MacIntel"===o;return!c&&v&&i.touch&&["1024x1366","1366x1024","834x1194","1194x834","834x1112","1112x834","768x1024","1024x768","820x1180","1180x820","810x1080","1080x810"].indexOf(n+"x"+l)>=0&&((c=r.match(/(Version)\/([\d.]+)/))||(c=[0,1,"13_0_0"]),v=!1),d&&!m&&(s.os="android",s.android=!0),(c||h||p)&&(s.os="ios",s.ios=!0),s}(e)),Vi}function Xi(){return Fi||(Fi=function(){var e,t=ti();return{isEdge:!!t.navigator.userAgent.match(/Edge/g),isSafari:(e=t.navigator.userAgent.toLowerCase(),e.indexOf("safari")>=0&&e.indexOf("chrome")<0&&e.indexOf("android")<0),isWebView:/(iPhone|iPod|iPad).*AppleWebKit(?!.*Safari)/i.test(t.navigator.userAgent)}}()),Fi}Object.keys(Hi).forEach((function(e){Object.defineProperty(ft.fn,e,{value:Hi[e],writable:!0})}));var Zi={name:"resize",create:function(){var e=this;Wi(e,{resize:{observer:null,createObserver:function(){e&&!e.destroyed&&e.initialized&&(e.resize.observer=new ResizeObserver((function(t){var i=e.width,a=e.height,o=i,r=a;t.forEach((function(t){var i=t.contentBoxSize,a=t.contentRect,s=t.target;s&&s!==e.el||(o=a?a.width:(i[0]||i).inlineSize,r=a?a.height:(i[0]||i).blockSize)})),o===i&&r===a||e.resize.resizeHandler()})),e.resize.observer.observe(e.el))},removeObserver:function(){e.resize.observer&&e.resize.observer.unobserve&&e.el&&(e.resize.observer.unobserve(e.el),e.resize.observer=null)},resizeHandler:function(){e&&!e.destroyed&&e.initialized&&(e.emit("beforeResize"),e.emit("resize"))},orientationChangeHandler:function(){e&&!e.destroyed&&e.initialized&&e.emit("orientationchange")}}})},on:{init:function(e){var t=ti();e.params.resizeObserver&&void 0!==ti().ResizeObserver?e.resize.createObserver():(t.addEventListener("resize",e.resize.resizeHandler),t.addEventListener("orientationchange",e.resize.orientationChangeHandler))},destroy:function(e){var t=ti();e.resize.removeObserver(),t.removeEventListener("resize",e.resize.resizeHandler),t.removeEventListener("orientationchange",e.resize.orientationChangeHandler)}}};function Qi(){return Qi=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var i=arguments[t];for(var a in i)Object.prototype.hasOwnProperty.call(i,a)&&(e[a]=i[a])}return e},Qi.apply(this,arguments)}var Ji={attach:function(e,t){void 0===t&&(t={});var i=ti(),a=this,o=new(i.MutationObserver||i.WebkitMutationObserver)((function(e){if(1!==e.length){var t=function(){a.emit("observerUpdate",e[0])};i.requestAnimationFrame?i.requestAnimationFrame(t):i.setTimeout(t,0)}else a.emit("observerUpdate",e[0])}));o.observe(e,{attributes:void 0===t.attributes||t.attributes,childList:void 0===t.childList||t.childList,characterData:void 0===t.characterData||t.characterData}),a.observer.observers.push(o)},init:function(){var e=this;if(e.support.observer&&e.params.observer){if(e.params.observeParents)for(var t=e.$el.parents(),i=0;i<t.length;i+=1)e.observer.attach(t[i]);e.observer.attach(e.$el[0],{childList:e.params.observeSlideChildren}),e.observer.attach(e.$wrapperEl[0],{attributes:!1})}},destroy:function(){this.observer.observers.forEach((function(e){e.disconnect()})),this.observer.observers=[]}},ea={name:"observer",params:{observer:!1,observeParents:!1,observeSlideChildren:!1},create:function(){var e,t;e=this,t={observer:Qi({},Ji,{observers:[]})},Object.keys(t).forEach((function(i){Ki(t[i])&&Object.keys(t[i]).forEach((function(a){"function"==typeof t[i][a]&&(t[i][a]=t[i][a].bind(e))})),e[i]=t[i]}))},on:{init:function(e){e.observer.init()},destroy:function(e){e.observer.destroy()}}},ta={on:function(e,t,i){var a=this;if("function"!=typeof t)return a;var o=i?"unshift":"push";return e.split(" ").forEach((function(e){a.eventsListeners[e]||(a.eventsListeners[e]=[]),a.eventsListeners[e][o](t)})),a},once:function(e,t,i){var a=this;if("function"!=typeof t)return a;function o(){a.off(e,o),o.__emitterProxy&&delete o.__emitterProxy;for(var i=arguments.length,r=new Array(i),s=0;s<i;s++)r[s]=arguments[s];t.apply(a,r)}return o.__emitterProxy=t,a.on(e,o,i)},onAny:function(e,t){var i=this;if("function"!=typeof e)return i;var a=t?"unshift":"push";return i.eventsAnyListeners.indexOf(e)<0&&i.eventsAnyListeners[a](e),i},offAny:function(e){var t=this;if(!t.eventsAnyListeners)return t;var i=t.eventsAnyListeners.indexOf(e);return i>=0&&t.eventsAnyListeners.splice(i,1),t},off:function(e,t){var i=this;return i.eventsListeners?(e.split(" ").forEach((function(e){void 0===t?i.eventsListeners[e]=[]:i.eventsListeners[e]&&i.eventsListeners[e].forEach((function(a,o){(a===t||a.__emitterProxy&&a.__emitterProxy===t)&&i.eventsListeners[e].splice(o,1)}))})),i):i},emit:function(){var e,t,i,a=this;if(!a.eventsListeners)return a;for(var o=arguments.length,r=new Array(o),s=0;s<o;s++)r[s]=arguments[s];return"string"==typeof r[0]||Array.isArray(r[0])?(e=r[0],t=r.slice(1,r.length),i=a):(e=r[0].events,t=r[0].data,i=r[0].context||a),t.unshift(i),(Array.isArray(e)?e:e.split(" ")).forEach((function(e){a.eventsAnyListeners&&a.eventsAnyListeners.length&&a.eventsAnyListeners.forEach((function(a){a.apply(i,[e].concat(t))})),a.eventsListeners&&a.eventsListeners[e]&&a.eventsListeners[e].forEach((function(e){e.apply(i,t)}))})),a}};var ia={updateSize:function(){var e,t,i=this,a=i.$el;e=void 0!==i.params.width&&null!==i.params.width?i.params.width:a[0].clientWidth,t=void 0!==i.params.height&&null!==i.params.height?i.params.height:a[0].clientHeight,0===e&&i.isHorizontal()||0===t&&i.isVertical()||(e=e-parseInt(a.css("padding-left")||0,10)-parseInt(a.css("padding-right")||0,10),t=t-parseInt(a.css("padding-top")||0,10)-parseInt(a.css("padding-bottom")||0,10),Number.isNaN(e)&&(e=0),Number.isNaN(t)&&(t=0),Wi(i,{width:e,height:t,size:i.isHorizontal()?e:t}))},updateSlides:function(){var e=this;function t(t){return e.isHorizontal()?t:{width:"height","margin-top":"margin-left","margin-bottom ":"margin-right","margin-left":"margin-top","margin-right":"margin-bottom","padding-left":"padding-top","padding-right":"padding-bottom",marginRight:"marginBottom"}[t]}function i(e,i){return parseFloat(e.getPropertyValue(t(i))||0)}var a=e.params,o=e.$wrapperEl,r=e.size,s=e.rtlTranslate,n=e.wrongRTL,l=e.virtual&&a.virtual.enabled,d=l?e.virtual.slides.length:e.slides.length,c=o.children("."+e.params.slideClass),p=l?e.virtual.slides.length:c.length,h=[],m=[],v=[],u=a.slidesOffsetBefore;"function"==typeof u&&(u=a.slidesOffsetBefore.call(e));var g=a.slidesOffsetAfter;"function"==typeof g&&(g=a.slidesOffsetAfter.call(e));var b=e.snapGrid.length,f=e.slidesGrid.length,y=a.spaceBetween,_=-u,x=0,k=0;if(void 0!==r){var S,w;"string"==typeof y&&y.indexOf("%")>=0&&(y=parseFloat(y.replace("%",""))/100*r),e.virtualSize=-y,s?c.css({marginLeft:"",marginBottom:"",marginTop:""}):c.css({marginRight:"",marginBottom:"",marginTop:""}),a.slidesPerColumn>1&&(S=Math.floor(p/a.slidesPerColumn)===p/e.params.slidesPerColumn?p:Math.ceil(p/a.slidesPerColumn)*a.slidesPerColumn,"auto"!==a.slidesPerView&&"row"===a.slidesPerColumnFill&&(S=Math.max(S,a.slidesPerView*a.slidesPerColumn)));for(var $,C,T,A=a.slidesPerColumn,L=S/A,P=Math.floor(p/a.slidesPerColumn),E=0;E<p;E+=1){w=0;var M=c.eq(E);if(a.slidesPerColumn>1){var B=void 0,I=void 0,D=void 0;if("row"===a.slidesPerColumnFill&&a.slidesPerGroup>1){var z=Math.floor(E/(a.slidesPerGroup*a.slidesPerColumn)),N=E-a.slidesPerColumn*a.slidesPerGroup*z,O=0===z?a.slidesPerGroup:Math.min(Math.ceil((p-z*A*a.slidesPerGroup)/A),a.slidesPerGroup);B=(I=N-(D=Math.floor(N/O))*O+z*a.slidesPerGroup)+D*S/A,M.css({"-webkit-box-ordinal-group":B,"-moz-box-ordinal-group":B,"-ms-flex-order":B,"-webkit-order":B,order:B})}else"column"===a.slidesPerColumnFill?(D=E-(I=Math.floor(E/A))*A,(I>P||I===P&&D===A-1)&&(D+=1)>=A&&(D=0,I+=1)):I=E-(D=Math.floor(E/L))*L;M.css(t("margin-top"),0!==D?a.spaceBetween&&a.spaceBetween+"px":"")}if("none"!==M.css("display")){if("auto"===a.slidesPerView){var R=getComputedStyle(M[0]),V=M[0].style.transform,F=M[0].style.webkitTransform;if(V&&(M[0].style.transform="none"),F&&(M[0].style.webkitTransform="none"),a.roundLengths)w=e.isHorizontal()?M.outerWidth(!0):M.outerHeight(!0);else{var H=i(R,"width"),q=i(R,"padding-left"),G=i(R,"padding-right"),j=i(R,"margin-left"),K=i(R,"margin-right"),W=R.getPropertyValue("box-sizing");if(W&&"border-box"===W)w=H+j+K;else{var Y=M[0],U=Y.clientWidth;w=H+q+G+j+K+(Y.offsetWidth-U)}}V&&(M[0].style.transform=V),F&&(M[0].style.webkitTransform=F),a.roundLengths&&(w=Math.floor(w))}else w=(r-(a.slidesPerView-1)*y)/a.slidesPerView,a.roundLengths&&(w=Math.floor(w)),c[E]&&(c[E].style[t("width")]=w+"px");c[E]&&(c[E].swiperSlideSize=w),v.push(w),a.centeredSlides?(_=_+w/2+x/2+y,0===x&&0!==E&&(_=_-r/2-y),0===E&&(_=_-r/2-y),Math.abs(_)<.001&&(_=0),a.roundLengths&&(_=Math.floor(_)),k%a.slidesPerGroup==0&&h.push(_),m.push(_)):(a.roundLengths&&(_=Math.floor(_)),(k-Math.min(e.params.slidesPerGroupSkip,k))%e.params.slidesPerGroup==0&&h.push(_),m.push(_),_=_+w+y),e.virtualSize+=w+y,x=w,k+=1}}if(e.virtualSize=Math.max(e.virtualSize,r)+g,s&&n&&("slide"===a.effect||"coverflow"===a.effect)&&o.css({width:e.virtualSize+a.spaceBetween+"px"}),a.setWrapperSize)o.css(((C={})[t("width")]=e.virtualSize+a.spaceBetween+"px",C));if(a.slidesPerColumn>1)if(e.virtualSize=(w+a.spaceBetween)*S,e.virtualSize=Math.ceil(e.virtualSize/a.slidesPerColumn)-a.spaceBetween,o.css(((T={})[t("width")]=e.virtualSize+a.spaceBetween+"px",T)),a.centeredSlides){$=[];for(var X=0;X<h.length;X+=1){var Z=h[X];a.roundLengths&&(Z=Math.floor(Z)),h[X]<e.virtualSize+h[0]&&$.push(Z)}h=$}if(!a.centeredSlides){$=[];for(var Q=0;Q<h.length;Q+=1){var J=h[Q];a.roundLengths&&(J=Math.floor(J)),h[Q]<=e.virtualSize-r&&$.push(J)}h=$,Math.floor(e.virtualSize-r)-Math.floor(h[h.length-1])>1&&h.push(e.virtualSize-r)}if(0===h.length&&(h=[0]),0!==a.spaceBetween){var ee,te=e.isHorizontal()&&s?"marginLeft":t("marginRight");c.filter((function(e,t){return!a.cssMode||t!==c.length-1})).css(((ee={})[te]=y+"px",ee))}if(a.centeredSlides&&a.centeredSlidesBounds){var ie=0;v.forEach((function(e){ie+=e+(a.spaceBetween?a.spaceBetween:0)}));var ae=(ie-=a.spaceBetween)-r;h=h.map((function(e){return e<0?-u:e>ae?ae+g:e}))}if(a.centerInsufficientSlides){var oe=0;if(v.forEach((function(e){oe+=e+(a.spaceBetween?a.spaceBetween:0)})),(oe-=a.spaceBetween)<r){var re=(r-oe)/2;h.forEach((function(e,t){h[t]=e-re})),m.forEach((function(e,t){m[t]=e+re}))}}Wi(e,{slides:c,snapGrid:h,slidesGrid:m,slidesSizesGrid:v}),p!==d&&e.emit("slidesLengthChange"),h.length!==b&&(e.params.watchOverflow&&e.checkOverflow(),e.emit("snapGridLengthChange")),m.length!==f&&e.emit("slidesGridLengthChange"),(a.watchSlidesProgress||a.watchSlidesVisibility)&&e.updateSlidesOffset()}},updateAutoHeight:function(e){var t,i=this,a=[],o=i.virtual&&i.params.virtual.enabled,r=0;"number"==typeof e?i.setTransition(e):!0===e&&i.setTransition(i.params.speed);var s=function(e){return o?i.slides.filter((function(t){return parseInt(t.getAttribute("data-swiper-slide-index"),10)===e}))[0]:i.slides.eq(e)[0]};if("auto"!==i.params.slidesPerView&&i.params.slidesPerView>1)if(i.params.centeredSlides)i.visibleSlides.each((function(e){a.push(e)}));else for(t=0;t<Math.ceil(i.params.slidesPerView);t+=1){var n=i.activeIndex+t;if(n>i.slides.length&&!o)break;a.push(s(n))}else a.push(s(i.activeIndex));for(t=0;t<a.length;t+=1)if(void 0!==a[t]){var l=a[t].offsetHeight;r=l>r?l:r}r&&i.$wrapperEl.css("height",r+"px")},updateSlidesOffset:function(){for(var e=this.slides,t=0;t<e.length;t+=1)e[t].swiperSlideOffset=this.isHorizontal()?e[t].offsetLeft:e[t].offsetTop},updateSlidesProgress:function(e){void 0===e&&(e=this&&this.translate||0);var t=this,i=t.params,a=t.slides,o=t.rtlTranslate;if(0!==a.length){void 0===a[0].swiperSlideOffset&&t.updateSlidesOffset();var r=-e;o&&(r=e),a.removeClass(i.slideVisibleClass),t.visibleSlidesIndexes=[],t.visibleSlides=[];for(var s=0;s<a.length;s+=1){var n=a[s],l=(r+(i.centeredSlides?t.minTranslate():0)-n.swiperSlideOffset)/(n.swiperSlideSize+i.spaceBetween);if(i.watchSlidesVisibility||i.centeredSlides&&i.autoHeight){var d=-(r-n.swiperSlideOffset),c=d+t.slidesSizesGrid[s];(d>=0&&d<t.size-1||c>1&&c<=t.size||d<=0&&c>=t.size)&&(t.visibleSlides.push(n),t.visibleSlidesIndexes.push(s),a.eq(s).addClass(i.slideVisibleClass))}n.progress=o?-l:l}t.visibleSlides=ft(t.visibleSlides)}},updateProgress:function(e){var t=this;if(void 0===e){var i=t.rtlTranslate?-1:1;e=t&&t.translate&&t.translate*i||0}var a=t.params,o=t.maxTranslate()-t.minTranslate(),r=t.progress,s=t.isBeginning,n=t.isEnd,l=s,d=n;0===o?(r=0,s=!0,n=!0):(s=(r=(e-t.minTranslate())/o)<=0,n=r>=1),Wi(t,{progress:r,isBeginning:s,isEnd:n}),(a.watchSlidesProgress||a.watchSlidesVisibility||a.centeredSlides&&a.autoHeight)&&t.updateSlidesProgress(e),s&&!l&&t.emit("reachBeginning toEdge"),n&&!d&&t.emit("reachEnd toEdge"),(l&&!s||d&&!n)&&t.emit("fromEdge"),t.emit("progress",r)},updateSlidesClasses:function(){var e,t=this,i=t.slides,a=t.params,o=t.$wrapperEl,r=t.activeIndex,s=t.realIndex,n=t.virtual&&a.virtual.enabled;i.removeClass(a.slideActiveClass+" "+a.slideNextClass+" "+a.slidePrevClass+" "+a.slideDuplicateActiveClass+" "+a.slideDuplicateNextClass+" "+a.slideDuplicatePrevClass),(e=n?t.$wrapperEl.find("."+a.slideClass+'[data-swiper-slide-index="'+r+'"]'):i.eq(r)).addClass(a.slideActiveClass),a.loop&&(e.hasClass(a.slideDuplicateClass)?o.children("."+a.slideClass+":not(."+a.slideDuplicateClass+')[data-swiper-slide-index="'+s+'"]').addClass(a.slideDuplicateActiveClass):o.children("."+a.slideClass+"."+a.slideDuplicateClass+'[data-swiper-slide-index="'+s+'"]').addClass(a.slideDuplicateActiveClass));var l=e.nextAll("."+a.slideClass).eq(0).addClass(a.slideNextClass);a.loop&&0===l.length&&(l=i.eq(0)).addClass(a.slideNextClass);var d=e.prevAll("."+a.slideClass).eq(0).addClass(a.slidePrevClass);a.loop&&0===d.length&&(d=i.eq(-1)).addClass(a.slidePrevClass),a.loop&&(l.hasClass(a.slideDuplicateClass)?o.children("."+a.slideClass+":not(."+a.slideDuplicateClass+')[data-swiper-slide-index="'+l.attr("data-swiper-slide-index")+'"]').addClass(a.slideDuplicateNextClass):o.children("."+a.slideClass+"."+a.slideDuplicateClass+'[data-swiper-slide-index="'+l.attr("data-swiper-slide-index")+'"]').addClass(a.slideDuplicateNextClass),d.hasClass(a.slideDuplicateClass)?o.children("."+a.slideClass+":not(."+a.slideDuplicateClass+')[data-swiper-slide-index="'+d.attr("data-swiper-slide-index")+'"]').addClass(a.slideDuplicatePrevClass):o.children("."+a.slideClass+"."+a.slideDuplicateClass+'[data-swiper-slide-index="'+d.attr("data-swiper-slide-index")+'"]').addClass(a.slideDuplicatePrevClass)),t.emitSlidesClasses()},updateActiveIndex:function(e){var t,i=this,a=i.rtlTranslate?i.translate:-i.translate,o=i.slidesGrid,r=i.snapGrid,s=i.params,n=i.activeIndex,l=i.realIndex,d=i.snapIndex,c=e;if(void 0===c){for(var p=0;p<o.length;p+=1)void 0!==o[p+1]?a>=o[p]&&a<o[p+1]-(o[p+1]-o[p])/2?c=p:a>=o[p]&&a<o[p+1]&&(c=p+1):a>=o[p]&&(c=p);s.normalizeSlideIndex&&(c<0||void 0===c)&&(c=0)}if(r.indexOf(a)>=0)t=r.indexOf(a);else{var h=Math.min(s.slidesPerGroupSkip,c);t=h+Math.floor((c-h)/s.slidesPerGroup)}if(t>=r.length&&(t=r.length-1),c!==n){var m=parseInt(i.slides.eq(c).attr("data-swiper-slide-index")||c,10);Wi(i,{snapIndex:t,realIndex:m,previousIndex:n,activeIndex:c}),i.emit("activeIndexChange"),i.emit("snapIndexChange"),l!==m&&i.emit("realIndexChange"),(i.initialized||i.params.runCallbacksOnInit)&&i.emit("slideChange")}else t!==d&&(i.snapIndex=t,i.emit("snapIndexChange"))},updateClickedSlide:function(e){var t,i=this,a=i.params,o=ft(e.target).closest("."+a.slideClass)[0],r=!1;if(o)for(var s=0;s<i.slides.length;s+=1)if(i.slides[s]===o){r=!0,t=s;break}if(!o||!r)return i.clickedSlide=void 0,void(i.clickedIndex=void 0);i.clickedSlide=o,i.virtual&&i.params.virtual.enabled?i.clickedIndex=parseInt(ft(o).attr("data-swiper-slide-index"),10):i.clickedIndex=t,a.slideToClickedSlide&&void 0!==i.clickedIndex&&i.clickedIndex!==i.activeIndex&&i.slideToClickedSlide()}};var aa={getTranslate:function(e){void 0===e&&(e=this.isHorizontal()?"x":"y");var t=this,i=t.params,a=t.rtlTranslate,o=t.translate,r=t.$wrapperEl;if(i.virtualTranslate)return a?-o:o;if(i.cssMode)return o;var s=ji(r[0],e);return a&&(s=-s),s||0},setTranslate:function(e,t){var i=this,a=i.rtlTranslate,o=i.params,r=i.$wrapperEl,s=i.wrapperEl,n=i.progress,l=0,d=0;i.isHorizontal()?l=a?-e:e:d=e,o.roundLengths&&(l=Math.floor(l),d=Math.floor(d)),o.cssMode?s[i.isHorizontal()?"scrollLeft":"scrollTop"]=i.isHorizontal()?-l:-d:o.virtualTranslate||r.transform("translate3d("+l+"px, "+d+"px, 0px)"),i.previousTranslate=i.translate,i.translate=i.isHorizontal()?l:d;var c=i.maxTranslate()-i.minTranslate();(0===c?0:(e-i.minTranslate())/c)!==n&&i.updateProgress(e),i.emit("setTranslate",i.translate,t)},minTranslate:function(){return-this.snapGrid[0]},maxTranslate:function(){return-this.snapGrid[this.snapGrid.length-1]},translateTo:function(e,t,i,a,o){void 0===e&&(e=0),void 0===t&&(t=this.params.speed),void 0===i&&(i=!0),void 0===a&&(a=!0);var r=this,s=r.params,n=r.wrapperEl;if(r.animating&&s.preventInteractionOnTransition)return!1;var l,d=r.minTranslate(),c=r.maxTranslate();if(l=a&&e>d?d:a&&e<c?c:e,r.updateProgress(l),s.cssMode){var p,h=r.isHorizontal();if(0===t)n[h?"scrollLeft":"scrollTop"]=-l;else if(n.scrollTo)n.scrollTo(((p={})[h?"left":"top"]=-l,p.behavior="smooth",p));else n[h?"scrollLeft":"scrollTop"]=-l;return!0}return 0===t?(r.setTransition(0),r.setTranslate(l),i&&(r.emit("beforeTransitionStart",t,o),r.emit("transitionEnd"))):(r.setTransition(t),r.setTranslate(l),i&&(r.emit("beforeTransitionStart",t,o),r.emit("transitionStart")),r.animating||(r.animating=!0,r.onTranslateToWrapperTransitionEnd||(r.onTranslateToWrapperTransitionEnd=function(e){r&&!r.destroyed&&e.target===this&&(r.$wrapperEl[0].removeEventListener("transitionend",r.onTranslateToWrapperTransitionEnd),r.$wrapperEl[0].removeEventListener("webkitTransitionEnd",r.onTranslateToWrapperTransitionEnd),r.onTranslateToWrapperTransitionEnd=null,delete r.onTranslateToWrapperTransitionEnd,i&&r.emit("transitionEnd"))}),r.$wrapperEl[0].addEventListener("transitionend",r.onTranslateToWrapperTransitionEnd),r.$wrapperEl[0].addEventListener("webkitTransitionEnd",r.onTranslateToWrapperTransitionEnd))),!0}};var oa={slideTo:function(e,t,i,a,o){if(void 0===e&&(e=0),void 0===t&&(t=this.params.speed),void 0===i&&(i=!0),"number"!=typeof e&&"string"!=typeof e)throw new Error("The 'index' argument cannot have type other than 'number' or 'string'. ["+typeof e+"] given.");if("string"==typeof e){var r=parseInt(e,10);if(!isFinite(r))throw new Error("The passed-in 'index' (string) couldn't be converted to 'number'. ["+e+"] given.");e=r}var s=this,n=e;n<0&&(n=0);var l=s.params,d=s.snapGrid,c=s.slidesGrid,p=s.previousIndex,h=s.activeIndex,m=s.rtlTranslate,v=s.wrapperEl,u=s.enabled;if(s.animating&&l.preventInteractionOnTransition||!u&&!a&&!o)return!1;var g=Math.min(s.params.slidesPerGroupSkip,n),b=g+Math.floor((n-g)/s.params.slidesPerGroup);b>=d.length&&(b=d.length-1),(h||l.initialSlide||0)===(p||0)&&i&&s.emit("beforeSlideChangeStart");var f,y=-d[b];if(s.updateProgress(y),l.normalizeSlideIndex)for(var _=0;_<c.length;_+=1){var x=-Math.floor(100*y),k=Math.floor(100*c[_]),S=Math.floor(100*c[_+1]);void 0!==c[_+1]?x>=k&&x<S-(S-k)/2?n=_:x>=k&&x<S&&(n=_+1):x>=k&&(n=_)}if(s.initialized&&n!==h){if(!s.allowSlideNext&&y<s.translate&&y<s.minTranslate())return!1;if(!s.allowSlidePrev&&y>s.translate&&y>s.maxTranslate()&&(h||0)!==n)return!1}if(f=n>h?"next":n<h?"prev":"reset",m&&-y===s.translate||!m&&y===s.translate)return s.updateActiveIndex(n),l.autoHeight&&s.updateAutoHeight(),s.updateSlidesClasses(),"slide"!==l.effect&&s.setTranslate(y),"reset"!==f&&(s.transitionStart(i,f),s.transitionEnd(i,f)),!1;if(l.cssMode){var w,$=s.isHorizontal(),C=-y;if(m&&(C=v.scrollWidth-v.offsetWidth-C),0===t)v[$?"scrollLeft":"scrollTop"]=C;else if(v.scrollTo)v.scrollTo(((w={})[$?"left":"top"]=C,w.behavior="smooth",w));else v[$?"scrollLeft":"scrollTop"]=C;return!0}return 0===t?(s.setTransition(0),s.setTranslate(y),s.updateActiveIndex(n),s.updateSlidesClasses(),s.emit("beforeTransitionStart",t,a),s.transitionStart(i,f),s.transitionEnd(i,f)):(s.setTransition(t),s.setTranslate(y),s.updateActiveIndex(n),s.updateSlidesClasses(),s.emit("beforeTransitionStart",t,a),s.transitionStart(i,f),s.animating||(s.animating=!0,s.onSlideToWrapperTransitionEnd||(s.onSlideToWrapperTransitionEnd=function(e){s&&!s.destroyed&&e.target===this&&(s.$wrapperEl[0].removeEventListener("transitionend",s.onSlideToWrapperTransitionEnd),s.$wrapperEl[0].removeEventListener("webkitTransitionEnd",s.onSlideToWrapperTransitionEnd),s.onSlideToWrapperTransitionEnd=null,delete s.onSlideToWrapperTransitionEnd,s.transitionEnd(i,f))}),s.$wrapperEl[0].addEventListener("transitionend",s.onSlideToWrapperTransitionEnd),s.$wrapperEl[0].addEventListener("webkitTransitionEnd",s.onSlideToWrapperTransitionEnd))),!0},slideToLoop:function(e,t,i,a){void 0===e&&(e=0),void 0===t&&(t=this.params.speed),void 0===i&&(i=!0);var o=this,r=e;return o.params.loop&&(r+=o.loopedSlides),o.slideTo(r,t,i,a)},slideNext:function(e,t,i){void 0===e&&(e=this.params.speed),void 0===t&&(t=!0);var a=this,o=a.params,r=a.animating;if(!a.enabled)return a;var s=a.activeIndex<o.slidesPerGroupSkip?1:o.slidesPerGroup;if(o.loop){if(r&&o.loopPreventsSlide)return!1;a.loopFix(),a._clientLeft=a.$wrapperEl[0].clientLeft}return a.slideTo(a.activeIndex+s,e,t,i)},slidePrev:function(e,t,i){void 0===e&&(e=this.params.speed),void 0===t&&(t=!0);var a=this,o=a.params,r=a.animating,s=a.snapGrid,n=a.slidesGrid,l=a.rtlTranslate;if(!a.enabled)return a;if(o.loop){if(r&&o.loopPreventsSlide)return!1;a.loopFix(),a._clientLeft=a.$wrapperEl[0].clientLeft}function d(e){return e<0?-Math.floor(Math.abs(e)):Math.floor(e)}var c,p=d(l?a.translate:-a.translate),h=s.map((function(e){return d(e)})),m=s[h.indexOf(p)-1];return void 0===m&&o.cssMode&&s.forEach((function(e){!m&&p>=e&&(m=e)})),void 0!==m&&(c=n.indexOf(m))<0&&(c=a.activeIndex-1),a.slideTo(c,e,t,i)},slideReset:function(e,t,i){return void 0===e&&(e=this.params.speed),void 0===t&&(t=!0),this.slideTo(this.activeIndex,e,t,i)},slideToClosest:function(e,t,i,a){void 0===e&&(e=this.params.speed),void 0===t&&(t=!0),void 0===a&&(a=.5);var o=this,r=o.activeIndex,s=Math.min(o.params.slidesPerGroupSkip,r),n=s+Math.floor((r-s)/o.params.slidesPerGroup),l=o.rtlTranslate?o.translate:-o.translate;if(l>=o.snapGrid[n]){var d=o.snapGrid[n];l-d>(o.snapGrid[n+1]-d)*a&&(r+=o.params.slidesPerGroup)}else{var c=o.snapGrid[n-1];l-c<=(o.snapGrid[n]-c)*a&&(r-=o.params.slidesPerGroup)}return r=Math.max(r,0),r=Math.min(r,o.slidesGrid.length-1),o.slideTo(r,e,t,i)},slideToClickedSlide:function(){var e,t=this,i=t.params,a=t.$wrapperEl,o="auto"===i.slidesPerView?t.slidesPerViewDynamic():i.slidesPerView,r=t.clickedIndex;if(i.loop){if(t.animating)return;e=parseInt(ft(t.clickedSlide).attr("data-swiper-slide-index"),10),i.centeredSlides?r<t.loopedSlides-o/2||r>t.slides.length-t.loopedSlides+o/2?(t.loopFix(),r=a.children("."+i.slideClass+'[data-swiper-slide-index="'+e+'"]:not(.'+i.slideDuplicateClass+")").eq(0).index(),qi((function(){t.slideTo(r)}))):t.slideTo(r):r>t.slides.length-o?(t.loopFix(),r=a.children("."+i.slideClass+'[data-swiper-slide-index="'+e+'"]:not(.'+i.slideDuplicateClass+")").eq(0).index(),qi((function(){t.slideTo(r)}))):t.slideTo(r)}else t.slideTo(r)}};var ra={loopCreate:function(){var e=this,t=ii(),i=e.params,a=e.$wrapperEl;a.children("."+i.slideClass+"."+i.slideDuplicateClass).remove();var o=a.children("."+i.slideClass);if(i.loopFillGroupWithBlank){var r=i.slidesPerGroup-o.length%i.slidesPerGroup;if(r!==i.slidesPerGroup){for(var s=0;s<r;s+=1){var n=ft(t.createElement("div")).addClass(i.slideClass+" "+i.slideBlankClass);a.append(n)}o=a.children("."+i.slideClass)}}"auto"!==i.slidesPerView||i.loopedSlides||(i.loopedSlides=o.length),e.loopedSlides=Math.ceil(parseFloat(i.loopedSlides||i.slidesPerView,10)),e.loopedSlides+=i.loopAdditionalSlides,e.loopedSlides>o.length&&(e.loopedSlides=o.length);var l=[],d=[];o.each((function(t,i){var a=ft(t);i<e.loopedSlides&&d.push(t),i<o.length&&i>=o.length-e.loopedSlides&&l.push(t),a.attr("data-swiper-slide-index",i)}));for(var c=0;c<d.length;c+=1)a.append(ft(d[c].cloneNode(!0)).addClass(i.slideDuplicateClass));for(var p=l.length-1;p>=0;p-=1)a.prepend(ft(l[p].cloneNode(!0)).addClass(i.slideDuplicateClass))},loopFix:function(){var e=this;e.emit("beforeLoopFix");var t,i=e.activeIndex,a=e.slides,o=e.loopedSlides,r=e.allowSlidePrev,s=e.allowSlideNext,n=e.snapGrid,l=e.rtlTranslate;e.allowSlidePrev=!0,e.allowSlideNext=!0;var d=-n[i]-e.getTranslate();if(i<o)t=a.length-3*o+i,t+=o,e.slideTo(t,0,!1,!0)&&0!==d&&e.setTranslate((l?-e.translate:e.translate)-d);else if(i>=a.length-o){t=-a.length+i+o,t+=o,e.slideTo(t,0,!1,!0)&&0!==d&&e.setTranslate((l?-e.translate:e.translate)-d)}e.allowSlidePrev=r,e.allowSlideNext=s,e.emit("loopFix")},loopDestroy:function(){var e=this,t=e.$wrapperEl,i=e.params,a=e.slides;t.children("."+i.slideClass+"."+i.slideDuplicateClass+",."+i.slideClass+"."+i.slideBlankClass).remove(),a.removeAttr("data-swiper-slide-index")}};var sa={appendSlide:function(e){var t=this,i=t.$wrapperEl,a=t.params;if(a.loop&&t.loopDestroy(),"object"==typeof e&&"length"in e)for(var o=0;o<e.length;o+=1)e[o]&&i.append(e[o]);else i.append(e);a.loop&&t.loopCreate(),a.observer&&t.support.observer||t.update()},prependSlide:function(e){var t=this,i=t.params,a=t.$wrapperEl,o=t.activeIndex;i.loop&&t.loopDestroy();var r=o+1;if("object"==typeof e&&"length"in e){for(var s=0;s<e.length;s+=1)e[s]&&a.prepend(e[s]);r=o+e.length}else a.prepend(e);i.loop&&t.loopCreate(),i.observer&&t.support.observer||t.update(),t.slideTo(r,0,!1)},addSlide:function(e,t){var i=this,a=i.$wrapperEl,o=i.params,r=i.activeIndex;o.loop&&(r-=i.loopedSlides,i.loopDestroy(),i.slides=a.children("."+o.slideClass));var s=i.slides.length;if(e<=0)i.prependSlide(t);else if(e>=s)i.appendSlide(t);else{for(var n=r>e?r+1:r,l=[],d=s-1;d>=e;d-=1){var c=i.slides.eq(d);c.remove(),l.unshift(c)}if("object"==typeof t&&"length"in t){for(var p=0;p<t.length;p+=1)t[p]&&a.append(t[p]);n=r>e?r+t.length:r}else a.append(t);for(var h=0;h<l.length;h+=1)a.append(l[h]);o.loop&&i.loopCreate(),o.observer&&i.support.observer||i.update(),o.loop?i.slideTo(n+i.loopedSlides,0,!1):i.slideTo(n,0,!1)}},removeSlide:function(e){var t=this,i=t.params,a=t.$wrapperEl,o=t.activeIndex;i.loop&&(o-=t.loopedSlides,t.loopDestroy(),t.slides=a.children("."+i.slideClass));var r,s=o;if("object"==typeof e&&"length"in e){for(var n=0;n<e.length;n+=1)r=e[n],t.slides[r]&&t.slides.eq(r).remove(),r<s&&(s-=1);s=Math.max(s,0)}else r=e,t.slides[r]&&t.slides.eq(r).remove(),r<s&&(s-=1),s=Math.max(s,0);i.loop&&t.loopCreate(),i.observer&&t.support.observer||t.update(),i.loop?t.slideTo(s+t.loopedSlides,0,!1):t.slideTo(s,0,!1)},removeAllSlides:function(){for(var e=[],t=0;t<this.slides.length;t+=1)e.push(t);this.removeSlide(e)}};function na(e){var t=this,i=ii(),a=ti(),o=t.touchEventsData,r=t.params,s=t.touches;if(t.enabled&&(!t.animating||!r.preventInteractionOnTransition)){var n=e;n.originalEvent&&(n=n.originalEvent);var l=ft(n.target);if(("wrapper"!==r.touchEventsTarget||l.closest(t.wrapperEl).length)&&(o.isTouchEvent="touchstart"===n.type,(o.isTouchEvent||!("which"in n)||3!==n.which)&&!(!o.isTouchEvent&&"button"in n&&n.button>0||o.isTouched&&o.isMoved))){!!r.noSwipingClass&&""!==r.noSwipingClass&&n.target&&n.target.shadowRoot&&e.path&&e.path[0]&&(l=ft(e.path[0]));var d=r.noSwipingSelector?r.noSwipingSelector:"."+r.noSwipingClass,c=!(!n.target||!n.target.shadowRoot);if(r.noSwiping&&(c?function(e,t){return void 0===t&&(t=this),function t(i){return i&&i!==ii()&&i!==ti()?(i.assignedSlot&&(i=i.assignedSlot),i.closest(e)||t(i.getRootNode().host)):null}(t)}(d,n.target):l.closest(d)[0]))t.allowClick=!0;else if(!r.swipeHandler||l.closest(r.swipeHandler)[0]){s.currentX="touchstart"===n.type?n.targetTouches[0].pageX:n.pageX,s.currentY="touchstart"===n.type?n.targetTouches[0].pageY:n.pageY;var p=s.currentX,h=s.currentY,m=r.edgeSwipeDetection||r.iOSEdgeSwipeDetection,v=r.edgeSwipeThreshold||r.iOSEdgeSwipeThreshold;if(m&&(p<=v||p>=a.innerWidth-v)){if("prevent"!==m)return;e.preventDefault()}if(Wi(o,{isTouched:!0,isMoved:!1,allowTouchCallbacks:!0,isScrolling:void 0,startMoving:void 0}),s.startX=p,s.startY=h,o.touchStartTime=Gi(),t.allowClick=!0,t.updateSize(),t.swipeDirection=void 0,r.threshold>0&&(o.allowThresholdMove=!1),"touchstart"!==n.type){var u=!0;l.is(o.focusableElements)&&(u=!1),i.activeElement&&ft(i.activeElement).is(o.focusableElements)&&i.activeElement!==l[0]&&i.activeElement.blur();var g=u&&t.allowTouchMove&&r.touchStartPreventDefault;!r.touchStartForcePreventDefault&&!g||l[0].isContentEditable||n.preventDefault()}t.emit("touchStart",n)}}}}function la(e){var t=ii(),i=this,a=i.touchEventsData,o=i.params,r=i.touches,s=i.rtlTranslate;if(i.enabled){var n=e;if(n.originalEvent&&(n=n.originalEvent),a.isTouched){if(!a.isTouchEvent||"touchmove"===n.type){var l="touchmove"===n.type&&n.targetTouches&&(n.targetTouches[0]||n.changedTouches[0]),d="touchmove"===n.type?l.pageX:n.pageX,c="touchmove"===n.type?l.pageY:n.pageY;if(n.preventedByNestedSwiper)return r.startX=d,void(r.startY=c);if(!i.allowTouchMove)return i.allowClick=!1,void(a.isTouched&&(Wi(r,{startX:d,startY:c,currentX:d,currentY:c}),a.touchStartTime=Gi()));if(a.isTouchEvent&&o.touchReleaseOnEdges&&!o.loop)if(i.isVertical()){if(c<r.startY&&i.translate<=i.maxTranslate()||c>r.startY&&i.translate>=i.minTranslate())return a.isTouched=!1,void(a.isMoved=!1)}else if(d<r.startX&&i.translate<=i.maxTranslate()||d>r.startX&&i.translate>=i.minTranslate())return;if(a.isTouchEvent&&t.activeElement&&n.target===t.activeElement&&ft(n.target).is(a.focusableElements))return a.isMoved=!0,void(i.allowClick=!1);if(a.allowTouchCallbacks&&i.emit("touchMove",n),!(n.targetTouches&&n.targetTouches.length>1)){r.currentX=d,r.currentY=c;var p=r.currentX-r.startX,h=r.currentY-r.startY;if(!(i.params.threshold&&Math.sqrt(Math.pow(p,2)+Math.pow(h,2))<i.params.threshold)){var m;if(void 0===a.isScrolling)i.isHorizontal()&&r.currentY===r.startY||i.isVertical()&&r.currentX===r.startX?a.isScrolling=!1:p*p+h*h>=25&&(m=180*Math.atan2(Math.abs(h),Math.abs(p))/Math.PI,a.isScrolling=i.isHorizontal()?m>o.touchAngle:90-m>o.touchAngle);if(a.isScrolling&&i.emit("touchMoveOpposite",n),void 0===a.startMoving&&(r.currentX===r.startX&&r.currentY===r.startY||(a.startMoving=!0)),a.isScrolling)a.isTouched=!1;else if(a.startMoving){i.allowClick=!1,!o.cssMode&&n.cancelable&&n.preventDefault(),o.touchMoveStopPropagation&&!o.nested&&n.stopPropagation(),a.isMoved||(o.loop&&i.loopFix(),a.startTranslate=i.getTranslate(),i.setTransition(0),i.animating&&i.$wrapperEl.trigger("webkitTransitionEnd transitionend"),a.allowMomentumBounce=!1,!o.grabCursor||!0!==i.allowSlideNext&&!0!==i.allowSlidePrev||i.setGrabCursor(!0),i.emit("sliderFirstMove",n)),i.emit("sliderMove",n),a.isMoved=!0;var v=i.isHorizontal()?p:h;r.diff=v,v*=o.touchRatio,s&&(v=-v),i.swipeDirection=v>0?"prev":"next",a.currentTranslate=v+a.startTranslate;var u=!0,g=o.resistanceRatio;if(o.touchReleaseOnEdges&&(g=0),v>0&&a.currentTranslate>i.minTranslate()?(u=!1,o.resistance&&(a.currentTranslate=i.minTranslate()-1+Math.pow(-i.minTranslate()+a.startTranslate+v,g))):v<0&&a.currentTranslate<i.maxTranslate()&&(u=!1,o.resistance&&(a.currentTranslate=i.maxTranslate()+1-Math.pow(i.maxTranslate()-a.startTranslate-v,g))),u&&(n.preventedByNestedSwiper=!0),!i.allowSlideNext&&"next"===i.swipeDirection&&a.currentTranslate<a.startTranslate&&(a.currentTranslate=a.startTranslate),!i.allowSlidePrev&&"prev"===i.swipeDirection&&a.currentTranslate>a.startTranslate&&(a.currentTranslate=a.startTranslate),i.allowSlidePrev||i.allowSlideNext||(a.currentTranslate=a.startTranslate),o.threshold>0){if(!(Math.abs(v)>o.threshold||a.allowThresholdMove))return void(a.currentTranslate=a.startTranslate);if(!a.allowThresholdMove)return a.allowThresholdMove=!0,r.startX=r.currentX,r.startY=r.currentY,a.currentTranslate=a.startTranslate,void(r.diff=i.isHorizontal()?r.currentX-r.startX:r.currentY-r.startY)}o.followFinger&&!o.cssMode&&((o.freeMode||o.watchSlidesProgress||o.watchSlidesVisibility)&&(i.updateActiveIndex(),i.updateSlidesClasses()),o.freeMode&&(0===a.velocities.length&&a.velocities.push({position:r[i.isHorizontal()?"startX":"startY"],time:a.touchStartTime}),a.velocities.push({position:r[i.isHorizontal()?"currentX":"currentY"],time:Gi()})),i.updateProgress(a.currentTranslate),i.setTranslate(a.currentTranslate))}}}}}else a.startMoving&&a.isScrolling&&i.emit("touchMoveOpposite",n)}}function da(e){var t=this,i=t.touchEventsData,a=t.params,o=t.touches,r=t.rtlTranslate,s=t.$wrapperEl,n=t.slidesGrid,l=t.snapGrid;if(t.enabled){var d=e;if(d.originalEvent&&(d=d.originalEvent),i.allowTouchCallbacks&&t.emit("touchEnd",d),i.allowTouchCallbacks=!1,!i.isTouched)return i.isMoved&&a.grabCursor&&t.setGrabCursor(!1),i.isMoved=!1,void(i.startMoving=!1);a.grabCursor&&i.isMoved&&i.isTouched&&(!0===t.allowSlideNext||!0===t.allowSlidePrev)&&t.setGrabCursor(!1);var c,p=Gi(),h=p-i.touchStartTime;if(t.allowClick&&(t.updateClickedSlide(d),t.emit("tap click",d),h<300&&p-i.lastClickTime<300&&t.emit("doubleTap doubleClick",d)),i.lastClickTime=Gi(),qi((function(){t.destroyed||(t.allowClick=!0)})),!i.isTouched||!i.isMoved||!t.swipeDirection||0===o.diff||i.currentTranslate===i.startTranslate)return i.isTouched=!1,i.isMoved=!1,void(i.startMoving=!1);if(i.isTouched=!1,i.isMoved=!1,i.startMoving=!1,c=a.followFinger?r?t.translate:-t.translate:-i.currentTranslate,!a.cssMode)if(a.freeMode){if(c<-t.minTranslate())return void t.slideTo(t.activeIndex);if(c>-t.maxTranslate())return void(t.slides.length<l.length?t.slideTo(l.length-1):t.slideTo(t.slides.length-1));if(a.freeModeMomentum){if(i.velocities.length>1){var m=i.velocities.pop(),v=i.velocities.pop(),u=m.position-v.position,g=m.time-v.time;t.velocity=u/g,t.velocity/=2,Math.abs(t.velocity)<a.freeModeMinimumVelocity&&(t.velocity=0),(g>150||Gi()-m.time>300)&&(t.velocity=0)}else t.velocity=0;t.velocity*=a.freeModeMomentumVelocityRatio,i.velocities.length=0;var b=1e3*a.freeModeMomentumRatio,f=t.velocity*b,y=t.translate+f;r&&(y=-y);var _,x,k=!1,S=20*Math.abs(t.velocity)*a.freeModeMomentumBounceRatio;if(y<t.maxTranslate())a.freeModeMomentumBounce?(y+t.maxTranslate()<-S&&(y=t.maxTranslate()-S),_=t.maxTranslate(),k=!0,i.allowMomentumBounce=!0):y=t.maxTranslate(),a.loop&&a.centeredSlides&&(x=!0);else if(y>t.minTranslate())a.freeModeMomentumBounce?(y-t.minTranslate()>S&&(y=t.minTranslate()+S),_=t.minTranslate(),k=!0,i.allowMomentumBounce=!0):y=t.minTranslate(),a.loop&&a.centeredSlides&&(x=!0);else if(a.freeModeSticky){for(var w,$=0;$<l.length;$+=1)if(l[$]>-y){w=$;break}y=-(y=Math.abs(l[w]-y)<Math.abs(l[w-1]-y)||"next"===t.swipeDirection?l[w]:l[w-1])}if(x&&t.once("transitionEnd",(function(){t.loopFix()})),0!==t.velocity){if(b=r?Math.abs((-y-t.translate)/t.velocity):Math.abs((y-t.translate)/t.velocity),a.freeModeSticky){var C=Math.abs((r?-y:y)-t.translate),T=t.slidesSizesGrid[t.activeIndex];b=C<T?a.speed:C<2*T?1.5*a.speed:2.5*a.speed}}else if(a.freeModeSticky)return void t.slideToClosest();a.freeModeMomentumBounce&&k?(t.updateProgress(_),t.setTransition(b),t.setTranslate(y),t.transitionStart(!0,t.swipeDirection),t.animating=!0,s.transitionEnd((function(){t&&!t.destroyed&&i.allowMomentumBounce&&(t.emit("momentumBounce"),t.setTransition(a.speed),setTimeout((function(){t.setTranslate(_),s.transitionEnd((function(){t&&!t.destroyed&&t.transitionEnd()}))}),0))}))):t.velocity?(t.updateProgress(y),t.setTransition(b),t.setTranslate(y),t.transitionStart(!0,t.swipeDirection),t.animating||(t.animating=!0,s.transitionEnd((function(){t&&!t.destroyed&&t.transitionEnd()})))):(t.emit("_freeModeNoMomentumRelease"),t.updateProgress(y)),t.updateActiveIndex(),t.updateSlidesClasses()}else{if(a.freeModeSticky)return void t.slideToClosest();a.freeMode&&t.emit("_freeModeNoMomentumRelease")}(!a.freeModeMomentum||h>=a.longSwipesMs)&&(t.updateProgress(),t.updateActiveIndex(),t.updateSlidesClasses())}else{for(var A=0,L=t.slidesSizesGrid[0],P=0;P<n.length;P+=P<a.slidesPerGroupSkip?1:a.slidesPerGroup){var E=P<a.slidesPerGroupSkip-1?1:a.slidesPerGroup;void 0!==n[P+E]?c>=n[P]&&c<n[P+E]&&(A=P,L=n[P+E]-n[P]):c>=n[P]&&(A=P,L=n[n.length-1]-n[n.length-2])}var M=(c-n[A])/L,B=A<a.slidesPerGroupSkip-1?1:a.slidesPerGroup;if(h>a.longSwipesMs){if(!a.longSwipes)return void t.slideTo(t.activeIndex);"next"===t.swipeDirection&&(M>=a.longSwipesRatio?t.slideTo(A+B):t.slideTo(A)),"prev"===t.swipeDirection&&(M>1-a.longSwipesRatio?t.slideTo(A+B):t.slideTo(A))}else{if(!a.shortSwipes)return void t.slideTo(t.activeIndex);t.navigation&&(d.target===t.navigation.nextEl||d.target===t.navigation.prevEl)?d.target===t.navigation.nextEl?t.slideTo(A+B):t.slideTo(A):("next"===t.swipeDirection&&t.slideTo(A+B),"prev"===t.swipeDirection&&t.slideTo(A))}}}}function ca(){var e=this,t=e.params,i=e.el;if(!i||0!==i.offsetWidth){t.breakpoints&&e.setBreakpoint();var a=e.allowSlideNext,o=e.allowSlidePrev,r=e.snapGrid;e.allowSlideNext=!0,e.allowSlidePrev=!0,e.updateSize(),e.updateSlides(),e.updateSlidesClasses(),("auto"===t.slidesPerView||t.slidesPerView>1)&&e.isEnd&&!e.isBeginning&&!e.params.centeredSlides?e.slideTo(e.slides.length-1,0,!1,!0):e.slideTo(e.activeIndex,0,!1,!0),e.autoplay&&e.autoplay.running&&e.autoplay.paused&&e.autoplay.run(),e.allowSlidePrev=o,e.allowSlideNext=a,e.params.watchOverflow&&r!==e.snapGrid&&e.checkOverflow()}}function pa(e){var t=this;t.enabled&&(t.allowClick||(t.params.preventClicks&&e.preventDefault(),t.params.preventClicksPropagation&&t.animating&&(e.stopPropagation(),e.stopImmediatePropagation())))}function ha(){var e=this,t=e.wrapperEl,i=e.rtlTranslate;if(e.enabled){e.previousTranslate=e.translate,e.isHorizontal()?e.translate=i?t.scrollWidth-t.offsetWidth-t.scrollLeft:-t.scrollLeft:e.translate=-t.scrollTop,-0===e.translate&&(e.translate=0),e.updateActiveIndex(),e.updateSlidesClasses();var a=e.maxTranslate()-e.minTranslate();(0===a?0:(e.translate-e.minTranslate())/a)!==e.progress&&e.updateProgress(i?-e.translate:e.translate),e.emit("setTranslate",e.translate,!1)}}var ma=!1;function va(){}var ua={attachEvents:function(){var e=this,t=ii(),i=e.params,a=e.touchEvents,o=e.el,r=e.wrapperEl,s=e.device,n=e.support;e.onTouchStart=na.bind(e),e.onTouchMove=la.bind(e),e.onTouchEnd=da.bind(e),i.cssMode&&(e.onScroll=ha.bind(e)),e.onClick=pa.bind(e);var l=!!i.nested;if(!n.touch&&n.pointerEvents)o.addEventListener(a.start,e.onTouchStart,!1),t.addEventListener(a.move,e.onTouchMove,l),t.addEventListener(a.end,e.onTouchEnd,!1);else{if(n.touch){var d=!("touchstart"!==a.start||!n.passiveListener||!i.passiveListeners)&&{passive:!0,capture:!1};o.addEventListener(a.start,e.onTouchStart,d),o.addEventListener(a.move,e.onTouchMove,n.passiveListener?{passive:!1,capture:l}:l),o.addEventListener(a.end,e.onTouchEnd,d),a.cancel&&o.addEventListener(a.cancel,e.onTouchEnd,d),ma||(t.addEventListener("touchstart",va),ma=!0)}(i.simulateTouch&&!s.ios&&!s.android||i.simulateTouch&&!n.touch&&s.ios)&&(o.addEventListener("mousedown",e.onTouchStart,!1),t.addEventListener("mousemove",e.onTouchMove,l),t.addEventListener("mouseup",e.onTouchEnd,!1))}(i.preventClicks||i.preventClicksPropagation)&&o.addEventListener("click",e.onClick,!0),i.cssMode&&r.addEventListener("scroll",e.onScroll),i.updateOnWindowResize?e.on(s.ios||s.android?"resize orientationchange observerUpdate":"resize observerUpdate",ca,!0):e.on("observerUpdate",ca,!0)},detachEvents:function(){var e=this,t=ii(),i=e.params,a=e.touchEvents,o=e.el,r=e.wrapperEl,s=e.device,n=e.support,l=!!i.nested;if(!n.touch&&n.pointerEvents)o.removeEventListener(a.start,e.onTouchStart,!1),t.removeEventListener(a.move,e.onTouchMove,l),t.removeEventListener(a.end,e.onTouchEnd,!1);else{if(n.touch){var d=!("onTouchStart"!==a.start||!n.passiveListener||!i.passiveListeners)&&{passive:!0,capture:!1};o.removeEventListener(a.start,e.onTouchStart,d),o.removeEventListener(a.move,e.onTouchMove,l),o.removeEventListener(a.end,e.onTouchEnd,d),a.cancel&&o.removeEventListener(a.cancel,e.onTouchEnd,d)}(i.simulateTouch&&!s.ios&&!s.android||i.simulateTouch&&!n.touch&&s.ios)&&(o.removeEventListener("mousedown",e.onTouchStart,!1),t.removeEventListener("mousemove",e.onTouchMove,l),t.removeEventListener("mouseup",e.onTouchEnd,!1))}(i.preventClicks||i.preventClicksPropagation)&&o.removeEventListener("click",e.onClick,!0),i.cssMode&&r.removeEventListener("scroll",e.onScroll),e.off(s.ios||s.android?"resize orientationchange observerUpdate":"resize observerUpdate",ca)}};var ga={addClasses:function(){var e,t,i,a=this,o=a.classNames,r=a.params,s=a.rtl,n=a.$el,l=a.device,d=a.support,c=(e=["initialized",r.direction,{"pointer-events":d.pointerEvents&&!d.touch},{"free-mode":r.freeMode},{autoheight:r.autoHeight},{rtl:s},{multirow:r.slidesPerColumn>1},{"multirow-column":r.slidesPerColumn>1&&"column"===r.slidesPerColumnFill},{android:l.android},{ios:l.ios},{"css-mode":r.cssMode}],t=r.containerModifierClass,i=[],e.forEach((function(e){"object"==typeof e?Object.keys(e).forEach((function(a){e[a]&&i.push(t+a)})):"string"==typeof e&&i.push(t+e)})),i);o.push.apply(o,c),n.addClass([].concat(o).join(" ")),a.emitContainerClasses()},removeClasses:function(){var e=this,t=e.$el,i=e.classNames;t.removeClass(i.join(" ")),e.emitContainerClasses()}};var ba={init:!0,direction:"horizontal",touchEventsTarget:"container",initialSlide:0,speed:300,cssMode:!1,updateOnWindowResize:!0,resizeObserver:!1,nested:!1,createElements:!1,enabled:!0,focusableElements:"input, select, option, textarea, button, video, label",width:null,height:null,preventInteractionOnTransition:!1,userAgent:null,url:null,edgeSwipeDetection:!1,edgeSwipeThreshold:20,freeMode:!1,freeModeMomentum:!0,freeModeMomentumRatio:1,freeModeMomentumBounce:!0,freeModeMomentumBounceRatio:1,freeModeMomentumVelocityRatio:1,freeModeSticky:!1,freeModeMinimumVelocity:.02,autoHeight:!1,setWrapperSize:!1,virtualTranslate:!1,effect:"slide",breakpoints:void 0,breakpointsBase:"window",spaceBetween:0,slidesPerView:1,slidesPerColumn:1,slidesPerColumnFill:"column",slidesPerGroup:1,slidesPerGroupSkip:0,centeredSlides:!1,centeredSlidesBounds:!1,slidesOffsetBefore:0,slidesOffsetAfter:0,normalizeSlideIndex:!0,centerInsufficientSlides:!1,watchOverflow:!1,roundLengths:!1,touchRatio:1,touchAngle:45,simulateTouch:!0,shortSwipes:!0,longSwipes:!0,longSwipesRatio:.5,longSwipesMs:300,followFinger:!0,allowTouchMove:!0,threshold:0,touchMoveStopPropagation:!1,touchStartPreventDefault:!0,touchStartForcePreventDefault:!1,touchReleaseOnEdges:!1,uniqueNavElements:!0,resistance:!0,resistanceRatio:.85,watchSlidesProgress:!1,watchSlidesVisibility:!1,grabCursor:!1,preventClicks:!0,preventClicksPropagation:!0,slideToClickedSlide:!1,preloadImages:!0,updateOnImagesReady:!0,loop:!1,loopAdditionalSlides:0,loopedSlides:null,loopFillGroupWithBlank:!1,loopPreventsSlide:!0,allowSlidePrev:!0,allowSlideNext:!0,swipeHandler:null,noSwiping:!0,noSwipingClass:"swiper-no-swiping",noSwipingSelector:null,passiveListeners:!0,containerModifierClass:"swiper-container-",slideClass:"swiper-slide",slideBlankClass:"swiper-slide-invisible-blank",slideActiveClass:"swiper-slide-active",slideDuplicateActiveClass:"swiper-slide-duplicate-active",slideVisibleClass:"swiper-slide-visible",slideDuplicateClass:"swiper-slide-duplicate",slideNextClass:"swiper-slide-next",slideDuplicateNextClass:"swiper-slide-duplicate-next",slidePrevClass:"swiper-slide-prev",slideDuplicatePrevClass:"swiper-slide-duplicate-prev",wrapperClass:"swiper-wrapper",runCallbacksOnInit:!0,_emitClasses:!1};function fa(e,t){for(var i=0;i<t.length;i++){var a=t[i];a.enumerable=a.enumerable||!1,a.configurable=!0,"value"in a&&(a.writable=!0),Object.defineProperty(e,a.key,a)}}var ya={modular:{useParams:function(e){var t=this;t.modules&&Object.keys(t.modules).forEach((function(i){var a=t.modules[i];a.params&&Wi(e,a.params)}))},useModules:function(e){void 0===e&&(e={});var t=this;t.modules&&Object.keys(t.modules).forEach((function(i){var a=t.modules[i],o=e[i]||{};a.on&&t.on&&Object.keys(a.on).forEach((function(e){t.on(e,a.on[e])})),a.create&&a.create.bind(t)(o)}))}},eventsEmitter:ta,update:ia,translate:aa,transition:{setTransition:function(e,t){var i=this;i.params.cssMode||i.$wrapperEl.transition(e),i.emit("setTransition",e,t)},transitionStart:function(e,t){void 0===e&&(e=!0);var i=this,a=i.activeIndex,o=i.params,r=i.previousIndex;if(!o.cssMode){o.autoHeight&&i.updateAutoHeight();var s=t;if(s||(s=a>r?"next":a<r?"prev":"reset"),i.emit("transitionStart"),e&&a!==r){if("reset"===s)return void i.emit("slideResetTransitionStart");i.emit("slideChangeTransitionStart"),"next"===s?i.emit("slideNextTransitionStart"):i.emit("slidePrevTransitionStart")}}},transitionEnd:function(e,t){void 0===e&&(e=!0);var i=this,a=i.activeIndex,o=i.previousIndex,r=i.params;if(i.animating=!1,!r.cssMode){i.setTransition(0);var s=t;if(s||(s=a>o?"next":a<o?"prev":"reset"),i.emit("transitionEnd"),e&&a!==o){if("reset"===s)return void i.emit("slideResetTransitionEnd");i.emit("slideChangeTransitionEnd"),"next"===s?i.emit("slideNextTransitionEnd"):i.emit("slidePrevTransitionEnd")}}}},slide:oa,loop:ra,grabCursor:{setGrabCursor:function(e){var t=this;if(!(t.support.touch||!t.params.simulateTouch||t.params.watchOverflow&&t.isLocked||t.params.cssMode)){var i=t.el;i.style.cursor="move",i.style.cursor=e?"-webkit-grabbing":"-webkit-grab",i.style.cursor=e?"-moz-grabbin":"-moz-grab",i.style.cursor=e?"grabbing":"grab"}},unsetGrabCursor:function(){var e=this;e.support.touch||e.params.watchOverflow&&e.isLocked||e.params.cssMode||(e.el.style.cursor="")}},manipulation:sa,events:ua,breakpoints:{setBreakpoint:function(){var e=this,t=e.activeIndex,i=e.initialized,a=e.loopedSlides,o=void 0===a?0:a,r=e.params,s=e.$el,n=r.breakpoints;if(n&&(!n||0!==Object.keys(n).length)){var l=e.getBreakpoint(n,e.params.breakpointsBase,e.el);if(l&&e.currentBreakpoint!==l){var d=l in n?n[l]:void 0;d&&["slidesPerView","spaceBetween","slidesPerGroup","slidesPerGroupSkip","slidesPerColumn"].forEach((function(e){var t=d[e];void 0!==t&&(d[e]="slidesPerView"!==e||"AUTO"!==t&&"auto"!==t?"slidesPerView"===e?parseFloat(t):parseInt(t,10):"auto")}));var c=d||e.originalParams,p=r.slidesPerColumn>1,h=c.slidesPerColumn>1,m=r.enabled;p&&!h?(s.removeClass(r.containerModifierClass+"multirow "+r.containerModifierClass+"multirow-column"),e.emitContainerClasses()):!p&&h&&(s.addClass(r.containerModifierClass+"multirow"),(c.slidesPerColumnFill&&"column"===c.slidesPerColumnFill||!c.slidesPerColumnFill&&"column"===r.slidesPerColumnFill)&&s.addClass(r.containerModifierClass+"multirow-column"),e.emitContainerClasses());var v=c.direction&&c.direction!==r.direction,u=r.loop&&(c.slidesPerView!==r.slidesPerView||v);v&&i&&e.changeDirection(),Wi(e.params,c);var g=e.params.enabled;Wi(e,{allowTouchMove:e.params.allowTouchMove,allowSlideNext:e.params.allowSlideNext,allowSlidePrev:e.params.allowSlidePrev}),m&&!g?e.disable():!m&&g&&e.enable(),e.currentBreakpoint=l,e.emit("_beforeBreakpoint",c),u&&i&&(e.loopDestroy(),e.loopCreate(),e.updateSlides(),e.slideTo(t-o+e.loopedSlides,0,!1)),e.emit("breakpoint",c)}}},getBreakpoint:function(e,t,i){if(void 0===t&&(t="window"),e&&("container"!==t||i)){var a=!1,o=ti(),r="window"===t?o.innerHeight:i.clientHeight,s=Object.keys(e).map((function(e){if("string"==typeof e&&0===e.indexOf("@")){var t=parseFloat(e.substr(1));return{value:r*t,point:e}}return{value:e,point:e}}));s.sort((function(e,t){return parseInt(e.value,10)-parseInt(t.value,10)}));for(var n=0;n<s.length;n+=1){var l=s[n],d=l.point,c=l.value;"window"===t?o.matchMedia("(min-width: "+c+"px)").matches&&(a=d):c<=i.clientWidth&&(a=d)}return a||"max"}}},checkOverflow:{checkOverflow:function(){var e=this,t=e.params,i=e.isLocked,a=e.slides.length>0&&t.slidesOffsetBefore+t.spaceBetween*(e.slides.length-1)+e.slides[0].offsetWidth*e.slides.length;t.slidesOffsetBefore&&t.slidesOffsetAfter&&a?e.isLocked=a<=e.size:e.isLocked=1===e.snapGrid.length,e.allowSlideNext=!e.isLocked,e.allowSlidePrev=!e.isLocked,i!==e.isLocked&&e.emit(e.isLocked?"lock":"unlock"),i&&i!==e.isLocked&&(e.isEnd=!1,e.navigation&&e.navigation.update())}},classes:ga,images:{loadImage:function(e,t,i,a,o,r){var s,n=ti();function l(){r&&r()}ft(e).parent("picture")[0]||e.complete&&o?l():t?((s=new n.Image).onload=l,s.onerror=l,a&&(s.sizes=a),i&&(s.srcset=i),t&&(s.src=t)):l()},preloadImages:function(){var e=this;function t(){null!=e&&e&&!e.destroyed&&(void 0!==e.imagesLoaded&&(e.imagesLoaded+=1),e.imagesLoaded===e.imagesToLoad.length&&(e.params.updateOnImagesReady&&e.update(),e.emit("imagesReady")))}e.imagesToLoad=e.$el.find("img");for(var i=0;i<e.imagesToLoad.length;i+=1){var a=e.imagesToLoad[i];e.loadImage(a,a.currentSrc||a.getAttribute("src"),a.srcset||a.getAttribute("srcset"),a.sizes||a.getAttribute("sizes"),!0,t)}}}},_a={},xa=function(){function e(){for(var t,i,a=arguments.length,o=new Array(a),r=0;r<a;r++)o[r]=arguments[r];if(1===o.length&&o[0].constructor&&"Object"===Object.prototype.toString.call(o[0]).slice(8,-1)?i=o[0]:(t=o[0],i=o[1]),i||(i={}),i=Wi({},i),t&&!i.el&&(i.el=t),i.el&&ft(i.el).length>1){var s=[];return ft(i.el).each((function(t){var a=Wi({},i,{el:t});s.push(new e(a))})),s}var n=this;n.__swiper__=!0,n.support=Yi(),n.device=Ui({userAgent:i.userAgent}),n.browser=Xi(),n.eventsListeners={},n.eventsAnyListeners=[],void 0===n.modules&&(n.modules={}),Object.keys(n.modules).forEach((function(e){var t=n.modules[e];if(t.params){var a=Object.keys(t.params)[0],o=t.params[a];if("object"!=typeof o||null===o)return;if(["navigation","pagination","scrollbar"].indexOf(a)>=0&&!0===i[a]&&(i[a]={auto:!0}),!(a in i)||!("enabled"in o))return;!0===i[a]&&(i[a]={enabled:!0}),"object"!=typeof i[a]||"enabled"in i[a]||(i[a].enabled=!0),i[a]||(i[a]={enabled:!1})}}));var l,d,c=Wi({},ba);return n.useParams(c),n.params=Wi({},c,_a,i),n.originalParams=Wi({},n.params),n.passedParams=Wi({},i),n.params&&n.params.on&&Object.keys(n.params.on).forEach((function(e){n.on(e,n.params.on[e])})),n.params&&n.params.onAny&&n.onAny(n.params.onAny),n.$=ft,Wi(n,{enabled:n.params.enabled,el:t,classNames:[],slides:ft(),slidesGrid:[],snapGrid:[],slidesSizesGrid:[],isHorizontal:function(){return"horizontal"===n.params.direction},isVertical:function(){return"vertical"===n.params.direction},activeIndex:0,realIndex:0,isBeginning:!0,isEnd:!1,translate:0,previousTranslate:0,progress:0,velocity:0,animating:!1,allowSlideNext:n.params.allowSlideNext,allowSlidePrev:n.params.allowSlidePrev,touchEvents:(l=["touchstart","touchmove","touchend","touchcancel"],d=["mousedown","mousemove","mouseup"],n.support.pointerEvents&&(d=["pointerdown","pointermove","pointerup"]),n.touchEventsTouch={start:l[0],move:l[1],end:l[2],cancel:l[3]},n.touchEventsDesktop={start:d[0],move:d[1],end:d[2]},n.support.touch||!n.params.simulateTouch?n.touchEventsTouch:n.touchEventsDesktop),touchEventsData:{isTouched:void 0,isMoved:void 0,allowTouchCallbacks:void 0,touchStartTime:void 0,isScrolling:void 0,currentTranslate:void 0,startTranslate:void 0,allowThresholdMove:void 0,focusableElements:n.params.focusableElements,lastClickTime:Gi(),clickTimeout:void 0,velocities:[],allowMomentumBounce:void 0,isTouchEvent:void 0,startMoving:void 0},allowClick:!0,allowTouchMove:n.params.allowTouchMove,touches:{startX:0,startY:0,currentX:0,currentY:0,diff:0},imagesToLoad:[],imagesLoaded:0}),n.useModules(),n.emit("_swiper"),n.params.init&&n.init(),n}var t,i,a,o=e.prototype;return o.enable=function(){var e=this;e.enabled||(e.enabled=!0,e.params.grabCursor&&e.setGrabCursor(),e.emit("enable"))},o.disable=function(){var e=this;e.enabled&&(e.enabled=!1,e.params.grabCursor&&e.unsetGrabCursor(),e.emit("disable"))},o.setProgress=function(e,t){var i=this;e=Math.min(Math.max(e,0),1);var a=i.minTranslate(),o=(i.maxTranslate()-a)*e+a;i.translateTo(o,void 0===t?0:t),i.updateActiveIndex(),i.updateSlidesClasses()},o.emitContainerClasses=function(){var e=this;if(e.params._emitClasses&&e.el){var t=e.el.className.split(" ").filter((function(t){return 0===t.indexOf("swiper-container")||0===t.indexOf(e.params.containerModifierClass)}));e.emit("_containerClasses",t.join(" "))}},o.getSlideClasses=function(e){var t=this;return e.className.split(" ").filter((function(e){return 0===e.indexOf("swiper-slide")||0===e.indexOf(t.params.slideClass)})).join(" ")},o.emitSlidesClasses=function(){var e=this;if(e.params._emitClasses&&e.el){var t=[];e.slides.each((function(i){var a=e.getSlideClasses(i);t.push({slideEl:i,classNames:a}),e.emit("_slideClass",i,a)})),e.emit("_slideClasses",t)}},o.slidesPerViewDynamic=function(){var e=this,t=e.params,i=e.slides,a=e.slidesGrid,o=e.size,r=e.activeIndex,s=1;if(t.centeredSlides){for(var n,l=i[r].swiperSlideSize,d=r+1;d<i.length;d+=1)i[d]&&!n&&(s+=1,(l+=i[d].swiperSlideSize)>o&&(n=!0));for(var c=r-1;c>=0;c-=1)i[c]&&!n&&(s+=1,(l+=i[c].swiperSlideSize)>o&&(n=!0))}else for(var p=r+1;p<i.length;p+=1)a[p]-a[r]<o&&(s+=1);return s},o.update=function(){var e=this;if(e&&!e.destroyed){var t=e.snapGrid,i=e.params;i.breakpoints&&e.setBreakpoint(),e.updateSize(),e.updateSlides(),e.updateProgress(),e.updateSlidesClasses(),e.params.freeMode?(a(),e.params.autoHeight&&e.updateAutoHeight()):(("auto"===e.params.slidesPerView||e.params.slidesPerView>1)&&e.isEnd&&!e.params.centeredSlides?e.slideTo(e.slides.length-1,0,!1,!0):e.slideTo(e.activeIndex,0,!1,!0))||a(),i.watchOverflow&&t!==e.snapGrid&&e.checkOverflow(),e.emit("update")}function a(){var t=e.rtlTranslate?-1*e.translate:e.translate,i=Math.min(Math.max(t,e.maxTranslate()),e.minTranslate());e.setTranslate(i),e.updateActiveIndex(),e.updateSlidesClasses()}},o.changeDirection=function(e,t){void 0===t&&(t=!0);var i=this,a=i.params.direction;return e||(e="horizontal"===a?"vertical":"horizontal"),e===a||"horizontal"!==e&&"vertical"!==e||(i.$el.removeClass(""+i.params.containerModifierClass+a).addClass(""+i.params.containerModifierClass+e),i.emitContainerClasses(),i.params.direction=e,i.slides.each((function(t){"vertical"===e?t.style.width="":t.style.height=""})),i.emit("changeDirection"),t&&i.update()),i},o.mount=function(e){var t=this;if(t.mounted)return!0;var i=ft(e||t.params.el);if(!(e=i[0]))return!1;e.swiper=t;var a=function(){return"."+(t.params.wrapperClass||"").trim().split(" ").join(".")},o=function(){if(e&&e.shadowRoot&&e.shadowRoot.querySelector){var t=ft(e.shadowRoot.querySelector(a()));return t.children=function(e){return i.children(e)},t}return i.children(a())}();if(0===o.length&&t.params.createElements){var r=ii().createElement("div");o=ft(r),r.className=t.params.wrapperClass,i.append(r),i.children("."+t.params.slideClass).each((function(e){o.append(e)}))}return Wi(t,{$el:i,el:e,$wrapperEl:o,wrapperEl:o[0],mounted:!0,rtl:"rtl"===e.dir.toLowerCase()||"rtl"===i.css("direction"),rtlTranslate:"horizontal"===t.params.direction&&("rtl"===e.dir.toLowerCase()||"rtl"===i.css("direction")),wrongRTL:"-webkit-box"===o.css("display")}),!0},o.init=function(e){var t=this;return t.initialized||!1===t.mount(e)||(t.emit("beforeInit"),t.params.breakpoints&&t.setBreakpoint(),t.addClasses(),t.params.loop&&t.loopCreate(),t.updateSize(),t.updateSlides(),t.params.watchOverflow&&t.checkOverflow(),t.params.grabCursor&&t.enabled&&t.setGrabCursor(),t.params.preloadImages&&t.preloadImages(),t.params.loop?t.slideTo(t.params.initialSlide+t.loopedSlides,0,t.params.runCallbacksOnInit,!1,!0):t.slideTo(t.params.initialSlide,0,t.params.runCallbacksOnInit,!1,!0),t.attachEvents(),t.initialized=!0,t.emit("init"),t.emit("afterInit")),t},o.destroy=function(e,t){void 0===e&&(e=!0),void 0===t&&(t=!0);var i,a=this,o=a.params,r=a.$el,s=a.$wrapperEl,n=a.slides;return void 0===a.params||a.destroyed||(a.emit("beforeDestroy"),a.initialized=!1,a.detachEvents(),o.loop&&a.loopDestroy(),t&&(a.removeClasses(),r.removeAttr("style"),s.removeAttr("style"),n&&n.length&&n.removeClass([o.slideVisibleClass,o.slideActiveClass,o.slideNextClass,o.slidePrevClass].join(" ")).removeAttr("style").removeAttr("data-swiper-slide-index")),a.emit("destroy"),Object.keys(a.eventsListeners).forEach((function(e){a.off(e)})),!1!==e&&(a.$el[0].swiper=null,i=a,Object.keys(i).forEach((function(e){try{i[e]=null}catch(e){}try{delete i[e]}catch(e){}}))),a.destroyed=!0),null},e.extendDefaults=function(e){Wi(_a,e)},e.installModule=function(t){e.prototype.modules||(e.prototype.modules={});var i=t.name||Object.keys(e.prototype.modules).length+"_"+Gi();e.prototype.modules[i]=t},e.use=function(t){return Array.isArray(t)?(t.forEach((function(t){return e.installModule(t)})),e):(e.installModule(t),e)},t=e,a=[{key:"extendedDefaults",get:function(){return _a}},{key:"defaults",get:function(){return ba}}],(i=null)&&fa(t.prototype,i),a&&fa(t,a),e}();Object.keys(ya).forEach((function(e){Object.keys(ya[e]).forEach((function(t){xa.prototype[t]=ya[e][t]}))})),xa.use([Zi,ea]);var ka=xa,Sa=e`[ambient^=light] {
  --bbva-carousel-swipe-bg: initial;
  --bbva-carousel-swipe-slide-bg: initial;
  --bbva-carousel-swipe-gradient-color: initial;
}
`,wa=e`[ambient^=dark] {
  --bbva-carousel-swipe-bg: var(--ambientsDark100, ${p(K.dark100)});
  --bbva-carousel-swipe-slide-bg: var(--colorsPrimaryCore, ${p(m.primaryCore)});
  --bbva-carousel-swipe-gradient-color: var(--colorsPrimaryMedium, ${p(m.primaryMedium)});
}

[ambient^=dark300] {
  --bbva-carousel-swipe-bg: var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)});
  --bbva-carousel-swipe-slide-bg: var(--colorsPrimaryCoreDarkened, ${p(m.primaryCoreDarkened)});
  --bbva-carousel-swipe-gradient-color: var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)});
}
`;const $a={dark:e`
    ${ai.dark}
    ${wa}
  `,light:e`
    ${ai.light}
    ${Sa}
  `};var Ca=e`@font-face {
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
  background: var(--bbva-carousel-swipe-bg-dark-mode-color, var(--bbva-carousel-swipe-bg, var(--ambientsLight, ${p(K.light)})));
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
  max-height: 100%;
  box-sizing: border-box;
  --_carousel-swipe-slide-bg-color: var(--bbva-carousel-swipe-slide-bg-dark-mode-color, var(--bbva-carousel-swipe-slide-bg, var(--ambientsLight, ${p(K.light)})));
  --_carousel-swipe-full-width-bg-color: var(--bbva-carousel-swipe-variant-full-width-slide-bg-dark-mode-color, var(--bbva-carousel-swipe-variant-full-width-slide-bg, transparent));
  --_carousel-swipe-full-width-slide-bg-color: var(--bbva-carousel-swipe-variant-full-screen-slide-bg-dark-mode-color, var(--bbva-carousel-swipe-variant-full-screen-slide-bg, transparent));
  --_carousel-swipe-gradient-color: var(--bbva-carousel-swipe-gradient-dark-mode-color, var(--bbva-carousel-swipe-gradient-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)})));
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
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) 0;
}

.swiper-slide {
  min-height: var(--bbva-carousel-swipe-slide-min-height, 12rem);
  background: var(--_carousel-swipe-slide-bg-color);
  box-shadow: var(--boxShadowType2, ${p(W.type2)});
  border-radius: var(--borderRadiusSmall, ${p(Y.small)});
}

:host([variant=full-width]),
:host([variant=full-screen]) {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
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
`;class Ta extends(i(u(a))){static get scopedElements(){return{"bbva-card-control":oi}}static get is(){return"bbva-carousel-swipe"}static get properties(){return{allowAdd:{type:Boolean,attribute:"allow-add"},items:{type:Array},loop:{type:Boolean,reflect:!0},selected:{type:Number},swiperConfig:{type:Object},variant:{type:String},scopedComponents:{type:Array,attribute:"scoped-components"},_sliderContainer:{type:Object},_isBottom:{type:Boolean},_ariaLive:{type:Boolean,state:!0},keepSlideOnInit:{type:Boolean,attribute:"keep-slide-on-init"}}}constructor(){super(),this.allowAdd=!1,this.items=[],this.loop=!1,this.selected=0,this.swiperConfig={},this.variant="",this._isBottom=!1,this._ariaLive=!1,this.keepSlideOnInit=!1}static get styles(){return[Ca,$a.light,$a.dark,l("bbva-carousel-swipe-shared-styles")]}firstUpdated(e){super.firstUpdated(e),this.setAttribute("role","region"),this.setAttribute("aria-roledescription","carousel"),this._sliderContainer=this.shadowRoot.querySelector(".swiper-container"),this._sliderContainer.addEventListener("scroll",(e=>{const t=e.target,i=t.scrollHeight-t.scrollTop===t.clientHeight;this._isBottom=i}))}update(e){super.update(e),e.has("scopedComponents")&&this.scopedComponents&&this.scopedComponents.forEach((e=>{this.defineScopedElement(e.tagName,e.class)}))}initializeSwiper(){this._swiper&&this._swiper.destroy(),this._swiper=new ka(this._sliderContainer,this.configSwiper()),this._swiper.on("slideChange",(()=>{this._swiper.slides[this._swiper.previousIndex].setAttribute("aria-hidden",!0),this._select(this._swiper.realIndex)})),this.selected=this._setIndex()}_setIndex(){return this.keepSlideOnInit?this.selected:0}configSwiper(){let e={loop:this.loop,initialSlide:this._setIndex()};return["full-width","full-screen"].includes(this.variant)||(e={...e,slidesPerView:1.1,centeredSlides:!0,spaceBetween:8}),{...e,...this.swiperConfig}}updated(e){super.updated(e),(e.has("loop")||e.has("items")||e.has("swiperConfig"))&&this.initializeSwiper(),e.has("_intlResources")&&this.setAttribute("aria-label",this.t("bbva-carousel-swipe-carousel-aria-label"))}changeSlide(e){this._swiper.slides[this._swiper.realIndex].setAttribute("aria-hidden",!0);const t=e.detail;this._ariaLive=!0,this.loop?this._swiper.slideToLoop(t):this._swiper.slideTo(t)}_select(e){this.selected=e,this._ariaLive=!0,this.dispatchEvent(new CustomEvent("carousel-swipe-item-select",{detail:this.selected,bubbles:!0,composed:!0}))}_tap(){this.dispatchEvent(new CustomEvent("carousel-swipe-item-tap",{detail:this.selected,bubbles:!0,composed:!0}))}render(){return d`
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
                  ${e.content instanceof le?e.content:de(e.content)}
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
    `}}S("colors.cool100"),S("colors.cool70"),S("colors.cool100"),S("colors.cool100"),S("colors.cool100"),customElements.define(Oi.is,Oi);class Aa{constructor(e){this.controller=e}get data(){var e;return(null===(e=this.controller)||void 0===e?void 0:e.data)||{}}t(...e){return this.controller.t(...e)}_dispatch(e,t=!0){this.controller._dispatch(e,t)}setData(e,t){this.controller.data={...this.data,[e]:t}}render(){return ce}}class La extends Aa{get _searchOptions(){return[{icon:pe(),label:this.t("promotions-stores-map-search-stores-button"),id:"search-button"}]}render(){var e,t,i,a,o,r,s,n,l,c,p,h,m,v,u;return d`
      <div class="main-container" ?hidden="${null===(e=this.controller)||void 0===e?void 0:e._showSpinner}">
        <div id="stores-filter" class="${null===(t=this.controller)||void 0===t?void 0:t._storesFilterClass}">
          <bbva-button-row
            ?hidden="${null===(i=this.controller)||void 0===i?void 0:i._filterSearch}"
            ambient="dark"
            disabled-tabindex
            accessibility-text="Search options"
            .options="${this._searchOptions}"
            @button-row-item-click="${()=>{var e,t;return null===(e=this.controller)||void 0===e?void 0:e._openInfoModal(null===(t=this.controller)||void 0===t?void 0:t._categoriesModalConfig)}}"
          ></bbva-button-row>
          <bbva-form-filter
            adjust-filter-tag
            .filters="${null===(a=this.controller)||void 0===a?void 0:a._filterList}"
            .editableLabel="${this.t("promotions-stores-map-form-filter-editable-label")}"
            ?hidden="${!(null!==(o=this.controller)&&void 0!==o&&o._filterSearch)}"
            ambient="dark"
            @form-filter-edit-click="${()=>{var e,t;return null===(e=this.controller)||void 0===e?void 0:e._openInfoModal(null===(t=this.controller)||void 0===t?void 0:t._categoriesModalConfig)}}"
            @form-filter-close-click="${null===(r=this.controller)||void 0===r?void 0:r._deleteFilters.bind(this.controller)}"
          >
          </bbva-form-filter>
        </div>
        ${null===(s=this.controller)||void 0===s?void 0:s._showStoresMap}
        <div class="tooltip" ?hidden="${!this.controller._showTooltip}">
          ${null===(n=this.controller)||void 0===n?void 0:n._renderTooltip(null===(l=this.controller)||void 0===l?void 0:l._tooltipInfo)}
        </div>
        <div class="carousel-tooltip" ?hidden="${!this.controller._showCarouselTooltip}">
          <div class="carousel-tooltip__container">
            <bbva-carousel-swipe
              ambient="light"
              .scopedComponents="${[{tagName:"bbva-map-tooltip",class:Oi}]}"
              .items="${null===(c=this.controller)||void 0===c?void 0:c._clusterListItems}"
            >
            </bbva-carousel-swipe>
            <bbva-link
              ambient="light"
              class="footer-link"
              @click="${null===(p=this.controller)||void 0===p?void 0:p._storesClusteredView.bind(this.controller)}"
            >
              ${this.t("promotions-stores-map-bbva-link-show-all-stores")}
            </bbva-link>
          </div>
        </div>
        <div class="view-list-panel" ?hidden="${null===(h=this.controller)||void 0===h?void 0:h._hideLinkBottom}">
          <div class="link-container">
            <bbva-link
              id="footerLink"
              class="footer-link"
              ambient="light"
              @click="${null===(m=this.controller)||void 0===m?void 0:m._footerToggleStoresView.bind(this.controller)}"
              icon=${null===(v=this.controller)||void 0===v?void 0:v._footerButtonIcon}
              ><span>${this.t(null===(u=this.controller)||void 0===u?void 0:u._footerButtonText)}</span>
            </bbva-link>
          </div>
        </div>
      </div>
    `}}class Pa extends Aa{render(){var e,t,i,a,o,r,s,n,l,c,p,h,m,v,u,g,b,f;return d`
      <bbva-map-dynamic
        ambient="light"
        ?hidden="${this.controller._showStoresList}"
        class="map"
        api-key="${null===(e=this.controller)||void 0===e?void 0:e.apiKey}"
        ?clear-pois="${null===(t=this.controller)||void 0===t?void 0:t._clearPois}"
        ?clear-selected="${null===(i=this.controller)||void 0===i?void 0:i._clearSelected}"
        with-cluster
        avoid-clickable-icons
        .pois="${null===(a=this.controller)||void 0===a?void 0:a._pois}"
        .geoLocation="${null===(o=this.controller)||void 0===o?void 0:o._geoLocation}"
        .buttonText="${null===(r=this.controller)||void 0===r?void 0:r._mapButtonKey}"
        .availableCenter="${null===(s=this.controller)||void 0===s?void 0:s._currentCenter}"
        @map-dynamic-geolocation-request="${null===(n=this.controller)||void 0===n?void 0:n._mapDynamicGeolocationRequest}"
        @map-dynamic-bounds-changed="${null===(l=this.controller)||void 0===l?void 0:l._boundsChanged}"
        @map-dynamic-center-changed="${null===(c=this.controller)||void 0===c?void 0:c._centerChanged}"
        @map-dynamic-center-map-button="${null===(p=this.controller)||void 0===p?void 0:p._locateAction}"
        @map-dynamic-zoom-changed="${null===(h=this.controller)||void 0===h?void 0:h._zoomChanged}"
        @map-dynamic-button-click="${null===(m=this.controller)||void 0===m?void 0:m._searchZone}"
        @map-dynamic-popup-click="${null===(v=this.controller)||void 0===v?void 0:v._mapDynamicPopupClick}"
        @map-dynamic-popup-tap="${null===(u=this.controller)||void 0===u?void 0:u._mapDynamicPopupClick}"
        @map-dynamic-cluster-click="${null===(g=this.controller)||void 0===g?void 0:g._mapDynamicClusterClick}"
        @map-dynamic-click="${()=>{var e;return null===(e=this.controller)||void 0===e?void 0:e._resetTooltipInfo(!0)}}"
        ?hideMeMarker="${null===(b=this.controller)||void 0===b?void 0:b._hideMeMarker}"
        ?isNative="${null===(f=this.controller)||void 0===f?void 0:f.isNative}"
      >
      </bbva-map-dynamic>
    `}}class Ea extends Aa{get _emptyInfo(){return d`
      <div class="list-movement-stores-container empty-list">
        <bbva-panel-info
          disabled-tabindex
          heading-level-title="h3"
          .microillustration="${O}"
          heading="${this.t("promotions-stores-map-stores-list-empty-heading")}"
          text="${this.t("promotions-stores-map-stores-list-empty-text")}"
        ></bbva-panel-info>
      </div>
    `}get _storesList(){var e,t;return d`
      <div class="list-movement-stores-container ${null===(e=this.controller)||void 0===e?void 0:e._storeListContainerClass}">
        ${null===(t=this.controller)||void 0===t?void 0:t._parsedStoresList.map((e=>{var t,i,a,o;return d`
              <bbva-list-movement
                ambient="light"
                class="promotion-stores-list-movement"
                card-title="${null==e?void 0:e.name}"
                description="${null==e?void 0:e.address}"
                description-ellipsis
                text="${null==e?void 0:e.distance}"
                highlight-category=""
                icon-clip="${null==e||null===(t=e.category)||void 0===t?void 0:t.icon}"
                bg-color-clip="${m.primaryMedium}"
                more-info="${c(null==e||null===(i=e.category)||void 0===i?void 0:i.name)}"
                category="${null==e||null===(a=e.promotions)||void 0===a?void 0:a.category}"
                concept="${null==e||null===(o=e.promotions)||void 0===o?void 0:o.name}"
                @list-movement-item-click="${()=>{var t;return null===(t=this.controller)||void 0===t?void 0:t._selectStore(e)}}"
              >
              </bbva-list-movement>
              <bbva-divider size="fit"></bbva-divider>
            `}))}
      </div>
    `}render(){var e,t;return d`
      <div class="main-stores-list-container" ?hidden="${!this.controller._showStoresList}">
        ${null!==(e=this.controller)&&void 0!==e&&null!==(t=e._parsedStoresList)&&void 0!==t&&t.length?this._storesList:this._emptyInfo}
      </div>
    `}}const Ma=new t;var Ba=e`[ambient^=light] {
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
${Ma.mediaRules()}`;const Ia=new t;var Da=e`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${p(m.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${p(m.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${p(m.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
}
${Ia.mediaRules()}`;const za={dark:e`
    ${I.dark}
    ${he.dark}
    ${me.dark}
    ${Da}
  `,light:e`
    ${I.light}
    ${he.light}
    ${me.light}
    ${Ba}
  `},Na=new t;var Oa=e`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${p(m.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${p(m.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${p(m.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${p(m.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${p(m.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${p(M.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${p(M.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${p(M.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${p(M.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${p(M.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${p(M.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}
${Na.mediaRules()}`;class Ra extends(v(ve(ue(D(i(u(a))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[be,N,fe,g,ye];return Ra.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Oa,za.light,za.dark,y("button:focus"),l("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return d`
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
      <dd class=${R({[`wrapper-${t}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){const t="actionLink"===e?`${e}AccessibilityText`:`${e}LinkAccessibilityText`;return d`
      <bbva-link
        class=${R({ellipsis:this[`${e}Ellipsis`]})}
        aria-label="${c(this.t(this[t]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(e)}"
      >
        <span role=${c(this.roleLink)} aria-live=${c(this.arialiveLink)}>
          ${this[e]}
        </span>
      </bbva-link>
    `}_tplNoLink(e){const t=`${e}AccessibilityText`,i=`${e}TagText`,a=`${e}RoleText`,o=`${e}AriaLiveText`;return d`
      <bbva-text
        aria-label="${this.t(this[t])}"
        role="${c(this[a])}"
        aria-live="${c(this[o])}"
        class="${e}"
        unset
        size="S"
        text="${this[e]}"
        tag="${c(this[i])}"
      >
      </bbva-text>
    `}_tplText(e){return d` ${this[`${e}Link`]?this._tplLink(e):this._tplNoLink(e)} `}_iconClick(e){this.dispatchEvent(new CustomEvent(`list-simple-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(e){const t=e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return d`
      <dl>
        <dt class=${R({ellipsis:this.labelEllipsis})}>
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
    `}}S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.cool60"),S("colors.primaryCoreLightened"),S("colors.primarySubdued"),S("colors.primaryMediumLight"),S("colors.primarySubdued"),S("colors.primaryMediumLight"),S("colors.cool50");const Va=new t;var Fa=e`:host {
  --_text-color: var(--bbva-list-category-text-dark-mode-color, var(--bbva-list-category-text-color,var(--colorsSecondary600, ${p(m.secondary600)})));
  --_title-color: var(--bbva-list-category-title-dark-mode-color, var(--bbva-list-category-title-color,var(--colorsSecondary500, ${p(m.secondary500)})));
  --_action-icon-color: var(--bbva-list-category-action-icon-dark-mode-color, var(--bbva-list-category-action-icon-color,var(--colorsPrimaryMedium, ${p(m.primaryMedium)})));
  --_list-category-icon-color: var(--bbva-list-category-icon-dark-mode-color, var(--bbva-list-category-icon-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_list-category-bg-active-color: var(--bbva-list-category-bg-active-dark-mode-color, var(--bbva-list-category-bg-active-color, var(--colorsSecondary100, ${p(m.secondary100)})));
  --_list-category-action-icon-active-color: var(--bbva-list-category-action-icon-active-dark-mode-color, var(--bbva-list-category-action-icon-active-color, var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)})));
  --skeleton-quote-color: var(--bbva-list-category-skeleton-dark-mode-color, var(--bbva-list-category-skeleton-color, var(--colorsSecondary200, ${p(m.secondary200)})));
  --skeleton-quote-bg: var(--bbva-list-category-skeleton-bg-dark-mode-color, var(--bbva-list-category-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  font-size: var(--typographyTypeSmall, ${p(h.typeSmall)});
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.label {
  display: flex;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  overflow: hidden;
}

:host([center]) [data-tag-name=bbva-core-heading],
:host([center]) [data-tag-name=bbva-text] {
  text-align: center;
  margin-right: 0;
}
:host([center]) .label {
  margin: 0 auto calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}

.content {
  display: flex;
  justify-content: space-between;
}

.action-icon {
  color: var(--_action-icon-color);
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}

:host([long-amount]) .content {
  flex-direction: column;
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  height: 5.171875rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((20% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 16px 20px, 16px 48px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

:host(:not([no-link]):active) {
  background-color: var(--_list-category-bg-active-color);
}
:host(:not([no-link]):active) .action-icon {
  color: var(--_list-category-action-icon-active-color);
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.wrapper {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}
.wrapper.link {
  background-color: transparent;
  border: none;
  font-size: var(--typographyTypeSmall, ${p(h.typeSmall)});
  font-weight: var(--fontFacePrimaryBook, ${p(M.book)});
  color: var(--_text-color);
}

.container {
  flex: 1;
  width: 100%;
  min-width: 0;
}

.info-icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  color: var(--_category-color, --_list-category-icon-color);
}

.amount {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  color: var(--_text-color);
}

[data-tag-name=bbva-core-heading] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  color: var(--_title-color);
  text-align: left;
}

[data-tag-name=bbva-text] {
  overflow: hidden;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-text].text {
  color: var(--_text-color);
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
${Va.mediaRules()}`;const Ha=new t;var qa=e`[ambient^=dark] {
  --bbva-list-category-text-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-list-category-title-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-list-category-action-icon-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-list-category-bg-active-color: var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)});
  --bbva-list-category-action-icon-active-color: var(--colorsPrimarySubduedLight, ${p(m.primarySubduedLight)});
  --bbva-list-category-skeleton-color: var(--colorsPrimaryMedium, ${p(m.primaryMedium)});
}
${Ha.mediaRules()}`;const Ga=new t;var ja=e`[ambient^=light] {
  --bbva-list-category-text-color: initial;
  --bbva-list-category-title-color: initial;
  --bbva-list-category-action-icon-color: initial;
  --bbva-list-category-bg-active-color: initial;
  --bbva-list-category-action-icon-active-color: initial;
  --bbva-list-category-skeleton-color: initial;
}
${Ga.mediaRules()}`;const Ka=(e,t=null)=>{const i="color"!==e||t?(e,t)=>`--bbva-list-category-${e}-icon-color: ${t}; \n`:(e,t)=>`:host([category='${e}']){\n    --_category-color: var(--bbva-list-category-${e}-icon-color,${t});\n  }\n`;return Object.entries(ke).reduce(((a,[o,r])=>a+i(o,t||r[e])),"")},Wa={dark:e`
    ${he.dark}
    ${qa}
    ${p(`[ambient ^= dark]{${Ka("colorContrast")}}`)}
  `,light:e`
    ${he.light}
    ${ja}
    ${p(`[ambient ^= light]{${Ka("color","initial")}}`)}
  `};class Ya extends(D(i(Se(v(u(a)))))){static get is(){return"bbva-list-category"}static get scopedElements(){const e=[be,z,ye,g];return Ya.scopedElementsFromClasses(e)}static get properties(){return{noLink:{type:Boolean,attribute:"no-link"},heading:{type:String},headingLevel:{type:Number,attribute:"heading-level"},category:{type:String},customCategories:{type:Object,attribute:"custom-categories"},actionIcon:{type:String,attribute:"action-icon"},itemText:{type:String,attribute:"item-text"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},amount:{type:Number},textLines:{type:Number,attribute:"text-lines"},noHeading:{type:Boolean,attribute:"no-heading"},center:{type:Boolean},loading:{type:Boolean,reflect:!0},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"}}}constructor(){super(),this.category="",this.itemText="",this.iconSize=24,this.listTitle="bbva-list-category-title",this.noHeading=!1,this.center=!1,this.loading=!1,this.decimalsHidden=!1}static get styles(){return[super.styles,Fa,e`
        ${p(Ka("color"))}
      `,y(".link:focus"),l("bbva-list-category-shared-styles"),Wa.dark,Wa.light]}get _categories(){return this.customCategories||ke}get _heading(){return this.heading||this._categories[this.category]&&this._categories[this.category].locale}get _icon(){return this.icon||this._categories[this.category]&&this._categories[this.category].icon&&we[this._categories[this.category].icon]()}get _iconColor(){let e=null;var t,i;this.customCategories?e=`color: ${this._categories[this.category]&&(null===(t=this._categories[this.category])||void 0===t?void 0:t.color)}`:e=`--_list-category-icon-color: ${this._categories[this.category]&&(null===(i=this._categories[this.category])||void 0===i?void 0:i.color)}`;return e}get _tmplText(){return d`
      <bbva-text
        class="text"
        ?ellipsis="${!!this.textLines}"
        .lines="${this.textLines}"
        unset
        size="S"
        .text="${this.itemText}"
      ></bbva-text>
    `}static _tmplIcon({className:e,size:t,icon:i,style:a}){return d`
      <bbva-core-icon
        class="${e}"
        aria-hidden="true"
        .icon="${i}"
        .size="${t}"
        style="${c(a)}"
      >
      </bbva-core-icon>
    `}get _label(){return d`
      <div class="label">
        ${this.category&&Ya._tmplIcon({className:"info-icon",icon:this._icon,size:this.iconSize,style:this._iconColor})||ce}
        ${this._tmplText}
      </div>
    `}_tmplHeading({heading:e,level:t}){return d` <bbva-core-heading level="${t}"> ${this.t(e)} </bbva-core-heading> `}render(){return d`
      <div
        role="${c(this.noLink?void 0:"button")}"
        tabindex="${c(this.noLink?void 0:"0")}"
        @click=${e=>this._actionClick(e)}
        @keydown=${e=>13===e.keyCode&&this._actionClick(e)}
        class="wrapper ${R({link:!this.noLink})}"
      >
        <div class="container">
          ${!this.noHeading&&this.category&&this._tmplHeading({level:c(this.headingLevel),heading:this._heading})||ce}
          <div class="content ${R({long:this.longAmount})}">
            ${this._label}
            ${this.amount&&!this.center&&d` <bbva-amount
                class="amount"
                variant="l"
                ?decimals-hidden="${this.decimalsHidden}"
                .localCurrency="${this.localCurrency}"
                .amount="${this.amount}"
                .currencyCode="${this.currencyCode}"
                .language="${this.language}"
              >
              </bbva-amount>`||ce}
          </div>
        </div>
        ${!this.noLink&&Ya._tmplIcon({className:"action-icon",icon:this.actionIcon,size:this.iconSize})||ce}
      </div>
    `}_actionClick(){this.noLink||this.disabled||this.dispatchEvent(new CustomEvent("list-category-button-click",{detail:!0,bubbles:!0,composed:!0}))}}S("colors.primaryCoreLightened"),S("colors.cool20"),S("colors.primarySubdued"),S("colors.primarySubdued"),S("colors.cool60"),S("colors.primaryMediumLight"),S("colors.cool50");class Ua extends Aa{render(){var e,t,i,a,o;return d`
      <div slot="slot-content">
        <div class="content-wrapper" ambient="light">
          <bbva-panel-info
            heading-level-title="h3"
            disabled-tabindex
            .microillustration="${null===(e=this.data)||void 0===e?void 0:e.microillustration}"
            heading="${this.t((null===(t=this.data)||void 0===t?void 0:t.panelHeadingKey)||"")}"
            text="${this.t((null===(i=this.data)||void 0===i?void 0:i.panelTextKey)||"")}"
            link-text="${this.t((null===(a=this.data)||void 0===a?void 0:a.linkPanelTextKey)||"")}"
            @panel-info-link-click="${null===(o=this.data)||void 0===o?void 0:o.panelLinkClick}"
          >
          </bbva-panel-info>
        </div>
      </div>
    `}}class Xa extends Aa{get _messages(){var e,t,i;return null===(e=this.data)||void 0===e||null===(t=e.messageGroup)||void 0===t||null===(i=t.reduce)||void 0===i?void 0:i.call(t,((e,t)=>{const i=[...e];return i.push(d`
          <bbva-text alignment="center" text="${this.t(t)}" size="S"></bbva-text>
        `),i}),[])}render(){var e;return d`
      <div slot="slot-content">
        <div class="content-wrapper" ambient="light">
          <bbva-panel-info disabled-tabindex .microillustration="${null===(e=this.data)||void 0===e?void 0:e.microillustration}">
            <div>
              ${this._messages}
            </div>
          </bbva-panel-info>
        </div>
      </div>
    `}}class Za extends Aa{static sortCategoriesByName(e,t){let i;return i=e.name>t.name?1:e.name<t.name?-1:0,i}static _renderListCategory(e){return d`
      <li class="categories-list__category">
        <bbva-icon size="24" icon="${null==e?void 0:e.icon}" aria-disabled="true"></bbva-icon>
        <bbva-text class="text" unset size="S" .text="${null==e?void 0:e.name}"> </bbva-text>
      </li>
    `}get _sortCategories(){var e,t;return null===(e=this.controller)||void 0===e||null===(t=e.serviceResponse)||void 0===t?void 0:t.sort(Za.sortCategoriesByName)}get _renderListCategories(){return d`
      <ul class="categories-list">
        ${this._sortCategories.map(Za._renderListCategory)}
      </ul>
    `}render(){return d`
      <div slot="slot-content">
        <div class="content-wrapper" ambient="light">
          <bbva-header-category
            heading-level="2"
            text="${this.t("promotions-stores-map-modal-map-legend-header-category")}"
          ></bbva-header-category>
          ${this._renderListCategories}
        </div>
      </div>
    `}}class Qa extends Aa{init(){var e,t;this.setData("storedCategoriesEdited",null===(e=this.data)||void 0===e?void 0:e.storedCategories),this.setData("searchNameEdited",null===(t=this.data)||void 0===t?void 0:t.searchName),this.setData("footerButtonClick",(()=>{var e;this._setSavedValues(),null===(e=this.data)||void 0===e||e.searchWithFilters(this.data)})),this.setData("footerLinkClick",(()=>{this._resetFilters()})),this._checkFilterButton()}_setSavedValues(){var e,t;this.setData("storedCategories",null===(e=this.data)||void 0===e?void 0:e.storedCategoriesEdited),this.setData("searchName",null===(t=this.data)||void 0===t?void 0:t.searchNameEdited)}_composeCheckbox(e){var t,i;const a=!!(null===(t=this.data)||void 0===t||null===(i=t.storedCategoriesEdited)||void 0===i?void 0:i.find((t=>t.id===e.id)));return d`
      <li class="categories-list__item">
        <bbva-form-checkbox
          id="${null==e?void 0:e.id}"
          name="${null==e?void 0:e.name}"
          value="${null==e?void 0:e.name}"
          optional-label="${null==e?void 0:e.name}"
          ?checked="${a}"
          @change=${e=>this._storeSelectedCategories(e)}
        ></bbva-form-checkbox>
        <bbva-icon size="24" icon="${null==e?void 0:e.icon}" aria-disabled="true"></bbva-icon>
      </li>
    `}_renderCategories(){var e,t;const i=null===(e=this.controller)||void 0===e||null===(t=e.serviceResponse)||void 0===t?void 0:t.map((e=>this._composeCheckbox(e)));return this.data.shouldShowAllCategories?i:null==i?void 0:i.slice(0,5)}_renderSearchName(){var e,t,i,a,o,r,s,n,l;return d`
      <bbva-form-input
        type="text"
        label="${this.t(null===(e=this.data)||void 0===e||null===(t=e.filterModalTexts)||void 0===t?void 0:t.inputLabel)}"
        info-message="${null!==(i=this.data)&&void 0!==i&&i.searchNameError?"":this.t(null===(a=this.data)||void 0===a||null===(o=a.filterModalTexts)||void 0===o?void 0:o.infoMessage)}"
        optional-label=""
        auto-validate
        pattern="${null===(r=this.data)||void 0===r?void 0:r.filterModalValidationPattern}"
        error-message="${this.t(null===(s=this.data)||void 0===s||null===(n=s.filterModalTexts)||void 0===n?void 0:n.errorMessage)}"
        @form-input-value-change=${e=>{var t;return this._checkInputValue(null==e||null===(t=e.detail)||void 0===t?void 0:t.value)}}
        .value="${null===(l=this.data)||void 0===l?void 0:l.searchNameEdited}"
      ></bbva-form-input>
    `}_linkExpandableClick(e){this.setData("shouldShowAllCategories",e.detail)}_storeSelectedCategories(e){var t,i,a,o,r,s,n;const l=null==e?void 0:e.currentTarget,d=null===(t=this.data)||void 0===t||null===(i=t.storedCategoriesEdited)||void 0===i||null===(a=i.find)||void 0===a?void 0:a.call(i,(e=>(null==e?void 0:e.id)===l.id)),c={name:null==l?void 0:l.name,removable:!0,id:null==l?void 0:l.id};this.setData("storedCategoriesEdited",null!=l&&l.checked?null===(o=this.data)||void 0===o||null===(r=o.storedCategoriesEdited)||void 0===r?void 0:r.concat(d?[]:c):null===(s=this.data)||void 0===s||null===(n=s.storedCategoriesEdited)||void 0===n?void 0:n.filter((e=>e.id!==l.id))),this._checkFilterButton()}_checkInputValue(e){var t;const i=null==e?void 0:e.match(null===(t=this.data)||void 0===t?void 0:t.filterModalValidationPattern);this.setData("searchNameEdited",e),this.setData("searchNameError",e&&!i),this._checkFilterButton()}_checkFilterButton(){var e,t,i,a,o;this.setData("disabledButton",(null===(e=this.data)||void 0===e?void 0:e.searchNameError)||!(null!==(t=this.data)&&void 0!==t&&null!==(i=t.storedCategoriesEdited)&&void 0!==i&&i.length)&&!(null!==(a=this.data)&&void 0!==a&&null!==(o=a.searchNameEdited)&&void 0!==o&&o.length))}_resetFilters(){this.setData("storedCategoriesEdited",[]),this.setData("searchNameEdited",""),this._checkFilterButton()}render(){var e,t,i,a,o,r,s,n,l,c,p,h;return d`
      <div slot="slot-content">
        <div class="content-wrapper" ambient="light">
          <bbva-header-category
            heading-level="2"
            text="${this.t(null===(e=this.data)||void 0===e||null===(t=e.filterModalTexts)||void 0===t?void 0:t.inputCategory)}"
          ></bbva-header-category>
          ${this._renderSearchName()}
          <bbva-header-category
            heading-level="2"
            text="${this.t(null===(i=this.data)||void 0===i||null===(a=i.filterModalTexts)||void 0===a?void 0:a.listCategory)}"
          ></bbva-header-category>
          <bbva-text text="${this.t(null===(o=this.data)||void 0===o||null===(r=o.filterModalTexts)||void 0===r?void 0:r.text)}" size="S"></bbva-text>
          <ul class="categories-list">
            ${this._renderCategories()}
          </ul>
          <bbva-expandable-panel
            see-less="${this.t(null===(s=this.data)||void 0===s||null===(n=s.filterModalTexts)||void 0===n?void 0:n.seeLees)}"
            see-more="${`${this.t(null===(l=this.data)||void 0===l||null===(c=l.filterModalTexts)||void 0===c?void 0:c.seeMore)} (${null===(p=this.controller)||void 0===p||null===(h=p.serviceResponse)||void 0===h?void 0:h.length})`}"
            ?expanded=${this.data.shouldShowAllCategories}
            disabled-tabindex
            @expandable-panel-expand="${e=>this._linkExpandableClick(e)}"
          ></bbva-expandable-panel>
        </div>
      </div>
    `}}const Ja=["iOS","iPhone"],eo=e=>({categories:{mode:"categories",className:"filter-categories",categoryErrorModal:"categories-error",headerRightPrimaryClick:e.manageBackNavigation.bind(e),fullHeight:!0,headerType:"modal",headerTextKey:!0,iconRightPrimary:$e(),accessibilityTextIconRightPrimary:"promotions-stores-map-filter-categories-accessibility-text-icon-right-primary",buttonKey:!0,linkKey:!0,searchWithFilters:e._searchWithFilters.bind(e),shouldShowAllCategories:!1,storedCategoriesEdited:[],searchNameEdited:"",storedCategories:[],searchName:"",disabledButton:!0,closeModalElements:["footer-button","header-right-primary"],searchNameError:!1,filterModalTexts:{errorMessage:"promotions-stores-map-modal-categories-error-message",infoMessage:"promotions-stores-map-modal-categories-info-message",inputCategory:"promotions-stores-map-modal-categories-input-category",inputLabel:"promotions-stores-map-modal-categories-input-label",listCategory:"promotions-stores-map-modal-categories-list-category",seeMore:"promotions-stores-map-modal-categories-see-more",seeLees:"promotions-stores-map-modal-categories-see-lees",text:"promotions-stores-map-modal-categories-text"},filterModalValidationPattern:"^[A-Za-zÀ-ÿ0-9_ ]+$"},storesClustered:{mode:"storesClustered",isPage:!0,headerTextKey:!0,promotionIcons:e._promotionIcons,selectStore:e._selectStore.bind(e)},storeDetail:{mode:"storeDetail",isPage:!0,headerTextKey:!0,formattedDistanceKey:"promotions-stores-map-distance",addressKey:"promotions-stores-map-store-detail-address",getPromotions:e._getPromotions.bind(e),actionOptions:e._actionOptions.bind(e),basicCallToBank:e._basicCallToBank.bind(e),storeButtonAction:e._storeButtonAction.bind(e),openLinkModal:e._openLinkModal.bind(e),getFormattedDate:e._getFormattedDate.bind(e),getCurrentLanguage:e._getCurrentLanguage.bind(e),promotionIcons:e._promotionIcons,showAllPromotions:e._showAllPromotions.bind(e),accessibilityTextIconLeftPrimary:"promotions-stores-map-store-detail-accessibility-text-icon-left-primary",callCenterButtonHide:e.callCenterButtonHide},promotionList:{mode:"promotionList",isPage:!0,headerTextKey:!0,getFormattedDate:e._getFormattedDate.bind(e),promotionIcons:e._promotionIcons,openLinkModal:e._openLinkModal.bind(e),accessibilityTextIconLeftPrimary:"promotions-stores-map-promotion-list-accessibility-text-icon-left-primary"},mapLegend:{mode:"mapLegend",className:"map-legend",categoryErrorModal:"categories-error-map-legend",headerRightPrimaryClick:e.manageBackNavigation.bind(e),fullHeight:!0,headerType:"modal",headerTextKey:"promotions-stores-map-modal-map-legend-header",iconRightPrimary:$e(),accessibilityTextIconRightPrimary:"promotions-stores-map-map-legend-accessibility-text-icon-right-primary"},leaveModal:{fullHeight:!1,mode:"leaveModal",modalType:"info",titleIcon:"bbva:info",bodyKey:!0,buttonKey:!0,linkKey:!0,className:"middle-modal",veilClick:e.manageBackNavigation.bind(e),footerButtonClick:e._openLink.bind(e),footerLinkClick:e.manageBackNavigation.bind(e)},errors:{location:{mode:"location",buttonKey:!0,footerButtonClick:e._goToSettings.bind(e,"application_settings"),footerLinkClick:e.manageBackNavigation.bind(e),headerRightPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconRightPrimary:"promotions-stores-map-location-error-accessibility-text-icon-right-primary",fullHeight:!0,headerType:"modal",headerTextKey:!0,linkKey:!0,iOSFixed:!0,messageGroup:["promotions-stores-map-modal-location-text-1","promotions-stores-map-modal-location-text-2"],microillustration:Ce,iconRightPrimary:$e()},"location-disabled":{mode:"location",buttonKey:!0,footerButtonClick:e._goToSettings.bind(e,"location_source"),footerLinkClick:e.manageBackNavigation.bind(e),headerRightPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconRightPrimary:"promotions-stores-map-location-error-accessibility-text-icon-right-primary",fullHeight:!0,headerType:"modal",headerTextKey:!0,linkKey:!0,iOSFixed:!0,messageGroup:["promotions-stores-map-modal-location-disabled-text"],microillustration:Ce,iconRightPrimary:$e()},stores:{mode:"error",iconLeftPrimary:A(),headerLeftPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconLeftPrimary:"promotions-stores-map-stores-error-accessibility-text-icon-right-primary",footerButtonClick:e._getStores.bind(e),footerLinkClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,linkKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:!0,microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"categories-error":{mode:"error",iconRightPrimary:$e(),headerRightPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconRightPrimary:"promotions-stores-map-categories-error-accessibility-text-icon-right-primary",footerButtonClick:e._getCategories.bind(e),footerLinkClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,linkKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:!0,microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"categories-error-map-legend":{mode:"error",iconRightPrimary:$e(),headerRightPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconRightPrimary:"promotions-stores-map-categories-error-accessibility-text-icon-right-primary",footerButtonClick:e._getCategories.bind(e),footerLinkClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,linkKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:"promotions-stores-map-modal-error-map-legend-header",microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"call-bank-stores":{mode:"error",iconLeftPrimary:A(),headerLeftPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconLeftPrimary:"promotions-stores-map-stores-error-accessibility-text-icon-right-primary",footerButtonClick:e._callToBank.bind(e),footerLinkClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,linkKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:!0,microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"reach-maximum-attempts-stores":{mode:"error",iconLeftPrimary:A(),headerLeftPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconLeftPrimary:"promotions-stores-map-stores-error-accessibility-text-icon-right-primary",footerButtonClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:!0,microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"call-bank-categories-error":{mode:"error",iconRightPrimary:$e(),headerRightPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconRightPrimary:"promotions-stores-map-categories-error-accessibility-text-icon-right-primary",footerButtonClick:e._callToBank.bind(e),footerLinkClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,linkKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:!0,microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"reach-maximum-attempts-categories-error":{mode:"error",iconRightPrimary:$e(),headerRightPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconRightPrimary:"promotions-stores-map-categories-error-accessibility-text-icon-right-primary",footerButtonClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:!0,microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"call-bank-categories-error-map-legend":{mode:"error",iconRightPrimary:$e(),headerRightPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconRightPrimary:"promotions-stores-map-categories-error-accessibility-text-icon-right-primary",footerButtonClick:e._callToBank.bind(e),footerLinkClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,linkKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:"promotions-stores-map-modal-error-map-legend-header",microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"reach-maximum-attempts-categories-error-map-legend":{mode:"error",iconRightPrimary:$e(),headerRightPrimaryClick:e.manageBackNavigation.bind(e),accessibilityTextIconRightPrimary:"promotions-stores-map-categories-error-accessibility-text-icon-right-primary",footerButtonClick:e.manageBackNavigation.bind(e),className:"dark-header",iOSFixed:!0,buttonKey:!0,bodyKey:!0,fullHeight:!0,headerTextKey:"promotions-stores-map-modal-error-map-legend-header",microillustration:Te,panelHeadingKey:!0,panelTextKey:!0},"empty-stores":{fullHeight:!1,mode:"error",modalType:"info",titleIcon:"bbva:info",titleKey:!0,bodyKey:!0,buttonKey:!0,className:"middle-modal",iOSFixed:!1,footerButtonClick:e.manageBackNavigation.bind(e),veilClick:e.manageBackNavigation.bind(e)},"empty-filtered-stores":{fullHeight:!1,mode:"error",modalType:"info",titleIcon:"bbva:info",titleKey:!0,bodyKey:!0,buttonKey:!0,className:"middle-modal",iOSFixed:!1,footerButtonClick:e.manageBackNavigation.bind(e),veilClick:e.manageBackNavigation.bind(e)}}}),to=/\(([^)]+)\)/,io={default:"bbvaStorageroom"};function ao(e){var t,i;return null==e||null===(t=e.images)||void 0===t||null===(i=t.find((e=>"LIST"===e.id)))||void 0===i?void 0:i.url}function oo(e){return e.replace(/([A-Z])/g," $1").split(" ").join("-").toLowerCase()}function ro(e){const t=(null==e?void 0:e.length)||0;var i;return t?"".concat(t," ",null==e||null===(i=e.lengthType)||void 0===i?void 0:i.name):""}function so(e){return(e||"").normalize("NFD").replace(/[\u0300-\u0302]|[\u0304-\u036f]|[^a-zA-Z0-9\s\-\u0303]/g,"").toLowerCase()}function no(e,t){var i,a,o,r;return("STORES"===t?null==e||null===(i=e.categories)||void 0===i||null===(a=i[0])||void 0===a||null===(o=a.image)||void 0===o?void 0:o.name:null==e||null===(r=e.image)||void 0===r?void 0:r.name)||io.default}function lo(e,t){const i=no(e,t);return we[i]?we[i]():we[io.default]()}function co(e){return null==e?void 0:e.map((e=>({id:null==e?void 0:e.id,name:null==e?void 0:e.name,icon:lo(e,"CATEGORIES"),rawIcon:no(e)})))}function po(e,t,i="promotions-stores-map-modal"){return Object.keys(e).reduce(((a,o)=>{var r;const s={...a},n=e[o],l=oo(o),d=oo(t),c=(null==l||null===(r=l.endsWith)||void 0===r?void 0:r.call(l,"key"))&&!0===n;return s[o]=c?`${i}-${d}-${l}`:n,s}),{})}class ho extends Aa{get _store(){var e;return null===(e=this.data)||void 0===e?void 0:e.store}get _storeRating(){var e;return null===(e=this._store)||void 0===e?void 0:e.storeRating}get _storeURL(){var e;return null===(e=this._store)||void 0===e?void 0:e.storeURL}get _openingHours(){var e;return null===(e=this._store)||void 0===e?void 0:e.openingHours}get _hasDefaultCenter(){var e;return null===(e=this.data)||void 0===e?void 0:e.hasDefaultCenter}get _parsedCategories(){var e;return null===(e=this._store)||void 0===e?void 0:e.parsedCategories}get _promotions(){var e;return null===(e=this.data)||void 0===e?void 0:e.promotions}get _errorPromotions(){var e,t;return!(null===(e=this.data)||void 0===e||null===(t=e.promotionsError)||void 0===t||!t.value)}get _reachMaximumAttemptsPromotions(){var e,t;return!(null===(e=this.data)||void 0===e||null===(t=e.promotionsError)||void 0===t||!t.reachMaximumAttempts)}get _emptyPromotions(){var e;return!(this._loadingPromotions||null!==(e=this._promotions)&&void 0!==e&&e.length||this._errorPromotions)}get _hasPromotions(){var e;return(null===(e=this._promotions)||void 0===e?void 0:e.length)>1}get _loadingPromotions(){return null===this._promotions&&!this._errorPromotions}get _listItems(){var e;return null===(e=this._promotions||[])||void 0===e?void 0:e.reduce(((e,t)=>{var i,a,o,r,s,n,l,p,h,m,v,u,g;const b=null==t?void 0:t.promotionType,f=null==b?void 0:b.id,y=(null==b?void 0:b.name)||(null==t?void 0:t.benefit),_=(null==t||null===(i=t.descriptions)||void 0===i||null===(a=i.find)||void 0===a||null===(o=a.call(i,(e=>"SUMMARY"===e.id)))||void 0===o?void 0:o.value)||"",x=(null===(r=this.data)||void 0===r||null===(s=r.promotionIcons)||void 0===s?void 0:s[f])||(null===(n=this.data)||void 0===n||null===(l=n.promotionIcons)||void 0===l?void 0:l.DEFAULT),k=null==x?void 0:x.icon,S=null==x?void 0:x.class,w=null==x?void 0:x.category,$=null===(p=this.data)||void 0===p?void 0:p.getFormattedDate(null==t?void 0:t.endDate),C=this.t("promotions-stores-map-promotion-end-date",{formattedDate:$}),T=$?[C]:[],A=ao(t),L=A?this.t("promotions-stores-map-promotion-img-alt-accessibility-text",{promotionName:null==t?void 0:t.name}):void 0,P=this._parsedCategoriesBadges(t);return e.push({content:d`
          <bbva-card-article
            image=${c(A)}
            image-accesibility-text=${c(L)}
            content-title="${null==t?void 0:t.name}"
            data-tag-name="bbva-card-article"
            badge-type="neutral"
            .principalCategoryIcon="${k}"
            class="${S}"
            .principalCategoryText="${y}"
            .principalCategory="${w}"
            .categoryIcon="${null==P||null===(h=P[0])||void 0===h?void 0:h.categoryIcon}"
            .categoryText="${null==P||null===(m=P[0])||void 0===m?void 0:m.categoryText}"
            .secondaryCategoryIcon="${null==P||null===(v=P[1])||void 0===v?void 0:v.categoryIcon}"
            .secondaryCategoryText="${null==P||null===(u=P[1])||void 0===u?void 0:u.categoryText}"
            language="${null===(g=this.data)||void 0===g?void 0:g.getCurrentLanguage()}"
            .description="${_}"
            description-medium
            fixed
            .tags=${T}
          >
          </bbva-card-article>
        `}),e}),[])}get _formattedDistance(){var e,t,i,a,o,r,s;const n=`${null===(e=this._store)||void 0===e||null===(t=e.distance)||void 0===t?void 0:t.length} ${null===(i=this._store)||void 0===i||null===(a=i.distance)||void 0===a||null===(o=a.lengthType)||void 0===o?void 0:o.name}`;return void 0!==(null===(r=this._store)||void 0===r?void 0:r.distance)?this.t(null===(s=this.data)||void 0===s?void 0:s.formattedDistanceKey,{formatDistance:n}):""}get _distanceSection(){var e;return null!==(e=this._store)&&void 0!==e&&e.distance&&!this._hasDefaultCenter?d`
          <bbva-text
            text-color="secondary500"
            alignment="center"
            text="${this._formattedDistance}"
            tag="span"
            size="S"
          >
          </bbva-text>
        `:ce}static _emptyList(){return d`
      <div class="store-detail-container__list__empty_list">
        <bbva-panel-info
          ambient="light"
          .microillustration="${O}"
          hide-padding-bottom
          disabled-tabindex
          is-nested
        >
          <bbva-text
            alignment="center"
            text="promotions-stores-map-store-detail-list-empty-title"
            size="L"
            font-weight="500"
            tag="h2"
            unset
          >
          </bbva-text>
          <bbva-text
            text="promotions-stores-map-store-detail-list-empty-message"
            size="S"
            alignment="center"
            tag="p"
          >
          </bbva-text>
        </bbva-panel-info>
      </div>
    `}get _topInfoSection(){var e,t,i,a;return d`
      <div class="store-detail-container__top-info">
        <bbva-text
          font-weight="500"
          alignment="center"
          text="${null===(e=this._store)||void 0===e?void 0:e.name}"
          tag="h2"
          size="M"
          unset
          class="top-text"
        >
        </bbva-text>
        ${this._distanceSection}
        <bbva-divider size="small center" class="top-divider"></bbva-divider>
        <bbva-list-simple
          variant="stacked-center"
          label="${this.t(null===(t=this.data)||void 0===t?void 0:t.addressKey)}"
          class="bellow-divider-section"
          description="${null===(i=this._store)||void 0===i||null===(a=i.location)||void 0===a?void 0:a.formattedAddress}"
          description-medium
          hide-padding-top
          hide-padding-bottom
        >
        </bbva-list-simple>
      </div>
    `}static renderSkeletonGroup(){return d`
      <div class="item-skeleton small-linear"></div>
      <div class="item-skeleton huge"></div>
      <div class="item-skeleton bottom"></div>
    `}get _carouselContent(){return d`
      <bbva-carousel-swipe
        ambient="light"
        .scopedComponents="${[{tagName:"bbva-card-article",class:si}]}"
        .items="${this._listItems}"
        @carousel-swipe-item-tap="${e=>{var t,i,a;const o=this._promotions[e.detail];null===(t=this.data)||void 0===t||t.openLinkModal(null==o?void 0:o.promotionUrl,null==o||null===(i=o.descriptions)||void 0===i||null===(a=i[0])||void 0===a?void 0:a.value,null==o?void 0:o.id)}}"
      >
      </bbva-carousel-swipe>
    `}get _mainListSection(){var e;const t=this._hasPromotions?"promotions-stores-map-store-detail-promotions-link":"";return d`
      <bbva-header-category
        text="promotions-stores-map-store-detail-promotions"
        option-link="${t}"
        has-link-ellipsis
        @header-category-link-click="${null===(e=this.data)||void 0===e?void 0:e.showAllPromotions}"
      ></bbva-header-category>
      ${this._emptyPromotions?ho._emptyList():this._checkErrorSection}
    `}get _listSection(){return d`
      ${this._loadingPromotions?ho.renderSkeletonGroup():this._mainListSection}
    `}get _checkErrorSection(){return d`
      ${this._errorPromotions?this._errorList:this._carouselContent}
    `}_parsedCategoriesBadges(e){return((null==e?void 0:e.usageTypes)||[]).map((e=>{var t,i,a,o;return{categoryIcon:(null===(t=this.data.promotionIcons)||void 0===t||null===(i=t[e.id])||void 0===i?void 0:i.icon)||(null===(a=this.data.promotionIcons)||void 0===a||null===(o=a.DEFAULT)||void 0===o?void 0:o.icon),categoryText:e.name}}))}_errorLinkAction(){var e,t,i,a,o;!this._reachMaximumAttemptsPromotions||null!==(e=this.data)&&void 0!==e&&e.callCenterButtonHide?null===(t=this.data)||void 0===t||null===(i=t.getPromotions)||void 0===i||i.call(t):null===(a=this.data)||void 0===a||null===(o=a.basicCallToBank)||void 0===o||o.call(a)}get _errorList(){var e;const t="promotions-stores-map-store-detail-list-error-",i=this._reachMaximumAttemptsPromotions?"-alt":"",a=this._reachMaximumAttemptsPromotions&&null!==(e=this.data)&&void 0!==e&&e.callCenterButtonHide?"":this.t(`${t}link${i}`),o=this.t(`${t}message${i}`);return d`
      <bbva-notification-message
        variant="error"
        link-title="${a}"
        @notification-message-link-click="${()=>this._errorLinkAction()}"
      >
        ${o}
      </bbva-notification-message>
    `}get _carouselSection(){var e;return null!==(e=this.data)&&void 0!==e&&e.hasPromotionTypes?d`
        <div class="store-detail-container__list">
          ${this._listSection}
        </div>
      `:ce}_currentOpeningHour(e){var t;const i=null==e||null===(t=e.dayOfWeek)||void 0===t?void 0:t.toLowerCase(),a=(null==e?void 0:e.format)||"format",o="promotions-stores-map-store-detail-schedule-",r=`${o}${i}`,s=this.t(`${o}${a}`,{from:null==e?void 0:e.fromHour,to:null==e?void 0:e.toHour});return d`
      <bbva-list-simple
        label=${r}
        description="${s}"
        description-medium
      ></bbva-list-simple>
    `}get _formattedSchedule(){return["monday","tuesday","wednesday","thursday","friday","saturday","sunday"].reduce(((e,t)=>{var i;const a=[...e],o=(null===(i=this._openingHours)||void 0===i?void 0:i.find((e=>{var i;return(null==e||null===(i=e.dayOfWeek)||void 0===i?void 0:i.toLowerCase())===t})))||{dayOfWeek:t,format:"closed"};return a.push(o),a}),[])}get _scheduleSection(){var e,t;return null!==(e=this._openingHours)&&void 0!==e&&e.length?d`
        <div class="store-detail-container__schedule">
          <bbva-header-category
            text="promotions-stores-map-store-detail-schedule"
          ></bbva-header-category>
          ${null===(t=this._formattedSchedule)||void 0===t?void 0:t.map((e=>this._currentOpeningHour(e)))}
        </div>
      `:ce}static getCustomCategory(e){return{[e.id]:{icon:e.rawIcon,color:m.secondary500,locale:e.name}}}static currentCategory(e){return null!=e&&e.name?d`
        <bbva-list-category
          ambient="light"
          category="${null==e?void 0:e.id}"
          item-text="${null==e?void 0:e.name}"
          no-link
          no-heading
          disabled-tabindex
          .customCategories="${ho.getCustomCategory(e)}"
        >
        </bbva-list-category>
      `:ce}get _categorySection(){var e;const t=null===(e=this._parsedCategories)||void 0===e?void 0:e.length;var i,a;return t?d`
        <div class="store-detail-container__categories" ambient="light">
          ${1===t&&null!==(i=this._parsedCategories[0])&&void 0!==i&&i.name?d`
                <bbva-header-category
                  text="${this.t("promotions-stores-map-store-detail-category")}"
                ></bbva-header-category>
              `:ce}
          ${t>1?d`
                <bbva-header-category
                  text="${this.t("promotions-stores-map-store-detail-categories")}"
                ></bbva-header-category>
              `:ce}
          ${null===(a=this._parsedCategories)||void 0===a?void 0:a.map(((e,i)=>{const a=t-1===i;return d`
              ${ho.currentCategory(e)}
              ${a?ce:d`
                    <bbva-divider size="fit"></bbva-divider>
                  `}
            `}))}
        </div>
      `:ce}get _currentWeb(){return this._storeURL?d`
        <div class="store-detail-container__other-info__web">
          <bbva-list-simple
            variant="stacked-center"
            label="promotions-stores-map-store-detail-other-info-web"
            description-link
            @list-simple-link-description-click="${()=>{var e;return null===(e=this.data)||void 0===e?void 0:e.openLinkModal(this._storeURL)}}"
            description="${this.t("promotions-stores-map-store-detail-other-info-web-url")}"
            description-link-accessibility-text="promotions-stores-map-store-detail-other-web"
          >
          </bbva-list-simple>
        </div>
      `:ce}get _currentRating(){if(void 0===this._storeRating)return ce;return d`
      <div class="store-detail-container__other-info__rating">
        <bbva-text
          id="feedback"
          text-color="secondary500"
          alignment="center"
          text="promotions-stores-map-store-detail-other-info-rating"
          tag="label"
          size="S"
        >
        </bbva-text>
        <bbva-badge-feedback
          rating="${this._storeRating}"
          aria-labelledby="feedback"
          .score="${-1}"
          disabled-tabindex
        >
        </bbva-badge-feedback>
      </div>
    `}get _storeOptions(){var e;return null===(e=this.data)||void 0===e?void 0:e.actionOptions(this._store)}_currentButtonAction({detail:e}){var t,i;null===(t=this.data)||void 0===t||t.storeButtonAction({detail:null===(i=this._storeOptions)||void 0===i?void 0:i[e]},!0)}get _otherInfoSection(){return d`
      <div class="store-detail-container__other-info">
        <bbva-header-category text="promotions-stores-map-store-detail-other-info">
        </bbva-header-category>
        ${this._currentWeb} ${this._currentRating}
        <div class="store-detail-container__other-info__buttons">
          <bbva-button-row
            disabled-tabindex
            @button-row-item-click="${e=>this._currentButtonAction(e)}"
            .options="${this._storeOptions}"
          ></bbva-button-row>
        </div>
      </div>
    `}render(){return d`
      <div slot="slot-content">
        <div class="store-detail-container">
          ${this._topInfoSection} ${this._carouselSection} ${this._scheduleSection}
          ${this._categorySection} ${this._otherInfoSection}
        </div>
      </div>
    `}}class mo extends Aa{get _stores(){var e;return null===(e=this.data)||void 0===e?void 0:e.stores}get _firstStore(){var e,t;return null===(e=this.data)||void 0===e||null===(t=e.stores)||void 0===t?void 0:t[0]}get _lastStoreIndex(){var e;return(null===(e=this._stores)||void 0===e?void 0:e.length)-1}get _storesList(){var e;return d`
      <div class="list-movement-stores-container">
        ${null===(e=this._stores)||void 0===e?void 0:e.map(((e,t)=>{var i,a,o,r;return d`
              <bbva-list-movement
                class="promotion-stores-list-movement"
                card-title="${null==e?void 0:e.name}"
                description-ellipsis
                highlight-category=""
                icon-clip="${null==e||null===(i=e.category)||void 0===i?void 0:i.icon}"
                bg-color-clip="${m.primaryMedium}"
                more-info="${c(null==e||null===(a=e.category)||void 0===a?void 0:a.name)}"
                category="${c(null==e||null===(o=e.promotions)||void 0===o?void 0:o.category)}"
                concept="${null==e||null===(r=e.promotions)||void 0===r?void 0:r.name}"
                @list-movement-item-click="${()=>{var t;return null===(t=this.data)||void 0===t?void 0:t.selectStore(e)}}"
              >
              </bbva-list-movement>
              ${t===this._lastStoreIndex?ce:d`
                    <bbva-divider size="fit"></bbva-divider>
                  `}
            `}))}
      </div>
    `}get _addressText(){var e;return this.t("promotions-stores-map-stores-list-address-text",{currentData:null===(e=this._firstStore)||void 0===e?void 0:e.address})}get _distanceText(){var e;const t=null===(e=this._firstStore)||void 0===e?void 0:e.distance;return t?this.t("promotions-stores-map-stores-list-distance-text",{currentData:t}):""}get _composeText(){return`${this._addressText}${this._distanceText}${this.t("promotions-stores-map-stores-list-basic-text")}`}render(){return d`
      <div slot="slot-content">
        <div class="main-stores">
          <div class="main-stores__top_content">
            <bbva-header-category
              text="promotions-stores-map-stores-list-main-title"
            ></bbva-header-category>
            <bbva-text text="${this._composeText}" size="S" alignment="left" tag="span">
            </bbva-text>
          </div>
          <div class="main-stores__list-container">
            ${this._storesList}
          </div>
        </div>
      </div>
    `}}class vo extends Aa{get _promotions(){var e;return null===(e=this.data)||void 0===e?void 0:e.promotions}_renderImage(e){const t=ao(e),i=null==e?void 0:e.name;return t?d`
          <img
            alt="${this.t("promotions-stores-map-promotion-img-alt-accessibility-text",{promotionName:i})}"
            class="promotion-header-img"
            src="${t}"
          />
        `:ce}_renderEndDate(e){var t;const i=null===(t=this.data)||void 0===t?void 0:t.getFormattedDate(null==e?void 0:e.endDate);return i?d`
        <div class="promotion-end-date">
          <span>${this.t("promotions-stores-map-promotion-end-date",{formattedDate:i})}</span>
        </div>
      `:ce}_renderUsageTypes(e){return e.usageTypes?d`
          <div class="promotion-usage-type-list">
            ${e.usageTypes.map((e=>{var t,i;return d`
                  <bbva-badge-icon
                    .icon="${(null===(t=this.data.promotionIcons)||void 0===t?void 0:t[e.id].icon)||(null===(i=this.data.promotionIcons)||void 0===i?void 0:i.DEFAULT.icon)}"
                    .description="${e.name}"
                  ></bbva-badge-icon>
                `}))}
          </div>
        `:ce}render(){var e;return d`
      <div slot="slot-content" class="promotions-list-box">
        ${null===(e=this._promotions)||void 0===e?void 0:e.map((e=>{var t,i,a,o,r;const s=null==e?void 0:e.promotionType,n=(null==e||null===(t=e.descriptions)||void 0===t||null===(i=t.find)||void 0===i||null===(a=i.call(t,(e=>"SUMMARY"===e.id)))||void 0===a?void 0:a.value)||"",l=(null===(o=this.data.promotionIcons)||void 0===o?void 0:o[null==s?void 0:s.id])||(null===(r=this.data.promotionIcons)||void 0===r?void 0:r.DEFAULT);return d`
            <div class="promotions-list-element">
              ${this._renderImage(e)}
              <bbva-text
                class="promotion-title"
                text=${null==e?void 0:e.name}
                @click="${()=>{var t,i;return this.data.openLinkModal(null==e?void 0:e.promotionUrl,null==e||null===(t=e.descriptions)||void 0===t||null===(i=t[0])||void 0===i?void 0:i.value,null==e?void 0:e.id)}}"
                unset
              ></bbva-text>
              <bbva-badge-icon
                class="promotion-category"
                .icon="${null==l?void 0:l.icon}"
                .category="${null==l?void 0:l.category}"
                .description="${(null==s?void 0:s.name)||(null==e?void 0:e.benefit)}"
              ></bbva-badge-icon>
              <bbva-text class="promotion-description" .text=${n} unset></bbva-text>
              ${this._renderEndDate(e)} ${this._renderUsageTypes(e)}
            </div>
          `}))}
      </div>
    `}}var uo=e`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal].middle-modal {
  --bbva-text-white-space-ellipsis: normal;
  --bbva-help-modal-footer-bg-color: token("foundations.colors.primaryCoreLightened");
}
[data-tag-name=bbva-help-modal].dark-header {
  --bbva-help-modal-ios-header-bg-color: token("foundations.colors.primaryCoreDarkened");
}
[data-tag-name=bbva-help-modal].filter-categories [data-tag-name=bbva-text] {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-help-modal].filter-categories [data-tag-name=bbva-form-input] {
  text-align: left;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-help-modal].map-legend, [data-tag-name=bbva-help-modal].filter-categories {
  --bbva-help-modal-padding: 0;
}
[data-tag-name=bbva-help-modal].map-legend [data-tag-name=bbva-header-category], [data-tag-name=bbva-help-modal].filter-categories [data-tag-name=bbva-header-category] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-help-modal] .categories-list {
  list-style-type: none;
  padding: 0;
}
[data-tag-name=bbva-help-modal] .categories-list__item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-help-modal] .categories-list__item:not(:last-of-type) {
  border-bottom: 0.0625rem solid var(--colorsSecondary300, ${p(m.secondary300)});
}
[data-tag-name=bbva-help-modal] .categories-list__category {
  display: flex;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-help-modal] .categories-list__category:not(:last-of-type) {
  border-bottom: 0.0625rem solid var(--colorsSecondary300, ${p(m.secondary300)});
}
[data-tag-name=bbva-help-modal] .categories-list__category [data-tag-name=bbva-text] {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
`,go=e`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-padding-bottom: 0;
}
[data-tag-name=bbva-transition-container] .main-stores {
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-transition-container] .main-stores__top_content [data-tag-name=bbva-header-category] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-transition-container] .main-stores__top_content [data-tag-name=bbva-text] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-transition-container] .store-detail-container {
  position: relative;
}
[data-tag-name=bbva-transition-container] .store-detail-container__top-info {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__list {
  position: relative;
  background: var(--promotions-stores-map-dark-mode-store-detail-list-bg-color, var(--colorsSecondary100, ${p(m.secondary100)}));
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) 0 0;
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  --bbva-card-article-height: 100%;
}
[data-tag-name=bbva-transition-container] .store-detail-container__list__empty_list {
  background: var(--promotions-stores-map-dark-mode-store-detail-list-bg-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) 0 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__list [data-tag-name=bbva-notification-message] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__list [data-tag-name=bbva-header-category] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__list [data-tag-name=bbva-carousel-default] {
  z-index: 0;
  --bbva-carousel-default-gradient-color: transparent;
}
[data-tag-name=bbva-transition-container] .store-detail-container__list [data-tag-name=bbva-carousel-swipe] {
  --bbva-card-article-box-shadow: transparent;
  --bbva-carousel-swipe-bg: transparent;
  --bbva-carousel-swipe-slide-min-height: 100%;
  --bbva-card-article-dark-mode-bg-color: var(--promotions-stores-map-dark-mode-carousel-element-bg-color, token("foundations.colors.primaryCoreLightened"));
  z-index: 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__schedule {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-transition-container] .store-detail-container__schedule [data-tag-name=bbva-header-category] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__schedule [data-tag-name=bbva-list-simple] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__categories [data-tag-name=bbva-header-category] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__other-info [data-tag-name=bbva-header-category] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__other-info__web {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__other-info__web [data-tag-name=bbva-list-simple] {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-transition-container] .store-detail-container__other-info__rating {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__other-info__rating [data-tag-name=bbva-badge-feedback] {
  margin: calc(((0.75 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) 0 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container__other-info__buttons {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-transition-container] .store-detail-container .top-divider {
  padding: calc(((0.875 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  display: block;
}
[data-tag-name=bbva-transition-container] .store-detail-container .bellow-divider-section {
  margin: 0 auto;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-transition-container] .item-skeleton {
  position: relative;
}
[data-tag-name=bbva-transition-container] .item-skeleton:after {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  display: inline-block;
  height: 11.75rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1rem;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}
[data-tag-name=bbva-transition-container] .item-skeleton.huge {
  min-height: 11.25rem;
}
[data-tag-name=bbva-transition-container] .item-skeleton.huge:after {
  background-image: linear-gradient(var(--promotions-stores-map-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${p(m.secondary200)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--promotions-stores-map-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${p(m.secondary200)}))) 50%), linear-gradient(-60deg, transparent 50%, var(--promotions-stores-map-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${p(m.secondary200)}))) 50%), linear-gradient(-60deg, transparent 50%, var(--promotions-stores-map-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${p(m.secondary200)}))) 50%);
  background-color: var(--promotions-stores-map-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, transparent));
  background-size: 100% 144px, calc((60% * 2) + (16px/ 2)) 16px, calc((85% * 2) + (16px/ 2)) 16px, calc((70% * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 16px 160px, 16px 192px, 16px 216px;
}
[data-tag-name=bbva-transition-container] .item-skeleton.small-linear {
  min-height: 2.5rem;
}
[data-tag-name=bbva-transition-container] .item-skeleton.small-linear:after {
  background-image: linear-gradient(-60deg, transparent 50%, var(--promotions-stores-map-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${p(m.secondary200)}))) 50%), linear-gradient(-60deg, var(--promotions-stores-map-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${p(m.secondary200)}))) 50%, transparent 50%);
  background-color: var(--promotions-stores-map-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, transparent));
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 17px 12px, 94% 12px;
}
[data-tag-name=bbva-transition-container] .item-skeleton.bottom {
  min-height: 5rem;
}
[data-tag-name=bbva-transition-container] .item-skeleton.bottom:after {
  background-image: linear-gradient(-60deg, transparent 50%, var(--promotions-stores-map-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${p(m.secondary200)}))) 50%), linear-gradient(-60deg, transparent 50%, var(--promotions-stores-map-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${p(m.secondary200)}))) 50%);
  background-color: var(--promotions-stores-map-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, transparent));
  background-size: calc((87% * 2) + (16px/ 2)) 16px, calc((74% * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 16px 48px;
}
[data-tag-name=bbva-transition-container] .item-skeleton > :nth-child(n) {
  opacity: 0;
}
[data-tag-name=bbva-transition-container] .promotions-list-box {
  background-color: var(--promotions-stores-map-dark-mode-promotions-list-bg-color, var(--colorsSecondary100, ${p(m.secondary100)}));
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0;
  height: 100%;
  box-sizing: content-box;
}
[data-tag-name=bbva-transition-container] .promotions-list-element {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
  border-radius: 0.0625rem;
  box-shadow: rgba(18, 18, 18, 0.2) 0 1px 3px 0;
  box-sizing: border-box;
  display: block;
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  background-color: var(--promotions-stores-map-dark-mode-promotions-list-element-bg-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
  position: relative;
}
[data-tag-name=bbva-transition-container] .promotions-list-element:last-child, [data-tag-name=bbva-transition-container] .promotions-list-element:first-child {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-transition-container] .promotion-header-img {
  width: 100%;
  object-fit: cover;
  object-position: var(--bbva-card-article-object-position, top center);
}
[data-tag-name=bbva-transition-container] .promotion-title {
  color: var(--promotions-stores-map-dark-mode-promotions-list-element-title-color, var(--colorsPrimaryMedium, ${p(m.primaryMedium)}));
  font-size: var(--typographyTypeMedium, ${p(h.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${p(M.medium.fontWeight)});
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  box-sizing: border-box;
}
:host([expanded]) [data-tag-name=bbva-transition-container] .promotion-title {
  color: var(--colorsSecondary600, ${p(m.secondary600)});
}
[data-tag-name=bbva-transition-container] .promotion-category {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  box-sizing: border-box;
}
[data-tag-name=bbva-transition-container] .promotion-description {
  display: block;
  box-sizing: border-box;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  font-size: var(--typographyTypeSmall, ${p(h.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${p(E.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${p(M.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${p(M.medium.fontStyle)});
}
[data-tag-name=bbva-transition-container] .promotion-end-date {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  text-align: left;
  display: block;
  font-weight: var(--fontFacePrimaryBookFontWeight, ${p(M.book.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, italic);
  color: var(--promotions-stores-map-dark-mode-promotions-list-element-date-color, var(--colorsSecondary500, ${p(m.secondary500)}));
}
[data-tag-name=bbva-transition-container] .promotion-usage-type-list {
  display: flex;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em) 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em);
  gap: 0.5rem;
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
`;class bo extends(ui(Ae($(u(a))))){static get is(){return"promotions-stores-map-section"}static get scopedElements(){const e=[lt,si,Ta,De,ze,Ne,Oe,li,Ra,Re,dt,_i,Ua,Xa,Za,Ve,g,Fe,ct,pt,He,b,Ya,qe,X];return bo.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean,reflect:!0},data:{type:Object},serviceResponse:{type:Array,attribute:"service-response"},iOSFixedHeader:{type:Boolean,attribute:"ios-fixed-header"},preventToUpdate:{type:Boolean,attribute:"prevent-to-update"},resetContentScroll:{type:Boolean,reflect:!0,attribute:"reset-content-scroll"},categoriesPart:{type:Object,attribute:"categories-part"},errorPart:{type:Object,attribute:"error-part"},locationPart:{type:Object,attribute:"location-part"},mapLegendPart:{type:Object,attribute:"map-legend-part"}}}_initialDataConfig(e={}){const t=()=>null;this.data={mode:"",buttonKey:"",linkKey:"",linkText:"",bodyKey:"",panelTextKey:"",titleKey:"",panelHeadingKey:"",modalTitleKey:"",linkPanelTextKey:"",headerTextKey:"",modalType:"",className:"",microillustration:"error",fullHeight:!1,hidePrimaryButton:!1,iconRightPrimary:"",iconRightSecondary:"",iconLeftPrimary:"",iconLeftSecondary:"",titleIcon:"",headerType:"",accessibilityTextIconLeftPrimary:"",accessibilityTextIconLeftSecondary:"",accessibilityTextIconRightPrimary:"",accessibilityTextIconRightSecondary:"",messageGroup:[],headerRightPrimaryClick:t,headerRightSecondaryClick:t,headerLeftPrimaryClick:t,headerLeftSecondaryClick:t,footerButtonClick:t,footerLinkClick:t,panelLinkClick:t,closeModalElements:["footer-button","footer-link","header-right-primary"],disabledButton:!1,...e}}static get styles(){return[uo,go,yi.light,ot.light,Wa.light,Le.light,Pe.dark,rt.light,$a.light,J.light,ee.light,_.light,Ee.light,st.light,nt.light,Me.light,Be.light,ni.light,za.light,Ie.light,l("promotions-stores-map-modal-shared-styles")]}constructor(){super(),this.visible=!1,this.serviceResponse=[],this.iOSFixedHeader=!1,this.preventToUpdate=!1,this.resetContentScroll=!1,this.categoriesPart=new Qa(this),this.errorPart=new Ua(this),this.locationPart=new Xa(this),this.mapLegendPart=new Za(this),this.storeDetailPart=new ho(this),this.storesClusteredPart=new mo(this),this.promotionListPart=new vo(this),this._initialDataConfig()}shouldUpdate(){return!this.preventToUpdate}get _part(){var e;const t={categories:this.categoriesPart,error:this.errorPart,location:this.locationPart,mapLegend:this.mapLegendPart,storeDetail:this.storeDetailPart,storesClustered:this.storesClusteredPart,promotionList:this.promotionListPart};return null==t?void 0:t[null===(e=this.data)||void 0===e?void 0:e.mode]}get _content(){var e,t;return null===(e=this._part)||void 0===e||null===(t=e.render)||void 0===t?void 0:t.call(e)}_changeVisible({detail:e}){var t,i;(this.visible=e,e)&&(this._initialDataConfig(this.data),null===(t=this._part)||void 0===t||null===(i=t.init)||void 0===i||i.call(t))}get _modalContainer(){var e,t,i,a,o,r,s,n,l,c,p,h,m,v,u,g,b,f,y,_,x,k,S,w,$,C,T,A,L,P,E,M,B,I;return d`
      <bbva-help-modal
        ?visible=${this.visible}
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        class="${null===(e=this.data)||void 0===e?void 0:e.className}"
        aria-label="${null!==(t=this.data)&&void 0!==t&&t.fullHeight?this.t(null===(i=this.data)||void 0===i?void 0:i.headerTextKey):""}"
        .headerText="${null!==(a=this.data)&&void 0!==a&&a.fullHeight?this.t(null===(o=this.data)||void 0===o?void 0:o.headerTextKey):""}"
        .headerType="${null===(r=this.data)||void 0===r?void 0:r.headerType}"
        @help-modal-open="${this._handleModalState}"
        @help-modal-close="${this._handleModalState}"
        @help-modal-header-right-primary-click="${null===(s=this.data)||void 0===s?void 0:s.headerRightPrimaryClick}"
        @help-modal-header-left-right-secondary="${null===(n=this.data)||void 0===n?void 0:n.headerRightSecondaryClick}"
        @help-modal-header-left-primary-click="${null===(l=this.data)||void 0===l?void 0:l.headerLeftPrimaryClick}"
        @help-modal-header-left-secondary-click="${null===(c=this.data)||void 0===c?void 0:c.headerLeftSecondaryClick}"
        .iconRightPrimary="${null===(p=this.data)||void 0===p?void 0:p.iconRightPrimary}"
        .iconRightSecondary="${null===(h=this.data)||void 0===h?void 0:h.iconRightSecondary}"
        .iconLeftPrimary="${null===(m=this.data)||void 0===m?void 0:m.iconLeftPrimary}"
        .iconLeftSecondary="${null===(v=this.data)||void 0===v?void 0:v.iconLeftSecondary}"
        .accessibilityTextIconLeftPrimary="${null===(u=this.data)||void 0===u?void 0:u.accessibilityTextIconLeftPrimary}"
        .accessibilityTextIconLeftSecondary="${null===(g=this.data)||void 0===g?void 0:g.accessibilityTextIconLeftSecondary}"
        .accessibilityTextIconRightPrimary="${null===(b=this.data)||void 0===b?void 0:b.accessibilityTextIconRightPrimary}"
        .accessibilityTextIconRightSecondary="${null===(f=this.data)||void 0===f?void 0:f.accessibilityTextIconRightSecondary}"
        data-selector="${`modal-${null===(y=this.data)||void 0===y?void 0:y.mode}`}"
        @visible-changed=${this._changeVisible}
        ?full-height=${null===(_=this.data)||void 0===_?void 0:_.fullHeight}
        ?fixed-footer=${null===(x=this.data)||void 0===x?void 0:x.fullHeight}
        modal-type=${null===(k=this.data)||void 0===k?void 0:k.modalType}
        title-icon="${null===(S=this.data)||void 0===S?void 0:S.titleIcon}"
        .titleText="${null===(w=this.data)||void 0===w?void 0:w.titleKey}"
        .bodyText="${this.t(null===($=this.data)||void 0===$?void 0:$.bodyKey)}"
        .buttonText="${this.t(null===(C=this.data)||void 0===C?void 0:C.buttonKey)}"
        .linkText="${this.t(null===(T=this.data)||void 0===T?void 0:T.linkKey)}"
        .closeModalElements="${null===(A=this.data)||void 0===A?void 0:A.closeModalElements}"
        ?hide-content-padding-top="${null===(L=this.data)||void 0===L?void 0:L.fullHeight}"
        @help-modal-footer-button-click=${null===(P=this.data)||void 0===P?void 0:P.footerButtonClick}
        @help-modal-footer-link-click=${null===(E=this.data)||void 0===E?void 0:E.footerLinkClick}
        @help-modal-veil-click=${null===(M=this.data)||void 0===M?void 0:M.veilClick}
        ?disabled-button=${null===(B=this.data)||void 0===B?void 0:B.disabledButton}
        ?reset-content-scroll="${this.resetContentScroll}"
      >
        ${null!==(I=this.data)&&void 0!==I&&I.fullHeight?this._slotContent:ce}
      </bbva-help-modal>
    `}get _pageContainer(){var e,t,i;return d`
      <bbva-transition-container
        ambient="light"
        header-text="${null===(e=this.data)||void 0===e?void 0:e.headerTextKey}"
        ?visible=${this.visible}
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        @visible-changed=${this._changeVisible}
        @header-main-icon-left-primary-click="${null===(t=this.data)||void 0===t?void 0:t.headerLeftPrimaryClick}"
        accessibility-text-icon-left-primary="${null===(i=this.data)||void 0===i?void 0:i.accessibilityTextIconLeftPrimary}"
      >
        ${this._slotContent}
      </bbva-transition-container>
    `}get _wrapperContainer(){var e;return d`
      ${null!==(e=this.data)&&void 0!==e&&e.isPage?this._pageContainer:this._modalContainer}
    `}get _slotContent(){return d`
      ${this._content}
    `}render(){return d`
      ${this._wrapperContainer}
    `}_handleModalState(e){const{detail:t,target:i}=e;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:t,target:i}}))}}const fo=new t;var yo=e`:host {
  display: block;
  box-sizing: border-box;
  --_background-ios-header: var(--colorsPrimaryCoreDarkened, ${p(m.primaryCoreDarkened)});
}
@supports (padding-top: constant(safe-area-inset-top)) {
  :host {
    --promotions-stores-map-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --promotions-stores-map-safe-area-inset-top: env(safe-area-inset-top);
  }
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.map-container {
  display: flex;
  flex-direction: column;
  position: fixed;
  width: 100%;
  top: 0;
}

.main-container {
  display: flex;
  flex-flow: column;
  box-sizing: border-box;
  overflow: hidden;
  height: var(--_promotions-stores-map-main-container-height, calc(100vh - 48px));
}

[data-tag-name=bbva-map-dynamic] {
  --bbva-button-default-min-width: 13.9375rem;
  --bbva-map-dynamic-dark-mode-section-large-action-button-action: var(--promotions-stores-map-dark-mode-position-button-bg-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
  --bbva-button-default-bg-dark-mode-color: var(--promotions-stores-map-dark-mode-inside-button-bg-color, var(--colorsPrimaryMedium, ${p(m.primaryMedium)}));
  --bbva-button-default-dark-mode-color: var(--promotions-stores-map-dark-mode-inside-button-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
}

.filter-stores {
  min-height: 0;
  height: 3.5rem;
  background-color: var(--promotions-stores-map-dark-mode-filter-stores-bg-color, var(--colorsPrimaryCoreDarkened, ${p(m.primaryCoreDarkened)}));
}

.map, .main-stores-list-container {
  flex: auto;
}

.main-stores-list-container {
  background-color: var(--promotions-stores-map-dark-mode-main-stores-list-bg-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
}

.list-movement-stores-container {
  overflow: auto;
}
.list-movement-stores-container.empty-list {
  min-height: 100%;
}
.list-movement-stores-container.stores-list-without-filter {
  max-height: var(--_promotions-stores-map-stores-list-without-filter-max-height, calc(100vh - 148px - ((6 * var(--gridSpacerVariant, var(--gridSpacer, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em)));
}
.list-movement-stores-container.stores-list-with-filter {
  max-height: var(--_promotions-stores-map-stores-list-with-filter-max-height, calc(100vh - 120px - ((6 * var(--gridSpacerVariant, var(--gridSpacer, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em)));
}

.search-stores {
  min-height: 0;
  height: 5rem;
  background-color: var(--promotions-stores-map-dark-mode-search-stores-bg-color, var(--colorsPrimaryCoreDarkened, ${p(m.primaryCoreDarkened)}));
  --bbva-button-row-active-dark-mode-color: var(--promotions-stores-map-dark-mode-search-stores-active-link-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
  --bbva-button-action-active-dark-mode-color: var(--promotions-stores-map-dark-mode-search-stores-active-link-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
}
.search-stores .one-button {
  justify-content: space-around;
}

.view-list-panel {
  min-height: 0;
  height: 4.5rem;
  display: flex;
  align-items: center;
  justify-content: center;
  right: 0;
  left: 0;
  bottom: 0;
  background-color: var(--promotions-stores-map-dark-mode-view-list-bg-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
  box-shadow: 0 -3px 2px rgba(18, 18, 18, 0.08);
  z-index: 1;
}
.tooltip {
  position: absolute;
  right: 1rem;
  left: 1rem;
  bottom: 1rem;
}

.carousel-tooltip {
  position: absolute;
  bottom: 0;
  width: 100%;
  background-color: var(--promotions-stores-map-dark-mode-carousel-tooltip-bg-color, var(--colorsSecondary100, ${p(m.secondary100)}));
  z-index: 2;
}
.carousel-tooltip__container {
  position: relative;
  margin: 0 auto;
  --bbva-map-tooltip-box-shadow: none;
}
.carousel-tooltip__container [data-tag-name=bbva-carousel-swipe] {
  --bbva-carousel-swipe-bg: transparent;
  --bbva-carousel-swipe-slide-min-height: 100%;
  z-index: 0;
}
.carousel-tooltip__container [data-tag-name=bbva-link] {
  display: block;
  text-align: center;
  margin: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1rem);
}

.native-fixed-header {
  background-color: var(--_background-ios-header);
  height: var(--promotions-stores-map-safe-area-inset-top, 0);
  position: absolute;
  bottom: calc(100vh - var(--promotions-stores-map-safe-area-inset-top, 0));
  width: 100%;
  z-index: 5;
  --_promotions-stores-map-main-container-height: calc(100vh - 48px - var(--promotions-stores-map-safe-area-inset-top, 0));
  --_promotions-stores-map-stores-list-without-filter-max-height: calc(100vh - 148px - var(--promotions-stores-map-safe-area-inset-top, 0) - ((6 * var(--gridSpacerVariant, var(--gridSpacer, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em));
  --_promotions-stores-map-stores-list-with-filter-max-height: calc(100vh - 120px - var(--promotions-stores-map-safe-area-inset-top, 0) - ((6 * var(--gridSpacerVariant, var(--gridSpacer, var(--gridSpacer, ${p(B.spacer)}))) / 16) * 1em));
}

.stores-map-container.native-fixed-header {
  padding-top: var(--promotions-stores-map-safe-area-inset-top, 0);
  position: fixed;
}
${fo.mediaRules()}`;class _o extends($(ui(Ae(u(a))))){static get is(){return"promotions-stores-map"}static get scopedElements(){const e=[mt,di,vt,ze,_i,bo,Q,Ve,ut,vi,N,bt,Oi,Ta,De,qe,La,C];return _o.scopedElementsFromClasses(e)}static get properties(){return{apiKey:{type:String,attribute:"api-key"},phoneNumber:{type:String,attribute:"phone-number"},iOSDevices:{type:Array,attribute:"ios-devices"},mapStoresSource:{type:String,attribute:"map-stores-source"},userAgentRegex:{type:String,attribute:"user-agent-regex"},_mapButtonKey:{type:String,state:!0},_firstExecution:{type:Boolean,attribute:"first-execution",state:!0},_geoLocation:{type:Object,attribute:"geo-location",state:!0},_pois:{type:Array,state:!0},_promotionsDm:{type:Object,state:!0},_storesDm:{type:Object,state:!0},_categoriesDm:{type:Object,state:!0},_modalData:{type:Object,state:!0},_mapBounds:{type:Object,state:!0},_errorType:{type:String,state:!0},_errorCounter:{type:Object,state:!0},categoriesApiVersion:{type:Number,attribute:"categories-api-version"},promotionsApiVersion:{type:Number,attribute:"promotions-api-version"},storesApiVersion:{type:Number,attribute:"stores-api-version"},_maximumAttempts:{type:Number,state:!0},_hideMeMarker:{type:Boolean,attribute:"hide-me-marker",state:!0},_loading:{type:Boolean,state:!0},_showMap:{type:Boolean,state:!0},_showLeaveModal:{type:Boolean,state:!0},defaultGeoLocation:{type:Object,attribute:"default-geo-location"},_currentCenter:{type:Object,state:!0},_filterList:{type:Array,state:!0},_clearPois:{type:Boolean,state:!0},_clearSelected:{type:Boolean,state:!0},_filterSearch:{type:Boolean,state:!0},_searchOptions:{type:Array,state:!0},_storesFilterClass:{type:String,state:!0},_currentLink:{type:String,state:!0},_currentText:{type:String,state:!0},_currentId:{type:String,state:!0},_rawCategories:{type:Array,state:!0},_rawPromotions:{type:Array,state:!0},_categoriesParsed:{type:Array,state:!0},_storedCategories:{type:Array,state:!0},_categoriesFilterConfig:{type:Object,state:!0},_searchName:{type:String,state:!0},_showTooltip:{type:Boolean,state:!0},_showCarouselTooltip:{type:Boolean,state:!0},_preventToUpdate:{type:Boolean,state:!0},_clusterListItems:{type:Array,state:!0},_clusterRawStores:{type:Array,state:!0},_tooltipInfo:{type:Object,state:!0},_storeListContainerClass:{type:String,state:!0},_showStoresList:{type:Boolean,state:!0},_promotionIcons:{type:Object,state:!0},_selectedStore:{type:Object,state:!0},_parsedStoresList:{type:Array,state:!0},_infoModalConfig:{type:Object,state:!0},_showInfoModal:{type:Boolean,state:!0},_isOptionButtonSelected:{type:Boolean,state:!0},_isFilterModalOpened:{type:Boolean,state:!0},mobileServices:{type:Object},mapSearchMode:{type:String,attribute:"map-search-mode"},showHelp:{type:Boolean,attribute:"show-help",reflect:!0},_dateOptions:{type:Object,state:!0},callCenterButtonHide:{type:Boolean,attribute:"call-center-button-hide"},promotionTypeId:{type:String,attribute:"promotion-type-id"},_hasViewedNativeSettings:{type:Boolean,state:!0}}}static get styles(){return[yo,ae.light,$a.light,gt.light,Ie.light,I.light,Le.light,Pe.dark,ht.dark,yi.light,Ge.light,l("promotions-stores-map-shared-styles")]}constructor(){super(),this.categoriesApiVersion=1,this.promotionsApiVersion=1,this.storesApiVersion=1,this.iOSDevices=Ja,this.userAgentRegex=to,this.callCenterButtonHide=!1,this.promotionTypeId="",this._mainPart=new La(this),this._promotionsDm={},this._storesDm={},this._categoriesDm={},this._storesMapPart=new Pa(this),this._storesListPart=new Ea(this),this._maximumAttempts=3,this._hideMeMarker=!1,this._errorType="",this._mapButtonKey="",this._errorCounter={},this.apiKey="",this._currentLink="",this._currentText="",this._currentId="",this.phoneNumber="",this.mobileServices={},this._showMap=!1,this.native=!1,this._loading=!1,this._isFilterModalOpened=!1,this._isOptionButtonSelected=!1,this._geoLocation=null,this.mapStoresSource="",this._clearPois=!1,this._clearSelected=!1,this._preventToUpdate=!1,this._currentCenter={},this.defaultGeoLocation={lat:-34.60376,lng:-58.38162},this._stack=[],this._pois=[],this._filterSearch=!1,this._searchOptions=[],this._firstExecution=!1,this._storesFilterClass="search-stores",this._filterList=[],this._mapBounds={},this.config={header:{text:"promotions-stores-map-header-title",iconLeftPrimary:A(),accessibilityTextIconLeftPrimary:"promotions-stores-map-header-main-accessibility-text-icon-left-primary",iconRightSecondary:null,accessibilityTextIconRightSecondary:"promotions-stores-map-header-main-accessibility-text-icon-right-secondary","@header-main-icon-right-secondary-click":()=>this._openInfoModal(this._mapLegendModalConfig)},loader:!0},this._rawCategories=[],this._rawPromotions=[],this._categoriesParsed=[],this._storedCategories=[],this._categoriesFilterConfig={},this._searchName="",this._showCarouselTooltip=!1,this._showTooltip=!1,this._tooltipInfo={options:[]},this._clusterListItems=[],this._clusterRawStores=[],this._hasViewedNativeSettings=!1,this._showLeaveModal=!1,this._showStoresList=!1,this._showInfoModal=!1,this._storeListContainerClass="",this._promotionIcons={OTHER:{icon:je(),class:"promotion-offer",category:"promotion"},LOYALTY_POINTS:{icon:Ke(),class:"promotion-bbva-points",category:"points"},POST_PAYMENTS:{icon:We(),class:"promotion-payments",category:"skipPayment"},ONLINE:{icon:Ye(),category:"transportation"},PHYSICAL:{icon:Ue(),category:"shopping"},DEFAULT:{icon:Xe(),class:"promotion-combined",category:"discount"}},this._selectedStore={},this._parsedStoresList=[],this._infoModalConfig={},this.mapSearchMode="CORNERS",this.showHelp=!1,this._dateOptions={day:"2-digit",month:"long",year:"numeric"},this._modalData=eo(this)}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._promotionsDm=this.shadowRoot.querySelector(`[data-tag-name="${mt.is}"]`),this._storesDm=this.shadowRoot.querySelector(`[data-tag-name="${di.is}"]`),this._categoriesDm=this.shadowRoot.querySelector(`[data-tag-name="${vt.is}"]`),this._openLoader()}_getFormattedDate(e){const t=new Date(e);return t.getTime()?t.toLocaleString(this.language,this._dateOptions):""}_getCurrentLanguage(){return this.language}get _isFirstStack(){return!this._stack.length}get _hideLinkBottom(){return this._showTooltip}get _visibleStack(){return this._stack.reduce(((e,t)=>{const i={...e};return i[t]=!0,i}),{})}_toggleVisibility(e){let t=this._stack.filter((t=>t!==e));this._stack.length===t.length&&(t=[...t,e]),this._stack=t,this._dispatch(`promotions-stores-map-visible-${oo(e)}`),this.requestUpdate()}_removeLastStack(){var e,t;this._stack.pop();const i=(null===(e=this._stack)||void 0===e?void 0:e[(null===(t=this._stack)||void 0===t?void 0:t.length)-1])||"main";this._dispatch(`promotions-stores-map-visible-${oo(i)}`)}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._handleHeaderBack()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._removeHeaderBack()}_handleHeaderBack(){this.addEventListener("header-main-icon-left-primary-click",this.manageBackNavigation.bind(this),!0)}_removeHeaderBack(){this.removeEventListener("header-main-icon-left-primary-click",this.manageBackNavigation.bind(this),!0)}reset(){super.reset&&super.reset(),this._loading=!1,this._stack=[],this._resetCounter(),this._geoLocation=null,this._showMap=!1,this._firstExecution=!1,this._clearPois=!1,this._clearSelected=!1,this._showTooltip=!1,this._showCarouselTooltip=!1,this._isOptionButtonSelected=!1,this._isFilterModalOpened=!1,this._tooltipInfo={options:[]},this._clusterListItems=[],this._clusterRawStores=[],this._currentCenter={},this._selectedStore={},this._showInfoModal=!1,this._closeAllModals(),this._openLoader(),this._searchName="",this._storedCategories=[],this._categoriesFilterConfig={},this._filterList=[]}updated(e){var t;(super.updated(e),e.has("_filterList"))&&(this._filterSearch=null===(t=this._filterList)||void 0===t?void 0:t.length,this._storesFilterClass=this._filterSearch?"filter-stores":"search-stores",this._storeListContainerClass=this._filterSearch?"stores-list-with-filter":"stores-list-without-filter");e.has("showHelp")&&(this.config={...this.config,header:{...this.config.header,iconRightSecondary:this.showHelp?P():null}}),e.has("callCenterButtonHide")&&(this._modalData=eo(this))}shouldUpdate(e){return this._preventToUpdate=!["_currentLink","_currentText","_currentId","_showLeaveModal"].reduce(((t,i)=>!e.has(i)&&t),!0),!0}initMain(){this._resetCounter(),this._errorType="",this._clearPois=!1,this._geoLocation=null,this._firstExecution=!0,this._mapButtonKey="",this._showMap=!0,this._currentCenter={},this._showStoresList=!1}_storesClusteredView(){this._modalData.storesClustered.stores=this._parseStoresForList(this._clusterRawStores),this._toggleVisibility(this._storesClusteredConfig.mode)}_footerToggleStoresView(){var e,t,i;this._showStoresList=!this._showStoresList;const a=(null===(e=this._getStoresParams())||void 0===e?void 0:e["categories.id"])||(null===(t=this._getStoresParams())||void 0===t?void 0:t.text);null!==(i=this._rawStores)&&void 0!==i&&i.length?this._dispatch("promotions-stores-map-visible-"+(this._showStoresList?"stores-list":"map")):this._dispatch(`promotions-stores-map-empty-stores${a?"-with-filter":""}${this._showStoresList?"-list":"-map"}`)}_openLoader(){this._loading=!0,this.showLoader("transparent",!1,!0)}_closeLoader(){this._loading=!1,this.clearLoader()}_manageDynamicMapRequest(){this._openLoader(),this.native?this._getNativeCurrentPosition():this._getWebCurrentPosition()}_getDeviceLocation(){this._dispatch("promotions-stores-map-get-current-position")}setCurrentPosition(e){this._retrieveGeoLocation(e)}_getNativeCurrentPosition(){this._dispatch("promotions-stores-map-check-location-permissions","location")}checkLocationPermissions(e){const{state:t}=e;({granted:()=>this._getDeviceLocation(),denied:()=>this._requestLocationPermissions(),permanently_denied:()=>this.locationPermissionsError()})[t||"denied"]()}_requestLocationPermissions(){this._dispatch("promotions-stores-map-request-location-permission","location")}locationPermissionsSuccess(){this._getDeviceLocation()}_getWebCurrentPosition(){navigator.geolocation.getCurrentPosition((e=>{this._retrieveGeoLocation(null==e?void 0:e.coords)}),(()=>{this.locationPermissionsError()}),{enableHighAccuracy:!0,timeout:5e3,maximumAge:0})}_setFilters(){var e,t,i;(null!==(e=this._storedCategories)&&void 0!==e&&e.length||null!==(t=this._searchName)&&void 0!==t&&t.length)&&(this._filterList=[...this._storedCategories],null!==(i=this._searchName)&&void 0!==i&&i.length&&this._filterList.unshift({name:this._searchName,removable:!0}))}_deleteFilters(e){this._deleteStoredFiltersData(e),this._updateFilterList(e),this._getStores()}_deleteStoredFiltersData(e){var t;const i=this._filterList[e.detail];!(null===(t=this._storedCategories)||void 0===t||!t.find((e=>(null==e?void 0:e.id)===(null==i?void 0:i.id))))?this._storedCategories=[...this._storedCategories.filter((e=>e.id!==i.id))]:this._searchName="",this._categoriesFilterConfig={...this._categoriesFilterConfig,storedCategories:this._storedCategories,searchName:this._searchName,storedCategoriesEdited:this._storedCategories,searchNameEdited:this._searchName}}_updateFilterList(e){delete this._filterList[e.detail];const t=[...this._filterList].filter((e=>e&&e.name));this._filterList=t}_mapDynamicGeolocationRequest(){this._hasDefaultCenter||this._manageDynamicMapRequest()}get _hasDefaultCenter(){var e;return!(null===(e=Object.keys(this._currentCenter))||void 0===e||!e.length)}get _hasGeoLocationDefined(){return this._geoLocation||this._hasDefaultCenter}_boundsChanged(e){var t,i;this._showInfoModal||(this._mapBounds={...this._mapBounds,...e.detail},this._firstExecution&&this._hasGeoLocationDefined&&void 0!==(null===(t=this._mapBounds)||void 0===t||null===(i=t.ne)||void 0===i?void 0:i.latitude)&&(this._clearPois=!1,this._getStores(),this._firstExecution=!1))}_centerChanged(e){this._mapBounds={...this._mapBounds,center:e.detail},this._firstExecution||this._actionMap()}_locateAction(){this._currentCenter={}}_actionMap(){this._mapButtonKey="promotions-stores-map-search-in-zone"}_zoomChanged(){this._actionMap()}_searchZone(){this._clearPois=!1,this._getStores(),this._showTooltip=!1,this._showCarouselTooltip=!1}_getStoreById(e){return this._rawStores.find((t=>t.id===e))}_mapDynamicPopupClick(e){var t;this._showTooltip=!0,this._showCarouselTooltip=!1,this._isOptionButtonSelected=!1;const i=this._getStoreById(null===(t=e.detail)||void 0===t?void 0:t.id);this._tooltipInfo=this._getTooltipFromStore(i),this._clearSelected=!1}_getTooltipFromStore(e){var t,i,a,o,r,s,n;const l=null==e||null===(t=e.categories)||void 0===t?void 0:t[0],d=null==e||null===(i=e.promotionsTypes)||void 0===i?void 0:i[0],c=null!=e&&e.distance&&null!=e&&null!==(a=e.distance)&&void 0!==a&&a.lengthType?`${null==e||null===(o=e.distance)||void 0===o?void 0:o.length} ${null==e||null===(r=e.distance)||void 0===r||null===(s=r.lengthType)||void 0===s?void 0:s.name}`:"",p=this._actionOptions(e),h=this._promotionIcons[null==d?void 0:d.id]??this._promotionIcons.DEFAULT;return{id:null==e?void 0:e.id,icon:$e(),accessibilityIconText:this.t("promotion-stores-map-tooltip-accessibility-icon-text"),location:null==e?void 0:e.name,description:null==e||null===(n=e.location)||void 0===n?void 0:n.formattedAddress,extraDescription:c?this.t("promotions-stores-map-distance",{formatDistance:c}):"",promotionBadge:d?{categoryName:h.category,description:null==d?void 0:d.name}:void 0,categoryBadge:l?{icon:lo(e,"STORES"),description:null==l?void 0:l.name}:void 0,options:p}}_mapDynamicClusterClick(e){var t;this._showTooltip=!1;const i=[];this._clusterRawStores=[],this._isOptionButtonSelected=!1,null==e||null===(t=e.detail)||void 0===t||t.forEach((e=>{var t;const a=this._getStoreById(null==e||null===(t=e.customInfo)||void 0===t?void 0:t.id);if(a){this._clusterRawStores.push(a);const e=this._getTooltipFromStore(a);i.push({content:this._renderTooltip(e)})}})),this._clearSelected=!1,this._showCarouselTooltip=!0,this._clusterListItems=[...i]}_renderTooltip(e){return d`
      <bbva-map-tooltip
        @map-tooltip-close-click="${()=>this._resetTooltipInfo()}"
        variant="store"
        @click="${()=>this._selectStore(e)}"
        .info="${e}"
        @map-tooltip-option-button-click="${e=>this._storeButtonAction(e)}"
      >
      </bbva-map-tooltip>
    `}_actionOptions(e){var t,i;const a=[{icon:Ze(),label:this.t("promotions-stores-map-how-to-go"),id:"walkingDirectionsButton",location:null==e||null===(t=e.location)||void 0===t?void 0:t.geolocation}];return null==e||null===(i=e.contactDetails)||void 0===i||i.forEach((e=>{var t,i;"PHONE_NUMBER"===(null===(t=e.contactType)||void 0===t?void 0:t.id)&&a.push({icon:Qe(),label:this.t("promotions-stores-map-call-to-store"),id:"telephoneButton",phone:null==e?void 0:e.contact}),"EMAIL"===(null===(i=e.contactType)||void 0===i?void 0:i.id)&&a.push({icon:Je(),label:this.t("promotions-stores-map-send-email-to-store"),id:"emailButton",email:null==e?void 0:e.contact})})),a}_storeButtonAction(e,t=!1){var i,a,o;t||(this._isOptionButtonSelected=!0),"walkingDirectionsButton"===(null===(i=e.detail)||void 0===i?void 0:i.id)&&this._showRouteToLocation(e.detail.location),"telephoneButton"===(null===(a=e.detail)||void 0===a?void 0:a.id)&&(this._dispatch("promotions-stores-map-call-to-store",e.detail.phone),this._callToPhone(e.detail.phone)),"emailButton"===(null===(o=e.detail)||void 0===o?void 0:o.id)&&this._sendEmail(e.detail.email)}_resetTooltipInfo(e=!1){e||(this._isOptionButtonSelected=!0),this._clearSelected=!0,this._showTooltip=!1,this._showCarouselTooltip=!1,this._clusterListItems=[],this._clusterRawStores=[],this._tooltipInfo={options:[]}}_openLinkModal(e,t,i){this._currentLink=e,this._currentText=t,this._currentId=i,this._showLeaveModal=!0}_openLink(){this._showLeaveModal=!1,this._currentLink?this._dispatch("promotions-stores-map-open-link",{scheme:this._currentLink,text:so(this._currentText),packageId:null}):this._dispatch("promotions-stores-map-open-promotion-id",this._currentId)}_callToBank(){this._basicCallToBank();this._isBackPrevented?(this._closeAllModals(),this._resetCounter()):this._exitManager()}_basicCallToBank(){this._callToPhone(this.phoneNumber)}_callToPhone(e){this._dispatch("promotions-stores-map-call-to-bank",e)}_sendEmail(e){this._dispatch("promotions-stores-map-send-email",{scheme:`mailto:${e}`,packageId:null})}_showRouteToLocation(e){this._dispatch("promotions-stores-map-show-route",this._parseLocation(e))}_parseLocation(e){var t,i;let a={longitude:e.longitude,latitude:e.latitude,name:"POI Name",zoom:1e3};const o=[a.latitude,a.longitude];return null!==(t=this.mobileServices)&&void 0!==t&&t.isGms?a={uriString:`google.navigation:q=${o.join(",")}`}:null!==(i=this.mobileServices)&&void 0!==i&&i.isHmsOnly&&(a={uriString:`mapapp://navigation?daddr=${o.join(",")}`}),a}_getCornerTextParams(e="CORNERS"){var t,i,a,o,r,s,n,l,d,c,p,h;const m={CENTER:{"locationC.geolocation.latitude":null===(t=this._mapBounds)||void 0===t||null===(i=t.center)||void 0===i?void 0:i.latitude,"locationC.geolocation.longitude":null===(a=this._mapBounds)||void 0===a||null===(o=a.center)||void 0===o?void 0:o.longitude},CORNERS:{"locationNW.geolocation.latitude":null===(r=this._mapBounds)||void 0===r||null===(s=r.sw)||void 0===s?void 0:s.latitude,"locationNW.geolocation.longitude":null===(n=this._mapBounds)||void 0===n||null===(l=n.ne)||void 0===l?void 0:l.longitude,"locationSE.geolocation.latitude":null===(d=this._mapBounds)||void 0===d||null===(c=d.ne)||void 0===c?void 0:c.latitude,"locationSE.geolocation.longitude":null===(p=this._mapBounds)||void 0===p||null===(h=p.sw)||void 0===h?void 0:h.longitude}}[e];return Object.keys(m).reduce(((e,t)=>{let i=e;return i+=`${i?",":""}${t}=${m[t]}`,i}),"")}_getRadius(){var e,t,i,a,o,r,s,n;return bt._computeDistanceBetween({lat:null===(e=this._mapBounds)||void 0===e||null===(t=e.center)||void 0===t?void 0:t.latitude,lng:null===(i=this._mapBounds)||void 0===i||null===(a=i.center)||void 0===a?void 0:a.longitude},{lat:null===(o=this._mapBounds)||void 0===o||null===(r=o.center)||void 0===r?void 0:r.latitude,lng:null===(s=this._mapBounds)||void 0===s||null===(n=s.ne)||void 0===n?void 0:n.longitude})}_getStoresParams(){var e,t,i,a;const o=null===(e=this._storedCategories)||void 0===e?void 0:e.map((e=>e.id)),r={...this._hasDefaultCenter?{}:{"location.geolocation.longitude":null===(t=this._geoLocation)||void 0===t?void 0:t.lng,"location.geolocation.latitude":null===(i=this._geoLocation)||void 0===i?void 0:i.lat},q:encodeURIComponent(this._getCornerTextParams(this.mapSearchMode)),...this.mapStoresSource&&{mapStoresSource:this.mapStoresSource},...o.length&&{"categories.id":o.join(",")},...this._searchName.length&&{text:null===(a=this._searchName)||void 0===a?void 0:a.toLowerCase()},...this.promotionTypeId&&{"promotionType.id":this.promotionTypeId}};return"CENTER"===this.mapSearchMode&&(r["distance.length"]=this._getRadius(),r["distance.lengthType.id"]="KILOMETERS"),r}_getStores(){this._resetTooltipInfo(!0),this._openLoader();const e=this._getStoresParams();this._errorType="",this._pois=[],this._clearPois=!0,this._storesDm.getStores(e)}_getStoresSuccess(e){var t,i,a;this._rawStores=e.detail||[],this._resetCounter();const o=this._parseStores();this._pois=o,this._clearPois=!1,this._parsedStoresList=this._parseStoresForList(e.detail||[]),this._modalData.storeDetail.hasDefaultCenter=this._hasDefaultCenter;const r=(null===(t=this._getStoresParams())||void 0===t?void 0:t["categories.id"])||(null===(i=this._getStoresParams())||void 0===i?void 0:i.text);var s,n;(this._closeLoader(),null!==(a=this._rawStores)&&void 0!==a&&a.length)?this._dispatch("promotions-stores-map-success-stores"+(r?"-with-filter":""),{searchResults:null===(s=this._rawStores)||void 0===s?void 0:s.length.toString(),searchTerm:null===(n=this._storedCategories)||void 0===n?void 0:n.map((e=>e.name)).join(",").normalize("NFD").replace(/[\u0300-\u036f]/g,"").toLowerCase(),searchEnterTerm:this._searchName.normalize("NFD").replace(/[\u0300-\u036f]/g,"").toLowerCase()}):(this._errorType=r?"empty-filtered-stores":"empty-stores",this._dispatch("promotions-stores-map-empty-stores"+(r?"-with-filter":"")),this._dispatch(`promotions-stores-map-empty-stores${r?"-with-filter":""}${this._showStoresList?"-list":"-map"}`))}_getPromotions(){var e;this._errorType="",this._setPromotionsError(!1),this._promotionsDm.getPromotions({"store.id":null===(e=this._selectedStore)||void 0===e?void 0:e.id})}_parseStores(){var e;return null===(e=this._rawStores)||void 0===e?void 0:e.map((e=>{var t;return{id:e.id,title:null==e?void 0:e.name,address:{geolocation:null==e||null===(t=e.location)||void 0===t?void 0:t.geolocation},icon:no(e,"STORES"),iconColor:{default:m.primaryCoreLightened,selected:m.primaryCoreLightened},backgroundColor:{default:m.primaryMedium,selected:m.primaryCore}}}))}_parseStoresForList(e){return null==e?void 0:e.map((e=>{var t,i,a,o,r,s,n,l;return{id:null==e?void 0:e.id,name:null==e?void 0:e.name,address:null==e||null===(t=e.location)||void 0===t?void 0:t.formattedAddress,distance:ro(null==e?void 0:e.distance),promotions:{name:(null==e||null===(i=e.promotionsTypes)||void 0===i||null===(a=i[0])||void 0===a?void 0:a.name)||"",category:(null===(o=this._promotionIcons[null==e||null===(r=e.promotionsTypes)||void 0===r||null===(s=r[0])||void 0===s?void 0:s.id])||void 0===o?void 0:o.category)||this._promotionIcons.DEFAULT.category},category:{name:null==e||null===(n=e.categories)||void 0===n||null===(l=n.find((e=>null==e?void 0:e.name)))||void 0===l?void 0:l.name,icon:lo(e,"STORES")}}}))}_getStoresError(){this._closeLoader(),this._clearPois=!1,this._errorType="stores",this._processErrorModal("stores")}_getPromotionsError(){this._errorType="promotions-error",this._incrementCounter(),this._setPromotionsError(!0,this._reachMaximumAttempts),this._reachMaximumAttempts&&this._dispatch("promotions-stores-map-promotions-error")}_getPromotionsSuccess(e){this._resetCounter();const t=e.detail||[];this._rawPromotions=t,this._modalData.storeDetail.promotions=t,this._modalData.promotionList.promotions=t}_openInfoModal(e){var t,i,a;(this._infoModalConfig=e,this._isFilterModalOpened="categories"===(null===(t=this._infoModalConfig)||void 0===t?void 0:t.mode),null!==(i=this._categoriesParsed)&&void 0!==i&&i.length)?(this._showInfoModal=!0,this._dispatch(`promotions-stores-map-visible-${oo(null===(a=this._infoModalConfig)||void 0===a?void 0:a.mode)}`)):this._getCategories()}_getCategories(){this._openLoader(),this._errorType="";const e=this.mapStoresSource&&{mapStoresSource:this.mapStoresSource};this._categoriesDm.getCategories(e)}_getCategoriesSuccess(e){var t;this._rawCategories=e.detail||[],this._categoriesParsed=co(this._rawCategories),this._resetCounter(),this._showInfoModal=!0,this._dispatch(`promotions-stores-map-visible-${oo(null===(t=this._infoModalConfig)||void 0===t?void 0:t.mode)}`),this._closeLoader()}_getCategoriesError(){var e;this._closeLoader(),this._processErrorModal(null===(e=this._infoModalConfig)||void 0===e?void 0:e.categoryErrorModal)}_searchWithFilters(e){this._categoriesFilterConfig=e,this._storedCategories=null==e?void 0:e.storedCategories,this._searchName=null==e?void 0:e.searchName,this._filterList=[],this._setFilters(),this._getStores(),this._showInfoModal=!1,this._isFilterModalOpened=!1}_processErrorModal(e,t=0){this._errorMessage="",this._errorType=e,this._incrementCounter(t),this._reachMaximumAttempts&&(this._errorType=`call-bank-${e}`,this.callCenterButtonHide&&(this._errorType=`reach-maximum-attempts-${e}`,this._dispatch(`promotions-stores-map-${this._errorType}-error`))),this._dispatch(`promotions-stores-map-${e}-error`)}_incrementCounter(e=0){this._errorCounter[this._errorType]||(this._errorCounter[this._errorType]=e),this._errorCounter[this._errorType]+=1}_resetCounter(){this._errorCounter={}}_exitManager(){this.reset(),this._resetCounter(),this._dispatch("promotions-stores-map-go-to-back")}_goToSettings(e){this._hasViewedNativeSettings=!0,this.reset(),this._dispatch("promotions-stores-map-go-to-settings",{setting:e})}checkAppVisibility({isVisible:e}){e&&this._hasViewedNativeSettings&&(this._hasViewedNativeSettings=!1,this.initMain())}locationPermissionsError(){this._closeLoader(),this._processErrorModal("location")}locationDisabledError(){this._closeLoader(),this._processErrorModal("location-disabled")}_setDefaultGeoLocation(){this._currentCenter=this.defaultGeoLocation}_retrieveGeoLocation(e){this._geoLocation={lat:null==e?void 0:e.latitude,lng:null==e?void 0:e.longitude},this._firstExecution||this._closeLoader()}_getNativeFixedHeaderClass(){return this.native&&this._shouldDisplayIOSFixedHeader()?"native-fixed-header":""}_selectStore(e){if(!this._isOptionButtonSelected){this._resetCounter();const t=this._getStoreById(null==e?void 0:e.id);this._selectedStore=t,this._setPromotionsError(!1),this._modalData.storeDetail.store=t,this._modalData.storeDetail.store.parsedCategories=co((null==t?void 0:t.categories)||[]),this._modalData.storeDetail.promotionIcons=this._promotionIcons,this._modalData.storeDetail.promotions=this.hasPromotionTypes?null:void 0,this._modalData.storeDetail.hasPromotionTypes=this.hasPromotionTypes,this._toggleVisibility(this._storeDetailConfig.mode),this.hasPromotionTypes&&this._getPromotions()}this._isOptionButtonSelected=!1}_setPromotionsError(e,t=!1){this._modalData.storeDetail.promotionsError={value:e,reachMaximumAttempts:t}}_showAllPromotions(){this._toggleVisibility(this._promotionListConfig.mode)}get hasPromotionTypes(){var e,t;return!(null===(e=this._selectedStore)||void 0===e||null===(t=e.promotionsTypes)||void 0===t||!t.length)}manageBackNavigation(){if(!this._loading){const e=this._isBackPrevented,t=this._isLocationError,i=this._isFirstStack;this._backActions(),this._closeAllModals(),t?this._setDefaultGeoLocation():e||(i?this._exitManager():this._removeLastStack())}}_backActions(){this._isFilterModalOpened&&(this._categoriesFilterConfig={},this._searchWithFilters(this._categoriesModalConfig))}_shouldDisplayIOSFixedHeader(){const e=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(e[0])}get _mapMain(){var e,t;return this._showMap?d`
          ${null===(e=this._mainPart)||void 0===e||null===(t=e.render)||void 0===t?void 0:t.call(e)}
        `:ce}get _showStoresMap(){var e,t,i,a;return[null===(e=this._storesListPart)||void 0===e||null===(t=e.render)||void 0===t?void 0:t.call(e),null===(i=this._storesMapPart)||void 0===i||null===(a=i.render)||void 0===a?void 0:a.call(i)]}get _footerButtonText(){return this._showStoresList?"promotions-stores-map-view-stores-map":"promotions-stores-map-view-stores-list"}get _footerButtonIcon(){return this._showStoresList?et():tt()}get _reachMaximumAttempts(){return Object.keys(this._errorCounter).reduce(((e,t)=>{var i;return(null===(i=this._errorCounter)||void 0===i?void 0:i[t])>this._maximumAttempts||e}),!1)}get _currentErrorConfig(){var e,t;return po((null===(e=this._modalData)||void 0===e||null===(t=e.errors)||void 0===t?void 0:t[this._errorType])||{},this._errorType)}get _categoriesModalConfig(){const e=po(this._modalData.categories||{},this._modalData.categories.mode);return Object.keys(this._categoriesFilterConfig).length?this._categoriesFilterConfig:e}get _mapLegendModalConfig(){return po(this._modalData.mapLegend,this._modalData.mapLegend.mode)}get _storeDetailConfig(){return po(this._modalData.storeDetail,this._modalData.storeDetail.mode,"promotions-stores-map")}get _storesClusteredConfig(){return po(this._modalData.storesClustered,this._modalData.storesClustered.mode,"promotions-stores-map")}get _leaveModalConfig(){return po(this._modalData.leaveModal,this._modalData.leaveModal.mode,"promotions-stores-map")}get _promotionListConfig(){return po(this._modalData.promotionList,this._modalData.promotionList.mode)}get _hasError(){return!!Object.keys(this._currentErrorConfig).length}get _renderApis(){return d`
      ${this._renderPromotionsApi} ${this._renderStoresApi} ${this._renderCategoriesApi}
    `}get _fixedIOSHeader(){return d`
      <div ?hidden="${!this._shouldDisplayIOSFixedHeader()}" class="native-fixed-header"></div>
    `}get _renderPromotionsApi(){return d`
      <bbva-global-promotions-api-dm
        .host="${this.host}"
        .version="${this.promotionsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @promotions-api-dm-fetch=${this._getPromotionsSuccess}
        @api-dm-error=${this._getPromotionsError}
        @promotions-api-dm-fetch-error=${this._getPromotionsError}
      ></bbva-global-promotions-api-dm>
    `}get _renderStoresApi(){return d`
      <bbva-global-stores-api-dm
        .host="${this.host}"
        .version="${this.storesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @stores-api-dm-fetch=${this._getStoresSuccess}
        @api-dm-error=${this._getStoresError}
        @stores-api-dm-fetch-error=${this._getStoresError}
      ></bbva-global-stores-api-dm>
    `}get _renderCategoriesApi(){return d`
      <bbva-global-categories-api-dm
        .host="${this.host}"
        .version="${this.categoriesApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @categories-api-dm-fetch=${this._getCategoriesSuccess}
        @api-dm-error=${this._getCategoriesError}
        @categories-api-dm-fetch-error=${this._getCategoriesError}
      ></bbva-global-categories-api-dm>
    `}get _renderErrorModal(){return d`
      <promotions-stores-map-section
        ?visible="${this._hasError}"
        .data="${this._currentErrorConfig}"
        ?iOSFixedHeader="${this.iOSFixedHeader&&this._currentErrorConfig.iOSFixed}"
        reset-content-scroll
      ></promotions-stores-map-section>
    `}get _renderLeaveModal(){return d`
      <promotions-stores-map-section
        ?visible="${this._showLeaveModal}"
        .data="${this._leaveModalConfig}"
        reset-content-scroll
      ></promotions-stores-map-section>
    `}get _renderStoreDetailPage(){return d`
      <promotions-stores-map-section
        ?visible="${this._visibleStack.storeDetail}"
        .data="${this._storeDetailConfig}"
        ?preventToUpdate="${this._preventToUpdate}"
        reset-content-scroll
      ></promotions-stores-map-section>
    `}get _renderStoresClusteredPage(){return d`
      <promotions-stores-map-section
        ?visible="${this._visibleStack.storesClustered}"
        .data="${this._storesClusteredConfig}"
        ?iOSFixedHeader="${this.iOSFixedHeader}"
        reset-content-scroll
      ></promotions-stores-map-section>
    `}get _renderPromotionsListPage(){return d`
      <promotions-stores-map-section
        ?visible="${this._visibleStack.promotionList}"
        .data="${this._promotionListConfig}"
        reset-content-scroll
      ></promotions-stores-map-section>
    `}get _renderInfoModal(){return d`
      <promotions-stores-map-section
        id="info-modal"
        ?visible="${this._showInfoModal}"
        .data="${this._infoModalConfig}"
        .serviceResponse="${this._categoriesParsed}"
        ?iOSFixedHeader="${this.iOSFixedHeader}"
        ?preventToUpdate="${this._preventToUpdate}"
        reset-content-scroll
      ></promotions-stores-map-section>
    `}_closeAllModals(){this._errorType="",this._showInfoModal=!1,this._showLeaveModal=!1,this._isFilterModalOpened=!1,this._resetCounter()}get _isOpenedInfoModal(){return this._showInfoModal||this._showLeaveModal}get _isBackPrevented(){return["empty-stores","empty-filtered-stores","categories-error","call-bank-categories-error","reach-maximum-attempts-categories-error","categories-error-map-legend","call-bank-categories-error-map-legend","reach-maximum-attempts-categories-error-map-legend"].includes(this._errorType)||this._isOpenedInfoModal}get _isLocationError(){return["location","location-disabled"].includes(this._errorType)}get _renderMapContainer(){return d`
      <div class="map-container">
        ${super.render()} ${this._mapMain}
      </div>
    `}get _renderVisualContent(){return d`
      <div ambient="light" class="stores-map-container ${this._getNativeFixedHeaderClass()}">
        ${this._fixedIOSHeader}${this._renderMapContainer}
        ${this._renderStoresClusteredPage}${this._renderStoreDetailPage}${this._renderPromotionsListPage}
        ${this._renderCategoriesFilterModal}${this._renderMapLegendModal}${this._renderInfoModal}
        ${this._renderLeaveModal}${this._renderErrorModal}
      </div>
    `}_dispatch(e,t=null,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:i,composed:a}))}render(){return d`
      ${this._renderApis} ${this._renderVisualContent}
    `}}customElements.define(_o.is,_o);
