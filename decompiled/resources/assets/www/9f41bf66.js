import{z as t,a8 as a,ak as e,h as o,ar as r,aa as i,aE as n,a as c,aF as l,aG as s,ag as b,af as d,aH as u,i as v,ab as p,ac as m,a9 as h,bc as g,al as y,au as f,b0 as $,at as k,as as _,aJ as x,an as S,L as C,aw as P,bh as w,aK as L,ae as M,b6 as T,ch as q,ci as D,bx as E,av as A,g as I,ap as R,aW as B,eA as z,bF as N,ad as V,be as F,cE as j,F as H,dv as O,da as X,aV as W,cG as U,f as G,ah as Y,cU as J,ai as K,aN as Z,dj as Q,dB as tt,b5 as at}from"./952f98a9.js";import{C as et}from"./f0105dbd.js";import{ao as ot}from"./7f3d7ca9.js";import{B as rt}from"./c1760245.js";import"./7e03d322.js";import{B as it}from"./ca1bc295.js";import"./4d1e2af0.js";import"./9e155770.js";import"./b24c6aae.js";import{b as nt}from"./055a082b.js";import{b as ct}from"./e32b4658.js";import"./3990b0e0.js";const lt="#004481",st="#ffffff",bt="#043263",dt="#1464A5",ut="#1973B8",vt="#2DCCCD",pt="#028484",mt="#BDBDBD",ht="#D3D3D3",gt="#E9E9E9",yt="#F4F4F4";var ft=t`:host {
  position: relative;
  width: auto;
  max-width: 100%;
  min-width: var(--bbva-button-default-min-width, 8.75rem);
  min-height: 3rem;
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a("8")}))) / 15) * 1em);
  font-size: var(--bbva-button-default-font-size, var(--typographyTypeSmall, ${a("0.9375rem")}));
  line-height: var(--bbva-button-default-line-height, var(--lineHeightTypeSmall, ${a("1.5rem")}));
  font-weight: var(--bbva-button-default-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(500)}));
  text-align: center;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  border: 1px solid var(--_border-color);
  border-radius: var(--bbva-button-default-border-radius, var(--borderRadiusSmall, ${a("1px")}));
  background-color: var(--_bg-color);
  color: var(--_color);
  opacity: var(--_opacity);
  transition: background-color var(--fast-transition, 0.2s), color var(--fast-transition, 0.2s); }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit; }

:host(:focus) {
  outline: none; }

:host([focus-visible]) {
  @apply --cells-global-focus;
  @apply --bbva-button-default-focus; }

:host(.full-width) {
  flex-grow: 1;
  width: 100%;
  min-width: 0;
  @apply --bbva-button-default-full-width; }

:host([disabled]) {
  color: var(--_color); }

:host,
:host(.primary),
:host([variant=primary]) {
  --_color: var(--bbva-button-default-color, var(--colorsPrimaryCoreLightened, ${a(st)}));
  --_bg-color: var(--bbva-button-default-bg-color, var(--colorsPrimaryMedium, ${a(ut)}));
  --_border-color: var(--bbva-button-default-border-color, transparent);
  --_opacity: var(--bbva-button-default-opacity, 1);
  @apply --bbva-button-default; }

:host([active]),
:host(.primary[active]),
:host([variant=primary][active]) {
  --_color: var(--bbva-button-default-color-active, var(--colorsPrimaryCoreLightened, ${a(st)}));
  --_bg-color: var(--bbva-button-default-bg-color-active, var(--colorsPrimaryCoreLight, ${a(dt)}));
  --_border-color: var(--bbva-button-default-border-color-active, transparent);
  --_opacity: var(--bbva-button-default-opacity-active, 1);
  @apply --bbva-button-default-active; }

:host([disabled]),
:host(.primary[disabled]),
:host([variant=primary][disabled]) {
  --_color: var(--bbva-button-default-color-disabled, var(--colorsSecondary400, ${a(mt)}));
  --_bg-color: var(--bbva-button-default-bg-color-disabled, var(--colorsSecondary200, ${a(gt)}));
  --_border-color: var(--bbva-button-default-border-color-disabled, transparent);
  --_opacity: var(--bbva-button-default-opacity-disabled, 1);
  @apply --bbva-button-default-disabled; }

:host(.secondary),
:host([variant=secondary]) {
  --_color: var(--bbva-button-default-secondary-color, var(--colorsPrimaryMedium, ${a(ut)}));
  --_bg-color: var(--bbva-button-default-secondary-bg-color, transparent);
  --_border-color: var(--bbva-button-default-secondary-border-color, var(--colorsSecondary300, ${a(ht)}));
  --_opacity: var(--bbva-button-default-secondary-opacity, 1);
  @apply --bbva-button-default-secondary; }

:host(.secondary[active]),
:host([variant=secondary][active]) {
  --_color: var(--bbva-button-default-secondary-color-active, var(--colorsPrimaryMedium, ${a(ut)}));
  --_bg-color: var(--bbva-button-default-secondary-bg-color-active, var(--colorsSecondary100, ${a(yt)}));
  --_border-color: var(--bbva-button-default-secondary-border-color-active, transparent);
  --_opacity: var(--bbva-button-default-secondary-opacity-active, 1);
  @apply --bbva-button-default-secondary-active; }

:host(.secondary[disabled]),
:host([variant=secondary][disabled]) {
  --_color: var(--bbva-button-default-secondary-color-disabled, var(--colorsSecondary400, ${a(mt)}));
  --_bg-color: var(--bbva-button-default-secondary-bg-color-disabled, var(--colorsSecondary200, ${a(gt)}));
  --_border-color: var(--bbva-button-default-secondary-border-color-disabled, transparent);
  --_opacity: var(--bbva-button-default-secondary-opacity-disabled, 0.4);
  @apply --bbva-button-default-secondary-disabled; }

:host(.positive),
:host([variant=positive]) {
  --_color: var(--bbva-button-default-positive-color, var(--colorsPrimaryCoreLightened, ${a(st)}));
  --_bg-color: var(--bbva-button-default-positive-bg-color, var(--colorsPrimaryVariantDark, ${a(pt)}));
  --_border-color: var(--bbva-button-default-positive-border-color, transparent);
  --_opacity: var(--bbva-button-default-positive-opacity, 1);
  @apply --bbva-button-default-positive; }

:host(.positive[active]),
:host([variant=positive][active]) {
  --_color: var(--bbva-button-default-positive-color-active, var(--colorsPrimaryCoreLightened, ${a(st)}));
  --_bg-color: var(--bbva-button-default-positive-bg-color-active, var(--colorsPrimaryVariant, ${a(vt)}));
  --_border-color: var(--bbva-button-default-positive-border-color-active, transparent);
  --_opacity: var(--bbva-button-default-positive-opacity-active, 1);
  @apply --bbva-button-default-positive-active; }

:host(.positive[disabled]),
:host([variant=positive][disabled]) {
  --_color: var(--bbva-button-default-positive-color-disabled, var(--colorsSecondary400, ${a(mt)}));
  --_bg-color: var(--bbva-button-default-positive-bg-color-disabled, var(--colorsSecondary200, ${a(gt)}));
  --_border-color: var(--bbva-button-default-positive-border-color-disabled, transparent);
  --_opacity: var(--bbva-button-default-positive-opacity-disabled, 0.4);
  @apply --bbva-button-default-positive-disabled; }
`;t`[ambient^=light] {
  --bbva-button-default-color: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-bg-color: var(--colorsPrimaryMedium, ${a(ut)});
  --bbva-button-default-border-color: transparent;
  --bbva-button-default-opacity: 1;
  --bbva-button-default-color-active: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreLight, ${a(dt)});
  --bbva-button-default-border-color-active: transparent;
  --bbva-button-default-opacity-active: 1;
  --bbva-button-default-color-disabled: var(--colorsSecondary400, ${a(mt)});
  --bbva-button-default-bg-color-disabled: var(--colorsSecondary200, ${a(gt)});
  --bbva-button-default-border-color-disabled: transparent;
  --bbva-button-default-opacity-disabled: 1;
  --bbva-button-default-secondary-color: var(--colorsPrimaryMedium, ${a(ut)});
  --bbva-button-default-secondary-bg-color: transparent;
  --bbva-button-default-secondary-border-color: var(--colorsSecondary300, ${a(ht)});
  --bbva-button-default-secondary-opacity: 1;
  --bbva-button-default-secondary-color-active: var(--colorsPrimaryMedium, ${a(ut)});
  --bbva-button-default-secondary-bg-color-active: var(--colorsSecondary100, ${a(yt)});
  --bbva-button-default-secondary-border-color-active: transparent;
  --bbva-button-default-secondary-opacity-active: 1;
  --bbva-button-default-secondary-color-disabled: var(--colorsSecondary400, ${a(mt)});
  --bbva-button-default-secondary-bg-color-disabled: var(--colorsSecondary200, ${a(gt)});
  --bbva-button-default-secondary-border-color-disabled: transparent;
  --bbva-button-default-secondary-opacity-disabled: 0.4;
  --bbva-button-default-positive-color: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-positive-bg-color: var(--colorsPrimaryVariantDark, ${a(pt)});
  --bbva-button-default-positive-border-color: transparent;
  --bbva-button-default-positive-opacity: 1;
  --bbva-button-default-positive-color-active: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-positive-bg-color-active: var(--colorsPrimaryVariant, ${a(vt)});
  --bbva-button-default-positive-border-color-active: transparent;
  --bbva-button-default-positive-opacity-active: 1;
  --bbva-button-default-positive-color-disabled: var(--colorsSecondary400, ${a(mt)});
  --bbva-button-default-positive-bg-color-disabled: var(--colorsSecondary200, ${a(gt)});
  --bbva-button-default-positive-border-color-disabled: transparent;
  --bbva-button-default-positive-opacity-disabled: 0.4; }
`,t`[ambient^=dark] {
  --bbva-button-default-color: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-bg-color: var(--colorsPrimaryMedium, ${a(ut)});
  --bbva-button-default-border-color: transparent;
  --bbva-button-default-opacity: 1;
  --bbva-button-default-color: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreLight, ${a(dt)});
  --bbva-button-default-border-color-active: transparent;
  --bbva-button-default-opacity-active: 1;
  --bbva-button-default-color-disabled: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryMedium, ${a(ut)});
  --bbva-button-default-border-color-disabled: transparent;
  --bbva-button-default-opacity-disabled: 0.4;
  --bbva-button-default-secondary-color: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-secondary-bg-color: transparent;
  --bbva-button-default-secondary-border-color: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-secondary-opacity: 1;
  --bbva-button-default-secondary-color-active: var(--colorsPrimaryMedium, ${a(ut)});
  --bbva-button-default-secondary-bg-color-active: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-secondary-border-color-active: transparent;
  --bbva-button-default-secondary-opacity-active: 1;
  --bbva-button-default-secondary-color-disabled: var(--colorsSecondary400, ${a(mt)});
  --bbva-button-default-secondary-bg-color-disabled: var(--colorsSecondary300, ${a(ht)});
  --bbva-button-default-secondary-border-color-disabled: transparent;
  --bbva-button-default-secondary-opacity-disabled: 0.4;
  --bbva-button-default-positive-color: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-positive-bg-color: var(--colorsPrimaryVariantDark, ${a(pt)});
  --bbva-button-default-positive-border-color: transparent;
  --bbva-button-default-positive-opacity: 1;
  --bbva-button-default-positive-color-active: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-positive-bg-color-active: var(--colorsPrimaryVariant, ${a(vt)});
  --bbva-button-default-positive-border-color-active: transparent;
  --bbva-button-default-positive-opacity-active: 1;
  --bbva-button-default-positive-color-disabled: var(--colorsSecondary400, ${a(mt)});
  --bbva-button-default-positive-bg-color-disabled: var(--colorsSecondary200, ${a(gt)});
  --bbva-button-default-positive-border-color-disabled: transparent;
  --bbva-button-default-positive-opacity-disabled: 0.4; }

[ambient=dark100] {
  --bbva-button-default-bg-color: var(--colorsPrimaryCore, ${a(lt)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreDark, ${a(bt)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryCore, ${a(lt)});
  --bbva-button-default-secondary-color-active: var(--colorsPrimaryMedium, ${a(ut)});
  --bbva-button-default-secondary-bg-color-active: var(--colorsPrimaryCoreLightened, ${a(st)});
  --bbva-button-default-secondary-opacity-active: 1; }
`;let $t=class extends et{static get is(){return"bbva-button-default"}static get properties(){return{text:{type:String}}}constructor(){super(),this.type="button"}static get shadyStyles(){return`\n      ${super.shadyStyles}\n      ${ft.cssText}\n      ${e("bbva-button-default-shared-styles").cssText}\n    `}render(){return o`
      <style>
        ${this.constructor.shadyStyles}
      </style>
      ${this.text?o`
            <span>${this.text}</span>
          `:o`
            <slot></slot>
          `}
      ${this._button}
    `}};customElements.define($t.is,$t),customElements.define(rt.is,rt);const kt=new r;var _t=t`:host {
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

.with-flag .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
${kt.mediaRules()}`;t`
    ${n.dark}
  `,t`
    ${n.light}
  `;class xt extends(c(l)){static get is(){return"bbva-form-number"}static get scopedElements(){return{"bbva-clip-flag":s,"bbva-text":b,"bbva-core-icon":d,"bbva-button-icon":u}}static get properties(){return{flagSize:{type:String,attribute:"flag-size"},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="number",this.flagSize="small",this.flagText=""}static get styles(){return[super.styles,_t,e("bbva-form-number-shared-styles")]}get field(){return o`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return o`
      ${this.flag?o`
            <span class="flag">
              <bbva-clip-flag
                icon="${v(this.flag)}"
                .size="${this.flagSize}"
                iconset="${v(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get labelBlock(){return o`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.inputLabel}</span>
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}customElements.define(xt.is,xt);const St=new r;var Ct=t`:host {
  display: block;
  box-sizing: border-box;
  --_list-contact-color: var(--bbva-list-contact-color, var(--colorsSecondary500, ${a(h.secondary500)}));
  --_list-contact-title-color: var(--bbva-list-contact-title-color, var(--colorsPrimaryMedium, ${a(h.primaryMedium)}));
  --_list-contact-title-no-link-color: var(--bbva-list-contact-title-no-link-color, var(--colorsSecondary600, ${a(h.secondary600)}));
  --_list-contact-title-pressed-color: var(--bbva-list-contact-title-pressed-color, var(--colorsPrimaryCore, ${a(h.primaryCore)}));
  --_list-contact-icon-color: var(--bbva-contact-icon-color, var(--colorsPrimaryMedium, ${a(h.primaryMedium)}));
  --_list-contact-icon-pressed-color: var(--bbva-contact-icon-pressed-color, var(--colorsPrimaryCore, ${a(h.primaryCore)}));
  --_list-contact-icon-no-link-color: var(--bbva-list-contact-icon-no-link-color, var(--colorsSecondary600, ${a(h.secondary600)}));
  --_list-contact-pressed-bg: var(--bbva-list-contact-pressed-bg, var(--colorsSecondary100, ${a(h.secondary100)}));
  --_list-contact-skeleton-quote-color: var(--bbva-list-contact-skeleton-quote-color, var(--colorsSecondary200, ${a(h.secondary200)}));
  --_list-contact-skeleton-quote-bg: var(--bbva-list-contact-skeleton-quote-bg, transparent);
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

:host([hidden]),
[hidden] {
  display: none !important;
}

.column {
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
.column.top-spacer {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

.top,
.title-wrapper,
.actions {
  display: flex;
}

.top {
  justify-content: space-between;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
.top .column:first-child {
  flex: 1;
}

.actions {
  justify-content: flex-end;
}

.title-wrapper {
  align-items: center;
}

button {
  all: unset;
}

[data-tag-name=bbva-core-icon] {
  color: var(--_list-contact-icon-color);
}
[data-tag-name=bbva-core-icon]:active {
  color: var(--_list-contact-icon-pressed-color);
}

[data-tag-name=bbva-clip-box],
[data-tag-name=bbva-clip-entities],
[data-tag-name=bbva-clip-product] {
  position: absolute;
}

[data-tag-name=bbva-text] {
  font-weight: var(--fontFacePrimaryBookFontWeight, ${a(p.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${a(p.book.fontStyle)});
  color: var(--_list-contact-color);
}

.title {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(p.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(p.medium.fontStyle)});
  color: var(--_list-contact-title-color);
  overflow: hidden;
}
.title.link {
  font-size: var(--typographyMedium, ${a(m.medium)});
}

.container {
  margin-left: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

.actions button:nth-child(2) {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link][active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  --bbva-link-disabled-opacity: 0.8;
}

[data-tag-name=bbva-badge-default] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-amount] {
  text-align: right;
}

:host([no-link]) [data-tag-name=bbva-text] {
  color: var(--_list-contact-title-no-link-color);
}
:host([no-link]) [data-tag-name=bbva-core-icon]:not(.action) {
  color: var(--_list-contact-icon-no-link-color);
}

.wrapper {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
:host([hide-padding-top]) .wrapper {
  padding-top: 0;
}
:host([hide-padding-bottom]) .wrapper {
  padding-bottom: 0;
}
:host(:not([no-link])) .wrapper:active {
  background: var(--_list-contact-pressed-bg);
}
:host(:not([no-link])) .wrapper:active [data-tag-name=bbva-link].title {
  color: var(--_list-contact-title-pressed-color);
}
:host(:not([no-link])) .wrapper:active [data-tag-name=bbva-core-icon]:not(.action) {
  color: var(--_list-contact-icon-pressed-color);
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
  background-image: linear-gradient(var(--_list-contact-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-contact-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-contact-skeleton-quote-color) 50%);
  background-color: var(--_list-contact-skeleton-quote-bg, transparent);
  background-size: 48px 48px, calc((65% * 2) + (16px/ 2)) 16px, calc((35% * 2) + (16px/ 2)) 16px;
  background-position: 8px 16px, 64px 20px, 64px 44px;
}

:host([loading]) {
  pointer-events: none;
  min-height: 16rem;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}
${St.mediaRules()}`;const Pt=new r;var wt=t`[ambient^=dark] {
  --bbva-list-contact-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-list-contact-title-color: var(--colorsPrimarySubdued, ${a(h.primarySubdued)});
  --bbva-list-contact-title-no-link-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-contact-icon-color: var(--colorsPrimarySubdued, ${a(h.primarySubdued)});
  --bbva-list-contact-icon-no-link-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-list-contact-pressed-bg: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-list-contact-title-pressed-color: var(--colorsPrimarySubduedLight, ${a(h.primarySubduedLight)});
  --bbva-contact-icon-pressed-color: var(--colorsPrimarySubduedLight, ${a(h.primarySubduedLight)});
  --bbva-list-contact-skeleton-quote-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-list-contact-skeleton-quote-bg: var(--colorsPrimaryCore, ${a(h.primaryCore)});
}
${Pt.mediaRules()}`;var Lt=t`[ambient^=light] {
  --bbva-list-contact-color: initial;
  --bbva-list-contact-title-color: initial;
  --bbva-list-contact-title-pressed-color: initial;
  --bbva-list-contact-title-no-link-color: initial;
  --bbva-contact-icon-color: initial;
  --bbva-contact-icon-pressed-color: initial;
  --bbva-list-contact-icon-no-link-color: initial;
  --bbva-list-contact-pressed-bg: initial;
  --bbva-list-contact-skeleton-quote-color: initial;
  --bbva-list-contact-skeleton-quote-bg: initial;
}
${(new r).mediaRules()}`;const Mt={dark:t`
    ${g.dark}
    ${y.dark}
    ${f.dark}
    ${$.dark}
    ${wt}
  `,light:t`
    ${g.light}
    ${y.light}
    ${f.light}
    ${$.light}
    ${Lt}
  `};class Tt extends(c(k(_(x(S(C)))))){static get is(){return"bbva-list-contact"}static get scopedElements(){return{"bbva-amount":P,"bbva-badge-default":w,"bbva-clip-box":L,"bbva-clip-entities":M,"bbva-clip-product":it,"bbva-core-icon":d,"bbva-link":T,"bbva-text":b}}static get properties(){return{actionIconPrimary:{type:String,attribute:"action-icon-primary"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconPrimaryAccessibilityText:{type:String,attribute:"action-icon-primary-accessibility-text"},actionIconSecondaryAccessibilityText:{type:String,attribute:"action-icon-secondary-accessibility-text"},badgeText:{type:String,attribute:"badge-text"},badgeType:{type:String,attribute:"badge-type"},descriptions:{type:Array},entity:{type:String},iconClipBox:{type:String,attribute:"icon-clip-box"},image:{type:String},initials:{type:String},item:{type:String},loading:{type:Boolean},noLink:{type:Boolean,attribute:"no-link"},title:{type:String},contentTitle:{type:String,attribute:"content-title"},titleIcon:{type:String,attribute:"title-icon"},titleIconAccesibilityText:{type:String,attribute:"title-icon-accesibility-text"},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0}}}constructor(){super(),this.badgeType="default",this.descriptions=[],this.actionIconPrimary=q(),this.actionIconPrimaryAccessibilityText="bbva-list-contact-action-icon-primary-accessibility-text",this.actionIconSecondary=D(),this.actionIconSecondaryAccessibilityText="bbva-list-contact-action-icon-secondary-accessibility-text",this.noLink=!1,this.loading=!1,this.hidePaddingBottom=!1,this.hidePaddingTop=!1}update(t){super.update(t),t.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static get styles(){return[super.styles,Ct,E("button:focus"),e("bbva-list-contact-shared-styles"),Mt.dark,Mt.light]}get _initials(){return this.initials||this.contentTitle.split(" ").map((t=>t.charAt(0))).reduce(((t,a)=>`${t}${a}`),"").toUpperCase()}get _clip(){let t="";return t=this.entity?o`
        <bbva-clip-entities data-tag-name="bbva-clip-entities" size="large" .entity=${this.entity}> </bbva-clip-entities>
      `:this.item?o`
        <bbva-clip-product data-tag-name="bbva-clip-product" size="large" item=${v(this.item)}></bbva-clip-product>
      `:o`
        <bbva-clip-box
          aria-hidden="true"
          class="bitone"
          data-tag-name="bbva-clip-box"
          size="large"
          .text=${this._initials}
          .image=${this.image}
          .icon=${this.iconClipBox}
        >
        </bbva-clip-box>
      `,t}static _tplText(t){return o`<bbva-text data-tag-name="bbva-text" unset .text=${t} size="S"></bbva-text>`}get _amount(){return o`
      <bbva-amount
        data-tag-name="bbva-amount"
        ?decimals-hidden="${this.decimalsHidden}"
        variant="xl"
        .localCurrency="${this.localCurrency}"
        amount="${this.amount}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}get _icon(){return o`
      <span>
        <bbva-core-icon data-tag-name="bbva-core-icon" .icon="${this.titleIcon}" size="16" aria-hidden="true"></bbva-core-icon>
        <span class="sr-only">${this.titleIconAccesibilityText}</span>
      </span>
    `}get _topBlock(){return o`
      <div class="top">
        <div class="column">
          <div class="title-wrapper">
            ${this.noLink?o`
                  <bbva-text
                    class="title"
                    data-tag-name="bbva-text"
                    ?disabled="${this.disabled}"
                    unset
                    text=${v(this.contentTitle)}
                    size="M"
                    ellipsis
                  ></bbva-text>
                `:o`
                  <bbva-link data-tag-name="bbva-link" ?disabled="${this.disabled}" class="title link"
                    >${v(this.contentTitle)}</bbva-link
                  >
                `}
            ${this.titleIcon?this._icon:""}
          </div>
          ${this.descriptions.length>0?Tt._tplText(this.descriptions[0]):""}
        </div>
        <div
          class="column ${A({"top-spacer":""===this.actionIconPrimary&&""===this.actionIconSecondary})}"
        >
          ${this.amount||0===this.amount?this._amount:this._actionBlock}
          ${this.descriptions.length>1?Tt._tplText(this.descriptions[1]):""}
        </div>
      </div>
    `}get _descriptionBlock(){return o`
      ${this.descriptions.slice(2,5).map((t=>Tt._tplText(t)))}
    `}get _badge(){return o`<bbva-badge-default
      data-tag-name="bbva-badge-default"
      .text=${this.badgeText}
      .type=${this.badgeType}
    ></bbva-badge-default>`}get _actionBlock(){return o`
      ${""!==this.actionIconPrimary||""!==this.actionSecondary?o`
            <div class="actions">
              ${""!==this.actionIconPrimary&&o`
                  <button
                    type="button"
                    ?disabled="${this.disabled}"
                    @click=${()=>this._onActionClick("primary")}
                  >
                    <bbva-core-icon
                      class="action"
                      data-tag-name="bbva-core-icon"
                      .icon="${this.actionIconPrimary}"
                      size="24"
                      aria-hidden="true"
                    >
                    </bbva-core-icon>
                    <span class="sr-only">${this.t(this.actionIconPrimaryAccessibilityText)}</span>
                  </button>
                `||""}
              ${""!==this.actionIconSecondary&&o`
                  <button
                    type="button"
                    ?disabled="${this.disabled}"
                    @click=${()=>this._onActionClick("secondary")}
                  >
                    <bbva-core-icon
                      class="action"
                      data-tag-name="bbva-core-icon"
                      .icon="${this.actionIconSecondary}"
                      size="24"
                      aria-hidden="true"
                    >
                    </bbva-core-icon>
                    <span class="sr-only"
                      >${this.t(this.actionIconSecondaryAccessibilityText)}</span
                    >
                  </button>
                `||""}
            </div>
          `:""}
    `}render(){return o`
      <div
        class="wrapper"
        @click=${t=>this._onClick(t)}
        @keydown=${t=>13===t.keyCode?this._onClick(t):""}
      >
        ${this._clip}
        <div class="container">
          ${this._topBlock} ${this.descriptions.length>2?this._descriptionBlock:""}
          ${this.badgeText?this._badge:""}
        </div>
      </div>
      <div class="skeleton"></div>
    `}_onClick(t){"action"===t.target.className||this.disabled||this.noLink||this.dispatchEvent(new CustomEvent("list-contact-link-click",{detail:!0,composed:!0,bubbles:!0}))}_onActionClick(t){this.dispatchEvent(new CustomEvent(`list-contact-action-${t}-click`,{detail:!0,composed:!0,bubbles:!0}))}}customElements.define(Tt.is,Tt);const qt=new r;var Dt=t`:host {
  display: inline-block;
  box-sizing: border-box;
  font-size: var(--bbva-badge-notification-font-size, var(--typographyType3XSmall, ${a(m.type3XSmall)}));
  font-weight: var(--bbva-badge-notification-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(p.medium.fontWeight)}));
  --_default-bg-color: var(--bbva-badge-notification-dark-mode-bg-color, var(--bbva-badge-notification-bg-color,var(--colorsPrimaryCoreLight, ${a(h.primaryCoreLight)})));
  --_default-color: var(--bbva-badge-notification-dark-mode-color, var(--bbva-badge-notification-color, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_bg-color-alert: var(--bbva-badge-notification-dark-mode-alert-bg-color, var(--bbva-badge-notification-alert-bg-color,var(--colorsTertiaryType1Dark, ${a(h.tertiaryType1Dark)})));
  --_color-alert: var(--bbva-badge-notification-dark-mode-alert-color, var(--bbva-badge-notification-alert-color,var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
}

:host([border-1]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-1, var(--bbva-border-badge-notification-color-1, none));
}

:host([border-2]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-2, var(--bbva-border-badge-notification-color-2, none));
}

:host([border-3]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-3, var(--bbva-border-badge-notification-color-3, none));
}

:host([border-4]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-4, var(--bbva-border-badge-notification-color-4, none));
}

:host([border-5]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-5, var(--bbva-border-badge-notification-color-5, none));
}

:host([border-6]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-6, var(--bbva-border-badge-notification-color-6, none));
}

:host([border-7]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-7, var(--bbva-border-badge-notification-color-7, none));
}

