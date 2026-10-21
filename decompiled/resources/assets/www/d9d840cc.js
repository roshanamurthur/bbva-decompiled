import"./8666e3f4.js";import{z as t,a8 as e,ac as i,ad as a,ab as s,bf as o,ar as r,a9 as n,aa as l,b0 as d,bd as c,a as h,aJ as p,L as b,S as u,ag as m,b6 as g,ak as v,h as f,av as y,r as _,o as x,f as S,g as $,au as k,ap as C,as as w,at as E,an as A,bx as T,V as R,i as I,aw as P,af as N,F as D,b1 as O,aM as L,aN as M,ah as q,aD as V,aO as H,eS as B,bF as F,cK as z,bc as j,aI as U,cM as G,G as X,bh as W,bW as J,aU as K,bj as Y,dt as Q,fm as Z,cR as tt,aq as et,bw as it,aV as at,bu as st,fn as ot,fo as rt,e_ as nt,cH as lt,b5 as dt,aZ as ct,J as ht}from"./952f98a9.js";import{v as pt,G as bt,f as ut,H as mt,a4 as gt,Q as vt,R as ft,S as yt,W as _t,x as xt,h as St,K as $t,V as kt,z as Ct,D as wt,T as Et,N as At}from"./216055dc.js";import{bg as Tt,aM as Rt,t as It,aH as Pt,bf as Nt,bT as Dt,bS as Ot,cM as Lt}from"./7f3d7ca9.js";import{B as Mt,l as qt,m as Vt,d as Ht,c as Bt}from"./30ef6f1f.js";import"./caf32692.js";import{a as Ft,B as zt}from"./e3d898b2.js";import{B as jt}from"./ee7b135d.js";import"./82f6061c.js";import"./0d2bd2b5.js";import"./7ee23eb7.js";import"./3745048e.js";import{g as Ut,B as Gt,c as Xt,a as Wt,d as Jt,e as Kt,f as Yt,b as Qt}from"./1979ce36.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./ff2cdeea.js";import"./0582b54b.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";const Zt=new r;var te=t`:host {
  --skeleton-quote-color: var(--bbva-list-definition-data-skeleton-dark-mode-color, var(--bbva-list-definition-data-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)})));
  --skeleton-quote-bg: var(--bbva-list-definition-data-sekeleton-bg-dark-mode-color, var(--bbva-list-definition-data-skeleton-bg, transparent));
  box-sizing: border-box;
  display: flex;
  flex-wrap: wrap;
  flex-direction: row;
  align-items: top;
  --_list-definition-data-key-font-color: var(--bbva-list-definition-data-key-font-dark-mode-color, var(--bbva-list-definition-data-key-font-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-definition-data-list-border: var(--bbva-list-definition-data-list-border-dark-mode-color, var(--bbva-list-definition-data-list-border, var(--colorsSecondary100, ${e(n.secondary100)})));
  --_list-definition-data-value-font-color: var(--bbva-list-definition-data-value-font-dark-mode-color, var(--bbva-list-definition-data-value-font-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_list-definition-data-card-bg-color: var(--bbva-list-definition-data-card-bg-dark-mode-color, var(--bbva-list-definition-data-card-bg, var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)})));
  --_list-definition-data-sticky-bg-color: var(--bbva-list-definition-data-sticky-bg-dark-mode-color, var(--bbva-list-definition-data-sticky-bg, var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)})));
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.list {
  display: flex;
  flex-direction: column;
  align-items: center;
  min-width: 50%;
  max-width: 50%;
}
.list:nth-child(2n-1) {
  border-right: 1px solid var(--_list-definition-data-list-border);
}
.list:nth-child(2n) {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em);
}

.key {
  display: flex;
  align-items: center;
  text-align: center;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(s.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(s.medium.fontStyle)});
  color: var(--_list-definition-data-key-font-color);
}
.key-fit {
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(s.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(s.book.fontStyle)});
}
.key-ellipsis {
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.valueData {
  --bbva-text-color: var(--_list-definition-data-value-font-color);
}

[data-tag-name=bbva-badge-variability] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

:host([variant=card]) {
  background: var(--_list-definition-data-card-bg-color);
  box-shadow: var(--boxShadowType1, ${e(o.type1)});
}

:host([alignment=left]) .list {
  align-items: start;
}
:host([alignment=left]) .key {
  text-align: left;
}

:host([one-column]) .list {
  min-width: 100%;
  max-width: 100%;
}

:host([hide-border-right]) .list:nth-child(2n-1),
:host([one-column]) .list:nth-child(2n-1) {
  border-right: none;
}

:host([sticky]) {
  position: sticky;
  position: -webkit-sticky;
  top: 0;
  z-index: 1;
  background-color: var(--_list-definition-data-sticky-bg-color);
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  user-select: none;
  pointer-events: none;
}
:host([disabled]) [data-tag-name=bbva-link] {
  opacity: 1;
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  height: 4.75rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((20% * 2) + (16px/ 2)) 16px, calc((37% * 2) + (16px/ 2)) 16px;
  background-position: 65% 16px, 119% 44px;
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
${Zt.mediaRules()}`;const ee=new r;var ie=t`[ambient^=light] {
  --bbva-list-definition-data-key-font-color: initial;
  --bbva-list-definition-data-value-font-color: initial;
  --bbva-list-definition-data-card-bg: initial;
  --bbva-list-definition-data-skeleton-color: initial;
  --bbva-list-definition-data-sticky-bg: initial;
}

[ambient=light100] {
  --bbva-list-definition-data-sticky-bg: var(--colorsSecondary100, ${e(n.secondary100)});
}
${ee.mediaRules()}`;const ae=new r;var se=t`[ambient^=dark] {
  --bbva-list-definition-data-key-font-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-definition-data-value-font-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-definition-data-card-bg: var(--colorsPrimaryCore, ${e(n.primaryCore)});
  --bbva-list-definition-data-skeleton-color: var(--colorsPrimaryMedium, ${e(n.primaryMedium)});
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryCore, ${e(n.primaryCore)});
}

[ambient=dark100] {
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryMedium, ${e(n.primaryMedium)});
}

[ambient=dark200] {
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
}

[ambient=dark300] {
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
}

[ambient=dark400] {
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryCoreDarkened, ${e(n.primaryCoreDarkened)});
}
${ae.mediaRules()}`;const oe={dark:t`
    ${d.dark}
    ${c.dark}
    ${se}
  `,light:t`
    ${d.light}
    ${c.light}
    ${ie}
  `};class re extends(h(p(b))){static get is(){return"bbva-list-definition-data"}static get scopedElements(){return{"bbva-badge-variability":u,"bbva-text":m,"bbva-link":g}}static get properties(){return{items:{type:Array},alignment:{type:String},oneColumn:{type:Boolean,attribute:"one-column",reflect:!0},hideBorderRight:{type:Boolean,attribute:"hide-border-right"},useLinkIdAsDetail:{type:Boolean,attribute:"use-link-id-as-detail"},sticky:{type:Boolean},disabled:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.items=[],this.disabled=!1,this.loading=!1,this.oneColumn=!1,this.alignment="center",this.hideBorderRight=!1,this.useLinkIdAsDetail=!1,this.sticky=!1}static get styles(){return[super.styles,te,oe.dark,oe.light,v("bbva-list-definition-data-shared-styles")]}updated(t){super.updated(t)}_getStatus(t){return this._trendMapIcons={up:"increase",down:"decrease",noChange:"no-change"},this._trendMapIcons[t.trend]}_shouldCreateIcon(t){return this._getStatus(t)?f`
          <bbva-badge-variability
            size="small"
            .status=${this._getStatus(t)}
          ></bbva-badge-variability>
        `:""}_goLink(t){var e;const i=null==t||null===(e=t.currentTarget)||void 0===e?void 0:e.id;this.dispatchEvent(new CustomEvent("list-definition-data-link-click",{detail:!this.useLinkIdAsDetail||{id:i},bubbles:!0,composed:!0}))}get _items(){return this.items.map(((t,e)=>f`
        <div class="list">
          ${t.key?f`
                <span
                  class="key ${y({"key-fit":t.keyFit,"key-ellipsis":t.keyEllipsis})}"
                  id="key_${e}"
                >
                  ${this._shouldCreateIcon(t)} ${t.key}
                </span>
              `:f``}
          ${t.value?f`
                <bbva-text
                  class="valueData"
                  id="value_${e}"
                  tag="span"
                  size="S"
                  ?ellipsis="${!t.ellipsisLines||t.ellipsisLines>0}"
                  lines="${t.ellipsisLines||0===t.ellipsisLines?t.ellipsisLines:2}"
                  .alignment=${this.alignment}
                  .text=${t.value}
                ></bbva-text>
              `:f`
                ${t.textLink?f`
                      <bbva-link
                        id="link_${e}"
                        @click="${this._goLink}"
                        ?disabled=${this.disabled}
                      >
                        ${t.textLink}
                      </bbva-link>
                    `:f``}
              `}
        </div>
      `))}render(){return f` ${this._items} `}}$("colors.cool50"),$("colors.primaryCoreLightened"),$("colors.cool40"),$("colors.primaryCoreLightened"),$("colors.secondary600"),$("colors.secondary600");var ne=t`[ambient^=light] {
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
${(new r).mediaRules()}`;const le=new r;var de=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${e(n.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}
${le.mediaRules()}`;const ce={dark:t`
    ${d.dark}
    ${k.dark}
    ${c.dark}
    ${de}
  `,light:t`
    ${d.light}
    ${k.light}
    ${c.light}
    ${ne}
  `},he=new r;var pe=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${e(n.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(s.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(s.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(s.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(s.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${e(s.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${e(s.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}
${he.mediaRules()}`;class be extends(C(w(E(p(h(A(b))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[P,g,u,m,N];return be.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,pe,ce.light,ce.dark,T("button:focus"),v("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return f`
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
    `}get _icon(){return f`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return f`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return f`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return f`
      <bbva-badge-variability
        disabled-tabindex
        .status=${t}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const t=R(this.mask,this.maskChars,!0,this.visibleChars);return f`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),f`
      <dd class=${y({[`wrapper-${e}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){const e="actionLink"===t?`${t}AccessibilityText`:`${t}LinkAccessibilityText`;return f`
      <bbva-link
        class=${y({ellipsis:this[`${t}Ellipsis`]})}
        aria-label="${I(this.t(this[e]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${I(this.roleLink)} aria-live=${I(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,i=`${t}TagText`,a=`${t}RoleText`,s=`${t}AriaLiveText`;return f`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role="${I(this[a])}"
        aria-live="${I(this[s])}"
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag="${I(this[i])}"
      >
      </bbva-text>
    `}_tplText(t){return f` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return f`
      <dl>
        <dt class=${y({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return f`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?f`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):f` <div class="wrapper-description">${this._tplText("description")}</div> `,f`
      ${t}
      <div class="skeleton"></div>
    `}}customElements.define(be.is,be);var ue=t`
:host {
  --bbva-expandable-step-completed-step-border-color: var(--colorsPrimaryCoreLightened, #ffffff);
  --bbva-form-field-info-message-icon-color: var(--primaryCoreDark, #043263);
  --bbva-form-select-info-message-icon-color: var(--primaryCoreDark, #043263);
  --bbva-panel-info: var ( --bbva-core-grey: #d3d3d3);
  --_header-bbva-micro-color: var(--bbva-header-bbva-micro-color, var(--colorsPrimaryCore, ${e(n.primaryCore)}));
  --bbva-expandable-step-content-max-height: none;
  --bbva-panel-info-text-color: var(--bbva-header-bbva-micro-color, var(--tertiaryType6Medium, ${e(n.tertiaryType6Medium)}));
  display: block;
  box-sizing: border-box;
  --skeleton-quote-color: var(--bbva-list-action-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)}));
  --skeleton-quote-bg: var(--bbva-list-action-skeleton-bg, var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-expandable-multistep] {
  min-height: calc(100vh - 48px);
}

[data-tag-name=bbva-form-text],
[data-tag-name=bbva-form-number],
[data-tag-name=bbva-form-date],
[data-tag-name=bbva-form-input],
[data-tag-name=bbva-form-password],
[data-tag-name=bbva-notification-message] {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-list-file],
[data-tag-name=bbva-type-link],
[data-tag-name=bbva-list-definition-data],
[data-tag-name=bbva-list-bullet],
[data-tag-name=bbva-header-category],
[data-tag-name=bbva-list-simple],
[data-tag-name=bbva-type-text] {
  padding-left: 0;
}

[data-tag-name=bbva-divider].personal-data-divider {
  display: block;
  margin-block: 0.5rem;
}

bbva-expandable-step[completed] .content {
  display: none;
}
bbva-expandable-step[completed]:last-of-type {
  padding-bottom: 6.5rem;
}

[data-tag-name=bbva-panel-button-fixed][show] {
  padding-top: 0;
}

[data-tag-name=bbva-aggregation-bullet-list],
[data-tag-name=bbva-header-bbva] {
  text-align: left;
}

div.action-buttons {
  text-align: center;
  margin-top: 2rem;
}

.signaturePanel {
  background-color: var(--colorsSecondary100);
  margin: 1.5rem 0;
  border-radius: 1px;
  box-shadow: 0 1px 3px 0 rgba(18, 18, 18, 0.2);
}

.custom-header {
  padding: 1rem 1rem 1rem 0px;
  text-align: left;
}
.custom-header svg {
  max-height: 1.5rem;
  color: var(--_header-bbva-micro-color);
}

[data-tag-name=bbva-header-category] {
  padding: 1rem 0 0.5rem 0;
}

[data-tag-name=bbva-type-text]#municipality,
[data-tag-name=bbva-type-text]#state,
[data-tag-name=bbva-type-text]#country {
  margin-top: 1rem;
}

.divSummary {
  margin-bottom: 0.5rem;
}

.verify-data-text {
  padding: 0 0 1rem 0;
}

.hints-container {
  margin-bottom: 1rem;
}

.confirm-step {
  background-color: white;
  height: auto;
  width: -webkit-fill-available;
  padding: 1.5rem 1rem 1.5rem 1rem;
}

.mainIllustration {
  margin-top: 1rem;
}

.mainTitleText {
  margin: 1rem 0 0.5rem 0;
}

.contentModal {
  margin-top: 1rem;
}

.listBullets {
  padding: 0;
}

.marginnError {
  margin-top: 1rem;
}
`;const me=(t,e,i)=>{t.dispatchEvent(new CustomEvent(e,{detail:i,bubbles:!0,composed:!0}))},ge={maxLength:20,allowedPattern:"[a-zA-ZñÑ áéíóúÁÉÍÓÚüÜ'’‘.¨-]"},ve="[a-zA-ZñÑ .]",fe="[a-zA-ZñÑ 0-9]";class ye extends(pt(A(b))){static get is(){return"bbva-multistep-digital-account-password"}static get scopedElements(){return{"bbva-expandable-step":Tt,"bbva-type-text":bt,"bbva-form-input":Mt,"bbva-button-default":ut,"bbva-form-password-hint":qt}}static get properties(){return{passwordData:{Object:Object},isContinueDisabled:{Boolean:Boolean},isShowPasswordHints:{Boolean:Boolean},isShowConfirmationHints:{Boolean:Boolean},isPasswordValid:{Boolean:Boolean},inputData:{Object:Object},disabledFields:{type:Boolean},_isPasswordsMatching:{type:Boolean}}}constructor(){super(),this.passwordData={password:"",confirmation:""},this.isContinueDisabled=!0,this.isShowPasswordHints=!0,this.isShowConfirmationHints=!0,this.isPasswordValid=!1,this.inputData={},this.disabledFields=!1,this._isPasswordsMatching=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
      <bbva-type-text ?disabled=${this.disabledFields} text=${this.t("open-digital-account-multistep-step-five-description")}></bbva-type-text>
      <bbva-form-input 
        id="password" 
        type="password" 
        ambient="primary-alt"
        label=${this.t("open-digital-account-multistep-step-five-form-password-label")} 
        .value=${this.passwordData.password} 
        @form-input-value-change=${this._handleInputChange} 
        @form-field-input-blur=${this._formatVerification}
        @form-field-input-clear=${this._uncheckHints}
        @click=${this._resetInputPassword}
        ?disabled=${this.disabledFields}
        allowed-pattern="${fe}"
        @paste=${t=>t.preventDefault()}
        >
      </bbva-form-input>
      ${this.isShowPasswordHints?this._showHints("password"):""}
      <bbva-form-input 
        id="confirmation" 
        type="password" 
        ambient="primary-alt"
        label=${this.t("open-digital-account-multistep-step-five-form-password-confirm-label")} 
        .value=${this.passwordData.confirmation} 
        @form-input-value-change=${this._handleInputChange}
        @form-field-input-blur=${this._formatVerification}
        @form-field-input-clear=${this._uncheckHints}
        @click=${this._resetInputConfirmation}
        allowed-pattern="${fe}"
        @paste=${t=>t.preventDefault()}
        disabled>
      </bbva-form-input>
      ${this.isShowConfirmationHints?this._showHints("confirmation"):""}
      <div class="action-buttons">
        <bbva-button-default id="passwordContinue" fullwidth="" text=${this.t("open-digital-account-multistep-step-generic-button-continue")} variant="primary" ?disabled=${this.isContinueDisabled} @click=${this._handleCompleteStep}></bbva-button-default>
      </div>
    `}get _inputPassword(){return this.shadowRoot.querySelector("#password")}get _inputConfirmation(){return this.shadowRoot.querySelector("#confirmation")}_resetInputPassword(){this._inputPassword.removeAttribute("invalid"),this._inputPassword.removeAttribute("error-message"),this.isShowPasswordHints=!0}_resetInputConfirmation(){this._inputConfirmation.removeAttribute("invalid"),this._inputConfirmation.removeAttribute("error-message"),this.isShowConfirmationHints=!0}_formatVerification(t){const{id:e}=t.target;this.inputData[e]=this.shadowRoot.querySelector(`#${e}`),this.isPasswordValid?"confirmation"!==e||this._isPasswordsMatching?(this.inputData[e].removeAttribute("invalid"),this.inputData[e].removeAttribute("error-message"),this.isShowPasswordHints=!0,this.isShowConfirmationHints=!0):(this.inputData[e].setAttribute("invalid",""),this.inputData[e].setAttribute("error-message",this.t("open-digital-account-multistep-step-five-form-confirm-label-incorrect-format")),this.isShowConfirmationHints=!1):(this.inputData[e].setAttribute("invalid",""),"password"===e?(this.inputData[e].setAttribute("error-message",this.t("open-digital-account-multistep-step-five-form-password-label-incorrect-format")),this.isShowPasswordHints=!1):(this.inputData[e].setAttribute("error-message",this.t("open-digital-account-multistep-step-five-form-confirm-label-incorrect-format")),this.isShowConfirmationHints=!1))}_showHints(t){return f`
      <div class="hints-container">
        <bbva-form-password-hint slot="hint" id="${t}MinMax">${this.t("open-digital-account-multistep-step-five-form-password-hint-lenght")}</bbva-form-password-hint>
        <bbva-form-password-hint slot="hint" id="${t}Lower">${this.t("open-digital-account-multistep-step-five-form-password-hint-lower-case")}</bbva-form-password-hint>
        <bbva-form-password-hint slot="hint" id="${t}Upper">${this.t("open-digital-account-multistep-step-five-form-password-hint-upper-case")}</bbva-form-password-hint>
        <bbva-form-password-hint slot="hint" id="${t}Numbers">${this.t("open-digital-account-multistep-step-five-form-password-hint-numbers")}</bbva-form-password-hint>
      </div>
    `}_handleInputChange(t){const{id:e,value:i}=t.target;this.passwordData[e]=i,this.passwordValidations(e,this.passwordData[e]),this.requestUpdate()}passwordValidations(t,e){this.isShowPasswordHints=!0,this._inputPassword.removeAttribute("invalid"),this._inputPassword.removeAttribute("error-message");const i=e.length>=8&&e.length<=10,a=/^(?=.*[A-Z])/.test(e),s=/^(?=.*[a-z])/.test(e),o=/^(?=.*\d)/.test(e);this.isPasswordValid=i&&a&&s&&o,this._isPasswordsMatching=this.passwordData.password===this.passwordData.confirmation,"password"===t&&(this.isPasswordValid?this._inputConfirmation.removeAttribute("disabled",""):this._inputConfirmation.setAttribute("disabled","")),this.hintsHandler(`#${t}MinMax`,i),this.hintsHandler(`#${t}Lower`,s),this.hintsHandler(`#${t}Upper`,a),this.hintsHandler(`#${t}Numbers`,o),this.isContinueDisabled=!(this.isPasswordValid&&this._isPasswordsMatching)}hintsHandler(t,e){const i=this.shadowRoot.querySelector(t);e?i.setAttribute("checked",""):i.removeAttribute("checked","")}_uncheckHints(t){const{id:e}=t.target;["MinMax","Lower","Upper","Numbers"].forEach((t=>{this.shadowRoot.querySelector(`#${e+t}`).removeAttribute("checked")})),this.passwordData[e]=""}_clearInputs(){this._inputPassword.shadowRoot.querySelector("[data-tag-name=bbva-form-password]").clearInput(),this._inputConfirmation.shadowRoot.querySelector("[data-tag-name=bbva-form-password]").clearInput(),this._resetInputPassword(),this._resetInputConfirmation(),this._inputConfirmation.setAttribute("disabled",""),this.isContinueDisabled=!0,this._isPasswordsMatching=!1}_handleCompleteStep(){me(this,"customer-password-data",this.passwordData),me(this,"complete-step"),this._clearInputs()}completeStep(){me(this,"complete")}reset(){this._clearInputs(),this.passwordData={password:"",confirmation:""}}}const _e=new r;var xe=t`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${e(n.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}
${_e.mediaRules()}`;const Se=new r;var $e=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(n.secondary300)});
}
${Se.mediaRules()}`;const ke=new r;const Ce={dark:t`
    ${t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(n.secondary300)});
}
${ke.mediaRules()}`}
  `,light:t`
    ${$e}
  `};let we=class extends(h(b)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[xe,Ce.light,Ce.dark,v("bbva-divider-shared-styles")]}render(){return f` <hr divider="${this.size}" /> `}};customElements.define(we.is,we);const Ee=new r;var Ae=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${e(n.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${e(n.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${e(i.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${e(a.type3XSmall)}));
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
${Ee.mediaRules()}`;var Te=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new r).mediaRules()}`;const Re=new r;const Ie={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
}
${Re.mediaRules()}`}
  `,light:t`
    ${Te}
  `};class Pe extends(h(A(p(b)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":D,"bbva-text":m}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,Ae,Ie.dark,Ie.light,v("bbva-notification-help-shared-styles")]}render(){return f`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}$("colors.primarySubduedLight"),$("colors.cool20"),$("colors.tertiaryType1Light"),$("colors.primaryCoreLightened"),$("colors.tertiaryType6Light"),$("colors.cool20"),$("colors.cool50");const Ne=new r;var De=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${e(n.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${e(i.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Ne.mediaRules()}`;const Oe=new r;var Le=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${e(n.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${e(n.primaryMediumLight)});
}
${Oe.mediaRules()}`;var Me=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new r).mediaRules()}`;const qe={dark:t`
    ${Le}
    ${Rt.dark}
    ${d.dark}
    ${Ie.dark}
    ${O.dark}
  `,light:t`
    ${Me}
    ${Rt.light}
    ${d.light}
    ${Ie.light}
    ${O.light}
  `};class Ve extends(h(A(L(b)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":It,"bbva-notification-help":Pe,"bbva-text":m,"bbva-link":g}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=M(),this.errorIconSize=16,this.infoIcon=q(),this.infoIconSize=16,this.name=`form-radio-group-${((t=10)=>`${Math.random().toString(36).substr(2,t)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(t=>this._setRadioName(t)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(t){(((t||{}).detail||{}).contentSlots||[]).forEach((t=>{const e=(t||{}).assignedNodes;"bbva-form-radio-button"===(e.getAttribute("data-tag-name")||(e||{}).nodeName).toLowerCase()&&(e.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(t=>this._updateItems(t)))}updated(t){if(super.updated&&super.updated(t),t.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const t=this.radioItems.find((t=>t.checked));t&&(t.checked=!1)}t.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].disabled=this.disabled}))),t.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].invalid=this.invalid}))),t.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].readonly=this.readonly}))),t.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].required=!1})),this.radioItems[0].required=!0)}_updateItems(t){const e=this.radioItems.indexOf(t.target);this.selected=e,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:t.target.value,selected:e},bubbles:!0,composed:!0}))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?f`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${I(this.linkHref)}"
          icon="${V()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const t=this.t(this.labelOut);return f`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?t:`${t} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[De,v("bbva-form-radio-group-shared-styles"),qe.dark,qe.light]}render(){return f`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((t=>f`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${t.value}"
              label="${t.label}"
              divider="${I(t.divider)}"
              ?disabled="${t.disabled}"
              ?checked="${t.checked}"
              ?required="${t.required}"
              ?label-medium="${t.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${t.invalid?t.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${t.infoMessage}"
              accessibility-icon-info-notification="${I(t.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${I(t.accessibilityIconAlert)}"
              variant="${I(t.variant)}"
            >
              ${t.text?H(t.text):t.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?f`
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
    `}}customElements.define(Ve.is,Ve);const He=`${B()}`,Be=`${F()}`;class Fe extends(pt(A(b))){static get is(){return"bbva-multistep-digital-account-personal-data"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-type-link":mt,"bbva-header-category":gt,"bbva-notification-message":vt,"bbva-form-number":Vt,"bbva-form-radio-button":It,"bbva-form-select":Ft,"bbva-form-date":Ht,"bbva-form-text":Bt,"bbva-form-option":zt,"bbva-divider":we,"bbva-form-radio-group":Ve,"bbva-button-default":ut}}static get properties(){return{interaction:{type:Object},_firstInteractionDispatched:{type:Boolean},ocrEnabled:{type:Boolean},ocrData:{type:Object},verifyDataFlag:{type:Boolean},_name:{type:String},_nameConfig:{type:Object},_lastName:{type:String},_lastNameConfig:{type:Object},_secondLastName:{type:String},_secondLastNameConfig:{type:Object},birthDate:{type:String},_isAdult:{type:Boolean},listEntity:{type:Array},_birthPlace:{type:String},_birthPlaceId:{typeo:String},_gender:{type:Object},genderOptions:{type:Array},_ocr:{type:String},verifyDataError:{type:Boolean},isNonBinaryGenderEnabled:{type:Boolean}}}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}constructor(){super(),this.interaction={},this.birthDate="",this._birthPlace="",this._birthPlaceId="",this._gender={id:"",sel:-1},this.genderOptions=[],this._lastName="",this._name="",this._ocr="",this._secondLastName="",this.ocrEnabled=!1,this.listEntity=[],this.verifyDataFlag=!1,this.ocrData={},this._isAdult=!1,this._firstInteractionDispatched=!1,this.verifyDataError=!1,this.isNonBinaryGenderEnabled=!1,this._nameConfig={...ge},this._lastNameConfig={...ge},this._secondLastNameConfig={...ge}}reset(){this.birthDate="",this._birthPlace="",this._birthPlaceId="",this._gender={id:"",sel:-1},this.genderOptions=[],this._lastName="",this._name="",this._ocr="",this._hasReached9OCRDigitsOnce=!1,this._secondLastName="",this.listEntity=[],this.verifyDataFlag=!1,this._resetRadioButtons(),this.ocrData={},this._birthDateField.disabled=!1,this._firstInteractionDispatched=!1,this._resetInvalidStates(),this.verifyDataError=!1}_resetRadioButtons(){this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-radio-button"]').forEach((t=>{t.checked=!1}))}_resetInvalidStates(){this.updateComplete.then((()=>{["name","lastName","secondLastName","birthDate","birthPlace","gender","idNumber"].forEach((t=>{this.shadowRoot.querySelector(`#${t}`).invalid=!1}))}))}completeStep(){this._birthDateField.disabled=!0,me(this,"complete")}updated(t){super.updated(t),t.has("ocrData")&&Object.keys(this.ocrData).length>0&&this._fillFields(this.ocrData),t.has("_birthPlaceId")&&""!==this._birthPlaceId&&this._setBirthPlace(),t.has("birthDate")&&""!==this.birthDate&&this._validateMinAge(this.birthDate),t.has("_ocr")&&this._updateOCRInputValidState(),t.has("verifyDataError")&&this.verifyDataError&&this.validateScroll({name:"",lastName:"",secondLastName:"",birthDate:"",birthPlace:"",gender:""})}_fillFields(t){var e;this._name=(null==t?void 0:t.gf_first_name)||"",this._lastName=(null==t?void 0:t.gf_last_name)||"",this._secondLastName=(null==t?void 0:t.gf_second_last_name)||"",this.birthDate=(t=>{const e=moment(t,"DD/MM/YYYY",!0);return e.isValid()?e.format("YYYY-MM-DD"):""})(null==t?void 0:t.gf_birth_date),this._birthPlaceId=(e=null==t?void 0:t.curp_id)&&18===(null==e?void 0:e.length)?e.substring(11,13):"",this._updateGenderSelection(null==t?void 0:t.gf_gender_type),this._ocr=(null==t?void 0:t.gf_code_id_Credential)||""}_setBirthPlace(){const t=this.listEntity.find((t=>t.id===this._birthPlaceId));this._birthPlace=t.entity.trim()}_validateMinAge(t){if(this._isAdult=(t=>{const e=moment(t,"YYYY-MM-DD",!0);return!!e.isValid()&&moment().diff(e,"years")>=18})(t),!this._isAdult){const t="open-digital-account-multistep-step-one-form-over-eighteen-label";this._birthDateField.errorMessage=this.t(t),this._birthDateField.invalid=!0}}_updateOCRInputValidState(){const t=this.shadowRoot.querySelector("#idNumber"),e=9===this._ocr.length;if(e&&(this._hasReached9OCRDigitsOnce=!0),!e&&this._hasReached9OCRDigitsOnce)t.infoMessage="",t.invalid=!0;else{const e="open-digital-account-multistep-step-one-form-identification-number-info";t.infoMessage=this.t(e),t.invalid=!1}}_firstItemInteraction(t){this._firstInteractionDispatched||(me(this,"first-step-interaction",t),this._firstInteractionDispatched=!0)}get _birthDateField(){return this.shadowRoot.querySelector("#birthDate")}openOrCloseScanModal(){this._firstItemInteraction(this.interaction.SCANID_INTERACTION),me(this,"handle-scan-modal")}_openOrCloseIdentificationModal(){this._firstItemInteraction(this.interaction.INFOID_INTERACTION),me(this,"handle-identification-modal")}_handlePersonalDataInstead(t,e){const{value:i}=t.target,a=i.normalize("NFD").replace(/(?<!n)[\u0300-\u036f]+/g,"").normalize(),s={1:"_name",2:"_lastName",3:"_secondLastName"}[e];s&&(this[s]=a)}_handleOnChangeOcr(t){const{value:e}=t.target;this._ocr=e.replace(/\D/g,""),this._ocr.length<9&&this._ocr.length>0&&(this._inputOcr.removeAttribute("info-message"),this._inputOcr.setAttribute("invalid",""),this._inputOcr.setAttribute("error-message",this.t("open-digital-account-multistep-step-three-form-ocr-number-label-incorrect-format")))}get _intelligentScanTemplate(){return f`
      <bbva-type-text
        id="stepOneDescription"
        text=${this.t("open-digital-account-multistep-step-one-description",{highlight:'<span class="highlight">',endHighlight:"</span>",newLine:"<br>"})}
        size="S"
        unset
      ></bbva-type-text>

      ${this.ocrEnabled?this._scanLinkTemplate:""}
    `}get _scanLinkTemplate(){return f`
      <bbva-type-link
        id="scanButton"
        icon=${He}
        icon-size="24"
        variant="button-style"
        @click=${this.openOrCloseScanModal}>
        <span>${this.t("open-digital-account-multistep-step-one-scan-text")}</span>
      </bbva-type-link>
    `}get _verifyDataTextTemplate(){return f`
      <bbva-type-text
        class="verify-data-text"
        text=${this.t("open-digital-account-multistep-step-one-verify-data")}
        size="S"
        unset
      ></bbva-type-text>
    `}get _writtenDataReview(){return f`
      <bbva-type-text
        class="verify-data-text"
        text=${this.t("open-digital-account-multistep-step-one-data-review")}
        size="S"
        unset
      ></bbva-type-text>
    `}_handleInputValueUpdate(t){const{id:e,value:i}=t.target,a={name:"name",lastName:"lastName",secondLastName:"secondLastName",birthDate:"birthDate",birthPlace:"birthPlaceId",idNumber:"idNumber"}[e];i||this.messageError(a);const s={name:"_name",lastName:"_lastName",secondLastName:"_secondLastName",birthDate:"birthDate",birthPlace:"_birthPlaceId",idNumber:"_ocr"}[e];s&&(this[s]=i)}get _nameInputTemplate(){return f`
      <bbva-form-text
        id="name"
        required
        ambient="primary-alt"
        clear-icon="${Be}"
        label=${this.t("open-digital-account-multistep-step-one-form-name-label")}
        value=${this._name}
        allowed-pattern="${ve}"
        maxlength=${this._nameConfig.maxLength}
        @click=${()=>this._firstItemInteraction(this.interaction.NAME_INTERACTION)}
        @form-field-input-blur=${this._handleInputValueUpdate}
        @paste=${t=>t.preventDefault()}
        @keyup=${t=>{this._handlePersonalDataInstead(t,1)}}
      ></bbva-form-text>
    `}get _lastNameInputTemplate(){return f`
      <bbva-form-text
        id="lastName"
        required
        ambient="primary-alt"
        clear-icon="${Be}"
        label=${this.t("open-digital-account-multistep-step-one-form-first-last-name-label")}
        value=${this._lastName}
        allowed-pattern="${ve}"
        maxlength=${this._lastNameConfig.maxLength}
        @click=${()=>this._firstItemInteraction(this.interaction.LASTNAME_INTERACTION)}
        @form-field-input-blur=${this._handleInputValueUpdate}
        @paste=${t=>t.preventDefault()}
        @keyup=${t=>{this._handlePersonalDataInstead(t,2)}}
      ></bbva-form-text>
    `}get _secondLastNameInputTemplate(){return f`
      <bbva-form-text
        id="secondLastName"
        required
        ambient="primary-alt"
        clear-icon="${Be}"
        label=${this.t("open-digital-account-multistep-step-one-form-second-last-name-label")}
        value=${this._secondLastName}
        allowed-pattern="${ve}"
        maxlength="${this._secondLastNameConfig.maxLength}"
        @click=${()=>this._firstItemInteraction(this.interaction.SECOND_LASTNAME_INTERACTION)}
        @form-field-input-blur=${this._handleInputValueUpdate}
        @paste=${t=>t.preventDefault()}
        @keyup=${t=>{this._handlePersonalDataInstead(t,3)}}
      ></bbva-form-text>
    `}get _birthDateInputTemplate(){return f`
      <bbva-form-date
        id="birthDate"
        required
        ambient="primary-alt"
        label=${this.t("open-digital-account-multistep-step-one-form-birthdate-label")}
        value=${this.birthDate}
        @click=${this._launchCalendar}
        @form-field-input-blur=${this._handleInputValueUpdate}
      ></bbva-form-date>
    `}_launchCalendar(){this._firstItemInteraction(this.interaction.BIRTHDAY_INTERACTION),me(this,"digital-account-open-date-picker",{pluginFormat:"yyyy-MM-dd",defaultDate:(new Date).toISOString().split("T")[0]})}get _birthPlaceSelectTemplate(){return f`
      <bbva-form-select
        id="birthPlace"
        required
        ambient="primary-alt"
        label=${this.t("open-digital-account-multistep-step-one-form-birthplace-label")}
        value=${this._birthPlaceId}
        @click=${()=>this._firstItemInteraction(this.interaction.BIRTHPLACE_INTERACTION)}
        @bbva-form-select-selected-item=${this._handleInputValueUpdate}
        @form-field-input-blur=${this._handleInputValueUpdate}
      >
        ${this._entityOptionsTemplate}
      </bbva-form-select>
    `}get _entityOptionsTemplate(){return 0===this.listEntity.length?"":this.listEntity.map((({id:t,entity:e})=>f`
        <bbva-form-option value=${t}>${e}</bbva-form-option>
      `))}get _genderRadioGroupTemplate(){return f`
      <bbva-form-radio-group
        id="gender"
        class="genderSelect"
        required
        ambient="primary-alt"
        label-out=${this.t("open-digital-account-multistep-step-one-form-gender-group")}
        info-message=${this.t("open-digital-account-multistep-step-one-form-gender-info")}
        selected=${this._gender.sel}
        two-option=${I(this.isNonBinaryGenderEnabled?void 0:"")}
        @form-radio-group-item-change=${this._handleGenderRadioSelection}
      >
        ${this._genderRadiosTemplate}
      </bbva-form-radio-group>
    `}_handleGenderRadioSelection(t){var e;const i=t.detail.value;this._updateGenderSelection(i);const a=`${i.replace("_","")}GENDER_INTERACTION`;this._firstItemInteraction(null===(e=this.interaction)||void 0===e?void 0:e[a])}_updateGenderSelection(t){if(!t)return;const e=this.genderOptions.find((e=>this.t(e.value)===t.toUpperCase()));e&&(this._gender={id:this.t(e.value),sel:e.selector})}get _genderRadiosTemplate(){return this.genderOptions.map((({value:t,label:e})=>f`
        <bbva-form-radio-button value=${this.t(t)}>${this.t(e)}</bbva-form-radio-button>
      `))}get _nonBinaryNotificationTemplate(){return f`
      <bbva-notification-message
        id="nonBinaryNotification"
        variant="caution">
          ${this.t("open-digital-account-multistep-step-one-notification-message-non-binary")}
      </bbva-notification-message>
    `}get _ocrInputTemplate(){const t="open-digital-account-multistep-step-one-form-identification-number-info";return f`
      <bbva-header-category
        id="headerIdentification"
        has-help
        text=${this.t("open-digital-account-multistep-step-one-identification-header-title")}
        @header-category-help-click=${this._openOrCloseIdentificationModal}
      ></bbva-header-category>

      <bbva-form-number
        id="idNumber"
        required
        ambient="primary-alt"
        clear-icon="${Be}"
        label=${this.t("open-digital-account-multistep-step-one-form-identification-number")}
        value=${this._ocr}
        error-message=${this.t(t)}
        info-message=${this.t(t)}
        pattern="[0-9]{9}"
        maxlength="9"
        allowed-pattern="[0-9]"
        @click=${()=>this._firstItemInteraction(this.interaction.NUMBERID_INTERACTION)}
        @keyup=${this._handleOnChangeOcr}
      ></bbva-form-number>
    `}get _consentNotificationTemplate(){return f`
      <bbva-notification-message>
        ${this.t("open-digital-account-multistep-step-one-notification-message")}
      </bbva-notification-message>
    `}get _errorNotificationTemeplate(){return f`
      <bbva-notification-message
      variant="error"
      icon-close=""
      class="marginnError"
      message-title=${this.t("open-digital-account-multistep-step-one-notification-error-message")}
      >
    `}get _continueButtonTemplate(){return f`
      <div class="action-buttons">
        <bbva-button-default
          id="personalDataContinueBtn"
          variant="primary"
          fullwidth=""
          optional-label=""
          text=${this.t("open-digital-account-modal-signature-input-button-continue")}
          @click=${this._sendPersonalData}
        ></bbva-button-default>
      </div>
    `}_sendPersonalData(){const t=""!==this._name,e=""!==this._lastName,i=""!==this._secondLastName,a=this._isAdult,s=""!==this._birthPlaceId,o=""!==this._gender.id,r=9===this._ocr.length,n=!(t&&e&&i&&a&&s&&o&&r),l={name:this._name.toUpperCase(),lastName:this._lastName.toUpperCase(),secondLastName:this._secondLastName.toUpperCase(),birthDate:this.birthDate,birthPlace:this._birthPlace,birthPlaceId:this._birthPlaceId,gender:this._gender,ocr:this._ocr},d={name:this._name,lastName:this._lastName,secondLastName:this._secondLastName,birthDate:this.birthDate,gender:this._gender.id,birthPlace:this._birthPlace,idNumber:this._ocr};n?this.validateScroll(d):me(this,"tmp-user-data",l)}get _isNonBinaryGenderSelected(){const t=this.t("open-digital-account-multistep-step-one-form-gender-non-binary-value");return this._gender.id===t}render(){return f`
      <div class="content">
        ${this._intelligentScanTemplate}

        ${this.verifyDataFlag?this._verifyDataTextTemplate:""}

        ${this._writtenDataReview}

        ${this._nameInputTemplate}
        ${this._lastNameInputTemplate}
        ${this._secondLastNameInputTemplate}
        ${this._birthDateInputTemplate}
        ${this._birthPlaceSelectTemplate}
        ${this.verifyDataError?this._errorNotificationTemeplate:""}
        ${this._genderRadioGroupTemplate} 
        ${this._isNonBinaryGenderSelected?this._nonBinaryNotificationTemplate:""}
        ${this._ocrInputTemplate}

        ${this._consentNotificationTemplate}

        ${this._continueButtonTemplate}
      </div>
    `}get _inputName(){return this.shadowRoot.querySelector("#name")}get _inputOcr(){return this.shadowRoot.querySelector("#idNumber")}_inputNameGeneric(t){return this.shadowRoot.querySelector(`#${t}`)}messageError(t){this._inputNameGeneric(t).setAttribute("invalid",""),this._inputNameGeneric(t).setAttribute("error-message",this.t("open-digital-account-multistep-step-two-address-required-field"))}validateScroll(t){let e=0;for(const i of Object.keys(t))t[i]||(e+=1,this.messageError(i),1===e&&this._inputNameGeneric(i).scrollIntoView({behavior:"smooth",block:"start",inline:"center"}))}}var ze=t`[ambient^=light] {
  --bbva-list-file-alert-text-color: initial;
  --bbva-list-file-file-size-color: initial;
  --bbva-list-file-skeleton-quote-color: initial;
  --bbva-list-file-skeleton-animated-layer-bg: initial;
}
${(new r).mediaRules()}`;const je=new r;var Ue=t`[ambient^=dark] {
  --bbva-list-file-alert-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-file-file-size-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-file-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
  --bbva-list-file-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${e(n.primaryCore)});
}
${je.mediaRules()}`;const Ge={light:t`
    ${ze}
    ${z.light}
    ${d.light}
    ${j.light}
    ${Ie.light}
  `,dark:t`
    ${Ue}
    ${z.dark}
    ${d.dark}
    ${j.dark}
    ${Ie.dark}
  `},Xe=new r;var We=t`:host {
  --bbva-notification-help-text-color-alert: var(--bbva-list-file-alert-text-color,var(--colorsSecondary500, ${e(n.secondary500)}));
  --bbva-form-checkbox-label-gap: 0;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  display: flex;
  justify-content: space-between;
  flex-direction: column;
  box-sizing: border-box;
  width: 100%;
  --_list-file-file-size-color: var(--bbva-list-file-file-size-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  --_list-file-skeleton-quote-color: var(--bbva-list-file-skeleton-quote-color, var(--colorsSecondary200, ${e(n.secondary200)}));
  --_list-file-skeleton-quote-bg: var(--bbva-list-file-skeleton-bg, transparent);
  --_list-file-skeleton-animated-layer-bg: var(--bbva-list-file-skeleton-animated-layer-bg, var(--ambientsLight, ${e(U.light)}));
}

:host([hidden]),
[hidden] {
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

.box-container {
  display: flex;
  justify-content: space-between;
  align-items: top;
}

.main {
  display: flex;
  flex-direction: column;
  flex-grow: 1;
}

.content {
  display: flex;
  justify-content: start;
}

.file-size {
  margin: 0;
  margin-left: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(s.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(s.bookItalic.fontStyle)});
  color: var(--_list-file-file-size-color);
}

[data-tag-name=bbva-text] {
  margin-left: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  color: var(--_list-file-file-size-color);
}

.link {
  align-items: flex-start;
  text-align: left;
}

.spinner {
  --bbva-spinner-size: 32px;
}

.checkbox {
  justify-content: center;
  padding-right: 0;
  margin-top: calc(((-1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

.help {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 4rem;
  width: 100%;
  background-image: linear-gradient(var(--_list-file-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-file-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-file-skeleton-quote-color) 50%);
  background-color: var(--_list-file-skeleton-quote-bg);
  background-size: 24px 24px, calc((100px * 2) + (16px/ 2)) 16px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 15px 16px, 55px 16px, 55px 48px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 4rem;
  background: var(--_list-file-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
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
${Xe.mediaRules()}`;class Je extends(h(A(b))){static get is(){return"bbva-list-file"}static get scopedElements(){return{"bbva-link":g,"bbva-text":m,"bbva-notification-help":Pe,"bbva-form-checkbox":G,"bbva-spinner":X,"bbva-badge-default":W}}static get properties(){return{icon:{type:String},iconAccesibilityText:{type:String,attribute:"icon-accesibility-text"},hrefLink:{type:String,attribute:"href-link"},fileName:{type:String,attribute:"file-name"},infoMessage:{type:String,attribute:"info-message"},errorMessage:{type:String,attribute:"error-message"},fileSize:{type:String,attribute:"file-size"},subtitles:{type:Array},checkbox:{type:Boolean},checked:{type:Boolean},status:{type:String},spinnerAccesibilityText:{type:String,attribute:"spinner-accesibility-text"},withMask:{type:Boolean,attribute:"with-mask"},value:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.icon=J(),this.iconInfo=q(),this.iconError=M(),this.subtitles=[],this.openText="bbva-list-file-open-text",this.errorText="bbva-list-file-error-text",this.spinnerAccesibilityText="bbva-list-file-spinner-accesibility",this.withMask=!0,this.value="",this.loading=!1}static get styles(){return[We,v("bbva-list-file-shared-styles"),Ge.dark,Ge.light]}get _loading(){return f`
      <span class="sr-only">${this.t(this.spinnerAccesibilityText)}</span>
      <bbva-spinner class="spinner" ?with-mask="${this.withMask}"></bbva-spinner>
    `}get _open(){return f` <bbva-badge-default text="${this.t(this.openText)}"></bbva-badge-default> `}get _error(){return f`
      <bbva-badge-default text="${this.t(this.errorText)}" type="error"></bbva-badge-default>
    `}get _subtitles(){return this.subtitles&&f`
        ${this.subtitles.map((t=>f`
            <bbva-text
              tag="span"
              size="S"
              ellipsis
              lines="1"
              alignment="left"
              .text=${t}
            ></bbva-text>
          `))}
      `}get _errorMessage(){return this.errorMessage&&f`
        <div class="help">
          <bbva-notification-help
            id="messageError"
            class="notification alert"
            role="alert"
            .icon="${this.iconError}"
            .text="${this.errorMessage}"
          ></bbva-notification-help>
        </div>
      `}get _infoMessage(){return this.infoMessage&&f`
        <div class="help">
          <bbva-notification-help
            id="messageInfo"
            class="notification"
            .icon="${this.iconInfo}"
            .text="${this.infoMessage}"
          ></bbva-notification-help>
        </div>
      `}render(){return this._fileStatus={loading:this._loading,open:this._open,error:this._error},f`${this.loading?f`<div class="skeleton"></div>`:f`
          <div class="box-container">
            <div class="main">
              <div class="content">
                <span class="sr-only">${this.iconAccesibilityText}</span>
                <bbva-link
                  class="link"
                  .href="${this.hrefLink}"
                  @click="${this.fileClicked}"
                  .icon="${this.icon}"
                  icon-size="24"
                >
                  <span> ${this.fileName} </span>
                </bbva-link>
              </div>
              ${this.fileSize?f` <span class="file-size">${this.fileSize}</span> `:""}
              ${this._subtitles}
            </div>
            ${this.checkbox?f`
                  <div>
                    <bbva-form-checkbox
                      class="checkbox"
                      not-form
                      .value="${this.value}"
                      ?checked="${this.checked}"
                      .label="${this.fileName}"
                      hide-label
                      @change="${this._oncheckboxChange}"
                    ></bbva-form-checkbox>
                  </div>
                `:""}
            ${this.status?this._fileStatus[this.status]:""}
          </div>
          ${this._infoMessage} ${this._errorMessage}
        `}`}fileClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("list-file-link-click",{detail:t.detail,composed:!0,bubbles:!0}))}_oncheckboxChange(t){this.checked=t.target.checked,t.stopPropagation(),this.dispatchEvent(new CustomEvent("list-file-checkbox-change",{detail:t.target.checked,composed:!0,bubbles:!0}))}}customElements.define(Je.is,Je);const Ke=`${F()}`;class Ye extends(pt(A(b))){static get is(){return"bbva-multistep-digital-account-contact-data"}static get scopedElements(){return{"bbva-expandable-step":Tt,"bbva-type-text":bt,"bbva-form-number":Vt,"bbva-form-text":Bt,"bbva-list-file":Je,"bbva-form-checkbox":G,"bbva-notification-message":vt,"bbva-button-default":ut}}static get properties(){return{isContinueDisabled:{type:Boolean},phoneNumber:{type:String},emailAddress:{type:String},emailAddressConfirmation:{type:String},isPrivacyNoticeAcceptance:{type:Boolean},disabledFields:{type:Boolean},patternPhoneNumber:{type:String},maxLengthPhoneNumber:{type:Number},bureauEnabled:{type:Boolean}}}constructor(){super(),this.isContinueDisabled=!0,this.phoneNumber="",this.emailAddress="",this.emailAddressConfirmation="",this.isPrivacyNoticeAcceptance=!1,this.disabledFields=!1,this.patternPhoneNumber="[0-9]{10}",this.maxLengthPhoneNumber=10,this.bureauEnabled=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
      <div class="content">
        <bbva-type-text ?disabled=${this.disabledFields} text=${this.t("open-digital-account-multistep-step-three-description")}></bbva-type-text>
       <bbva-form-number 
          id="phoneNumber" 
          required
          label=${this.t("open-digital-account-multistep-step-three-form-phone-number-label")}
          optional-label=""
          ambient="primary-alt"
          pattern=${this.patternPhoneNumber}
          clear-icon="${Ke}"
          maxlength="${this.maxLengthPhoneNumber}"
          value=${this.phoneNumber}
          @keyup=${this._handleOnChangePhoneNumber}
          ?disabled=${this.disabledFields}
        ></bbva-form-number>
        <bbva-form-text 
          id="emailAddress"
          required
          optional-label=""
          ambient="primary-alt"
          label=${this.t("open-digital-account-multistep-step-three-form-email-address")} 
          info-message=${this.t("open-digital-account-multistep-step-three-form-email-info")}
          value=${this.emailAddress}
          clear-icon="${Ke}"
          @keyup=${this._handleOnChangeEmailAddress}
          @paste=${this._removeDefaultEvent}
          @contextmenu=${this._removeDefaultEvent}
          @form-field-input-clear=${this._handleOnChangeEmailAddress}
          ?disabled=${this.disabledFields}
        ></bbva-form-text>
         <bbva-form-text 
          id="emailAddressConfirmation" 
          required
          optional-label=""
          ambient="primary-alt"
          clear-icon="${Ke}"
          label=${this.t("open-digital-account-multistep-step-three-form-email-address-confirm")}
          value=${this.emailAddressConfirmation}
          @keyup=${this._handleOnChangeEmailAddressConfirmation}
          @paste=${this._removeDefaultEvent}
          @contextmenu=${this._removeDefaultEvent}
          @form-field-input-clear=${this._handleOnChangeEmailAddressConfirmation}
          disabled
        ></bbva-form-text>
        <bbva-list-file 
          id="privacyNoticeLink"
          icon=${K()} 
          file-name=${this.t("open-digital-account-multistep-step-three-noticy-privacity-pdf")}
          @list-file-link-click=${this.handlePrivacyModal}
          ?loading=${this.disabledFields}
        ></bbva-list-file>
       <bbva-form-checkbox 
          id="privacyNoticeAcceptance"
          label=${this.t("open-digital-account-multistep-step-three-checkbox-noticy-privacity")}
          @change=${this._handleOnCheckbox}
          optional-label=" "
          ambient="primary-alt"
          ?disabled=${this.disabledFields}>
        </bbva-form-checkbox>
        <bbva-notification-message  ?disabled=${this.disabledFields} >
          ${this.t("open-digital-account-multistep-step-three-notification-message")}
        </bbva-notification-message>
        <div class="action-buttons">
          <bbva-button-default 
            text=${this.t("open-digital-account-multistep-step-generic-button-continue")} 
            variant="primary"
            fullwidth=""
            ?disabled=${this.isContinueDisabled}
            id="contactDataContinue"
            @click=${this._handleCompleteStep}
          ></bbva-button-default>
        </div>
      </div>
    `}get _inputPhoneNumber(){return this.shadowRoot.querySelector("#phoneNumber")}get _inputEmailAddress(){return this.shadowRoot.querySelector("#emailAddress")}get _inputEmailAddressConfirmation(){return this.shadowRoot.querySelector("#emailAddressConfirmation")}_removeDefaultEvent(t){t.preventDefault(this)}handlePrivacyModal(){me(this,"handle-privacy-notice-modal")}_handleOnChangePhoneNumber(t){const{value:e}=t.target;this.phoneNumber=e,this.phoneNumber.length<10&&this.phoneNumber.length>0?(this._inputPhoneNumber.removeAttribute("info-message"),this._inputPhoneNumber.setAttribute("invalid",""),this._inputPhoneNumber.setAttribute("error-message",this.t("open-digital-account-multistep-step-three-form-phone-number-label-incorrect-format"))):(this._inputPhoneNumber.removeAttribute("invalid"),this._inputPhoneNumber.removeAttribute("error-message")),this.requestUpdate(),this.validateContactDataStep()}_handleOnChangeEmailAddress(t){const{value:e}=t.target;this.emailAddress=e;!/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|.(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(this.emailAddress)&&this.emailAddress.length>=0?(this._inputEmailAddress.removeAttribute("info-message"),this._inputEmailAddress.setAttribute("invalid"),this._inputEmailAddress.setAttribute("error-message",this.t("open-digital-account-multistep-step-three-form-email-address-incorrect-format")),this._inputEmailAddressConfirmation.setAttribute("disabled","")):(this._inputEmailAddress.removeAttribute("error-message"),this._inputEmailAddress.removeAttribute("invalid"),this._inputEmailAddress.setAttribute("info-message",this.t("open-digital-account-multistep-step-three-form-email-info")),this._inputEmailAddressConfirmation.removeAttribute("disabled"),this._handleOnChangeEmailAddressConfirmation({target:{value:this._inputEmailAddressConfirmation.value}})),this.requestUpdate(),this.validateContactDataStep()}_handleOnChangeEmailAddressConfirmation(t){const{value:e}=t.target;this.emailAddressConfirmation=e,this.emailAddress!==this.emailAddressConfirmation?(this._inputEmailAddressConfirmation.setAttribute("error-message",this.t("open-digital-account-multistep-step-three-form-email-address-confirm-not-match")),this._inputEmailAddressConfirmation.setAttribute("invalid")):(this._inputEmailAddressConfirmation.removeAttribute("invalid"),this._inputEmailAddressConfirmation.removeAttribute("error-message")),this.requestUpdate(),this.validateContactDataStep()}_handleOnCheckbox(){const t=this.shadowRoot.querySelector("#privacyNoticeAcceptance");t.hasAttribute("checked")?this.isPrivacyNoticeAcceptance=!1:(t.setAttribute("checked",""),this.isPrivacyNoticeAcceptance=!0),this.validateContactDataStep()}validateContactDataStep(){const t=10===this.phoneNumber.length,e=""!==this.emailAddress,i=this.emailAddressConfirmation===this.emailAddress,a=!0===this.isPrivacyNoticeAcceptance,s=t&&e&&a&&i;this.isContinueDisabled=!s}_handleCompleteStep(){me(this,"customer-contact-data",{phoneNumber:this.phoneNumber,emailAddress:this.emailAddress,privacyNoticeAcceptance:this.isPrivacyNoticeAcceptance}),me(this,"request-create-customer"),this.bureauEnabled&&me(this,"bureau-consultation",{checked:!1})}completeStep(){me(this,"complete")}reset(){this.isContinueDisabled=!0,this.phoneNumber="",this.emailAddress="",this.emailAddressConfirmation="",this.isPrivacyNoticeAcceptance=!1,this.disabledFields=!1,this.bureauEnabled=!1,this._inputEmailAddressConfirmation.setAttribute("disabled","");this.shadowRoot.querySelector("#privacyNoticeAcceptance").checked=!1}}var Qe=t`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(s.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${e(a.typeLarge)});
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
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
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
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
`,Ze=t`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,ti=t`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${e(n.primaryMedium)});
}
`;const ei={light:t`
    ${d.light}
    ${Ze}
  `,dark:t`
    ${d.dark}
    ${ti}
  `};class ii extends(p(h(C(A(b))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":Y,"bbva-link":g,"bbva-text":m}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=Q,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[Qe,super.styles,v("bbva-panel-info-shared-styles"),ei.light,ei.dark]}get _contentImage(){return this.image?f` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:f`
      <span
        class="${y({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===Q}render(){return f`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&f`
          <bbva-text
            tabindex="0"
            class="title ${y({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${I(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&f`
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
        ${f` <slot></slot> `}
        ${this.linkText&&f`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(ii.is,ii);class ai extends(pt(A(b))){static get is(){return"bbva-multistep-digital-account-contracts"}static get scopedElements(){return{"bbva-expandable-step":Tt,"bbva-type-text":bt,"bbva-type-link":mt,"bbva-form-checkbox":G,"bbva-button-default":ut,"bbva-notification-message":vt,"bbva-panel-info":ii}}static get properties(){return{isSigned:{type:Boolean},sign:{type:String},isContinueDisabled:{type:Boolean},isBasicDigitalAccountAccepted:{Boolean:Boolean},isSingleDigitalContractAccepted:{Boolean:Boolean},bureauEnabled:{type:Boolean},_isBureauConsultationAccepted:{type:Boolean},_isInformationNoticeAccepted:{type:Boolean},isLoadingFiles:{type:Boolean},transversalFlag:{type:Boolean}}}constructor(){super(),this.isSigned=!1,this.sign="",this.isContinueDisabled=!0,this.isBasicDigitalAccountAccepted=!1,this.isSingleDigitalContractAccepted=!1,this.bureauEnabled=!1,this._isBureauConsultationAccepted=!1,this._isInformationNoticeAccepted=!1,this.transversalFlag=!1}reset(){["basicDigitalAccount","singleDigitalContract","bureauConsultation","informationNotice"].forEach((t=>{const e=this.shadowRoot.querySelector(`#${t}`);e&&(e.checked=!1)})),this.isSigned=!1,this.sign="",this._isBureauConsultationAccepted=!1,this._isInformationNoticeAccepted=!1,this.isLoadingFiles=!1,this.isContinueDisabled=!0}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
      <div class="content">
        <bbva-type-text
          ?disabled=${this.isLoadingFiles}
          text=${this.t("open-digital-account-multistep-step-four-description")}
        ></bbva-type-text>
        <bbva-type-link
          ?disabled=${this.isLoadingFiles}
          id="fileBasicDigitalAccount"
          icon="${K()}"
          icon-size="24"
          ?hidden=${this.transversalFlag}
          @click=${this.onButtonClickBasicDigitalAccount}>
            <span>${this.t("open-digital-account-multistep-step-four-terms-and-conditions-basic-digital-account-pdf")}</span>
        </bbva-type-link>
        <bbva-form-checkbox
          id="basicDigitalAccount"
          ?hidden=${this.transversalFlag}
          label=${this.t("open-digital-account-multistep-step-four-terms-and-conditions-basic-digital-account-checkbox")}
          @change=${this._handleOnBasicDigitalAccount}
          optional-label=" "
          required
          ?disabled=${this.isLoadingFiles}>
        </bbva-form-checkbox>
        <bbva-type-link
          ?disabled=${this.isLoadingFiles}
          id="fileSingleDigitalContract"
          icon="${K()}"
          @click=${this.onButtonClickSingleDigitalContract}>
            <span>${this.t("open-digital-account-multistep-step-four-terms-and-conditions-single-digital-contract-pdf")}</span>
        </bbva-type-link>
        <bbva-form-checkbox
          id="singleDigitalContract"
          label=${this.t("open-digital-account-multistep-step-four-terms-and-conditions-single-digital-contract-checkbox")}
          @change=${this._handleOnSingleDigitalContract}
          optional-label=" "
          required
          ?disabled=${this.isLoadingFiles}>
        </bbva-form-checkbox>
        <hr divider="fit" ?hidden=${this.transversalFlag} />
        ${this.bureauEnabled?f`
            <bbva-list-file
              ?disabled=${this.isLoadingFiles}
              id="linkCreditBureau"
              ?hidden=${this.transversalFlag}
              icon="${J()}"
              @click=${this.handleModalInquiryAuthorization}>
                <span>${this.t("open-digital-account-multistep-step-four-creadit-bureau-pdf")}</span>
            </bbva-list-file>
            <bbva-form-checkbox
              ?disabled=${this.isLoadingFiles}
              id="bureauConsultation"
              ?hidden=${this.transversalFlag}
              optional-label=" "
              name="Autorizacion"
              label=${this.t("open-digital-account-multistep-step-four-creadit-bureau-checkbox")}
              @change=${this._handleOnBureauConsultation}
              info-message=${this.t("open-digital-account-multistep-step-four-notification-message-optional-permit")}
              ></bbva-form-checkbox>
          `:""}
          <bbva-list-file
            ?loading=${this.isLoadingFiles}
            id="offersAndPromosItem"
            icon="${J()}"
            ?hidden=${this.transversalFlag}
            file-name=${this.t("open-digital-account-multistep-step-four-offers-and-promotions-pdf")}
            @list-file-link-click=${this.handleModalOffersAndPromos}>
          </bbva-list-file>
          <bbva-form-checkbox
            id="informationNotice"
            optional-label=" "
            name="promotions"
            ?hidden=${this.transversalFlag}
            label=${this.t("open-digital-account-multistep-step-four-offers-and-promotions-acceptance-checkbox")}
            @change=${this._handleOnInformationNotice}
            info-message=${this.isLoadingFiles?"":this.t("open-digital-account-multistep-step-four-notification-message-optional-permit")}
            ?disabled=${this.isLoadingFiles}>
          </bbva-form-checkbox>
        ${this._signatureElement}
        <bbva-notification-message ?hidden=${this.transversalFlag} ?disabled=${this.isLoadingFiles}>
          <span ?disabled=${this.isLoadingFiles}>
            ${this.t("open-digital-account-multistep-step-four-sign-panel-text-modify-paragraph")}
          </span>
        </bbva-notification-message>

        <div class="action-buttons">
          <bbva-button-default
            id="contractsContinue"
            text=${this.t("open-digital-account-multistep-step-generic-button-continue")}
            variant="primary"
            fullwidth=""
            ?disabled=${this.isContinueDisabled}
            @click=${this._handleCompleteStep}
          ></bbva-button-default>
        </div>
      </div>
    `}onButtonClickBasicDigitalAccount(){me(this,"request-basic-digital-account")}onButtonClickSingleDigitalContract(){me(this,"request-single-digital-contract"),me(this,"send-analytic-enter-sign")}_handleCompleteStep(){this._generateSignatureFile(),me(this,"send-signature")}completeStep(){me(this,"complete")}handleModalInquiryAuthorization(){me(this,"handle-modal-bureau")}handleModalOffersAndPromos(){me(this,"handle-modal-offers-and-promos")}signaturePadEvent(){me(this,"signature-pad-event",this)}_generateSignatureFile(){ai.urltoFile(this.sign,"signature.png").then((t=>{me(this,"customer-contracts-data",{signatureByteFile:t})}))}static urltoFile(t,e,i){const a=i||(t.match(/^data:([^;]+);/)||"")[1];return fetch(t).then((t=>t.arrayBuffer())).then((t=>new File([t],e,{type:a})))}get _signatureElement(){return this.isSigned?(this._validateContractsStep(),f`
        <bbva-panel-info
          class="signaturePanel signature-preview"
          image=${this.sign}
          text=${this.t("open-digital-account-multistep-step-four-sign-panel-text-assigned-signature")}
          link-text=${this.t("open-digital-account-multistep-step-four-sign-panel-text-modify-signature")}
          @panel-info-link-click=${this.signaturePadEvent}
        ></bbva-panel-info>
      `):f`
      ${this.isLoadingFiles?"":f`
            <bbva-panel-info
              class="signaturePanel"
              .microillustration=${Z}
              link-text=${this.t("open-digital-account-multistep-step-four-sign-panel-text")}
              @panel-info-link-click=${this.signaturePadEvent}
            ></bbva-panel-info>
          `}
    `}_handleOnBasicDigitalAccount(t){this.isBasicDigitalAccountAccepted=t.target.checked,this._validateContractsStep()}_handleOnSingleDigitalContract(t){this.isSingleDigitalContractAccepted=t.target.checked,this._validateContractsStep()}_handleOnBureauConsultation(){const t=this.shadowRoot.querySelector("#bureauConsultation");t.hasAttribute("checked")?this._isBureauConsultationAccepted=!1:(t.setAttribute("checked",""),this._isBureauConsultationAccepted=!0),me(this,"bureau-consultation",{checked:this._isBureauConsultationAccepted})}_handleOnInformationNotice(){const t=this.shadowRoot.querySelector("#informationNotice");t.hasAttribute("checked")?this._isInformationNoticeAccepted=!1:(t.setAttribute("checked",""),this._isInformationNoticeAccepted=!0),me(this,"information-notice",{checked:this._isInformationNoticeAccepted})}_validateContractsStep(){const t=!!this.isBasicDigitalAccountAccepted,e=!!this.isSingleDigitalContractAccepted,i=e,a=!!this.isSigned&&(e&&t),s=this.transversalFlag&&i;this.isContinueDisabled=!(a||s)}}const si=`${F()}`,oi=pt(A(b));class ri extends oi{static get is(){return"bbva-multistep-digital-account-actual-address"}static get scopedElements(){return{"bbva-expandable-step":Tt,"bbva-type-text":bt,"bbva-form-text":Bt,"bbva-form-number":Vt,"bbva-form-select":Ft,"bbva-form-option":zt,"bbva-list-simple":be,"bbva-button-default":ut}}static get properties(){return{street:{type:String},externalNumber:{type:String},internalNumber:{type:String},postalCode:{type:String},colonyID:{type:String},colonySelectionData:{type:Object,attribute:!1},listPlaces:{type:Array},disabledFields:{type:Boolean},ocrData:{type:Object},stepData:{type:Boolean},_validatedPostalCode:{type:String,attribute:!1},_invalidPostalCodeSequences:{type:Array,attribute:!1}}}constructor(){super(),this.street="",this.externalNumber="",this.internalNumber="",this.postalCode="",this.colonyID="",this.colonySelectionData={colony:"",municipality:"",state:"",stateId:""},this.listPlaces=[],this.disabledFields=!1,this.ocrData={},this.stepData=!1,this._validatedPostalCode="",this._invalidPostalCodeSequences=["00000"],this._hasReached5DigitsOnce=!1,this._listPlacesCopy=[]}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}updated(t){super.updated(t),t.has("stepData")&&this.setOcrData(this.stepData),t.has("postalCode")&&this._processNewPostalCode(),t.has("listPlaces")&&this._thereAreColoniesToRender&&this.enablePostalCodeInput()}setOcrData(t){var e,i,a,s;t&&(this.street=(null===(e=this.ocrData)||void 0===e?void 0:e.gf_road_name)||"",this.externalNumber=(null===(i=this.ocrData)||void 0===i?void 0:i.gf_street_number)||"",this.internalNumber=(null===(a=this.ocrData)||void 0===a?void 0:a.gf_address_indoor_number)||"",this.postalCode=(null===(s=this.ocrData)||void 0===s?void 0:s.gf_zipcode_id)||"",this._newPostalCodeToRequest())}_processNewPostalCode(){this._isValidPostalCodeLength&&(this._hasReached5DigitsOnce=!0),this._isValidPostalCode?this._validPostalCodeActions():this._invalidPostalCodeActions(),this.colonyID=""}setInvalidPostalCodeState(){this._invalidPostalCodeSequences.push(this.postalCode),this._setInvalidPCInputState("not-exists"),this._listPlacesCopy=[],this.enablePostalCodeInput()}enablePostalCodeInput(){this._postalCodeInputElement.disabled=!1}reset(){this.street="",this.externalNumber="",this.internalNumber="",this.postalCode="",this.colonyID="",this._resetColonySelectionData(),this.listPlaces=[],this._listPlacesCopy=[],this._hasReached5DigitsOnce=!1,this._validatedPostalCode="",this._resetInputStates()}_resetColonySelectionData(){this.colonySelectionData={colony:"",municipality:"",state:"",stateId:""}}_resetInputStates(){["street","externalNumber","internalNumber","zipCode"].forEach((t=>{const e=this.shadowRoot.querySelector(`#${t}`);e.clearInput(),e.updateComplete.then((()=>{e.invalid=!1}))}))}completeStep(){me(this,"complete")}get _streetInputElement(){return this.shadowRoot.querySelector("#street")}get _externalNumberInputElement(){return this.shadowRoot.querySelector("#externalNumber")}get _internalNumberInputElement(){return this.shadowRoot.querySelector("#internalNumber")}get _postalCodeInputElement(){return this.shadowRoot.querySelector("#zipCode")}get _colonySelectElement(){return this.shadowRoot.querySelector("#colonies")}get _continueButtonElement(){return this.shadowRoot.querySelector("#continue")}async _setInvalidPCInputState(t){await this._postalCodeInputElement.updateComplete;const e="open-digital-account-multistep-step-two-form-",i={"not-exists":`${e}no-valid-postal-code-label`,"invalid-sequence":`${e}no-valid-postal-code-label`,"invalid-length":`${e}incomplete-postal-code-label`,default:""},a=i[t]??i.default;this._postalCodeInputElement.errorMessage=this.t(a),this._postalCodeInputElement.invalid=!0}_validPostalCodeActions(){this._validatedPCIsTheSameAsTheInputOne?this._restablishListPlaces():this._resetPostalCodeFormState()}get _validatedPCIsTheSameAsTheInputOne(){return this._validatedPostalCode===this.postalCode}_restablishListPlaces(){this._listPlacesCopy.length>0&&(this.listPlaces=[...this._listPlacesCopy]),this._listPlacesCopy=[]}_resetPostalCodeFormState(){this.listPlaces=[],this._resetColonySelectionData()}_invalidPostalCodeActions(){this._resetListPlacesAndCreateCopy(),this._updatePCInputInvalidState(),this._resetColonySelectionData()}_resetListPlacesAndCreateCopy(){0===this._listPlacesCopy.length&&(this._listPlacesCopy=[...this.listPlaces]),this.listPlaces=[]}_updatePCInputInvalidState(){if(!this._isValidPostalCodeLength&&this._hasReached5DigitsOnce)return void this._setInvalidPCInputState("invalid-length");!this._isValidPostalCodeSequence&&this._setInvalidPCInputState("invalid-sequence")}get _isValidPostalCode(){return this._isValidPostalCodeLength&&this._isValidPostalCodeSequence}get _isValidPostalCodeLength(){return 5===this.postalCode.length}get _isValidPostalCodeSequence(){return!this._invalidPostalCodeSequences.includes(this.postalCode)}_handleInputValueUpdate(t){const{id:e,value:i}=t.target,a={zipCode:"postalCode",street:"street",externalNumber:"externalNumber",internalNumber:"internalNumber"}[e];a&&(this[a]=i)}get _streetFormTextTemplate(){return f`
      <bbva-form-text
        required
        ambient="primary-alt"
        clear-icon="${si}"
        ?disabled=${this.disabledFields}
        error-message=${this.t("open-digital-account-multistep-step-two-address-required-field")}
        value=${this.street}
        id="street"
        label=${this.t("open-digital-account-multistep-step-two-form-street-label")}
        @form-field-input-blur=${this._handleInputValueUpdate}
      ></bbva-form-text>
    `}get _externalNumberFormTextTemplate(){return f`
      <bbva-form-text
        required
        ambient="primary-alt"
        clear-icon="${si}"
        ?disabled=${this.disabledFields}
        error-message=${this.t("open-digital-account-multistep-step-two-address-required-field")}
        id="externalNumber"
        value=${this.externalNumber}
        label=${this.t("open-digital-account-multistep-step-two-form-external-number-label")}
        @form-field-input-blur=${this._handleInputValueUpdate}
      ></bbva-form-text>
    `}get _internalNumberFormTextTemplate(){return f`
      <bbva-form-text
        id="internalNumber"
        ambient="primary-alt"
        clear-icon="${si}"
        ?disabled=${this.disabledFields}
        value=${this.internalNumber}
        optional-label=${this.t("bbva-form-field-optional-label")}
        label=${this.t("open-digital-account-multistep-step-two-form-internal-number-label")}
        @form-field-input-blur=${this._handleInputValueUpdate}
      ></bbva-form-text>
    `}get _postalCodeFormNumberTemplate(){return f`
      <bbva-form-number
        required
        ?disabled=${this.disabledFields}
        id="zipCode"
        ambient="primary-alt"
        clear-icon="${si}"
        value=${this.postalCode}
        label=${this.t("open-digital-account-multistep-step-two-form-postal-code-label")}
        allowed-pattern="[0-9]"
        minlength="5"
        maxlength="5"
        @input=${this._handleInputValueUpdate}
        @form-field-input-blur=${this._handlePostalCodeInputBlur}
      ></bbva-form-number>
    `}_handlePostalCodeInputBlur(t){this.postalCode=t.target.value,this.postalCode.length<5&&this._setInvalidPCInputState("invalid-length"),this._newPostalCodeToRequest()}_newPostalCodeToRequest(){const t=!this._isValidPostalCode,e=this._validatedPCIsTheSameAsTheInputOne;t||e||(this._validatedPostalCode=this.postalCode,me(this,"get-postal-code",this.postalCode),this._postalCodeInputElement.disabled=!0)}get _coloniesFormSelectTemplate(){return this._thereAreColoniesToRender?f`
        <bbva-form-select
          required
          id="colonies"
          ambient="primary-alt"
          label=${this.t("open-digital-account-multistep-step-two-form-colony-label")}
          @bbva-form-select-selected-item=${this._handleColonySelection}
        >
          ${this._colonyFormOptionsTemplate}
        </bbva-form-select>

        ${this._colonySelectionDetailsTemplate}
      `:""}get _thereAreColoniesToRender(){return this.listPlaces.length>0}_handleColonySelection(t){this.colonyID=t.target.value;const e=this._getColonyDataSelection();this.colonySelectionData={colony:e.name,municipality:e.municipality,stateId:e.idState,state:e.state},this._callValidateOnRequiredInputs()}_getColonyDataSelection(){var t;return null===(t=this.listPlaces)||void 0===t?void 0:t.find((t=>(null==t?void 0:t.id)===this.colonyID))}_callValidateOnRequiredInputs(){[this._streetInputElement,this._externalNumberInputElement].forEach((t=>t.validate()))}get _colonyFormOptionsTemplate(){return this.listPlaces.map((({id:t,name:e})=>f`
        <bbva-form-option value=${t}>${e}</bbva-form-option>
      `))}get _colonySelectionDetailsTemplate(){return f`
      <bbva-type-text
        id="municipality"
        text=${this.t("open-digital-account-multistep-step-two-municipality-label")}
        size="S"
        unset>
      </bbva-type-text>
      <bbva-type-text
        id="municipalityTwo"
        text=${this._infoSelectionDescription("municipality")}
        size="S"
        unset>
      </bbva-type-text>

      <bbva-type-text
        id="state"
        text=${this.t("open-digital-account-multistep-step-two-state-label")}
        size="S"
        unset
      ></bbva-type-text>
      <bbva-type-text
        id="stateTwo"
        text=${this._infoSelectionDescription("state")}
        size="S"
        unset
      ></bbva-type-text>

      <bbva-type-text
        id="country"
        text=${this.t("open-digital-account-multistep-step-two-country-label")}
        size="S"
        unset>
      </bbva-type-text>
      <bbva-type-text
        id="countryTwo"
        text=${this.t("open-digital-account-multistep-step-country")}
        size="S"
        unset>
      </bbva-type-text>
    `}_infoSelectionDescription(t){return this.colonySelectionData[t]?this.colonySelectionData[t]:this.t("open-digital-account-multistep-step-two-address-no-selection")}get _continueButtonTemplate(){return f`
      <div class="action-buttons">
        <bbva-button-default
          ?disabled=${!this._isValidToContinue}
          id="continue"
          variant="primary"
          fullwidth=""
          text=${this.t("open-digital-account-multistep-step-generic-button-continue")}
          @click=${this._handleContinueButtonClick}
        ></bbva-button-default>
      </div>
    `}get _isValidToContinue(){const t=""!==this.street,e=""!==this.externalNumber,i=""!==this.colonyID;return t&&e&&this._isValidPostalCode&&i}_handleContinueButtonClick(){const t={street:this.street,exteriorNumber:this.externalNumber,interiorNumber:this.internalNumber,postalCode:this.postalCode,...this.colonySelectionData};me(this,"customer-address-data",t),me(this,"complete-step")}render(){return f`
      <div class="content">
        <bbva-type-text
          ?disabled=${this.disabledFields}
          text=${this.t("open-digital-account-multistep-step-two-description")}
        ></bbva-type-text>

        ${this._streetFormTextTemplate}

        ${this._externalNumberFormTextTemplate}

        ${this._internalNumberFormTextTemplate}

        ${this._postalCodeFormNumberTemplate}

        ${this._coloniesFormSelectTemplate}

        ${this._continueButtonTemplate}
      </div>
    `}}var ni=t`
:host {
  --_help-modal-content-bg-color:
  var(--bbva-help-modal--_ambient--content-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--content-bg-color,
      ${ft("colorPrimaryAltSurfaceAmbientDefault",yt)}));
  --_help-modal-title-icon-color:
  var(--bbva-help-modal--_ambient--title-icon-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color,
      ${ft("colorPrimaryAltSupportInfoDefault",yt)}));
  --_help-modal-title-icon-color-warning:
  var(--bbva-help-modal--_ambient--title-icon-color-warning,
    var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color-warning,
      ${ft("colorPrimaryAltSupportErrorDefault",yt)}));
  --_help-modal-title-icon-color-caution:
    var(--bbva-help-modal--_ambient--title-icon-color-caution,
      var(--bbva-help-modal--custom--primary-alt-ambient--title-icon-color-caution,
        ${ft("colorPrimaryAltSupportWarningDefault",yt)}));
  --_help-modal-title-color:
    var(--bbva-help-modal--_ambient--title-color,
      var(--bbva-help-modal--custom--primary-alt-ambient--title-color,
        ${ft("colorPrimaryAltText01Default",yt)}));
  --_help-modal-content-color:
    var(--bbva-help-modal--_ambient--content-color,
      var(--bbva-help-modal--custom--primary-alt-ambient--content-color,
        ${ft("colorPrimaryAltText01Default",yt)}));
  --_help-modal-footer-bg-color:
  var(--bbva-help-modal--_ambient--footer-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--footer-bg-color,
      ${ft("colorPrimaryAltSurfaceAmbientDefault",yt)}));
  --_help-modal-veil-bg-color:
  var(--bbva-help-modal--_ambient--veil-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--veil-bg-color,
      ${ft("colorPrimaryAltSurfaceAmbientOverlay",yt)}));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal--_ambient--ios-header-bg-color,
    var(--bbva-help-modal--custom--primary-alt-ambient--ios-header-bg-color,
      ${ft("colorPrimaryAltSurfaceAmbientOverlay",yt)}));
  --_help-modal-full-height-bg-color:
   var(--bbva-help-modal--_ambient--full-height-bg-color,
     var(--bbva-help-modal--custom--primary-alt-ambient--full-height-bg-color,
       ${ft("colorPrimaryAltSurfaceAmbientDefault",yt)}));
  --_help-modal-divider-color:
    var(--bbva-help-modal--_ambient--divider-color,
      var(--bbva-help-modal--custom--primary-alt-ambient--divider-color,
        ${ft("colorPrimaryAltFormatDivider",yt)}));
  --_help-modal-focus-color-primary:
    var(--bbva-help-modal--_ambient--focus-color-primary,
      ${ft("colorPrimaryAltSurfaceAmbientFocus",yt)});
  --_help-modal-veil-bg-color-without-scroll:
    var(--bbva-help-modal--_ambient--veil-bg-color-without-scroll,
      ${ft("colorPrimarySurfaceAlternativeDefault",yt)});
}
`,li=t`
:host {
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.4s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.3s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2, 0, 0.1, 1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2, 0, 0.1, 1));
  --_help-modal-veil-transition-delay: var(--bbva-help-modal-veil-transition-delay, 0.15s);
  --_help-modal-transition-delay: var(--bbva-help-modal-transition-delay, 0.3s);
  --_veil-bg-color: var(--_help-modal-veil-bg-color);
  --_help-modal-padding-bottom: var(--bbva-help-modal-padding-bottom, 1rem);
  --bbva-help-modal-display-desktop-mode: inherit;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  display: flex;
  visibility: hidden;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([transition-without-scroll]) .veil {
  background-color: var(--_help-modal-veil-bg-color-without-scroll);
}
:host([transition-without-scroll]) .transition-container {
  transition: none;
}
:host([transition-without-scroll]) .transition-container:not([dragging]) {
  transition: none;
}

.veil {
  position: fixed;
  opacity: 0;
  pointer-events: none;
  transition: visibility 0.7s ease-in-out, opacity var(--_help-modal-veil-transition-duration) var(--_help-modal-veil-transition-easing) var(--_help-modal-veil-transition-delay);
  visibility: hidden;
}

.modal-main {
  display: flex;
  width: 100%;
  max-width: 45rem;
  height: 100%;
  flex-direction: column;
  padding-bottom: calc(var(--_help-modal-padding-bottom) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
  overflow-y: auto;
}

.transition-container {
  position: fixed;
  z-index: 1;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 100%;
  max-width: 45rem;
  box-sizing: border-box;
  margin: 0 auto;
  transform: translateY(100%);
  transition: visibility 0.7s, transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing) var(--_help-modal-transition-delay);
  will-change: transform;
}
.transition-container.half-height:not(.desktop) {
  top: auto;
  max-height: 87%;
}
.transition-container.half-height:not(.desktop) .modal-main {
  padding-bottom: calc(1.5rem + var(--bbva-help-modal-safe-area-inset-bottom));
  background-color: var(--_help-modal-content-bg-color);
}
.transition-container .help-modal {
  display: grid;
  width: 100%;
  height: 100%;
  box-sizing: border-box;
  align-items: center;
  margin: auto;
  background-color: var(--_help-modal-content-bg-color);
}

:host([dragging]) {
  user-select: none;
}

:host(:not([hide-content-padding-top])) .transition-container.desktop .modal-content-wrapper {
  padding: 0;
}

.modal-header {
  width: 100%;
  max-width: 45rem;
  background-color: var(--_help-modal-content-bg-color);
}

.divider {
  height: 1.5rem;
  padding-top: 0.0625rem;
  margin: 0;
}
.divider hr {
  width: 3.5rem;
  margin-right: auto;
  margin-left: auto;
  background-color: var(--_help-modal-divider-color);
}

.desktop .divider {
  display: none;
}

.modal-container {
  width: 100%;
  align-items: center;
  padding: var(--bbva-help-modal-padding, 0 1rem 0);
  outline: 0;
}

.modal-title {
  position: relative;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${e(i.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(s.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${e(a.typeMedium)}));
  outline: 0;
}
.modal-title .title-icon {
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, 1rem);
  fill: var(--_help-modal-title-icon-color);
}
.modal-title [data-tag-name=bbva-type-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}
.modal-title [data-tag-name=bbva-type-text].subtitle {
  margin: 0.5rem 0 0.5rem 0;
}

.desktop .modal-content-wrapper,
.desktop .modal-content,
.desktop .slot-content {
  overflow: hidden;
}
.desktop .slot-content {
  overflow-y: auto;
}
.desktop .modal-title .microillustration-container {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
}
.desktop .modal-title .microillustration-container [data-tag-name=bbva-clip-microillustration] {
  margin-top: 1.5rem;
}
.desktop .modal-title [data-tag-name=bbva-type-text] {
  margin-bottom: 0.5rem;
}
.desktop .icon-close {
  position: absolute;
  z-index: 1;
  top: -8px;
  right: 0;
  cursor: pointer;
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, 1.5rem 1rem 0);
  gap: 1rem;
  transform: translateZ(0.01px);
}

:host([full-height]) .help-modal,
.desktop .help-modal {
  display: flex;
  flex-direction: column;
  background-color: var(--_help-modal-full-height-bg-color);
}
:host([full-height]) .slot-footer,
.desktop .slot-footer {
  padding: var(--bbva-help-modal-footer-padding, 1rem 1rem 0);
}
:host([full-height]) .modal-header,
.desktop .modal-header {
  z-index: 1;
  width: 100%;
}

.desktop .slot-footer {
  display: flex;
  width: 100%;
  flex-direction: row;
  align-items: center;
}

.desktop .slot-footer-link {
  display: flex;
  width: 100%;
  justify-content: flex-end;
  padding: var(--bbva-help-modal-footer-padding, 1rem 1.5rem 0 0);
  gap: 1rem;
}

.desktop .modal-footer {
  display: flex;
  align-items: center;
}

.modal-content {
  outline: 0;
}
.modal-content [data-tag-name=bbva-type-text] {
  color: var(--_help-modal-content-color);
}

:host([modal-type=warning]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=caution]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-caution);
}

.modal-content-wrapper {
  width: var(--bbva-help-modal-content-width, 100%);
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  margin: 0 auto;
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${e(i.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${e(a.typeSmall)}));
  text-align: left;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: 1.5rem;
}

[data-tag-name=bbva-button-default].footer-button {
  --button-default-max-width: calc(100% - 32px);
  width: 100%;
  text-decoration: none;
}

.desktop [data-tag-name=bbva-button-default].footer-button {
  width: auto;
}

[data-tag-name=bbva-type-link].footer-button {
  margin: var(--bbva-help-modal-footer-last-button-margin, 0.75rem 0 0.75rem);
  text-align: center;
}

:host([fixed-footer]) .modal-container,
.desktop .modal-container {
  display: flex;
  flex-direction: column;
  flex-grow: 1;
  overflow-x: var(--bbva-help-modal-modal-container-overflow-x, inherit);
  overflow-y: auto;
}
:host([fixed-footer]) .modal-footer,
.desktop .modal-footer {
  width: 100%;
  background-color: var(--_help-modal-footer-bg-color);
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 -3px 2px 0 rgba(18, 18, 18, 0.08));
}
:host([fixed-footer]) .modal-content-wrapper,
:host([fixed-footer]) .modal-content,
:host([fixed-footer]) .slot-content,
.desktop .modal-content-wrapper,
.desktop .modal-content,
.desktop .slot-content {
  display: flex;
  width: 100%;
  flex-direction: column;
  flex-grow: 1;
}
:host([fixed-footer]) .transition-container .modal-main,
.desktop .transition-container .modal-main {
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
}

