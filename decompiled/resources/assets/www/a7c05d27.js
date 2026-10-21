import{z as t,ar as e,a8 as a,a9 as i,au as l,bc as o,b0 as s,ac as r,ad as n,ab as d,aa as c,aJ as b,a as p,aS as g,L as u,aw as h,bh as v,b6 as m,af as y,ak as k,h as $,i as f}from"./952f98a9.js";var x=t`[ambient^=light] {
  --bbva-list-badge-text-color: initial;
  --bbva-list-badge-title-color-pressed: initial;
  --bbva-list-badge-bg-pressed-color: initial;
  --bbva-list-badge-subtitle-color: initial;
  --bbva-list-badge-title-color: initial;
}
${(new e).mediaRules()}`;const w=new e;const S={dark:t`
    ${t`[ambient^=dark] {
  --bbva-list-badge-text-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-badge-title-color-pressed: var(--colorsPrimarySubduedLight, ${a(i.primarySubduedLight)});
  --bbva-list-badge-bg-pressed-color: var(--colorsPrimaryCoreDark, ${a(i.primaryCoreDark)});
  --bbva-list-badge-subtitle-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-badge-title-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
}
${w.mediaRules()}`}
    ${l.dark}
    ${o.dark}
    ${s.dark}
  `,light:t`
    ${x}
    ${l.light}
    ${o.light}
    ${s.light}
  `},_=new e;var C=t`:host {
  display: block;
  box-sizing: border-box;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1em);
  color: var(--_list-badge-text-color);
  --_list-badge-text-color: var(--bbva-list-badge-dark-mode-text-color, var(--bbva-list-badge-text-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_list-badge-title-color: var(--bbva-list-badge-dark-mode-title-color, var(--bbva-list-badge-title-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_list-badge-title-color-pressed: var(--bbva-list-badge-dark-mode-title-color-pressed, var(--bbva-list-badge-title-color-pressed, var(--colorsPrimaryCore, ${a(i.primaryCore)})));
  --_list-badge-subtitle-color: var(--bbva-list-badge-dark-mode-subtitle-color, var(--bbva-list-badge-subtitle-color, var(--colorsSecondary500, ${a(i.secondary500)})));
  --_list-badge-bg-pressed-color: var(--bbva-list-badge-dark-mode-bg-pressed-color, var(--bbva-list-badge-bg-pressed-color, var(--colorsSecondary100, ${a(i.secondary100)})));
}

:host([link]:active) {
  background-color: var(--_list-badge-bg-pressed-color);
}
:host([link]:active) .title {
  color: var(--_list-badge-title-color-pressed);
}

:host([disabled]) .title {
  opacity: 1;
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

:host([ellipsis]) .title, :host([ellipsis]) .link-title, :host([ellipsis]) slot[name=subtitle]::slotted(*:first-child) {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([ellipsis]) .content-with-amount {
  overflow: hidden;
  display: block;
}
:host([ellipsis]) .title-wrapper {
  display: block;
}
:host([ellipsis]) .subtitles-with-amount:first-of-type {
  display: block;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([icon][ellipsis]) .title {
  justify-content: flex-start;
}

.content {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  width: 100%;
}

.content-with-amount {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  width: 100%;
}

.title {
  font-size: var(--typographyTypeMedium, ${a(r.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${a(n.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(d.medium.fontWeight)});
  text-align: left;
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1em);
}
:host(:not([link])) .title {
  color: var(--_list-badge-title-color);
}

.title-wrapper {
  display: inline-flex;
}
.title-wrapper .title-icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

.date {
  font-size: var(--typographyTypeSmall, ${a(r.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(n.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${a(d.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${a(d.mediumItalic.fontStyle)});
}

.amount, .badge {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

.subtitles {
  color: var(--_list-badge-subtitle-color);
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
}

.subtitles-with-amount {
  display: flex;
  color: var(--_list-badge-subtitle-color);
  flex-direction: column;
  align-items: flex-start;
}

.subtitle {
  font-size: var(--typographyTypeSmall, ${a(r.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(n.typeSmall)});
}

.content-with-icon {
  padding-left: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1em);
}

:host([type=two-columns][ellipsis]) .content {
  align-items: flex-end;
}
:host([type=two-columns][ellipsis]) .title {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1em);
}

:host([type=two-columns]) .badge {
  margin-top: 0;
}

:host([type=two-columns]) slot[name=subtitle] {
  flex-basis: 100%;
}

slot[name=subtitle]::slotted(*) {
  flex-basis: 50%;
}
:host([type=full-width]) slot[name=subtitle]::slotted(*) {
  flex-basis: 100%;
}

slot[name=subtitle]::slotted(*:nth-child(2n)) {
  text-align: right;
}

slot[name=subtitle-amount]::slotted(*:nth-child(2n)) {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(c.spacer)}))) / 16) * 1rem);
}

slot[name=subtitle-amount]::slotted(*:last-child) {
  margin-bottom: 0;
}

:host([loading]):after {
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
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--bbva-list-badge-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)}))) 100%, transparent 0), linear-gradient(-60deg, var(--bbva-list-badge-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)}))) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--bbva-list-badge-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)}))) 50%), linear-gradient(-60deg, transparent 50%, var(--bbva-list-badge-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)}))) 50%), linear-gradient(-60deg, transparent 50%, var(--bbva-list-badge-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)}))) 50%);
  background-color: var(--bbva-list-badge-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, transparent));
  background-size: 28px 28px, calc((24% * 2) + (16px/ 2)) 16px, calc((35% * 2) + (16px/ 2)) 16px, calc((35% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 16px 18px, calc(100% - 16px) 18px, 61px 18px, 61px 42px, 61px 66px;
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
${_.mediaRules()}`;class T extends(b(p(g(u)))){static get is(){return"bbva-list-badge"}static get scopedElements(){return{"bbva-amount":h,"bbva-badge-default":v,"bbva-link":m,"bbva-core-icon":y}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},link:{type:String},heading:{type:String},date:{type:String},amount:{type:Number},badge:{type:String},badgeType:{type:String,attribute:"badge-type"},ellipsis:{type:Boolean,reflect:!0},type:{type:String}}}constructor(){super(),this.iconSize=24,this.ellipsis=!1}static get styles(){return[C,super.styles,S.dark,S.light,k("bbva-list-badge-shared-styles")]}firstUpdated(t){super.firstUpdated(t),t.has("amount")||t.has("type")||(this.type="two-columns"),this.link&&!this.disabled&&this.addEventListener("click",this.linkClicked)}get _icon(){return $`
      ${this.icon&&$`
          <bbva-core-icon aria-hidden="true" icon=${this.icon} class="title-icon"></bbva-core-icon>
        `||""}
    `}_contentOneColumn(){return $`
      <div class="content-with-amount">
        ${this.link?this._linkTitle():this._defaultTitle()}

        <div class="${this.icon?"content-with-icon":""}">
          <div class="subtitles-with-amount">
            <slot name="subtitle" class="subtitle"></slot>
          </div>

          ${this.amount||0===this.amount?this._amountTemplate():$``}

          <div class="subtitles-with-amount">
            <slot name="subtitle-amount" class="subtitle"></slot>
          </div>

          ${this._badgeDefault()}
        </div>
      </div>
    `}_contentTwoColumns(){return $`
      <div class="content">${this.link?this._linkTitle():this._defaultTitle()}</div>

      <div class="${this.icon?"content-with-icon":""}">
        <div class="subtitles">
          <slot name="subtitle" class="subtitle"></slot>
        </div>
        ${this._badgeDefault()}
      </div>
    `}_linkTitle(){return $`
      <bbva-link
        ?disabled=${this.disabled}
        class="title"
        tabindex="0"
        @click=${this.linkClicked}
        .icon=${this.icon}
        .iconSize=${this.iconSize}
      >
        <div class="link-title">${this.link}</div>
      </bbva-link>
      ${this._contentRightColumn()}
    `}_defaultTitle(){return $`<div class="title-wrapper">
        ${this._icon}
        <div class="title">${this.heading}</div>
      </div>
      ${this._contentRightColumn()} `}_contentRightColumn(){return $`
      ${!this.amount&&0!==this.amount||"two-columns"!==this.type?$` <div class="date">${this.date}</div>`:this._amountTemplate()}
    `}_amountTemplate(){return $`
      <bbva-amount
        class="amount"
        variant="xl"
        .localCurrency=${this.localCurrency}
        .amount=${this.amount}
        .currencyCode=${this.currencyCode}
        .language=${this.language}
      >
      </bbva-amount>
    `}_badgeDefault(){return $`
      <bbva-badge-default
        part="badge"
        class="badge"
        text=${this.badge}
        type=${f(this.badgeType)}
      >
      </bbva-badge-default>
    `}linkClicked(){this.disabled||this.dispatchEvent(new CustomEvent("list-badge-link-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return $`
      ${"two-columns"===this.type?this._contentTwoColumns():this._contentOneColumn()}
    `}}export{T as B};