:host([border-8]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-8, var(--bbva-border-badge-notification-color-8, none));
}

:host([border-9]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: none;
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

.badge-notification {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  min-width: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  max-width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  height: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  border-radius: 0.75rem;
  background-color: var(--_default-bg-color);
  color: var(--_default-color);
  z-index: 1;
}

:host([position=right]) {
  position: relative;
}
:host([position=right]) .badge-notification {
  position: absolute;
  right: -0.8125rem;
  top: -0.625rem;
}
:host([position=right]) .badge-notification.maximum {
  right: -1.75rem;
  width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
:host([position=right]) ::slotted(*) {
  -webkit-mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="-100 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  -webkit-mask-composite: xor;
  mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="-100 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  mask-composite: exclude;
}

:host([position=left]) {
  position: relative;
  margin-left: var(--_margin-left, calc(((1.625 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem));
}
:host([position=left]) .badge-notification {
  position: absolute;
  left: -0.8125rem;
  top: -0.625rem;
}
:host([position=left]) .badge-notification.maximum {
  left: -1.75rem;
  width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  --_margin-left: 28px;
}
:host :host([position=left]) .badge-notification.maximum {
  margin-right: gridSpacer8(13px);
}
:host([position=left]) ::slotted(*) {
  -webkit-mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  -webkit-mask-composite: xor;
  mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  mask-composite: exclude;
}

:host([variant=alert]) .badge-notification {
  background-color: var(--_bg-color-alert);
  color: var(--_color-alert);
}
${qt.mediaRules()}`;const Et=new r;var At=t`[ambient^=light] {
  --bbva-badge-notification-dark-bg-color: initial;
  --bbva-badge-notification-dark-color: initial;
  --bbva-badge-notification-alert-bg-color: initial;
  --bbva-badge-notification-alert-color: initial;
  --bbva-badge-notification-border-width: 1px;
  --bbva-badge-notification-border-style: solid;
  --bbva-badge-notification-border-radius: 24px;
  --bbva-border-light-badge-notification-color-1: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-border-light-badge-notification-color-2: var(--colorsSecondary100, ${a(h.secondary100)});
}
${Et.mediaRules()}`;const It=new r;const Rt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-badge-notification-dark-bg-color: var(--colorsPrimarySubduedLight, ${a(h.primarySubduedLight)});
  --bbva-badge-notification-dark-color: var(--colorsSecondary600, ${a(h.secondary600)});
  --bbva-badge-notification-alert-bg-color: var(--colorsPrimarySubduedLight, ${a(h.primarySubduedLight)});
  --bbva-badge-notification-alert-color: var(--colorsSecondary600, ${a(h.secondary600)});
  --bbva-badge-notification-border-width: 1px;
  --bbva-badge-notification-border-style: solid;
  --bbva-badge-notification-border-radius: 24px;
  --bbva-border-badge-notification-color-1: var(--colorsPrimaryCore, ${a(h.primaryCore)});
  --bbva-border-badge-notification-color-2: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-border-badge-notification-color-3: var(--colorsPrimaryCoreLight, ${a(h.primaryCoreLight)});
  --bbva-border-badge-notification-color-4: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-border-badge-notification-color-5: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-border-badge-notification-color-6: var(--colorsTertiaryType4Dark, ${a(h.tertiaryType4Dark)});
  --bbva-border-badge-notification-color-7: var(--colorsTertiaryType6Dark, ${a(h.tertiaryType6Dark)});
}
${It.mediaRules()}`}
  `,light:t`
    ${At}
  `};class Bt extends(c(C)){static get is(){return"bbva-badge-notification"}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},text:{type:Number},variant:{type:String,reflect:!0},position:{type:String,reflect:!0}}}static get styles(){return[Dt,Rt.light,Rt.dark,e("bbva-badge-notification-shared-styles")]}get truncate(){return this.text>999?"+99":this.text}render(){return o`
      <span
        class="badge-notification ${A({maximum:this.text>99})}"
        aria-label=${v(this.accessibilityText)}
        >${this.truncate}</span
      >
      <slot></slot>
    `}}I("colors.primarySubduedLight"),I("colors.cool100"),I("colors.tertiaryType1Light"),I("colors.cool100"),I("colors.cool100"),I("colors.cool90"),I("colors.cool80"),I("colors.cool70"),I("colors.cool60"),I("colors.cool50"),I("colors.tertiaryType6Darkened"),I("colors.tertiaryType4Darkened");const zt=new r;var Nt=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)}));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${a(h.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --_color-modal-three-level: var(--colorsSecondary600, ${a(h.secondary600)});
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${a(h.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${a(h.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)}));
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
  margin-left: auto;
  margin-right: auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: block;
  position: relative;
  border: none;
  background: none;
  width: var(--bbva-header-main-min-height, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.left-group {
  order: 0;
}
.header-main .header-icons.right-group {
  order: 2;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${a(m.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  order: 1;
  min-width: 0;
}
.header-main .heading-wrapper.half-space ~ .header-icons {
  min-width: 2.875rem;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  color: var(--_text-color);
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1em);
}
.header-main .heading-wrapper.full-space ~ .header-icons {
  min-width: 5.75rem;
}

:host([variant*=modal]) {
  background-color: var(--_bg-color-modal);
}

:host([variant*=modal-three-level]) {
  background-color: var(--_bg-color-modal-three-level);
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--_bg-color-process);
}

:host([variant*=sign]) {
  background-color: var(--_bg-color-sign);
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${zt.mediaRules()}`;class Vt extends(c(R(S(C)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":b,"bbva-core-icon":d,"bbva-badge-notification":Bt}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},a=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,e=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,o=Math.max(a,e);return o in t?t[o]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24}static get styles(){return[Nt,e("bbva-header-main-shared-styles"),E("button:focus")]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return o`<bbva-core-icon
      icon="${v(this[t])}"
      size="${this.iconSize}"
    ></bbva-core-icon>`}_badgeNotification(t){return o`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,a,e){const r=Vt.toCamelCase(t),i=`icon${r}`,n=`accessibilityTextIcon${r}`;return o`<button
      class="${a}"
      id="btn-${t}"
      aria-label="${v(this.t(this[n]))}"
      aria-expanded=${v(e)}
      ?hidden="${!this[i]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(i):this._icon(i)}
    </button>`}_tplHeading(t){return o`
      <bbva-text
        unset
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        aria-label="${this.t(t)}"
        .text="${this.t(t)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:t,_hasImage:a,text:e,image:r,_hasMicroillustration:i,microillustration:n}=this;return o`
      <header class="header-main">
        <h1
          class="heading-wrapper ${t} ${a}"
          id="heading"
          aria-label=${v(e&&" "!==e?void 0:"presentation")}
        >
          ${e&&" "!==e&&this._tplHeading(e)||""}
          <img src="${v(r)}" alt="" ?hidden="${!r}" id="image" aria-hidden="true" />

          <span class="${i}" ?hidden="${!n}" aria-hidden="true">
            ${this.microillustration&&B[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons left-group">
          ${this._tplButton("left-primary","icon primary")}
          ${this._tplButton("left-secondary","icon secondary")}
        </div>

        <div class="header-icons right-group">
          ${this._tplButton("right-secondary","icon secondary")}
          ${this._tplButton("right-primary","icon primary",this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(Vt.is,Vt);var Ft=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

bbva-list-simple {
  --_list-simple-stacked-label-color: #FFFF !important;
  overflow-wrap: anywhere;
}

*, *:before, *:after {
  box-sizing: inherit;
}
* bbva-expandable-multistep, *:before bbva-expandable-multistep, *:after bbva-expandable-multistep {
  height: auto;
}

.center-button {
  margin: 1rem auto;
  display: flex;
  max-width: 9rem;
  padding: 0.75rem 1rem;
}

#list-contact-summary wrapper {
  background-color: #ffff;
}

.native-fixed-header {
  height: var(--codi-p2p-mobile-transfer-request-safe-area-inset-top, 0);
  width: var(--bbva-multistep-codi-p2p-mobile-transfer-request-native-fixed-header-width, 100%);
}

bbva-expandable-multistep {
  height: auto !important;
}

bbva-expandable-step {
  height: auto !important;
}

[data-tag-name=bbva-expandable-multistep] {
  padding-top: var(--bbva-multistep-codi-p2p-mobile-transfer-request-expandable-multistep-padding-top, calc(((5.625 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem));
}
`;class jt extends(S(C)){static get is(){return"bbva-multistep-codi-p2p-mobile-transfer-request"}static get styles(){return[Ft,nt.dark,ct.dark,Mt.dark,e("bbva-multistep-codi-p2p-mobile-transfer-request-shared-styles")]}static get properties(){return{accountSelect:{type:Object},dataContracts:{type:Array},userData:{type:Object},maxSteps:{type:Number},stepAccount:{type:Number},stepContact:{type:Number},stepAmount:{type:Number},stepConcept:{type:Number},amount:{type:Number},amountLimit:{type:Number},phone:{type:String},balance:{type:Number},concept:{type:String},reference:{type:Number},contactName:{type:String},ambient:{type:String},commission:{type:Number},contactInitials:{type:String},localCurrency:{type:String},language:{type:String},disabledButtonConcept:{type:Boolean},disabledButtonAmount:{type:Boolean},disabledButtonPaymentRequest:{type:Boolean},isPayment:{type:Boolean},paymentInformation:{type:Object},isNativeIos:{type:Boolean},dateOptions:{type:Object},specialCharacter:{type:String},appSettingsAmountLimit:{type:Number}}}constructor(){super(),this.ambient="dark",this.isNativeIos=!1,this.isPayment=!1,this.maxSteps=4,this.stepAccount=1,this.stepContact=2,this.stepAmount=3,this.stepConcept=4,this._topSummary="top-summary-hidden",this.accountSelect={},this.contactName="",this.amount=0,this.phone="",this.contactInitials="",this.commission=0,this.amountLimit=1e5,this.balance=1,this.localCurrency="MXN",this.language="es-MX",this.dataContracts=[],this.userData={},this.disabledButtonAmount=!0,this.disabledButtonConcept=!0,this.disabledButtonPaymentRequest=!0,this.reference=0,this.concept="Sin concepto",this.paymentInformation={},this.dateOptions={year:"numeric",month:"long",day:"numeric",hour:"numeric",minute:"numeric"},this.specialCharacter="",this.appSettingsAmountLimit=999999999}updated(t){super.updated&&super.updated(t),t.forEach(((t,a)=>{"concept"===a&&this.validateSpecialCharacter()})),setTimeout((()=>{this.shadowRoot.getElementById("amountInput")._setCurrencyWidth()}),1)}setReference(t){this.reference=t,this.shadowRoot.getElementById("referenceInput").value=this.reference}setInformationPayment(t){this.paymentInformation=t,this.paymentInformation.request.amount>0?(this.maxSteps=1,this.amount=this.paymentInformation.request.amount):(this.maxSteps=2,this.stepAmount=2),this.resetMultistep()}_fireEvent(t,a,e=!0,o=!0){this.dispatchEvent(new CustomEvent(t,{detail:a,bubbles:e,composed:o}))}resetMultistep(){this.accountSelect={},this.disabledButtonPaymentRequest=!0,4===this.maxSteps?(this._getContactStepElement().completed=!1,this._getAmountStepElement().completed=!1,this._getConceptStepElement().completed=!1,this._getContactStepElement().disabled=!0,this._getAmountStepElement().disabled=!0,this._getConceptStepElement().disabled=!0,this.shadowRoot.getElementById("contactRequest").value="",this.shadowRoot.getElementById("amountInput").value="",this.shadowRoot.getElementById("conceptInput").value="",this.shadowRoot.getElementById("referenceInput").value=this.reference,this.amount=0,this.concept=""):2===this.maxSteps&&(this._getAmountStepElement().completed=!1,this._getAmountStepElement().disabled=!0,this.shadowRoot.getElementById("amountInput").value=""),this._getAccountStepElement().completed=!1,this.disabledButtonAmount=!0,this.disabledButtonConcept=!0,this.closeButtonFixed()}closeButtonFixed(){this._fireEvent("close-button-fixed-end-flow",!1)}bindAccountSummary(t){this.accountSelect=t.detail.value,this.updateMaxAmountLimit(),this._getAccountStepElement().completed=!0,1===this.maxSteps&&(this.disabledButtonPaymentRequest=!1),this._fireEvent("analytic-select-origin-account",this.accountSelect),this._fireEvent("analytic-select-origin-account-request",this.accountSelect),this._fireEvent("analytic-confirm-origin-account"),this._fireEvent("analytic-confirm-origin-account-request")}updateMaxAmountLimit(){this.isPayment?this.amountLimit=this.accountSelect.specificAmount<this.appSettingsAmountLimit?this.accountSelect.specificAmount:this.appSettingsAmountLimit:this.amountLimit=this.appSettingsAmountLimit}moneyFormat(t){return`$${t.toLocaleString("en-US")}.00`}openContactBook(){this.dispatchEvent(new CustomEvent("contact-icon-clicked",{detail:this.value,bubbles:!0,composed:!0}))}fireCompleteEventContact({target:t}){t&&(this.phone===this.userData.userId?this._fireEvent("show_modal_same_phone",this.phone):(this._fireEvent("phone-step-finished",this.phone),this._fireEvent("analytic-phone-step-finish"),this._getContactStepElement().completed=!0,this.disabledButtonAmount=!1))}_getPhones(){const t=[];return t.push(this.phone),t}updatePhone({target:t}){t&&(this.phone=t.value)}handleContactSelectedFromAgenda(t){t&&(this.contactName=t.contact.main,this.phone=t.phone,this.contactInitials=this._getContactInitials(t.contact.main),this._fireEvent("phone-step-finished",this.phone)),this._getContactStepElement().completed=!0}_getContactInitials(t){const[a,e]=t.split(" ");return a.charAt(0)+e.charAt(0)}_renderSummaryContact(){return o`<bbva-list-contact
      disabled-tabindex
      action-icon-primary=""
      action-icon-secondary=""
      content-title="${this.contactName}"
      initials=${this.contactInitials}
      .descriptions="${this._getPhones()}"
      no-action-icons
      ambient="${this.ambient}"
      id="list-contact-summary"
    ></bbva-list-contact>`}_getAccountStepElement(){return this.shadowRoot.getElementById("step-1")}_getContactStepElement(){return this.shadowRoot.getElementById("step-2")}_getAmountStepElement(){return this.shadowRoot.getElementById("step-3")}_getConceptStepElement(){return this.shadowRoot.getElementById("step-4")}changeContact(){this.contactInitials="",this.contactName=""}_stepContactSelector(){return o`
      <bbva-expandable-step
        id="step-2"
        header="${this.t("codi-p2p-mobile-transfer-request-step2-header")}"
        disabled-target=".action"
        step="1"
        hide-padding-top
        totalSteps="${this.maxSteps}"
        class="step-two animation"
        tabindex="-1"
        current-step-label="${this.t("codi-p2p-mobile-transfer-request-heading-step-label",{step:this.stepContact,total:this.maxSteps})}"
        edit-label="${this.t("codi-p2p-mobile-transfer-request-step-edit-text")}"
        @expandable-step-edit-step="${this.changeContact}"
      >
        <div class="content">
          <bbva-text
            text="${this.t("codi-p2p-mobile-transfer-request-contact-text")}"
            size="XS"
          ></bbva-text>
          <bbva-form-contact
            id= "contactRequest"
            auto-validate
            type="number"
            action-icon="${z()}"
            clear-icon="${N()}"
            label="${this.t("codi-p2p-mobile-transfer-request-contact-label")}"
            optional-label=""
            maxlength="10"
            pattern="[0-9]{10}"
            allowed-pattern="[0-9]"
            info-message="${this.t("codi-p2p-mobile-transfer-request-contact-info-message")}"
            error-message="${this.t("codi-p2p-mobile-transfer-request-contact-error-message")}"
            @input="${this.updatePhone}"
            @form-field-button-submit="${this.openContactBook}"
          >
          </bbva-form-contact>
          <bbva-button-default
            id="contact-submit-button"
            text="${this.t("codi-p2p-mobile-transfer-request-button-continue-text")}"
            @click="${this.fireCompleteEventContact}"
            ?disabled="${!(this.phone.length>=10)}"
            class="center-button"
          >
          </bbva-button-default>
        </div>
        <div class="summary" slot="summary" ambient="${this.ambient}">
          ${this._renderSummaryContact()}
        </div>
      </bbva-expandable-step>
    `}_stepAmountInput(){return o`
      <bbva-expandable-step
        id="step-3"
        header="${this.t("codi-p2p-mobile-transfer-request-step3-header")}"
        disabled-target=".action"
        step="2"
        hide-padding-top
        totalSteps="${this.maxSteps}"
        class="step-three animation"
        tabindex="-1"
        ?hidden= "${this.isPayment&&1===this.maxSteps}"
        ?show= "${!this.isPayment||2===this.maxSteps}"
        current-step-label="${this.t("codi-p2p-mobile-transfer-request-heading-step-label",{step:this.stepAmount,total:this.maxSteps})}"
        edit-label="${this.t("codi-p2p-mobile-transfer-request-step-edit-text")}"
      >
        <div class="content">
          <bbva-form-amount
            id="amountInput"
            label="${this.isPayment?this.t("codi-p2p-mobile-transfer-request-amount-text"):this.t("codi-p2p-mobile-transfer-request-amount-optional")}"
            label-out="${this.isPayment?this.t("codi-p2p-mobile-transfer-payment-amount-label"):this.t("codi-p2p-mobile-transfer-request-amount-label")}"
            currency-code="${this.localCurrency}"
            local-currency="${this.localCurrency}"
            language="${this.language}"
            optional-label=""
            max=${this.amountLimit}
            ?invalid="true"
            decimal-digits="2"
            maxlength="${this.moneyFormat(this.appSettingsAmountLimit).length}"
            auto-validate
            @form-amount-input-change=${this.updateAmount}
            error-message="${this.t("codi-p2p-mobile-transfer-payment-amount-error-message",{amountLimit:this.moneyFormat(this.amountLimit)})}"
          >
          </bbva-form-amount>
          <bbva-button-default
            text="${this.t("codi-p2p-mobile-transfer-request-button-continue-text")}"
            @click="${this.fireCompleteEventAmount}"
            class="center-button"
            .disabled="${this.disabledButtonAmount}"
          >
          </bbva-button-default>
        </div>
        <div class="summary" slot="summary" ambient="${this.ambient}">
          ${this.renderSummaryAmount()}
        </div>
      </bbva-expandable-step>
    `}setAmountLimitRequest({maximumRequestAmountCodi:t,maximumPaymentAmountCodi:a}){this.isPayment?this.appSettingsAmountLimit=a.value:this.appSettingsAmountLimit=t.value}updateAmount({target:t}){this.amount=t.amount,this.disabledButtonAmount=!1,t.value?t.invalid=this.amount>this.amountLimit:t.invalid=!1,this.disabledButtonAmount=t.invalid,this.isPayment&&(this.disabledButtonAmount=!0,t.invalid=!1,t.value&&(t.invalid=0===this.amount||this.amount>this.amountLimit,this.disabledButtonAmount=t.invalid))}fireCompleteEventAmount({target:t}){t&&(this._fireEvent("amount-step-finished",{amount:this.amount,currency:this.localCurrency}),this._fireEvent("analytic-amount-step-finish-request"),this._getAmountStepElement().completed=!0,this.disabledButtonConcept=!1,2===this.maxSteps&&(this.disabledButtonPaymentRequest=!1),this._fireEvent("analytic-amount-request-send",this.amount))}renderSummaryAmount(){return this.isPayment||0!==this.amount?o` <bbva-amount
      .amount="${this.amount}"
      variant="4xl"
      currency-code="${this.localCurrency}"
      local-currency="${this.localCurrency}"
      language="${this.language}"
      ambient="${this.ambient}"
      >
    </bbva-amount>`:o` <bbva-list-simple
      label="${null===this.amount?this.t("codi-p2p-mobile-transfer-request-no-amount")||0===this.amount:this.t("codi-p2p-mobile-transfer-request-no-amount")}"
      ambient="${this.ambient}"
    >
    </bbva-list-simple>`}_openModalAlertChangeAccount(){this._fireEvent("codi-request-payments-p2m-create-full-modal-warning")}_stepConceptInput(){return o`
      <bbva-expandable-step
        id="step-4"
        header="${this.t("codi-p2p-mobile-transfer-request-step4-header")}"
        disabled-target=".action"
        step="3"
        hide-padding-top
        totalSteps="${this.maxSteps}"
        class="step-four animation"
        tabindex="-1"
        current-step-label="${this.t("codi-p2p-mobile-transfer-request-heading-step-label",{step:this.stepConcept,total:this.maxSteps})}"
        edit-label="${this.t("codi-p2p-mobile-transfer-request-step-edit-text")}"
      >
        <div class="content">
          ${this.renderReference()}
          ${this.renderConcept()}
        </div>
        <div class="summary" slot="summary" ambient="${this.ambient}">
          ${this.renderSummaryConcept()}
        </div>
      </bbva-expandable-step>
    `}renderReference(){var t,a;return o`<bbva-form-number
      id="referenceInput"
      label="${this.t("codi-p2p-mobile-transfer-request-reference-optional")}"
      optional-label=""
      value="${this.reference}"
      info-message="${null!==(t=this.shadowRoot.querySelector("#referenceInput"))&&void 0!==t&&t.invalid?"":this.t("codi-p2p-mobile-transfer-request-reference-info-message")}"
      error-message="${this.t("codi-p2p-mobile-transfer-request-reference-error-message")}"
      maxlength="7"
      pattern="[0-9]{7}"
      allowed-pattern="[0-9]"
      auto-validate
      .invalid="${null===(a=this.shadowRoot.querySelector("#referenceInput"))||void 0===a?void 0:a.invalid}"
      @input="${this.updateReference}"
    >
    </bbva-form-number> <br>`}renderConcept(){var t;return o`<bbva-form-text
      id="conceptInput"
      label="${this.t("codi-p2p-mobile-transfer-request-concept-optional")}"
      optional-label=""
      info-message="${null!==(t=this.shadowRoot.querySelector("#conceptInput"))&&void 0!==t&&t.invalid?"":this.t("codi-p2p-mobile-transfer-request-concept-info-message")}"
      error-message="${this.t("codi-p2p-mobile-transfer-request-concept-error-message",{specialCharacter:this.specialCharacter})}"
      maxlength="40"
      auto-validate
      ?invalid="true"
      @input="${this.updateConcept}"
    >
    </bbva-form-text>
    <bbva-button-default
      id="buttonContinueConcept"
      text="${this.t("codi-p2p-mobile-transfer-request-button-continue-text")}"
      @click="${this.fireCompleteEventReferenceConcept}"
      ?disabled="${this.disabledButtonConcept}"
      class="center-button"
    >
    </bbva-button-default>`}renderSummaryConcept(){return o`<bbva-list-simple
        label="${this.t("codi-p2p-mobile-transfer-request-summary-reference")}"
        description="${null===this.reference?0:this.reference}"
        ambient="${this.ambient}"
      >
      </bbva-list-simple>
      <bbva-list-simple
        label="${this.t("codi-p2p-mobile-transfer-request-summary-concept")}"
        description="${null===this.concept?this.t("codi-refactor-payment-information-request-concept"):this.concept}"
        ambient="${this.ambient}"
      >
      </bbva-list-simple>`}updateReference({target:t}){t&&t.value&&(this.reference=t.value,this.disabledButtonConcept=this.shadowRoot.querySelector("#referenceInput").invalid),""===t.value&&(this.reference=0)}validateSpecialCharacter(){const t=this.shadowRoot.querySelector("#conceptInput"),a=/[0-9a-z A-Zá-úÑ'"´_#$%&@+!¡?¿.,:;/*+-\\()]/g;let e=!0;for(let t=0;t<this.concept.length;t+=1)if(e=this.concept[t].match(a),!e){this.specialCharacter=this.concept[t];break}t.invalid=!e,this.disabledButtonConcept=t.invalid}updateConcept({target:t}){this.concept=t.value.trim()?t.value:"Sin concepto"}fireCompleteEventReferenceConcept({target:t}){if(t){const t={reference:this.reference,concept:this.concept};this._fireEvent("reference-concept-step-finished",t),this._getConceptStepElement().completed=!0,this.disabledButtonPaymentRequest=!1,this.shadowRoot.querySelector("#paymentRequestBtn").scrollIntoView({behavior:"smooth",block:"start"}),this._fireEvent("analytic-reference-concept-step-finish")}}onClickPaymentRequest(){this.isPayment?this._fireEvent("payment-send-finished"):this._fireEvent("payment-request-finished")}_renderPaymentSummary(){var t,a,e,r,i,n,c,l,s,b,d,u,v,p,m,h,g,y;return o`
    <bbva-expandable-step
    hide-padding-left
    hide-padding-right
    header="${this.t("codi-p2p-mobile-transfer-request-payment-text-information")}"
    step-view="" prefilled="" view-label="">
        <div class="summary" slot="summary" ambient="${this.ambient}">
          <bbva-list-simple label="${this.t("codi-p2p-mobile-transfer-request-payment-receiver")}"
            description=${null===(t=this.paymentInformation)||void 0===t||null===(a=t.receiver)||void 0===a?void 0:a.name} variant="stacked">
          </bbva-list-simple>
          <bbva-list-simple label="${this.t("codi-p2p-mobile-transfer-request-payment-clabe")}"
            description=${null===(e=this.paymentInformation)||void 0===e||null===(r=e.request)||void 0===r?void 0:r.clabe} variant="stacked">
          </bbva-list-simple>

          <bbva-list-simple label="${this.t("codi-p2p-mobile-transfer-request-payment-phone")}"
          description=${null===(i=this.paymentInformation)||void 0===i||null===(n=i.receiver)||void 0===n?void 0:n.phone} variant="stacked">
          </bbva-list-simple>
          ${null!==(c=this.paymentInformation)&&void 0!==c&&null!==(l=c.request)&&void 0!==l&&l.amount?o`<bbva-list-simple label="${this.t("codi-p2p-mobile-transfer-request-payment-amount")}" 
          description=${`$${null===(s=this.paymentInformation)||void 0===s?void 0:s.request.amount}`} variant="stacked">
          </bbva-list-simple>`:""}
          ${null!==(b=this.paymentInformation)&&void 0!==b&&null!==(d=b.request)&&void 0!==d&&d.reference?o`<bbva-list-simple label="${this.t("codi-p2p-mobile-transfer-request-payment-reference")}"
            description=${null===(u=this.paymentInformation.request)||void 0===u?void 0:u.reference} variant="stacked">
          </bbva-list-simple>`:""}
          ${null!==(v=this.paymentInformation)&&void 0!==v&&null!==(p=v.request)&&void 0!==p&&p.concept?o`<bbva-list-simple label="${this.t("codi-p2p-mobile-transfer-request-payment-concept")}"
            description=${null===(m=this.paymentInformation)||void 0===m||null===(h=m.request)||void 0===h?void 0:h.concept} variant="stacked">
          </bbva-list-simple>`:""}
          <bbva-list-simple label="${this.t("codi-p2p-mobile-transfer-request-payment-expiration-date")}"
            description=${null===(g=this.paymentInformation)||void 0===g||null===(y=g.request)||void 0===y?void 0:y.expirationDate.toLocaleTimeString(this.language,this.dateOptions)} id="expirationDate" variant="stacked">
          </bbva-list-simple>
        </div>
      </bbva-expandable-step>
  `}_stepAccountsPayment(){return o`
      <bbva-expandable-step
        id="step-1"
        header="${this.t("codi-p2p-mobile-transfer-send-step1-header")}"
        disabled-target=".action"
        @expandable-step-edit-step="${this._openModalAlertChangeAccount}"
        step="0"
        hide-padding-top
        totalSteps="${this.maxSteps}"
        class="step-four animation"
        tabindex="-1"
        current-step-label="${this.t("codi-p2p-mobile-transfer-request-heading-step-label",{step:this.stepAccount,total:this.maxSteps})}"
        edit-label="${this.t("codi-p2p-mobile-transfer-request-step-edit-text")}"
        @multistep-bind-summary-property="${this.bindAccountSummary}"
      >
        <div class="content">
          <bbva-step-account-list-codi-request
          .balance="${this.balance}"
          .dataContracts="${this.dataContracts}"
          >
          </bbva-step-account-list-codi-request>
        </div>
        <div class="summary" slot="summary" ambient="${this.ambient}">
          <bbva-multistep-codi-payments-request-summary    step="summary-step-0"
            .accountSelect="${this.accountSelect}"
         >
        </bbva-multistep-codi-payments-request-summary>
        </div>
      </bbva-expandable-step>
    `}_stepAccountsRequest(){return o`
    <bbva-expandable-step
      id="step-1"
      header="${this.t("codi-p2p-mobile-transfer-request-step1-header")}"
      disabled-target=".action"
      @expandable-step-edit-step="${this._openModalAlertChangeAccount}"
      current-step-label="${this.t("codi-p2p-mobile-transfer-request-heading-step-label",{step:this.stepAccount,total:this.maxSteps})}"
      step="0"
      hide-padding-top
      totalSteps="${this.maxSteps}"
      class="step-one animation"
      tabindex="-1"
      edit-label="${this.dataContracts.length>1?this.t("codi-p2p-mobile-transfer-request-step-edit-text"):""}"
      @multistep-bind-summary-property="${this.bindAccountSummary}"
    >
      <div class="content">
        <bbva-step-account-list-codi-request
          .balance="${this.balance}"
          .dataContracts="${this.dataContracts}"
          .maxSteps="${this.maxSteps}"
        >
        </bbva-step-account-list-codi-request>
      </div>
      <div class="summary" slot="summary" ambient="${this.ambient}">
        <bbva-multistep-codi-payments-request-summary    step="summary-step-0"
          .accountSelect="${this.accountSelect}"
        >
        </bbva-multistep-codi-payments-request-summary>
      </div>
    </bbva-expandable-step>`}_renderListDefAmount(){return this.amount>0?o`
      <bbva-list-definition-amount
        id="defAmount"
        center
        amount="${this.amount}"
        variant-amount="4xl"
        decimal-digits="2"
        currency-code="${this.localCurrency}"
        local-currency="${this.localCurrency}"
        language="${this.language}"
        ?show="${!this.disabledButtonPaymentRequest}"
        ?hidden="${this.disabledButtonPaymentRequest}"
        title="${this.isPayment?this.t("codi-p2p-mobile-transfer-send-amount-to-send"):this.t("codi-p2p-mobile-transfer-request-amount-to-request")}"
        description="${this.t("codi-p2p-mobile-transfer-request-commission",{commission:parseFloat(this.commission).toFixed(2)})}">
      </bbva-list-definition-amount>
        <bbva-button-default
        id="paymentRequestBtn"
        ?show="${!this.disabledButtonPaymentRequest}"
        ?hidden="${this.disabledButtonPaymentRequest}"
        text="${this.isPayment?this.t("codi-refactor-payment-request-button-send-money"):this.t("codi-p2p-mobile-transfer-request-button-request")}"
        @click="${this.onClickPaymentRequest}"
        ?disabled="${this.disabledButtonPaymentRequest}"
        class="center-button">
      </bbva-button-default>`:o`
      <bbva-button-default
        id="paymentRequestBtn"
        ?show="${!this.disabledButtonPaymentRequest}"
        ?hidden="${this.disabledButtonPaymentRequest}"
        text="${this.isPayment?this.t("codi-refactor-payment-request-button-send-money"):this.t("codi-p2p-mobile-transfer-request-button-request")}"
        @click="${this.onClickPaymentRequest}"
        ?disabled="${this.disabledButtonPaymentRequest}"
        class="center-button">
      </bbva-button-default>`}_onClickHeaderButtonMain(){this._fireEvent("close-header-main",!1)}_renderMultiStepHeader(){return o`
    <bbva-header-main
      id="header"
      variant="modal"
      icon-size="20"
      position="fixed"
      accessibility-text-icon-right-primary="Close"
      .iconRightPrimary="${N()}"
      .text="${this.isPayment?this.t("codi-refactor-payment-request-header-send-money"):this.t("codi-p2p-mobile-transfer-request-header")}"
      @header-main-icon-right-primary-click="${this._onClickHeaderButtonMain}"
      >
      </bbva-header-main>`}get _fixedIOSHeader(){return o`
      <div ?hidden="${!this.isNativeIos}" class="native-fixed-header"></div>
    `}render(){return this.isPayment?o`
        ${this._fixedIOSHeader}
        ${this._renderMultiStepHeader()}
        <bbva-expandable-multistep
          id="multistepPayment"
          step-selector='[data-tag-name="bbva-expandable-step"]'
          class="scrollable">
          <!-- PAYMENT SUMMARY -->
          ${this._renderPaymentSummary()}
          <!-- ACCOUNT STEP1 -->
          ${this._stepAccountsPayment()}
          <!-- AMOUNT STEP2 -->
          ${this._stepAmountInput()}
        <!-- DEFINITION AMOUNT -->
          ${1===this.maxSteps||2===this.maxSteps&&!this.disabledButtonAmount?this._renderListDefAmount():""}
        </bbva-expandable-multistep>
       `:o`
        ${this._fixedIOSHeader}
        ${this._renderMultiStepHeader()}
        <bbva-expandable-multistep
          id="multistepRequest"
          step-selector='[data-tag-name="bbva-expandable-step"]'
          >
<!-- ACCOUNT STEP1 -->
          ${this._stepAccountsRequest()}
          <!-- CONTACT STEP2 -->
          ${this._stepContactSelector()}
          <!-- AMOUNT STEP3 -->
          ${this._stepAmountInput()}
          <!-- CONCEPT STEP4 -->
          ${this._stepConceptInput()}
          <!-- DEFINITION AMOUNT -->
          ${this._renderListDefAmount()}
        </bbva-expandable-multistep>
        `}}class Ht extends(S(C)){static get is(){return"bbva-multistep-codi-payments-request-summary"}static get properties(){return{accountSelect:{type:Object},amountRequest:{type:Number},conceptRequest:{type:String},referenceRequest:{type:String},step:{type:String},ambient:{type:String}}}constructor(){super(),this.amountRequest=0,this.accountSelect={},this.step=""}static get styles(){return[Ft,nt.dark,e("bbva-multistep-codi-payments-request-summary")]}step0Summary(){return o`
        <bbva-list-multistep-account
            .name="${this.accountSelect.productTitle?this.accountSelect.productTitle:""}"
            .amount="${this.accountSelect.specificAmount?this.accountSelect.specificAmount:""}"
            .number="${this.accountSelect.numProduct}"
            .description="${this.accountSelect.specificAmountName?this.accountSelect.specificAmountName:""}"
            visible-chars="4"
            currency-code="MXN"
            language="es-MX"
            local-currency="MXN"
            >
        </bbva-list-multistep-account>
      `}render(){return o`${this.step0Summary()}`}}const Ot={light:t`
[ambient^=light] {
  --bbva-button-default-color: initial;
  --bbva-button-default-bg-color: initial;
  --bbva-button-default-border-color: initial;
  --bbva-button-default-opacity: initial;
  --bbva-button-default-color-active: initial;
  --bbva-button-default-bg-color-active: initial;
  --bbva-button-default-border-color-active: initial;
  --bbva-button-default-opacity-active: initial;
  --bbva-button-default-color-disabled: initial;
  --bbva-button-default-bg-color-disabled: initial;
  --bbva-button-default-border-color-disabled: initial;
  --bbva-button-default-opacity-disabled: initial;
  --bbva-button-default-secondary-color: initial;
  --bbva-button-default-secondary-bg-color: initial;
  --bbva-button-default-secondary-border-color: initial;
  --bbva-button-default-secondary-opacity: initial;
  --bbva-button-default-secondary-outline-color: initial;
  --bbva-button-default-secondary-color-active: initial;
  --bbva-button-default-secondary-bg-color-active: initial;
  --bbva-button-default-secondary-border-color-active: initial;
  --bbva-button-default-secondary-opacity-active: initial;
  --bbva-button-default-secondary-color-disabled: initial;
  --bbva-button-default-secondary-bg-color-disabled: initial;
  --bbva-button-default-secondary-border-color-disabled: initial;
  --bbva-button-default-secondary-opacity-disabled: initial;
  --bbva-button-default-secondary-outline-color-disabled: initial;
  --bbva-button-default-positive-color: initial;
  --bbva-button-default-positive-bg-color: initial;
  --bbva-button-default-positive-border-color: initial;
  --bbva-button-default-positive-opacity: initial;
  --bbva-button-default-positive-color-active: initial;
  --bbva-button-default-positive-bg-color-active: initial;
  --bbva-button-default-positive-border-color-active: initial;
  --bbva-button-default-positive-opacity-active: initial;
  --bbva-button-default-positive-color-disabled: initial;
  --bbva-button-default-positive-bg-color-disabled: initial;
  --bbva-button-default-positive-border-color-disabled: initial;
  --bbva-button-default-positive-opacity-disabled: initial;
  --bbva-button-default-link-color: initial;
  --bbva-button-default-link-bg-color: initial;
  --bbva-button-default-link-border-color: initial;
  --bbva-button-default-link-opacity: initial;
  --bbva-button-default-link-outline-color: initial;
  --bbva-button-default-link-color-active: initial;
  --bbva-button-default-link-bg-color-active: initial;
  --bbva-button-default-link-border-color-active: initial;
  --bbva-button-default-link-opacity-active: initial;
  --bbva-button-default-link-color-disabled: initial;
  --bbva-button-default-link-bg-color-disabled: initial;
  --bbva-button-default-link-border-color-disabled: initial;
  --bbva-button-default-link-opacity-disabled: initial;
  --bbva-button-default-link-outline-color-disabled: initial;
  --bbva-button-default-icon-background: initial;
  --bbva-button-default-icon-color: initial;
  --bbva-button-default-icon-background-opacity: initial;
  --bbva-button-default-icon-color-variant: initial;
  --bbva-button-default-icon-color-variant-white: initial;
  --bbva-button-default-icon-background-focus: initial;
  --bbva-button-default-icon-color-focus: initial;
  --bbva-button-default-icon-color-focus-variant: initial;
  --bbva-button-default-icon-color-focus-variant-white: initial;
  --bbva-button-default-icon-background-disabled: initial;
  --bbva-button-default-icon-color-disabled: initial;
  --bbva-button-default-icon-color-disabled-variant: initial;
  --bbva-button-default-icon-color-disabled-variant-white: initial;
  --bbva-button-default-alert-opacity: initial;
  --bbva-button-default-alert-color: initial;
  --bbva-button-default-alert-bg-color: initial;
  --bbva-button-default-alert-active-color: initial;
  --bbva-button-default-alert-active-bg-color: initial;
  --bbva-button-default-alert-disabled-color: initial;
  --bbva-button-default-alert-disabled-bg-color: initial;
  --bbva-button-default-interaction-bg-color: initial;
  --bbva-button-default-interaction-icon-color: initial;
  --bbva-button-default-interaction-border-color: initial;
  --bbva-button-default-interaction-bg-glow-color: initial;
  --bbva-button-default-interaction-disabled-icon-color: initial;
  --bbva-button-default-interaction-disabled-bg-color: initial;
  --bbva-button-default-interaction-disabled-opacity: initial;
}
`,dark:t`
[ambient^=dark] {
  --bbva-button-default-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-border-color: transparent;
  --bbva-button-default-opacity: 1;
  --bbva-button-default-color-active: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreLight, ${a(h.primaryCoreLight)});
  --bbva-button-default-border-color-active: transparent;
  --bbva-button-default-opacity-active: 1;
  --bbva-button-default-color-disabled: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-border-color-disabled: transparent;
  --bbva-button-default-opacity-disabled: 0.4;
  --bbva-button-default-secondary-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-secondary-bg-color: transparent;
  --bbva-button-default-secondary-border-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-secondary-opacity: 1;
  --bbva-button-default-secondary-outline-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-secondary-color-active: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-secondary-bg-color-active: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-secondary-border-color-active: transparent;
  --bbva-button-default-secondary-opacity-active: 1;
  --bbva-button-default-secondary-color-disabled: var(--colorsSecondary400, ${a(h.secondary400)});
  --bbva-button-default-secondary-bg-color-disabled: transparent;
  --bbva-button-default-secondary-border-color-disabled: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-secondary-opacity-disabled: 0.4;
  --bbva-button-default-secondary-outline-color-disabled: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-link-color: var(--colorsPrimarySubdued, ${a(h.primarySubdued)});
  --bbva-button-default-link-bg-color: transparent;
  --bbva-button-default-link-border-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-link-opacity: 1;
  --bbva-button-default-link-outline-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-link-color-active: var(--colorsPrimaryMediumLight, ${a(h.primaryMediumLight)});
  --bbva-button-default-link-bg-color-active: transparent;
  --bbva-button-default-link-border-color-active: transparent;
  --bbva-button-default-link-opacity-active: 1;
  --bbva-button-default-link-color-disabled: var(--colorsPrimarySubdued, ${a(h.primarySubdued)});
  --bbva-button-default-link-bg-color-disabled: transparent;
  --bbva-button-default-link-border-color-disabled: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-link-opacity-disabled: 0.4;
  --bbva-button-default-link-outline-color-disabled: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-positive-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-positive-bg-color: var(--colorsPrimaryVariantDark, ${a(h.primaryVariantDark)});
  --bbva-button-default-positive-border-color: transparent;
  --bbva-button-default-positive-opacity: 1;
  --bbva-button-default-positive-color-active: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-positive-bg-color-active: var(--colorsPrimaryVariantDarkened, ${a(h.primaryVariantDarkened)});
  --bbva-button-default-positive-border-color-active: transparent;
  --bbva-button-default-positive-opacity-active: 1;
  --bbva-button-default-positive-color-disabled: var(--colorsSecondary400, ${a(h.secondary400)});
  --bbva-button-default-positive-bg-color-disabled: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-positive-border-color-disabled: transparent;
  --bbva-button-default-positive-opacity-disabled: 0.4;
  --bbva-button-default-icon-background: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-icon-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-icon-background-opacity: 0.4;
  --bbva-button-default-icon-color-variant: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-icon-color-variant-white: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-icon-background-focus: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-icon-color-focus: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-icon-color-focus-variant: var(--colorsPrimaryMediumLight, ${a(h.primaryMediumLight)});
  --bbva-button-default-icon-color-focus-variant-white: var(--colorsPrimaryMediumLight, ${a(h.primaryMediumLight)});
  --bbva-button-default-icon-background-disabled: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-icon-color-disabled: var(--colorsSecondary400, ${a(h.secondary400)});
  --bbva-button-default-icon-color-disabled-variant: var(--colorsSecondary400, ${a(h.secondary400)});
  --bbva-button-default-icon-color-disabled-variant-white: var(--colorsSecondary400, ${a(h.secondary400)});
  --bbva-button-default-alert-opacity: 0.4;
  --bbva-button-default-alert-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-alert-bg-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-alert-active-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-alert-active-bg-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-alert-disabled-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-alert-disabled-bg-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-interaction-bg-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-interaction-icon-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-interaction-border-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-interaction-bg-glow-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-interaction-disabled-icon-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-interaction-disabled-bg-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-interaction-disabled-opacity: 0.4;
}

[ambient^=dark200] {
  --bbva-button-default-bg-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-secondary-color-active: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-secondary-bg-color-active: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-button-default-secondary-opacity-active: 1;
  --bbva-button-default-positive-bg-color-disabled: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-icon-background: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-icon-background-opacity: 0.4;
  --bbva-button-default-icon-background-focus: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-icon-background-disabled: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-alert-bg-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-alert-active-bg-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-alert-disabled-bg-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-interaction-bg-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-interaction-border-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-interaction-bg-glow-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-interaction-disabled-bg-color: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-interaction-disabled-opacity: 0.4;
}

[ambient^=dark300] {
  --bbva-button-default-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreDarkened, ${a(h.primaryCoreDarkened)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-positive-bg-color-disabled: var(--colorsPrimaryCore, ${a(h.primaryCore)});
  --bbva-button-default-icon-background: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-icon-background-opacity: 0.4;
  --bbva-button-default-icon-color-variant: var(--colorsPrimarySubdued, ${a(h.primarySubdued)});
  --bbva-button-default-icon-background-focus: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-icon-background-disabled: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-alert-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-alert-active-bg-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-alert-disabled-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-interaction-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-interaction-border-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-interaction-bg-glow-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-interaction-disabled-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-interaction-disabled-opacity: 0.4;
}

[ambient^=dark400] {
  --bbva-button-default-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-icon-background: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-icon-background-opacity: 0.4;
  --bbva-button-default-icon-color-variant: var(--colorsPrimarySubdued, ${a(h.primarySubdued)});
  --bbva-button-default-icon-background-focus: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-icon-background-disabled: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-alert-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-alert-active-bg-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-alert-disabled-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-interaction-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-interaction-border-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-interaction-bg-glow-color: var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)});
  --bbva-button-default-interaction-disabled-bg-color: var(--colorsPrimaryMedium, ${a(h.primaryMedium)});
  --bbva-button-default-interaction-disabled-opacity: 0.4;
}
`};var Xt=t`
:host {
  box-sizing: border-box;
  position: relative;
  max-width: var(--bbva-button-default-max-width, 18rem);
  min-width: var(--bbva-button-default-min-width, 8rem);
  height: 3rem;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 15) * 1em) calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 15) * 1em);
  text-align: center;
  border-radius: var(--bbva-button-default-border-radius, var(--borderRadiusSmall, ${a(F.small)}));
  border: none;
  margin-left: var(--bbva-button-default-margin-left, 0);
  --_button-default-color: var(--bbva-button-default-dark-mode-color, var(--bbva-button-default-color,var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-bg-color: var(--bbva-button-default-bg-dark-mode-color, var(--bbva-button-default-bg-color,var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-opacity: var(--bbva-button-default-opacity, 1);
  --_button-default-color-active: var(--bbva-button-default-dark-mode-color-active, var(--bbva-button-default-color-active, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-bg-color-active: var(--bbva-button-default-bg-dark-mode-color-active, var(--bbva-button-default-bg-color-active, var(--colorsPrimaryCoreLight, ${a(h.primaryCoreLight)})));
  --_button-default-opacity-active: var(--bbva-button-default-opacity-active, 1);
  --_button-default-bg-color-disabled: var(--bbva-button-default-bg-dark-mode-color-disabled, var(--bbva-button-default-bg-color-disabled,var(--colorsSecondary200, ${a(h.secondary200)})));
  --_button-default-color-disabled: var(--bbva-button-default-dark-mode-disabled,var(--bbva-button-default-color-disabled,var(--colorsSecondary400, ${a(h.secondary400)})));
  --_button-default-opacity-disabled: var(--bbva-button-default-dark-mode-opacity-disabled, var(--bbva-button-default-opacity-disabled, 1));
  --_button-default-color-secondary: var(--bbva-button-default-secondary-dark-mode-color, var(--bbva-button-default-secondary-color,var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-bg-color-secondary: var(--bbva-button-default-secondary-bg-color, transparent);
  --_button-default-opacity-secondary: var(--bbva-button-default-secondary-opacity, 1);
  --_button-default-border-color-secondary: var(--bbva-button-default-secondary-border-dark-mode-color, var(--bbva-button-default-secondary-border-color,var(--colorsSecondary300, ${a(h.secondary300)})));
  --_button-default-color-secondary-active: var(--bbva-button-default-secondary-dark-mode-color-active, var(--bbva-button-default-secondary-color-active,var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-bg-color-secondary-active: var(--bbva-button-default-secondary-bg-dark-mode-color-active, var(--bbva-button-default-secondary-bg-color-active,var(--colorsSecondary100, ${a(h.secondary100)})));
  --_button-default-border-color-secondary-active: var(--bbva-button-default-secondary-border-color-active, transparent);
  --_button-default-opacity-secondary-active: var(--bbva-button-default-secondary-opacity-active, 1);
  --_button-default-color-secondary-disabled: var(--bbva-button-default-secondary-dark-mode-color-disabled, var(--bbva-button-default-secondary-color-disabled,var(--colorsSecondary400, ${a(h.secondary400)})));
  --_button-default-bg-color-secondary-disabled: var(--bbva-button-default-secondary-bg-dark-mode-color-disabled, var(--bbva-button-default-secondary-bg-color-disabled,var(--colorsSecondary200, ${a(h.secondary200)})));
  --_button-default-border-color-secondary-disabled: var(--bbva-button-default-border-dark-mode-color-disabled, var(--bbva-button-default-secondary-border-color-disabled, transparent));
  --_button-default-opactiy-secondary-disabled: var(--bbva-button-default-secondary-opacity-disabled, 0.4);
  --_button-default-color-link: var(--bbva-button-default-link-dark-mode-color, var(--bbva-button-default-link-color,var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-bg-color-link: transparent;
  --_button-default-opacity-link: var(--bbva-button-default-link-opacity, 1);
  --_button-default-border-color-link: var(--bbva-button-default-link-border-color,var(--colorsSecondary300, ${a(h.secondary300)}));
  --_button-default-color-link-active: var(--bbva-button-default-link-dark-mode-color-active, var(--bbva-button-default-link-color-active, var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)})));
  --_button-default-bg-color-link-active: var(--bbva-button-default-link-bg-color-active, transparent);
  --_button-default-border-color-link-active: var(--bbva-button-default-link-border-color-active, transparent);
  --_button-default-opacity-link-active: var(--bbva-button-default-link-opacity-active, 1);
  --_button-default-color-link-disabled: var(--bbva-button-default-link-dark-mode-color-disabled, var(--bbva-button-default-link-color-disabled,var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-bg-color-link-disabled: var(--bbva-button-default-link-bg-color-disabled,var(--colorsSecondary200, ${a(h.secondary200)}));
  --_button-default-border-color-link-disabled: var(--bbva-button-default-link-border-color-disabled, transparent);
  --_button-default-opactiy-link-disabled: var(--bbva-button-default-link-opacity-disabled, 0.4);
  --_button-default-color-positive: var(--bbva-button-default-positive-dark-mode-color, var(--bbva-button-default-positive-color,var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-bg-color-positive: var(--bbva-button-default-positive-bg-dark-mode-color, var(--bbva-button-default-positive-bg-color,var(--colorsPrimaryVariantDark, ${a(h.primaryVariantDark)})));
  --_button-default-opacity-positive: var(--bbva-button-default-positive-opacity, 1);
  --_button-default-color-positive-active: var(--bbva-button-default-positive-dark-mode-color-active, var(--bbva-button-default-positive-color-active,var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-bg-color-positive-active: var(--bbva-button-default-positive-bg-dark-mode-color-active, var(--bbva-button-default-positive-bg-color-active,var(--colorsPrimaryVariantDarkened, ${a(h.primaryVariantDarkened)})));
  --_button-default-opacity-positive-active: var(--bbva-button-default-positive-opacity-active, 1);
  --_button-default-color-positive-disabled: var(--bbva-button-default-positive-dark-mode-color-disabled, var(--bbva-button-default-positive-color-disabled,var(--colorsSecondary400, ${a(h.secondary400)})));
  --_button-default-bg-color-positive-disabled: var(--bbva-button-default-positive-bg-dark-mode-color-disabled, var(--bbva-button-default-positive-bg-color-disabled,var(--colorsSecondary200, ${a(h.secondary200)})));
  --_button-default-opacity-positive-disabled: var(--bbva-button-default-positive-opacity-disabled, 0.4);
  --_button-default-bg-icon: var(--bbva-button-default-icon-dark-mode-background, var(--bbva-button-default-icon-background, var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-bg-icon-focus: var(--bbva-button-default-icon-dark-mode-background-focus, var(--bbva-button-default-icon-background-focus, var(--colorsPrimaryCoreLight, ${a(h.primaryCoreLight)})));
  --_button-default-bg-icon-disabled: var(--bbva-button-default-icon-dark-mode-background-disabled, var(--bbva-button-default-icon-background-disabled, var(--colorsSecondary200, ${a(h.secondary200)})));
  --_button-default-color-icon: var(--bbva-button-default-icon-dark-mode-color, var(--bbva-button-default-icon-color, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-color-icon-focus: var(--bbva-button-default-icon-dark-mode-color-focus, var(--bbva-button-default-icon-color-focus, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-color-icon-disabled: var(--bbva-button-default-icon-dark-mode-color-disabled, var(--bbva-button-default-icon-color-disabled, var(--colorsSecondary400, ${a(h.secondary400)})));
  --_button-default-bg-icon-opacity: var(--bbva-button-default-icon-dark-mode-background-opacity, var(--bbva-button-default-icon-background-opacity, 1));
  --_button-default-color-icon-variant: var(--bbva-button-default-icon-dark-mode-color-variant, var(--bbva-button-default-icon-color-variant, var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-color-icon-focus-variant: var(--bbva-button-default-icon-dark-mode-color-focus-variant, var(--bbva-button-default-icon-color-focus-variant, var(--colorsPrimaryCore, ${a(h.primaryCore)})));
  --_button-default-color-icon-disabled-variant: var(--bbva-button-default-icon-dark-mode-color-disabled-variant, var(--bbva-button-default-icon-color-disabled-variant, var(--colorsSecondary400, ${a(h.secondary400)})));
  --_button-default-color-icon-variant-white: var(--bbva-button-default-icon-dark-mode-color-variant-white, var(--bbva-button-default-icon-color-variant-white, var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-color-icon-focus-variant-white: var(--bbva-button-default-icon-dark-mode-color-focus-variant-white, var(--bbva-button-default-icon-color-focus-variant-white, var(--colorsPrimaryCore, ${a(h.primaryCore)})));
  --_button-default-color-icon-disabled-variant-white: var(--bbva-button-default-icon-dark-mode-color-disabled-variant-white, var(--bbva-button-default-icon-color-disabled-variant-white, var(--colorsSecondary400, ${a(h.secondary400)})));
  --_button-default-alert-opacity: var(--bbva-button-default-alert-dark-mode-opacity, var(--bbva-button-default-alert-opacity, 1));
  --_button-default-alert-color: var(--bbva-button-default-alert-dark-mode-color, var(--bbva-button-default-alert-color, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-alert-bg-color: var(--bbva-button-default-alert-dark-mode-bg-color, var(--bbva-button-default-alert-bg-color, var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-alert-active-color: var(--bbva-button-default-alert-dark-mode-active-color, var(--bbva-button-default-alert-active-color, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-alert-active-bg-color: var(--bbva-button-default-alert-dark-mode-active-bg-color, var(--bbva-button-default-alert-active-bg-color, var(--colorsPrimaryCoreLight, ${a(h.primaryCoreLight)})));
  --_button-default-alert-disabled-color: var(--bbva-button-default-alert-dark-mode-disabled-color, var(--bbva-button-default-alert-disabled-color, var(--colorsSecondary400, ${a(h.secondary400)})));
  --_button-default-alert-disabled-bg-color: var(--bbva-button-default-alert-dark-mode-disabled-bg-color, var(--bbva-button-default-alert-disabled-bg-color, var(--colorsSecondary200, ${a(h.secondary200)})));
  --_button-default-interaction-bg-color: var(--bbva-button-default-interaction-dark-mode-bg-color, var(--bbva-button-default-interaction-bg-color, var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-interaction-bg-glow-color: var(--bbva-button-default-interaction-dark-mode-bg-glow-color, var(--bbva-button-default-interaction-bg-glow-color, var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-interaction-icon-color: var(--bbva-button-default-interaction-dark-mode-icon-color, var(--bbva-button-default-interaction-icon-color, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)})));
  --_button-default-interaction-border-color: var(--bbva-button-default-interaction-dark-mode-border-color, var(--bbva-button-default-interaction-border-color, var(--colorsPrimaryMedium, ${a(h.primaryMedium)})));
  --_button-default-interaction-disabled-icon-color: var(--bbva-button-default-interaction-dark-mode-disabled-icon-color, var(--bbva-button-default-interaction-disabled-icon-color, var(--colorsSecondary400, ${a(h.secondary400)})));
  --_button-default-interaction-disabled-bg-color: var(--bbva-button-default-interaction-dark-mode-disabled-bg-color, var(--bbva-button-default-interaction-disabled-bg-color, var(--colorsSecondary200, ${a(h.secondary200)})));
  --_button-default-interaction-disabled-opacity: var(--bbva-button-default-interaction-dark-mode-disabled-opacity, var(--bbva-button-default-interaction-disabled-opacity, 1));
  transition: background-color var(--fast-transition, 0.2s), color var(--fast-transition, 0.2s);
}

.text {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  display: block;
}

:host, [data-tag-name=bbva-text] {
  font-size: var(--bbva-button-default-font-size, var(--typographyTypeSmall, ${a(m.typeSmall)}));
  line-height: var(--bbva-button-default-line-height, var(--lineHeightTypeSmall, ${a(V.typeSmall)}));
  font-weight: var(--bbva-button-default-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(p.medium.fontWeight)}));
}

.wrapper {
  display: contents;
}

button {
  box-sizing: border-box;
  padding: 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:focus) {
  outline: none;
}

:host(:not([href])) {
  color: var(--_button-default-color);
  border: none;
  border-radius: var(--bbva-button-default-border-radius, var(--borderRadiusSmall, ${a(F.small)}));
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 15) * 1em) calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 15) * 1em);
}

:host([aria-disabled=true]) {
  color: var(--_button-default-color-disabled);
}

:host([variant=icon]:focus) {
  outline: none;
}

:host,
:host(.primary),
:host([variant=primary]) {
  color: var(--_button-default-color);
  background-color: var(--_button-default-bg-color);
  opacity: var(--_button-default-opacity);
}
:host [data-tag-name=bbva-text],
:host(.primary) [data-tag-name=bbva-text],
:host([variant=primary]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color);
}

:host(.alert),
:host([variant=alert]) {
  color: var(--_button-default-color);
  opacity: var(--_button-default-opacity);
  border: none;
  max-width: var(--bbva-button-default-max-width);
  min-width: var(--bbva-button-default-min-width, 16rem);
  height: 2.5rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 15) * 1em);
  font-size: var(--bbva-button-default-alert-font-size, var(--typographyTypeSmall, ${a(m.typeSmall)}));
  line-height: var(--bbva-button-default-alert-line-height, var(--lineHeightTypeSmall, ${a(V.typeSmall)}));
  font-weight: var(--bbva-button-default-alert-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(p.medium.fontWeight)}));
  font-style: var(--bbva-button-default-alert-font-style, var(--fontFacePrimaryMediumFontStyle, ${a(p.medium.fontStyle)}));
  background-color: var(--bbva-button-default-alert-bg-color, var(--colorsPrimaryMedium, ${a(h.primaryMedium)}));
}
:host(.alert) [data-tag-name=bbva-text],
:host([variant=alert]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color);
}
:host(.alert) [data-tag-name=bbva-icon],
:host([variant=alert]) [data-tag-name=bbva-icon] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

:host([variant=icon]:not([href])) {
  border: none;
  border-radius: var(--bbva-button-default-icon-border-radius, var(--borderRadiusSmall, ${a(F.small)}));
  background-color: var(--_button-default-bg-icon);
}
:host([variant=icon]:not([href])) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon);
}

:host([variant=alert]:not([href])) {
  border-radius: var(--borderRadiusSmall, ${a(F.small)});
  border: var(--bbva-button-default-alert-border, none);
  color: var(--_button-default-alert-color);
}

:host([variant~=icon][variant~=no-background]) {
  border: 1px solid var(--colorsSecondary300, ${a(h.secondary300)});
  --_button-default-bg-icon: transparent;
  --_button-default-bg-icon-focus: transparent;
  --_button-default-bg-icon-disabled: transparent;
  border: none;
  border-radius: 0.0625rem;
}

:host([variant=icon][disabled]) {
  border: none;
  background-color: var(--_button-default-bg-icon-disabled);
  opacity: var(--_button-default-bg-icon-opacity);
}
:host([variant=icon][disabled]) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-disabled);
}

:host([variant=icon][focus-visible]) {
  border: none;
  border-radius: var(--bbva-button-default-icon-border-radius, var(--borderRadiusSmall, ${a(F.small)}));
  background-color: var(--_button-default-bg-icon-focus);
}
:host([variant=icon][focus-visible]) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-focus);
}

:host([variant=icon][active]) {
  border: none;
  border-radius: var(--bbva-button-default-icon-border-radius, var(--borderRadiusSmall, ${a(F.small)}));
  background-color: var(--_button-default-bg-icon-focus);
}
:host([variant=icon][active]) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-focus);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host(.primary[active]:not([aria-disabled=true])) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host(.primary),
:host([variant=primary]:not([href])[active]:not([aria-disabled=true])) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host([active]),
:host(.primary[active]),
:host([variant=primary][active]) {
  color: var(--_button-default-color-active);
  background-color: var(--_button-default-bg-color-active);
  opacity: var(--_button-default-opacity-active);
}

:host(.secondary),
:host([variant=secondary]) {
  color: var(--_button-default-color-secondary);
  background-color: var(--_button-default-bg-color-secondary);
  opacity: var(--_button-default-opacity-secondary);
  border: 1px solid var(--_button-default-border-color-secondary);
}
:host(.secondary) [data-tag-name=bbva-text],
:host([variant=secondary]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-secondary);
}

:host(.positive),
:host([variant=positive]) {
  color: var(--_button-default-color-positive);
  background-color: var(--_button-default-bg-color-positive);
  opacity: var(--_button-default-opacity-positive);
}
:host(.positive) [data-tag-name=bbva-text],
:host([variant=positive]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-positive);
}

:host(.link),
:host([variant=link]) {
  color: var(--_button-default-color-link);
  background-color: var(--_button-default-bg-color-link, transparent);
  opacity: var(--_button-default-opacity-link);
  border: none;
  padding: 0;
  min-width: max-content;
  max-width: max-content;
  height: max-content;
}
:host(.link) [data-tag-name=bbva-text],
:host([variant=link]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-link);
}

:host([aria-disabled=true]),
:host(.primary[aria-disabled=true]),
:host([variant=primary][aria-disabled=true]) {
  color: var(--_button-default-color-disabled);
  background-color: var(--_button-default-bg-color-disabled);
  opacity: var(--_button-default-opacity-disabled);
}
:host([aria-disabled=true]) [data-tag-name=bbva-text],
:host(.primary[aria-disabled=true]) [data-tag-name=bbva-text],
:host([variant=primary][aria-disabled=true]) [data-tag-name=bbva-text] {
  opacity: 1;
  color: var(--_button-default-color-disabled);
}

:host(.link[active]),
:host([variant=link][active]) {
  color: var(--_button-default-color-link-active);
  background-color: var(--_button-default-bg-color-link-active);
  opacity: var(--_button-default-opacity-link-active);
}
:host(.link[active]) [data-tag-name=bbva-text],
:host([variant=link][active]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-link-active);
}

:host(.secondary[active]),
:host([variant=secondary][active]),
:host([variant=secondary][active]:not([aria-disabled=true])) {
  color: var(--_button-default-color-secondary-active);
  background-color: var(--_button-default-bg-color-secondary-active);
  border-color: var(--_button-default-border-color-secondary-active);
  opacity: var(--_button-default-opacity-secondary-active);
}
:host(.secondary[active]) [data-tag-name=bbva-text],
:host([variant=secondary][active]) [data-tag-name=bbva-text],
:host([variant=secondary][active]:not([aria-disabled=true])) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-secondary-active);
}

:host(.secondary[aria-disabled=true]),
:host([variant=secondary][aria-disabled=true]) {
  color: var(--_button-default-color-secondary-disabled);
  background-color: var(--_button-default-bg-color-secondary-disabled);
  border-color: var(--_button-default-border-color-secondary-disabled);
  opacity: var(--_button-default-opactiy-secondary-disabled);
}

:host(.positive[active]),
:host([variant=positive][active]),
:host([variant=positive][active]:not([aria-disabled=true])) {
  color: var(--_button-default-color-positive-active);
  background-color: var(--_button-default-bg-color-positive-active);
  opacity: var(--_button-default-opacity-positive-active);
}

:host(.positive[aria-disabled=true]),
:host([variant=positive][aria-disabled=true]) {
  color: var(--_button-default-color-positive-disabled);
  background-color: var(--_button-default-bg-color-positive-disabled);
  opacity: var(--_button-default-opacity-positive-disabled);
}

:host([variant=link][active]:not([aria-disabled=true])) {
  color: var(--_button-default-color-link-active);
  background-color: var(--_button-default-bg-color-link-active);
  opacity: var(--_button-default-opacity-link-active);
}
:host([variant=link][active]:not([aria-disabled=true])) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-link-active);
}

:host(.link[aria-disabled=true]),
:host([variant=link][aria-disabled=true]) {
  color: var(--_button-default-color-link-disabled);
  opacity: var(--_button-default-opactiy-link-disabled);
  background-color: transparent;
}
:host(.link[aria-disabled=true]) [data-tag-name=bbva-text],
:host([variant=link][aria-disabled=true]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-link-disabled);
}

:host([variant~=icon][variant~=no-background]:not([href])) {
  background: transparent;
}
:host([variant~=icon][variant~=no-background]:not([href])) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-variant);
}

:host([variant=icon]:not([href])[disabled]) {
  border: none;
  background-color: var(--_button-default-bg-icon-disabled);
  opacity: var(--_button-default-bg-icon-opacity);
}
:host([variant=icon]:not([href])[disabled]) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-disabled);
}

:host([variant=alert]:not([href])[active]:not([aria-disabled=true])) {
  color: var(--_button-default-alert-active-color);
  background: var(--_button-default-alert-active-bg-color);
}

:host(.icon),
:host([variant~=icon]) {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  box-sizing: border-box;
  max-width: var(--bbva-button-default-min-width, 3rem);
  min-width: var(--bbva-button-default-min-width, 3rem);
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1em);
}

:host([variant=icon]:not([href])[active]),
:host([variant=icon]:not([href])[active]:not([disabled])) {
  border: none;
  border-radius: var(--bbva-button-default-icon-border-radius, var(--borderRadiusSmall, ${a(F.small)}));
  background-color: var(--_button-default-bg-icon-focus);
}
:host([variant=icon]:not([href])[active]) [data-tag-name=bbva-icon],
:host([variant=icon]:not([href])[active]:not([disabled])) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-focus);
}

:host([variant=icon][hidden]),
[hidden] {
  display: none !important;
}

:host([variant~=icon][variant~=no-background][variant~=white]:not([href])) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-variant-white);
}

