import{z as t,a8 as e,ar as i,aI as a,d$ as n,dN as r,bx as o,e0 as s,g as c,be as l,bf as d,a9 as h,ab as m,e1 as u,e2 as p,dJ as b,dp as v,aY as g,aa as f,ad as y,e3 as _,bk as x,ac as $,e4 as k,a as S,L as T,y as P,ah as w,aN as I,ai as E,ak as B,h as L,i as C,ap as O,an as N,ag as F,F as D,b$ as M,b1 as A,c0 as V,f as R,H as z,aX as j,v as H,u as W,cI as q,cJ as G,aD as U,J as Y,b0 as Z,aJ as J,bj as X,b6 as K,dt as Q,av as tt,o as et,b3 as it,cH as at,bF as nt,dR as rt,ck as ot}from"./952f98a9.js";import{B as st,a as ct}from"./a6a31124.js";import{B as lt}from"./53aa438e.js";import"./43e23805.js";import{B as dt,a as ht,b as mt,c as ut}from"./79b40c7b.js";import"./c36a5efd.js";import{aO as pt,bo as bt,f as vt,bp as gt,bM as ft}from"./7f3d7ca9.js";import{aB as yt,d as _t}from"./216055dc.js";import"./cada5a1c.js";import"./4d2e5f99.js";import"./68ec5adf.js";import"./f250a96c.js";import"./c0a2f832.js";import"./cae0f1de.js";const xt=function(i,a){const n={zoneSelector:"",regionSelector:"",fullWidthSelector:"",minBp:"",slottedZones:!0,...a},r=n.regionSelector?[n.regionSelector]:[".region","[data-grid~='region']"],o=n.zoneSelector?[n.zoneSelector]:[".zone","[data-grid~='zone']"],s=n.fullWidthSelector?[n.fullWidthSelector]:["[full-width]","[data-grid~='full-width']"],{minBp:c,slottedZones:l}=n;let d="";const h=r.join(", "),m=o.join(", "),u=l?"::slotted(*)":"> *",p=o.map((t=>`${t} ${u}`)).join(", "),b=l?s.map((t=>`::slotted(${t})`)):s.map((t=>`> ${t}`)),v=o.map((t=>b.map((e=>`${t} ${e}`)).join(", "))).join(", "),g=i.breakpoints,f=c&&g[c].margin||i.margin,y=c&&g[c].maxWidth||i.maxWidth;if(d+=`\n${h} {\n  position: relative;\n}\n\n${m} {\n  display: flex;\n  flex-direction: column;\n  align-items: center;\n}\n\n${p} {\n  ${y?`max-width: ${(y-2*f)/16}rem;`:""}\n  width: calc(100% - ${2*f/16}rem);\n}\n\n${v} {\n  width: 100%;\n  max-width: none;\n}\n  `,g){let t=f,e=y;const i=Object.keys(g);(c?i.slice(i.indexOf(c)+1):i).forEach((i=>{const a=g[i],n=a.maxWidth&&a.maxWidth!==e,r=a.margin&&a.margin!==t;if(a.min&&(r||n)){let i="",o="";r&&(i=`width: calc(100% - ${2*a.margin/16}rem);`,t=a.margin),n&&(o=`max-width: ${(a.maxWidth-2*t)/16}rem;`,e=a.maxWidth),d+=`\n@media screen and (min-width: ${a.min/16}rem) {\n  ${p} {\n    ${i}\n    ${o}\n  }\n}\n        `}}))}return t`
    ${e(d)}
  `};function $t(t,e,i,a){return i&&a[i][t]||e[t]}function kt(t,e,i,a){return t?`${i}-${e}: ${a?t/16+"rem":t};\n`:""}var St=Object.freeze({__proto__:null,FoundationTypography:i,ambients:a,bbvaFont:n,bbvaFoundationsEllipsis:r,bbvaFoundationsStylesFocus:o,bbvaFoundationsStylesPhotoTreatment:pt,bbvaSpacer8:s,bbvaToken:c,borderRadius:l,boxShadow:d,colors:h,fontFacePrimary:m,fontFaceSecondary:u,fontFamilyOptions:p,fontSizeOptions:b,fontStyleOptions:v,fontWeightOptions:g,generateFlatGridZones:(t,e)=>xt(t,{slottedZones:!1,...e}),generateGridColumnVariables:function(i=12,a={}){const n={selector:":host",prefix:"--grid",varName:"cols-width",...a},{selector:r,prefix:o,varName:s}=n;let c="";for(let t=1;t<=i;t+=1)c+=`${o}-${t}-${s}: calc((100% + var(${o}-gutter)) / var(${o}-columns) * ${t} - var(${o}-gutter));\n\n    `;return t`
    ${e(`\n${r} {\n  ${c}\n}\n  `)}
  `},generateGridVariables:function(i,a){const n={selector:":host",prefix:"--grid",minBp:"",...a},{selector:r,prefix:o,minBp:s}=n,c=i.breakpoints;let l="";const d=$t("gutter",i,s,c),h=$t("margin",i,s,c),m=$t("columns",i,s,c),u=$t("minWidth",i,s,c),p=$t("maxWidth",i,s,c);return l+=`\n${r} {\n ${kt(d,"gutter",o,!0)} ${kt(h,"margin",o,!0)} ${kt(m,"columns",o,!1)} ${kt(u,"min-width",o,!0)} ${kt(p,"max-width",o,!0)}}\n`,c&&(l+=function(t,e){const{gutter:i,margin:a,columns:n,maxWidth:r,minBp:o,prefix:s,selector:c}=e;let l="",d=i,h=a,m=n,u=r;const p=Object.keys(t);return(o?p.slice(p.indexOf(o)+1):p).filter((e=>t[e].min||t[e].max)).forEach((e=>{const i=t[e];let a="";i.gutter&&i.gutter!==d&&(a=kt(i.gutter,"gutter",s,!0),d=i.gutter);let n="";i.margin&&i.margin!==h&&(n=kt(i.margin,"margin",s,!0),h=i.margin);let r="";i.maxWidth&&i.maxWidth!==u&&(r=kt(i.maxWidth,"max-width",s,!0),u=i.maxWidth);let o="";i.columns&&i.columns!==m&&(o=kt(i.columns,"columns",s,!1),m=i.columns),(a||n||r||o)&&(l+=function(t,e,i,a,n,r){return`\n    @media screen ${t.min?`and (min-width: ${t.min/16}rem)`:""} ${t.max?`and (max-width: ${t.max/16}rem)`:""} {\n    ${e} {\n      ${i}  ${a}  ${n}  ${r}\n      }\n    }\n  `}(i,c,a,n,r,o))})),l}(c,{gutter:d,margin:h,columns:m,maxWidth:p,minBp:s,prefix:o,selector:r})),t`
    ${e(l)}
  `},generateGridZones:xt,grid:f,lineHeight:y,lineHeightOptions:_,mediaCSS:yt,statusColors:x,toolsGrid:{spacer:"8",columns:12,margin:24,gutter:16,minWidth:1024,breakpoints:{sm:{max:1279,columns:12,margin:24,gutter:16},md:{min:1280,columns:12,margin:32,gutter:24,maxWidth:1296},lg:{min:1440,columns:12,margin:32,gutter:32,maxWidth:1296}}},typography:$,typographyCollection:k});class Tt extends lt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`financial-investments/v${this.version}/financial-investments/calculate-contracts-average-profitabilities-by-period`)}toString(){return super.toString("BGADPFinancialInvestmentsCalculateContractsAverageProfitabilitiesByPeriodPostV1")}}class Pt extends lt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`financial-investments/v${this.version}/financial-investments/calculate-contracts-balances-by-period`)}toString(){return super.toString("BGADPFinancialInvestmentsCalculateContractsBalancesByPeriodPostV1")}}const wt=new i;var It=t`:host {
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
${wt.mediaRules()}`;class Et extends(S(T)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":P}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:w(),warning:w(),error:I(),success:E()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const n=i;this._stack.push({type:n,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[It,B("bbva-notification-container-shared-styles")]}render(){return L`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${C(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${C(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var Bt=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${e(h.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${e(h.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${e(h.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${e(h.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${e(h.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${e(h.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${e(h.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${e(h.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${e(h.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${e($.typeMedium)}));
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
`;class Lt extends(S(O(N(T)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":F,"bbva-icon":D,"bbva-badge-notification":M}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Bt,B("bbva-header-main-shared-styles"),o("button:focus"),A.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return L`<bbva-icon icon="${C(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return L`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const n=Lt.toCamelCase(t),r=`icon${n}`,o=`accessibilityTextIcon${n}`;return L`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${C(this.t(this[o]))}"
      aria-expanded=${C(a)}
      ?hidden="${!this[r]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(r):this._icon(r)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return L` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${C(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return L`
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:n}=this;return L`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(n||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${C(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${n}"
            ?hidden="${!n}"
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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}c("colors.primaryCoreLightened"),c("colors.cool80"),c("colors.cool70"),c("colors.primaryCoreLightened"),c("colors.cool100"),c("colors.tertiaryType6Darkened"),c("colors.tertiaryType4Darkened"),c("colors.secondary300");const Ct=z((t=>class extends(j(t)){static configurationScopedElements(){return[Et,H,Lt,W]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),L`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||q();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&G()||this.config.faqs&&U())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const n={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",n)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return L`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return L`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));class Ot extends(Y(T)){}class Nt extends Ot{static get is(){return"bbva-global-financial-investments-calculate-balances-by-period-api-dm"}static get properties(){return{balancesByPeriod:{type:Object,attribute:!1}}}constructor(){super(),this.balancesByPeriod={}}resetBalancesByPeriod(){this.balancesByPeriod={}}postFinancialInvestmentsCalculateBalancesByPeriod(t){if(Object.keys(this.balancesByPeriod).length)return;this._generateGetService(this._getService("post",t),{customEvent:"financial-investments-calculate-balances-by-period-api-dm-fetch",errorFireEventHandler:"financial-investments-calculate-balances-by-period-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}FinancialInvestmentsCalculateBalancesByPeriod`,this._getBgadp(a))}_getBgadp(t){return{postFinancialInvestmentsCalculateBalancesByPeriodV1:()=>new st(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}customElements.define(Nt.is,Nt);class Ft extends Ot{static get is(){return"bbva-global-financial-investments-calculate-contracts-average-profitabilities-by-period-api-dm"}static get properties(){return{contractsAverageProfitabilitiesByPeriod:{type:Object,attribute:!1}}}constructor(){super(),this.contractsAverageProfitabilitiesByPeriod={}}resetContractsAverageProfitabilitiesByPeriod(){this.contractsAverageProfitabilitiesByPeriod={}}postFinancialInvestmentsCalculateContractsAverageProfitabilitiesByPeriod(t){if(Object.keys(this.contractsAverageProfitabilitiesByPeriod).length)return;this._generateGetService(this._getService("post",t),{customEvent:"financial-investments-calculate-contracts-average-profitabilities-by-period-api-dm-fetch",errorFireEventHandler:"financial-investments-calculate-contracts-average-profitabilities-by-period-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}FinancialInvestmentsCalculateContractsAverageProfitabilitiesByPeriod`,this._getBgadp(a))}_getBgadp(t){return{postFinancialInvestmentsCalculateContractsAverageProfitabilitiesByPeriodV1:()=>new Tt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}customElements.define(Ft.is,Ft);class Dt extends Ot{static get is(){return"bbva-global-financial-investments-calculate-contracts-balances-by-period-api-dm"}static get properties(){return{contractsBalancesByPeriod:{type:Object,attribute:!1}}}constructor(){super(),this.contractsBalancesByPeriod={}}resetContractsBalancesByPeriod(){this.contractsBalancesByPeriod={}}postFinancialInvestmentsCalculateContractsBalancesByPeriod(t){if(Object.keys(this.contractsBalancesByPeriod).length)return;this._generateGetService(this._getService("post",t),{customEvent:"financial-investments-calculate-contracts-balances-by-period-api-dm-fetch",errorFireEventHandler:"financial-investments-calculate-contracts-balances-by-period-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}FinancialInvestmentsCalculateContractsBalancesByPeriod`,this._getBgadp(a))}_getBgadp(t){return{postFinancialInvestmentsCalculateContractsBalancesByPeriodV1:()=>new Pt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}customElements.define(Dt.is,Dt);class Mt extends Ot{static get is(){return"bbva-global-financial-investments-calculate-evolution-summaries-by-period-api-dm"}static get properties(){return{evolutionSummariesByPeriod:{type:Object,attribute:!1}}}constructor(){super(),this.evolutionSummariesByPeriod={}}resetEvolutionSummariesByPeriod(){this.evolutionSummariesByPeriod={}}postFinancialInvestmentsCalculateEvolutionSummariesByPeriod(t){if(Object.keys(this.evolutionSummariesByPeriod).length)return;this._generateGetService(this._getService("post",t),{customEvent:"financial-investments-calculate-evolution-summaries-by-period-api-dm-fetch",errorFireEventHandler:"financial-investments-calculate-evolution-summaries-by-period-api-dm-fetch-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}FinancialInvestmentsCalculateEvolutionSummariesByPeriod`,this._getBgadp(a))}_getBgadp(t){return{postFinancialInvestmentsCalculateEvolutionSummariesByPeriodV1:()=>new ct(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}customElements.define(Mt.is,Mt);var At=t`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${e(h.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${e(h.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${e(h.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${e(h.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${e(y.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(m.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${e(y.typeLarge)});
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1rem);
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
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1rem);
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
`,Vt=t`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,Rt=t`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${e(h.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${e(h.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${e(h.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${e(h.primaryMedium)});
}
`;const zt={light:t`
    ${Z.light}
    ${Vt}
  `,dark:t`
    ${Z.dark}
    ${Rt}
  `};class jt extends(J(S(O(N(T))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":X,"bbva-link":K,"bbva-text":F}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=Q,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[At,super.styles,B("bbva-panel-info-shared-styles"),zt.light,zt.dark]}get _contentImage(){return this.image?L` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:L`
      <span
        class="${tt({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===Q}render(){return L`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&L`
          <bbva-text
            tabindex="0"
            class="title ${tt({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${C(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&L`
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
        ${L` <slot></slot> `}
        ${this.linkText&&L`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}c("colors.primaryCoreLightened"),c("colors.primaryCoreLightened"),c("colors.primaryCoreLightened"),c("colors.cool50");const Ht=new i;var Wt=t`:host {
  display: block;
  box-sizing: border-box;
  --_follow-up-investments-distribution-of-investments-background-color: var(--follow-up-investments-distribution-of-investments-dark-mode-background-color, var(--ambientsLight, ${e(a.light)}));
}
:host .panel {
  min-height: calc(100% - 9em);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

ul {
  list-style: none;
  margin: 0;
  padding: 0;
}

[ambient^=light] {
  background-color: var(--_follow-up-investments-distribution-of-investments-background-color);
  padding-top: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-data-visualization-donut] {
  --bbva-data-visualization-donut-padding: 0;
  --bbva-data-visualization-donut-chart-padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(f.spacer)}))) / 16) * 1em);
  display: block;
  width: max-content;
  margin: 0 auto;
}

[data-tag-name=bbva-tab-default] [data-tag-name=bbva-panel-info] {
  min-height: calc(100% - 9em);
}
${Ht.mediaRules()}`;const{colors:qt}=St,Gt={DEPOSIT:{id:"DEPOSIT",label:"follow-up-investments-distribution-of-investments-product-deposit"},INVESTMENT_FUND:{id:"INVESTMENT_FUND",label:"follow-up-investments-distribution-of-investments-product-fund"},INVESTMENT_INTERNATIONAL_FUND:{id:"INVESTMENT_INTERNATIONAL_FUND",label:"follow-up-investments-distribution-of-investments-product-international-fund"},SECURITIES_ACCOUNT:{id:"SECURITIES_ACCOUNT",label:"follow-up-investments-distribution-of-investments-product-account"},SAVING_PLAN:{id:"SAVING_PLAN",label:"follow-up-investments-distribution-of-investments-product-saving-plan"},RETIREMENT_PLAN:{id:"RETIREMENT_PLAN",label:"follow-up-investments-distribution-of-investments-product-retirement-plan"},PORTFOLIO:{id:"PORTFOLIO",label:"follow-up-investments-distribution-of-investments-product-portfolio"},MANAGED_INVESTMENTFUNDS_PORTFOLIO:{id:"MANAGED_INVESTMENTFUNDS_PORTFOLIO",label:"follow-up-investments-distribution-of-investments-product-managed-portfolio"}},Ut=[Gt.DEPOSIT.id,Gt.INVESTMENT_FUND.id,Gt.SECURITIES_ACCOUNT.id,Gt.SAVING_PLAN.id,Gt.RETIREMENT_PLAN.id,Gt.PORTFOLIO.id,Gt.MANAGED_INVESTMENTFUNDS_PORTFOLIO.id],Yt=[qt.primaryMediumLight,qt.primaryVariant,qt.tertiaryType3,qt.tertiaryType2,qt.tertiaryType5,qt.secondary400],Zt="BALANCE",Jt=[{id:0,title:"follow-up-investments-distribution-of-investments-more-information-products",emptyDescription:"follow-up-investments-distribution-of-investments-empty-products"},{id:1,title:"follow-up-investments-distribution-of-investments-more-information-families",emptyDescription:"follow-up-investments-distribution-of-investments-empty-families"}],Xt="transparent",Kt={"one-month":{id:"one-month",numberMonths:1,type:"months",valueForType:1},"three-months":{id:"three-months",numberMonths:3,type:"months",valueForType:3},"year-to-date":{id:"year-to-date",numberMonths:0,type:"year",valueForType:0}},{moment:Qt}=window,te=t=>{const e=Kt[t],{id:i,type:a,valueForType:n}=e||{};return((t,e,i)=>{const a=Qt();return t===Kt["year-to-date"].id?a.startOf("year"):a.subtract(i,e).startOf("day")})(i,a,n).format("YYYY-MM-DD")},ee=(t,e)=>{var i;"main-header"===(null===(i=(t=>(t.composedPath&&t.composedPath()||t.path)[0])(t))||void 0===i?void 0:i.id)&&e&&e()},ie=({id:t,bank:e,productType:i,name:a,amounts:n=[],number:r,stockMarket:o,currencies:s=[],numberTypeIsin:c})=>{var l;return{id:t,bank:e,productType:i,name:a,amount:n[0]?n[0].amount:0,currency:n[0]?n[0].currency:null===(l=s[0])||void 0===l?void 0:l.currency,numberType:{id:c},number:r,status:{id:"VALID"},stockMarket:o}};const ae=(t,e)=>null==t?void 0:t.map((t=>{const i={...t},a=e.find((e=>{return a=t,(i=e).id===a.id&&i.number===a.number&&(null===(n=i.stockMarket)||void 0===n?void 0:n.id)===(null===(r=a.stockMarket)||void 0===r?void 0:r.id);var i,a,n,r}))||{};return i.name=a.name,i})),ne=(t,e="weightValue")=>t.sort(((t,i)=>t[e]>i[e]?1:t[e]<i[e]?-1:0)).reverse(),re=t=>t.map((t=>{const{color:e,name:i,percentage:a}=t;return{label:i,value:a,color:e}}));const{moment:oe}=window;class se extends(j(Ct(it(N(T))))){static get is(){return"follow-up-investments-distribution-of-investments"}static get scopedElements(){const t=[dt,bt,Nt,_t,at,ht,jt,vt,...se.configurationScopedElements()];return se.scopedElementsFromClasses(t)}static get properties(){return{errorModalVisible:{type:Boolean,attribute:"error-modal"},financialInvestmentsApiVersion:{type:String,attribute:"financial-investments-api-version"},financialOverviewApiVersion:{type:String,attribute:"financial-overview-api-version"},hideMenuIcon:{type:Boolean,attribute:"hide-menu-icon"},investmentProductType:{type:Array,attribute:"investment-product-type"},numberTypeIsin:{type:String,attribute:"number-type-isin"},numberIsin:{type:String,attribute:"number-isin"},moreInfoModel:{type:Object,attribute:"more-info-model"},colorsList:{type:Array,attribute:"colors-list"},selectedPeriod:{typE:String,attribute:"selected-period"},specificAmountProduct:{type:String,attribute:"specific-amount-product"},numberStockMarket:{type:String,attribute:"number-stock-market"},otherContractId:{type:String,attribute:"other-contract-id"},_distributionDefaultFamily:{type:Object},_distributionDefaultProduct:{type:Object},_selectedItemIndex:{type:Number},_selectedTab:{type:Number},_showInfo:{type:Boolean},_showOthersElements:{type:Boolean}}}constructor(){super(),this.errorModalVisible=!1,this.moreInfoModel=null,this.colorsList=Yt,this.financialInvestmentsApiVersion="",this.financialOverviewApiVersion="0",this.hideMenuIcon=!1,this.investmentProductType=Ut,this.numberTypeIsin="ISIN",this.numberIsin="000000000000",this.selectedPeriod="year-to-date",this.specificAmountProduct="BALANCE",this.numberStockMarket="0000",this.otherContractId="OTHERS",this._contractsConfiguration={hasHistoricalDataForAllContracts:!0,maximumHistoricalDate:oe().format("YYYY-MM-DD")},this._distributionDefaultFamily={},this._distributionDefaultProduct={},this._distributionFamilyList=[],this._distributionProductList=[],this._financialOverviewProducts=[],this._getSpecificAmount=null,this._infoFamilyList=[],this._infoProductList=[],this._otherFamily={},this._otherProduct={},this._selectedItemIndex=0,this._selectedTab=0,this._showInfo=!1,this._showOthersElements=!1,this._configPage()}firstUpdated(t){super.firstUpdated(t),this._headerEventsInit(),this._getSpecificAmount=function(t){const{BALANCE_CODE_ALTERNATIVE:e}=t;return(t,{isFinancialOverview:i}={})=>null==t?void 0:t.reduce(((t,a)=>{const n=null==a?void 0:a.id;return(i?n.toUpperCase()===e:n.toUpperCase()===Zt)&&(t.balance=a),t}),{balance:{amount:{}},profit:{amount:{}},totalAmount:{amounts:{}},contribution:null})}({BALANCE_CODE_ALTERNATIVE:this.specificAmountProduct}),this._datamanagersInit(),this._initModel()}updated(t){super.updated(t),t.has("moreInfoModel")&&this.moreInfoModel&&this._createListProductsAndFamilies(),t.has("hideMenuIcon")&&this.hideMenuIcon&&this._hideMenuIcon()}static get styles(){return[Wt,mt.light,gt.light,ut.light,zt.light,ft.light,B("follow-up-investments-distribution-of-investments-shared-styles")]}get _emptyTabs(){return L`
      <bbva-tab-default
        selected=${this._selectedTab}
        .options=${Jt}
        @tab-default-tab-change="${this._distributionTabsClick}"
      >
        <bbva-panel-info
          heading=${this.t("follow-up-investments-distribution-of-investments-empty-title")}
          text="${Jt[this._selectedTab].emptyDescription}"
        ></bbva-panel-info>
      </bbva-tab-default>
    `}get _renderErrorModalContent(){return L`
      <bbva-help-modal
        ?visible=${this.errorModalVisible}
        full-height
        fixed-footer
        header-type="modal"
        icon-right-primary="${nt()}"
        accessibility-text-icon-right-primary="${this.t("follow-up-investments-distribution-of-investments-header-close")}"
        header-text="${this.t("follow-up-investments-distribution-of-investments-header-text")}"
        button-text="${this.t("follow-up-investments-distribution-of-investments-modal-error-retry")}"
        link-text="${this.t("follow-up-investments-distribution-of-investments-modal-error-exit")}"
        @header-main-icon-right-primary-click=${this.navigateBack}
        @help-modal-footer-link-click="${this.navigateBack}"
        @help-modal-footer-button-click="${()=>{this.errorModalVisible=!1,this._initModel()}}"
        @help-modal-open="${this._handleErrorModalState}"
        @help-modal-close="${this._handleErrorModalState}"
      >
        <div class="content" slot="slot-content">
          <bbva-panel-info
            .microillustration="${rt}"
            heading="${this.t("follow-up-investments-distribution-of-investments-error-title")}"
            text="${this.t("follow-up-investments-distribution-of-investments-error-description")}"
          ></bbva-panel-info>
        </div>
      </bbva-help-modal>
    `}get _familiesList(){var t;return(null===(t=this.moreInfoModel)||void 0===t?void 0:t.families)||[]}get _familiesWithoutOthers(){return this._familiesList.filter((t=>t.id!==this.otherContractId))}get _isProductTab(){return 0===this._selectedTab}get _limitOthers(){return this._productList.some((t=>t.id===this.otherContractId))?this._productList.filter((t=>!t.isOthersGroupType&&t.id!==this.otherContractId)).length:this._productList.length}get _productList(){var t;return(null===(t=this.moreInfoModel)||void 0===t?void 0:t.contracts)||[]}get _productsWithoutOthers(){return this._productList.filter((t=>t.id!==this.otherContractId))}get _moreFamilyThanLimit(){return this._familiesWithoutOthers.length>this._limitOthers}get _moreProductThanLimit(){return this._productsWithoutOthers.length>this._limitOthers}get _renderDatamanagersContent(){return L`
      <bbva-global-financial-overview-api-dm
        id="dmFinancialOverview"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="${C(this.financialOverviewApiVersion)}"
        ?native="${this.native}"
        @financial-overview-api-dm-fetch=${t=>this._dm.callbackFinancialOverview(t,this._setFinancialOverviewData)}
        @financial-overview-api-dm-fetch-error=${t=>this._dm.callbackFinancialOverview(t,this._setFinancialOverviewData,{hasError:!0})}
        @api-dm-error=${t=>this._dm.callbackFinancialOverview(t,this._setFinancialOverviewData,{hasError:!0})}
      >
      </bbva-global-financial-overview-api-dm>
      <bbva-global-financial-investments-calculate-balances-by-period-api-dm
        id="dmCalculateBalancesByPeriod"
        .headers="${{"accept-language":this.language}}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        version="${C(this.financialInvestmentsApiVersion)}"
        ?native="${this.native}"
        @financial-investments-calculate-balances-by-period-api-dm-fetch=${t=>this._dm.callbackCalculateBalancesByPeriod(t,this._setCalculateBalanceByPeriodData)}
        @financial-investments-calculate-balances-by-period-api-dm-fetch-error=${t=>{this._dm.callbackCalculateBalancesByPeriod(t,this._setCalculateBalanceByPeriodData,{hasError:!0})}}
        @api-dm-error=${t=>{this._dm.callbackCalculateBalancesByPeriod(t,this._setCalculateBalanceByPeriodData,{hasError:!0})}}
      >
      </bbva-global-financial-investments-calculate-balances-by-period-api-dm>
    `}get _renderMainContent(){return this._showInfo?L`
          <bbva-tab-default
            selected=${this._selectedTab}
            accessibility-text="${this.t("follow-up-investments-distribution-of-investments-available-sections")}"
            .options=${Jt}
            @tab-default-tab-change="${this._distributionTabsClick}"
          >
            <div class="panel" tabindex="0" role="tabpanel" id="content-0" aria-labelledby="tab-0">
              ${this._renderDistribution(0)}
              ${this._renderLegend(0)}
            </div>
            <div class="panel" tabindex="0" role="tabpanel" id="content-1" aria-labelledby="tab-1">
              ${this._renderDistribution()} ${this._renderLegend()}
            </div>
          </bbva-tab-default>
        `:this._emptyTabs}navigateBack(t=!0){this.errorModalVisible&&(this.errorModalVisible=!1),this._reset(),(t??1)&&this.dispatchEvent(new CustomEvent("navigation-go-back",{bubbles:!0,cancelable:!0,composed:!0}))}_buildModelData(){var t,e,i;this._dm.calculateBalancesByPeriodIsPending||(this.moreInfoModel=(t=this._balanceByPeriod||{contracts:[]},e=this._financialOverviewProducts,i=this.specificAmountProduct,{contracts:ae(null==t?void 0:t.contracts,e),families:(null==t?void 0:t.families)||[],specificAmountProduct:i}),this._dm.calculateBalancesByPeriodHasError&&(this.errorModalVisible=!0),this.clearLoader())}_callFinancialOverview(t){this._financialOverviewProducts&&0!==this._financialOverviewProducts.length||t?this._setFinancialOverviewData(t):(this.showLoader(Xt),this._dm.getFinancialOverview())}_callBalances(){this.showLoader(Xt);const t=(e=this.selectedPeriod,this._maximumHistoricalDate,{period:{startDate:te(e),endDate:Qt().format("YYYY-MM-DD")},frequency:{id:"DAILY"}});var e;this._dm.postFinancialInvestmentsCalculateBalancesByPeriod(((t,e)=>{const{startDate:i,endDate:a}=t.period;return{period:{startDate:i,endDate:a,periodGroup:{id:t.frequency.id}},isGroupedByWeight:!0,isGroupedByCancelled:!1,contracts:null==e?void 0:e.map((t=>{const{amount:e,bank:n,currency:r,id:o,number:s,numberType:c,productType:l,stockMarket:d}=t;return{investmentValueAmount:{amount:e,currency:r},bank:n,id:o,number:s,numberType:c,productType:l,stockMarket:d,startDate:i,endDate:a}}))}})(t,this._financialOverviewProducts))}_checkInternationalFunds(t,e){return t===Gt.SECURITIES_ACCOUNT.id&&e&&e.some((t=>t.productType.id===this.typeInternationalFunds))}_colorForProduct(t){return this.colorsList[t<5?t:5]}_configPage(){this.config={header:{id:"main-header",text:this.t("follow-up-investments-distribution-of-investments-header-text"),accessibilityTextIconLeftPrimary:this.t("follow-up-investments-distribution-of-investments-header-back"),accessibilityTextIconRightPrimary:this.t("follow-up-investments-distribution-of-investments-header-menu"),iconLeftPrimary:q(),iconRightPrimary:ot(),position:"fixed",variant:"notch-top"},loader:!0},this.language="en-EN"}_createDistributionDefault(t){const{index:e,name:i,percentage:a}=t;return{amount:a,amountVariant:"3xl",currency:"%",index:e,language:this.language,size:"S",text:i}}_createFamilyList(){this._otherFamily=this._createOtherElement(this._moreFamilyThanLimit,this._familiesList),this._infoFamilyList=this._createInfoElements({limitOthers:this._limitOthers,elements:this._familiesList,otherElement:this._otherFamily||{}}),this._distributionDefaultFamily=this._createDistributionDefault(this._infoFamilyList[0]),this._distributionFamilyList=re(this._infoFamilyList)}_createInfoElements({limitOthers:t,elements:e,otherElement:i}){const a=e.filter((t=>!t.isOthersGroupType&&t.id!==this.otherContractId)),n=ne(a),r=i.element;return r&&n.push(r),this._normalizeElements({limitOthers:t,elements:n})}_createListProductsAndFamilies(){if(this._productList&&this._productList.length>0)try{this._createProductList(),this._createFamilyList(),this._showInfo=!0}catch{this.errorModalVisible=!0}}_createOtherElement(t,e){if(t){const t=null==e?void 0:e.filter((t=>t.isOthersGroupType&&t.id!==this.otherContractId)),i=null==e?void 0:e.find((t=>t.id===this.otherContractId)),{id:a,specificAmounts:n,weightValue:r}=i||{};return{element:{id:a,name:"follow-up-investments-distribution-of-investments-others-element",specificAmounts:n,weightValue:r},list:ne(this._normalizeElements({limitOthers:this._limitOthers,elements:t,lastElement:!0}))}}return null}_createProductList(){this._otherProduct=this._createOtherElement(this._moreProductThanLimit,this._productList),this._infoProductList=this._createInfoElements({limitOthers:this._limitOthers,elements:this._productList,otherElement:this._otherProduct||{}}),this._distributionDefaultProduct=this._createDistributionDefault(this._infoProductList[0]),this._distributionProductList=re(this._infoProductList)}_datamanagersInit(){var t;this._dm||(this._dm=(t=this,{financialOverviewIsPending:!1,financialOverviewHasError:!1,getFinancialOverview(t){this.financialOverviewIsPending=!0,this.financialOverviewHasError=!1,this.financialOverview.getFinancialOverview(t)},callbackFinancialOverview(e,i,{hasError:a=!1}={}){if(this.financialOverviewIsPending=!1,a&&(this.financialOverviewHasError=!0),i){const n=null==e?void 0:e.detail;i.bind(t)(n,{hasError:a})}},calculateBalancesByPeriodIsPending:!1,calculateBalancesByPeriodHasError:!1,postFinancialInvestmentsCalculateBalancesByPeriod(t){this.calculateBalancesByPeriodIsPending=!0,this.calculateBalancesByPeriodHasError=!1,this.calculateBalancesByPeriod.postFinancialInvestmentsCalculateBalancesByPeriod(t)},callbackCalculateBalancesByPeriod(e,i,{hasError:a=!1}={}){if(this.calculateBalancesByPeriodIsPending=!1,a&&(this.calculateBalancesByPeriodHasError=!0),i){const n=null==e?void 0:e.detail;i.bind(t)(n,{hasError:a})}},financialOverview:t.shadowRoot.querySelector("#dmFinancialOverview"),calculateBalancesByPeriod:t.shadowRoot.querySelector("#dmCalculateBalancesByPeriod")}))}_distributionDonutClick(t={}){var e;const i=null===(e=t.detail)||void 0===e?void 0:e.value;this._updateSelectedItem(i);const a=this._productList[i],n=new CustomEvent("follow-up-investments-distribution-of-investments-donut-click",{bubbles:!0,composed:!0,detail:{productId:null==a?void 0:a.id}});this.dispatchEvent(n)}_distributionTabsClick(t){var e;this._selectedTab=null===(e=t.detail)||void 0===e?void 0:e.selectedIndex,this._showOthersElements=!1,this._updateSelectedItem(0);const i=new CustomEvent("follow-up-investments-distribution-of-investments-tab-change",{bubbles:!0,composed:!0,detail:{selectedTab:this._selectedTab}});this.dispatchEvent(i)}_handleErrorModalState(t){const{target:e}=t;this.errorModalVisible=!!e.visible,this.dispatchEvent(new CustomEvent("follow-up-investments-distribution-of-investments-error-modal-change",{bubbles:!0,composed:!0,detail:{visible:this.errorModalVisible,target:e,property:"error-modal"}}))}_headerEventsInit(){this.addEventListener("header-main-icon-left-primary-click",(t=>{ee(t,(()=>this.navigateBack()))})),this.addEventListener("header-main-icon-right-primary-click",(t=>{ee(t,(()=>this._openMenu()))}))}_hideMenuIcon(){this.config.header={...this.config.header,accessibilityTextIconRightPrimary:null,iconRightPrimary:null},this.config={...this.config}}_initModel(){var t;this.moreInfoModel?this._createListProductsAndFamilies():this._callFinancialOverview(null===(t=this.financialOverview)||void 0===t?void 0:t.data)}_legendClick(t){this._updateSelectedItem(t);const e=new CustomEvent("follow-up-investments-distribution-of-investments-item-click",{bubbles:!0,composed:!0,detail:{positionLegend:t,isProduct:this._isProductTab}});this.dispatchEvent(e)}_moreDetailClick(t){this._showOthersElements=t.detail;const e=new CustomEvent("follow-up-investments-distribution-of-investments-expand-others-click",{bubbles:!0,composed:!0,detail:{showOthersElements:this._showOthersElements,isProduct:this._isProductTab}});this.dispatchEvent(e)}_normalizeFinancialOverviewProducts(t){const e=[];return t.forEach((t=>{var i,a;const{id:n,productType:r,product:o,alias:s,detail:c,currencies:l,bank:d}=t,{internationalFunds:h,portfolio:m,specificAmounts:u,specificAmountsSecurities:p}=c;if(e.push(ie({id:n,bank:d,productType:r,name:s||o.name,amounts:null===(i=this._getSpecificAmount(u||p,{isFinancialOverview:!0}))||void 0===i||null===(a=i.balance)||void 0===a?void 0:a.amounts,number:this.numberIsin,stockMarket:{id:this.numberStockMarket},currencies:l,numberTypeIsin:this.numberTypeIsin})),this._checkInternationalFunds(r,h)){const t=(null==m?void 0:m.id)||n;this._normalizeInternationalFunds(h,t,d).forEach((t=>{e.push(t)}))}})),e}_normalizeElements({limitOthers:t,elements:e,lastElement:i}){return e.map(((e,a)=>{var n;const{id:r,name:o,specificAmounts:s,weightValue:c}=e,{amount:l}=s.find((t=>t.id===Zt))||{};return{index:a,amount:l.amount,color:this._colorForProduct(i?t:a),currency:l.currency,currencyCode:l.currency,name:o||(null===(n=Gt[r])||void 0===n?void 0:n.label),percentage:c||0}}))}_normalizeInternationalFunds(t=[],e,i){return t.filter((t=>t.productType.id===this.typeInternationalFunds)).map((t=>{var a,n,r;const o=null===(a=t.formats)||void 0===a?void 0:a.find((t=>t.numberType.id===this.numberTypeIsin)),s={id:null===(n=t.stockMarket.formats.find((t=>"INTERNAL"===t.numberType.id)))||void 0===n?void 0:n.numberType.name};return ie({id:e,bank:i,productType:"INVESTMENT_INTERNATIONAL_FUND",name:t.name,amounts:null===(r=this._getSpecificAmount(t.specificAmounts))||void 0===r?void 0:r.totalAmount.amounts,number:null==o?void 0:o.number,stockMarket:s,numberTypeIsin:this.numberTypeIsin})}))}_openMenu(){this.dispatchEvent(new CustomEvent("follow-up-investments-distribution-of-investments-menu-open",{bubbles:!0,composed:!1,detail:!0}))}_renderDistribution(t){const e=0===t,i=e?this._distributionDefaultProduct:this._distributionDefaultFamily,a=e?this._distributionProductList:this._distributionFamilyList;return L`
      <bbva-data-visualization-donut
        selected-slice=${i.index}
        sort="[[sort]]"
        stroke-color="#fff"
        stroke-width="0"
        type="percentage"
        amount=${i.amount}
        amount-variant=${i.amountVariant}
        text=${this.t(i.text)}
        size=${i.size}
        currency-code=${i.currency}
        language=${i.language}
        @data-visualization-donut-selected-slice-changed="${this._distributionDonutClick}"
        .data=${a}
      >
      </bbva-data-visualization-donut>
    `}_renderLegend(t){var e;const i=0===t,a=i?this._otherProduct:this._otherFamily,n=i?this._infoProductList:this._infoFamilyList;return L`
      <ul>
        ${n.map(((t,e)=>L`
            <li>
              <bbva-list-legend
                ?link-selected="${e===this._selectedItemIndex}"
                label=${this.t(t.name)}
                amount=${t.amount}
                currency-code=${t.currencyCode}
                local-currency=${t.currency}
                bar-legend-color=${t.color}
                ?label-link="${e<6}"
                @list-legend-link-click="${()=>this._legendClick(e)}"
              >
              </bbva-list-legend>
            </li>
          `))}
      </ul>

      ${this._showOthersElements?L`
            <ul>
              ${null==a||null===(e=a.list)||void 0===e?void 0:e.map((t=>L`
                  <li>
                    <bbva-list-legend
                      label=${t.name}
                      amount=${t.amount}
                      currency-code=${t.currencyCode}
                      local-currency=${t.currency}
                      bar-legend-color=${t.color}
                    >
                    </bbva-list-legend>
                  </li>
                `))}
            </ul>
          `:""}
      ${a?L`
            <bbva-expandable-panel
              see-more=${this.t("follow-up-investments-distribution-of-investments-more-info-panel-see-more")}
              see-less=${this.t("follow-up-investments-distribution-of-investments-more-info-panel-see-less")}
              ?expanded=${this._showOthersElements}
              @expandable-panel-expand="${this._moreDetailClick}"
            ></bbva-expandable-panel>
          `:""}
    `}_reset(){this._selectedTab=0,this._showOthersElements=!1,this._updateSelectedItem(0),this.moreInfoModel={}}_setCalculateBalanceByPeriodData(t,{hasError:e=!1}={}){e||(this._balanceByPeriod=t),this._buildModelData()}_setFinancialOverviewData(t,{hasError:e}={}){if(e)this.errorModalVisible=!0,this.clearLoader();else try{const e=((null==t?void 0:t.contracts)||[]).filter((t=>this.investmentProductType.some((e=>e===t.productType))));this._financialOverviewProducts=this._normalizeFinancialOverviewProducts(e),this._maximumHistoricalDate=this._contractsConfiguration.maximumHistoricalDate||"",this._callBalances()}catch{this.errorModalVisible=!0,this.clearLoader()}}_updateDistributionDefault(t){const e=this._isProductTab?this._distributionProductList:this._distributionFamilyList;if(null!=t&&t>=0&&e.length>0){const{label:i,value:a}=e[t];this._isProductTab?this._distributionDefaultProduct=this._createDistributionDefault({index:t,name:i,percentage:a}):this._distributionDefaultFamily=this._createDistributionDefault({index:t,name:i,percentage:a})}}_updateSelectedItem(t){this._updateDistributionDefault(t),this._selectedItemIndex=t}render(){return L`
      ${super.render()} ${this._renderDatamanagersContent}
      <div ambient="light">
        ${this._renderMainContent} ${this._renderErrorModalContent}
      </div>
    `}}customElements.define(se.is,se);
