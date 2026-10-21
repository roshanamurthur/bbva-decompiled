import{z as t,ar as i,a as e,L as a,y as r,ah as o,aN as n,ai as s,ak as l,h as c,i as d,a8 as h,ac as p,a9 as b,ap as m,an as g,ag as v,F as u,b$ as y,bx as f,b1 as k,c0 as x,f as _,g as $,H as S,aX as w,v as C,u as L,cI as T,cJ as E,aD as P,ad as B,ab as N,aa as I,b0 as A,aJ as F,bj as D,b6 as M,dt as O,av as V,o as q,aY as R,b3 as z,aw as U,b4 as j,b5 as H,cD as G,dG as W,A as X,ch as J,au as Y,bd as Z,as as K,at as Q,V as tt,S as it,af as et,j as at,r as rt,di as ot}from"./952f98a9.js";import{d as nt}from"./216055dc.js";import{B as st}from"./1d5112ec.js";import{a$ as lt}from"./7f3d7ca9.js";import{B as ct}from"./e1831171.js";import"./7cfc68eb.js";import"./3e14f6f9.js";import"./c0a2f832.js";import"./cae0f1de.js";var dt=t`:host {
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
${(new i).mediaRules()}`;class ht extends(e(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:o(),warning:o(),error:n(),success:s()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:i,type:e=this.defaultType,duration:a=this.duration}={}){const r=e;this._stack.push({type:r,description:t,simpleLinkText:i,duration:a}),this._showNextInStack()}static get styles(){return[dt,l("bbva-notification-container-shared-styles")]}render(){return c`
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
    `}}var pt=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${h(b.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(b.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${h(b.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${h(b.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${h(b.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(b.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${h(b.primarySubduedLight)}));
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
`;class bt extends(e(m(g(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":u,"bbva-badge-notification":y}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},i=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,e=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(i,e);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[pt,l("bbva-header-main-shared-styles"),f("button:focus"),k.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return c`<bbva-icon icon="${d(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return c`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,i,e,a){const r=bt.toCamelCase(t),o=`icon${r}`,n=`accessibilityTextIcon${r}`;return c`<button
      class="${i}"
      id="btn-${t}"
      aria-label="${d(this.t(this[n]))}"
      aria-expanded=${d(a)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(e):""}
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:i,text:e,image:a,_hasMicroillustration:r}=this;return c`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${i}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(e)}
          tabindex="-1"
        >
          ${e&&" "!==e&&this._tplHeading(e)||""}
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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}$("colors.primaryCoreLightened"),$("colors.cool80"),$("colors.cool70"),$("colors.primaryCoreLightened"),$("colors.cool100"),$("colors.tertiaryType6Darkened"),$("colors.tertiaryType4Darkened"),$("colors.secondary300");const mt=S((t=>class extends(w(t)){static configurationScopedElements(){return[ht,C,bt,L]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,i){const e=`_${t}`;return this[e]||(this[e]=document.createElement(t)),"object"==typeof i&&Object.keys(i).forEach((t=>{"@"===t[0]?this[e].addEventListener(t.substring(1),i[t]):this[e][t]=i[t]})),this._setPrimaryLeftIcon(t,e),this._setSecondaryRightIcon(t,e),c`${this[e]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,i){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[i].iconLeftPrimary=this.config.header.iconLeftPrimary||T();const t="@header-main-icon-left-primary-click",e=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[i].removeEventListener("header-main-icon-left-primary-click",e),this[i].addEventListener("header-main-icon-left-primary-click",e)}}_setSecondaryRightIcon(t,i){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[i].iconRightSecondary=this[i].iconRightSecondary||this.config.smartAssistant&&E()||this.config.faqs&&P())}_dispatchCustomEvent(t,i=!0,e=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:e,composed:a,detail:i,cancelable:!0}))}showLoader(t="full",i=!1,e=!1){const a={variant:t,showSpinnerMessageLabel:i,loginAnimation:e};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,i,e,a){const r={description:t,simpleLinkText:i,type:e,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:i=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:i},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,i,e;return c`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(i=this.config)&&void 0!==i&&i.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(e=this.config)||void 0===e?void 0:e.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,i,e,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(i=this.config)||void 0===i?void 0:i.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(e=this.config)||void 0===e?void 0:e.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return c`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((i=>t[i].condition?this._tpl(i,t[i].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));var gt=t`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${h(b.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${h(b.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${h(b.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${h(b.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${h(B.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(N.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${h(B.typeLarge)});
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
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
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
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
`,vt=t`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,ut=t`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${h(b.primaryMedium)});
}
`;const yt={light:t`
    ${A.light}
    ${vt}
  `,dark:t`
    ${A.dark}
    ${ut}
  `};class ft extends(F(e(m(g(a))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":D,"bbva-link":M,"bbva-text":v}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=O,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[gt,super.styles,l("bbva-panel-info-shared-styles"),yt.light,yt.dark]}get _contentImage(){return this.image?c` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:c`
      <span
        class="${V({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===O}render(){return c`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&c`
          <bbva-text
            tabindex="0"
            class="title ${V({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${d(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&c`
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
        ${c` <slot></slot> `}
        ${this.linkText&&c`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.cool50");var kt=t`:host {
  display: block;
  box-sizing: border-box;
}

.portfolio {
  margin-bottom: 1rem;
}

.portfolio .content {
  display: flex;
  justify-content: space-between;
}

.portfolio .content .name {
  max-width: 10rem;
  padding-left: 1rem;
  --bbva-text-font-weight: ${h(R.fontWeight40)};
}

.portfolio .content [data-tag-name=bbva-text] {
  padding-left: 1rem;
}

.portfolio .content [data-tag-name=bbva-amount] {
  margin: auto 0;
  padding-right: 1rem;
}

.portfolio:active {
  background-color: var(--colorsSecondary100);
}
`;class xt extends(mt(z(g(a)))){static get is(){return"portfolio-info"}static get scopedElements(){const t=[v,U,j,H,G,...xt.configurationScopedElements()];return xt.scopedElementsFromClasses(t)}static get properties(){return{id:{type:String},name:{type:String},amount:{type:String},currency:{type:String},currencyCode:{type:{String:String},attribute:"currency-code"},formatNumber:{type:String,attribute:"format-number"}}}static get styles(){return[kt,l("portfolio-info-shared-styles")]}constructor(){super(),this.id="",this.name="",this.amount="",this.currency="",this.formatNumber="",this.currencyCode=""}_handlePortfolio(){const t={name:this.name,index:this.id,amount:this.amount};this._fireEvent("unit-linked-portfolio-info",t)}_fireEvent(t,i){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:i}))}_bbvaPortfolios(){return c`
      <div class="portfolio">
        <div class="content">
          <bbva-text            
            class="name"
            size="XS"
            text="${this.name}">
          </bbva-text>
          <bbva-amount
            @click="${()=>{this._handlePortfolio()}}"
            class="amount"
            amount="${this.amount}"
            variant="s"
            language="${this.formatNumber}"
            currency-code="${this.currencyCode}">
          </bbva-amount>
        </div>
        <bbva-divider></bbva-divider>
      </div>    
    `}render(){return c`    
      ${this._bbvaPortfolios()}
    `}}var _t=t`:host {
  margin: 1rem;
  display: block;
  box-sizing: border-box;
}

[data-tag-name=bbva-foundations-spinner] {
  margin: 5rem;
}

.balances-content {
  box-shadow: var(--boxShadowType2, 0 0.0625rem 0.1875rem 0 var(--bbva-cool, fallbackVar("foundations.colors.cool20")));
  background: var(--colorsPrimaryCoreLightened);
}

.balances-content [data-tag-name=bbva-text] {
  margin-left: 1rem;
  padding-top: 1rem;
  --bbva-text-font-weight: ${h(R.fontWeight40)};
}
`;class $t extends(mt(z(g(a)))){static get is(){return"portfolios-list"}static get scopedElements(){const t=[v,xt,j,ft,H,W,G,st,...$t.configurationScopedElements()];return $t.scopedElementsFromClasses(t)}static get properties(){return{portfolioApiVersion:{type:String,attribute:"bp-api-version"},productId:{type:String,attribute:"product-id"},_portfolioList:{type:Array},isFirstUpdatedCompleted:{type:Boolean,attribute:"start-unit-linked"},isGoBackActivated:{type:Boolean,attribute:"go-back"},isContentLoading:{type:Boolean,attribute:"loading"},isMessageErrorShowed:{type:Boolean,attribute:"loading-message-error"},currencyCode:{type:{String:String},attribute:"currency-code"},formatNumber:{type:String,attribute:"format-number"},_buttonErrorCounter:{type:Number}}}static get styles(){return[_t,l("portfolios-list-shared-styles")]}constructor(){super(),this.host="",this.native=!1,this.productId="",this.currencyCode="",this.formatNumber="",this.requiredToken="",this._portfolioList=[],this.isContentLoading=!1,this.isGoBackActivated=!1,this._buttonErrorCounter=0,this.isMessageErrorShowed=!1,this._isMaskSpinnerActivated=!1,this.isFirstUpdatedCompleted=!1}firstUpdated(){this._isMaskSpinnerActivated=!0}updated(t){t.has("isFirstUpdatedCompleted")&&this.isFirstUpdatedCompleted&&this._startUinitLinkedExpandBalances(),t.has("isGoBackActivated")&&this.isGoBackActivated&&(this.isContentLoading=!0,this.isMessageErrorShowed=!1)}_setUpDataProviderBankingPortfolio(){this._bankingPortfolioDp=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-banking-portfolios"]')}_getPrivateBankingPortfolioExpandBalances(){const t={portfolioId:this.productId,expand:"balances"};this._bankingPortfolioDp.getPrivateBankingPortfolio(t)}_handleBankingPortfoliosSuccess({detail:t}){t.balances&&(this._portfolioList=t.balances.increases,this.isContentLoading=!1,this.isMessageErrorShowed=!1)}_handleBankingPortfoliosError(){this.isContentLoading=!1,this.isMessageErrorShowed=!0,this._fireEvent("unit-linked-portfolio-list-error")}_startUinitLinkedExpandBalances(){this.isContentLoading=!0,this._setUpDataProviderBankingPortfolio(),this._getPrivateBankingPortfolioExpandBalances()}_retryButtonCounter(){this._buttonErrorCounter+=1,this.productId&&(this.isMessageErrorShowed=!1,this._startUinitLinkedExpandBalances())}_fireEvent(t,i){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:i}))}_bbvaPrivateBankingPortfolio(){return c`
      <bbva-dataprovider-banking-portfolios
        id="bankingPortfolioDp"
        .host="${this.host}"
        ?native="${this.native}"
        .apiVersion="${this.portfolioApiVersion}"
        .requiredToken="${this.requiredToken}"
        @get-private-banking-portfolio-error="${this._handleBankingPortfoliosError}"
        @get-private-banking-portfolio-success="${this._handleBankingPortfoliosSuccess}">
      </bbva-dataprovider-banking-portfolios>
    `}_bbvaPortfolioList(){return this._portfolioList.length>0?c`
        <div class="balances-content">
          <bbva-text
            size="S"
            text="${this.t("bbva-feature-unit-linked-portfolios")}">
          </bbva-text>
          ${this._portfolioList.map(((t,i)=>c`
            <portfolio-info
              id="${i}"
              name="${t.increaseType.name}"
              amount="${t.currentBalance.amount}"
              currency="${t.currentBalance.currency}"
              currency-code="${this.currencyCode}"
              format-number="${this.formatNumber}">
            </portfolio-info>
          `))}
        </div>
      `:c`
      <bbva-panel-info
        text="${this.t("bbva-feature-unit-linked-empty-portfolios")}">
      </bbva-panel-info>    
    `}_bbvaMessageError(){return c`
      <bbva-notification-message
        variant="error"
        link-title="${this._buttonErrorCounter>2?"":this.t("bbva-feature-unit-linked-show-message-error-retry")}"
        @notification-message-link-click="${this._retryButtonCounter}">
        ${this.t("bbva-feature-unit-linked-expand-balances-error")}
      </bbva-notification-message>
    `}_bbvaSpinnerLoading(){return c`
      <bbva-foundations-spinner
        ?with-mask="${this._isMaskSpinnerActivated}">
      </bbva-foundations-spinner>    
    `}render(){const t=this.isContentLoading?c`${this._bbvaSpinnerLoading()}`:this.isMessageErrorShowed?c`${this._bbvaMessageError()}`:c`${this._bbvaPortfolioList()}`;return c`
      ${t}
      ${this._bbvaPrivateBankingPortfolio()}
    `}}var St=t`:host {
  display: block;
  box-sizing: border-box;
  margin-top: 4rem;
}

[data-tag-name=bbva-header-main] {
  position: fixed;
  width: 100%;
}

[data-tag-name=bbva-panel-detail] {
  margin: 1rem;
  background: var(--colorsPrimaryCoreLightened);
}

[data-tag-name=bbva-notification-message] {
  margin: 1rem;
}

[data-tag-name=bbva-button-row] {
  background-color: var(--statusColorsPending);
  --bbva-button-action-color: ${h(b.primaryCoreLightened)};
}
`;class wt extends(mt(z(g(a)))){static get is(){return"unit-linked-detail"}static get scopedElements(){const t=[X,lt,ct,G,st,...wt.configurationScopedElements()];return wt.scopedElementsFromClasses(t)}static get properties(){return{productId:{type:String,attribute:"product-id"},portfolioApiVersion:{type:String,attribute:"bp-api-version"},amount:{type:Number},panelFormat:{type:{String:String},attribute:"panel-format"},panelCurrencyCode:{type:{String:String},attribute:"currency-code"},isMessageErrorShowed:{type:Boolean,attribute:"loading-message-error"},isPanelDetailLoading:{type:Boolean,attribute:"loading-panel-detail"},isGoBackActivated:{type:Boolean,attribute:"go-back"},headerMasked:{type:String,attribute:"header-masked"},configButtons:{type:Array},policyAlias:{type:String,attribute:"policy-alias"},_policyAmount:{type:Number},_policyCurrency:{type:String},isFirstUpdatedCompleted:{type:Boolean,attribute:"start-unit-linked"},editAliasConfig:{type:Object},_buttonErrorCounter:{type:Number}}}static get styles(){return[St,l("unit-linked-detail-shared-styles")]}constructor(){super(),this.configButtons=[{icon:J(),label:"Editar alias"}],this.productId="",this.isMessageErrorShowed=!1,this.headerMasked="",this.panelFormat="",this.panelCurrencyCode="",this.policyAlias="",this._policyNumber="",this._policyAmount=0,this._policyCurrency="",this.editAliasConfig={},this._buttonErrorCounter=0,this.isFirstUpdatedCompleted=!1,this.isPanelDetailLoading=!1,this.isMessageErrorShowed=!1,this.isGoBackActivated=!1}updated(t){t.has("isFirstUpdatedCompleted")&&this.isFirstUpdatedCompleted&&this._startUinitLinkedDetail(),t.has("isGoBackActivated")&&this.isGoBackActivated&&(this.isPanelDetailLoading=!0,this.isMessageErrorShowed=!1)}_goToEditAlias(){this._fireEvent("unit-linked-navigation",{...this.editAliasConfig})}_setUpDataProviderBankingPortfolio(){this._bankingPortfolioDp=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-banking-portfolios"]')}_getPrivateBankingPortfolio(){const t={portfolioId:this.productId};this._bankingPortfolioDp.getPrivateBankingPortfolio(t)}_handleBankingPortfoliosSuccess({detail:t}){const{amount:i,currency:e}=t.portfolioValue;this._policyAmount=i,this._policyCurrency=this._getValuation(e),this.isPanelDetailLoading=!1,this.isMessageErrorShowed=!1,this._fireEvent("analytics-fire-fingerprint-unit-linked","unit-linked-panel-detail"),this._fireEvent("portfolio-policy-number",t.number)}_handleBankingPortfoliosError(){this.isPanelDetailLoading=!1,this.isMessageErrorShowed=!0,this._fireEvent("analytics-fire-fingerprint-unit-linked","unit-linked-panel-error-message")}_startUinitLinkedDetail(){this.isPanelDetailLoading=!0,this._setUpDataProviderBankingPortfolio(),this._getPrivateBankingPortfolio()}_bbvaPrivateBankingPortfolio(){return c`
      <bbva-dataprovider-banking-portfolios
        id="bankingPortfolioDp"
        .host="${this.host}"
        ?native="${this.native}"
        .apiVersion="${this.portfolioApiVersion}"
        .requiredToken="${this.requiredToken}"
        @get-private-banking-portfolio-error="${this._handleBankingPortfoliosError}"
        @get-private-banking-portfolio-success="${this._handleBankingPortfoliosSuccess}"
        @api-dm-error=${this._handleBankingPortfoliosError}>
      </bbva-dataprovider-banking-portfolios>
    `}_bbvaPanelDetail(){return c`
      <bbva-panel-detail
        link="${this.t("bbva-feature-unit-linked-reference-detail")}"
        .amount=${this._policyAmount}
        ?loading="${this.isPanelDetailLoading}"
        language="${this.panelFormat}"
        card-title="${this.policyAlias}"
        amount-info="${this._policyCurrency}"
        currency-code="${this.panelCurrencyCode}">
      </bbva-panel-detail>
    `}_bbvaNotificationMessage(){return c`
      <bbva-notification-message
        variant="error"
        link-title="${this._buttonErrorCounter>2?"":this.t("bbva-feature-unit-linked-show-message-error-retry")}"
        @notification-message-link-click="${this._retryButtonCounter}">
        ${this.t("bbva-feature-unit-linked-show-message-error")}
      </bbva-notification-message>
    `}_getValuation(t){return`${this.t("bbva-feature-unit-linked-reference-valuation")} ${t}`}_retryButtonCounter(){this._buttonErrorCounter+=1,this.productId&&(this.isMessageErrorShowed=!1,this._startUinitLinkedDetail())}_fireEvent(t,i){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:i}))}render(){return c`
      <bbva-header-main
        text="${this.headerMasked}"        
        icon-left-primary=${T()}
        accessibility-text-icon-left-primary="Return">
      </bbva-header-main>    
      
      ${this.isMessageErrorShowed?this._bbvaNotificationMessage():this._bbvaPanelDetail()}

      <bbva-button-row
        ambient="dark"
        variant="simple"
        ?loading="${this.isPanelDetailLoading}"
        ?disabled="${!!this.isMessageErrorShowed}"
        .options="${this.configButtons}"
        @button-row-item-click="${this._goToEditAlias}">
      </bbva-button-row>
      
      ${this._bbvaPrivateBankingPortfolio()}
    `}}var Ct=t`[ambient^=light] {
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
${(new i).mediaRules()}`;const Lt=new i;var Tt=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${h(b.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${h(b.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${h(b.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${h(b.primaryCoreLightened)});
}
${Lt.mediaRules()}`;const Et={dark:t`
    ${A.dark}
    ${Y.dark}
    ${Z.dark}
    ${Tt}
  `,light:t`
    ${A.light}
    ${Y.light}
    ${Z.light}
    ${Ct}
  `},Pt=new i;var Bt=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${h(b.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${h(b.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${h(b.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${h(b.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${h(b.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${h(b.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${h(b.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${h(b.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${h(b.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${h(b.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${h(b.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(N.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${h(N.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${h(N.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${h(N.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${h(N.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${h(N.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${h(I.spacer)}))) / 16) * 1rem);
}
${Pt.mediaRules()}`;class Nt extends(m(K(Q(F(e(g(a))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[U,M,it,v,et];return Nt.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Bt,Et.light,Et.dark,f("button:focus"),l("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return c`
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
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return c`
      <bbva-badge-variability
        disabled-tabindex
        .status=${t}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const t=tt(this.mask,this.maskChars,!0,this.visibleChars);return c`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,i="";return this.description?(t=this._tplText("description"),i="description"):this.mask?(t=this._mask,i="mask"):this._isValidAmount&&(t=this._amount,i="amount"),c`
      <dd class=${V({[`wrapper-${i}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){const i="actionLink"===t?`${t}AccessibilityText`:`${t}LinkAccessibilityText`;return c`
      <bbva-link
        class=${V({ellipsis:this[`${t}Ellipsis`]})}
        aria-label="${d(this.t(this[i]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${d(this.roleLink)} aria-live=${d(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const i=`${t}AccessibilityText`,e=`${t}TagText`,a=`${t}RoleText`,r=`${t}AriaLiveText`;return c`
      <bbva-text
        aria-label="${this.t(this[i])}"
        role="${d(this[a])}"
        aria-live="${d(this[r])}"
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag="${d(this[e])}"
      >
      </bbva-text>
    `}_tplText(t){return c` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const i=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${i}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return c`
      <dl>
        <dt class=${V({ellipsis:this.labelEllipsis})}>
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
    `}render(){let t=null;const i=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||i?i?this.renderStacked():this.renderDefault():this._tplText("label"):c` <div class="wrapper-description">${this._tplText("description")}</div> `,c`
      ${t}
      <div class="skeleton"></div>
    `}}$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.cool60"),$("colors.primaryCoreLightened"),$("colors.primarySubdued"),$("colors.primaryMediumLight"),$("colors.primarySubdued"),$("colors.primaryMediumLight"),$("colors.cool50");var It=t`
`;class At extends(mt(z(g(a)))){static get is(){return"unit-linked-more-info"}static get scopedElements(){const t=[Nt,H,r,...At.configurationScopedElements()];return At.scopedElementsFromClasses(t)}static get properties(){return{policyNumber:{type:String},showToast:{type:Boolean},fixToastBottom:{type:Boolean},toastNotification:{type:Object}}}static get styles(){return[It,l("unit-linked-more-info-shared-styles")]}constructor(){super(),this.showToast=!1,this.policyNumber="",this.fixToastBottom=!1,this.toastNotification=null}firstUpdated(){this.showToast=!0,this.fixToastBottom=!0,this.toastNotification=this.shadowRoot.querySelector('[data-tag-name="bbva-notification-toast"]')}_copyPolicyNumber(){this.toastNotification.show=this.showToast,navigator.clipboard.writeText(this.policyNumber),this._fireEvent("unit-linked-text-copied",this.policyNumber)}_fireEvent(t,i){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:i}))}render(){return c`
      <bbva-header-category
        text="GENERAL">
      </bbva-header-category>

      <bbva-list-simple
        id="productListSimple"
        label="Producto"
        description="${this.t("bbva-feature-unit-linked-more-info-product")}"
        variant="stacked">
      </bbva-list-simple>

      <bbva-list-simple
        id="policyListSimple"
        label="${this.t("bbva-feature-unit-linked-more-info-number-policy")}"
        description="${this.policyNumber}"
        action-link="Copiar"
        @click="${this._copyPolicyNumber}"
        variant="stacked">
      </bbva-list-simple>

      <bbva-notification-toast
        id="bbvaToast"
        type="success"
        ?fixed-bottom="${this.showToast}"
        icon-explainer="${s()}"
        auto-hide duration="2500">
        <p>${this.t("bbva-feature-unit-linked-more-info-copy-number")}<br>${this.policyNumber}</p>
      </bbva-notification-toast>    
    `}}var Ft=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}
`;class Dt extends(mt(z(g(a)))){static get is(){return"bbva-feature-unit-linked"}static get scopedElements(){const t=[$t,wt,At,ot,nt,...Dt.configurationScopedElements()];return Dt.scopedElementsFromClasses(t)}static get properties(){return{productId:{type:String},isFirstUpdatedCompleted:{type:Boolean},isFinancialOverviewRefreshed:{type:Boolean},editAliasConfig:{type:Object},_isGoBackActivated:{type:Boolean},isDetailVisible:{type:Boolean},amountFormat:{type:String},currencySymbol:{type:String},maskPoint:{type:String,attribute:"mask-point"},_headerMasked:{type:String},_policyNumber:{type:String}}}static get styles(){return[Ft,l("bbva-feature-unit-linked-shared-styles")]}constructor(){super(),this.maskPoint=" • ",this.productId="",this.amountFormat="",this._policyNumber="",this._headerMasked="",this.currencySymbol="",this.editAliasConfig={},this.isDetailVisible=!1,this._isGoBackActivated=!1,this.isFirstUpdatedCompleted=!1,this.isFinancialOverviewRefreshed=!1}firstUpdated(){this.isFirstUpdatedCompleted=!0,this.isFinancialOverviewRefreshed=!0}_setUpFinancialOverview(){this._financialOverviewDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financial-overview-api-dm"]')}_getFinancialOverview(){this._financialOverviewDm.getFinancialOverview()}_handleFinancialOverviewSuccess({detail:t}){const i=t.contracts.find((t=>t.id===this.productId)),{alias:e,number:a}=i;this._policyAlias=e,this._headerMasked=this._getMaskContent(e,a,4,1)}_handleFinancialOverviewError(){this._fireEvent("unit-linked-policy-number-error")}_startFinancialOverview(){this.productId&&(this._setUpFinancialOverview(),this._getFinancialOverview())}refreshFinancialOverview(){this.isFinancialOverviewRefreshed=!this.isFinancialOverviewRefreshed}refreshUnitLinked(){this._isGoBackActivated=!1,this.isFirstUpdatedCompleted=!0,this.isFinancialOverviewRefreshed=!1,this._startFinancialOverview()}goBack(t,i){this.isFirstUpdatedCompleted&&(this._isGoBackActivated=!0,this.isFirstUpdatedCompleted=!1),this._fireEvent(t,i)}_handletPolicyNumber({detail:t}){this._policyNumber=t}_getMaskContent(t,i,e,a){return t+this.maskPoint.repeat(a)+i.substring(i.length-e)}_panelLinkDetail(){this.isDetailVisible=!this.isDetailVisible,this.isDetailVisible?this._fireEvent("analytics-fire-fingerprint-unit-linked","unit-linked-detail-more-info"):this._fireEvent("analytics-fire-fingerprint-unit-linked","unit-linked-panel-detail")}_fireEvent(t,i){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:i}))}_bbvaFinancialOverview(){return c`
      <bbva-global-financial-overview-api-dm
        id="financialOverviewDm"
        .host="${this.host}"
        .version="${this.financialOverviewApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @financial-overview-api-dm-fetch="${this._handleFinancialOverviewSuccess}"
        @financial-overview-api-dm-fetch-error="${this._handleFinancialOverviewError}"
        @api-dm-error=${this._handleFinancialOverviewError}>
      </bbva-global-financial-overview-api-dm>
    `}render(){return c`
      <unit-linked-detail
        .host="${this.host}"
        ?native="${this.native}"
        ?go-back="${this._isGoBackActivated}"
        policy-alias="${this._policyAlias}"
        header-masked="${this._headerMasked}"
        product-id="${this.productId}"
        panel-format="${this.amountFormat}"
        currency-code="${this.currencySymbol}"
        required-token="${this.requiredToken}"        
        bp-api-version="${this.bankingPortfolioApiVersion}"
        .editAliasConfig="${this.editAliasConfig}"
        ?start-unit-linked="${this.isFirstUpdatedCompleted}"
        ?refresh-financial="${this.isFinancialOverviewRefreshed}"
        @button-row-item-click="${this.refreshFinancialOverview}"
        @panel-detail-link-click="${this._panelLinkDetail}"
        @header-main-icon-left-primary-click="${()=>{this.goBack("unit-linked-go-back")}}"
        @unit-linked-navigation="${()=>{this.goBack("unit-linked-edit-alias",{...this.editAliasConfig})}}"
        @portfolio-policy-number="${this._handletPolicyNumber}">
        </unit-linked-detail>

      <portfolios-list
        .host="${this.host}"
        ?native="${this.native}"
        product-id="${this.productId}"
        currency-code="${this.currencySymbol}"
        format-number="${this.amountFormat}"
        required-token="${this.requiredToken}"
        bp-api-version="${this.bankingPortfolioApiVersion}"
        ?go-back="${this._isGoBackActivated}"
        ?start-unit-linked="${this.isFirstUpdatedCompleted}">
      </portfolios-list>

      <bbva-transition-container
        ?visible="${this.isDetailVisible}"
        header-text="${this.t("bbva-feature-unit-linked-reference-detail")}"
        icon-left-primary="${T()}"
        @header-main-icon-left-primary-click="${this._panelLinkDetail}"
        ><div slot="slot-content">
          <unit-linked-more-info
            .policyNumber="${this._policyNumber}">
          </unit-linked-more-info>
        </div>
      </bbva-transition-container>
      
      ${this._bbvaFinancialOverview()}
    `}}class Mt extends Dt{static get is(){return"bbva-feature-unit-linked-mx"}static get properties(){return{}}}customElements.define(Mt.is,Mt);