:host([variant~=icon][variant~=no-background][disabled]:not([href])[disabled]) {
  opacity: 0.4;
}
:host([variant~=icon][variant~=no-background][disabled]:not([href])[disabled]) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-disabled-variant);
}

:host([variant~=icon][variant~=no-background][variant~=white][disabled]:not([href])[disabled]) {
  opacity: 0.4;
}
:host([variant~=icon][variant~=no-background][variant~=white][disabled]:not([href])[disabled]) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-disabled-variant-white);
}

:host([variant~=icon][variant~=no-background][active]:not([href])[active]:not([href])[active]:not([disabled])) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-focus-variant);
}

:host([variant~=icon][variant~=no-background][variant~=white][active]:not([href])[active]:not([href])[active]:not([disabled])) [data-tag-name=bbva-icon] {
  fill: var(--_button-default-color-icon-focus-variant-white);
}

:host(.alert[active]),
:host([variant=alert][active]),
:host([variant=alert][active]:not([aria-disabled=true])) {
  color: var(--_button-default-color-active);
  background-color: var(--_button-default-bg-color-active);
  opacity: var(--_button-default-opacity-active);
}

:host(.alert[aria-disabled=true]),
:host([variant=alert][aria-disabled=true]) {
  opacity: var(--_button-default-alert-opacity);
  color: var(--_button-default-alert-disabled-color);
  background: var(--_button-default-alert-disabled-bg-color);
}

