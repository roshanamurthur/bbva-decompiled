import{z as t,ar as e,a as i,L as a,y as s,ah as o,aN as n,ai as r,ak as l,h as d,i as c,a8 as u,a9 as h,ac as g,ap as m,an as p,ag as v,F as b,b$ as _,bx as f,b1 as y,c0 as $,f as S,g as A,H as x,aX as T,v as C,u as E,cI as k,cJ as R,aD as w,aa as P,ad as D,ab as G,b0 as I,aJ as M,bj as O,b6 as L,dt as N,av as V,o as q,au as B,bd as H,as as F,at as j,V as U,aw as z,S as W,af as K,j as X,r as Y,aZ as J,J as Z,a7 as Q,aR as tt,dC as et,dD as it,dE as at,eB as st,W as ot,aI as nt,b3 as rt,bU as lt,cH as dt,bF as ct,cS as ut,cU as ht,aV as gt,bc as mt,cs as pt,cP as vt,aS as bt,bh as _t,aH as ft,aK as yt,bi as $t,cQ as St,q as At,l as xt,cu as Tt,Z as Ct,bf as Et,cD as kt,d9 as Rt,A as wt,b5 as Pt,di as Dt,b4 as Gt,bV as It,D as Mt,a$ as Ot,bT as Lt,E as Nt,U as Vt,eX as qt,cC as Bt,fQ as Ht,bS as Ft,ae as jt,T as Ut,cq as zt,ej as Wt,dg as Kt,d1 as Xt,et as Yt,cY as Jt,ch as Zt,ci as Qt,al as te,fH as ee,fI as ie,fR as ae,fS as se,dk as oe,fT as ne,bX as re,Y as le,a_ as de,eY as ce,cM as ue,R as he,cK as ge,fU as me,ay as pe,dy as ve,fV as be,aL as _e,f6 as fe,fW as ye,bZ as $e,b2 as Se,bn as Ae,aU as xe,dA as Te,eu as Ce,dB as Ee,ev as ke,_ as Re,bG as we,b7 as Pe,es as De,eZ as Ge,e_ as Ie}from"./952f98a9.js";import{B as Me,b as Oe}from"./e32b4658.js";import"./4dec7a01.js";import{B as Le,b as Ne}from"./a7a3928b.js";import{f as Ve,g as qe,h as Be,i as He,j as Fe,k as je,l as Ue,a as ze,b as We,c as Ke,d as Xe,B as Ye,e as Je}from"./315263f5.js";import{B as Ze,a as Qe}from"./4eb8d874.js";import{B as ti}from"./40b41b3c.js";import{B as ei,a as ii}from"./a4e2d801.js";import{B as ai}from"./62b11973.js";import{B as si,a as oi}from"./8ce4f6c3.js";import{B as ni,b as ri}from"./aaa76bb8.js";import{B as li,c as di}from"./29a2800d.js";import"./84af4f94.js";import{B as ci,b as ui}from"./e1831171.js";import"./7cfc68eb.js";import{B as hi}from"./a83e7741.js";import{B as gi,b as mi}from"./e0054bd5.js";import{B as pi,b as vi}from"./cad32da5.js";import{B as bi,a as _i,b as fi,c as yi}from"./8e6fdf7b.js";import{B as $i,b as Si}from"./bee1f904.js";import{B as Ai}from"./0b83b988.js";import{B as xi,a as Ti}from"./5d5c4a21.js";const Ci=new e;var Ei=t`:host {
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
${Ci.mediaRules()}`;class ki extends(i(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":s}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:o(),warning:o(),error:n(),success:r()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const s=i;this._stack.push({type:s,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[Ei,l("bbva-notification-container-shared-styles")]}render(){return d`
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
    `}}var Ri=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${u(h.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${u(h.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${u(h.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${u(h.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${u(h.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${u(h.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${u(h.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${u(g.typeMedium)}));
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
`;class wi extends(i(m(p(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":b,"bbva-badge-notification":_}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Ri,l("bbva-header-main-shared-styles"),f("button:focus"),y.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return d`<bbva-icon icon="${c(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return d`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const s=wi.toCamelCase(t),o=`icon${s}`,n=`accessibilityTextIcon${s}`;return d`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${c(this.t(this[n]))}"
      aria-expanded=${c(a)}
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
      .text="${c(this.t(t))}"
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:s}=this;return d`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(s||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${c(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${s}"
            ?hidden="${!s}"
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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}A("colors.primaryCoreLightened"),A("colors.cool80"),A("colors.cool70"),A("colors.primaryCoreLightened"),A("colors.cool100"),A("colors.tertiaryType6Darkened"),A("colors.tertiaryType4Darkened"),A("colors.secondary300");const Pi=x((t=>class extends(T(t)){static configurationScopedElements(){return[ki,C,wi,E]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),d`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||k();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&R()||this.config.faqs&&w())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const s={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",s)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return d`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return d`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));var Di=t`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${u(h.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${u(h.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${u(D.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${u(G.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${u(D.typeLarge)});
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
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
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
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
`,Gi=t`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,Ii=t`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${u(h.primaryMedium)});
}
`;const Mi={light:t`
    ${I.light}
    ${Gi}
  `,dark:t`
    ${I.dark}
    ${Ii}
  `};class Oi extends(M(i(m(p(a))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":O,"bbva-link":L,"bbva-text":v}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=N,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[Di,super.styles,l("bbva-panel-info-shared-styles"),Mi.light,Mi.dark]}get _contentImage(){return this.image?d` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:d`
      <span
        class="${V({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===N}render(){return d`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&d`
          <bbva-text
            tabindex="0"
            class="title ${V({"not-text":!this.text})}"
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
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}A("colors.primaryCoreLightened"),A("colors.primaryCoreLightened"),A("colors.primaryCoreLightened"),A("colors.cool50");const Li=new e;var Ni=t`[ambient^=light] {
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
${Li.mediaRules()}`;const Vi=new e;var qi=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${u(h.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${u(h.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${u(h.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
}
${Vi.mediaRules()}`;const Bi={dark:t`
    ${I.dark}
    ${B.dark}
    ${H.dark}
    ${qi}
  `,light:t`
    ${I.light}
    ${B.light}
    ${H.light}
    ${Ni}
  `},Hi=new e;var Fi=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${u(h.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${u(h.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${u(h.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${u(h.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${u(h.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${u(h.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${u(h.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${u(G.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${u(G.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${u(G.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${u(G.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${u(G.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${u(G.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}
${Hi.mediaRules()}`;class ji extends(m(F(j(M(i(p(a))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[z,L,W,v,K];return ji.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Fi,Bi.light,Bi.dark,f("button:focus"),l("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return d`
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
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return d`
      <bbva-badge-variability
        disabled-tabindex
        .status=${t}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const t=U(this.mask,this.maskChars,!0,this.visibleChars);return d`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),d`
      <dd class=${V({[`wrapper-${e}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){const e="actionLink"===t?`${t}AccessibilityText`:`${t}LinkAccessibilityText`;return d`
      <bbva-link
        class=${V({ellipsis:this[`${t}Ellipsis`]})}
        aria-label="${c(this.t(this[e]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${c(this.roleLink)} aria-live=${c(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,i=`${t}TagText`,a=`${t}RoleText`,s=`${t}AriaLiveText`;return d`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role="${c(this[a])}"
        aria-live="${c(this[s])}"
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag="${c(this[i])}"
      >
      </bbva-text>
    `}_tplText(t){return d` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return d`
      <dl>
        <dt class=${V({ellipsis:this.labelEllipsis})}>
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
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):d` <div class="wrapper-description">${this._tplText("description")}</div> `,d`
      ${t}
      <div class="skeleton"></div>
    `}}A("colors.primaryCoreLightened"),A("colors.primaryCoreLightened"),A("colors.primaryCoreLightened"),A("colors.primaryCoreLightened"),A("colors.cool60"),A("colors.primaryCoreLightened"),A("colors.primarySubdued"),A("colors.primaryMediumLight"),A("colors.primarySubdued"),A("colors.primaryMediumLight"),A("colors.cool50");let Ui=class extends Ve{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}};class zi extends qe{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/parametry`)}toString(){return super.toString("BGADPSavingGoalsParametryGetV0")}}class Wi extends Ui{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals`)}toString(){return super.toString("BGADPSavingGoalsPostV0")}}class Ki extends qe{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals`)}toString(){return super.toString("BGADPSavingGoalsGetV0")}}class Xi extends Ui{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals/{saving-goal-id}/contributions`)}toString(){return super.toString("BGADPSavingGoalsSavingGoalContributionsPostV0")}}class Yi extends qe{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals/{saving-goal-id}/contributions`)}toString(){return super.toString("BGADPSavingGoalsSavingGoalContributionsGetV0")}}class Ji extends qe{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals/{saving-goal-id}/contributions/{contribution-id}`)}toString(){return super.toString("BGADPSavingGoalsSavingGoalContributionsContributionGetV0")}}class Zi extends Be{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals/{saving-goal-id}/contributions/{contribution-id}`)}toString(){return super.toString("BGADPSavingGoalsSavingGoalContributionsContributionDeleteV0")}}class Qi extends qe{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals/{saving-goal-id}/rules`)}toString(){return super.toString("BGADPSavingGoalsSavingGoalRulesGetV0")}}class ta extends Ui{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals/{saving-goal-id}/simulate-savings`)}toString(){return super.toString("BGADPSavingGoalsSavingGoalSimulateSavingsPostV0")}}class ea extends He{static get is(){return"bbva-global-parametry-api-dm"}static get properties(){return{parametry:{type:Object,attribute:!1}}}constructor(){super(),this.parametry={}}resetParametry(){this.parametry={}}getParametry(t={}){if(Object.keys(this.parametry).length)return;this._generateGetService(this._getService("get",{},t),{customEvent:"parametry-api-dm-fetch",errorFireEventHandler:"parametry-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Parametry`,this._getBgadp(a))}_getBgadp(t){return{getParametryV0:()=>new zi(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class ia extends He{static get is(){return"bbva-global-saving-goals-api-dm"}static get properties(){return{savingGoals:{type:Array,attribute:!1}}}constructor(){super(),this.savingGoals=[]}resetSavingGoals(){this.savingGoals=[]}getSavingGoals(t={}){if(Object.keys(this.savingGoals).length)return;this._generateGetService(this._getService("get",{},t),{customEvent:"saving-goals-api-dm-fetch",paginationEvent:"saving-goals-api-dm-pagination",errorFireEventHandler:"saving-goals-api-dm-fetch-error"},this._responseMapping,t.fields)}postSavingGoals(t){this._requestMapping(t);this._generateGetService(this._getService("post",t),{customEvent:"saving-goals-api-dm-create",errorFireEventHandler:"saving-goals-api-dm-create-error"},this._responseMapping),this.resetSavingGoals()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}SavingGoals`,this._getBgadp(a))}_getBgadp(t){return{getSavingGoalsV0:()=>new Ki(t),postSavingGoalsV0:()=>new Wi(t),default:()=>"BGADP called not exist"}}_requestMapping(t={}){return t}_responseMapping(t){return t}}class aa extends He{static get is(){return"bbva-global-saving-goal-contributions-api-dm"}static get properties(){return{savingGoalContributions:{type:Array,attribute:!1}}}constructor(){super(),this.savingGoalContributions=[]}resetSavingGoalContributions(){this.savingGoalContributions=[]}getSavingGoalContributions(t,e={}){if(Object.keys(this.savingGoalContributions).length)return;e=Object.assign({"saving-goal-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"saving-goal-contributions-api-dm-fetch",paginationEvent:"saving-goal-contributions-api-dm-pagination",errorFireEventHandler:"saving-goal-contributions-api-dm-fetch-error"},this._responseMapping,e.fields)}postSavingGoalContributions(t,e){const i={"saving-goal-id":t};this._generateGetService(this._getService("post",e,i),{customEvent:"saving-goal-contributions-api-dm-create",errorFireEventHandler:"saving-goal-contributions-api-dm-create-error"},this._responseMapping),this.resetSavingGoalContributions()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}SavingGoalContributions`,this._getBgadp(a))}_getBgadp(t){return{getSavingGoalContributionsV0:()=>new Yi(t),postSavingGoalContributionsV0:()=>new Xi(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class sa extends He{static get is(){return"bbva-global-saving-goal-contribution-api-dm"}static get properties(){return{savingGoalContribution:{type:Object,attribute:!1}}}constructor(){super(),this.savingGoalContribution={}}resetSavingGoalContribution(){this.savingGoalContribution={}}getSavingGoalContribution(t,e,i={}){if(Object.keys(this.savingGoalContribution).length)return;i=Object.assign({"saving-goal-id":t,"contribution-id":e},i),this._generateGetService(this._getService("get",{},i),{customEvent:"saving-goal-contribution-api-dm-fetch",errorFireEventHandler:"saving-goal-contribution-api-dm-fetch-error"},this._responseMapping,i.fields)}deleteSavingGoalContribution(t,e){const i={"saving-goal-id":t,"contribution-id":e};this._generateGetService(this._getService("delete",{},i),{customEvent:"saving-goal-contribution-api-dm-delete",errorFireEventHandler:"saving-goal-contribution-api-dm-delete-error"},this._responseMapping),this.resetSavingGoalContribution()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}SavingGoalContribution`,this._getBgadp(a))}_getBgadp(t){return{deleteSavingGoalContributionV0:()=>new Zi(t),getSavingGoalContributionV0:()=>new Ji(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class oa extends He{static get is(){return"bbva-global-saving-goal-rules-api-dm"}static get properties(){return{savingGoalRules:{type:Array,attribute:!1}}}constructor(){super(),this.savingGoalRules=[]}resetSavingGoalRules(){this.savingGoalRules=[]}getSavingGoalRules(t,e={}){if(Object.keys(this.savingGoalRules).length)return;e=Object.assign({"saving-goal-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"saving-goal-rules-api-dm-fetch",errorFireEventHandler:"saving-goal-rules-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}SavingGoalRules`,this._getBgadp(a))}_getBgadp(t){return{getSavingGoalRulesV0:()=>new Qi(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}let na=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let s=0|e,o=Math.max(s>=0?s:a-Math.abs(s),0);for(;o<a;){if((n=i[o])===(r=t)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;o++}var n,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],a=0,s="",o=0,n=arguments.length;o!==n;++o){var r=+arguments[o];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?a=i.push(r):(r-=65536,a=i.push(55296+(r>>10),r%1024+56320)),a>=16383&&(s+=t.apply(null,i),i.length=0)}return s+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}},ra=class extends na{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const la=0,da=1,ca="jwt",ua="tsec",ha="none";let ga=class extends na{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=la,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ra,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ua:this.requiredToken=ha,this.requiresJWT=!1):this.requiredToken===ua?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ca?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ha?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ua)}_setJwtHandler(){this._setTokenHandler(ca)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,a)=>{e=Object.assign(e,{resolve:i,reject:a}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=J),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),a=e[i];return a?delete e[i]:this._error(9,`Missing ${i} param value`),a})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===da?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(ua,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(ca,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=e.getItem(i);a&&"null"!==a&&(t[i]=a)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,a)=>(e[a.replace(t,"")]=i.getItem(a),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,a=t===ca?"JWT ":"",s=t===ca?"Authorization":ua;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[i].getItem(o);n?e[s]=e[s]||a+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const a=new Promise(((t,e)=>{i=(i,a)=>{i?e(i):t(a)}}));return e.addEventListener("loadend",(function t(a){e.removeEventListener("loadend",t),a.error?i(a.error):i(null,e.result)})),e.readAsText(t),a}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let a=t[i],s=0,o=0;if(a<=127?(s=0,o=255&a):a<=223?(s=1,o=31&a):a<=239?(s=2,o=15&a):a<=244&&(s=3,o=7&a),t.length-i-s>0){let e=0;for(;e<s;)a=t[i+e+1],o=o<<6|63&a,e+=1}else o=65533,s=t.length-i;e+=String.fromCodePoint(o),i+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let a=": ",s=i[t].split(a);e[s.shift().toLowerCase()]=s.join(a)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,a){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(a)>=0&&(s=e.getResponseHeader(a));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[a])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(i,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,a,s,o;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),a=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),o=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,i=n.authenticationdata||null,a=n.authenticationstate,s=n.authenticationchallenge,o=n.authenticationresponse}return{type:e,data:i,state:a,challenge:s,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const a=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",a=""){let s;if("object"==typeof t&&t){const o=this._getSignatureData(t.signatureType,e,i);s=this._makeKeyValuePairFromObject(o,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,a)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",a)):(s=`${i}=${t}`,this._buildSignatureHeaders(s,e,a)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,a=t.split(",");if(a.length>1){i=a.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:o,data:n,state:r,challenge:l,response:d}=this._extractSignatureResponseHeaders(t),c=this._getRequestMetadata(t);if(s)this._notifySignatureInvalid(c),i=!0;else if(o)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,c,o,n,r,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,o,n,r,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(a),o=this._getRequestMetadata(t);s&&(this._notifyWaitingForProcessResponse(o),i=!0)}return i}_notifySignatureRequiredFirstStep(t,e,i,a){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,a,s,o){this._defineSignatureValue(e,i,a);const n={type:e,data:i,challenge:s,metadata:t};o&&(n.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const a=e.split(";").findIndex((e=>e===t));return i?i.split(";")[a]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,a,s,o){a?this._notifySignatureRequired(t,e,i,a,s,o):this._notifySignatureRequiredFirstStep(t,e,i,a)}_notifySignatureTypeUsingErrorCode(t,e,i,a,s,o,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,a,s):this._notifySignatureRequired(e,i,a,s,o,n)}},ma=class extends ga{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}};class pa extends ma{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`saving-goals/v${this.version}/saving-goals/{saving-goal-id}/simulate-savings`)}toString(){return super.toString("BGADPSavingGoalsSavingGoalSimulateSavingsPostV1")}}class va extends He{static get is(){return"bbva-global-saving-goal-simulate-savings-api-dm"}static get properties(){return{savingGoalSimulateSavings:{type:Object,attribute:!1}}}constructor(){super(),this.savingGoalSimulateSavings={}}resetSavingGoalSimulateSavings(){this.savingGoalSimulateSavings={}}postSavingGoalSimulateSavings(t,e){if(Object.keys(this.savingGoalSimulateSavings).length)return;const i={"saving-goal-id":t};this._generateGetService(this._getService("post",e,i),{customEvent:"saving-goal-simulate-savings-api-dm-fetch",errorFireEventHandler:"saving-goal-simulate-savings-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}SavingGoalSimulateSavings`,this._getBgadp(a))}_getBgadp(t){return{postSavingGoalSimulateSavingsV0:()=>new ta(t),postSavingGoalSimulateSavingsV1:()=>new pa(t),default:()=>"BGADP called not exist"}}_responseMapping(t){if("0"==this.version&&Array.isArray(t)){let e={};e={simulations:[...t]},t=e,this.lastResponse&&(this.lastResponse.data=e)}return t}}class ba extends(Z(a)){_mappingIndicators(t){t.map((t=>{this._removeFields(["name"],t),this._renameProperty(t,"indicatorId","id")}));for(let e=0;e<t.length;e++)"DESTINATION_IMMEDIATE_DEBIT"==t[e].id&&t.splice(e,1);return t}}let _a=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let s=0|e,o=Math.max(s>=0?s:a-Math.abs(s),0);for(;o<a;){if((n=i[o])===(r=t)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;o++}var n,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],a=0,s="",o=0,n=arguments.length;o!==n;++o){var r=+arguments[o];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?a=i.push(r):(r-=65536,a=i.push(55296+(r>>10),r%1024+56320)),a>=16383&&(s+=t.apply(null,i),i.length=0)}return s+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}},fa=class extends _a{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const ya=0,$a=1,Sa="jwt",Aa="tsec",xa="none";let Ta=class extends _a{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=ya,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new fa,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Aa:this.requiredToken=xa,this.requiresJWT=!1):this.requiredToken===Aa?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Sa?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===xa?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Aa)}_setJwtHandler(){this._setTokenHandler(Sa)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,a)=>{e=Object.assign(e,{resolve:i,reject:a}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=J),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),a=e[i];return a?delete e[i]:this._error(9,`Missing ${i} param value`),a})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===$a?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Aa,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(Sa,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=e.getItem(i);a&&"null"!==a&&(t[i]=a)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,a)=>(e[a.replace(t,"")]=i.getItem(a),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,a=t===Sa?"JWT ":"",s=t===Sa?"Authorization":Aa;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[i].getItem(o);n?e[s]=e[s]||a+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const a=new Promise(((t,e)=>{i=(i,a)=>{i?e(i):t(a)}}));return e.addEventListener("loadend",(function t(a){e.removeEventListener("loadend",t),a.error?i(a.error):i(null,e.result)})),e.readAsText(t),a}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let a=t[i],s=0,o=0;if(a<=127?(s=0,o=255&a):a<=223?(s=1,o=31&a):a<=239?(s=2,o=15&a):a<=244&&(s=3,o=7&a),t.length-i-s>0){let e=0;for(;e<s;)a=t[i+e+1],o=o<<6|63&a,e+=1}else o=65533,s=t.length-i;e+=String.fromCodePoint(o),i+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let a=": ",s=i[t].split(a);e[s.shift().toLowerCase()]=s.join(a)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,a){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(a)>=0&&(s=e.getResponseHeader(a));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[a])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(i,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,a,s,o;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),a=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),o=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,i=n.authenticationdata||null,a=n.authenticationstate,s=n.authenticationchallenge,o=n.authenticationresponse}return{type:e,data:i,state:a,challenge:s,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const a=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",a=""){let s;if("object"==typeof t&&t){const o=this._getSignatureData(t.signatureType,e,i);s=this._makeKeyValuePairFromObject(o,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,a)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",a)):(s=`${i}=${t}`,this._buildSignatureHeaders(s,e,a)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,a=t.split(",");if(a.length>1){i=a.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:o,data:n,state:r,challenge:l,response:d}=this._extractSignatureResponseHeaders(t),c=this._getRequestMetadata(t);if(s)this._notifySignatureInvalid(c),i=!0;else if(o)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,c,o,n,r,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,o,n,r,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(a),o=this._getRequestMetadata(t);s&&(this._notifyWaitingForProcessResponse(o),i=!0)}return i}_notifySignatureRequiredFirstStep(t,e,i,a){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,a,s,o){this._defineSignatureValue(e,i,a);const n={type:e,data:i,challenge:s,metadata:t};o&&(n.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const a=e.split(";").findIndex((e=>e===t));return i?i.split(";")[a]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,a,s,o){a?this._notifySignatureRequired(t,e,i,a,s,o):this._notifySignatureRequiredFirstStep(t,e,i,a)}_notifySignatureTypeUsingErrorCode(t,e,i,a,s,o,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,a,s):this._notifySignatureRequired(e,i,a,s,o,n)}},Ca=class extends Ta{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}},Ea=class extends Ta{constructor(t=null){super(Object.assign(t||{},{method:"PATCH"}))}toString(t=""){return super.toString(t||"BGADPRequestPATCH")}},ka=class extends Ta{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}};class Ra extends Ca{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsGetV0")}}class wa extends ka{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts`)}toString(){return super.toString("BGADPAccountsPostV0")}}class Pa extends Ca{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}`)}toString(){return super.toString("BGADPAccountsAccountGetV0")}}class Da extends Ea{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}`)}toString(){return super.toString("BGADPAccountsAccountPatchV0")}}class Ga extends Ca{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/indicators`)}toString(){return super.toString("BGADPAccountsAccountIndicatorsGetV0")}}class Ia extends Ca{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/limits`)}toString(){return super.toString("BGADPAccountsAccountLimitsGetV0")}}class Ma extends Ca{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class Oa extends Ca{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/balances`)}toString(){return super.toString("BGADPAccountsBalancesGetV0")}}class La extends ka{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/offers/{offer-id}/simulate`)}toString(){return super.toString("BGADPAccountsOffersOfferSimulatePostV0")}}class Na extends ba{static get is(){return"bbva-global-accounts-base-api-dm"}resetAccounts(){this.accounts=[]}getAccounts(t){this._paramsMapping(t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postAccounts(t){this._requestMapping(t),this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping),this.resetAccounts()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Accounts`,this._getBgadp(a))}_getBgadp(t){return{getAccountsV1:()=>new ti(t),getAccountsV0:()=>new Ra(t),postAccountsV0:()=>new wa(t),postAccountsV1:()=>new Ze(t),default:()=>"BGADP does not exist."}}_renameQueryParam(t,e,i){e in t&&(t[i]=t[e],delete t[e])}_paramsMapping(t){return"0"==this.version?(this._renameProperty(t,"currency","currencies.currency"),this._renameQueryParam(t,"indicators.id","indicators.indicatorId"),t):t}_responseMapping(t){if(Array.isArray(t)){if("0"==this.version&&Object.keys(t).length)for(let e=0;e<t.length;e++)this._renameProperty(t[e],"accountId","id"),this._renameProperty(t[e],"title","product"),t[e].bank&&(t[e].bank.id=t[e].bank.bankId,this._removeFields(["branch","bankId"],t[e].bank)),this._removeFields(["commercialPackage","openingDate","currencies","disposedBalance","image","meta","offerId","delivery","accountAgreement"],t[e]),this._removeFields(["previousMonthAverageBalance"],t[e].availableBalance),this._removeFields(["subType"],t[e].accountType),this._removeFields(["reason","reasonDescription"],t[e].status),t[e].indicators&&t[e].indicators.length&&(t[e].indicators=this._mappingIndicators(t[e].indicators));return t}return this._postResponseMapping(t)}_postResponseMapping(t){return"0"==this.version&&Object.keys(t).length&&(this._renameProperty(t,"accountId","id"),t.customizedFormats&&t.customizedFormats.forEach((t=>{this._renameProperty(t,"customizedFormatId","id")})),this._renameProperty(t,"joint","jointSignatureType"),this._renameProperty(t,"title","product"),t.bank&&(this._renameProperty(t.bank,"bankId","id"),this._renameProperty(t.bank.branch,"branchId","id")),t.participants.forEach((t=>{var e;this._renameProperty(t,"participantId","id"),"NATURAL_PERSON"===t.personType?(t.customDetails={personType:"NATURAL_UNKNOWN"},t.firstName&&(t.customDetails={...t.customDetails,firstName:t.firstName}),t.middleName&&(t.customDetails={...t.customDetails,middleName:t.middleName}),t.lastName&&(t.customDetails={...t.customDetails,lastName:t.lastName}),t.secondLastName&&(t.customDetails={...t.customDetails,secondLastName:t.secondLastName}),t.identityDocument&&(t.customDetails.identityDocuments=[{documentNumber:t.identityDocument.documentNumber,documentType:{id:t.identityDocument.documentType}}]),this._removeFields(["personType","firstName","middleName","lastName","secondLastName","identityDocument"],t)):"LEGAL_PERSON"===t.personType&&(t.customDetails={personType:"LEGAL_UNKNOWN"},t.legalName&&(t.customDetails={...t.customDetails,legalName:t.legalName}),t.identityDocument&&(t.customDetails.businessDocuments=[{documentNumber:t.identityDocument.documentNumber,documentType:{id:t.identityDocument.documentType}}]),this._removeFields(["personType","legalName","identityDocument"],t)),null!==(e=t.participantType)&&void 0!==e&&e.order&&(t.order=t.participantType.order,this._removeFields(["order"],t.participantType)),this._removeFields(["suffix","documents"],t)})),t.conditions&&t.conditions.forEach((t=>{this._renameProperty(t,"conditionId","id"),this._removeFields(["period","facts","outcomes"],t)})),t.delivery&&(t.deliveries=t.delivery,this._removeFields(["delivery"],t),t.deliveries.forEach((t=>{"VIRTUAL"===t.deliveryType?t.method="DIGITAL":"PHYSICAL"===t.deliveryType&&(t.method="STANDARD"),t.address&&this._renameProperty(t.address,"addressType","deliveryAddressType"),t.destination.branch&&(t.destination.bank={branch:t.destination.branch},this._removeFields(["branch"],t.destination)),t.contactDetails[0].contactDetail&&t.contactDetails[0].contactDetail.contactDetailId&&(t.contactDetails={id:t.contactDetails[0].contactDetail.contactDetailId,deliveryContactType:"STORED"}),t.documentType&&(t.serviceType={id:t.documentType},this._removeFields(["documentType"],t)),this._removeFields(["deliveryType"],t)}))),t.fees&&t.fees.itemizeFees.forEach((t=>{this._renameProperty(t,"name","description"),t.itemizeFeeUnits=[{unitType:"AMOUNT",amount:t.feeAmount.amount,currency:t.feeAmount.currency}],t.feeAmount.percentage&&t.itemizeFeeUnits.push({unitType:"PERCENTAGE",percentage:t.feeAmount.percentage}),this._removeFields(["feeAmount"],t)})),t.rates&&t.rates.forEach((t=>{t.itemizeRates=[{rateType:t.rateType.id,itemizeRateUnits:[t.unit]}],this._renameProperty(t.itemizeRates[0].itemizeRateUnits[0],"mode","unitType"),t.rateType.name&&(t.itemizeRates=[{...t.itemizeRates[0],description:t.rateType.name}]),this._removeFields(["rateType","unit"],t)})),t.operationNumber&&(t.operationTracking={operationNumber:t.operationNumber}),t.relatedContracts&&t.relatedContracts.forEach((t=>{this._renameProperty(t.relationType,"name","description"),t.contractDetails={number:t.number,contractType:"INTERNAL_CONTRACT"},this._removeFields(["number"],t)})),this._removeFields(["businessType","operationNumber","accountFamily","billingInformation","offerId"],t)),t}_requestMapping(t){return"0"==this.version&&(t.bank&&(this._renameProperty(t.bank,"id","bankId"),this._renameProperty(t.bank.branch,"id","branchId")),this._renameProperty(t,"jointSignatureType","joint"),this._renameProperty(t,"product","title"),this._removeFields(["subproduct"],t.title),t.limits&&t.limits.forEach((t=>{this._renameProperty(t,"id","limitId")})),t.indicators&&t.indicators.forEach((t=>{this._renameProperty(t,"id","indicatorId")})),t.participants.forEach((t=>{var e,i,a,s,o,n;null!==(e=t.customDetails)&&void 0!==e&&e.firstName&&(t.firstName=t.customDetails.firstName),null!==(i=t.customDetails)&&void 0!==i&&i.middleName&&(t.middleName=t.customDetails.middleName),null!==(a=t.customDetails)&&void 0!==a&&a.lastName&&(t.lastName=t.customDetails.lastName),null!==(s=t.customDetails)&&void 0!==s&&s.secondLastName&&(t.secondLastName=t.customDetails.secondLastName),null!==(o=t.customDetails)&&void 0!==o&&o.identityDocuments?t.identityDocument={documentNumber:t.customDetails.identityDocuments[0].documentNumber,documentType:t.customDetails.identityDocuments[0].documentType.id}:null!==(n=t.customDetails)&&void 0!==n&&n.businessDocuments&&(t.identityDocument={documentNumber:t.customDetails.businessDocuments[0].documentNumber,documentType:t.customDetails.businessDocuments[0].documentType.id}),this._removeFields(["customDetails"],t)})),t.conditions&&t.conditions.forEach((t=>{this._renameProperty(t,"id","conditionId"),this._removeFields(["isNegotiable","conditionType","formats"],t)})),t.relatedContracts&&t.relatedContracts.forEach((t=>{"INTERNAL_CONTRACT"===t.contractDetails.contractType&&(t.contractId=t.contractDetails.contractId),this._removeFields(["contractDetails"],t)})),t.deliveries&&(t.delivery=t.deliveries,this._removeFields(["deliveries"],t),t.delivery.forEach((t=>{if(this._renameProperty(t,"method","deliveryType"),"DIGITAL"===t.deliveryType?t.deliveryType="VIRTUAL":"STANDARD"===t.deliveryType?t.deliveryType="PHYSICAL":this._removeFields(["deliveryType"],t),t.destination.bank&&(t.destination={...t.destination,branch:t.destination.bank.branch},this._removeFields(["bank"],t.destination)),t.contactDetails&&"STORED"===t.contactDetails.deliveryContactType){let e=[{contactDetail:{contactDetailId:t.contactDetails.id}}];t.contactDetails=e}else this._removeFields(["contactDetails"],t);t.address&&"STORED"===t.address.deliveryAddressType?this._renameProperty(t.address,"deliveryAddressType","addressType"):this._removeFields(["address"],t),this._removeFields(["deliverySchedules","serviceType","packagingtype"],t)})))),t}_paginationMapping(t){return t}}Q(Na,"GET_EVENTS",{customEvent:"accounts-api-dm-fetch",paginationEvent:"accounts-api-dm-pagination",errorFireEventHandler:"accounts-api-dm-fetch-error"}),Q(Na,"POST_EVENTS",{customEvent:"accounts-api-dm-create",errorFireEventHandler:"accounts-api-dm-create-error"}),customElements.define(Na.is,Na);class Va extends ba{static get is(){return"bbva-global-accounts-api-dm"}static get properties(){return{accounts:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.accounts=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accounts"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./36b88e44.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}Accounts`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaAccounts${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-accounts-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-accounts-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=Na.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetAccounts(){await this.module.updateComplete,this.module.resetAccounts()}async getAccounts(t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:t}):this._requestParams={get:[{params:t}]}}async _getAccounts(){await this.module.updateComplete,Object.keys(this.accounts).length||(this._requestParams.get.forEach((t=>{this.module.getAccounts(t.params)})),delete this._requestParams.get)}async postAccounts(t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:t}):this._requestParams={post:[{body:t}]}}async _postAccounts(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postAccounts(t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return d` ${this._module?this._module:""}`}}class qa extends ba{static get is(){return"bbva-global-account-api-dm"}static get properties(){return{account:{type:Object,attribute:!1}}}constructor(){super(),this.account={}}resetAccount(){this.account={}}getAccount(t,e={}){if(Object.keys(this.account).length)return;e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"account-api-dm-fetch",errorFireEventHandler:"account-api-dm-fetch-error"},this._responseMapping,e.fields)}patchAccount(t,e){const i={"account-id":t};this._generateGetService(this._getService("patch",e,i),{customEvent:"account-api-dm-update",errorFireEventHandler:"account-api-dm-update-error"},this._responseMapping),this.resetAccount()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Account`,this._getBgadp(a))}_getBgadp(t){return{getAccountV2:()=>new tt(t),getAccountV0:()=>new Pa(t),patchAccountV0:()=>new Da(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return"0"==this.version&&Object.keys(t).length&&(this._renameProperty(t,"accountId","id"),this._renameProperty(t,"title","product")),t}}class Ba extends ba{static get is(){return"bbva-global-account-transactions-base-api-dm"}resetAccountTransactions(){this.accountTransactions=[]}getAccountTransactions(t,e){this._paramsMapping(e),e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountTransactions`,this._getBgadp(a))}_getBgadp(t){return{getAccountTransactionsV2:()=>new et(t),getAccountTransactionsV0:()=>new Ma(t),default:()=>"BGADP does not exist."}}_paramsMappingCanonical(t){if("0"==this.version){this._removeFields(["customerId"],t),t["transactionType.id"]&&(t["transactionType.id"]=t["transactionType.id"].toString()),t["status.id"]&&(t["status.id"]=t["status.id"].toString());let e=Object.keys(t);for(let i=0;i<e.length;i++){let a=e[i];if("operationAmount.id"===a&&"LOCAL_AMOUNT"===t[a])for(let i=0;i<e.length;i++)"operationAmount.fromAmount"===e[i]?this._renameQueryParam(t,"operationAmount.fromAmount","fromLocalAmount.amount"):"operationAmount.toAmount"===e[i]?this._renameQueryParam(t,"operationAmount.toAmount","toLocalAmount.amount"):"operationAmount.currency"===e[i]&&this._renameQueryParam(t,"operationAmount.currency","localAmount.currency");this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],t)}}return t}_renameQueryParam(t,e,i){e in t&&(t[i]=t[e],delete t[e])}_paramsMapping(t){return this._paramsMappingCanonical(t),t}responseMappingCanonical(t){if("0"==this.version&&Object.keys(t).length)for(let e=0;e<t.length;e++){this._renameProperty(t[e],"valuationDate","valueDate"),this._renameProperty(t[e].contract.numberType,"name","description"),this._removeFields(["category","exchangeRate","fundsOrigin"],t[e]),this._removeFields(["product","bank"],t[e].contract),this._removeFields(["description"],t[e].transactionType),this._removeFields(["updateDate"],t[e].status);const i=t[e].classification;i&&(this._removeFields(["pfmId","customName"],i),this._removeFields(["customName"],i.category),this._removeFields(["customName"],i.category.subcategory));const a=t[0].additionalInformation;this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],a),a&&a.branch&&(t[e].branch={id:a.branch.id,name:a.branch.name},this._removeFields(["branch"],a)),a&&a.updatedBalance&&(a.balances=[{id:"UPDATED_BALANCE",amount:a.updatedBalance.amount,currency:a.updatedBalance.currency}],this._removeFields(["updatedBalance"],a)),t[e].localAmount&&(t[e].operationAmounts=[{id:"LOCAL_AMOUNT",amount:t[e].localAmount.amount,currency:t[e].localAmount.currency}],this._removeFields(["localAmount"],t[e]));const s=t[e].operationAmounts[0];t[e].originAmount&&(t[e].operationAmounts=[s,{id:"ORIGIN_AMOUNT",amount:t[e].originAmount.amount,currency:t[e].originAmount.currency}],this._removeFields(["originAmount"],t[e]))}return t}_responseMapping(t){return this.responseMappingCanonical(t),t}}Q(Ba,"GET_EVENTS",{customEvent:"account-transactions-api-dm-fetch",paginationEvent:"account-transactions-api-dm-pagination",errorFireEventHandler:"account-transactions-api-dm-fetch-error"}),customElements.define(Ba.is,Ba);class Ha extends ba{static get is(){return"bbva-global-account-transactions-api-dm"}static get properties(){return{accountTransactions:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.accountTransactions=[],this.country="",this.localCustomProperties={},this._countries=["Es"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accountTransactions"],this._loaded=!1,this._requestParams={},this._modules={Es:()=>import("./50e709f8.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}AccountTransactions`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaAccountTransactions${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-account-transactions-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-account-transactions-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=Ba.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetAccountTransactions(){await this.module.updateComplete,this.module.resetAccountTransactions()}async getAccountTransactions(t,e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({accountId:t,params:e}):this._requestParams={get:[{accountId:t,params:e}]}}async _getAccountTransactions(){await this.module.updateComplete,Object.keys(this.accountTransactions).length||(this._requestParams.get.forEach((t=>{this.module.getAccountTransactions(t.accountId,t.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return d` ${this._module?this._module:""}`}}class Fa extends ba{static get is(){return"bbva-global-balances-api-dm"}static get properties(){return{balances:{type:Array,attribute:!1}}}constructor(){super(),this.balances=[]}resetBalances(){this.balances=[]}getBalances(t={}){if(Object.keys(this.balances).length)return;this._generateGetService(this._getService("get",{},t),{customEvent:"balances-api-dm-fetch",errorFireEventHandler:"balances-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Balances`,this._getBgadp(a))}_getBgadp(t){return{getBalancesV0:()=>new Oa(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class ja extends ba{static get is(){return"bbva-global-account-participants-base-api-dm"}resetAccountParticipants(){this.accountParticipants=[]}getAccountParticipants(t,e={}){this._paramsMapping(e),e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}postAccountParticipants(t,e){const i={"account-id":t};this._generateGetService(this._getService("post",e,i),this.constructor.POST_EVENTS),this.resetAccountParticipants()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountParticipants`,this._getBgadp(a))}_getBgadp(t){return{getAccountParticipantsV2:()=>new ei(t),getAccountParticipantsV1:()=>new it(t),postAccountParticipantsV1:()=>new at(t),default:()=>"BGADP does not exist."}}_paramsMapping(t){return"1"==this.version&&(t={}),t}_responseMapping(t){return"1"==this.version&&t.length>0&&t.forEach((t=>{"NATURAL_KNOWN"==t.customDetails.personType?this._removeFields(["nonCustomerId","suffix","birthDate","identityDocuments","relationType","participationPercentage"],t.customDetails):"LEGAL_KNOWN"==t.customDetails.personType||this._removeFields(["customDetails"],t),this._removeFields(["description"],t.participantType)})),t}}Q(ja,"GET_EVENTS",{customEvent:"account-participants-api-dm-fetch",errorFireEventHandler:"account-participants-api-dm-fetch-error"}),Q(ja,"POST_EVENTS",{customEvent:"account-participants-api-dm-create",errorFireEventHandler:"account-participants-api-dm-create-error"}),customElements.define(ja.is,ja);class Ua extends ba{static get is(){return"bbva-global-account-participants-api-dm"}static get properties(){return{accountParticipants:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.accountParticipants=[],this.country="",this.localCustomProperties={},this._countries=["Es"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accountParticipants"],this._loaded=!1,this._requestParams={},this._modules={Es:()=>import("./21aa8915.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}AccountParticipants`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaAccountParticipants${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-account-participants-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-account-participants-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=ja.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetAccountParticipants(){await this.module.updateComplete,this.module.resetAccountParticipants()}async getAccountParticipants(t,e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({accountId:t,params:e}):this._requestParams={get:[{accountId:t,params:e}]}}async _getAccountParticipants(){await this.module.updateComplete,Object.keys(this.accountParticipants).length||(this._requestParams.get.forEach((t=>{this.module.getAccountParticipants(null==t?void 0:t.accountId,null==t?void 0:t.params)})),delete this._requestParams.get)}async postAccountParticipants(t,e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({accountId:t,body:e}):this._requestParams={post:[{accountId:t,body:e}]}}async _postAccountParticipants(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postAccountParticipants(null==t?void 0:t.accountId,null==t?void 0:t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return d` ${this._module?this._module:""}`}}class za extends ba{static get is(){return"bbva-global-account-limits-base-api-dm"}resetAccountLimits(){this.accountLimits=[]}getAccountLimits(t,e){e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountLimits`,this._getBgadp(a))}_getBgadp(t){return{getAccountLimitsV0:()=>new Ia(t),getAccountLimitsV2:()=>new Qe(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return this._responseMappingCanonical(t),t}_responseMappingCanonical(t){"0"==this.version&&Object.keys(t).length&&t.map((t=>{this._renameProperty(t,"limitId","id"),this._removeFields(["name"],t)}))}}Q(za,"GET_EVENTS",{customEvent:"account-limits-api-dm-fetch",errorFireEventHandler:"account-limits-api-dm-fetch-error"}),customElements.define(za.is,za);class Wa extends ba{static get is(){return"bbva-global-account-limits-api-dm"}static get properties(){return{accountLimits:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object}}}constructor(){super(),this.accountLimits=[],this.country="",this.localCustomProperties={},this._countries=["Es"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","accountLimits"],this._modules={Es:()=>import("./30154f28.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&this._module&&this[e]!==t&&(this._module[e]=this[e])}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaAccountLimits${t}ApiDm`,i=this._modules[t];try{const t=await i();this._module=this._createModuleElement(t[e].is),await this.updateComplete,this._dispatchEvent("bbva-global-account-limits-api-dm-module-load")}catch(t){this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-account-limits-api-dm-module-error",t)}}else this._module=this._createModuleElement();this._module&&this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=za.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetAccountLimits(){await this.module.updateComplete,this.module.resetAccountLimits()}async getAccountLimits(t,e={}){await this.module.updateComplete,Object.keys(this.accountLimits).length||this.module.getAccountLimits(t,e)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return d` ${this._module?this._module:""}`}}class Ka extends ba{static get is(){return"bbva-global-documents-dossiers-api-dm"}static get properties(){return{documentsDossiers:{type:Array,attribute:!1}}}constructor(){super(),this.documentsDossiers=[]}resetDocumentsDossiers(){this.documentsDossiers=[]}getDocumentsDossiers(t={}){if(Object.keys(this.documentsDossiers).length)return;this._generateGetService(this._getService("get",{},t),{customEvent:"documents-dossiers-api-dm-fetch",errorFireEventHandler:"documents-dossiers-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}DocumentsDossiers`,this._getBgadp(a))}_getBgadp(t){return{getDocumentsDossiersV1:()=>new st(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Xa extends ba{static get is(){return"bbva-global-child-account-money-requests-api-dm"}constructor(){super()}postChildAccountMoneyRequests(t,e){const i={"child-account-id":t};this._generateGetService(this._getService("post",e,i),{customEvent:"child-account-money-requests-api-dm-create",errorFireEventHandler:"child-account-money-requests-api-dm-create-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}ChildAccountMoneyRequests`,this._getBgadp(a))}_getBgadp(t){return{postChildAccountMoneyRequestsV1:()=>new ai(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Ya extends ba{static get is(){return"bbva-global-offer-simulate-api-dm"}static get properties(){return{offerSimulate:{type:Object,attribute:!1}}}constructor(){super(),this.offerSimulate={}}resetOfferSimulate(){this.offerSimulate={}}postOfferSimulate(t,e){if(Object.keys(this.offerSimulate).length)return;const i={"offer-id":t};this._generateGetService(this._getService("post",e,i),{customEvent:"offer-simulate-api-dm-fetch",errorFireEventHandler:"offer-simulate-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}OfferSimulate`,this._getBgadp(a))}_getBgadp(t){return{postOfferSimulateV0:()=>new La(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class Ja extends ba{static get is(){return"bbva-global-account-indicators-api-dm"}static get properties(){return{accountIndicators:{type:Array,attribute:!1}}}constructor(){super(),this.accountIndicators=[]}resetAccountIndicators(){this.accountIndicators=[]}getAccountIndicators(t,e={}){if(Object.keys(this.accountIndicators).length)return;this._paramsMapping(e);e=Object.assign({"account-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"account-indicators-api-dm-fetch",errorFireEventHandler:"account-indicators-api-dm-fetch-error"},this._responseMapping,e.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountIndicators`,this._getBgadp(a))}_getBgadp(t){return{getAccountIndicatorsV0:()=>new Ga(t),getAccountIndicatorsV1:()=>new si(t),getAccountIndicatorsV2:()=>new oi(t),default:()=>"BGADP called not exist"}}_paramsMapping(t){return"0"!=this.version&&"1"!=this.version||this._removeFields(["customerId"],t),t}_responseMapping(t){return"0"==this.version&&t.length>0&&(t=this._mappingIndicators(t)),t}}class Za extends ba{static get is(){return"bbva-global-accounts-opening-child-account-base-api-dm"}postAccountsOpeningChildAccount(t){this._generateGetService(this._getService("post",t),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}AccountsOpeningChildAccount`,this._getBgadp(a))}_getBgadp(t){return{postAccountsOpeningChildAccountV3:()=>new ii(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}Q(Za,"POST_EVENTS",{customEvent:"accounts-opening-child-account-api-dm-create",errorFireEventHandler:"accounts-opening-child-account-api-dm-create-error"}),customElements.define(Za.is,Za);class Qa extends ba{static get is(){return"bbva-global-accounts-opening-child-account-api-dm"}static get properties(){return{country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./a6fecd13.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&"_requestParams"!==e&&"_loaded"!==e&&this._module&&this[e]!==t?this._module[e]=this[e]:("_requestParams"===e&&this._requestParams&&this._requestParams!==t&&void 0!==t&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===e&&this._loaded)&&Object.entries(this._requestParams).forEach((([t])=>{this[`_${t}AccountsOpeningChildAccount`]()}))}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaAccountsOpeningChildAccount${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-accounts-opening-child-account-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-accounts-opening-child-account-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=Za.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async postAccountsOpeningChildAccount(t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:t}):this._requestParams={post:[{body:t}]}}async _postAccountsOpeningChildAccount(){await this.module.updateComplete,this._requestParams.post.forEach((t=>{this.module.postAccountsOpeningChildAccount(t.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return d` ${this._module?this._module:""}`}}customElements.define(qa.is,qa),customElements.define(Ua.is,Ua),customElements.define(Va.is,Va),customElements.define(Ha.is,Ha),customElements.define(Fa.is,Fa),customElements.define(Wa.is,Wa),customElements.define(Ka.is,Ka),customElements.define(Xa.is,Xa),customElements.define(Ya.is,Ya),customElements.define(Ja.is,Ja),customElements.define(Qa.is,Qa);class ts extends Fe{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`self-driven/v${this.version}/rules/{rule-id}/transactions`)}toString(){return super.toString("BGADPSelfDrivenRulesRuleTransactionsGetV2")}}class es extends je{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`self-driven/v${this.version}/rules/suggested-rules`)}toString(){return super.toString("BGADPSelfDrivenRulesSuggestedRulesPostV2")}}class is extends Ue{static get is(){return"bbva-global-rule-transactions-api-dm"}static get properties(){return{ruleTransactions:{type:Array,attribute:!1}}}constructor(){super(),this.ruleTransactions=[]}resetRuleTransactions(){this.ruleTransactions=[]}getRuleTransactions(t,e={}){if(!Object.keys(this.ruleTransactions).length){e=Object.assign({"rule-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"rule-transactions-api-dm-fetch",paginationEvent:"rule-transactions-api-dm-pagination",errorFireEventHandler:"rule-transactions-api-dm-fetch-error"},this._responseMapping,e.fields)}}_getService(t,e={},i={}){var a=this._getServiceParams(i,e);return this._getServicePath(`${t}RuleTransactions`,this._getBgadp(a))}_getBgadp(t){return{getRuleTransactionsV2:()=>new ts(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class as extends Ue{static get is(){return"bbva-global-rules-suggested-rules-api-dm"}constructor(){super()}postRulesSuggestedRules(t){this._generateGetService(this._getService("post",t),{customEvent:"rules-suggested-rules-api-dm-create",errorFireEventHandler:"rules-suggested-rules-api-dm-create-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}RulesSuggestedRules`,this._getBgadp(a))}_getBgadp(t){return{postRulesSuggestedRulesV2:()=>new es(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class ss{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let s=0|e,o=Math.max(s>=0?s:a-Math.abs(s),0);for(;o<a;){if((n=i[o])===(r=t)||"number"==typeof n&&"number"==typeof r&&isNaN(n)&&isNaN(r))return!0;o++}var n,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],a=0,s="",o=0,n=arguments.length;o!==n;++o){var r=+arguments[o];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?a=i.push(r):(r-=65536,a=i.push(55296+(r>>10),r%1024+56320)),a>=16383&&(s+=t.apply(null,i),i.length=0)}return s+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}}class os extends ss{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const ns=0,rs=1,ls="jwt",ds="tsec",cs="none";class us extends ss{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=ns,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new os,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ds:this.requiredToken=cs,this.requiresJWT=!1):this.requiredToken===ds?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ls?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===cs?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ds)}_setJwtHandler(){this._setTokenHandler(ls)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,a)=>{e=Object.assign(e,{resolve:i,reject:a}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=J),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),a=e[i];return a?delete e[i]:this._error(9,`Missing ${i} param value`),a})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===rs?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(ds,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(ls,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=e.getItem(i);a&&"null"!==a&&(t[i]=a)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,a)=>(e[a.replace(t,"")]=i.getItem(a),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,a=t===ls?"JWT ":"",s=t===ls?"Authorization":ds;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[i].getItem(o);n?e[s]=e[s]||a+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const a=new Promise(((t,e)=>{i=(i,a)=>{i?e(i):t(a)}}));return e.addEventListener("loadend",(function t(a){e.removeEventListener("loadend",t),a.error?i(a.error):i(null,e.result)})),e.readAsText(t),a}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let a=t[i],s=0,o=0;if(a<=127?(s=0,o=255&a):a<=223?(s=1,o=31&a):a<=239?(s=2,o=15&a):a<=244&&(s=3,o=7&a),t.length-i-s>0){let e=0;for(;e<s;)a=t[i+e+1],o=o<<6|63&a,e+=1}else o=65533,s=t.length-i;e+=String.fromCodePoint(o),i+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let a=": ",s=i[t].split(a);e[s.shift().toLowerCase()]=s.join(a)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,a){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(a)>=0&&(s=e.getResponseHeader(a));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[a])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(i,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,a,s,o;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),a=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),o=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,i=n.authenticationdata||null,a=n.authenticationstate,s=n.authenticationchallenge,o=n.authenticationresponse}return{type:e,data:i,state:a,challenge:s,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const a=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",a=""){let s;if("object"==typeof t&&t){const o=this._getSignatureData(t.signatureType,e,i);s=this._makeKeyValuePairFromObject(o,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,a)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",a)):(s=`${i}=${t}`,this._buildSignatureHeaders(s,e,a)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,a=t.split(",");if(a.length>1){i=a.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:o,data:n,state:r,challenge:l,response:d}=this._extractSignatureResponseHeaders(t),c=this._getRequestMetadata(t);if(s)this._notifySignatureInvalid(c),i=!0;else if(o)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,c,o,n,r,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,o,n,r,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(a),o=this._getRequestMetadata(t);s&&(this._notifyWaitingForProcessResponse(o),i=!0)}return i}_notifySignatureRequiredFirstStep(t,e,i,a){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,a,s,o){this._defineSignatureValue(e,i,a);const n={type:e,data:i,challenge:s,metadata:t};o&&(n.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const a=e.split(";").findIndex((e=>e===t));return i?i.split(";")[a]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,a,s,o){a?this._notifySignatureRequired(t,e,i,a,s,o):this._notifySignatureRequiredFirstStep(t,e,i,a)}_notifySignatureTypeUsingErrorCode(t,e,i,a,s,o,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,a,s):this._notifySignatureRequired(e,i,a,s,o,n)}}class hs extends us{constructor(t=null){super(Object.assign(t||{},{method:"DELETE"}))}toString(t=""){return super.toString(t||"BGADPRequestDELETE")}}class gs extends us{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class ms extends us{constructor(t=null){super(Object.assign(t||{},{method:"PATCH"}))}toString(t=""){return super.toString(t||"BGADPRequestPATCH")}}class ps extends us{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}}class vs extends gs{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`transfers-management/v${this.version}/scheduled-transfers`)}toString(){return super.toString("BGADPTransfersManagementScheduledTransfersGetV0")}}class bs extends ps{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`transfers-management/v${this.version}/scheduled-transfers`)}toString(){return super.toString("BGADPTransfersManagementScheduledTransfersPostV0")}}class _s extends ms{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`transfers-management/v${this.version}/scheduled-transfers`)}toString(){return super.toString("BGADPTransfersManagementScheduledTransfersPatchV0")}}class fs extends gs{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`transfers-management/v${this.version}/scheduled-transfers/{scheduled-transfer-id}`)}toString(){return super.toString("BGADPTransfersManagementScheduledTransfersScheduledTransferGetV0")}}class ys extends ms{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`transfers-management/v${this.version}/scheduled-transfers/{scheduled-transfer-id}`)}toString(){return super.toString("BGADPTransfersManagementScheduledTransfersScheduledTransferPatchV0")}}class $s extends hs{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`transfers-management/v${this.version}/scheduled-transfers/{scheduled-transfer-id}`)}toString(){return super.toString("BGADPTransfersManagementScheduledTransfersScheduledTransferDeleteV0")}}class Ss extends(Z(a)){}class As extends Ss{static get is(){return"bbva-global-scheduled-transfers-api-dm"}static get properties(){return{scheduledTransfers:{type:Array,attribute:!1}}}constructor(){super(),this.scheduledTransfers=[]}resetScheduledTransfers(){this.scheduledTransfers=[]}getScheduledTransfers(t={}){if(Object.keys(this.scheduledTransfers).length)return;this._generateGetService(this._getService("get",{},t),{customEvent:"scheduled-transfers-api-dm-fetch",paginationEvent:"scheduled-transfers-api-dm-pagination",errorFireEventHandler:"scheduled-transfers-api-dm-fetch-error"},this._responseMapping,t.fields)}patchScheduledTransfers(t){this._generateGetService(this._getService("patch",t,{}),{customEvent:"scheduled-transfers-api-dm-update",errorFireEventHandler:"scheduled-transfers-api-dm-update-error"},this._responseMapping),this.resetScheduledTransfers()}postScheduledTransfers(t){this._generateGetService(this._getService("post",t),{customEvent:"scheduled-transfers-api-dm-create",errorFireEventHandler:"scheduled-transfers-api-dm-create-error"},this._responseMapping),this.resetScheduledTransfers()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}ScheduledTransfers`,this._getBgadp(a))}_getBgadp(t){return{getScheduledTransfersV0:()=>new vs(t),patchScheduledTransfersV0:()=>new _s(t),postScheduledTransfersV0:()=>new bs(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class xs extends Ss{static get is(){return"bbva-global-scheduled-transfer-api-dm"}static get properties(){return{scheduledTransfer:{type:Object,attribute:!1}}}constructor(){super(),this.scheduledTransfer={}}resetScheduledTransfer(){this.scheduledTransfer={}}getScheduledTransfer(t,e={}){if(Object.keys(this.scheduledTransfer).length)return;e=Object.assign({"scheduled-transfer-id":t},e),this._generateGetService(this._getService("get",{},e),{customEvent:"scheduled-transfer-api-dm-fetch",errorFireEventHandler:"scheduled-transfer-api-dm-fetch-error"},this._responseMapping,e.fields)}patchScheduledTransfer(t,e){const i={"scheduled-transfer-id":t};this._generateGetService(this._getService("patch",e,i),{customEvent:"scheduled-transfer-api-dm-update",errorFireEventHandler:"scheduled-transfer-api-dm-update-error"},this._responseMapping),this.resetScheduledTransfer()}deleteScheduledTransfer(t){const e={"scheduled-transfer-id":t};this._generateGetService(this._getService("delete",{},e),{customEvent:"scheduled-transfer-api-dm-delete",errorFireEventHandler:"scheduled-transfer-api-dm-delete-error"},this._responseMapping),this.resetScheduledTransfer()}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}ScheduledTransfer`,this._getBgadp(a))}_getBgadp(t){return{deleteScheduledTransferV0:()=>new $s(t),getScheduledTransferV0:()=>new fs(t),patchScheduledTransferV0:()=>new ys(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}const{moment:Ts}=window;function Cs(t,e,i){const a="MXP"===e?"MXN":e;return ot(t,{currencyCode:a,localCurrency:a,language:i})}function Es(t,e){const i=t>e,a=i?e:t;return Ts(i?t:e).diff(Ts(a),"months")}const ks=(t,e)=>((t,e,i,a)=>Ts(t)[e](i,a).format("YYYY-MM-DD"))(t,"add",e,"months"),Rs=t=>(null==t?void 0:t.at(-1))||null,ws=t=>t&&t.constructor===Object&&0===Object.keys(t).length;function Ps(t){return new Date((null==t?void 0:t.replaceAll("-","/"))||null).toLocaleDateString(this.language,{day:"2-digit",month:"2-digit",year:"numeric"})}var Ds=t`
:host {
  display: block;
  box-sizing: border-box;
  text-align: initial;
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

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-header-main-z-index: 2;
  --bbva-text-color: initial;
  --bbva-transition-container-padding-bottom: 0;
  --bbva-transition-container-text-align: left;
}
[data-tag-name=bbva-transition-container].detail-goal {
  --bbva-transition-container-content-bg-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
}
[data-tag-name=bbva-transition-container]#list-goals {
  --bbva-transition-container-content-bg-color: var(--colorsSecondary100, ${u(h.secondary100)});
  --bbva-transition-container-modal-container-flex-grow: 1;
}

[data-tag-name=bbva-panel-info] p {
  margin-top: 1rem;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}
[data-tag-name=bbva-help-modal][full-height] [data-tag-name=bbva-form-option],
[data-tag-name=bbva-help-modal][full-height] [data-tag-name=bbva-form-amount],
[data-tag-name=bbva-help-modal][full-height] [data-tag-name=bbva-form-date] {
  text-align: left;
}

[data-tag-name=bbva-form-amount] {
  margin: 1rem;
}

[data-tag-name=bbva-form-date] {
  margin: 1rem;
}
[data-tag-name=bbva-form-date]:first-of-type {
  margin-top: 0;
}

[data-tag-name=bbva-form-select] {
  margin: 0 1rem;
}

[data-tag-name=metas-saving-goals-list-goals] {
  text-align: left;
}

[data-tag-name=bbva-progress-content] {
  --bbva-progress-content-z-index: 11;
}

[data-tag-name=bbva-notification-toast] {
  --bbva-z-index-notifications: 10;
}

[data-tag-name=bbva-text] {
  padding: 0 1rem;
}
[data-tag-name=bbva-text][alignment=center] {
  background-color: var(--ambientsLight, ${u(nt.light)});
  padding: 1rem;
}

[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-text] {
  padding: 1rem;
}

[data-tag-name=bbva-list-bullet] {
  text-align: left;
}
[data-tag-name=bbva-list-bullet]:last-child {
  padding-bottom: 1rem;
}
`,Gs=t`
:host {
  display: block;
  box-sizing: border-box;
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

*, *:before, *:after {
  box-sizing: inherit;
}

form {
  margin: 0;
}

fieldset {
  border: none;
  margin: 0 1rem;
  padding: 0;
  position: relative;
}

[data-tag-name=bbva-form-text],
[data-tag-name=bbva-form-amount] {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-button-default] {
  display: block;
  width: -webkit-max-content;
  width: max-content;
  margin: 1.5rem auto 0;
}

[data-tag-name=bbva-form-text],
[data-tag-name=bbva-form-amount],
[data-tag-name=bbva-form-date] {
  text-align: left;
}

[ambient=light] {
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-card-banner] {
  padding-top: 1rem;
}
`;class Is extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-edit-goal"}static get scopedElements(){const t=[ni,Me,Le,lt,li,dt,...Is.configurationScopedElements()];return Is.scopedElementsFromClasses(t)}static get properties(){return{editGoalVisible:{type:Boolean,attribute:"edit-goal-visible"},goal:{type:Object},maxLengthAmount:{type:Number,attribute:"max-length-amount"},maxLengthTitle:{type:Number,attribute:"max-length-title"},endDate:{type:String,attribute:"end-date"},_description:{type:String},_amount:{type:Number},_redirectAutomaticSaveModalVisible:{type:Boolean},_completedGoalModalVisible:{type:Boolean}}}constructor(){super(),this.config={back:!1,fixedHeader:!0,header:{variant:"modal",accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-edit-goal-header-title")},loader:!0,notify:!1},this.editGoalVisible=!1,this.endDate="",this.goal={},this.maxLengthAmount=7,this.maxLengthTitle=20,this._description="",this._amount=0,this._completedGoalModalVisible=!1,this._redirectAutomaticSaveModalVisible=!1}updated(t){var e,i,a,s,o;(super.updated(t),t.has("goal")&&this.goal!==t.get("goal")&&0!==Object.keys(this.goal).length)&&(this._description=null===(e=this.goal)||void 0===e?void 0:e.description,this._amount=null===(i=this.goal)||void 0===i||null===(a=i.goalAmount)||void 0===a?void 0:a.amount,this.endDate=null===(s=this.goal)||void 0===s||null===(o=s.goalPeriod)||void 0===o?void 0:o.expirationDate);t.has("editGoalVisible")&&!0===this.editGoalVisible&&this.dispatchEvent(new CustomEvent("metas-saving-goals-edit-goal-trace-route",{bubbles:!0,composed:!0,detail:{route:"editGoal"}}))}_saveGoal(t){var e,i;const a=(null==t?void 0:t.changeAmountOrDate)||!1,s=(null==t?void 0:t.completedGoal)||!1;this._redirectAutomaticSaveModalVisible=!1,this._completedGoalModalVisible=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-edit-goal-update-goal-ok",{bubbles:!0,composed:!0,detail:{openAutomaticSave:a,completedGoal:s,description:this._description,goalAmount:{amount:this._amount,currency:null===(e=this.goal)||void 0===e||null===(i=e.goalAmount)||void 0===i?void 0:i.currency},goalPeriod:{expirationDate:this.endDate}}}))}_checkAutomaticSave(){var t,e,i,a,s,o;Number(this._amount)===Number(null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.amount)?this._completedGoalModalVisible=!0:Number(this._amount)!==Number(null===(i=this.goal)||void 0===i||null===(a=i.goalAmount)||void 0===a?void 0:a.amount)||(null===(s=this.goal)||void 0===s||null===(o=s.goalPeriod)||void 0===o?void 0:o.expirationDate)!==this.endDate?this._redirectAutomaticSaveModalVisible=!0:this._saveGoal()}_onBlurAmount(t){t.target.invalid=!this._checkValidAmount()}_onBlurEndDate(t){t.target.invalid=!this._checkValidEndDate()}_checkValidAmount(){var t,e;return Number(this._amount)>=Number(null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.amount)&&Number(this._amount)>0}_checkValidEndDate(){return new Date(this.endDate.replaceAll("-","/")).getTime()>(new Date).getTime()}get _amountErrorMessage(){return this._checkValidAmount()?this.t("metas-saving-goals-edit-goal-required"):this.t("metas-saving-goals-edit-goal-amount-error")}get _endDateErrorMessage(){return this._checkValidEndDate()?this.t("metas-saving-goals-edit-goal-required"):this.t("metas-saving-goals-edit-goal-endDate-error")}get _checkDisabled(){return!(this._description&&this._checkValidAmount()&&this._checkValidEndDate()&&this._checkValidChange())}_checkValidChange(){var t,e,i,a,s,o;const n=this._amount!==(null===(t=this.goal)||void 0===t||null===(e=t.goalAmount)||void 0===e?void 0:e.amount),r=new Date(this.endDate.replaceAll("-","/")).getTime()!==new Date(null===(i=this.goal)||void 0===i||null===(a=i.goalPeriod)||void 0===a||null===(s=a.expirationDate)||void 0===s?void 0:s.replaceAll("-","/")).getTime(),l=this._description!==(null===(o=this.goal)||void 0===o?void 0:o.description);return n||r||l}_launchCalendar(){this.dispatchEvent(new CustomEvent("metas-saving-goals-launch-calendar",{bubbles:!0,composed:!0,detail:{dateFormat:"yyyy-MM-dd",defaultDate:(new Date).toISOString().split("T")[0]}}))}static get styles(){return[Gs,ri.light,Oe.light,Ne.light,ut.light,di.light,l("metas-saving-goals-edit-goal-shared-styles")]}_redirectAutomaticSaveModal(){return d`
      <bbva-help-modal
        data-id="redirectAutomaticSaveModal"
        id="redirectAutomaticSaveModal"
        title-icon="${ht()}"
        body-text="${this.t("metas-saving-goals-edit-goal-modal-text")}"
        title-text="${this.t("metas-saving-goals-edit-goal-modal-title")}"
        button-text="${this.t("metas-saving-goals-confirm")}"
        link-text="${this.t("metas-saving-goals-cancel")}"
        modal-type="info"
        ?visible=${this._redirectAutomaticSaveModalVisible}
        @help-modal-footer-button-click="${()=>this._saveGoal({changeAmountOrDate:!0})}"
        @help-modal-footer-link-click="${()=>{this._redirectAutomaticSaveModalVisible=!1}}"
        @help-modal-veil-click="${()=>{this._redirectAutomaticSaveModalVisible=!1}}"
      ></bbva-help-modal>
    `}_completedGoalModal(){return d`
      <bbva-help-modal
        data-id="completedGoalModal"
        id="completedGoalModal"
        title-icon="${ht()}"
        body-text="${this.t("metas-saving-goals-completed-goal-modal-text")}"
        title-text="${this.t("metas-saving-goals-completed-goal-modal-title")}"
        button-text="${this.t("metas-saving-goals-confirm")}"
        link-text="${this.t("metas-saving-goals-edit-return")}"
        modal-type="info"
        ?visible=${this._completedGoalModalVisible}
        @help-modal-footer-button-click="${()=>this._saveGoal({completedGoal:!0})}"
        @help-modal-footer-link-click="${()=>{this._completedGoalModalVisible=!1}}"
      ></bbva-help-modal>
    `}render(){var t,e,i,a;return d`
      ${super.render()}${this._redirectAutomaticSaveModal()}${this._completedGoalModal()}
      <bbva-card-banner
        disabled-tabindex
        ambient="light"
        variant="full-width"
        microillustration="flagdollar"
        title=${this.t("metas-saving-goals-edit-goal-title")}
      >
      </bbva-card-banner>
      <form>
        <fieldset>
          <bbva-form-text
            ambient="light"
            label="${this.t("metas-saving-goals-edit-goal-name")}"
            .value="${this._description}"
            .maxlength=${this.maxLengthTitle}
            allowed-pattern="[a-zA-Z0-9 ]"
            label-out="${this.t("metas-saving-goals-edit-goal-name-label")}"
            error-message="${this.t("metas-saving-goals-edit-goal-required")}"
            required
            auto-validate
            @input="${t=>{this._description=t.target.value}}"
            @focusout="${()=>{this._description=this._description.trim()}}"
          ></bbva-form-text>
          <bbva-form-amount
            ambient="light"
            label=${this.t("metas-saving-goals-edit-goal-amount")}
            .amount="${this._amount}"
            .maxlength=${this.maxLengthAmount}
            label-out="${this.t("metas-saving-goals-edit-goal-amount-label")}"
            error-message="${this._amountErrorMessage}"
            currency-code="${null===(t=this.goal)||void 0===t||null===(e=t.goalAmount)||void 0===e?void 0:e.currency}"
            local-currency="${null===(i=this.goal)||void 0===i||null===(a=i.goalAmount)||void 0===a?void 0:a.currency}"
            required
            auto-validate
            @form-field-input-blur=${this._onBlurAmount}
            @form-amount-input-change="${t=>{this._amount=t.detail.amount}}"
          ></bbva-form-amount>
          <bbva-form-date
            ambient="light"
            label=${this.t("metas-saving-goals-edit-goal-endDate")}
            .value="${this.endDate}"
            label-out="${this.t("metas-saving-goals-edit-goal-endDate-label")}"
            error-message="${this._endDateErrorMessage}"
            required
            auto-validate
            @form-field-input-blur="${this._onBlurEndDate}"
            @click="${this._launchCalendar}"
            @input="${t=>{this.endDate=t.target.value}}"
          >
          </bbva-form-date>
        </fieldset>
        <bbva-button-default
          variant="primary"
          ?disabled="${this._checkDisabled}"
          @click="${this._checkAutomaticSave}"
        >
          ${this.t("metas-saving-goals-edit-goal-saveChanges")}
        </bbva-button-default>
      </form>
    `}}const Ms=new e;var Os=t`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${Ms.mediaRules()}`;const Ls=new e;var Ns=t`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${u(h.primaryCoreDark)});
}
${Ls.mediaRules()}`;const Vs={dark:t`
    ${y.dark}
    ${Ns}
  `,light:t`
    ${y.light}
    ${Os}
  `},qs=new e;var Bs=t`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${u(h.secondary200)})));
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
${qs.mediaRules()}`;class Hs extends(i(p(M(a)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":v}}static get properties(){return{date:{type:Date,converter:t=>new Date(t)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,Bs,l("bbva-date-shared-styles"),Vs.light,Vs.dark]}updated(t){var e,i;super.updated&&super.updated(t),0===(null===(e=this.dateRange)||void 0===e?void 0:e.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(i=this.dateRange)||void 0===i?void 0:i.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var t;return(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(t){const e=this.utc?{...this.options,timeZone:"UTC"}:this.options,i=e.day||e.month||e.year;return e.hour&&e.minute&&!i?t.toLocaleTimeString(this.locale,e).concat(` ${this.clockSuffix}`):t.toLocaleDateString(this.locale,e)}_fromToDateFormat(t){return[new Date(t[0]),new Date(t[1])].map(((t,e)=>t.toLocaleDateString(this.locale,this.options).concat(0===e?" - ":"")))}_fromToDateFormatA11y(t){const e=new Date(t[0]),i=new Date(t[1]),a={...this.options};return a.month="long",[e,i].map(((t,e)=>t.toLocaleDateString(this.locale,a).concat(0===e?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&d` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||gt}get _tplDateRange(){var t;return this.isValidRange&&(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&d`
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
        `||gt}render(){return d` ${this._tplDate} ${this._tplDateRange} `}}A("colors.primaryCoreLightened"),A("colors.cool50");const Fs=new e;var js=t`[ambient^=light] {
  --bbva-list-goal-bg-active-color: initial;
  --bbva-list-goal-title-link-active-color: initial;
  --bbva-list-goal-text-color: initial;
  --bbva-list-goal-icon-color: initial;
  --bbva-list-goal-type-icon-color: initial;
  --bbva-list-goal-active-icon-color: initial;
  --bbva-list-goal-title: initial;
  --bbva-list-goal-skeleton-color: initial;
}

[ambient=light100] {
  --bbva-list-goal-bg-active-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
}
${Fs.mediaRules()}`;const Us=new e;var zs=t`[ambient^=dark] {
  --bbva-list-goal-title-link-active-color: var(--colorsPrimarySubduedLight, ${u(h.primarySubduedLight)});
  --bbva-list-goal-text-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-goal-icon-color: var(--colorsPrimarySubdued, ${u(h.primarySubdued)});
  --bbva-list-goal-type-icon-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-goal-active-icon-color: var(--colorsPrimaryMediumLight, ${u(h.primaryMediumLight)});
  --bbva-list-goal-title: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-goal-skeleton-color: var(--colorsPrimaryMedium, ${u(h.primaryMedium)});
  --bbva-list-goal-bg-active-color: var(--colorsPrimaryCoreDark, ${u(h.primaryCoreDark)});
}

[ambient=dark100] {
  --bbva-list-goal-bg-active-color: var(--colorsPrimaryCoreLight, ${u(h.primaryCoreLight)});
  --bbva-list-goal-icon-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-list-goal-active-icon-color: var(--colorsPrimarySubduedLight, ${u(h.primarySubduedLight)});
}

[ambient=dark300] {
  --bbva-list-goal-bg-active-color: var(--colorsPrimaryCoreDarkened, ${u(h.primaryCoreDarkened)});
}
${Us.mediaRules()}`;const Ws=(t,e=null)=>{const i="color"!==t||e?(t,e)=>`--bbva-list-goal-${t}-icon-color: ${e}; \n`:(t,e)=>`:host([category='${t}']){\n    --_category-color: var(--bbva-list-goal-${t}-icon-dark-mode-color, var(--bbva-list-goal-${t}-icon-color,${e}));\n  }\n`;return Object.entries(vt).reduce(((a,[s,o])=>a+i(s,e||o[t])),"")},Ks={light:t`
    ${js}
    ${B.light}
    ${mt.light}
    ${pt.light}
    ${I.light}
    ${Vs.light}
    ${y.light}
    ${u(`[ambient ^= light]{${Ws("color","initial")}}`)}
  `,dark:t`
    ${zs}
    ${B.dark}
    ${mt.dark}
    ${pt.dark}
    ${I.dark}
    ${Vs.dark}
    ${y.dark}
    ${u(`[ambient ^= dark]{${Ws("colorContrast")}}`)}
  `};var Xs=t`:host {
  display: block;
  box-sizing: border-box;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1em);
  --bbva-button-icon-color-variant: var(--bbva-list-goal-icon-color, var(--colorsPrimaryMedium, ${u(h.primaryMedium)}));
  --bbva-button-icon-color-focus-variant: var(--bbva-list-goal-active-icon-color, var(--colorsPrimaryCoreDark, ${u(h.primaryCoreDark)}));
  --_text-color: var(--bbva-list-goal-text-dark-mode-color, var(--bbva-list-goal-text-color, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_list-goal-title-color: var(--bbva-list-goal-title-dark-mode-color, var(--bbva-list-goal-title, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_active-color: var(--bbva-list-goal-title-link-dark-mode-active-color, var(--bbva-list-goal-title-link-active-color, var(--colorsPrimaryMedium, ${u(h.primaryMedium)})));
  --_list-goal-bg-active-color: var(--bbva-list-goal-dark-mode-bg-active-color, var(--bbva-list-goal-bg-active-color, var(--colorsSecondary100, ${u(h.secondary100)})));
  --skeleton-quote-color: var(--bbva-list-goal-skeleton-dark-mode-color, var(--bbva-list-goal-skeleton-color, var(--colorsSecondary200, ${u(h.secondary200)})));
  --skeleton-quote-bg: var(--bbva-list-goal-skeleton-dark-mode-bg-color, var(--bbva-list-goal-skeleton-bg, transparent));
  --_list-goal-no-category-icon-color: var(--bbva-list-goal-no-category-icon-color, var(--colorsPrimaryVariant, ${u(h.primaryVariant)}));
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.ellipsis {
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

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-text],
.value {
  color: var(--_text-color);
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  flex: 1;
  overflow: hidden;
}
.header .title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${u(G.medium.fontWeight)});
  color: var(--_list-goal-title-color);
}
.header .title-link {
  display: block;
  text-align: left;
  font-size: var(--typographyTypeMedium, ${u(g.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${u(D.typeMedium)});
}
.header .heading {
  align-self: center;
  overflow: hidden;
}
.header .heading .date-wrapper {
  display: flex;
}
.header .heading .date-wrapper [data-tag-name=bbva-text].date-separator {
  display: block;
  margin: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}
.header .subtitle {
  display: flex;
  flex-direction: row;
  font-size: var(--typographyTypeSmall, ${u(g.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${u(D.typeSmall)});
}
.header .subtitle .value:not(.book),
.header .subtitle .description2 {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${u(G.medium.fontWeight)});
}
.header .action-icon {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  border: none;
  padding: 0;
  cursor: pointer;
  background: none;
}
.header .action-icon.icon {
  align-items: flex-start;
  flex: 0;
  height: max-content;
}
.header .type-icon-success {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  fill: var(--bbva-list-goal-type-icon-color, var(--colorsTertiaryType6, ${u(h.tertiaryType6)}));
}
.header .type-icon-warning {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  fill: var(--bbva-list-goal-type-icon-color, var(--colorsTertiaryType1Dark, ${u(h.tertiaryType1Dark)}));
}

:host([active]) {
  --bbva-list-goal-bg-active-color: transparent;
}

:host([loading]) {
  position: relative;
  height: var(--bbva-list-goal-skeleton-height, 5.25rem);
}
:host([loading]) .header .action-icon {
  cursor: default;
}
:host([loading]):after {
  content: "";
  position: absolute;
  inset: 0;
  display: inline-block;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((52% * 2) + (16px/ 2)) 16px, calc((38% * 2) + (16px/ 2)) 16px;
  background-position: 16px 18px, 16px 46px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

:host([loading][image]) {
  --bbva-list-goal-skeleton-height: rem(108px);
}
:host([loading][image]):after {
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 48px 48px, calc((50% * 2) + (16px/ 2)) 16px, calc((38% * 2) + (16px/ 2)) 16px;
  background-position: 16px 18px, 73px 33px, 16px 75px;
}

:host(:not([no-link]):active:not([loading])) {
  background-color: var(--_list-goal-bg-active-color);
}

:host(:not([no-link]):active:not([active])) .title-link {
  color: var(--_active-color);
}

.label {
  display: flex;
  color: var(--_text-color);
}

[data-tag-name=bbva-clip-box] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}

.data-left {
  display: flex;
  flex-direction: row;
  font-size: var(--typographyTypeSmall, ${u(g.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${u(D.typeSmall)});
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1em);
  flex: none;
}
.data-left .description4,
.data-left .value:not(.book),
.data-left .percentage,
.data-left .accumulated-percentage {
  display: flex;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${u(G.medium.fontWeight)});
}

.data-right {
  display: flex;
  font-size: var(--typographyTypeSmall, ${u(g.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${u(D.typeSmall)});
  overflow: hidden;
}
.data-right .value:not(.book),
.data-right .percentage-subtraction,
.data-right .percentage-symbol {
  display: flex;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${u(G.medium.fontWeight)});
}

.value:not(.initial-amount):not(.book) {
  margin-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}

.header-wrapper {
  display: flex;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}
.header-wrapper .header-icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  color: var(--_category-color, var(--_list-goal-no-category-icon-color));
}

.amounts {
  display: flex;
  justify-content: space-between;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}

.bottom {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  display: flex;
  justify-content: space-between;
  overflow: hidden;
}

[data-tag-name=bbva-badge-default] {
  margin-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  min-width: 0;
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
`;class Ys extends(i(m(bt(p(M(a)))))){static get is(){return"bbva-list-goal"}static get scopedElements(){return{"bbva-amount":z,"bbva-badge-default":_t,"bbva-button-icon":ft,"bbva-clip-box":yt,"bbva-link":L,"bbva-progress-bar-default":$t,"bbva-core-icon":K,"bbva-date":Hs,"bbva-text":v}}static get properties(){return{badgeTitle:{type:String,attribute:"badge-title"},badgeType:{type:String,attribute:"badge-type"},description:{type:String},description2:{type:String},description3:{type:String},description4:{type:String},description5:{type:String},goalTitle:{type:String,attribute:"goal-title"},headingLevel:{type:String,attribute:"heading-level"},noLink:{type:Boolean,attribute:"no-link"},icon:{type:String},typeIcon:{type:String,attribute:"type-icon"},iconAccessibilityText:{type:String,attribute:"icon-accessibility-text"},initialAmount:{type:Number,attribute:"initial-amount"},amount:{type:Number},totalAmount:{type:Number,attribute:"total-amount"},descriptionAmount:{type:Number,attribute:"description-amount"},descriptionAmount3:{type:Number,attribute:"description-amount3"},descriptionAmount5:{type:Number,attribute:"description-amount5"},percentSymbol:{type:String,attribute:"percent-symbol"},simpleLink:{type:String,attribute:"simple-link"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},zeroDecimalsHidden:{type:Boolean,attribute:"zero-decimals-hidden"},image:{type:String},iconClip:{type:String,attribute:"icon-clip"},bgClipColor:{type:String,attribute:"bg-clip-color"},bgClipColor2:{type:String,attribute:"bg-clip-color2"},textClip:{type:String,attribute:"text-clip",reflect:!0},showAmountResult:{type:Boolean,attribute:"show-amount-result"},barValues:{type:Array},percentage:{type:Boolean},progressBarColor:{type:String,attribute:"progress-bar-color"},disabled:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0},goalTitleEllipsis:{type:Number,attribute:"goal-title-ellipsis",reflect:!0},hideDescriptions:{type:Boolean,attribute:"hide-descriptions"},progressStatus:{type:String,attribute:"progress-status"},category:{type:String},headerIcon:{type:String,attribute:"header-icon"},headerIconColor:{type:String,attribute:"header-icon-color"},progressBarAccessibilityText:{type:String,attribute:"progress-bar-accessibility-text"},dateItems:{type:Array,attribute:"date-items"},options:{type:Object},dateLocale:{type:String,attribute:"date-locale"}}}constructor(){super(),this.goalTitle="",this.description="",this.description2="",this.description3="",this.description4="",this.description5="",this.icon="",this.percentSymbol="%",this.iconAccessibilityText="bbva-list-goal-icon-accessibility-text",this.progressBarAccessibilityText="bbva-list-goal-progress-bar-accessibility-text",this.headingLevel="h3",this.decimalsHidden=!1,this.zeroDecimalsHidden=!1,this.image="",this.iconClip="",this.bgClipColor="",this.bgClipColor2="",this.textClip="",this.showAmountResult=!1,this.percentage=!1,this.disabled=!1,this.loading=!1,this.noLink=!1,this.badgeTitle="",this.badgeType="",this.simpleLink="",this.goalTitleEllipsis=0,this.hideDescriptions=!1,this.progressBarColor=h.tertiaryType3,this.typeIcon="",this.category="",this.headerIcon="",this.headerIconColor="",this.disabledTabindex=!0,this.dateItems=[],this.dateLocale="es-ES",this.options={day:"2-digit",month:"short",year:"numeric"}}static get styles(){return[super.styles,Xs,f("button:focus"),t`
        ${u(Ws("color"))}
      `,Ks.dark,Ks.light,l("bbva-list-goal-shared-styles")]}static _textLabels({type:t,classes:e,size:i,tag:a,ellipsis:s,fontWeight:o,ariaHidden:n}){return d`
      <bbva-text
        unset
        ?ellipsis="${!!s}"
        .lines="${c(s)}"
        class="${c(e)}"
        font-weight="${c(o)}"
        aria-hidden="${c(n)}"
        tag="${a}"
        size="${i}"
        .text="${t}"
      >
      </bbva-text>
    `}static _tmplIcon({className:t,icon:e,style:i}){return d`
      <bbva-core-icon
        class="${t}"
        aria-hidden="true"
        .icon="${e}"
        size="24"
        style="${c(i)}"
      >
      </bbva-core-icon>
    `}get _overBudgetValue(){return this.amount>=this.totalAmount?100:null}firstUpdated(t){super.firstUpdated(t),this.noLink||this.disabled||this.loading||this.addEventListener("click",this._linkClicked)}get _accumPercentage(){var t;return null===(t=this.barValues)||void 0===t?void 0:t.map((t=>Number(t.currentValue))).reduce(((t,e)=>t+e))}get _percentageSubstraction(){return 100-this._accumPercentage}get _percentage(){return this.amount&&this.totalAmount&&Math.floor(100*this.amount/this.totalAmount)}get _styleIcon(){let t="";return"success"===this.typeIcon?t="type-icon-success":"warning"===this.typeIcon&&(t="type-icon-warning"),t}get _typeIcon(){let t="";return"success"===this.typeIcon?t=r():"warning"===this.typeIcon&&(t=n()),t}get _clipBox(){return(this.image||this.iconClip||this.textClip)&&d`
        <bbva-clip-box
          id="clipBox"
          aria-hidden="true"
          size="large"
          class="${V({bitone:this.iconClip||this.textClip&&!this.bgClipColor})}"
          .text="${this.textClip}"
          .image="${this.image}"
          .icon="${this.iconClip}"
          .bgColor="${this.bgClipColor}"
          .bgColor2="${this.bgClipColor2}"
        >
        </bbva-clip-box>
      `}get _headerIcon(){var t;return this.headerIcon||(null===(t=vt[this.category])||void 0===t?void 0:t.icon)&&St[vt[this.category].icon]()}get _goalTitle(){var t;return this.goalTitle||(null===(t=vt[this.category])||void 0===t?void 0:t.locale)}get _title(){return this.noLink&&d`
          ${Ys._textLabels({type:this.t(this._goalTitle),classes:"title",size:"M",tag:this.headingLevel,ellipsis:this.goalTitleEllipsis})}
        `||d`
        <bbva-link
          class="title-link
          ${V({ellipsis:this.goalTitleEllipsis})}"
        >
          ${this.t(this._goalTitle)}
        </bbva-link>
      `}_amount({variant:t,amount:e,classes:i}){return d`
      <bbva-amount
        disabled-tabindex
        class="${i}"
        variant="${t}"
        .localCurrency="${this.localCurrency}"
        .amount="${e||0}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?zero-decimals-hidden="${this.zeroDecimalsHidden}"
        ?decimals-hidden="${this.decimalsHidden}"
      >
      </bbva-amount>
    `}get _actionIcon(){return this.icon&&d`
          <bbva-button-icon
            aria-label="${this.t(this.iconAccessibilityText)}"
            @click="${this.loading?void 0:this._actionClick}"
            @mousedown="${this._addActive}"
            @mouseup="${this._removeActive}"
            class="action-icon icon"
            variant="no-background"
            .icon="${this.icon}"
          >
          </bbva-button-icon>
        `||this.typeIcon&&Ys._tmplIcon({className:this._styleIcon,icon:this._typeIcon})}get _header(){return d`
      <div class="header">
        <div class="heading">
          ${this._title}
          ${(this.description||this.description2||this.descriptionAmount)&&d`
              <div class="subtitle">
                <div class="label">
                  ${(!this.description||!this.description2)&&0===this.dateItems.length&&this.descriptionAmount&&this._descriptionAmount||Ys._textLabels({type:this.description,classes:"description",size:"S",tag:"span"})}
                </div>
                <div class="value">
                  ${this.description2&&Ys._textLabels({type:this.description2,classes:"description2",size:"S",tag:"span"})||d`${this.initialAmount&&this._amount({variant:"m",amount:this.initialAmount,classes:"value initial-amount"})}`}
                </div>
              </div>
            `||gt}
          ${(!this.description||!this.description2||!this.descriptionAmount)&&this.dateItems.length<=2&&this.dateItems.length>0&&this._dateItems||gt}
        </div>
        ${this._actionIcon}
      </div>
    `}_amounts(){return(this.amount||!this.barValues||this.totalAmount)&&d`
        <div class="amounts">
          ${this._amount({variant:"xl",amount:this.amount,classes:"value amount"})}
          ${this._amount({variant:"xl",amount:this.totalAmount,classes:"value total-amount"})}
        </div>
      `}get _currentValue(){return this.amount<this.totalAmount&&this.amount||this._overBudgetValue}get _totalAmount(){return this.amount<this.totalAmount&&this.totalAmount||this._overBudgetValue||this.barValues&&100}get _progressBar(){return d`
      <bbva-progress-bar-default
        class="${c(this.progressStatus)}"
        ?bar-any-colors="${this.barValues}"
        .maxValue="${this._totalAmount}"
        .barValues="${this.barValues}"
        .currentValue="${this._currentValue}"
        .fillColor="${this.progressStatus||this.progressBarColor}"
        accessibility-text="${this.t(this.progressBarAccessibilityText)}"
      >
      </bbva-progress-bar-default>
    `}get _amountValue(){let t=0;return this.amount<this.totalAmount?t=this.totalAmount-this.amount:this.amount>this.totalAmount&&(t=this.amount-this.totalAmount),t}get _description3(){return this.description3&&d`
          <div class="label">
            ${Ys._textLabels({type:this.description3,classes:"description3",size:"S",tag:"span"})}
          </div>
        `||this._descriptionAmount3}get _description4(){return this.description4&&d`
        <div class="value">
          ${Ys._textLabels({type:this.description4,classes:"description4",size:"S",tag:"span"})}
        </div>
      `}get _amountDataLeft(){return d`
      ${!this.description4&&this.totalAmount&&this.showAmountResult&&!this.percentage&&this._amount({variant:"m",amount:this._amountValue,classes:"value"})||gt}
    `}get _descriptionAmount(){return d`${this.descriptionAmount&&this._amount({variant:"m",amount:this.descriptionAmount,classes:"value book"})||gt}`}get _descriptionAmount3(){return d`${this.descriptionAmount3&&this._amount({variant:"m",amount:this.descriptionAmount3,classes:"value book"})||gt}`}get _descriptionAmount5(){return d`${this.descriptionAmount5&&this._amount({variant:"m",amount:this.descriptionAmount5,classes:"value book"})||gt}`}get _valueDataLeft(){return d`
      ${!this.description4&&!this.showAmountResult&&this.percentage&&d`
          <span class="sr-only"
            >${Ys._accessibleValue(this._percentage||this._accumPercentage,this.percentSymbol)}</span
          >
          <div class="value" aria-hidden="true">
            ${this._percentage&&Ys._textLabels({type:this._percentage,classes:"percentage",size:"S",tag:"span"})||this._accumPercentage&&this.barValues&&Ys._textLabels({type:this._accumPercentage,classes:"accumulated-percentage",size:"S",tag:"span"})}
            ${this.percentSymbol}
          </div>
        `||gt}
    `}get _dataLeft(){return d`
      <div class="data-left">
        ${this._description3} ${this._description4} ${this._amountDataLeft} ${this._valueDataLeft}
      </div>
    `}get _dateItems(){return d`
      <div class="date-wrapper">
        ${this.dateItems.map(((t,e,i)=>d`
            ${e===i.length-1&&i.length>1&&Ys._textLabels({classes:"date-separator",type:"-",tag:"span",fontWeight:"500",size:"XL",ariaHidden:"true"})||gt}
            <bbva-date
              date=${t}
              .options="${this.options}"
              .locale="${this.dateLocale}"
            ></bbva-date>
          `))}
      </div>
    `}static _accessibleValue(t,e){return`${t}${e}`}get _valueDataRight(){return d`
      ${this.barValues&&d`
          <span class="sr-only"
            >${Ys._accessibleValue(this._percentageSubstraction,this.percentSymbol)}</span
          >
          <div class="value" aria-hidden="true">
            ${this._percentageSubstraction&&Ys._textLabels({id:"accumPercentage",type:this._percentageSubstraction,classes:"percentage-subtraction",size:"S",tag:"span"})}
            ${Ys._textLabels({id:"percentSymbol",type:this.percentSymbol,classes:"percentage-symbol",size:"S",tag:"span"})}
          </div>
        `||d`
        <bbva-badge-default has-ellipsis .text="${this.badgeTitle}" .type="${this.badgeType}">
        </bbva-badge-default>
      `}
    `}get _dataRight(){let t=d``;return this.simpleLink?t=d`
        <bbva-link
          class="simple-link"
          @mousedown="${this._addActive}"
          @mouseup="${this._removeActive}"
          @click="${this.loading?void 0:this._simplelinkClicked}"
        >
          ${this.simpleLink}
        </bbva-link>
      `:(this.description5||this.descriptionAmount5||this.badgeTitle)&&(t=d`
        <div class="data-right">
          ${this.description5&&d`<div class="label">
              ${Ys._textLabels({type:this.description5,classes:"description5",size:"S",tag:"span"})}
            </div> `||this._descriptionAmount5}
          ${this._valueDataRight}
        </div>
      `),t}get _bottom(){return d` <div class="bottom">${this._dataLeft} ${this._dataRight}</div> `}render(){return d`
      <div class="header-wrapper">
        ${this._clipBox||(this.category||this.headerIcon)&&Ys._tmplIcon({className:"header-icon",icon:this._headerIcon,style:`color: ${this.headerIconColor}`})}${this._header}
      </div>
      <div class="info">
        ${"number"==typeof this.amount?this._amounts(this):""} ${this._progressBar}
        ${!this.hideDescriptions&&this._bottom||gt}
      </div>
    `}_addActive(){this.disabled||(this.removeAttribute("active"),this.setAttribute("active",!0))}_removeActive(){this.disabled||this.removeAttribute("active")}_actionClick(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("list-goal-action-click",{detail:!0,bubbles:!0,composed:!0,capture:!0}))}_linkClicked(){this.dispatchEvent(new CustomEvent("list-goal-link-click",{detail:!0,bubbles:!0,composed:!0}))}_simplelinkClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("list-goal-simple-link-click",{bubbles:!0,composed:!0}))}}Js="colorDarkMode",Object.entries(vt).reduce(((t,[e,i])=>{return t+(a=e,s=i[Js],`--bbva-list-goal-${a}-icon-dark-mode-color:${s};\n  \n`);var a,s}),"");var Js;A("colors.primaryCoreLightened"),A("colors.primaryCoreLightened"),A("colors.cool50"),A("colors.cool60"),A("colors.primaryMediumLight");var Zs=t`
:host {
  display: flex;
  flex-direction: column;
  height: 100%;
  box-sizing: border-box;
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

*, *:before, *:after {
  box-sizing: inherit;
}

.wrapper {
  display: flex;
  flex-direction: column;
  flex: 1;
  padding: 1rem 1rem 1rem;
}

[data-tag-name=bbva-text] {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-link] {
  margin-bottom: 1rem;
}

[role=listitem]:not(:first-child),
[data-tag-name=bbva-notification-message] {
  margin-top: 1rem;
}

[data-tag-name=bbva-list-goal] {
  box-shadow: var(--boxShadowType1, ${u(Et.type1)});
  -webkit-transform: translateZ(-0.01px);
  transform: translateZ(-0.01px);
  --bbva-progress-bar-default-progress-color-danger: var(--colorsSecondary500, ${u(h.secondary500)});
}

[data-tag-name=bbva-button-default] {
  margin: auto auto 0;
  display: flex;
  width: -webkit-max-content;
  width: max-content;
}

[ambient=light] {
  background-color: var(--ambientsLight, ${u(nt.light)});
}
`;const Qs={FINISHED:"success",EXPIRED:"danger"},to={FINISHED:"success",EXPIRED:"error"},eo={FINISHED:"success",EXPIRED:"warning"};class io extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-list-goals"}static get scopedElements(){const t=[lt,L,Ys,Oi,v,kt,...io.configurationScopedElements()];return io.scopedElementsFromClasses(t)}static get properties(){return{savingGoalsApiVersion:{type:Number,attribute:"saving-goals-api-version"},listGoals:{type:Array,attribute:"list-goals"},limitGoals:{type:Number,attribute:"limit-goals"},listGoalsVisible:{type:Boolean,attribute:"list-goals-visible"}}}constructor(){super(),this.config={fixedHeader:!0,header:{accessibilityTextIconLeftPrimary:this.t("metas-saving-goals-accessibility-icon-left-primary"),text:this.t("metas-saving-goals-header")},loader:!0,notify:!1},this.language="es-ES",this.listGoals=[],this.listGoalsVisible=!1,this.savingGoalsApiVersion=0}updated(t){super.updated(t),t.has("listGoalsVisible")&&this.listGoalsVisible&&this.dispatchEvent(new CustomEvent("metas-saving-goals-list-goals-trace-route",{bubbles:!0,composed:!0,detail:{route:"listGoals"}}))}get _goals(){return this._parseGoalsToList(this.listGoals)}_parseGoalsToList(t){const e={FINISHED:this.t("metas-saving-goals-badge-info-achieved"),EXPIRED:this.t("metas-saving-goals-badge-info-expired")};return t.map((t=>{var i,a,s,o;const n=Qs[t.status.id]||"success",r=to[t.status.id],l=eo[t.status.id],d=e[t.status.id]||"",c=t.goalPeriod.expirationDate.split("-"),u=`${c[2]}/${c[1]}/${c[0]}`;return{title:t.description,goalAmount:t.goalAmount.amount,goalCurrency:t.goalAmount.currency,remainingAmount:null!==(i=t.remainingAmount)&&void 0!==i&&i.amount&&0!==(null===(a=t.remainingAmount)||void 0===a?void 0:a.amount)?Cs(null===(s=t.remainingAmount)||void 0===s?void 0:s.amount,null===(o=t.remainingAmount)||void 0===o?void 0:o.currency,this.language):"",currentAmount:t.currentAmount.amount,currentCurrency:t.currentAmount.currency,expirationDate:u,barColor:n,badgeType:r,icon:l,statusText:d,status:t.status.id,id:t.id}}))}_navigateCreateNewGoal(){this.dispatchEvent(new CustomEvent("metas-saving-goals-list-goals-navigate",{detail:{routeName:"createGoalForm",hasGoals:this._goals.length},bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("metas-saving-goals-list-goals-create-goal",{detail:{button:"createGoal"},bubbles:!0,composed:!0}))}_navigateGoalDetail(t){this.dispatchEvent(new CustomEvent("metas-saving-goals-list-goals-navigate",{detail:{routeName:"detailGoal",goalId:t.id},bubbles:!0,composed:!0}))}static get styles(){return[Zs,ut.light,Ks.light,I.light,Mi.light,l("metas-saving-goals-list-goals")]}_goalsSorted(){const t=this._goals.filter((t=>"FINISHED"===t.status)),e=this._goals.filter((t=>"EXPIRED"===t.status)),i=this._goals.filter((t=>"VALID"===t.status));return d`
      <div role="list">
        ${t.concat(e,i).map((t=>this._listItem(t)))}
      </div>
    `}_listGoals(){return d`
      <bbva-text
        unset
        size="S"
        inherit
        text="${this.limitGoals?this.t("metas-saving-goals-text",{limit:this.limitGoals}):this.t("metas-saving-goals-no-limit")}"
      >
      </bbva-text>
      ${0===this.limitGoals||this._goals.length<this.limitGoals?d`
            <bbva-link
              ambient="light100"
              @click="${this._navigateCreateNewGoal}"
              icon="${Rt()}"
            >
              <span>${this.t("metas-saving-goals-create-new-goal")}</span>
            </bbva-link>
          `:d``}
      ${this._goalsSorted()}
      ${this.limitGoals>0&&this._goals.length>=this.limitGoals?d`
            <bbva-notification-message
              message-title="${this.t("metas-saving-goals-notification-message-title")}"
              icon="${o()}"
            >
              ${this.t("metas-saving-goals-notification-message")}
            </bbva-notification-message>
          `:d``}
    `}_listItem(t){return d`
      <div role="listitem">
        <bbva-list-goal
          disabled-tabindex
          language="${this.language}"
          ambient="light"
          goal-title="${t.title}"
          amount="${t.currentAmount}"
          total-amount="${t.goalAmount}"
          description="${this.t("metas-saving-goals-ends")}"
          description2="${t.expirationDate}"
          description3="${"FINISHED"!==t.status?this.t("metas-saving-goals-missing"):this.t("metas-saving-goals-congratulations")}"
          description4="${t.remainingAmount}"
          progressBarAccessibilityText="${this.t("metas-saving-goals-withdraw-savings-amount-label")}"
          progress-status="${t.barColor}"
          type-icon="${t.icon}"
          badge-title="${t.statusText}"
          badge-type="${t.badgeType}"
          currency-code="${t.goalCurrency}"
          local-currency="${t.goalCurrency}"
          @list-goal-link-click=${()=>this._navigateGoalDetail(t)}
        >
        </bbva-list-goal>
      </div>
    `}_emptyState(){return d`
      <bbva-panel-info
        disabled-tabindex
        ambient="light100"
        heading-level="4"
        heading="${this.t("metas-saving-goals-panel-info-header-no-goals")}"
        text="${this.t("metas-saving-goals-panel-info-text-no-goals")}"
      >
      </bbva-panel-info>
      <bbva-button-default
        text="${this.t("metas-saving-goals-panel-info-link-no-goals")}"
        @click="${this._navigateCreateNewGoal}"
      ></bbva-button-default>
    `}render(){return d`
      ${super.render()}
      <div class="wrapper">
        ${this._goals.length?this._listGoals():this._emptyState()}
      </div>
    `}}var ao=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--ambientsLight100, ${u(nt.light100)});
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  :host {
    --safe-area-inset-bottom: env(safe-area-inset-bottom);
    padding-bottom: var(--safe-area-inset-bottom, 0);
  }
}

[data-tag-name=bbva-panel-detail] {
  margin: 1rem;
}

.container {
  transform: translateZ(0);
  display: inline-block;
  width: 100%;
}

.bg-light100 {
  background-color: var(--ambientsLight100, ${u(nt.light100)});
  display: inline-block;
  width: 100%;
  padding-top: 1rem;
}

[data-tag-name=bbva-header-category] {
  padding-top: 1rem;
}

[data-tag-name=bbva-link] {
  margin: 1rem auto 1.5rem 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 0 1rem 1.5rem;
}

[data-tag-name=bbva-list-simple] {
  --_list-simple-label-color: var(--colorsSecondary500, ${u(h.secondary500)});
}

[data-tag-name=bbva-list-goal] {
  transform: translateZ(0.01px);
  --bbva-progress-bar-default-progress-color-danger: var(--colorsSecondary500, ${u(h.secondary500)});
}

[data-tag-name=bbva-heder-main] {
  transform: translateZ(0.02px);
}

[ambient=light] {
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[ambient=dark100] {
  background-color: var(--ambientsDark100, ${u(nt.dark100)});
}
`;const{moment:so}=window,oo={FINISHED:"success",EXPIRED:"danger"},no={FINISHED:"success",EXPIRED:"error"},ro={FINISHED:"success",EXPIRED:"warning"};class lo extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-list-goals-dashboard"}static get scopedElements(){const t=[kt,L,Ys,Oi,v,ci,wt,Pt,ji,wi,Dt,Gt,...lo.configurationScopedElements()];return lo.scopedElementsFromClasses(t)}static get properties(){return{dashboardAccount:{type:Object,attribute:"dashboard-account"},listGoals:{type:Array,attribute:"list-goals"},savingGoalsAlias:{type:String,attribute:"saving-goals-alias"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},limitGoals:{type:Number,attribute:"limit-goals"},_accountDetailVisible:{type:Boolean},visible:{type:Boolean}}}constructor(){super(),this.config={fixedHeader:!0,header:{accessibilityTextIconLeftPrimary:this.t("metas-saving-goals-accessibility-icon-left-primary"),text:this.t("metas-saving-goals-list-goals-dashboard-title")},loader:!0,notify:!1},this.dashboardAccount={},this.language="es-ES",this.limitGoals=4,this.listGoals=[],this.maskType="•",this.maxAccountChars=4,this.savingGoalsAlias="",this.visible=!1,this._accountDetailVisible=!1,this.addEventListener("header-main-icon-left-primary-click",(t=>this._callbackLeftIconHeader(t)))}updated(t){if(t.has("dashboardAccount")&&0!==Object.keys(this.dashboardAccount).length){var e,i;const t="string"==typeof(null===(e=this.dashboardAccount)||void 0===e?void 0:e.number)?null===(i=this.dashboardAccount)||void 0===i?void 0:i.number:"";this.config={...this.config,header:{...this.config.header,text:`${this.savingGoalsAlias||this.t("metas-saving-goals-list-goals-dashboard-title")} ${U(t,this.maskType,!0,this.maxAccountChars)}`}}}t.has("visible")&&this.visible!==t.get("visible")&&!this.visible&&this._accountDetailVisible&&(this._accountDetailVisible=!1)}get _goals(){return this._parseGoalsToList(this.listGoals)}get _openingDateDetail(){var t,e;return null!==(t=this.dashboardAccount)&&void 0!==t&&t.openingDate?so(null===(e=this.dashboardAccount)||void 0===e?void 0:e.openingDate).format("DD MMMM YYYY"):""}_callbackLeftIconHeader(){this._accountDetailVisible?this._accountDetailVisible=!1:this.dispatchEvent(new CustomEvent("metas-saving-goals-list-goals-dashboard-exit",{detail:!0,bubbles:!0,composed:!0}))}_parseGoalsToList(t){const e={FINISHED:this.t("metas-saving-goals-badge-info-completed"),EXPIRED:this.t("metas-saving-goals-badge-info-expired")};return t.map((t=>{var i,a,s,o;const n=oo[t.status.id]||"success",r=no[t.status.id],l=ro[t.status.id],d=e[t.status.id]||"",c=t.goalPeriod.expirationDate.split("-"),u=`${c[2]}/${c[1]}/${c[0]}`;return{title:t.description,goalAmount:t.goalAmount.amount,goalCurrency:t.goalAmount.currency,remainingAmount:null!==(i=t.remainingAmount)&&void 0!==i&&i.amount&&0!==(null===(a=t.remainingAmount)||void 0===a?void 0:a.amount)?Cs(null===(s=t.remainingAmount)||void 0===s?void 0:s.amount,null===(o=t.remainingAmount)||void 0===o?void 0:o.currency,this.language):"",currentAmount:t.currentAmount.amount,currentCurrency:t.currentAmount.currency,expirationDate:u,barColor:n,badgeType:r,icon:l,statusText:d,status:t.status.id,id:t.id}}))}_goalsSorted(){const t=this._goals.filter((t=>"FINISHED"===t.status)),e=this._goals.filter((t=>"EXPIRED"===t.status)),i=this._goals.filter((t=>"VALID"===t.status)),a=t.concat(e,i);return d`
      <div role="list">
        ${a.map(((t,e)=>this._listItem(t,e===a.length-1)))}
      </div>
      ${this.checkLimit?d``:d`
            <bbva-link @click="${this._navigateCreateNewGoal}" icon="${Rt()}">
              <span>${this.t("metas-saving-goals-list-goals-dashboard-add-goal")}</span>
            </bbva-link>
          `}
    `}_listItem(t,e){return d`
      <div role="listitem" ambient="light">
        <bbva-list-goal
          disabled-tabindex
          language="${this.language}"
          ambient="light"
          goal-title="${t.title}"
          amount="${t.currentAmount}"
          total-amount="${t.goalAmount}"
          description="${this.t("metas-saving-goals-target-date")}"
          description2="${t.expirationDate}"
          description3="${"FINISHED"!==t.status?this.t("metas-saving-goals-missing"):""}"
          progress-bar-accessibility-text="${this.t("metas-saving-goals-withdraw-savings-amount-label")}"
          description4="${t.remainingAmount}"
          progress-status="${t.barColor}"
          type-icon="${t.icon}"
          badge-title="${t.statusText}"
          badge-type="${t.badgeType}"
          currency-code="${t.goalCurrency}"
          local-currency="${t.goalCurrency}"
          @list-goal-link-click=${()=>this._navigateGoalDetail(t)}
        >
        </bbva-list-goal>
        ${e?"":d`
              <bbva-divider size="fit"></bbva-divider>
            `}
      </div>
    `}_navigateCreateNewGoal(){this.dispatchEvent(new CustomEvent("metas-saving-goals-list-goals-dashboard-navigate",{detail:{routeName:"createGoalForm"},bubbles:!0,composed:!0}))}_navigateGoalDetail(t){this.dispatchEvent(new CustomEvent("metas-saving-goals-list-goals-dashboard-navigate",{detail:{routeName:"detailGoal",goalId:t.id},bubbles:!0,composed:!0}))}_emptyState(){return d`
      <bbva-panel-info
        disabled-tabindex
        heading-level="4"
        heading="${this.t("metas-saving-goals-list-goals-dashboard-no-goals-title")}"
        text="${this.t("metas-saving-goals-list-goals-dashboard-no-goals-description")}"
        link-text="${this.t("metas-saving-goals-list-goals-dashboard-add-goal")}"
        @panel-info-link-click="${this._navigateCreateNewGoal}"
      >
      </bbva-panel-info>
    `}_getOptionsButtonRow(){return[{icon:Rt(),label:this.t("metas-saving-goals-list-goals-dashboard-create-goal")}]}_accountDetail(){var t,e,i;return d`
      <bbva-transition-container
        id="list-goals-dashboard-detail"
        ?visible="${this._accountDetailVisible}"
      >
        <div slot="slot-content">
          <bbva-header-main
            accessibility-text-icon-left-primary="${this.t("metas-saving-goals-accessibility-icon-right-primary")}"
            icon-left-primary="${k()}"
            text="${this.t("metas-saving-goals-list-goals-dashboard-detail-account-title")}"
          ></bbva-header-main>
          <bbva-header-category
            ambient="light"
            heading-level="3"
            text="${this.t("metas-saving-goals-list-goals-dashboard-detail-account-general")}"
          >
          </bbva-header-category>
          <bbva-list-simple
            disabled-tabindex
            ambient="light"
            variant="stacked"
            label="${this.t("metas-saving-goals-list-goals-dashboard-detail-account-type")}"
            description="${this.t("metas-saving-goals-bbva-plan")}"
          >
          </bbva-list-simple>
          <bbva-list-simple
            disabled-tabindex
            ambient="light"
            variant="stacked"
            label="${this.t("metas-saving-goals-list-goals-dashboard-detail-account-description")}"
            description="${(null===(t=this.dashboardAccount)||void 0===t?void 0:t.alias)||(null===(e=this.dashboardAccount)||void 0===e||null===(i=e.product)||void 0===i?void 0:i.name)}"
          >
          </bbva-list-simple>
          <bbva-list-simple
            disabled-tabindex
            ambient="light"
            variant="stacked"
            label="${this.t("metas-saving-goals-list-goals-dashboard-detail-account-date")}"
            description="${this._openingDateDetail}"
          >
          </bbva-list-simple>
        </div>
      </bbva-transition-container>
    `}get checkLimit(){return this.limitGoals>0&&this._goals.length>=this.limitGoals}static get styles(){return[ao,It,Mi.light,ui.light,Mt.dark,Ot.light,I.light,Ks.light,Bi.light,l("metas-saving-goals-list-dashboard-goals")]}render(){var t,e,i,a,s,n,r,l,c;return d`
      ${super.render()}
      <div class="bg-light100">
        <bbva-panel-detail
          no-link
          ambient="light"
          card-title="${this.savingGoalsAlias||this.t("metas-saving-goals-list-goals-dashboard-title")}"
          amount-info="${this.t("metas-saving-goals-list-goals-dashboard-actual-saving")}"
          amount="${null===(t=this.dashboardAccount)||void 0===t||null===(e=t.availableBalance)||void 0===e||null===(i=e.currentBalances[0])||void 0===i?void 0:i.amount}"
          link="${this.t("metas-saving-goals-list-goals-dashboard-account-detail")}"
          currency-code="${null===(a=this.dashboardAccount)||void 0===a||null===(s=a.availableBalance)||void 0===s||null===(n=s.currentBalances[0])||void 0===n?void 0:n.currency}"
          local-currency="${null===(r=this.dashboardAccount)||void 0===r||null===(l=r.availableBalance)||void 0===l||null===(c=l.currentBalances[0])||void 0===c?void 0:c.currency}"
          language="${this.language}"
          @panel-detail-link-click="${()=>{this._accountDetailVisible=!0}}"
        >
        </bbva-panel-detail>
      </div>
      ${this.checkLimit?d``:d`
            <bbva-button-row
              ambient="dark100"
              disabled-tabindex
              .options="${this._getOptionsButtonRow()}"
              accessibility-text="${this.t("metas-saving-goals-list-goals-dashboard-create-goal")}"
              @button-row-item-click="${this._navigateCreateNewGoal}"
            ></bbva-button-row>
          `}
      <div class="container" ambient="light">
        <bbva-header-category
          heading-level="3"
          text="${this.t("metas-saving-goals-list-goals-dashboard-associated-goals")}"
        >
        </bbva-header-category>
        ${this.listGoals.length?this._goalsSorted():this._emptyState()}
        ${this.checkLimit?d`
              <bbva-notification-message
                message-title="${this.t("metas-saving-goals-list-goals-dashboard-limit-goals")}"
                icon="${o()}"
              >
                ${this.t("metas-saving-goals-list-goals-dashboard-limit-goals-description")}
              </bbva-notification-message>
            `:d``}
      </div>
      ${this._accountDetail()}
    `}}var co=t`
:host {
  display: block;
  box-sizing: border-box;
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

*, *:before, *:after {
  box-sizing: inherit;
}

[role=listitem] {
  position: relative;
}
[role=listitem]:last-child {
  margin-bottom: 2rem;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

form {
  margin: 0;
}

[data-tag-name=bbva-form-select],
[data-tag-name=bbva-panel-process] {
  margin-bottom: 1rem;
}

fieldset {
  border: none;
  margin: 0 1rem;
  padding: 0;
  position: relative;
}

[data-tag-name=bbva-button-default] {
  display: block;
  width: -webkit-max-content;
  width: max-content;
  margin: 1.5rem auto;
}

[ambient=light] {
  overflow: hidden;
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-panel-process][ambient=dark] {
  background-color: var(--colorsTertiaryType6Dark, ${u(h.tertiaryType6Dark)});
}

[data-tag-name=bbva-form-amount] {
  text-align: left;
}

[data-tag-name=bbva-panel-info] {
  padding-top: 1rem;
}
`;class uo extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-contribute-goal"}static get scopedElements(){const t=[dt,Me,lt,Lt,Oi,Nt,ji,Vt,hi,...uo.configurationScopedElements()];return uo.scopedElementsFromClasses(t)}static get properties(){return{goal:{type:Object},visible:{type:Boolean},listAccounts:{type:Array,attribute:"list-accounts"},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},openConfirmationModal:{type:Boolean,attribute:"open-confirmation-modal"},operationNumber:{type:String,attribute:"operation-number"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},_reset:{type:Boolean},_originAccountId:{type:String},_currentAmount:{type:Number}}}constructor(){super(),this.config={back:!1,fixedHeader:!0,header:{variant:"modal",accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-contribute-header-title")},loader:!0,notify:!1},this.goal={},this.listAccounts=[],this.maskType="•",this.maxAccountChars=4,this.openConfirmationModal=!1,this.operationNumber="",this.visible=!1,this._currentAmount=null,this._originAccountId="",this._reset=!0,this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}updated(t){var e,i;(super.update(t),t.has("listAccounts")&&this.listAccounts!==t.get("listAccounts")&&0!==this.listAccounts.length)&&(this._originAccountId=null===(e=this.listAccounts)||void 0===e?void 0:e[0].id);t.has("visible")&&this.visible!==t.get("visible")&&this.visible&&(this._originAccountId=null===(i=this.listAccounts)||void 0===i?void 0:i[0].id,this._currentAmount=null,this._reset=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-contribute-goal-trace-route",{bubbles:!0,composed:!0,detail:{route:"contributeGoal"}})));t.has("openConfirmationModal")&&this.openConfirmationModal&&this.dispatchEvent(new CustomEvent("metas-saving-goals-contribute-goal-trace-route",{bubbles:!0,composed:!0,detail:{route:"successfulContribution"}})),t.has("_reset")&&!this._reset&&(this._reset=!0)}static get styles(){return[co,ut.light,Mi.light,qt.light,Bt.dark,Bi.light,Oe.light,l("metas-saving-goals-contribute-goal")]}_callbackModal(){return this.openConfirmationModal?this._close():this.dispatchEvent(new CustomEvent("metas-saving-goals-contribute-goal-exit",{detail:!0,bubbles:!0,composed:!0}))}_onBlurAmount(t){t.target.invalid=Number(this._currentAmount)>this._remaining}get _remaining(){var t,e;return null===(t=this.goal)||void 0===t||null===(e=t.remainingAmount)||void 0===e?void 0:e.amount}get _checkDisabled(){return!(this._currentAmount&&this._currentAmount<=this._remaining&&this._originAccountId)}get _selectedAccount(){var t;return null===(t=this.listAccounts)||void 0===t?void 0:t.find((t=>t.id===this._originAccountId))}get _initialSaving(){var t,e,i,a;return Cs(null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.amount,null===(i=this.goal)||void 0===i||null===(a=i.currentAmount)||void 0===a?void 0:a.currency,this.language)}get _remainingLiteral(){var t,e;return Cs(this._remaining,null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.currency,this.language)}_close(){this.openConfirmationModal=!1}_sendEventContributeOk(){this._currentAmount=null,this.dispatchEvent(new CustomEvent("metas-saving-goals-contribute-goal-contribute-goal-ok",{detail:!0,bubbles:!0,composed:!0}))}_saveContribution(){const t=this.listAccounts.find((t=>t.id===this._originAccountId));this.dispatchEvent(new CustomEvent("metas-saving-goals-contribute-goal-save-contribution",{bubbles:!0,composed:!0,detail:{amount:this._currentAmount,account:{id:this._originAccountId,number:null==t?void 0:t.number,numberType:null==t?void 0:t.numberType}}}))}_makeContributionTemplate(){var t,e,i,a,s,o;return d`
      <bbva-panel-info
        disabled-tabindex
        .microillustration=${Ht}
        heading="${this.t("metas-saving-goals-contribute-panel-info-title")}"
        text="${this.t("metas-saving-goals-contribute-panel-info-text",{saving:this._initialSaving,remaining:this._remainingLiteral,goalName:null===(t=this.goal)||void 0===t?void 0:t.description})}"
      >
      </bbva-panel-info>
      <form>
        <fieldset>
          <bbva-form-select
            @change="${t=>{this._originAccountId=t.target.value}}"
            ?disabled="${!(null!==(e=this.listAccounts)&&void 0!==e&&e.length)}"
            value=${this._originAccountId}
            label="${this.t("metas-saving-goals-contribute-origin-account")}"
            required
          >
            ${this.listAccounts.map(((t,e)=>d`
                <bbva-form-option
                  ?selected="${0===e}"
                  .icon="${Ft()}"
                  value="${t.id}"
                >
                  ${U(null==t?void 0:t.number,this.maskType,!0,this.maxAccountChars)}
                </bbva-form-option>
              `))}
          </bbva-form-select>
        </fieldset>
        ${this._reset?d`
              <fieldset>
                <bbva-form-amount
                  label=${this.t("metas-saving-goals-contribute-form-amount-title")}
                  .amount="${this._currentAmount}"
                  currency-code="${null===(i=this.goal)||void 0===i||null===(a=i.currentAmount)||void 0===a?void 0:a.currency}"
                  local-currency="${null===(s=this.goal)||void 0===s||null===(o=s.currentAmount)||void 0===o?void 0:o.currency}"
                  @form-amount-input-change=${t=>{var e;this._currentAmount=(null===(e=t.detail)||void 0===e?void 0:e.amount)||null}}
                  @form-field-input-blur=${this._onBlurAmount}
                  error-message=${this.t("metas-saving-goals-contribute-form-amount-label-error")}
                  required
                >
                </bbva-form-amount>
              </fieldset>
            `:gt}
        <bbva-button-default
          id="contributeButton"
          @click="${this._saveContribution}"
          ?disabled="${this._checkDisabled}"
        >
          ${this.t("metas-saving-goals-contribute-panel-info-button")}
        </bbva-button-default>
      </form>
    `}_renderHelpModal(){var t,e,i,a,s,o,n;return d`
      <bbva-help-modal
        id="modalId"
        full-height
        header-type="process"
        header-text="${this.t("metas-saving-goals-contribute-header-title")}"
        ?visible="${this.openConfirmationModal}"
        hide-content-padding-top
        icon-right-primary=${ct()}
        button-text="${this.t("metas-saving-goals-contribute-close")}"
        @help-modal-footer-button-click=${this._close}
        @help-modal-close=${this._sendEventContributeOk}
      >
        <div slot="slot-content">
          <bbva-panel-process
            ambient="dark"
            language="${this.language}"
            heading="${this.t("metas-saving-goals-contribute-panel-process-heading")}"
            date="${(new Date).toISOString()}"
            .dateFormat="${{day:"numeric",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"}}"
            text="${this.t("metas-saving-goals-contribute-panel-process-text")}"
            amount="${this._currentAmount}"
            currency-code="${null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.currency}"
            local-currency="${null===(i=this.goal)||void 0===i||null===(a=i.currentAmount)||void 0===a?void 0:a.currency}"
          >
          </bbva-panel-process>
          <bbva-panel-operation
            clip-item="accountdollar"
            clip-item-right="accountdollar"
            label-left="${this.t("metas-saving-goals-account")}"
            label-right="${this.t("metas-saving-goals-plan")}"
          >
            <span slot="left"
              >${U((null===(s=this._selectedAccount)||void 0===s?void 0:s.number)||"",this.maskType,!0,this.maxAccountChars)}</span
            >
            <span slot="right"
              >${U((null===(o=this.savingGoalAccount)||void 0===o?void 0:o.number)||"",this.maskType,!0,this.maxAccountChars)}</span
            >
          </bbva-panel-operation>
          <div role="list" ambient="light">
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("metas-saving-goals-contribute-name-goal")}"
                description-medium
                description="${null===(n=this.goal)||void 0===n?void 0:n.description}"
              >
              </bbva-list-simple>
            </div>
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("metas-saving-goals-operation-id")}"
                description-medium
                description="${this.operationNumber}"
              >
              </bbva-list-simple>
            </div>
          </div>
        </div>
      </bbva-help-modal>
    `}render(){return d`
      ${super.render()} ${this._renderHelpModal()}
      <div ambient="light">
        ${this._makeContributionTemplate()}
      </div>
    `}}var ho=t`
:host {
  display: block;
  box-sizing: border-box;
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  :host {
    --safe-area-inset-bottom: env(safe-area-inset-bottom);
    padding-bottom: var(--safe-area-inset-bottom, 0);
  }
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

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-header-category] {
  padding-top: 1.5rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}

[data-tag-name=bbva-help-modal] {
  transform: translateZ(0.01px);
}

[data-tag-name=bbva-divider] {
  display: block;
}

@supports (padding-top: env(safe-area-inset-top)) {
  [data-tag-name=bbva-button-operations] {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}

[data-tag-name=bbva-header-main] {
  transform: translateZ(0.01px);
  --bbva-header-main-dark-mode-bg-color: var(--ambientsDark300, ${u(nt.dark300)});
}

[ambient=dark] {
  background-color: var(--ambientsDark, ${u(nt.dark)});
}

[ambient=dark100] {
  background-color: var(--ambientsDark100, ${u(nt.dark100)});
}

[ambient=dark300] {
  background-color: var(--ambientsDark300, ${u(nt.dark300)});
}

[ambient=light] {
  overflow: hidden;
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-date] {
  display: flex;
  justify-content: center;
  padding-top: 1rem;
}

[data-tag-name=bbva-list-budget] {
  -webkit-transform: translateZ(0.01px);
  transform: translateZ(0.01px);
}

[data-tag-name=bbva-transition-container]#list-operations {
  transform: translateZ(0.02px);
  --bbva-transition-container-content-bg-color: var(--colorsPrimaryMedium, ${u(h.primaryMedium)});
}
`;class go extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-detail-goal"}static get scopedElements(){const t=[kt,Dt,v,dt,Gt,li,jt,pi,Oi,Pt,Ut,zt,wt,gi,...go.configurationScopedElements()];return go.scopedElementsFromClasses(t)}static get properties(){return{goal:{type:Object},listGoals:{type:Array,attribute:"list-goals"},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},scheduledTransferByGoal:{type:Object,attribute:"scheduled-transfer-by-goal"},listContributions:{type:Array,attribute:"list-contributions"},listAccounts:{type:Array,attribute:"list-accounts"},listRules:{type:Array,attribute:"list-rules"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},visible:{type:Boolean},rulesByGoal:{type:Array,attribute:"rules-by-goal"},savingGoalsTransfer:{type:Boolean,attribute:"saving-goals-transfer"},_openMoreOptions:{type:Boolean},_openRemoveGoalModal:{type:Boolean},_openModalCompleted:{type:Boolean}}}constructor(){super(),this.config={fixedHeader:!0,header:{accessibilityTextIconLeftPrimary:this.t("metas-saving-goals-accessibility-icon-left-primary"),text:this.t("metas-saving-goals-detail-goal-header-title")},loader:!0,notify:!1},this.goal={},this.listAccounts=[],this.listContributions=[],this.listGoals=[],this.listRules=[],this.maskType="•",this.maxAccountChars=4,this.rulesByGoal=[],this.savingGoalAccount={},this.savingGoalsTransfer=!1,this.scheduledTransferByGoal={},this.visible=!1,this._openModalCompleted=!1,this._openMoreOptions=!1,this._openRemoveGoalModal=!1,this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}updated(t){var e,i;if(super.updated(t),t.has("visible")&&this.visible!==t.get("visible")&&this.visible){this._openModalCompleted=!0;const t={route:"detailGoal"};this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-goal-trace-route",{bubbles:!0,composed:!0,detail:t}))}t.has("goal")&&0!==Object.keys(this.goal).length&&"FINISHED"===(null===(e=this.goal)||void 0===e||null===(i=e.status)||void 0===i?void 0:i.id)&&this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-goal-trace-route",{bubbles:!0,composed:!0,detail:{route:"completeGoalModal"}})),t.has("visible")&&this.visible!==t.get("visible")&&!this.visible&&this._openMoreOptions&&(this._openMoreOptions=!1)}_callbackModal(){var t,e;return this.visible&&"FINISHED"===(null===(t=this.goal)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)&&this._openModalCompleted?this._navigateBack():this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-exit",{detail:!0,bubbles:!0,composed:!0}))}_getOptions(){return[{icon:Wt(),label:this.t("metas-saving-goals-detail-contributions-formula")},{icon:Kt(),label:this.t("metas-saving-goals-detail-contribute-now")},{icon:Xt(),label:this.t("metas-saving-goals-detail-make-withdrawal")},{icon:Yt(),label:this.t("metas-saving-goals-detail-more-option")}]}_getOptionsInvalid(){return[{icon:Xt(),label:this.t("metas-saving-goals-detail-to-take-money-out")},{icon:o(),label:this.t("metas-saving-goals-detail-more-information")}]}_getMoreOptions(){const t=[{icon:Wt(),label:this.t("metas-saving-goals-detail-contributions-formula")},{icon:Kt(),label:this.t("metas-saving-goals-detail-make-contribution")},{icon:Xt(),label:this.t("metas-saving-goals-detail-make-withdrawal")},{icon:Jt(),label:this.t("metas-saving-goals-detail-handover-between-goals")},{icon:Zt(),label:this.t("metas-saving-goals-edit-goal-title")},{icon:Qt(),label:this.t("metas-saving-goals-detail-delete-goal")},{icon:o(),label:this.t("metas-saving-goals-detail-more-information")}];return this._checkSavingGoalsTransferOption(t)}_checkSavingGoalsTransferOption(t){const e=t;return this.savingGoalsTransfer&&e.splice(3,1),e}_getReminder(){return[this.t("metas-saving-goals-detail-contribution-automatic"),this.t("metas-saving-goals-detail-now-get-money"),this.t("metas-saving-goals-detail-habit-save")]}_viewListCardList(t,e){var i,a,s;return d`
      <div role="listitem">
        <bbva-list-movement
          ambient="light"
          card-title="${this._getTitleMovement(t)}"
          amount="${null==t||null===(i=t.contributionAmount)||void 0===i?void 0:i.amount}"
          mask="${this._getAccountNumberMovement(t)}"
          local-currency="${null==t||null===(a=t.contributionAmount)||void 0===a?void 0:a.currency}"
          currency-code="${null==t||null===(s=t.contributionAmount)||void 0===s?void 0:s.currency}"
          bank-image-alt-text="BBVABank"
          language="${this.language}"
        >
        </bbva-list-movement>
        <bbva-divider ambient="light" size="${e?"full":"fit"}"></bbva-divider>
      </div>
    `}_navigateBack(){this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-navigate-back",{detail:!0,bubbles:!0,composed:!0}))}_modalMoreOptions(){return d`
      <bbva-transition-container id="list-operations" veiled ?visible="${this._openMoreOptions}">
        <div slot="slot-content">
          <bbva-button-operations
            ambient="dark100"
            close-icon="${ct()}"
            close-label="close"
            category-header="${this.t("metas-saving-goals-detail-options")}"
            @button-operations-icon-close="${this._closeMoreInformation}"
            .options="${this._getMoreOptions()}"
            @button-operations-item-click="${this._selectMoreOptions}"
          >
          </bbva-button-operations>
        </div>
      </bbva-transition-container>
    `}_getTitleMovement(t){var e,i,a,s,o,n,r,l,d,c,u,h,g;if("SCHEDULED"===(null==t||null===(e=t.contributionType)||void 0===e?void 0:e.id))return this.t("metas-saving-goals-detail-scheduled-transfer");if("ASYNCHRONOUS"===(null==t||null===(i=t.contributionType)||void 0===i?void 0:i.id))return this.t("metas-saving-goals-detail-rounding");let m;var p,v,b,_,f,y;return null!=t&&null!==(a=t.originContract)&&void 0!==a&&null!==(s=a.savingGoal)&&void 0!==s&&s.id&&null!=t&&null!==(o=t.savingContract)&&void 0!==o&&null!==(n=o.savingGoal)&&void 0!==n&&n.id?(m=1===Math.sign(null==t||null===(p=t.contributionAmount)||void 0===p?void 0:p.amount)?null==t||null===(v=t.originContract)||void 0===v||null===(b=v.savingGoal)||void 0===b?void 0:b.id:null==t||null===(_=t.savingContract)||void 0===_||null===(f=_.savingGoal)||void 0===f?void 0:f.id,null===(y=this.listGoals.find((t=>t.id===m)))||void 0===y?void 0:y.description):(m=null!=t&&null!==(r=t.originContract)&&void 0!==r&&null!==(l=r.savingGoal)&&void 0!==l&&l.id?null==t||null===(d=t.savingContract)||void 0===d?void 0:d.id:null==t||null===(c=t.originContract)||void 0===c?void 0:c.id,(null===(u=this.listAccounts.find((t=>t.id===m)))||void 0===u?void 0:u.alias)||(null===(h=this.listAccounts.find((t=>t.id===m)))||void 0===h||null===(g=h.product)||void 0===g?void 0:g.name))}_getAccountNumberMovement(t){var e,i,a,s,o,n,r,l,d,c,u,h,g,m;if(null!=t&&null!==(e=t.originContract)&&void 0!==e&&null!==(i=e.savingGoal)&&void 0!==i&&i.id&&null!=t&&null!==(a=t.savingContract)&&void 0!==a&&null!==(s=a.savingGoal)&&void 0!==s&&s.id)return null===(h=this.savingGoalAccount)||void 0===h?void 0:h.number;if("ASYNCHRONOUS"===(null==t||null===(o=t.contributionType)||void 0===o?void 0:o.id))return null===(g=this.savingGoalAccount)||void 0===g?void 0:g.number;if("SCHEDULED"===(null==t||null===(n=t.contributionType)||void 0===n?void 0:n.id))return null===(m=this.savingGoalAccount)||void 0===m?void 0:m.number;const p=null!=t&&null!==(r=t.originContract)&&void 0!==r&&null!==(l=r.savingGoal)&&void 0!==l&&l.id?null==t||null===(d=t.savingContract)||void 0===d?void 0:d.id:null==t||null===(c=t.originContract)||void 0===c?void 0:c.id;return null===(u=this.listAccounts.find((t=>t.id===p)))||void 0===u?void 0:u.number}_closeMoreInformation(){this._openMoreOptions=!1}_selectOptions(t){var e,i,a;const s=null===(a=("VALID"===(null===(e=this.goal)||void 0===e||null===(i=e.status)||void 0===i?void 0:i.id)?[{id:0,name:"contributionFormulas"},{id:1,name:"contributeGoal"},{id:2,name:"refundGoal"},{id:3,name:"moreOptions"}]:[{id:0,name:"withdrawSavings"},{id:1,name:"moreInfo"}]).find((e=>e.id===t.detail)))||void 0===a?void 0:a.name;if("moreOptions"===s)this._openMoreOptions=!0;else if("moreInfo"===s)this._openMoreInfoModal();else if(s){var o;this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-goal-navigate",{detail:{routeName:s,goalId:null===(o=this.goal)||void 0===o?void 0:o.id},bubbles:!0,composed:!0}))}}_selectMoreOptions(t){var e,i,a;const s=null===(e=this._checkSavingGoalsTransferOption(["contributionFormulas","contributeGoal","refundGoal","transferBetweenGoals","editGoal","deleteGoal","moreInfo"]).map(((t,e)=>({id:e,name:t}))).find((e=>e.id===t.detail)))||void 0===e?void 0:e.name;"deleteGoal"===s&&0===(null===(i=this.goal)||void 0===i||null===(a=i.currentAmount)||void 0===a?void 0:a.amount)?(this._openMoreOptions=!1,this._openRemoveGoalModal=!0):"moreInfo"===s?(this._openMoreOptions=!1,this._openMoreInfoModal()):s&&(this._openMoreOptions=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-goal-navigate",{detail:{routeName:s,goalId:this.goal.id},bubbles:!0,composed:!0})))}_getCardBannerInfo(t){var e,i,a,s;return"EXPIRED"===(null===(e=this.goal)||void 0===e||null===(i=e.status)||void 0===i?void 0:i.id)?"status"===t?this.t("metas-saving-goals-badge-info-expired"):"calendar":"FINISHED"===(null===(a=this.goal)||void 0===a||null===(s=a.status)||void 0===s?void 0:s.id)?"status"===t?this.t("metas-saving-goals-badge-info-achieved"):"awardgold":"status"===t?"":"flagdollar"}_cardBanner(){var t,e,i,a,s,o,n,r;return d`
      ${this.goal?d`
            <bbva-date
              date="${null===(t=this.goal)||void 0===t||null===(e=t.goalPeriod)||void 0===e||null===(i=e.expirationDate)||void 0===i?void 0:i.replaceAll("-","/")}"
              locale="${this.language}"
            ></bbva-date>
            <bbva-card-banner
              disabled-tabindex
              id="card-banner-info"
              variant="full-width"
              microillustration="${this._getCardBannerInfo("microillustration")}"
              status-label="${this._getCardBannerInfo("status")}"
              .date-title="${null===(a=this.goal)||void 0===a||null===(s=a.goalPeriod)||void 0===s?void 0:s.expirationDate}"
              .title="${null===(o=this.goal)||void 0===o?void 0:o.description}"
              text-entity="${null!==(n=this.savingGoalAccount)&&void 0!==n&&n.number?U(null===(r=this.savingGoalAccount)||void 0===r?void 0:r.number,this.maskType,!0,this.maxAccountChars):""}"
            >
            </bbva-card-banner>
          `:""}
    `}_getProgressBarColor(){var t,e;return"EXPIRED"===(null===(t=this.goal)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)?h.secondary400:h.tertiaryType6}get _getAmountLabel(){var t,e;return"FINISHED"===(null===(t=this.goal)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)?"metas-saving-goals-detail-you-did":"metas-saving-goals-detail-saved"}_listBudget(){var t,e,i,a,s,o,n,r,l,c;return d`
      <bbva-list-budget
        disabled-tabindex
        language="${this.language}"
        show-info
        title-book
        ?loading="${this._isListBudgetLoading}"
        budget-title="${this.t("metas-saving-goals-detail-goal")}"
        amount-label=${this._getAmountLabel}
        total-amount="${null===(t=this.goal)||void 0===t||null===(e=t.goalAmount)||void 0===e?void 0:e.amount}"
        local-currency="${null===(i=this.goal)||void 0===i||null===(a=i.currentAmount)||void 0===a?void 0:a.currency}"
        currency-code="${null===(s=this.goal)||void 0===s||null===(o=s.currentAmount)||void 0===o?void 0:o.currency}"
        amount="${null===(n=this.goal)||void 0===n||null===(r=n.currentAmount)||void 0===r?void 0:r.amount}"
        info-amount="${null===(l=this.goal)||void 0===l||null===(c=l.currentAmount)||void 0===c?void 0:c.amount}"
        progress-bar-color="${this._getProgressBarColor()}"
        progress-bar-accessibility-text="${this.t("metas-saving-goals-detail-progress-bar-accessibility")}"
      >
      </bbva-list-budget>
    `}get _isListBudgetLoading(){var t,e,i,a,s,o,n,r;return!(null!==(t=this.goal)&&void 0!==t&&null!==(e=t.goalAmount)&&void 0!==e&&e.amount&&null!==(i=this.goal)&&void 0!==i&&null!==(a=i.currentAmount)&&void 0!==a&&a.currency&&null!==(s=this.goal)&&void 0!==s&&null!==(o=s.currentAmount)&&void 0!==o&&o.amount||0===(null===(n=this.goal)||void 0===n||null===(r=n.currentAmount)||void 0===r?void 0:r.amount))}_navigateWithdrawSavings(){var t;this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-goal-navigate",{detail:{routeName:"withdrawSavings",goalId:null===(t=this.goal)||void 0===t?void 0:t.id},bubbles:!0,composed:!0}))}_navigateContributionFormulas(){var t;this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-goal-navigate",{detail:{routeName:"contributionFormulas",goalId:null===(t=this.goal)||void 0===t?void 0:t.id},bubbles:!0,composed:!0}))}_getlistRulesByGoal(){var t,e;if(this.goal&&"EXPIRED"!==(null===(t=this.goal)||void 0===t?void 0:t.status.id)&&"FINISHED"!==(null===(e=this.goal)||void 0===e?void 0:e.status.id)&&(this.listRules.length||this.scheduledTransferByGoal.id)){return this.listRules.filter((t=>{var e;return null===(e=this.rulesByGoal)||void 0===e?void 0:e.find((e=>e.id===t.id))})).length||this.scheduledTransferByGoal.id}return!1}get _noficationMessage(){var t,e,i,a;return d`
      ${this.goal&&"FINISHED"===(null===(t=this.goal)||void 0===t?void 0:t.status.id)?d`
            <bbva-notification-message
              button-text="${this.t("metas-saving-goals-detail-to-take-money-out")}"
              @notification-message-button-click="${this._navigateWithdrawSavings}"
            >
              ${this.t("metas-saving-goals-notification-finished")}
            </bbva-notification-message>
          `:""}
      ${this.goal&&"EXPIRED"===(null===(e=this.goal)||void 0===e?void 0:e.status.id)?d`
            <bbva-notification-message
              variant="information"
              message-title="${this.t("metas-saving-goals-detail-date-expired")}"
              button-text="${this.t("metas-saving-goals-detail-to-take-money-out")}"
              @notification-message-button-click="${this._navigateWithdrawSavings}"
            >
              ${this.t("metas-saving-goals-detail-notification-message-expired")}
            </bbva-notification-message>
          `:""}
      ${this._getlistRulesByGoal()||"FINISHED"===(null===(i=this.goal)||void 0===i?void 0:i.status.id)||"EXPIRED"===(null===(a=this.goal)||void 0===a?void 0:a.status.id)?"":d`
            <bbva-notification-message
              link-title="${this.t("metas-saving-goals-detail-go-contribution")}"
              @notification-message-link-click="${this._navigateContributionFormulas}"
            >
              ${this.t("metas-saving-goals-detail-notification-message-detail")}
            </bbva-notification-message>
          `}
    `}_panelInfo(){return d`
      <bbva-panel-info
        disabled-tabindex
        ambient="light"
        .microillustration=${N}
        heading-level="4"
        heading="${this.t("metas-saving-goals-detail-no-movements-short")}"
        text="${this.t("metas-saving-goals-detail-no-movements")}"
      >
      </bbva-panel-info>
    `}_listContributionsTemplate(){return 0===this.listContributions.length?this._panelInfo():this._listContributionsGroupDate()}_listContributionsGroupDate(){var t;return d`
      ${null===(t=this.listContributions)||void 0===t?void 0:t.map(((t,e)=>d`
            ${this._hasHeader(t,e)?d`
                  <bbva-header-category
                    ambient="light"
                    text="${this._getDate(t.contributionDate)}"
                    variant="date"
                    heading-level="4"
                  >
                  </bbva-header-category>
                `:d``}
            <div role="list">
              ${this._viewListCardList(t,this._isFull(e))}
            </div>
          `))}
    `}_isFull(t){return t+1===this.listContributions.length||this._hasHeader(this.listContributions[t+1],t+1)}_hasHeader(t,e){var i;return 0===e||(null===(i=this.listContributions[e-1])||void 0===i?void 0:i.contributionDate)!==t.contributionDate}_getDate(t){return new Date(null==t?void 0:t.replaceAll("-","/")).toLocaleDateString(this.language,{day:"numeric",month:"long",year:"numeric"})}_validGoal(){var t,e;return d`
      ${"VALID"===(null===(t=this.goal)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)?d`
            <bbva-button-row
              ambient="dark100"
              disabled-tabindex
              id="five-buttons"
              variant="simple"
              accessibility-text="${this.t("metas-saving-goals-detail-available-sections")}"
              .options="${this._getOptions()}"
              @button-row-item-click="${this._selectOptions}"
            ></bbva-button-row>
            ${this._noficationMessage}
          `:d``}
    `}_invalidGoal(){var t,e,i,a;return d`
      ${"EXPIRED"===(null===(t=this.goal)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)||"FINISHED"===(null===(i=this.goal)||void 0===i||null===(a=i.status)||void 0===a?void 0:a.id)?d`
            <bbva-button-row
              ambient="dark100"
              disabled-tabindex
              id="two-buttons"
              accessibility-text="${this.t("metas-saving-goals-detail-available-sections")}"
              .options="${this._getOptionsInvalid()}"
              @button-row-item-click="${this._selectOptions}"
            ></bbva-button-row>
            <div ambient="light">
              ${this._noficationMessage}
            </div>
          `:d``}
    `}_handleDelete(){this._openRemoveGoalModal=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-goal-delete-goal",{bubbles:!0,composed:!0,detail:!0}))}_removeGoalModal(){return d`
      <bbva-help-modal
        ?visible="${this._openRemoveGoalModal}"
        title-icon="${ht()}"
        body-text="${this.t("metas-saving-goals-delete-goal-confirm-delete-empty-text")}"
        button-text="${this.t("metas-saving-goals-detail-delete-goal")}"
        modal-type="info"
        @help-modal-footer-button-click="${this._handleDelete}"
        @help-modal-footer-link-click="${()=>{this._openRemoveGoalModal=!1}}"
        @help-modal-veil-click="${()=>{this._openRemoveGoalModal=!1}}"
        link-text="${this.t("metas-saving-goals-cancel")}"
      >
      </bbva-help-modal>
    `}_openMoreInfoModal(){this.dispatchEvent(new CustomEvent("metas-saving-goals-detail-goal-more-info-modal",{detail:!0,bubbles:!0,composed:!0}))}_completedModalGoalTemplate(){var t,e;return d`
      <bbva-help-modal
        id="modalFinished"
        full-height
        header-type="info"
        header-text="${this.t("metas-saving-goals-modal-goal-save")}"
        ?visible=${this.visible&&"FINISHED"===(null===(t=this.goal)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)&&this._openModalCompleted}
        icon-right-primary=${ct()}
      >
        <div slot="slot-content">
          <bbva-card-banner
            disabled-tabindex
            ambient="light"
            variant="full-width"
            header-level="2"
            microillustration="awardgold"
            title="${this.t("metas-saving-goals-detail-you-did")}"
            description="${this.t("metas-saving-goals-detail-reached-your-goal")}"
            .listItems=${this._getReminder()}
            button-text="${this.t("metas-saving-goals-detail-to-take-money-out")}"
            link-text="${this.t("metas-saving-goals-detail-see-goal-detail")}"
            @card-banner-link-click="${()=>{this._openModalCompleted=!1}}"
            @card-banner-button-click="${this._navigateWithdrawSavings}"
          >
          </bbva-card-banner>
        </div>
      </bbva-help-modal>
    `}static get styles(){return[ho,It,vi.dark,di.dark,di.light,Mt.dark,mi.dark,te.light,Ot.light,Mi.light,ee.dark,ie.light,l("metas-saving-goals-detail-goal")]}render(){return d`
      ${super.render()}${this._removeGoalModal()}
      <div ambient="dark300">
        ${this._modalMoreOptions()} ${this._cardBanner()} ${this._listBudget()}
      </div>
      <div ambient="light">
        ${this._validGoal()} ${this._invalidGoal()}
        <bbva-header-category
          ambient="light"
          text="${this.t("metas-saving-goals-detail-movements")}"
          heading-level="3"
        >
        </bbva-header-category>
        ${this._listContributionsTemplate()} ${this._completedModalGoalTemplate()}
      </div>
    `}}var mo=t`
:host {
  display: block;
  box-sizing: border-box;
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

*, *:before, *:after {
  box-sizing: inherit;
}

[role=listitem] {
  position: relative;
}
[role=listitem]:last-child {
  margin-bottom: 2rem;
}

form {
  margin: 0;
}

[data-tag-name=bbva-form-amount],
[data-tag-name=bbva-panel-process] {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}

fieldset {
  border: none;
  margin: 0 1rem;
  padding: 0;
  position: relative;
}

[data-tag-name=bbva-button-default] {
  display: block;
  width: -webkit-max-content;
  width: max-content;
  margin: 1.5rem auto;
}

[data-tag-name=bbva-panel-process][ambient=dark] {
  background-color: var(--colorsTertiaryType6Dark, ${u(h.tertiaryType6Dark)});
}

[ambient=dark] {
  overflow: hidden;
  background-color: var(--ambientsDark, ${u(nt.dark)});
}

[ambient=light] {
  overflow: hidden;
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-form-amount] {
  text-align: left;
}

[data-tag-name=bbva-form-option][tabindex="0"] {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
}

[data-tag-name=bbva-panel-info] {
  padding-top: 1rem;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}
`;class po extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-refund-goal"}static get scopedElements(){const t=[dt,Vt,Oi,Me,lt,Lt,Nt,ji,hi,...po.configurationScopedElements()];return po.scopedElementsFromClasses(t)}static get properties(){return{goal:{type:Object},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},visible:{type:Boolean},listAccounts:{type:Array,attribute:"list-accounts"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},openConfirmationModal:{type:Boolean,attribute:"open-confirmation-modal"},operationNumber:{type:String,attribute:"operation-number"},_amount:{type:String},_destinationAccountId:{type:String},_reset:{type:Boolean}}}constructor(){super(),this.config={back:!1,fixedHeader:!0,header:{variant:"modal",accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-refund-goal-header-title")},loader:!0,notify:!1},this.goal={},this.visible=!1,this.listAccounts=[],this.maskType="•",this.maxAccountChars=4,this.operationNumber="",this.openConfirmationModal=!1,this._destinationAccountId="",this._reset=!0,this._amount=null,this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}updated(t){super.update(t),t.has("listAccounts")&&this.listAccounts!==t.get("listAccounts")&&0!==this.listAccounts.length&&(this._destinationAccountId=this.listAccounts[0].id),t.has("visible")&&this.visible!==t.get("visible")&&this.visible&&(this._destinationAccountId=this.listAccounts[0].id,this._amount=null,this._reset=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-refund-goal-trace-route",{bubbles:!0,composed:!0,detail:{route:"refundGoal"}}))),t.has("_reset")&&!this._reset&&(this._reset=!0),t.has("openConfirmationModal")&&this.openConfirmationModal&&this.dispatchEvent(new CustomEvent("metas-saving-goals-refund-goal-trace-route",{bubbles:!0,composed:!0,detail:{route:"successfulRefundGoal"}}))}static get styles(){return[mo,ut.light,Mi.light,qt.light,Bt.dark,Bi.light,Oe.light,l("metas-saving-goals-refund-goal")]}get _checkDisabled(){return!this._destinationAccountId||!this._checkValidAmount()}get _amountErrorMessage(){return 0===Number(this._amount)?this.t("metas-saving-goals-refund-goal-amount-required"):this.t("metas-saving-goals-refund-goal-amount-error")}get _accountsDisabled(){var t;return 0===(null===(t=this.listAccounts)||void 0===t?void 0:t.length)}get _originContract(){var t;return null===(t=this.savingGoalAccount)||void 0===t?void 0:t.number}get _destinyContract(){var t,e;return null===(t=this.listAccounts)||void 0===t||null===(e=t.find((t=>t.id===this._destinationAccountId)))||void 0===e?void 0:e.number}get _currentAmount(){var t,e,i;return Cs(null===(t=this.goal.currentAmount)||void 0===t?void 0:t.amount,null===(e=this.goal)||void 0===e||null===(i=e.currentAmount)||void 0===i?void 0:i.currency,this.language)}_callbackModal(){return this.openConfirmationModal?this._closeSuccessModal():this.dispatchEvent(new CustomEvent("metas-saving-goals-refund-goal-exit",{detail:!0,bubbles:!0,composed:!0}))}_saveRefund(){var t;const e=null===(t=this.listAccounts)||void 0===t?void 0:t.find((t=>t.id===this._destinationAccountId));this.dispatchEvent(new CustomEvent("metas-saving-goals-refund-goal-save-refund",{bubbles:!0,composed:!0,detail:{amount:this._amount,account:{id:this._destinationAccountId,number:null==e?void 0:e.number,numberType:null==e?void 0:e.numberType}}}))}_checkValidAmount(){var t,e;return this._amount>0&&this._amount<=(null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.amount)}_onBlurAmount(t){t.target.invalid=!this._checkValidAmount()}_closeSuccessModal(){this.openConfirmationModal=!1,this._sendEventRefundOk()}_sendEventRefundOk(){this.dispatchEvent(new CustomEvent("metas-saving-goals-refund-goal-refund-goal-ok",{bubbles:!0,composed:!0,detail:!0}))}get _accountsOptionsTemplate(){return d`
      ${this.listAccounts.map(((t,e)=>d`
          <bbva-form-option
            ?selected="${0===e}"
            .icon="${Ft()}"
            value="${t.id}"
          >
            ${U(null==t?void 0:t.number,this.maskType,!0,this.maxAccountChars)}
          </bbva-form-option>
        `))}
    `}_navigateCreateNewGoal(){this.dispatchEvent(new CustomEvent("metas-saving-goals-refund-goal-create-goal",{detail:{routeName:"createGoalForm"},bubbles:!0,composed:!0}))}_refundHelpModalSuccess(){var t,e,i,a,s;return d`
      <bbva-help-modal
        id="modalId"
        full-height
        header-type="process"
        header-text="${this.t("metas-saving-goals-refund-goal-header-title")}"
        ?visible="${this.openConfirmationModal}"
        hide-content-padding-top
        icon-right-primary=${ct()}
        button-text="${this.t("metas-saving-goals-refund-goal-success-modal-close")}"
        @help-modal-footer-button-click=${this._closeSuccessModal}
        @help-modal-footer-link-click=${this._navigateCreateNewGoal}
      >
        <div slot="slot-content">
          <bbva-panel-process
            ambient="dark"
            heading="${this.t("metas-saving-goals-refund-goal-success-modal-title")}"
            date="${(new Date).toISOString()}"
            .dateFormat="${{day:"numeric",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"}}"
            text="${this.t("metas-saving-goals-refund-goal-amount-placeholder")}"
            amount="${Math.abs(this._amount)}"
            currency-code="${null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.currency}"
            local-currency="${null===(i=this.goal)||void 0===i||null===(a=i.currentAmount)||void 0===a?void 0:a.currency}"
            language="${this.language}"
          >
          </bbva-panel-process>
          <bbva-panel-operation
            clip-item="accountdollar"
            clip-item-right="accountdollar"
            label-left="${this.t("metas-saving-goals-plan")}"
            label-right="${this.t("metas-saving-goals-account")}"
          >
            <span slot="left"
              >${U(this._originContract||"",this.maskType,!0,this.maxAccountChars)}</span
            >
            <span slot="right"
              >${U(this._destinyContract||"",this.maskType,!0,this.maxAccountChars)}</span
            >
          </bbva-panel-operation>
          <div role="list" ambient="light">
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("metas-saving-goals-refund-name-goal")}"
                description-medium
                description="${null===(s=this.goal)||void 0===s?void 0:s.description}"
              >
              </bbva-list-simple>
            </div>
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("metas-saving-goals-operation-id")}"
                description-medium
                description="${this.operationNumber}"
              >
              </bbva-list-simple>
            </div>
          </div>
        </div>
      </bbva-help-modal>
    `}_refundTemplate(){var t,e,i,a,s;return d`
      <bbva-panel-info
        disabled-tabindex
        heading="${this.t("metas-saving-goals-refund-goal-make-refund")}"
        text=${this.t("metas-saving-goals-refund-goal-refund-info",{goalDescription:`'${null===(t=this.goal)||void 0===t?void 0:t.description}'`,goalAmount:this._currentAmount})}
        .microillustration=${ae}
      >
      </bbva-panel-info>
      <form>
        ${this._reset?d`
              <fieldset>
                <bbva-form-amount
                  label="${this.t("metas-saving-goals-refund-goal-amount")}"
                  .amount="${this._amount}"
                  error-message="${this._amountErrorMessage}"
                  currency-code="${null===(e=this.goal)||void 0===e||null===(i=e.currentAmount)||void 0===i?void 0:i.currency}"
                  local-currency="${null===(a=this.goal)||void 0===a||null===(s=a.currentAmount)||void 0===s?void 0:s.currency}"
                  required
                  @form-field-input-blur=${this._onBlurAmount}
                  @form-amount-input-change="${t=>{var e;this._amount=(null===(e=t.detail)||void 0===e?void 0:e.amount)||null}}"
                ></bbva-form-amount>
              </fieldset>
            `:gt}
        <fieldset>
          <bbva-form-select
            @change="${t=>{this._destinationAccountId=t.target.value}}"
            ?disabled="${this._accountsDisabled}"
            value=${this._destinationAccountId}
            label="${this.t("metas-saving-goals-refund-goal-destination-account")}"
            required
          >
            ${this._accountsOptionsTemplate}
          </bbva-form-select>
        </fieldset>
        <bbva-button-default
          variant="primary"
          ?disabled="${this._checkDisabled}"
          @click="${this._saveRefund}"
        >
          ${this.t("metas-saving-goals-refund-goal-make-refund-button")}
        </bbva-button-default>
      </form>
    `}render(){return d`
      ${super.render()}
      <div ambient="light">
        ${this._refundTemplate()} ${this._refundHelpModalSuccess()}
      </div>
    `}}var vo=t`
:host {
  display: block;
  box-sizing: border-box;
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

*, *:before, *:after {
  box-sizing: inherit;
}

[role=listitem] {
  position: relative;
}
[role=listitem]:last-child {
  margin-bottom: 2rem;
}

form {
  margin: 0;
}

[data-tag-name=bbva-form-amount],
[data-tag-name=bbva-panel-process] {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}

fieldset {
  border: none;
  margin: 0 1rem;
  padding: 0;
  position: relative;
}

[data-tag-name=bbva-button-default] {
  display: block;
  width: -webkit-max-content;
  width: max-content;
  margin: 1.5rem auto;
}

[data-tag-name=bbva-panel-process][ambient=dark] {
  background-color: var(--colorsTertiaryType6Dark, ${u(h.tertiaryType6Dark)});
}

[ambient=dark] {
  overflow: hidden;
  background-color: var(--ambientsDark, ${u(nt.dark)});
}

[ambient=light] {
  overflow: hidden;
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-form-amount] {
  text-align: left;
}

[data-tag-name=bbva-form-option][tabindex="0"] {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
}

[data-tag-name=bbva-panel-info] {
  padding-top: 1rem;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}
`;class bo extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-delete-goal"}static get scopedElements(){const t=[dt,Me,lt,Lt,Oi,Nt,ji,Vt,hi,kt,...bo.configurationScopedElements()];return bo.scopedElementsFromClasses(t)}static get properties(){return{goal:{type:Object},listAccounts:{type:Array,attribute:"list-accounts"},openSuccessModal:{type:Boolean,attribute:"open-success-modal"},deleteGoalVisible:{type:Boolean,attribute:"delete-goal-visible"},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},operationNumber:{type:String,attribute:"operation-number"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},_destinationAccountId:{type:String},_openDeleteConfirmationModal:{type:Boolean}}}constructor(){super(),this.config={back:!1,fixedHeader:!0,header:{variant:"modal",accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-detail-delete-goal")},loader:!0,notify:!1},this.deleteGoalVisible=!1,this.goal={},this.listAccounts=[],this.maskType="•",this.maxAccountChars=4,this.openSuccessModal=!1,this.operationNumber="",this.savingGoalAccount={},this._destinationAccountId="",this._openDeleteConfirmationModal=!1,this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}updated(t){t.has("listAccounts")&&this.listAccounts!==t.get("listAccounts")&&0!==this.listAccounts.length&&(this._destinationAccountId=this.listAccounts[0].id),t.has("deleteGoalVisible")&&!1===this.deleteGoalVisible&&0!==this.listAccounts.length&&(this._destinationAccountId=this.listAccounts[0].id)}static get styles(){return[vo,ut.light,Mi.light,qt.light,Bt.dark,Bi.light,Oe.light,l("metas-saving-goals-delete-goal")]}get _checkDisabled(){return!this._destinationAccountId}get _accountsDisabled(){var t;return 0===(null===(t=this.listAccounts)||void 0===t?void 0:t.length)}_callbackModal(){return this.openSuccessModal?this._closeSuccessModal():this.dispatchEvent(new CustomEvent("metas-saving-goals-delete-goal-exit",{detail:!0,bubbles:!0,composed:!0}))}get _receiverAccount(){return this.listAccounts.find((t=>t.id===this._destinationAccountId))}get _amount(){var t,e;return null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.amount}_handleDelete(){var t,e;this._openDeleteConfirmationModal=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-delete-goal-delete",{bubbles:!0,composed:!0,detail:{amount:this._amount,account:{id:this._destinationAccountId,number:null===(t=this._receiverAccount)||void 0===t?void 0:t.number,numberType:null===(e=this._receiverAccount)||void 0===e?void 0:e.numberType}}}))}_closeSuccessModal(){this.openSuccessModal=!1}_sendEventDeleteGoalOk(){this.dispatchEvent(new CustomEvent("metas-saving-goals-delete-goal-delete-goal-ok",{bubbles:!0,composed:!0,detail:!0}))}_accountsOptionsTemplate(){return d`
      ${this.listAccounts.map((t=>d`
          <bbva-form-option .icon="${Ft()}" value="${t.id}">
            ${U(t.number,this.maskType,!0,this.maxAccountChars)}
          </bbva-form-option>
        `))}
    `}get _deleteGoalConfirmationModal(){var t;return d`
      <bbva-help-modal
        id="confrmationModalId"
        modal-type="info"
        title-icon="${ht()}"
        body-text="${this.t("metas-saving-goals-delete-goal-confirm-delete-text",{goalDescription:null===(t=this.goal)||void 0===t?void 0:t.description})}"
        button-text="${this.t("metas-saving-goals-detail-delete-goal")}"
        ?visible="${this._openDeleteConfirmationModal}"
        @help-modal-footer-button-click="${()=>{this._handleDelete()}}"
        @help-modal-footer-link-click="${()=>{this._openDeleteConfirmationModal=!1}}"
        link-text="${this.t("metas-saving-goals-cancel")}"
      >
      </bbva-help-modal>
    `}get _deleteGoalSuccessModal(){var t,e,i,a,s,o,n;return d`
      <bbva-help-modal
        id="modalId"
        button-text="${this.t("metas-saving-goals-close")}"
        full-height
        header-type="process"
        header-text="${this.t("metas-saving-goals-delete-goal-success-modal-header-title")}"
        hide-content-padding-top
        icon-right-primary=${ct()}
        ?visible="${this.openSuccessModal}"
        @help-modal-close=${this._sendEventDeleteGoalOk}
        @help-modal-footer-button-click="${this._closeSuccessModal}"
      >
        <div slot="slot-content">
          <bbva-panel-process
            ambient="dark"
            heading="${this.t("metas-saving-goals-refund-goal-success-modal-title")}"
            date="${(new Date).toISOString()}"
            .dateFormat="${{day:"numeric",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"}}"
            text="${this.t("metas-saving-goals-refund-goal-amount")}"
            amount="${Math.abs(this._amount)}"
            currency-code="${null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.currency}"
            local-currency="${null===(i=this.goal)||void 0===i||null===(a=i.currentAmount)||void 0===a?void 0:a.currency}"
            language="${this.language}"
          >
          </bbva-panel-process>
          <bbva-panel-operation
            clip-item="accountdollar"
            clip-item-right="accountdollar"
            label-left="${this.t("metas-saving-goals-plan")}"
            label-right="${this.t("metas-saving-goals-account")}"
          >
            <span slot="left"
              >${U((null===(s=this.savingGoalAccount)||void 0===s?void 0:s.number)||"",this.maskType,!0,this.maxAccountChars)}</span
            >
            <span slot="right"
              >${U((null===(o=this._receiverAccount)||void 0===o?void 0:o.number)||"",this.maskType,!0,this.maxAccountChars)}</span
            >
          </bbva-panel-operation>
          <div role="list" ambient="light">
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("metas-saving-goals-name-goal")}"
                description-medium
                description="${null===(n=this.goal)||void 0===n?void 0:n.description}"
              >
              </bbva-list-simple>
            </div>
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("metas-saving-goals-operation-id")}"
                description-medium
                description="${this.operationNumber}"
              >
              </bbva-list-simple>
            </div>
          </div>
          <bbva-notification-message
            message-title="${this.t("metas-saving-goals-delete-goal-info-title")}"
          >
            ${this.t("metas-saving-goals-delete-goal-info-text")}
          </bbva-notification-message>
        </div>
      </bbva-help-modal>
    `}get _deleteTemplate(){var t,e,i,a,s,o,n,r,l;return d`
      <bbva-panel-info
        disabled-tabindex
        heading="${this.t("metas-saving-goals-detail-delete-goal")}"
        text=${this.t("metas-saving-goals-delete-goal-text",{goalDescription:null===(t=this.goal)||void 0===t?void 0:t.description,goalAmount:Cs(null===(e=this.goal)||void 0===e||null===(i=e.currentAmount)||void 0===i?void 0:i.amount,null===(a=this.goal)||void 0===a||null===(s=a.currentAmount)||void 0===s?void 0:s.currency,this.language)})}
        .microillustration=${se}
      >
      </bbva-panel-info>
      <form>
        <fieldset>
          <bbva-form-amount
            label="${this.t("metas-saving-goals-refund-goal-amount-current")}"
            .amount="${this._amount}"
            currency-code="${null===(o=this.goal)||void 0===o||null===(n=o.currentAmount)||void 0===n?void 0:n.currency}"
            local-currency="${null===(r=this.goal)||void 0===r||null===(l=r.currentAmount)||void 0===l?void 0:l.currency}"
            disabled
          ></bbva-form-amount>
        </fieldset>
        <fieldset>
          <bbva-form-select
            @change="${t=>{this._destinationAccountId=t.target.value}}"
            ?disabled="${this._accountsDisabled}"
            value=${this._destinationAccountId}
            label="${this.t("metas-saving-goals-refund-goal-destination-account")}"
            required
          >
            ${this._accountsOptionsTemplate()}
          </bbva-form-select>
        </fieldset>
        <bbva-button-default
          variant="primary"
          ?disabled="${this._checkDisabled}"
          @click="${()=>{this._openDeleteConfirmationModal=!0}}"
        >
          ${this.t("metas-saving-goals-refund-goal-make-refund-continue")}
        </bbva-button-default>
      </form>
    `}render(){return d`
      ${super.render()}
      <div ambient="light">
        ${this._deleteTemplate} ${this._deleteGoalConfirmationModal} ${this._deleteGoalSuccessModal}
      </div>
    `}}var _o=t`
:host {
  display: block;
  box-sizing: border-box;
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

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

form {
  margin: 0;
}
form fieldset {
  border: none;
  margin: 0 1rem;
  padding: 0;
  position: relative;
}

[data-tag-name=bbva-form-amount],
[data-tag-name=bbva-panel-process] {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-button-default] {
  display: block;
  width: -webkit-max-content;
  width: max-content;
  margin: 1.5rem auto;
}

[data-tag-name=bbva-panel-process][ambient=dark] {
  background-color: var(--colorsTertiaryType6Dark, ${u(h.tertiaryType6Dark)});
}

[ambient=dark] {
  overflow: hidden;
  background-color: var(--ambientsDark, ${u(nt.dark)});
}

[ambient=light] {
  overflow: hidden;
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-form-amount] {
  text-align: left;
}

[data-tag-name=bbva-form-option][tabindex="0"] {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
}

[data-tag-name=bbva-panel-info] {
  padding-top: 1rem;
}
`;class fo extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-transfer-between-goals"}static get scopedElements(){const t=[dt,Me,lt,Lt,Oi,Nt,ji,Vt,hi,...fo.configurationScopedElements()];return fo.scopedElementsFromClasses(t)}static get properties(){return{goal:{type:Object},visible:{type:Boolean},listGoals:{type:Array,attribute:"list-goals"},openConfirmationModal:{type:Boolean,attribute:"open-confirmation-modal"},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},_destinationGoalId:{type:String},_amount:{type:Number}}}constructor(){super(),this.config={back:!1,fixedHeader:!0,header:{variant:"modal",accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-transfer-between-goals-title")},loader:!0,notify:!1},this.goal={},this.listGoals=[],this.openConfirmationModal=!1,this._amount=0,this._destinationGoalId="",this.visible=!1,this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}static get styles(){return[_o,ut.light,Mi.light,qt.light,Bt.dark,Bi.light,Oe.light,l("metas-saving-goals-transfer-between-goals")]}updated(t){t.has("listGoals")&&this.listGoals!==t.get("listGoals")&&0!==this.listGoals.length&&(this._destinationGoalId=this.listGoals[0].id),t.has("visible")&&this.visible!==t.get("visible")&&this.visible&&(this._destinationGoalId=this.listGoals[0].id,this._amount=0)}get _listGoalsDisabled(){var t;return 0===(null===(t=this.listGoals)||void 0===t?void 0:t.length)}get _listGoalsFiltered(){return this.listGoals.filter((t=>{var e;return t.id!==(null===(e=this.goal)||void 0===e?void 0:e.id)}))}get _listGoalsOptionsTemplate(){return d`
      ${this._listGoalsFiltered.map(((t,e)=>d`
          <bbva-form-option
            ?selected="${0===e}"
            .icon="${Ft()}"
            value="${t.id}"
          >
            ${t.description}
          </bbva-form-option>
        `))}
    `}get _checkDisabled(){return!this._destinationGoalId||!this._checkValidAmount()}get _amountErrorMessage(){return 0===Number(this._amount)?this.t("metas-saving-goals-transfer-between-goals-amount-required"):this.t("metas-saving-goals-transfer-between-goals-amount-error")}get _currentAmount(){var t,e,i;return Cs(null===(t=this.goal.currentAmount)||void 0===t?void 0:t.amount,null===(e=this.goal)||void 0===e||null===(i=e.currentAmount)||void 0===i?void 0:i.currency,this.language)}get _destinyGoalDescription(){var t;return null===(t=this.listGoals.find((t=>t.id===this._destinationGoalId)))||void 0===t?void 0:t.description}_saveTransfer(){var t,e,i;const a=this.listGoals.find((t=>t.id===this._destinationGoalId));this.dispatchEvent(new CustomEvent("metas-saving-goals-transfer-between-goals-save-transfer",{bubbles:!0,composed:!0,detail:{amount:this._amount,currency:null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.currency,originContractId:null===(i=this.savingGoalAccount)||void 0===i?void 0:i.id,account:{id:null==a?void 0:a.savingContract.id},destinyGoalId:this._destinationGoalId}}))}_checkValidAmount(){var t,e;return this._amount>0&&this._amount<=(null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.amount)}_onBlurAmount(t){t.target.invalid=!this._checkValidAmount()}_callbackModal(){return this.openConfirmationModal?this._closeSuccessModal():this.dispatchEvent(new CustomEvent("metas-saving-goals-transfer-between-goals-exit",{detail:!0,bubbles:!0,composed:!0}))}_closeSuccessModal(){this.openConfirmationModal=!1}_sendEventTransferBetweenGoalsOk(){this.dispatchEvent(new CustomEvent("metas-saving-goals-transfer-between-goals-transfer-between-goals-ok",{bubbles:!0,composed:!0,detail:!0}))}_transferHelpModalSuccess(){var t,e,i,a,s;return d`
      <bbva-help-modal
        id="modalId"
        full-height
        header-type="process"
        header-text="${this.t("metas-saving-goals-transfer-between-goals-title")}"
        ?visible="${this.openConfirmationModal}"
        hide-content-padding-top
        icon-right-primary=${ct()}
        button-text="${this.t("metas-saving-goals-transfer-between-goals-success-modal-close")}"
        @help-modal-footer-button-click=${this._closeSuccessModal}
        @help-modal-close=${this._sendEventTransferBetweenGoalsOk}
      >
        <div slot="slot-content">
          <bbva-panel-process
            ambient="dark"
            heading="${this.t("metas-saving-goals-transfer-between-goals-success-modal-title")}"
            date="${(new Date).toISOString()}"
            .dateFormat="${{day:"numeric",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"}}"
            text="${this.t("metas-saving-goals-transfer-between-goals-amount")}"
            amount="${Math.abs(this._amount)}"
            currency-code="${null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.currency}"
            local-currency="${null===(i=this.goal)||void 0===i||null===(a=i.currentAmount)||void 0===a?void 0:a.currency}"
            language="${this.language}"
          >
          </bbva-panel-process>
          <bbva-panel-operation
            clip-item="addgoals"
            clip-item-right="addgoals"
            label-left="${this.t("metas-saving-goals-goal")}"
            label-right="${this.t("metas-saving-goals-goal")}"
            origin-entity="${oe()}"
            target-entity="${oe()}"
          >
            <span slot="left">${null===(s=this.goal)||void 0===s?void 0:s.description}</span>
            <span slot="right">${this._destinyGoalDescription}</span>
          </bbva-panel-operation>
        </div>
      </bbva-help-modal>
    `}_transferTemplate(){var t,e,i,a,s;return d`
      <bbva-panel-info
        disabled-tabindex
        heading="${this.t("metas-saving-goals-transfer-between-goals-title")}"
        text=${this.t("metas-saving-goals-transfer-between-goals-transfer-info",{goalDescription:`'${null===(t=this.goal)||void 0===t?void 0:t.description}'`,goalAmount:this._currentAmount})}
        .microillustration=${ne}
      >
      </bbva-panel-info>
      <form>
        <fieldset>
          <bbva-form-amount
            label="${this.t("metas-saving-goals-transfer-between-goals-amount")}"
            .amount="${this._amount}"
            error-message="${this._amountErrorMessage}"
            currency-code="${null===(e=this.goal)||void 0===e||null===(i=e.currentAmount)||void 0===i?void 0:i.currency}"
            local-currency="${null===(a=this.goal)||void 0===a||null===(s=a.currentAmount)||void 0===s?void 0:s.currency}"
            required
            auto-validate
            @form-field-input-blur=${this._onBlurAmount}
            @form-amount-input-change="${t=>{this._amount=t.detail.amount}}"
          ></bbva-form-amount>
        </fieldset>
        <fieldset>
          <bbva-form-select
            @change="${t=>{this._destinationGoalId=t.target.value}}"
            ?disabled="${this._listGoalsDisabled}"
            value=${this._destinationGoalId}
            label="${this.t("metas-saving-goals-transfer-between-goals-destination-goal")}"
            required
          >
            ${this._listGoalsOptionsTemplate}
          </bbva-form-select>
        </fieldset>
        <bbva-button-default
          variant="primary"
          ?disabled="${this._checkDisabled}"
          @click="${this._saveTransfer}"
        >
          ${this.t("metas-saving-goals-transfer-between-goals-make-transfer")}
        </bbva-button-default>
      </form>
    `}render(){return d`
      ${super.render()}
      <div ambient="light">
        ${this._transferTemplate()} ${this._transferHelpModalSuccess()}
      </div>
    `}}customElements.define(ze.is,ze),customElements.define(We.is,We),customElements.define(Ke.is,Ke),customElements.define(Xe.is,Xe),customElements.define(is.is,is),customElements.define(as.is,as);var yo=t`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-content-bg-color: var(--ambientsLight100, ${u(nt.light100)});
}
:host .no-rule {
  --bbva-help-modal-content-bg-color: var(--ambientsLight, ${u(nt.light)});
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

*, *:before, *:after {
  box-sizing: inherit;
}

.box-shadow {
  box-shadow: var(--boxShadowType1, ${u(Et.type1)});
  margin: 1rem;
}

.container {
  padding: 1rem;
  height: 100%;
}

[data-tag-name=bbva-link] {
  margin: 0.5rem 1rem;
}
[data-tag-name=bbva-link]:not([href])[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

.setup-rule-container {
  box-shadow: var(--boxShadowType1, ${u(Et.type1)});
  overflow: hidden;
}
.setup-rule-container:not(:last-child) {
  margin-bottom: 1rem;
}
.setup-rule-container [data-tag-name=bbva-link] {
  display: block;
  width: -webkit-max-content;
  width: max-content;
  margin: 1.5rem auto;
}

.badge-wrapper {
  display: flex;
  padding: 0 1rem;
  font-style: italic;
  white-space: pre-wrap;
}

[data-tag-name=bbva-list-link] + [data-tag-name=bbva-list-link] {
  padding-top: 0;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-list-toggle] {
  --bbva-form-toggle-list-container-padding: 0;
}

[data-tag-name=bbva-text] {
  padding: 0 1rem;
}
[data-tag-name=bbva-text][alignment=center] {
  background-color: var(--ambientsLight, ${u(nt.light)});
  padding: 1rem;
}
[data-tag-name=bbva-text].accounts-title {
  margin: 0 0.5rem 0 0;
}
[data-tag-name=bbva-text].accounts-title, [data-tag-name=bbva-text].account {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${u(G.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${u(G.bookItalic.fontStyle)});
  padding: 0;
}

[data-tag-name=bbva-header-category] {
  padding-top: 1rem;
}

[ambient=light] {
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[ambient=light100] {
  overflow: hidden;
  background-color: var(--ambientsLight100, ${u(nt.light100)});
}

[ambient=dark300] {
  background-color: var(--ambientsDark300, ${u(nt.dark300)});
}
`;class $o extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-contribution-formulas"}static get scopedElements(){const t=[dt,v,Oi,Pt,li,Gt,L,re,le,ze,...$o.configurationScopedElements()];return $o.scopedElementsFromClasses(t)}static get properties(){return{listCards:{type:Array,attribute:"list-cards"},rulesByGoal:{type:Array,attribute:"rules-by-goal"},listRules:{type:Array,attribute:"list-rules"},openModalListFormulas:{type:Boolean,attribute:"open-modal-list-formulas"},selfDrivenApiVersion:{type:Number,attribute:"self-driven-api-version"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},contributionFormulasVisible:{type:Boolean,attribute:"contribution-formulas-visible"},scheduledTransfer:{type:Object,attribute:"scheduled-transfer"},retryContribution:{type:Boolean,reflect:!0,attribute:"retry-contribution"},_calledAvailableRule:{type:Boolean},_availableRule:{type:Boolean},_rules:{type:Array},_scheduledTransferLimitReachedModalVisible:{type:Boolean}}}constructor(){super(),this.config={fixedHeader:!0,header:{variant:"modal",accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-contribute-formula-header-title")},loader:!0,notify:!1},this.contributionFormulasVisible=!1,this.listCards=[],this.listRules=[],this.maskType="•",this.maxAccountChars=4,this.openModalListFormulas=!1,this.selfDrivenApiVersion=2,this._availableRule=!1,this._calledAvailableRule=!1,this._retryContribution=!1,this._rules=[],this._retryGetAvailableRules=!1,this._scheduledTransferLimitReachedModalVisible=!1,this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}firstUpdated(){this._selfDrivenDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-available-rules-api-dm"]')}updated(t){if(super.updated(t),(t.has("listRules")||t.has("listCards")||t.has("rulesByGoal")||t.has("contributionFormulasVisible"))&&this.contributionFormulasVisible){const t=this.listRules.filter((t=>{var e;return null===(e=this.rulesByGoal)||void 0===e?void 0:e.find((e=>e.id===t.id))}));this._rules=t.map((t=>{var e;const i=null===(e=t.senders)||void 0===e?void 0:e.reduce(this._getRuleContributingCardNumbers.bind(this),[]);return{...t,cardIds:i}}))}t.has("openModalListFormulas")&&this.dispatchEvent(new CustomEvent("open-modal",{bubbles:!0,composed:!0,detail:this.openModalListFormulas})),t.has("retryContribution")&&this.retryContribution&&this._getAvailableRules()}_getRuleContributingCardNumbers(t,e){var i,a,s;const o=t=>t.id===e.senderDetail.id;if("CARD"===(null===(i=e.senderDetail)||void 0===i||null===(a=i.product)||void 0===a||null===(s=a.productType)||void 0===s?void 0:s.id)&&this.listCards.length){const e=this.listCards.find(o);t.push(null==e?void 0:e.number.replaceAll(" ",""))}return t}static get styles(){return[yo,It,de.light,I.light,di.dark,Mi.light,ce.light,Ot.light,l("metas-saving-goals-contribution-formulas-shared-styles")]}_callbackModal(){return this.openModalListFormulas?this._closeSuccessModal():this.dispatchEvent(new CustomEvent("metas-saving-goals-contribution-formulas-exit",{detail:!0,bubbles:!0,composed:!0}))}_closeSuccessModal(){this.openModalListFormulas=!1}_activeOrDesactiveFormula(t,e){this.dispatchEvent(new CustomEvent("metas-saving-goals-contribution-formulas-update-rule",{detail:{rule:e,isActive:null==t?void 0:t.detail},bubbles:!0,composed:!0}))}_toggleScheduledTransfer({detail:t}){this.dispatchEvent(new CustomEvent("metas-saving-goals-contribution-formulas-update-scheduled-transfer",{detail:t,bubbles:!0,composed:!0}))}_navigateContribution(){this.dispatchEvent(new CustomEvent("metas-saving-goals-scheduled-contribution",{detail:{typeModalPeriodic:"CREATE"},bubbles:!0,composed:!0}))}_navigateEditContribution(){var t,e,i,a,s,o,n,r,l,d;this.dispatchEvent(new CustomEvent("metas-saving-goals-scheduled-contribution",{detail:{panelOfferText:this.t("metas-saving-goals-multistep-algorithm-panel-offer-periodic"),periodicAmount:null===(t=this.scheduledTransfer)||void 0===t||null===(e=t.sentMoney)||void 0===e?void 0:e.amount,originAccount:null===(i=this.scheduledTransfer)||void 0===i||null===(a=i.sender)||void 0===a||null===(s=a.contract)||void 0===s?void 0:s.number,frequency:null===(o=this.scheduledTransfer)||void 0===o?void 0:o.frequency,startDate:null===(n=this.scheduledTransfer)||void 0===n||null===(r=n.period)||void 0===r?void 0:r.startDate,endDate:null===(l=this.scheduledTransfer)||void 0===l||null===(d=l.period)||void 0===d?void 0:d.endDate,typeModalPeriodic:"EDIT"},bubbles:!0,composed:!0}))}_openMoreInfoModal(){this.dispatchEvent(new CustomEvent("metas-saving-goals-contribution-formulas-more-info-modal",{detail:!0,bubbles:!0,composed:!0}))}_navigateCreateNewFormula(){this.dispatchEvent(new CustomEvent("metas-saving-goals-contribution-formulas-navigate",{detail:{routeName:"create-formula"},bubbles:!0,composed:!0}))}_openModalList(t){var e;this.clearLoader(),this._availableRule=null===(e=t.detail)||void 0===e?void 0:e.find((t=>{var e;return"ROUND_UP"===(null==t||null===(e=t.ruleType)||void 0===e?void 0:e.id)})),this.openModalListFormulas=!0}_getAvailableRules(){this._calledAvailableRule?(this.clearLoader(),this.openModalListFormulas=!0):(this.showLoader("full",!1,!1),this._selfDrivenDm.getAvailableRules(),this._calledAvailableRule=!0)}_handleAvailableRulesError(){this._calledAvailableRule=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-contribution-formulas-error-get-rule",{detail:{},bubbles:!0,composed:!0})),this.clearLoader()}_navigateEditFormula(t,e){this.dispatchEvent(new CustomEvent("metas-saving-goals-contribution-formulas-navigate",{detail:{rule:e,isActive:null==t?void 0:t.detail,routeName:"update-formula"},bubbles:!0,composed:!0}))}_navigateDeleteFormula(t){const e=`${this.constructor.is}-delete-${t?"per-purchase-contribution":"scheduled-contribution"}`;this.dispatchEvent(new CustomEvent(e,{detail:{ruleId:t},bubbles:!0,composed:!0}))}_selfDrivenApiDM(){return d`
      <bbva-global-available-rules-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.selfDrivenApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @available-rules-api-dm-fetch="${this._openModalList}"
        @available-rules-api-dm-fetch-error="${this._handleAvailableRulesError}"
        @api-dm-error="${this._handleAvailableRulesError}"
      >
      </bbva-global-available-rules-api-dm>
    `}get _scheduledTransferFrequency(){var t;return`${null===(t=this.scheduledTransfer)||void 0===t?void 0:t.frequency}`.toLowerCase()||"monthly"}get _scheduledTransferOriginAccount(){var t,e,i;return U(null===(t=this.scheduledTransfer)||void 0===t||null===(e=t.sender)||void 0===e||null===(i=e.contract)||void 0===i?void 0:i.number,this.maskType,!0,this.maxAccountChars)}get _notEmptyContributions(){var t;const e=!!this._rules&&this._rules.length,i=!!this.scheduledTransfer&&(Object.keys(this.scheduledTransfer).length&&"SIMULATED"!==(null===(t=this.scheduledTransfer)||void 0===t?void 0:t.status));return e||i}_roundingRuleDescription(t){const{goalAmount:e={},roundRule:{percentage:i,amount:a,currency:s}={}}=t||{};if(i&&e&&!ws(e)){const t=Cs(e.amount,e.currency,this.language);return this.t("metas-saving-goals-contribution-formulas-rounding-rule-percentage-with-limit-description",{percentage:i,limitAmount:t})}return i?this.t("metas-saving-goals-contribution-formulas-rounding-rule-percentage-description",{percentage:i}):this.t("metas-saving-goals-contribution-formulas-rounding-rule-amount-description",{roundingAmount:Cs(a,s,this.language)})}_listRulesTemplate(){var t,e,i,a,s,o,n,r,l,u,h,g,m,p,v;const b=Cs(null===(t=this.scheduledTransfer)||void 0===t||null===(e=t.sentMoney)||void 0===e?void 0:e.amount,null===(i=this.scheduledTransfer)||void 0===i||null===(a=i.sentMoney)||void 0===a?void 0:a.currency,this.language),_=Cs(2*((null===(s=this.scheduledTransfer)||void 0===s||null===(o=s.sentMoney)||void 0===o?void 0:o.amount)||0),null===(n=this.scheduledTransfer)||void 0===n||null===(r=n.sentMoney)||void 0===r?void 0:r.currency,this.language);return d`
      <bbva-text
        unset
        size="S"
        text="${this.t("metas-saving-goals-contribution-formulas-text")}"
      ></bbva-text>
      <bbva-link @click="${this._getAvailableRules}" icon="${Rt()}">
        <span>${this.t("metas-saving-goals-contribution-formulas-add")}</span>
      </bbva-link>
      <div class="box-shadow" ambient="light">
        ${this._rules.map(((t,e)=>d`
              ${0!==e?d`
                    <bbva-divider size="full"></bbva-divider>
                  `:""}
              <bbva-list-toggle
                description="${this._roundingRuleDescription(t)}"
                disabled-tabindex
                ?checked="${t.isActive}"
                heading-level="3"
                heading="${this.t("metas-saving-goals-create-goal-contribution-per-purchase")}"
                @list-toggle-switch-change="${e=>{this._activeOrDesactiveFormula(e,t)}}"
              >
              </bbva-list-toggle>
              <div class="badge-wrapper">
                <bbva-text
                  unset
                  class="accounts-title"
                  size="S"
                  tag="span"
                  text="${this.t("metas-saving-goals-contribution-formulas-origin-cards")}"
                ></bbva-text>
                <bbva-text
                  unset
                  class="account"
                  size="S"
                  tag="span"
                  text="${this._ruleCardNumbers(t.cardIds)}"
                ></bbva-text>
              </div>
              <bbva-list-link
                id="edit-per-purchase-link"
                disabled-tabindex
                accessibility-icon-link-text="${this.t("metas-saving-goals-scheduled-transfer-edit-contributions-link")}"
                header-text="${this.t("metas-saving-goals-scheduled-transfer-edit-contributions-link")}"
                link-icon="${Zt()}"
                @click="${e=>{this._navigateEditFormula(e,t)}}"
              ></bbva-list-link>
              <bbva-list-link
                id="delete-per-purchase-link"
                disabled-tabindex
                accessibility-icon-link-text="${this.t("metas-saving-goals-scheduled-transfer-delete-contributions-link")}"
                header-text="${this.t("metas-saving-goals-scheduled-transfer-delete-contributions-link")}"
                link-icon="${Qt()}"
                @click="${()=>{this._selectedRuleId=null==t?void 0:t.id,this._modalDeleteConfirmation.open()}}"
              ></bbva-list-link>
            `))}
      </div>
      <div class="box-shadow" ambient="light">
        ${!this.scheduledTransfer||ws(this.scheduledTransfer)||"VALID"!==(null===(l=this.scheduledTransfer)||void 0===l?void 0:l.status)&&"PAUSED"!==(null===(u=this.scheduledTransfer)||void 0===u?void 0:u.status)?gt:d`
              <bbva-list-toggle
                description="${this.t(`metas-saving-goals-scheduled-text-${this._scheduledTransferFrequency}`,{amount:b,amountMonth:_})}"
                disabled-tabindex
                heading-level="3"
                heading="${this.t("metas-saving-goals-contribution-formulas-scheduled-transfer")}"
                checked="${c("VALID"===(null===(h=this.scheduledTransfer)||void 0===h?void 0:h.status)||void 0)}"
                @list-toggle-switch-change="${t=>{this._toggleScheduledTransfer(t,this.scheduledTransfer)}}"
                @list-toggle-link-click="${t=>{this._navigateEditFormula(t,this.scheduledTransfer)}}"
              >
              </bbva-list-toggle>
              <div class="badge-wrapper">
                <bbva-text
                  unset
                  class="accounts-title"
                  size="S"
                  tag="span"
                  text="${this.t("metas-saving-goals-contribution-formulas-origin-account")}"
                ></bbva-text>
                <bbva-text
                  unset
                  class="account"
                  size="S"
                  tag="span"
                  text="${null!==(g=this.scheduledTransfer)&&void 0!==g&&g.sender?U(null===(m=this.scheduledTransfer)||void 0===m||null===(p=m.sender)||void 0===p||null===(v=p.contract)||void 0===v?void 0:v.number,this.maskType,!0,this.maxAccountChars):""}"
                ></bbva-text>
              </div>
              <bbva-list-link
                id="edit-scheduled-transfer-link"
                disabled-tabindex
                accessibility-icon-link-text="${this.t("metas-saving-goals-scheduled-transfer-edit-contributions-link")}"
                header-text="${this.t("metas-saving-goals-scheduled-transfer-edit-contributions-link")}"
                link-icon="${Zt()}"
                @click="${this._navigateEditContribution}"
              ></bbva-list-link>
              <bbva-list-link
                id="delete-scheduled-transfer-link"
                disabled-tabindex
                accessibility-icon-link-text="${this.t("metas-saving-goals-scheduled-transfer-delete-contributions-link")}"
                header-text="${this.t("metas-saving-goals-scheduled-transfer-delete-contributions-link")}"
                link-icon="${Qt()}"
                @click="${()=>{this._selectedRuleId="",this._modalDeleteConfirmation.open()}}"
              ></bbva-list-link>
            `}
      </div>
    `}_ruleCardNumbers(t){const e=t=>U(t,this.maskType,!0,this.maxAccountChars);return t.length>3?this.t("metas-saving-goals-multistep-algorithm-cards-more",{firstCard:e(t[0]),numberCards:t.length-1}):t.length?t.map(e).join(", "):""}_emptyState(){return d`
      <bbva-panel-info
        ambient="light"
        heading="${this.t("metas-saving-goals-contribution-formulas-no-formulas-header")}"
        text="${this.t("metas-saving-goals-contribution-formulas-no-formulas-text")}"
        link-text="${this.t("metas-saving-goals-contribution-formulas-no-formulas-link")}"
        @panel-info-link-click="${this._getAvailableRules}"
      >
      </bbva-panel-info>
    `}_emptyStateFormulas(){return d`
      <div class="container">
        <bbva-panel-info
          disabled-tabindex
          heading="${this.t("metas-saving-goals-contribution-formulas-no-formulas-header")}"
          text="${this.t("metas-saving-goals-contribution-formulas-modal-list-empty-text")}"
          link-text="${this.t("metas-saving-goals-create-goal-multistep-form-return")}"
          @panel-info-link-click="${this._closeSuccessModal}"
        >
        </bbva-panel-info>
      </div>
    `}_ruleCard(){return d`
      <bbva-text
        unset
        size="S"
        text="${this.t("metas-saving-goals-contribution-formulas-modal-list-text")}"
        alignment="center"
      ></bbva-text>
      <div class="container">
        <div ambient="dark300">
          <bbva-card-banner
            disabled-tabindex
            variant="full-width"
            microillustration="rounduprule"
            title="${this.t("metas-saving-goals-contribution-formulas-rounding-purchases")}"
            description="${this.t("metas-saving-goals-contribution-formulas-description-rule")}"
          ></bbva-card-banner>
        </div>
        <div class="setup-rule-container" ambient="light">
          <bbva-link
            @click="${this._navigateCreateNewFormula}"
            text="${this.t("metas-saving-goals-activate-rule")}"
          ></bbva-link>
        </div>
        <div ambient="dark300">
          <bbva-card-banner
            variant="full-width"
            microillustration="periodiccontributiondollar"
            title="${this.t("metas-saving-goals-contribution-formulas-scheduled-contribution")}"
            description="${this.t("metas-saving-goals-contribution-formulas-scheduled-contribution-description")}"
          ></bbva-card-banner>
        </div>
        <div class="setup-rule-container" ambient="light">
          <bbva-link
            id="navigate-active-rule"
            @click="${()=>{ws(this.scheduledTransfer)?this._navigateContribution():this._scheduledTransferLimitReachedModalVisible=!0}}"
            text="${this.t("metas-saving-goals-activate-rule")}"
          ></bbva-link>
        </div>
      </div>
    `}_modalListFormulas(){return d`
      <bbva-help-modal
        id="modal-list-formula"
        full-height
        class="${V({"no-rule":!this._availableRule})}"
        header-type="modal-three-level"
        header-text="${this.t("metas-saving-goals-contribute-formula-modal-header-title")}"
        ?visible="${this.openModalListFormulas}"
        hide-content-padding-top
        icon-right-primary=${ct()}
      >
        <div slot="slot-content">
          ${this._availableRule?this._ruleCard():this._emptyStateFormulas()}
        </div>
      </bbva-help-modal>
    `}get _modalDeleteConfirmation(){return this.shadowRoot.querySelector("#delete-contribution-confirmation")}get _modalDeleteConfirmationTpl(){return d`
      <bbva-help-modal
        id="delete-contribution-confirmation"
        class="no-rule"
        id-modal="delete-contribution-confirmation"
        body-text="${this.t("metas-saving-goals-contribution-formulas-confirmation-modal-body")}"
        button-text="${this.t("metas-saving-goals-contribution-formulas-confirmation-modal-button")}"
        link-text="${this.t("metas-saving-goals-contribution-formulas-confirmation-modal-link")}"
        modal-type="info"
        title-icon="${ht()}"
        @help-modal-footer-button-click="${()=>{this._navigateDeleteFormula(this._selectedRuleId),this._selectedRuleId=""}}"
        @help-modal-footer-link-click="${()=>this._modalDeleteConfirmation.close()}"
      >
      </bbva-help-modal>
    `}get _modalScheduledTransferLimitReached(){return this.shadowRoot.querySelector("#modal-scheduled-transfer-limit-reached")}get _modalScheduledTransferLimitReachedTpl(){return d`
      <bbva-help-modal
        id="modal-scheduled-transfer-limit-reached"
        full-height
        header-type="modal-three-level"
        header-text="${this.t("metas-saving-goals-contribute-formula-modal-header-title")}"
        ?visible="${this._scheduledTransferLimitReachedModalVisible}"
        hide-content-padding-top
        icon-right-primary=${ct()}
        @help-modal-close="${()=>{this._scheduledTransferLimitReachedModalVisible=!1}}"
      >
        <div slot="slot-content">
          <bbva-panel-info
            ambient="light"
            heading="${this.t("metas-saving-goals-contribution-formulas-scheduled-transfer-limit-header")}"
            text="${this.t("metas-saving-goals-contribution-formulas-scheduled-transfer-limit-text")}"
            link-text="${this.t("metas-saving-goals-return")}"
            @panel-info-link-click="${()=>{this._scheduledTransferLimitReachedModalVisible=!1}}"
          >
          </bbva-panel-info>
        </div>
      </bbva-help-modal>
    `}render(){return d`
      ${super.render()}
      ${this._modalListFormulas()}${this._modalDeleteConfirmationTpl}${this._modalScheduledTransferLimitReachedTpl}${this._selfDrivenApiDM()}
      <div ambient="light100">
        <bbva-header-category
          heading-level="2"
          text="${this.t("metas-saving-goals-contribute-formula-title")}"
          option-icon=${w()}
          @header-category-link-click="${this._openMoreInfoModal}"
        ></bbva-header-category>
        ${this._notEmptyContributions?this._listRulesTemplate():this._emptyState()}
      </div>
    `}}var So=t`
:host {
  display: block;
  box-sizing: border-box;
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

*, *:before, *:after {
  box-sizing: inherit;
}

[role=listitem] {
  position: relative;
}
[role=listitem]:last-child {
  margin-bottom: 2rem;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

form {
  margin: 0;
}

[data-tag-name=bbva-form-amount],
[data-tag-name=bbva-panel-process] {
  margin-bottom: 1rem;
}

fieldset {
  border: none;
  margin: 0 1rem;
  padding: 0;
  position: relative;
}

[data-tag-name=bbva-button-default] {
  display: block;
  width: -webkit-max-content;
  width: max-content;
  margin: 1.5rem auto;
}

[data-tag-name=bbva-panel-process][ambient=dark] {
  background-color: var(--colorsTertiaryType6Dark, ${u(h.tertiaryType6Dark)});
}

[ambient=dark] {
  overflow: hidden;
  background-color: var(--ambientsDark, ${u(nt.dark)});
}

[ambient=light] {
  overflow: hidden;
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-form-amount] {
  text-align: left;
}

[data-tag-name=bbva-form-option][tabindex="0"] {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
}

[data-tag-name=bbva-panel-info] {
  padding-top: 1rem;
}
`;class Ao extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-withdraw-savings"}static get scopedElements(){const t=[dt,Me,lt,Lt,Oi,Nt,ji,Vt,hi,...Ao.configurationScopedElements()];return Ao.scopedElementsFromClasses(t)}static get properties(){return{goal:{type:Object},operationNumber:{type:String,attribute:"operation-number"},listAccounts:{type:Array,attribute:"list-accounts"},openConfirmationModal:{type:Boolean,attribute:"open-confirmation-modal"},withdrawSavingsVisible:{type:Boolean,attribute:"withdraw-savings-visible"},withdrawal:{type:Object,attribute:"withdrawal"},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},_openRemoveGoalModal:{type:Boolean},_destinationAccountId:{type:String}}}constructor(){super(),this.config={back:!1,fixedHeader:!0,header:{accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-withdraw-savings-header")},loader:!0,notify:!1},this.goal={},this.listAccounts=[],this.maskType="•",this.maxAccountChars=4,this.openConfirmationModal=!1,this.operationNumber="",this.savingGoalAccount={},this.withdrawal={amount:0,currency:""},this.withdrawSavingsVisible=!1,this._destinationAccountId="",this._openRemoveGoalModal=!1,this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}updated(t){var e,i,a;t.has("listAccounts")&&this.listAccounts!==t.get("listAccounts")&&0!==this.listAccounts.length&&(this._destinationAccountId=null===(i=this.listAccounts)||void 0===i?void 0:i[0].id);t.has("withdrawSavingsVisible")&&!1===this.withdrawSavingsVisible&&0!==(null===(e=this.listAccounts)||void 0===e?void 0:e.length)&&(this._destinationAccountId=null===(a=this.listAccounts)||void 0===a?void 0:a[0].id)}static get styles(){return[So,ut.light,Mi.light,qt.light,Bt.dark,Bi.light,Oe.light,l("metas-saving-goals-withdraw-savings")]}get _checkDisabled(){return!this._destinationAccountId}get _accountsDisabled(){var t;return 0===(null===(t=this.listAccounts)||void 0===t?void 0:t.length)}get _goalStatus(){var t,e,i;return(null===(t=this.goal)||void 0===t||null===(e=t.status)||void 0===e||null===(i=e.id)||void 0===i?void 0:i.toLowerCase())||"expired"}_callbackModal(){return this.openConfirmationModal?this._sendEventDeleteGoalOk():this.dispatchEvent(new CustomEvent("metas-saving-goals-withdraw-savings-exit",{detail:!0,bubbles:!0,composed:!0}))}get _receiverAccount(){return this.listAccounts.find((t=>t.id===this._destinationAccountId))}get _amount(){var t,e;return null===(t=this.goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.amount}_handleDelete(){var t,e;this._openRemoveGoalModal=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-withdraw-savings-delete",{bubbles:!0,composed:!0,detail:{amount:this._amount,account:{id:this._destinationAccountId,number:null===(t=this._receiverAccount)||void 0===t?void 0:t.number,numberType:null===(e=this._receiverAccount)||void 0===e?void 0:e.numberType}}}))}_navigateCreateNewGoal(){this.dispatchEvent(new CustomEvent("metas-saving-goals-withdraw-savings-create-goal",{detail:{routeName:"createGoalForm",replace:!0},bubbles:!0,composed:!0}))}_closeSuccessModal(){this.openConfirmationModal=!1}_sendEventDeleteGoalOk(){this._closeSuccessModal(),this.dispatchEvent(new CustomEvent("metas-saving-goals-withdraw-savings-delete-goal-ok",{bubbles:!0,composed:!0,detail:!0}))}_accountsOptionsTemplate(){var t;return d`
      ${null===(t=this.listAccounts)||void 0===t?void 0:t.map((t=>d`
          <bbva-form-option .icon="${Ft()}" value="${t.id}">
            ${U(t.number,this.maskType,!0,this.maxAccountChars)}
          </bbva-form-option>
        `))}
    `}_removeGoalModal(){return d`
      <bbva-help-modal
        id="confrmationModalId"
        ?visible="${this._openRemoveGoalModal}"
        title-icon="${ht()}"
        modal-type="info"
        title-text="${this.t("metas-saving-goals-withdraw-savings-confirm-delete-header")}"
        body-text="${this.t(`metas-saving-goals-withdraw-savings-confirm-delete-${this._goalStatus}-goal-text`)}"
        button-text="${this.t("metas-saving-goals-withdraw-saving-withdraw-money")}"
        @help-modal-footer-button-click="${()=>{this._handleDelete()}}"
        @help-modal-footer-link-click="${()=>{this._openRemoveGoalModal=!1}}"
        link-text="${this.t("metas-saving-goals-cancel")}"
      >
      </bbva-help-modal>
    `}_deleteHelpModalSuccess(){var t,e,i,a,s,o;return d`
      <bbva-help-modal
        id="modalId"
        full-height
        header-type="process"
        header-text="${this.t("metas-saving-goals-withdraw-savings-header")}"
        ?visible="${this.openConfirmationModal}"
        hide-content-padding-top
        icon-right-primary=${ct()}
        button-text="${this.t("metas-saving-goals-withdraw-savings-close")}"
        link-text="${this.t("metas-saving-goals-withdraw-savings-create-new-goal")}"
        @help-modal-footer-button-click="${this._sendEventDeleteGoalOk}"
        @help-modal-footer-link-click=${this._navigateCreateNewGoal}
      >
        <div slot="slot-content">
          <bbva-panel-process
            ambient="dark"
            heading="${this.t("metas-saving-goals-withdraw-savings-success-modal-title")}"
            date="${(new Date).toISOString()}"
            .dateFormat="${{day:"numeric",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"}}"
            text="${this.t("metas-saving-goals-refund-goal-amount")}"
            amount="${Math.abs(null===(t=this.withdrawal)||void 0===t?void 0:t.amount)}"
            currency-code="${null===(e=this.withdrawal)||void 0===e?void 0:e.currency}"
            local-currency="${null===(i=this.withdrawal)||void 0===i?void 0:i.currency}"
            language="${this.language}"
          >
          </bbva-panel-process>
          <bbva-panel-operation
            clip-item="accountdollar"
            clip-item-right="accountdollar"
            label-left="${this.t("metas-saving-goals-plan")}"
            label-right="${this.t("metas-saving-goals-account")}"
          >
            <span slot="left"
              >${U((null===(a=this.savingGoalAccount)||void 0===a?void 0:a.number)||"",this.maskType,!0,this.maxAccountChars)}</span
            >
            <span slot="right"
              >${U((null===(s=this._receiverAccount)||void 0===s?void 0:s.number)||"",this.maskType,!0,this.maxAccountChars)}</span
            >
          </bbva-panel-operation>
          <div role="list" ambient="light">
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("metas-saving-goals-name-goal")}"
                description-medium
                description="${null===(o=this.goal)||void 0===o?void 0:o.description}"
              >
              </bbva-list-simple>
            </div>
            <div role="listitem">
              <bbva-list-simple
                disabled-tabindex
                label="${this.t("metas-saving-goals-operation-id")}"
                description-medium
                description="${this.operationNumber}"
              >
              </bbva-list-simple>
            </div>
          </div>
        </div>
      </bbva-help-modal>
    `}_withdrawSavingsTemplate(){var t,e,i,a,s,o,n,r,l;return d`
      <bbva-panel-info
        disabled-tabindex
        heading="${this.t("metas-saving-goals-withdraw-savings-panel-info-header")}"
        text=${this.t(`metas-saving-goals-withdraw-savings-panel-info-${this._goalStatus}-goal-text`,{goalDescription:`'${null===(t=this.goal)||void 0===t?void 0:t.description}'`,goalAmount:Cs(null===(e=this.goal)||void 0===e||null===(i=e.currentAmount)||void 0===i?void 0:i.amount,null===(a=this.goal)||void 0===a||null===(s=a.currentAmount)||void 0===s?void 0:s.currency,this.language)})}
        .microillustration=${ae}
      >
      </bbva-panel-info>
      <form>
        <fieldset>
          <bbva-form-amount
            label="${this.t("metas-saving-goals-withdraw-savings-amount-label")}"
            .amount="${this._amount}"
            currency-code="${null===(o=this.goal)||void 0===o||null===(n=o.currentAmount)||void 0===n?void 0:n.currency}"
            local-currency="${null===(r=this.goal)||void 0===r||null===(l=r.currentAmount)||void 0===l?void 0:l.currency}"
            language="${this.language}"
            disabled
          ></bbva-form-amount>
        </fieldset>
        <fieldset>
          <bbva-form-select
            @change="${t=>{this._destinationAccountId=t.target.value}}"
            ?disabled="${this._accountsDisabled}"
            value=${this._destinationAccountId}
            label="${this.t("metas-saving-goals-refund-goal-destination-account")}"
            required
          >
            ${this._accountsOptionsTemplate()}
          </bbva-form-select>
        </fieldset>
        <bbva-button-default
          variant="primary"
          ?disabled="${this._checkDisabled}"
          @click="${()=>{this._openRemoveGoalModal=!0}}"
        >
          ${this.t("metas-saving-goals-withdraw-savings-withdraw")}
        </bbva-button-default>
      </form>
    `}render(){return d`
      ${super.render()}
      <div ambient="light">
        ${this._withdrawSavingsTemplate()} ${this._deleteHelpModalSuccess()}
        ${this._removeGoalModal()}
      </div>
    `}}var xo=t`
:host {
  display: block;
  box-sizing: border-box;
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

*, *:before, *:after {
  box-sizing: inherit;
}

[role=listitem] {
  position: relative;
}
[role=listitem]:last-child {
  margin-bottom: 3.375rem;
}

.files [role=listitem]:last-child {
  margin-bottom: 0;
}

[ambient=light] {
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-form-checkbox] {
  margin: 0 1rem;
}

[data-tag-name=bbva-form-select] {
  margin: 0 1rem 1rem;
}

[data-tag-name=bbva-button-default] {
  display: block;
  width: -webkit-max-content;
  width: max-content;
  margin: 1.5rem auto;
}

[data-tag-name=bbva-list-simple] {
  --bbva-list-simple-label-color: token("foundations.colors.tertiaryType6Dark");
}

[data-tag-name=bbva-card-banner] {
  padding-top: 1rem;
}

[data-tag-name=bbva-panel-info] {
  padding-top: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}

.container {
  padding-bottom: 1rem;
  text-align: center;
}
`;class To extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-successful-create-goal"}static get scopedElements(){const t=[li,ue,lt,Lt,Oi,he,ji,Pt,Vt,L,kt,...To.configurationScopedElements()];return To.scopedElementsFromClasses(t)}static get properties(){return{goal:{type:Object},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},listAccountsActivated:{type:Array,attribute:"list-accounts-activated"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},operationNumber:{type:String,attribute:"operation-number"},updateGoalValidErrorVisible:{type:Boolean,attribute:"update-goal-valid-error-visible"},updateRuleValidErrorVisible:{type:Boolean,attribute:"update-rule-valid-error-visible"},updateScheduledValidErrorVisible:{type:Boolean,attribute:"update-scheduled-valid-error-visible"},isAccountCreated:{type:Boolean,attribute:"is-account-created"},isActivePurchaseContribution:{type:Boolean,attribute:"is-active-purchase-contribution"},isActivePeriodicContribution:{type:Boolean,attribute:"is-active-periodic-contribution"},successfulCreateGoalVisible:{type:Boolean,attribute:"successful-create-goal-visible"},summaryDetail:{type:Object},_principalAccountId:{type:String}}}constructor(){super(),this.config={back:!1,fixedHeader:!0,header:{variant:"modal",accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-create-goal-title")},loader:!0,notify:!1},this.goal={},this.isAccountCreated=!1,this.isActivePeriodicContribution=!1,this.isActivePurchaseContribution=!1,this.listAccountsActivated=[],this.maskType="•",this.maxAccountChars=4,this.operationNumber="",this.successfulCreateGoalVisible=!1,this.summaryDetail={},this.updateGoalValidErrorVisible=!1,this.updateRuleValidErrorVisible=!1,this.updateScheduledValidErrorVisible=!1,this._principalAccountId="",this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}updated(t){var e,i;t.has("listAccountsActivated")&&this.listAccountsActivated!==t.get("listAccountsActivated")&&0!==(null===(e=this.listAccountsActivated)||void 0===e?void 0:e.length)&&(this._principalAccountId=null===(i=this.listAccountsActivated)||void 0===i?void 0:i[0].id);t.has("isAccountCreated")&&this.isAccountCreated&&this.dispatchEvent(new CustomEvent("open-modal",{bubbles:!0,composed:!0,detail:{id:"createGoalAccountModal"}})),t.has("successfulCreateGoalVisible")&&!0===this.successfulCreateGoalVisible&&this.dispatchEvent(new CustomEvent("metas-saving-goals-successful-create-goal-trace-route",{bubbles:!0,composed:!0,detail:{route:"successfulCreateGoal",...this.summaryDetail}}))}_callbackModal(){return this.dispatchEvent(new CustomEvent("metas-saving-goals-sucessful-create-goal-create-account-exit",{detail:!0,bubbles:!0,composed:!0}))}_exitModal(){return this.dispatchEvent(new CustomEvent("metas-saving-goals-sucessful-create-goal-create-account-exit",{detail:!0,bubbles:!0,composed:!0}))}_formatDate(t){return new Date(null==t?void 0:t.replaceAll("-","/")).toLocaleDateString(this.language,{day:"numeric",month:"numeric",year:"numeric"})}_navigateDetailGoal(){return this.dispatchEvent(new CustomEvent("metas-saving-goals-successful-navigate-detail-goal",{detail:{routeName:"detailGoal",goalId:this.goal.id,replace:!0},bubbles:!0,composed:!0}))}static get styles(){return[xo,Mi.light,Bi.light,ut.light,di.light,ge.light,me.light,Ot.light,qt.light,I.light,l("metas-saving-goals-successful-create-goal-shared-styles")]}get _dateAndTime(){return`${(new Date).toLocaleDateString(this.language,{day:"numeric",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"}).split("de ").join("")} h.`}get _noficationMessage(){let t,e;return this.updateGoalValidErrorVisible?(t=this.t("metas-saving-goals-notification-title-update-goal-error"),e=this.t("metas-saving-goals-notification-message-update-goal-error")):this.updateRuleValidErrorVisible?(t=this.t("metas-saving-goals-notification-title-update-rule-error"),e=this.t("metas-saving-goals-notification-message-update-rule-error")):this.updateScheduledValidErrorVisible&&(t=this.t("metas-saving-goals-notification-title-update-scheduled-error"),e=this.t("metas-saving-goals-notification-message-update-scheduled-error")),this.updateGoalValidErrorVisible||this.updateRuleValidErrorVisible||this.updateScheduledValidErrorVisible?d`
        <bbva-notification-message variant="information" message-title="${t}">
          ${e}
        </bbva-notification-message>
      `:d`
      ${gt}
    `}get _panelHeading(){return this.isAccountCreated?this.updateGoalValidErrorVisible?this.t("metas-saving-goals-successful-goal-create-only-account-title"):this.t("metas-saving-goals-successful-goal-create-account-header"):this.t("metas-saving-goals-create-goal-title-description")}get _panelSubtitle(){return this.isAccountCreated?this.updateGoalValidErrorVisible?this.t("metas-saving-goals-successful-goal-create-only-account-subtitle"):this.t("metas-saving-goals-successful-goal-first-step"):this.t("metas-saving-goals-successful-goal-new-challenge")}get _goalCreationDateText(){return{label:this.t("metas-saving-goals-create-goal-multistep-form-date"),description:this._dateAndTime,descriptionDate:!0}}get _associatedGoalText(){var t,e;return{label:this.t("metas-saving-goals-create-goal-associated-goal"),description:null!==(t=this.savingGoalAccount)&&void 0!==t&&t.number?U(null===(e=this.savingGoalAccount)||void 0===e?void 0:e.number,this.maskType,!0,this.maxAccountChars):"",descriptionMedium:!0}}get _associatedAccountText(){var t,e;return{label:this.t("metas-saving-goals-associated-account"),description:U(null===(t=this.listAccountsActivated)||void 0===t||null===(e=t.find((t=>t.id===this._principalAccountId)))||void 0===e?void 0:e.number,this.maskType,!0,this.maxAccountChars),descriptionMedium:!0}}get _operationIdentifierText(){return{label:this.t("metas-saving-goals-operation-identifier"),description:this.operationNumber||"",descriptionMedium:!0}}get _goalNameText(){var t;return{label:this.t("metas-saving-goals-create-goal-name-the-goal"),description:null===(t=this.goal)||void 0===t?void 0:t.description,descriptionMedium:!0}}get _goalAmountText(){var t,e,i,a,s,o;return{label:this.t("metas-saving-goals-create-goal-amount-goal"),amount:null===(t=this.goal)||void 0===t||null===(e=t.goalAmount)||void 0===e?void 0:e.amount,localCurrency:null===(i=this.goal)||void 0===i||null===(a=i.goalAmount)||void 0===a?void 0:a.currency,currencyCode:null===(s=this.goal)||void 0===s||null===(o=s.goalAmount)||void 0===o?void 0:o.currency,descriptionMedium:!0}}get _goalEndDateText(){var t,e;return{label:this.t("metas-saving-goals-create-goal-end-date-goal"),description:this._formatDate(null===(t=this.goal)||void 0===t||null===(e=t.goalPeriod)||void 0===e?void 0:e.expirationDate),descriptionDate:!0}}get _perPurchaseContributionText(){return{label:this.t("metas-saving-goals-create-goal-contribution-per-purchase"),description:this.isActivePurchaseContribution&&!this.updateRuleValidErrorVisible?this.t("metas-saving-goals-create-goal-active"):this.t("metas-saving-goals-create-goal-inactive")}}get _scheduledContributionText(){return{label:this.t("metas-saving-goals-create-goal-contribution-scheduled"),description:!this.isActivePeriodicContribution||this.updateRuleValidErrorVisible||this.updateScheduledValidErrorVisible?this.t("metas-saving-goals-create-goal-inactive"):this.t("metas-saving-goals-create-goal-active")}}get _panelTextArray(){return[this._goalCreationDateText,...this.isAccountCreated?[this._associatedGoalText,this._associatedAccountText,this._operationIdentifierText]:[],...this.accountCreated&&this.updateGoalValidErrorVisible?[]:[this._goalNameText,this._goalAmountText,this._goalEndDateText,this._perPurchaseContributionText,this._scheduledContributionText]]}_successfulCreateGoalTemplate(){return d`
      <div ambient="light">
        <bbva-panel-info
          disabled-tabindex
          heading-level-title="h2"
          heading="${this._panelHeading}"
          text="${this._panelSubtitle}"
          .microillustration=${pe}
        >
        </bbva-panel-info>
        <div role="list">
          ${this._panelTextArray.map((t=>d`
                <div role="listitem">
                  <bbva-list-simple
                    disabled-tabindex
                    ?description-medium="${t.descriptionMedium}"
                    ?description-date="${t.descriptionDate}"
                    local-currency="${c(t.localCurrency)}"
                    currency-code="${c(t.currencyCode)}"
                    label="${t.label}"
                    description="${c(t.description)}"
                    amount="${c(t.amount)}"
                  >
                  </bbva-list-simple>
                </div>
              `))}
        </div>
        ${this._noficationMessage}
        ${this.updateGoalValidErrorVisible?gt:d`
            <bbva-button-default variant="primary" @click="${this._navigateDetailGoal}">
              ${this.t("metas-saving-goals-create-goal-go-goal")}
            </bbva-button-default>
            <div class="container">
              <bbva-link
                @click="${this._exitModal}"
                text="${this.t("metas-saving-goals-successful-create-goal-exit")}"
              ></bbva-link>
            </div>
          </div>`}
      </div>
    `}render(){return d`
      ${super.render()}
      <div ambient="light">
        ${this._successfulCreateGoalTemplate()}
      </div>
    `}}var Co=t`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-header-main-z-index: 2;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-expandable-step] .button-container {
  margin-top: 1rem;
}
[data-tag-name=bbva-expandable-step] [data-tag-name=bbva-button-default] {
  margin: 1.5rem auto;
  display: block;
  width: -webkit-max-content;
  width: max-content;
}

[data-tag-name=bbva-progress-multistep-bar] {
  z-index: 1;
  top: 3rem;
  position: sticky;
  margin-bottom: 0;
}

[data-tag-name=bbva-badge-reference] {
  margin: 0 1rem;
}

.badge-wrapper {
  padding: 0 1rem;
  display: flex;
  flex-wrap: wrap;
}
.badge-wrapper [data-tag-name=bbva-badge-reference] {
  margin: 0;
}
.badge-wrapper [data-tag-name=bbva-text] {
  margin: 0 0.25rem;
}
.badge-wrapper [data-tag-name=bbva-text].accounts-title {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${u(G.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${u(G.bookItalic.fontStyle)});
  margin: 0 0.5rem 0 0;
}

[data-tag-name=bbva-expandable-multistep] {
  --bbva-expandable-step-default-content-max-height: auto;
}

.background-light100 {
  background-color: var(--ambientsLight100, ${u(nt.light100)});
  padding: 1rem;
}

[ambient=light] {
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-form-amount],
[data-tag-name=bbva-form-date],
[data-tag-name=bbva-form-text] {
  margin: 1rem;
}

[data-tag-name=bbva-list-toggle] {
  --bbva-form-toggle-list-container-padding: 0;
  text-align: left;
}

[data-tag-name=bbva-header-category] {
  padding-top: 1.5rem;
}

[data-tag-name=bbva-panel-offer] p:last-child:not(:only-child) {
  margin-top: 1rem;
}

[data-tag-name=bbva-form-checkbox] {
  padding: 0 1rem;
}

[data-tag-name=bbva-form-radio-button] {
  padding: 0.5rem 0;
  text-align: left;
}

[data-tag-name=bbva-form-checkbox],
[data-tag-name=bbva-list-file] {
  text-align: left;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

.terms-conditions-wrapper {
  display: flex;
  padding: 0 1rem;
}
.terms-conditions-wrapper [data-tag-name=bbva-badge-check] {
  margin-right: 0.5rem;
}
.terms-conditions-wrapper [data-tag-name=bbva-text] {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${u(G.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${u(G.mediumItalic.fontStyle)});
}

[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-text] {
  padding: 1rem 1rem 0;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-text]:last-of-type {
  padding-bottom: 1rem;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet] {
  text-align: left;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet]:last-child {
  padding-bottom: 1rem;
}

[data-tag-name=bbva-form-container] {
  --bbva-form-control-input-container-align: center;
  margin-bottom: 1rem;
}
[data-tag-name=bbva-form-container] [data-tag-name=bbva-clip-microillustration] {
  margin-right: 0.5rem;
}
[data-tag-name=bbva-form-container] [slot=left] {
  padding-right: 0.5rem;
  display: flex;
  align-items: center;
  flex: 1;
}
[data-tag-name=bbva-form-container] [slot=left] [data-tag-name=bbva-text] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${u(G.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${u(G.medium.fontStyle)});
}

.button-wrapper {
  margin: 1.5rem 1rem;
  text-align: center;
}

[data-tag-name=bbva-expandable-step][active]:not([completed])#step-3 {
  padding-bottom: 0;
}
`;const Eo=new e;var ko=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${u(h.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${u(h.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${u(h.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${u(h.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${u(h.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${u(h.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${u(h.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${u(g.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${u(D.type3XSmall)}));
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
${Eo.mediaRules()}`;const Ro=new e;var wo=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${Ro.mediaRules()}`;const Po=new e;var Do=t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${u(h.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${u(h.primaryCoreLight)});
}
${Po.mediaRules()}`;const Go={dark:t`
    ${Do}
  `,light:t`
    ${wo}
  `};class Io extends(i(p(M(a)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":b,"bbva-text":v}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,ko,Go.dark,Go.light,l("bbva-notification-help-shared-styles")]}render(){return d`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}A("colors.primarySubduedLight"),A("colors.cool20"),A("colors.tertiaryType1Light"),A("colors.primaryCoreLightened"),A("colors.tertiaryType6Light"),A("colors.cool20"),A("colors.cool50"),customElements.define(Ai.is,Ai),customElements.define(ea.is,ea),customElements.define(Ye.is,Ye),customElements.define(sa.is,sa),customElements.define(aa.is,aa),customElements.define(Je.is,Je),customElements.define(oa.is,oa),customElements.define(ia.is,ia),customElements.define(va.is,va);var Mo=t`
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

[data-tag-name=bbva-text] {
  padding: 0 1rem 1rem;
}

.badge-wrapper {
  padding: 0 1rem;
  display: flex;
  flex-wrap: wrap;
}
.badge-wrapper [data-tag-name=bbva-text] {
  margin: 0 0.25rem;
}
.badge-wrapper [data-tag-name=bbva-text].contribution {
  color: var(--colorsSecondary500, ${u(h.secondary500)});
  padding: 0;
}
.badge-wrapper [data-tag-name=bbva-text].accounts-title {
  margin: 0 0.5rem 0 0;
}
.badge-wrapper [data-tag-name=bbva-text].accounts-title, .badge-wrapper [data-tag-name=bbva-text].account {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${u(G.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${u(G.bookItalic.fontStyle)});
  padding: 0;
}

[data-tag-name=bbva-button-default] {
  margin: 1.5rem auto;
  display: block;
  width: -webkit-max-content;
  width: max-content;
}

.c-panel-fixed {
  box-shadow: 0 0 5px var(--colorsSecondary400, ${u(h.secondary400)});
  position: -webkit-sticky;
  position: sticky;
  bottom: 0;
  top: auto;
  padding: 1.5rem;
  will-change: visibility, transform;
  transform-origin: 0 0;
  transform: translateY(100%);
  transition: visibility 0s linear 300ms, transform ease-in-out 0.2s;
  z-index: 9;
  --bbva-text-color: var(--colorsSecondary500, ${u(h.secondary500)});
}
.c-panel-fixed [data-tag-name=bbva-amount] {
  display: block;
  margin: 0.5rem auto 0;
}
.c-panel-fixed--show {
  transform: translateY(0);
}
.c-panel-fixed [data-tag-name=bbva-button-default] {
  margin-bottom: 0;
}

.box-shadow {
  box-shadow: var(--boxShadowType1, ${u(Et.type1)});
  margin-bottom: 1rem;
}
.box-shadow [data-tag-name=bbva-text] {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${u(P.spacer)}))) / 15) * 1em);
  padding-top: 1rem;
}

.background-light100 {
  background-color: var(--ambientsLight100, ${u(nt.light100)});
  padding: 1rem;
}

[ambient=light] {
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-list-toggle] {
  --bbva-form-toggle-list-container-padding: 0;
  text-align: left;
}

[data-tag-name=bbva-header-category] {
  padding-top: 1rem;
}

[data-tag-name=bbva-panel-offer] p:last-child:not(:only-child) {
  margin-top: 1rem;
}

[data-tag-name=bbva-form-checkbox] {
  padding: 0 1rem;
}

[data-tag-name=bbva-form-radio-button] {
  padding: 0.5rem 0;
  text-align: left;
}

[data-tag-name=bbva-form-checkbox],
[data-tag-name=bbva-list-file] {
  text-align: left;
}

[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-text] {
  padding: 1rem 1rem 0;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-text]:last-of-type {
  padding-bottom: 1rem;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet] {
  text-align: left;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet]:last-child {
  padding-bottom: 1rem;
}

[data-tag-name=bbva-notification-help] {
  padding: 1rem;
}
`;const{moment:Oo}=window,Lo=[h.primaryVariant],No="MONTHLY",Vo="BIWEEKLY",qo="CARD",Bo="ACCOUNT";class Ho extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-algorithm"}static get scopedElements(){const t=[ve,dt,Me,v,Gt,z,be,le,re,Io,lt,Lt,Le,Pt,kt,_e,Ys,Vt,Ai,va,...Ho.configurationScopedElements()];return Ho.scopedElementsFromClasses(t)}static get properties(){return{algorithmVisible:{type:Boolean},calculateApiVersion:{type:Number,attribute:"calculate-api-version"},simulateSavingsApiVersion:{type:Number,attribute:"simulate-savings-api-version"},showButtonFixed:{type:Boolean,attribute:"show-button-fixed"},callSimulation:{type:Boolean},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},listCards:{type:Array,attribute:"list-cards"},listAccounts:{type:Array,attribute:"list-accounts"},rule:{type:Object},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},goal:{type:Object},scheduledTransfer:{type:Object,attribute:"scheduled-transfer"},sessionName:{type:String,attribute:"session-name"},currency:{type:String},isUsingAdvice:{type:Boolean,attribute:"is-using-advice"},roundingTotal:{type:Number,attribute:"rounding-total"},_totalSaving:{type:Number},_periodicAmount:{type:Number},_originAccount:{type:Object},_simulation:{type:Object},_startDate:{type:String},_endDate:{type:String},_isVisibleProgressBar:{type:Boolean},_frequency:{type:String},_scheduledTransferUpdateMode:{type:String},_ruleUpdateMode:{type:String},_cardsNumberText:{type:String},_notificationHelpRule:{type:String},cardWithOutAccount:{type:Object},isEditMode:{type:Boolean,attribute:"is-edit-mode"},_isRuleGetted:{type:Boolean},_suggestedOriginAccount:{type:Object}}}constructor(){super(),this.algorithmVisible=!1,this.calculateApiVersion=0,this.callSimulation=!1,this.goal={},this.isUsingAdvice=!1,this.listAccounts=[],this.listCards=[],this.maskType="•",this.maxAccountChars=4,this.roundingTotal=0,this.rule={},this.showButtonFixed=!1,this.simulateSavingsApiVersion=1,this._activeRule=!1,this._activeScheduled=!1,this._endDate="",this._frequency="MONTHLY",this._isVisibleProgressBar=!1,this._originAccount={},this._ruleUpdateMode="",this._scheduledTransferUpdateMode="",this._simulation={ca:0,om:0,at:0,ap:0,simulationRule:null,periodicContribution:null,rule:null},this._startDate="",this._totalSaving=0,this.cardWithOutAccount={},this.isEditMode=!1,this._isRuleGetted=!1,this._suggestedOriginAccount={},this.addEventListener("header-main-icon-right-primary-click",(t=>this._callbackModal(t)))}firstUpdated(){super.firstUpdated(),this._calculatorDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-calculate-api-dm"]'),this._simulateSavingGoalDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-saving-goal-simulate-savings-api-dm"]'),this._observer=new IntersectionObserver((([t])=>{this.showButtonFixed=t.intersectionRatio>0}),{threshold:0}),this._observer.observe(this.shadowRoot.querySelector('[data-tag-name="bbva-notification-message"]'))}updated(t){super.update(t),t.has("callSimulation")&&this.callSimulation&&this.goal.id&&(this.rule={},this._activeRule=!1,this._activeScheduled=!1,this._postSimulateDM()),t.has("rule")&&this.rule&&!ws(this.rule)&&(this._simulation={...this._simulation,rule:this.rule},this._changeStatusPurchaseContribution({detail:!0})),t.has("_simulation")&&this._buildSimulationData(),t.has("roundingTotal")&&this.roundingTotal&&this._handleRuleUpdate(),t.has("algorithmVisible")&&this.algorithmVisible&&this._isRuleGetted&&this._getRoundingRule(),t.has("scheduledTransfer")&&this.listAccounts.length&&this.goal&&this.scheduledTransfer&&!ws(this.goal)&&!ws(this.scheduledTransfer)&&(this._handleScheduledTransferUpdate(),this._changeStatusPeriodicContribution({detail:!0})),t.has("listCards")&&this._initRuleMessage()}static get styles(){return[Mo,It,de.light,fe.light,ut.light,qt.light,y.light,ce.light,Go.light,B.light,ye.light,Ot.light,$e.light,Se.light,Ks.light,Oe.light,Ne.light,l("metas-saving-goals-algorithm")]}_handleRuleUpdate(){var t;this._updateSimulation({at:this.roundingTotal||0,simulationRule:{...null===(t=this._simulation)||void 0===t?void 0:t.simulationRule,savingAmount:{amount:this.roundingTotal}}})}_updateSimulation(t){this._simulation={...this._simulation,...t},this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-update-simulation",{detail:{simulation:{...this._simulation}},bubbles:!0,composed:!0}))}_handleScheduledTransferUpdate(){var t,e,i,a,s,o,n;(this._scheduledTransferUpdateMode=null!==(t=this.scheduledTransfer)&&void 0!==t&&t.sender?"edit":"create","edit"===this._scheduledTransferUpdateMode)?(this._setPeriodicModalFieldsForEditMode(),this._updateSimulation({ap:null===(e=this.scheduledTransfer)||void 0===e||null===(i=e.sentMoney)||void 0===i?void 0:i.amount,periodicContribution:{frequency:null===(a=this.scheduledTransfer)||void 0===a?void 0:a.frequency,simulationType:"PERIODIC_CONTRIBUTION",originContract:{id:null===(s=this._originAccount)||void 0===s?void 0:s.accountId,product:{productType:{id:"ACCOUNT"}}},savingContract:{id:null===(o=this.goal)||void 0===o?void 0:o.savingContract,product:{productType:{id:"ACCOUNT",relatedEntity:{id:"GOAL"}}}},contributionAmount:null===(n=this.scheduledTransfer)||void 0===n?void 0:n.sentMoney}})):this._setPeriodicModalFieldsForCreateMode()}_setPeriodicModalFieldsForEditMode(){var t,e,i,a,s,o,n;const r=this.scheduledTransfer.sender.contract.number,l=this.listAccounts.find((t=>t.number===r));this._originAccount={accountId:l,number:r},this._periodicAmount=null===(t=this.scheduledTransfer)||void 0===t||null===(e=t.sentMoney)||void 0===e?void 0:e.amount,this._startDate=null===(i=this.scheduledTransfer)||void 0===i||null===(a=i.period)||void 0===a?void 0:a.startDate,this._endDate=null===(s=this.scheduledTransfer)||void 0===s||null===(o=s.period)||void 0===o?void 0:o.endDate,this._frequency=null===(n=this.scheduledTransfer)||void 0===n?void 0:n.frequency}_setPeriodicModalFieldsForCreateMode(){var t,e;[this._originAccount]=this.listAccounts,this._periodicAmount=null,this._startDate=Oo().add(1,"days").format("YYYY-MM-DD"),this._endDate=null===(t=this.goal)||void 0===t||null===(e=t.goalPeriod)||void 0===e?void 0:e.expirationDate,this._frequency=No}_initRuleMessage(){let t=[];for(const r of this.listCards){var e,i,a,s,o,n;const l=null===(e=this.rule)||void 0===e||null===(i=e.senders)||void 0===i?void 0:i.find((t=>t.senderDetail.id===r.id)),d=(null===(a=this._simulation)||void 0===a||null===(s=a.simulationRule)||void 0===s||null===(o=s.sender)||void 0===o||null===(n=o.contract)||void 0===n?void 0:n.id)===r.id;(l||d&&l===d)&&(t=[...t,U(null==r?void 0:r.number,this.maskType,!0,this.maxAccountChars)])}this._cardsNumberText=this._getRuleCardsNumberText(t),this._notificationHelpRule=this._getRuleHelpNotificationMessage(t)}_getRuleCardsNumberText(t){return t.length>3?this.t("metas-saving-goals-multistep-algorithm-cards-more",{firstCard:t[0],numberCards:t.length-1}):t.join(" | ")}_getRuleHelpNotificationMessage(t){switch(t.length){case 0:return"";case 1:return this.t("metas-saving-goals-multistep-algorithm-associated-account",{accountNumber:`${this._accountNumber||""}`});default:return this.t("metas-saving-goals-multistep-algorithm-associated-account-more")}}_buildSimulationData(){var t,e;this._calculateTotal(),this._isVisibleProgressBar=this._hasCapacityButContributionsLowerThanObjective||this._noCapacityButWithCardSavings||this._noCapacity||this.isUsingAdvice,this._scheduledTransferUpdateMode=null!==(t=this._simulation)&&void 0!==t&&t.periodicContribution?"edit":"create",this._ruleUpdateMode=null!==(e=this._simulation)&&void 0!==e&&e.simulationRule?"edit":"create",this.rule=this._simulation.rule,this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-update-simulation",{detail:{simulation:{...this._simulation}},bubbles:!0,composed:!0})),this._initRuleMessage()}get _monthlyPeriodicContribution(){var t,e,i;const a={[No]:1,[Vo]:2}[this._frequency];return{amount:((null===(t=this._simulation)||void 0===t||null===(e=t.periodicContribution)||void 0===e||null===(i=e.contributionAmount)||void 0===i?void 0:i.amount)||0)*a}}_calculateTotal(){const{simulationRule:t}=this._simulation,{savingAmount:e}=t||{},i=this._activeRule?e:{amount:0},a=this._activeScheduled?this._monthlyPeriodicContribution:{amount:0};null!=e&&e.amount&&this._monthlyPeriodicContribution.amount?this._calculate([i,a]):(this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-inform-loader",{detail:{show:!1,processName:"calculate"},bubbles:!0,composed:!0})),this._totalSaving=(null==i?void 0:i.amount)||a.amount||0)}_calculate(t){const e=t.map((t=>{var e;return{value:(null===(e=t.amount)||void 0===e?void 0:e.toFixed(2))||0,multipliers:[{value:1}],dividers:[{value:1}]}}));this._calculatorDm.postCalculate({operation:{operationType:"SUM_OR_SUBTRACTION",quantities:e}}),this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-inform-loader",{detail:{show:!0,processName:"calculate",callback:()=>this._calculate(t)},bubbles:!0,composed:!0}))}get _notificationVariant(){const{freeCards:t}=this._simulation;return t?"default":"information"}get _notificationMessageText(){const t="metas-saving-goals-multistep-algorithm-notification-message",{ca:e,ap:i,at:a,om:s,freeCards:o,simulationRule:n,periodicContribution:r}=this._simulation;var l;return o?e>0&&i>=s&&!n||e<=0&&n?`${t}-scheduled-contribution`:a>0&&!r?`${t}-contribution-for-purchases`:`${t}-success`:`${t}-${null!==(l=this.cardWithOutAccount)&&void 0!==l&&l.id?"no-associated-account":"blocked"}`}get _panelOfferSubText(){const t="metas-saving-goals-multistep-algorithm-panel-offer";return this._simulation.ca>0?this._simulation.ap+this._simulation.at>=this._simulation.om||this._simulation.ap>=this._simulation.om?this.t(`${t}-subtext-success`):this.t(`${t}-subtext-not-complete`):this.t(`${t}-subtext-insufficient`)}get _panelOfferText(){const t="metas-saving-goals-multistep-algorithm-panel-offer";var e,i,a,s;return this._simulation.ca>0?this.t(`${t}-text-success-monthly`,{goalName:`'${null===(e=this.goal)||void 0===e?void 0:e.description}'`,goalAmount:Cs(null===(i=this.goal)||void 0===i||null===(a=i.goalAmount)||void 0===a?void 0:a.amount,this.currency,this.language),contributeAmount:Cs(null===(s=this._simulation)||void 0===s?void 0:s.om,this.currency,this.language)}):this.t(`${t}-text-insufficient`)}get _notEmptyRule(){return!!this.rule&&Object.keys(this.rule).length}get _accountNumber(){var t,e,i,a,s,o,n,r,l,d,c,u,h;let g;var m,p;null!==(t=this.rule)&&void 0!==t&&t.senders&&(g=null===(m=this.listCards)||void 0===m?void 0:m.find((t=>{var e,i;return t.id===(null===(e=this.rule)||void 0===e||null===(i=e.senders[0])||void 0===i?void 0:i.senderDetail.id)})));null!==(e=this._simulation)&&void 0!==e&&null!==(i=e.simulationRule)&&void 0!==i&&null!==(a=i.sender)&&void 0!==a&&null!==(s=a.contract)&&void 0!==s&&s.id&&(g=null===(p=this.listCards)||void 0===p?void 0:p.find((t=>{var e,i,a,s;return t.id===(null===(e=this._simulation)||void 0===e||null===(i=e.simulationRule)||void 0===i||null===(a=i.sender)||void 0===a||null===(s=a.contract)||void 0===s?void 0:s.id)})));return null!==(o=g)&&void 0!==o&&null!==(n=o.relatedContracts)&&void 0!==n&&n.length?U((null===(r=g)||void 0===r||null===(l=r.relatedContracts[0])||void 0===l?void 0:l.number)||(null===(d=g)||void 0===d||null===(c=d.relatedContracts[0])||void 0===c||null===(u=c.id)||void 0===u||null===(h=u.split(" "))||void 0===h?void 0:h[0]),this.maskType,!0,this.maxAccountChars):""}get _coversGoalCapacity(){const{om:t,ap:e,at:i}=this._simulation;return i+e>=t}get _hasCapacityButContributionsLowerThanObjective(){const{ca:t,om:e,ap:i,at:a}=this._simulation;return t>0&&a+i<e&&a+i!==e}get _noCapacityButWithCardSavings(){const{ca:t,at:e}=this._simulation;return t<=0&&e>0}get _noCapacity(){const{ca:t}=this._simulation;return t<=0}get _adviceType(){switch(!0){case this._coversGoalCapacity:return"success";case this._hasCapacityButContributionsLowerThanObjective:return"short-deadline";case this._noCapacityButWithCardSavings:return"insufficient";case this._noCapacity:return"nothing";default:return"success"}}static _getBarMicroillustration(t){return{"short-deadline":"periodiccontributiondollar",insufficient:"dollarlarge",nothing:"flagdollar"}[t]}get _advice(){const t="metas-saving-goals-multistep-algorithm",e=`${t}-progress-bar-link-title`,i=`${t}-progress-bar-link-text`,a=this._adviceType;return{micro:Ho._getBarMicroillustration(a),title:"success"!==a?`${e}-${a}`:"",text:`${i}-${a}`,..."success"!==a&&{modalConfig:{adviceType:a,advisedAmount:this._advisedAmount,advisedDate:this._advisedDate}}}}get _goalMonthsPeriod(){var t,e,i,a;const s=Es(null===(t=this.goal)||void 0===t||null===(e=t.goalPeriod)||void 0===e?void 0:e.initialDate,null===(i=this.goal)||void 0===i||null===(a=i.goalPeriod)||void 0===a?void 0:a.expirationDate);return ws(this.goal)||!s?1:s}get _advisedAmount(){return this._totalSaving*this._goalMonthsPeriod}get _advisedDate(){var t,e,i,a;if(null===(t=this._simulation)||void 0===t||!t.om||!this._totalSaving||ws(this.goal))return"";const s=null===(e=this.goal)||void 0===e||null===(i=e.goalPeriod)||void 0===i?void 0:i.expirationDate,o=((null===(a=this._simulation)||void 0===a?void 0:a.om)||0)/this._totalSaving,n=this._goalMonthsPeriod*o;return ks(s,n)}_handleCalculate({detail:t}){var e;this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-inform-loader",{detail:{show:!1,processName:"calculate"},bubbles:!0,composed:!0})),this._totalSaving=null==t||null===(e=t.calculateValue)||void 0===e?void 0:e.value}_resetCalculatedValue(){this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-inform-loader",{detail:{show:!1,processName:"calculate"},bubbles:!0,composed:!0})),this._totalSaving=0}get _periodicAmountSimulation(){var t,e,i;return null===(t=this._simulation)||void 0===t||null===(e=t.periodicContribution)||void 0===e||null===(i=e.contributionAmount)||void 0===i?void 0:i.amount}_openPeriodicModal(){var t;return this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-scheduled-transfer-open-periodic-modal",{detail:{panelOfferText:this._panelOfferText,periodicAmount:this._periodicAmount,periodicAmountSimulation:this._periodicAmountSimulation,originAccount:null===(t=this._originAccount)||void 0===t?void 0:t.number,frequency:this._frequency,startDate:this._startDate,endDate:this._endDate,typeModalPeriodic:`${this._scheduledTransferUpdateMode.toUpperCase()}_MULTISTEP`},bubbles:!0,composed:!0}))}_openAdviceModal(){var t;return this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-trace-route",{bubbles:!0,composed:!0,detail:{route:"modalAdvice",type:this._adviceType}})),this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-open-advice-modal",{detail:null===(t=this._advice)||void 0===t?void 0:t.modalConfig,bubbles:!0,composed:!0}))}_changeStatusPurchaseContribution(t){return this._activeRule=t.detail,this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-event-click-toggle",{detail:{button:"toggle",type:"purchase contribution",isActive:t.detail},bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-purchase-contribution-change-status",{detail:{isActive:t.detail},bubbles:!0,composed:!0}))}_changeStatusPeriodicContribution(t){return this._activeScheduled=t.detail,this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-event-click-toggle",{detail:{button:"toggle",type:"periodic contribution",isActive:t.detail},bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-periodic-contribution-change-status",{detail:{isActive:t.detail},bubbles:!0,composed:!0}))}_navigateRule(){var t;return this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-navigate-rule",{detail:{rule:{id:null===(t=this.rule)||void 0===t?void 0:t.id}},bubbles:!0,composed:!0}))}_navigateContinue(){return this._isRuleGetted=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-navigate-continue",{detail:{rule:this.rule,activeRule:this._activeRule,activeScheduled:this._activeScheduled},bubbles:!0,composed:!0}))}_openMoreInfoModal(){this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-more-info-modal",{detail:!0,bubbles:!0,composed:!0}))}_accountInModelContract(){return this.listAccounts.map((t=>({id:t.id,currentBalance:t.availableBalance.currentBalances[0],product:{productType:{id:Bo}}})))}_cardsInModelContract(){return this.listCards.map((t=>({id:t.id,product:{productType:{id:qo}}})))}_getSender(t){var e,i;return this._suggestedOriginAccount=null===(e=this.listAccounts)||void 0===e?void 0:e.find((e=>e.id===t.originContract.id)),{contract:{number:null===(i=this._suggestedOriginAccount)||void 0===i?void 0:i.number}}}_getReceiver(){var t,e;return{contracts:[{number:(null===(t=this.savingGoalAccount)||void 0===t?void 0:t.number)||(null===(e=this._suggestedOriginAccount)||void 0===e?void 0:e.number)}],holder:{holderName:this.sessionName}}}_postSimulateDM(){this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-inform-loader",{detail:{show:!0,processName:"simulate",callback:()=>this._postSimulateDM()},bubbles:!0,composed:!0}));const t=[...this._cardsInModelContract(),...this._accountInModelContract()].filter((t=>t.id));this._simulateSavingGoalDm.postSavingGoalSimulateSavings(this.goal.id,{contracts:t})}_handleFetchSimulate({detail:t}){var e,i,a,s,o,n;const r=null==t||null===(e=t.simulations)||void 0===e?void 0:e.find((t=>"ROUNDING_RULE"===t.simulationType)),l=(null==t||null===(i=t.simulations)||void 0===i?void 0:i.find((t=>"PERIODIC_CONTRIBUTION"===t.simulationType&&t.contributionAmount.amount>0)))||null;if(this._simulation={simulationRule:r,ca:(null==t||null===(a=t.monthlySavingsCapacity)||void 0===a?void 0:a.amount)||0,om:(null==t||null===(s=t.monthlySavingsGoal)||void 0===s?void 0:s.amount)||0,ap:(null==l||null===(o=l.contributionAmount)||void 0===o?void 0:o.amount)||0,at:(null==r||null===(n=r.savingAmount)||void 0===n?void 0:n.amount)||0,freeCards:t.hasFreeCards,periodicContribution:l},l){var d;const t={sender:this._getSender(l),receiver:this._getReceiver(),sentMoney:{currency:l.contributionAmount.currency,amount:l.contributionAmount.amount},period:{startDate:Oo().add(1,"days").format("YYYY-MM-DD"),endDate:this.goal.goalPeriod.expirationDate},concept:null===(d=this.goal)||void 0===d?void 0:d.id,resultTransferType:"INTERNAL_TRANSFER",frequency:No,status:"SIMULATED"};this._createScheduledTransfer({detail:t})}this._getRoundingRule(),this._isRuleGetted=!0,this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-update-simulation",{detail:{simulation:{...this._simulation}},bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-inform-loader",{detail:{show:!1,processName:"simulate"},bubbles:!0,composed:!0}))}_createScheduledTransfer({detail:t}){return this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-scheduled-transfer-create",{detail:{...t},bubbles:!0,composed:!0}))}_getRoundingRule(){var t;if(null!==(t=this._simulation.simulationRule)&&void 0!==t&&t.ruleId){const{ruleId:t}=this._simulation.simulationRule;this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-get-rule",{detail:{ruleId:t},bubbles:!0,composed:!0}))}}_handleFetchSimulateError(){this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-post-error",{detail:{},bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-inform-loader",{detail:{show:!1,processName:"simulate"},bubbles:!0,composed:!0}))}_callbackModal(){return this._isRuleGetted=!1,this.dispatchEvent(new CustomEvent("metas-saving-goals-algorithm-exit",{detail:!0,bubbles:!0,composed:!0}))}get _calculatorTemplateDM(){return d`
      <bbva-global-calculate-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.calculateApiVersion}"
        ?native="${this.native}"
        @calculate-api-dm-fetch="${this._handleCalculate}"
        @calculate-api-dm-fetch-error="${this._resetCalculatedValue}"
        @api-dm-error="${this._resetCalculatedValue}"
      >
      </bbva-global-calculate-api-dm>
    `}get _simulateTemplateDM(){return d`
      <bbva-global-saving-goal-simulate-savings-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.simulateSavingsApiVersion}"
        ?native="${this.native}"
        @saving-goal-simulate-savings-api-dm-fetch="${this._handleFetchSimulate}"
        @saving-goal-simulate-savings-api-dm-fetch-error="${this._handleFetchSimulateError}"
        @api-dm-error="${this._handleFetchSimulateError}"
      >
      </bbva-global-saving-goal-simulate-savings-api-dm>
    `}get _progressBarStatusTemplate(){var t;return d`
      <bbva-divider></bbva-divider>
      <bbva-list-goal
        no-link
        ambient="light"
        heading-level="h2"
        goal-title="${this.t("metas-saving-goals-multistep-algorithm-progress-bar-title")}"
        amount="${this._totalSaving}"
        total-amount="${null===(t=this._simulation)||void 0===t?void 0:t.om}"
        progress-bar-color="${Lo[0]}"
        currency-code="${this.currency}"
        local-currency="${this.currency}"
        language="${this.language}"
      >
      </bbva-list-goal>
    `}get _adviceModalTemplate(){var t,e,i,a;return d`
      ${this.isUsingAdvice&&this._coversGoalCapacity&&!this.isEditMode?d`
            <bbva-text unset text="${null===(t=this._advice)||void 0===t?void 0:t.text}"></bbva-text>
          `:d`
            <bbva-list-clip
              id="open-advice-modal"
              ambient="light"
              disabled-tabindex
              heading="${null===(e=this._advice)||void 0===e?void 0:e.title}"
              microillustration="${c(null===(i=this._advice)||void 0===i?void 0:i.micro)}"
              heading-level="3"
              ?hidden="${"success"===this._adviceType}"
              @list-clip-link-click="${this._openAdviceModal}
        }}"
            >
              ${this.t(null===(a=this._advice)||void 0===a?void 0:a.text)}
            </bbva-list-clip>
          `}
    `}get _simulationRuleTemplate(){var t,e,i,a,s,n,r,l,c,u,h,g,m,p,v,b,_,f,y;return d`
      <div ambient="light" class="box-shadow">
        <bbva-list-toggle
          disabled-tabindex
          heading="${this.t("metas-saving-goals-multistep-contribution-for-purchases-title")}"
          ?checked="${this._activeRule}"
          @list-toggle-switch-change="${t=>{this._changeStatusPurchaseContribution(t),this._calculateTotal()}}"
        >
          ${"PERCENTAGE"===(null===(t=this.rule)||void 0===t||null===(e=t.roundRule)||void 0===e?void 0:e.roundType)?this.t("metas-saving-goals-multistep-contribution-for-purchases-text",{percentage:`${null===(i=this.rule)||void 0===i?void 0:i.roundRule.percentage}`,simulateAmount:Cs(null===(a=this._simulation)||void 0===a||null===(s=a.simulationRule)||void 0===s||null===(n=s.savingAmount)||void 0===n?void 0:n.amount,(null===(r=this._simulation)||void 0===r||null===(l=r.simulationRule)||void 0===l||null===(c=l.savingAmount)||void 0===c?void 0:c.currency)||this.currency,this.language)}):this.t("metas-saving-goals-multistep-contribution-for-round-text",{round:Cs(null===(u=this.rule)||void 0===u||null===(h=u.roundRule)||void 0===h?void 0:h.amount,null===(g=this.rule)||void 0===g||null===(m=g.roundRule)||void 0===m?void 0:m.currency,this.language),simulateAmount:Cs(null===(p=this._simulation)||void 0===p||null===(v=p.simulationRule)||void 0===v||null===(b=v.savingAmount)||void 0===b?void 0:b.amount,(null===(_=this._simulation)||void 0===_||null===(f=_.simulationRule)||void 0===f||null===(y=f.savingAmount)||void 0===y?void 0:y.currency)||this.currency,this.language)})}
        </bbva-list-toggle>
        <div class="badge-wrapper">
          <bbva-text
            unset
            class="accounts-title"
            size="S"
            tag="span"
            text="${this.t("metas-saving-goals-multistep-algorithm-cards")}"
          ></bbva-text>
          <bbva-text
            unset
            class="account"
            size="S"
            tag="span"
            text="${this._cardsNumberText}"
          ></bbva-text>
        </div>
        <bbva-list-link
          id="edit-contribution"
          disabled-tabindex
          accessibility-icon-link-text="${this.t("metas-saving-goals-multistep-algorithm-edit-contribution")}"
          header-text="${this.t("metas-saving-goals-multistep-algorithm-edit-contribution")}"
          link-icon="${Ae()}"
          @list-link-click="${()=>{this.isUsingAdvice=!1,this._navigateRule()}}"
        >
        </bbva-list-link>
        <bbva-divider size="small center"></bbva-divider>
        <bbva-notification-help
          accessibility-label-icon="Info"
          disabled-tabindex
          class="info"
          icon="${o()}"
          text=${this._notificationHelpRule}
        ></bbva-notification-help>
      </div>
    `}get _hasRuleSimulation(){var t,e;return null===(t=this._simulation)||void 0===t||null===(e=t.simulations)||void 0===e?void 0:e.some((t=>"ROUNDING_RULE"===t.simulationType))}get _simulationEmptyRuleTemplate(){var t,e,i;return d`
      <div ambient="light" class="box-shadow">
        <bbva-text
          unset
          size="M"
          tag="span"
          font-weight="500"
          text="${this.t("metas-saving-goals-multistep-contribution-for-purchases-title")}"
          ?disabled="${!(null!==(t=this._simulation)&&void 0!==t&&t.freeCards&&this._hasRuleSimulation)}"
        ></bbva-text>
        <div class="badge-wrapper">
          <bbva-text
            unset
            class="contribution"
            size="S"
            tag="span"
            text="${this.t("metas-saving-goals-multistep-algorithm-empty-rule-text")}"
            ?disabled="${!(null!==(e=this._simulation)&&void 0!==e&&e.freeCards&&this._hasRuleSimulation)}"
          ></bbva-text>
        </div>
        <bbva-list-link
          id="navigate-rule"
          disabled-tabindex
          accessibility-icon-link-text="${this.t("metas-saving-goals-multistep-create-contributions-link")}"
          header-text="${this.t("metas-saving-goals-multistep-create-contributions-link")}"
          link-icon="${Ae()}"
          ?disabled="${!(null!==(i=this._simulation)&&void 0!==i&&i.freeCards&&this._hasRuleSimulation)}"
          @list-link-click="${()=>{this.isUsingAdvice=!1,this._navigateRule()}}"
        >
        </bbva-list-link>
      </div>
    `}get _emptyPeriodicContributionTemplate(){return d`
      <div ambient="light" class="box-shadow">
        <bbva-text
          unset
          size="M"
          tag="span"
          font-weight="500"
          text="${this.t("metas-saving-goals-multistep-scheduled-contribution-title")}"
        ></bbva-text>
        <div class="badge-wrapper">
          <bbva-text
            unset
            class="contribution"
            size="S"
            tag="span"
            text="${this.t("metas-saving-goals-multistep-algorithm-empty-contribution-text")}"
          ></bbva-text>
        </div>
        <bbva-list-link
          id="link-periodic-modal-empty"
          disabled-tabindex
          accessibility-icon-link-text="${this.t("metas-saving-goals-multistep-create-contributions-link")}"
          header-text="${this.t("metas-saving-goals-multistep-create-contributions-link")}"
          link-icon="${Ae()}"
          @list-link-click="${this._openPeriodicModal}"
        >
        </bbva-list-link>
      </div>
    `}get _periodicContributionTemplate(){var t,e,i,a,s,n;return d`
      <div ambient="light" class="box-shadow">
        <bbva-list-toggle
          disabled-tabindex
          heading="${this.t("metas-saving-goals-multistep-scheduled-contribution-title")}"
          ?checked=${this._activeScheduled}
          @list-toggle-switch-change="${t=>{this._changeStatusPeriodicContribution(t),this._calculateTotal()}}"
        >
          ${this.t(`metas-saving-goals-multistep-algorithm-contribution-text-${this._frequency.toLowerCase()}`,{contributionAmount:Cs(null===(t=this.scheduledTransfer.sentMoney)||void 0===t?void 0:t.amount,null===(e=this.scheduledTransfer.sentMoney)||void 0===e?void 0:e.currency,this.language),contributionAmountTotal:Cs(this._monthlyPeriodicContribution.amount,null===(i=this.scheduledTransfer.sentMoney)||void 0===i?void 0:i.currency,this.language)})}
        </bbva-list-toggle>
        <div class="badge-wrapper">
          <bbva-text
            unset
            class="accounts-title"
            size="S"
            tag="span"
            text="${this.t("metas-saving-goals-multistep-algorithm-root-account")}"
          ></bbva-text>
          <bbva-text
            unset
            class="account"
            size="S"
            tag="span"
            text="${U(null===(a=this.scheduledTransfer)||void 0===a||null===(s=a.sender)||void 0===s||null===(n=s.contract)||void 0===n?void 0:n.number,this.maskType,!0,this.maxAccountChars)}"
          ></bbva-text>
        </div>
        <bbva-list-link
          id="link-periodic-modal"
          disabled-tabindex
          accessibility-icon-link-text="${this.t("metas-saving-goals-multistep-algorithm-edit-contribution")}"
          header-text="${this.t("metas-saving-goals-multistep-algorithm-edit-contribution")}"
          link-icon="${Ae()}"
          @list-link-click="${this._openPeriodicModal}"
        >
        </bbva-list-link>
        <bbva-divider size="small center"></bbva-divider>
        <bbva-notification-help
          accessibility-label-icon="Info"
          class="info"
          disabled-tabindex
          icon="${o()}"
          text="${this.t(`metas-saving-goals-multistep-algorithm-scheduled-contribution-notification-${this._frequency.toLowerCase()}`)}"
        ></bbva-notification-help>
      </div>
    `}render(){var t;return d`
      ${super.render()}${this._calculatorTemplateDM} ${this._simulateTemplateDM}
      <bbva-panel-offer
        link-icon=""
        microillustration="savingdollar"
        .linkText="${this.t("metas-saving-goals-multistep-algorithm-panel-offer")}"
        @panel-offer-panel-link-click="${this._openMoreInfoModal}"
      >
        <bbva-text
          unset
          size="S"
          tag="span"
          alignment="center"
          text="${c(this._panelOfferText||void 0)}"
        >
        </bbva-text>
        <bbva-text
          unset
          size="S"
          tag="span"
          alignment="center"
          text="${c(this._panelOfferSubText||void 0)}"
        >
        </bbva-text>
      </bbva-panel-offer>
      ${this._isVisibleProgressBar?this._progressBarStatusTemplate:gt}
      ${this.isEditMode?gt:this._adviceModalTemplate}
      <div class="background-light100">
        ${this._notEmptyRule?this._simulationRuleTemplate:this._simulationEmptyRuleTemplate}
        ${null!==(t=this.scheduledTransfer)&&void 0!==t&&t.id?this._periodicContributionTemplate:this._emptyPeriodicContributionTemplate}
        <bbva-notification-message variant="${this._notificationVariant}">
          ${this.t(this._notificationMessageText)}
        </bbva-notification-message>
      </div>
      <div
        class="c-panel-fixed ${V({"c-panel-fixed--show":this.showButtonFixed})}"
        ambient="light"
      >
        <bbva-text
          unset
          alignment="center"
          tag="span"
          text="${this.t("metas-saving-goals-multistep-algorithm-panel-fixed-text")}"
        ></bbva-text>
        <bbva-amount
          amount=${this._totalSaving}
          currency-code="${this.currency}"
          disabled-tabindex
          language="${this.language}"
          local-currency="${this.currency}"
          variant="4xl"
        >
        </bbva-amount>
        <bbva-button-default
          class="action"
          text="${this.t("metas-saving-goals-continue")}"
          @click="${this._navigateContinue}"
        ></bbva-button-default>
      </div>
    `}}var Fo=t`
:host {
  display: block;
  box-sizing: border-box;
  overflow: hidden;
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

[data-tag-name=bbva-badge-reference] {
  margin: 0 1rem;
}

.badge-wrapper {
  padding: 0 1rem;
  display: flex;
  flex-wrap: wrap;
}
.badge-wrapper [data-tag-name=bbva-badge-reference] {
  margin: 0;
}
.badge-wrapper [data-tag-name=bbva-text] {
  margin: 0 0.25rem;
}
.badge-wrapper [data-tag-name=bbva-text].accounts-title {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${u(G.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${u(G.bookItalic.fontStyle)});
  margin: 0 0.5rem 0 0;
}

[data-tag-name=bbva-button-default] {
  margin: 1.5rem auto;
  display: block;
  width: -webkit-max-content;
  width: max-content;
}

.account-plan-description[data-tag-name=bbva-text] {
  padding: 0 1rem;
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

.background-light100 {
  background-color: var(--ambientsLight100, ${u(nt.light100)});
  padding: 1rem;
}

[ambient=light] {
  background-color: var(--ambientsLight, ${u(nt.light)});
}

[data-tag-name=bbva-form-amount],
[data-tag-name=bbva-form-date],
[data-tag-name=bbva-form-text] {
  margin: 1rem;
}

[data-tag-name=bbva-list-toggle] {
  --bbva-form-toggle-list-container-padding: 0;
  text-align: left;
}

[data-tag-name=bbva-card-banner] {
  padding-bottom: 0;
}

.account-description {
  padding: 0.5rem 1rem 0;
}
.account-description:last-child {
  padding-bottom: 0.5rem;
}

[data-tag-name=bbva-header-category] {
  padding-top: 1.5rem;
}

[data-tag-name=bbva-panel-info] p {
  margin-top: 1rem;
}

[data-tag-name=bbva-panel-offer] p:last-child:not(:only-child) {
  margin-top: 1rem;
}

[data-tag-name=bbva-form-checkbox] {
  padding: 0 1rem;
}

[data-tag-name=bbva-form-radio-button] {
  padding: ren(8px) 0;
  text-align: left;
}

[data-tag-name=bbva-form-container] [data-tag-name=bbva-badge-reference] {
  margin: 0;
}
[data-tag-name=bbva-form-container] [data-tag-name=bbva-text] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${u(G.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${u(G.medium.fontStyle)});
}
[data-tag-name=bbva-form-container] [slot=right] {
  margin-top: 0.25rem;
}

[data-tag-name=bbva-form-checkbox],
[data-tag-name=bbva-list-file] {
  text-align: left;
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-text] {
  padding: 1rem 1rem 0;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-text]:last-of-type {
  padding-bottom: 1rem;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet] {
  text-align: left;
}
[data-tag-name=bbva-expandable-accordion] [data-tag-name=bbva-list-bullet]:last-child {
  padding-bottom: 1rem;
}
`;class jo extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-contract-account"}static get scopedElements(){const t=[Gt,xi,v,bi,_i,li,ue,lt,he,ji,Pt,Vt,...jo.configurationScopedElements()];return jo.scopedElementsFromClasses(t)}static get properties(){return{listAccountsActivated:{type:Array,attribute:"list-accounts-activated"},documentsOperation:{type:Array,attribute:"documents-operation"},maskType:{type:String,attribute:"mask-type"},maxAccountChars:{type:Number,attribute:"max-account-chars"},_principalAccountId:{type:String},_isAcceptedFirstCondition:{type:Boolean},_isAcceptedSecondCondition:{type:Boolean}}}static get styles(){return[Fo,It,de.light,y.light,fi.light,yi.light,Bi.light,ut.light,di.light,ge.light,me.light,Ot.light,Ti.light,l("metas-saving-goals-contract-account-shared-styles")]}constructor(){super(),this.documentsOperation=[],this.listAccountsActivated=[],this.maskType="•",this.maxAccountChars=4,this._isAcceptedFirstCondition=!1,this._isAcceptedSecondCondition=!1,this._principalAccountId=""}get _disabledContinue(){return this._isAcceptedFirstCondition&&this._isAcceptedSecondCondition&&""!==this._principalAccountId}_continueTermContractAccount(){var t,e;return this.dispatchEvent(new CustomEvent("metas-saving-goals-contract-account-continue",{detail:{account:null===(t=this.listAccountsActivated)||void 0===t||null===(e=t.find((t=>t.id===this._principalAccountId)))||void 0===e?void 0:e.number},bubbles:!0,composed:!0}))}_handleListFileClick(){this.dispatchEvent(new CustomEvent("metas-saving-goals-list-file-click",{bubbles:!0,composed:!0,detail:this.documentsOperation}))}render(){var t,e,i,a,s,o,n,r,l;return d`
      <bbva-card-banner
        disabled-tabindex
        ambient="light"
        id="hiringBanner"
        variant="full-width"
        microillustration="verifieddocument"
        description="${this.t("metas-saving-goals-contract-account-description")}"
      >
      </bbva-card-banner>
      <div>
        <bbva-text
          unset
          class="account-description"
          alignment="center"
          tag="span"
          size="S"
          ?hidden="${!this.t("metas-saving-goals-contract-account-description1")}"
          text="${this.t("metas-saving-goals-contract-account-description1")}"
        ></bbva-text>
        <bbva-text
          unset
          class="account-description"
          alignment="center"
          tag="span"
          size="S"
          text="${this.t("metas-saving-goals-contract-account-description2")}"
          ?hidden="${!this.t("metas-saving-goals-contract-account-description2")}"
        ></bbva-text>
      </div>
      <bbva-header-category
        text="${this.t("metas-saving-goals-contract-account-status-account-plan")}"
        heading-level="2"
      >
      </bbva-header-category>
      <bbva-text
        unset
        class="account-plan-description"
        tag="span"
        size="S"
        text="${this.t("metas-saving-goals-contract-account-status-account-plan-description")}"
      ></bbva-text>
      <bbva-form-container
        divider-size="fit"
        @change="${t=>{t.stopPropagation(),this._principalAccountId=t.target.value}}"
      >
        ${null===(t=this.listAccountsActivated)||void 0===t?void 0:t.map((t=>{var e;return d`
            <bbva-form-control-input
              slot="_option"
              type="radio"
              name="custom"
              value="${t.id}"
              ?checked=${this._principalAccountId===t.id}
            >
              <div slot="right">
                <bbva-text
                  unset
                  tag="span"
                  text="${(null==t?void 0:t.alias)||(null==t||null===(e=t.product)||void 0===e?void 0:e.name)}"
                ></bbva-text>
                <bbva-badge-reference
                  number="${U(null==t?void 0:t.number,"",!0,this.maxAccountChars)}"
                ></bbva-badge-reference>
              </div>
            </bbva-form-control-input>
          `}))}
        <bbva-divider size="fit"></bbva-divider>
      </bbva-form-container>
      <bbva-header-category
        text="${this.t("metas-saving-goals-contract-account-terms-and-conditions")}"
        heading-level="2"
      >
      </bbva-header-category>
      <bbva-list-file
        icon="${xe()}"
        file-name="${this.t(null===(e=this.documentsOperation)||void 0===e||null===(i=e[0])||void 0===i?void 0:i.name)}"
        file-size="${null===(a=this.documentsOperation)||void 0===a||null===(s=a[0])||void 0===s?void 0:s.size}"
        href-link="${c(null===(o=this.documentsOperation)||void 0===o||null===(n=o[0])||void 0===n?void 0:n.url)}"
        spinner-accesibility-text="${null===(r=this.documentsOperation)||void 0===r||null===(l=r[0])||void 0===l?void 0:l.name}"
        @list-file-link-click="${this._handleListFileClick}"
      >
      </bbva-list-file>
      <bbva-form-checkbox
        required
        name="firstCondition"
        value="firstCondition"
        label="${this.t("metas-saving-goals-contract-account-first-condition")}"
        @change="${t=>{t.stopPropagation(),this._isAcceptedFirstCondition=!this._isAcceptedFirstCondition}}"
      >
      </bbva-form-checkbox>
      <bbva-form-checkbox
        required
        name="secondCondition"
        value="secondCondition"
        label="${this.t("metas-saving-goals-contract-account-second-condition")}"
        @change="${t=>{t.stopPropagation(),this._isAcceptedSecondCondition=!this._isAcceptedSecondCondition}}"
      >
      </bbva-form-checkbox>
      <bbva-button-default
        variant="primary"
        ?disabled="${!this._disabledContinue}"
        @click="${t=>{t.stopPropagation(),this._continueTermContractAccount()}}"
      >
        ${this.t("metas-saving-goals-contract-account-continuar")}
      </bbva-button-default>
    `}}var Uo=t`
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

[data-tag-name=bbva-help-modal] [slot=slot-content] > [data-tag-name=bbva-text] {
  padding: 0 1rem;
}
`;class zo extends(T(p(rt(Pi(a))))){static get is(){return"metas-saving-goals-create-goal-multistep-form-advice-modal"}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"}}}static get styles(){return[Uo,I.light,fe.light,y.light,It,de.light,l("metas-saving-goals-create-goal-multistep-form-advice-modal-shared-styles")]}static get scopedElements(){const t=[dt,L,v,Gt,ve,...zo.configurationScopedElements()];return zo.scopedElementsFromClasses(t)}constructor(){super(),this.modalConfig={}}get modal(){return this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]')}open(){this.modal.open()}close(){this.modal.close()}_dispatchCustomEvent(t,e){this.dispatchEvent(new CustomEvent(`${this.constructor.is}-${t}`,{...e&&{detail:e},bubles:!0,composed:!0}))}render(){const{adviceType:t,advisedAmount:e,advisedDate:i,currency:a,language:s}=this.modalConfig;return d`
      <bbva-help-modal
        id="advice-modal"
        ambient="light"
        button-text="${c("nothing"===t?this.t(`${this.constructor.is}-button`):void 0)}"
        full-height
        header-text="${this.t(`metas-saving-goals-multistep-algorithm-progress-bar-link-title-${t}`)}"
        hide-content-padding-top
        icon-right-primary=${ct()}
        @help-modal-close="${this.close}}"
        @help-modal-footer-button-click="${this.close}}"
        @header-main-icon-right-primary-click="${t=>t.stopPropagation()}"
      >
        <div slot="slot-content">
          <bbva-text
            alignment="center"
            size="S"
            text="${this.t(`${this.constructor.is}-intro-${t}`)}"
            ?hidden="${"nothing"===t}"
          ></bbva-text>
          <bbva-panel-offer
            id="panel-1"
            link-icon=""
            microillustration="dollarlarge"
            .contentTitle="${`${this.constructor.is}-panel-1-title${"nothing"===t?"-nothing":""}`}"
            .linkText="${"nothing"===t?"":`${this.constructor.is}-panel-1-link`}"
            @panel-offer-panel-link-click="${()=>{this._dispatchCustomEvent("offer-panel-1-link-click",{advisedAmount:e})}}"
          >
            <bbva-text
              alignment="center"
              size="S"
              text="${this.t(`${this.constructor.is}-panel-1-text${"nothing"===t?"-nothing":""}`,{advisedAmount:Cs(e,a,s)})}"
            >
            </bbva-text>
            <bbva-text
              alignment="center"
              size="S"
              ?hidden="${"nothing"!==t}"
              text="${this.t(`${this.constructor.is}-panel-1-text-nothing-part-2`)}"
            >
            </bbva-text>
          </bbva-panel-offer>
          <bbva-divider
            size="fit"
            ?hidden="${"nothing"===t}"
            ambient="light"
          ></bbva-divider>
          <bbva-panel-offer
            id="panel-2"
            link-icon=""
            microillustration="calendar"
            .contentTitle="${`${this.constructor.is}-panel-2-title`}"
            .linkText="${`${this.constructor.is}-panel-2-link`}"
            ?hidden="${"nothing"===t}"
            @panel-offer-panel-link-click="${()=>{this._dispatchCustomEvent("offer-panel-2-link-click",{advisedDate:i})}}"
          >
            <bbva-text
              alignment="center"
              size="S"
              text="${this.t(`${this.constructor.is}-panel-2-text`,{advisedDate:new Date(i||null).toLocaleDateString(this.language,{month:"2-digit",year:"numeric"})})}"
            >
            </bbva-text>
          </bbva-panel-offer>
        </div>
      </bbva-help-modal>
    `}}const Wo=t=>d`
    ${t.map((t=>d`
        <bbva-list-simple
          ambient="dark"
          ?decimals-hidden="${t.decimalsHidden}"
          ?description-date="${t.descriptionDate}"
          action-icon="${c(t.actionIcon)}"
          action-label="${c(t.actionIcon)}"
          language="${c(t.language)}"
          .currencyCode="${c(t.currencyCode)}"
          .localCurrency="${c(t.currencyCode)}"
          label="${t.label}"
          description="${c(t.description)}"
          amount="${c(t.amount)}"
          .mask="${t.mask}"
          .visibleChars="${t.visibleChars}"
          .maskChars="${t.maskChars}"
        >
        </bbva-list-simple>
      `))}
  `;class Ko extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals-create-goal-multistep-form"}static get scopedElements(){const t=[$i,lt,Gt,Te,Ce,Ee,Ho,jo,ve,ji,ni,Me,Le,bi,_i,dt,_e,v,zo,...Ko.configurationScopedElements()];return Ko.scopedElementsFromClasses(t)}static get properties(){return{calculateApiVersion:{type:Number,attribute:"calculate-api-version"},sessionName:{type:String,attribute:"session-name"},endDate:{type:String,attribute:"end-date"},currency:{type:String},operationType:{type:String,attribute:"operation-type"},maxLengthAmount:{type:Number,attribute:"max-length-amount"},maxLengthTitle:{type:Number,attribute:"max-length-title"},simulateSavingsApiVersion:{type:Number,attribute:"simulate-savings-api-version"},transfersManagementApiVersion:{type:Number,attribute:"transfers-management-api-version"},createGoalFormVisible:{type:Boolean,attribute:"create-goal-form-visible"},savingGoalAccount:{type:Object,attribute:"saving-goal-account"},listCards:{type:Array,attribute:"list-cards"},listAccounts:{type:Array,attribute:"list-accounts"},documentsOperation:{type:Array,attribute:"documents-operation"},goal:{type:Object},rule:{type:Object},scheduledTransfer:{type:Object,attribute:"scheduled-transfer"},roundingTotal:{type:Number,attribute:"rounding-total"},step2Completed:{type:Boolean,attribute:"step2-completed",state:!0},_accountPrincipalSelect:{type:String},_adviceModalConfig:{type:Object},_step1Completed:{type:Boolean,state:!0},_step3Completed:{type:Boolean,state:!0},_step4Completed:{type:Boolean,state:!0},_step1Edit:{type:Boolean},_step2Edit:{type:Boolean},_step3Edit:{type:Boolean},_step4Edit:{type:Boolean},_stepsToReset:{type:Array},_listItemStep1:{type:Array},_goalPurpose:{type:String},_descriptionStep2:{type:String},_amountStep2:{type:Number},_isUsingAdvice:{type:Boolean},_maskType:{type:String,attribute:"mask-type"},_maxAccountChars:{type:Number,attribute:"max-account-chars"},_showButtonFixed:{type:Boolean},_callSimulation:{type:Boolean},_associatedAccount:{type:String},_simulation:{type:Object},_leakedCardList:{type:Array},_isActivePurchaseContribution:{type:Boolean},_isActivePeriodicContribution:{type:Boolean},_hasNavigatedToOtherFeature:{type:Boolean},cardWithOutAccount:{type:Object}}}constructor(){super(),this.config={fixedHeader:!0,back:!1,header:{variant:"modal",accessibilityTextIconRightPrimary:this.t("metas-saving-goals-accessibility-icon-right-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-create-goal-title")},notify:!1},this.createGoalFormVisible=!1,this.endDate="",this.goal={},this.listAccounts=[],this.listCards=[],this.operationType="",this.roundingTotal=0,this.rule={},this.savingGoalAccount={},this.scheduledTransfer={},this.sessionName="",this.simulateSavingsApiVersion=1,this.simulationType="ROUNDING_RULE",this.step2Completed=!1,this.transfersManagementApiVersion=0,this._accountPrincipalSelect="",this._adviceModalConfig={},this._amountStep2=null,this._associatedAccount="",this._callSimulation=!1,this._descriptionStep2="",this._goalPurpose="PURCHASE",this._isActivePeriodicContribution=!1,this._isActivePurchaseContribution=!1,this._isUsingAdvice=!1,this._leakedCardList=[],this._listItemStep1=[{value:"PURCHASE",description:this.t("metas-saving-goals-create-goal-multistep-step1-form-1"),microillustration:"shoppingbag"},{value:"TRAVEL",description:this.t("metas-saving-goals-create-goal-multistep-step1-form-2"),microillustration:"lightaircraft"},{value:"SAVING",description:this.t("metas-saving-goals-create-goal-multistep-step1-form-3"),microillustration:"savingdollar"}],this._maskType="•",this._maxAccountChars=4,this._hasNavigatedToOtherFeature=!1,this._showButtonFixed=!1,this._simulation={ca:0,om:0,at:0,ap:0,simulationRule:null,periodicContribution:null},this._step1Completed=!1,this._step1Edit=!0,this._step2Edit=!1,this._step3Completed=!1,this._step3Edit=!1,this._step4Completed=!1,this._step4Edit=!1,this._stepsToReset=[],this.cardWithOutAccount={}}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this.$buttons=[...this.shadowRoot.querySelectorAll('[data-tag-name="bbva-button-default"].action')];const e=()=>{this.dispatchEvent(new CustomEvent("complete",{bubbles:!0}))};this.$buttons.forEach((t=>{t.addEventListener("click",e)}))}updated(t){var e,i;super.updated(t),!t.has("createGoalFormVisible")||this.createGoalFormVisible||this._hasNavigatedToOtherFeature||this._resetMultistepComponent(),t.has("createGoalFormVisible")&&this.createGoalFormVisible&&this._multistepElement&&(this._hasNavigatedToOtherFeature?(this._hasNavigatedToOtherFeature=!1,this._steps[2].edit()):(this._initialProperties(),this._steps[0].edit())),t.has("step2Completed")&&!0===this.step2Completed&&!0===this.createGoalFormVisible&&this._finishStep2(),t.has("listCards")&&this.listCards.length&&this._cardsFilter(),!t.has("goal")||null!==(e=this.goal)&&void 0!==e&&e.id||(this._amountStep2=null,this._descriptionStep2="",this.endDate=""),t.has("rule")&&null!==(i=this.rule)&&void 0!==i&&i.id&&(this._simulation={...this._simulation,rule:this.rule}),t.has("savingGoalAccount")&&this._step4IsNecessary&&(this._stepsToReset=[0,1,2])}static get styles(){return[Co,ut.light,fe.light,Bi.dark,ri.light,Oe.light,Ne.light,yi.light,fi.light,Se.light,y.light,y.dark,ke.light,Si.light,Si.dark,l("metas-saving-goals-create-goal-multistep-form-shared-styles")]}get _multistepElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')}get _steps(){return this.shadowRoot.querySelectorAll("bbva-expandable-step")}_manageEditStep(t){this._steps.forEach(((e,i)=>{const a=i+1;this[`_step${a}Edit`]=a===t,this._steps[i].active=a===t}))}get _multistepProgressPercentage(){const t=Array.from(this._steps).findIndex((t=>t.active)),e=-1===t,i=t+1,a=this._steps.length;return(e?a:i)/a*100}_cardsFilter(){this._leakedCardList=this.listCards.filter((t=>{var e,i;return("CREDIT_CARD"===(null===(e=t.cardType)||void 0===e?void 0:e.id)||"DEBIT_CARD"===(null===(i=t.cardType)||void 0===i?void 0:i.id))&&!t.isBusiness}))}get _accountNumber(){var t,e,i,a,s;const o=null===(t=this._leakedCardList)||void 0===t?void 0:t.find((t=>{var e,i,a;return t.id===(null===(e=this._simulation)||void 0===e||null===(i=e.rule)||void 0===i||null===(a=i.senders[0])||void 0===a?void 0:a.senderDetail.id)}));return null!=o&&null!==(e=o.relatedContracts)&&void 0!==e&&e[0]?U(o.relatedContracts[0].number||(null==o||null===(i=o.relatedContracts[0])||void 0===i||null===(a=i.id)||void 0===a||null===(s=a.split(" "))||void 0===s?void 0:s[0]),this._maskType,!0,this._maxAccountChars):""}get _formControlInput(){return d`
      <bbva-form-container
        divider-size="full"
        @change="${t=>{this._goalPurpose=t.target.value,this._dispatchClickEvent({detail:{button:"step1",selected:t.target.value}})}}"
      >
        ${this._listItemStep1.map((t=>d`
            <bbva-form-control-input
              slot="_option"
              type="radio"
              alignment="right"
              name="step1"
              value="${t.value}"
              ?checked=${this._goalPurpose===t.value}
            >
              <div slot="left">
                <bbva-clip-microillustration
                  .microillustration="${t.microillustration}"
                  size="S"
                ></bbva-clip-microillustration>
                <div class="header">
                  <bbva-text unset tag="span" text="${t.description}"></bbva-text>
                </div>
              </div>
            </bbva-form-control-input>
          `))}
      </bbva-form-container>
    `}get _isPreSummaryStepCompleted(){const t=!this._step4IsNecessary||this._step4Completed;return Boolean(this._step3Completed&&t)}_continueStep1(){const t={route:"create-goal-multistep",step:2,purpose:this._goalPurpose};this._step1Completed=!0,this._manageEditStep(2),this._emitStep2State(),this._dispatchTraceEvent(t)}_continueToSummary({currentStep:t}){this._emitGoalState(),this[`_step${t}Completed`]=!0,this._continueStep3()}get _step4IsNecessary(){return!this.savingGoalAccount.id}get _listResultsStep1(){var t;const e=null===(t=this._listItemStep1.filter((t=>t.value===this._goalPurpose))[0])||void 0===t?void 0:t.description;return[{label:this.t("metas-saving-goals-create-goal-multistep-step1-result-label"),description:e}]}get _listResultsStep2(){return[{label:this.t("metas-saving-goals-create-goal-multistep-step2-form-text-summary"),description:this._descriptionStep2},{label:"metas-saving-goals-create-goal-multistep-step2-form-amount",amount:this._amountStep2,currencyCode:this.currency},{label:"metas-saving-goals-create-goal-multistep-step2-form-date",description:Ps.call(this,this.endDate)}]}get _listResultsStep3(){return[this._step3RoundingRuleSummary,this._step3PeriodicContributionSummary]}get _roundingCardNumber(){var t,e;if(!this.listCards||null===(t=this.rule)||void 0===t||null===(e=t.senders)||void 0===e||!e.length)return"";const i=this.listCards.filter((t=>{var e,i;return null===(e=this.rule)||void 0===e||null===(i=e.senders)||void 0===i?void 0:i.find((e=>e.senderDetail.id===t.id))})).map((t=>U(t.number,this._maskType,!0,this._maxAccountChars)));return i.length>3?this.t("metas-saving-goals-multistep-algorithm-cards-more",{firstCard:i[0],numberCards:i.length-1}):(null==i?void 0:i.join(", "))||""}get _step3RoundingRuleSummary(){var t,e,i,a,s,o,n,r,l,d,c,u,h,g;const m="AMOUNT"===(null===(t=this._simulation)||void 0===t||null===(e=t.rule)||void 0===e||null===(i=e.roundRule)||void 0===i?void 0:i.roundType);return null!==(a=this._simulation)&&void 0!==a&&a.simulationRule&&this._isActivePurchaseContribution?[{label:this.t("metas-saving-goals-create-goal-multistep-step3-rounding-rule"),description:m?this.t("metas-saving-goals-create-goal-multistep-step3-rounding-rule-amount"):this.t("metas-saving-goals-create-goal-multistep-step3-rounding-rule-percentage")},{label:"metas-saving-goals-create-goal-multistep-step3-card",description:this._roundingCardNumber},{label:`metas-saving-goals-create-goal-multistep-step3-rounding-type-${null===(s=this._simulation)||void 0===s||null===(o=s.rule)||void 0===o||null===(n=o.roundRule)||void 0===n||null===(r=n.roundType)||void 0===r?void 0:r.toLowerCase()}`,description:m?"":`${null===(l=this._simulation)||void 0===l||null===(d=l.rule)||void 0===d||null===(c=d.roundRule)||void 0===c?void 0:c.percentage}%`,amount:m?null===(u=this._simulation)||void 0===u||null===(h=u.rule)||void 0===h||null===(g=h.roundRule)||void 0===g?void 0:g.amount:"",currencyCode:m?this._simulation.rule.roundRule.currency:""}]:[{label:this.t("metas-saving-goals-create-goal-multistep-step3-rounding-rule"),description:this.t("metas-saving-goals-create-goal-multistep-step3-contribution-inactive")}]}get _step3PeriodicContributionSummary(){var t,e,i,a,s,o,n,r,l,d,c,u;return null!==(t=this._simulation)&&void 0!==t&&t.periodicContribution&&this._isActivePeriodicContribution?[{label:this.t("metas-saving-goals-create-goal-multistep-step3-periodic-contribution"),description:this.t("metas-saving-goals-create-goal-multistep-step3-periodic-contribution-quantity")},{label:"metas-saving-goals-create-goal-multistep-step3-periodic-contribution-quantity",amount:null===(e=this.scheduledTransfer)||void 0===e||null===(i=e.sentMoney)||void 0===i?void 0:i.amount,currencyCode:this.currency},{label:"metas-saving-goals-create-goal-multistep-step3-periodic-contribution-origin-account",mask:null===(a=this.scheduledTransfer)||void 0===a||null===(s=a.sender)||void 0===s||null===(o=s.contract)||void 0===o?void 0:o.number,visibleChars:this._maxAccountChars,maskChars:this._maskType},{label:"metas-saving-goals-create-goal-multistep-step3-periodic-contribution-frequency",description:this.t(`metas-saving-goals-multistep-algorithm-frequency-${null===(n=this.scheduledTransfer)||void 0===n||null===(r=n.frequency)||void 0===r?void 0:r.toLowerCase()}`)},{label:"metas-saving-goals-create-goal-multistep-step3-periodic-contribution-start-date",description:Ps.call(this,null===(l=this.scheduledTransfer)||void 0===l||null===(d=l.period)||void 0===d?void 0:d.startDate)},{label:"metas-saving-goals-create-goal-multistep-step3-periodic-contribution-end-date",description:Ps.call(this,null===(c=this.scheduledTransfer)||void 0===c||null===(u=c.period)||void 0===u?void 0:u.endDate)}]:[{label:this.t("metas-saving-goals-create-goal-multistep-step3-periodic-contribution"),description:this.t("metas-saving-goals-create-goal-multistep-step3-contribution-inactive")}]}get _listResultsStep4(){return[{label:"metas-saving-goals-create-goal-multistep-step4-principal-account",mask:this._accountPrincipalSelect,visibleChars:this._maxAccountChars,maskChars:this._maskType}]}_getAssociatedAccountStep2(){var t,e,i;"SELECT"===this.operationType&&(this._associatedAccount=null!==(t=this.savingGoalAccount)&&void 0!==t&&t.id?null===(e=this.savingGoalAccount)||void 0===e?void 0:e.id:(null===(i=this.listAccounts[0])||void 0===i?void 0:i.id)||"");"CREATE"===this.operationType&&(this._associatedAccount="")}get _goalIsEdited(){var t,e,i,a;return this.goal&&!ws(this.goal)&&(this._amountStep2!==(null===(t=this.goal)||void 0===t||null===(e=t.goalAmount)||void 0===e?void 0:e.amount)||this.endDate!==(null===(i=this.goal)||void 0===i||null===(a=i.goalPeriod)||void 0===a?void 0:a.expirationDate))}_createGoalStep2(){this._getAssociatedAccountStep2(),this.step2Completed&&!this._goalIsEdited||(this.step2Completed=!1,this._step3Completed=!1,this._emitStep2State(),this._emitGoalState({callServices:!0})),this._emitGoalState()}_emitGoalState({callServices:t}={callServices:!1}){const e=`metas-saving-multistep-step2-${t?"create":"update"}-goal-continue`;this.dispatchEvent(new CustomEvent(e,{detail:{goal:{description:this._descriptionStep2,goalAmount:{amount:this._amountStep2,currency:this.currency},goalPeriod:{expirationDate:this.endDate},savingContract:{id:this._associatedAccount},goalPurpose:{id:this._goalPurpose},status:{id:"SIMULATED"}}},bubbles:!0,composed:!0}))}_continueStep2(){this._callSimulation=!1,this._manageEditStep(3),this._createGoalStep2()}_finishStep2(){this._callSimulation=!0;const t={route:"create-goal-multistep",step:3,purpose:this._goalPurpose,goalAmount:this._amountStep2};this._dispatchTraceEvent(t)}_launchCalendar(){this.dispatchEvent(new CustomEvent("metas-saving-goals-launch-calendar",{bubbles:!0,composed:!0,detail:{dateFormat:"yyyy-MM-dd",defaultDate:(new Date).toISOString().split("T")[0]}}))}_onBlurEndDate(t){t.target.invalid=!this._checkValidEndDate()}_checkValidAmount(){return Number(this._amountStep2)>0}_checkValidEndDate(){var t;return new Date(null===(t=this.endDate)||void 0===t?void 0:t.replaceAll("-","/")).getTime()>(new Date).getTime()}get _amountErrorMessage(){let t="";return this._checkValidAmount()||(t=""!==this._amountStep2?this.t("metas-saving-goals-create-goal-multistep-form-amount-error"):this.t("metas-saving-goals-create-goal-multistep-form-required")),t}get _endDateErrorMessage(){let t="";return this._checkValidEndDate()||(t=""!==this.endDate?this.t("metas-saving-goals-create-goal-multistep-form-endDate-error"):this.t("metas-saving-goals-create-goal-multistep-form-required")),t}get _checkDisabled(){return!this._descriptionStep2||!this._checkValidAmount()||!this._checkValidEndDate()}_onBlurAmount(t){t.target.invalid=!this._checkValidAmount()}_onClickElement(t){const{name:e}=t.target;this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-element-on-click",{detail:e,bubbles:!0,composed:!0}))}get createStep1(){return d`
      <bbva-expandable-step
        edit-label="metas-saving-goals-create-goal-multistep-form-edit-step-label"
        ?completed=${!this._step1Edit&&this._step1Completed}
        hide-padding-left
        hide-padding-right
        class="animation"
        id="step-1"
        header="${this.t("metas-saving-goals-create-goal-multistep-step1-header")}"
        total-steps="${this._steps.length}"
        @expandable-step-edit-step="${()=>{this._manageEditStep(1)}}"
        button-text="${this.t("metas-saving-goals-continue")}"
        @expandable-step-button-click="${()=>{this._isPreSummaryStepCompleted?this._continueToSummary({currentStep:1}):this._continueStep1()}}"
      >
        ${(({title:t,text:e,text2:i,image:a,link:s})=>d`
    <bbva-panel-offer
      .contentTitle="${t}"
      .linkText="${s}"
      link-icon=""
      .microillustration="${a}"
    >
      <p>${e}</p>
      <p>${c(i)}</p>
    </bbva-panel-offer>
  `)({image:"medal",title:this.t("metas-saving-goals-create-goal-multistep-step1-title"),text:this.t("metas-saving-goals-create-goal-multistep-step1-text")})}
        ${this._formControlInput}
        <div class="summary" slot="summary">
          ${Wo(this._listResultsStep1)}
        </div>
      </bbva-expandable-step>
    `}get createStep2(){return d`
      <bbva-expandable-step
        edit-label="metas-saving-goals-create-goal-multistep-form-edit-step-label"
        hide-padding-left
        hide-padding-right
        ?completed=${!this._step2Edit&&this.step2Completed&&this.createGoalFormVisible}
        ?disabled=${!this._step1Completed&&this.createGoalFormVisible}
        class="animation"
        id="step-2"
        header="${this.t("metas-saving-goals-create-goal-multistep-step2-header")}"
        total-steps="${this._steps.length}"
        @expandable-step-edit-step="${()=>{this._manageEditStep(2),this._isUsingAdvice=!1}}"
      >
        ${this._step1Completed?d`
              <bbva-form-text
                name="name"
                label="${this.t("metas-saving-goals-create-goal-multistep-step2-form-text")}"
                ambient="light"
                .value="${this._descriptionStep2}"
                allowed-pattern="[a-zA-Z0-9 ]"
                error-message="${this.t("metas-saving-goals-create-goal-multistep-form-required")}"
                .maxlength=${this.maxLengthTitle}
                required
                @click="${this._onClickElement}"
                @input="${t=>{this._descriptionStep2=t.target.value}}"
              ></bbva-form-text>
              <bbva-form-amount
                name="amount"
                ambient="light"
                label="${this.t("metas-saving-goals-create-goal-multistep-step2-form-amount")}"
                .amount="${this._amountStep2}"
                error-message="${this._amountErrorMessage}"
                .maxlength=${this.maxLengthAmount}
                optional-label="${this.t("metas-saving-goals-create-goal-multistep-form-optional")}"
                currency-code="${this.currency}"
                local-currency="${this.currency}"
                required
                @click="${this._onClickElement}"
                @form-field-input-blur=${this._onBlurAmount}
                @form-amount-input-change="${t=>{this._amountStep2=0===t.target.amount?null:t.target.amount}}"
              ></bbva-form-amount>
              <bbva-form-date
                name="date"
                ambient="light"
                label="${this.t("metas-saving-goals-create-goal-multistep-step2-form-date")}"
                .value="${this.endDate}"
                optional-label="${this.t("metas-saving-goals-create-goal-multistep-form-optional")}"
                error-message="${this._endDateErrorMessage}"
                required
                @click="${t=>{this._launchCalendar(),this._onClickElement(t)}}"
                @form-field-input-blur="${this._onBlurEndDate}"
                @form-field-input-focus="${t=>{""!==t.target.value&&this._onBlurEndDate(t)}}"
                @input="${t=>{this.endDate=t.target.value}}"
              ></bbva-form-date>
              <!--checking for step2Edit to avoid lack of button rerender on unusual multistep flow from s3 to s2 via s1-->
              <bbva-button-default
                id="btnStep2"
                class="action"
                text="${this.t("metas-saving-goals-continue")}"
                ?disabled=${this._checkDisabled||!this._step2Edit}
                @click="${()=>{this._goalIsEdited?this._openConfirmationModal():this._continueStep2()}}"
              >
              </bbva-button-default>
            `:gt}

        <div class="summary" slot="summary">
          ${Wo(this._listResultsStep2)}
        </div>
      </bbva-expandable-step>
    `}get createStep3(){var t;return d`
      <bbva-expandable-step
        edit-label="metas-saving-goals-create-goal-multistep-form-edit-step-label"
        ?completed=${!this._step3Edit&&this._step3Completed}
        ?disabled=${!this.step2Completed}
        hide-padding-left
        hide-padding-right
        disabled-target=".action"
        class="animation"
        id="step-3"
        header="${this.t("metas-saving-goals-create-goal-multistep-step3-header")}"
        total-steps="${this._steps.length}"
        @expandable-step-edit-step="${()=>{this._manageEditStep(3)}}"
      >
        <metas-saving-goals-algorithm
          calculate-api-version="${this.calculateApiVersion}"
          language="${this.language}"
          currency="${this.currency}"
          is-using-advice="${c(this._isUsingAdvice||void 0)}"
          rounding-total="${this.roundingTotal}"
          session-name="${this.sessionName}"
          show-button-fixed="${c(this._showButtonFixed||void 0)}"
          simulate-savings-api-version="${this.simulateSavingsApiVersion}"
          transfers-management-api-version="${this.transfersManagementApiVersion}"
          .cardWithOutAccount="${this.cardWithOutAccount}"
          .goal=${this.goal}
          .headers="${this.headers}"
          .host="${this.host}"
          .listAccounts="${this.listAccounts}"
          .listCards=${this._leakedCardList}
          .requiredToken="${this.requiredToken}"
          .rule=${this.rule}
          .savingGoalAccount="${this.savingGoalAccount}"
          .scheduledTransfer="${this.scheduledTransfer}"
          ?callSimulation="${this._callSimulation}"
          ?native="${this.native}"
          @metas-saving-goals-algorithm-navigate-rule="${this._navigateRule}"
          @metas-saving-goals-algorithm-navigate-continue="${this._continueStep3}"
          @metas-saving-goals-algorithm-scheduled-transfer-open-periodic-modal="${this._openPeriodicModal}"
          @metas-saving-goals-algorithm-open-advice-modal="${this._openAdviceModal}"
          @metas-saving-goals-algorithm-periodic-contribution-change-status="${({detail:t})=>{this._isActivePeriodicContribution=t.isActive}}"
          @metas-saving-goals-algorithm-purchase-contribution-change-status="${({detail:t})=>{this._isActivePurchaseContribution=t.isActive}}"
          @metas-saving-goals-algorithm-update-simulation="${({detail:t})=>{this._simulation=t.simulation}}"
          @metas-saving-goals-algorithm-scheduled-transfer-create="${({detail:t})=>{this._createScheduledTransfer({detail:t})}}"
          @metas-saving-goals-algorithm-get-rule="${({detail:t})=>{this._getRoundingRule(t.ruleId)}}"
          @metas-saving-goals-algorithm-post-error="${()=>{this._emitPostError()}}"
          @metas-saving-goals-algorithm-event-click-toggle="${this._dispatchClickEvent}"
          @metas-saving-goals-algorithm-trace-route="${this._dispatchTraceEvent}"
        ></metas-saving-goals-algorithm>
        <div class="summary" slot="summary">
          ${null===(t=this._listResultsStep3)||void 0===t?void 0:t.map(((t,e,i)=>d`
                ${Wo(t)}
                ${null!=i&&i[e+1]?d`
                      <bbva-divider size="small"></bbva-divider>
                    `:gt}
              `))}
        </div>
      </bbva-expandable-step>
    `}get createStep4(){return d`
      <bbva-expandable-step
        edit-label="metas-saving-goals-create-goal-multistep-form-edit-step-label"
        id="step-4"
        class="animation"
        disabled-target=".action"
        header="${this.t("metas-saving-goals-create-goal-multistep-step4-header")}"
        hide-padding-left
        hide-padding-right
        ?completed=${!this._step4Edit&&this._step4Completed}
        ?disabled=${!this._step3Completed}
        ?hidden="${!this._step4IsNecessary}"
        total-steps="${this._steps.length}"
        @expandable-step-edit-step="${()=>{this._manageEditStep(4)}}"
      >
        <metas-saving-goals-contract-account
          .listAccountsActivated="${this.listAccounts}"
          .savingGoalAccount="${this.savingGoalAccount}"
          .documentsOperation="${this.documentsOperation}"
          @metas-saving-goals-contract-account-continue="${this._navigateContinueStep4}"
        >
        </metas-saving-goals-contract-account>

        <div class="summary" slot="summary">
          ${Wo(this._listResultsStep4)}
          <div ambient="dark" class="terms-conditions-wrapper">
            <bbva-badge-check></bbva-badge-check>
            <bbva-text
              tag="span"
              size="S"
              text="${this.t("metas-saving-goals-create-goal-multistep-step4-term-and-condition-accepted")}"
            ></bbva-text>
          </div>
        </div>
      </bbva-expandable-step>
    `}get _enableSubmit(){const t=!this._step4IsNecessary||this._step4Completed,e=this._step1Edit||this._step2Edit||this._step3Edit||this._step4Edit,i=Boolean(this._step1Completed&&this.step2Completed&&this._step3Completed&&t&&!e);var a,s,o,n,r,l;i&&this._dispatchTraceEvent({route:"summary",purpose:this._goalPurpose,goalAmount:this._amountStep2,periodicContributionAmount:null===(a=this.scheduledTransfer)||void 0===a||null===(s=a.sentMoney)||void 0===s?void 0:s.amount,periodicContributionFrequency:null===(o=this.scheduledTransfer)||void 0===o?void 0:o.frequency,ruleContributionAmount:null===(n=this._simulation)||void 0===n||null===(r=n.simulationRule)||void 0===r||null===(l=r.savingAmount)||void 0===l?void 0:l.amount});return i}_dispatchClickEvent({detail:t}){this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-form-event-click-toggle",{bubbles:!0,composed:!0,detail:t}))}_initialProperties(){this._hasNavigatedToOtherFeature=!1,this._step1Completed=!1,this.step2Completed=!1,this._step3Completed=!1,this._step4Completed=!1,this._step1Edit=!1,this._step2Edit=!1,this._step3Edit=!1,this._step4Edit=!1,this._goalPurpose="PURCHASE",this._descriptionStep2="",this._amountStep2=null,this.endDate="",this._simulation={ca:0,om:0,at:0,ap:0,simulationRule:null,periodicContribution:null,rule:null},this._isUsingAdvice=!1,this._isActivePurchaseContribution=!1,this._isActivePeriodicContribution=!1,this._emitStep2State();this._dispatchTraceEvent({route:"create-goal-multistep",step:1})}_dispatchTraceEvent(t){this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-form-trace-route",{bubbles:!0,composed:!0,detail:t}))}_resetMultistepComponent(){this._stepsToReset=[0,1,2,3],this._initialProperties()}_emitStep2State(){return this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-emit-properties",{detail:{step2Completed:this.step2Completed},bubbles:!0,composed:!0}))}_navigateRule(){var t,e,i,a,s;return this._hasNavigatedToOtherFeature=!0,this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-navigate-rule",{detail:{routeName:"update-formula",rule:this.rule,goalId:null===(t=this.goal)||void 0===t?void 0:t.id,isActive:this._isActivePurchaseContribution,goalAccountId:null===(e=this._simulation)||void 0===e||null===(i=e.simulationRule)||void 0===i||null===(a=i.receiver)||void 0===a||null===(s=a.contract)||void 0===s?void 0:s.id},bubbles:!0,composed:!0}))}_openPeriodicModal({detail:t}){return this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-open-periodic-modal",{detail:t,bubbles:!0,composed:!0}))}_editStep(t){const e=this._steps[t-1];this._manageEditStep(t),e.edit()}get _adviceModal(){return this.shadowRoot.querySelector("#advice-modal")}get _confirmationModal(){return this.shadowRoot.querySelector("#confirmation-modal")}_openAdviceModal({detail:t}){this._adviceModalConfig={...t,currency:this.currency,language:this.language},this._adviceModal.open()}get _adviceModalTpl(){return d`
      <metas-saving-goals-create-goal-multistep-form-advice-modal
        id="advice-modal"
        .modalConfig="${this._adviceModalConfig}"
        @metas-saving-goals-create-goal-multistep-form-advice-modal-offer-panel-1-link-click="${({detail:t})=>{this._amountStep2=t.advisedAmount,this._adviceModal.close(),this._editStep(2),this._isUsingAdvice=!0}}"
        @metas-saving-goals-create-goal-multistep-form-advice-modal-offer-panel-2-link-click="${({detail:t})=>{this.endDate=t.advisedDate,this._adviceModal.close(),this._editStep(2),this._isUsingAdvice=!0}}"
      ></metas-saving-goals-create-goal-multistep-form-advice-modal>
    `}_openConfirmationModal(){this._confirmationModal.open()}get _confirmationModalTpl(){return d`
      <bbva-help-modal
        id="confirmation-modal"
        modal-type="info"
        title-icon="${ht()}"
        body-text="${this.t("metas-saving-goals-create-goal-multistep-form-confirmation-modal-body")}"
        button-text="${this.t("metas-saving-goals-create-goal-multistep-form-confirmation-modal-button")}"
        link-text="${this.t("metas-saving-goals-create-goal-multistep-form-confirmation-modal-link")}"
        title-text="${this.t("metas-saving-goals-create-goal-multistep-form-confirmation-modal-title")}"
        hide-content-padding-top
        @help-modal-footer-button-click="${this._continueStep2}"
        @help-modal-footer-link-click="${()=>this._confirmationModal.close()}"
      >
      </bbva-help-modal>
    `}_continueStep3(){this._step3Completed=!0,this._manageEditStep(4);const t={route:"create-goal-multistep",step:this._step4IsNecessary?4:5};this._dispatchTraceEvent(t)}_navigateContinueStep4({detail:t}){this._step4Edit=!1,this._step4Completed=!0,this._accountPrincipalSelect=t.account;this._dispatchTraceEvent({route:"create-goal-multistep",step:5})}_createScheduledTransfer({detail:t}){return this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-scheduled-transfer-create",{detail:{...t},bubbles:!0,composed:!0}))}_createGoal(){var t,e,i;return this._sendSummaryData(),this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-create-goal",{detail:{accountNumber:this._accountPrincipalSelect||(null===(t=this.savingGoalAccount)||void 0===t?void 0:t.number),ruleId:this._isActivePurchaseContribution?null===(e=this._simulation.simulationRule)||void 0===e?void 0:e.ruleId:null,scheduledTransferId:this._isActivePeriodicContribution?null===(i=this.scheduledTransfer)||void 0===i?void 0:i.id:null},bubbles:!0,composed:!0}))}_sendSummaryData(){var t,e,i,a,s,o;return this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-summary-data",{detail:{purpose:this._goalPurpose,goalAmount:this._amountStep2,periodicContributionAmount:null===(t=this.scheduledTransfer)||void 0===t||null===(e=t.sentMoney)||void 0===e?void 0:e.amount,periodicContributionFrequency:null===(i=this.scheduledTransfer)||void 0===i?void 0:i.frequency,ruleContributionAmount:null===(a=this._simulation)||void 0===a||null===(s=a.simulationRule)||void 0===s||null===(o=s.savingAmount)||void 0===o?void 0:o.amount},bubbles:!0,composed:!0}))}_emitPostError(){return this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-post-error",{detail:{},bubbles:!0,composed:!0}))}_getRoundingRule(t){return this.dispatchEvent(new CustomEvent("metas-saving-goals-create-goal-multistep-get-rule",{detail:{ruleId:t},bubbles:!0,composed:!0}))}render(){return d`
      ${super.render()}
      <bbva-progress-multistep-bar
        ambient="light"
        accessibility-text="${this.t("metas-saving-goals-create-goal-multistep-progress-bar-accessibility-text",{progressValue:this._multistepProgressPercentage})}"
        value="${this._multistepProgressPercentage}"
      ></bbva-progress-multistep-bar>
      <bbva-expandable-multistep
        ambient="light"
        hide-disabled-steps
        hide-guillotine-animation
        has-animation
        ?hidden="${this._createGoalFormVisible||this._hasNavigatedToOtherFeature}"
        .stepsToReset="${this._stepsToReset}"
      >
        ${this.createStep1}${this.createStep2}${this.createStep3}${this._step4IsNecessary?this.createStep4:gt}
        ${this._enableSubmit?d`
              <div class="button-wrapper" ambient="light">
                <bbva-button-default
                  id="create-goal"
                  variant="positive"
                  @click="${this._createGoal}"
                  text="${this.t("metas-saving-goals-create-goal-multistep-create")}"
                >
                </bbva-button-default>
              </div>
            `:gt}
      </bbva-expandable-multistep>
      ${this._adviceModalTpl} ${this._confirmationModalTpl}
    `}}const{moment:Xo}=window,Yo="metas-saving-goals-multistep-algorithm-frequency",Jo=[{key:`${Yo}-biweekly`,value:"BIWEEKLY"},{key:`${Yo}-monthly`,value:"MONTHLY"}],Zo="MONTHLY",Qo="SIMULATED",tn="VALID",en=t=>t?Xo(t).format("DD/MM/YYYY"):"";class an extends(T(Pi(rt(p(a))))){static get is(){return"metas-saving-goals"}static get scopedElements(){const t=[Oi,ve,Me,Le,Vt,Lt,Re,we,Dt,v,dt,s,ji,ea,Ye,aa,Je,oa,ia,qa,Va,We,Ke,Pe,xs,As,io,lo,Is,go,uo,$o,po,fo,bo,Ao,Ko,To,Ho,...an.configurationScopedElements()];return an.scopedElementsFromClasses(t)}static get properties(){return{country:{type:String},encryptedZero:{type:String,attribute:"encrypted-zero"},sessionName:{type:String,attribute:"session-name"},savingGoalsApiVersion:{type:Number,attribute:"saving-goals-api-version"},simulateSavingsApiVersion:{type:Number,attribute:"simulate-savings-api-version"},accountApiVersion:{type:Number,attribute:"account-api-version"},accountsApiVersion:{type:Number,attribute:"accounts-api-version"},cardsApiVersion:{type:Number,attribute:"cards-api-version"},selfDrivenApiVersion:{type:Number,attribute:"self-driven-api-version"},calculateApiVersion:{type:Number,attribute:"calculator-api-version"},transfersManagementApiVersion:{type:Number,attribute:"transfers-management-api-version"},history:{type:Array},accessPoint:{type:String,attribute:"access-point"},dashboardContractId:{type:String,attribute:"dashboard-contract-id"},savingGoalsAlias:{type:String,attribute:"saving-goals-alias"},maxLengthAmount:{type:Number,attribute:"max-length-amount"},maxLengthTitle:{type:Number,attribute:"max-length-title"},documentsOperation:{type:Array,attribute:"documents-operation"},navigateSelfDrivenRoundUp:{type:Boolean,attribute:"navigate-self-driven-round-up"},originType:{type:String,attribute:"origin-type"},createAccount:{type:Object,attribute:"create-account"},savingGoalsTransfer:{type:Boolean,attribute:"saving-goals-transfer"},requiredOtp:{type:Boolean,attribute:"required-otp"},deletedRuleId:{type:Boolean,attribute:"delete-rule-id"},userInfo:{type:Object,attribute:"user-info"},_endDate:{type:String},_goalId:{type:String},_goal:{type:Object},_goalToCreate:{type:Object},_rule:{type:Object},_ruleIdToUpdate:{type:String},_scheduledTransferIdToUpdate:{type:String},_savingGoalAccount:{type:Object},_dashboardAccount:{type:Object},_listContributions:{type:Array},_listGoals:{type:Array},_listAccounts:{type:Array},_listCards:{type:Array},_rulesByGoal:{type:Array},_listRules:{type:Array},_scheduledTransfer:{type:Object},_scheduledTransferByGoal:{type:Object},_listAccountsActivated:{type:Array},_historicRoutes:{type:Array},_defaultInitialRoute:{type:String},_listGoalsVisible:{type:Boolean},_listGoalsDashboardVisible:{type:Boolean},_editGoalVisible:{type:Boolean},_contributeGoalVisible:{type:Boolean},_detailGoalVisible:{type:Boolean},_transferBetweenGoalsVisible:{type:Boolean},_refundGoalVisible:{type:Boolean},_deleteGoalVisible:{type:Boolean},_withdrawSavingsVisible:{type:Boolean},_contributionFormulasVisible:{type:Boolean},_successfulCreateGoalVisible:{type:Boolean},_createGoalFormVisible:{type:Boolean},_exitConfirmationModalVisible:{type:Boolean},_updateErrorModalVisible:{type:Boolean},_updateRuleValidErrorVisible:{type:Boolean},_updateGoalValidErrorVisible:{type:Boolean},_postErrorModalVisible:{type:Boolean},_redirectPeriodicModalVisible:{type:Boolean},_allLoading:{type:Array},_allError:{type:Array},_successOperativeInfo:{type:Boolean},_deleteGoalToastShow:{type:Boolean},_limitGoals:{type:Number},_operationType:{type:String},_isGoalCreated:{type:Boolean},_isNecessaryDeletePeriodicTransfer:{type:Boolean},_openModalListFormulas:{type:Boolean},_openNoAccountsModal:{type:Boolean},_genericErrorModalVisible:{type:Boolean},_getErrorModalVisible:{type:Boolean},_deleteErrorModalVisible:{type:Boolean},_periodicModalVisible:{type:Boolean},_openMoreInfoScheduledModal:{type:Boolean},_algorithmVisible:{type:Boolean},_isAccountCreated:{type:Boolean},_operationNumber:{type:String},_simulateId:{type:String},_step2Completed:{type:Boolean},_panelOfferTextPeriodic:{type:String},_periodicAmountSimulation:{type:Number},_amountPeriodic:{type:Number},_originAccountPeriodic:{type:Object},_frequencyPeriodic:{type:String},_startDatePeriodic:{type:String},_endDatePeriodic:{type:String},_periodicButtonText:{type:String},_processName:{type:String},_openConfirmationScheduledModal:{type:Boolean},_changePagePending:{type:Object},_isGetContributionError:{type:Boolean},_isEditSchedule:{type:Boolean},_parametry:{type:Object},_retryContribution:{type:Boolean},_isSimulateError:{type:Boolean},_retrySimulate:{type:Boolean},_creationWithActiveRule:{type:Boolean},_openWelcomeModal:{type:Boolean},_creationWithActiveScheduledTransfer:{type:Boolean},_deletingGoalWithScheduledTransfer:{type:Boolean},_summaryDetail:{type:Object},_withdrawal:{type:Object},_isActivePurchaseContribution:{type:Boolean},_isActivePeriodicContribution:{type:Boolean},_cardWithOutAccount:{type:Object},_switchPeriodicContribution:{type:Boolean},_creationProcess:{type:Boolean},_updateOnlyGoalName:{type:Boolean},_accountsSetted:{type:Boolean},_editGoalToastShow:{type:Boolean},_firstScheduledTransfer:{type:Boolean},_noContributions:{type:Boolean}}}constructor(){super(),this.config={loader:!0,notify:!1},this.accessPoint="",this.accountApiVersion=0,this.accountsApiVersion=0,this.calculateApiVersion=0,this.cardsApiVersion=1,this.createAccount={accountType:"23",title:"0004",joint:"SINGLE",accountLevel:"N4B"},this.dashboardContractId="",this.deletedRuleId=!1,this.documentsOperation=[],this.encryptedZero="vlGZIK3jYwk",this.history=[],this.language="es-ES",this.maxLengthAmount=7,this.maxLengthTitle=20,this.navigateSelfDrivenRoundUp=!1,this.originType="PFM",this.requiredOtp=!1,this.savingGoalsAlias="",this.savingGoalsApiVersion=0,this.savingGoalsTransfer=!1,this.selfDrivenApiVersion=2,this.sessionName="",this.simulateSavingsApiVersion=1,this.transfersManagementApiVersion=0,this.userInfo={},this._algorithmVisible=!1,this._allError=[],this._allLoading=[],this._amountPeriodic=null,this._country="",this._periodicButtonText="",this._changePagePending=null,this._completedGoal=!1,this._contributeGoalVisible=!1,this._contributionFormulasVisible=!1,this._createGoalFormVisible=!1,this._creationWithActiveRule=!1,this._creationWithActiveScheduledTransfer=!1,this._dashboardAccount={},this._deleteErrorModalVisible=!1,this._deleteGoalToastShow=!1,this._deleteGoalVisible=!1,this._deletingGoalWithScheduledTransfer=!1,this._detailGoalVisible=!1,this._editGoalVisible=!1,this._editGoalToastShow=!1,this._endDate="",this._endDatePeriodic="",this._exitConfirmationModalVisible=!1,this._frequencyPeriodic="MONTHLY",this._genericErrorModalVisible=!1,this._getErrorModalVisible=!1,this._goal={},this._goalId="",this._goalToCreate={},this._goalToUpdate={},this._isAccountCreated=!1,this._isActivePeriodicContribution=!1,this._isActivePurchaseContribution=!1,this._isEditSchedule=!1,this._isGetContributionError=!1,this._isGoalCreated=!1,this._isNecessaryDeletePeriodicTransfer=!1,this._isSimulateError=!1,this._limitGoals=4,this._listAccounts=[],this._listAccountsActivated=[],this._listCards=[],this._listContributions=[],this._listGoals=[],this._listGoalsVisible=!1,this._listGoalsDashboardVisible=!1,this._listRules=[],this._openConfirmationScheduledModal=!1,this._openModalListFormulas=!1,this._openMoreInfoScheduledModal=!1,this._openNoAccountsModal=!1,this._openWelcomeModal=!1,this._operationNumber="",this._operationType="",this._originAccountPeriodic=null,this._panelOfferTextPeriodic="",this._periodicAmountSimulation=null,this._periodicModalVisible=!1,this._postErrorModalVisible=!1,this._processName="head-meta",this._redirectAutomaticSave=!1,this._redirectMultiStep=!1,this._redirectPeriodicModalVisible=!1,this._refundGoalVisible=!1,this._retryContribution=!1,this._retrySimulate=!1,this._roundingTotal=0,this._rule={},this._ruleIdToUpdate="",this._rulesByGoal=[],this._savingGoalAccount={},this._scheduledTransfer={},this._scheduledTransferByGoal={},this._scheduledTransferIdToUpdate="",this._simulateId="",this._startDatePeriodic="",this._step2Completed=!1,this._successfulCreateGoalVisible=!1,this._successOperativeInfo=!1,this._summaryDetail={},this._transferBetweenGoalsVisible=!1,this._updateErrorModalVisible=!1,this._updateGoalValidErrorVisible=!1,this._updateRuleValidErrorVisible=!1,this._withdrawal={amount:0,currency:""},this._withdrawSavingsVisible=!1,this._cardWithOutAccount={},this._switchPeriodicContribution=!1,this._creationProcess=!1,this._accountsSetted=!1,this._updateOnlyGoalName=!1,this._firstScheduledTransfer=!1,this._noContributions=!1}firstUpdated(){super.firstUpdated(),this._listGoalsVisible=!this._isAccessPointDashboard,this._listGoalsDashboardVisible=this._isAccessPointDashboard,this._defaultInitialRoute=this._isAccessPointDashboard?"listGoalsDashboard":"listGoals",this._historicRoutes=[this._defaultInitialRoute],this._cardsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-cards-api-dm"]'),this._savingGoalsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-saving-goals-api-dm"]'),this._savingGoalDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-saving-goal-api-dm"]'),this._savingGoalRulesDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-saving-goal-rules-api-dm"]'),this._savingGoalRuleDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-saving-goal-rule-api-dm"]'),this._accountDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-account-api-dm"]'),this._accountsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-accounts-api-dm"]'),this._selfDrivenDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-rules-api-dm"]'),this._selfDrivenRuleDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-rule-api-dm"]'),this._contributionsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-saving-goal-contributions-api-dm"]'),this._savingGoalsParametryDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-parametry-api-dm"]'),this._scheduledTransferDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-scheduled-transfer-api-dm"]'),this._scheduledTransfersDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-scheduled-transfers-api-dm"]'),this._callRequiredApis()}updated(t){var e;(super.updated(t),this._getDetailInfo(t),t.has("accessPoint")&&(this._isAccessPointDashboard&&this.dashboardContractId&&this._getAccount(this.dashboardContractId),this._listGoalsVisible=!this._isAccessPointDashboard,this._listGoalsDashboardVisible=this._isAccessPointDashboard,this.history=[],this._defaultInitialRoute=this._isAccessPointDashboard?"listGoalsDashboard":"listGoals",this._historicRoutes=[this._defaultInitialRoute]),t.has("navigateSelfDrivenRoundUp")&&!this.navigateSelfDrivenRoundUp&&(this._openModalListFormulas=!1),t.has("_allLoading")&&0===this._allLoading.length)&&(this.dispatchEvent(new CustomEvent("metas-saving-goals-ready",{detail:!1,bubbles:!0,composed:!0})),null!==(e=this._savingGoalAccount)&&void 0!==e&&e.id||!this._listGoalsVisible||this._listGoals.length||(this._openWelcomeModal=!0,this._dispatchTraceEvent({detail:{route:"welcomeModal"}})));t.has("_allLoading")&&1===this._allLoading.length&&"changePage"===this._allLoading[0].type&&this._changePagePending&&0===this._allError.length&&(this._changePage(this._changePagePending),this._changePagePending=null),!this.sessionName&&t.has("userInfo")&&this.userInfo&&!ws(this.userInfo)&&this.getSessionName(this.userInfo),(this._goalId&&t.has("_listGoalsDashboardVisible")&&this._listGoalsDashboardVisible||t.has("_listGoalsVisible")&&this._listGoalsVisible)&&(this._goalId="",this._scheduledTransfer={},this._rule={}),t.has("_successfulCreateGoalVisible")&&!this._successfulCreateGoalVisible&&this._rule&&!ws(this._rule)&&(this._rule={})}getSessionName(t){this.sessionName=(null==t?void 0:t.fullName)||""}_callRequiredApis(){this._getParametry(),this._getSavingGoals(),this._getSavingGoalAccountFirst(),this._getAccounts(),this._getAllRules()}get _isAccessPointDashboard(){return"DASHBOARD"===this.accessPoint}_getDetailInfo(t){var e;if(t.has("_goalId")&&this._goalId&&""!==this._goalId&&ws(this._goalToCreate)&&(this._getSavingGoal(),this._getContributions(),this._getRulesByGoal()),t.has("_goal")&&this._goal&&!ws(this._goal)){"algorithm"===this._historicRoutes[this._historicRoutes.length-1]||"createGoalForm"===this._historicRoutes[this._historicRoutes.length-1]||"VALID"!==this._goal.status.id||this._firstScheduledTransfer?this._firstScheduledTransfer=!1:this._getScheduledTransfer()}t.has("history")&&null!==(e=this.history)&&void 0!==e&&e.length&&this._restoreHistory()}_getScheduledTransfer(){var t,e,i,a,s,o,n;this._goalId&&null!==(t=this._goal)&&void 0!==t&&t.periodicContribution&&(null===(e=this._goal)||void 0===e||null===(i=e.periodicContribution)||void 0===i||null===(a=i.scheduledTransfer)||void 0===a?void 0:a.id)!==this.encryptedZero?(this._addLoading("getScheduledTransfer",(()=>{this._getScheduledTransfer()})),this._scheduledTransferDm.getScheduledTransfer(null===(s=this._goal)||void 0===s||null===(o=s.periodicContribution)||void 0===o||null===(n=o.scheduledTransfer)||void 0===n?void 0:n.id)):(this._scheduledTransfer={},this._scheduledTransferByGoal={})}_addLoading(t,e){this._allLoading=[...this._allLoading,{type:t,callBack:e}]}_clearLoader(t){if("deleteSavingGoalRule"!==t)this._allLoading=this._allLoading.filter((e=>e.type!==t));else{const e=this._allLoading.filter((e=>e.type===t)),i=this._allLoading.filter((e=>e.type!==t));e.shift(),this._allLoading=[...i,...e]}0===this._allLoading.length&&this.clearLoader()}_closeLoader(){this._allLoading=[],this.clearLoader()}static get styles(){return[Ds,De.light,Mi.light,fe.light,Oe.light,Ne.light,qt.light,Bi.light,Ge.light,y.light,l("metas-saving-goals-shared-styles")]}get _exitConfirmModal(){return d`
      <bbva-help-modal
        data-id="exitConfirmModal"
        id="exitConfirmModal"
        title-icon="${ht()}"
        body-text="${this.t("metas-saving-goals-exit-info")}"
        button-text="${this.t("metas-saving-goals-exit")}"
        link-text="${this.t("metas-saving-goals-edit-return")}"
        modal-type="info"
        ?visible=${this._exitConfirmationModalVisible}
        @help-modal-footer-button-click="${this._leaveProccessConfirmationModal}"
        @help-modal-close="${this._closeExitConfirmationModal}"
      ></bbva-help-modal>
    `}_moreInfoModal(){return d`
      <bbva-help-modal
        full-height
        id="more-info-modal"
        header-type="modal"
        ?visible="${this._openMoreInfoScheduledModal}"
        hide-content-padding-top
        header-text="${this.t("metas-saving-goals-more-info-header-title")}"
        icon-right-primary=${ct()}
        @help-modal-close="${()=>{this._openMoreInfoScheduledModal=!1}}"
      >
        <div slot="slot-content" ambient="light">
          <bbva-panel-info
            disabled-tabindex
            heading-level="2"
            alignment="center"
            heading="${this.t("metas-saving-goals-more-info-contribution-header-title")}"
            .microillustration=${Ie}
          >
            <bbva-text
              unset
              size="S"
              tag="span"
              alignment="center"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-text-1")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              alignment="center"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-text-2")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              alignment="center"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-text-3")}"
            >
            </bbva-text>
          </bbva-panel-info>
          <bbva-expandable-accordion
            clip-box
            row-title="${this.t("metas-saving-goals-detail-modal-info-contribution-rule")}"
          >
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-rule-description-1")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-rule-description-2")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-rule-description-3")}"
            >
            </bbva-text>
            <bbva-list-bullet>
              ${this.t("metas-saving-goals-detail-modal-info-contribution-rule-description-3-1")}
            </bbva-list-bullet>

            <bbva-list-bullet>
              ${this.t("metas-saving-goals-detail-modal-info-contribution-rule-description-3-2")}
            </bbva-list-bullet>
          </bbva-expandable-accordion>
          <bbva-expandable-accordion
            clip-box
            row-title="${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled")}"
          >
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled-description-1")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled-description-1-1")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled-description-2")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled-description-3")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled-description-4")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled-description-5")}"
            >
            </bbva-text>
            <bbva-text
              unset
              size="S"
              tag="span"
              text="${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled-description-6")}"
            >
            </bbva-text>
            <bbva-list-bullet>
              ${this.t("metas-saving-goals-detail-modal-info-contribution-scheduled-description-6-1")}
            </bbva-list-bullet>
          </bbva-expandable-accordion>
        </div>
      </bbva-help-modal>
    `}_openScheduledModal(){this._openConfirmationScheduledModal=!0,this._dispatchTraceEvent({detail:{route:"successfullPeriodicContributions",isEdition:this._isEditSchedule}})}_listSimpleActivateScheduledContribution(){var t,e,i,a,s,o,n,r,l,d,c,u,h;const g=Cs(null===(t=this._scheduledTransferBody)||void 0===t||null===(e=t.sentMoney)||void 0===e?void 0:e.amount,null===(i=this._scheduledTransferBody)||void 0===i||null===(a=i.sentMoney)||void 0===a?void 0:a.currency,this.language),m=Jo.find((t=>{var e,i;return t.value===((null===(e=this._scheduledTransferBody)||void 0===e?void 0:e.frequency)||(null===(i=this._scheduledTransfer)||void 0===i?void 0:i.frequency))})),p=this._scheduledTransferBody?null===(s=this._scheduledTransferBody.sender)||void 0===s||null===(o=s.contract)||void 0===o?void 0:o.number:null===(n=this._scheduledTransfer.sender)||void 0===n||null===(r=n.contract)||void 0===r?void 0:r.number;return[{label:this.t("metas-saving-goals-name-goal"),description:(null===(l=this._goal)||void 0===l?void 0:l.description)||"",descriptionMedium:!0},{label:this.t("metas-saving-goals-scheduled-contribution-amount"),description:g,descriptionMedium:!0},{label:this.t("metas-saving-goals-contribute-origin-account"),description:U(p,"•",!0,4)||"",descriptionMedium:!0},{label:this.t("metas-saving-goals-multistep-algorithm-periodic-modal-frequency"),description:m.key||"",descriptionMedium:!0},{label:this.t("metas-saving-goals-contribution-scheduled-start-date"),description:en(null===(d=this._scheduledTransferBody)||void 0===d||null===(c=d.period)||void 0===c?void 0:c.startDate)||"",descriptionMedium:!0},{label:this.t("metas-saving-goals-contribution-scheduled-end-date"),description:en(null===(u=this._scheduledTransferBody)||void 0===u||null===(h=u.period)||void 0===h?void 0:h.endDate)||"",descriptionMedium:!0}]}_confirmationScheduledModal(){var t,e,i,a,s,o,n,r,l,c;const u=this._openConfirmationScheduledModal?this._listSimpleActivateScheduledContribution():[],h={panelOfferText:this.t("metas-saving-goals-multistep-algorithm-panel-offer-periodic"),periodicAmount:null===(t=this._scheduledTransfer)||void 0===t||null===(e=t.sentMoney)||void 0===e?void 0:e.amount,originAccount:null===(i=this._scheduledTransfer)||void 0===i||null===(a=i.sender)||void 0===a||null===(s=a.contract)||void 0===s?void 0:s.contractId,frequency:null===(o=this._scheduledTransfer)||void 0===o?void 0:o.frequency,startDate:null===(n=this._scheduledTransfer)||void 0===n||null===(r=n.period)||void 0===r?void 0:r.startDate,endDate:null===(l=this._scheduledTransfer)||void 0===l||null===(c=l.period)||void 0===c?void 0:c.endDate,typeModalPeriodic:"EDIT"};return d`
      <bbva-help-modal
        full-height
        id="modalId"
        modal-type="info"
        header-type="${this._isEditSchedule?"modal-three-level":"modal"}"
        ?visible="${this._openConfirmationScheduledModal}"
        hide-content-padding-top
        header-text="${this._isEditSchedule?this.t("metas-saving-goals-scheduled-transfer-edit-contributions-link"):this.t("metas-saving-goals-succesful-scheduled-contribution-title")}"
        icon-right-primary=${ct()}
        button-text="${this.t("metas-saving-goals-create-contribution-form-confirmation-modal-button")}"
        link-text="${this.t("metas-saving-goals-create-contribution-form-confirmation-modal-link")}"
        @help-modal-close="${()=>{this._openConfirmationScheduledModal=!1,this._isEditSchedule=!1,this._openModalListFormulas=!1}}"
        @help-modal-footer-button-click="${()=>{this._openConfirmationScheduledModal=!1,this._isEditSchedule=!1,this._openModalListFormulas=!1}}"
        @help-modal-footer-link-click="${()=>{this._openPeriodicModal({detail:h})}}"
      >
        <div slot="slot-content">
          <bbva-panel-info
            disabled-tabindex
            heading-level-title="h2"
            heading="${this._isEditSchedule?this.t("metas-saving-goals-succesful-scheduled-contribution-edit-text"):this.t("metas-saving-goals-succesful-scheduled-contribution-text")}"
            .microillustration=${pe}
          >
          </bbva-panel-info>
          <div role="list">
            ${u.map((t=>d`
                  <div role="listitem">
                    <bbva-list-simple
                      disabled-tabindex
                      ?description-medium="${t.descriptionMedium}"
                      label="${t.label}"
                      description="${t.description}"
                    >
                    </bbva-list-simple>
                  </div>
                `))}
          </div>
        </div>
      </bbva-help-modal>
    `}_deleteToastTemplate(){return d`
      <bbva-notification-toast
        type="success"
        ?show="${this._deleteGoalToastShow}"
        auto-hide
        fixed-bottom
        icon-explainer="${r()}"
        @notification-toast-close="${()=>{this._deleteGoalToastShow=!1}}"
      >
        <p>${this.t("metas-saving-goals-delete-goal-success-toast")}</p>
      </bbva-notification-toast>
    `}_deleteRuleToastTemplate(){return d`
      <bbva-notification-toast
        type="success"
        ?show="${this.deletedRuleId}"
        auto-hide
        fixed-bottom
        icon-explainer="${r()}"
        @notification-toast-close="${()=>{this.deletedRuleId=!1}}"
      >
        <p>
          ${this.t("metas-saving-goals-delete-rule-toast")}
        </p>
      </bbva-notification-toast>
    `}_editGoalToastTemplate(){return d`
      <bbva-notification-toast
        type="success"
        ?show="${this._editGoalToastShow}"
        auto-hide
        fixed-bottom
        icon-explainer="${r()}"
        @notification-toast-close="${()=>{this._editGoalToastShow=!1}}"
      >
        <p>
          ${this.t("metas-saving-goals-edit-toast")}
        </p>
      </bbva-notification-toast>
    `}_restoreHistory(){var t;const e=this.history[this.history.length-1]||{},i=(null===(t=this.history)||void 0===t?void 0:t.map((t=>null==t?void 0:t.routeName)))||[];this._historicRoutes=[this._defaultInitialRoute,...i],e.roundingTotal&&(this._roundingTotal=e.roundingTotal),"contributionFormulas"!==e.routeName&&"algorithm"!==e.routeName||("contributionFormulas"===e.routeName&&this._rulesByGoal&&this._getScheduledTransfer(),this._getCards(),this._getAllRules(),this._getRulesByGoal(),this._goalId=""),"createGoalForm"===e.routeName&&this._rule&&!ws(this._rule)&&this._getRule({detail:{ruleId:this._rule.id}}),this._goalId!==e.goalId&&(this._goalId=e.goalId,this._goal={},this._listContributions=[],this._rulesByGoal=[],this._isActivePurchaseContribution=!1,this._isActivePeriodicContribution=!1),"successfulCreateGoal"===e.routeName&&(this._operationNumber=e.operationNumber,this._isGoalCreated=e.isGoalCreated,this._isAccountCreated=e._isAccountCreated),this._listGoalsVisible=!1,this[`_${e.routeName}Visible`]=!0,this.history=[]}async _closeExitConfirmationModal(){this._exitConfirmationModalVisible=!1}_leaveProccessConfirmationModal(){this._goalToCreate={},this._goal={},this._rule={},this._scheduledTransfer={},this._creationWithActiveRule=!1,this._creationWithActiveScheduledTransfer=!1,this._savingGoalDm.resetSavingGoal(),this._getSavingGoal(),this._popLatestRoute()}_openExitConfirmationModal(){this._exitConfirmationModalVisible=!0}_setPropertiesMultiStep({detail:t}){this._step2Completed=t.step2Completed}_handleNavigate(t){var e,i,a,s,o,n,r,l,d;this._addLoading("handleNavigate"),this._processName=(null===(e=t.detail)||void 0===e||null===(i=e.routeName)||void 0===i?void 0:i.toLowerCase())||"meta";const c=this._historicRoutes[this._historicRoutes.length-1],u=null===(a=t.detail)||void 0===a?void 0:a.replace;var h;("contributionFormulas"===(null===(s=t.detail)||void 0===s?void 0:s.routeName)&&this._rulesByGoal&&this._getCards(),"algorithm"===(null===(o=t.detail)||void 0===o?void 0:o.routeName)&&(this._simulateId="",this._getCards()),"createGoalForm"===(null===(n=t.detail)||void 0===n?void 0:n.routeName)&&(this._getCards(),this._isAccountCreated&&this._getSavingGoalAccountFirst()),"detailGoal"===(null===(r=t.detail)||void 0===r?void 0:r.routeName)&&this._getSavingGoal(),"successfulCreateGoal"===(null===(l=t.detail)||void 0===l?void 0:l.routeName)&&this._getSavingGoals(),this[`_${c}Visible`]=!1,u&&this._historicRoutes.pop(),this._historicRoutes.push(t.detail.routeName),this[`_${t.detail.routeName}Visible`]=!0,this._goalId!==(null===(d=t.detail)||void 0===d?void 0:d.goalId))&&(this._goalId=null===(h=t.detail)||void 0===h?void 0:h.goalId,this._goal={},this._isActivePurchaseContribution=!1,this._isActivePeriodicContribution=!1,this._listContributions=[],this._rulesByGoal=[]);this.navigateForward(u,!1),this._clearLoader("handleNavigate")}_deleteRule({detail:t}){this._addLoading("deleteRule"),this._selfDrivenRuleDm.deleteRule(t.ruleId),this._addLoading("deleteSavingGoalRule"),this._savingGoalRuleDm.deleteSavingGoalRule(this._goalId,t.ruleId)}_changePage({ev:t,latestRoute:e,replace:i}){this[`_${e}Visible`]=!1,i&&this._historicRoutes.pop(),this._historicRoutes.push(t.detail.routeName),this[`_${t.detail.routeName}Visible`]=!0}_handleDeleteSavingGoalRule(){1===this._allLoading.filter((t=>"deleteSavingGoalRule"===t.type)).length&&(this._redirectAutomaticSave&&"algorithm"!==this._historicRoutes[this._historicRoutes.length-1]?this._handleNavigate({detail:{routeName:"algorithm",replace:!0,goalId:this._goalId}}):this._completedGoal&&(this._completedGoal=!1,this._popLatestRoute()),this._clearLoader("deleteSavingGoalRule"))}_handleHeaderSecondaryIcon(){this.dispatchEvent(new CustomEvent("metas-saving-goals-header-secondary-icon",{bubbles:!0,composed:!0,detail:!0}))}_popLatestRoute(){if(this._historicRoutes[this._historicRoutes.length-1]===this._defaultInitialRoute||!this._historicRoutes.length)return this.accessPoint="",void this.dispatchEvent(new CustomEvent("metas-saving-goals-close-goals",{bubbles:!0,composed:!0,detail:!0}));this._redirectAutomaticSave=!1;const t=this._historicRoutes.pop(),e=this._historicRoutes[this._historicRoutes.length-1];this[`_${t}Visible`]=!1,this[`_${e}Visible`]=!0,this.navigateBack()}navigateForward(t,e){const i=new CustomEvent("navigate-go-forward",{detail:{id:this._historicRoutes[this._historicRoutes.length-1],params:{goalId:this._goalId},replace:t,external:e},bubbles:!0,composed:!0});this.dispatchEvent(i)}navigateBack(){const t=new CustomEvent("navigate-go-back",{detail:!0,bubbles:!0,composed:!0});this.dispatchEvent(t)}_backAfterDelete(){const t=this._historicRoutes.pop();this._historicRoutes=[this._defaultInitialRoute],this[`_${t}Visible`]=!1,this[`_${this._defaultInitialRoute}Visible`]=!0,this.navigateBack(),this.navigateBack(),this._deleteGoalVisible=!1,this._deleteGoalToastShow=!0}handleTapBack(t){var e,i;if(!("selfDrivenRoundUp"===(null==t||null===(e=t.value)||void 0===e||null===(i=e.cancelledNavigation)||void 0===i?void 0:i.currentPage))){const t=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"][visible]');t&&t.close(),this._openModalListFormulas&&(this._openModalListFormulas=!1),this._popLatestRoute()}}_getSavingGoals(){this._addLoading("getSavingGoals",(()=>{this._getSavingGoals()})),this._savingGoalsDm.getSavingGoals()}_getSavingGoal(){this._goalId&&(this._addLoading("getSavingGoal",(()=>{this._getSavingGoal()})),this._savingGoalDm.getSavingGoal(this._goalId))}_getAccount(t){this._addLoading("getAccount",(()=>{this._getAccount(t)})),this._accountDm.getAccount(t)}_getContributions(){this._goalId&&(this._addLoading("getSavingGoalContributions",(()=>{this._getContributions()})),this._contributionsDm.getSavingGoalContributions(this._goalId))}_getAccounts(){this._addLoading("getAccounts",(()=>{this._getAccounts()})),this._accountsDm.getAccounts()}_deleteGoal(){this._deletingGoalWithScheduledTransfer=!1;const{id:t,status:e}=this._scheduledTransfer||{};t&&t!==this.encryptedZero&&e&&"VALID"===e?(this._deletingGoalWithScheduledTransfer=!0,this._deleteScheduledTransfer()):(this._addLoading("deleteSavingGoal",(()=>{this._deleteGoal()})),this._savingGoalDm.deleteSavingGoal(this._goalId))}_handleFetchSavingGoals(t){var e;this._clearLoader("getSavingGoals"),this._listGoals=(null==t||null===(e=t.detail)||void 0===e?void 0:e.map((t=>t.currentAmount?t:{...t,currentAmount:{amount:0,currency:"MXN"}})))||[]}_handleFetchAccount(t){var e,i;this._isAccessPointDashboard&&(null==t?void 0:t.detail.id)===this.dashboardContractId?this._dashboardAccount=null==t?void 0:t.detail:this._savingGoalAccount=null==t?void 0:t.detail,"SIMULATED"===(null===(e=this._goalToCreate)||void 0===e||null===(i=e.status)||void 0===i?void 0:i.id)&&(this._step2Completed=!0),this._clearLoader("getAccount")}_saveGoal(t){var e,i,a,s,o,n,r,l,d,c,u,h;const g=t.detail;this._redirectAutomaticSave=(null==g?void 0:g.openAutomaticSave)||(null==g?void 0:g.openMultiStep),this._completedGoal=(null==g?void 0:g.completedGoal)||!1,this._updateOnlyGoalName=!(null!=g&&g.openAutomaticSave),this._isNecessaryDeletePeriodicTransfer=((null===(e=this._goal.goalPeriod)||void 0===e?void 0:e.expirationDate)!==(null===(i=g.goalPeriod)||void 0===i?void 0:i.expirationDate)||(null===(a=this._goal.goalAmount)||void 0===a?void 0:a.amount)!==(null===(s=g.goalAmount)||void 0===s?void 0:s.amount))&&(null===(o=this._goal)||void 0===o||null===(n=o.periodicContribution)||void 0===n||null===(r=n.scheduledTransfer)||void 0===r?void 0:r.id)&&(null===(l=this._goal)||void 0===l||null===(d=l.periodicContribution)||void 0===d||null===(c=d.scheduledTransfer)||void 0===c?void 0:c.id)!==this.encryptedZero,this._patchSavingGoal(this._goalId,{description:null==g?void 0:g.description,goalAmount:{amount:Number(null==g||null===(u=g.goalAmount)||void 0===u?void 0:u.amount),currency:null==g||null===(h=g.goalAmount)||void 0===h?void 0:h.currency},goalPeriod:null==g?void 0:g.goalPeriod})}_patchSavingGoal(t,e){this._addLoading("patchSavingGoal",(()=>{this._patchSavingGoal(t,e)})),this._savingGoalDm.patchSavingGoal(t,e)}_getRule({detail:t}){this._addLoading("getRule",(()=>{this._getRule({detail:t})})),this._selfDrivenRuleDm.getRule(t.ruleId)}_handleUpdateGoal(){var t,e,i,a;if(this._isNecessaryDeletePeriodicTransfer)return void this._deleteScheduledTransfer();if("VALID"===(null===(t=this._goalToCreate)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)&&this._ruleIdToUpdate){const{allowsNotifications:t,senders:e,receivers:i,roundRule:a,multiplierRule:s,goalAmount:o}=this._rule;this._patchRule(this._ruleIdToUpdate,{allowsNotifications:t,senders:e,receivers:i,roundRule:a,multiplierRule:s,goalAmount:o,status:{id:"VALID"}})}if("VALID"===(null===(i=this._goalToCreate)||void 0===i||null===(a=i.status)||void 0===a?void 0:a.id)&&this._scheduledTransferIdToUpdate){var s,o,n,r,l,d,c,u,h,g;const t=this._startDatePeriodic||(null===(s=this._scheduledTransfer)||void 0===s||null===(o=s.period)||void 0===o?void 0:o.startDate),e=this._endDatePeriodic||(null===(n=this._scheduledTransfer)||void 0===n||null===(r=n.period)||void 0===r?void 0:r.endDate),i=this._amountPeriodic||(null===(l=this._scheduledTransfer)||void 0===l||null===(d=l.sentMoney)||void 0===d?void 0:d.amount),a={sender:this._getSender(),receiver:{contract:{number:null===(c=this._savingGoalAccount)||void 0===c?void 0:c.number}},sentMoney:{currency:null===(u=this._parametry)||void 0===u||null===(h=u.currencies[0])||void 0===h?void 0:h.id,amount:i},period:{startDate:Xo(t).format("YYYY-MM-DD"),endDate:Xo(e).format("YYYY-MM-DD")},concept:null===(g=this._goal)||void 0===g?void 0:g.id,frequency:this._frequencyPeriodic,status:tn};this._patchScheduledTransfer(this._scheduledTransferIdToUpdate,a)}this._deletingGoalWithScheduledTransfer&&(this._addLoading("deleteSavingGoal",(()=>{this._deleteGoal()})),this._savingGoalDm.deleteSavingGoal(this._goalId));const m=this._historicRoutes[this._historicRoutes.length-1];(this._redirectAutomaticSave||this._completedGoal||this._redirectMultiStep||this._noContributions)&&(this._getSavingGoal(),this._getRulesByGoal()),this._redirectMultiStep=!1,this._noContributions=!1,this._clearLoader("patchSavingGoal"),"editGoal"===m&&this._updateOnlyGoalName&&(this._getSavingGoal(),this._getSavingGoals(),this._popLatestRoute(),this._editGoalToastShow=!0)}_patchRule(t,e){this._addLoading("patchRule",(()=>{this._patchRule(t,e)})),this._selfDrivenRuleDm.patchRule(t,e)}_handleUpdateError(){var t,e,i,a,s;(this._goalToCreate.status||(this._updateErrorModalVisible=!0),"VALID"===(null===(t=this._goalToCreate)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id))?(this._updateGoalValidErrorVisible=!0,this._goalToCreate={},this._scheduledTransfer={},this._isGoalCreated=!0,this._handleNavigate({detail:{routeName:"successfulCreateGoal",goalId:null===(s=this._goal)||void 0===s?void 0:s.id,replace:!1}})):"SIMULATED"===(null===(i=this._goalToCreate)||void 0===i||null===(a=i.status)||void 0===a?void 0:a.id)?(this._allError=[...this._allError,...this._allLoading],this._step2Completed=!1,this._postSimulateError()):this._updateErrorModalVisible=!0;this._closeLoader()}_handleUpdateRuleError(){var t,e,i;(this._goalToCreate.status||(this._updateErrorModalVisible=!0),"VALID"===(null===(t=this._goalToCreate)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id))?(this._updateRuleValidErrorVisible=!0,this._goalToCreate={},this._scheduledTransfer={},this._isGoalCreated=!0,this._clearLoader("patchRule"),this._handleNavigate({detail:{routeName:"successfulCreateGoal",goalId:null===(i=this._goal)||void 0===i?void 0:i.id,replace:!1}})):this._goalToCreate.status?(this._allError=[...this._allError,...this._allLoading],this._postErrorModalVisible=!0,this._closeLoader()):(this._updateErrorModalVisible=!0,this._closeLoader())}_handleUpdateContributions({detail:t}){var e,i;(this._operationNumber=(null==t?void 0:t.sheet)||(null==t?void 0:t.id),this._deleteGoalVisible||this._withdrawSavingsVisible)?(this._deleteGoal(),this._withdrawal={amount:null==t||null===(e=t.contributionAmount)||void 0===e?void 0:e.amount,currency:null==t||null===(i=t.contributionAmount)||void 0===i?void 0:i.currency}):this._successOperativeInfo=!0;this._isAccessPointDashboard&&this.dashboardContractId&&this._getAccount(this.dashboardContractId),this._clearLoader("postSavingGoalContributions"),this.dispatchEvent(new CustomEvent("update-contribution",{bubbles:!0,composed:!0,detail:!0}))}_handleDelete(){var t,e;this._deletingGoalWithScheduledTransfer&&(this._deletingGoalWithScheduledTransfer=!1,this._deleteGoalVisible=!0),this._getSavingGoals(),0!==(null===(t=this._goal)||void 0===t||null===(e=t.currentAmount)||void 0===e?void 0:e.amount)?this._successOperativeInfo=!0:this._backAfterDelete(),this._clearLoader("deleteSavingGoal")}_contributionsApiDM(){return d`
      <bbva-global-saving-goal-contributions-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.savingGoalsApiVersion}"
        .requiredToken="${this.requiredToken}"
        .savingGoal=${{}}
        ?native="${this.native}"
        @saving-goal-contributions-api-dm-fetch="${this._handleFetchContributions}"
        @saving-goal-contributions-api-dm-fetch-error="${this._handleGetError}"
        @saving-goal-contributions-api-dm-create="${this._handleUpdateContributions}"
        @saving-goal-contributions-api-dm-create-error="${this._handlePostError}"
        @api-dm-error="${this._handleGetError}"
      >
      </bbva-global-saving-goal-contributions-api-dm>
    `}_navigateRules(t){var e,i,a,s,o,n;this._createGoalFormVisible=!1,this._algorithmVisible=!1,this._contributionFormulasVisible=!1,this._simulateId=null===(e=t.detail)||void 0===e||null===(i=e.rule)||void 0===i?void 0:i.id,this.navigateSelfDrivenRoundUp=!0;const r=new CustomEvent("navigate-go-forward",{detail:{params:{target:{id:"self-driven",ruleId:null===(a=t.detail)||void 0===a||null===(s=a.rule)||void 0===s?void 0:s.id,savingGoalAccount:this._savingGoalAccount&&!ws(this.savingGoalAccount)?this._savingGoalAccount:{id:null===(o=t.detail)||void 0===o?void 0:o.goalAccountId},goalId:(null===(n=t.detail)||void 0===n?void 0:n.goalId)||this._goalId}},history:this._historicRoutes,replace:!1,external:!0},bubbles:!0,composed:!0});this.dispatchEvent(r)}_createGoalValid(t){var e,i,a,s,o;(this._creationProcess=!0,this._goalToCreate.status={id:"VALID"},this._ruleIdToUpdate=null===(e=t.detail)||void 0===e?void 0:e.ruleId,this._scheduledTransferIdToUpdate=t.detail.scheduledTransferId,null!==(i=this._savingGoalAccount)&&void 0!==i&&i.id)?(this._patchSavingGoal(this._goalId,{status:{id:"VALID"},savingContract:{id:null===(a=this._savingGoalAccount)||void 0===a?void 0:a.id},goalPurpose:{id:null===(s=this._goalToCreate)||void 0===s||null===(o=s.goalPurpose)||void 0===o?void 0:o.id},...this._scheduledTransferIdToUpdate&&{periodicContribution:{scheduledTransfer:{id:this._scheduledTransferIdToUpdate||this.encryptedZero}}}}),this._noContributions=!this._ruleIdToUpdate&&!this._scheduledTransferIdToUpdate):this._createSavingGoalsAccount(t)}_getRulesByGoal(){this._goalId&&(this._addLoading("getSavingGoalRules",(()=>{this._getRulesByGoal()})),this._savingGoalRulesDm.getSavingGoalRules(this._goalId))}_getAllRules(){this._addLoading("getRules",(()=>{this._getAllRules()})),this._selfDrivenDm.getRules()}_createSavingGoalsAccount(t){var e;this._accountNumber=null===(e=t.detail)||void 0===e?void 0:e.accountNumber,this._addLoading("postAccounts",(()=>{this._createSavingGoalsAccount(t)})),this._accountsDm.postAccounts({participants:[{participantType:{id:"HOLDER",order:1}}],accountType:{id:this.createAccount.accountType},title:{id:this.createAccount.title},joint:{id:this.createAccount.joint},meta:{accountLevel:this.createAccount.accountLevel},relatedContracts:[{contractDetails:{contractType:"INTERNAL_CONTRACT",contractId:this._accountNumber?this._accountNumber:void 0}}]})}_getParametry(){this._addLoading("getParametry",(()=>{this._getParametry()})),this._savingGoalsParametryDm.getParametry()}_getSavingGoalAccountFirst(){this._addLoading("getAccounts",(()=>{this._getSavingGoalAccountFirst()})),this._accountsDm.getAccounts({"accountType.id":this.createAccount.accountType||23})}_getCards(){this._listCards.length||(this._addLoading("getCards",(()=>{this._getCards()})),this._cardsDm.getCards({expand:"related-contracts,participants"}))}_updateRule(t){var e,i,a,s,o;null!=t&&null!==(e=t.detail)&&void 0!==e&&null!==(i=e.rule)&&void 0!==i&&i.id&&this._patchRule(null==t||null===(a=t.detail)||void 0===a||null===(s=a.rule)||void 0===s?void 0:s.id,{isActive:null==t||null===(o=t.detail)||void 0===o?void 0:o.isActive})}_updateScheduledTransfer({detail:t}){var e,i,a;this._switchPeriodicContribution=!0;const{id:s,...o}=this._scheduledTransfer,[{number:n=""}]=(null===(e=this._scheduledTransfer)||void 0===e||null===(i=e.receiver)||void 0===i?void 0:i.contracts)||[];var r,l;const d={...(r=o,l=["frequency","period","sentMoney","sender"],Object.fromEntries(Object.entries(r).filter((([t])=>l.includes(t))))),concept:null===(a=this._goal)||void 0===a?void 0:a.id,receiver:{contract:{number:n}},status:t?"VALID":"PAUSED"};this._patchScheduledTransfer(s,d)}_createScheduledTransfer({detail:t}){this._redirectMultiStep=!0,this._addLoading("postScheduledTransfers",(()=>{this._createScheduledTransfer(t)})),this._scheduledTransfersDm.postScheduledTransfers(t)}_editScheduledTransfer({detail:t}){this._switchPeriodicContribution=!1;const e=this._scheduledTransfer.id||this._scheduledTransferByGoal.id;this._redirectMultiStep=!0,this._redirectPeriodicModalVisible=!1,this._patchScheduledTransfer(e,t)}_patchScheduledTransfer(t,e){this._addLoading("patchScheduledTransfer",(()=>{this._patchScheduledTransfer(t,e)})),this._scheduledTransferDm.patchScheduledTransfer(t,e)}_deleteScheduledTransfer(){this._addLoading("deleteScheduledTransfer",(()=>{this._deleteScheduledTransfer()})),this._scheduledTransferDm.deleteScheduledTransfer(this._goal.periodicContribution.scheduledTransfer.id)}_handleCreateSavingGoals(t){this._goalId=t.detail.id,this._getSavingGoal(),this._clearLoader("postSavingGoals")}_handleFetch({detail:t}){var e,i,a,s,o,n,r;(t.currentAmount?this._goal=t:this._goal=Object.assign(t,{currentAmount:{amount:0,currency:"MXN"}}),ws(this._savingGoalAccount)&&ws(this._goalToCreate)?this._getSavingGoalAccountFirst():"SIMULATED"===(null===(e=this._goalToCreate)||void 0===e||null===(i=e.status)||void 0===i?void 0:i.id)&&(this._step2Completed=!0),this._goalId&&this._createGoalFormVisible&&"SIMULATED"===(null===(a=this._goal)||void 0===a||null===(s=a.status)||void 0===s?void 0:s.id)&&this._handleNavigate({detail:{routeName:"createGoalForm",replace:!0,goalId:this._goalId}}),"VALID"===(null===(o=this._goalToCreate)||void 0===o||null===(n=o.status)||void 0===n?void 0:n.id)&&0!==Object.keys(this._savingGoalAccount).length)&&(this._goalToCreate={},this._isGoalCreated=!0,this._handleNavigate({detail:{routeName:"successfulCreateGoal",goalId:null===(r=this._goal)||void 0===r?void 0:r.id,replace:!0}}));this._clearLoader("getSavingGoal")}_handleFetchContributions({detail:t}){this._listContributions=Array.isArray(t)?null==t?void 0:t.sort(((t,e)=>Number(e.id)-Number(t.id))):[],this._clearLoader("getSavingGoalContributions")}_handleDeleteError(){this._deleteErrorModalVisible=!0,this._getErrorModalVisible=!0,this._allError=[...this._allError,...this._allLoading],this._closeLoader()}_isGoalAccount(t){var e;return(null==t||null===(e=t.accountType)||void 0===e?void 0:e.id)===`${this.createAccount.accountType}-${this.createAccount.title}`}static _isLinkCardAccount(t,{checkActivated:e=!1}={}){var i,a,s;const o=null===(i=t.accountType)||void 0===i||null===(a=i.id)||void 0===a?void 0:a.split("-")[1],n=!e||"ACTIVATED"===(null===(s=t.status)||void 0===s?void 0:s.id);return"0201"!==o&&n}_handleFetchAccounts({detail:t}){var e,i,a;this._goalToCreate&&!ws(this._goalToCreate)&&this._isAccountCreated&&(this._goalToCreate.status.id="VALID",this._patchSavingGoal(this._goalId,{savingContract:{id:null===(e=Rs(t))||void 0===e?void 0:e.id},goalPurpose:{id:null===(i=this._goalToCreate)||void 0===i||null===(a=i.goalPurpose)||void 0===a?void 0:a.id},status:{id:"VALID"}}));1===(null==t?void 0:t.length)&&this._isGoalAccount(t[0])&&([this._savingGoalAccount]=t),null!=t&&t.some(this._isGoalAccount,this)&&(this._savingGoalAccount=t.find(this._isGoalAccount,this)),this._listAccounts.length||null!=t&&t.includes(this._savingGoalAccount)||(this._listAccounts=(null==t?void 0:t.filter(an._isLinkCardAccount,this))||[],this._listAccountsActivated=(null==t?void 0:t.filter((t=>an._isLinkCardAccount.call(this,t,{checkActivated:!0}))))||[],this._accountsSetted=!0),!ws(this._savingGoalAccount)||this._listAccounts.length||this._accountsSetted||(this._openNoAccountsModal=!0,this.dispatchEvent(new CustomEvent("open-modal",{bubbles:!0,composed:!0,detail:{id:"noAccountsModal"}}))),this._clearLoader("getAccounts")}_postContributions(t){var e,i,a,s,o;const n=this._refundOrDeleteOrTransferBetween(),r=n?(null===(e=this._savingGoalAccount)||void 0===e?void 0:e.id)||this.dashboardContractId:null===(i=t.detail.account)||void 0===i?void 0:i.id,l=n?null===(a=t.detail.account)||void 0===a?void 0:a.id:(null===(s=this._savingGoalAccount)||void 0===s?void 0:s.id)||this.dashboardContractId,d={id:this._transferBetweenGoalsVisible?t.detail.destinyGoalId:this._goalId};this._addLoading("postSavingGoalContributions",(()=>{this._postContributions(t)})),this._contributionsDm.postSavingGoalContributions(this._goalId,{contributionAmount:{amount:Math.abs(t.detail.amount),currency:null===(o=this._goal.currentAmount)||void 0===o?void 0:o.currency},contributionType:{id:"PUNCTUAL"},originContract:{id:r,savingGoal:n?{id:this._goalId}:void 0},savingContract:{id:l,savingGoal:!n||this._transferBetweenGoalsVisible?d:void 0}})}_deleteSavingGoalRule(t){this._addLoading("deleteSavingGoalRule",(()=>{this._deleteSavingGoalRule(t)})),this._savingGoalRuleDm.deleteSavingGoalRule(this._goalId,t.id)}_refundOrDeleteOrTransferBetween(){return this._refundGoalVisible||this._deleteGoalVisible||this._transferBetweenGoalsVisible||this._withdrawSavingsVisible}_genericErrorModal(){return d`
      <bbva-help-modal
        data-id="genericErrorModal"
        id="genericErrorModal"
        title-icon="${n()}"
        body-text="${this.t("metas-saving-goals-generic-error-text")}"
        button-text="${this.t("metas-saving-goals-ok")}"
        modal-type="warning"
        ?visible=${this._genericErrorModalVisible}
        @help-modal-close="${this._closeGenericErrorModal}"
      ></bbva-help-modal>
    `}_getErrorModal(){return d`
      <bbva-help-modal
        data-id="getErrorModal"
        id="getErrorModal"
        title-icon="${n()}"
        title-text="${this.t("metas-saving-goals-get-error-title")}"
        body-text="${this.t("metas-saving-goals-get-error-text")}"
        button-text="${this.t("metas-saving-goals-get-error-button-text")}"
        link-text="${this.t("metas-saving-goals-get-error-exit")}"
        modal-type="warning"
        ?visible=${this._getErrorModalVisible}
        @help-modal-footer-button-click="${this._retryService}"
        @help-modal-close="${this._cancelGetModalError}"
      ></bbva-help-modal>
    `}_postErrorModal(){return d`
      <bbva-help-modal
        id="errorPostModal"
        header-text="${this.t(`metas-saving-goals-error-post-modal-head-${this._processName}`)}"
        header-type="modal"
        icon-right-primary=${ct()}
        title-icon="${n()}"
        title-text="${this.t("metas-saving-goals-error-post-modal-title")}"
        body-text="${this.t("metas-saving-goals-error-post-modal-text")}"
        button-text="${this.t("metas-saving-goals-error-post-modal-button-text")}"
        modal-type="warning"
        full-height
        fixed-footer
        ?visible=${this._postErrorModalVisible}
        @help-modal-footer-button-click="${this._retryService}"
        @help-modal-close="${this._cancelPostModalError}"
      ></bbva-help-modal>
    `}_retryService(){var t,e;const i=this._isSimulateError&&"VALID"===(null===(t=this._goalToCreate)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id);if(this._isGetContributionError||i)this._isGetContributionError?(this._isGetContributionError=!1,this._retryContribution=!0):this._isSimulateError&&(this._isSimulateError=!1,this._retrySimulate=!0);else{this._postErrorModalVisible=!1,this._getErrorModalVisible=!1;for(const t of this._allError)null!=t&&t.callBack&&(null==t||t.callBack())}}_getContributionError(){this._getErrorModalVisible=!0,this._isGetContributionError=!0,this._retryContribution=!1}_postSimulateError(){this._postErrorModalVisible=!0,this._isSimulateError=!0,this._retrySimulate=!1}_cancelGetModalError(){this._getErrorModalVisible=!1,this._allError=[],this._isGetContributionError&&(this._isGetContributionError=!1,this._retryContribution=!1)}_cancelPostModalError(){this._postErrorModalVisible=!1,this._allError=[],this._isSimulateError&&(this._isSimulateError=!1,this._retrySimulate=!1)}_closeGenericErrorModal(){this._popLatestRoute(),this._genericErrorModalVisible=!1}_deleteErrorModal(){return d`
      <bbva-help-modal
        data-id="deleteErrorModal"
        id="deleteErrorModal"
        title-icon="${n()}"
        title-text="${this.t("metas-saving-goals-delete-error-title")}"
        body-text="${this.t("metas-saving-goals-generic-error-text")}"
        button-text="${this.t("metas-saving-goals-ok")}"
        modal-type="warning"
        ?visible=${this._deleteErrorModalVisible}
        @help-modal-footer-button-click="${()=>{this._deleteErrorModalVisible=!1,this._popLatestRoute()}}"
      ></bbva-help-modal>
    `}_updateErrorModal(){return d`
      <bbva-help-modal
        data-id="updateErrorModal"
        id="updateErrorModal"
        title-icon="${n()}"
        title-text="${this.t("metas-saving-goals-update-create-error-title")}"
        body-text="${this.t("metas-saving-goals-update-create-error-text")}"
        button-text="${this.t("metas-saving-goals-ok")}"
        modal-type="warning"
        ?visible=${this._updateErrorModalVisible}
        @help-modal-footer-button-click="${()=>{this._updateErrorModalVisible=!1,this._popLatestRoute()}}"
      ></bbva-help-modal>
    `}_launchCalendar(t){this.dispatchEvent(new CustomEvent("metas-saving-goals-launch-calendar",{bubbles:!0,composed:!0,detail:{dateFormat:"yyyy-MM-dd",defaultDate:(new Date).toISOString().split("T")[0],scheduledContribution:!0,typeDate:t}}))}get _checkDisabledPeriodicModal(){return!this._checkValidAmount()||!this._checkValidEndDate()||!this._checkValidStartDate()}_onBlurAmount(t){t.target.invalid=!this._checkValidAmount()}_onBlurStartDate(t){t.target.invalid=!this._checkValidStartDate()}_onBlurEndDate(t){t.target.invalid=!this._checkValidEndDate()}_checkValidAmount(){return Number(this._amountPeriodic)>0}_checkValidStartDate(){var t;return new Date(null===(t=this._startDatePeriodic)||void 0===t?void 0:t.replaceAll("-","/")).getTime()>=(new Date).setHours(0,0,0,0)}_checkValidEndDate(){var t,e,i,a;const s=new Date(null===(t=this._endDatePeriodic)||void 0===t?void 0:t.replaceAll("-","/")).getTime(),o=new Date(null===(e=this._startDatePeriodic)||void 0===e?void 0:e.replaceAll("-","/")).getTime(),n=new Date(null===(i=this._goal)||void 0===i||null===(a=i.goalPeriod)||void 0===a?void 0:a.expirationDate.replaceAll("-","/")).getTime(),r=(new Date).setHours(0,0,0,0),l=Es(o,s)>=1;return s>r&&l&&(!this._startDatePeriodic||s>o)&&n>=s}get _amountErrorMessage(){return this._checkValidAmount()?this.t("metas-saving-goals-create-goal-multistep-form-required"):this.t("metas-saving-goals-transfer-between-goals-amount-at-less-zero-error")}get _startDateErrorMessage(){let t="";return this._checkValidStartDate()||(t=""!==this._startDate?this.t("metas-saving-goals-create-goal-multistep-form-startDate-error"):this.t("metas-saving-goals-create-goal-multistep-form-required")),t}get _endDateErrorMessage(){var t,e;let i="";const a=new Date(null===(t=this._goal)||void 0===t||null===(e=t.goalPeriod)||void 0===e?void 0:e.expirationDate.replaceAll("-","/")).getTime(),s=new Date(this._endDate).getTime();return this._checkValidEndDate()||(i=""===this._endDate?this.t("metas-saving-goals-create-goal-multistep-form-required"):a<s?this.t("metas-saving-goals-create-goal-multistep-form-endDate-error-greater-goal"):this.t("metas-saving-goals-create-goal-multistep-form-endDate-error")),i}_getSender(){var t,e,i,a;return{contract:{number:(null===(t=this._originAccountPeriodic)||void 0===t?void 0:t.number)||(null===(e=this._scheduledTransfer)||void 0===e||null===(i=e.sender)||void 0===i||null===(a=i.contract)||void 0===a?void 0:a.number)}}}_getReceiver(){var t,e,i,a,s,o;const n=(null===(t=this._originAccountPeriodic)||void 0===t?void 0:t.number)||(null===(e=this._scheduledTransfer)||void 0===e||null===(i=e.sender)||void 0===i||null===(a=i.contract)||void 0===a?void 0:a.number);var r,l;return"EDIT"===this._typeModalPeriodic?{contract:{number:(null===(r=this._savingGoalAccount)||void 0===r?void 0:r.number)||(null===(l=this._dashboardAccount)||void 0===l?void 0:l.number)||n}}:{contracts:[{number:(null===(s=this._savingGoalAccount)||void 0===s?void 0:s.number)||(null===(o=this._dashboardAccount)||void 0===o?void 0:o.number)||n}],holder:{holderName:this.sessionName}}}_submitScheduledTransfer(){var t,e,i;this._scheduledTransferBody={sender:this._getSender(),receiver:this._getReceiver(),sentMoney:{currency:null===(t=this._parametry)||void 0===t||null===(e=t.currencies[0])||void 0===e?void 0:e.id,amount:this._amountPeriodic},period:{startDate:Xo(this._startDatePeriodic).format("YYYY-MM-DD"),endDate:Xo(this._endDatePeriodic).format("YYYY-MM-DD")},concept:null===(i=this._goal)||void 0===i?void 0:i.id,frequency:this._frequencyPeriodic,status:["CREATE_MULTISTEP","EDIT_MULTISTEP","CREATE"].includes(this._typeModalPeriodic)?Qo:tn},"EDIT-MULTISTEP"===this._typeModalPeriodic||"EDIT"===this._typeModalPeriodic?this._editScheduledTransfer({detail:this._scheduledTransferBody}):this._createScheduledTransfer({detail:this._scheduledTransferBody}),this._periodicModalVisible=!1}_openPeriodicModal({detail:t}){const{panelOfferText:e,periodicAmount:i,periodicAmountSimulation:a=null,originAccount:s,frequency:o,startDate:n,endDate:r,typeModalPeriodic:l}=t;var d,c,u;(this._typeModalPeriodic=l,this._periodicAmountSimulation=a,"CREATE_MULTISTEP"===l||"CREATE"===l)?(this._amountPeriodic=0,[this._originAccountPeriodic]=this._listAccounts,this._frequencyPeriodic=Zo,this._startDatePeriodic=Xo().format("YYYY-MM-DD"),this._endDatePeriodic=null===(d=this._goal)||void 0===d||null===(c=d.goalPeriod)||void 0===c?void 0:c.expirationDate,this._panelOfferTextPeriodic=this.t("metas-saving-goals-multistep-algorithm-panel-offer-periodic"),this._periodicButtonText=this.t("metas-saving-goals-multistep-algorithm-panel-offer-periodic-create-button")):(this._amountPeriodic=i,this._originAccountPeriodic=null===(u=this._listAccounts)||void 0===u?void 0:u.find((t=>(null==t?void 0:t.number)===s)),this._frequencyPeriodic=o,this._startDatePeriodic=n,this._endDatePeriodic=r,this._panelOfferTextPeriodic=e,this._periodicButtonText=this.t("metas-saving-goals-multistep-algorithm-periodic-modal-button"));this._periodicModalVisible=!0,this._dispatchTraceEvent({detail:{route:"periodicContribution",isEdition:"EDIT"===this._typeModalPeriodic}})}_periodicModal(){var t,e,i,a,s,o,n,r,l,u;const h=["CREATE_MULTISTEP","CREATE"].includes(this._typeModalPeriodic)?"create":"edit";return d`
      <bbva-help-modal
        id="periodic-modal"
        ambient="light"
        full-height
        hide-content-padding-top
        ?visible="${this._periodicModalVisible}"
        ?disabled-button="${this._checkDisabledPeriodicModal}"
        header-text="${this.t(`metas-saving-goals-${h}-scheduled-formula-modal-header`)}"
        button-text="${this._periodicButtonText}"
        link-text="${this.t("metas-saving-goals-multistep-algorithm-periodic-modal-exit")}"
        icon-right-primary=${ct()}
        @help-modal-footer-link-click="${()=>{this._periodicModalVisible=!1}}"
        @help-modal-footer-button-click="${()=>{this._submitScheduledTransfer()}}"
        @help-modal-close="${()=>{this._periodicModalVisible=!1}}"
      >
        <div slot="slot-content">
          <bbva-panel-offer
            id="periodic-modal-info-panel"
            .contentTitle="${this.t("metas-saving-goals-multistep-algorithm-periodic-modal-title")}"
            .linkText="${this.t("metas-saving-goals-multistep-algorithm-periodic-modal-more-information")}"
            link-icon=""
            @panel-offer-panel-link-click="${()=>{this._openMoreInfoScheduledModal=!0}}"
            microillustration="periodiccontributiondollar"
          >
            <p>
              ${this._panelOfferTextPeriodic}
            </p>
          </bbva-panel-offer>
          <bbva-form-amount
            id="periodic-amount"
            label=${this.t("metas-saving-goals-multistep-algorithm-periodic-modal-quantity")}
            .amount="${this._amountPeriodic}"
            currency-code="${null===(t=this._parametry)||void 0===t||null===(e=t.currencies[0])||void 0===e?void 0:e.id}"
            local-currency="${null===(i=this._parametry)||void 0===i||null===(a=i.currencies[0])||void 0===a?void 0:a.id}"
            info-message="${c(null!==(s=this._typeModalPeriodic)&&void 0!==s&&s.includes("MULTISTEP")&&this._amountPeriodic>this._periodicAmountSimulation?this.t("metas-saving-goals-multistep-algorithm-notification-message-amount-alert"):void 0)}"
            @form-amount-input-change=${t=>{var e;this._amountPeriodic=(null===(e=t.detail)||void 0===e?void 0:e.amount)||null}}
            @form-field-input-blur=${this._onBlurAmount}
            error-message="${this._amountErrorMessage}"
            required
          >
          </bbva-form-amount>
          <bbva-form-select
            id="periodic-origin-account"
            @change="${t=>{var e;this._originAccountPeriodic=null===(e=this._listAccounts)||void 0===e?void 0:e.find((e=>e.id===t.target.value))}}"
            ?disabled="${!(null!==(o=this._listAccounts)&&void 0!==o&&o.length)}"
            value=${null!==(n=this._originAccountPeriodic)&&void 0!==n&&n.id?null===(r=this._originAccountPeriodic)||void 0===r?void 0:r.id:gt}
            label="${this.t("metas-saving-goals-contribute-origin-account")}"
            required
          >
            ${this._listAccounts.map(((t,e)=>d`
                <bbva-form-option
                  ?selected="${0===e}"
                  .icon="${Ft()}"
                  value="${t.id}"
                >
                  ${U(null==t?void 0:t.number,"•",!0,4)}
                </bbva-form-option>
              `))}
          </bbva-form-select>
          <bbva-form-select
            id="periodic-frequency"
            @change="${t=>{this._frequencyPeriodic=t.target.value}}"
            ?disabled="${!1}"
            value=${this._frequencyPeriodic}
            label="${this.t("metas-saving-goals-multistep-algorithm-periodic-modal-frequency")}"
            required
          >
            ${Jo.map(((t,e)=>d`
                <bbva-form-option ?selected="${0===e}" value="${null==t?void 0:t.value}">
                  ${this.t(t.key)}
                </bbva-form-option>
              `))}
          </bbva-form-select>
          <bbva-form-date
            id="start-date"
            ambient="light"
            label=${this.t("metas-saving-goals-multistep-algorithm-periodic-modal-date-start")}
            .value="${this._startDatePeriodic}"
            info-message="${this.t("metas-saving-goals-multistep-algorithm-notification-message-last-contribution"+(this._frequencyPeriodic===Zo?"":"-biweekly"))}"
            error-message="${this._startDateErrorMessage}"
            required
            @form-field-input-blur="${this._onBlurStartDate}"
            @form-field-input-focus="${t=>{""!==t.target.value&&this._onBlurStartDate(t)}}"
            @click="${t=>this._launchCalendar(t.currentTarget.id)}"
            @input="${t=>{this._startDatePeriodic=t.target.value}}"
          >
          </bbva-form-date>
          <bbva-form-date
            id="end-date"
            ambient="light"
            label=${this.t("metas-saving-goals-multistep-algorithm-periodic-modal-date-end")}
            .value="${this._endDatePeriodic}"
            info-message="${this.t("metas-saving-goals-multistep-algorithm-notification-message-last-date",{endDate:new Date(null===(l=this._goal)||void 0===l||null===(u=l.goalPeriod)||void 0===u?void 0:u.expirationDate.concat("T00:00:00")).toLocaleDateString(this.language)})}"
            error-message="${this._endDateErrorMessage}"
            required
            @form-field-input-blur="${this._onBlurEndDate}"
            @form-field-input-focus="${t=>{""!==t.target.value&&this._onBlurEndDate(t)}}"
            @click="${t=>this._launchCalendar(t.currentTarget.id)}"
            @input="${t=>{this._endDatePeriodic=t.target.value}}"
          >
          </bbva-form-date>
        </div>
      </bbva-help-modal>
    `}_handleFetchRules(t){var e;(this._rulesByGoal=(null==t?void 0:t.detail)||[],(this._createGoalFormVisible||this._successfulCreateGoalVisible||this._creationProcess)&&this._rulesByGoal.length)&&this._getRule({detail:{ruleId:null===(e=this._rulesByGoal[0])||void 0===e?void 0:e.id}});(this._redirectAutomaticSave||this._completedGoal)&&(this._rulesByGoal.length?(this._isFinishedDelete=this._rulesByGoal.length<=1,this._rulesByGoal.forEach((t=>{this._deleteSavingGoalRule(t)}))):this._completedGoal?(this._completedGoal=!1,this._popLatestRoute()):this._handleNavigate({detail:{routeName:"algorithm",replace:!0,goalId:this._goalId}})),this._clearLoader("getSavingGoalRules")}_handleCreateAccounts(t){var e,i;this._goalToCreate&&(this._firstScheduledTransfer=!0,this._operationNumber=null==t||null===(e=t.detail)||void 0===e||null===(i=e.operationTracking)||void 0===i?void 0:i.operationNumber,this._successfulCreateGoalVisible=!0,this._isGoalCreated=!0,this._isAccountCreated=!0,this._getSavingGoalAccountFirst(),this._handleNavigate({detail:{routeName:"successfulCreateGoal",replace:!0,goalId:this._goalId}}));this._clearLoader("postAccounts")}_handleFetchCards({detail:t}){this._listCards=t.filter((t=>{var e,i,a,s;return Array.isArray(t.relatedContracts)&&t.relatedContracts.length&&(null===(e=t.relatedContracts[0])||void 0===e?void 0:e.contractId)&&("CREDIT_CARD"===t.cardType.id||"DEBIT_CARD"===t.cardType.id)&&!t.isBusiness&&"HOLDER"===(null==t||null===(i=t.participants)||void 0===i||null===(a=i[0])||void 0===a||null===(s=a.participantType)||void 0===s?void 0:s.id)&&"OPERATIVE"===t.status.id})),this._cardWithOutAccount=t.find((t=>!t.relatedContracts.length)),this._clearLoader("getCards")}_handleFetchAllRules({detail:t}){this._clearLoader("getRules"),this._listRules=t||[]}_handleFetchRule({detail:t}){var e;this._rule=t,this._isActivePurchaseContribution=(null==t||null===(e=t.status)||void 0===e?void 0:e.id)===tn,this._clearLoader("getRule")}_handleUpdateRule(){this._ruleIdToUpdate&&(this._getAllRules(),this._getRulesByGoal(),this.requestUpdate("_listRules",this._listRules),this._scheduledTransferIdToUpdate||(this._getSavingGoal(),this._getSavingGoals()),this._ruleIdToUpdate=""),this._clearLoader("patchRule")}_handleDeleteRule(){this._getAllRules(),this._getRulesByGoal(),this._clearLoader("deleteRule"),this.deletedRuleId=!0}_handleError(){this._allLoading=[],this._closeLoader(),this._genericErrorModalVisible=!0}_handleGetError(){this._getErrorModalVisible=!0,this._allError=[...this._allError,...this._allLoading],this._closeLoader()}_handlePostError(){this._postErrorModalVisible=!0,this._allError=[...this._allError,...this._allLoading],this._closeLoader()}_handleFetchSavingGoalsParametry(t){var e,i,a,s;(this._parametry=null==t?void 0:t.detail,this._operationType=null==t||null===(e=t.detail)||void 0===e?void 0:e.operationType,null!=t&&null!==(i=t.detail)&&void 0!==i&&i.maximumGoals&&(null==t||null===(a=t.detail)||void 0===a?void 0:a.maximumGoals)<999)?this._limitGoals=Number(null==t||null===(s=t.detail)||void 0===s?void 0:s.maximumGoals):this._limitGoals=0;this._clearLoader("getParametry")}_handleDeleteScheduledTransfer(){const t={periodicContribution:{scheduledTransfer:{id:this.encryptedZero}}};this._isNecessaryDeletePeriodicTransfer=!1,this._patchSavingGoal(this._goal.id,t),this.deletedRuleId=!0,this._scheduledTransferByGoal={},this._scheduledTransfer={},this._clearLoader("deleteScheduledTransfer")}_handleGetScheduledTransfer(t){var e;this._scheduledTransfer=null==t?void 0:t.detail,this._scheduledTransferByGoal=null==t?void 0:t.detail,this._isActivePeriodicContribution=(null==t||null===(e=t.detail)||void 0===e?void 0:e.status)===tn,this._clearLoader("getScheduledTransfer")}_handleEditScheduledTransfer(){this._scheduledTransfer=this._scheduledTransfer||this._scheduledTransferByGoal,this._scheduledTransferDm.getScheduledTransfer(this._scheduledTransfer.id),this._scheduledTransferIdToUpdate&&(this._scheduledTransferIdToUpdate="",this._patchSavingGoal(this._goal.id,{periodicContribution:{scheduledTransfer:{id:this._scheduledTransfer.id}}}));"contributionFormulas"!==Rs(this._historicRoutes)||this._switchPeriodicContribution||(this._isEditSchedule="EDIT"===this._typeModalPeriodic,this._openScheduledModal()),this._clearLoader("patchScheduledTransfer")}_handleEditScheduledTransferError(){var t,e,i;"VALID"===(null===(t=this._goalToCreate)||void 0===t||null===(e=t.status)||void 0===e?void 0:e.id)?(this._updateScheduledValidErrorVisible=!0,this._goalToCreate={},this._scheduledTransfer={},this._isGoalCreated=!0,this._handleNavigate({detail:{routeName:"successfulCreateGoal",goalId:null===(i=this._goal)||void 0===i?void 0:i.id,replace:!1}})):(this._allError=[...this._allError,...this._allLoading],this._postErrorModalVisible=!0);this._closeLoader()}_handleCreateScheduledTransfer(t){var e;const i=this._historicRoutes[this._historicRoutes.length-1],a=null==t||null===(e=t.detail)||void 0===e?void 0:e.id;if(this._typeModalPeriodic&&"CREATE"===this._typeModalPeriodic&&"contributionFormulas"===i&&this._scheduledTransferBody&&!this.deletedRuleId){const t={contract:this._scheduledTransferBody.receiver.contracts[0]||this._scheduledTransferBody.receiver.contract};this._scheduledTransferBody.status=tn,this._scheduledTransferBody.receiver=t,this._redirectPeriodicModalVisible=!0,this._scheduledTransferIdToUpdate=a,this._typeModalPeriodic=""}a&&this._scheduledTransferDm.getScheduledTransfer(a),this._clearLoader("postScheduledTransfers")}_refreshFromSuccessModalOperative(){this._listGoals=[],this._savingGoalsDm.resetSavingGoals(),this._getSavingGoals(),this._deleteGoalVisible||this._withdrawSavingsVisible?this._backAfterDelete():(this._listContributions=[],this._getContributions(),this._goal={},this._savingGoalDm.resetSavingGoal(),this._getSavingGoal(),this._popLatestRoute()),this._successOperativeInfo=!1,this._operationNumber=""}setCalendarDate({selectedDate:t}){this._endDate=t}setPeriodicStartDate({selectedDate:t}){this._startDatePeriodic=t}setPeriodicEndDate({selectedDate:t}){this._endDatePeriodic=t}_savingGoalsParametryApiDM(){return d`
      <bbva-global-parametry-api-dm
        .host="${this.host}"
        .headers="${this.headers}"
        .version="${this.savingGoalsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @parametry-api-dm-fetch="${this._handleFetchSavingGoalsParametry}"
        @parametry-api-dm-fetch-error="${this._handleGetError}"
        @api-dm-error="${this._handleGetError}"
      >
      </bbva-global-parametry-api-dm>
    `}_savingGoalsApiDM(){return d`
      <bbva-global-saving-goals-api-dm
        .host="${this.host}"
        .headers="${this.headers}"
        .version="${this.savingGoalsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @saving-goals-api-dm-fetch="${this._handleFetchSavingGoals}"
        @saving-goals-api-dm-fetch-error="${this._handleGetError}"
        @saving-goals-api-dm-create="${this._handleCreateSavingGoals}"
        @saving-goals-api-dm-create-error="${this._handlePostError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-saving-goals-api-dm>
    `}_savingGoalApiDM(){return d`
      <bbva-global-saving-goal-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.savingGoalsApiVersion}"
        .requiredToken="${this.requiredToken}"
        .savingGoal=${{}}
        ?native="${this.native}"
        @saving-goal-api-dm-fetch="${this._handleFetch}"
        @saving-goal-api-dm-fetch-error="${this._handleGetError}"
        @saving-goal-api-dm-update="${this._handleUpdateGoal}"
        @saving-goal-api-dm-update-error="${this._handleUpdateError}"
        @saving-goal-api-dm-delete="${this._handleDelete}"
        @saving-goal-api-dm-delete-error="${this._handleDeleteError}"
        @api-dm-error="${this._handleApiDmError}"
      >
      </bbva-global-saving-goal-api-dm>
    `}_handleApiDmError(){this._handleError(),this.dispatchEvent(new CustomEvent("open-modal",{bubbles:!0,composed:!0,detail:{id:"savingGoalError"}}))}_savingGoalRulesApiDM(){return d`
      <bbva-global-saving-goal-rules-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.savingGoalsApiVersion}"
        .requiredToken="${this.requiredToken}"
        .savingGoal=${{}}
        ?native="${this.native}"
        @saving-goal-rules-api-dm-fetch="${this._handleFetchRules}"
        @saving-goal-rules-api-dm-fetch-error="${this._handleGetError}"
        @api-dm-error="${this._handleGetError}"
      >
      </bbva-global-saving-goal-rules-api-dm>
    `}_savingGoalRuleApiDM(){return d`
      <bbva-global-saving-goal-rule-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.savingGoalsApiVersion}"
        .requiredToken="${this.requiredToken}"
        .savingGoal=${{}}
        ?native="${this.native}"
        @saving-goal-rule-api-dm-delete="${this._handleDeleteSavingGoalRule}"
        @saving-goal-rule-api-dm-delete-error="${this._handleError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-saving-goal-rule-api-dm>
    `}_accountApiDM(){return d`
      <bbva-global-account-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.accountApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @account-api-dm-fetch="${this._handleFetchAccount}"
        @account-api-dm-fetch-error="${this._handleGetError}"
        @api-dm-error="${this._handleGetError}"
      >
      </bbva-global-account-api-dm>
    `}_accountsApiDM(){return d`
      <bbva-global-accounts-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.accountsApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?requiredOtp="${this.requiredOtp}"
        ?native="${this.native}"
        @accounts-api-dm-fetch="${this._handleFetchAccounts}"
        @accounts-api-dm-fetch-error="${this._handleGetError}"
        @accounts-api-dm-create="${this._handleCreateAccounts}"
        @accounts-api-dm-create-error="${this._handlePostError}"
        @signature-required-first-step="${()=>{this._successfulCreateGoalVisible=!1}}"
        @signature-invalid="${()=>{this._successfulCreateGoalVisible=!1,this._closeLoader()}}"
        @signature-canceled-dm="${()=>{this._successfulCreateGoalVisible=!1,this._closeLoader()}}"
        @api-dm-error="${this._handleGetError}"
      >
      </bbva-global-accounts-api-dm>
    `}_cardsApiDM(){return d`
      <bbva-global-cards-api-dm
        .country="${this.country}"
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.cardsApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @cards-api-dm-fetch="${this._handleFetchCards}"
        @cards-api-dm-fetch-error="${this._handleGetError}"
        @api-dm-error="${this._handleGetError}"
      >
      </bbva-global-cards-api-dm>
    `}_selfDrivenApiDM(){return d`
      <bbva-global-rules-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.selfDrivenApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @rules-api-dm-fetch="${this._handleFetchAllRules}"
        @rules-api-dm-fetch-error="${this._handleGetError}"
        @api-dm-error="${this._handleGetError}"
      >
      </bbva-global-rules-api-dm>
    `}_selfDrivenRuleApiDM(){return d`
      <bbva-global-rule-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.selfDrivenApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @rule-api-dm-fetch="${this._handleFetchRule}"
        @rule-api-dm-fetch-error="${this._handleGetError}"
        @rule-api-dm-update="${this._handleUpdateRule}"
        @rule-api-dm-update-error="${this._handleUpdateRuleError}"
        @rule-api-dm-delete="${this._handleDeleteRule}"
        @rule-api-dm-delete-error="${this._handleDeleteError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-rule-api-dm>
    `}_scheduledTransfersApiDM(){return d`
      <bbva-global-scheduled-transfers-api-dm
        id="scheduledTransfersDm"
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.transfersManagementApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @scheduled-transfers-api-dm-create="${this._handleCreateScheduledTransfer}"
        @scheduled-transfers-api-dm-create-error="${this._handlePostError}"
      >
      </bbva-global-scheduled-transfers-api-dm>
    `}_scheduledTransferApiDM(){return d`
      <bbva-global-scheduled-transfer-api-dm
        .headers="${this.headers}"
        .host="${this.host}"
        .version="${this.transfersManagementApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        @scheduled-transfer-api-dm-fetch="${this._handleGetScheduledTransfer}"
        @scheduled-transfer-api-dm-update="${this._handleEditScheduledTransfer}"
        @scheduled-transfer-api-dm-update-error="${this._handleEditScheduledTransferError}"
        @scheduled-transfer-api-dm-fetch-error="${this._handleGetError}"
        @scheduled-transfer-api-dm-delete="${this._handleDeleteScheduledTransfer}"
        @scheduled-transfer-api-dm-delete-error="${this._handlePostError}"
        @api-dm-error="${this._handleError}"
      >
      </bbva-global-scheduled-transfer-api-dm>
    `}_noAccountsModal(){return d`
      <bbva-help-modal
        full-height
        header-type="modal"
        ?visible="${this._openNoAccountsModal}"
        header-text="${this.t("metas-saving-goals-header")}"
        link-text="${this.t("metas-saving-goals-ok")}"
        icon-right-primary=${ct()}
        @help-modal-footer-link-click="${this._popLatestRoute}"
        @help-modal-close="${this._popLatestRoute}"
      >
        <div slot="slot-content">
          <bbva-panel-info
            disabled-tabindex
            heading="${this.t("metas-saving-goals-no-accounts-title")}"
            text="${this.t("metas-saving-goals-no-accounts-text")}"
            .microillustration=${Ht}
          >
          </bbva-panel-info>
        </div>
      </bbva-help-modal>
    `}_welcomeModal(){return d`
      <bbva-help-modal
        full-height
        header-type="modal"
        ?visible="${this._openWelcomeModal}"
        header-text="${this.t("metas-saving-goals-create-goal-multistep-form-create-goal-title")}"
        button-text="${this.t("metas-saving-goals-welcome-modal-button")}"
        icon-right-primary=${ct()}
        @help-modal-footer-button-click="${()=>{this._handleNavigate({detail:{routeName:"createGoalForm"}}),this._openWelcomeModal=!1}}"
        @help-modal-close="${()=>{this._openWelcomeModal&&(this._popLatestRoute(),this._openWelcomeModal=!1)}}"
      >
        <div slot="slot-content">
          <bbva-panel-info
            disabled-tabindex
            heading="${this.t("metas-saving-goals-welcome-modal-title")}"
            text="${this.t("metas-saving-goals-welcome-modal-text")}"
            .microillustration=${Ht}
          >
          </bbva-panel-info>
        </div>
      </bbva-help-modal>
    `}_redirectPeriodicModal(){return d`
      <bbva-help-modal
        data-id="redirectPeriodicModal"
        id="redirectPeriodicModal"
        title-icon="${ht()}"
        body-text="${this.t("metas-saving-goals-periodic-modal-text")}"
        title-text="${this.t("metas-saving-goals-periodic-modal-title")}"
        button-text="${this.t("metas-saving-goals-periodic-modal-confirm")}"
        link-text="${this.t("metas-saving-goals-periodic-modal-cancel")}"
        modal-type="info"
        ?visible=${this._redirectPeriodicModalVisible}
        @help-modal-footer-button-click="${()=>{this._editScheduledTransfer({detail:this._scheduledTransferBody})}}"
        @help-modal-footer-link-click="${()=>{this._scheduledTransfer.status=Qo,this._typeModalPeriodic="CREATE",this._redirectPeriodicModalVisible=!1,this._periodicModalVisible=!0}}"
      ></bbva-help-modal>
    `}_continueCreateGoalMultiStep2(t){var e,i,a,s,o,n,r,l,d,c,u,h,g,m,p,v,b,_,f;(this._goalToCreate=t.detail.goal,null!==(e=this._goal)&&void 0!==e&&e.id)?(this._redirectMultiStep=!0,this._patchSavingGoal(this._goal.id,{description:null===(i=this._goalToCreate)||void 0===i?void 0:i.description,goalAmount:{amount:null===(a=this._goalToCreate)||void 0===a||null===(s=a.goalAmount)||void 0===s?void 0:s.amount,currency:null===(o=this._goalToCreate)||void 0===o||null===(n=o.goalAmount)||void 0===n?void 0:n.currency},goalPeriod:{expirationDate:null===(r=this._goalToCreate)||void 0===r||null===(l=r.goalPeriod)||void 0===l?void 0:l.expirationDate}})):(this._addLoading("postSavingGoals",(()=>{this._continueCreateGoalMultiStep2(t)})),this._savingGoalsDm.postSavingGoals({description:null===(d=this._goalToCreate)||void 0===d?void 0:d.description,goalAmount:{amount:null===(c=this._goalToCreate)||void 0===c||null===(u=c.goalAmount)||void 0===u?void 0:u.amount,currency:null===(h=this._goalToCreate)||void 0===h||null===(g=h.goalAmount)||void 0===g?void 0:g.currency},goalPeriod:{expirationDate:null===(m=this._goalToCreate)||void 0===m||null===(p=m.goalPeriod)||void 0===p?void 0:p.expirationDate},status:{id:"SIMULATED"},savingContract:{id:null===(v=this._goalToCreate)||void 0===v||null===(b=v.savingContract)||void 0===b?void 0:b.id,product:{productType:{id:"ACCOUNTS"}}},goalOrigin:{id:this.originType},goalPurpose:{id:null===(_=this._goalToCreate)||void 0===_||null===(f=_.goalPurpose)||void 0===f?void 0:f.id},currentAmount:{amount:0,currency:"MXN"}}))}_updateGoalNameFromStep2(){var t,e,i,a,s,o,n,r,l,d;(null===(t=this._goalToCreate)||void 0===t?void 0:t.description)!==(null===(e=this._goal)||void 0===e?void 0:e.description)&&this._step2Completed&&this._patchSavingGoal(null===(i=this._goal)||void 0===i?void 0:i.id,{description:null===(a=this._goalToCreate)||void 0===a?void 0:a.description,goalAmount:{amount:null===(s=this._goalToCreate)||void 0===s||null===(o=s.goalAmount)||void 0===o?void 0:o.amount,currency:null===(n=this._goalToCreate)||void 0===n||null===(r=n.goalAmount)||void 0===r?void 0:r.currency},goalPeriod:{expirationDate:null===(l=this._goalToCreate)||void 0===l||null===(d=l.goalPeriod)||void 0===d?void 0:d.expirationDate}})}async _activeContributionFormulas({detail:t}){if(t.activeRule){var e,i,a,s,o,n,r;this._ruleIdToUpdate=null===(e=t.rule)||void 0===e?void 0:e.id;const l={allowsNotifications:null===(i=t.rule)||void 0===i?void 0:i.allowsNotifications,senders:null===(a=t.rule)||void 0===a?void 0:a.senders,receivers:null===(s=t.rule)||void 0===s?void 0:s.receivers,roundRule:null===(o=t.rule)||void 0===o?void 0:o.roundRule,multiplierRule:null===(n=t.rule)||void 0===n?void 0:n.multiplierRule,goalAmount:(null===(r=t.rule)||void 0===r?void 0:r.goalAmount)||null,status:{id:tn}};this._patchRule(this._ruleIdToUpdate,l)}if(t.activeScheduled){var l,d,c,u,h,g;const t={sender:this._scheduledTransfer.sender,receiver:{contract:{number:null===(l=this._savingGoalAccount)||void 0===l?void 0:l.number}},sentMoney:{currency:null===(d=this._parametry)||void 0===d||null===(c=d.currencies[0])||void 0===c?void 0:c.id,amount:null===(u=this._scheduledTransfer)||void 0===u||null===(h=u.sentMoney)||void 0===h?void 0:h.amount},period:this._scheduledTransfer.period,concept:null===(g=this._goal)||void 0===g?void 0:g.id,frequency:this._scheduledTransfer.frequency,status:tn};this._scheduledTransferIdToUpdate=this._scheduledTransfer.id,this._patchScheduledTransfer(this._scheduledTransfer.id,t)}this._editGoalToastShow=!0,this._popLatestRoute()}_resetSuccessful(){this._isGoalCreated=!1,this._goalId="",this._creationWithActiveRule=!1,this._creationWithActiveScheduledTransfer=!1,this._isActivePeriodicContribution=!1,this._isActivePurchaseContribution=!1,this._updateGoalValidErrorVisible=!1,this._updateRuleValidErrorVisible=!1,this._updateScheduledValidErrorVisible=!1,this._isAccountCreated=!1}_dispatchTraceEvent({detail:t}){var e;const i={...t,hasPlan:Boolean(null===(e=this._savingGoalAccount)||void 0===e?void 0:e.id)};this.dispatchEvent(new CustomEvent("metas-saving-goals-trace-route",{bubbles:!0,composed:!0,detail:i}))}_dispatchClickEvent({detail:t}){var e;const i={...t,hasPlan:Boolean(null===(e=this._savingGoalAccount)||void 0===e?void 0:e.id)};this.dispatchEvent(new CustomEvent("metas-saving-goals-click-event",{bubbles:!0,composed:!0,detail:i}))}_setSummaryDetail({detail:t}){this._summaryDetail=t}render(){var t,e,i,a;return d`
      ${super.render()} ${this._savingGoalRulesApiDM()}${this._cardsApiDM()}
      ${this._selfDrivenApiDM()}${this._selfDrivenRuleApiDM()} ${this._savingGoalsParametryApiDM()}
      ${this._savingGoalsApiDM()} ${this._savingGoalApiDM()} ${this._accountApiDM()}
      ${this._accountsApiDM()} ${this._contributionsApiDM()} ${this._savingGoalRuleApiDM()}
      ${this._scheduledTransfersApiDM()} ${this._scheduledTransferApiDM()}
      <bbva-transition-container
        id="list-goals"
        title="${this.t("metas-saving-goals-header")}"
        visible="${c(this._listGoalsVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-list-goals
            language="${this.language}"
            limit-goals="${this._limitGoals}"
            list-goals-visible="${c(this._listGoalsVisible&&0===this._allLoading.length||void 0)}"
            required-token="${this.requiredToken}"
            saving-goals-api-version="${this.savingGoalsApiVersion}"
            .headers="${this.headers}"
            .host="${this.host}"
            ?native="${this.native}"
            .listGoals="${this._listGoals}"
            @metas-saving-goals-list-goals-navigate=${this._handleNavigate}
            @header-main-icon-left-primary-click=${this._popLatestRoute}
            @header-main-icon-right-secondary-click=${this._handleHeaderSecondaryIcon}
            @metas-saving-goals-list-goals-create-goal=${this._dispatchClickEvent}
            @metas-saving-goals-list-goals-trace-route=${this._dispatchTraceEvent}
          ></metas-saving-goals-list-goals>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="list-goals-dashboard"
        title="${this.t("metas-saving-goals-list-goals-dashboard-title")}"
        visible="${c(this._listGoalsDashboardVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-list-goals-dashboard
            language="${this.language}"
            limit-goals="${this._limitGoals}"
            required-token="${this.requiredToken}"
            saving-goals-alias="${this.savingGoalsAlias}"
            saving-goals-api-version="${this.savingGoalsApiVersion}"
            .dashboardAccount="${this._dashboardAccount}"
            .headers="${this.headers}"
            .host="${this.host}"
            ?native="${this.native}"
            .listGoals="${this._listGoals}"
            ?visible="${this._listGoalsDashboardVisible}"
            @metas-saving-goals-list-goals-dashboard-navigate=${this._handleNavigate}
            @metas-saving-goals-list-goals-dashboard-exit=${this._popLatestRoute}
          ></metas-saving-goals-list-goals-dashboard>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="edit-goal"
        visible=${c(this._editGoalVisible||void 0)}
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-edit-goal
            edit-goal-visible="${c(this._editGoalVisible||void 0)}"
            end-date="${this._endDate}"
            max-length-title="${this.maxLengthTitle}"
            max-length-amount="${this.maxLengthAmount}"
            .goal="${this._goal}"
            @metas-saving-goals-edit-goal-update-goal-ok=${this._saveGoal}
            @header-main-icon-right-primary-click=${this._openExitConfirmationModal}
            @header-main-icon-right-secondary-click=${this._handleHeaderSecondaryIcon}
            @metas-saving-goals-edit-goal-trace-route=${this._dispatchTraceEvent}
          ></metas-saving-goals-edit-goal>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="detail-goal"
        class="detail-goal"
        visible="${c(this._detailGoalVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-detail-goal
            language="${this.language}"
            saving-goals-transfer="${c(this.savingGoalsTransfer||void 0)}"
            .goal="${this._goal}"
            .listGoals="${this._listGoals}"
            .listRules="${this._listRules}"
            .rulesByGoal="${this._rulesByGoal}"
            .listAccounts="${this._listAccounts}"
            .savingGoalAccount="${this._savingGoalAccount}"
            .listContributions="${this._listContributions}"
            .scheduledTransferByGoal="${this._scheduledTransferByGoal}"
            ?visible="${this._detailGoalVisible}"
            @metas-saving-goals-detail-goal-navigate=${this._handleNavigate}
            @header-main-icon-left-primary-click=${this._popLatestRoute}
            @metas-saving-goals-detail-exit=${this._handleHeaderSecondaryIcon}
            @metas-saving-goals-detail-goal-delete-goal=${this._deleteGoal}
            @metas-saving-goals-detail-navigate-back=${this._popLatestRoute}
            @metas-saving-goals-detail-goal-trace-route="${this._dispatchTraceEvent}"
            @metas-saving-goals-detail-goal-more-info-modal="${()=>{this._openMoreInfoScheduledModal=!0}}"
          ></metas-saving-goals-detail-goal>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="refund-goals"
        visible=${c(this._refundGoalVisible||void 0)}
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-refund-goal
            language="${this.language}"
            open-confirmation-modal="${c(this._successOperativeInfo&&this._refundGoalVisible||void 0)}"
            operation-number="${this._operationNumber}"
            .goal="${this._goal}"
            .savingGoalAccount="${this._savingGoalAccount}"
            .listAccounts="${this._listAccounts}"
            ?visible="${this._refundGoalVisible}"
            @metas-saving-goals-refund-goal-save-refund="${this._postContributions}"
            @metas-saving-goals-refund-goal-refund-goal-ok="${this._refreshFromSuccessModalOperative}"
            @metas-saving-goals-refund-goal-exit="${this._openExitConfirmationModal}"
            @header-main-icon-right-secondary-click=${this._handleHeaderSecondaryIcon}
            @metas-saving-goals-refund-goal-create-goal="${this._handleNavigate}"
            @metas-saving-goals-refund-goal-trace-route=${this._dispatchTraceEvent}
          ></metas-saving-goals-refund-goal>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="contribute-goal"
        visible="${c(this._contributeGoalVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-contribute-goal
            language="${this.language}"
            open-confirmation-modal="${c(this._successOperativeInfo&&this._contributeGoalVisible||void 0)}"
            operation-number="${this._operationNumber}"
            .goal="${this._goal}"
            .savingGoalAccount="${ws(this._savingGoalAccount)?this._dashboardAccount:this._savingGoalAccount}"
            .listAccounts="${this._listAccounts}"
            ?visible="${this._contributeGoalVisible}"
            @metas-saving-goals-contribute-goal-save-contribution="${this._postContributions}"
            @metas-saving-goals-contribute-goal-contribute-goal-ok=${this._refreshFromSuccessModalOperative}
            @metas-saving-goals-contribute-goal-exit=${this._openExitConfirmationModal}
            @header-main-icon-right-secondary-click=${this._handleHeaderSecondaryIcon}
            @metas-saving-goals-contribute-goal-trace-route=${this._dispatchTraceEvent}
          ></metas-saving-goals-contribute-goal>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="transfer-between-goals"
        visible="${c(this._transferBetweenGoalsVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-transfer-between-goals
            language="${this.language}"
            open-confirmation-modal="${c(this._successOperativeInfo&&this._transferBetweenGoalsVisible||void 0)}"
            .goal="${this._goal}"
            .listGoals="${this._listGoals}"
            .savingGoalAccount="${ws(this._savingGoalAccount)?this._dashboardAccount:this._savingGoalAccount}"
            ?visible="${this._transferBetweenGoalsVisible}"
            @metas-saving-goals-transfer-between-goals-save-transfer="${this._postContributions}"
            @metas-saving-goals-transfer-between-goals-transfer-between-goals-ok="${this._refreshFromSuccessModalOperative}"
            @metas-saving-goals-transfer-between-goals-exit="${this._openExitConfirmationModal}"
            @header-main-icon-right-secondary-click=${this._handleHeaderSecondaryIcon}
          ></metas-saving-goals-transfer-between-goals>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="delete-goals"
        visible="${c(this._deleteGoalVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-delete-goal
            delete-goal-visible="${c(this._deleteGoalVisible||void 0)}"
            language="${this.language}"
            open-success-modal="${c(this._successOperativeInfo&&this._deleteGoalVisible||void 0)}"
            operation-number="${this._operationNumber}"
            .goal="${this._goal}"
            .listAccounts="${this._listAccounts}"
            .savingGoalAccount="${this._savingGoalAccount}"
            @metas-saving-goals-delete-goal-exit="${this._openExitConfirmationModal}"
            @metas-saving-goals-delete-goal-delete-goal-ok="${this._refreshFromSuccessModalOperative}"
            @header-main-icon-right-secondary-click="${this._handleHeaderSecondaryIcon}"
            @metas-saving-goals-delete-goal-delete="${this._postContributions}"
          ></metas-saving-goals-delete-goal>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="withdraw-savings"
        visible="${c(this._withdrawSavingsVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-withdraw-savings
            language="${this.language}"
            open-confirmation-modal="${c(this._successOperativeInfo&&this._withdrawSavingsVisible||void 0)}"
            operation-number="${this._operationNumber}"
            withdraw-savings-visible="${c(this._withdrawSavingsVisible||void 0)}"
            .goal="${this._goal}"
            .listAccounts="${this._listAccounts}"
            .savingGoalAccount="${this._savingGoalAccount||this._dashboardAccount}"
            .withdrawal="${this._withdrawal}"
            @metas-saving-goals-withdraw-savings-exit="${this._openExitConfirmationModal}"
            @metas-saving-goals-withdraw-savings-delete-goal-ok="${this._refreshFromSuccessModalOperative}"
            @header-main-icon-right-secondary-click="${this._handleHeaderSecondaryIcon}"
            @metas-saving-goals-withdraw-savings-delete="${this._postContributions}"
            @metas-saving-goals-withdraw-savings-create-goal="${t=>{this._popLatestRoute(),this._handleNavigate(t)}}"
          ></metas-saving-goals-withdraw-savings>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="contribution-formulas"
        visible="${c(this._contributionFormulasVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-contribution-formulas
            contribution-formulas-visible="${c(this._contributionFormulasVisible||void 0)}"
            open-modal-list-formulas="${c(this._openModalListFormulas||void 0)}"
            retry-contribution=${c(this._retryContribution||void 0)}
            language="${this.language}"
            required-token="${this.requiredToken}"
            self-driven-api-version="${this.selfDrivenApiVersion}"
            .host="${this.host}"
            ?native="${this.native}"
            .headers=${this.headers}
            .listRules="${this._listRules}"
            .listCards="${this._listCards}"
            .scheduledTransfer="${this._scheduledTransferByGoal}"
            .savingGoalAccount="${this._savingGoalAccount}"
            .rulesByGoal="${this._rulesByGoal}"
            @exit="${this._openExitConfirmationModal}"
            @header-main-icon-right-secondary-click="${this._handleHeaderSecondaryIcon}"
            @metas-saving-goals-contribution-formulas-exit="${this._popLatestRoute}"
            @metas-saving-goals-contribution-formulas-update-rule="${this._updateRule}"
            @metas-saving-goals-contribution-formulas-update-scheduled-transfer="${this._updateScheduledTransfer}"
            @metas-saving-goals-contribution-formulas-navigate="${this._navigateRules}"
            @metas-saving-goals-contribution-formulas-delete-per-purchase-contribution="${this._deleteRule}"
            @metas-saving-goals-contribution-formulas-delete-scheduled-contribution="${()=>{this._deleteScheduledTransfer(),this._redirectMultiStep=!0}}"
            @metas-saving-goals-scheduled-contribution="${this._openPeriodicModal}"
            @metas-saving-goals-contribution-formulas-more-info-modal="${()=>{this._openMoreInfoScheduledModal=!0;this._dispatchTraceEvent({detail:{route:"modalMoreInfoContributions"}})}}"
            @metas-saving-goals-contribution-formulas-error-get-rule="${this._getContributionError}"
            @open-modal="${t=>{this._openModalListFormulas=t.detail,this._openModalListFormulas&&this._dispatchTraceEvent({detail:{route:"modalListFormulas"}})}}"
          ></metas-saving-goals-contribution-formulas>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="successful-create-goal"
        visible="${c(this._successfulCreateGoalVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-successful-create-goal
            is-active-purchase-contribution="${c(this._isActivePurchaseContribution||void 0)}"
            is-active-periodic-contribution="${c(this._isActivePeriodicContribution||void 0)}"
            language="${this.language}"
            operation-number="${this._operationNumber}"
            successful-create-goal-visible="${c(this._successfulCreateGoalVisible||void 0)}"
            update-goal-valid-error-visible="${c(this._updateGoalValidErrorVisible||void 0)}"
            update-rule-valid-error-visible="${c(this._updateRuleValidErrorVisible||void 0)}"
            update-scheduled-valid-error-visible="${c(this._updateScheduledValidErrorVisible||void 0)}}"
            .documentsOperation="${this.documentsOperation}"
            .goal="${this._goal}"
            .isAccountCreated="${this._isAccountCreated}"
            .listAccountsActivated="${this._listAccountsActivated}"
            .savingGoalAccount="${this._savingGoalAccount}"
            .summaryDetail="${this._summaryDetail}"
            ?isGoalCreated="${this._isGoalCreated}"
            @metas-saving-goals-successful-create-goal-create="${this._createSavingGoalsAccount}"
            @header-main-icon-right-secondary-click="${this._handleHeaderSecondaryIcon}"
            @metas-saving-goals-successful-navigate-detail-goal=${t=>{this._handleNavigate(t)}}
            @metas-saving-goals-sucessful-create-goal-create-account-exit=${()=>{this._popLatestRoute(),this._resetSuccessful()}}
            @metas-saving-goals-successful-create-goal-trace-route="${this._dispatchTraceEvent}"
          ></metas-saving-goals-successful-create-goal>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="create-goal-multistep-form"
        visible="${c(this._createGoalFormVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-create-goal-multistep-form
            calculate-api-version="${this.calculateApiVersion}"
            create-goal-form-visible="${c(this._createGoalFormVisible||void 0)}"
            currency="${null===(t=this._parametry)||void 0===t||null===(e=t.currencies[0])||void 0===e?void 0:e.id}"
            language="${this.language}"
            max-length-amount="${this.maxLengthAmount}"
            max-length-title="${this.maxLengthTitle}"
            operation-type="${this._operationType}"
            rounding-total="${this._roundingTotal}"
            session-name="${this.sessionName}"
            simulate-savings-api-version="${this.simulateSavingsApiVersion}"
            step2-completed="${c(this._step2Completed||void 0)}"
            transfers-management-api-version="${this.transfersManagementApiVersion}"
            .cardWithOutAccount="${this._cardWithOutAccount}"
            .documentsOperation="${this.documentsOperation}"
            .endDate="${this._endDate}"
            .goal="${this._goal}"
            .headers="${this.headers}"
            .host="${this.host}"
            ?native="${this.native}"
            .listAccounts="${this._listAccounts}"
            .listCards="${this._listCards}"
            .requiredToken=${this.requiredToken}
            .rule="${this._rule}"
            .savingGoalAccount="${this._savingGoalAccount}"
            .scheduledTransfer="${this._scheduledTransfer}"
            @metas-saving-multistep-step2-create-goal-continue="${this._continueCreateGoalMultiStep2}"
            @metas-saving-multistep-step2-update-goal-continue="${({detail:t})=>{this._goalToCreate=t.goal,this._updateGoalNameFromStep2()}}"
            @header-main-icon-right-secondary-click=${this._handleHeaderSecondaryIcon}
            @header-main-icon-right-primary-click="${this._openExitConfirmationModal}"
            @metas-saving-goals-create-goal-multistep-navigate-rule="${this._navigateRules}"
            @metas-saving-goals-create-goal-multistep-emit-properties="${this._setPropertiesMultiStep}"
            @metas-saving-goals-create-goal-multistep-scheduled-transfer-create="${this._createScheduledTransfer}"
            @metas-saving-goals-create-goal-multistep-scheduled-transfer-edit="${this._editScheduledTransfer}"
            @metas-saving-goals-create-goal-multistep-post-error="${this._handlePostError}"
            @metas-saving-goals-create-goal-multistep-get-rule="${this._getRule}"
            @metas-saving-goals-create-goal-multistep-create-goal="${this._createGoalValid}"
            @metas-saving-goals-create-goal-multistep-open-periodic-modal="${this._openPeriodicModal}"
            @metas-saving-goals-algorithm-inform-loader="${({detail:{show:t,processName:e,callback:i}})=>{t?this._addLoading(e,i):this._clearLoader(e)}}"
            @metas-saving-goals-algorithm-more-info-modal="${()=>{this._openMoreInfoScheduledModal=!0}}"
            @metas-saving-goals-algorithm-purchase-contribution-change-status="${t=>{var e;this._creationWithActiveRule=null===(e=t.detail)||void 0===e?void 0:e.isActive}}"
            @metas-saving-goals-algorithm-periodic-contribution-change-status="${t=>{var e;this._creationWithActiveScheduledTransfer=null===(e=t.detail)||void 0===e?void 0:e.isActive}}"
            @metas-saving-goals-create-goal-multistep-form-event-click-toggle="${this._dispatchClickEvent}"
            @metas-saving-goals-create-goal-multistep-form-trace-route="${this._dispatchTraceEvent}"
            @metas-saving-goals-create-goal-multistep-summary-data="${t=>{this._setSummaryDetail(t)}}"
          ></metas-saving-goals-create-goal-multistep-form>
        </div>
      </bbva-transition-container>
      <bbva-transition-container
        id="algortihm"
        visible="${c(this._algorithmVisible||void 0)}"
        @transitionend="${()=>{this._clearLoader("changePage")}}"
      >
        <div slot="slot-content">
          <metas-saving-goals-algorithm
            calculate-api-version="${this.calculateApiVersion}"
            currency="${null===(i=this._parametry)||void 0===i||null===(a=i.currencies[0])||void 0===a?void 0:a.id}"
            host="${this.host}"
            ?native="${this.native}"
            is-edit-mode
            required-token=${this.requiredToken}
            rounding-total="${this._roundingTotal}"
            session-name="${this.sessionName}"
            simulate-savings-api-version="${this.simulateSavingsApiVersion}"
            transfers-management-api-version="${this.transfersManagementApiVersion}"
            language="${this.language}"
            .goal="${this._goal}"
            .savingGoalAccount="${this._savingGoalAccount}"
            .listCards="${this._listCards}"
            .listAccounts="${this._listAccounts}"
            .cardWithOutAccount="${this._cardWithOutAccount}"
            .rule="${this._rule}"
            .scheduledTransfer="${this._scheduledTransfer}"
            .config="${{fixedHeader:!0,back:!1,header:{variant:"modal",accessibilityTextIconLeftPrimary:this.t("metas-saving-goals-accessibility-icon-left-primary"),iconRightPrimary:ct(),text:this.t("metas-saving-goals-edit-goal-title")},loader:!0,notify:!1}}"
            .headers=${this.headers}
            ?algorithmVisible="${this._algorithmVisible}"
            ?callSimulation="${this._algorithmVisible||this._retrySimulate}"
            @metas-saving-goals-algorithm-more-info-modal="${()=>{this._openMoreInfoScheduledModal=!0}}"
            @metas-saving-goals-algorithm-navigate-rule="${this._navigateRules}"
            @metas-saving-goals-algorithm-navigate-continue="${this._activeContributionFormulas}"
            @metas-saving-goals-algorithm-scheduled-transfer-open-periodic-modal="${this._openPeriodicModal}"
            @metas-saving-goals-algorithm-scheduled-transfer-create="${this._createScheduledTransfer}"
            @metas-saving-goals-algorithm-get-rule="${this._getRule}"
            @metas-saving-goals-algorithm-post-error="${this._postSimulateError}"
            @metas-saving-goals-algorithm-exit="${this._popLatestRoute}"
            @metas-saving-goals-algorithm-event-click-toggle="${this._dispatchClickEvent}"
            @metas-saving-goals-algorithm-trace-route="${this._dispatchTraceEvent}"
            @metas-saving-goals-algorithm-inform-loader="${({detail:{show:t,processName:e,callback:i}})=>{t?this._addLoading(e,i):this._clearLoader(e)}}"
          ></metas-saving-goals-algorithm>
        </div>
      </bbva-transition-container>
      <bbva-progress-content ?visible="${this._allLoading.length>0}"></bbva-progress-content>
      ${this._exitConfirmModal} ${this._exitCreateAccountConfirmModal}
      ${this._deleteToastTemplate()}${this._noAccountsModal()}${this._welcomeModal()}
      ${this._periodicModal()}${this._redirectPeriodicModal()}
      ${this._getErrorModal()}${this._postErrorModal()}${this._moreInfoModal()}
      ${this._genericErrorModal()}${this._deleteErrorModal()}${this._updateErrorModal()}
      ${this._deleteRuleToastTemplate()}${this._confirmationScheduledModal()}${this._editGoalToastTemplate()}
    `}}export{Na as B,an as M,Pa as a,Ba as b,ja as c,za as d,Za as e};
