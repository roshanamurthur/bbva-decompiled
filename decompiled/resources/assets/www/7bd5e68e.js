import{z as e,a8 as t,ac as a,ad as i,ab as s,ar as r,aa as n,a9 as o,b1 as c,a as l,aJ as d,L as h,bj as b,ag as p,ak as m,h as g,f as u,g as v,be as y,cO as _,cE as f,F as k,cG as S,b0 as $,au as x,bd as w,ap as C,as as T,at as E,an as R,bx as I,V as O,av as M,i as P,aw as A,b6 as L,S as q,af as F,J as B,aZ as D,a7 as N,b$ as V,a_ as j,bc as H,aI as z,b4 as G,bh as U,bP as W,bQ as X,ew as Q,b8 as J,l as K,bf as Y,_ as Z,dy as ee,cH as te,E as ae,cD as ie,bG as se,A as re,bU as ne,R as oe,di as ce,y as le,aO as de,aU as he,ai as be,dz as pe,cT as me,bF as ge,aD as ue,aW as ve,aN as ye,cI as _e,et as fe}from"./952f98a9.js";import{b as ke,a as Se,B as $e}from"./8bd033ff.js";import"./9cadd5ad.js";import{b_ as xe,by as we,ao as Ce}from"./7f3d7ca9.js";import"./25ca3c7f.js";import"./62eefc6e.js";import"./a2b15c7c.js";import"./f2cca372.js";import{B as Te}from"./a83e7741.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./1a79f9f5.js";import"./4d740237.js";import"./9ab4f92c.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./ca1bc295.js";const Ee=new r;var Re=e`:host {
  display: flex;
  box-sizing: border-box;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em);
  font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(i.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(s.medium.fontWeight)});
  color: var(--bbva-chat-bot-dark-mode-text-color, var(--bbva-chat-bot-text-color, var(--colorsSecondary600, ${t(o.secondary600)})));
  --_bg-color-execution: var(--bbva-chat-bot-execution-bg-color, var(--colorsPrimaryCoreDarkened, ${t(o.primaryCoreDarkened)}));
  --_color-execution: var(--bbva-chat-bot-execution-text-color, var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)}));
}

:host([variant=execution]) {
  background-color: var(--_bg-color-execution);
  color: var(--_color-execution);
}

.paragraph {
  flex: auto;
  min-width: 0;
  margin-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  position: relative;
}
.paragraph p {
  margin: 0;
}

:host([clipBot]) .paragraph {
  margin-right: 0;
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

.media {
  flex: none;
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

.heading {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
  font-size: var(--typographyTypeLarge, ${t(a.typeLarge)});
  line-height: var(--lineHeightTypeLarge, ${t(i.typeLarge)});
}

[data-tag-name=bbva-core-heading] {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
${Ee.mediaRules()}`;var Ie=e`[ambient^=light] {
  --bbva-chat-bot-text-color: initial;
  --bbva-chat-bot-execution-bg-color: initial;
  --bbva-chat-bot-execution-text-color: initial;
}
${(new r).mediaRules()}`;const Oe=new r;const Me={dark:e`
    ${e`[ambient^=dark] {
  --bbva-chat-bot-text-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-chat-bot-execution-bg-color: var(--colorsPrimaryCoreDarkened, ${t(o.primaryCoreDarkened)});
  --bbva-chat-bot-execution-text-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
}
${Oe.mediaRules()}`}
    ${c.dark}
  `,light:e`
    ${Ie}
    ${c.light}
  `};class Pe extends(l(d(h))){static get scopedElements(){return{"bbva-core-heading":b,"bbva-clip-bot":ke,"bbva-text":p}}static get is(){return"bbva-chat-bot"}static get properties(){return{heading:{type:String},clipBot:{type:String},headingLevel:{type:Number,attribute:"heading-level"},description:{type:String},descriptionEllipsisLines:{type:String,attribute:"description-ellipsis-lines"}}}constructor(){super(),this.clipBot="",this.heading="",this.description="",this.headingLevel=2,this.descriptionEllipsisLines=0}static get styles(){return[super.styles,Re,Me.dark,Me.light,m("bbva-chat-bot-shared-styles")]}get _title(){return g`
      <div class="content">
        <bbva-core-heading class="heading" .level="${this.headingLevel}">
          ${this.heading}
        </bbva-core-heading>
      </div>
    `}get _clipbotBlock(){return g`
      <div class="media">
        <bbva-clip-bot variant="${this.clipBot}" size="small"> </bbva-clip-bot>
      </div>
    `}render(){return g`
      ${this.clipBot?this._clipbotBlock:""}

      <div class="paragraph">
        ${this.heading?this._title:""}
        ${this.description?g`<bbva-text
              unset
              size="S"
              font-weight="500"
              ?ellipsis="${this.descriptionEllipsisLines&&this.descriptionEllipsisLines>0}"
              lines=${this.descriptionEllipsisLines}
              text="${this.description}"
            ></bbva-text>`:g` <p>
              <slot></slot>
            </p>`}
      </div>
    `}}v("colors.primaryCoreLightened"),v("colors.primaryCoreDarkened");const Ae=new r;var Le=e`*,
*:before,
*:after {
  box-sizing: inherit;
  font-family: inherit;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host {
  display: inline-flex;
  --_chat-button-text-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --_bg-color-focus-visible: var(--bbva-chat-button-dark-mode-bg-color-focus-visible, var(--bbva-chat-button-bg-color-focus-visible, var(--colorsSecondary100, ${t(o.secondary100)})));
  --_bg-color-active: var(--bbva-chat-button-active-bg-color, var(--colorsPrimaryCoreLight, ${t(o.primaryCoreLight)}));
  --_color: var(--bbva-chat-button-color, var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)}));
  --_bg-color-shift: var(--bbva-chat-button-background-shift, var(--colorsPrimaryCore, ${t(o.primaryCore)}));
  --_bg-color-shift-focus-visible: var(--bbva-chat-button-background-shift-focus-visible, var(--colorsPrimaryCoreDark, ${t(o.primaryCoreDark)}));
  --_animation-duration: var(--bbva-chat-button-animation-duration, 195ms);
  --_bg-color-disabled: var(--bbva-chat-button-dark-mode-bg-color-disabled, var(--bbva-chat-button-bg-color-disabled, var(--colorsSecondary200, ${t(o.secondary200)})));
  --_opacity-disabled: var(--bbva-chat-button-dark-mode-opacity-disabled, var(--bbva-chat-button-opacity-disabled, 1));
  --_color-disabled: var(--bbva-chat-button-dark-mode-disabled-color, var(--bbva-chat-button-disabled-color, var(--colorsSecondary400, ${t(o.secondary400)})));
  --_bg-color-positive-variant: var(--colorsPrimaryVariantDark, ${t(o.primaryVariantDark)});
  --_bg-color-active-positive-variant: var(--colorsPrimaryVariantDarkened, ${t(o.primaryVariantDarkened)});
  --_bg-color-disabled-positive-variant: var(--bbva-chat-button-dark-mode-bg-color-disabled-positive-variant, var(--bbva-chat-button-bg-color-disabled-positive-variant, var(--colorsSecondary200, ${t(o.secondary200)})));
  --_opacity-disabled-positive-variant: var(--bbva-chat-button-dark-mode-opacity-disabled-positive-variant, var(--bbva-chat-button-opacity-disabled-positive-variant, 1));
  --_color-disabled-positive-variant: var(--bbva-chat-button-dark-mode-disabled-color-positive-variant, var(--bbva-chat-button-disabled-color-positive-variant, var(--colorsSecondary400, ${t(o.secondary400)})));
  --_clip-path-right-1: var(--bbva-chat-button-clip-path-right-1, calc(100% - calc( 1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px)));
  --_clip-path-right-2: var(--bbva-chat-button-clip-path-right-2, calc(0% + calc( 1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px)));
  --_clip-path-left-1: var(--bbva-chat-button-clip-path-left-1, calc(0% + calc( 1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px)));
  --_clip-path-left-2: var(--bbva-chat-button-clip-path-left-2, calc(0% + calc( 1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px)));
  --_bbva-button-right-corner-clip-path: polygon(100% 0,var(--_clip-path-right-1) var(--_clip-path-right-2),var(--_clip-path-right-1) calc(100% - 1px),calc(100% - calc( 1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px) - 0.6px) 100%,0 100%,0 0);
  --_bbva-button-left-corner-clip-path: polygon(0 0,var(--_clip-path-left-1) var(--_clip-path-left-2),var(--_clip-path-left-1) calc(100% - 1px),calc(0% + calc( 1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px) + 0.6px) 100%,100% 100%,100% 0);
  box-sizing: border-box;
  align-items: stretch;
  max-width: var(--bbva-chat-button-max-width, 12.5rem);
  min-width: var(--bbva-chat-button-min-width, 3rem);
  min-height: 3.5rem;
  -webkit-clip-path: var(--_bbva-button-right-corner-clip-path);
  clip-path: var(--_bbva-button-right-corner-clip-path);
  background-color: var(--colorsPrimaryMedium, ${t(o.primaryMedium)});
  font-size: var(--bbva-chat-button-size, var(--typographyTypeSmall, ${t(a.typeSmall)}));
  font-weight: var(--bbva-chat-button-font-weight, var(--fontFacePrimaryMediumFontWeight, ${t(s.medium.fontWeight)}));
  line-height: var(--bbva-chat-button-line-height, calc(((2.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em));
}
:host([full-width]) {
  width: 100%;
  max-width: initial;
}

.ripple-manager {
  align-items: center;
  justify-content: center;
  overflow: hidden;
  padding: calc(((0.75 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em) calc(((0.75 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em);
}
:host([corner=none]) .ripple-manager {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
:host([corner=left]) .ripple-manager {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  font-size: var(--bbva-chat-button-size, var(--typographyTypeSmall, ${t(a.typeSmall)}));
  font-weight: var(--bbva-chat-button-font-weight, var(--fontFacePrimaryMediumFontWeight, ${t(s.medium.fontWeight)}));
  line-height: var(--bbva-chat-button-line-height, calc(((2.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em));
  color: var(--_chat-button-text-color);
}

:host([corner=none]) {
  clip-path: none;
  -webkit-clip-path: none;
}

:host([corner=left]) {
  -webkit-clip-path: var(--_bbva-button-left-corner-clip-path);
  clip-path: var(--_bbva-button-left-corner-clip-path);
}

:host(:not([href])) {
  padding: 0;
  border: var(--bbva-chat-button-border, none);
  border-radius: var(--bbva-chat-button-border-radius, var(--borderRadiusSmall, ${t(y.small)}));
  color: var(--_color);
}

:host([disabled]) {
  color: var(--_color-disabled);
  background-color: var(--_bg-color-disabled);
  opacity: var(--_opacity-disabled);
}

:host([variant=positive]) {
  background-color: var(--_bg-color-positive-variant);
}

:host(:not([href])[active]:not([disabled])) {
  background-color: var(--_bg-color-active);
}

:host(:not([href])[active][variant=positive]) {
  background-color: var(--_bg-color-active-positive-variant);
}

:host(:not([href])[disabled][variant=positive]) {
  color: var(--_color-disabled-positive-variant);
  background-color: var(--_bg-color-disabled-positive-variant);
  opacity: var(--_opacity-disabled-positive-variant);
}

div {
  width: 100%;
  position: relative;
  display: flex;
}

@supports (not (clip-path: polygon(0% 0%, 0% 0%, 0% 0%, 0% 0%, 0% 0%))) and (not (-webkit-clip-path: polygon(0% 0%, 0% 0%, 0% 0%, 0% 0%, 0% 0%))) {
  :host {
    border-top-right-radius: 0;
  }

  :host([full-width]) {
    width: calc(100% - calc( 1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px));
  }

  .corner-manager:after {
    content: "";
    position: absolute;
    right: 0;
    top: 0;
    transform: translateX(100%);
    border-bottom: calc( 1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px) solid transparent;
    border-left: calc( 1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)})) * 1px) solid var(--_bg-color);
  }
}
@supports (-webkit-line-clamp: 2) {
  .text {
    white-space: normal;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
    overflow: hidden;
  }
}
.icon {
  flex: none;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
${Ae.mediaRules()}`;const qe=new r;var Fe=e`[ambient^=light] {
  --bbva-chat-button-bg-color-focus-visible: initial;
  --bbva-chat-button-disabled-color: initial;
  --bbva-chat-button-color: initial;
  --bbva-chat-button-background-shift: initial;
  --bbva-chat-button-active-bg-color: initial;
  --bbva-chat-button-background-shift-focus-visible: initial;
  --bbva-chat-button-clip-path1: initial;
  --bbva-chat-button-clip-path2: initial;
  --bbva-chat-button-animation-duration: initial;
  --bbva-chat-button-bg-color-disabled: initial;
  --bbva-chat-button-opacity-disabled: initial;
  --bbva-chat-button-bg-color-disabled-positive-variant: var(--colorsSecondary200, ${t(o.secondary200)});
  --bbva-chat-button-opacity-disabled-positive-variant: 1;
  --bbva-chat-button-disabled-color-positive-variant: var(--colorsSecondary400, ${t(o.secondary400)});
}
${qe.mediaRules()}`;const Be=new r;var De=e`[ambient^=dark] {
  --bbva-chat-button-disabled-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-chat-button-active-bg-color: var(--colorsPrimaryCoreDark, ${t(o.primaryCoreDark)});
  --bbva-chat-button-bg-color-disabled: var(--colorsPrimaryMedium, ${t(o.primaryMedium)});
  --bbva-chat-button-opacity-disabled: 0.4;
  --bbva-chat-button-bg-color-disabled-positive-variant: var(--colorsPrimaryCoreDark, ${t(o.primaryCoreDark)});
  --bbva-chat-button-opacity-disabled-positive-variant: 0.4;
  --bbva-chat-button-disabled-color-positive-variant: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
}
${Be.mediaRules()}`;const Ne={dark:e`
    ${_.dark}
    ${c.dark}
    ${De}
  `,light:e`
    ${_.light}
    ${c.light}
    ${Fe}
  `};class Ve extends(l(d(f))){static get scopedElements(){return{"bbva-icon":k,"bbva-text":p}}static get is(){return"bbva-chat-button"}static get properties(){return{text:{type:String},icon:{type:String},noink:{type:Boolean,hasChanged:()=>!1},corner:{type:String}}}constructor(){super(),this.type="button",this.disabled=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("click",this._onButtonClick)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("click",this._onButtonClick)}static get styles(){return[super.styles,Le,Ne.dark,Ne.light,m("bbva-chat-button-shared-styles")]}render(){return g`
      <div class="corner-manager">
        <div class="ripple-manager">
          ${this.iconTemplate}
          ${this.text?g`<bbva-text unset ellipsis lines="2" .text=${this.text}> </bbva-text>`:g`<span class="text"><slot></slot></span> `}
        </div>
      </div>
      ${this._action}
    `}get iconTemplate(){return this.icon?g` <bbva-icon size="24" class="icon" .icon="${this.icon}"></bbva-icon> `:g``}_onButtonClick(){this.disabled||this.dispatchEvent(new CustomEvent("chat-button-item-click",{detail:!0,bubbles:!0,composed:!0}))}}v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryMedium"),v("colors.primaryVariantDark");var je=e`[ambient^=light] {
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
${(new r).mediaRules()}`;const He=new r;var ze=e`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${t(o.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${t(o.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${t(o.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
}
${He.mediaRules()}`;const Ge={dark:e`
    ${$.dark}
    ${x.dark}
    ${w.dark}
    ${ze}
  `,light:e`
    ${$.light}
    ${x.light}
    ${w.light}
    ${je}
  `},Ue=new r;var We=e`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${t(o.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${t(o.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${t(o.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${t(o.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${t(o.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${t(o.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${t(o.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${t(o.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${t(o.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${t(o.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${t(o.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(s.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(s.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${t(s.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${t(s.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${t(s.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${t(s.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
${Ue.mediaRules()}`;class Xe extends(C(T(E(d(l(R(h))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[A,L,q,p,F];return Xe.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,We,Ge.light,Ge.dark,I("button:focus"),m("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return g`
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
    `}get _icon(){return g`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return g`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return g`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const e="nochange"===this.status?"no-change":this.status;return g`
      <bbva-badge-variability
        disabled-tabindex
        .status=${e}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const e=O(this.mask,this.maskChars,!0,this.visibleChars);return g`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${e.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let e=null;return this.actionIcon||this.actionSecondaryIcon?e=this._actionIcons:this.actionLink&&(e=this._tplLink("actionLink")),e}get _definitionDescriptionTpl(){let e=null,t="";return this.description?(e=this._tplText("description"),t="description"):this.mask?(e=this._mask,t="mask"):this._isValidAmount&&(e=this._amount,t="amount"),g`
      <dd class=${M({[`wrapper-${t}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){const t="actionLink"===e?`${e}AccessibilityText`:`${e}LinkAccessibilityText`;return g`
      <bbva-link
        class=${M({ellipsis:this[`${e}Ellipsis`]})}
        aria-label="${P(this.t(this[t]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(e)}"
      >
        <span role=${P(this.roleLink)} aria-live=${P(this.arialiveLink)}>
          ${this[e]}
        </span>
      </bbva-link>
    `}_tplNoLink(e){const t=`${e}AccessibilityText`,a=`${e}TagText`,i=`${e}RoleText`,s=`${e}AriaLiveText`;return g`
      <bbva-text
        aria-label="${this.t(this[t])}"
        role="${P(this[i])}"
        aria-live="${P(this[s])}"
        class="${e}"
        unset
        size="S"
        text="${this[e]}"
        tag="${P(this[a])}"
      >
      </bbva-text>
    `}_tplText(e){return g` ${this[`${e}Link`]?this._tplLink(e):this._tplNoLink(e)} `}_iconClick(e){this.dispatchEvent(new CustomEvent(`list-simple-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(e){const t=e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return g`
      <dl>
        <dt class=${M({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return g`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?g`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let e=null;const t=["stacked","stacked-center"].includes(this.variant);return e=this.label?this.description||this._isValidAmount||this.mask||t?t?this.renderStacked():this.renderDefault():this._tplText("label"):g` <div class="wrapper-description">${this._tplText("description")}</div> `,g`
      ${e}
      <div class="skeleton"></div>
    `}}customElements.define(Xe.is,Xe);const Qe=new r;var Je=e`[ambient^=light] {
  --bbva-panel-code-number-background-color: initial;
  --bbva-panel-code-number-color: initial;
}

[ambient=light100] {
  --bbva-panel-code-number-background-color: var(--colorsPrimaryCoreDarkened, ${t(o.primaryCoreDarkened)});
  --bbva-panel-code-number-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
}
${Qe.mediaRules()}`;const Ke=new r;const Ye={light:Je,dark:e`[ambient^=dark] {
  --bbva-panel-code-number-background-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-panel-code-number-color: var(--colorsPrimaryCoreDarkened, ${t(o.primaryCoreDarkened)});
}
${Ke.mediaRules()}`},Ze=new r;var et=e`:host {
  font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(s.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${t(s.book.fontStyle)});
  line-height: var(--lineHeightTypeSmall, ${t(i.typeSmall)});
  --_background-color: var(--bbva-panel-code-number-dark-mode-background-color, var(--bbva-panel-code-number-background-color, var(--colorsSecondary100, ${t(o.secondary100)})));
  --_color: var(--bbva-panel-code-number-dark-mode-color, var(--bbva-panel-code-number-color, var(--colorsSecondary600, ${t(o.secondary600)})));
  --bbva-text-color: var(--bbva-panel-code-number-dark-mode-color, var(--bbva-panel-code-number-color, var(--colorsSecondary600, ${t(o.secondary600)})));
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

[role=group] {
  display: inline-flex;
  box-sizing: border-box;
}

.group {
  flex: none;
  display: flex;
  align-items: center;
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  height: 3.5rem;
  background-color: var(--_background-color);
  color: var(--_color);
}

.char {
  display: flex;
  justify-content: center;
  align-items: center;
}

.group ~ .group {
  margin-left: var(--bbva-panel-code-number-group-spacing, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em));
}

.char ~ .char {
  margin-left: var(--bbva-panel-code-number-char-spacing, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em));
}

:host([masked]) .group {
  padding: 0 calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([masked]) .char ~ .char {
  margin-left: var(--bbva-panel-code-number-char-spacing, calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 15) * 1em));
}

.mask {
  height: 0.5rem;
  width: 0.5rem;
  border-radius: 50%;
  background-color: var(--_color);
}
${Ze.mediaRules()}`;class tt extends(l(d(h))){static get is(){return"bbva-panel-code-number"}static get scopedElements(){return{"bbva-text":p}}static get properties(){return{code:{type:String},masked:{type:Boolean},groupBy:{type:Number,attribute:"group-by"},accessibilityText:{type:String,attribute:"accessibility-text"},_codeToRender:{type:Array}}}constructor(){super(),this.disabledTabindex=!0}updated(e){super.updated&&super.updated(e),e.has("accessibilityText")&&this.masked&&this.setAttribute("aria-label",this.accessibilityText)}static get styles(){return[super.styles,et,m("bbva-panel-code-number-shared-styles"),Ye.light,Ye.dark]}get _codeToRender(){const e=(this.code||"").split("");if(this.groupBy){const t=[];for(;e.length>0;)t.push(e.splice(0,this.groupBy));return t}return[e]}get _groups(){return g`
      <div role="group">
        ${this._codeToRender.map((e=>g`
              <span class="group">
                ${e.map((e=>g`
                      <span class="char">
                        ${this.masked?g` <span class="mask"></span> `:g` <bbva-text text=${e} size="S"> </bbva-text>`}
                      </span>
                    `))}
              </span>
            `))}
      </div>
    `}render(){return g` ${this._groups} `}}customElements.define(tt.is,tt);var at=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class it extends(B(h)){static get is(){return"bbva-dataprovider-qas"}static get properties(){return{host:{type:String},requiredToken:{type:String},native:{type:Boolean},qadomainId:{type:String},qasApiVersion:{type:String},headers:{type:Object}}}constructor(){super(),this.qasApiVersion="0",this.requiredToken="tsec",this.native=!1,this.headers={},this.qadomainId="7"}static get styles(){return[at,m("bbva-dataprovider-qas-shared-styles")]}getListQas(e){const t={host:this.host,headers:this.headers,params:{"qadomain-id":this.qadomainId,question:e},version:this.qasApiVersion,requiredToken:this.requiredToken,native:this.native},a=it._serviceListQas(t);this._generateGetService(a,{customEvent:"set-list-qas",errorFireEventHandler:"error-on-get-list-qas"})}static _serviceListQas(e){return new xe(e)}}class st{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let s=0|t,r=Math.max(s>=0?s:i-Math.abs(s),0);for(;r<i;){if((n=a[r])===(o=e)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var a=[],i=0,s="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?i=a.push(o):(o-=65536,i=a.push(55296+(o>>10),o%1024+56320)),i>=16383&&(s+=e.apply(null,a),a.length=0)}return s+e.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",a=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${a&&a.message}`)}}class rt extends st{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const nt=0,ot=1,ct="jwt",lt="tsec",dt="none";class ht extends st{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=nt,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new rt,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=lt:this.requiredToken=dt,this.requiresJWT=!1):this.requiredToken===lt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===ct?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===dt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(lt)}_setJwtHandler(){this._setTokenHandler(ct)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((a,i)=>{t=Object.assign(t,{resolve:a,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let a=this._getRequestHeaders();Object.keys(a).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,a[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=D),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let a=e.replace(/[\{\}]+/g,""),i=t[a];return i?delete t[a]:this._error(9,`Missing ${a} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(t);a.length&&(e=[e,a.map((e=>{let a=t[e];return Array.isArray(a)&&this.paramArrayMode===ot?this._arrayToQueryParam(e,a):`${e}=${a}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(lt,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(ct,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=t.getItem(a);i&&"null"!==i&&(e[a]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const a=window.sessionStorage;t=Object.keys(a).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=a.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const a=`${e}Handler`,i=e===ct?"JWT ":"",s=e===ct?"Authorization":lt;if(void 0===this[a]||null===this[a])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let n=this[a].getItem(r);n?t[s]=t[s]||i+n:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((a=>{t.push(`${a}=${e[a]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(a){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let a;const i=new Promise(((e,t)=>{a=(a,i)=>{a?t(a):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?a(i.error):a(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let a=0;for(;a<e.length;){let i=e[a],s=0,r=0;if(i<=127?(s=0,r=255&i):i<=223?(s=1,r=31&i):i<=239?(s=2,r=15&i):i<=244&&(s=3,r=7&i),e.length-a-s>0){let t=0;for(;t<s;)i=e[a+t+1],r=r<<6|63&i,t+=1}else r=65533,s=e.length-a;t+=String.fromCodePoint(r),a+=s+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},a=e.trim().split(/[\r\n]+/);for(const e in a)if(a.hasOwnProperty(e)&&""!==a[e]){let i=": ",s=a[e].split(i);t[s.shift().toLowerCase()]=s.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,a,i){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(s=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(s=JSON.parse(t.headers)[i])}if(s){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;e.getItem(t)!==s&&(e.setItem(t,s),this._emitTokenUpdate(a,s))}}_emitTokenUpdate(e,t){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,a,i,s,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),a=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),s=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(e.headers);t=n.authenticationtype,a=n.authenticationdata||null,i=n.authenticationstate,s=n.authenticationchallenge,r=n.authenticationresponse}return{type:t,data:a,state:i,challenge:s,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",a=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",a="",i=""){let s;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,a);s=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(s+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(s,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(s=`password=${e}`,this._buildSignatureHeaders(s,"2",i)):(s=`${a}=${e}`,this._buildSignatureHeaders(s,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let a,i=e.split(",");if(i.length>1){a=i.map((e=>`${e}=${t[e]}`)).join(",")}else a=`${e}=${t}`;return a}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:n,state:o,challenge:c,response:l}=this._extractSignatureResponseHeaders(e),d=this._getRequestMetadata(e);if(s)this._notifySignatureInvalid(d),a=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,r,n,o,c,l),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,r,n,o,c,l),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),s=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);s&&(this._notifyWaitingForProcessResponse(r),a=!0)}return a}_notifySignatureRequiredFirstStep(e,t,a,i){this._defineSignatureType(t,a),this._defineSignatureValue(t,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:a,metadata:e}}))}_notifySignatureRequired(e,t,a,i,s,r){this._defineSignatureValue(t,a,i);const n={type:t,data:a,challenge:s,metadata:e};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:a}=e;return{path:this._path,method:this.method,url:t,status:a}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",a=""){const i=t.split(";").findIndex((t=>t===e));return a?a.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,a,i,s,r){i?this._notifySignatureRequired(e,t,a,i,s,r):this._notifySignatureRequiredFirstStep(e,t,a,i)}_notifySignatureTypeUsingErrorCode(e,t,a,i,s,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,a,i,s):this._notifySignatureRequired(t,a,i,s,r,n)}}class bt extends ht{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class pt extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/behavioral-events`)}toString(){return super.toString("BGADPCustomersCustomerBehavioralEventsPostV0")}}class mt extends bt{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/behavioral-events`)}toString(){return super.toString("BGADPCustomersCustomerBehavioralEventsPostV1")}}class gt extends(B(h)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class ut extends gt{static get is(){return"bbva-global-customer-behavioral-events-api-dm"}constructor(){super()}postCustomerBehavioralEvents(e,t){const a={"customer-id":e};this._generateGetService(this._getService("post",t,a),{customEvent:"customer-behavioral-events-api-dm-create",errorFireEventHandler:"customer-behavioral-events-api-dm-create-error"},this._responseMapping)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomerBehavioralEvents`,this._getBgadp(i))}_getBgadp(e){return{postCustomerBehavioralEventsV0:()=>new pt(e),postCustomerBehavioralEventsV1:()=>new mt(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return this._renameProperty(e.behavioralType,"name","description"),e}}class vt extends gt{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},a={}){const i=this._getServiceParams(a,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(i))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new we(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}N(vt,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(vt.is,vt);var yt=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(o.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(o.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${t(o.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(o.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(o.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(o.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${t(o.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(a.typeMedium)}));
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
`;class _t extends(l(C(R(h)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":p,"bbva-icon":k,"bbva-badge-notification":V}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,a=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,i=Math.max(t,a);return i in e?e[i]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[yt,m("bbva-header-main-shared-styles"),I("button:focus"),c.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return g`<bbva-icon icon="${P(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return g`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,a,i){const s=_t.toCamelCase(e),r=`icon${s}`,n=`accessibilityTextIcon${s}`;return g`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${P(this.t(this[n]))}"
      aria-expanded=${P(i)}
      ?hidden="${!this[r]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(r):this._icon(r)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(e){return g` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${P(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return g`
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
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:a,image:i,_hasMicroillustration:s}=this;return g`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(s||i)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(a)}
          tabindex="-1"
        >
          ${a&&" "!==a&&this._tplHeading(a)||""}
          <img src="${P(i)}" alt="" ?hidden="${!i}" id="image" aria-hidden="true" />

          <span
            class="${s}"
            ?hidden="${!s}"
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
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(_t.is,_t);var ft=e`[ambient^=light] {
  --bbva-form-rating-title-color: initial;
  --bbva-form-rating-text-color: initial;
  --bbva-form-rating-icon-color: initial;
  --bbva-form-rating-thumb-icon-color: initial;
  --bbva-form-rating-thumb-checked-icon-color: initial;
  --bbva-form-rating-checked-icon-color: initial;
  --bbva-form-rating-all-checked-icon-color: initial;
  --bbva-form-rating-skeleton-color: initial;
  --bbva-form-rating-skeleton-quote-bg: initial;
  --bbva-form-rating-skeleton-animated-layer-bg: initial;
}
${(new r).mediaRules()}`;const kt=new r;const St={dark:e`
    ${e`[ambient^=dark400] {
  --bbva-form-rating-icon-color: var(--colorsPrimarySubdued, ${t(o.primarySubdued)});
  --bbva-form-rating-title-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-rating-text-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-rating-thumb-icon-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-rating-thumb-checked-icon-color: var(--colorsPrimarySubdued, ${t(o.primarySubdued)});
  --bbva-form-rating-checked-icon-color: var(--colorsPrimarySubdued, ${t(o.primarySubdued)});
  --bbva-form-rating-all-checked-icon-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-form-rating-skeleton-color: var(--colorsPrimaryCoreDark, ${t(o.primaryCoreDark)});
  --bbva-form-rating-skeleton-quote-bg: var(--colorsPrimaryCoreDarkened, ${t(o.primaryCoreDarkened)});
  --bbva-form-rating-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${t(o.primaryCoreDarkened)});
}
${kt.mediaRules()}`}
    ${j.dark}
    ${_.dark}
    ${c.dark}
    ${H.dark}
  `,light:e`
    ${ft}
    ${j.light}
    ${_.light}
    ${c.light}
    ${H.light}
  `},$t=new r;var xt=e`:host {
  display: block;
  box-sizing: border-box;
  text-align: center;
  --_form-rating-icon-color: var(--bbva-form-rating-dark-mode-icon-color, var(--bbva-form-rating-icon-color, var(--colorsTertiaryType4Dark, ${t(o.tertiaryType4Dark)})));
  --_form-rating-thumb-icon-color: var(--bbva-form-rating-dark-mode-thumb-icon-color, var(--bbva-form-rating-thumb-icon-color, var(--colorsSecondary500, ${t(o.secondary500)})));
  --_form-rating-thumb-checked-icon-color: var(--bbva-form-rating-dark-mode-thumb-checked-icon-color, var(--bbva-form-rating-thumb-checked-icon-color, var(--colorsPrimaryCore, ${t(o.primaryCore)})));
  --_form-rating-all-checked-icon-color: var(--bbva-form-rating-dark-mode-all-checked-icon-color, var(--bbva-form-rating-all-checked-icon-color, var(--colorsSecondary500, ${t(o.secondary500)})));
  --_form-rating-checked-icon-color: var(--bbva-form-rating-dark-mode-checked-icon-color, var(--bbva-form-rating-checked-icon-color, var(--colorsTertiaryType4Dark, ${t(o.tertiaryType4Dark)})));
  --_form-rating-skeleton-animated-layer-bg: var(--bbva-form-rating-dark-mode-skeleton-animated-layer-bg, var(--bbva-form-rating-skeleton-animated-layer-bg, var(--ambientsLight, ${t(z.light)})));
  --_skeleton-quote-color: var(--bbva-form-rating-dark-mode-skeleton-color,var(--bbva-form-rating-skeleton-color, var(--colorsSecondary200, ${t(o.secondary200)})));
  --_skeleton-quote-bg: var(--bbva-form-rating-dark-mode-skeleton-quote-bg,var(--bbva-form-rating-skeleton-quote-bg, transparent));
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

.form-rating {
  padding: calc(var(--bbva-global-spacer, 0.5rem) * 2);
}
.form-rating[aria-disabled=true] {
  opacity: 40%;
  pointer-events: none;
}

.title {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0;
}

.inline-title {
  display: inherit;
}

.text {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) auto 0 auto;
}

.dot {
  width: 6px;
  height: 6px;
  border-radius: 50%;
  margin: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) auto 0 auto;
}

.content {
  min-height: 2rem;
  display: flex;
  justify-content: center;
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

.label-star, .thumb-item {
  margin: 0 0 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

.label-star {
  display: inline-block;
}
.label-star .icon {
  fill: var(--_form-rating-icon-color);
  transition: color 0.2s ease-in-out;
  pointer-events: none;
}
.label-star .dot {
  background-color: var(--_form-rating-icon-color);
  transition: color 0.2s ease-in-out;
  pointer-events: none;
}
.label-star:first-of-type {
  display: none;
  overflow: hidden;
  width: 0;
  height: 0;
}
.label-star:nth-of-type(2) {
  margin-left: 0;
}

.thumb-item .icon {
  fill: var(--_form-rating-thumb-icon-color);
  transition: color 0.2s ease-in-out;
}
.thumb-item .dot {
  background-color: var(--_form-rating-thumb-icon-color);
  transition: color 0.2s ease-in-out;
  display: none;
}
.thumb-item:first-of-type {
  margin-left: 0;
}
.thumb-item:nth-of-type(2) {
  margin-left: calc(((9 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
.thumb-item input[type=radio]:checked ~ .icon {
  fill: var(--_form-rating-thumb-checked-icon-color);
}
.thumb-item input[type=radio]:checked ~ .dot {
  background-color: var(--_form-rating-thumb-checked-icon-color);
  display: block;
}

.thumb-label {
  display: block;
  position: relative;
}
.thumb-input {
  position: absolute;
  margin: 0 auto;
  width: 100%;
  height: 2rem;
  appearance: none;
  background-color: transparent;
  border-color: transparent;
  top: 0;
  left: 0;
}

.star-content input[type=radio] {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}
.star-content input[type=radio]:checked ~ .label-star .icon {
  fill: var(--_form-rating-all-checked-icon-color);
}
.star-content input[type=radio]:checked ~ .label-star .dot {
  background-color: var(--_form-rating-all-checked-icon-color);
  display: none;
}
.star-content input[type=radio]:checked + .label-star .icon {
  fill: var(--_form-rating-checked-icon-color);
  pointer-events: none;
}
.star-content input[type=radio]:checked + .label-star .dot {
  background-color: var(--_form-rating-checked-icon-color);
  pointer-events: none;
  display: block;
}

.inline {
  display: grid;
  grid-template-columns: 1fr auto;
  column-gap: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  row-gap: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
.inline .thumb-item:nth-of-type(2) {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([loading]) .form-rating {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 7.5rem;
  width: 100%;
  margin-left: auto;
  margin-right: auto;
}
:host([loading]) .form-rating .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  background: var(--_form-rating-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}
:host([loading]) .form-rating.skeleton--thumbs {
  height: 2.75rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_skeleton-quote-bg);
  background-size: calc((140px * 2) + (16px/ 2)) 16px, 16px 16px, 16px 16px;
  background-position: 20px 20px, calc(100% - 52px) 20px, calc(100% - 20px) 20px;
}
:host([loading]) .form-rating.skeleton--stars {
  height: 7.5rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--_skeleton-quote-bg);
  background-size: calc((216px * 2) + (var(--typographyTypeSmall, 0.9375rem)/ 2)) var(--typographyTypeSmall, 0.9375rem), 24px 24px, 24px 24px, 24px 24px, 24px 24px, 24px 24px, calc((144px * 2) + (var(--typographyTypeSmall, 0.9375rem)/ 2)) var(--typographyTypeSmall, 0.9375rem);
  background-position: calc(50% + 108px) 20px, calc(50% - (calc(24px + calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem)) * 2)) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem)), calc(50% - calc(24px + calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem))) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem)), calc(50%) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem)), calc(50% + calc(24px + calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem))) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem)), calc(50% + (calc(24px + calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem)) * 2)) calc(42px + calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem)), calc(50% + 72px) calc(68px + (calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) * 2));
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
${$t.mediaRules()}`;class wt extends(d(l(R(h)))){static get is(){return"bbva-form-rating"}static get scopedElements(){return{"bbva-icon":k,"bbva-text":p,"bbva-divider":G,"bbva-badge-default":U}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},numStars:{type:Number,attribute:"num-stars"},title:{type:String},contentTitle:{type:String,attribute:"content-title"},text:{type:String},statusType:{type:String},value:{type:Number},thumbs:{type:Boolean},borderTop:{type:Boolean,attribute:"border-top"},disabled:{type:Boolean},hideText:{type:Boolean,attribute:"hide-text"},loading:{type:Boolean,reflect:!0},inline:{type:Boolean},hasNotEllipsis:{type:Boolean,attribute:"has-not-ellipsis"}}}constructor(){super(),this.numStars=5,this._uniqueId=`radio-${String(Math.floor(Math.random()*Date.now()))}`,this._accessibilityLabel="bbva-form-rating-accessibility-label",this._accessibilityTextThumbsLike="bbva-form-rating-thumbs-like",this._accessibilityTextThumbsUnlike="bbva-form-rating-thumbs-unlike",this.thumbs=!1,this.borderTop=!1,this.disabled=!1,this.hideText=!1,this.loading=!1,this.statusType="success",this.inline=!1,this.hasNotEllipsis=!1}update(e){super.update(e),e.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static get styles(){return[super.styles,xt,m("bbva-form-rating-shared-styles"),St.dark,St.light]}get _thumbsTemplate(){return g`
      <div id="thumb-container" class="content" role="radiogroup" @change="${this._ratingChanged}">
        <div class="thumb-item">
          <span id="accessibleLabel-0" aria-hidden="true" class="sr-only">
            ${this.t(this._accessibilityTextThumbsLike)}
          </span>
          <label class="thumb-label" for="${this._uniqueId}-0">
            <input
              class="thumb-input"
              type="radio"
              id="${this._uniqueId}-0"
              name="${this._uniqueId}"
              value="0"
              ?checked="${0===this.value}"
              aria-labelledby="accessibleLabel-0"
            />
            <bbva-icon
              class="icon"
              icon="${W()}"
              size="24"
              aria-hidden="true"
              data-test="icon-up"
            ></bbva-icon>
            <div class="dot"></div>
          </label>
        </div>

        <div class="thumb-item">
          <span id="accessibleLabel-1" aria-hidden="true" class="sr-only">
            ${this.t(this._accessibilityTextThumbsUnlike)}
          </span>
          <label class="thumb-label" for="${this._uniqueId}-1">
            <input
              class="thumb-input"
              type="radio"
              id="${this._uniqueId}-1"
              name="${this._uniqueId}"
              value="1"
              ?checked="${1===this.value}"
              aria-labelledby="accessibleLabel-1"
            />
            <bbva-icon
              class="icon"
              icon="${X()}"
              size="24"
              aria-hidden="true"
              data-test="icon-down"
            ></bbva-icon>
            <div class="dot"></div>
          </label>
        </div>
      </div>
    `}get _starsTemplate(){return g`
      <div
        id="star-container"
        class="content star-content"
        role="group"
        @change="${this._ratingChanged}"
        aria-labelledby="accessibleLabel-1 accessibleLabel-2 accessibleLabel-3 accessibleLabel-4 accessibleLabel-5"
      >
        <input
          type="radio"
          id="${this._uniqueId}-0"
          name="${this._uniqueId}"
          value="0"
          aria-hidden="true"
          tabindex="-1"
          checked
          hidden
        />
        <label class="label-star" hidden for="${this._uniqueId}-0"></label>

        ${this._stars.map(((e,t)=>g`
            <input
              type="radio"
              id="${this._uniqueId}-${t+1}"
              name="${this._uniqueId}"
              .value="${String(t+1)}"
              ?checked="${this.value===t+1}"
              aria-hidden="false"
            />

            <label class="label-star" for="${this._uniqueId}-${t+1}">
              <span id="accessibleLabel-${t+1}" class="sr-only">
                ${this.t(this._accessibilityLabel,{index:t+1})}
              </span>

              <bbva-icon
                class="icon"
                .icon="${Q()}"
                size="24"
                aria-hidden="true"
                data-test="icon"
              ></bbva-icon>
              <div class="dot"></div>
            </label>
          `))}
      </div>
    `}get _inlineTemplate(){return g`<bbva-text
        id="title"
        unset
        class="inline-title"
        ?ellipsis="${!this.hasNotEllipsis}"
        lines="1"
        size="S"
        text=${P(this.contentTitle)}
      ></bbva-text>
      ${this._thumbsTemplate}
      <bbva-badge-default
        id="text"
        unset
        text=${this.text}
        type=${this.statusType}
      ></bbva-badge-default>`}get _labelTemplate(){return this.contentTitle?g`<bbva-text
          id="title"
          unset
          ?ellipsis="${!this.hasNotEllipsis}"
          lines="1"
          alignment="center"
          class="title"
          size="S"
          text=${P(this.contentTitle)}
        ></bbva-text>`:""}get _statusTemplate(){return this.text&&!this.hideText?g`<bbva-badge-default
          id="text"
          unset
          class="text"
          text=${this.text}
          type=${this.statusType}
        ></bbva-badge-default>`:""}render(){return g`${this.loading?g`<div class="form-rating ${this.thumbs?"skeleton--thumbs":"skeleton--stars"}">
          <div class="skeleton"></div>
        </div>`:g`${this.borderTop?g` <bbva-divider></bbva-divider> `:""}
          <div class="form-rating ${this.inline?"inline":""}" aria-disabled=${this.disabled}>
            <span id="accessible-text" class="sr-only">${this.accessibilityText}</span>
            ${this.inline?this._inlineTemplate:g`
                  ${this._labelTemplate} ${this.thumbs?this._thumbsTemplate:this._starsTemplate}
                  ${this._statusTemplate}
                `}
          </div> `}`}get _stars(){return Array(this.numStars).fill(void 0)}_ratingChanged(){this.value=Number(this.shadowRoot.querySelector(":checked").value),this.dispatchEvent(new CustomEvent("form-rating-value-change",{detail:this.value,bubbles:!0,composed:!0}))}}v("colors.tertiaryType4"),v("colors.cool20"),v("colors.primarySubdued"),v("colors.cool20"),v("colors.tertiaryType4"),v("colors.cool90"),v("colors.cool50"),v("colors.cool90");var Ct=e`:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  height: 100%;
  width: 100%;
  --bbva-panel-offer-microillustration-height: 6rem;
  --bbva-panel-offer-microillustration-width: 6rem;
  --bbva-chat-form-bg-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --bbva-chat-form-gradient-color: var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)});
  --_bbva-widget-smart-assistant-menu-options-border-bottom-color: var(
    --bbva-widget-smart-assistant-menu-options-border-bottom-color,
    var(--colorsSecondary300, ${t(o.secondary300)})
  );
  --_bbva-widget-smart-assistant-chat-form-bg-color: var(
    --bbva-widget-smart-assistant-chat-form-dark-mode-bg-color,
    var(
      --bbva-widget-smart-assistant-chat-form-bg-color,
      var(--colorsSecondary100, ${t(o.secondary100)})
    )
  );
  --_bbva-widget-smart-assistant-footer-height: var(
    --bbva-widget-smart-assistant-footer-height,
    0px
  );
  --bbva-help-modal-padding: 0px;
}
:host .chat-footer [data-tag-name=bbva-chat-form][chat-form-padding-bottom] {
  padding-bottom: var(--bbva-widget-smart-assistant-chat-footer-chat-form-padding-bottom, 1rem);
}

:host([conversational-mode]) .chat-main .scrollable {
  flex-direction: column-reverse;
  justify-content: flex-start;
}
:host([conversational-mode]) .chat-footer[hide-button-wrapper] .button-wrapper:not([empty]) {
  display: none;
}

:host([more-options-mode]) .chat-main .scrollable {
  display: block;
}
:host([more-options-mode]) .chat-main .scrollable [data-tag-name=bbva-panel-offer].welcome-info-container .welcome-text {
  line-height: var(--bbva-widget-smart-assistant-more-options-mode-chat-main-scrollable-welcome-text-line-height, 1.4rem);
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

.header-main {
  position: absolute;
  top: 0;
  width: 100%;
}

.chat-main {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  padding-top: var(--bbva-widget-smart-assistant-chat-main-padding-top, 3rem);
}
.chat-main .scrollable {
  display: flex;
  flex-direction: column;
  justify-content: flex-end;
  height: calc(100% - var(--_bbva-widget-smart-assistant-footer-height));
  width: 100%;
  overflow-y: auto;
}
.chat-main .scrollable [data-tag-name=bbva-panel-offer].welcome-info-container {
  --bbva-panel-offer-content-text-padding: var(--bbva-widget-smart-assistant-chat-main-scrollable-welcome-info-container-text-padding, calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
  padding-top: var(--bbva-widget-smart-assistant-chat-main-scrollable-welcome-info-container-padding-top, 0.75rem);
}
.chat-main .scrollable [data-tag-name=bbva-panel-offer].welcome-info-container .clip-bot-container {
  margin-top: var(--bbva-widget-smart-assistant-chat-main-scrollable-welcome-info-container-clip-bot-container-margin-top, 0);
}

.menu-options .content-clip {
  display: flex;
  width: 100%;
  padding: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, 8))) / 16) * 1rem));
}
.menu-options .content-clip:not(:last-of-type) {
  border-bottom: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-not-last-of-type-border-bottom, 0.0625rem solid var(--_bbva-widget-smart-assistant-menu-options-border-bottom-color));
}
.menu-options .content-clip .image {
  flex: 0 0 auto;
  margin-right: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-image-margin-right, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, 8))) / 16) * 1rem));
  width: 3rem;
  height: 3rem;
}
.menu-options .content-clip .main-content {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: flex-start;
}
.menu-options .content-clip .main-content.heading-link {
  color: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-main-content-heading-link-color, var(--colorsPrimaryMedium, #1973B8));
  font-weight: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-main-content-heading-link-font-weight, var(--fontFacePrimaryMediumFontWeight, 500));
  font-style: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-main-content-heading-link-font-style, var(--fontFacePrimaryMediumFontStyle, normal));
  line-height: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-main-content-heading-link-line-height, var(--lineHeightTypeMedium, 1.5rem));
  cursor: pointer;
}
.menu-options .content-clip .main-content .text {
  margin: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-main-content-text-margin, 0);
  all: unset;
}
.menu-options .content-clip .main-content .lines {
  display: block;
  text-overflow: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-main-content-lines-text-overflow, ellipsis);
  white-space: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-main-content-lines-white-space, normal);
  overflow: hidden;
}
.menu-options .content-clip:active {
  background-color: var(--bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-active-and-focus-bg-color, var(--colorsSecondary100, #F4F4F4));
  --bbva-widget-smart-assistant-chat-main-scrollable-menu-options-content-clip-main-content-heading-link-color: var(--colorsPrimaryCore, #004481);
}
.menu-options .content-clip[disabled-tabindex] {
  outline: none;
}

.messages {
  padding-top: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-padding-top, calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
  --bbva-clip-bot-width-size-small: 5rem;
  --bbva-clip-bot-height-size-small: 4rem;
}
.messages .list-date-title {
  padding-left: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-list-date-title-padding-left, 1rem);
  font-weight: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-list-date-title-font-weight, var(--fontFacePrimaryMediumFontWeight, 500));
}
.messages .list-container {
  margin-top: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-list-container-margin-top, -0.5rem);
}
.messages .card-list-container:not([list-container-active]),
.messages .account-list-container:not([list-container-active]) {
  pointer-events: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-list-container-not-list-container-active-pointer-events, none);
}
.messages .expenses-list-container {
  margin-top: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-expenses-list-container-margin-top, 1rem);
}
.messages .contact-list-container > [data-tag-name=bbva-divider]:last-of-type {
  display: none;
}
.messages .contact-list-container .container {
  padding: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-contact-list-container-container-padding, 1rem);
}
.messages [data-tag-name=bbva-chat-text][active] {
  margin-bottom: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-chat-text-active-margin-bottom, -20px);
}
.messages > :not([data-tag-name=bbva-chat-text]) {
  position: relative;
  right: -100%;
  opacity: 0;
  transition: all 0.5s ease-in;
}
.messages > :not([data-tag-name=bbva-chat-text]).transition {
  opacity: 1;
  right: 0;
}
.messages > [data-tag-name=bbva-link] {
  justify-content: center;
  width: 100%;
  padding-bottom: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-link-padding-bottom, 1rem);
}
.messages [data-tag-name=bbva-chat-text] {
  overflow-wrap: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-chat-text-overflow-wrap, break-word);
}
.messages .writing-container,
.messages [data-tag-name=bbva-clip-bot] {
  position: static;
  opacity: 1;
  transition: none;
}
.messages [data-tag-name=bbva-list-card] {
  --_list-card-heading-color: #121212;
}
.messages [data-tag-name=bbva-list-card]:not(:last-of-type) {
  border-bottom: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-list-card-not-last-of-type-border-bottom, 1px solid #D3D3D3);
}
.messages [data-tag-name=bbva-list-card].listContacts {
  --_list-card-heading-color: #1973B8;
  --_list-card-status-color: transparent;
  border-bottom: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-list-card-list-contacts-border-bottom, none);
}
.messages [data-tag-name=bbva-expandable-accordion].divider-list .box-look {
  border-bottom: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-expandable-accordion-divider-list-box-look-border-bottom, none);
}
.messages [data-tag-name=bbva-expandable-accordion].divider-list [data-tag-name=bbva-divider]:last-of-type {
  display: none;
}
.messages [data-tag-name=bbva-expandable-accordion].card {
  box-shadow: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-expandable-accordion-card-box-shadow, var(--boxShadowType2, ${t(Y.type2)}));
  margin: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-expandable-accordion-card-margin, 0 1rem 1rem);
}
.messages [data-tag-name=bbva-expandable-accordion].container-faqs {
  --_expandable-accordion-text-color: #1973B8;
}
.messages [data-tag-name=bbva-expandable-accordion].container-faqs:last-of-type {
  margin-bottom: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-expandable-accordion-container-faqs-last-of-type-margin-bottom, 0.5rem);
}
.messages [data-tag-name=bbva-expandable-accordion].container-faqs .collapse-content {
  margin: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-container-faqs-collapse-content-margin, 0 1rem 0);
}
.messages [data-tag-name=bbva-expandable-accordion].container-faqs .collapse-content p:first-of-type {
  margin: var(--bbva-widget-smart-assistant-chat-main-scrollable-messages-container-faqs-collapse-content-p-not-first-of-type-margin, 0 0 1rem);
}
.messages .info-error {
  margin: 1rem;
}

.chat-footer {
  position: absolute;
  right: 0;
  bottom: 0;
  left: 0;
  background-color: var(--_bbva-widget-smart-assistant-chat-form-bg-color);
}
.chat-footer .scrollable[talking] {
  margin-bottom: var(--bbva-widget-smart-assistant-chat-footer-scrollable-talking-margin-bottom, calc(((-3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
}
.chat-footer .scrollable .button-wrapper:not([empty]) {
  display: flex;
  width: 100%;
  flex-wrap: wrap;
  padding-top: var(--bbva-widget-smart-assistant-chat-footer-scrollable-button-wrapper-not-empty-padding-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
  padding-right: var(--bbva-widget-smart-assistant-chat-footer-scrollable-button-wrapper-not-empty-padding-right, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
  padding-left: var(--bbva-widget-smart-assistant-chat-footer-scrollable-button-wrapper-not-empty-padding-left, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
}
.chat-footer .scrollable .button-wrapper:not([empty]) [data-tag-name=bbva-chat-button] {
  --bbva-chat-button-color: var(--colorsPrimaryMedium, ${t(o.primaryMedium)});
  --bbva-chat-button-max-width: auto;
  background-color: var(--bbva-widget-smart-assistant-chat-footer-scrollable-button-wrapper-not-empty-chat-button-bg-color, var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)}));
  margin-bottom: var(--bbva-widget-smart-assistant-chat-footer-scrollable-button-wrapper-not-empty-chat-button-margin-bottom, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
  min-height: 2.5rem;
  min-width: max-content;
}
.chat-footer .scrollable .button-wrapper:not([empty]) [data-tag-name=bbva-chat-button]:not(:last-of-type) {
  margin-right: var(--bbva-widget-smart-assistant-chat-footer-scrollable-button-wrapper-not-empty-chat-button-not-last-of-type-margin-right, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
}
.chat-footer .scrollable .button-wrapper:not([empty]) [data-tag-name=bbva-chat-button][active] {
  background-color: var(--bbva-widget-smart-assistant-chat-footer-scrollable-button-wrapper-not-empty-chat-button-active-bg-color, var(--colorsPrimaryCoreLight, ${t(o.primaryCoreLight)}));
  color: var(--bbva-widget-smart-assistant-chat-footer-scrollable-button-wrapper-not-empty-chat-button-active-color, var(--colorsPrimaryCoreLightened, ${t(o.primaryCoreLightened)}));
}
.chat-footer [data-tag-name=bbva-chat-form] {
  line-height: 0.6875rem;
  max-height: 8.5625rem;
}
.chat-footer [data-tag-name=bbva-chat-form][talking] {
  padding-top: var(--bbva-widget-smart-assistant-chat-footer-chat-form-talking-padding-top, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem));
}

.overflow-hidden {
  overflow: hidden;
}

.h-full {
  height: 100%;
}

[data-tag-name=bbva-help-modal]#modalSuccess {
  --bbva-header-main-dark-mode-bg-color-modal: var(--colorsTertiaryType6Dark);
  --bbva-header-main-position: static;
}
[data-tag-name=bbva-help-modal]#modalSuccess [data-tag-name=bbva-panel-process] {
  padding-top: var(--bbva-widget-smart-assistant-help-modal-success-panel-process-padding-top, 0.5625rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess [data-tag-name=bbva-notification-message] {
  margin: var(--bbva-widget-smart-assistant-help-modal-success-notification-message-margin, 1rem);
  margin-bottom: var(--bbva-widget-smart-assistant-help-modal-success-notification-message-margin-bottom, 0.25rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess [data-tag-name=bbva-panel-operation] {
  margin-top: var(--bbva-widget-smart-assistant-help-modal-success-panel-operation-margin-top, 1.59375rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess [data-tag-name=bbva-list-simple]:first-of-type {
  padding-top: var(--bbva-widget-smart-assistant-help-modal-success-list-simple-first-of-type-padding-top, 1.59375rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess [data-tag-name=bbva-button-default] {
  margin-top: var(--bbva-widget-smart-assistant-help-modal-success-button-default-margin-top, 2.75rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess [data-tag-name=bbva-divider] {
  margin-bottom: var(--bbva-widget-smart-assistant-help-modal-success-divider-margin-bottom, 1rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess .header-container {
  --bbva-panel-process-color: #FFF;
  --bbva-amount-color: #FFF;
  background-color: var(--bbva-widget-smart-assistant-help-modal-success-header-container-bg-color, var(--colorsTertiaryType6Dark));
}
[data-tag-name=bbva-help-modal]#modalSuccess .successTitle {
  color: var(--bbva-widget-smart-assistant-help-modal-success-success-title-color, #FFF);
  text-align: var(--bbva-widget-smart-assistant-help-modal-success-success-title-text-align, center);
  font-size: var(--bbva-widget-smart-assistant-help-modal-success-success-title-font-size, 1.25rem);
  font-style: var(--bbva-widget-smart-assistant-help-modal-success-success-title-font-style, normal);
  font-weight: var(--bbva-widget-smart-assistant-help-modal-success-success-title-font-weight, 500);
  line-height: var(--bbva-widget-smart-assistant-help-modal-success-success-title-line-height, 1.5rem);
  margin-top: var(--bbva-widget-smart-assistant-help-modal-success-success-title-margin-top, 0);
  padding-top: var(--bbva-widget-smart-assistant-help-modal-success-success-title-padding-top, 1.5rem);
  margin-bottom: var(--bbva-widget-smart-assistant-help-modal-success-success-title-margin-bottom, 0.5rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess .successDate {
  color: var(--bbva-widget-smart-assistant-help-modal-success-success-date-color, #FFF);
  text-align: var(--bbva-widget-smart-assistant-help-modal-success-success-date-text-align, center);
  font-size: var(--bbva-widget-smart-assistant-help-modal-success-success-date-font-size, 0.9375rem);
  font-style: var(--bbva-widget-smart-assistant-help-modal-success-success-date-font-style, italic);
  font-weight: var(--bbva-widget-smart-assistant-help-modal-success-success-date-font-weight, 500);
  line-height: var(--bbva-widget-smart-assistant-help-modal-success-success-date-line-height, 1.5rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess .withdrawalKey {
  color: var(--bbva-widget-smart-assistant-help-modal-success-withdrawal-key-color, #FFF);
}
[data-tag-name=bbva-help-modal]#modalSuccess .buttons-container {
  display: flex;
  justify-content: space-around;
}
[data-tag-name=bbva-help-modal]#modalSuccess .label-link {
  margin-bottom: var(--bbva-widget-smart-assistant-help-modal-success-label-link-margin-bottom, 0.0625rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess .wrapper {
  padding: var(--bbva-widget-smart-assistant-help-modal-success-wrapper-padding, 0.5rem 1rem 0.53125rem);
}
[data-tag-name=bbva-help-modal]#modalSuccess .wrap-description {
  color: var(--bbva-widget-smart-assistant-help-modal-success-wrap-description-color, #121212);
  margin: var(--bbva-widget-smart-assistant-help-modal-success-wrap-description-margin, auto);
}
[data-tag-name=bbva-help-modal]#modalSuccess .second-modal {
  --bbva-help-modal-padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) 0;
}

[data-tag-name=bbva-transition-container] .text-wrapper {
  color: var(--bbva-widget-smart-assistant-transition-container-text-wrapper-color, #121212);
}
[data-tag-name=bbva-transition-container] [data-tag-name=bbva-list-bullet] {
  padding: var(--bbva-widget-smart-assistant-transition-container-list-bullet-padding, 0.09375rem);
}
[data-tag-name=bbva-transition-container] .bullet-item {
  text-align: var(--bbva-widget-smart-assistant-transition-container-bullet-item-text-align, left);
}
[data-tag-name=bbva-transition-container] .bbva-text-bolded {
  text-align: var(--bbva-widget-smart-assistant-transition-container-bbva-text-bolded-text-align, left);
  font-weight: var(--bbva-widget-smart-assistant-transition-container-bbva-text-bolded-font-weight, 500);
}
[data-tag-name=bbva-transition-container] .bbva-list-bullet-item {
  text-align: var(--bbva-widget-smart-assistant-transition-container-bbva-list-bullet-item-text-align, left);
}
[data-tag-name=bbva-transition-container] .text-body {
  color: var(--bbva-widget-smart-assistant-transition-container-text-body-color, #121212);
}
[data-tag-name=bbva-transition-container] .second-modal {
  --bbva-help-modal-padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) 0;
}
[data-tag-name=bbva-transition-container] .second-modal [data-tag-name=bbva-button-default] {
  margin-top: var(--bbva-widget-smart-assistant-help-modal-success-button-default-margin-top, 2.75rem);
}

.container-fBinary [data-tag-name=bbva-link].link-fBinary {
  justify-content: left;
  padding: 0 calc(var(--bbva-global-spacer, 0.5rem) * 2);
  top: -20px;
}

[data-tag-name=bbva-notification-toast].fBinaryToast {
  margin-top: var(--bbva-header-main-min-height, 3rem);
  display: inline-block;
}
`;class Tt extends(l(R(h))){static get is(){return"bbva-widget-smart-assistant"}static get scopedElements(){return{"bbva-chat-bot":Pe,"bbva-chat-button":Ve,"bbva-chat-form":Se,"bbva-chat-text":$e,"bbva-clip-bot":ke,"bbva-divider":G,"bbva-expandable-accordion":Z,"bbva-list-card":Ce,"bbva-panel-offer":ee,"bbva-help-modal":te,"bbva-link":L,"bbva-panel-process":ae,"bbva-text":p,"bbva-panel-operation":Te,"bbva-list-simple":Xe,"bbva-notification-message":ie,"bbva-list-bullet":se,"bbva-button-row":re,"bbva-button-default":ne,"bbva-panel-code-number":tt,"bbva-dataprovider-qas":it,"bbva-global-customer-behavioral-events-api-dm":ut,"bbva-list-file":oe,"bbva-header-main":_t,"bbva-transition-container":ce,"bbva-form-rating":wt,"bbva-notification-toast":le}}static get properties(){return{_ameliaAttributes:{type:Object,hasChanged:Tt._compareObjects},_showOption:{type:Boolean},_mode:{type:String},_openModal:{type:Boolean},_reviewDataSuccess:{type:Object},_talking:{type:Boolean},_visibleElements:{type:Number},agentPhoneNumber:{type:String},isNativeIos:{type:Boolean},language:{type:String},localCurrency:{type:String},menuOptions:{type:Array},messages:{type:Array},navigation:{type:Object},optionsPanel:{type:Array},otpId:{type:String},showCallAdvisor:{type:Boolean},_showWritingElement:{type:Boolean},userInfo:{type:Object},native:{type:Boolean},requiredToken:{type:String},host:{type:String},apiVersionQas:{type:String},apiVersionCustomer:{type:String},serviceFaqs:{type:Object},serviceCustomer:{type:Object},qadomainId:{type:String},lastMessage:{type:String},_showFaqs:{type:Boolean},messagesFaqs:{type:Object},messageFeedback:{type:Object},_openModalSuccess:{type:Boolean},_pdfTitle:{type:String},_continueInConversation:{type:Boolean},_receiptData:{type:Object},_MoreInfoVisible:{type:Boolean,state:!0},secondModal:{type:Boolean},secondAlertModal:{type:Boolean},_saFaqsInbentaFlag:{type:Boolean},_activeMoreOptionsMode:{type:Boolean,reflect:!0,attribute:"more-options-mode"},_activeConversationalMode:{type:Boolean,reflect:!0,attribute:"conversational-mode"},_hideButtonWrapper:{type:Boolean,reflect:!0,attribute:"hide-button-wrapper"},_hideChatFormPaddingBottom:{type:Boolean,reflect:!0,attribute:"chat-form-padding-bottom"},_saBinaryFeedbackFlag:{type:Boolean},_saIreneFeedbackFlag:{type:Boolean},ratingId:{type:Number},customerId:{type:String},headers:{type:Object},opiBehavioralNegative:{type:String},showToast:{type:Boolean},_isExtendedSurvey:{type:Boolean},_activateSurveyIrene:{type:Boolean},appVersion:{type:String},platform:{type:String},surveySent:{type:Boolean},containerById:{type:String},_isIreneActive:{type:Boolean},_isBinarySurvey:{type:Boolean},timeSpinner:{type:Number},_ameliaInitialized:{type:Boolean},_showTimeOutError:{type:Boolean},_timeOutInitId:{type:Number},_ameliaText:{type:String},_mvFlag:{type:Boolean},ameliaReady:{type:Boolean}}}constructor(){super(),this._ameliaAttributes={},this._mode="Welcome",this._openModal=!1,this._talking=!1,this._visibleElements=3,this.agentPhoneNumber="",this.isNativeIos=!1,this.language="es-MX",this.localCurrency="MXN",this.menuOptions=[],this.messages=[],this.optionsPanel=[],this.showCallAdvisor=!1,this._showWritingElement=!1,this.userInfo={},this.serviceFaqs={},this.serviceCustomer={},this.apiVersionQas="0",this.qadomainId="7",this.lastMessage="",this._showFaqs=!1,this.messagesFaqs={success:" ",error:" "},this.messageFeedback={success:"callfeedback success",empty:"callfeedback empty",error:"callfeedback error"},this._pdfTitle="",this._openModalSuccess=!1,this._continueInConversation=!1,this._receiptData={},this._MoreInfoVisible=!1,this.secondModal=!1,this.secondAlertModal=!1,this._saBinaryFeedbackFlag=!1,this._saIreneFeedbackFlag=!1,this._saFaqsInbentaFlag=!1,this._showOption=!1,this._activeMoreOptionsMode=!1,this._activeConversationalMode=!1,this._hideButtonWrapper=!1,this._hideChatFormPaddingBottom=!1,this.ratingId=0,this.customerId="",this.headers={},this.apiVersionCustomer="1",this.opiBehavioralNegative="",this.showToast=!1,this._isExtendedSurvey=!1,this._isBinarySurvey=!1,this._activateSurveyIrene=!1,this._isIreneActive=!1,this.appVersion="",this.platform="android",this.surveySent=!1,this.containerById="",this.timeSpinner=1e4,this._ameliaText="",this._ameliaInitialized=!1,this._showTimeOutError=!1,this._timeOutInitId=0,this._mvFlag=!1,this.ameliaReady=!1}firstUpdated(e){super.firstUpdated(e),this.isNativeIos&&(this._hideChatFormPaddingBottom=!0),this.serviceFaqs=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-qas"]'),this.serviceCustomer=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-behavioral-events-api-dm"]');new ResizeObserver((e=>{e.forEach((e=>{e.contentRect.height&&this.style.setProperty("--bbva-widget-smart-assistant-footer-height",`${e.contentRect.height}px`)}))})).observe(this._chatFooter);this._intersectionObserver=new IntersectionObserver((e=>{e[0].intersectionRatio>=1&&this._visibleElements<this.menuOptions.length&&!this.optionsPanel.find((e=>"more-options"===e.tag))&&(this.optionsPanel=[...this.optionsPanel,{tag:"more-options"}])}),{threshold:1})}updated(e){super.updated(e),e.has("_showOption")&&this.messages.length&&this._inputText.focus()}update(e){if(super.update(e),e.has("menuOptions")&&this.updateComplete.then((()=>{this._menuOptions&&this._menuOptions.lastElementChild&&this._intersectionObserver.observe(this._menuOptions.lastElementChild)})),(e.has("messages")||e.has("optionsPanel")&&this.optionsPanel.length)&&this.updateComplete.then((()=>{requestAnimationFrame((()=>{setTimeout((()=>{this._scrollable.scrollTo(0,this._scrollable.scrollHeight)}))}))})),e.has("_ameliaAttributes")&&Object.values(this._ameliaAttributes).length&&Object.values(this._ameliaAttributes).some((e=>!e))){const e="smart_assistant",t=JSON.stringify(this._ameliaAttributes);this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-set-in-local-storage",{bubbles:!0,composed:!0,detail:{key:e,value:t}})),this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-update-flags",{bubbles:!0,composed:!0,detail:this._ameliaAttributes}))}}static get options(){return[{name:"Saldo",tag:"balance",microillustration:"dollarlarge"},{name:"Retiro sin tarjeta",tag:"cardless-withdrawal",microillustration:"withdrawmoneycontactless"},{name:"Transferir",tag:"transfer",microillustration:"transfer"},{name:"Gastos",tag:"expenses",microillustration:"expenses"},{name:"Movimientos",tag:"transactions",microillustration:"movemoney"},{name:"Detalle de Cuenta",tag:"account-details",microillustration:"info"},{name:"Estado de Cuenta",tag:"account-statement",microillustration:"officialdocument"},{name:"Encender tarjeta",tag:"activate-card",microillustration:"devicecheck"},{name:"Apagar tarjeta",tag:"deactivate-card",microillustration:"deviceerror"},{name:"Llamar a un asesor",tag:"call-advisor",microillustration:"phoneassistance"}]}get _chatFooter(){return this._chatFooterQS||(this._chatFooterQS=this.shadowRoot.querySelector(".chat-footer")),this._chatFooterQS}get _chatForm(){return this._chatFormQS||(this._chatFormQS=this.shadowRoot.querySelector('[data-tag-name="bbva-chat-form"]')),this._chatFormQS}static _compareObjects(e={},t={}){let a=!1;const i=Object.keys(e),s=Object.keys(t);if(i.length!==s.length)a=!0;else for(const s of i)if(e[s]!==t[s]){a=!0;break}return a}get _input(){return this._chatForm&&this._chatForm.message}set _input(e){this._chatForm&&(this._chatForm.message=e)}get _inputText(){return this._inputTextQS||(this._inputTextQS=this._chatForm.shadowRoot.querySelector("textarea")),this._inputTextQS}get _menuOptions(){return this._menuOptionsQS||(this._menuOptionsQS=this.shadowRoot.querySelector(".menu-options")),this._menuOptionsQS}get _scrollable(){return this._scrollableQS||(this._scrollableQS=this.shadowRoot.querySelector(".scrollable")),this._scrollableQS}static get _statusCard(){return{OPERATIVE:e=>"PDT.ENTREG"===e?"activate":"operative",BLOCKED:e=>{if(e){if("SOBREGIRO"===e||"PAG.VENC"===e||"SOB.PAG.VE"===e||"PAG.VENCIDOS"===e||"SOB.PAG.VENCIDO"===e)return"exceeded";if("VENCIDA"===e)return"expired"}return"locked"},INOPERATIVE:e=>"VENCIDA"===e?"expired":"activate",PENDING_DELIVERY:()=>"activate",CANCELED:e=>"PDT.ENTREG"===e?"activate":"off",PENDING_EMBOSSING:e=>"PDT.ENTREG"===e?"activate":"PDT.REMESA"!==e?"locked":"",OFF:()=>"off"}}_deactivateLastMessage(){const e=this.messages.find((e=>e.active)),t=this.messages.find((e=>e.listContainerActive));e&&(e.active=!1),t&&(t.listContainerActive=!1)}static _getStatusCard(e){let t="";if(e.status){const a=Tt,{statusDescription:i}=e,s="OPERATIVE"===e.status.toUpperCase()&&(e.isOn?e.status.toUpperCase():"OFF"),r=a._statusCard[s],n=r&&r(i),o=a._statusInfo[n];t=o&&o()||""}return t}_handleInput(e){"Enter"===e.key&&(this._sendMessage({text:this._input,focus:!0}),this._setConversationalMode(),this._input="")}static _isDigital(e){return e.attribute.includes("digital")}static _parseAccountsOptionsFromReceivedMessage(e){return{AccountList:e.map((e=>{const[t="",a,i,s="",r="",n=""]=e.name&&e.name.trim().split(/\s*•\s*/);return{alias:t,number:a,amount:Number(i),currency:s,status:r,statusDescription:n}}))}}static _parseErrorFromReceivedMessage({message:e,linkText:t}){return{error:{message:e,linkText:t}}}static _parseSuccessMessageFromReceivedMessage(e){return{Success:{titleMessage:Object.prototype.hasOwnProperty.call(e,"payload")?e.payload.status:e.status,description:e.message,textLink:e.textLink,reviewData:e.payload.reviewData,shareData:e.payload.shareData}}}static _parseFaqsInbentaFromReceivedMessage(e){return{listExpandableAccordion:e.faqs.map((e=>({idFaqInbenta:(null==e?void 0:e.id)||"",title:null==e?void 0:e.title,container:null==e?void 0:e.answer,className:"container-faqs",classContainer:"collapse-content",variant:"accordion",divider:"full"})))}}static _parseContactCardsFromReceivedMessage(e){return{ListContacts:null!=e&&e.payload?e.payload.filter((e=>"Nuevo Contacto"!==e.name&&"Ver todos"!==e.name)):e}}static _parseGlobalProductsFromReceivedMessage({payload:e,isNativeIos:t}){return{listExpandableAccordion:e.map((e=>{var a;return{title:null==e?void 0:e.name,totalBalance:null==e?void 0:e.totalBalance,container:t?null==e?void 0:e.data:null==e||null===(a=e.data)||void 0===a?void 0:a.values.map((e=>null==e?void 0:e.nameValuePairs)),className:"balancess-list card divider-list",variant:"accordion"}}))}}static _parseAccountListFromReceivedMessage({payload:e}){return{ListFile:e}}static _parseTransactionListFromReceivedMessage({payload:e}){const t=new Set;return{listExpenses:e.map((e=>{const a=new Date(e.transactionDate).toLocaleDateString("es-MX",{day:"2-digit",month:"long",year:"numeric"}).replace(/de/g,"");return t.has(a)?{type:e.transactionType,amount:e.transactionAmount,title:e.transactionName.trim(),dateTransac:null,state:e.transactionStatus}:(t.add(a),{type:e.transactionType,amount:e.transactionAmount,title:e.transactionName.trim(),dateTransac:a,state:e.transactionStatus})}))}}static _parseFBinaryFromReceivedMessage(e){return{messageBinary:e}}static _parseCardsOptionsFromReceivedMessage(e){const t=e.map((e=>{const[t="",a,i,s="",r="",n="",o,c="",l=""]=e.name&&e.name.trim().split(/\s*•\s*/);return{alias:t,number:a,amount:Number(i),currency:s,image:r,attribute:n,isOn:o&&JSON.parse(o),status:c,statusDescription:l}})),a=Tt,i=t.filter((e=>!a._isDigital(e)));return{cardList:t.filter((e=>!a._isDigital(e)||!i.find((t=>t.alias===e.alias)))).map((e=>({...e,cardStatus:a._getStatusCard(e),subCards:a._isDigital(e)?[]:t.filter((t=>t.alias===e.alias&&a._isDigital(t))).map((e=>({alias:e.alias,numProduct:e.number,cardImage:e.image,cardStatus:a._getStatusCard(e),visibleChars:4,showCard:e.image.length,subcategory:!0})))})))}}static _parseJSON(e){const t=JSON.parse(e);return"string"==typeof t?Tt._parseJSON(t):t}_removeOption(e){this.optionsPanel=this.optionsPanel.filter((t=>t.tag!==e))}_showOptions(e){this.optionsPanel=e.map((e=>({value:e.name})))}static get _statusInfo(){return{locked:()=>"blocked",exceeded(){return this.locked()},expired(){return this.locked()},off:()=>"off",pending:()=>"activate"}}_getAnalyticViewModule(e){const t=e.name||"",a={cardsOptions:"tarjetas",AccountsOptions:"cuentas"};a[t]&&this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-analytic-view-module",{bubbles:!0,composed:!0,detail:{pageView:a[t]}}))}_receiveMessage(e){if(this._showWritingElement=!1,e){const t=e.name&&e.name.replace(/^./,(e=>e.toUpperCase())),a=Tt[`_parse${t}FromReceivedMessage`];a||this._deactivateLastMessage(),this._getAnalyticViewModule(e);const i=Tt;this.messages=[...this.messages,{...e.messageText&&{text:e.messageText.replace(/<(.*?)>/g,"$1").replace(/\[\$com\]/g,"'").replace(/([A-Za-z0-9 ]{1,20}) • ([0-9]{16})/,((e,t,a)=>`${t} •${a.slice(-4)}`))},...i._validateParseMessage(a,e),received:!0,active:!a,listContainerActive:!!["AccountsOptions","CardsOptions"].includes(t)&&!!a,animation:"transition"}]}}static _validateParseMessage(e,t){return e&&t?e(null!=t&&t.options?t.options:t):{}}_renderOpeningGreeting(){return g`
      <bbva-panel-offer
        id="welcomeInfo"
        class="welcome-info-container"
        content-title="${this.t("bbva-widget-smart-assistant-msg-welcome-title",{firstName:this.userInfo.firstName})}"
      >
        <bbva-clip-bot slot="microillustration" size="medium" class="clip-bot-container"></bbva-clip-bot>
        <p class="welcome-text">${this.t("bbva-widget-smart-assistant-msg-welcome-text")}</p>
      </bbva-panel-offer>
    `}_renderMoreOptionsMode(){return this._visibleElements=this.menuOptions.length,this._activeMoreOptionsMode=!0,this._toggleMode(),this._removeOption("more-options"),g`
      ${this._showOption?this._renderMenuList(this.menuOptions,this._visibleElements):""}
    `}_renderConversationalMode(){return g`
      <div class="messages">
        ${this.messages.map((e=>e.received?this._renderIncomingMessage(e):Tt._renderOutgoingMessage(e)))}

        ${this._renderWritingContainer()}
      </div>
    `}_renderIncomingMessage(e){return g`
        ${e.text&&g`
          <bbva-chat-bot
            class="${e.animation}"
            description="${e.text}"
            clipbot="${e.active?"active":""}">
          </bbva-chat-bot>`}

        ${e.listExpandableAccordion&&e.listExpandableAccordion.map((t=>g`
          <bbva-expandable-accordion
            row-title=${(null==t?void 0:t.title)||""}
            amount=${(null==t?void 0:t.totalBalance)||""}
            divider="${(null==t?void 0:t.divider)||""}"
            class="${(null==t?void 0:t.className)||""} ${e.animation}"
            currency-code="${this.localCurrency}"
            local-currency="${this.localCurrency}"
            language="${this.language}"
            variant="${(null==t?void 0:t.variant)||""}"
          >
            <div class="${(null==t?void 0:t.classContainer)||""}">
              ${"object"==typeof(null==t?void 0:t.container)?null==t?void 0:t.container.map((e=>g`
                  <bbva-list-card
                    no-link
                    class="box-look"
                    currency-code="${this.localCurrency}"
                    local-currency="${this.localCurrency}"
                    language="${this.language}"
                    accessibility-text="${null==e?void 0:e.AccesibilityText}"
                    amount="${null==e?void 0:e.balance}"
                    card-title=${null==e?void 0:e.label}
                    content-text="${null!=e&&e.image?this.t("bbva-widget-smart-assistant-card-list-description-credit-card"):this.t("bbva-widget-smart-assistant-card-list-description")}"
                    num-product="${null==e?void 0:e.number}"
                    card-image="${null!=e&&e.image?e.image:""}"
                    divider="full"
                  ></bbva-list-card>
                  <bbva-divider size="fit"></bbva-divider>
                `)):de(t.container)}
                    </div>
                  </bbva-expandable-accordion>
                  `))}

        ${e.cardList?g`
          <section class="list-container card-list-container ${e.animation}" ?list-container-active="${e.listContainerActive}">
          ${e.cardList&&e.cardList.map((t=>g`
            <bbva-list-card
              class="${e.animation}"
              accessibility-text="${`${t.alias} • ${t.number.slice(-4)}`}"
              card-title="${Tt._isDigital(t)?this.t("bbva-widget-smart-assistant-card-list-alias-digital-card-text",{alias:t.alias}):t.alias}"
              .alias="${t.alias}"
              amount="${t.amount}"
              local-currency="${this.localCurrency}"
              currency-code="${t.currency}"
              language="${this.language}"
              num-product="${t.number}"
              content-text="${null!=t&&t.image?this.t("bbva-widget-smart-assistant-card-list-description-credit-card"):this.t("bbva-widget-smart-assistant-card-list-description")}"
              card-image="${t.image}"
              card-status="${t.cardStatus}"
              visible-chars="4"
              ?show-card="${t.image.length}"
              .subCards=${t.subCards.map((e=>({...e,cardTitle:this.t("bbva-widget-smart-assistant-card-list-alias-digital-card-text",{alias:e.alias})})))}
              @list-card-item-click="${e=>{const t=e.target,{alias:a,numProduct:i}=t;this._sendMessage({text:`${a} • ${i.slice(-4)}`,value:i})}}"
              @list-card-item-subcard-click="${e=>{const t=e.target,a=e.detail,{alias:i,numProduct:s}=t.subCards[a];this._sendMessage({text:`${i} • ${s.slice(-4)}`,value:s})}}">
            </bbva-list-card>
          `))}
          </section>`:""}

        ${e.AccountList?g`
        <section class="list-container account-list-container ${e.animation}" ?list-container-active="${e.listContainerActive}">
          ${e.AccountList.map((t=>g`
            <bbva-list-card
              class="${e.animation}"
              card-title="${t.alias}"
              accessibility-text="${`${t.alias} • ${t.number.slice(-4)}`}"
              .alias="${t.alias}"
              amount="${t.amount}"
              local-currency="${this.localCurrency}"
              currency-code="${t.currency}"
              language="${this.language}"
              num-product="${t.number}"
              content-text="${this.t("bbva-widget-smart-assistant-card-list-description")}"
              visible-chars="4"
              @list-card-item-click="${e=>{const t=e.target,{alias:a,numProduct:i}=t;this._sendMessage({text:`${a} • ${i.slice(-4)}`,value:i})}}">
            </bbva-list-card>
          `))}
        </section>
        `:""}

        ${e.Success&&g`
          <bbva-panel-offer
            class="${e.animation}"
            content-title=${e.Success.titleMessage}
            microillustration="success">
              <p>${e.Success.description}</p>
          </bbva-panel-offer>
          <bbva-link
            class="${e.animation}"
            @click="${()=>{this._reviewDataSuccess=e.Success.reviewData,this._receiptData=e.Success.shareData,this._openModalSuccess=!0}}"
          >
            ${e.Success.textLink}
          </bbva-link>`}

      ${e.ListContacts?g`
        <section class="list-container contact-list-container ${e.animation}">
        ${e.ListContacts.map((e=>g`
          <div
            class="container"
            @keydown="${()=>{this._sendMessage({text:null!=e&&e.alias?e.alias:`${null==e?void 0:e.value} • ${null==e?void 0:e.name}`})}}"
            @click="${()=>{this._sendMessage({text:null!=e&&e.alias?e.alias:`${null==e?void 0:e.value} • ${null==e?void 0:e.name}`})}}"
          >
            <bbva-text inherit variant="spotlight" text="${(null==e?void 0:e.alias)||(null==e?void 0:e.value)}"></bbva-text>
            <bbva-text inherit text-color="#666666" text="${null==e?void 0:e.name}"></bbva-text>
          </div>
          <bbva-divider size="fit"></bbva-divider>
        `))}
        </section>`:""}

      ${e.listExpenses?g`
        <section class="list-container expenses-list-container ${e.animation}">
        ${e.listExpenses&&e.listExpenses.map((e=>g`
          ${null!==e.dateTransac?g`
          <p class="list-date-title">
            ${e.dateTransac}
          </p>`:""}
          <bbva-list-card
            card-title="${e.title}"
            amount="${e.amount}"
            local-currency="${this.localCurrency}"
            currency-code="${this.localCurrency}"
            language="${this.language}"
            description="${e.state}">
          </bbva-list-card>
          `))}
        </section>`:""}

      ${e.ListFile&&e.ListFile.map((t=>g`
        <bbva-list-file
          class="${e.animation}"
          icon="${he()}"
          file-name="${t.text}"
          file-size="${t.subText}"
          @list-file-link-click="${()=>{this._openDocument(null==t?void 0:t.base64)}}"
        ></bbva-list-file>
        `))}

      ${e.error&&this._renderNotificationError}
      
        ${e.messageBinary&&g`
            <div class="${e.animation} container-fBinary">
              <bbva-form-rating
                  id="formRating${e.messageBinary.data.idfeed}"
                  thumbs
                  inline=""
                  text=""
                  content-title=${e.messageBinary.data.quest}
                  @form-rating-value-change="${t=>{const a={event:t,typeOperative:e.messageBinary.data.tipeOp,typology:e.messageBinary.data.typology,operativeBPN:e.messageBinary.data.operativeBPN,conversationId:e.messageBinary.data.conversationId};this._handleRatingClick(a)}}"
                  class="${e.animation} fBinary"
                >
                </bbva-form-rating>
                <bbva-link hidden id="bbvaLink${e.messageBinary.data.idfeed}" class="link-fBinary" @click="${this._openExtendedSurvey}">Enviar comentarios</bbva-link>
            </div>
        `}
    `}_countRaiting(){return this.ratingId+=1,this.ratingId}_handleRatingClick(e){const{event:t,typeOperative:a,typology:i,operativeBPN:s,conversationId:r}=e;this.opiBehavioralNegative=Tt._getTypeOperative(a),this._activeFeedbackBinary(t,i,s,r)}static _getTypeOperative(e){return"operative"===e?"GM_BLUE_NEG_OPERATIVA_SUCCESS":"GM_BLUE_NEG_INFORMATIVA_SUCCESS"}_setConversationHeaders(e){this.serviceCustomer.headers={"accept-language":"es",ContactId:this.customerId,"vnd.bbva.device.app-name":e,"vnd.bbva.device.app-version":this.appVersion,"vnd.bbva.device.dpi":"xhdpi","vnd.bbva.device-os-name":this.platform}}_activeFeedbackBinary(e,t,a,i){const{detail:s}=e,r=e.target.id,n=r.match(/\d/g).join(""),o=this.shadowRoot.getElementById(`bbvaLink${n}`);this._isBinarySurvey=!0;let c="";1===s?(c=`negative|${i}|${a}|${t}|${this.customerId}`,this._setConversationHeaders(c),this._disabledNegativeFeedback(r),this._callServiceFeedback(),o.hidden=1!==s):(c=`positive|${i}|${a}|${t}|${this.customerId}`,this._setConversationHeaders(c),Tt._disabledFeedbackContainer(o),this._callServiceFeedback("positive"))}_activeFeedIrene(e){this._activateSurveyIrene=!0,this._continueInConversation=!0;const t=`IRENE|${e.data.conversationId}|${this.customerId}`;this._setConversationHeaders(t);const a=Tt._getBehavioralType("GM_BLUE_Feedback_IReNe_SUCCESS");this.requestUpdate(),this._callBehavioralService(a)}_disabledNegativeFeedback(e){this.shadowRoot.getElementById(e).shadowRoot.getElementById("thumb-container").style.pointerEvents="none"}static _disabledFeedbackContainer(e){const t=e.parentNode;t.style.opacity=.4,t.style.pointerEvents="none"}_callServiceFeedback(e="negative"){const t=Tt._getBehavioralType("GM_BLUE_MANITAS_SUCCESS");this.requestUpdate(),this._callBehavioralService(t),"positive"===e&&(this.showToast=!0),this._resetToast()}_resetToast(){setTimeout((()=>{this.showToast=!1}),3e3)}_callBehavioralService(e){this.serviceCustomer.postCustomerBehavioralEvents(this.customerId,e)}_openExtendedSurvey(e){this._isExtendedSurvey=!0,this._continueInConversation=!0,this.containerById=this.shadowRoot.getElementById(e.target.id);const t=Tt._getBehavioralType(this.opiBehavioralNegative);this.requestUpdate(),this._callBehavioralService(t)}static _getBehavioralType(e){return{behavioralType:{id:e}}}_getGlobalCustomerApiDm(){return g`<bbva-global-customer-behavioral-events-api-dm
      id="customerApiDm"
      .host="${this.host}"
      ?native="${this.native}"
      .version="${this.apiVersionCustomer}"
      .requiredToken="${this.requiredToken}"
      @customer-behavioral-events-api-dm-create="${this._opinatorSuccess}"
    >
    </bbva-global-customer-behavioral-events-api-dm>`}static async _sendOpinatorData(e){try{await fetch(e,{method:"POST",mode:"no-cors",headers:{"Content-Type":"application/json"}})}catch(e){throw new Error("err")}}_opinatorSuccess(e){const t=e.detail.forms[0];this._isBinarySurvey?(this._isBinarySurvey=!1,Tt._sendOpinatorData(t.links[0].href)):this._isExtendedSurvey?(this._isExtendedSurvey=!1,this._fire("set-iframe-src",t.links[0].href)):this._activateSurveyIrene&&"PUSH"===t.formType&&(this._isIreneActive=!0,this._activateSurveyIrene=!1,this._fire("set-iframe-src",t.links[0].href))}notificationToast(){return g`
      <bbva-notification-toast class="fBinaryToast" ?show="${this.showToast}" auto-hide duration="3000" type="success" icon-explainer="${be()}">
        <p>Opinión registrada.</p>
        <p>Gracias a ti mejoramos a Blue.</p>
      </bbva-notification-toast>`}_openDocument(e){this._fire("bbva-widget-smart-assistant-open-document",{value:e.replace(/(\r\n|\n|\r)/gm,""),title:this._pdfTitle,mimeType:"application/pdf",headerColor:"FFFFFFFF",tintColor:"FF072146",canShare:!0,titleColor:"FF072146",blackStatusBar:!0})}setEmail(e){this.userEmail=e.replace(/\*+/g,"•")}_setReviewDataCardless(e){return this._receiptData={date:e.withdrawalDate,chargeAmount:{amount:e.amount.replace("[MXN]",""),currency:"MXN"},amountDescription:"glomo-cardless-withdrawal-review-dm-no-fees",codes:[{split:[e.passcode.substring(0,4),e.passcode.substring(4,8),e.passcode.substring(8,12)]},{split:[e.securityCode]}],expirationDate:{date:e.codeExpires},templateSelected:"cardlessWithdrawalReceipt"},{additionalInformation:[{label:"Concepto",description:"Retiro sin tarjeta"!==e.description?e.description:"Sin Concepto"},{label:"Tipo de operación",description:this.t("bbva-widget-smart-assistant-menu-cardless-withdrawal-option")},{label:"Folio",description:null==e?void 0:e.operationNumber},{label:"",description:this.t("bbva-widget-smart-assistant-bank-name")}],buttons:[{icon:pe(),label:"Cajeros cercanos",id:"button-1"},{icon:me(),label:"Compartir clave",id:"button-1"}],infoMessage:this.t("glomo-cardless-withdrawal-review-dm-icon-message"),amount:e.amount,originAccount:e.srcAccNum,clue:e.passcode,code:e.securityCode,accountName:e.srcAccName,commission:this.t("glomo-cardless-withdrawal-review-dm-no-fees"),dateOperation:new Date(e.withdrawalDate).toLocaleDateString("es-MX",{day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit",second:"2-digit"}).replace(/de/g,""),expired:new Date(e.codeExpires).toLocaleString("es-MX",{weekday:"long",day:"2-digit",month:"long",year:"numeric"}).replace(/(de)|(,)/g,""),transferType:"cardless",exitButton:this.t("glomo-transfer-generate-own-transfer-response-buttons-text")}}_shareReview(e){this._fire("bbva-widget-smart-assistant-result-receipt",e)}_setReviewDataTransfer(e){const t=(new Date).toLocaleDateString("es-MX",{day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit",second:"2-digit"}).replace(/de/g,""),a=()=>{const t=[{label:"Concepto",description:e.description},{label:"Referencia",description:e.reference},{label:"Tipo de operación",description:this.t("bbva-widget-smart-assistant-transfer-type-interbank")},{label:"Folio de operación",description:e.operationNumber},{label:"Clave de rastreo",description:e.trackingNumber}],a=e=>t.indexOf(t.find((t=>t.label===e)));return null!=e&&e.description||t.splice(a("Concepto"),1),"interbancaria"!==e.typeOperation&&(t.splice(a("Referencia"),1),t.splice(a("Clave de rastreo"),1)),"interna"===e.typeOperation&&(t.find((e=>"Tipo de operación"===e.label)).description=this.t("bbva-widget-smart-assistant-transfer-type-internal")),"propia"===e.typeOperation&&(t.find((e=>"Tipo de operación"===e.label)).description=this.t("bbva-widget-smart-assistant-transfer-type-own")),t},i=t=>16===e[`${t}AccNum`].length?"creditcard":"account";return this._fire("bbva-widget-smart-assistant-set-shared-receipt-styles",{receiptTitle:{color:"var(--bbva-core-blue, #004481)"},sectionTitle:{color:"var(--bbva-core-blue, #004481)"},info:{padding:"0px","margin-top":"2px","background-color":"none"},infoIcon:{display:"none"},infoMessage:{"font-weight":"100",margin:"0px","font-size":"var(--cells-text-size-12, 12px)","text-align":"left","background-color":"none",color:"var(--bbva-500, #666666)"}}),this._receiptData={date:t,chargeAmount:"",operationType:a().find((e=>"Tipo de operación"===e.label)).description,folioNumber:e.operationNumber,concept:e.description,localAmount:{amount:e.amount.replace("[MXN]",""),currency:this.localCurrency},fees:[{text:"Comisión",amount:e.fees,currency:this.localCurrency}],originAccount:e.srcAccNum,beneficiary:{name:e.destAccName,bank:e.bankReceiver,number:e.destAccNum},description:this.t("bbva-widget-smart-assistant-bank-description-transfer"),templateSelected:"genericTransferDetail"+("interbancaria"===e.typeOperation?"Interbank":"")},"interbancaria"===e.typeOperation&&Object.assign(this._receiptData,{trackingCode:e.trackingNumber,urlBbva:"www.bbva.com",urlBanxico:"https://www.banxico.org.mx/cep/"}),{additionalInformation:[...a()],buttons:[{icon:me(),label:"Compartir",id:"button-1"}],infoMessage:this.t("bbva-widget-smart-assistant-review-info-message",{email:`<br>${this.userEmail}`}),srcAvatar:i("src"),destAvatar:i("dest"),amount:e.amount,addressee:e.destAccName,addresseeNum:e.destAccNum,originAccount:e.srcAccNum,bank:e.bankReceiver,accountName:e.srcAccName,commission:"Comisión: "+(e.fees.match(/\d+\.\d{2}/)?`$${e.fees.match(/\d+\.\d{2}/)}`:"$0.00"),typeOperation:e.typeOperation,transferType:"transfer",dateOperation:t,exitButton:this.t("glomo-transfer-generate-own-transfer-response-buttons-text")}}_setExtraHeaderClass(e="header--evening"){this._fire("bbva-widget-smart-assistant-set-extraHeader-class",e)}_exitModalSuccess(){this._reviewDataSuccess={},this._receiptData={},this._openModalSuccess=!1,this._setExtraHeaderClass(),this._fire("bbva-widget-smart-assistant-reset-receipt",!0)}_moreSpeiVisibleChanged(e){this._MoreInfoVisible=e.detail}get errorExitModal(){return g`
      <bbva-help-modal
        id="moreOptionsModal"
        icon-right-primary="${ge()}"
        ?visible="${this._openModal}"
        @help-modal-close="${()=>{this._openModal=!this._openModal}}"
        full-height
        header-type="modal"
        hide-content-padding-top
        header-text="bbva-widget-smart-assistant-more-options"
      >
        <div slot="slot-content">
          ${this._showOption?this._renderMenuList(this.menuOptions,this.menuOptions.length):""}
        </div>
      </bbva-help-modal>
    `}get _renderNotificationError(){return g`
      <bbva-notification-message
        class="info-error transition"
        variant="error"
        link-title="${this.t("bbva-widget-smart-assistant-close")}"
        @notification-message-link-click="${()=>{this._goBack()}}">
        ${this.t("bbva-widget-smart-assistant-error-notification-message")}
      </bbva-notification-message>
      `}_renderModalSuccess(e,t){const a=e;this._shareReview(t),this._setExtraHeaderClass("light-green-bg");return g`
      <bbva-help-modal
        ?visible=${this._openModalSuccess}
        @help-modal-close="${()=>{this._exitModalSuccess()}}"
        full-height
        header-type="modal"
        hide-content-padding-top
        header-text=${"cardless"===a.transferType?"Retiro sin tarjeta":"Transferir"}
        id="modalSuccess"
      >
        <div slot="slot-content">

        <bbva-help-modal
            class="second-modal"
            ?visible="${this.secondModal}"
            header-type="modal-three-level"
            hide-content-padding-top
            modal-type="help"
            removable-padding="true"
            title-icon="${ue()}"
            title-text="Estatus de la operación"
            body-text="${this.t("bbva-widget-smart-assistant-transfer-link-spei")}"
            button-text="Entendido"
            @help-modal-close="${e=>{e.stopPropagation(),this.secondModal=!1}}"
          >
          </bbva-help-modal>
          <div class="header-container">
            <p class="successTitle">
              ${"cardless"===a.transferType?"Retiro disponible":"Operación exitosa"}
            </p>

            <p class="successDate">${a.dateOperation} h</p>

            <bbva-panel-process
              text=${"cardless"===a.transferType?"Importe a retirar":"Importe transferido"}
              amount="${a.amount.replace("[MXN]","")}"
              language="es-MX"
              local="MXN"
              currency-code="$"
              description=${a.commission}
              description-book
              secondary-description-book
            ></bbva-panel-process>

            ${"cardless"===a.transferType?g`<bbva-divider
                    id="cardless"
                    size="small center"
                  ></bbva-divider>

                  <p class="withdrawalKey">
                    ${this.t("glomo-cardless-withdrawal-review-dm-twelve-digits")}
                  </p>

                  <bbva-panel-code-number
                    class="code"
                    code="${a.clue}"
                    group-by="4"
                  ></bbva-panel-code-number>

                  <p class="withdrawalKey">
                    ${this.t("glomo-cardless-withdrawal-review-dm-four-digits")}
                  </p>

                  <bbva-panel-code-number
                    class="code"
                    code="${a.code}"
                    group-by="4"
                  ></bbva-panel-code-number>

                  <p class="withdrawalKey">Fecha de vencimiento:</p>

                  <p class="successDate">
                    ${a.expired.length?a.expired[0].toUpperCase()+a.expired.slice(1):""}
                  </p>

                  <br />`:""}
            ${"cardless"!==a.transferType?g`<bbva-panel-operation
                  clip-item="${a.srcAvatar}"
                  clip-item-right="${a.destAvatar}"
                  clip-user-text-right="${(i="addresseeNum",20!==a[i].length&&16!==a[i].length||"propia"!==a.typeOperation)?a.addressee:""}"
                  label-left="${a.accountName}"
                  label-right="${a.addressee}"
                >
                  <span slot="left">•${a.originAccount.slice(-4)}</span>
                  <span slot="right">
                    ${"interbancaria"===a.typeOperation?a.bank:"Cuenta BBVA"}
                  </span>
                </bbva-panel-operation>`:""}
          </div>

          ${"cardless"===a.transferType?g`<div class="wrapper">
                <p class="label-">Cuenta de origen</p>
                <p class="wrap-description">${a.accountName}</p>
                <p class="wrap-description">•${a.originAccount.slice(-4)}</p>
              </div>`:""}
          ${a.additionalInformation.map((e=>g` <bbva-list-simple
              variant="stacked-center"
              label="${e.label}"
              description="${e.description}"
            ></bbva-list-simple>`))}
          ${"interbancaria"===a.typeOperation?g`<div class="wrapper">
                  <p class="label-link">
                    Verifica el estatus de tu transferencia
                  </p>
                  <bbva-link
                  @click="${()=>{this.secondModal=!0}}"
                  >
                    www.banxico.org.mx/cep
                  </bbva-link>
                </div>

                <div class="wrapper">
                  ${this.t("bbva-widget-smart-assistant-review-info-message",{email:g`<br />
                      <p class="wrap-description">${this.userEmail}</p>`})}
                </div>`:""}
          ${"interbancaria"===a.typeOperation?g`<bbva-notification-message
                  message="${this.t("bbva-widget-smart-assistant-review-info-message-legal")}"
                ></bbva-notification-message>

                <bbva-notification-message
                  message="${this.t("bbva-widget-smart-assistant-review-info-message-spei")}"
                  link-title="Más información"
                  @notification-message-link-click="${()=>{this._MoreInfoVisible=!0}}"
                ></bbva-notification-message>`:g`<bbva-notification-message
                message="${a.infoMessage}"
              ></bbva-notification-message>`}

          <bbva-button-row
            disabled-tabindex=""
            accessibility-text="Available sections"
            .options="${a.buttons}"
            @button-row-item-click="${({detail:e})=>{let t="";"cardless"===a.transferType?t=0===e?"navigate-atms":"share-receipt":"transfer"===a.transferType&&(t="share-receipt"),"navigate-atms"===t&&(this._continueInConversation=!0),this._fire(`bbva-widget-smart-assistant-${t}`,{})}}"
          ></bbva-button-row>

          <bbva-button-default
            text=${"cardless"===a.transferType?"Cerrar":"Salir"}
            @click="${()=>{this._exitModalSuccess()}}"
          ></bbva-button-default>
        </div>

        ${this._MoreInfoVisible?this._renderMoreInfoSpei:""}
      </bbva-help-modal>
    `;var i}_openExternalLink(e){this._fire("bbva-widget-smart-assistant-link-uri",{scheme:e,packageId:null})}static _renderOutgoingMessage(e){return g`
      <bbva-chat-text ?active="${e.active}">${e.text}</bbva-chat-text>
    `}_renderWritingContainer(){return this._showWritingElement?g`
      <div class="writing-container">
        <bbva-clip-bot variant="writing" size="small"></bbva-clip-bot>
      </div>
    `:""}_renderWelcomeMode(){return g`
      ${this._showOption?this._renderMenuList(this.menuOptions,this._visibleElements):""}
      ${!this._ameliaInitialized&&this._showTimeOutError&&0===this.messages.length?this._renderNotificationError:""}
    `}_renderMenuList(e,t){return g`
      <div class="menu-options">
        ${e.filter(((e,a)=>a+1<=t)).map((e=>g`
            <div
              class="content-clip"
              role="button"
              disabled-tabindex
              aria-disabled="false"
              aria-label="${e.tag?this.t(`bbva-widget-smart-assistant-menu-${e.tag}-option`):e.name}"
              tabindex="0"
              @keydown="${this._onListClipLinkClick(e)}"
              @click="${this._onListClipLinkClick(e)}"
            >
              <div
                class="image"
                role="presentation"
                disabled-tabindex
                aria-hidden="true"
              >
                <span>
                  ${ve[e.microillustration]}
                </span>
              </div>

              <div
                class="main-content heading-link"
                role="heading"
                disabled-tabindex
                aria-level="3"
              >
                <p class="text lines">
                  ${e.tag?this.t(`bbva-widget-smart-assistant-menu-${e.tag}-option`):e.name}
                </p>
              </div>
            </div>
          `))}
      </div>
    `}get _renderMoreInfoSpei(){this._setExtraHeaderClass();const e=[{description:this.t("bbva-widget-smart-assistant-requirement-bullet")},{description:this.t("bbva-widget-smart-assistant-requirement-bullet-2")},{description:this.t("bbva-widget-smart-assistant-requirement-bullet-3")},{description:this.t("bbva-widget-smart-assistant-requirement-bullet-4")},{description:this.t("bbva-widget-smart-assistant-requirement-bullet-5")}],t=[{description:this.t("bbva-widget-smart-assistant-info-bullet")},{description:this.t("bbva-widget-smart-assistant-info-bullet-2")},{description:this.t("bbva-widget-smart-assistant-info-bullet-3")}];return g`
      <bbva-transition-container
        ambient="light"
        header-type="modal-three-level"
        reverse-animation=""
        hide-return-icon=""
        icon-right-primary="bbva:close"
        header-text=${this.t("bbva-widget-smart-assistant-spei-title")}
        ?visible=${this._MoreInfoVisible}
        @visible-changed=${this._moreSpeiVisibleChanged}
      >
        <div slot="slot-content">

          <bbva-help-modal
              class="second-modal"
              ?visible="${this.secondAlertModal}"
              header-type="modal"
              modal-type="warning"
              title-icon="${ye()}"
              @help-modal-close="${e=>{e.stopPropagation(),this.secondAlertModal=!1,this._MoreInfoVisible=!0}}"
            >
            <div class="content" slot="slot-content">
            <span>${this.t("sustainability-tips-detail-retail-offer-modal-interest-text")}</span>
            <div>
            <bbva-button-default
            text="Continuar"
            @click="${e=>{e.stopPropagation(),this.secondAlertModal=!1,this._openExternalLink("https://portal.bbva.mx/aclaraciones/aclaraciones-transferencias-SPEI.jsp")}}"
            ></bbva-button-default>
            </div>
            </div>
            </bbva-help-modal>

          <bbva-text
            class="bbva-text-bolded"
            text="${this.t("bbva-widget-smart-assistant-requirement")}"
          ></bbva-text>

          ${e.map((e=>g`
              <bbva-list-bullet class="bullet-item">
                ${e.description}
              </bbva-list-bullet>
            `))}

          <bbva-text
            class="bbva-text-bolded"
            text="${this.t("bbva-widget-smart-assistant-info")}"
          ></bbva-text>

          ${t.map((e=>g`
              <bbva-list-bullet class="bullet-item">
                ${e.description}
              </bbva-list-bullet>
            `))}

          <p class="text-body">
            ${this.t("bbva-widget-smart-assistant-info-fq")}<br />

            <bbva-link
            @click="${()=>{this.secondAlertModal=!0}}"
            >
              ${this.t("bbva-widget-smart-assistant-info-link")}
            </bbva-link>
          </p>
          <div>
            <bbva-button-default
              text="Entendido"
              @click="${()=>{this._MoreInfoVisible=!1}}"
            >
            </bbva-button-default>
          </div>
        </div>
      </bbva-transition-container>
    `}_sendMessage({text:e,value:t,focus:a}){e&&(a&&(this._inputText.blur(),this._toggleMode()),this._deactivateLastMessage(),this.optionsPanel=[],this.messages=[...this.messages,{text:e,active:!0}],this.lastMessage=e,this._sendAmeliaMessage(t||e),this._showWritingElement=!0)}static _onButtonItemClick(e){return t=>{t.cancelable&&t.preventDefault(),t.target.dispatchEvent(new CustomEvent(e.tag?`bbva-widget-smart-assistant-button-${e.tag}-click`:"bbva-widget-smart-assistant-options-panel-click",{bubbles:!0,composed:!0,detail:{value:e.value}}))}}_onOptionsPanelButtonClick(e){const t=e.detail&&e.detail.value;this._sendMessage({text:t})}_onButtonMoreOptionsClick(e){this._mode="MoreOptions",e.cancelable&&e.preventDefault(),this._renderMoreOptionsMode()}_getFocusedElement(){const e=this._chatForm&&this._chatForm.shadowRoot;return e&&e.activeElement}_onRemoveClassBlur(){this.isNativeIos&&(this._hideChatFormPaddingBottom=!0),this._hideButtonWrapper=!1}_scrollToBottom(){this._scrollable.scrollTo(0,this._scrollable.scrollHeight)}_onChatFormClick(){const e=this._getFocusedElement();e&&"TEXTAREA"===e.tagName&&(this.isNativeIos&&(this._hideChatFormPaddingBottom=!1),this._scrollToBottom(),this._hideButtonWrapper=!0),this._toggleMode()}_onFormSendClick(e){this._sendMessage({text:e.detail,focus:!0})}_onListClipLinkClick(e){return()=>{const t=e.value;this._sendMessage({text:t}),this._setConversationalMode(),this._openModal=!1,this._getAnalyticLinkModule(t)}}_getAnalyticLinkModule(e){const t=e.toLowerCase();this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-analytic-link-module",{bubbles:!0,composed:!0,detail:{internalLink:t}}))}_onMicRequest(){this._talking=!0,this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-start-recognition",{bubbles:!0,composed:!0,detail:{language:this.language}}))}_onMicCancel(){this._talking=!1,this._cancelStopRecognition||(this._cancelStopRecognition=!1,this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-stop-recognition",{bubbles:!0,composed:!0,detail:!0})))}_setConversationalMode(){this._activeConversationalMode=!0,this._activeMoreOptionsMode=!1,this._mode="Conversational",this._removeOption("more-options"),this._toggleMode()}_toggleMode(){if("Conversational"!==this._mode){const e=this._getFocusedElement();e&&"TEXTAREA"===e.tagName&&this._setConversationalMode()}}reset(){this._continueInConversation?this._continueInConversation&&this._isIreneActive&&(this.timeSpinner=1,this._continueInConversation=!1):(this.navigation={},this._ameliaAttributes={},this._activeConversationalMode=!1,this._activeMoreOptionsMode=!1,this._hideButtonWrapper=!1,this._input="",this._mode="Welcome",this._openModal=!1,this._talking=!1,this._visibleElements=3,this.language="es-MX",this.localCurrency="MXN",this.optionsPanel=[],this._showOption=!1,this.messages=[],this._showWritingElement=!1,this._openModalSuccess=!1,this._MoreInfoVisible=!1,this.showToast=!1,this._manageToast(!1),this._isExtendedSurvey=!1,this._continueInConversation=!1,this.ratingId=0,this.timeSpinner=1e4,this._isIreneActive=!1,this._ameliaInitialized=!1,this._showTimeOutError=!1,clearTimeout(this._timeOutInitId),this._timeOutInitId=0)}_manageToast(e){this._fire("toast-feedback-smart-assistant",e)}_initialSpinner(){this._showWritingElement=!0,this._timeOutInitId=setTimeout((()=>{this._ameliaInitialized||(this._showWritingElement=!1,this._showTimeOutError=!0)}),this.timeSpinner)}init(){var e;if(this._continueInConversation||this._isIreneActive||this._initialSpinner(),this._setExtraHeaderClass(),"search-place"===(null===(e=this.navigation)||void 0===e?void 0:e.continue)||this._continueInConversation)return this._continueInConversation=!1,this._openModalSuccess=!1,this._resetToast(),this.surveySent&&Tt._disabledFeedbackContainer(this.containerById),this.containerById="",void(this.surveySent=!1);this.optionsPanel.length||this._showOption||this.optionsPanel.push({tag:"more-options"}),this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-init",{bubbles:!0,composed:!0,detail:!0})),this._ameliaAttributes={},this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-get-from-local-storage",{bubbles:!0,composed:!0,detail:{key:"smart_assistant"}})),this._manageToast(!0)}transcription(e){this._chatForm.transcript=e,this._cancelStopRecognition=!0}ameliaAttributes(e){if(e){const t={string:()=>Tt._parseJSON(e),object:()=>e}[typeof e];this._ameliaAttributes=t()}}showMoreOptionsModal(){this._openModal=!0}_goBack(){this._isIreneActive=!1,this._fire("bbva-widget-smart-assistant-go-back")}ameliaMessages(e){if(!e||this._isIreneActive)return;const{messageBody:t,messageType:a}=e;if(t&&t.integrationMessageData&&this._updateFlags(t.integrationMessageData),this._ameliaInitialized||(this._showOption=!0,this._ameliaInitialized=!0),Tt.unanswered(e))return this._showWritingElement=!0,void this.getFaqAlertMessage(e);a&&this.showAmeliaResponse(e),this._mvFlag&&this._sendMessageToMV()}getFaqAlertMessage(e){const t=e.messageBody.messageText.split("|"),a=Tt.changeMessage(e,t[2]);if(this.messagesFaqs.error=a,this._saFaqsInbentaFlag){const a=Tt.changeMessage(e,t[1]);this.messagesFaqs.success=a,this.callServiceFaqs()}else this._showWritingElement=!1,this.showAmeliaResponse(this.messagesFaqs.error),this.activeFeedback(this.messageFeedback.empty)}getMenuInstructions(e){this._ameliaText=e.ameliaPhrase,this._mvFlag=e.mvFlag}_sendMessageToMV(){this.ameliaReady&&(this._sendMessage({text:this._ameliaText}),this._mvFlag=!1),this._activeConversationalMode||this._setConversationalMode()}static changeMessage(e,t){const a=JSON.parse(JSON.stringify(e));return a.messageBody.messageText=t,a}static unanswered(e){return JSON.stringify(e).includes("NotFoundResponseAmelia")}_getDataProviderQas(){return g`
      <bbva-dataprovider-qas
        id="serviceFaqs"
        .host="${this.host}"
        ?native="${this.native}"
        .qasApiVersion="${this.apiVersionQas}"
        .qadomainId="${this.qadomainId}"
        .requiredToken="${this.requiredToken}"
        @set-list-qas="${this.getListQasResponseSuccess}"
        @error-on-get-list-qas="${this.getListQasResponseError}"
        @api-dm-error="${this.getListQasResponseError}"
      ></bbva-dataprovider-qas>
    `}callServiceFaqs(){this.serviceFaqs.getListQas(`${this.lastMessage}&max=3`)}getListQasResponseSuccess(e){this._showWritingElement=!1,null===(null==e?void 0:e.detail)?(this.showAmeliaResponse(this.messagesFaqs.error),this.activeFeedback(this.messageFeedback.empty)):(this.showAmeliaResponse(this.messagesFaqs.success),this._deactivateLastMessage(),setTimeout((()=>{this._receiveMessage({name:"FaqsInbenta",faqs:e.detail}),this.activeFeedback(this.messageFeedback.success)}),500))}activeFeedback(e){setTimeout((()=>{this._sendAmeliaMessage(e)}),500)}getListQasResponseError(e){this.showAmeliaResponse(this.messagesFaqs.error),this.activeFeedback(`${this.messageFeedback.error} ${e.detail["http-status"]}`)}getFlagOperations(e){var t,a,i;this._saBinaryFeedbackFlag=null===(t=e["glomo.smartAssistantBlue.binaryFeedback"])||void 0===t?void 0:t.value,this._saFaqsInbentaFlag=null===(a=e["glomo.smartAssistantBlue.faqsInbentaBlue"])||void 0===a?void 0:a.value,this._saIreneFeedbackFlag=null===(i=e["glomo.smartAssistantBlue.ireneFeedback"])||void 0===i?void 0:i.value}showAmeliaResponse(e){const{messageType:t="",messageBody:a={},isNative:i=!0}=e,s=e.hintText||e.messageBody.hintText,r={OutboundTextMessage:this._OutboundTextEchoMessage.bind(this,a,s),OutboundEchoMessage:this._OutboundTextEchoMessage.bind(this,a,s),OutboundIntegrationMessage:this._OutboundIntegrationMessage.bind(this,a,i),OutboundFormInputMessage:this._OutboundFormInputMessage.bind(this,a)};r[t]&&r[t]()}_OutboundTextEchoMessage({messageText:e="",messageType:t},a){if("OutboundEchoMessage"===t)return;const i=Tt,{isSafeToShow:s,rules:r}=i._checkMessage(e),n="OutboundTextMessage"===t;s&&this._receiveMessage({messageText:e,messageType:t,hintText:a}),n&&r.hasTsec,n&&r.hasOTP}static _checkMessage(e){const t={hasTsec:e.toLowerCase().startsWith("tsec"),hasOTP:/<<otp-request>>/gi.test(e),hasJSON:e.includes("{"),hasAPI:e.toLowerCase().includes("statuscode")};return{isSafeToShow:!Object.values(t).some((e=>!0===e)),rules:t}}_OutboundIntegrationMessage({integrationMessageData:e={}},t){const a=t?this._nativeFormater(e):e;this._integrationMessages(a,t)}_nativeFormater({nameValuePairs:e,values:t}){const a=e||t;return Object.keys(a).reduce(((e,t)=>{let i=e;return Array.isArray(a)?i=a.map((({nameValuePairs:e,values:t})=>e||t)):"object"==typeof a[t]?i[t]=this._nativeFormater(a[t]):i[t]=a[t],i}),{})}_integrationMessages(e){const t=e.name||e.Name,a=null==e?void 0:e.payload,i={GlobalProducts:()=>{Object.assign(e,{isNativeIos:this.isNativeIos}),this._receiveMessage(e)},TransactionList:()=>{this._receiveMessage(e)},AccountList:()=>{var t;this._pdfTitle="Estado de Cuenta",this._openDocument(null===(t=a.find((e=>e.base64)))||void 0===t?void 0:t.base64),this._receiveMessage(e),this._fire("bbva-widget-smart-assistant-amelia-data-success",!0)},serviceResolution:()=>{this.serviceCards={data:a,areStaticCardsPresent:!1}},StoredServices:()=>{this.serviceCards={data:a}},ContactCards:()=>{this._receiveMessage(e)},SuccessMessage:()=>{const t="cardless"===e.description?"Ver clave y código":"Ver comprobante";Object.assign(e,{textLink:t}),this._reviewDataSuccess=this[`_setReviewData${e.description.replace(/^./,(e=>e.toUpperCase()))}`](a),Object.assign(e.payload,{reviewData:this._reviewDataSuccess,shareData:this._receiptData}),this._receiveMessage(e),this._openModalSuccess=!0,this._fire("bbva-widget-smart-assistant-amelia-data-success",!0)},OtpOperation:()=>{this.otp=a||(null==e?void 0:e.confirmOTP),this._fire("signature-required-first-step-dm",{otpId:this.otpId,errorType:"signature-required-first-step",type:this.otp.authenticationtype,data:this.otp.authenticationdata})},Error:()=>{this._receiveMessage({name:t}),this._fire("bbva-widget-smart-assistant-amelia-data-error",!0)},Warning:()=>{this._receiveMessage({messageText:a.message}),this._fire("bbva-widget-smart-assistant-amelia-data-error",!0)},fBinary:()=>{this._saBinaryFeedbackFlag&&"noFeedBack"!==(null==a?void 0:a.operativeBPN)&&(Object.assign(a,{idfeed:this._countRaiting()}),this._receiveMessage({name:t,data:a}))},fIrene:()=>{this._saIreneFeedbackFlag&&this._activeFeedIrene({name:t,data:a})}};i[t]&&i[t]()}_OutboundFormInputMessage({formInputData:e={}}){const{name:t="",fields:a=[]}=e,i={agentOption:()=>{this._fire("bbva-widget-smart-assistant-call-agent",{value:this.agentPhoneNumber})},serviceFlagOption:()=>{this._receiveMessage({messageText:JSON.stringify({name:t,serviceCards:this.serviceCards})}),this.serviceCards={}},contactsFlagOption:()=>{},quickPillOption:()=>{this.ameliaReady=!0,a[0]&&a[0].options.length>0&&(this.showCallAdvisor&&(a[0].options=[...a[0].options,{disabled:!1,hidden:!1,name:"Llamar a un asesor",selected:!1,value:"Llamar a un asesor"}]),this.menuOptions=a[0].options.map((e=>({...e,...Tt.options.find((t=>t.name===e.name))}))))},cardsOptions:()=>{const t=a.find((e=>"cardsOptions"===e.name));"Displaying different accounts"===e.nameForDisplay&&(t.name="ContactCards"),this._receiveMessage(t)},AccountsOptions:()=>{this._receiveMessage(a.find((e=>"AccountsOptions"===e.name)))},ratingsFlag:()=>{this._receiveMessage({messageText:JSON.stringify({name:t})})},confirmation:()=>{a[0]&&a[0].options.length&&this._showOptions(a[0].options)}};i[t]?i[t]():a[0]&&a[0].options.length&&this._showOptions(a[0].options)}_updateFlags(e){if(e&&"object"==typeof e){const{nameValuePairs:t}=e;t&&Object.assign(e,t);const{firstTimeDigital:a,firstTimePhysical:i,cardId:s,isActive:r,alias:n}=e;("boolean"==typeof a&&!a||"boolean"==typeof i&&!i)&&(this.ameliaAttributes({firstTimeDigital:a,firstTimePhysical:i}),s&&this.dispatchEvent(new CustomEvent("bbva-widget-smart-assistant-card-state-change",{bubbles:!0,composed:!0,detail:{cardId:s,isActive:r,alias:n}})))}}static get styles(){return[Ct,m("bbva-widget-smart-assistant-shared-styles")]}signRequest(e){this._sendAmeliaMessage(`\n    {autenticationData:otp-token=${e.signatureValue},\n    authenticationType: ${e.signatureType}}\n    `)}_sendAmeliaMessage(e){this._fire("bbva-widget-smart-assistant-send-message",e)}signCancel(){this._sendAmeliaMessage("\n    {errorCode:CANCELLED_BY_THE_USER_MESSAGE}\n    ")}_renderModes(){return"Conversational"!==this._mode?g`
        ${this._renderOpeningGreeting()}
        ${this._renderWelcomeMode()}
        ${this._renderWritingContainer()}
      `:g`
        ${this._renderConversationalMode()}
      `}render(){return g`
      ${this._getDataProviderQas()}
      ${this._getGlobalCustomerApiDm()}
      <bbva-header-main
        class="header-main"
        variant="modal"
        accessibility-text-icon-left-primary="Return"
        accessibility-text-icon-right-secondary="More"
        icon-left-primary="${_e()}"
        icon-right-secondary="${fe()}"
        icon-right-primary-expanded="false"
        text="glomo-assistance-section-blue-bbva-label"
        @header-main-icon-left-primary-click="${()=>{this._goBack(),this._continueInConversation=!1}}"
        @header-main-icon-right-secondary-click="${()=>{this.showMoreOptionsModal()}}"
      ></bbva-header-main>
      <div class="chat-main overflow-hidden">
        <div class="h-full">
          <div class="scrollable">
            ${this._renderModes()}
          </div>
        </div>
      </div>
      <div class="chat-footer">
        <div class="scrollable" ?talking="${this._talking}">
        ${this._showOption?g`
          <div
            class="button-wrapper"
            ?empty="${!this.optionsPanel.length}"
            @bbva-widget-smart-assistant-button-more-options-click="${this._onButtonMoreOptionsClick}"
            @bbva-widget-smart-assistant-options-panel-click="${this._onOptionsPanelButtonClick}">
              ${this.optionsPanel.map((e=>g`
                <bbva-chat-button
                  class="button-option"
                  corner="none"
                  @chat-button-item-click=${Tt._onButtonItemClick(e)}>
                    ${e.tag?this.t(`bbva-widget-smart-assistant-option-panel-button-${e.tag}-name`):e.value}
                </bbva-chat-button>
              `))}
          </div>
        `:""}
        </div>
        <bbva-chat-form
          @blur="${this._onRemoveClassBlur}"
          with-space
          keep-talking-animation
          ?talking="${this._talking}"
          text-placeholder="${this._talking?this.t("bbva-widget-smart-assistant-form-talking-text-placeholder"):this.t("bbva-widget-smart-assistant-form-text-placeholder")}"
          @chat-form-mic-request="${this._onMicRequest}"
          @chat-form-mic-cancel="${this._onMicCancel}"
          @click="${this._onChatFormClick}"
          @chat-form-send-click="${this._onFormSendClick}"
          @keyup="${this._handleInput}">
        </bbva-chat-form>
      </div>

      ${this._openModal?this.errorExitModal:""}
      ${this._openModalSuccess?this._renderModalSuccess(this._reviewDataSuccess,this._receiptData):""}
      ${this._MoreInfoVisible?this._renderMoreInfoSpei:""}
      ${this.notificationToast()}
    `}_fire(e,t){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(Tt.is,Tt);