:host(.interaction),
:host([variant~=interaction]) {
  padding: 0;
  right: 0;
  box-sizing: border-box;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  max-width: var(--bbva-button-default-max-width, 3rem);
  min-width: var(--bbva-button-default-min-width, 3rem);
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

.transcript {
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 15) * 1em);
  border: 0;
}

:host([variant~=interaction][talking]:not([href]):not([aria-disabled=true])) {
  background-color: transparent;
}

.action::before {
  content: "";
  display: block;
  position: absolute;
  left: 0;
  top: 0;
  bottom: 0;
  right: 0;
  background-color: var(--_button-default-interaction-bg-color);
}
:host([variant~=interaction][talking]:not([href]):not([aria-disabled=true])) .action::before {
  background-color: transparent;
}
.action-icon {
  position: relative;
  color: var(--_button-default-interaction-icon-color);
}
:host([variant~=interaction][disabled]) .action {
  cursor: default;
  pointer-events: none;
  opacity: var(--_button-default-interaction-disabled-opacity);
}
:host([variant~=interaction][disabled]) .action-icon {
  color: var(--_button-default-interaction-disabled-icon-color);
}
:host([variant~=interaction][disabled]) .action::before {
  background-color: var(--_button-default-interaction-disabled-bg-color);
}
.action-glow .before {
  display: none;
  position: absolute;
  left: 50%;
  top: 50%;
  background-color: var(--_button-default-interaction-border-color);
  border-radius: 50%;
  width: 6rem;
  height: 6rem;
  transform: translate(-50%, -50%) scale(1);
  animation: lowerpulse 2s infinite;
  animation-play-state: paused;
}
:host([variant~=interaction][talking]) .action-glow .before {
  display: block;
  animation-play-state: running;
}
:host([variant~=interaction]:not([talking])) .action-glow .before {
  animation: animationempty;
}
.action-glow .after {
  display: none;
  position: absolute;
  left: 50%;
  top: 50%;
  background-color: var(--_button-default-interaction-bg-glow-color);
  border-radius: 50%;
  transform: translate(-50%, -50%) scale(1);
  width: 5rem;
  height: 5rem;
  animation: upperpulse 2s infinite;
  animation-play-state: paused;
}
:host([variant~=interaction][talking]) .action-glow .after {
  display: block;
  animation-play-state: running;
}
:host([variant~=interaction]:not([talking])) .action-glow .after {
  animation: animationempty;
}