:host([full-height][fixed-footer]) .slot-footer {
  padding-bottom: calc(var(--_help-modal-padding-bottom) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
}

:host([visible]) {
  visibility: visible;
}
:host([visible]) .veil {
  position: absolute;
  opacity: var(--_veil-opacity, 0.85);
  pointer-events: all;
  visibility: visible;
}
:host([visible]) .transition-container {
  transform: translate3d(0, var(--_translate, 0), 0);
  transition: none;
  will-change: transform;
}
:host([visible]) .transition-container .help-modal {
  display: flex;
  flex-direction: column;
}
:host([visible]) .transition-container:not([dragging]) {
  transition: visibility var(--_help-modal-transition-duration) var(--_help-modal-transition-delay), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing) var(--_help-modal-transition-delay);
}

:host([visible][_secondmodal]) {
  z-index: var(--bbva-help-modal-second-modal-z-index, 11);
  overflow-y: auto;
}
:host([visible][_secondmodal]) .transition-container {
  position: fixed;
  max-height: calc(100% - 3.625rem);
  transform: translateY(3.625rem);
  transition: max-height var(--_help-modal-transition-duration) var(--_help-modal-transition-delay), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
  will-change: transform;
}
:host([visible][_secondmodal]) .transition-container.scrollable {
  position: relative;
}
:host([visible][_secondmodal]) .modal-header {
  position: relative;
}
:host([visible][_secondmodal]) .modal-main {
  max-height: calc(100% - 3.625rem);
}
:host([visible][_secondmodal]) .modal-container {
  overflow-y: unset;
}
:host([visible][_secondmodal]) .modal-footer {
  position: sticky;
  bottom: 3.625rem;
}
:host([visible][_secondmodal]) .sticky {
  position: sticky;
  top: -3.625rem;
}

