import{z as t,ap as a,an as e,L as i,ak as l,bx as r,aD as o,h as s,av as n,i as c,aX as u,W as d,ck as b,bn as m,bS as p,bF as v}from"./952f98a9.js";import{R as h,S as g,u as y,T as f,D as _,z as x,E as $,v as k,W as S,w as T,x as D,G as w,H as E,I as A,L as C,a3 as q,N as z,as as O,a4 as I,at as R,Q as j,K as L,a1 as P,ar as M,e as F,a2 as N,aa as H,M as X,af as B,F as V,ah as U,A as W,ae as G}from"./216055dc.js";import"./b87bf4dd.js";import{B as K}from"./f841c773.js";import{b as J,B as Q}from"./2b04e291.js";import{aI as Y,aH as Z}from"./7f3d7ca9.js";import{B as tt}from"./c0a2f832.js";import{s as at}from"./8dab2181.js";import"./cae0f1de.js";var et=t`
:host {
  --_table-default-background-color: var(--bbva-table-default--_ambient--background-color,
      var(--bbva-table-default--custom--primary-ambient--background-color,
          ${h("colorPrimarySurfaceAlternativeDefault",g)}));
  --_table-default-header-background-color: var(--bbva-table-default--_ambient--header-background-color,
      var(--bbva-table-default--custom--primary-ambient--header-background-color,
          ${h("colorPrimarySurfaceAmbientDefault",g)}));
  --_table-default-header-border-bottom-color: var(--bbva-table-default--_ambient--header-border-bottom-color,
      var(--bbva-table-default--custom--primary-ambient--header-border-bottom-color,
          ${h("colorPrimaryFormatDivider",g)}));
  --_table-default-gradient-color:
     var(--bbva-table-default--_ambient--gradient-color,
         var(--bbva-table-default--custom--primary-ambient--gradient-color,
             ${h("colorPrimarySurfaceAmbientDefault",g)}));
  --_table-default-scrollbar-thumb-color:
      var(--bbva-table-default--_ambient--scrollbar-thumb-color,
          var(--bbva-table-default--custom--primary-ambient--scrollbar-thumb-color,
              ${h("colorPrimaryText01Default",g)}));
  --_table-default-scrollbar-track-color:
      var(--bbva-table-default--_ambient--scrollbar-track-color,
          var(--bbva-table-default--custom--primary-ambient--scrollbar-track-color,
              ${h("colorPrimarySurfaceAlternativeDefault",g)}));
  --_table-default-divider-bg-color:
      var(--bbva-table-default--_ambient--divider-bg-color,
          var(--bbva-table-default--custom--primary-ambient--divider-bg-color,
              ${h("colorPrimaryFormatDivider",g)}));
  --_table-default-divider-negative-bg-color:
      var(--bbva-table-default--_ambient--divider-negative-bg-color,
          var(--bbva-table-default--custom--primary-ambient--divider-negative-bg-color,
              ${h("colorPrimarySurfaceAmbientDefault",g)}));
}
`;const it=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-table-default--_ambient--background-color: initial;
    --bbva-table-default--_ambient--header-background-color: initial;
    --bbva-table-default--_ambient--gradient-color: initial;
    --bbva-table-default--_ambient--scrollbar-thumb-color: initial;
    --bbva-table-default--_ambient--scrollbar-track-color: initial;
    --bbva-table-default--_ambient--divider-bg-color: initial;
    --bbva-table-default--_ambient--divider-negative-bg-color: initial;
    --bbva-table-default--_ambient--skeleton-quote-row-bg: initial;
  }
