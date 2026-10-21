import"./fc15786a.js";import"./7936765e.js";import"./6547a2ba.js";import{z as t,L as e,ak as i,h as a,i as r,bl as o,a8 as s,ad as n,ab as l,a9 as c,aa as d,b0 as p,aJ as b,a as m,ap as h,an as g,bj as u,b6 as v,ag as y,dt as f,av as S,f as $,o as k,g as x,ac as _,ar as C,F as P,b1 as L,aM as I,aN as A,ah as w,aD as V,aO as T,au as D,bd as E,as as B,at as M,bx as z,V as R,aw as q,S as j,af as N,j as F,r as H,aC as O,b5 as W,bT as X,U,bG as G,R as K,cD as Q,bU as J,dA as Z,dB as Y,b4 as tt,cM as et,G as it,ed as at,bW as rt,ai as ot,bF as st}from"./952f98a9.js";import{R as nt,S as lt,u as ct,v as dt}from"./216055dc.js";import"./a298c023.js";import{aM as pt,t as bt,aN as mt,p as ht,aL as gt}from"./7f3d7ca9.js";import"./4dec7a01.js";import{B as ut}from"./e32b4658.js";import{B as vt}from"./0efe7f4c.js";import"./c9f15469.js";import"./111ad2c6.js";import{B as yt}from"./d8ff1503.js";import"./253d153d.js";import{B as ft}from"./ca32b966.js";import"./0ef545a5.js";import{B as St}from"./7bf5357f.js";import"./8512af19.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./afb1d3bc.js";import"./b427c606.js";import"./dd0af563.js";var $t=t`
:host {
  --_progress-multistep-bar-color:
      var(--bbva-progress-multistep-bar--_ambient--color,
          var(--bbva-progress-multistep-bar--custom--primary-ambient--color,
               ${nt("colorPrimaryProcessInProgress",lt)}));
  --_progress-multistep-bar-background:
      var(--bbva-progress-multistep-bar--_ambient--background,
          var(--bbva-progress-multistep-bar--custom--primary-ambient--background,
              ${nt("colorPrimarySurfaceAmbientPreloading",lt)}));
}
`;const kt=t`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-progress-multistep-bar--_ambient--color: initial;
    --bbva-progress-multistep-bar--_ambient--background: initial;
  }
`,xt=t`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-progress-multistep-bar--_ambient--color: var(
      --bbva-progress-multistep-bar--custom--primary-alt-ambient--color,
      ${nt("colorPrimaryAltProcessInProgress",lt)}
    );
    --bbva-progress-multistep-bar--_ambient--background: var(
      --bbva-progress-multistep-bar--custom--primary-alt-ambient--background,
      ${nt("colorPrimaryAltSurfaceAmbientPreloading",lt)}
    );
  }
`,_t=t`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-progress-multistep-bar--_ambient--color: var(
      --bbva-progress-multistep-bar--custom--secondary-ambient--color,
      ${nt("colorSecondaryProcessInProgress",lt)}
    );
    --bbva-progress-multistep-bar--_ambient--background: var(
      --bbva-progress-multistep-bar--custom--secondary-ambient--background,
      ${nt("colorSecondarySurfaceAmbientPreloading",lt)}
    );
  }
`,Ct=t`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-progress-multistep-bar--_ambient--color: var(
      --bbva-progress-multistep-bar--custom--secondary-alt-ambient--color,
      ${nt("colorSecondaryAltProcessInProgress",lt)}
    );
    --bbva-progress-multistep-bar--_ambient--background: var(
      --bbva-progress-multistep-bar--custom--secondary-alt-ambient--background,
      ${nt("colorSecondaryAltSurfaceAmbientPreloading",lt)}
    );
  }
`;const Pt=ct([Object.freeze({__proto__:null,primary:kt,primaryAlt:xt,secondary:_t,secondaryAlt:Ct})]),Lt=Object.values(Pt);var It=t`
:host {
  display: block;
  box-sizing: border-box;
  height: var(--bbva-progress-multistep-bar-height, 0.5rem);
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

.progress-bar {
  display: block;
  overflow: hidden;
  max-width: 100%;
  background-color: var(--_progress-multistep-bar-background);
  height: var(--bbva-progress-multistep-bar-height, 0.5rem);
}

.progress-bar-fill {
  display: block;
  width: calc(var(--bbva-progress-multistep-bar-fill-width, 0%) + 4px);
  height: 100%;
  background-color: var(--_progress-multistep-bar-color);
  clip-path: polygon(0 0, 100% 0, calc(100% - 4px) 100%, 0% 100%);
  transition: width var(--bbva-fast-transition, 0.2s) ease-in-out;
}
:host(:not([step="1"])) .progress-bar-fill:before {
  content: "";
  width: 0.3125rem;
  height: 0.5rem;
  background-color: var(--_progress-multistep-bar-color);
  position: absolute;
  left: -0.125rem;
}
:host([value="0"]) .progress-bar-fill:before {
  display: none;
}
:host([step="4"]) .progress-bar-fill:after, :host([value="100"]) .progress-bar-fill:after {
  content: "";
  width: 0.3125rem;
  height: 0.5rem;
  background-color: var(--_progress-multistep-bar-color);
  position: absolute;
  right: -0.125rem;
}

:host([no-margin]) {
  margin: 0;
}
`;class At extends(dt(e)){static get is(){return"bbva-progress-multistep-bar"}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},value:{type:Number},step:{type:Number},totalSteps:{type:Number,attribute:"total-steps"},noMargin:{type:Boolean,attribute:"no-margin"}}}constructor(){super(),this.value=0,this.step=0,this.totalSteps=4,this._maxValue=100}static get styles(){return[It,$t,Lt,i("bbva-progress-multistep-bar-shared-styles")]}_getPercentage(){if(this.step){const t=Math.floor(this.step*(100/this.totalSteps));return this.step<this.totalSteps?`${t}%`:"100%"}return this.value<=this._maxValue?`${this.value}%`:"100%"}render(){return a`
      <span
        class="progress-bar"
        role="progressbar"
        aria-valuemin="0"
        aria-valuemax="${this._maxValue}"
        aria-valuenow="${r(Math.floor(this.value))}"
        aria-label="${r(this.accessibilityText)}"
      >
        <span
          class="progress-bar-fill"
          aria-hidden="true"
          style=${o({"--bbva-progress-multistep-bar-fill-width":this._getPercentage()})}
        >
        </span>
      </span>
    `}}customElements.define(At.is,At);var wt=t`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${s(c.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${s(n.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${s(l.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${s(n.typeLarge)});
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
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
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
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
`,Tt=t`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${s(c.primaryMedium)});
}
`;const Dt={light:t`
    ${p.light}
    ${Vt}
  `,dark:t`
    ${p.dark}
    ${Tt}
  `};class Et extends(b(m(h(g(e))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":u,"bbva-link":v,"bbva-text":y}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=f,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[wt,super.styles,i("bbva-panel-info-shared-styles"),Dt.light,Dt.dark]}get _contentImage(){return this.image?a` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:a`
      <span
        class="${S({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===f}render(){return a`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&a`
          <bbva-text
            tabindex="0"
            class="title ${S({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${r(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&a`
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
        ${a` <slot></slot> `}
        ${this.linkText&&a`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.cool50");const Bt=new C;var Mt=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${s(c.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${s(c.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${s(c.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${s(c.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${s(c.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${s(_.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${s(n.type3XSmall)}));
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
${Bt.mediaRules()}`;var zt=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new C).mediaRules()}`;const Rt=new C;const qt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${s(c.primaryCoreLight)});
}
${Rt.mediaRules()}`}
  `,light:t`
    ${zt}
  `};class jt extends(m(g(b(e)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":P,"bbva-text":y}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,Mt,qt.dark,qt.light,i("bbva-notification-help-shared-styles")]}render(){return a`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}x("colors.primarySubduedLight"),x("colors.cool20"),x("colors.tertiaryType1Light"),x("colors.primaryCoreLightened"),x("colors.tertiaryType6Light"),x("colors.cool20"),x("colors.cool50");const Nt=new C;var Ft=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${s(c.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${s(c.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${s(_.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Nt.mediaRules()}`;const Ht=new C;var Ot=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${s(c.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${s(c.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${s(c.primaryMediumLight)});
}
${Ht.mediaRules()}`;var Wt=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new C).mediaRules()}`;const Xt={dark:t`
    ${Ot}
    ${pt.dark}
    ${p.dark}
    ${qt.dark}
    ${L.dark}
  `,light:t`
    ${Wt}
    ${pt.light}
    ${p.light}
    ${qt.light}
    ${L.light}
  `};class Ut extends(m(g(I(e)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":bt,"bbva-notification-help":jt,"bbva-text":y,"bbva-link":v}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=A(),this.errorIconSize=16,this.infoIcon=w(),this.infoIconSize=16,this.name=`form-radio-group-${((t=10)=>`${Math.random().toString(36).substr(2,t)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(t=>this._setRadioName(t)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(t){(((t||{}).detail||{}).contentSlots||[]).forEach((t=>{const e=(t||{}).assignedNodes;"bbva-form-radio-button"===(e.getAttribute("data-tag-name")||(e||{}).nodeName).toLowerCase()&&(e.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(t=>this._updateItems(t)))}updated(t){if(super.updated&&super.updated(t),t.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const t=this.radioItems.find((t=>t.checked));t&&(t.checked=!1)}t.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].disabled=this.disabled}))),t.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].invalid=this.invalid}))),t.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].readonly=this.readonly}))),t.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].required=!1})),this.radioItems[0].required=!0)}_updateItems(t){const e=this.radioItems.indexOf(t.target);this.selected=e,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:t.target.value,selected:e},bubbles:!0,composed:!0}))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?a`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${r(this.linkHref)}"
          icon="${V()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const t=this.t(this.labelOut);return a`
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
      `}return""}static get styles(){return[Ft,i("bbva-form-radio-group-shared-styles"),Xt.dark,Xt.light]}render(){return a`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((t=>a`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${t.value}"
              label="${t.label}"
              divider="${r(t.divider)}"
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
              accessibility-icon-info-notification="${r(t.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${r(t.accessibilityIconAlert)}"
              variant="${r(t.variant)}"
            >
              ${t.text?T(t.text):t.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?a`
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
    `}}x("colors.primarySubdued"),x("colors.primaryMediumLight"),x("colors.primaryCoreLightened");var Gt=t`[ambient^=light] {
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
${(new C).mediaRules()}`;const Kt=new C;var Qt=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${s(c.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${s(c.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${s(c.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
}
${Kt.mediaRules()}`;const Jt={dark:t`
    ${p.dark}
    ${D.dark}
    ${E.dark}
    ${Qt}
  `,light:t`
    ${p.light}
    ${D.light}
    ${E.light}
    ${Gt}
  `},Zt=new C;var Yt=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${s(c.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${s(c.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${s(c.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${s(c.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${s(c.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${s(l.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${s(l.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${s(l.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${s(l.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${s(l.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${s(l.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1rem);
}
${Zt.mediaRules()}`;class te extends(h(B(M(b(m(g(e))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[q,v,j,y,N];return te.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Yt,Jt.light,Jt.dark,z("button:focus"),i("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return a`
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
    `}get _icon(){return a`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return a`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return a`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return a`
      <bbva-badge-variability
        disabled-tabindex
        .status=${t}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const t=R(this.mask,this.maskChars,!0,this.visibleChars);return a`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),a`
      <dd class=${S({[`wrapper-${e}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){const e="actionLink"===t?`${t}AccessibilityText`:`${t}LinkAccessibilityText`;return a`
      <bbva-link
        class=${S({ellipsis:this[`${t}Ellipsis`]})}
        aria-label="${r(this.t(this[e]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${r(this.roleLink)} aria-live=${r(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,i=`${t}TagText`,o=`${t}RoleText`,s=`${t}AriaLiveText`;return a`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role="${r(this[o])}"
        aria-live="${r(this[s])}"
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag="${r(this[i])}"
      >
      </bbva-text>
    `}_tplText(t){return a` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return a`
      <dl>
        <dt class=${S({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return a`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?a`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):a` <div class="wrapper-description">${this._tplText("description")}</div> `,a`
      ${t}
      <div class="skeleton"></div>
    `}}x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.cool60"),x("colors.primaryCoreLightened"),x("colors.primarySubdued"),x("colors.primaryMediumLight"),x("colors.primarySubdued"),x("colors.primaryMediumLight"),x("colors.cool50");class ee extends(St(e)){static get is(){return"mortgage-amount-validator"}static get properties(){return{amountData:Object,language:String}}constructor(){super(),this.amountData={},this.language="es-MX"}validate(t){const e=O(this.language),i=t.replace(new RegExp(`[^0-9${e}-]+`,"g"),""),a=i>=this.amountData.amountMin&&i<=this.amountData.amountMax;return!t||a}}var ie=t`
:host {
  display: block;
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  box-sizing: border-box;
  font-weight: var(--fontFacePrimaryLightFontWeight, ${s(l.light.fontWeight)});
  line-height: var(--lineHeightTypeXLarge, ${s(n.typeXLarge)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-0: var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-1: var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-2: var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-3: var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-4: var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)});
  --bbva-expandable-step-content-max-height: none;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-expandable-multistep] {
  max-height: 100%;
}

.header {
  padding-top: 0;
  padding-left: 0;
  padding-bottom: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: 0;
  margin-top: 0;
  margin-right: 0;
  margin-left: 0;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  background-color: var(--colorsPrimaryCore, ${s(c.primaryCore)});
  --bbva-text-font-weight: var(--fontFacePrimaryLightFontWeight, ${s(l.light.fontWeight)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
}

[data-tag-name=bbva-text][tag=span] {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-form-select] {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-form-amount] {
  padding-top: 0;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-form-range] {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-list-definition-amount] {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

.radio-group {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

.principal-list {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: 0;
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: 0;
}

.key-info {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: 0;
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: 0;
}

.slider-label {
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-notification-message] {
  margin-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  align-items: flex-start;
  text-align: left;
}

[data-tag-name=bbva-panel-button-fixed][sticky] {
  margin-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-left: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-bottom: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-right: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

.footer {
  display: flex;
  justify-content: center;
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: 0;
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: 0;
}
.footer.hide-padding-top {
  padding-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}
.footer.hide-padding-bottom {
  padding-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-expandable-step][active]:not([completed]) {
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-expandable-step]:not([completed]) [slot=summary] {
  display: none;
}

.summary {
  --bbva-text-font-weight: var(--fontFacePrimaryLightFontWeight, ${s(l.light.fontWeight)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-info-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-info-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-text-highlight-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
}

.amount-title {
  font-size: var(--typographyTypeSmall, ${s(_.typeSmall)});
  font-weight: var(--fontFacePrimaryLightFontWeight, ${s(l.light.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${s(n.typeLarge)});
}

.summary-amount {
  display: flex;
  flex-direction: column;
  padding-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

.divider {
  display: block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-right: 0;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  margin-left: 0;
  --bbva-divider-opacity: 0.3;
}

.pdf-data {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}
.pdf-data .icon-link {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: 0;
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: 0;
}

.checkbox-list {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-list-info] {
  font-size: var(--typographyTypeSmall, ${s(_.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${s(l.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${s(l.mediumItalic.fontStyle)});
  line-height: var(--lineHeightTypeLarge, ${s(n.typeLarge)});
  text-align: right;
  padding-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  min-height: 1.5rem;
  align-items: center;
}

.panel-button {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(d.spacer)}))) / 16) * 1em);
  min-height: 6rem;
}

.sticky-payment {
  --bbva-z-index-notifications: 0;
}
.sticky-payment[relative] {
  position: relative;
}
`;class ae extends(m(g(e))){static get is(){return"bbva-multistep-mortgage-lead"}static get scopedElements(){return{"bbva-panel-info":Et,"bbva-header-category":W,"bbva-form-select":X,"bbva-form-option":U,"bbva-form-amount":ut,"bbva-text":y,"bbva-form-range":vt,"bbva-form-radio-group":Ut,"bbva-form-radio-button":bt,"bbva-list-bullet":G,"bbva-list-simple":te,"bbva-list-file":K,"bbva-notification-message":Q,"bbva-panel-button":ht,"bbva-panel-button-fixed":gt,"bbva-button-default":J,"bbva-expandable-multistep":Z,"bbva-expandable-step":Y,"bbva-divider":tt,"bbva-amount":q,"bbva-link":v,"bbva-list-info":yt,"bbva-form-checkbox":et,"bbva-spinner":it,"mortgage-amount-validator":ee,"bbva-list-definition-amount":ft,"bbva-notification-help":jt}}static get properties(){return{_allCompleted:{type:Boolean},_currentStep:{type:Number},items:{type:Array},itemSelected:{type:Number},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},language:{type:String},amount:{type:Number},amountData:{type:Object},_invalidAmount:{type:Boolean},_sliderValue:{type:Number},sliderProperty:{type:Object},sliderSelected:{type:Number},principalList:{type:Array},messageInfo:{type:Object},customMessage:{type:Object},stickyPayload:{type:Object},keyInfo:{type:Array},keyInfoPayment:{type:Array},pdfData:{type:Array},checkboxList:{type:Array},disabledSimulatorStep:{type:Boolean},_disabledTermsAndConditionsStep:{type:Boolean},email:{type:String},_showPanelButton:{type:Boolean},_onResetStep:{type:Array},_showSpinner:{type:Boolean},_hideStickyPayment:{type:Boolean},_interaction:{type:String},stepDisabledTarget:{type:String},_headerIconRightPrimary:{type:String},showStickyButton:{type:String},counterStep:{type:Number}}}constructor(){super(),this._steps=[],this._checks=[],this.language=document.documentElement.lang||"es-MX",this.localCurrency="MXN",this.currencyCode="MXN",this._stepSelector='[data-tag-name="bbva-expandable-step"]',this._currentStep=-1,this._firstStep=-1,this._allCompleted=!1,this.keyInfoPayment=[],this.keyInfo=[],this.items=[],this.sliderProperty={},this.itemSelected=-1,this.amount=-1,this.amountData={},this._invalidAmount=!1,this._sliderValue=0,this.sliderSelected=-1,this.principalList=[],this.messageInfo={},this.customMessage={},this.stickyPayload={},this.pdfData=[],this.checkboxList=[],this._disabledTermsAndConditionsStep=!1,this.email="",this._showPanelButton=!1,this._onResetStep=[],this._showSpinner=!1,this._hideStickyPayment=!1,this._interaction="",this.stepDisabledTarget=".action",this._headerIconRightPrimary="",this.tagListSimpleIcon='[data-tag-name="bbva-list-simple"][action-icon]',this.tagText='[data-tag-name="bbva-text"]',this.showStickyButton="",this.counterStep=1,this.iconInfo=w()}get amountRange(){return{amountMin:this._formatAmount(this.amountData.amountMin),amountMax:this._formatAmount(this.amountData.amountMax)}}get changeAmount(){return this._changeValue("amount",{source:"amount",parse:Number})}get currentAmount(){return this.amount>=0?this.amount:this.amountData.amount}get currentItemSelected(){return this.itemSelected>=0?this.itemSelected:0}get currentSliderSelected(){return this.sliderSelected>=0?this.sliderSelected:this.sliderDefaultSelected}get expandableMultistep(){return this._multistep||(this._multistep=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')),this._multistep}get disabledSimulatorStep(){return this._invalidAmount||!(this.formAmount||{}).amount||Number.isNaN(this.amount)}get formAmount(){return this._formAmount||(this._formAmount=this.shadowRoot.querySelector('[data-tag-name="bbva-form-amount"]')),this._formAmount}get formAmountInfo(){return this._invalidAmount?"":this.t("bbva-multistep-mortgage-lead-form-amount-info",this.amountRange)}get formAmountError(){const t=(this.formAmount||{}).amount>this.amountData.amountMax?"maximun":"minimum";return this._invalidAmount?this.t(`bbva-multistep-mortgage-lead-form-amount-error-${t}`,this.amountRange):""}get formSelectInfo(){return this.items[this.currentItemSelected]&&this.items[this.currentItemSelected].description||""}get formSliderLength(){return this.sliderProperty.snaps&&this.sliderProperty.snaps.length||0}get interestRate(){const t=this.keyInfo[0]&&this.keyInfo[0].keyValues&&this.keyInfo[0].keyValues.find((t=>"CAT"===t.id));return t&&t.value}get notificationMessage(){return this.t("bbva-multistep-mortgage-lead-terms-and-conditions-notification-message")+(this.email?`<br><br>${this.t("bbva-multistep-mortgage-lead-terms-and-conditions-email-notification-message")}`:"")}get numberOfPrefilledSteps(){return this._steps.reduce(((t,e)=>e.hasAttribute("prefilled")?t+1:t),0)}static refreshLayout(){document.documentElement.style.display="none",document.documentElement.offsetHeight,document.documentElement.style.display=""}get simulatorStep(){return a`
      <mortgage-amount-validator language=${this.language} .amountData=${this.amountData}>
      </mortgage-amount-validator>
      <bbva-panel-info
        id="simulatorPanelInfo"
        ambient="dark"
        class="header"
        .microillustration="${at}"
        heading="${this.t("bbva-multistep-mortgage-lead-simulator-header-heading")}"
        text="${this.t("bbva-multistep-mortgage-lead-simulator-header-title")}"
        hide-padding-bottom
        disabled-tabindex>
      </bbva-panel-info>
      <bbva-header-category
        id="simulatorHeader"
        text="${this.t("bbva-multistep-mortgage-lead-simulator-title",{step:this.counterStep})}">
      </bbva-header-category>
      <bbva-form-select
        id="simulatorFormSelect"
        label-out="${this.t("bbva-multistep-mortgage-lead-form-select-label-out")}"
        help-icon="${V()}"
        label="${this.t("bbva-multistep-mortgage-lead-form-select-label")}"
        info-message="${this.t(this.formSelectInfo)}"
        info-icon="${w()}"
        @change="${this._changeValue("itemSelected",{source:"selectedIndex",parse:Number})}"
        @click="${()=>{this._interaction="tipo de credito"}}"
        ?disabled="${this.disabledSimulatorStep}"
        required>
        ${this.items.map((t=>a`<bbva-form-option
          value="${t.id}"
          ?selected="${t.selected}">
            ${this.t(t.name)}
        </bbva-form-option>`))}
      </bbva-form-select>
      <bbva-form-amount
        id="simulatorFormAmount"
        label-out="${this.t("bbva-multistep-mortgage-lead-form-amount-label-out")}"
        label="${this.t("bbva-multistep-mortgage-lead-form-amount-label")}"
        inputmode="decimal"
        optional-label=""
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
        language="${this.language}"
        value="${this.amountData.amount}"
        info-message="${this.formAmountInfo}"
        info-icon="${w()}"
        error-message="${this.formAmountError}"
        auto-validate
        validator="mortgage-amount-validator"
        @change-amount="${this.changeAmount}"
        @bbva-core-input-validate="${this._onInputValidate}"
        @form-field-input-focus="${this._onInputFocus}"
        @form-field-input-blur="${this._onInputBlur}"
        @form-field-input-clear="${()=>{this.amount=NaN}}"
        @click="${()=>{this._interaction="cantidad"}}">
      </bbva-form-amount>
      <span id="mortgageTermQuestion">
        ${ae._bbvaText({text:this.t("bbva-multistep-mortgage-lead-form-range-info-title")})}
        <bbva-notification-help
          id="paymentInfo"
          accessibility-label-icon="Info"
          icon="${this.iconInfo}"
          variant="info"
          text="bbva-multistep-mortgage-lead-form-range-info-text">
        </bbva-notification-help>
      </span>
      ${2===this.sliderSnaps.length?a`
        <div class="radio-group">
          <bbva-form-radio-group
            id="simulatorRadioGroup"
            name="form-radio-group-term"
            @form-radio-group-item-change="${this._changeValue("sliderSelected",{source:"selected",parse:Number})}"
            @click="${()=>{this._interaction="plazo"}}"
            selected="${this.sliderDefaultSelected}"
            two-option
            ?disabled="${this.disabledSimulatorStep}">
            ${this.sliderSnaps.map((t=>a`
            <bbva-form-radio-button
              value="${t}">
              ${this.t("bbva-multistep-mortgage-lead-form-range-description",{sliderValue:t})}
            </bbva-form-radio-button>`))}
          </bbva-form-radio-group>
        </div>
      `:a`
        <bbva-list-simple
          class="slider-label"
          hide-padding-top
          hide-padding-bottom
          label="${this.t("bbva-multistep-mortgage-lead-form-range-label")}"
          description-medium
          description="${this.t("bbva-multistep-mortgage-lead-form-range-description",{sliderValue:this._sliderValue||this.sliderProperty.sliderValue})}"
          @click="${()=>{this._interaction="plazo"}}">
        </bbva-list-simple>
      `}
      ${this.sliderSnaps.length>2?a`
        <bbva-form-range
          id="simulatorFormRange"
          variant="informational-section"
          min="1"
          max="${Math.max(this.formSliderLength,2)}"
          value="${this.sliderDefaultSelected+1}"
          .itemLabels="${this.sliderSnaps}"
          @change="${t=>{this.sliderSelected=t.target.value-1}}"
          @input="${this._updateSliderValue("_sliderValue")}"
          @click="${()=>{this._interaction="plazo"}}"
          show-labels
          ?disabled="${this.disabledSimulatorStep}">
        </bbva-form-range>
      `:""}
      <bbva-list-definition-amount
        id="simulatorPanelFixed"
        class="sticky-payment"
        title="${this.t(this.stickyPayload.paymentText)}"
        amount="${this.disabledSimulatorStep?0:this.stickyPayload.monthlyPayment}"
        currency-code="${this.stickyPayload.currency}"
        local-currency="${this.localCurrency}"
        language="${this.secondaryLanguage}"
        variant-amount="4xl"
        center
        description="${this.stickyPayload.secondPaymentText?this.t(this.stickyPayload.secondPaymentText):""}">
      </bbva-list-definition-amount>
      ${this._bbvaKeyInfo({keyInfo:this.keyInfo,showActionIcon:!0})}
      ${ae._bbvaText({text:this.t(this.customMessage.message,{highlight:'<span class="highlight">',endHighlight:"</span>",newLine:"<br>",...this.customMessage.params}),alignment:"center"})}

      <bbva-panel-button-fixed
        id="simulatorButtonDefault"
        button-class="positive"
        class="panel-button no-gradient"
        sticky
        show
        button-text="${this.t("bbva-multistep-mortgage-lead-footer-button-text")}"
        footer-link="${this.t(this.showStickyButton)}"
        @panel-button-fixed-item-click="${t=>{this._interaction="lo quiero",t.stopPropagation(),this._genericDispatchEvent("go-next-step",!0),ae._fireCompleteEvent(t)}}"
        @panel-button-fixed-footer-link-click="${this._handlerClickSecondaryButton}"
        ?disabled="${this.disabledSimulatorStep}">
      </bbva-panel-button-fixed>
    `}bbvaSecondaryButton(t){return a`
      <div class="footer hide-padding-top">
        <bbva-button-default
          id="${t}"
          text="${this.showStickyButton}"
          variant="link"
          @click="${this._handlerClickSecondaryButton}"
          ?disabled="${this.disabledSimulatorStep}">
        </bbva-button-default>
      </div>
    `}get simulatorSummaryStep(){return a`
      <div class="summary-amount">
        <span class="amount-title">${this.t("bbva-multistep-mortgage-lead-summary-amount-title")}</span>
        <bbva-amount
          id="summaryAmount"
          class="amount"
          variant="4xl"
          amount="${this.currentAmount}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          language="${this.language}">
        </bbva-amount>
      </div>
      <bbva-divider class="divider" size="small"></bbva-divider>
      ${this.keyInfoPayment.map((t=>a`
        <bbva-list-simple
          label="${this.t(t.key)}"
          ?description-medium="${t.descriptionMedium}"
          description="${this.t(t.value)}">
        </bbva-list-simple>
      `))}
      <bbva-divider class="divider" size="small"></bbva-divider>
      ${this._bbvaKeyInfo({keyInfo:this.keyInfo,hideHeader:!0})}
    `}get simulatorStepHeader(){return this.simulatorHeader||(this.simulatorHeader=this._steps[this._firstStep]&&this._steps[this._firstStep].shadowRoot&&this._steps[this._firstStep].shadowRoot.querySelector(".header")),this.simulatorHeader}get sliderDefaultSelected(){return this.sliderSnaps&&this.sliderSnaps.indexOf&&this.sliderSnaps.indexOf(this.sliderProperty.sliderValue)}get sliderSnaps(){return this.sliderProperty.snaps||[]}get termsAndConditionsStep(){return a`
      <bbva-notification-message
        id="termsNotification"
        variant="default">
        ${this.t("bbva-multistep-mortgage-lead-terms-and-conditions-notification-message")}
      </bbva-notification-message>
      <div class="pdf-data" id="pdfContainer">
        ${this.pdfData.map((t=>a`
          <bbva-list-file
            class="icon-link"
            icon="${rt()}"
            icon-size="24"
            file-name="${this.t(t.text)}"
            @list-file-link-click="${()=>{this._genericDispatchEvent(t.eventModal,!0)}}">
          </bbva-list-file>
        `))}
      </div>
      <div class="checkbox-list"  id="termsCheckboxContainer">
        ${this.checkboxList.map((t=>a`
          <bbva-form-checkbox
            class="checkbox"
            label=${this.t(t.label)}
            ?disabled=${t.disabled}
            ?checked=${t.checked}
            @change="${this._changeCheckbox}"
            required>
          </bbva-form-checkbox>
        `))}
      </div>
      <div class="footer">
        <bbva-button-default
          id="termsContinueButton"
          text="${this.t("bbva-multistep-mortgage-lead-terms-and-conditions-footer-button")}"
          ?disabled="${this._disabledTermsAndConditionsStep}"
          @click="${t=>{this._genericDispatchEvent("go-next-step",!0),ae._fireCompleteEvent(t)}}">
        </bbva-button-default>
      </div>
      ${this.showStickyButton?this.bbvaSecondaryButton("termsButtonSecondary"):""}
    `}get termsAndConditionsSummaryStep(){return a`
      <bbva-list-info
        id="termsAccepted"
        icon="${ot()}"
        icon-size="16">${this.t("bbva-multistep-mortgage-lead-terms-and-conditions-summary-accepted")}</bbva-list-info>
      ${this.email?a`<bbva-divider class="divider" size="small"></bbva-divider>
      <bbva-list-simple
          id="emailSection"
          hide-padding-top
          hide-padding-bottom
          label="${this.t("bbva-multistep-mortgage-lead-terms-and-conditions-summary-email-label")}"
          description="${this.email}">
      </bbva-list-simple>`:""}
    `}init(){this.expandableMultistep&&this.expandableMultistep.scroll(0,0);const t=this._steps.slice(this._firstStep);t.some((t=>t.completed))&&(t.forEach(((t,e)=>{const i=t;i.completed=!1,t.removeAttribute("completed"),i.active=e===this._firstStep,i.disabled=!t.active;const a=(t.disabled?"set":"remove")+"Attribute";t[a]("aria-disabled","true"),t[a]("aria-hidden","true");const r=t.querySelector(t.disabledTarget);r&&r[a](t.disabledTargetAttr,t.disabled);[...t.querySelectorAll(`:not(${t.disabledTarget})[disabled]`)].forEach((t=>{t.removeAttribute("disabled"),t.removeAttribute("aria-disabled"),t.removeAttribute("aria-hidden")}))})),this.counterStep=1,this._onResetStep=this._steps.slice(this._firstStep).map(((t,e)=>e))),this._steps=[],this._currentStep=-1,this.stickyPayload={},this.amountData={},this.amount=-1,this.sliderSelected=-1,this.itemSelected=-1,this.sliderProperty={},this._invalidAmount=!1,this._sliderValue=0,this._headerIconRightPrimary||(this._headerIconRightPrimary=st()),this._interaction="",this._checks.length&&this.checkboxList.forEach(((t,e)=>{this._checks[e].checked=t.checked||!1}))}firstUpdated(t){super.firstUpdated(t),this._showSpinner=!0,this._initResizeObserver()}update(t){super.update(t),t.has("currencyCode")&&(this._nf=new Intl.NumberFormat(this.language,{style:"currency",currency:this.currencyCode,minimumFractionDigits:2,maximumFractionDigits:2})),t.has("itemSelected")&&(this._updateItemSelected(),this._notifyPropertyChanged("item-selected",this.itemSelected)),t.has("amount")&&(this._updateAmount(),this._notifyPropertyChanged("amount",this.amount)),t.has("sliderSelected")&&this._notifyPropertyChanged("slider-selected",this.sliderSelected),t.has("amountData")&&(this.amount=-1,this._updateAmount()),t.has("sliderProperty")&&(this.sliderSelected=-1,this._sliderValue=0),(t.has("_currentStep")||t.has("_allCompleted"))&&(this._updateSimulatorStepHeader(),(this._allCompleted||this._currentStep>=0)&&this._notifyPropertyChanged(this._allCompleted?"all-completed":`current-step-${this._currentStep}`,{typology:this.items[this.currentItemSelected]&&this.items[this.currentItemSelected].typology,amount:this.currentAmount,currency:this.currencyCode,paymentAmount:this.stickyPayload.monthlyPayment,interestRate:this.interestRate,numberOfPayments:this.sliderProperty.snaps&&12*this.sliderProperty.snaps[this.currentSliderSelected]})),t.has("stickyPayload")&&Object.keys(this.stickyPayload).length&&(this.keyInfoPayment=[{key:this.t("bbva-multistep-mortgage-lead-key-info-monthly-payment"),value:this._formatAmount(this.stickyPayload.monthlyPayment)},{key:this.t("bbva-multistep-mortgage-lead-key-info-term"),value:this.t("bbva-multistep-mortgage-lead-key-info-term-value",{sliderValue:this.sliderProperty.snaps&&this.sliderProperty.snaps[this.currentSliderSelected]})},{key:this.t("bbva-multistep-mortgage-lead-key-info-credit-destination"),value:this.t(this.items[this.currentItemSelected]&&this.items[this.currentItemSelected].name)}]),t.has("stickyPayload")&&Object.keys(this.stickyPayload).length&&!this._steps.length&&(this._setupSteps(),ae.refreshLayout()),t.has("checkboxList")&&this.checkboxList.length&&this._setupCheckbox(),t.has("_showSpinner")&&this._genericDispatchEvent((this._showSpinner?"show":"hide")+"-spinner",!0),t.has("_headerIconRightPrimary")&&this._genericDispatchEvent("header-icon-right-primary",this._headerIconRightPrimary),t.has("_interaction")&&this._interaction&&(this._notifyPropertyChanged("interaction",this._interaction),this._genericDispatchEvent("interaction-detail",{amount:this.currentAmount,currency:this.currencyCode,interaction:this._interaction})),(t.has("amount")||t.has("amountData"))&&this._inputFocusout(),t.has("keyInfo")&&this.keyInfo.length&&this.updateComplete.then((()=>{this._onResize()})),t.has("counterStep")&&this._notifyPropertyChanged("counter-step",this.counterStep)}_initResizeObserver(){new ResizeObserver((t=>{t.forEach((t=>{t.contentRect.width&&this._onResize()}))})).observe(this)}static _bbvaText({text:t="",size:e="S",alignment:i="left",fontWeight:r="300",tag:o="span"}={}){return a`<bbva-text
      text="${t}"
      size="${e}"
      alignment="${i}"
      font-weight="${r}"
      tag="${o}">
    </bbva-text>`}_bbvaKeyInfo({keyInfo:t=[],hideHeader:e=!1,showActionIcon:i=!1}){return a`
      ${t.map((t=>a`
        ${e?"":a`<bbva-header-category
          id="${`${t.id}Title`}"
          text="${this.t(t.title)}">
        </bbva-header-category>`}
        <div id="${e?`${t.id}Container`:""}" class="key-info">
          ${(t.keyValues||[]).map((t=>a`
            <bbva-list-simple
              action-icon="${i?V():""}"
              label="${this.t(t.key)}"
              description="${t.text?this.t(t.text,{highlight:"<span class='highlight'>",endHighlight:"</span>",percentage:t.fixed&&"number"==typeof t.value?t.value.toFixed(t.fixed):t.value}):`${t.fixed&&"number"==typeof t.value?t.value.toFixed(t.fixed):t.value}%`}"
              ?description-medium="${t.descriptionMedium}"
              @list-simple-icon-click="${()=>{this._interaction=t.detail,this._genericDispatchEvent(t.eventModal,!0)}}">
            </bbva-list-simple>
          `))}
        </div>
      `))}
    `}_changeCheckbox(){this._disabledTermsAndConditionsStep=!1,this.updateComplete.then((()=>{this._disabledTermsAndConditionsStep=!this._checks.every((t=>t.checked))}))}_changeValue(t,{source:e="value",parse:i}={}){return a=>{const r=[a.target,a.detail,a].filter((t=>t)).find((t=>null!==t[e]&&void 0!==t[e]));r&&(this[t]=i?i(r[e]):r[e])}}static _fireCompleteEvent(t){t.target.dispatchEvent(new CustomEvent("complete",{bubbles:!0}))}_dispatchChangeAmount(t){const{target:e,bubbles:i,composed:a}=t;e.amount===this.currentAmount||Number.isNaN(this.amount)&&""===e.value||e.dispatchEvent(new CustomEvent("change-amount",{bubbles:i,composed:a}))}_formatAmount(t){return this._nf&&this._nf.format(t)||t}_genericDispatchEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_inputFocusout(){Promise.all([this.updateComplete,this.formAmount.updateComplete]).then((()=>{this.formAmount.blur()}))}_notifyPropertyChanged(t,e){this._genericDispatchEvent(`${t}-changed`,e)}_onAllComplete(t){this._allCompleted=t.detail,this._allCompleted?this.counterStep=3:this._showPanelButton=!1}_onDisableChange(t){if(t){const e=(t.detail?"set":"remove")+"Attribute";[...t.currentTarget.querySelectorAll(`:not(${this.stepDisabledTarget})`)].forEach((i=>{i[e]("disabled",t.detail),i[e]("aria-disabled","true"),i[e]("aria-hidden","true")}))}t.detail||this._changeCheckbox()}_onEditStep(t){this.counterStep=0===t.detail?1:2,this._currentStep=t.detail+this.numberOfPrefilledSteps}_onInputBlur(t){this._hideStickyPayment=!1,this._dispatchChangeAmount(t)}_onInputFocus(){this._hideStickyPayment=!0}_onInputValidate(t){this._invalidAmount=t.target.invalid}_onScrollAnimationEnd(){this._showPanelButton=this._allCompleted}_onStepCompletedChanged(t){if(t.detail){this.counterStep=0===t.target.step?2:1;const e=this._steps.find((e=>t.target&&t.target.step!==e.step&&!e.completed))||{};this._currentStep=e.step||-1}}_setupCheckbox(){this.updateComplete.then((()=>{this._checks=[...this.shadowRoot.querySelectorAll(".checkbox-list > .checkbox")]}))}_setupSteps(){this.updateComplete.then((()=>{this._steps.length||(this._steps=[...this.shadowRoot.querySelectorAll(this._stepSelector)],this._firstStep=this._steps.reduce(((t,e,i)=>e.completed?i:t),-1)+1,this._currentStep=this._firstStep,this._showSpinner=!1)}))}_updateAmount(){this.formAmount.value&&this.formAmount.value!==this.formAmount.srAmount&&(this.formAmount.value=this.formAmount.srAmount)}_updateItemSelected(){this.items=this.items.map(((t,e)=>({...t,selected:e===this.currentItemSelected})))}_updateSimulatorStepHeader(){this._steps[this._firstStep]&&this.simulatorStepHeader.style&&(this._steps[this._firstStep].completed?(this.simulatorStepHeader.style.removeProperty("max-height"),this.simulatorStepHeader.style.removeProperty("border")):(this.simulatorStepHeader.style.setProperty("max-height","0","important"),this.simulatorStepHeader.style.setProperty("border","0","important")))}_updateSliderValue(t){return e=>{this[t]=this.sliderProperty.snaps&&e.target&&this.sliderProperty.snaps[(e.target||{}).value-1]||0}}static textWrapper(t,e){const i=t,a=t.offsetWidth,r=ae.getTextWidth(e,t);if(a&&r)if(r>a){const r=e.split(" ");let o="",s="";for(let e=0;e<r.length;e+=1){const i=`${s+r[e]} `;ae.getTextWidth(i,t)>a&&(o+=`${s.trim()}<br>`,s=""),s+=`${r[e]} `}o+=s.trim(),i.text=o}else i.text=e}static getTextWidth(t,e){const i=document.createElement("canvas").getContext("2d"),a=window.getComputedStyle(e),r=a.getPropertyValue("font-size"),o=a.getPropertyValue("font-family");i.font=`${r} ${o}`;const s=i.measureText(t);return Math.round(s.width)}_onResize(){[...this.shadowRoot.querySelectorAll(this.tagListSimpleIcon)].forEach((t=>{const e=t.shadowRoot.querySelector(this.tagText);e.text===t.label?ae.textWrapper(e,t.label):(e.text=t.label,e.updateComplete.then((()=>{ae.textWrapper(e,t.label)})))}))}_handlerClickSecondaryButton(t){t.stopPropagation(),this._genericDispatchEvent("bbva-button-default-secondary-button",!0)}static get styles(){return[ie,Dt.dark,i("bbva-multistep-mortgage-lead-shared-styles")]}render(){return a`
      <bbva-expandable-multistep
        id="mortgageMultistep"
        class="scrollable"
        step-selector="${this._stepSelector}"
        hide-step-numbers
        @expandable-multistep-all-complete="${this._onAllComplete}"
        @expandable-multistep-scroll-animation-end="${this._onScrollAnimationEnd}"
        .stepsToReset="${this._onResetStep}">
        <bbva-expandable-step
          id="stepSimmulator"
          header="${this.t("bbva-multistep-mortgage-lead-simulator-title",{step:this.counterStep})}"
          edit-label="${this.t("bbva-multistep-mortgage-lead-edit-button")}"
          disabled-target="${this.stepDisabledTarget}"
          hide-padding-top
          hide-padding-right
          hide-padding-left
          ?disable-on-previous-step-edit="${this.disabledSimulatorStep}"
          @expandable-step-edit-step="${this._onEditStep}"
          @expandable-step-complete-change="${this._onStepCompletedChanged}"
          @expandable-step-disable-change="${this._onDisableChange}">
          <div class="content">
            ${this.simulatorStep}
          </div>
          <div class="summary" slot="summary">
            ${this.simulatorSummaryStep}
          </div>
        </bbva-expandable-step>

        <bbva-expandable-step
          id="stepTermsAndConditions"
          header="${this.t("bbva-multistep-mortgage-lead-terms-and-conditions-title")}"
          edit-label="${this.t("bbva-multistep-mortgage-lead-terms-and-conditions-edit-button")}"
          disabled-target="${this.stepDisabledTarget}"
          hide-padding-top
          hide-padding-right
          hide-padding-left
          ?disable-on-previous-step-edit="${this._disabledTermsAndConditionsStep}"
          @expandable-step-edit-step="${this._onEditStep}"
          @expandable-step-complete-change="${this._onStepCompletedChanged}"
          @expandable-step-disable-change="${this._onDisableChange}">
          <div class="content">
            ${this.termsAndConditionsStep}
          </div>
          <div class="summary" slot="summary">
            ${this.termsAndConditionsSummaryStep}
          </div>
        </bbva-expandable-step>
      </bbva-expandable-multistep>

      <bbva-panel-button-fixed
        id="panelButton"
        button-class="positive"
        class="panel-button no-gradient"
        sticky
        button-text="${this.t("bbva-multistep-mortgage-lead-summary-panel-button-fixed")}"
        footer-link="${this.t(this.showStickyButton)}"
        @panel-button-fixed-item-click="${t=>{t.stopPropagation(),this._genericDispatchEvent("request-mortgage-lead",t)}}"
        @panel-button-fixed-footer-link-click="${t=>{t.stopPropagation(),this._genericDispatchEvent("bbva-button-default-secondary-summary-button",t)}}"
        ?hidden="${!this._allCompleted}"
        ?show="${this._showPanelButton}">
      </bbva-panel-button-fixed>
    `}}customElements.define(ae.is,ae);
