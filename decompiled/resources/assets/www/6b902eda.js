import{R as t,S as a,u as e,T as o,D as i,U as n,V as r,w as l,v as s,W as c,x as b,X as d,G as p,f as u}from"./216055dc.js";import{z as m,a8 as g,ab as v,a9 as f,ap as h,an as k,L as y,ak as _,h as x,av as S,aV as w,i as $,bm as A,bn as P,bl as C}from"./952f98a9.js";const z=m`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-tab-default--_ambient--tab-color: initial;
    --bbva-tab-default--_ambient--tab-selected-color: initial;
    --bbva-tab-default--_ambient--shadow-selected: initial;
    --bbva-tab-default--_ambient--tab-selected-pressed-color: initial;
    --bbva-tab-default--_ambient--tab-unselected-pressed-color: initial;
    --bbva-tab-default--_ambient--tab-unselected-pressed-navigation-color: initial;
    --bbva-tab-default--_ambient--icon-color: initial;
    --bbva-tab-default--_ambient--icon-selected-color: initial;
    --bbva-tab-default--_ambient--skeleton-quote-color: initial;
    --bbva-tab-default--_ambient--skeleton-animated-layer-bg: initial;
    --bbva-tab-default--_ambient--gradient-sticky-background: initial;
    --bbva-tab-default--_ambient--gradient-background: initial;
    --bbva-tab-default--_ambient--focus-border-color: initial;
    --bbva-tab-default--_ambient--icon-color: initial;
    --bbva-tab-default--_ambient--icon-color-active: initial;
  }
`,T=m`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-tab-default--_ambient--tab-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--tab-color,
      ${t("colorPrimaryAltLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--tab-selected-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--tab-selected-color,
      ${t("colorPrimaryAltSelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--shadow-selected: var(
      --bbva-tab-default--custom--primary-alt-ambient--shadow-selected,
      ${t("colorPrimaryAltSelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--tab-selected-pressed-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--tab-selected-pressed-color,
      ${t("colorPrimaryAltSelectionInteraction02SelectedPressed",a)}
    );
    --bbva-tab-default--_ambient--tab-unselected-pressed-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--tab-unselected-pressed-color,
      ${t("colorPrimaryAltLinkComplementaryPressed",a)}
    );
    --bbva-tab-default--_ambient--tab-unselected-pressed-navigation-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--tab-unselected-pressed-navigation-color,
      ${t("colorPrimaryAltSelectionInteraction02SelectedPressed",a)}
    );
    --bbva-tab-default--_ambient--icon-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--icon-color,
      ${t("colorPrimaryAltLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--icon-selected-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--icon-selected-color,
      ${t("colorPrimaryAltSelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--skeleton-quote-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--skeleton-quote-color,
      ${t("colorPrimaryAltSurfaceAmbientPreloading",a)}
    );
    --bbva-tab-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-tab-default--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${t("colorPrimaryAltSurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--gradient-sticky-background: var(
      --bbva-tab-default--custom--primary-alt-ambient--gradient-sticky-background,
      ${t("colorPrimaryAltSurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--gradient-background: var(
      --bbva-tab-default--custom--primary-alt-ambient--gradient-background,
      ${t("colorPrimaryAltSurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--focus-border-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--focus-border-color,
      ${t("colorPrimaryAltSurfaceAmbientFocus",a)}
    );
    --bbva-tab-default--_ambient--icon-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--icon-color,
      ${t("colorPrimaryAltLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--icon-color-active: var(
      --bbva-tab-default--custom--primary-alt-ambient--icon-color-active,
      ${t("colorPrimaryAltLinkComplementaryPressed",a)}
    );
  }

`,I=m`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-tab-default--_ambient--tab-color: var(
      --bbva-tab-default--custom--secondary-ambient--tab-color,
      ${t("colorSecondaryLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--tab-selected-color: var(
      --bbva-tab-default--custom--secondary-ambient--tab-selected-color,
      ${t("colorSecondarySelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--shadow-selected: var(
      --bbva-tab-default--custom--secondary-ambient--shadow-selected,
      ${t("colorSecondarySelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--tab-selected-pressed-color: var(
      --bbva-tab-default--custom--secondary-ambient--tab-selected-pressed-color,
      ${t("colorSecondarySelectionInteraction02SelectedPressed",a)}
    );
    --bbva-tab-default--_ambient--tab-unselected-pressed-color: var(
      --bbva-tab-default--custom--secondary-ambient--tab-unselected-pressed-color,
      ${t("colorSecondaryLinkComplementaryPressed",a)}
    );
    --bbva-tab-default--_ambient--tab-unselected-pressed-navigation-color: var(
      --bbva-tab-default--custom--secondary-ambient--tab-unselected-pressed-navigation-color,
      ${t("colorSecondarySelectionInteraction02SelectedPressed",a)}
    );
    --bbva-tab-default--_ambient--icon-color: var(
      --bbva-tab-default--custom--secondary-ambient--icon-color,
      ${t("colorSecondaryLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--icon-selected-color: var(
      --bbva-tab-default--custom--secondary-ambient--icon-selected-color,
      ${t("colorSecondarySelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--skeleton-quote-color: var(
      --bbva-tab-default--custom--secondary-ambient--skeleton-quote-color,
      ${t("colorSecondarySurfaceAmbientPreloading",a)}
    );
    --bbva-tab-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-tab-default--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${t("colorSecondarySurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--gradient-sticky-background: var(
      --bbva-tab-default--custom--secondary-ambient--gradient-sticky-background,
      ${t("colorSecondarySurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--gradient-background: var(
      --bbva-tab-default--custom--secondary-ambient--gradient-background,
      ${t("colorSecondarySurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--focus-border-color: var(
      --bbva-tab-default--custom--secondary-ambient--focus-border-color,
      ${t("colorSecondarySurfaceAmbientFocus",a)}
    );
    --bbva-tab-default--_ambient--icon-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--icon-color,
      ${t("colorSecondaryLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--icon-color-active: var(
      --bbva-tab-default--custom--primary-alt-ambient--icon-color-active,
      ${t("colorSecondaryLinkComplementaryPressed",a)}
    );
  }
`,D=m`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-tab-default--_ambient--tab-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--tab-color,
      ${t("colorSecondaryAltLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--tab-selected-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--tab-selected-color,
      ${t("colorSecondaryAltSelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--shadow-selected: var(
      --bbva-tab-default--custom--secondary-alt-ambient--shadow-selected,
      ${t("colorSecondaryAltSelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--tab-selected-pressed-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--tab-selected-pressed-color,
      ${t("colorSecondaryAltSelectionInteraction02SelectedPressed",a)}
    );
    --bbva-tab-default--_ambient--tab-unselected-pressed-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--tab-unselected-pressed-color,
      ${t("colorSecondaryAltLinkComplementaryPressed",a)}
    );
    --bbva-tab-default--_ambient--tab-unselected-pressed-navigation-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--tab-unselected-pressed-navigation-color,
      ${t("colorSecondaryAltSelectionInteraction02SelectedPressed",a)}
    );
    --bbva-tab-default--_ambient--icon-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--icon-color,
      ${t("colorSecondaryAltLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--icon-selected-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--icon-selected-color,
      ${t("colorSecondaryAltSelectionInteraction02Selected",a)}
    );
    --bbva-tab-default--_ambient--skeleton-quote-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--skeleton-quote-color,
      ${t("colorSecondaryAltSurfaceAmbientPreloading",a)}
    );
    --bbva-tab-default--_ambient--skeleton-animated-layer-bg: var(
      --bbva-tab-default--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${t("colorSecondaryAltSurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--gradient-sticky-background: var(
      --bbva-tab-default--custom--secondary-alt-ambient--gradient-sticky-background,
      ${t("colorSecondaryAltSurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--gradient-background: var(
      --bbva-tab-default--custom--secondary-alt-ambient--gradient-background,
      ${t("colorSecondaryAltSurfaceAmbientDefault",a)}
    );
    --bbva-tab-default--_ambient--focus-border-color: var(
      --bbva-tab-default--custom--secondary-alt-ambient--focus-border-color,
      ${t("colorSecondaryAltSurfaceAmbientFocus",a)}
    );
    --bbva-tab-default--_ambient--icon-color: var(
      --bbva-tab-default--custom--primary-alt-ambient--icon-color,
      ${t("colorSecondaryAltLinkComplementaryDefault",a)}
    );
    --bbva-tab-default--_ambient--icon-color-active: var(
      --bbva-tab-default--custom--primary-alt-ambient--icon-color-active,
      ${t("colorSecondaryAltLinkComplementaryPressed",a)}
    );
  }
`;const q=e([Object.freeze({__proto__:null,primary:z,primaryAlt:T,secondary:I,secondaryAlt:D}),o,i,n,r]),L=Object.values(q);var X=m`
:host {
  --_tab-default-tab-color: var(--bbva-tab-default--_ambient--tab-color,
      var(--bbva-tab-default--custom--primary-ambient--tab-color,
          ${t("colorPrimaryLinkComplementaryDefault",a)}));
  --_tab-default-tab-selected-color: var(--bbva-tab-default--_ambient--tab-selected-color,
      var(--bbva-tab-default--custom--primary-ambient--tab-selected-color,
          ${t("colorPrimarySelectionInteraction02Selected",a)}));
  --_tab-default-shadow-selected: var(--bbva-tab-default--_ambient--shadow-selected,
      var(--bbva-tab-default--custom--primary-ambient--shadow-selected,
          ${t("colorPrimarySelectionInteraction02Selected",a)}));
  --_tab-default-tab-selected-pressed-color: var(--bbva-tab-default--_ambient--tab-selected-pressed-color,
      var(--bbva-tab-default--custom--primary-ambient--tab-selected-pressed-color,
          ${t("colorPrimarySelectionInteraction02SelectedPressed",a)}));
  --_tab-default-tab-unselected-pressed-color: var(--bbva-tab-default--_ambient--tab-unselected-pressed-color,
      var(--bbva-tab-default--custom--primary-ambient--tab-unselected-pressed-color,
          ${t("colorPrimaryLinkComplementaryPressed",a)}));
  --_tab-default-tab-unselected-pressed-navigation-color: var(--bbva-tab-default--_ambient--tab-unselected-pressed-navigation-color,
      var(--bbva-tab-default--custom--primary-ambient--tab-unselected-pressed-navigation-color,
          ${t("colorPrimarySelectionInteraction02SelectedPressed",a)}));
  --_tab-default-icon-color: var(--bbva-tab-default--_ambient--icon-color,
      var(--bbva-tab-default--custom--primary-icon-color,
          ${t("colorPrimaryLinkComplementaryDefault",a)}));
  --_tab-default-icon-selected-color: var(--bbva-tab-default--_ambient--icon-selected-color,
      var(--bbva-tab-default--custom--primary-icon-selected-color,
          ${t("colorPrimarySelectionInteraction02Selected",a)}));
  --_tab-default-skeleton-quote-color: var(--bbva-tab-default--_ambient--skeleton-quote-color,
      var(--bbva-tab-default--custom--primary-ambient--skeleton-quote-color,
          ${t("colorPrimarySurfaceAmbientPreloading",a)}));
  --_tab-default-skeleton-animated-layer-bg: var(--bbva-tab-default--_ambient--skeleton-animated-layer-bg,
      var(--bbva-tab-default--custom--primary-ambient--skeleton-animated-layer-bg,
          ${t("colorPrimarySurfaceAmbientDefault",a)}));
  --_tab-default-gradient-sticky-background: var(--bbva-tab-default--_ambient--gradient-sticky-background,
      var(--bbva-tab-default--custom--primary-gradient-sticky-background,
          ${t("colorPrimarySurfaceAmbientDefault",a)}));
  --_tab-default-gradient-background: var(--bbva-tab-default--_ambient--gradient-background,
      var(--bbva-tab-default--custom--primary-gradient-background,
          ${t("colorPrimarySurfaceAmbientDefault",a)}));
  --_tab-default-focus-border-color: var(--bbva-tab-default--_ambient--focus-border-color,
      var(--bbva-tab-default--custom--primary-ambient--focus-border-color,
          ${t("colorPrimarySurfaceAmbientFocus",a)}));
  --_tab-default-icon-color: var(--bbva-tab-default--_ambient--icon-color,
      var(--bbva-tab-default--custom--primary-ambient--icon-color,
          ${t("colorPrimaryLinkComplementaryDefault",a)}));
  --_tab-default-icon-color-active: var(--bbva-tab-default--_ambient--icon-color-active,
      var(--bbva-tab-default--custom--primary-ambient--icon-color-active,
          ${t("colorPrimaryLinkComplementaryPressed",a)}));
}
`,R=m`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  position: relative;
  display: block;
  overflow: hidden;
  box-sizing: border-box;
  margin-bottom: 2rem;
  --_tab-default-group-sticky-z-index: var(--bbva-tab-default-group-sticky-z-index, 20);
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

button:focus {
  outline: none;
}

button:focus-visible {
  outline: 0.125rem solid var(--_tab-default-focus-border-color);
  outline-offset: 0.25rem;
}

.group {
  position: relative;
  min-height: var(--bbva-tab-default-min-height, 4rem);
  padding: var(--tab-default-group-padding, 0 1rem);
}
.group:not(.desktop) button:focus-visible {
  outline: none;
}
.group:host([horizontal-scroll]) button:focus-visible {
  outline-offset: -0.0625rem;
}
.group:host([variant=navigation]) button:focus-visible {
  outline-offset: -0.125rem;
}

.tabs {
  position: relative;
  display: flex;
  box-sizing: border-box;
  box-shadow: inset 0 -0.125rem 0 0 var(--bbva-tab-default-dark-mode-shadow, var(--bbva-tab-default-shadow, var(--colorsSecondary300, ${g(f.secondary300)})));
  gap: 1.5rem;
}
.tabs::-webkit-scrollbar {
  display: none;
}

.tab {
  position: relative;
  max-width: 66.6%;
  min-height: 4rem;
  padding: var(--bbva-tab-default-tab-padding, 1.25rem 0);
  border: none;
  margin-left: var(--bbva-tab-default-margin-left, 0);
  background: none;
  cursor: pointer;
  font-family: inherit;
  font-weight: var(--bbva-tab-default-font-weight, var(--fontFacePrimaryBookFontWeight, ${g(v.book.fontWeight)}));
  text-align: left;
}
.tab .tab-title {
  max-width: 100%;
}
.tab .tab-title .title,
.tab .tab-title .text {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  width: 100%;
  font-weight: var(--bbva-tab-default-selected-font-weight, var(--fontFacePrimaryMediumFontWeight, ${g(v.medium.fontWeight)}));
}

.desktop .tab {
  max-width: 16.6%;
}
.desktop .gradient.left::before, .desktop .gradient.right::after {
  width: 5rem;
  background: linear-gradient(to right, var(--_tab-default-gradient-background) 50%, rgba(255, 255, 255, 0) 100%);
}

.icon-pack {
  display: flex;
  align-items: center;
}
.icon-pack .icon {
  flex: none;
  margin-right: 0.25rem;
  fill: var(--_tab-default-icon-color);
}
.icon-pack .icon.selected {
  fill: var(--_tab-default-icon-selected-color);
}
.icon-pack .icon.selected.icon:active {
  fill: var(--_tab-default-tab-selected-pressed-color);
}
.icon-pack .icon.icon:active {
  fill: var(--_tab-default-tab-selected-color);
}
.icon-pack [data-tag-name=bbva-badge-notification].default {
  padding-left: 0.25rem;
}

:host(.default-basic) .tab .icon-pack {
  max-height: 2.5rem;
  align-items: center;
}
:host(.default-basic) .tab .icon-pack .tab-title {
  display: inherit;
}
:host(.default-basic) .tab [data-tag-name=bbva-badge-notification] {
  margin-bottom: 0.625rem;
}
:host(.default-basic) .tab [data-tag-name=bbva-badge-notification].badge-text {
  padding-left: 0.25rem;
  margin-bottom: 0.25rem;
}
:host(.default-basic) .tab :has(.badge-text) {
  margin-right: 1.5rem;
}

:host(.align-left) .tabs .tab {
  text-align: left;
}
:host(.align-left) .tabs .tab .icon-pack {
  align-items: flex-end;
  text-align: left;
}
:host(.align-left) .tabs .tab .icon-pack .tab-title {
  width: initial;
}
:host(.align-left) .tabs .tab .icon-pack [data-tag-name=bbva-badge-notification] {
  margin-bottom: 0.75rem;
}
:host(.align-left) .tabs .tab .icon-pack [data-tag-name=bbva-badge-notification].badge-text {
  padding-left: 0.25rem;
  margin-bottom: 0.4375rem;
}
:host(.align-left) .tabs .tab .title {
  font-weight: var(--fontFacePrimaryBookFontWeight, ${g(v.book.fontWeight)});
}
:host(.align-left) .tabs .tab .text {
  font-weight: var(--bbva-tab-default-align-left-text-font-weight, var(--fontFacePrimaryMediumFontWeight, ${g(v.medium.fontWeight)}));
}

:host([variant=icon]) .tabs .tab {
  padding: var(--bbva-tab-default-align-left-tab-padding, 1rem 0);
  text-align: left;
}
:host([variant=icon]) .tabs .tab .icon-pack {
  align-items: flex-start;
  text-align: left;
}
:host([variant=icon]) .tabs .tab .icon-pack .icon {
  display: none;
  margin: 0;
}
:host([variant=icon]) .tabs .tab .icon-pack [data-tag-name=bbva-badge-notification].badge-text {
  padding-left: 0.25rem;
}
:host([variant=icon]) .desktop .tab .icon-pack {
  align-items: flex-end;
}
:host([variant=icon]) .desktop .tab .icon-pack .icon {
  display: flex;
}
:host([variant=icon]) .desktop .tab .icon-pack [data-tag-name=bbva-badge-notification] {
  padding-bottom: 0.75rem;
}
:host([variant=icon]) .desktop .tab .icon-pack [data-tag-name=bbva-badge-notification].badge-text {
  padding-bottom: 0.25rem;
}

.group.subtitleTabs .tabs .tab {
  height: 5rem;
  padding: var(--bbva-tab-default-tab-padding, 1rem 0);
}
.group.subtitleTabs .tabs .tab .icon-pack .tab-title .text {
  padding-bottom: 0.25rem;
}

:host([horizontal-scroll]) .group {
  position: relative;
  display: block;
  width: 100%;
  box-sizing: border-box;
}
:host([horizontal-scroll]) .group::before, :host([horizontal-scroll]) .group::after {
  position: absolute;
  top: 0;
  width: 4rem;
  height: 100%;
  content: "";
  pointer-events: none;
}
:host([horizontal-scroll]) .group::before {
  z-index: var(--bbva-z-index-notifications, 3);
  left: 0;
}
:host([horizontal-scroll]) .group::after {
  z-index: var(--bbva-z-index-notifications, 3);
  right: 0;
}
:host([horizontal-scroll]) .tabs {
  display: flex;
  -webkit-overflow-scrolling: touch;
  overflow-x: auto;
}
:host([horizontal-scroll]) .tabs .tab {
  flex-basis: auto;
}

.right-padding-fix:after {
  display: block;
  width: 1rem;
  border: 1px solid transparent;
  content: "";
}

.gradient.left::before, .gradient.right::after {
  position: absolute;
  top: 0;
  left: 0;
  width: 4rem;
  height: 100%;
  background: linear-gradient(to right, var(--_tab-default-gradient-background) 0%, rgba(255, 255, 255, 0) 100%);
  content: "";
  pointer-events: none;
}
.gradient.right::after {
  right: 0;
  left: auto;
  transform: rotate(180deg);
}

.scroll-icons {
  --bbva-button-default--_ambient--icon-no-background-color: var(--_tab-default-icon-color);
  --bbva-button-default--_ambient--icon-no-background-color-active: var(--_tab-default-icon-color-active);
}
.scroll-icons .icon-left {
  position: absolute;
  z-index: 1;
  top: calc(50% - 24px);
  left: 0.5rem;
}
.scroll-icons .icon-right {
  position: absolute;
  z-index: 1;
  top: calc(50% - 24px);
  right: 0.5rem;
}

:host([loading]) .group {
  position: relative;
  display: flex;
  overflow: hidden;
  width: 100%;
  height: 4rem;
  flex-direction: column;
  align-items: center;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 16% 24px, 70% 24px, 124% 24px, 40% 90%;
  mask-position: 16% 24px, 70% 24px, 124% 24px, 40% 90%;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((22% * 2) + (16px/ 2)) 16px, calc((22% * 2) + (16px/ 2)) 16px, calc((22% * 2) + (16px/ 2)) 16px, 80% 1px;
  mask-size: calc((22% * 2) + (16px/ 2)) 16px, calc((22% * 2) + (16px/ 2)) 16px, calc((22% * 2) + (16px/ 2)) 16px, 80% 1px;
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
:host([loading]) .group .tabs {
  opacity: 0;
}
:host([loading]) .group::after {
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
:host([loading]) .desktop {
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 2% 24px, 14% 24px, 26% 24px, 40% 90%;
  mask-position: 2% 24px, 14% 24px, 26% 24px, 40% 90%;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, 96% 1px;
  mask-size: calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, 96% 1px;
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
:host([loading]) .desktop::after {
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
:host([loading]) .group.subtitleTabs {
  height: 5rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 12% 24px, 54% 24px, 97% 24px, 13.95% 54px, 62.9% 54px, 113.5% 54px, 40% 100%;
  mask-position: 12% 24px, 54% 24px, 97% 24px, 13.95% 54px, 62.9% 54px, 113.5% 54px, 40% 100%;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px, 80% 1px;
  mask-size: calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px, 80% 1px;
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
:host([loading]) .group.subtitleTabs::after {
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
:host([loading]) .desktop.subtitleTabs {
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 3% 24px, 13.5% 24px, 24% 24px, 3% 54px, 14% 54px, 25% 54px, 40% 100%;
  mask-position: 3% 24px, 13.5% 24px, 24% 24px, 3% 54px, 14% 54px, 25% 54px, 40% 100%;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((5% * 2) + (16px/ 2)) 16px, calc((5% * 2) + (16px/ 2)) 16px, calc((5% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, 80% 1px;
  mask-size: calc((5% * 2) + (16px/ 2)) 16px, calc((5% * 2) + (16px/ 2)) 16px, calc((5% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, 80% 1px;
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
:host([loading]) .desktop.subtitleTabs::after {
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

:host([loading][variant=navigation]) .group {
  height: 5rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  -webkit-mask-position: 12% 24px, 45% 24px, 77% 24px, 110% 24px;
  mask-position: 12% 24px, 45% 24px, 77% 24px, 110% 24px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px;
  mask-size: calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px;
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
:host([loading][variant=navigation]) .group::after {
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

:host([loading][variant=navigation]) .desktop {
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-image: linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  -webkit-mask-position: 2% 24px, 14% 24px, 26% 24px, 37.5% 24px;
  mask-position: 2% 24px, 14% 24px, 26% 24px, 37.5% 24px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px;
  mask-size: calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px, calc((7% * 2) + (16px/ 2)) 16px;
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
:host([loading][variant=navigation]) .desktop::after {
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

:host([sticky]) {
  overflow: initial;
}
:host([sticky]) .group {
  position: sticky;
  position: -webkit-sticky;
  z-index: var(--tab-default-gradient-sticky-z-index, 0);
  top: var(--tab-default-gradient-sticky-top, 0);
  background-color: var(--_tab-default-gradient-sticky-background);
}

:host([sticky][variant=navigation]) {
  overflow: initial;
}

:host([variant=navigation]) {
  overflow: hidden;
}
:host([variant=navigation]) button:first-child {
  padding-left: 1rem;
}
:host([variant=navigation]) button:last-child {
  padding-right: 1rem;
}
:host([variant=navigation]) :host([disabled]) .tabs button:not(:last-of-type) {
  margin-right: 0;
}
:host([variant=navigation]) .tabs {
  box-shadow: none;
  gap: 0;
}
:host([variant=navigation]) .tabs .indicator {
  position: absolute;
  top: 0.75rem;
  height: 2.5rem;
  border: 0.125rem solid var(--_tab-default-tab-selected-color);
  border-radius: 6.25rem;
  transition: transform 0.6s ease-in-out, width 0.6s ease-in-out;
}
:host([variant=navigation]) .tab {
  padding: var(--bbva-tab-default-tab-padding, 0.75rem 1rem);
  text-align: center;
}
:host([variant=navigation]) .tab .icon-pack {
  display: flex;
  width: 100%;
  max-height: 2.5rem;
  align-items: center;
}
:host([variant=navigation]) .tab .icon-pack .tab-title {
  display: inherit;
}
:host([variant=navigation]) .tab .title:active {
  color: var(--_tab-default-tab-unselected-pressed-color);
}
:host([variant=navigation]) .tab [data-tag-name=bbva-badge-notification].navigation {
  margin-right: 0.5rem;
  margin-bottom: 0.625rem;
}
:host([variant=navigation]) .tab[aria-selected=true] .icon-pack {
  color: var(--_tab-default-tab-selected-color);
}
:host([variant=navigation]) .tab[aria-selected=true] .title {
  color: var(--_tab-default-tab-selected-color);
}
:host([variant=navigation]) .tab[aria-selected=true]:active:not([disabled]) .icon-pack, :host([variant=navigation]) .tab[aria-selected=true][focus-visible]:not([disabled]) .icon-pack {
  color: var(--_tab-default-tab-selected-pressed-color);
}
:host([variant=navigation]) .tab[aria-selected=true]:active:not([disabled]) .title, :host([variant=navigation]) .tab[aria-selected=true][focus-visible]:not([disabled]) .title {
  color: var(--_tab-default-tab-selected-pressed-color);
}
:host([variant=navigation]) .tab:active:not([disabled]), :host([variant=navigation]) .tab[focus-visible]:not([disabled]) {
  color: var(--_tab-default-tab-unselected-pressed-navigation-color);
}
:host([variant=navigation]) .tab .title {
  color: var(--_tab-default-tab-color);
}

:host([active]) .tabs .tab .icon-pack {
  color: var(--_tab-default-tab-selected-color);
}
:host([active]) .tabs .tab .icon {
  fill: var(--_tab-default-tab-selected-color);
}
:host([active]) .tabs .tab .title {
  --tab-default-tab-unselected-pressed-color: var(--_tab-default-tab-unselected-pressed-color);
  color: var(--tab-default-tab-unselected-pressed-color);
}
:host([active]) .tabs .tab .text {
  --tab-default-tab-unselected-pressed-color: var(--_tab-default-tab-unselected-pressed-color);
  color: var(--tab-default-tab-unselected-pressed-color);
}

:host(:not([variant=navigation])) .title {
  padding-right: 0.25rem;
  color: var(--_tab-default-tab-color);
}
:host(:not([variant=navigation])) .tabs .tab:active .icon-pack {
  color: var(--_tab-default-tab-selected-color);
}
:host(:not([variant=navigation])) .tabs .tab:active .icon {
  fill: var(--_tab-default-tab-selected-color);
}
:host(:not([variant=navigation])) .tabs .tab:active .title {
  color: var(--_tab-default-tab-unselected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .tab:active .text {
  color: var(--_tab-default-tab-unselected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .indicator {
  position: absolute;
  z-index: 0;
  bottom: 0;
  left: 0;
  height: 0.125rem;
  background-color: var(--_tab-default-shadow-selected);
  transition: transform 0.3s ease-in-out, width 0.3s ease-in-out;
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true] {
  color: var(--_tab-default-tab-selected-color);
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true] .title {
  color: var(--_tab-default-tab-selected-color);
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true] .icon {
  color: var(--_tab-default-icon-selected-color);
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true] .text {
  color: var(--_tab-default-tab-selected-color);
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true]:active:not([disabled]), :host(:not([variant=navigation])) .tabs .tab[aria-selected=true][focus-visible]:not([disabled]) {
  color: var(--_tab-default-tab-selected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true]:active:not([disabled]) .icon-pack, :host(:not([variant=navigation])) .tabs .tab[aria-selected=true][focus-visible]:not([disabled]) .icon-pack {
  fill: var(--_tab-default-tab-selected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true]:active:not([disabled]) .title, :host(:not([variant=navigation])) .tabs .tab[aria-selected=true][focus-visible]:not([disabled]) .title {
  color: var(--_tab-default-tab-selected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true]:active:not([disabled]) .icon, :host(:not([variant=navigation])) .tabs .tab[aria-selected=true][focus-visible]:not([disabled]) .icon {
  fill: var(--_tab-default-tab-selected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .tab[aria-selected=true]:active:not([disabled]) .text, :host(:not([variant=navigation])) .tabs .tab[aria-selected=true][focus-visible]:not([disabled]) .text {
  color: var(--_tab-default-tab-selected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .tab:active:not([disabled]), :host(:not([variant=navigation])) .tabs .tab[focus-visible]:not([disabled]) {
  color: var(--_tab-default-tab-unselected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .tab:active:not([disabled]) .icon-pack, :host(:not([variant=navigation])) .tabs .tab[focus-visible]:not([disabled]) .icon-pack {
  color: var(--_tab-default-tab-unselected-pressed-color);
}
:host(:not([variant=navigation])) .tabs .tab:active:not([disabled]) .icon, :host(:not([variant=navigation])) .tabs .tab[focus-visible]:not([disabled]) .icon {
  fill: var(--_tab-default-tab-unselected-pressed-color);
}

.container {
  display: flex;
  transition: transform 0.8s cubic-bezier(0.2, 0, 1, 1) 0s;
}
.container [role=tabpanel] {
  overflow: hidden;
  width: auto;
  height: 100%;
  flex: 1 0 100%;
  margin-right: 1rem;
}

.container > div {
  outline: 0;
}

:host([full-height]) .container {
  height: 100%;
}
:host([full-height]) [role=tabpanel] {
  height: 100%;
}
`;const E=(t,a)=>String(t)===String(a);class F extends(l(s(h(k(c(y)))))){static get is(){return"bbva-tab-default"}static get scopedElements(){return{"bbva-type-icon":b,"bbva-badge-notification":d,"bbva-type-text":p,"bbva-button-default":u}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},options:{type:Array},iconSize:{type:Number,attribute:"icon-size"},selected:{type:Number},tabsPerPage:{type:Number,attribute:"tabs-per-page"},tabsPerPageTablet:{type:Number,attribute:"tabs-per-page-tablet"},tabsPerPageDesktop:{type:Number,attribute:"tabs-per-page-desktop"},loading:{type:Boolean,reflect:!0},sticky:{type:Boolean,reflect:!0},rootMargin:{type:Number,attribute:"root-margin"},stickyBackgroundColor:{type:String,attribute:"sticky-background-color"},_gradientStyle:{type:Object},variant:{type:String},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},hasEllipsis:{type:Boolean,attribute:"has-ellipsis",reflect:!0},_desktop:{type:Boolean,attribute:!1},_tablet:{type:Boolean,state:!0},_availableScroll:{type:String}}}constructor(){super(),this.accessibilityText="",this.options=[],this.iconSize=16,this.selected=0,this.tabsPerPage=3,this.tabsPerPageTablet=7,this.tabsPerPageDesktop=9,this.loading=!1,this.sticky=!1,this.rootMargin=0,this.hasEllipsis=!1,this.stickyBackgroundColor="",this._gradientStyle={top:"",zIndex:"",backgroundColor:""},this._updatedFlag=!1,this.fullHeight=!1,this._iconAsTitle=!1,this._desktop=!1,this._hasCompletedFirstUpdate=!1,this._panelSlotCount=[],this._tablet=!1,this._firstSelection=!1,this.variant=""}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)",_tablet:"(min-width: 37.5rem) and (max-width: 61rem)"}}firstUpdated(t){super.firstUpdated(t),this._iconAsTitle="icon"===this.variant,this.sticky&&this._configStickyBehavior(),this.options.length>0&&!this.loading&&this.updateComplete.then((()=>{this._updatePanelElements()}))}async updated(t){super.updated(t),this.loading||(t.has("options")&&this.options&&this._updatePanelElements(),this._handleTabsVisibility(t),await this.updateComplete,this._updateIndicatorBar(),t.has("selected")&&(this._firstSelection=this._firstSelection||0===this.selected,this._select(this.selected,t.get("selected")),this._updatePanelsAndSlots()),this._contentScroll()),this._hasCompletedFirstUpdate||(this._hasCompletedFirstUpdate=!0)}static get styles(){return[super.styles,R,X,L,_("bbva-tab-default-shared-styles")]}_containsSubtitles(){return this.options.filter((t=>t.text)).length>0}_icon(t,a){return x`
      <bbva-type-icon
        id="tab-icon-${a}"
        .size="${this.iconSize}"
        class="icon ${S({selected:E(this.selected,a)})}"
        .icon="${t.icon}"
        aria-hidden="true"
      >
      </bbva-type-icon>
    `}static _getId(t,a){return t.panelId||`content-${a}`}_configStickyBehavior(){this._tabsHeader=this.shadowRoot.querySelector(".gradient"),this._configIntersectionObserver()}_intersectionCallback(t){this._configStickyStyle(!t[0].isIntersecting)}_configStickyStyle(t){this._gradientStyle=t?{top:`${this.rootMargin}px`,zIndex:"var(--_tab-default-group-sticky-z-index)"}:{top:"",zIndex:""},this.dispatchEvent(new CustomEvent("tab-default-sticky-behavior-change",{bubbles:!0,composed:!0,detail:t}))}_configIntersectionObserver(){const t={rootMargin:`-${this.rootMargin}px`,threshold:1};this._observer=new IntersectionObserver(this._intersectionCallback.bind(this),t),this._observer.observe(this.shadowRoot.querySelector(".sticky-guard"))}connectedCallback(){super.connectedCallback&&super.connectedCallback()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.sticky&&this._observer.unobserve(this.shadowRoot.querySelector(".sticky-guard"))}_notFocusableTab(){var t,a;const e=["button","link","checkbox","radio","tab","menuitem"],o=this.panels[this.selected].querySelector("slot");let i=[];return null==o||null===(t=o.assignedElements())||void 0===t||t.forEach((t=>{i=t.querySelectorAll(`a, button, input, ${e.map((t=>`[role="${t}"]`)).join(", ")}`)})),null===(a=i)||void 0===a?void 0:a.length}_updatePanelElements(){let t=!1;this.panels=this.options.map(((a,e)=>{const o=(this._updatedFlag?this.shadowRoot:this).querySelector(`[role="tabpanel"]#${(null==a?void 0:a.panelId)||`content-${e}`}`);let i=o;if(!this._updatedFlag&&i){t=!0;const n=F._getId(a,e),r=this.shadowRoot.querySelector(".container");i=document.createElement("div"),i.setAttribute("id",n),i.setAttribute("role","tabpanel"),i.setAttribute("tabindex","-1"),i.setAttribute("aria-hidden",E(this.selected,e)?"false":"true"),i.setAttribute("aria-labelledby",`tab-${e}`);const l=document.createElement("slot");l.setAttribute("name",n),["role","id","aria-labelledby","hidden"].forEach((t=>o.removeAttribute(t))),o.setAttribute("slot",n),i.appendChild(l),r.appendChild(i),this.appendChild(o),this._panelSlotCount[e]=1}return i&&(i.hidden=e>this.selected),i})),this._updatedFlag=this._updatedFlag||t}_select(t,a){this._updatePanelVisibility(t,a),this._updateSlotContent(t,a),this._updatePanelAccessibility(t,a),this._scrollToSelectedTab(),this._updateContainerTransform(),this.dispatchEvent(new CustomEvent("tab-default-tab-change",{bubbles:!0,composed:!0,detail:{selectedIndex:t,info:this.options[t]}}))}_handlerTabIndicator(){const t=this.shadowRoot.querySelector(".indicator"),a=this.shadowRoot.querySelectorAll(".tab"),e=a.length-1,o="navigation"===this.variant,i=this.shadowRoot.querySelectorAll('[role="tabpanel"]');a.forEach((a=>{a.addEventListener("click",(()=>{if(i){var n,r;const t=null===(n=a.id.match(/\d+/))||void 0===n?void 0:n[0];i.forEach((t=>t.classList.remove("active"))),null===(r=this.shadowRoot.querySelector("div.container").children[t])||void 0===r||r.classList.add("active")}const l=Object.values(a.children[0].children).reduce(((t,a)=>t+a.offsetWidth),0),{offsetLeft:s}=a;t.style.width=`${l}px`,t.style.transition="",t.style.transform=`translateX(${s}px)`;o?(()=>{const i="tab-0"===a.id,n=a.id===`tab-${e}`;o&&(t.style.width=`${a.offsetWidth}px`,t.style.translate=i?"2%":n?"-1%":"0")})():t.style.translate="0"}))}));(()=>{a.forEach((a=>{const e=Object.values(a.children[0].children).reduce(((t,a)=>t+a.offsetWidth),0);if(a.getAttribute("aria-selected").includes("true")){const{offsetWidth:i,offsetLeft:n}=a;t.style.width=o?`${i}px`:`${e}px`,this._firstSelection||(t.style.transition="none"),t.style.transform=`translateX(${n}px)`}})),this._firstSelection=!0})()}_handleTabsVisibility(t){(t.has("tabsPerPage")||t.has("tabsPerPageTablet")||t.has("tabsPerPageDesktop")||t.has("options"))&&this.options&&(!this._tablet&&!this._desktop&&this.options.length>this.tabsPerPage||this._desktop&&this.options.length>this.tabsPerPageDesktop||this._tablet&&this.options.length>this.tabsPerPageTablet?this.setAttribute("horizontal-scroll",""):this.removeAttribute("horizontal-scroll"))}_contentScroll(){const{scrollLeft:t,scrollWidth:a,offsetWidth:e}=this.shadowRoot.querySelector("#tabs");this._availableScroll=0===t?"right":t+e>=a?"left":"left right"}_drawTabNotificationIcon(t,a){const e=t.icon?this._icon(t,a):w;return t.badgeText||t.badgeDot||this._iconAsTitle?x`
          <bbva-badge-notification
            ?hidden=${!(t.badgeDot||t.badgeText)}
            id="badge${t.badgeDot?`-${t.badgeDot}-`:"-"}${a}"
            accessibility-text="${$(t.badgeAccessible)}"
            class="badge ${t.badgeDot||""}"
            text="${$(t.badgeText)}"
            variant="${t.badgeDot&&!t.badgeText?"dot-alert":"alert"}"
            position="${t.icon&&!this._iconAsTitle?"left-dot-small":""}"
          >
            ${t.icon&&!this._iconAsTitle?this._icon(t,a):null}
          </bbva-badge-notification>
        `:e}_drawTabTitle(t,a){this.iconSize=this._iconAsTitle?24:this.iconSize;const e=x` <bbva-type-text
      class="title"
      text=${this.t(t.title)}
      size="S"
      unset
      ellipsis
    >
    </bbva-type-text>`,o=this._icon(t,a);return x`
      <div class="tab-title">
        ${this._iconAsTitle?o:e}
        ${null!=t&&t.text?x`
        <bbva-type-text
          id="text-${a}"
          class="text"
          text=${this.t(t.text)}
          size="S"
          unset
          ellipsis
        >
        </bbva-type-text>
      </div>
    `:""}
      </div>
    `}_drawTab(t,a){const e=[this._drawTabNotificationIcon.bind(this),this._drawTabTitle.bind(this)];return"default"!==t.badgeDot&&"badge-text"!==t.badgeDot||e.reverse(),x`
      <button
        id="tab-${a}"
        class="tab"
        role="tab"
        ?disabled="${this.disabled}"
        aria-selected="${E(this.selected,a)}"
        aria-controls="${F._getId(t,a)}"
        tabindex="${E(this.selected,a)?0:-1}"
        @keydown="${t=>this._onKeydown(t)}"
        @click="${()=>{this.selected=a,this.dispatchEvent(new CustomEvent("tab-default-tab-click",{bubbles:!0,composed:!0,detail:{selectedIndex:a,info:t}}))}}"
      >
        <span class="icon-pack">
          ${e.map((e=>e(t,a)))}
        </span>
      </button>
    `}_onKeydown(t){const{key:a}=t,e=this.shadowRoot.querySelectorAll(".tab"),o=e.length-1,i=this.selected;["ArrowLeft","ArrowRight"].indexOf(a)>-1&&t.preventDefault(),"ArrowRight"===a&&i<o&&(this.selected+=1,this.removeAttribute("focus-visible")),"ArrowRight"===a&&i===o&&(this.selected=0,this.removeAttribute("focus-visible")),"ArrowLeft"===a&&i>0&&(this.selected+=-1,this.removeAttribute("focus-visible")),"ArrowLeft"===a&&0===i&&(this.selected=o,this.removeAttribute("focus-visible")),e[this.selected].focus()}_scrollToSelectedTab(){if(this.hasAttribute("horizontal-scroll")&&this._firstSelection){const t=this.shadowRoot.querySelector("[aria-selected=true]"),a=this.shadowRoot.querySelectorAll(".tab").length-1,e=this.selectedItem<a?"center":"end";t.scrollIntoView({inline:e,block:"nearest"})}}_updateContainerTransform(){this.shadowRoot.querySelector(".container").setAttribute("style",`transform: translateX(calc(-${this.selected}00% - ${16*this.selected}px));`)}_updateIndicatorBar(){setTimeout((()=>{this.shadowRoot.querySelector(".indicator")||this.shadowRoot.querySelector(".tabs").insertAdjacentHTML("beforeend",'<span id="indicator" aria-hidden="true" class="indicator"></span> '),this._handlerTabIndicator()}),100)}_updatePanelAccessibility(t,a){const e=()=>{var e,o,i,n;this.panels[t]&&this.panels[t]instanceof Element&&(this.panels[t].hidden=!1,null===(e=this.panels[t])||void 0===e||e.setAttribute("aria-hidden","false"),this._notFocusableTab()?this.panels[t].removeAttribute("tabindex"):null===(o=this.panels[t])||void 0===o||o.setAttribute("tabindex","0"));this.panels[a]&&this.panels[a]instanceof Element&&(null===(i=this.panels[a])||void 0===i||i.setAttribute("aria-hidden","true"),null===(n=this.panels[a])||void 0===n||n.setAttribute("tabindex","-1"))};this._hasCompletedFirstUpdate?setTimeout(e,200):e()}_updatePanelsAndSlots(){const t=()=>{this.panels=this.panels.map(((t,a)=>{const e=this.shadowRoot.querySelectorAll('[role="tabpanel"]')[a];if(e){var o;if(e.hidden=a>this.selected,a<this.selected)null===(o=e.querySelector("slot"))||void 0===o||o.remove(),this._panelSlotCount[a]>0&&(this._panelSlotCount[a]-=1);return e}return{}}))};this._hasCompletedFirstUpdate?setTimeout(t,700):t()}_updatePanelVisibility(t,a){t>a&&(this.panels=this.panels.map(((a,e)=>{const o=this.shadowRoot.querySelectorAll('[role="tabpanel"]')[e];return o?(o.hidden=e>t,o):{}})))}_updateSlotContent(t,a){if(a>t)for(let t=0;t<a;t+=1)if(0===this._panelSlotCount[t]){const a=document.createElement("slot");a.setAttribute("name",F._getId(this.options[t],t)),this.panels[t].appendChild(a),this._panelSlotCount[t]+=1}}_clickRightScroll(){this.shadowRoot.querySelector("#tabs").scrollBy({left:50,behavior:"smooth"})}_clickLeftScroll(){this.shadowRoot.querySelector("#tabs").scrollBy({left:-50,behavior:"smooth"})}_renderScrollIcon(t){const a="left"===t?A():P(),e="left"===t?this._clickLeftScroll:this._clickRightScroll;return x` <bbva-button-default
      ?disabled="${this.disabled}"
      variant="icon no-background"
      class="icon-${t}"
      icon=${a}
      @click=${e}
      aria-label="${this.t(`bbva-button-scroll-${t}`)}"
    ></bbva-button-default>`}_renderScrollIcons(){var t,a;return x`
      <div class="scroll-icons">
        ${null!==(t=this._availableScroll)&&void 0!==t&&t.includes("left")?this._renderScrollIcon("left"):w}
        ${null!==(a=this._availableScroll)&&void 0!==a&&a.includes("right")?this._renderScrollIcon("right"):w}
      </div>
    `}get _renderGradient(){return x`
      <div
        class="${this._desktop&&this.options.length>this.tabsPerPageDesktop?"gradient":""}
          ${this._tablet&&this.options.length>this.tabsPerPageTablet?"gradient":""}
          ${!this._desktop&&!this._tablet&&this.options.length>this.tabsPerPage?"gradient":""} ${this._availableScroll}"
      ></div>
    `}render(){return x`
      ${this.sticky?x` <div class="sticky-guard"></div> `:x``}
      <div
        class="group ${S({subtitleTabs:this._containsSubtitles(),desktop:this._desktop,tablet:this._tablet})}"
        style="${C(this._gradientStyle)}"
      >
        ${this.loading?w:x`
              ${this._desktop&&this.options.length>this.tabsPerPageDesktop?this._renderScrollIcons():w}
              <div
                id="tabs"
                class="tabs"
                role="tablist"
                aria-label="${$(this.accessibilityText)}"
                @scroll="${this._contentScroll}"
              >
                ${this.options.map(this._drawTab.bind(this))}
              </div>
              ${this._renderGradient}
            `}
      </div>
      ${this.loading?w:x` <div class="container"></div>
            <slot></slot>`}
    `}}export{F as B,q as b};