/* MIC LISTENING ANIMATION */
@keyframes lowerpulse {
  0% {
    transform: translate(-50%, -50%) scale(0);
    opacity: 0;
  }
  50% {
    transform: translate(-50%, -50%) scale(1);
    opacity: 0.4;
  }
  100% {
    transform: translate(-50%, -50%) scale(0);
    opacity: 0;
  }
}
@keyframes upperpulse {
  0% {
    transform: translate(-50%, -50%) scale(0.81);
  }
  50% {
    transform: translate(-50%, -50%) scale(1);
  }
  100% {
    transform: translate(-50%, -50%) scale(0.81);
  }
}
@keyframes animationempty {
  0%, 100% {
    display: block;
  }
}
`;class Wt extends(c(S(j))){static get is(){return"bbva-button-default"}static get properties(){return{text:{type:String},icon:{type:String},buttonTranscriptLabel:{type:String,attribute:"button-transcript-label"},interaction:{type:Boolean},keepTalkingAnimation:{type:Boolean,attribute:"keep-talking-animation"},iconTalkingAnimation:{type:"String",attribute:"icon-talking-animation"},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"}}}static get scopedElements(){return{"bbva-icon":H,"bbva-text":b}}constructor(){super(),this.type="button",this.buttonTranscriptLabel="bbva-button-default-interaction-record-button",this.interaction=!1,this.keepTalkingAnimation=!1,this.iconTalkingAnimation=O(),this.hasEllipsis=!1,delete this.href}static get styles(){return[super.styles,Xt,Ot.light,Ot.dark,e("bbva-button-default-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._endRecord=this._endRecord.bind(this),this.interaction&&(this.addEventListener("mousedown",this._startRecord),this.addEventListener("keydown",this._keydownRecord),this.addEventListener("keyup",this._keyupRecord),this.addEventListener("blur",this._endRecord))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),document.removeEventListener("mouseup",this._endRecord),this.removeEventListener("mousedown",this._startRecord),this.removeEventListener("keydown",this._keydownRecord),this.removeEventListener("keyup",this._keyupRecord),this.removeEventListener("blur",this._endRecord)}get _talking(){return this._isTalking}_startRecord(){document.addEventListener("mouseup",this._endRecord),this._talking=!0,this.keepTalkingAnimation&&(this.icon=this.iconTalkingAnimation)}set _talking(t){t!==this._isTalking&&(t?(this.setAttribute("talking",""),this.dispatchEvent(new CustomEvent("button-interaction-mic-request",{detail:!0,composed:!0,bubbles:!0}))):(this.removeAttribute("talking"),this.dispatchEvent(new CustomEvent("button-interaction-mic-cancel",{detail:!0,composed:!0,bubbles:!0}))),this._isTalking=t,this.requestUpdate())}_keydownRecord(t){32!==t.keyCode&&13!==t.keyCode||this._startRecord()}_keyupRecord(t){32!==t.keyCode&&13!==t.keyCode||this._endRecord()}_endRecord(){document.removeEventListener("mouseup",this._endRecord);this._isTalkingAnimation||!this.keepTalkingAnimation?(this._talking=!1,this._isTalkingAnimation=!1,this.icon=X()):this._isTalkingAnimation=!0}get _icon(){return o` <bbva-icon class="icon" .icon="${this.icon}" size="24"></bbva-icon> `}get _text(){return void 0!==this.text?o`
          <bbva-text
            ?disabled="${this.disabled}"
            class="text"
            tag="span"
            .text=${this.text}
            ?ellipsis="${this.hasEllipsis}"
            alignment="center"
          ></bbva-text>
        `:o` <slot class="text"></slot> `}get _interaction(){return o`
      <div class="action transcript">
        <span id="action-container" class="action-glow">
          <span class="before"></span><span class="after"></span>
        </span>
        <span class="sr-only">${this.t(this.buttonTranscriptLabel)}</span>
        <bbva-icon class="action-icon" .icon="${this.icon}" size="24"></bbva-icon>
      </div>
    `}get _buttonDefault(){return this.interaction?o`${this._interaction}`:o`${void 0!==this.icon?this._icon:W}${this._text}${this._action}`}render(){return o` <div onclick="void(0)" class="wrapper">${this._buttonDefault}</div> `}}I("colors.primaryCoreLightened"),I("colors.primaryMedium"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLight"),I("colors.primaryCoreLightened"),I("colors.primaryMedium"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primarySubduedLight"),I("colors.cool90"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primarySubdued"),I("colors.primaryMediumLight"),I("colors.primarySubdued"),I("colors.primaryCoreLightened"),I("colors.primaryVariantDark"),I("colors.primaryCoreLightened"),I("colors.primaryVariantDarkened"),I("colors.primaryCoreLightened"),I("colors.primaryVariantDark"),I("colors.primaryMedium"),I("colors.primaryCoreLight"),I("colors.primaryCoreLight"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLightened"),I("colors.primaryMedium"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLight"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLight"),I("colors.primaryMedium"),I("colors.primaryCoreLight"),I("colors.primaryCoreLightened"),I("colors.primaryCoreLight"),I("colors.primaryCoreLightened"),I("colors.primaryMedium");const Ut=new r;var Gt=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1em);
  position: relative;
  background-color: var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${a(h.primarySubduedLight)}));
  --_notification-icon-color: var(--bbva-notification-message-icon-color, var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)}));
  --_notification-message-information-icon-color: var(--bbva-notification-message-information-icon-color, var(--colorsTertiaryType3Dark, ${a(h.tertiaryType3Dark)}));
  --_notification-message-success-icon-color: var(--bbva-notification-message-success-icon-color, var(--colorsTertiaryType6Dark, ${a(h.tertiaryType6Dark)}));
  --_notification-message-error-icon-color: var(--bbva-notification-message-error-icon-color, var(--colorsTertiaryType1Dark, ${a(h.tertiaryType1Dark)}));
  --_notification-message-sustainability-icon-color: var(--bbva-notification-message-sustainability-icon-color, var(--colorsPrimaryVariantDark, ${a(h.primaryVariantDark)}));
  --_notification-message-information-background-color: var(--bbva-notification-message-information-background-color, var(--colorsTertiaryType3Lightened, ${a(h.tertiaryType3Lightened)}));
  --_notification-message-success-background-color: var(--bbva-notification-message-success-background-color, var(--colorsTertiaryType6Lightened, ${a(h.tertiaryType6Lightened)}));
  --_notification-message-error-background-color: var(--bbva-notification-message-error-background-color, var(--colorsTertiaryType5Lightened, ${a(h.tertiaryType5Lightened)}));
  --_notification-message-sustainability-background-color: var(--bbva-notification-message-sustainability-background-color, var(--colorsPrimaryVariantLightened, ${a(h.primaryVariantLightened)}));
  --_notification-message-title-color: var(--bbva-notification-message-title-color, var(--colorsSecondary600, ${a(h.secondary600)}));
  --_notification-message-paragraph-color: var(--bbva-notification-message-paragraph-color, var(--colorsSecondary600, ${a(h.secondary600)}));
  --_text-weight: var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${a(p.book.fontWeight)}));
  --bbva-link-color: var(--bbva-notification-message-link-color, var(--colorsPrimaryCoreLight, ${a(h.primaryCoreLight)}));
  --skeleton-quote-color: var(--bbva-notification-skeleton-color, var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)}));
  --skeleton-quote-bg: var(--bbva-notification-skeleton-bg-color, var(--colorsPrimarySubduedLight, ${a(h.primarySubduedLight)}));
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

[data-tag-name=bbva-core-icon] {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  color: var(--_notification-icon-color);
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-weight: var(--bbva-notification-message-title-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${a(m.typeLarge)}));
  line-height: var(--bbva-notification-message-title-line-height, var(--lineHeightTypeLarge, ${a(V.typeLarge)}));
}

.paragraph {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-paragraph-color);
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${a(m.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${a(V.typeSmall)}));
}

[data-tag-name=bbva-button-default] {
  margin-top: var(--bbva-notification-message-margin-top-button, var(--gridMargin, ${a(i.margin)}));
}

[data-tag-name=bbva-button-icon] {
  position: absolute;
  top: 0;
  right: 0;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 24px 24px, calc((87% * 2) + (16px/ 2)) 16px, calc((87% * 2) + (16px/ 2)) 16px, calc((60% * 2) + (16px/ 2)) 16px;
  background-position: 50% 32px, -7% 72px, -7% 96px, -23% 120px;
}

:host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([variant=information]) [data-tag-name=bbva-core-icon] {
  color: var(--_notification-message-information-icon-color);
}

:host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([variant=success]) [data-tag-name=bbva-core-icon] {
  color: var(--_notification-message-success-icon-color);
}

:host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([variant=error]) [data-tag-name=bbva-core-icon] {
  color: var(--_notification-message-error-icon-color);
}

:host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([variant=sustainability]) [data-tag-name=bbva-core-icon] {
  color: var(--_notification-message-sustainability-icon-color);
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) .skeleton {
  opacity: 1;
}
${Ut.mediaRules()}`;class Yt extends(c(S(C))){static get is(){return"bbva-notification-message"}static get scopedElements(){return{"bbva-button-default":Wt,"bbva-button-icon":u,"bbva-core-icon":d,"bbva-link":T}}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},linkTitle:{type:String,attribute:"link-title"},buttonText:{type:String,attribute:"button-text"},href:{type:String},loading:{type:Boolean,reflect:!1},variant:{type:String,reflect:!0},iconClose:{type:Boolean,attribute:"icon-close"}}}constructor(){super(),this.iconClose=!1,this.iconSize=24,this.variant="default",this._types={default:Y(),information:J(),success:K(),error:Z(),sustainability:Q()},this.loading=!1}static get styles(){return[Gt,e("bbva-notification-message-shared-styles"),Ot.light]}get _icon(){return this.icon?this.icon:this._types[this.variant]||Y()}get _closeIcon(){return this.iconClose&&"default"===this.variant?o`
          <bbva-button-icon
            data-tag-name="bbva-button-icon"
            tabindex="0"
            variant="no-background"
            .icon="${N()}"
            @click="${this._handleIconClick}"
            aria-hidden="false"
            aria-label="${this.t("bbva-notification-message-close")}"
          >
          </bbva-button-icon>
        `:W}get _title(){return this.messageTitle?o` <h2 class="title">${this.messageTitle}</h2> `:W}get _link(){return this.linkTitle?o`
          <bbva-link .href="${this.href}" @click="${this._goLink}"> ${this.linkTitle} </bbva-link>
        `:W}get _button(){return this.buttonText?o`
          <bbva-button-default
            ambient="light"
            data-tag-name="bbva-button-default"
            text="${this.buttonText}"
            @click="${this._buttonClick}"
          ></bbva-button-default>
        `:W}_handleIconClick(){this.dispatchEvent(new CustomEvent("notification-message-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_goLink(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return o`
      ${this._closeIcon}
      <bbva-core-icon
        aria-hidden="true"
        data-tag-name="bbva-core-icon"
        .icon="${this._icon}"
        .size="${this.iconSize}"
      ></bbva-core-icon>
      ${this._title}

      <p class="paragraph">${this.message?this.message:o` <slot></slot> `}</p>

      ${this._link} ${this._button}
      <div class="skeleton"></div>
    `}}const Jt=new r;var Kt=t`:host {
  box-sizing: border-box;
  display: flex;
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${a(h.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${a(h.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${a(h.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${a(h.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${a(h.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary600, ${a(h.secondary600)})));
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

.icon-help {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

.text-help {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${a(m.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${a(V.type3XSmall)}));
  margin: 0;
}

:host(.alert) .icon-help {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) .text-help {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) .icon-help {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) .text-help {
  color: var(--_notification-help-text-color-success);
}
${Jt.mediaRules()}`;var Zt=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
}
${(new r).mediaRules()}`;const Qt=new r;const ta={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${a(h.primaryCoreLightened)});
}
${Qt.mediaRules()}`}
  `,light:t`
    ${Zt}
  `};class aa extends(c(C)){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-core-icon":d,"bbva-text":b}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text=""}static get styles(){return[Kt,ta.dark,ta.light,e("bbva-notification-help-shared-styles")]}render(){return o`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-core-icon
        aria-hidden="true"
        data-tag-name="bbva-core-icon"
        .icon="${this.icon}"
        .size="${this.iconSize}"
        class="icon-help"
      >
      </bbva-core-icon>

      <bbva-text class="text-help" data-tag-name="bbva-text" text=${this.text} unset></bbva-text>
    `}}I("colors.primarySubduedLight"),I("colors.cool20"),I("colors.tertiaryType1Light"),I("colors.primaryCoreLightened"),I("colors.tertiaryType6Light"),I("colors.cool20");class ea extends(c(S(C))){static get is(){return"bbva-step-account-list-codi-request"}static get scopedElements(){const t=[tt,b,ot,at,Yt,aa,$t];return ea.scopedElementsFromClasses(t)}static get properties(){return{dataContracts:{type:Array},balance:{type:Number},accountSelect:{type:Object},maxSteps:{type:Number}}}constructor(){super(),this.dataContracts=[],this.balance=1,this.maxSteps=0}static get styles(){return[Ft,e("bbva-multistep-codi-p2p-mobile-transfer-request-shared-styles")]}_fireEvent(t,a,e=!0,o=!0){this.dispatchEvent(new CustomEvent(t,{detail:a,bubbles:e,composed:o}))}fireCompleteEvent(){this._fireEvent("complete"),this._fireEvent("account-step-finished",{productTitle:this.accountSelect.productTitle,numProduct:this.accountSelect.numProduct,idAccount:this.accountSelect.id})}getTextAccount(t){let a="codi-p2p-mobile-transfer-send-step1-select-account-text";return 4===t&&(a="codi-p2p-mobile-transfer-request-step1-select-account-text"),a}selectAccount({target:t}){this.accountSelect=this.dataContracts.find((a=>a.numProduct===t.numProduct)),this._fireEvent("multistep-bind-summary-property",{property:"accountSelect",value:this.accountSelect}),this._fireEvent("multistep-select-an-account",this.accountSelect),this.fireCompleteEvent()}_openModalAccounts(){this._fireEvent("codi-request-payments-p2m-full-modal-accounts")}_renderHeaderCategory(){return this.dataContracts.length>3?o` 
      <bbva-header-category
        option-link="${this.t("codi-p2p-mobile-transfer-request-header-category-text-link")}"
        text="${this.t("codi-p2p-mobile-transfer-request-header-category-text")}"
        @header-category-link-click="${this._openModalAccounts}"
      ></bbva-header-category>`:o` 
      <bbva-header-category
        class="colorHeaderCategory align-left"
        text="${this.t("codi-p2p-mobile-transfer-request-header-category-text")}"
      ></bbva-header-category>`}selectFirstAccount(){const[t]=this.dataContracts;this.accountSelect=t,this._fireEvent("multistep-bind-summary-property",{property:"accountSelect",value:this.accountSelect}),this._fireEvent("multistep-select-an-account",this.accountSelect),this.fireCompleteEvent()}_renderListCard(){return o`
    ${this.dataContracts.map(((t,a)=>{if(a<=2)return o`
          <bbva-list-card 
            card-title="${t.productTitle}" 
            num-product="${t.numProduct}" 
            content-text="${t.specificAmountName}" 
            amount="${t.specificAmount}" 
            idAccount="${t.id}"
            currency-code="MXN" 
            local-currency="MXN" 
            language="es-MX" 
            visible-chars="4" 
            @list-card-item-click="${this.selectAccount}">
          </bbva-list-card>
        `}))}
    `}_renderContinueButton(){return o`
      <bbva-button-default
        id="continueButton"
        text="Continuar"
        @click="${this.selectFirstAccount}"
        class="center-button"
      ></bbva-button-default>
    `}_renderNotificationMessage(){return 0===this.balance?o` 
      <bbva-notification-message
        variant="error"
        message-title="Saldo insuficiente"
      >
        No tienes saldo suficiente en tus cuentas para poder hacer el pago que te solicitaron a través de CoDi®.
      </bbva-notification-message>`:o``}render(){return o`
      <bbva-text
        text="${this.t(this.getTextAccount(this.maxSteps))}"
        size="XS"
        id="pharagraphHeader" 
        class="description"
        tag="p"
      ></bbva-text>
      ${this._renderHeaderCategory()}
      ${this._renderListCard()}
      ${1===this.dataContracts.length?this._renderContinueButton():""}
      ${this._renderNotificationMessage()}
      `}}customElements.define(jt.is,jt),customElements.define(ea.is,ea),customElements.define(Ht.is,Ht);
