import{z as i,a8 as t,ac as a,ad as e,ab as r,ar as o,a9 as n,aa as s,bf as l,b0 as d,bd as c,a as b,aJ as v,L as g,S as y,ag as p,b6 as m,ak as h,h as k,av as f}from"./952f98a9.js";const u=new o;var $=i`:host {
  --skeleton-quote-color: var(--bbva-list-definition-data-skeleton-dark-mode-color, var(--bbva-list-definition-data-skeleton-color, var(--colorsSecondary200, ${t(n.secondary200)})));
  --skeleton-quote-bg: var(--bbva-list-definition-data-sekeleton-bg-dark-mode-color, var(--bbva-list-definition-data-skeleton-bg, transparent));
  box-sizing: border-box;
  display: flex;
  flex-wrap: wrap;
  flex-direction: row;
  align-items: top;
  --_list-definition-data-key-font-color: var(--bbva-list-definition-data-key-font-dark-mode-color, var(--bbva-list-definition-data-key-font-color, var(--colorsSecondary600, ${t(n.secondary600)})));
  --_list-definition-data-list-border: var(--bbva-list-definition-data-list-border-dark-mode-color, var(--bbva-list-definition-data-list-border, var(--colorsSecondary100, ${t(n.secondary100)})));
  --_list-definition-data-value-font-color: var(--bbva-list-definition-data-value-font-dark-mode-color, var(--bbva-list-definition-data-value-font-color, var(--colorsSecondary500, ${t(n.secondary500)})));
  --_list-definition-data-card-bg-color: var(--bbva-list-definition-data-card-bg-dark-mode-color, var(--bbva-list-definition-data-card-bg, var(--colorsPrimaryCoreLightened, ${t(n.primaryCoreLightened)})));
  --_list-definition-data-sticky-bg-color: var(--bbva-list-definition-data-sticky-bg-dark-mode-color, var(--bbva-list-definition-data-sticky-bg, var(--colorsPrimaryCoreLightened, ${t(n.primaryCoreLightened)})));
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1em);
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
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1em);
}

.key {
  display: flex;
  align-items: center;
  text-align: center;
  font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(e.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(r.medium.fontStyle)});
  color: var(--_list-definition-data-key-font-color);
}
.key-fit {
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(r.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${t(r.book.fontStyle)});
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
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}

:host([variant=card]) {
  background: var(--_list-definition-data-card-bg-color);
  box-shadow: var(--boxShadowType1, ${t(l.type1)});
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
${u.mediaRules()}`;const x=new o;var S=i`[ambient^=light] {
  --bbva-list-definition-data-key-font-color: initial;
  --bbva-list-definition-data-value-font-color: initial;
  --bbva-list-definition-data-card-bg: initial;
  --bbva-list-definition-data-skeleton-color: initial;
  --bbva-list-definition-data-sticky-bg: initial;
}

[ambient=light100] {
  --bbva-list-definition-data-sticky-bg: var(--colorsSecondary100, ${t(n.secondary100)});
}
${x.mediaRules()}`;const C=new o;var _=i`[ambient^=dark] {
  --bbva-list-definition-data-key-font-color: var(--colorsPrimaryCoreLightened, ${t(n.primaryCoreLightened)});
  --bbva-list-definition-data-value-font-color: var(--colorsPrimaryCoreLightened, ${t(n.primaryCoreLightened)});
  --bbva-list-definition-data-card-bg: var(--colorsPrimaryCore, ${t(n.primaryCore)});
  --bbva-list-definition-data-skeleton-color: var(--colorsPrimaryMedium, ${t(n.primaryMedium)});
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryCore, ${t(n.primaryCore)});
}

[ambient=dark100] {
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryMedium, ${t(n.primaryMedium)});
}

[ambient=dark200] {
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryCoreLight, ${t(n.primaryCoreLight)});
}

[ambient=dark300] {
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryCoreDark, ${t(n.primaryCoreDark)});
}

[ambient=dark400] {
  --bbva-list-definition-data-sticky-bg: var(--colorsPrimaryCoreDarkened, ${t(n.primaryCoreDarkened)});
}
${C.mediaRules()}`;const w={dark:i`
    ${d.dark}
    ${c.dark}
    ${_}
  `,light:i`
    ${d.light}
    ${c.light}
    ${S}
  `};class L extends(b(v(g))){static get is(){return"bbva-list-definition-data"}static get scopedElements(){return{"bbva-badge-variability":y,"bbva-text":p,"bbva-link":m}}static get properties(){return{items:{type:Array},alignment:{type:String},oneColumn:{type:Boolean,attribute:"one-column",reflect:!0},hideBorderRight:{type:Boolean,attribute:"hide-border-right"},useLinkIdAsDetail:{type:Boolean,attribute:"use-link-id-as-detail"},sticky:{type:Boolean},disabled:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.items=[],this.disabled=!1,this.loading=!1,this.oneColumn=!1,this.alignment="center",this.hideBorderRight=!1,this.useLinkIdAsDetail=!1,this.sticky=!1}static get styles(){return[super.styles,$,w.dark,w.light,h("bbva-list-definition-data-shared-styles")]}updated(i){super.updated(i)}_getStatus(i){return this._trendMapIcons={up:"increase",down:"decrease",noChange:"no-change"},this._trendMapIcons[i.trend]}_shouldCreateIcon(i){return this._getStatus(i)?k`
          <bbva-badge-variability
            size="small"
            .status=${this._getStatus(i)}
          ></bbva-badge-variability>
        `:""}_goLink(i){var t;const a=null==i||null===(t=i.currentTarget)||void 0===t?void 0:t.id;this.dispatchEvent(new CustomEvent("list-definition-data-link-click",{detail:!this.useLinkIdAsDetail||{id:a},bubbles:!0,composed:!0}))}get _items(){return this.items.map(((i,t)=>k`
        <div class="list">
          ${i.key?k`
                <span
                  class="key ${f({"key-fit":i.keyFit,"key-ellipsis":i.keyEllipsis})}"
                  id="key_${t}"
                >
                  ${this._shouldCreateIcon(i)} ${i.key}
                </span>
              `:k``}
          ${i.value?k`
                <bbva-text
                  class="valueData"
                  id="value_${t}"
                  tag="span"
                  size="S"
                  ?ellipsis="${!i.ellipsisLines||i.ellipsisLines>0}"
                  lines="${i.ellipsisLines||0===i.ellipsisLines?i.ellipsisLines:2}"
                  .alignment=${this.alignment}
                  .text=${i.value}
                ></bbva-text>
              `:k`
                ${i.textLink?k`
                      <bbva-link
                        id="link_${t}"
                        @click="${this._goLink}"
                        ?disabled=${this.disabled}
                      >
                        ${i.textLink}
                      </bbva-link>
                    `:k``}
              `}
        </div>
      `))}render(){return k` ${this._items} `}}export{L as B,w as b};