:host([visible][_secondmodal][_scrollableContentBottom]) .transition-container {
  max-height: 100%;
  transform: translateY(0);
  transition: transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
}
:host([visible][_secondmodal][_scrollableContentBottom]) .modal-main {
  max-height: 100%;
}

:host(:not([visible])) {
  position: relative;
  width: auto;
  height: auto;
  --bbva-help-modal-veil-transition-delay: 0.3s;
  --bbva-help-modal-transition-delay: 0.15s;
  --bbva-help-modal-transition-easing: cubic-bezier(0.8, 0, 1, 1);
  --bbva-help-modal-veil-transition-easing: cubic-bezier(0.8, 0, 1, 1);
  --_modal-padding: 0;
}
:host(:not([visible])) .transition-container {
  visibility: hidden;
}
:host(:not([visible]))[full-height] .veil {
  transition: none;
}
:host(:not([visible])) div[tabindex="0"] > .veil {
  opacity: 0;
  visibility: hidden;
}

@supports (padding-top: constant(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}

:host([visible][full-height]) {
  --bbva-help-modal-veil-transition-duration: 0.3s;
}

:host(:not([visible])[full-height]) {
  --bbva-help-modal-transition-duration: 0.4s;
}
:host(:not([visible])[full-height]) .transition-container {
  transform: translateY(100%);
}
:host(:not([visible])[full-height]) .modal-main {
  max-width: none;
}

.transition-container[_should-display-fixed-header] {
  position: fixed;
  padding-top: var(--bbva-help-modal-safe-area-inset-top, 0);
}
@supports (padding-top: constant(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}

@supports (padding-top: constant(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}
@supports (padding-bottom: constant(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: constant(safe-area-inset-bottom);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: env(safe-area-inset-bottom);
  }
}
@supports (will-change: transform) {
  .transition-container {
    will-change: transform;
  }
}
.iOS-fixed-header {
  position: absolute;
  z-index: 5;
  bottom: calc(100vh - var(--bbva-help-modal-safe-area-inset-top, 0));
  width: 100%;
  height: var(--bbva-help-modal-safe-area-inset-top, 0);
  background-color: var(--_help-modal-ios-header-bg-color);
}

@media (min-width: 45rem) {
  :host([full-height]) .transition-container:not(.desktop) {
    padding-bottom: 0;
  }
  :host([full-height]) .modal-header {
    --bbva-header-main-max-width: 45rem;
  }
  :host([full-height]) .modal-container,
  :host([full-height]) .modal-footer {
    margin: auto;
  }
  :host([full-height]) .modal-container {
    max-width: 45rem;
    flex-grow: 1;
    overflow-y: auto;
  }
  :host([full-height]) .modal-footer {
    width: 45rem;
  }
  :host([full-height]) .modal-footer .slot-footer {
    padding-bottom: 1.5rem;
  }
  .modal-title [data-tag-name=bbva-type-text] {
    width: 40rem;
  }
}
.transition-container.desktop {
  bottom: unset;
  display: var(--bbva-help-modal-display-desktop-mode);
  max-width: 100%;
  margin-top: 3rem;
}
.transition-container.desktop .help-modal {
  height: auto;
  max-height: var(--bbva-help-modal-desktop-max-height, calc(100vh - 96px));
}
.transition-container.desktop .help-modal .modal-header {
  max-width: 100%;
  --bbva-header-main-max-width: 100%;
}
.transition-container.desktop .help-modal .modal-header [data-tag-name=bbva-header-main] {
  min-height: auto;
}
.transition-container.desktop .help-modal .modal-main {
  max-width: none;
  padding-bottom: 0;
}
.transition-container.desktop .help-modal .modal-main .modal-container {
  max-width: none;
  padding: 1rem 0.5rem 0 1.5rem;
}
.transition-container.desktop .help-modal .modal-main .modal-footer {
  width: 100%;
  max-width: none;
}
.transition-container.desktop .help-modal .modal-main .modal-footer .slot-footer {
  padding: 1.5rem;
}

.desktop .modal-content {
  padding-right: 1rem;
}

:host([modal-size=L]) .transition-container.desktop {
  max-width: 55.5rem;
}

:host([modal-size=M]) .transition-container.desktop {
  max-width: 50rem;
}

:host([modal-size=S]) .transition-container.desktop {
  max-width: 38rem;
}
`;class di extends(pt(A(_t(tt)))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":ut,"bbva-type-icon":xt,"bbva-type-text":bt,"bbva-header-main":St,"bbva-type-link":mt,"bbva-clip-microillustration":$t}}static get properties(){return{closeModalElements:{type:Array,attribute:"close-modal-elements"},closeModalIndex:{type:Array,attribute:"close-modal-index"},avoidIconCloseModal:{type:Boolean,attribute:"avoid-icon-close-modal"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},headerButtons:{type:Array},headerShowLeftIcon:{type:Boolean,attribute:"header-show-left-icon"},headerLeftIconLabel:{type:String,attribute:"header-left-icon-label"},headerLeftIconAriaLabel:{type:String,attribute:"header-left-icon-aria-label"},headerCloseIconLabel:{type:String,attribute:"header-close-icon-label"},headerCloseIconAriaLabel:{type:String,attribute:"header-close-icon-aria-label"},footerButtonAriaLabel:{type:String,attribute:"footer-button-aria-label"},footerLinkAriaLabel:{type:String,attribute:"footer-link-aria-label"},headerPosition:{type:String,attribute:"header-position"},headerLogo:{type:String,attribute:"header-logo"},headerLeftIcon:{type:Object},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},subtitleText:{type:String,attribute:"subtitle-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},secondaryLinkText:{type:String,attribute:"secondary-link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},_secondModal:{type:Boolean,reflect:!0},_scrollable:{type:Boolean},scrollable:{type:Boolean},disabledButton:{type:Boolean,attribute:"disabled-button"},disabledLink:{type:Boolean,attribute:"disabled-link"},disabledSecondaryLink:{type:Boolean,attribute:"disabled-secondary-link"},titleLines:{type:Number,attribute:"title-lines"},_translate:{type:Number},illustration:{type:String},altIllustration:{type:String,attribute:"alt-illustration"},altImage:{type:String,attribute:"alt-image"},modalSize:{type:String,attribute:"modal-size",reflect:!0},_desktop:{type:Boolean,state:!0},transitionWithoutScroll:{type:Boolean,attribute:"transition-without-scroll",reflect:!0},buttonHref:{type:String,attribute:"button-href"},buttonTarget:{type:String,attribute:"button-target"},_scrollableContentBottom:{type:Boolean,reflect:!0},scrollContentEvent:{type:String,attribute:"scroll-content-event"}}}constructor(){super(),this.closeModalElements=["footer-button","footer-link"],this.closeModalIndex=[],this.headerText="",this.headerType="",this.headerButtons=[],this.headerShowLeftIcon=!1,this.headerLeftIconLabel="",this.headerLeftIconAriaLabel="",this.headerCloseIconLabel="",this.headerCloseIconAriaLabel="",this.headerPosition="",this.headerLogo="",this.modalSize="L",this.titleIcon="",this.titleText="",this.subtitleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.disabledLink=!1,this.disabledSecondaryLink=!1,this.transitionWithoutScroll=!1,this._modalHeight=0,this._translate=0,this._swipe=!1,this.avoidIconCloseModal=!1,this._desktop=!1,this._secondModal=!1,this._scrollable=!1,this.scrollable=!1,this._focusHandlerTimeout=400,this._scrollableContentBottom=!1,this.scrollContentEvent="",this.addEventListener("header-main-buttons-set",this._setCloseModalButtons)}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}get _headerButtons(){return this.headerButtons.map((t=>{const e={...t};return"bbva:close"===e.icon&&(e.defaultEventIconName="header-main-close-icon-click"),e}))||[]}async firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),await this.updateComplete,this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this._transition=this.shadowRoot.querySelector(".transition-container"),this._headerHeight=this._header.offsetHeight,this.removeAttribute("aria-modal"),requestAnimationFrame((()=>{this._modalHeight=this._modal.offsetHeight})),this.fullHeight||(et(this._header,"track",(t=>this._onTrack(t))),it(this._header,"pan-y")),this._checkHeight(),this._secondModal=di._isSecondModal(this)&&this.fullHeight,this.addEventListener("scroll",this._secondModalScroll),this._secondModal&&this.scrollContentEvent&&this.addEventListener(this.scrollContentEvent,this._contentScroll)}_secondModalScroll(){this._sticky=this._header.getBoundingClientRect().y,this._header.classList.toggle("sticky",this._sticky<1||!this._header.classList.contains("sticky"))}_contentScroll({detail:t}){this._scrollableContentBottom=t>0,this._header.classList.toggle("sticky",t>0||!this._header.classList.contains("sticky"))}_setCloseModalButtons(t){var e;const i=null==t||null===(e=t.detail)||void 0===e?void 0:e.buttons;if(!this.closeModalIndex.length&&!this.avoidIconCloseModal){const t=(i||[]).findIndex((t=>"bbva:close"===t.icon));this.closeModalIndex.push(this.headerShowLeftIcon?t+1:t)}}updated(t){if(super.updated&&super.updated(t),t.has("visible")){let t="close";this.visible?(t="open",this.getAttribute("aria-label")&&this.removeAttribute("aria-label"),this._secondModal&&this._setupScrollable(),window.setTimeout((()=>{this._updateAccessibility()}),300)):(this._translate=0,this._secondModal&&this.scrollContentEvent&&(this._scrollableContentBottom=!1)),this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t},bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("modal-state-change",{detail:{status:t,visible:this.visible,modal:this},bubbles:!0,composed:!0}))}}_setupScrollable(){var t,e;const i=window.innerHeight-this._footer.clientHeight-this._header.clientHeight-58;this._scrollable=this.scrollable||i<(null===(t=this._container)||void 0===t?void 0:t.scrollHeight)||i>(null===(e=this._transition)||void 0===e?void 0:e.clientHeight)}static _isSecondModal(t){let e=t.attachToBody?t._placeholder.parentNode:t.parentNode;for(;null!=e;){if("BBVA-HELP-MODAL"===e.nodeName||e.nodeName.includes("BBVA-HELP-MODAL"))return!0;e=e.parentNode||e.host}return!1}static get styles(){return[super.styles,ni,li,kt.primaryAlt,Ct.primaryAlt,wt.primaryAlt,Et.primaryAlt,At.primaryAlt,v("bbva-help-modal-shared-styles")]}_onTrack(t){var e;if(null!=t&&null!==(e=t.detail)&&void 0!==e&&e.state)switch(t.detail.state){case"start":this._trackStart();break;case"end":this._trackEnd(t.detail.dy);break;default:this._trackY(t.detail.dy)}}_trackStart(){this._transition.setAttribute("dragging","")}_trackY(t){t>0?(this._swipe=!0,this._translate=t):this._translate=0}_trackEnd(t){t>this._modalHeight/3?(this.visible=!1,this._translate=this._modalHeight,this._gestureCloseModal()):this._translate=0,this._swipe=!1,this._transition.removeAttribute("dragging","")}_gestureCloseModal(){this.dispatchEvent(new CustomEvent("help-modal-swipe-close",{detail:!0,bubbles:!0,composed:!0}))}get _fixedIOSHeader(){return f`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get _headerType(){return this.headerType||(this.fullHeight||this._desktop?"modal-initial":"modal-short")}get helpModalHeader(){return this.headerText&&!this._desktop?f`
        <slot name="slot-header" class="header-slot">
          <bbva-header-main
            id="helpModalHeader"
            text="${this.headerText}"
            variant="${this._headerType}"
            position="${this.headerPosition}"
            logo="${this.headerLogo}"
            .buttons="${this._headerButtons}"
            ?show-left-icon="${this.headerShowLeftIcon}"
            .leftIcon="${this.headerLeftIcon}"
            left-icon-label="${this.headerLeftIconLabel}"
            left-icon-aria-label="${this.headerLeftIconAriaLabel}"
            @header-main-icon-click="${t=>this._handleClick(t,"header")}"
            @header-main-close-icon-click="${this._manageHeaderClose}"
            close-icon-label="${this.headerCloseIconLabel}"
            close-icon-aria-label="${this.headerCloseIconAriaLabel}"
          ></bbva-header-main>
        </slot>
      `:this.fullHeight?"":f`
        <div class="divider">
          <hr aria-hidden="true" />
        </div>
      `}get helpModalContent(){return f`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content" tabindex="${I(this._desktop?0:void 0)}">
          ${this.descriptionText?f`<bbva-type-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-type-text>`:f`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilClickable(){return this._secondModal||!this.fullHeight||this.fullHeight&&this._desktop}get _veilTpl(){return f`
      <div
        class="veil"
        @mouseup="${this._veilClickable&&this._onVeilClick}"
        @keyup="${t=>27===t.keyCode&&this._veilClickable&&this._onVeilClick}"
        @click="${this._veilClickable&&this._onVeilClick}"
      ></div>
    `}get helpModalFooter(){return f`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="primary-alt"
              class="footer-button"
              href="${I(this.buttonHref)}"
              target="${I(this.buttonTarget)}"
              text=${this.buttonText}
              aria-label=${I(this.t(this.footerButtonAriaLabel))}
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              ?disabled="${this.disabledButton}"
              @click="${t=>this._handleClick(t,"footer-button")}"
            >
            </bbva-button-default>
            ${this.linkText?f`<bbva-type-link
                  ambient="primary-alt"
                  class="footer-button link"
                  data-tag-name="bbva-type-link"
                  ?disabled="${this.disabledLink}"
                  aria-label=${I(this.t(this.footerLinkAriaLabel))}
                  @click="${t=>this._handleClick(t,"footer-link")}"
                  ?hidden="${!this.linkText}"
                  >${this.linkText}</bbva-type-link
                >`:null}
          </div>
          <div class="slot-footer-link">
            ${this.secondaryLinkText&&this._desktop?f`<bbva-type-link
                  ambient="primary-alt"
                  class="footer-button link secondary"
                  data-tag-name="bbva-type-link"
                  ?disabled="${this.disabledSecondaryLink}"
                  @click="${t=>this._handleClick(t,"footer-secondary-link")}"
                  ?hidden="${!this.secondaryLinkText}"
                  >${this.secondaryLinkText}</bbva-type-link
                >`:null}
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return f`
      <div id="helpModalTitle" class="modal-title">
        ${this._desktop?f`${this._tplButton}`:at}
        <slot name="slot-title">
          ${this._desktop?this.microillustrationTpl:f`<bbva-type-icon
                class="title-icon"
                data-tag-name="bbva-type-icon"
                size="24"
                icon="${this.titleIcon}"
                ?hidden="${!this.titleIcon}"
                aria-hidden="true"
              ></bbva-type-icon>`}
          ${this.titleText?f` <bbva-type-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                ellipsis
                .lines="${this.titleLines}"
                unset
                size="${this.titleSize}"
                font-weight="500"
                tag="h2"
              >
              </bbva-type-text>`:null}
          ${this._desktop&&this.subtitleText?f` <bbva-type-text
                id="sub-title-text"
                class="subtitle"
                .text=${this.subtitleText}
                ?hidden="${!this.subtitleText}"
                ellipsis
                unset
                size="M"
                tag="h2"
              >
              </bbva-type-text>`:null}
        </slot>
      </div>
    `}get _tplButton(){return f` <bbva-button-default
      aria-label="Close"
      class="icon-close"
      @click="${()=>this.close()}"
      variant="icon no-background alternative"
      .icon="${F()}"
    >
    </bbva-button-default>`}get microillustrationTpl(){return this.illustration||this.altIllustration?f`<div class="microillustration-container">
        <bbva-clip-microillustration
          alt-microillustration="${I(this.altIllustration)}"
          alt-image="${I(this.altImage)}"
          microillustration="${I(this.illustration)}"
          size="M"
        ></bbva-clip-microillustration>
      </div>`:f``}get titleSize(){return this._desktop?"2XL":"L"}_updateAccessibility(){const t=this.headerText||this.titleText||this.bodyText;!this.getAttribute("aria-label")&&t&&this.setAttribute("aria-label",t)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 -3px 2px 0 rgba(18, 18, 18, 0.08)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){const e=Math.ceil(t.currentTarget.scrollTop),i=this._desktop?1:0;e>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight-i?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 -3px 2px 0 rgba(18, 18, 18, 0.08)")}_handleClick(t,e){var i;const a=null==t||null===(i=t.detail)||void 0===i?void 0:i.index;this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:{index:a},bubbles:!0,composed:!0})),(this.closeModalElements.includes(e)||this.closeModalIndex.includes(a)||this._desktop)&&this.close()}_manageHeaderClose(t){var e;const i=null==t||null===(e=t.detail)||void 0===e?void 0:e.index;!this.closeModalIndex.includes(i)||this.avoidIconCloseModal&&!this._desktop||this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick({},"veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}_handleTransitionend(t){const{propertyName:e}=t;this.dispatchEvent(new CustomEvent("help-modal-transitionend",{detail:{propertyName:e,visible:this.visible},bubbles:!0,composed:!0}))}get _modalContent(){return f`
      ${this._fixedIOSHeader}
      <section
        class="transition-container  ${y({"half-height":!this.fullHeight,desktop:this._desktop,scrollable:this._scrollable})}"
        style="--_translate: ${this._translate}px"
        ?_should-display-fixed-header="${this._shouldDisplayFixedHeader()}"
        @transitionend=${this._handleTransitionend}
      >
        <div class="help-modal">
          <div class="modal-header">${this.helpModalHeader}</div>
          <div class="modal-main">
            <div class="modal-container" @scroll="${this._setFooterShadow}">
              <div class="modal-content-wrapper">
                ${this.helpModalTitle} ${this.helpModalContent}
              </div>
            </div>
            ${this._secondModal?"":this.helpModalFooter}
          </div>
          ${this._secondModal?this.helpModalFooter:""}
        </div>
      </section>
    `}}const ci=new r;var hi=t`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${e(n.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1rem);
}
${ci.mediaRules()}`;const pi=new r;var bi=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(n.secondary300)});
}
${pi.mediaRules()}`;const ui=new r;const mi={dark:t`
    ${t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(n.secondary300)});
}
${ui.mediaRules()}`}
  `,light:t`
    ${bi}
  `};class gi extends(h(b)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[hi,mi.light,mi.dark,v("bbva-divider-shared-styles")]}render(){return f` <hr divider="${this.size}" /> `}}$("colors.cool40");var vi=t`
:host {
  display: block;
  box-sizing: border-box;
  --_header-bbva-micro-color: var(--bbva-header-bbva-micro-color, var(--colorsPrimaryCore, ${e(n.primaryCore)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.icon {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(l.spacer)}))) / 16) * 1em);
}
.icon svg {
  max-height: 1.5rem;
  color: var(--_header-bbva-micro-color);
}
`,fi=t`
[ambient^=light] {
  --bbva-header-bbva-micro-color: initial;
}
`,yi=t`
[ambient^=dark] {
  --bbva-header-bbva-micro-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}
`;const _i={dark:t`
    ${mi.dark}
    ${yi}
  `,light:t`
    ${mi.light}
    ${fi}
  `};class xi extends(h(b)){static get is(){return"bbva-header-bbva"}static get scopedElements(){return{"bbva-divider":gi,"bbva-icon":D}}static get properties(){return{dividerSize:{type:String,attribute:"divider-size"}}}constructor(){super(),this.dividerSize="fit",this._iconHeight=24}static get styles(){return[_i.light,_i.dark,vi,v("bbva-header-bbva-shared-styles")]}render(){return f`
      <div class="icon">
        <bbva-icon
          class="main-logo"
          icon="${st()}"
          height="${this._iconHeight}"
          width="${3.33*this._iconHeight}"
        ></bbva-icon>
      </div>
      <bbva-divider size="${this.dividerSize}"></bbva-divider>
    `}}class Si extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-privacy-notice"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-header-bbva":xi,"bbva-header-category":gt,"bbva-divider":we}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="privacyNoticeModal"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-notice-privacy-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-notice-privacy-button")}>
        <div class="content" slot="slot-content">
        <div class="custom-header">${ot}</div>
        <bbva-divider divider="full"></bbva-divider>
        <bbva-header-category class="textLeft" text=${this.t("open-digital-account-modal-notice-privacy-title")}></bbva-header-category>
        <bbva-type-text text=${this.t("open-digital-account-modal-notice-privacy-paragraph-one")}></bbva-type-text>
        <bbva-type-text text=${this.t("open-digital-account-modal-notice-privacy-paragraph-two")}></bbva-type-text>
      </div>
    </bbva-help-modal>
    `}}var $i=t`:host {
  display: block;
  box-sizing: border-box; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit; }
`;class ki extends(A(b)){static get is(){return"bbva-aggregation-bullet-list"}static get properties(){return{items:{type:Array},role:{type:String}}}constructor(){super(),this.items=[],this.role="list"}static get styles(){return[$i,v("bbva-aggregation-bullet-list-shared-styles")]}render(){return f`
      ${this.items.map((t=>f`
        <bbva-list-bullet role="listitem">${this.t(t)}</bbva-list-bullet>
      `))}`}}class Ci extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-personal-data"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-clip-microillustration":$t,"bbva-panel-info":ii,"bbva-aggregation-bullet-list":ki,"bbva-list-bullet":Pt,idscan:rt}}static get properties(){return{recomendations:{type:Array},isModalVisible:{type:Boolean}}}constructor(){super(),this.recomendations=["open-digital-account-modal-ocr-scanning-hints-one","open-digital-account-modal-ocr-scanning-hints-two","open-digital-account-modal-ocr-scanning-hints-three","open-digital-account-modal-ocr-scanning-hints-four"],this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="scanModal"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-ocr-scanning-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-ocr-scanning-button")}>
      <div class="main" slot="slot-title">
        <div class="mainIllustration">
          <bbva-clip-microillustration microillustration="idscan" size="M"></bbva-clip-microillustration>
          <bbva-type-text
            class="mainTitleText"
            font-weight="700"
            text=${this.t("open-digital-account-modal-ocr-scanning-title")}
            size="XL"
            unset>
          </bbva-type-text>
        </div>
      </div>
      <div class="content" slot="slot-content">
        <div class="contentModal">
        ${this.recomendations.map((t=>f`<bbva-list-bullet><div class="listBullets">${this.t(t)}</div></bbva-list-bullet>`))}
        </div> 
      </div>
    </bbva-help-modal>
    `}}class wi extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-permissions-denied"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-clip-microillustration":$t,info:nt}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="permissionsDeniedModal"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-permissions-denied-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-permissions-denied-button")}
      link-text="${this.t("open-digital-account-modal-permissions-denied-button-link")}">
      <div class="main" slot="slot-title">
        <div class="mainIllustration">
          <bbva-clip-microillustration microillustration="info" size="M"></bbva-clip-microillustration>
          <bbva-type-text
            class="mainTitleText"
            font-weight="700"
            text=${this.t("open-digital-account-modal-permissions-denied-title")}
            size="XL"
            unset>
          </bbva-type-text>
        </div>
      </div>
      <div class="content" slot="slot-content">
        <bbva-type-text
          text=${this.t("open-digital-account-modal-permissions-denied-paragraph")}
          alignment="left"
          size="S">
        </bbva-type-text>
      </div>
    </bbva-help-modal>
    `}}class Ei extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-number-ine"}static get scopedElements(){return{"bbva-help-modal":di}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="cicModal"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      i-o-s-fixed-header
      title-icon=${V()}
      header-text=${this.t("open-digital-account-modal-ine-number-header-title")}
      button-text=${this.t("open-digital-account-modal-notice-privacy-button")}>
      <span slot="slot-content">
      <p>${this.t("open-digital-account-modal-ine-number-paragraph")}</p>
        <div>
          <img alt="" src="./images/INE.svg">
        </div>
    </span>
    </bbva-help-modal>
    `}}class Ai extends(pt(A(b))){static get is(){return"bbva-modal-inquiry-authorization"}static get scopedElements(){return{"bbva-text":m,"bbva-help-modal":lt,"bbva-divider":we,"bbva-header-category":dt}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="inquiryAuthorizationModal"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-consultation-authorization-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-consultation-authorization-button")}>
        <div class="content" slot="slot-content">
        <div class="custom-header">${ot}</div>
        <bbva-divider divider="full"></bbva-divider>
        <bbva-header-category class="textLeft" text=${this.t("open-digital-account-modal-consultation-authorization-title")}></bbva-header-category>
        <bbva-text text=${this.t("open-digital-account-modal-consultation-authorization-paragraph")}></bbva-text>
      </div>
    </bbva-help-modal>
    `}}class Ti extends(pt(A(b))){static get is(){return"bbva-modal-offers-and-promos"}static get scopedElements(){return{"bbva-text":m,"bbva-help-modal":lt,"bbva-divider":we,"bbva-header-category":dt}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="offersAndPromosModal"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-offer-information-notice-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-offer-information-notice-button")}>
        <div class="content" slot="slot-content">
        <div class="custom-header">${ot}</div>
        <bbva-divider divider="full"></bbva-divider>
        <bbva-header-category class="textLeft" text=${this.t("open-digital-account-modal-offer-information-notice-title")}></bbva-header-category>
        <bbva-text text=${this.t("open-digital-account-modal-offer-information-notice-paragraph")}></bbva-text>
      </div>
    </bbva-help-modal>
    `}}class Ri extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-successful-enrollment"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-divider":we,"bbva-header-category":gt,"bbva-clip-microillustration":$t,"bbva-notification-message":vt}}static get properties(){return{isModalVisible:{type:Boolean},mail:{type:String}}}constructor(){super(),this.isModalVisible=!1,this.mail=""}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="successfulEnrollment"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-success-enrollment-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-offer-information-notice-button")}>
        <div class="content" slot="slot-content">
          <div class="main" slot="slot-title">
            <div class="mainIllustration">
              <bbva-clip-microillustration
                microillustration="success"
                size="M"></bbva-clip-microillustration>
              <bbva-type-text
                text=${this.t("open-digital-account-modal-success-enrollment-main-title")}
                  alignment="left"
                font-weight="700"
                size="2XL">
              </bbva-type-text>
              </div>
           </div>
           <bbva-type-text
              text=${moment().format("DD MMMM YYYY, HH:mm [h]")}
              alignment="left"
              font-style="italic"
              size="M">
            </bbva-type-text>
            <bbva-notification-message
              variant="default">
              ${this.t("open-digital-account-modal-success-enrollment-main-text")}
            </bbva-notification-message>
            <bbva-type-text
              text=${this.t("open-digital-account-modal-success-enrollment-second-text")}
              alignment="left"
              size="M">
            </bbva-type-text>
            <bbva-type-text
              text=${this.mail}
              alignment="left"
              font-weight="700"
              size="M">
            </bbva-type-text>
        </div>
    </bbva-help-modal>
    `}}class Ii extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-with-card"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-clip-microillustration":$t,"bbva-notification-message":vt}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="withCard"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-with-card-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-offer-information-notice-button")}>
        <div class="content" slot="slot-content">
          <div class="mainIllustration">
            <bbva-clip-microillustration
              microillustration="creditcard"
              size="M"></bbva-clip-microillustration>
            <bbva-type-text
              text=${this.t("open-digital-account-modal-with-card-main-text")}
              alignment="left"
              font-weight="700"
              size="XL">
            </bbva-type-text>
           </div>
           <bbva-type-text
              text=${this.t("open-digital-account-modal-with-card-second-text")}
              alignment="left"
              size="S">
            </bbva-type-text>
        </div>
    </bbva-help-modal>
    `}}class Pi extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-with-alert"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-clip-microillustration":$t,"bbva-notification-message":vt}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="withAlert"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-with-alert-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-offer-information-notice-button")}>
        <div class="content" slot="slot-content">
          <div class="mainIllustration">
            <bbva-clip-microillustration
              microillustration="caution"
              size="M"></bbva-clip-microillustration>
            <bbva-type-text
              text=${this.t("open-digital-account-modal-with-alert-main-text")}
              alignment="left"
              font-weight="700"
              size="XL">
            </bbva-type-text>
           </div>
           <bbva-type-text
              text=${this.t("open-digital-account-modal-with-alert-second-text")}
              alignment="left"
              size="S">
            </bbva-type-text>
        </div>
    </bbva-help-modal>
    `}}class Ni extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-channel-active"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-clip-microillustration":$t,"bbva-notification-message":vt}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="channelActive"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-channel-active-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-offer-information-notice-button")}>
        <div class="content" slot="slot-content">
          <div class="main" slot="slot-title">
            <bbva-clip-microillustration
              microillustration="caution"
              size="M"></bbva-clip-microillustration>
            <bbva-type-text
              text=${this.t("open-digital-account-modal-channel-active-main-text")}
              alignment="left"
              font-weight="700"
              size="XL">
            </bbva-type-text>
           </div>
           <bbva-type-text
              text=${this.t("open-digital-account-modal-channel-active-second-text")}
              alignment="left"
              size="S">
            </bbva-type-text>
        </div>
    </bbva-help-modal>
    `}}class Di extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-error-phone"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-clip-microillustration":$t,"bbva-notification-message":vt}}static get properties(){return{isModalVisible:{type:Boolean}}}constructor(){super(),this.isModalVisible=!1}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="errorPhone"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-error-phone-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-offer-information-notice-button")}>
        <div class="content" slot="slot-content">
          <div class="mainIllustration">
            <bbva-clip-microillustration
              microillustration="error"
              size="M"></bbva-clip-microillustration>
            <bbva-type-text
              text=${this.t("open-digital-account-modal-error-phone-main-text")}
              alignment="left"
              font-weight="700"
              size="XL">
            </bbva-type-text>
           </div>
           <bbva-type-text
              text=${this.t("open-digital-account-modal-error-phone-second-text")}
              alignment="left"
              size="S">
            </bbva-type-text>
        </div>
    </bbva-help-modal>
    `}}class Oi extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-error-no-clients"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-clip-microillustration":$t,"bbva-notification-message":vt}}static get properties(){return{isModalVisible:{type:Boolean},countRetryErrorObj:{type:Object},errorType:{type:String}}}constructor(){super(),this.isModalVisible=!1,this.countRetryErrorObj={data:0,contract:0,ine:0},this.errorType=""}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}_handlerRetryError(){if(this.countRetryErrorObj[this.errorType]>=2)return me(this,`error-${this.errorType}-exit`),void(this.countRetryErrorObj[this.errorType]=0);me(this,`error-${this.errorType}`),this.countRetryErrorObj[this.errorType]+=1}render(){return f`
    <bbva-help-modal
      id="error-${this.errorType}"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t(`open-digital-account-modal-error-${this.errorType}-header-title`)}
      i-o-s-fixed-header
      hide-content-padding-top
      link-text="${this.countRetryErrorObj[this.errorType]>=2?"":this.t(`open-digital-account-modal-error-${this.errorType}-link-button`)}"
      button-text=${this.countRetryErrorObj[this.errorType]>=2?this.t(`open-digital-account-modal-error-${this.errorType}-primary-button-exit`):this.t(`open-digital-account-modal-error-${this.errorType}-primary-button`)}
      @help-modal-footer-button-click="${this._handlerRetryError}"
      @help-modal-footer-link-click="${this._handlerRetryError}">
        <div class="content" slot="slot-content">
          <div class="mainIllustration">
            <bbva-clip-microillustration
              microillustration="error"
              size="M"></bbva-clip-microillustration>
            <bbva-type-text
              text=${this.countRetryErrorObj.contract>=2?this.t(`open-digital-account-modal-error-${this.errorType}-main-text-second`):this.t(`open-digital-account-modal-error-${this.errorType}-main-text`)}
              alignment="left"
              font-weight="700"
              size="XL">
            </bbva-type-text>
          </div>
          <bbva-type-text
            text=${"data"!==this.errorType&&this.countRetryErrorObj[this.errorType]>=2?this.t(`open-digital-account-modal-error-${this.errorType}-three-text`):this.t(`open-digital-account-modal-error-${this.errorType}-second-text`)}
            alignment="left"
            size="S">
          </bbva-type-text>
        </div>
    </bbva-help-modal>
    `}}class Li extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-call-up"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-divider":we,"bbva-header-category":gt,"bbva-clip-microillustration":$t,"bbva-notification-message":vt,"bbva-list-bullet":Pt}}static get properties(){return{isModalVisible:{type:Boolean},recomendations:{type:Array}}}constructor(){super(),this.isModalVisible=!1,this.recomendations=["open-digital-account-modal-call-up-bullet-message","open-digital-account-modal-call-up-bullet-message-second"]}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="callUp"
      ?visible=${this.isModalVisible}
      full-height
      fixed-footer
      header-text=${this.t("open-digital-account-modal-call-up-header-title")}
      i-o-s-fixed-header
      hide-content-padding-top
      button-text=${this.t("open-digital-account-modal-call-up-button")}>
        <div class="content" slot="slot-content">
          <bbva-type-text
              text=${this.t("open-digital-account-modal-call-up-header-title")}
              inherit=""
              alignment="left"
              font-weight="700"
              size="M">
            </bbva-type-text>
          <bbva-type-text
              text=${this.t("open-digital-account-modal-call-up-main-text")}
              alignment="left"
              inherit=""
              size="M">
            </bbva-type-text>
            ${this.recomendations.map((t=>f`<bbva-list-bullet id="callUp"><div class="listBullets">${this.t(t)}</div></bbva-list-bullet>`))}
            <bbva-notification-message
              variant="default">
              ${this.t("open-digital-account-modal-call-up-notification-message")}
            </bbva-notification-message>
        </div>
    </bbva-help-modal>
    `}}class Mi extends(pt(A(b))){static get is(){return"bbva-modal-digital-account-call-up-send"}static get scopedElements(){return{"bbva-type-text":bt,"bbva-help-modal":di,"bbva-divider":we,"bbva-header-category":gt,"bbva-clip-microillustration":$t,"bbva-notification-message":vt,"bbva-list-bullet":Pt,"bbva-progress-timer":jt}}static get properties(){return{isModalVisible:{type:Boolean},timer:{type:Number}}}constructor(){super(),this.isModalVisible=!1,this.timer=0}static get styles(){return[ue,v("bbva-multistep-digital-account-shared-styles")]}render(){return f`
    <bbva-help-modal
      id="callUpSend"
      ?visible=${this.isModalVisible}
      full-height
      header-text=${this.t("open-digital-account-modal-call-up-send-header-title")}
      fixed-footer
      i-o-s-fixed-header
      hide-content-padding-top>
        <div class="content" slot="slot-content">
          <div class="main" slot="slot-title">
            <div class="mainIllustration">
              <bbva-clip-microillustration
                microillustration="identifiedcall"
                size="M">
              </bbva-clip-microillustration>
              <bbva-type-text
                text=${this.t("open-digital-account-modal-call-up-send-main-text")}
                alignment="left"
                font-weight="700"
                size="L">
              </bbva-type-text>
            </div>
          </div>
          <bbva-type-text
            text=${this.t("open-digital-account-modal-call-up-send-second-text")}
            alignment="left"
            size="M">
          </bbva-type-text>
          <bbva-progress-timer 
            timeout="${this.timer}"
            text=${this.t("open-digital-account-modal-call-up-send-timer")}>
          </bbva-progress-timer>
          <bbva-notification-message
            variant="default">
            ${this.t("open-digital-account-modal-call-up-send-notification-message")}
          </bbva-notification-message>
        </div>
    </bbva-help-modal>
    `}}const qi=[{descriptions:[{language:"SPA",value:"AGUASCALIENTES       AGS0000000"}],id:"AS"},{descriptions:[{language:"SPA",value:"BAJA CALIFORNIA      BC 0000000"}],id:"BC"},{descriptions:[{language:"SPA",value:"BAJA CALIFORNIA SUR  BCS0000000"}],id:"BS"},{descriptions:[{language:"SPA",value:"CAMPECHE             CAM0000000"}],id:"CC"},{descriptions:[{language:"SPA",value:"CHIHUAHUA            COL0000000"}],id:"CH"},{descriptions:[{language:"SPA",value:"COAHUILA             COA0000000"}],id:"CL"},{descriptions:[{language:"SPA",value:"COLIMA               COL0000000"}],id:"CM"},{descriptions:[{language:"SPA",value:"CHIAPAS              CHS0000000"}],id:"CS"},{descriptions:[{language:"SPA",value:"DISTRITO FEDERAL    SDF 0000000"}],id:"DF"},{descriptions:[{language:"SPA",value:"DURANGO              GRO0000000"}],id:"DG"},{descriptions:[{language:"SPA",value:"GUERRERO             GRO0000000"}],id:"GR"},{descriptions:[{language:"SPA",value:"GUANAJUATO           GTO0000000"}],id:"GT"},{descriptions:[{language:"SPA",value:"HIDALGO              HGO0000000"}],id:"HG"},{descriptions:[{language:"SPA",value:"JALISCO              JAL0000000"}],id:"JC"},{descriptions:[{language:"SPA",value:"MEXICO               MEX0000000"}],id:"MC"},{descriptions:[{language:"SPA",value:"MICHOACAN            MIC0000000"}],id:"MN"},{descriptions:[{language:"SPA",value:"MORELOS              MOR0000000"}],id:"MS"},{descriptions:[{language:"SPA",value:"NUEVO LEON           NL 0000000"}],id:"NL"},{descriptions:[{language:"SPA",value:"NAYARIT              NAY0000000"}],id:"NT"},{descriptions:[{language:"SPA",value:"OAXACA               OAX0000000"}],id:"OC"},{descriptions:[{language:"SPA",value:"PUEBLA               PUE0000000"}],id:"PL"},{descriptions:[{language:"SPA",value:"QUINTANA ROO         ROO0000000"}],id:"QR"},{descriptions:[{language:"SPA",value:"QUERETARO            QRO0000000"}],id:"QT"},{descriptions:[{language:"SPA",value:"SINALOA              SIN0000000"}],id:"SL"},{descriptions:[{language:"SPA",value:"SAN LUIS POTOSI      SLP0000000"}],id:"SP"},{descriptions:[{language:"SPA",value:"SONORA               SON0000000"}],id:"SR"},{descriptions:[{language:"SPA",value:"TABASCO              TAB0000000"}],id:"TC"},{descriptions:[{language:"SPA",value:"TLAXCALA             TLX0000000"}],id:"TL"},{descriptions:[{language:"SPA",value:"TAMAULIPAS           TAM0000000"}],id:"TS"},{descriptions:[{language:"SPA",value:"VERACRUZ             VER0000000"}],id:"VZ"},{descriptions:[{language:"SPA",value:"EXTRANJERO           EX10000000"}],id:"X1"},{descriptions:[{language:"SPA",value:"YUCATAN              YUC0000000"}],id:"YN"},{descriptions:[{language:"SPA",value:"ZACATECAS            ZAC0000000"}],id:"ZS"}];class Vi extends(pt(A(b))){static get is(){return"bbva-multistep-digital-account"}static get scopedElements(){return{"bbva-expandable-multistep":Nt,"bbva-header-main":St,"bbva-type-text":bt,"bbva-expandable-step":Tt,"bbva-multistep-digital-account-password":ye,"bbva-multistep-digital-account-personal-data":Fe,"bbva-multistep-digital-account-contact-data":Ye,"bbva-multistep-digital-account-contracts":ai,"bbva-multistep-digital-account-actual-address":ri,"bbva-list-definition-data":re,"bbva-list-simple":be,"bbva-badge-icon":Dt,"bbva-button-default":ut,"bbva-modal-digital-account-privacy-notice":Si,"bbva-modal-digital-account-number-ine":Ei,"bbva-modal-digital-account-personal-data":Ci,"bbva-modal-inquiry-authorization":Ai,"bbva-modal-offers-and-promos":Ti,"bbva-modal-digital-account-permissions-denied":wi,"bbva-modal-digital-account-successful-enrollment":Ri,"bbva-modal-digital-account-with-card":Ii,"bbva-modal-digital-account-channel-active":Ni,"bbva-modal-digital-account-with-alert":Pi,"bbva-modal-digital-account-error-phone":Di,"bbva-modal-digital-account-error-no-clients":Oi,"bbva-modal-digital-account-call-up":Li,"bbva-modal-digital-account-call-up-send":Mi}}static get properties(){return{bindedLiterals:{type:Object},_visibleLinkOcr:{type:Boolean},listPlaces:{type:Array},entitiesList:{type:Array},customer:{type:Object},isVisiblePanelButton:{type:Boolean},_date:{type:String},_isSigned:{type:Boolean},_sign:{type:String},errorValidationData:{type:Boolean},errorValidationDataRetry:{type:Boolean},signatureByteFile:{type:Object},isOcrEnabled:{type:Boolean},isBureauEnabled:{type:Boolean},_bureauConsultationAccepted:{type:Boolean},_informationNoticeAccepted:{type:Boolean},_verifyDataFlag:{type:Boolean},currentStep:{type:Number},_fromStep:{type:Number},_ocrData:{type:Object},_completedStepData:{type:Boolean},_isAddressStepEdited:{type:Boolean},isScanModalVisible:{type:Boolean},isIneModalVisible:{type:Boolean},isPrivacyNoticeModalVisible:{type:Boolean},isOffersAndPromosModalVisible:{type:Boolean},isBureauAuthorizationModalVisible:{type:Boolean},isPermissionsDeniedModalVisible:{type:Boolean},_verifyDataError:{type:Boolean},isNonBinaryGenderEnabled:{type:Boolean},isSuccessEnrollmentVisible:{type:Boolean},isWellcomeVisible:{type:Boolean},isErrorIneVisible:{type:Boolean},isErrorDataVisible:{type:Boolean},isErrorContractVisible:{type:Boolean},retryErrorType:{type:String},isWithCardVisible:{type:Boolean},isErrorPhoneVisible:{type:Boolean},isChannelActiveVisible:{type:Boolean},isWithAlertVisible:{type:Boolean},headerVariant:{type:String},transversalFlag:{type:Boolean},scanModalIne:{type:Boolean},isCallUpVisible:{type:Boolean},isCallUpSendVisible:{type:Boolean}}}constructor(){super(),this.bindedLiterals={},this._visibleLinkOcr=!0,this.listPlaces=[],this._postalCode="",this.entitiesList=[],this.customer={id:"",name:"",lastName:"",secondLastName:"",birthDate:"",birthPlace:"",gender:"",ocr:"",postalCode:"",street:"",colony:"",municipality:"",state:"",phoneNumber:"",emailAddress:"",signatureId:"",password:""},this.signatureByteFile="",this.isVisiblePanelButton=!1,this._date="",this._isSigned=!1,this._sign="",this.errorValidationData=!1,this.errorValidationDataRetry=!1,this.isOcrEnabled=!1,this.isBureauEnabled=!1,this._verifyDataFlag=!1,this.currentStep=0,this._fromStep=0,this._ocrData={},this._completedStepData=!1,this._isAddressStepEdited=!1,this.isScanModalVisible=!1,this.isIneModalVisible=!1,this.isPrivacyNoticeModalVisible=!1,this.isOffersAndPromosModalVisible=!1,this.isBureauAuthorizationModalVisible=!1,this.isPermissionsDeniedModalVisible=!1,this._verifyDataError=!1,this.isNonBinaryGenderEnabled=!1,this.isSuccessEnrollmentVisible=!1,this.isErrorIneVisible=!1,this.isErrorDataVisible=!1,this.isWithCardVisible=!1,this.retryErrorType="",this.isErrorPhoneVisible=!1,this.isChannelActiveVisible=!1,this.isErrorContractVisible=!1,this.isWithAlertVisible=!1,this.headerVariant="modal-initial",this.transversalFlag=!1,this.scanModalIne=!1,this.isCallUpVisible=!1,this.isCallUpSendVisible=!1}static get styles(){return[ue,oe.dark,Ot.secondary,ce.dark,v("bbva-multistep-digital-account-shared-styles")]}setCalendarDate({selectedDate:t}){this._date=t}errorData(t){this.errorValidationData=t}get _personalDataSummaryItemsTemplate(){var t;const e="open-digital-account-multistep-step-one-summary-";return[{key:"name",value:`${this.customer.name} ${this.customer.lastName} ${this.customer.secondLastName}`},{key:"birth-date",value:this.customer.birthDate.split("-").reverse().join("/")},{key:"birth-place",value:this.customer.birthPlace},{key:"nationality",value:"mexican",valueHasLocale:!0},{key:"gender",value:null===(t=this.customer.gender.id)||void 0===t?void 0:t.toLowerCase().replace("_","-"),valueHasLocale:!0},{key:"ine-number",value:this.customer.ocr}].map((t=>{const i=this.t(e+t.key),a=t.valueHasLocale?this.t(e+t.value):t.value;return f`
        <div class="divSummary">
          <bbva-type-text
            font-weight="500"
            text=${i}
            size="S"
            unset>
          </bbva-type-text>

          <bbva-type-text
            text=${a}
            size="S"
            unset>
          </bbva-type-text>
        </div>
      `}))}get _contactDataSummaryItemsTemplate(){const t="open-digital-account-multistep-step-three-form-",e=this.t(`${t}phone-number-label`),i=this.customer.phoneNumber,a=this.t(`${t}email-address`),s=this.customer.emailAddress;return f`
      <div class="divSummary">
        <bbva-type-text
          font-weight="500"
          text=${e}
          size="S"
          unset>
        </bbva-type-text>
        <bbva-type-text
          text=${i}
          size="S"
          unset>
        </bbva-type-text>
      </div>

      <div class="divSummary">
        <bbva-type-text
          font-weight="500"
          text=${a}
          size="S"
          unset>
        </bbva-type-text>
        <bbva-type-text
          text=${s}
          size="S"
          unset>
        </bbva-type-text>
      </div>
    `}render(){return f`
      <bbva-header-main
        id="headerDigitalAccountMultistep"
        variant="${this.headerVariant}"
        text=${this.transversalFlag?this.t("open-digital-account-multistep-header-title-transversal"):this.t("open-digital-account-multistep-header-title")}
        icon-right-primary="bbva:close"
        accessibility-text-icon-right-primary="Close Flow"
        @header-main-icon-click=${this.closeHeaderMain}
      ></bbva-header-main>
      <bbva-expandable-multistep
        id="multistep-digital-account"
        has-animation
        class="scrollable"
        step-selector="[data-tag-name='bbva-expandable-step']"
        @expandable-step-edit-step=${this._editStep}
        @expandable-multistep-scroll-animation-end=${this._scrollAnimationEnd}
      >
      <div slot="content">
          <bbva-expandable-step
            class="animation"
            id="personal-data-step"
            optional-label=""
            edit-label=""
            header=${this.t("open-digital-account-multistep-step-one-title")}
            step="0"
            total-steps="5"
            @complete=${()=>{this.currentStep=1}}
            @expandable-step-complete-change=${({detail:t})=>{this._completedStepData=t}}
          >
            <bbva-multistep-digital-account-personal-data
              class="content"
              .verifyDataFlag=${this._verifyDataFlag}
              .listEntity=${this.entitiesList}
              .ocrEnabled=${this.isOcrEnabled}
              .birthDate=${this._date}
              .ocrData=${this._ocrData}
              .interaction=${this.bindedLiterals}
              .verifyDataError=${this._verifyDataError}
              .genderOptions=${this._genderOptions}
              .isNonBinaryGenderEnabled=${this.isNonBinaryGenderEnabled}
              @tmp-user-data=${this.generateCustomerData}
              @first-step-interaction=${this.firstInteraction}
              @handle-scan-modal=${()=>this._handlerModalVisibility("isScanModalVisible")}
              @handle-identification-modal=${()=>this._handlerModalVisibility("isIneModalVisible")}
            ></bbva-multistep-digital-account-personal-data>
            </bbva-multistep-digital-account-personal-data>

            <div
              class="summary"
              slot="summary"
              ambient="dark">
                ${this._personalDataSummaryItemsTemplate}
            </div>
            </bbva-expandable-step>

            <bbva-expandable-step
              class="animation"
              id="address-data-step"
              header=${this.t("open-digital-account-multistep-step-two-title")}
              step="1"
              total-steps="5"
              show-link
              edit-label="${this.t("open-digital-account-multistep-step-generic-button-edit")}"
              @expandable-step-edit-step=${this._handleStep2EditButton}
              @complete=${this._handleCompleteAfterEditStep2}
            >
             <bbva-multistep-digital-account-actual-address
                class="content"
                ?disabledFields=${1!==this.currentStep}
                ?stepData=${this._completedStepData}
                .ocrData=${this._ocrData}
                .listPlaces=${this.listPlaces}
                @get-postal-code=${this._handleGetPostalCode}
                @customer-address-data=${this.generateCustomerData}
                @complete-step=${this.completeStepTwo}
              ></bbva-multistep-digital-account-actual-address>

              <div class="summary" slot="summary" ambient="dark">
                <div class="divSummary">
                  <bbva-type-text
                    id="summaryText"
                    text=${this._addressData[0].value}
                    size="S"
                    unset>
                  </bbva-type-text>
                </div>
              </div>
            </bbva-expandable-step>

            <bbva-expandable-step
              class="animation"
              id="contact-data-step"
              header=${this.t("open-digital-account-multistep-step-three-title")}
              step="2"
              total-steps="5"
              edit-label=""
              @complete=${()=>{this.currentStep=3}}
            >
              <bbva-multistep-digital-account-contact-data
                class="content"
                ?disabledFields=${2!==this.currentStep}
                .bureauEnabled=${this.isBureauEnabled}
                @customer-contact-data=${this.generateCustomerData}
                @request-create-customer=${this.sendCustomerData}
                @handle-privacy-notice-modal=${()=>this._handlerModalVisibility("isPrivacyNoticeModalVisible")}
              ></bbva-multistep-digital-account-contact-data>

              <div
                class="summary"
                slot="summary"
                ambient="dark"
              >
                ${this._contactDataSummaryItemsTemplate}
              </div>
            </bbva-expandable-step>

            <bbva-expandable-step
              class="animation"
              id="contracts-data-step"
              header=${this.transversalFlag?this.t("open-digital-account-multistep-step-four-title-transversal"):this.t("open-digital-account-multistep-step-four-title")}
              step="3"
              total-steps="5"
              show-link
              edit-label="${this.transversalFlag?this.t("open-digital-account-multistep-step-contracts-button-edit-transversal"):this.t("open-digital-account-multistep-step-generic-button-edit")}"
              @expandable-step-edit-step=${()=>{this._fireAnalyticEventEdit(4)}}
              @complete=${()=>{this.currentStep=4}}
            >
              <bbva-multistep-digital-account-contracts
                class="content"
                ?transversalFlag=${this.transversalFlag}
                ?isLoadingFiles=${3!==this.currentStep}
                .isSigned=${this._isSigned}
                .sign=${this._sign}
                .bureauEnabled=${this.isBureauEnabled}
                @customer-contracts-data=${this.handleByteFile}
                @bureau-consultation=${this.handleBureauConsultation}
                @information-notice=${this.handleInformationNotice}
                @handle-modal-bureau=${()=>this._handlerModalVisibility("isBureauAuthorizationModalVisible")}
                @handle-modal-offers-and-promos=${()=>this._handlerModalVisibility("isOffersAndPromosModalVisible")}
              ></bbva-multistep-digital-account-contracts>
              <div
                class="summary"
                slot="summary"
                ambient="dark"
              >
                <bbva-badge-icon
                  status="checked"
                  description="${this.t("open-digital-account-multistep-contracts-summary-title")}"
                ></bbva-badge-icon>
              </div>
            </bbva-expandable-step>

            <bbva-expandable-step
              class="animation"
              id="password-data-step"
              header=${this.t("open-digital-account-multistep-step-five-title")}
              step="4"
              show-link
              total-steps="5"
              edit-label="${this.t("open-digital-account-multistep-step-generic-button-edit")}"
              @expandable-step-edit-step=${()=>{this._fireAnalyticEventEdit(5)}}
              @complete=${()=>{this.currentStep=5}}
            >
              <bbva-multistep-digital-account-password
                class="content"
                ?disabledFields=${4!==this.currentStep}
                @customer-password-data=${this.generateCustomerData}
                @complete-step=${this.completeStepFive}
              ></bbva-multistep-digital-account-password>
              <div
                class="summary"
                slot="summary"
                ambient="dark"
              >
                <bbva-list-simple label="${this.t("open-digital-account-password-mock")}"></bbva-list-simple>
              </div>
            </bbva-expandable-step>
          </div>
        <div class="confirm-step" slot="confirmation" ambient="primary">
          <bbva-button-default
            fullwidth
            variant="positive"
            text=${this.t("open-digital-account-multistep-create-account")}
            class="button"
            @click=${this._createAccount}>
          </bbva-button-default>
        </div>
      </bbva-expandable-multistep>
      <bbva-modal-digital-account-personal-data
        .isModalVisible=${this.isScanModalVisible}
        ?hidden=${this.scanModalIne}
        @help-modal-header-click=${()=>this._handlerModalVisibility("isScanModalVisible")}
        @help-modal-footer-button-click=${this._initScan}
      ></bbva-modal-digital-account-personal-data>
      <bbva-modal-digital-account-number-ine
        .isModalVisible=${this.isIneModalVisible}
        @help-modal-header-click=${()=>this._handlerModalVisibility("isIneModalVisible")}
        @help-modal-footer-button-click=${()=>this._handlerModalVisibility("isIneModalVisible")}
      ></bbva-modal-digital-account-number-ine>
      <bbva-modal-digital-account-privacy-notice
        id="digital-account-privacy-modal"
        .isModalVisible=${this.isPrivacyNoticeModalVisible}
        @help-modal-header-click=${()=>this._handlerModalVisibility("isPrivacyNoticeModalVisible")}
        @help-modal-footer-button-click=${()=>this._handlerModalVisibility("isPrivacyNoticeModalVisible")}
      ></bbva-modal-digital-account-privacy-notice>
      <bbva-modal-offers-and-promos
        .isModalVisible=${this.isOffersAndPromosModalVisible}
        @help-modal-header-click=${()=>this._handlerModalVisibility("isOffersAndPromosModalVisible")}
        @help-modal-footer-button-click=${()=>this._handlerModalVisibility("isOffersAndPromosModalVisible")}
      ></bbva-modal-offers-and-promos>
      <bbva-modal-inquiry-authorization
        id="bureauAuthorizationItem"
        .isModalVisible=${this.isBureauAuthorizationModalVisible}
        @help-modal-header-click=${()=>this._handlerModalVisibility("isBureauAuthorizationModalVisible")}
        @help-modal-footer-button-click=${()=>this._handlerModalVisibility("isBureauAuthorizationModalVisible")}
      ></bbva-modal-inquiry-authorization>
      <bbva-modal-digital-account-permissions-denied
        .isModalVisible=${this.isPermissionsDeniedModalVisible}
        @help-modal-header-click=${()=>this._handlerModalVisibility("isPermissionsDeniedModalVisible")}
        @help-modal-footer-link-click=${()=>this._handlerModalVisibility("isPermissionsDeniedModalVisible")}
        @help-modal-footer-button-click=${this._footerButtonClickDenyPermissionsModal}>
      </bbva-modal-digital-account-permissions-denied>
      <bbva-modal-digital-account-successful-enrollment
        .isModalVisible=${this.isSuccessEnrollmentVisible}
        mail=${this._subtractEmail()}
        @help-modal-header-click=${()=>this._successEnrolmentTransversal("isSuccessEnrollmentVisible")}
        @help-modal-footer-button-click=${()=>this._successEnrolmentTransversal("isSuccessEnrollmentVisible")}>
      </bbva-modal-digital-account-successful-enrollment>
      <bbva-modal-digital-account-error-no-clients
        .isModalVisible=${this.isErrorIneVisible||this.isErrorDataVisible||this.isErrorContractVisible}
        errorType=${this.retryErrorType}
        @error-ine-exit=${()=>this._errorTransversal("isErrorIneVisible")}
        @error-ine=${()=>this._handlerModalVisibility("isErrorIneVisible")}
        @error-data-exit=${()=>this._errorTransversal("isErrorDataVisible")}
        @error-data=${()=>this._handlerModalVisibility("isErrorDataVisible")}
        @error-contract-exit=${()=>this._errorTransversal("isErrorContractVisible")}
        @error-contract=${()=>this._handlerModalVisibility("isErrorContractVisible")}>
      </bbva-modal-digital-account-error-no-clients>
      <bbva-modal-digital-account-with-card
        .isModalVisible=${this.isWithCardVisible}
        @help-modal-header-click=${()=>this._errorTransversal("isWithCardVisible")}
        @help-modal-footer-button-click=${()=>this._errorTransversal("isWithCardVisible")}>
      </bbva-modal-digital-account-with-card>
      <bbva-modal-digital-account-error-phone
        .isModalVisible=${this.isErrorPhoneVisible}
        @help-modal-header-click=${()=>this._errorTransversal("isErrorPhoneVisible")}
        @help-modal-footer-button-click=${()=>this._errorTransversal("isErrorPhoneVisible")}>
      </bbva-modal-digital-account-error-phone>
      <bbva-modal-digital-account-channel-active
        .isModalVisible=${this.isChannelActiveVisible}
        @help-modal-header-click=${()=>this._errorTransversal("isChannelActiveVisible")}
        @help-modal-footer-button-click=${()=>this._errorTransversal("isChannelActiveVisible")}>
      </bbva-modal-digital-account-channel-active>
      <bbva-modal-digital-account-with-alert
      .isModalVisible=${this.isWithAlertVisible}
      @help-modal-header-click=${()=>this._errorTransversal("isWithAlertVisible")}
      @help-modal-footer-button-click=${()=>this._errorTransversal("isWithAlertVisible")}>
    </bbva-modal-digital-account-with-alert>
    <bbva-modal-digital-account-call-up
        .isModalVisible=${this.isCallUpVisible}
        @help-modal-header-click=${()=>this._sendCallUp("isCallUpVisible")}
        @help-modal-footer-button-click=${()=>this._sendCallUp("isCallUpVisible")}>
      </bbva-modal-digital-account-call-up>
      <bbva-modal-digital-account-call-up-send
        .isModalVisible=${this.isCallUpSendVisible}
        @progress-timer-counter-finish=${()=>this.callupSuccess("isCallUpSendVisible")}>
    </bbva-modal-digital-account-call-up-send>
    `}_sendCallUp(t){this._handlerModalVisibility(t),this._handlerModalVisibility("isCallUpSendVisible"),me(this,"call-send-call-up-request",this.customer);const e=this.shadowRoot.querySelector('[data-tag-name="bbva-modal-digital-account-call-up-send"]'),i=e.shadowRoot.querySelector('[data-tag-name="bbva-progress-timer"]');e.timer=6e4,i.reset(),i.start()}callupSuccess(t){this._handlerModalVisibility(t),me(this,"go-back-login")}callupError(){this._handlerModalVisibility("isCallUpSendVisible"),this.showModalsErrorTransversal("contract")}_subtractEmail(){const t=this.customer.emailAddress.split("@");return`•${t[0].substr(-3)}@${t[1]}`}_errorTransversal(t){this._handlerModalVisibility(t),me(this,"go-back-login")}_successEnrolmentTransversal(t){this._handlerModalVisibility(t),this._handlerModalVisibility("isCallUpVisible")}_handleCompleteAfterEditStep2(){this._isAddressStepEdited?(this.currentStep=this._fromStep,this._fireAnalyticEventEdit(this._fromStep)):this.currentStep=2}_handleStep2EditButton(){this._isAddressStepEdited=!0,this._fromStep=this.currentStep,this._fireAnalyticEventEdit(2)}setFlags(t){t&&(this.isOcrEnabled=null==t?void 0:t.onOffOcrN2,this.isBureauEnabled=null==t?void 0:t.onOffCheckCreditBureau)}retryIntelligetExtractModalAccept(){this.shadowRoot.querySelector("bbva-multistep-digital-account-personal-data").openOrCloseScanModal()}retryContactDataModalAccept(){this.sendCustomerData()}getIntelligentExtractDone(t){this._ocrData=t}showVerifyDataItem(){this._verifyDataFlag=!0}resetSteps(){const t=["personal-data","actual-address","contact-data","contracts","password"],e=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]'),i=Array.from(this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]'));me(i[0],"expandable-step-edit-step",0),e.updateComplete.then((()=>{i.forEach(((e,i)=>{const a=e;this.shadowRoot.querySelector(`[data-tag-name="bbva-multistep-digital-account-${t[i]}"`).reset(),a.completed=!1,a.disabled=0!==i,a.active=0===i})),this._completedStepData=!1,this._isSigned=!1,this._sign="",this.isVisiblePanelButton=!1,this.listPlaces=[],this.currentStep=0,this.transversalFlag=!1}))}completeStep(t){this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]').hideDisabledSteps=!0;const e=this.shadowRoot.querySelector(`[data-tag-name="${t.step}"`),i={1:this.bindedLiterals.STEP_2,2:this.bindedLiterals.STEP_3,3:this.bindedLiterals.STEP_4,4:this.bindedLiterals.STEP_5};5!==t.index?me(this,`go-to-step-${i[t.index]}`):me(this,"go-to-summary"),e.completeStep()}completeStepTwo(){this.completeStep({index:2,step:"bbva-multistep-digital-account-actual-address"})}completeStepFive(){this.completeStep({index:5,step:"bbva-multistep-digital-account-password"})}firstInteraction(t){me(this,"analytics-first-interaction",{detail:t.detail})}_fireAnalyticEventEdit(t){const e={2:this.bindedLiterals.STEP_2,4:this.bindedLiterals.STEP_4,5:this.bindedLiterals.STEP_5};me(this,`go-to-step-${e[t]}`)}_createAccount(){this.transversalFlag?this.flagAlertsTransversal?this.createAccountTransversal():me(this,"send-phone-otp-datamanager",this.customer.phoneNumber):this._createAccountN2()}_createAccountN2(){me(this,"tmp-account-data",{name:this.customer.name,lastName:this.customer.lastName,secondLastName:this.customer.secondLastName,customerId:this.customer.id,phoneNumber:this.customer.phoneNumber,email:this.customer.emailAddress,signatureId:this.customer.signatureId,password:this.customer.password,informationNotice:this._informationNoticeAccepted,bureauConsultationAccepted:this._bureauConsultationAccepted})}retryRequestOtp(){setTimeout((()=>{this._createAccount()}),500)}retryPostalCode(){me(this,"request-postal-code",{zipCode:this._postalCode,"catalog.id":"SEPOMEX","geographicPlaceType.id":"COLONY"})}get _addressData(){const{street:t,postalCode:e,colony:i,municipality:a,state:s}=this.customer,o=this.t("open-digital-account-multistep-step-two-address-data-not-available");return[{value:this.t("open-digital-account-multistep-step-two-address-data-label",{street:t||o,postalCode:e||o,colony:i||o,municipality:a||o,state:s||o})}]}_handleGetPostalCode(t){this._postalCode=t.detail,me(this,"request-postal-code",{zipCode:this._postalCode,"catalog.id":"SEPOMEX","geographicPlaceType.id":"COLONY"})}get _actualAddressElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-multistep-digital-account-actual-address"]')}setListPlaces(t){this.listPlaces=t}showInvalidPostalCode(){this._actualAddressElement.setInvalidPostalCodeState(),this.listPlaces=[]}generateCustomerData(t){Object.assign(this.customer,t.detail),this.requestUpdate()}handleByteFile(t){this.signatureByteFile=t.detail.signatureByteFile,this.requestUpdate(),me(this,"request-create-signature",{file:this.signatureByteFile,customerId:this.customer.id})}handleBureauConsultation(t){this._bureauConsultationAccepted=t.detail.checked,this.requestUpdate()}handleInformationNotice(t){this._informationNoticeAccepted=t.detail.checked,this.requestUpdate()}sendCustomerData(){me(this,"create-customer-request",this.customer)}civilRegistriesHandler(t){const[e]=t;Object.assign(this.customer,{curp:e.identityDocuments[0].documentNumber,country:e.identityDocuments[0].country.id}),this.requestUpdate()}receiveSign(t){t&&t.sign&&(this._isSigned=!0,this._sign=t.sign)}createCustomerResponse(t){this.customer.id=t.id,this.requestUpdate()}createSignatureResponse(t){this.customer.signatureId=t.id,this.requestUpdate()}exitMultistepFlow(){me(this,"go-to-landing")}closeHeaderMain(){me(this,"go-back")}setHardDataIntoRecordList(){me(this,"hard_list_records",qi)}_scrollAnimationEnd(){this.headerVariant="modal-initial-secondary";const t=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]'),e=t.allCompleted;t.hideDisabledSteps=!1,e&&(this.isVisiblePanelButton=e)}_editStep(t){const e=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]'),i=t.detail;this.currentStep=i,this.isVisiblePanelButton=!1,e.hideDisabledSteps=!0}_initScan(){this._handlerModalVisibility("isScanModalVisible"),me(this,"open-document-capture")}showModalsErrorTransversal(t){this.retryErrorType=t,this._handlerModalVisibility({success:"isSuccessEnrollmentVisible",card:"isWithCardVisible",exists:"isWithAlertVisible",phone:"isErrorPhoneVisible",alert:"isWithAlertVisible",channel:"isChannelActiveVisible",data:"isErrorDataVisible",contract:"isErrorContractVisible",ine:"isErrorIneVisible",generic:"isErrorContractVisible"}[t])}_footerButtonClickDenyPermissionsModal(){this._handlerModalVisibility("isPermissionsDeniedModalVisible"),me(this,"footer-button-click-deny-permissions-modal")}_handlerModalVisibility(t){this[t]=!this[t],this.isScanModalVisible&&me(this,"open-recomendations-modal"),"isScanModalVisible"===t&&me(this,"send-analytic-scan-ine"),"isIneModalVisible"===t&&me(this,"send-analytic-ine-number")}openModalRecomendation(){this._handlerModalVisibility("isScanModalVisible")}errorPersonalData(t){(t[0].auditLog.validationResults.length>=15||!t[0].id)&&(this._verifyDataError=!0)}get _genderOptions(){const t=[{label:"open-digital-account-multistep-step-one-form-gender-male-label",value:"open-digital-account-multistep-step-one-form-gender-male-value",selector:0},{label:"open-digital-account-multistep-step-one-form-gender-female-label",value:"open-digital-account-multistep-step-one-form-gender-female-value",selector:1}];return this.isNonBinaryGenderEnabled&&t.push({label:"open-digital-account-multistep-step-one-form-gender-non-binary-label",value:"open-digital-account-multistep-step-one-form-gender-non-binary-value",selector:2}),t}createAccountTransversal(){const t={customerId:this.customer.id,phoneNumber:this.customer.phoneNumber,signatureId:this.customer.signatureId,password:this.customer.password};me(this,"tmp-account-data-digital-activation",t)}sendPhoneOtp(){me(this,"send-phone-otp-datamanager",this.customer.phoneNumber)}}customElements.define(Vi.is,Vi);let Hi=class{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let s=0|e,o=Math.max(s>=0?s:a-Math.abs(s),0);for(;o<a;){if((r=i[o])===(n=t)||"number"==typeof r&&"number"==typeof n&&isNaN(r)&&isNaN(n))return!0;o++}var r,n;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],a=0,s="",o=0,r=arguments.length;o!==r;++o){var n=+arguments[o];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?a=i.push(n):(n-=65536,a=i.push(55296+(n>>10),n%1024+56320)),a>=16383&&(s+=t.apply(null,i),i.length=0)}return s+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}},Bi=class extends Hi{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}};const Fi=0,zi=1,ji="jwt",Ui="tsec",Gi="none";let Xi=class extends Hi{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Fi,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Bi,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Ui:this.requiredToken=Gi,this.requiresJWT=!1):this.requiredToken===Ui?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ji?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Gi?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Ui)}_setJwtHandler(){this._setTokenHandler(ji)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,a)=>{e=Object.assign(e,{resolve:i,reject:a}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=ct),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),a=e[i];return a?delete e[i]:this._error(9,`Missing ${i} param value`),a})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===zi?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Ui,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(ji,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=e.getItem(i);a&&"null"!==a&&(t[i]=a)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,a)=>(e[a.replace(t,"")]=i.getItem(a),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,a=t===ji?"JWT ":"",s=t===ji?"Authorization":Ui;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let r=this[i].getItem(o);r?e[s]=e[s]||a+r:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const a=new Promise(((t,e)=>{i=(i,a)=>{i?e(i):t(a)}}));return e.addEventListener("loadend",(function t(a){e.removeEventListener("loadend",t),a.error?i(a.error):i(null,e.result)})),e.readAsText(t),a}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let a=t[i],s=0,o=0;if(a<=127?(s=0,o=255&a):a<=223?(s=1,o=31&a):a<=239?(s=2,o=15&a):a<=244&&(s=3,o=7&a),t.length-i-s>0){let e=0;for(;e<s;)a=t[i+e+1],o=o<<6|63&a,e+=1}else o=65533,s=t.length-i;e+=String.fromCodePoint(o),i+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let a=": ",s=i[t].split(a);e[s.shift().toLowerCase()]=s.join(a)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,a){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(a)>=0&&(s=e.getResponseHeader(a));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[a])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(i,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,a,s,o;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),a=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),o=t.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(t.headers);e=r.authenticationtype,i=r.authenticationdata||null,a=r.authenticationstate,s=r.authenticationchallenge,o=r.authenticationresponse}return{type:e,data:i,state:a,challenge:s,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const a=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",a=""){let s;if("object"==typeof t&&t){const o=this._getSignatureData(t.signatureType,e,i);s=this._makeKeyValuePairFromObject(o,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,a)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",a)):(s=`${i}=${t}`,this._buildSignatureHeaders(s,e,a)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,a=t.split(",");if(a.length>1){i=a.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:o,data:r,state:n,challenge:l,response:d}=this._extractSignatureResponseHeaders(t),c=this._getRequestMetadata(t);if(s)this._notifySignatureInvalid(c),i=!0;else if(o)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,c,o,r,n,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,o,r,n,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(a),o=this._getRequestMetadata(t);s&&(this._notifyWaitingForProcessResponse(o),i=!0)}return i}_notifySignatureRequiredFirstStep(t,e,i,a){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,a,s,o){this._defineSignatureValue(e,i,a);const r={type:e,data:i,challenge:s,metadata:t};o&&(r.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const a=e.split(";").findIndex((e=>e===t));return i?i.split(";")[a]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,a,s,o){a?this._notifySignatureRequired(t,e,i,a,s,o):this._notifySignatureRequiredFirstStep(t,e,i,a)}_notifySignatureTypeUsingErrorCode(t,e,i,a,s,o,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,a,s):this._notifySignatureRequired(e,i,a,s,o,r)}};class Wi extends Xi{constructor(t=null){super(Object.assign(t||{},{method:"DELETE"}))}toString(t=""){return super.toString(t||"BGADPRequestDELETE")}}let Ji=class extends Xi{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}};class Ki extends Xi{constructor(t=null){super(Object.assign(t||{},{method:"POST"}))}toString(t=""){return super.toString(t||"BGADPRequestPOST")}}class Yi extends Wi{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`document-processes/v${this.version}/namespaces/{ns-id}/intelligent-extract/extractions/{extraction-id}`)}toString(){return super.toString("BGADPMxDocumentProcessesNamespacesNsIntelligentExtractExtractionsExtractionDeleteV0")}}class Qi extends Ji{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`document-processes/v${this.version}/namespaces/{ns-id}/intelligent-extract/extractions/{extraction-id}`)}toString(){return super.toString("BGADPMxDocumentProcessesNamespacesNsIntelligentExtractExtractionsExtractionGetV0")}}class Zi extends Ki{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`document-processes/v${this.version}/namespaces/{ns-id}/intelligent-extract/upload`)}toString(){return super.toString("BGADPMxDocumentProcessesNamespacesNsIntelligentExtractUploadPostV0")}}class ta extends(ht(b)){static get is(){return"bbva-dataprovider-document-processes"}static get properties(){return{host:{type:String},native:{type:Boolean},version:{type:String},requiredToken:{type:String,attribute:"requiredToken"},nsId:{type:String,attribute:"ns-id"},extractionId:{type:String,attribute:"extraction-id"}}}constructor(){super(),this.host="",this.native=!1,this.version="",this.requiredToken="tsec",this.nsId="",this.extractionId=""}postIntelligentExtractUpload(t){const e=new FormData;e.append("rootPart",new Blob([t.rootPart],{type:"application/json"}));const i=Array.isArray(t.files)?t.files:[t.files];for(const t of i)e.append("files",t);const a={host:this.host,native:this.native,headers:{"Accept-Language":"es","Content-Type":"multipart/form-data"},version:this.version,requiredToken:this.requiredToken,params:{"ns-id":this.nsId},body:this.native?"":e,multipart:this.native?t.multipart:"",htmlContext:this},s=ta._serviceDocumentProcessesNamespacesNsIntelligentExtractUploadPostV0(a);this._generateGetService(s,{customEvent:"post-intelligent-extract-upload-success",errorFireEventHandler:"post-intelligent-extract-upload-error"})}static _serviceDocumentProcessesNamespacesNsIntelligentExtractUploadPostV0(t){return new Zi(t)}getIntelligentExtractExtractions(){const t={host:this.host,native:this.native,version:this.version,requiredToken:this.requiredToken,params:{"ns-id":this.nsId,"extraction-id":this.extractionId,expand:"datapoints"},htmlContext:this},e=ta._serviceDocumentProcessesNamespacesNsIntelligentExtractExtractionsExtractionGetV0(t);this._generateGetService(e,{customEvent:"get-intelligent-extract-get-success",errorFireEventHandler:"get-intelligent-extract-get-error"})}static _serviceDocumentProcessesNamespacesNsIntelligentExtractExtractionsExtractionGetV0(t){return new Qi(t)}deleteIntelligentExtractExtractions(){const t={host:this.host,native:this.native,version:this.version,requiredToken:this.requiredToken,params:{"ns-id":this.nsId,"extraction-id":this.extractionId},htmlContext:this},e=ta._serviceDocumentProcessesNamespacesNsIntelligentExtractExtractionDeleteV0(t);this._generateGetService(e,{customEvent:"delete-intelligent-extract-delete-success",errorFireEventHandler:"delete-intelligent-extract-delete-error"})}static _serviceDocumentProcessesNamespacesNsIntelligentExtractExtractionDeleteV0(t){return new Yi(t)}}customElements.define(ta.is,ta);class ea{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let s=0|e,o=Math.max(s>=0?s:a-Math.abs(s),0);for(;o<a;){if((r=i[o])===(n=t)||"number"==typeof r&&"number"==typeof n&&isNaN(r)&&isNaN(n))return!0;o++}var r,n;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],a=0,s="",o=0,r=arguments.length;o!==r;++o){var n=+arguments[o];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?a=i.push(n):(n-=65536,a=i.push(55296+(n>>10),n%1024+56320)),a>=16383&&(s+=t.apply(null,i),i.length=0)}return s+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}}class ia extends ea{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const aa=0,sa=1,oa="jwt",ra="tsec",na="none";class la extends ea{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=aa,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new ia,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ra:this.requiredToken=na,this.requiresJWT=!1):this.requiredToken===ra?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===oa?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===na?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ra)}_setJwtHandler(){this._setTokenHandler(oa)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,a)=>{e=Object.assign(e,{resolve:i,reject:a}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=ct),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),a=e[i];return a?delete e[i]:this._error(9,`Missing ${i} param value`),a})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===sa?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(ra,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(oa,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=e.getItem(i);a&&"null"!==a&&(t[i]=a)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,a)=>(e[a.replace(t,"")]=i.getItem(a),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,a=t===oa?"JWT ":"",s=t===oa?"Authorization":ra;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let r=this[i].getItem(o);r?e[s]=e[s]||a+r:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const a=new Promise(((t,e)=>{i=(i,a)=>{i?e(i):t(a)}}));return e.addEventListener("loadend",(function t(a){e.removeEventListener("loadend",t),a.error?i(a.error):i(null,e.result)})),e.readAsText(t),a}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let a=t[i],s=0,o=0;if(a<=127?(s=0,o=255&a):a<=223?(s=1,o=31&a):a<=239?(s=2,o=15&a):a<=244&&(s=3,o=7&a),t.length-i-s>0){let e=0;for(;e<s;)a=t[i+e+1],o=o<<6|63&a,e+=1}else o=65533,s=t.length-i;e+=String.fromCodePoint(o),i+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let a=": ",s=i[t].split(a);e[s.shift().toLowerCase()]=s.join(a)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,a){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(a)>=0&&(s=e.getResponseHeader(a));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[a])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(i,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,a,s,o;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),a=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),o=t.getResponseHeader("AuthenticationResponse");else{let r=JSON.parse(t.headers);e=r.authenticationtype,i=r.authenticationdata||null,a=r.authenticationstate,s=r.authenticationchallenge,o=r.authenticationresponse}return{type:e,data:i,state:a,challenge:s,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const a=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",a=""){let s;if("object"==typeof t&&t){const o=this._getSignatureData(t.signatureType,e,i);s=this._makeKeyValuePairFromObject(o,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,a)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",a)):(s=`${i}=${t}`,this._buildSignatureHeaders(s,e,a)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,a=t.split(",");if(a.length>1){i=a.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:o,data:r,state:n,challenge:l,response:d}=this._extractSignatureResponseHeaders(t),c=this._getRequestMetadata(t);if(s)this._notifySignatureInvalid(c),i=!0;else if(o)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,c,o,r,n,l,d),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,o,r,n,l,d),i=!0}return i}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(a),o=this._getRequestMetadata(t);s&&(this._notifyWaitingForProcessResponse(o),i=!0)}return i}_notifySignatureRequiredFirstStep(t,e,i,a){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,a,s,o){this._defineSignatureValue(e,i,a);const r={type:e,data:i,challenge:s,metadata:t};o&&(r.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:r}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const a=e.split(";").findIndex((e=>e===t));return i?i.split(";")[a]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,a,s,o){a?this._notifySignatureRequired(t,e,i,a,s,o):this._notifySignatureRequiredFirstStep(t,e,i,a)}_notifySignatureTypeUsingErrorCode(t,e,i,a,s,o,r){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,a,s):this._notifySignatureRequired(e,i,a,s,o,r)}}class da extends la{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class ca extends da{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`catalogs/v${this.version}/catalogs/{catalog-id}/records`)}toString(){return super.toString("BGADPCatalogsCatalogRecordsGetV0")}}class ha extends(ht(b)){static get is(){return"bbva-dataprovider-catalogs"}static get properties(){return{catalogId:{type:String},_bgadpNotExistMessage:{type:String}}}constructor(){super(),this.catalogId="",this.timeout=120,this.requiredToken="tsec",this.version="0",this.htmlContext=this,this._bgadpNotExistMessage="BGADP called not exist"}getCatalogsCatalogRecords({params:t={},isRequiredOTP:e=!1}={}){this.requiredOTP=e;const i={customEvent:`get-catalogs-catalog-record-get-v${this.version}-success`,errorFireEventHandler:`get-catalogs-catalog-record-get-v${this.version}-error`};this._generateServiceRequest({params:{"catalog-id":this.catalogId,...t},service:"getCatalogsCatalogRecords",events:i})}_generateServiceRequest({params:t,service:e,events:i,body:a=null}){const s=this._getServiceParams(t,a);this._generateGetService(this._getServicePath(e,this._getBgadp(s)),i,this._responseMapping)}_getBgadp(t){return{getCatalogsCatalogRecordsV0:()=>new ca(t),default:()=>this._bgadpNotExistMessage}}}customElements.define(ha.is,ha),customElements.define(Lt.is,Lt),customElements.define(Ut.is,Ut),customElements.define(Gt.is,Gt),customElements.define(Xt.is,Xt),customElements.define(Wt.is,Wt),customElements.define(Jt.is,Jt),customElements.define(Kt.is,Kt),customElements.define(Yt.is,Yt),customElements.define(Qt.is,Qt);
