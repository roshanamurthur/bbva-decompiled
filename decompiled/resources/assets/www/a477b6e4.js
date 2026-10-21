import{z as e,ar as t,a,L as i,y as r,ah as s,aN as n,ai as o,ak as c,h as d,i as l,a8 as p,ac as h,a9 as m,ap as b,an as u,ag as v,F as g,b$ as y,bx as f,b1 as _,c0 as S,f as x,g as $,H as k,aX as C,v as w,u as P,cI as T,cJ as E,aD as I,b0 as R,au as L,bd as A,ab as D,aa as N,as as M,at as O,aJ as q,V as H,av as V,aw as B,b6 as j,S as z,af as F,j as U,r as G,o as W,aZ as X,J as K,b3 as J,ad as Y,aM as Q,aO as Z,bC as ee,cU as te,bb as ae,bU as ie,bg as re,b4 as se,dA as ne,dB as oe,aF as ce,cH as de,aL as le,cD as pe,di as he,bF as me}from"./952f98a9.js";import{aM as be,t as ue,aN as ve,b6 as ge,p as ye}from"./7f3d7ca9.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";var fe=e`:host {
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
${(new t).mediaRules()}`;class _e extends(a(i)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:s(),warning:s(),error:n(),success:o()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:a=this.defaultType,duration:i=this.duration}={}){const r=a;this._stack.push({type:r,description:e,simpleLinkText:t,duration:i}),this._showNextInStack()}static get styles(){return[fe,c("bbva-notification-container-shared-styles")]}render(){return d`
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
    `}}var Se=e`
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
`;class xe extends(a(b(u(i)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":g,"bbva-badge-notification":y}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,a=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,i=Math.max(t,a);return i in e?e[i]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Se,c("bbva-header-main-shared-styles"),f("button:focus"),_.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return d`<bbva-icon icon="${l(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return d`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,a,i){const r=xe.toCamelCase(e),s=`icon${r}`,n=`accessibilityTextIcon${r}`;return d`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${l(this.t(this[n]))}"
      aria-expanded=${l(i)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(e){return d` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${l(this.t(e))}"
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
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:a,image:i,_hasMicroillustration:r}=this;return d`
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
          <img src="${l(i)}" alt="" ?hidden="${!i}" id="image" aria-hidden="true" />

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
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}$("colors.primaryCoreLightened"),$("colors.cool80"),$("colors.cool70"),$("colors.primaryCoreLightened"),$("colors.cool100"),$("colors.tertiaryType6Darkened"),$("colors.tertiaryType4Darkened"),$("colors.secondary300");const $e=k((e=>class extends(C(e)){static configurationScopedElements(){return[_e,w,xe,P]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const a=`_${e}`;return this[a]||(this[a]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[a].addEventListener(e.substring(1),t[e]):this[a][e]=t[e]})),this._setPrimaryLeftIcon(e,a),this._setSecondaryRightIcon(e,a),d`${this[a]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||T();const e="@header-main-icon-left-primary-click",a=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",a),this[t].addEventListener("header-main-icon-left-primary-click",a)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&E()||this.config.faqs&&I())}_dispatchCustomEvent(e,t=!0,a=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:a,composed:i,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,a=!1){const i={variant:e,showSpinnerMessageLabel:t,loginAnimation:a};this._dispatchCustomEvent("show-loader",i)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,a,i){const r={description:e,simpleLinkText:t,type:a,duration:i};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,a;return d`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(a=this.config)||void 0===a?void 0:a.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,a,i;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(a=this.config)||void 0===a?void 0:a.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(i=this.config)||void 0===i?void 0:i.header}}}render(){const e=this._getElements();return d`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));var ke=e`[ambient^=light] {
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
${(new t).mediaRules()}`;const Ce=new t;var we=e`[ambient^=dark] {
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
${Ce.mediaRules()}`;const Pe={dark:e`
    ${R.dark}
    ${L.dark}
    ${A.dark}
    ${we}
  `,light:e`
    ${R.light}
    ${L.light}
    ${A.light}
    ${ke}
  `},Te=new t;var Ee=e`:host {
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
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${p(D.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${p(D.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${p(D.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${p(D.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${p(D.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${p(D.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
}
${Te.mediaRules()}`;class Ie extends(b(M(O(q(a(u(i))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[B,j,z,v,F];return Ie.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Ee,Pe.light,Pe.dark,f("button:focus"),c("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return d`
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
    `}get _mask(){const e=H(this.mask,this.maskChars,!0,this.visibleChars);return d`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${e.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let e=null;return this.actionIcon||this.actionSecondaryIcon?e=this._actionIcons:this.actionLink&&(e=this._tplLink("actionLink")),e}get _definitionDescriptionTpl(){let e=null,t="";return this.description?(e=this._tplText("description"),t="description"):this.mask?(e=this._mask,t="mask"):this._isValidAmount&&(e=this._amount,t="amount"),d`
      <dd class=${V({[`wrapper-${t}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){const t="actionLink"===e?`${e}AccessibilityText`:`${e}LinkAccessibilityText`;return d`
      <bbva-link
        class=${V({ellipsis:this[`${e}Ellipsis`]})}
        aria-label="${l(this.t(this[t]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(e)}"
      >
        <span role=${l(this.roleLink)} aria-live=${l(this.arialiveLink)}>
          ${this[e]}
        </span>
      </bbva-link>
    `}_tplNoLink(e){const t=`${e}AccessibilityText`,a=`${e}TagText`,i=`${e}RoleText`,r=`${e}AriaLiveText`;return d`
      <bbva-text
        aria-label="${this.t(this[t])}"
        role="${l(this[i])}"
        aria-live="${l(this[r])}"
        class="${e}"
        unset
        size="S"
        text="${this[e]}"
        tag="${l(this[a])}"
      >
      </bbva-text>
    `}_tplText(e){return d` ${this[`${e}Link`]?this._tplLink(e):this._tplNoLink(e)} `}_iconClick(e){this.dispatchEvent(new CustomEvent(`list-simple-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(e){const t=e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return d`
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
    `}render(){let e=null;const t=["stacked","stacked-center"].includes(this.variant);return e=this.label?this.description||this._isValidAmount||this.mask||t?t?this.renderStacked():this.renderDefault():this._tplText("label"):d` <div class="wrapper-description">${this._tplText("description")}</div> `,d`
      ${e}
      <div class="skeleton"></div>
    `}}$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.primaryCoreLightened"),$("colors.cool60"),$("colors.primaryCoreLightened"),$("colors.primarySubdued"),$("colors.primaryMediumLight"),$("colors.primarySubdued"),$("colors.primaryMediumLight"),$("colors.cool50");const Re="bbva-feature-credit-card-payment-own-cards-go-to-card-payment",Le="bbva-feature-credit-card-payment-own-cards-navigate-to-dashboard",Ae="show-global-retry-error",De="bbva-feature-credit-card-payment-own-cards-create-payment-promise-error",Ne="bbva-feature-credit-card-payment-own-cards-calculated-payment-promise-dates-error",Me="bbva-credit-card-payment-promise-open-calendar",Oe="bbva-credit-card-payment-promise-send-promise-dates",qe="bbva-credit-card-payment-promise-send-promise-initial-date",He="bbva-feature-credit-card-payment-own-cards-payment-promise-search-success",Ve="bbva-feature-credit-card-payment-own-cards-set-card-id",Be="bbva-feature-credit-card-payment-own-cards-get-card",je="bbva-feature-credit-card-payment-own-cards-payment-promise-search-not-functional-error",ze="bbva-feature-credit-card-payment-own-cards-calculated-payment-promise-dates-success",Fe="bbva-feature-credit-card-payment-own-cards-create-payment-promise-success-response",Ue="bbva-feature-credit-card-payment-own-cards-leave-payment-promise",Ge="bbva-feature-credit-card-payment-own-cards-calculated-promise-dates-request",We="bbva-feature-credit-card-payment-promise-re-open-calendar",Xe="bbva-feature-credit-card-payment-own-cards-multistep-date-complete",Ke="bbva-feature-credit-card-payment-own-cards-multistep-amount-complete",Je="bbva-feature-credit-card-payment-own-cards-multistep-payment-method-complete",Ye="bbva-feature-credit-card-payment-own-cards-multistep-confirm-promise",Qe="bbva-feature-credit-card-payment-own-cards-other-amount-changed",Ze="bbva-feature-credit-card-payment-own-cards-analytics-on-click-start",et="bbva-feature-credit-card-payment-own-cards-analytics-page-visit",tt="bbva-feature-credit-card-payment-own-cards-analytics-app-started",at="bbva-feature-credit-card-payment-own-cards-analytics-app-completed",it="bbva-feature-credit-card-payment-own-cards-analytics-app-step-",rt=(e,t,a,i)=>({errorId:e,errorType:t,retryConfig:a,callConfig:i}),st=k((e=>class extends e{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(e){Object.assign(this.data,e)}buildDynamicMethods(){this.dynamicMethodsName.forEach((e=>{this[e]=()=>this._dispatch(`analytics-${this._camelToKebabCase(e)}`,this.data)}))}_camelToKebabCase(e){return e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`))}persistDataString(e){Object.assign(this.data,this.parseDataToString(e))}_toStringProcess(e,t){const a=e.toString();return this.stringNormalizeExceptions.includes(t)?a:this._normalizeStr(a)}_normalizeStr(e){let t=e;if("string"==typeof e){const a="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",i="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",r=new RegExp(`[${a}]`,"ug");t=e.replace(r,(e=>i.charAt(a.indexOf(e)))).toLowerCase()}return t}parseDataToString(e,t){if(!e)return e;switch(typeof e){case"string":case"boolean":case"number":return this._toStringProcess(e,t);case"object":if(Array.isArray(e))return e.map((e=>this.parseDataToString(e)));const a={...e};return Object.keys(a).forEach((t=>{a[t]=this.parseDataToString(e[t],t)})),a;case"function":return this.parseDataToString(e());default:return e.toString()}}firePersistedData(e){this.persistData(e),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(e){let t=e;"string"==typeof t&&(t=this.normalizeString(t)),"object"==typeof t&&Object.keys(t).forEach((e=>{t[e]=this.normalizeString(t[e])})),this.firePersistedData(t)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(e){this._dispatch("analytics-page-view"+(e?`-${e}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(e){this._dispatch("analytics-internal-link",e)}fireInternalLinkCard(e){this._dispatch("analytics-internal-link-card",e)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(e){if(!this._isAppStartedLaunched){const t=(null==e?void 0:e.id)||e,a=this._getTextConfig(t,"items");a&&(this.fireAppStarted(a),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(e){this.persistData({detail:`${this.appStartedText}${e}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(e){return e.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(e,t){var a,i;return null===(a=this.config)||void 0===a||null===(i=a[t])||void 0===i?void 0:i[e]}getPathValue(e,t){return t.split(".").reduce(((e,t)=>e[t]),e)}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}})),nt=k((e=>class extends(st(e)){static get properties(){return{currentStep:{type:Number},signatureTypes:{type:Object},signaturePrefix:{type:String},operationNumberPath:{type:String}}}constructor(){super(),this.currentStep=1,this.signatureTypes={},this.signaturePrefix="firma:",this.operationNumberPath="id"}fireStepLoaded(){1===this.currentStep?this.firePageVisit():this._dispatch(`analytics-${this.config.steps[this.currentStep]}`,this.data)}fireButtonAppStarted(){this.fireAppStarted(this.config.buttons.continue)}onStep(e){const t=null==e?void 0:e.currentStep,a=this._getTextConfig(t,"steps");a&&this._dispatch(`analytics-${a}`,this.data)}onLastStep(e){e&&this._dispatch(`analytics-${this.config.steps.last}`,this.data)}manageAnalyticsSign(e){if(e&&Object.keys(e).length){var t;const a=null===(t=this.signatureTypes)||void 0===t?void 0:t[null==e?void 0:e.signatureType];a&&this.persistData({customFields:`${this.signaturePrefix}${a}`})}this._dispatch(`analytics-${this.config.steps.sign}`,this.data)}parseAnalyticsConfirmData(e){const t=null==e?void 0:e[this.operationNumberPath];t&&(this.persistData({operationNumber:t}),this.fireAppCompleted())}}));class ot extends(nt(i)){static get is(){return"bbva-analytics-credit-card-payment-own-cards"}static get properties(){return{productName:{type:String},typology:{type:String},stepDescriptions:{type:Object}}}constructor(){super(),this.productName="",this.typology="",this.stepDescriptions={2:"payment-amount",3:"payment-method",4:"payment-promise-confirmation"}}fireAppOnClickStart(){this._dispatch(Ze)}fireAppPageVisit(e){this.productName=e.toLowerCase(),this._dispatch(et,{productName:this.productName})}fireAppStarted(){this._dispatch(tt,{productName:this.productName})}fireAppCompleted(e){this._dispatch(at,{productName:this.productName,amount:e,typology:this.typology})}fireAppStep(e){var t,a;this.typology=(null==e||null===(t=e.detail)||void 0===t?void 0:t.typology)||"",this._dispatch(it+this.stepDescriptions[e.detail.step],{productName:this.productName,amount:(null==e||null===(a=e.detail)||void 0===a?void 0:a.amount)||"",typology:this.typology})}}class ct{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let r=0|t,s=Math.max(r>=0?r:i-Math.abs(r),0);for(;s<i;){if((n=a[s])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;s++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],i=0,r="",s=0,n=arguments.length;s!==n;++s){var o=+arguments[s];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=a.push(o):(o-=65536,i=a.push(55296+(o>>10),o%1024+56320)),i>=16383&&(r+=e.apply(null,a),a.length=0)}return r+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}}class dt extends ct{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const lt=0,pt=1,ht="jwt",mt="tsec",bt="none";class ut extends ct{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=lt,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new dt,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=mt:this.requiredToken=bt,this.requiresJWT=!1):this.requiredToken===mt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ht?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===bt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(mt)}_setJwtHandler(){this._setTokenHandler(ht)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,i)=>{t=Object.assign(t,{resolve:a,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=X),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),i=t[a];return i?delete t[a]:this._error(9,`Missing ${a} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===pt?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(mt,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(ht,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=t.getItem(a);i&&"null"!==i&&(e[a]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=a.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,i=e===ht?"JWT ":"",r=e===ht?"Authorization":mt;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const s=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[a].getItem(s);n?t[r]=t[r]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const i=new Promise(((e,t)=>{a=(a,i)=>{a?t(a):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?a(i.error):a(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let i=e[a],r=0,s=0;if(i<=127?(r=0,s=255&i):i<=223?(r=1,s=31&i):i<=239?(r=2,s=15&i):i<=244&&(r=3,s=7&i),e.length-a-r>0){let t=0;for(;t<r;)i=e[a+t+1],s=s<<6|63&i,t+=1}else s=65533,r=e.length-a;t+=String.fromCodePoint(s),a+=r+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let i=": ",r=a[e].split(i);t[r.shift().toLowerCase()]=r.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,i){let r=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(r=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(r=JSON.parse(t.headers)[i])}if(r){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==r&&(e.setItem(t,r),this._emitTokenUpdate(a,r))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,i,r,s;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),r=e.getResponseHeader("AuthenticationChallenge"),s=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,a=n.authenticationdata||null,i=n.authenticationstate,r=n.authenticationchallenge,s=n.authenticationresponse}return{type:t,data:a,state:i,challenge:r,response:s}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",i=""){let r;if("object"==typeof e&&e){const s=this._getSignatureData(e.signatureType,t,a);r=this._makeKeyValuePairFromObject(s,e.signatureValue),e.challenge&&(r+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(r,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(r=`password=${e}`,this._buildSignatureHeaders(r,"2",i)):(r=`${a}=${e}`,this._buildSignatureHeaders(r,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,i=e.split(",");if(i.length>1){a=i.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),r=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:s,data:n,state:o,challenge:c,response:d}=this._extractSignatureResponseHeaders(e),l=this._getRequestMetadata(e);if(r)this._notifySignatureInvalid(l),a=!0;else if(s)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,l,s,n,o,c,d),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(l,s,n,o,c,d),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),r=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),s=this._getRequestMetadata(e);r&&(this._notifyWaitingForProcessResponse(s),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,i){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,i,r,s){this._defineSignatureValue(t,a,i);const n={type:t,data:a,challenge:r,metadata:e};s&&(n.response=s),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const i=t.split(";").findIndex((t=>t===e));return a?a.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,i,r,s){i?this._notifySignatureRequired(e,t,a,i,r,s):this._notifySignatureRequiredFirstStep(e,t,a,i)}_notifySignatureTypeUsingErrorCode(e,t,a,i,r,s,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,i,r):this._notifySignatureRequired(t,a,i,r,s,n)}}class vt extends ut{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class gt extends vt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`risk-collections/v${this.version}/calcultated-payment-promises-date`)}toString(){return super.toString("BGADPRiskCollectionsCalcultatedPaymentPromisesDatePostV0")}}class yt extends vt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`risk-collections/v${this.version}/payment-promises`)}toString(){return super.toString("BGADPRiskCollectionsPaymentPromisesPostV0")}}class ft extends vt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`risk-collections/v${this.version}/payment-promises/search`)}toString(){return super.toString("BGADPRiskCollectionsPaymentPromisesSearchPostV0")}}class _t extends(K(i)){static get is(){return"bbva-dataprovider-risk-collections"}constructor(){super(),this.htmlContext=this}postPaymentPromisesSearch(e={}){const t={host:this.host,native:this.native,body:e,htmlContext:this.htmlContext},a=_t._servicePaymentPromiseSearchPostV0(t);this._generateGetService(a,{customEvent:"get-mx-payment-promise-search-v0-success",errorFireEventHandler:"get-mx-payment-promise-search-v0-error"})}static _servicePaymentPromiseSearchPostV0(e){return new ft(e)}postCalculatedPaymentPromisesDates(e={}){const t={host:this.host,native:this.native,body:e,htmlContext:this.htmlContext},a=_t._serviceCalculatedPaymentPromiseDatesPostV0(t);this._generateGetService(a,{customEvent:"get-mx-calculated-payment-promise-dates-v0-success",errorFireEventHandler:"get-mx-calculated-payment-promise-dates-v0-error"})}static _serviceCalculatedPaymentPromiseDatesPostV0(e){return new gt(e)}postCreatePaymentPromises(e={}){const t={host:this.host,native:this.native,body:e,htmlContext:this.htmlContext},a=_t._serviceCreatePaymentPromisePostV0(t);this._generateGetService(a,{customEvent:"get-mx-create-payment-promise-v0-success",errorFireEventHandler:"get-mx-create-payment-promise-v0-error"})}static _serviceCreatePaymentPromisePostV0(e){return new yt(e)}}class St extends(C($e(J(u(i))))){static get is(){return"bbva-feature-credit-card-payment-own-cards-dm"}static get scopedElements(){const e=[_t];return St.scopedElementsFromClasses(e)}static get properties(){return{cardContract:{type:String}}}constructor(){super(),this.cardContract=""}_handlePaymentPromiseSearchResponse(e){var t,a,i,r;const[s]=(null===(t=e.detail)||void 0===t||null===(a=t.dueDate)||void 0===a?void 0:a.split("T"))??"",n=moment(s).format(`DD [${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-date-separator")}] MMMM [${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-date-separator")}] YYYY`),o=null==e||null===(i=e.detail)||void 0===i||null===(r=i.paymentAmount)||void 0===r?void 0:r.amount;this._dispatchCustomEvent(He,{pendingPaymentDate:n,pendingPaymentAmount:o})}_getCardInfo(){this._dispatchCustomEvent(Ve,this.cardContract.id),this._dispatchCustomEvent(Be,{expand:"payment-methods,blocks,indicators,activations"})}_handlePaymentPromiseSearchError(e){var t,a,i,r;(null==e||null===(t=e.detail)||void 0===t||null===(a=t.messages)||void 0===a?void 0:a.length)&&("functionalError"===(null==e||null===(i=e.detail)||void 0===i||null===(r=i.messages[0])||void 0===r?void 0:r.code)?this._getCardInfo():this._dispatchCustomEvent(je))}_handleCalculatedPaymentPromiseDatesResponse(e){var t;const a=null==e||null===(t=e.detail)||void 0===t?void 0:t.map((e=>{const[t,a,i]=e.paymentDate.split("-");return new Date(`${t}/${a}/${i}`)}));this._dispatchCustomEvent(ze,a)}_handleCalculatedPaymentPromiseDatesError(){this._dispatchCustomEvent(Ne)}_handleCreatePaymentPromiseResponse(e){var t,a;const i=null==e||null===(t=e.detail)||void 0===t||null===(a=t.paymentAmount)||void 0===a?void 0:a.amount;this._dispatchCustomEvent(Fe,{committedAmount:i})}_handleCreatePaymentPromiseError(){this._dispatchCustomEvent(De)}get riskCollectionDataprovider(){return this.renderRoot.querySelector('[data-tag-name="bbva-dataprovider-risk-collections"]')}searchPendingPaymentPromise(e){this.riskCollectionDataprovider.postPaymentPromisesSearch(e)}getCalculatedPaymentPromiseDates(e){this.riskCollectionDataprovider.postCalculatedPaymentPromisesDates(e)}createNewPaymentPromise(e){this.riskCollectionDataprovider.postCreatePaymentPromises(e)}render(){return d`
    <bbva-dataprovider-risk-collections
      id="dataproviderRiskCollections"
      .host="${this.host}"
      ?native="${this.native}"
      version="0"
      .requiredToken="${this.requiredToken}"
      @get-mx-payment-promise-search-v0-success="${this._handlePaymentPromiseSearchResponse}"
      @get-mx-payment-promise-search-v0-error="${this._handlePaymentPromiseSearchError}"
      @get-mx-calculated-payment-promise-dates-v0-success="${this._handleCalculatedPaymentPromiseDatesResponse}"
      @get-mx-calculated-payment-promise-dates-v0-error="${this._handleCalculatedPaymentPromiseDatesError}"
      @get-mx-create-payment-promise-v0-success="${this._handleCreatePaymentPromiseResponse}"
      @get-mx-create-payment-promise-v0-error="${this._handleCreatePaymentPromiseError}"
    ></bbva-dataprovider-risk-collections>
    `}}const xt=new t;var $t=e`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${p(m.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${p(m.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${p(m.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${p(m.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${p(m.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${p(m.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${p(m.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${p(h.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${p(Y.type3XSmall)}));
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
${xt.mediaRules()}`;var kt=e`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new t).mediaRules()}`;const Ct=new t;const wt={dark:e`
    ${e`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${p(m.primaryCoreLight)});
}
${Ct.mediaRules()}`}
  `,light:e`
    ${kt}
  `};class Pt extends(a(u(q(i)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":g,"bbva-text":v}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,$t,wt.dark,wt.light,c("bbva-notification-help-shared-styles")]}render(){return d`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}$("colors.primarySubduedLight"),$("colors.cool20"),$("colors.tertiaryType1Light"),$("colors.primaryCoreLightened"),$("colors.tertiaryType6Light"),$("colors.cool20"),$("colors.cool50");const Tt=new t;var Et=e`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${p(m.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${p(m.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${p(m.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${p(h.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Tt.mediaRules()}`;const It=new t;var Rt=e`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${p(m.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${p(m.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${p(m.primaryMediumLight)});
}
${It.mediaRules()}`;var Lt=e`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new t).mediaRules()}`;const At={dark:e`
    ${Rt}
    ${be.dark}
    ${R.dark}
    ${wt.dark}
    ${_.dark}
  `,light:e`
    ${Lt}
    ${be.light}
    ${R.light}
    ${wt.light}
    ${_.light}
  `};class Dt extends(a(u(Q(i)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":ue,"bbva-notification-help":Pt,"bbva-text":v,"bbva-link":j}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=n(),this.errorIconSize=16,this.infoIcon=s(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?d`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${l(this.linkHref)}"
          icon="${I()}"
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
      `}return""}static get styles(){return[Et,c("bbva-form-radio-group-shared-styles"),At.dark,At.light]}render(){return d`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>d`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${l(e.divider)}"
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
              accessibility-icon-info-notification="${l(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${l(e.accessibilityIconAlert)}"
              variant="${l(e.variant)}"
            >
              ${e.text?Z(e.text):e.label}
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
    `}}$("colors.primarySubdued"),$("colors.primaryMediumLight"),$("colors.primaryCoreLightened");var Nt=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-form-number] {
  text-align: left;
}
[data-tag-name=bbva-form-number] input {
  height: var(--bbva-input-other-amount-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
}
`;class Mt extends(a(u(i))){static get is(){return"bbva-other-amount-input"}static get scopedElements(){const e=[ee,ge,Pt];return Mt.scopedElementsFromClasses(e)}static get properties(){return{infoIcon:{type:String},warningIcon:{type:String},opened:{type:Boolean},setIconOtherAmount:{type:Boolean},maxAmount:{type:String}}}constructor(){super(),this.infoIcon=s(),this.warningIcon=n(),this.opened=!1,this.setIconOtherAmount=!1,this.maxAmount=0}static get styles(){return[Nt,c("bbva-other-amount-input-shared-styles")]}get formNumber(){return this.renderRoot.querySelector('[data-tag-name="bbva-form-number"]')}get _renderNotificationHelp(){return this.setIconOtherAmount?d`
    <bbva-notification-help
          class="alert"
          icon=${this.warningIcon}
          text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-other-amount-error")}"
          hide-left-padding
      ></bbva-notification-help>
    `:d`
    <bbva-notification-help
          icon=${this.infoIcon}
          text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-other-amount-message")}"
          hide-left-padding
      ></bbva-notification-help>
    `}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_validateAmountValue(e){let t=!0;e>=1?(this.setIconOtherAmount=!1,t=!(e<this.maxAmount)):(this.setIconOtherAmount=!0,t=!0),this._dispatch(Qe,{button:t,amount:e})}connectedCallback(){var e;null===(e=super.connectedCallback)||void 0===e||e.call(this),this.addEventListener("input",this._updateValue)}disconnectedCallback(){var e;null===(e=super.disconnectedCallback)||void 0===e||e.call(this),this.removeEventListener("input",this._updateValue)}_updateValue(){this._validateAmountValue(this.formNumber.value)}render(){return d`
      <bbva-core-collapse
        id="collapse"
        ?opened="${this.opened}">
          <bbva-form-number
            label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-other-amount-input-label")}"
            label-out="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-other-amount-input-description")}"
            required
          ></bbva-form-number>
          ${this._renderNotificationHelp}
      </bbva-core-collapse>
    `}}var Ot=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-list-simple] {
  --_list-simple-label-color: var(--bbva-white, #fff);
  --_list-simple-description-color: var(--bbva-white, #fff);
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
}

[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] [data-tag-name=bbva-list-simple] {
  --bbva-list-simple-padding: 0;
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .step-container {
  padding-top: var(--bbva-step-container-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .amount-container {
  display: flex;
  flex-direction: column;
  align-items: start;
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .amount-container [data-tag-name=bbva-amount] {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
  margin-top: var(--bbva-amount-step-summary-margin-top, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .amount-container [data-tag-name=bbva-text] {
  color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .summary .header-lists {
  padding: var(--bbva-lists-section-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) 0 0 0);
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .summary .header-lists [data-tag-name=bbva-list-simple] {
  padding: var(--bbva-list-simple-summary-padding, 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) 0);
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .summary [data-tag-name=bbva-text] {
  color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .summary .simple-summary {
  padding: var(--bbva-last-step-summary-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) 0);
}
[data-tag-name=bbva-expandable-multistep] [data-tag-name=bbva-expandable-step] .summary .simple-summary [data-tag-name=bbva-list-simple] {
  padding: 0;
}

[data-tag-name=bbva-button-default] {
  margin-top: var(--bbva-button-default-margin, calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-form-field] {
  text-align: var(--bbva-form-field-align, left);
}

[data-tag-name=bbva-form-radio-button] {
  text-align: var(--bbva-radio-button-align, left);
}

.header-step .row {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}
.header-step .column {
  display: flex;
  flex-direction: column;
}
.header-step .full-description-width {
  width: 100%;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1em);
}
.header-step .name,
.header-step .number,
.header-step .description,
.header-step .details {
  font-size: var(--typographyTypeSmall, ${p(h.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${p(Y.typeSmall)});
}
.header-step .description {
  font-style: var(--fontFacePrimaryBookFontStyle, ${p(D.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${p(D.book.fontWeight)});
  color: var(--bbva-credit-card-payment-description-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
  text-align: right;
}
.header-step .name {
  flex: 1;
  font-style: var(--fontFacePrimaryMediumFontStyle, ${p(D.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${p(D.medium.fontWeight)});
  color: var(--bbva-credit-card-payment-name-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
  text-align: left;
}
.header-step .ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.header-step .number,
.header-step .details {
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${p(D.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${p(D.bookItalic.fontWeight)});
}
.header-step .details {
  color: var(--bbva-credit-card-payment-details-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
}
.header-step [data-tag-name=bbva-amount] {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1em);
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)});
}
.header-step .number {
  color: var(--bbva-credit-card-payment-number-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
}
.header-step .number .row {
  flex: 1;
}
.header-step .card {
  display: flex;
}
.header-step .content {
  flex: 1;
}
.header-step .clip {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1em);
}

.radio-amounts .divider {
  padding: 0.5rem 0;
}
.radio-amounts [data-tag-name=bbva-form-radio-button] {
  text-align: var(--bbva-radio-button-text-align, left);
}

.image-card {
  width: 3rem;
  height: 2rem;
  margin-right: var(--bbva-card-image-margin-left, calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
}
`;class qt extends(a($e(u(i)))){static get is(){return"bbva-credit-card-payment-promise-multistep"}static get scopedElements(){const e=[B,ie,re,se,ne,oe,ce,ue,Dt,de,Ie,Pt,v,ye,Mt];return qt.scopedElementsFromClasses(e)}static get properties(){return{amounts:{type:Object},dateSelected:{type:String},amountSelectedAmount:{type:Number},_amountSelectedLabel:{type:String},_methodSelected:{type:String},_calendarModalVisible:{type:Boolean},_disableButtonCalendar:{type:Boolean},_disableButtonDate:{type:Boolean},_disableButtonAmount:{type:Boolean},_disableButtonMethod:{type:Boolean},_showSummary:{type:Boolean},_newInputValue:{type:Boolean},_openCollapse:{type:Boolean},_visualMethod:{type:String},balance:{type:Number},card:{type:String},cover:{type:String},limitDate:{type:String},due:{type:Number},exitModalVisible:{type:Boolean},infoIcon:{type:String},cautionIcon:{type:String},cardDigits:{type:String},currencyCode:{type:String}}}constructor(){super(),this.infoIcon=s(),this.cautionIcon=te(),this.amounts={},this.amountSelectedAmount=0,this._amountSelectedLabel="",this._calendarModalVisible=!1,this._disableButtonCalendar=!0,this._disableButtonDate=!0,this._disableButtonAmount=!0,this._disableButtonMethod=!0,this._newInputValue=!1,this._openCollapse=!1,this._showSummary=!1,this.balance=0,this.card="",this.cover="",this.limitDate="",this.dateSelected="",this.due=0,this.exitModalVisible=!1,this.cardDigits="",this._visualMethod="",this.currencyCode=""}static get styles(){return[Ot,c("bbva-credit-card-payment-promise-multistep-shared-styles")]}get _renderStepHeader(){const e=d`
    <div class="header-step">
      <div class="card">
        <bbva-clip-card
          class="clip"
          size="small"
          card-image="${this.cover}"
          accessibilityText="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-card-cover-accessibility")}"
        ></bbva-clip-card>

        <div class="content">
          <div class="row">
            <span class="name ellipsis">${this.card}</span>
            <bbva-amount
              variant="l"
              amount="${this.due}"
              currency-code="${this.currencyCode}"
              local-currency="${this.currencyCode}"
            ></bbva-amount>
          </div>

          <div class="row">
            <div class="column number">
              <span class="row">
                <div class="wrapper">
                  <span class="mask">•</span>
                  <span class="number">${this.cardDigits}</span>
                </div>
              </span>
            </div>
            <div class="column description">
              <span>${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-due")}</span>
            </div>
          </div>
        </div>
      </div>

      <div class="header-lists">
        <bbva-list-simple
          ambient="dark"
          description-medium
          description-italic
          label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-balance")}"
          currency-code="${this.currencyCode}" local-currency="${this.currencyCode}"
          amount="${this.balance}"
        ></bbva-list-simple>

        <bbva-list-simple
          ambient="dark"
          label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-limit-date")}"
          description-italic
          description-medium
          description="${this.limitDate}"
        ></bbva-list-simple>
      </div>
    </div>
    `;return d`
      <bbva-expandable-step hide-padding-top data-tag-name="bbva-expandable-step"
        header="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-first-step-title")}"
        prefilled
        step="0"
        total-steps="3"
        view-label="">
          <div class="content"></div>
          <div class="summary" slot="summary">
            ${e}
          </div>
      </bbva-expandable-step>
      `}_dispatch(e,t={}){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}showExitModal(){this.dateSelected||this.amountSelectedAmount||this._methodSelected?this.exitModalVisible=!0:this._leavePaymentPromise()}_leavePaymentPromise(){this._dispatch(Ue)}_continuePaymentPromise(){this.exitModalVisible=!1}get _renderExitModal(){return d`
      <bbva-help-modal
        data-testid="exit-modal"
        modal-type="info"
        title-icon="${this.cautionIcon}"
        body-text="${this.t("bbva-feature-credit-card-payment-own-cards-exit-modal-description")}"
        button-text="${this.t("bbva-feature-credit-card-payment-own-cards-exit-modal-button-text")}"
        link-text="${this.t("bbva-feature-credit-card-payment-own-cards-exit-modal-link-text")}"
        ?visible=${this.exitModalVisible}
        @help-modal-footer-button-click=${this._leavePaymentPromise}
        @help-modal-footer-link-click=${this._continuePaymentPromise}
      >
      </bbva-help-modal>
    `}_openCalendar(){this._dispatch(We)}_datesRequest(){""===this.dateSelected?this._dispatch(Ge):this._openCalendar()}_fireDateStepComplete(e){null==e||e.target.dispatchEvent(new CustomEvent("complete",{bubbles:!0})),this._dispatch(Xe,{step:2})}setSelectedDate(e){""!==e?(this.dateSelected=e,this._newInputValue=!0,this._disableButtonDate=!1):(this._newInputValue=!1,this._disableButtonDate=!0)}get _renderInputDate(){const e=d`
    <bbva-form-field
      data-test="empty"
      label="dd/mm/aaaa"
      info-message="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-date-step-input-description")}."
      @form-field-input-focus=${this._datesRequest}
      action-icon=${ae()}
      action-into-form
      required
    ></bbva-form-field>`,t=d`
  <bbva-form-field
    data-test="filled"
    label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-date-step-input-label")}"
    info-message="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-date-step-input-description")}"
    @form-field-input-focus=${this._datesRequest}
    .value="${this.dateSelected}"
    action-icon=${ae()}
    action-into-form
    required
  ></bbva-form-field>`;return this._newInputValue?t:e}get _renderDateStep(){const e=d`
    <bbva-list-simple
      label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-date-step-summary")}"
      description-date
      description="${this.dateSelected}"
    ></bbva-list-simple>`;return d`
    <bbva-expandable-step
      hide-padding-top
      data-tag-name="bbva-expandable-step"
      header="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-date-step-heading")}"
      edit-label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-edit-label")}"
      current-step-label="1 ${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-current-step-label")} 3"
      step="1"
      total-steps="3"
    >
      <div class="content">
        <bbva-text inherit text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-date-step-description")}"></bbva-text>
        <div class="step-container">
        ${this._renderInputDate}
        </div>

        <bbva-button-default
          id="complete-date"
          variant="primary"
          text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-continue-button")}"
          @click=${this._fireDateStepComplete}
          .disabled=${this._disableButtonDate}
        ></bbva-button-default>
      </div>

      <div class="summary" slot="summary">
        <div class="simple-summary">
        ${e}
        </div>
      </div>
    </bbva-expandable-step>
    `}_amountRadioChanged(e){const{selected:t}=e.detail,a={0:"minimum",1:"no_interest",2:"total"}[t];var i;t<3?(this._disableButtonAmount=!1,this._amountSelectedLabel=null==e||null===(i=e.detail)||void 0===i?void 0:i.value,this.amountSelectedAmount=this.amounts[a],this._openCollapse=!1):(this._openCollapse=!0,this._disableButtonAmount=3===t)}_handleOtherAmount(e){var t,a;this._amountSelectedLabel=this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-other-amount"),this.amountSelectedAmount=null==e||null===(t=e.detail)||void 0===t?void 0:t.amount,this._disableButtonAmount=null==e||null===(a=e.detail)||void 0===a?void 0:a.button}_fireAmountStepComplete(e){null==e||e.target.dispatchEvent(new CustomEvent("complete",{bubbles:!0})),this._dispatch(Ke,{step:3,amount:this.amountSelectedAmount})}get _renderAmountStep(){const e=d`
    <div class="amount-container">
          <bbva-text inherit text="${this._amountSelectedLabel}" font-weight="500"></bbva-text>
          <bbva-amount
            variant="4xl"
            amount=" ${this.amountSelectedAmount}"
            currency-code="${this.currencyCode}"
            local-currency="${this.currencyCode}"
            language="es"
          ></bbva-amount>
      </div>
    `,t=d`
    <div class="radio-amounts">
      <bbva-form-radio-group @form-radio-group-item-change=${this._amountRadioChanged}>
        <bbva-form-radio-button label-medium name="choice" value="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-minimum-amount")}" label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-minimum-amount")}"><span slot="clip"><bbva-amount amount=${this.amounts.minimum} currency-code="${this.currencyCode}" local-currency="${this.currencyCode}"></bbva-amount></span></bbva-form-radio-button>
        <bbva-notification-help
          accessibility-label-icon="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-minimum-icon-label")}"
          icon=${this.infoIcon}
          text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-minimum-message")}"
          hide-left-padding
        ></bbva-notification-help>
        <div class="divider"><bbva-divider size="full"></bbva-divider></div>

        <bbva-form-radio-button label-medium name="choice" value="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-no-interest")}" label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-no-interest")}"><span slot="clip"><bbva-amount amount=${this.amounts.no_interest} currency-code="${this.currencyCode}" local-currency="${this.currencyCode}"></bbva-amount></span></bbva-form-radio-button>
        <div class="divider"><bbva-divider size="full"></bbva-divider></div>

        <bbva-form-radio-button label-medium name="choice" value="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-total-amount")}" label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-total-amount")}"><span slot="clip"><bbva-amount amount="${this.amounts.total}" currency-code="${this.currencyCode}" local-currency="${this.currencyCode}"></bbva-amount></span></bbva-form-radio-button>
        <div class="divider"><bbva-divider size="full"></bbva-divider></div>

        <bbva-form-radio-button label-medium name="choice" value="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-other-amount")}" label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-other-amount")}"></bbva-form-radio-button>
      </bbva-form-radio-group>
    </div>

      <bbva-other-amount-input
      .maxAmount="${this.amounts.total}"
      ?opened="${this._openCollapse}"
      @bbva-feature-credit-card-payment-own-cards-other-amount-changed=${this._handleOtherAmount}></bbva-other-amount-input>
    `;return d`
    <bbva-expandable-step hide-padding-top data-tag-name="bbva-expandable-step" header="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-amount-step-heading")}" edit-label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-edit-label")}" current-step-label="2 ${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-current-step-label")} 3" step="2" total-steps="3">
      <div class="content">
        <bbva-text inherit class="description" alignment="left" text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-amount-step-description")}."></bbva-text>
        <div class="step-container">
          ${t}
        </div>
        <div class="buttons-form-container">
          <bbva-button-default id="complete-amount" variant="primary" .disabled=${this._disableButtonAmount} text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-continue-button")}" class="action" @click=${this._fireAmountStepComplete}></bbva-button-default>
        </div>
      </div>

      <div class="summary" slot="summary">
        ${e}
      </div>
    </bbva-expandable-step>
  `}_methodPaymentChanged(e){var t,a;this._visualMethod=null==e||null===(t=e.detail)||void 0===t?void 0:t.value;this._methodSelected=["INDIVIDUAL","ATM","CORRESPONDENT"][null==e||null===(a=e.detail)||void 0===a?void 0:a.selected],this._disableButtonMethod=!1}_fireMethodStepComplete(e){null==e||e.target.dispatchEvent(new CustomEvent("complete",{bubbles:!0})),this._dispatch(Je,{step:4,amount:this.amountSelectedAmount,typology:this._visualMethod.toLocaleLowerCase()})}get _renderPaymentMethodStep(){const e=d`
    <bbva-form-radio-group
      @form-radio-group-item-change=${this._methodPaymentChanged}>
      <bbva-form-radio-button label-medium name="choice"
        value="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-individual")}"
        label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-individual")}"
      ></bbva-form-radio-button>
      <bbva-notification-help
        accessibility-label-icon="Info"
        icon=${this.infoIcon}
        text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-individual-message")}"
        hide-left-padding
      ></bbva-notification-help>
      <div class="divider"><bbva-divider size="full"></bbva-divider></div>

      <bbva-form-radio-button
        label-medium
        name="choice"
        value="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-atm")}"
        label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-atm")}"
      ></bbva-form-radio-button>
      <bbva-notification-help
          accessibility-label-icon="Info"
          icon=${this.infoIcon}
          text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-atm-message")}"
          hide-left-padding
      ></bbva-notification-help>
      <div class="divider"><bbva-divider size="full"></bbva-divider></div>

      <bbva-form-radio-button label-medium name="choice"
      value="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-correspondent")}"
      label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-correspondent")}"
      ></bbva-form-radio-button>
      <bbva-notification-help
          accessibility-label-icon="Info"
          icon=${this.infoIcon}
          text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-correspondent-message")}"
          hide-left-padding
      ></bbva-notification-help>
    </bbva-form-radio-group>

    `;return d`
    <bbva-expandable-step
      hide-padding-top
      data-tag-name="bbva-expandable-step"
      header="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-step-heading")}"
      edit-label="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-edit-label")}"
      current-step-label="3 ${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-current-step-label")} 3"
      step="3"
      total-steps="3"
    >
    <div class="content">
      <bbva-text inherit class="description" alignment="left" text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-method-step-description")}"></bbva-text>
      <div class="step-container">
        ${e}
        <div class="buttons-form-container">
          <bbva-button-default id="complete-method" variant="primary" .disabled=${this._disableButtonMethod} text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-step-continue-button")}" class="action" @click=${this._fireMethodStepComplete}></bbva-button-default>
        </div>
      </div>
    </div>
    <div class="summary" slot="summary">
      <div class="simple-summary">
        <bbva-text inherit class="description" alignment="left" text="${this._visualMethod}"></bbva-text>
      </div>
    </div>
    </bbva-expandable-step>
    `}_handleAllCompleted(e){this._showSummary=!!e.detail}createPromise(){this._dispatch(Ye,{date:this.dateSelected,amount:this.amountSelectedAmount,method:this._methodSelected,visualMethod:this._visualMethod})}render(){return d`
    ${super.render()}
      <bbva-expandable-multistep
        step-selector='[data-tag-name="bbva-expandable-step"]'
        @expandable-multistep-all-complete=${this._handleAllCompleted}
        >
        ${this._renderStepHeader}
        ${this._renderDateStep}
        ${this._renderAmountStep}
        ${this._renderPaymentMethodStep}
        <bbva-panel-button
            id="panel"
            button-variant="primary"
            button-text="Confirmar"
            ?show="${this._showSummary}"
            @panel-button-item-click=${this.createPromise}
          >
          </bbva-panel-button>
      </bbva-expandable-multistep>
      ${this._renderExitModal}
    `}}var Ht=e`:host {
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
  --bbva-transition-container-padding: 0;
}

.accessibility-feature-text {
  color: var(--bbva-accesibility-feature-text-color, var(--colorsPrimaryCoreLightened, ${p(m.primaryCoreLightened)}));
}

.wrapper-menu {
  padding: var(--menu-wrapper-content-padding, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
}

.menu-divider {
  padding: var(--menu-divider-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) 0);
}

.success [data-tag-name=bbva-clip-microillustration] {
  padding-top: var(--bbva-success-payment-promise-microilustration-padding-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
}
.success .list {
  padding: var(--bbva-success-payment-promise-lists-padding-, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) 0);
}
.success [data-tag-name=bbva-notification-message] {
  margin: var(--bbva-success-payment-promise-message-margin, 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem));
}
.success [data-tag-name=bbva-button-default] {
  margin: var(--bbva-success-payment-promise-button-margin, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${p(N.spacer)}))) / 16) * 1rem) 0);
}
`;class Vt extends($e(J(u(C(i))))){static get is(){return"bbva-feature-credit-card-payment-own-cards"}static get scopedElements(){const e=[ie,le,se,xe,de,Ie,pe,v,he,qt,St,ot,...Vt.configurationScopedElements()];return Vt.scopedElementsFromClasses(e)}static get properties(){return{availablePayments:{type:Object},balance:{type:Number},cardImage:{type:String},cardType:{type:String},cardPaymentMethods:{type:Array},cardContract:{type:Object},cardCutOffDate:{type:String},financialInformation:{type:Object},lastCreditCardDigits:{type:String},paymentLimitDate:{type:String},nextPaymentDate:{type:String},paymentPromiseOperationDate:{type:String},isPaymentMenuVisible:{type:Boolean},isPaymentPromiseFormVisible:{type:Boolean},paymentPromiseAmount:{type:Number},paymentPromiseSelectedMethod:{type:String},isPaymentPromiseSuccessVisible:{type:Boolean},showPendingPromiseModal:{type:Boolean},cardTotalDebt:{type:Number},validBalances:{type:Array},_paymentPendingAmount:{type:Number},_paymentPendingDate:{type:String},_successHelpMessages:{type:Object},currency:{type:String},successPaymentPromiseFormatDate:{type:String},_selectedDate:{type:String},retryErrorModalImage:{type:String}}}constructor(){super(),this.config={loader:!0},this.availablePayments={},this.balance=0,this.cardImage="",this.cardType="",this.cardPaymentMethods=[],this.cardContract={},this.cardCutOffDate="",this.financialInformation={},this.lastCreditCardDigits="",this.paymentLimitDate="",this.nextPaymentDate="",this.paymentPromiseOperationDate="",this.isPaymentMenuVisible=!0,this.isPaymentPromiseFormVisible=!1,this.paymentPromiseAmount=0,this.paymentPromiseSelectedMethod="",this.isPaymentPromiseSuccessVisible=!1,this.showPendingPromiseModal=!1,this.cardTotalDebt=0,this.validBalances=["AVAILABLE_CURRENT_BALANCES","CURRENT_BALANCE"],this._paymentPendingAmount=0,this._paymentPendingDate="",this._successHelpMessages={},this.currency="",this._selectedDate="",this.successPaymentPromiseFormatDate="dddd, D [de] MMMM [de] YYYY hh:mm",this.retryErrorModalImage="./images/errors/error.svg"}static get styles(){return[Ht,c("bbva-feature-credit-card-payment-own-cards-shared-styles")]}get creditCardPaymentOwnCardsDM(){return this.renderRoot.querySelector('[data-tag-name="bbva-feature-credit-card-payment-own-cards-dm"]')}reset(){this.availablePayments={},this.balance=0,this.cardImage="",this.cardType="",this.cardPaymentMethods=[],this.cardContract={},this.cardCutOffDate="",this.financialInformation={},this.lastCreditCardDigits="",this.paymentLimitDate="",this.nextPaymentDate="",this.paymentPromiseOperationDate="",this.isPaymentMenuVisible=!0,this.isPaymentPromiseFormVisible=!1,this.paymentPromiseAmount=0,this.paymentPromiseSelectedMethod="",this.isPaymentPromiseSuccessVisible=!1,this.showPendingPromiseModal=!1,this.cardTotalDebt=0,this._paymentPendingAmount=0,this._paymentPendingDate="",this._successHelpMessages=[],this._selectedDate=""}validateFeatureFlags(e){var t;null!==(t=e["glomo.cards.paymentPromise"])&&void 0!==t&&t.value||this.onNavigateToDashboard()}setLastCreditCardDigits(e){[,this.lastCreditCardDigits]=e.filter.args[0].split("="),this.clearLoader()}get analyticsManager(){return this.renderRoot.querySelector('[data-tag-name="bbva-analytics-credit-card-payment-own-cards"]')}get _renderAnalyticsManager(){return d`
    <bbva-analytics-credit-card-payment-own-cards
      .productName="${this.cardType.toLowerCase()}"
    ></bbva-analytics-credit-card-payment-own-cards>
    `}_onCardPaymentOptionSelected(){this._dispatchCustomEvent(Re,{filter:{action:"creditTDC",args:[`terminationValue=${this.lastCreditCardDigits}`],key:"operativeType",promiseNavigations:!0}})}_paymentPromiseOptionSelected(){this.analyticsManager.fireAppOnClickStart(),this._setContract()}_findCardContract(e){return e.find((e=>(null==e?void 0:e.number.slice(-4))===this.lastCreditCardDigits))}_setContract(){var e,t,a,i;this.cardContract=this._findCardContract(null===(e=this.financialInformation)||void 0===e||null===(t=e.data)||void 0===t?void 0:t.contracts),this.creditCardPaymentOwnCardsDM.searchPendingPaymentPromise({contract:{id:null===(a=this.cardContract)||void 0===a||null===(i=a.detail)||void 0===i?void 0:i.agreementContract}})}_validatePaymentMethod(e){var t;const a=this.cardPaymentMethods.find((t=>(null==t?void 0:t.id)===e));return a?null==a||null===(t=a.monetaryPayments[0])||void 0===t?void 0:t.amount:0}_setNextPaymentDate(e){return this.cardPaymentMethods.find((t=>t.id===e)).nextPaymentDate}handleSuccessGetCardResponse(e){var t,a,i,r,s,n,o,c;this.cardPaymentMethods=null==e?void 0:e.paymentMethods,this.nextPaymentDate=this._setNextPaymentDate("MINIMUM_AMOUNT_TO_AVOID_INTEREST_PAYMENT"),this.paymentLimitDate=moment(this.nextPaymentDate).format("DD MMMM YYYY"),this.cardCutOffDate=null==e?void 0:e.cutOffDate,this.balance=null==e||null===(t=e.availableBalance)||void 0===t||null===(a=t.currentBalances[0])||void 0===a?void 0:a.amount,this.cardType=null==e||null===(i=e.product)||void 0===i?void 0:i.name,this.cardTotalDebt=null==e||null===(r=e.disposedBalance)||void 0===r||null===(s=r.currentBalances[0])||void 0===s?void 0:s.amount,this.cardImage=null===(n=this.cardContract)||void 0===n||null===(o=n.detail)||void 0===o||null===(c=o.images[0])||void 0===c?void 0:c.url,this.availablePayments={minimum:this._validatePaymentMethod("MINIMUM_AMOUNT_PAYMENT"),no_interest:this._validatePaymentMethod("MINIMUM_AMOUNT_TO_AVOID_INTEREST_PAYMENT"),total:this._validatePaymentMethod("TOTAL_AMOUNT_PAYMENT")},this._showPaymentPromisePage()}_onClosePendingPromiseModal(){this.showPendingPromiseModal=!1}_renderPendingPromiseModal(){return d`
      <bbva-help-modal
        header-type="modal"
        full-height
        header-text="${this.t("bbva-feature-credit-card-payment-own-cards-pending-modal-header")}"
        icon-right-primary=${me()}
        accessibility-text-icon-right-primary="${this.t("bbva-feature-credit-card-payment-own-cards-pending-modal-header-close-button-text")}"
        ?visible=${this.showPendingPromiseModal}
        @help-modal-header-right-primary-click=${this._onClosePendingPromiseModal}
        @help-modal-footer-button-click=${this._onClosePendingPromiseModal}
        fixed-footer
        button-text="${this.t("bbva-feature-credit-card-payment-own-cards-pending-modal-primary-button-text")}"
      >
        <div slot="slot-content">
          <bbva-clip-microillustration microillustration="info" size="M"></bbva-clip-microillustration>
          <bbva-text alignment="center" font-weight="500" text="${this.t("bbva-feature-credit-card-payment-own-cards-pending-modal-heading")}"></bbva-text>
          <bbva-text alignment="center" text="${this.t("bbva-feature-credit-card-payment-own-cards-pending-modal-description-1")} ${this._paymentPendingDate} ${this.t("bbva-feature-credit-card-payment-own-cards-pending-modal-description-2")} $${this._paymentPendingAmount}."></bbva-text>
        </div>
      </bbva-help-modal>
    `}get paymetPromiseMultistep(){return this.renderRoot.querySelector('[data-tag-name="bbva-credit-card-payment-promise-multistep"]')}_openCalendarModal(){this._dispatchCustomEvent(Me)}_sendCalculatedPaymentPromiseDates(e){this._dispatchCustomEvent(Oe,e),this._dispatchCustomEvent(qe,e[0]),this._openCalendarModal(),this.clearLoader()}_normilizeDate(e){const t=new Date(e).toISOString(),[a]=t.split("T"),[i,r,s]=a.split("-");this._selectedDate=`${s}/${r}/${i}`}setSelectedPaymentPromiseDate(e){e?this._normilizeDate(e):this._selectedDate="",this.paymetPromiseMultistep.setSelectedDate(this._selectedDate)}onNavigateToDashboard(){this.reset(),this._dispatchCustomEvent(Le,{page:"dashboard"})}_showPaymentPromisePage(){this.isPaymentMenuVisible=!1,this.isPaymentPromiseFormVisible=!0,this.analyticsManager.fireAppPageVisit(this.cardType)}_onExitPaymentPromiseMultistep(){this.isPaymentMenuVisible=!0,this.isPaymentPromiseFormVisible=!1}_onShowExitModal(){this.shadowRoot.querySelector('[data-tag-name="bbva-credit-card-payment-promise-multistep"]').showExitModal()}calculatedPaymentPromiseDates(){this.analyticsManager.fireAppStarted(),this.creditCardPaymentOwnCardsDM.getCalculatedPaymentPromiseDates({subproductType:{cutOffDate:this.cardCutOffDate,id:"CREDIT_CARD",paymentDueDate:this.nextPaymentDate}}),this.showLoader()}_setSuccessMessages(e){const t=e?"individual":"atm";this._successHelpMessages={paymentRemainder:`bbva-feature-credit-card-payment-own-cards-success-${t}-message-1`,spacing:e?"<br><br>":"<br>",notificationRemainder:`bbva-feature-credit-card-payment-own-cards-success-${t}-message-2`}}_paymentPromisePayloadBuilder(e,t,a){var i,r;return{dueDate:`${e}T00:00:00.000-0600`,paymentAmount:{amount:t,currency:this.currency},reason:"Payment Promise Reason",contract:{id:null===(i=this.cardContract)||void 0===i||null===(r=i.detail)||void 0===r?void 0:r.agreementContract,numberType:{id:"CLABE"},productType:{id:"CARD",subproductType:{id:"CREDIT_CARD",paymentDueDate:this.nextPaymentDate,cutOffDate:this.cardCutOffDate}}},paymentWay:a,advicer:{id:"glomo"}}}createPaymentPromise(e){var t,a,i,r,s,n;this.showLoader(),this.paymentPromiseSelectedMethod=null==e||null===(t=e.detail)||void 0===t?void 0:t.visualMethod,this._setSuccessMessages("individual"===(null==e||null===(a=e.detail)||void 0===a||null===(i=a.method)||void 0===i?void 0:i.toLowerCase()));const o=(null==e||null===(r=e.detail)||void 0===r?void 0:r.date)??"";this._selectedDate=o;const[c,d,l]=o.split("/"),p=`${l}-${d}-${c}`,h=null==e||null===(s=e.detail)||void 0===s?void 0:s.amount,m=null==e||null===(n=e.detail)||void 0===n?void 0:n.method,b=this._paymentPromisePayloadBuilder(p,h,m);this.creditCardPaymentOwnCardsDM.createNewPaymentPromise(b)}handleGetCardError(){this._showModalInfoNotLoaded("card-information-not-loaded")}_dispatchRetryError(e){this._dispatchCustomEvent(Ae,e)}_showModalUnfinishedOperations(){const e={retryErrorData:rt("promise-unfinished-operation","unfinishedOperations",{acceptBtLabel:"alert-generic-error-retry",cancelBtLabel:"bbva-feature-credit-card-payment-own-cards-unfinished-operations-error-exit-btn",fullModal:!1,message:"bbva-feature-credit-card-payment-own-cards-unfinished-operations-error-message"},{acceptBtLabel:"bbva-feature-credit-card-payment-own-cards-unfinished-operations-error-exit-btn",cancelBtLabel:"",message:"bbva-feature-credit-card-payment-own-cards-unfinished-operations-error-message-no-call"})};this._dispatchRetryError(e)}_showModalInfoNotLoaded(e){const t={retryErrorData:rt(e,"informationNotLoaded",{acceptBtLabel:"alert-generic-error-retry",cancelBtLabel:"bbva-feature-credit-card-payment-own-cards-information-not-loaded-error-cancel-btn",title:"bbva-feature-credit-card-payment-own-cards-information-not-loaded-error-title",header:"bbva-feature-credit-card-payment-own-cards-information-not-loaded-error-header",fullModal:!0,className:"full-height-error",srcImage:this.retryErrorModalImage,message:"bbva-feature-credit-card-payment-own-cards-information-not-loaded-error-message"},{acceptBtLabel:"bbva-feature-credit-card-payment-own-cards-information-not-loaded-error-cancel-btn",cancelBtLabel:"",title:"bbva-feature-credit-card-payment-own-cards-information-not-loaded-error-title",header:"bbva-feature-credit-card-payment-own-cards-information-not-loaded-error-header",fullModal:!0,className:"full-height-error",srcImage:this.retryErrorModalImage,message:"bbva-feature-credit-card-payment-own-cards-information-not-loaded-error-message"})};this._dispatchRetryError(t)}get _renderDM(){return d`
      <bbva-feature-credit-card-payment-own-cards-dm
        .host="${this.host}"
        ?native="${this.native}"
        version="0"
        .requiredToken="${this.requiredToken}"
        .cardContract="${this.cardContract}"
        @bbva-feature-credit-card-payment-own-cards-payment-promise-search-success="${({detail:e})=>{this._paymentPendingDate=null==e?void 0:e.pendingPaymentDate,this._paymentPendingAmount=null==e?void 0:e.pendingPaymentAmount,this.showPendingPromiseModal=!0}}"
        @bbva-feature-credit-card-payment-own-cards-payment-promise-search-not-functional-error="${()=>{this._showModalInfoNotLoaded("pending-promise-information-not-loaded")}}"
        @bbva-feature-credit-card-payment-own-cards-calculated-payment-promise-dates-success="${({detail:e})=>{this._sendCalculatedPaymentPromiseDates(e)}}"
        @bbva-feature-credit-card-payment-own-cards-calculated-payment-promise-dates-error="${()=>{this._showModalInfoNotLoaded("dates-information-not-loaded")}}"
        @bbva-feature-credit-card-payment-own-cards-create-payment-promise-success-response="${({detail:e})=>{this.paymentPromiseOperationDate=moment().format(this.successPaymentPromiseFormatDate),this.paymentPromiseAmount=null==e?void 0:e.committedAmount,this.isPaymentPromiseFormVisible=!1,this.isPaymentPromiseSuccessVisible=!0,this.clearLoader(),this.analyticsManager.fireAppCompleted(null==e?void 0:e.committedAmount.toString())}}"
        @bbva-feature-credit-card-payment-own-cards-create-payment-promise-error="${()=>{this._showModalUnfinishedOperations()}}"
      ></bbva-feature-credit-card-payment-own-cards-dm>
    `}get _renderSuccess(){return d`
      <div class="success">
        <bbva-clip-microillustration microillustration="success" size="M"></bbva-clip-microillustration>
        <bbva-text alignment="center" font-weight="500" text="${this.t("bbva-feature-credit-card-payment-own-cards-success-title")}"></bbva-text>
        <bbva-text alignment="center" font-weight="500" text="${this.paymentPromiseOperationDate}"></bbva-text>
        <div class="list">
          <bbva-list-simple
          label="${this.t("bbva-feature-credit-card-payment-own-cards-success-date")}"
          description-date
          description="${this._selectedDate}"
        ></bbva-list-simple>
        <bbva-list-simple
            description-medium
            description-italic
            label="${this.t("bbva-feature-credit-card-payment-own-cards-success-card")}"
            description="•${this.lastCreditCardDigits}"
          ></bbva-list-simple>
          <bbva-list-simple
            description-medium
            description-italic
            label="${this.t("bbva-feature-credit-card-payment-own-cards-success-amount")}"
            currency-code="${this.currency}"
            local-currency="${this.currency}"
            amount="${this.paymentPromiseAmount}"
          ></bbva-list-simple>
          <bbva-list-simple
            description-medium
            description-italic
            label="${this.t("bbva-feature-credit-card-payment-own-cards-success-method")}"
            description="${this.paymentPromiseSelectedMethod}"
          ></bbva-list-simple>
        </div>

          <bbva-notification-message
            message="${`${this.t(this._successHelpMessages.paymentRemainder)}${this._successHelpMessages.spacing}${this.t(this._successHelpMessages.notificationRemainder)}`}"
          ></bbva-notification-message>

          <bbva-button-default
          variant="primary"
          text="${this.t("bbva-feature-credit-card-payment-own-cards-success-button")}"
          @click=${this.onNavigateToDashboard}
        ></bbva-button-default>
      </div>

    `}_handleAnalyticsStep(e){this.analyticsManager.fireAppStep(e)}render(){return d`
      ${super.render()} ${this._renderDM}
      <bbva-transition-container ?visible=${this.isPaymentMenuVisible}>
        <div slot="slot-content">
          <bbva-header-main
            data-testid="menu-header"
            text="${this.t("bbva-feature-credit-card-payment-own-cards-menu-payment-header")}"
            icon-left-primary= ${T()}
            accessibility-text-icon-left-primary="${this.t("bbva-feature-credit-card-payment-own-cards-menu-header-accessibility-text")}"
            @header-main-icon-left-primary-click=${this.onNavigateToDashboard}
            >
          </bbva-header-main>
          <div class="wrapper-menu">
            <bbva-text class="description" alignment="center" text="${this.t("bbva-feature-credit-card-payment-own-cards-menu-description")}"></bbva-text>
            <bbva-clip-microillustration microillustration="accountdollar" size="M"></bbva-clip-microillustration>
            <bbva-text alignment="center" font-weight="500" text="${this.t("bbva-feature-credit-card-payment-own-cards-menu-payment-title")}"></bbva-text>
            <bbva-text alignment="center" text="${this.t("bbva-feature-credit-card-payment-own-cards-menu-payment-description")}"></bbva-text>
            <bbva-button-default variant="primary" text="${this.t("bbva-feature-credit-card-payment-own-cards-menu-button-text")}" @click=${this._onCardPaymentOptionSelected}></bbva-button-default>
            <div class="menu-divider"><bbva-divider size="full"></bbva-divider></div>

            <bbva-clip-microillustration microillustration="calendar" size="M"></bbva-clip-microillustration>
            <bbva-text alignment="center" font-weight="500" text="${this.t("bbva-feature-credit-card-payment-own-cards-menu-promise-title")}"></bbva-text>
            <bbva-text alignment="center" text="${this.t("bbva-feature-credit-card-payment-own-cards-menu-promise-description")}"></bbva-text>
            <bbva-button-default variant="primary" text="${this.t("bbva-feature-credit-card-payment-own-cards-menu-button-text")}" @click=${this._paymentPromiseOptionSelected}></bbva-button-default>
          </div>
          ${this._renderPendingPromiseModal()}
        </div>
      </bbva-transition-container>
      <bbva-transition-container ?visible=${this.isPaymentPromiseFormVisible}>
        <div slot="slot-content">
          <bbva-header-main
            text="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-header")}"
            icon-right-primary=${me()}
            accessibility-text-icon-right-primary="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-header-accessibility-text")}"
            variant="modal"
            @header-main-icon-right-primary-click=${this._onShowExitModal}
            >
          </bbva-header-main>
          ${this.isPaymentPromiseFormVisible?d`
          <bbva-credit-card-payment-promise-multistep
            .balance="${this.balance}"
            .card="${this.cardType}"
            .cover="${this.cardImage}"
            .due="${this.cardTotalDebt}"
            .limitDate="${this.paymentLimitDate}"
            .amounts="${this.availablePayments}"
            .cardDigits="${this.lastCreditCardDigits}"
            .currencyCode="${this.currency}"
            @bbva-feature-credit-card-payment-promise-re-open-calendar=${this._openCalendarModal}
            @bbva-feature-credit-card-payment-own-cards-multistep-confirm-promise=${this.createPaymentPromise}
            @bbva-feature-credit-card-payment-own-cards-calculated-promise-dates-request=${this.calculatedPaymentPromiseDates}
            @bbva-feature-credit-card-payment-own-cards-leave-payment-promise=${this._onExitPaymentPromiseMultistep}
            @bbva-feature-credit-card-payment-own-cards-multistep-date-complete=${this._handleAnalyticsStep}
            @bbva-feature-credit-card-payment-own-cards-multistep-amount-complete=${this._handleAnalyticsStep}
            @bbva-feature-credit-card-payment-own-cards-multistep-payment-method-complete=${this._handleAnalyticsStep}
          ></bbva-credit-card-payment-promise-multistep>
        `:""}
        </div>
      </bbva-transition-container>
      <bbva-transition-container ?visible=${this.isPaymentPromiseSuccessVisible}>
        <div slot="slot-content">
          <bbva-header-main
            text="${this.t("bbva-feature-credit-card-payment-own-cards-success-header")}"
            icon-right-primary=${me()}
            accessibility-text-icon-right-primary="${this.t("bbva-feature-credit-card-payment-own-cards-payment-promise-success-header-accessibility-text")}"
            variant="modal"
            @header-main-icon-right-primary-click=${this.onNavigateToDashboard}
            >
          </bbva-header-main>
          ${this.isPaymentPromiseSuccessVisible?this._renderSuccess:""}
        </div>
      </bbva-transition-container>
      <div aria-hidden="true" class="accessibility-feature-text">${this.t("bbva-feature-credit-card-payment-own-cards-feature-accessibility-text")}</div>
      ${this._renderAnalyticsManager}
    `}}customElements.define(Vt.is,Vt);