`,lt=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-table-default--_ambient--background-color: var(
      --bbva-table-default--custom--primary-alt-ambient--background-color,
      ${h("colorPrimaryAltSurfaceAlternativeDefault",g)}
    );
    --bbva-table-default--_ambient--header-background-color: var(
      --bbva-table-default--custom--primary-alt-ambient--header-background-color,
      ${h("colorPrimaryAltSurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--gradient-color: var(
      --bbva-table-default--custom--primary-alt-ambient--gradient-color,
        ${h("colorPrimaryAltSurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--gradient-color: var(
      --bbva-table-default--custom--primary-alt-ambient--gradient-color,
        ${h("colorPrimaryAltSurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--scrollbar-thumb-color: var(
      --bbva-table-default--custom--primary-alt-ambient--scrollbar-thumb-color,
        ${h("colorPrimaryAltText01Default",g)}
    );
    --bbva-table-default--_ambient--scrollbar-track-color: var(
      --bbva-table-default--custom--primary-alt-ambient--scrollbar-track-color,
        ${h("colorPrimaryAltSurfaceAlternativeDefault",g)}
    );
    --bbva-table-default--_ambient--divider-bg-color: var(
      --bbva-table-default--custom--primary-alt-ambient--divider-bg-color,
        ${h("colorPrimaryAltFormatDivider",g)}
    );
    --bbva-table-default--_ambient--divider-negative-bg-color: var(
      --bbva-table-default--custom--primary-alt-ambient--divider-negative-bg-color,
        ${h("colorPrimaryAltSurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--skeleton-quote-row-bg: var(
      --bbva-table-default--custom--primary-alt-ambient--skeleton-quote-row-bg,
      ${h("colorPrimaryAltSurfaceAmbientPreloading",g)}
    );
  }
`,rt=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-table-default--_ambient--background-color: var(
      --bbva-table-default--custom--secondary-ambient--background-color,
      ${h("colorSecondarySurfaceAlternativeDefault",g)}
    );
    --bbva-table-default--_ambient--header-background-color: var(
      --bbva-table-default--custom--secondary-ambient--header-background-color,
      ${h("colorSecondarySurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--gradient-color: var(
      --bbva-table-default--custom--secondary-ambient--gradient-color,
        ${h("colorSecondarySurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--scrollbar-thumb-color: var(
      --bbva-table-default--custom--secondary-ambient--scrollbar-thumb-color,
        ${h("colorSecondaryText01Default",g)}
    );
    --bbva-table-default--_ambient--scrollbar-track-color: var(
      --bbva-table-default--custom--secondary-ambient--scrollbar-track-color,
        ${h("colorSecondarySurfaceAlternativeDefault",g)}
    );
    --bbva-table-default--_ambient--divider-bg-color: var(
      --bbva-table-default--custom--secondary-ambient--divider-bg-color,
        ${h("colorSecondaryFormatDivider",g)}
    );
    --bbva-table-default--_ambient--divider-negative-bg-color: var(
      --bbva-table-default--custom--secondary-ambient--divider-negative-bg-color,
        ${h("colorSecondarySurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--divider-negative-bg-color: var(
      --bbva-table-default--custom--secondary-ambient--divider-negative-bg-color,
        ${h("colorSecondarySurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--skeleton-quote-row-bg: var(
      --bbva-table-default--custom--secondary-ambient--skeleton-quote-row-bg,
      ${h("colorSecondarySurfaceAmbientPreloading",g)}
    );
  }
`,ot=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-table-default--_ambient--background-color: var(
      --bbva-table-default--custom--secondary-alt-ambient--background-color,
      ${h("colorSecondaryAltSurfaceAlternativeDefault",g)}
    );
    --bbva-table-default--_ambient--header-background-color: var(
      --bbva-table-default--custom--secondary-alt-ambient--header-background-color,
      ${h("colorSecondaryAltSurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--gradient-color: var(
      --bbva-table-default--custom--secondary-alt-ambient--gradient-color,
        ${h("colorSecondaryAltSurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--scrollbar-thumb-color: var(
      --bbva-table-default--custom--secondary-alt-ambient--scrollbar-thumb-color,
        ${h("colorSecondaryAltText01Default",g)}
    );
    --bbva-table-default--_ambient--scrollbar-track-color: var(
      --bbva-table-default--custom--secondary-alt-ambient--scrollbar-track-color,
        ${h("colorSecondaryAltSurfaceAlternativeDefault",g)}
    );
    --bbva-table-default--_ambient--divider-bg-color: var(
      --bbva-table-default--custom--secondary-alt-ambient--divider-bg-color,
        ${h("colorSecondaryAltFormatDivider",g)}
    );
    --bbva-table-default--_ambient--divider-negative-bg-color: var(
      --bbva-table-default--custom--secondary-alt-ambient--divider-negative-bg-color,
        ${h("colorSecondaryAltSurfaceAmbientDefault",g)}
    );
    --bbva-table-default--_ambient--skeleton-quote-row-bg: var(
      --bbva-table-default--custom--secondary-alt-ambient--skeleton-quote-row-bg,
      ${h("colorSecondaryAltSurfaceAmbientPreloading",g)}
    );
  }
`;const st=y([Object.freeze({__proto__:null,primary:it,primaryAlt:lt,secondary:rt,secondaryAlt:ot}),f,_,x,$]),nt=Object.values(st);var ct=t`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
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

[data-tag-name=bbva-type-icon] {
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.table-default {
  width: 100%;
  background-color: var(--_table-default-background-color);
  border-collapse: collapse;
  border-spacing: 0;
}
.table-default__header {
  min-height: 2.5rem;
  border-bottom: 0.0625rem solid var(--_table-default-header-border-bottom-color);
  background-color: var(--_table-default-header-background-color);
}
.table-default__header__item {
  max-width: 6.9375rem;
  padding: 0.5rem 0.25rem;
}
.table-default__header__item:first-child {
  padding-left: 1rem;
  text-align: left;
}
.table-default__header__item:first-child.mobile.icon-help {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  text-align: left;
}
.table-default__header__item:first-child.mobile.icon-help [data-tag-name=bbva-type-text] {
  max-width: 3.125rem;
}
.table-default__header__item:last-child {
  padding-right: 1rem;
}
.table-default__header .icon-help {
  display: inline-flex;
}
.table-default__row {
  min-height: 2.5rem;
}
.table-default__item {
  max-width: 6.9375rem;
  padding: 0.5rem 0.25rem;
}
.table-default__row .table-default__item {
  text-align: end;
}
.table-default__row .table-default__item:first-child {
  padding-left: 1rem;
  text-align: left;
}
.table-default__row .table-default__item:last-child {
  padding-right: 1rem;
}

.title {
  padding: 1rem 0;
}

.link-text {
  padding: 0.5rem 1rem;
}

.container-table-comparative {
  display: inline-flex;
  width: 100%;
  flex-wrap: wrap;
}
.container-table-comparative table:nth-child(1) > tbody > tr:nth-child(n) > td:nth-child(n) {
  border: none;
}
.container-table-comparative.mobile table:nth-child(3) > tbody > tr:nth-child(n) > td:nth-child(n),
.container-table-comparative.mobile table:nth-child(5) > tbody > tr:nth-child(n) > td:nth-child(n) {
  border: none;
}
.container-table-comparative tr {
  display: inline-flex;
  width: 100%;
  flex-direction: column;
}
.container-table-comparative .table-comparative {
  flex: 1 1 auto;
  border-collapse: collapse;
  border-spacing: 0;
  table-layout: fixed;
}
.container-table-comparative .table-comparative.mobile {
  flex: 1 1 50%;
}
.container-table-comparative .table-comparative__headers {
  background-color: var(--_table-default-background-color);
}
.container-table-comparative .table-comparative__header {
  min-height: 2.5rem;
  padding: 0.5rem 0;
}
.container-table-comparative .table-comparative__item, .container-table-comparative .table-comparative__item-header {
  max-width: 90%;
  min-height: 2rem;
  padding: 0.25rem 1rem;
}
.container-table-comparative .table-comparative__item {
  position: relative;
  left: -0.03125rem;
  border: 0.125rem solid var(--_table-default-divider-bg-color);
  border-top: 0;
  border-right: 0;
  border-bottom: 0;
}
.container-table-comparative .table-comparative__item::before {
  position: absolute;
  top: 0;
  left: -0.10625rem;
  width: 0.3125rem;
  height: 0.5rem;
  background: var(--_table-default-gradient-color);
  content: "";
}

.table-container {
  position: relative;
  display: inline-flex;
  overflow: hidden;
  width: 100%;
}
.table-container.mobile .table-complex {
  display: inline-table;
}
.table-container.mobile td {
  min-width: 3.4375rem;
}
.table-container .gradient.left::before, .table-container .gradient.right::after {
  position: absolute;
  top: 0;
  left: 0;
  width: 4rem;
  height: 100%;
  background: linear-gradient(to right, var(--_table-default-gradient-color) 0%, rgba(255, 255, 255, 0) 100%);
  content: "";
  pointer-events: none;
}
.table-container .gradient.right::after {
  right: 0;
  left: auto;
  transform: rotate(180deg);
}
.table-container .table-complex {
  position: relative;
  display: table;
  flex: 1 1 auto;
  border-collapse: collapse;
  border-spacing: 0;
  overflow-x: auto;
}
.table-container .table-complex__headers {
  background-color: var(--_table-default-background-color);
}
.table-container .table-complex__item {
  min-height: 2rem;
  padding: 0.5rem 0.25rem;
}
.table-container .table-complex__corner {
  position: relative;
  bottom: -0.03125rem;
  border: 0.0625rem solid;
  border-top: 0;
  border-right: 0;
  border-left: 0;
  background-color: var(--_table-default-gradient-color);
}
.table-container .table-complex__corner::after {
  position: absolute;
  top: 34px;
  left: 0;
  width: 100%;
  height: 0.5rem;
  background: var(--_table-default-gradient-color);
  content: "";
}
.table-container .table-complex__corner thead {
  width: 100%;
}
.table-container .table-complex.scroll {
  scrollbar-width: none;
}
.table-container .table-complex.scroll::-webkit-scrollbar {
  display: auto;
  height: 0.5rem;
  background-color: transparent;
}
.table-container .table-complex.scroll::-webkit-scrollbar-track:horizontal {
  border-radius: 50px;
  background-color: var(--_table-default-scrollbar-track-color);
}
.table-container .table-complex.scroll::-webkit-scrollbar-thumb {
  border-radius: 50px;
  background-color: var(--_table-default-scrollbar-thumb-color);
}

:host([type=complex][scroll=true]) .table-container.mobile .table-complex {
  display: block;
}

.colgroup col:nth-child(2) {
  width: 6.1875rem;
}
.colgroup col:nth-child(3) {
  width: 6.9375rem;
}

.skeleton {
  overflow: hidden;
  width: 100%;
  height: 2.5rem;
}
.skeleton .animation {
  height: 2.5rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%);
  mask-position: 16px 12px, calc(100% - 16px) 12px;
  mask-repeat: no-repeat;
  mask-size: calc((80px * 2) + (16px/ 2)) 16px, calc((80px * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /* 
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
.skeleton .animation::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
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
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}
.skeleton.row .animation {
  background-color: var(--_table-default-skeleton-animated-row-layer-bg);
}
.skeleton.row .animation .animation {
  background-color: var(--_skeleton-default-bg-color-alt);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, black 50%, transparent 50%);
  mask-position: 16px 12px, calc(100% - 16px) 12px;
  mask-repeat: no-repeat;
  mask-size: calc((80px * 2) + (16px/ 2)) 16px, calc((80px * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /* 
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color-alt);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
.skeleton.row .animation .animation::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color-alt);
  background-image: linear-gradient(var(--_skeleton-default-bg-color-alt) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
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
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

.divider-row {
  padding: 0;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  width: 100%;
  height: 2.5rem;
}
`;class ut extends(k(S(a(e(T(i)))))){static get is(){return"bbva-table-default"}static get scopedElements(){return{"bbva-type-icon":D,"bbva-type-text":w,"bbva-type-link":E,"bbva-divider-default":A}}static get styles(){return[super.styles,ct,et,nt,l("bbva-table-default-shared-styles"),r("button:focus")]}static get properties(){return{iconHelp:{type:String,attribute:"icon-help"},type:{type:String},iconHelpAriaLabel:{type:String,attribute:"icon-help-aria-label"},showIconHelp:{type:Boolean,attribute:"show-icon-help"},titleTable:{type:String,attribute:"title-table"},headerColumn1:{type:String,attribute:"header-column1"},headerColumn2:{type:String,attribute:"header-column2"},headerColumn3:{type:String,attribute:"header-column3"},headers:{type:Array},content:{type:Array},headerIconSize:{type:Number,attribute:"header-icon-size"},contentIconSize:{type:Number,attribute:"content-icon-size"},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"},loading:{type:Boolean,reflect:!0},linkHref:{type:String,attribute:"link-href"},linkText:{type:String,attribute:"link-text"},_desktop:{type:Boolean,attribute:!1},_mobile:{type:Boolean,state:!0},_availableScroll:{type:String},disabled:{type:Boolean},scroll:{type:Boolean}}}constructor(){super(),this.iconHelp=o(),this.type="default",this.showIconHelp=!1,this.headerIconSize=16,this.contentIconSize=24,this.headers=[],this.content=[],this._scrollable=!1,this.hasEllipsis=!1,this.loading=!1,this.disabled=!1,this.scroll=!1,this.iconHelpAriaLabel="",this._availableScroll=""}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)",_mobile:"(max-width: 37.5rem)"}}firstUpdated(t){super.firstUpdated(t),"complex"===this.type&&this._onScroll()}_colCount(t){return t.map(((t,a)=>a+1))}_textKeys(t){return Array.from(new Set(t.flatMap((t=>Object.keys(t).filter((t=>t.includes("text"))))).map((t=>parseInt(t.match(/\d+/)[0],10))))).sort(((t,a)=>t-a))}_generateCol(t){const a=document.createElement("colgroup"),e=this._desktop?"desktop":"mobile",i=`col-${this.headers.length} ${e}`;return a.setAttribute("class",`colgroup-${this.type}`),t.forEach((()=>{const t=document.createElement("col");t.setAttribute("span","1"),t.setAttribute("class",i),a.appendChild(t)})),a}_onScroll(){const{scrollLeft:t,scrollWidth:a,offsetWidth:e}=this.shadowRoot.querySelector(".table-complex");this._availableScroll=0===t?"right":t+e>=a?"left":"left right"}get _renderGradient(){return this._mobile&&s`
        <div
          id="gradient"
          class="${this.headers.length>6?"gradient":""} ${this._availableScroll} ${this._mobile?"mobile":""}"
        ></div>
      `}get tplTitle(){return s` <bbva-type-text
      unset
      text="${this.titleTable}"
      size="${this._desktop?"2XL":"3XL"}"
      lines="1"
      alignment="left"
      class="title ${n({desktop:this._desktop})}"
    ></bbva-type-text>`}get tplLink(){return this.linkText&&s` <bbva-type-link
          class="link-text"
          @click="${this._linkClick}"
          href="${c(this.linkHref)}"
          >${this.t(c(this.linkText))}
        </bbva-type-link>
        <div class="divider-row" colspan=${this.headers.length}>
          <bbva-divider-default size="full"></bbva-divider-default>
        </div>`}get _defautlTpl(){return s`
      <table class="table-default">
        <colgroup class="colgroup">
          <col span="1" />
          <col span="1" />
          <col span="1" />
        </colgroup>
        <thead>
          <tr class="table-default__header">
            ${[this.headerColumn1,this.headerColumn2,this.headerColumn3].map(((t,a)=>s` <th
                class="table-default__header__item  ${n({"icon-help":this.showIconHelp&&0===a,mobile:this._mobile})}"
              >
                ${t?s` <bbva-type-text
                      class="${n({"title-icon":this.showIconHelp})}"
                      unset
                      text="${this.t(t)}"
                      size="S"
                      ?ellipsis="${this.hasEllipsis}"
                      lines="1"
                      alignment="${0===a?"left":"right"}"
                      font-weight="500"
                    ></bbva-type-text>`:""}
                ${this.showIconHelp&&0===a?s` <bbva-type-link
                      class="icon-help ${n({"margin-left":0===a})}"
                      aria-label="${this.t(this.iconHelpAriaLabel)}"
                      icon-size="${this.headerIconSize}"
                      @click="${this._buttonHelpClick}"
                      href="${c(this.linkHref)}"
                      ?disabled="${this.disabled}"
                      icon="${o()}"
                      variant="icon"
                    >
                    </bbva-type-link>`:""}
              </th>`))}
          </tr>
        </thead>

        <tbody>
          ${this.content.map((t=>s`
              <tr class="table-default__row">
                <th class="table-default__item">
                  <bbva-type-text
                    text="${this.t(t.header)}"
                    size="S"
                    ?ellipsis="${t.ellipsisLines&&t.ellipsisLines>0}"
                    lines=${t.ellipsisLines}
                    alignment="left"
                  ></bbva-type-text>
                </th>
                ${[1,2].map((a=>s` <td class="table-default__item">
                      ${this._cellContent(t[`text${a}`],t[`icon${a}`],t.ellipsisLines,t[`accessibilityTextIcon${a}`])}
                    </td>`))}
              </tr>
              <tr>
                <td class="divider-row" colspan="3">
                  <bbva-divider-default size="full"></bbva-divider-default>
                </td>
              </tr>
            `))}
        </tbody>
      </table>
    `}get _comparativeTpl(){return s`
      ${this.titleTable&&this.tplTitle}
      <div class="container-table-comparative ${this._mobile?"mobile":""}">
        ${this.content.map((t=>s` <table class="table-comparative ${this._mobile?"mobile":""} ">
            <thead class="table-comparative__headers">
              <tr>
                <th class="table-comparative__item-header">
                  <bbva-type-text
                    class="table-comparative__header"
                    text="${this.t(t.header)}"
                    size="S"
                    ?ellipsis="${this.hasEllipsis}"
                    lines="1"
                    alignment="left"
                    font-weight="500"
                    unset
                  ></bbva-type-text>
                </th>
              </tr>
            </thead>
            <tbody>
              <tr>
                ${this._textKeys(this.content).map((a=>s` <td class="table-comparative__item">
                        ${this._cellContent(t[`text${a}`],t[`icon${a}`],t.ellipsisLines,t[`accessibilityTextIcon${a}`],t[`subTitle${a}`])}
                      </td>
                      <td class="divider-row" colspan=${this._colCount(this.content)}>
                        <bbva-divider-default size="full"></bbva-divider-default>
                      </td>`))}
              </tr>
            </tbody>
          </table>`))}
        <div class="divider-row" colspan=${this.content.length}>
          <bbva-divider-default size="full"></bbva-divider-default>
        </div>
      </div>
    `}get _complexTpl(){return s`
      ${this.titleTable&&this.tplTitle}
      <div class="table-container ${this._mobile?"mobile":""}">
        <table
          class="table-complex ${this._mobile?"scroll":""}"
          @scroll="${t=>this._onScroll(t)}"
        >
          ${this._generateCol(this.headers)}
          <thead>
            <tr class="table-complex__headers">
              <td class="table-complex__corner"></td>
              ${this.headers.map(((t,a)=>s` <th class="table-complex__item">
                  ${t?s` <bbva-type-text
                        class="table-complex__header"
                        text="${this.t(t.header)}"
                        size="S"
                        ?ellipsis="${this.hasEllipsis}"
                        lines="1"
                        alignment="${0===a||"default"!==this.type?"left":"right"}"
                        font-weight="500"
                        unset
                      ></bbva-type-text>`:""}
                </th>`))}
            </tr>
            <tr>
              <td class="divider-row" colspan=${this.headers.length+1}>
                <bbva-divider-default size="full"></bbva-divider-default>
              </td>
            </tr>
          </thead>
          <tbody>
            ${this.content.map((t=>s`
                <tr>
                  <th class="table-complex__item">
                    <bbva-type-text
                      text="${t.text1}"
                      size="S"
                      ?ellipsis="${this.hasEllipsis}"
                      lines="1"
                      alignment="left"
                      font-weight="500"
                      unset
                    ></bbva-type-text>
                  </th>
                  ${this._colCount(this.headers).map((a=>s` <td class="table-complex__item">
                        ${this._cellContent(t[`text${a+1}`],t[`icon${a}`],t.ellipsisLines,t[`accessibilityTextIcon${a}`],t[`subTitle${a}`])}
                      </td>`))}
                </tr>
              `))}
          </tbody>
        </table>
        ${this._mobile?this._renderGradient:""}
      </div>
    `}_cellContent(t,a,e,i,l){return t?s` <bbva-type-text
            text="${this.t(t)}"
            size="S"
            unset=${"default"!==this.type}
            ?ellipsis="${e&&e>0}"
            lines=${e}
            alignment=${"default"!==this.type?"left":"right"}
          ></bbva-type-text>
          ${l&&s`<bbva-type-text
            text=${l}
            size="S"
            unset=${"default"!==this.type}
            ?ellipsis="${e&&e>0}"
            lines=${e}
            font-weight="500"
            alignment="left"
          ></bbva-type-text>`}`:a&&s` <bbva-type-icon
            role="img"
            aria-label="${c(i)}"
            icon="${c(a)}"
            size="${this.contentIconSize}"
          >
          </bbva-type-icon>`}_buttonHelpClick(){this.dispatchEvent(new CustomEvent("table-default-help-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("table-default-link-click",{detail:!0,bubbles:!0,composed:!0}))}_tableTpl(t){return{default:this._defautlTpl,comparative:this._comparativeTpl,complex:this._complexTpl}[t]}render(){return this.loading?s`<div class="skeleton">
            <div class="animation"></div>
          </div>
          <div class="skeleton row">
            <div class="animation"></div>
          </div>
          <div class="skeleton row">
            <div class="animation"></div>
          </div>
          <div class="skeleton row">
            <div class="animation"></div>
          </div> `:s` <div>${this._tableTpl(this.type)} ${this.linkText&&this.tplLink}</div>`}}var dt=t`
  :host {
    --_sustainability-sustainable-car-simulator-detail-bg-color: var(
      --sustainability-sustainable-car-simulator--_ambient--default-bg-color,
      var(
        --sustainability-sustainable-car-simulator--custom--primary-ambient--default-bg-color,
        ${h("colorPrimarySurfaceAmbientDefault",g)}
      )
    );
  }
`,bt=t`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_sustainability-sustainable-car-simulator-detail-bg-color);
    --bbva-expandable-accordion-container-padding: 0 0 1rem;
    --bbva-divider-default--custom--primary-alt-ambient-bg-color: var(
      --_sustainability-sustainable-car-simulator-divider-color
    );
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

  [data-tag-name='bbva-type-icon'] {
    margin-right: 0;
  }

  .amortization-info {
    padding-left: 1rem;
  }
  .amortization-info .slot-content {
    padding-right: 1rem;
  }
  .amortization-info .slot-content ul {
    padding: 1rem 0 0;
    margin: 0;
    list-style-type: none;
  }
  .amortization-info .slot-content ul li {
    display: flex;
    justify-content: space-between;
    padding: 0.5rem 0;
    gap: 1rem;
  }

  .calculation-message {
    margin: 1rem;
  }

  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal {
    --bbva-help-modal-padding: 0 0 0 1rem;
  }
  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal
    [data-tag-name='bbva-clip-microillustration'] {
    padding-bottom: 1rem;
  }
  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal
    [data-tag-name='bbva-type-text'].calculation-modal-title {
    padding: 0 1rem 0.5rem 0;
  }
  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal
    [data-tag-name='bbva-type-text'].calculation-modal-description {
    padding: 0 1rem 1.5rem 0;
  }
  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal ul {
    list-style-type: none;
    margin: 0;
    padding: 0.5rem 0 0;
  }
  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal
    [data-tag-name='bbva-list-bullet'] {
    padding: 0.25rem 0;
  }
  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal
    [data-tag-name='bbva-expandable-accordion']:last-of-type {
    margin-bottom: 1rem;
  }
  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal
    [data-tag-name='bbva-expandable-accordion']
    .slot-content {
    padding-right: 1rem;
  }
  #sustainability-sustainable-car-simulator-detail-calculation-explanation-modal
    [data-tag-name='bbva-notification-message'] {
    margin-bottom: 1.5rem;
    margin-right: 1rem;
  }

  .header-text-detail {
    padding-left: 1rem;
    padding-right: 1rem;
  }

  .definition-amount {
    padding: 1rem 1rem 0.5rem;
  }

  [data-tag-name='bbva-type-text'].amount-text {
    margin-bottom: 0;
  }

  .text-amount {
    padding-top: 0.5rem;
  }

  .header {
    border-bottom: solid 1px #fababa;
  }

  [data-tag-name='bbva-type-amount'] {
    margin: 0 1rem;
    display: contents;
  }
`;const mt={accordionStructure:[{id:"fuel",listItems:["fuel-bullet-1","fuel-bullet-2"]},{id:"maintenance"},{id:"ownership"},{id:"registration-renewal-tax"},{id:"emission-tax"},{id:"insurance"}]};var pt=t`
  :host {
    --_sustainability-sustainable-car-simulator-products-offer-card-bg-color: var(
      --sustainability-sustainable-car-simulator-products--_ambient--default-offer-card-bg-color,
      var(
        --sustainability-sustainable-car-simulator-products--custom--primary-ambient--default-offer-card-bg-color,
        ${h("colorSecondaryAltSurfaceAmbientDefault",g)}
      )
    );
    --_sustainability_sustainable-car-simulator-products-skeleton-quote-color: var(
      --sustainability-sustainable-car-simulator-products--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainable-car-simulator-products--custom--primary-ambient--default-skeleton-quote-color,
        ${h("colorPrimarySurfaceAmbientOverlay",g)}
      )
    );
    --_sustainability-sustainable-car-simulator-products-skeleton-quote-bg: var(
      --sustainability-sustainable-car-simulator-products--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainable-car-simulator-products--custom--primary-ambient--default-skeleton-quote-bg,
        ${h("colorSecondaryAltSurfaceAmbientDefault",g)}
      )
    );
  }
`,vt=t`
  :host {
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

  .products-section {
    padding-bottom: 1.5rem;
  }
  .products-section [data-tag-name='bbva-header-category'] {
    padding: 0.5rem 1rem;
  }
  .products-section .offer-card {
    text-align: left;
    padding: 1rem 1rem 0.5rem;
    margin: 0 1rem;
    background-color: var(--_sustainability-sustainable-car-simulator-products-offer-card-bg-color);
  }
  .products-section .offer-card [data-tag-name='bbva-type-text'] {
    margin: 0.5rem 0;
    --bbva-type-text--_ambient-skeleton-quote-color: transparent;
  }
  .products-section .offer-card img {
    height: 3.5rem;
  }

  .section-error-wrapper {
    position: relative;
    padding: 0 1rem 1.5rem;
  }
  .section-error-wrapper [data-tag-name='bbva-progress-content'] {
    position: absolute;
  }

  .skeleton {
    position: relative;
    overflow: hidden;
    width: 90%;
    margin-left: 1rem;
    background-repeat: no-repeat;
    opacity: 1;
    pointer-events: none;
  }

  .skeleton-products {
    height: 13rem;
    background-image: linear-gradient(
        var(--_sustainability_sustainable-car-simulator-products-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-products-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-products-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-products-skeleton-quote-color) 50%
      );
    background-color: var(--_sustainability-sustainable-car-simulator-products-skeleton-quote-bg);
    background-size:
      80px 80px,
      calc((66% * 2) + (16px / 2)) 16px,
      calc((90% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px;
    background-position:
      16px 16px,
      16px 120px,
      16px 152px,
      16px 176px;
  }

  .animation {
    background-color: var(--_sustainability-sustainable-car-simulator-products-skeleton-quote-bg);
    position: relative;
    top: 0;
    left: 0;
    height: 13rem;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
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
      opacity: 0;
      transform: translateX(0%) scaleX(2);
    }
  }
`;class ht extends(u(C(e(i)))){static get is(){return"sustainability-sustainable-car-simulator-products"}static get properties(){return{products:{type:Array},externalOffersData:{type:Object,attribute:"external-offers-data"},localCurrency:{type:String,attribute:"local-currency"},offersApiVersion:{type:String,attribute:"offers-api-version"},loanType:{type:String,attribute:"loan-type"},loanId:{type:String,attribute:"loan-id"},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},_requestErrors:{type:Object},_currentRequests:{type:Object}}}static get scopedElements(){const t=[tt,w,E,I,R,j,L];return ht.scopedElementsFromClasses(t)}constructor(){super(),this.products=[],this.externalOffersData={},this.offersApiVersion="1",this.loanType="LOANS",this.loanId="AUTO",this.maxRequestAttempts=3,this._requestErrors={products:0},this._currentRequests={products:!1}}firstUpdated(t){super.firstUpdated(t),this._requestData()}static get styles(){return[pt,vt,l("sustainability-sustainable-car-simulator-products-shared-styles"),_.primary,_.secondary,x.primary,x.secondary,q.primary,z.primary,z.secondary,O.primary]}get _headers(){return this.headers||{"Accept-Language":this.language}}get productsDmElement(){return this._productsDmElement||(this._productsDmElement=this.shadowRoot.querySelector("#products-api-dm")),this._productsDmElement}get _productsDmTemplate(){return s`
      <bbva-global-offers-api-dm
        id="products-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.offersApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @offers-api-dm-fetch="${this._onProductsRequestSuccess}"
        @offers-api-dm-fetch-error="${()=>{this._onRequestError()}}"
        @api-dm-error="${()=>{this._onRequestError()}}"
      >
      </bbva-global-offers-api-dm>
    `}get _hasProductsError(){return this._requestErrors.products>0}get _selectedProductOffer(){var t;const a={imageUrl:"",text:this.t("sustainability-sustainable-car-simulator-products-loan-non-preapproved-description"),link:this.t("sustainability-sustainable-car-simulator-products-link"),detail:{id:"non-preapproved-loan-offer",payload:{}}},e=null===(t=this.products)||void 0===t?void 0:t.find((t=>{var a,e,i;return(null===(a=t.product)||void 0===a||null===(e=a.productType)||void 0===e?void 0:e.id)===this.loanType&&(null===(i=t.product)||void 0===i?void 0:i.id)===this.loanId}));if(e){var i,l,r,o,s,n,c,u,b,m,p,v;const t=null==e||null===(i=e.description)||void 0===i||null===(l=i.trim())||void 0===l?void 0:l.replace(/\.$/,"");a.imageUrl=null==e||null===(r=e.image)||void 0===r?void 0:r.url;const h=(null==e||null===(o=e.amounts)||void 0===o||null===(s=o[0])||void 0===s||null===(n=s.description)||void 0===n?void 0:n.toLowerCase())||"",g=null!=e&&null!==(c=e.amounts)&&void 0!==c&&null!==(u=c[0])&&void 0!==u&&u.amount?d(null==e||null===(b=e.amounts)||void 0===b||null===(m=b[0])||void 0===m?void 0:m.amount,{currencyCode:null==e||null===(p=e.amounts)||void 0===p||null===(v=p[0])||void 0===v?void 0:v.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language}):"";a.text=`${t} ${h} ${g}`.trim(),a.detail={id:"preapproved-loan-offer",payload:e}}return a}_requestData(){var t;this.externalOffersData&&0!==Object.keys(this.externalOffersData).length?this._onProductsRequestSuccess({detail:this.externalOffersData}):null!==(t=this.products)&&void 0!==t&&t.length||!this.productsDmElement||(this._currentRequests={...this._currentRequests,products:!0},this.productsDmElement.getOffers())}_onProductsRequestSuccess({detail:t}){this.products=t||[],this._requestErrors={...this._requestErrors,products:0},this._currentRequests={...this._currentRequests,products:!1},this.dispatchEvent(new CustomEvent("sustainability-sustainable-car-simulator-products-fetched",{detail:t,bubbles:!0,composed:!0}))}_onRequestError(){this._requestErrors={...this._requestErrors,products:this._requestErrors.products+1},this._currentRequests={...this._currentRequests,products:!1}}get _productOfferTemplate(){var t;const a=this._selectedProductOffer,e=null===(t=this._currentRequests)||void 0===t?void 0:t.products;return s`
      ${e?s`
      <div class="skeleton skeleton-products">
        <div class="animation"></div>
      </div>
    </div>
    `:s`
      <div class="offer-card" ambient="secondary">
        ${a.imageUrl?s`
                <img
                  src="${a.imageUrl}"
                  alt="${this.t("sustainability-sustainable-car-simulator-products-image-alt")}"
                />
              `:s`
                <bbva-clip-microillustration microillustration="ecocar" size="S">
                </bbva-clip-microillustration>
              `}
        <bbva-type-text
          .text="${a.text}"
          size="S"
          tag="span"
        >
        </bbva-type-text>
        <bbva-type-link
          size="S"
          @click="${()=>{this._productsLinkClicked(a.detail)}}"
          >${a.link}
        </bbva-type-link>
      </div>
    </div>`}
    `}get _productsTemplate(){var t;const a=null===(t=this._currentRequests)||void 0===t?void 0:t.products;return s`
      <div class="products-section">
        <bbva-header-category
          heading-level="2"
          ?loading="${a}"
          .text="${this.t("sustainability-sustainable-car-simulator-products-title")}"
        >
        </bbva-header-category>
        ${this._hasProductsError?s`${this._sectionErrorTemplate("products")}`:s`${this._productOfferTemplate}`}
      </div>
    `}_productsLinkClicked(t){this.dispatchEvent(new CustomEvent("sustainability-sustainable-car-simulator-products-link-clicked",{detail:t,bubbles:!0,composed:!0}))}_sectionErrorTemplate(t){const a=this._requestErrors[t]<=this.maxRequestAttempts;return s`
      <div class="section-error-wrapper">
        <bbva-notification-message
          variant="error"
          book-title
          .messageTitle="${a?this.t("sustainability-sustainable-car-simulator-error-section-text"):this.t("sustainability-sustainable-car-simulator-error-section-text-no-retries")}"
          .linkTitle="${a?this.t("sustainability-sustainable-car-simulator-error-section-link"):""}"
          @notification-message-link-click="${()=>{this._requestData({[t]:!0})}}"
        ></bbva-notification-message>
        <bbva-progress-content
          variant="transparent"
          ?visible="${this._currentRequests[t]}"
        ></bbva-progress-content>
      </div>
    `}render(){return s`
      ${this._productsDmTemplate} ${this._productTitleTemplate} ${this._productsTemplate}
    `}}class gt extends(u(C(e(i)))){static get is(){return"sustainability-sustainable-car-simulator-detail"}static get scopedElements(){const t=[j,F,L,w,Q,Z,N,H,ht];return gt.scopedElementsFromClasses(t)}static get properties(){return{simulatorDataDetail:{type:Object,attribute:"simulator-data-detail"},modalCalculationExplanationVisible:{type:Boolean,reflect:!0,attribute:"modal-calculation-explanation-visible"},localCurrency:{type:String,attribute:"local-currency"},products:{type:Array},toggles:{type:Object},loanType:{type:String,attribute:"loan-type"},loanId:{type:String,attribute:"loan-id"}}}constructor(){super(),this.simulatorDataDetail={},this.products=[],this.toggles={},this.modalCalculationExplanationVisible=!1,this.localCurrency="",this.loanType="LOANS",this.loanId="AUTO",this._defaultToggles={products:!0}}updated(t){var a,e,i,l;super.updated&&super.updated(t),null===(a=this.simulatorDataDetail)||void 0===a||null===(e=a.cars)||void 0===e||e.sort(((t,a)=>t.order-a.order)),null===(i=this.simulatorDataDetail)||void 0===i||null===(l=i.cars)||void 0===l||l.forEach((t=>{var a;null===(a=t.expenses)||void 0===a||a.sort(((t,a)=>t.priority-a.priority))}))}static get styles(){return[dt,bt,z.primary,z.secondary,_.primary,J.primary,Y.primary,P.primary,M.primary,M.primaryAlt,l("sustainability-sustainable-car-simulator-shared-styles")]}get _toggles(){return{...this._defaultToggles,...this.toggles}}get _headerTextTemplate(){return s`
      <div class="header-text-detail">
        <bbva-type-text
          text="${this.t("sustainability-sustainable-car-simulator-detail-header-text")}"
          size="XS"
          font-weight="350"
        ></bbva-type-text>
      </div>
    `}get _comparativeTemplate(){var t,a,e;const i=null===(t=this.simulatorDataDetail)||void 0===t||null===(a=t.cars)||void 0===a||null===(e=a[0])||void 0===e?void 0:e.expenses;return s`
      ${this._headerComparativeTemplate}
      ${null==i?void 0:i.map(((t,a)=>s`
          ${this._legendComparativeTemplate(`sustainability-sustainable-car-simulator-table-${t.id}`)}
          ${this._amountComparativeTemplate(a)}
        `))}
      ${this._legendComparativeTemplate("sustainability-sustainable-car-simulator-table-annual-expenses-header")}
      ${this._annualAmountComparativeTemplate}
    `}get _headerComparativeTemplate(){var t,a,e;return s`
      <bbva-panel-container divider-size="full" panel-color="primary-alt">
        ${null===(t=this.simulatorDataDetail)||void 0===t||null===(a=t.cars)||void 0===a||null===(e=a.slice(0,2))||void 0===e?void 0:e.map((t=>s`
            <div style="padding:8px">
              <bbva-type-text
                tag="span"
                size="S"
                alignment="center"
                text="${this.t(`sustainability-sustainable-car-simulator-table-${t.engineType.id}`)}"
              >
              </bbva-type-text>
            </div>
          `))}
      </bbva-panel-container>
    `}_legendComparativeTemplate(t){return s`
      <bbva-panel-container divider-size="full" panel-color="primary">
        <div style="padding:8px 8px 8px 16px">
          <bbva-type-text tag="span" size="S" alignment="left" text="${this.t(t)}">
          </bbva-type-text>
        </div>
      </bbva-panel-container>
    `}_amountComparativeTemplate(t){var a,e,i;return s`
      <bbva-panel-container separator divider-size="full" panel-color="primary">
        ${null===(a=this.simulatorDataDetail)||void 0===a||null===(e=a.cars)||void 0===e||null===(i=e.slice(0,2))||void 0===i?void 0:i.map((a=>{const{expenseAmount:e}=a.expenses[t];return s`
            <div style="padding:8px">
              <bbva-type-amount
                decimals-hidden
                variant="s"
                amount="${e.amount}"
                currency-code="${e.currency}"
                local-currency="${this.localCurrency}"
                language="${this.language}"
              >
              </bbva-type-amount>
            </div>
          `}))}
      </bbva-panel-container>
    `}get _annualAmountComparativeTemplate(){var t,a,e;return s`
      <bbva-panel-container separator divider-size="full" panel-color="primary">
        ${null===(t=this.simulatorDataDetail)||void 0===t||null===(a=t.cars)||void 0===a||null===(e=a.slice(0,2))||void 0===e?void 0:e.map((t=>s`
            <div style="padding:8px">
              <bbva-type-amount
                type="bold"
                decimals-hidden
                variant="m"
                amount="${t.annualExpense.amount}"
                currency-code="${t.annualExpense.currency}"
                local-currency="${this.localCurrency}"
                language="${this.language}"
              >
              </bbva-type-amount>
            </div>
          `))}
      </bbva-panel-container>
    `}get _definitionAmountTemplate(){var t,a,e,i,l,r,o;const n=this.t(`sustainability-sustainable-car-simulator-car-type-${null===(t=this.simulatorDataDetail)||void 0===t||null===(a=t.totalSaving)||void 0===a||null===(e=a.engineType)||void 0===e?void 0:e.id}`),c=null===(i=this.simulatorDataDetail)||void 0===i||null===(l=i.amortization)||void 0===l?void 0:l.years,u=null===(r=this.simulatorDataDetail)||void 0===r||null===(o=r.totalSaving)||void 0===o?void 0:o.savingAmount;return s`
      <div class="definition-amount">
        <bbva-type-text
          tag="span"
          class="amount-text"
          text="${this.t("sustainability-sustainable-car-simulator-header-amount-text",{typeCar:n})}"
          size="XS"
          font-weight="350"
        ></bbva-type-text>
        <bbva-type-amount
          type="bold"
          variant="3xl"
          decimals-hidden
          amount="${null==u?void 0:u.amount}"
          currency-code="${null==u?void 0:u.currency}"
          local-currency="${this.localCurrency}"
          language="${this.language}"
        ></bbva-type-amount>
        <bbva-type-text
          class="text-amount"
          tag="span"
          text="${this.t("sustainability-sustainable-car-simulator-definition-amount-text",{years:c})}"
          size="XS"
          font-weight="350"
        ></bbva-type-text>
      </div>
    `}get _accordionTemplate(){const t="sustainability-sustainable-car-simulator-detail-calculation-explanation-modal",{accordionStructure:a}=mt;return a.map(((e,i)=>{const l=`${t}-${this.t(e.id)}-header`,r=`${t}-${this.t(e.id)}-content`,o=null==e?void 0:e.listItems;return s`
        <bbva-expandable-accordion divider=${i!==a.length-1?"full":""}>
          <div slot="header">
            <bbva-type-text size="S" font-weight="500" unset text="${l}"></bbva-type-text>
          </div>
          <div slot="content" class="slot-content">
            <bbva-type-text size="S" unset text="${r}"></bbva-type-text>
            ${(null==o?void 0:o.length)>0?s`
                  <ul>
                    ${o.map((a=>s`
                        <li>
                          <bbva-list-bullet>${this.t(`${t}-${a}`)}</bbva-list-bullet>
                        </li>
                      `))}
                  </ul>
                `:""}
          </div>
        </bbva-expandable-accordion>
      `}))}get _calculationExplanationModalTemplate(){return s`
      <bbva-help-modal
        id="sustainability-sustainable-car-simulator-detail-calculation-explanation-modal"
        full-height
        .headerCloseIconAriaLabel="${this.t("sustainability-sustainable-car-simulator-modal-icon-aria-label")}"
        .headerText="${this.t("sustainability-sustainable-car-simulator-detail-calculation-explanation-modal-header")}"
        ?visible="${this.modalCalculationExplanationVisible}"
        @visible-changed="${({detail:t})=>{this.modalCalculationExplanationVisible=t}}"
      >
        <div slot="slot-content">
          <bbva-clip-microillustration microillustration="info" size="M">
          </bbva-clip-microillustration>
          <bbva-type-text
            class="calculation-modal-title"
            text="${this.t("sustainability-sustainable-car-simulator-detail-calculation-explanation-modal-title")}"
            size="2XL"
            tag="span"
            font-weight="500"
          >
          </bbva-type-text>
          <bbva-type-text
            class="calculation-modal-description"
            .text="${this.t("sustainability-sustainable-car-simulator-detail-calculation-explanation-modal-description")}"
            size="S"
            tag="span"
          >
          </bbva-type-text>

          ${this._accordionTemplate}

          <bbva-notification-message
            message-title="${this.t("sustainability-sustainable-car-simulator-detail-calculation-explanation-disclaimer")}"
            book-title
          >
          </bbva-notification-message>
        </div>
      </bbva-help-modal>
    `}get _amortizationTemplate(){var t,a,e,i,l,r,o,n,c,u,b,m,p,v,h,g,y,f;const _=null===(t=this.simulatorDataDetail)||void 0===t||null===(a=t.amortization)||void 0===a?void 0:a.differenceBetweenCost,x=null===(e=this.simulatorDataDetail)||void 0===e||null===(i=e.amortization)||void 0===i?void 0:i.amortizationSaving,$=d(null==_?void 0:_.amount,{currencyCode:null==_?void 0:_.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language}),k=null===(l=this.simulatorDataDetail)||void 0===l||null===(r=l.amortization)||void 0===r?void 0:r.years,S=null===(o=this.simulatorDataDetail)||void 0===o||null===(n=o.cars)||void 0===n?void 0:n.slice(0,2).sort(((t,a)=>a.price.priceAmount.amount-t.price.priceAmount.amount)),T=S[0],D=this.t(`sustainability-sustainable-car-simulator-car-type-${null==T||null===(c=T.engineType)||void 0===c?void 0:c.id}`),w=S[1],E=this.t(`sustainability-sustainable-car-simulator-car-type-${null==w||null===(u=w.engineType)||void 0===u?void 0:u.id}`),A=[{text:`${this.t("sustainability-sustainable-car-simulator-cost-of-car")} ${D}`,amount:{amount:null==T||null===(b=T.price)||void 0===b||null===(m=b.priceAmount)||void 0===m?void 0:m.amount,currency:null==T||null===(p=T.price)||void 0===p||null===(v=p.priceAmount)||void 0===v?void 0:v.currency}},{text:`${this.t("sustainability-sustainable-car-simulator-cost-of-car")} ${E}`,amount:{amount:null==w||null===(h=w.price)||void 0===h||null===(g=h.priceAmount)||void 0===g?void 0:g.amount,currency:null==w||null===(y=w.price)||void 0===y||null===(f=y.priceAmount)||void 0===f?void 0:f.currency}},{text:this.t("sustainability-sustainable-car-simulator-difference-purchase-cost"),amount:{amount:null==_?void 0:_.amount,currency:null==_?void 0:_.currency}},{text:this.t("sustainability-sustainable-car-simulator-total-savings",{years:k}),amount:{amount:null==x?void 0:x.amount,currency:null==x?void 0:x.currency}}];return s`
      <bbva-expandable-accordion class="amortization-info">
        <div slot="header">
          <bbva-type-text
            size="S"
            font-weight="500"
            unset
            text="${this.t("sustainability-sustainable-car-simulator-detail-amortization-header")}"
          ></bbva-type-text>
        </div>
        <div slot="content" class="slot-content">
          <bbva-type-text
            size="S"
            unset
            text="${this.t("sustainability-sustainable-car-simulator-detail-amortization-content",{firstCarName:D,secondCarName:E,amount:$,years:k})}"
          ></bbva-type-text>
          ${A?s`
                <ul>
                  ${A.map(((t,a)=>s`
                      <li>
                        <bbva-type-text
                          font-weight="${a===A.length-1?"500":""}"
                          text="${t.text}"
                          size="S"
                          tag="span"
                        >
                        </bbva-type-text>
                        <bbva-type-amount
                          variant="m"
                          type="${a===A.length-1?"bold":""}"
                          decimals-hidden
                          .amount="${t.amount.amount}"
                          .currencyCode="${t.amount.currency}"
                          .localCurrency="${this.localCurrency}"
                          .language="${this.language}"
                        >
                        </bbva-type-amount>
                      </li>
                    `))}
                </ul>
              `:""}
        </div>
      </bbva-expandable-accordion>
    `}get _calculationsMessageTemplate(){var t,a;const e=null===(t=this.simulatorDataDetail)||void 0===t||null===(a=t.zone)||void 0===a?void 0:a.name;return s`
      <bbva-notification-message
        class="calculation-message"
        .messageTitle="${this.t("sustainability-sustainable-car-simulator-detail-calculation-explanation-message",{referenceZone:e})}"
        book-title
        link-title="${this.t("sustainability-sustainable-car-simulator-detail-calculation-explanation-modal-title")}"
        @notification-message-link-click="${()=>{this.modalCalculationExplanationVisible=!0}}"
      >
      </bbva-notification-message>
    `}get _productsTemplate(){return s`
      <sustainability-sustainable-car-simulator-products
        .host="${this.host}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        .sustainabilityApiVersion="${this.sustainabilityApiVersion}"
        .language="${this.language}"
        .native="${this.native}"
        .localCurrency="${this.localCurrency}"
        .products="${this.products}"
        .loanType="${this.loanType}"
        .loanId="${this.loanId}"
        @sustainability-sustainable-car-simulator-products-link-clicked="${({detail:t})=>{this._changeEventName(t,"products-link-clicked")}}"
        @sustainability-sustainable-car-simulator-products-fetched="${({detail:t})=>{this.products=t}}"
      >
      </sustainability-sustainable-car-simulator-products>
    `}_changeEventName(t,a){this.dispatchEvent(new CustomEvent(`${gt.is}-${a}`,{detail:t,bubbles:!0,composed:!0}))}render(){var t;return s`
      <div ambient="primary">
        ${null!==(t=this.simulatorDataDetail.cars)&&void 0!==t&&t.length?s`
              ${this._headerTextTemplate} ${this._comparativeTemplate}
              ${this._definitionAmountTemplate} ${this._amortizationTemplate}
              ${this._calculationsMessageTemplate} ${this._calculationExplanationModalTemplate}
              ${this._toggles.products?this._productsTemplate:s``}
            `:""}
      </div>
    `}}var yt=t`
  :host {
    --_sustainability-sustainable-car-simulator-bg-color: var(
      --sustainability-sustainable-car-simulator--_ambient--default-bg-color,
      var(
        --sustainability-sustainable-car-simulator--custom--primary-ambient--default-bg-color,
        ${h("colorPrimarySurfaceAmbientDefault",g)}
      )
    );
    --_sustainability_sustainable-car-simulator-skeleton-quote-color: var(
      --sustainability-sustainable-car-simulator--_ambient--default-skeleton-quote-color,
      var(
        --sustainability-sustainable-car-simulator--custom--primary-ambient--default-skeleton-quote-color,
        ${h("colorPrimarySurfaceAmbientPreloading",g)}
      )
    );
    --_sustainability-sustainable-car-simulator-skeleton-quote-bg: var(
      --sustainability-sustainable-car-simulator--_ambient--default-skeleton-quote-bg,
      var(
        --sustainability-sustainable-car-simulator--custom--primary-ambient--default-skeleton-quote-bg,
        ${h("colorPrimarySurfaceAmbientDefault",g)}
      )
    );
    --_sustainability-sustainable-car-simulator-icon-color: var(
      --sustainability-sustainable-car-simulator--_ambient--default-icon-color,
      var(
        --sustainability-sustainable-car-simulator--custom--primary-ambient--default-icon-color,
        ${h("colorPrimaryLinkMainDefault",g)}
      )
    );
    --_sustainability-sustainable-car-simulator-divider-color: var(
      --sustainability-sustainable-car-simulator--_ambient--default-divider-color,
      var(
        --sustainability-sustainable-car-simulator--custom--primary-ambient--default-divider-color,
        ${h("colorPrimaryFormatDivider",g)}
      )
    );
  }
`,ft=t`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(--_sustainability-sustainable-car-simulator-bg-color);
    --bbva-divider-default--custom--primary-alt-ambient-bg-color: transparent;
    --bbva-table-default--custom--primary-ambient--header-border-bottom-color: transparent;
    --bbva-transition-container-padding-bottom: 0;
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

  [data-tag-name='bbva-notification-help'] {
    margin: 1rem 0 0 1rem;
  }

  #panel-info {
    margin-bottom: 1rem;
  }

  [data-tag-name='bbva-table-default'] {
    background-color: var(--_sustainability_sustainable-car-simulator-skeleton-quote-color);
  }

  [data-tag-name='bbva-banner-image'] {
    padding: 0;
    margin-bottom: 1rem;
  }

  [data-tag-name='bbva-type-text'] {
    margin: 0 1rem 0.5rem;
  }

  [data-tag-name='bbva-type-text'].amount-text {
    margin-bottom: 0;
  }

  [data-tag-name='bbva-type-text'].error-text {
    margin: 0.5rem 0 0;
  }

  [data-tag-name='bbva-clip-microillustration'].error {
    margin-bottom: 1rem;
  }

  .skeleton {
    position: relative;
    overflow: hidden;
    width: 100%;
    background-repeat: no-repeat;
    opacity: 1;
    pointer-events: none;
  }

  #skeleton-notification {
    height: 5.5rem;
    background-image: linear-gradient(
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 50%
      ),
      linear-gradient(
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 100%,
        transparent 0
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 50%,
        transparent 50%
      );
    background-color: transparent;
    background-size:
      16px 16px,
      calc((25% * 2) + (16px / 2)) 16px,
      24px 24px,
      calc((40% * 2) + (16px / 2)) 16px,
      calc((10% * 2) + (16px / 2)) 16px;
    background-position:
      16px 16px,
      38px calc(0% + 16px),
      16px 48px,
      48px 52px,
      calc(100% - 24px) 52px;
  }

  #skeleton-amount {
    height: 5rem;
    background-image: linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 50%
      );
    background-color: transparent;
    background-size:
      calc((50% * 2) + (16px / 2)) 16px,
      calc((25% * 2) + (16px / 2)) 16px;
    background-position:
      16px 16px,
      16px 48px;
  }

  #skeleton-banner-info {
    height: 5rem;
    background-image: linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 50%
      ),
      linear-gradient(
        -60deg,
        transparent 50%,
        var(--_sustainability_sustainable-car-simulator-skeleton-quote-color) 50%
      );
    background-color: transparent;
    background-size:
      calc((66% * 2) + (16px / 2)) 16px,
      calc((90% * 2) + (16px / 2)) 16px,
      calc((33% * 2) + (16px / 2)) 16px;
    background-position:
      16px 4px,
      16px 28px,
      16px 52px;
  }

  .animation {
    background-color: var(--_sustainability-sustainable-car-simulator-skeleton-quote-bg);
    position: relative;
    top: 0;
    left: 0;
    height: 5rem;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
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
      opacity: 0;
      transform: translateX(0%) scaleX(2);
    }
  }
  [data-tag-name='bbva-type-amount'] {
    margin: 0 1rem 0.5rem 1rem;
  }

  .notification-message {
    padding: 1rem;
  }

  .link-icon {
    padding: 1.5rem 1rem;
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  .link-icon [data-tag-name='bbva-type-icon'] {
    --bbva-type-icon--custom--primary-ambient--color: var(
      --_sustainability-sustainable-car-simulator-icon-color
    );
  }

  [data-tag-name='bbva-transition-container'] {
    --bbva-transition-container-padding: 0;
    --bbva-transition-container--custom--primary-ambient--content-bg-color: var(
      --_sustainability-sustainable-car-simulator-bg-color
    );
  }
`;class _t extends(C(X(e(i)))){static get is(){return"sustainability-sustainable-car-simulator"}static get scopedElements(){const t=[B,L,w,N,ut,V,E,D,F,R,j,K,U,gt,ht,..._t.configurationScopedElements()];return _t.scopedElementsFromClasses(t)}static get properties(){return{sustainabilityApiVersion:{type:String,attribute:"sustainability-api-version"},localCurrency:{type:String,attribute:"local-currency"},userName:{type:String,attribute:"user-name"},simulatorData:{type:Object,attribute:"simulator-data"},products:{type:Array},loanType:{type:String,attribute:"loan-type"},loanId:{type:String,attribute:"loan-id"},toggles:{type:Object},equivalenceId:{type:String,attribute:"equivalence-id"},mode:{type:String,reflect:!0},resetScroll:{type:Boolean,attribute:"reset-scroll"},calculationExplanationModal:{type:Boolean,attribute:"calculation-explanation-modal"},_isTransitioning:{type:Object},_contentComparativeTable:{type:Object},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"},_requestErrors:{type:Object},_currentRequests:{type:Object},imageUrl:{type:String,attribute:"image-url"},externalSimulatorData:{type:Object,attribute:"external-simulator-data"},externalOffersData:{type:Object,attribute:"external-offers-data"}}}firstUpdated(t){var a;super.firstUpdated(t);const e=_t.allowedModes;null!==(a=this.history)&&void 0!==a&&a.length?this._updateFeatureState(this.history[this.history.length-1].state):(Object.values(e).includes(this.mode)||(this.mode=e.home),this.history=[{state:{mode:this.mode}}],this._requestData())}constructor(){super(),this.sustainabilityApiVersion="1",this.localCurrency="",this.simulatorData={},this.externalSimulatorData={},this.externalOffersData={},this.products=[],this.loanType="LOANS",this.loanId="AUTO",this.toggles={},this._carsSimulatorData=[],this._benefitsContent=[],this._savingsContent=[],this.userName="",this.equivalenceId="sustainabilityEqKmDriveCar",this.mode=_t.allowedModes.home,this.resetScroll=!1,this._isTransitioning={},this.calculationExplanationModal=!1,this._contentComparativeTable={},this.maxRequestAttempts=3,this._requestErrors={simulator:0},this._currentRequests={simulator:!1},this.config={header:{variant:"first-level-sequential",showLeftIcon:!0,leftIconLabel:"sustainability-sustainable-car-simulator-header-back",leftIconAriaLabel:"sustainability-sustainable-car-simulator-header-back",text:"sustainability-sustainable-car-simulator-header-main-title",buttons:[{id:"btn-menu",icon:b(),label:"sustainability-sustainable-car-simulator-header-main-menu",accessibilityText:"sustainability-sustainable-car-simulator-header-main-menu"}],id:"main-header","@header-main-icon-click":this._manageHeaderMainClicks.bind(this)},loader:!0,notify:!1,fixedHeader:!0},this._defaultToggles={products:!0},this.imageUrl=""}static get styles(){return[yt,ft,W.primary,G.primary,z.primary,z.secondary,_.primary,P.primary,st.primaryAlt,x.primary,f.primary,O.primary,l("sustainability-sustainable-car-simulator-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._modalStateChanged),this.addEventListener("help-modal-close",this._modalStateChanged)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._modalStateChanged),this.removeEventListener("help-modal-close",this._modalStateChanged)}_manageHeaderMainClicks(t){var a;const e={1:"sustainability-sustainable-car-simulator-menu-click"},i=null==t||null===(a=t.detail)||void 0===a?void 0:a.index;0===i?this.navigateBack():this.dispatchEvent(new CustomEvent(e[i],{composed:!0,bubbles:!0}))}_modalStateChanged(t){var a;const e=null===(a=_t._getEventTargetPath(t))||void 0===a?void 0:a[0];this._handleModalStateChange(t,e)}static _getEventTargetPath(t){return t.composedPath&&t.composedPath()||t.path}_handleModalStateChange(t,a){const e={"sustainability-sustainable-car-simulator-detail-calculation-explanation-modal":"calculationExplanationModal"}[a.id];if(e){var i;const a="open"===(null==t||null===(i=t.detail)||void 0===i?void 0:i.status);this[e]=a}}get _hasFullError(){return this._requestErrors.simulator>0}get _headers(){return this.headers||{"Accept-Language":this.language}}get _toggles(){return{...this._defaultToggles,...this.toggles}}get carSimulatorDmElement(){return this._carSimulatorDmElement||(this._carSimulatorDmElement=this.shadowRoot.querySelector("#car-simulator-api-dm")),this._carSimulatorDmElement}static get allowedModes(){return{home:"home",detail:"detail"}}get _carSimulatorDmTemplate(){return s`
      <bbva-global-car-simulator-api-dm
        id="car-simulator-api-dm"
        .host="${this.host}"
        .headers="${this._headers}"
        .version="${this.sustainabilityApiVersion}"
        .requiredToken="${this.requiredToken}"
        .native="${this.native}"
        @car-simulator-api-dm-fetch="${this._onSimulatorRequestSuccess}"
        @car-simulator-api-dm-fetch-error="${()=>{this._onRequestError()}}"
        @api-dm-error="${()=>{this._onRequestError()}}"
      >
      </bbva-global-car-simulator-api-dm>
    `}get _headerTemplate(){var t,a;return s`
      <div id="panel-info">
        <bbva-banner-image
          size="L"
          image-src="${this.imageUrl}"
          img-accessibility-text="Coche eléctrico"
          ?loading="${!(null!==(t=this.simulatorData)&&void 0!==t&&t.cars)}"
        ></bbva-banner-image>
        ${null!==(a=this.simulatorData)&&void 0!==a&&a.totalSaving?s`
          <bbva-type-text
            tag="span"
            text="${this.userName?this.t("sustainability-sustainable-car-simulator-header-text",{userName:this.userName}):this.t("sustainability-sustainable-car-simulator-header-text-without-username")}"
            size="3XL"
            font-weight="500"
          ></bbva-type-text>
          <bbva-type-text
            tag="span"
            text="${this.t("sustainability-sustainable-car-simulator-subheader-text")}"
            size="XS"
            font-weight="350"
          ></bbva-type-text>
        </div>`:s`
              <div id="skeleton-banner-info" class="skeleton">
                <div class="animation"></div>
              </div>
            `}
      </div>
    `}get _tableTemplate(){var t,a,e,i,l,r,o,n,c,u,b;const m=null===(t=this.simulatorData)||void 0===t||null===(a=t.cars)||void 0===a?void 0:a[0],p=null===(e=this.simulatorData)||void 0===e||null===(i=e.cars)||void 0===i?void 0:i[1];return s`
      <div ambient="primary-alt">
        ${null!==(l=this.simulatorData)&&void 0!==l&&l.cars?Object.keys(this._contentComparativeTable).map((t=>{var a,e,i;return s`
                <bbva-table-default
                  .id="${t}-table"
                  header-column1="${this.t(`sustainability-sustainable-car-simulator-table-${t}-header`)}"
                  header-column2="${this.t(`sustainability-sustainable-car-simulator-table-${t}-header-${null==m||null===(a=m.engineType)||void 0===a?void 0:a.id}`)}"
                  header-column3="${this.t(`sustainability-sustainable-car-simulator-table-${t}-header-${null==p||null===(e=p.engineType)||void 0===e?void 0:e.id}`)}"
                  .content="${null===(i=this._contentComparativeTable)||void 0===i?void 0:i[t]}"
                ></bbva-table-default>
              `})):s`
              <bbva-table-default
                header-column1=""
                header-column2=""
                header-column3=""
                ?loading="${!(null!==(r=this.simulatorData)&&void 0!==r&&r.cars)}"
              ></bbva-table-default>
            `}
        <bbva-table-default
          id="expenses-table"
          header-column1="${this.t("sustainability-sustainable-car-simulator-table-annual-expenses-header")}"
          header-column2="${d(null==m||null===(o=m.annualExpense)||void 0===o?void 0:o.amount,{currencyCode:null==m||null===(n=m.annualExpense)||void 0===n?void 0:n.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language})}"
          header-column3="${d(null==p||null===(c=p.annualExpense)||void 0===c?void 0:c.amount,{currencyCode:null==p||null===(u=p.annualExpense)||void 0===u?void 0:u.currency,localCurrency:this.localCurrency,showCurrencyCode:!1,decimalsHidden:!0,language:this.language})}"
          ?loading="${!(null!==(b=this.simulatorData)&&void 0!==b&&b.cars)}"
        >
        </bbva-table-default>
      </div>
    `}get _notificationHelpLinkTemplate(){var t,a;return s`
      ${null!==(t=this.simulatorData)&&void 0!==t&&t.totalSaving?s`
            <bbva-notification-help
              variant="info"
              text="${this.t("sustainability-sustainable-car-simulator-notification-help-text")}"
            ></bbva-notification-help>
            <div class="link-icon">
              <bbva-type-link
                size="S"
                ?loading="${!(null!==(a=this.simulatorData)&&void 0!==a&&a.totalSaving)}"
                @click="${()=>{this.navigateForward({params:{mode:_t.allowedModes.detail}}),this._changeEventName("detail-navigate")}}"
              >
                ${this.t("sustainability-sustainable-car-simulator-link-detail-text")}
              </bbva-type-link>
              <bbva-type-icon icon="${m()}" size="32"> </bbva-type-icon>
            </div>
          `:s`
            <div id="skeleton-notification" class="skeleton">
              <div class="animation"></div>
            </div>
          `}
    `}get _definitionAmountTemplate(){var t,a,e,i,l,r,o,n,c;const u=this.t(`sustainability-sustainable-car-simulator-car-type-${null===(t=this.simulatorData)||void 0===t||null===(a=t.totalSaving)||void 0===a||null===(e=a.engineType)||void 0===e?void 0:e.id}`),d=null===(i=this.simulatorData)||void 0===i||null===(l=i.amortization)||void 0===l?void 0:l.years,b=null===(r=this.simulatorData)||void 0===r||null===(o=r.totalSaving)||void 0===o?void 0:o.savingAmount;return s`
      ${null!==(n=this.simulatorData)&&void 0!==n&&n.totalSaving?s`
            <div class="definition-amount">
              <bbva-type-text
                tag="span"
                class="amount-text"
                text="${this.t("sustainability-sustainable-car-simulator-header-amount-text",{typeCar:u})}"
                size="XS"
                font-weight="350"
                ?loading="${!(null!==(c=this.simulatorData)&&void 0!==c&&c.totalSaving)}"
              ></bbva-type-text>
              <bbva-type-amount
                variant="3xl"
                type="bold"
                decimals-hidden
                amount="${null==b?void 0:b.amount}"
                currency-code="${null==b?void 0:b.currency}"
                local-currency="${this.localCurrency}"
                language="${this.language}"
              ></bbva-type-amount>
              <bbva-type-text
                tag="span"
                text="${this.t("sustainability-sustainable-car-simulator-definition-amount-text",{years:d})}"
                size="XS"
                font-weight="350"
              ></bbva-type-text>
            </div>
          `:s`
            <div id="skeleton-amount" class="skeleton">
              <div class="animation"></div>
            </div>
          `}
    `}get _notificationMessageTemplate(){var t,a,e;const i=`${null===(t=this.simulatorData)||void 0===t||null===(a=t.environmentalImpact)||void 0===a?void 0:a.description} ${this.equivalenceMessage}`;return s`
      <div class="notification-message">
        <bbva-notification-message
          variant="sustainability"
          .messageTitle="${i}"
          book-title
          ?loading="${!(null!==(e=this.simulatorData)&&void 0!==e&&e.environmentalImpact)}"
        ></bbva-notification-message>
      </div>
    `}_parseTableContent(){var t,a,e,i;const l=null===(t=this.simulatorData)||void 0===t||null===(a=t.cars)||void 0===a?void 0:a[0],r=null===(e=this.simulatorData)||void 0===e||null===(i=e.cars)||void 0===i?void 0:i[1],o={};return Object.keys(null==l?void 0:l.advantages).forEach((t=>{var a,e,i;const s=[];null==r||null===(a=r.advantages)||void 0===a||null===(e=a[t])||void 0===e||e.sort(((t,a)=>t.priority-a.priority)),null==l||null===(i=l.advantages)||void 0===i||i[t].sort(((t,a)=>t.priority-a.priority)).forEach(((a,e)=>{var i,l,o,n,c,u;s.push({header:`sustainability-sustainable-car-simulator-table-${a.id}`,icon1:a.isMarked?p():v(),accessibilityTextIcon1:a.isMarked.toString(),icon2:null!=r&&null!==(i=r.advantages)&&void 0!==i&&null!==(l=i[t])&&void 0!==l&&null!==(o=l[e])&&void 0!==o&&o.isMarked?p():v(),accessibilityTextIcon2:null===(n=r.advantages)||void 0===n||null===(c=n[t])||void 0===c||null===(u=c[e])||void 0===u?void 0:u.isMarked.toString()})})),o[t]=s})),o}get equivalenceMessage(){var t,a,e;const i=null===(t=this.simulatorData)||void 0===t||null===(a=t.environmentalImpact)||void 0===a?void 0:a.equivalences,l=null==i?void 0:i.findIndex((t=>t.id===this.equivalenceId));return null==i||null===(e=i[l])||void 0===e?void 0:e.description}get _simulatorTemplate(){return s`
      ${this._headerTemplate} ${this._tableTemplate} ${this._notificationHelpLinkTemplate}
      ${this._definitionAmountTemplate} ${this._notificationMessageTemplate}
      ${this._carSimulatorDmTemplate}
    `}_onSimulatorRequestSuccess({detail:t}){this._requestErrors={...this._requestErrors,simulator:0},this._currentRequests={...this._currentRequests,simulator:!1},this.simulatorData={...t},this.simulatorData.cars=null==t?void 0:t.cars.sort(((t,a)=>t.order-a.order)),this._contentComparativeTable=this._parseTableContent(),this._changeEventName("data-fetch",this.simulatorData)}_onRequestError(){this._requestErrors={...this._requestErrors,simulator:this._requestErrors.simulator+1},this._currentRequests={...this._currentRequests,simulator:!1},this._requestErrors.simulator>this.maxRequestAttempts&&this._noRetryEventError()}_requestData(){this.externalSimulatorData&&0!==Object.keys(this.externalSimulatorData).length?this._onSimulatorRequestSuccess({detail:this.externalSimulatorData}):this.carSimulatorDmElement&&(this._currentRequests={...this._currentRequests,simulator:!0},this.carSimulatorDmElement.postCarSimulator())}_configureTransitionTemplate(t,a,e){var i;const l=Boolean(null===(i=this.history)||void 0===i?void 0:i.find((t=>{var e;return(null==t||null===(e=t.state)||void 0===e?void 0:e.mode)===a}))),r=[{id:"btn-menu",name:"sustainability-sustainable-car-simulator-header-main-menu",icon:b(),label:"sustainability-sustainable-car-simulator-header-main-menu",accessibilityText:"sustainability-sustainable-car-simulator-header-main-menu",eventIconName:"sustainability-sustainable-car-simulator-menu-click"}];return s`
      <bbva-transition-container
        id="${`${a}-transition-container`}"
        ?visible=${this.mode===a}
        ?reset-scroll=${this.resetScroll}
        @transitionend="${()=>{this._isTransitioning={...this._isTransitioning,[a]:!1}}}"
      >
        <div slot="slot-header" class="header-slot">
          <bbva-header-main
            variant="first-level-sequential"
            show-left-icon
            left-icon-label="${this.t("sustainability-sustainable-car-simulator-header-back")}"
            left-icon-aria-label="${this.t("sustainability-sustainable-car-simulator-header-back")}"
            @header-main-icon-click="${this.navigateBack}"
            text="${this.t(null==e?void 0:e.headerText)}"
            .buttons="${r}"
          ></bbva-header-main>
        </div>
        <div slot="slot-content" class="container">
          ${this.mode===a||this._isTransitioning[a]||l?t:""}
        </div>
      </bbva-transition-container>
    `}navigateForward(t={}){var a;let e="sustainability-sustainable-car-simulator-navigation-external";var i;t.external||(e="navigation-go-forward",this.resetScroll=!0,this._isTransitioning={...this._isTransitioning,[this.mode]:!0,[null==t||null===(i=t.params)||void 0===i?void 0:i.mode]:!0},this._updateFeatureState(t.params),this.history.push({state:this._getFeatureState()}));this.dispatchEvent(new CustomEvent(e,{detail:{id:this.mode,params:{source:{history:this.history},target:{id:t.external?t.id:null===(a=t.params)||void 0===a?void 0:a.mode,params:t.params}}},bubbles:!0,composed:!0}))}navigateBack(t=!0){const a=this._findOpenedModal();if(a)this[a]=!1;else{var e,i;this.resetScroll=!1;const a=this.history.length,s=this.history[a-1],n=this.history[a-2];var l,r,o;if(this._isTransitioning={...this._isTransitioning,[null==s||null===(e=s.state)||void 0===e?void 0:e.mode]:!0,[null==n||null===(i=n.state)||void 0===i?void 0:i.mode]:!0},a>1&&(this.history.pop(),this._updateFeatureState(n.state)),t)this.dispatchEvent(new CustomEvent("navigation-go-back",{detail:{id:null==s||null===(l=s.state)||void 0===l?void 0:l.mode,params:{source:{id:null==s||null===(r=s.state)||void 0===r?void 0:r.mode},target:{id:null==n||null===(o=n.state)||void 0===o?void 0:o.mode}}},bubbles:!0,composed:!0}))}}_updateFeatureState(t){Object.keys(t).forEach((a=>{this[a]=t[a]}))}_noRetryEventError(){this.dispatchEvent(new CustomEvent(`${_t.is}-error-not-available-retry`,{composed:!0,bubbles:!0}))}_getFeatureState(){const t=Object.keys(_t.properties),a=["history","_isTransitioning"],e=t.filter((t=>!a.includes(t))).reduce(((t,a)=>({...t,[a]:this[a]})),{});return JSON.parse(JSON.stringify(e))}get _fullErrorTemplate(){const t=this._requestErrors.simulator<=this.maxRequestAttempts;return s`
      <bbva-help-modal
        id="sustainability-sustainable-car-simulator-full-error"
        full-height
        fixed-footer
        avoid-icon-close-modal
        title-lines="0"
        .closeModalElements="${[]}"
        .headerCloseIconAriaLabel="${this.t("sustainability-sustainable-car-simulator-modal-icon-aria-label")}"
        .headerText="${this.t("sustainability-sustainable-car-simulator-error-header")}"
        .buttonText="${t?this.t("sustainability-sustainable-car-simulator-error-button"):this.t("sustainability-sustainable-car-simulator-error-button-no-retries")}"
        visible
        @help-modal-header-click="${()=>{this.navigateBack()}}"
        @help-modal-footer-button-click="${t?()=>{this._requestData()}:()=>{this.navigateBack()}}"
      >
        <div slot="slot-content">
          <bbva-clip-microillustration class="error" microillustration="error" size="M">
          </bbva-clip-microillustration>
          <bbva-type-text
            class="error-text"
            text="${this.t("sustainability-sustainable-car-simulator-error-title")}"
            size="3XL"
            tag="span"
            font-weight="500"
          >
          </bbva-type-text>
          <bbva-type-text
            class="error-text"
            .text="${t?this.t("sustainability-sustainable-car-simulator-error-section-text"):this.t("sustainability-sustainable-car-simulator-error-section-text-no-retries")}"
            size="M"
            tag="span"
            font-weight="350"
          >
          </bbva-type-text>
        </div>
      </bbva-help-modal>
      <bbva-progress-content
        variant="transparent"
        ?visible="${Object.values(this._currentRequests).some((t=>t))}"
      >
      </bbva-progress-content>
    `}_findOpenedModal(){return Object.keys(_t.properties).find((t=>t.endsWith("Modal")&&this[t]))}_handleNavigation(){}_changeEventName(t,a={}){this.dispatchEvent(new CustomEvent(`${_t.is}-${t}`,{detail:a,bubbles:!0,composed:!0}))}get _carDetailTemplate(){return s`
      <sustainability-sustainable-car-simulator-detail
        .host="${this.host}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        .sustainabilityApiVersion="${this.sustainabilityApiVersion}"
        .language="${this.language}"
        .native="${this.native}"
        .localCurrency="${this.localCurrency}"
        .simulatorDataDetail="${this.simulatorData}"
        .products="${this.products}"
        .loanId="${this.loanId}"
        .loanType="${this.loanType}"
        .toggles="${this.toggles}"
        ?modal-calculation-explanation-visible="${this.calculationExplanationModal}"
        @sustainability-sustainable-car-simulator-detail-products-link-clicked="${({detail:t})=>{this.navigateForward({external:!0,id:t.id,params:t.payload})}}"
      >
      </sustainability-sustainable-car-simulator-detail>
    `}get _productsTemplate(){return s`
      <sustainability-sustainable-car-simulator-products
        .host="${this.host}"
        .headers="${this._headers}"
        .requiredToken="${this.requiredToken}"
        .sustainabilityApiVersion="${this.sustainabilityApiVersion}"
        .language="${this.language}"
        .native="${this.native}"
        .localCurrency="${this.localCurrency}"
        .products="${this.products}"
        .loanId="${this.loanId}"
        .loanType="${this.loanType}"
        .toggles="${this.toggles}"
        .externalOffersData="${this.externalOffersData}"
        @sustainability-sustainable-car-simulator-products-link-clicked="${({detail:t})=>{this.navigateForward({external:!0,id:t.id,params:t.payload})}}"
        @sustainability-sustainable-car-simulator-products-fetched="${({detail:t})=>{this.products=t}}"
      >
      </sustainability-sustainable-car-simulator-products>
    `}render(){return s`
      ${super.render()}
      <div ambient="primary">
        ${this._hasFullError?this._fullErrorTemplate:s`
              ${this._simulatorTemplate}
              ${this._configureTransitionTemplate(this._carDetailTemplate,_t.allowedModes.detail,{headerText:"sustainability-sustainable-car-simulator-expense-comparison"})}
              ${this._toggles.products?this._productsTemplate:s``}
            `}
      </div>
    `}}customElements.define(_t.is,_t);class xt extends i{static get is(){return"bbva-analyticmanager-sustainability-car-simulator"}static get properties(){return{persistData:{type:Object}}}constructor(){super(),this.persistData={}}static get styles(){return[at,l("bbva-analyticmanager-sustainability-shared-styles")]}static get engineType(){return{ELECTRIC:"electrico",GASOLINE:"gasolina",HYBRID:"hibrido"}}homeView(t){var a,e,i,l,r,o;const{engineType:s}=xt,n=s[null==t||null===(a=t.cars)||void 0===a||null===(e=a[0])||void 0===e||null===(i=e.engineType)||void 0===i?void 0:i.id],c=s[null==t||null===(l=t.cars)||void 0===l||null===(r=l[1])||void 0===r||null===(o=r.engineType)||void 0===o?void 0:o.id],u=c===s.HYBRID?"e":"y";this.persistData={applicationCustomFields:`vehiculos comparados:${n} ${u} ${c}`},this._dispatch("home-view",this.persistData)}detailView(){this._dispatch("detail-view",this.persistData)}manageAnalyticsModalNavigation(t){if(t.visible){var a,e,i;const l=(null===(a=t.target)||void 0===a?void 0:a.id)||(null===(e=t.modal)||void 0===e?void 0:e.id),r={"sustainability-sustainable-car-simulator-detail-calculation-explanation-modal":{event:"modal-calculation"}};this._dispatch(null===(i=r[l])||void 0===i?void 0:i.event)}}manageAnalyticsExternalNavigation(t){var a,e;this._dispatch(`navigate-${null==t||null===(a=t.params)||void 0===a||null===(e=a.target)||void 0===e?void 0:e.id}-from-${null==t?void 0:t.id}`,this.persistData)}_dispatch(t,a){this.dispatchEvent(new CustomEvent(`${xt.is}-${t}`,{bubbles:!0,composed:!0,detail:a}))}}customElements.define(xt.is,xt);var $t=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class kt extends i{static get is(){return"bbva-controller-sustainable-car-simulator"}static get properties(){return{featureFlags:{type:Object}}}static get styles(){return[$t,l("bbva-controller-sustainable-car-simulator-shared-styles")]}constructor(){super(),this.featureFlags={}}updated(t){if(t.has("featureFlags")&&Object.keys(this.featureFlags).length){var a,e;const t={products:null===(a=this.featureFlags["glomo.sustainability.carSimulator.products"])||void 0===a?void 0:a.value,promotions:null===(e=this.featureFlags["glomo.sustainability.carSimulator.promotions"])||void 0===e?void 0:e.value};this._dispatch("set-toggles-flags",t)}}setCachedUser(t){const a=null==t?void 0:t.username;this._dispatch("set-cached-user",a)}manageExternalNavigation(t){var a,e,i,l,r,o,s,n,c;const u={offerId:null==t||null===(a=t.params)||void 0===a||null===(e=a.target)||void 0===e||null===(i=e.params)||void 0===i?void 0:i.id,productId:null==t||null===(l=t.params)||void 0===l||null===(r=l.target)||void 0===r||null===(o=r.params)||void 0===o||null===(s=o.product)||void 0===s?void 0:s.id};this._dispatch(null==t||null===(n=t.params)||void 0===n||null===(c=n.target)||void 0===c?void 0:c.id,u)}manageBackNavigation(t){var a,e;null!=t&&null!==(a=t.params)&&void 0!==a&&null!==(e=a.target)&&void 0!==e&&e.id||this._dispatch("exit-feature",t)}_dispatch(t,a){this.dispatchEvent(new CustomEvent(`${kt.is}-${t}`,{bubbles:!0,composed:!0,detail:a}))}}customElements.define(kt.is,kt);
